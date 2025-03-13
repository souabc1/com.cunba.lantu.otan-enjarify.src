package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.Reference;

class SnackbarManager
{
  private static final int LONG_DURATION_MS = 2750;
  static final int MSG_TIMEOUT = 0;
  private static final int SHORT_DURATION_MS = 1500;
  private static SnackbarManager snackbarManager;
  private SnackbarManager.SnackbarRecord currentSnackbar;
  private final Handler handler;
  private final Object lock;
  private SnackbarManager.SnackbarRecord nextSnackbar;
  
  private SnackbarManager()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.lock = localObject;
    localObject = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    SnackbarManager.1 local1 = new com/google/android/material/snackbar/SnackbarManager$1;
    local1.<init>(this);
    ((Handler)localObject).<init>(localLooper, local1);
    this.handler = ((Handler)localObject);
  }
  
  private boolean cancelSnackbarLocked(SnackbarManager.SnackbarRecord paramSnackbarRecord, int paramInt)
  {
    SnackbarManager.Callback localCallback = (SnackbarManager.Callback)paramSnackbarRecord.callback.get();
    if (localCallback != null)
    {
      this.handler.removeCallbacksAndMessages(paramSnackbarRecord);
      localCallback.dismiss(paramInt);
      return true;
    }
    return false;
  }
  
  public static SnackbarManager getInstance()
  {
    SnackbarManager localSnackbarManager = snackbarManager;
    if (localSnackbarManager == null)
    {
      localSnackbarManager = new com/google/android/material/snackbar/SnackbarManager;
      localSnackbarManager.<init>();
      snackbarManager = localSnackbarManager;
    }
    return snackbarManager;
  }
  
  private boolean isCurrentSnackbarLocked(SnackbarManager.Callback paramCallback)
  {
    SnackbarManager.SnackbarRecord localSnackbarRecord = this.currentSnackbar;
    if (localSnackbarRecord != null)
    {
      bool = localSnackbarRecord.isSnackbar(paramCallback);
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    paramCallback = null;
    return bool;
  }
  
  private boolean isNextSnackbarLocked(SnackbarManager.Callback paramCallback)
  {
    SnackbarManager.SnackbarRecord localSnackbarRecord = this.nextSnackbar;
    if (localSnackbarRecord != null)
    {
      bool = localSnackbarRecord.isSnackbar(paramCallback);
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    paramCallback = null;
    return bool;
  }
  
  private void scheduleTimeoutLocked(SnackbarManager.SnackbarRecord paramSnackbarRecord)
  {
    int i = paramSnackbarRecord.duration;
    int j = -2;
    if (i == j) {
      return;
    }
    if (i <= 0)
    {
      j = -1;
      if (i == j) {
        i = 1500;
      } else {
        i = 2750;
      }
    }
    this.handler.removeCallbacksAndMessages(paramSnackbarRecord);
    Handler localHandler = this.handler;
    paramSnackbarRecord = Message.obtain(localHandler, 0, paramSnackbarRecord);
    long l = i;
    localHandler.sendMessageDelayed(paramSnackbarRecord, l);
  }
  
  private void showNextSnackbarLocked()
  {
    Object localObject = this.nextSnackbar;
    if (localObject != null)
    {
      this.currentSnackbar = ((SnackbarManager.SnackbarRecord)localObject);
      this.nextSnackbar = null;
      localObject = (SnackbarManager.Callback)((SnackbarManager.SnackbarRecord)localObject).callback.get();
      if (localObject != null) {
        ((SnackbarManager.Callback)localObject).show();
      } else {
        this.currentSnackbar = null;
      }
    }
  }
  
  public void dismiss(SnackbarManager.Callback paramCallback, int paramInt)
  {
    synchronized (this.lock)
    {
      boolean bool1 = isCurrentSnackbarLocked(paramCallback);
      if (bool1) {}
      for (paramCallback = this.currentSnackbar;; paramCallback = this.nextSnackbar)
      {
        cancelSnackbarLocked(paramCallback, paramInt);
        break;
        boolean bool2 = isNextSnackbarLocked(paramCallback);
        if (!bool2) {
          break;
        }
      }
      return;
    }
  }
  
  public void handleTimeout(SnackbarManager.SnackbarRecord paramSnackbarRecord)
  {
    synchronized (this.lock)
    {
      SnackbarManager.SnackbarRecord localSnackbarRecord = this.currentSnackbar;
      if (localSnackbarRecord != paramSnackbarRecord)
      {
        localSnackbarRecord = this.nextSnackbar;
        if (localSnackbarRecord != paramSnackbarRecord) {}
      }
      else
      {
        int i = 2;
        cancelSnackbarLocked(paramSnackbarRecord, i);
      }
      return;
    }
  }
  
  public boolean isCurrent(SnackbarManager.Callback paramCallback)
  {
    synchronized (this.lock)
    {
      boolean bool = isCurrentSnackbarLocked(paramCallback);
      return bool;
    }
  }
  
  public boolean isCurrentOrNext(SnackbarManager.Callback paramCallback)
  {
    synchronized (this.lock)
    {
      boolean bool1 = isCurrentSnackbarLocked(paramCallback);
      if (!bool1)
      {
        bool2 = isNextSnackbarLocked(paramCallback);
        if (!bool2)
        {
          bool2 = false;
          paramCallback = null;
          break label43;
        }
      }
      boolean bool2 = true;
      label43:
      return bool2;
    }
  }
  
  public void onDismissed(SnackbarManager.Callback paramCallback)
  {
    synchronized (this.lock)
    {
      boolean bool = isCurrentSnackbarLocked(paramCallback);
      if (bool)
      {
        bool = false;
        paramCallback = null;
        this.currentSnackbar = null;
        paramCallback = this.nextSnackbar;
        if (paramCallback != null) {
          showNextSnackbarLocked();
        }
      }
      return;
    }
  }
  
  public void onShown(SnackbarManager.Callback paramCallback)
  {
    synchronized (this.lock)
    {
      boolean bool = isCurrentSnackbarLocked(paramCallback);
      if (bool)
      {
        paramCallback = this.currentSnackbar;
        scheduleTimeoutLocked(paramCallback);
      }
      return;
    }
  }
  
  public void pauseTimeout(SnackbarManager.Callback paramCallback)
  {
    synchronized (this.lock)
    {
      boolean bool1 = isCurrentSnackbarLocked(paramCallback);
      if (bool1)
      {
        paramCallback = this.currentSnackbar;
        boolean bool2 = paramCallback.paused;
        if (!bool2)
        {
          bool2 = true;
          paramCallback.paused = bool2;
          Handler localHandler = this.handler;
          localHandler.removeCallbacksAndMessages(paramCallback);
        }
      }
      return;
    }
  }
  
  public void restoreTimeoutIfPaused(SnackbarManager.Callback paramCallback)
  {
    synchronized (this.lock)
    {
      boolean bool1 = isCurrentSnackbarLocked(paramCallback);
      if (bool1)
      {
        paramCallback = this.currentSnackbar;
        boolean bool2 = paramCallback.paused;
        if (bool2)
        {
          bool2 = false;
          paramCallback.paused = false;
          scheduleTimeoutLocked(paramCallback);
        }
      }
      return;
    }
  }
  
  public void show(int paramInt, SnackbarManager.Callback paramCallback)
  {
    synchronized (this.lock)
    {
      boolean bool = isCurrentSnackbarLocked(paramCallback);
      if (bool)
      {
        paramCallback = this.currentSnackbar;
        paramCallback.duration = paramInt;
        localObject2 = this.handler;
        ((Handler)localObject2).removeCallbacksAndMessages(paramCallback);
        localObject2 = this.currentSnackbar;
        scheduleTimeoutLocked((SnackbarManager.SnackbarRecord)localObject2);
        return;
      }
      bool = isNextSnackbarLocked(paramCallback);
      if (bool)
      {
        paramCallback = this.nextSnackbar;
        paramCallback.duration = paramInt;
      }
      else
      {
        SnackbarManager.SnackbarRecord localSnackbarRecord = new com/google/android/material/snackbar/SnackbarManager$SnackbarRecord;
        localSnackbarRecord.<init>(paramInt, paramCallback);
        this.nextSnackbar = localSnackbarRecord;
      }
      Object localObject2 = this.currentSnackbar;
      if (localObject2 != null)
      {
        int i = 4;
        paramInt = cancelSnackbarLocked((SnackbarManager.SnackbarRecord)localObject2, i);
        if (paramInt != 0) {
          return;
        }
      }
      paramInt = 0;
      localObject2 = null;
      this.currentSnackbar = null;
      showNextSnackbarLocked();
      return;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.snackbar.SnackbarManager
 * JD-Core Version:    0.7.0.1
 */
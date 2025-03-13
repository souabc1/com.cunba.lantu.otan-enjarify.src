package com.google.android.material.snackbar;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

class SnackbarManager$SnackbarRecord
{
  final WeakReference callback;
  int duration;
  boolean paused;
  
  public SnackbarManager$SnackbarRecord(int paramInt, SnackbarManager.Callback paramCallback)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramCallback);
    this.callback = localWeakReference;
    this.duration = paramInt;
  }
  
  public boolean isSnackbar(SnackbarManager.Callback paramCallback)
  {
    if (paramCallback != null)
    {
      Object localObject = this.callback.get();
      if (localObject == paramCallback) {
        return true;
      }
    }
    boolean bool = false;
    paramCallback = null;
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.snackbar.SnackbarManager.SnackbarRecord
 * JD-Core Version:    0.7.0.1
 */
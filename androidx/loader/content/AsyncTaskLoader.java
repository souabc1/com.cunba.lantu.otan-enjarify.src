package androidx.loader.content;

import android.os.Handler;
import android.os.SystemClock;
import androidx.core.util.TimeUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

public abstract class AsyncTaskLoader
  extends Loader
{
  public final Executor OooOO0;
  public volatile AsyncTaskLoader.LoadTask OooOO0O;
  public volatile AsyncTaskLoader.LoadTask OooOO0o;
  public long OooOOO;
  public long OooOOO0;
  public Handler OooOOOO;
  
  public void OooO0oO(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.OooO0oO(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramFileDescriptor = this.OooOO0O;
    paramArrayOfString = " waiting=";
    if (paramFileDescriptor != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTask=");
      paramFileDescriptor = this.OooOO0O;
      paramPrintWriter.print(paramFileDescriptor);
      paramPrintWriter.print(paramArrayOfString);
      paramFileDescriptor = this.OooOO0O;
      bool = paramFileDescriptor.o00Ooooo;
      paramPrintWriter.println(bool);
    }
    paramFileDescriptor = this.OooOO0o;
    if (paramFileDescriptor != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mCancellingTask=");
      paramFileDescriptor = this.OooOO0o;
      paramPrintWriter.print(paramFileDescriptor);
      paramPrintWriter.print(paramArrayOfString);
      paramFileDescriptor = this.OooOO0o;
      bool = paramFileDescriptor.o00Ooooo;
      paramPrintWriter.println(bool);
    }
    long l1 = this.OooOOO0;
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mUpdateThrottle=");
      TimeUtils.OooO0OO(this.OooOOO0, paramPrintWriter);
      paramString = " mLastLoadCompleteTime=";
      paramPrintWriter.print(paramString);
      long l3 = this.OooOOO;
      l1 = SystemClock.uptimeMillis();
      TimeUtils.OooO0O0(l3, l1, paramPrintWriter);
      paramPrintWriter.println();
    }
  }
  
  public boolean OooOO0()
  {
    Object localObject = this.OooOO0O;
    AsyncTaskLoader.LoadTask localLoadTask1 = null;
    if (localObject != null)
    {
      boolean bool = this.OooO0o0;
      if (!bool)
      {
        bool = true;
        this.OooO0oo = bool;
      }
      localObject = this.OooOO0o;
      AsyncTaskLoader.LoadTask localLoadTask2;
      if (localObject != null)
      {
        localObject = this.OooOO0O;
        bool = ((AsyncTaskLoader.LoadTask)localObject).o00Ooooo;
        if (bool)
        {
          this.OooOO0O.o00Ooooo = false;
          localObject = this.OooOOOO;
          localLoadTask2 = this.OooOO0O;
          ((Handler)localObject).removeCallbacks(localLoadTask2);
        }
        this.OooOO0O = null;
        return false;
      }
      localObject = this.OooOO0O;
      bool = ((AsyncTaskLoader.LoadTask)localObject).o00Ooooo;
      if (bool)
      {
        this.OooOO0O.o00Ooooo = false;
        localObject = this.OooOOOO;
        localLoadTask2 = this.OooOO0O;
        ((Handler)localObject).removeCallbacks(localLoadTask2);
        this.OooOO0O = null;
        return false;
      }
      localObject = this.OooOO0O;
      bool = ((ModernAsyncTask)localObject).OooO00o(false);
      if (bool)
      {
        localLoadTask1 = this.OooOO0O;
        this.OooOO0o = localLoadTask1;
        OooOo0O();
      }
      this.OooOO0O = null;
      return bool;
    }
    return false;
  }
  
  public void OooOO0o()
  {
    super.OooOO0o();
    OooO0O0();
    AsyncTaskLoader.LoadTask localLoadTask = new androidx/loader/content/AsyncTaskLoader$LoadTask;
    localLoadTask.<init>(this);
    this.OooOO0O = localLoadTask;
    OooOoO0();
  }
  
  public void OooOo(AsyncTaskLoader.LoadTask paramLoadTask, Object paramObject)
  {
    AsyncTaskLoader.LoadTask localLoadTask = this.OooOO0O;
    if (localLoadTask != paramLoadTask)
    {
      OooOo0o(paramLoadTask, paramObject);
    }
    else
    {
      boolean bool = isAbandoned();
      if (bool)
      {
        OooOoOO(paramObject);
      }
      else
      {
        OooO0OO();
        long l = SystemClock.uptimeMillis();
        this.OooOOO = l;
        bool = false;
        paramLoadTask = null;
        this.OooOO0O = null;
        OooO0o(paramObject);
      }
    }
  }
  
  public void OooOo0O() {}
  
  public void OooOo0o(AsyncTaskLoader.LoadTask paramLoadTask, Object paramObject)
  {
    OooOoOO(paramObject);
    paramObject = this.OooOO0o;
    if (paramObject == paramLoadTask)
    {
      OooOOo0();
      long l = SystemClock.uptimeMillis();
      this.OooOOO = l;
      paramLoadTask = null;
      this.OooOO0o = null;
      OooO0o0();
      OooOoO0();
    }
  }
  
  public abstract Object OooOoO();
  
  public void OooOoO0()
  {
    Object localObject1 = this.OooOO0o;
    if (localObject1 == null)
    {
      localObject1 = this.OooOO0O;
      if (localObject1 != null)
      {
        localObject1 = this.OooOO0O;
        boolean bool = ((AsyncTaskLoader.LoadTask)localObject1).o00Ooooo;
        if (bool)
        {
          this.OooOO0O.o00Ooooo = false;
          localObject1 = this.OooOOOO;
          localObject2 = this.OooOO0O;
          ((Handler)localObject1).removeCallbacks((Runnable)localObject2);
        }
        long l1 = this.OooOOO0;
        long l2 = 0L;
        bool = l1 < l2;
        if (bool)
        {
          l1 = SystemClock.uptimeMillis();
          l2 = this.OooOOO;
          long l3 = this.OooOOO0;
          l2 += l3;
          bool = l1 < l2;
          if (bool)
          {
            this.OooOO0O.o00Ooooo = true;
            localObject1 = this.OooOOOO;
            localObject2 = this.OooOO0O;
            l2 = this.OooOOO;
            l3 = this.OooOOO0;
            l2 += l3;
            ((Handler)localObject1).postAtTime((Runnable)localObject2, l2);
            return;
          }
        }
        localObject1 = this.OooOO0O;
        Object localObject2 = this.OooOO0;
        ((ModernAsyncTask)localObject1).OooO0OO((Executor)localObject2, null);
      }
    }
  }
  
  public void OooOoOO(Object paramObject) {}
  
  public Object OooOoo0()
  {
    return OooOoO();
  }
  
  public boolean isLoadInBackgroundCanceled()
  {
    AsyncTaskLoader.LoadTask localLoadTask = this.OooOO0o;
    boolean bool;
    if (localLoadTask != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localLoadTask = null;
    }
    return bool;
  }
  
  public void setUpdateThrottle(long paramLong)
  {
    this.OooOOO0 = paramLong;
    long l = 0L;
    boolean bool = paramLong < l;
    if (bool)
    {
      Handler localHandler = new android/os/Handler;
      localHandler.<init>();
      this.OooOOOO = localHandler;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.loader.content.AsyncTaskLoader
 * JD-Core Version:    0.7.0.1
 */
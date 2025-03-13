package androidx.core.app;

import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;

public abstract class JobIntentService
  extends Service
{
  public static final Object o00OooOO;
  public static final HashMap o00OooOo;
  public JobIntentService.CompatJobEngine o00OoOoo;
  public JobIntentService.CommandProcessor o00Ooo0;
  public JobIntentService.WorkEnqueuer o00Ooo00;
  public boolean o00Ooo0O = false;
  public boolean o00Ooo0o = false;
  public final ArrayList o00OooO = null;
  public boolean o00OooO0 = false;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    o00OooOO = localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    o00OooOo = (HashMap)localObject;
  }
  
  public JobIntentService.GenericWorkItem OooO00o()
  {
    ??? = this.o00OoOoo;
    if (??? != null) {
      return ((JobIntentService.CompatJobEngine)???).OooO0O0();
    }
    synchronized (this.o00OooO)
    {
      Object localObject2 = this.o00OooO;
      int i = ((ArrayList)localObject2).size();
      if (i > 0)
      {
        localObject2 = this.o00OooO;
        localObject2 = ((ArrayList)localObject2).remove(0);
        localObject2 = (JobIntentService.GenericWorkItem)localObject2;
        return localObject2;
      }
      return null;
    }
  }
  
  public boolean OooO0O0()
  {
    JobIntentService.CommandProcessor localCommandProcessor = this.o00Ooo0;
    if (localCommandProcessor != null)
    {
      boolean bool = this.o00Ooo0O;
      localCommandProcessor.cancel(bool);
    }
    this.o00Ooo0o = true;
    return OooO0o0();
  }
  
  public void OooO0OO(boolean paramBoolean)
  {
    Object localObject = this.o00Ooo0;
    if (localObject == null)
    {
      localObject = new androidx/core/app/JobIntentService$CommandProcessor;
      ((JobIntentService.CommandProcessor)localObject).<init>(this);
      this.o00Ooo0 = ((JobIntentService.CommandProcessor)localObject);
      localObject = this.o00Ooo00;
      if ((localObject != null) && (paramBoolean)) {
        ((JobIntentService.WorkEnqueuer)localObject).OooO0O0();
      }
      JobIntentService.CommandProcessor localCommandProcessor = this.o00Ooo0;
      localObject = AsyncTask.THREAD_POOL_EXECUTOR;
      Void[] arrayOfVoid = new Void[0];
      localCommandProcessor.executeOnExecutor((Executor)localObject, arrayOfVoid);
    }
  }
  
  public abstract void OooO0Oo(Intent paramIntent);
  
  public void OooO0o()
  {
    ArrayList localArrayList = this.o00OooO;
    if (localArrayList != null)
    {
      int i = 0;
      Object localObject1 = null;
      label68:
      try
      {
        this.o00Ooo0 = null;
        localObject1 = this.o00OooO;
        if (localObject1 != null)
        {
          i = ((ArrayList)localObject1).size();
          if (i > 0)
          {
            i = 0;
            localObject1 = null;
            OooO0OO(false);
            break label68;
          }
        }
        boolean bool = this.o00OooO0;
        if (!bool)
        {
          localObject1 = this.o00Ooo00;
          ((JobIntentService.WorkEnqueuer)localObject1).OooO00o();
        }
      }
      finally {}
    }
  }
  
  public boolean OooO0o0()
  {
    return true;
  }
  
  public boolean isStopped()
  {
    return this.o00Ooo0o;
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    paramIntent = this.o00OoOoo;
    if (paramIntent != null) {
      return paramIntent.OooO00o();
    }
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    JobIntentService.JobServiceEngineImpl localJobServiceEngineImpl = new androidx/core/app/JobIntentService$JobServiceEngineImpl;
    localJobServiceEngineImpl.<init>(this);
    this.o00OoOoo = localJobServiceEngineImpl;
    this.o00Ooo00 = null;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    ArrayList localArrayList = this.o00OooO;
    if (localArrayList != null)
    {
      boolean bool = true;
      try
      {
        this.o00OooO0 = bool;
        JobIntentService.WorkEnqueuer localWorkEnqueuer = this.o00Ooo00;
        localWorkEnqueuer.OooO00o();
      }
      finally {}
    }
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    ??? = this.o00OooO;
    if (??? != null)
    {
      this.o00Ooo00.OooO0OO();
      synchronized (this.o00OooO)
      {
        ArrayList localArrayList2 = this.o00OooO;
        JobIntentService.CompatWorkItem localCompatWorkItem = new androidx/core/app/JobIntentService$CompatWorkItem;
        if (paramIntent == null)
        {
          paramIntent = new android/content/Intent;
          paramIntent.<init>();
        }
        localCompatWorkItem.<init>(this, paramIntent, paramInt2);
        localArrayList2.add(localCompatWorkItem);
        boolean bool = true;
        OooO0OO(bool);
        return 3;
      }
    }
    return 2;
  }
  
  public void setInterruptIfStopped(boolean paramBoolean)
  {
    this.o00Ooo0O = paramBoolean;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.JobIntentService
 * JD-Core Version:    0.7.0.1
 */
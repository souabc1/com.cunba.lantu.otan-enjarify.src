package androidx.appcompat.app;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

class AppLocalesStorageHelper$SerialExecutor
  implements Executor
{
  public final Object o00OoOoo;
  public final Executor o00Ooo0;
  public final Queue o00Ooo00;
  public Runnable o00Ooo0O;
  
  public AppLocalesStorageHelper$SerialExecutor(Executor paramExecutor)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.o00OoOoo = localObject;
    localObject = new java/util/ArrayDeque;
    ((ArrayDeque)localObject).<init>();
    this.o00Ooo00 = ((Queue)localObject);
    this.o00Ooo0 = paramExecutor;
  }
  
  public void OooO0OO()
  {
    synchronized (this.o00OoOoo)
    {
      Object localObject2 = this.o00Ooo00;
      localObject2 = ((Queue)localObject2).poll();
      localObject2 = (Runnable)localObject2;
      this.o00Ooo0O = ((Runnable)localObject2);
      if (localObject2 != null)
      {
        Executor localExecutor = this.o00Ooo0;
        localExecutor.execute((Runnable)localObject2);
      }
      return;
    }
  }
  
  public void execute(Runnable paramRunnable)
  {
    synchronized (this.o00OoOoo)
    {
      Queue localQueue = this.o00Ooo00;
      OooOOOO localOooOOOO = new androidx/appcompat/app/OooOOOO;
      localOooOOOO.<init>(this, paramRunnable);
      localQueue.add(localOooOOOO);
      paramRunnable = this.o00Ooo0O;
      if (paramRunnable == null) {
        OooO0OO();
      }
      return;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppLocalesStorageHelper.SerialExecutor
 * JD-Core Version:    0.7.0.1
 */
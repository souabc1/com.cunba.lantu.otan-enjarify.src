package androidx.loader.content;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

class ModernAsyncTask$2
  extends ModernAsyncTask.WorkerRunnable
{
  public ModernAsyncTask$2(ModernAsyncTask paramModernAsyncTask) {}
  
  public Object call()
  {
    Object localObject1 = this.o00Ooo00.o00Ooo0o;
    boolean bool = true;
    ((AtomicBoolean)localObject1).set(bool);
    int i = 10;
    Object localObject4 = null;
    try
    {
      Process.setThreadPriority(i);
      localObject1 = this.o00Ooo00;
      localObject5 = this.o00OoOoo;
      localObject4 = ((ModernAsyncTask)localObject1).OooO0O0((Object[])localObject5);
      Binder.flushPendingCommands();
      this.o00Ooo00.OooOO0(localObject4);
      return localObject4;
    }
    finally
    {
      try
      {
        Object localObject5 = this.o00Ooo00;
        localObject5 = ((ModernAsyncTask)localObject5).o00Ooo0O;
        ((AtomicBoolean)localObject5).set(bool);
        throw localObject2;
      }
      finally
      {
        this.o00Ooo00.OooOO0(localObject4);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.loader.content.ModernAsyncTask.2
 * JD-Core Version:    0.7.0.1
 */
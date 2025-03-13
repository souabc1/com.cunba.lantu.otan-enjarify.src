package androidx.loader.content;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class ModernAsyncTask$3
  extends FutureTask
{
  public ModernAsyncTask$3(ModernAsyncTask paramModernAsyncTask, Callable paramCallable)
  {
    super(paramCallable);
  }
  
  /* Error */
  public void done()
  {
    // Byte code:
    //   0: ldc 14
    //   2: astore_1
    //   3: aload_0
    //   4: invokevirtual 18	java/util/concurrent/FutureTask:get	()Ljava/lang/Object;
    //   7: astore_2
    //   8: aload_0
    //   9: getfield 8	androidx/loader/content/ModernAsyncTask$3:o00OoOoo	Landroidx/loader/content/ModernAsyncTask;
    //   12: astore_3
    //   13: aload_3
    //   14: aload_2
    //   15: invokevirtual 24	androidx/loader/content/ModernAsyncTask:OooOO0O	(Ljava/lang/Object;)V
    //   18: goto +51 -> 69
    //   21: astore_2
    //   22: new 26	java/lang/RuntimeException
    //   25: astore_3
    //   26: aload_3
    //   27: aload_1
    //   28: aload_2
    //   29: invokespecial 29	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   32: aload_3
    //   33: athrow
    //   34: pop
    //   35: aload_0
    //   36: getfield 8	androidx/loader/content/ModernAsyncTask$3:o00OoOoo	Landroidx/loader/content/ModernAsyncTask;
    //   39: astore_1
    //   40: aconst_null
    //   41: astore_2
    //   42: aload_1
    //   43: aconst_null
    //   44: invokevirtual 24	androidx/loader/content/ModernAsyncTask:OooOO0O	(Ljava/lang/Object;)V
    //   47: goto +22 -> 69
    //   50: astore_2
    //   51: new 26	java/lang/RuntimeException
    //   54: astore_3
    //   55: aload_2
    //   56: invokevirtual 35	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   59: astore_2
    //   60: aload_3
    //   61: aload_1
    //   62: aload_2
    //   63: invokespecial 29	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   66: aload_3
    //   67: athrow
    //   68: pop
    //   69: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	70	0	this	3
    //   2	60	1	localObject1	java.lang.Object
    //   7	8	2	localObject2	java.lang.Object
    //   21	8	2	localThrowable1	java.lang.Throwable
    //   41	1	2	localObject3	java.lang.Object
    //   50	6	2	localExecutionException	java.util.concurrent.ExecutionException
    //   59	4	2	localThrowable2	java.lang.Throwable
    //   12	55	3	localObject4	java.lang.Object
    //   34	1	8	localCancellationException	java.util.concurrent.CancellationException
    //   68	1	9	localInterruptedException	java.lang.InterruptedException
    // Exception table:
    //   from	to	target	type
    //   3	7	21	finally
    //   8	12	21	finally
    //   14	18	21	finally
    //   3	7	34	java/util/concurrent/CancellationException
    //   8	12	34	java/util/concurrent/CancellationException
    //   14	18	34	java/util/concurrent/CancellationException
    //   3	7	50	java/util/concurrent/ExecutionException
    //   8	12	50	java/util/concurrent/ExecutionException
    //   14	18	50	java/util/concurrent/ExecutionException
    //   3	7	68	java/lang/InterruptedException
    //   8	12	68	java/lang/InterruptedException
    //   14	18	68	java/lang/InterruptedException
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.loader.content.ModernAsyncTask.3
 * JD-Core Version:    0.7.0.1
 */
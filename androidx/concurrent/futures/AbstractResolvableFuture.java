package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractResolvableFuture
  implements ListenableFuture
{
  public static final boolean o00Ooo0O;
  public static final Logger o00Ooo0o;
  public static final Object o00OooO;
  public static final AbstractResolvableFuture.AtomicHelper o00OooO0;
  public volatile Object o00OoOoo;
  public volatile AbstractResolvableFuture.Waiter o00Ooo0;
  public volatile AbstractResolvableFuture.Listener o00Ooo00;
  
  static
  {
    Object localObject1 = AbstractResolvableFuture.Waiter.class;
    boolean bool = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    o00Ooo0O = bool;
    Object localObject3 = AbstractResolvableFuture.class;
    Object localObject4 = Logger.getLogger(((Class)localObject3).getName());
    o00Ooo0o = (Logger)localObject4;
    Object localObject5;
    try
    {
      localObject4 = new androidx/concurrent/futures/AbstractResolvableFuture$SafeAtomicHelper;
      localObject5 = Thread.class;
      Object localObject6 = "OooO00o";
      localObject6 = AtomicReferenceFieldUpdater.newUpdater((Class)localObject1, (Class)localObject5, (String)localObject6);
      localObject5 = "OooO0O0";
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater1 = AtomicReferenceFieldUpdater.newUpdater((Class)localObject1, (Class)localObject1, (String)localObject5);
      localObject5 = "o00Ooo0";
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater2 = AtomicReferenceFieldUpdater.newUpdater((Class)localObject3, (Class)localObject1, (String)localObject5);
      localObject1 = AbstractResolvableFuture.Listener.class;
      localObject5 = "o00Ooo00";
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater3 = AtomicReferenceFieldUpdater.newUpdater((Class)localObject3, (Class)localObject1, (String)localObject5);
      localObject1 = Object.class;
      localObject5 = "o00OoOoo";
      AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater4 = AtomicReferenceFieldUpdater.newUpdater((Class)localObject3, (Class)localObject1, (String)localObject5);
      localObject5 = localObject4;
      ((AbstractResolvableFuture.SafeAtomicHelper)localObject4).<init>((AtomicReferenceFieldUpdater)localObject6, localAtomicReferenceFieldUpdater1, localAtomicReferenceFieldUpdater2, localAtomicReferenceFieldUpdater3, localAtomicReferenceFieldUpdater4);
      localObject1 = null;
    }
    finally
    {
      localObject4 = new androidx/concurrent/futures/AbstractResolvableFuture$SynchronizedHelper;
      ((AbstractResolvableFuture.SynchronizedHelper)localObject4).<init>();
    }
    o00OooO0 = (AbstractResolvableFuture.AtomicHelper)localObject4;
    if (localThrowable != null)
    {
      localObject3 = o00Ooo0o;
      localObject4 = Level.SEVERE;
      localObject5 = "SafeAtomicHelper is broken!";
      ((Logger)localObject3).log((Level)localObject4, (String)localObject5, localThrowable);
    }
    Object localObject2 = new java/lang/Object;
    localObject2.<init>();
    o00OooO = localObject2;
  }
  
  /* Error */
  public static Object OooO(ListenableFuture paramListenableFuture)
  {
    // Byte code:
    //   0: aload_0
    //   1: instanceof 2
    //   4: istore_1
    //   5: aconst_null
    //   6: astore_2
    //   7: iload_1
    //   8: ifeq +71 -> 79
    //   11: aload_0
    //   12: checkcast 2	androidx/concurrent/futures/AbstractResolvableFuture
    //   15: getfield 100	androidx/concurrent/futures/AbstractResolvableFuture:o00OoOoo	Ljava/lang/Object;
    //   18: astore_0
    //   19: aload_0
    //   20: instanceof 102
    //   23: istore_1
    //   24: iload_1
    //   25: ifeq +52 -> 77
    //   28: aload_0
    //   29: astore_3
    //   30: aload_0
    //   31: checkcast 102	androidx/concurrent/futures/AbstractResolvableFuture$Cancellation
    //   34: astore_3
    //   35: aload_3
    //   36: getfield 104	androidx/concurrent/futures/AbstractResolvableFuture$Cancellation:OooO00o	Z
    //   39: istore 4
    //   41: iload 4
    //   43: ifeq +34 -> 77
    //   46: aload_3
    //   47: getfield 107	androidx/concurrent/futures/AbstractResolvableFuture$Cancellation:OooO0O0	Ljava/lang/Throwable;
    //   50: astore_0
    //   51: aload_0
    //   52: ifnull +21 -> 73
    //   55: new 102	androidx/concurrent/futures/AbstractResolvableFuture$Cancellation
    //   58: astore_0
    //   59: aload_3
    //   60: getfield 107	androidx/concurrent/futures/AbstractResolvableFuture$Cancellation:OooO0O0	Ljava/lang/Throwable;
    //   63: astore_3
    //   64: aload_0
    //   65: iconst_0
    //   66: aload_3
    //   67: invokespecial 110	androidx/concurrent/futures/AbstractResolvableFuture$Cancellation:<init>	(ZLjava/lang/Throwable;)V
    //   70: goto +7 -> 77
    //   73: getstatic 114	androidx/concurrent/futures/AbstractResolvableFuture$Cancellation:OooO0Oo	Landroidx/concurrent/futures/AbstractResolvableFuture$Cancellation;
    //   76: astore_0
    //   77: aload_0
    //   78: areturn
    //   79: aload_0
    //   80: invokeinterface 120 1 0
    //   85: istore_1
    //   86: getstatic 39	androidx/concurrent/futures/AbstractResolvableFuture:o00Ooo0O	Z
    //   89: iconst_1
    //   90: ixor
    //   91: iload_1
    //   92: iand
    //   93: istore 4
    //   95: iload 4
    //   97: ifeq +7 -> 104
    //   100: getstatic 114	androidx/concurrent/futures/AbstractResolvableFuture$Cancellation:OooO0Oo	Landroidx/concurrent/futures/AbstractResolvableFuture$Cancellation;
    //   103: areturn
    //   104: aload_0
    //   105: invokestatic 124	androidx/concurrent/futures/AbstractResolvableFuture:OooOO0	(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    //   108: astore 5
    //   110: aload 5
    //   112: ifnonnull +8 -> 120
    //   115: getstatic 98	androidx/concurrent/futures/AbstractResolvableFuture:o00OooO	Ljava/lang/Object;
    //   118: astore 5
    //   120: aload 5
    //   122: areturn
    //   123: astore_0
    //   124: new 126	androidx/concurrent/futures/AbstractResolvableFuture$Failure
    //   127: astore_3
    //   128: aload_3
    //   129: aload_0
    //   130: invokespecial 129	androidx/concurrent/futures/AbstractResolvableFuture$Failure:<init>	(Ljava/lang/Throwable;)V
    //   133: aload_3
    //   134: areturn
    //   135: astore 5
    //   137: iload_1
    //   138: ifne +56 -> 194
    //   141: new 126	androidx/concurrent/futures/AbstractResolvableFuture$Failure
    //   144: astore_3
    //   145: new 131	java/lang/IllegalArgumentException
    //   148: astore_2
    //   149: new 133	java/lang/StringBuilder
    //   152: astore 6
    //   154: aload 6
    //   156: invokespecial 134	java/lang/StringBuilder:<init>	()V
    //   159: aload 6
    //   161: ldc 136
    //   163: invokevirtual 140	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: pop
    //   167: aload 6
    //   169: aload_0
    //   170: invokevirtual 143	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   173: pop
    //   174: aload 6
    //   176: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   179: astore_0
    //   180: aload_2
    //   181: aload_0
    //   182: aload 5
    //   184: invokespecial 149	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   187: aload_3
    //   188: aload_2
    //   189: invokespecial 129	androidx/concurrent/futures/AbstractResolvableFuture$Failure:<init>	(Ljava/lang/Throwable;)V
    //   192: aload_3
    //   193: areturn
    //   194: new 102	androidx/concurrent/futures/AbstractResolvableFuture$Cancellation
    //   197: astore_0
    //   198: aload_0
    //   199: iconst_0
    //   200: aload 5
    //   202: invokespecial 110	androidx/concurrent/futures/AbstractResolvableFuture$Cancellation:<init>	(ZLjava/lang/Throwable;)V
    //   205: aload_0
    //   206: areturn
    //   207: astore_0
    //   208: new 126	androidx/concurrent/futures/AbstractResolvableFuture$Failure
    //   211: astore_3
    //   212: aload_0
    //   213: invokevirtual 155	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   216: astore_0
    //   217: aload_3
    //   218: aload_0
    //   219: invokespecial 129	androidx/concurrent/futures/AbstractResolvableFuture$Failure:<init>	(Ljava/lang/Throwable;)V
    //   222: aload_3
    //   223: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	224	0	paramListenableFuture	ListenableFuture
    //   4	134	1	bool1	boolean
    //   6	183	2	localIllegalArgumentException	java.lang.IllegalArgumentException
    //   29	194	3	localObject1	Object
    //   39	57	4	bool2	boolean
    //   108	13	5	localObject2	Object
    //   135	66	5	localCancellationException	CancellationException
    //   152	23	6	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   104	108	123	finally
    //   115	118	123	finally
    //   104	108	135	java/util/concurrent/CancellationException
    //   115	118	135	java/util/concurrent/CancellationException
    //   104	108	207	java/util/concurrent/ExecutionException
    //   115	118	207	java/util/concurrent/ExecutionException
  }
  
  public static CancellationException OooO0OO(String paramString, Throwable paramThrowable)
  {
    CancellationException localCancellationException = new java/util/concurrent/CancellationException;
    localCancellationException.<init>(paramString);
    localCancellationException.initCause(paramThrowable);
    return localCancellationException;
  }
  
  public static Object OooO0Oo(Object paramObject)
  {
    paramObject.getClass();
    return paramObject;
  }
  
  public static void OooO0o(AbstractResolvableFuture paramAbstractResolvableFuture)
  {
    AbstractResolvableFuture.Listener localListener = null;
    paramAbstractResolvableFuture.OooOOO0();
    paramAbstractResolvableFuture.OooO0O0();
    for (paramAbstractResolvableFuture = paramAbstractResolvableFuture.OooO0o0(localListener);; paramAbstractResolvableFuture = localListener)
    {
      if (paramAbstractResolvableFuture == null) {
        return;
      }
      localListener = paramAbstractResolvableFuture.OooO0OO;
      Object localObject1 = paramAbstractResolvableFuture.OooO00o;
      boolean bool1 = localObject1 instanceof AbstractResolvableFuture.SetFuture;
      if (bool1)
      {
        localObject1 = (AbstractResolvableFuture.SetFuture)localObject1;
        paramAbstractResolvableFuture = ((AbstractResolvableFuture.SetFuture)localObject1).o00OoOoo;
        Object localObject2 = paramAbstractResolvableFuture.o00OoOoo;
        if (localObject2 != localObject1) {
          continue;
        }
        localObject2 = OooO(((AbstractResolvableFuture.SetFuture)localObject1).o00Ooo00);
        AbstractResolvableFuture.AtomicHelper localAtomicHelper = o00OooO0;
        boolean bool2 = localAtomicHelper.OooO0O0(paramAbstractResolvableFuture, localObject1, localObject2);
        if (!bool2) {
          continue;
        }
        break;
      }
      paramAbstractResolvableFuture = paramAbstractResolvableFuture.OooO0O0;
      OooO0oO((Runnable)localObject1, paramAbstractResolvableFuture);
    }
  }
  
  public static void OooO0oO(Runnable paramRunnable, Executor paramExecutor)
  {
    try
    {
      paramExecutor.execute(paramRunnable);
    }
    catch (RuntimeException localRuntimeException)
    {
      Logger localLogger = o00Ooo0o;
      Level localLevel = Level.SEVERE;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = "RuntimeException while executing runnable ";
      localStringBuilder.append(str);
      localStringBuilder.append(paramRunnable);
      localStringBuilder.append(" with executor ");
      localStringBuilder.append(paramExecutor);
      paramRunnable = localStringBuilder.toString();
      localLogger.log(localLevel, paramRunnable, localRuntimeException);
    }
  }
  
  /* Error */
  public static Object OooOO0(Future paramFuture)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_0
    //   5: invokeinterface 225 1 0
    //   10: astore_0
    //   11: iload_1
    //   12: ifeq +11 -> 23
    //   15: invokestatic 229	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   18: astore_2
    //   19: aload_2
    //   20: invokevirtual 232	java/lang/Thread:interrupt	()V
    //   23: aload_0
    //   24: areturn
    //   25: astore_0
    //   26: iload_1
    //   27: ifeq +11 -> 38
    //   30: invokestatic 229	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   33: astore_2
    //   34: aload_2
    //   35: invokevirtual 232	java/lang/Thread:interrupt	()V
    //   38: aload_0
    //   39: athrow
    //   40: pop
    //   41: iconst_1
    //   42: istore_1
    //   43: goto -39 -> 4
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	paramFuture	Future
    //   1	42	1	i	int
    //   3	32	2	localThread	Thread
    //   40	1	3	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   4	10	25	finally
    //   4	10	40	java/lang/InterruptedException
  }
  
  public final void OooO00o(StringBuilder paramStringBuilder)
  {
    String str1 = "]";
    Object localObject1;
    try
    {
      localObject2 = OooOO0(this);
      str2 = "SUCCESS, result=[";
      paramStringBuilder.append(str2);
      localObject2 = OooOOo0(localObject2);
      paramStringBuilder.append((String)localObject2);
      paramStringBuilder.append(str1);
    }
    catch (RuntimeException localRuntimeException)
    {
      Object localObject2 = "UNKNOWN, cause=[";
      paramStringBuilder.append((String)localObject2);
      localObject1 = localRuntimeException.getClass();
      paramStringBuilder.append(localObject1);
      localObject1 = " thrown from get()]";
    }
    catch (CancellationException localCancellationException)
    {
      localObject1 = "CANCELLED";
    }
    catch (ExecutionException localExecutionException)
    {
      String str2 = "FAILURE, cause=[";
      paramStringBuilder.append(str2);
      Throwable localThrowable = localExecutionException.getCause();
      paramStringBuilder.append(localThrowable);
    }
    paramStringBuilder.append((String)localObject1);
  }
  
  public void OooO0O0() {}
  
  public final AbstractResolvableFuture.Listener OooO0o0(AbstractResolvableFuture.Listener paramListener)
  {
    Object localObject;
    boolean bool;
    do
    {
      localListener1 = this.o00Ooo00;
      localObject = o00OooO0;
      AbstractResolvableFuture.Listener localListener2 = AbstractResolvableFuture.Listener.OooO0Oo;
      bool = ((AbstractResolvableFuture.AtomicHelper)localObject).OooO00o(this, localListener1, localListener2);
    } while (!bool);
    AbstractResolvableFuture.Listener localListener3 = localListener1;
    AbstractResolvableFuture.Listener localListener1 = paramListener;
    for (paramListener = localListener3; paramListener != null; paramListener = (AbstractResolvableFuture.Listener)localObject)
    {
      localObject = paramListener.OooO0OO;
      paramListener.OooO0OO = localListener1;
      localListener1 = paramListener;
    }
    return localListener1;
  }
  
  public final Object OooO0oo(Object paramObject)
  {
    boolean bool = paramObject instanceof AbstractResolvableFuture.Cancellation;
    if (!bool)
    {
      bool = paramObject instanceof AbstractResolvableFuture.Failure;
      if (!bool)
      {
        localObject = o00OooO;
        if (paramObject == localObject) {
          paramObject = null;
        }
        return paramObject;
      }
      Object localObject = new java/util/concurrent/ExecutionException;
      paramObject = ((AbstractResolvableFuture.Failure)paramObject).OooO00o;
      ((ExecutionException)localObject).<init>(paramObject);
      throw ((Throwable)localObject);
    }
    paramObject = ((AbstractResolvableFuture.Cancellation)paramObject).OooO0O0;
    throw OooO0OO("Task was cancelled.", paramObject);
  }
  
  public void OooOO0O() {}
  
  public String OooOO0o()
  {
    Object localObject1 = this.o00OoOoo;
    boolean bool1 = localObject1 instanceof AbstractResolvableFuture.SetFuture;
    Object localObject2;
    if (bool1)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("setFuture=[");
      localObject1 = ((AbstractResolvableFuture.SetFuture)localObject1).o00Ooo00;
      localObject1 = OooOOo0(localObject1);
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append("]");
      return ((StringBuilder)localObject2).toString();
    }
    boolean bool2 = this instanceof ScheduledFuture;
    if (bool2)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("remaining delay=[");
      localObject2 = this;
      localObject2 = (ScheduledFuture)this;
      TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
      long l = ((Delayed)localObject2).getDelay(localTimeUnit);
      ((StringBuilder)localObject1).append(l);
      ((StringBuilder)localObject1).append(" ms]");
      return ((StringBuilder)localObject1).toString();
    }
    return null;
  }
  
  public final void OooOOO(AbstractResolvableFuture.Waiter paramWaiter)
  {
    paramWaiter.OooO00o = null;
    paramWaiter = this.o00Ooo0;
    AbstractResolvableFuture.Waiter localWaiter1 = AbstractResolvableFuture.Waiter.OooO0OO;
    if (paramWaiter == localWaiter1) {
      return;
    }
    localWaiter1 = null;
    for (;;)
    {
      if (paramWaiter == null) {
        return;
      }
      AbstractResolvableFuture.Waiter localWaiter2 = paramWaiter.OooO0O0;
      Object localObject = paramWaiter.OooO00o;
      if (localObject != null)
      {
        localWaiter1 = paramWaiter;
      }
      else
      {
        if (localWaiter1 != null)
        {
          localWaiter1.OooO0O0 = localWaiter2;
          paramWaiter = localWaiter1.OooO00o;
          if (paramWaiter != null) {
            break label91;
          }
          break;
        }
        localObject = o00OooO0;
        boolean bool = ((AbstractResolvableFuture.AtomicHelper)localObject).OooO0OO(this, paramWaiter, localWaiter2);
        if (!bool) {
          break;
        }
      }
      label91:
      paramWaiter = localWaiter2;
    }
  }
  
  public final void OooOOO0()
  {
    AbstractResolvableFuture.Waiter localWaiter1;
    boolean bool;
    do
    {
      localWaiter1 = this.o00Ooo0;
      AbstractResolvableFuture.AtomicHelper localAtomicHelper = o00OooO0;
      AbstractResolvableFuture.Waiter localWaiter2 = AbstractResolvableFuture.Waiter.OooO0OO;
      bool = localAtomicHelper.OooO0OO(this, localWaiter1, localWaiter2);
    } while (!bool);
    while (localWaiter1 != null)
    {
      localWaiter1.OooO00o();
      localWaiter1 = localWaiter1.OooO0O0;
    }
  }
  
  public boolean OooOOOO(Object paramObject)
  {
    if (paramObject == null) {
      paramObject = o00OooO;
    }
    AbstractResolvableFuture.AtomicHelper localAtomicHelper = o00OooO0;
    boolean bool = localAtomicHelper.OooO0O0(this, null, paramObject);
    if (bool)
    {
      OooO0o(this);
      return true;
    }
    return false;
  }
  
  public boolean OooOOOo(Throwable paramThrowable)
  {
    AbstractResolvableFuture.Failure localFailure = new androidx/concurrent/futures/AbstractResolvableFuture$Failure;
    paramThrowable = (Throwable)OooO0Oo(paramThrowable);
    localFailure.<init>(paramThrowable);
    paramThrowable = o00OooO0;
    boolean bool = paramThrowable.OooO0O0(this, null, localFailure);
    if (bool)
    {
      OooO0o(this);
      return true;
    }
    return false;
  }
  
  public final String OooOOo0(Object paramObject)
  {
    if (paramObject == this) {
      return "this future";
    }
    return String.valueOf(paramObject);
  }
  
  public final void addListener(Runnable paramRunnable, Executor paramExecutor)
  {
    OooO0Oo(paramRunnable);
    OooO0Oo(paramExecutor);
    AbstractResolvableFuture.Listener localListener1 = this.o00Ooo00;
    AbstractResolvableFuture.Listener localListener2 = AbstractResolvableFuture.Listener.OooO0Oo;
    if (localListener1 != localListener2)
    {
      localListener2 = new androidx/concurrent/futures/AbstractResolvableFuture$Listener;
      localListener2.<init>(paramRunnable, paramExecutor);
      Object localObject;
      do
      {
        localListener2.OooO0OO = localListener1;
        localObject = o00OooO0;
        boolean bool = ((AbstractResolvableFuture.AtomicHelper)localObject).OooO00o(this, localListener1, localListener2);
        if (bool) {
          return;
        }
        localListener1 = this.o00Ooo00;
        localObject = AbstractResolvableFuture.Listener.OooO0Oo;
      } while (localListener1 != localObject);
    }
    OooO0oO(paramRunnable, paramExecutor);
  }
  
  public final boolean cancel(boolean paramBoolean)
  {
    Object localObject1 = this.o00OoOoo;
    boolean bool1 = true;
    float f1 = 1.4E-45F;
    boolean bool2;
    AbstractResolvableFuture.Cancellation localCancellation;
    if (localObject1 == null)
    {
      bool2 = bool1;
    }
    else
    {
      bool2 = false;
      localCancellation = null;
    }
    boolean bool3 = localObject1 instanceof AbstractResolvableFuture.SetFuture;
    bool2 |= bool3;
    if (bool2)
    {
      bool2 = o00Ooo0O;
      if (bool2)
      {
        localCancellation = new androidx/concurrent/futures/AbstractResolvableFuture$Cancellation;
        localObject2 = new java/util/concurrent/CancellationException;
        str = "Future.cancel() was called.";
        ((CancellationException)localObject2).<init>(str);
        localCancellation.<init>(paramBoolean, (Throwable)localObject2);
      }
      else if (paramBoolean)
      {
        localCancellation = AbstractResolvableFuture.Cancellation.OooO0OO;
      }
      else
      {
        localCancellation = AbstractResolvableFuture.Cancellation.OooO0Oo;
      }
      Object localObject2 = this;
      boolean bool4 = false;
      String str = null;
      float f2 = 0.0F;
      boolean bool5;
      label260:
      do
      {
        for (;;)
        {
          AbstractResolvableFuture.AtomicHelper localAtomicHelper = o00OooO0;
          bool5 = localAtomicHelper.OooO0O0((AbstractResolvableFuture)localObject2, localObject1, localCancellation);
          if (!bool5) {
            break label260;
          }
          if (paramBoolean) {
            ((AbstractResolvableFuture)localObject2).OooOO0O();
          }
          OooO0o((AbstractResolvableFuture)localObject2);
          bool3 = localObject1 instanceof AbstractResolvableFuture.SetFuture;
          if (!bool3) {
            return bool1;
          }
          localObject1 = ((AbstractResolvableFuture.SetFuture)localObject1).o00Ooo00;
          bool3 = localObject1 instanceof AbstractResolvableFuture;
          if (!bool3) {
            break;
          }
          localObject2 = localObject1;
          localObject2 = (AbstractResolvableFuture)localObject1;
          localObject1 = ((AbstractResolvableFuture)localObject2).o00OoOoo;
          if (localObject1 == null)
          {
            bool4 = bool1;
            f2 = f1;
          }
          else
          {
            bool4 = false;
            str = null;
            f2 = 0.0F;
          }
          bool5 = localObject1 instanceof AbstractResolvableFuture.SetFuture;
          bool4 |= bool5;
          if (!bool4) {
            return bool1;
          }
          bool4 = bool1;
          f2 = f1;
        }
        ((Future)localObject1).cancel(paramBoolean);
        break;
        localObject1 = ((AbstractResolvableFuture)localObject2).o00OoOoo;
        bool5 = localObject1 instanceof AbstractResolvableFuture.SetFuture;
      } while (bool5);
      bool1 = bool4;
      f1 = f2;
    }
    else
    {
      bool1 = false;
      f1 = 0.0F;
    }
    return bool1;
  }
  
  public final Object get()
  {
    boolean bool1 = Thread.interrupted();
    if (!bool1)
    {
      localObject1 = this.o00OoOoo;
      boolean bool2 = true;
      boolean bool3;
      if (localObject1 != null)
      {
        bool3 = bool2;
      }
      else
      {
        bool3 = false;
        localWaiter = null;
      }
      boolean bool4 = localObject1 instanceof AbstractResolvableFuture.SetFuture ^ bool2;
      bool3 &= bool4;
      if (bool3) {
        return OooO0oo(localObject1);
      }
      localObject1 = this.o00Ooo0;
      AbstractResolvableFuture.Waiter localWaiter = AbstractResolvableFuture.Waiter.OooO0OO;
      if (localObject1 != localWaiter)
      {
        localWaiter = new androidx/concurrent/futures/AbstractResolvableFuture$Waiter;
        localWaiter.<init>();
        Object localObject2;
        do
        {
          localWaiter.setNext((AbstractResolvableFuture.Waiter)localObject1);
          localObject2 = o00OooO0;
          bool1 = ((AbstractResolvableFuture.AtomicHelper)localObject2).OooO0OO(this, (AbstractResolvableFuture.Waiter)localObject1, localWaiter);
          if (bool1)
          {
            do
            {
              LockSupport.park(this);
              bool1 = Thread.interrupted();
              if (bool1) {
                break;
              }
              localObject1 = this.o00OoOoo;
              if (localObject1 != null)
              {
                bool4 = bool2;
              }
              else
              {
                bool4 = false;
                localObject2 = null;
              }
              boolean bool5 = localObject1 instanceof AbstractResolvableFuture.SetFuture ^ bool2;
              bool4 &= bool5;
            } while (!bool4);
            return OooO0oo(localObject1);
            OooOOO(localWaiter);
            localObject1 = new java/lang/InterruptedException;
            ((InterruptedException)localObject1).<init>();
            throw ((Throwable)localObject1);
          }
          localObject1 = this.o00Ooo0;
          localObject2 = AbstractResolvableFuture.Waiter.OooO0OO;
        } while (localObject1 != localObject2);
      }
      localObject1 = this.o00OoOoo;
      return OooO0oo(localObject1);
    }
    Object localObject1 = new java/lang/InterruptedException;
    ((InterruptedException)localObject1).<init>();
    throw ((Throwable)localObject1);
  }
  
  public final Object get(long paramLong, TimeUnit paramTimeUnit)
  {
    AbstractResolvableFuture localAbstractResolvableFuture = this;
    long l1 = paramLong;
    Object localObject1 = paramTimeUnit;
    long l2 = paramTimeUnit.toNanos(paramLong);
    boolean bool1 = Thread.interrupted();
    if (!bool1)
    {
      Object localObject2 = this.o00OoOoo;
      boolean bool2 = true;
      boolean bool3;
      if (localObject2 != null) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
      boolean bool4 = localObject2 instanceof AbstractResolvableFuture.SetFuture ^ bool2;
      bool3 &= bool4;
      if (bool3) {
        return localAbstractResolvableFuture.OooO0oo(localObject2);
      }
      long l3 = 0L;
      bool1 = l2 < l3;
      if (bool1) {
        l4 = System.nanoTime() + l2;
      } else {
        l4 = l3;
      }
      long l5 = 1000L;
      bool1 = l2 < l5;
      boolean bool5;
      Object localObject5;
      boolean bool6;
      if (!bool1)
      {
        localObject2 = localAbstractResolvableFuture.o00Ooo0;
        localObject3 = AbstractResolvableFuture.Waiter.OooO0OO;
        if (localObject2 != localObject3)
        {
          localObject3 = new androidx/concurrent/futures/AbstractResolvableFuture$Waiter;
          ((AbstractResolvableFuture.Waiter)localObject3).<init>();
          do
          {
            ((AbstractResolvableFuture.Waiter)localObject3).setNext((AbstractResolvableFuture.Waiter)localObject2);
            localObject4 = o00OooO0;
            bool1 = ((AbstractResolvableFuture.AtomicHelper)localObject4).OooO0OO(localAbstractResolvableFuture, (AbstractResolvableFuture.Waiter)localObject2, (AbstractResolvableFuture.Waiter)localObject3);
            if (bool1)
            {
              do
              {
                LockSupport.parkNanos(localAbstractResolvableFuture, l2);
                bool5 = Thread.interrupted();
                if (bool5) {
                  break;
                }
                localObject5 = localAbstractResolvableFuture.o00OoOoo;
                if (localObject5 != null) {
                  bool6 = bool2;
                } else {
                  bool6 = false;
                }
                bool1 = localObject5 instanceof AbstractResolvableFuture.SetFuture ^ bool2;
                bool6 &= bool1;
                if (bool6) {
                  return localAbstractResolvableFuture.OooO0oo(localObject5);
                }
                l2 = System.nanoTime();
                l2 = l4 - l2;
                bool1 = l2 < l5;
              } while (!bool1);
              localAbstractResolvableFuture.OooOOO((AbstractResolvableFuture.Waiter)localObject3);
              break;
              localAbstractResolvableFuture.OooOOO((AbstractResolvableFuture.Waiter)localObject3);
              localObject6 = new java/lang/InterruptedException;
              ((InterruptedException)localObject6).<init>();
              throw ((Throwable)localObject6);
            }
            localObject2 = localAbstractResolvableFuture.o00Ooo0;
            localObject4 = AbstractResolvableFuture.Waiter.OooO0OO;
          } while (localObject2 != localObject4);
        }
        localObject6 = localAbstractResolvableFuture.o00OoOoo;
        return localAbstractResolvableFuture.OooO0oo(localObject6);
      }
      for (;;)
      {
        bool1 = l2 < l3;
        if (!bool1) {
          break label445;
        }
        localObject5 = localAbstractResolvableFuture.o00OoOoo;
        if (localObject5 != null) {
          bool6 = bool2;
        } else {
          bool6 = false;
        }
        bool1 = localObject5 instanceof AbstractResolvableFuture.SetFuture ^ bool2;
        bool6 &= bool1;
        if (bool6) {
          return localAbstractResolvableFuture.OooO0oo(localObject5);
        }
        bool5 = Thread.interrupted();
        if (bool5) {
          break;
        }
        l2 = System.nanoTime();
        l2 = l4 - l2;
      }
      localObject6 = new java/lang/InterruptedException;
      ((InterruptedException)localObject6).<init>();
      throw ((Throwable)localObject6);
      label445:
      localObject2 = toString();
      Object localObject4 = paramTimeUnit.toString();
      Object localObject7 = Locale.ROOT;
      localObject4 = ((String)localObject4).toLowerCase((Locale)localObject7);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      Object localObject3 = "Waited ";
      localStringBuilder.append((String)localObject3);
      localStringBuilder.append(l1);
      localObject6 = " ";
      localStringBuilder.append((String)localObject6);
      String str = paramTimeUnit.toString().toLowerCase((Locale)localObject7);
      localStringBuilder.append(str);
      str = localStringBuilder.toString();
      long l4 = l2 + l5;
      boolean bool7 = l4 < l3;
      if (bool7)
      {
        localObject7 = new java/lang/StringBuilder;
        ((StringBuilder)localObject7).<init>();
        ((StringBuilder)localObject7).append(str);
        ((StringBuilder)localObject7).append(" (plus ");
        str = ((StringBuilder)localObject7).toString();
        l2 = -l2;
        localObject7 = TimeUnit.NANOSECONDS;
        l4 = ((TimeUnit)localObject1).convert(l2, (TimeUnit)localObject7);
        long l6 = ((TimeUnit)localObject1).toNanos(l4);
        l2 -= l6;
        boolean bool8 = l4 < l3;
        if (bool8)
        {
          bool3 = l2 < l5;
          if (!bool3)
          {
            i = 0;
            break label668;
          }
        }
        int i = bool2;
        label668:
        if (bool8)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append(str);
          ((StringBuilder)localObject1).append(l4);
          ((StringBuilder)localObject1).append((String)localObject6);
          ((StringBuilder)localObject1).append((String)localObject4);
          str = ((StringBuilder)localObject1).toString();
          if (i != 0)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            ((StringBuilder)localObject1).append(str);
            ((StringBuilder)localObject1).append(",");
            str = ((StringBuilder)localObject1).toString();
          }
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append(str);
          ((StringBuilder)localObject1).append((String)localObject6);
          str = ((StringBuilder)localObject1).toString();
        }
        if (i != 0)
        {
          localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>();
          ((StringBuilder)localObject6).append(str);
          ((StringBuilder)localObject6).append(l2);
          ((StringBuilder)localObject6).append(" nanoseconds ");
          str = ((StringBuilder)localObject6).toString();
        }
        localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        ((StringBuilder)localObject6).append(str);
        ((StringBuilder)localObject6).append("delay)");
        str = ((StringBuilder)localObject6).toString();
      }
      boolean bool9 = isDone();
      if (bool9)
      {
        localObject6 = new java/util/concurrent/TimeoutException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append(str);
        ((StringBuilder)localObject1).append(" but future completed as timeout expired");
        str = ((StringBuilder)localObject1).toString();
        ((TimeoutException)localObject6).<init>(str);
        throw ((Throwable)localObject6);
      }
      localObject6 = new java/util/concurrent/TimeoutException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append(str);
      ((StringBuilder)localObject1).append(" for ");
      ((StringBuilder)localObject1).append((String)localObject2);
      str = ((StringBuilder)localObject1).toString();
      ((TimeoutException)localObject6).<init>(str);
      throw ((Throwable)localObject6);
    }
    Object localObject6 = new java/lang/InterruptedException;
    ((InterruptedException)localObject6).<init>();
    throw ((Throwable)localObject6);
  }
  
  public final boolean isCancelled()
  {
    return this.o00OoOoo instanceof AbstractResolvableFuture.Cancellation;
  }
  
  public final boolean isDone()
  {
    Object localObject = this.o00OoOoo;
    int i = 1;
    int j;
    if (localObject != null) {
      j = i;
    } else {
      j = 0;
    }
    return (localObject instanceof AbstractResolvableFuture.SetFuture ^ i) & j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = super.toString();
    localStringBuilder.append(str1);
    str1 = "[status=";
    localStringBuilder.append(str1);
    boolean bool1 = isCancelled();
    String str2 = "]";
    if (bool1) {}
    Object localObject1;
    for (str1 = "CANCELLED";; localObject1 = "PENDING")
    {
      localStringBuilder.append(str1);
      break;
      bool1 = isDone();
      if (bool1) {}
      do
      {
        OooO00o(localStringBuilder);
        break;
        Object localObject2;
        try
        {
          str1 = OooOO0o();
        }
        catch (RuntimeException localRuntimeException)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          String str3 = "Exception thrown from implementation: ";
          ((StringBuilder)localObject2).append(str3);
          localObject1 = localRuntimeException.getClass();
          ((StringBuilder)localObject2).append(localObject1);
          localObject1 = ((StringBuilder)localObject2).toString();
        }
        if (localObject1 != null)
        {
          boolean bool2 = ((String)localObject1).isEmpty();
          if (!bool2)
          {
            localObject2 = "PENDING, info=[";
            localStringBuilder.append((String)localObject2);
            localStringBuilder.append((String)localObject1);
            localStringBuilder.append(str2);
            break;
          }
        }
        bool1 = isDone();
      } while (bool1);
    }
    localStringBuilder.append(str2);
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.concurrent.futures.AbstractResolvableFuture
 * JD-Core Version:    0.7.0.1
 */
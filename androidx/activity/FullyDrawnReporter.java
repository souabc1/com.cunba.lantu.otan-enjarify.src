package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class FullyDrawnReporter
{
  public final Executor OooO00o;
  public final Function0 OooO0O0;
  public final Object OooO0OO;
  public int OooO0Oo;
  public boolean OooO0o;
  public boolean OooO0o0;
  public final List OooO0oO;
  public final Runnable OooO0oo;
  
  public FullyDrawnReporter(Executor paramExecutor, Function0 paramFunction0)
  {
    this.OooO00o = paramExecutor;
    this.OooO0O0 = paramFunction0;
    paramExecutor = new java/lang/Object;
    paramExecutor.<init>();
    this.OooO0OO = paramExecutor;
    paramExecutor = new java/util/ArrayList;
    paramExecutor.<init>();
    this.OooO0oO = paramExecutor;
    paramExecutor = new androidx/activity/OooOOO0;
    paramExecutor.<init>(this);
    this.OooO0oo = paramExecutor;
  }
  
  public static final void OooO0o(FullyDrawnReporter paramFullyDrawnReporter)
  {
    Intrinsics.OooO0o(paramFullyDrawnReporter, "this$0");
    Object localObject = paramFullyDrawnReporter.OooO0OO;
    int i = 0;
    Function0 localFunction0 = null;
    try
    {
      paramFullyDrawnReporter.OooO0o0 = false;
      i = paramFullyDrawnReporter.OooO0Oo;
      if (i == 0)
      {
        boolean bool = paramFullyDrawnReporter.OooO0o;
        if (!bool)
        {
          localFunction0 = paramFullyDrawnReporter.OooO0O0;
          localFunction0.OooO00o();
          paramFullyDrawnReporter.OooO0OO();
        }
      }
      paramFullyDrawnReporter = Unit.OooO00o;
      return;
    }
    finally {}
  }
  
  public final void OooO0O0()
  {
    synchronized (this.OooO0OO)
    {
      boolean bool = this.OooO0o;
      if (!bool)
      {
        int i = this.OooO0Oo + 1;
        this.OooO0Oo = i;
      }
      Unit localUnit = Unit.OooO00o;
      return;
    }
  }
  
  public final void OooO0OO()
  {
    Object localObject1 = this.OooO0OO;
    boolean bool1 = true;
    try
    {
      this.OooO0o = bool1;
      Object localObject2 = this.OooO0oO;
      localObject2 = ((Iterable)localObject2).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject2).hasNext();
        if (!bool2) {
          break;
        }
        Object localObject4 = ((Iterator)localObject2).next();
        localObject4 = (Function0)localObject4;
        ((Function0)localObject4).OooO00o();
      }
      localObject2 = this.OooO0oO;
      ((List)localObject2).clear();
      localObject2 = Unit.OooO00o;
      return;
    }
    finally {}
  }
  
  public final void OooO0Oo()
  {
    boolean bool = this.OooO0o0;
    if (!bool)
    {
      int i = this.OooO0Oo;
      if (i == 0)
      {
        i = 1;
        this.OooO0o0 = i;
        Executor localExecutor = this.OooO00o;
        Runnable localRunnable = this.OooO0oo;
        localExecutor.execute(localRunnable);
      }
    }
  }
  
  public final void OooO0o0()
  {
    synchronized (this.OooO0OO)
    {
      boolean bool = this.OooO0o;
      if (!bool)
      {
        int i = this.OooO0Oo;
        int j;
        IllegalStateException localIllegalStateException;
        if (i > 0)
        {
          j = 1;
        }
        else
        {
          j = 0;
          localIllegalStateException = null;
        }
        if (j != 0)
        {
          i += -1;
          this.OooO0Oo = i;
          OooO0Oo();
        }
        else
        {
          localObject2 = "removeReporter() called when all reporters have already been removed.";
          localIllegalStateException = new java/lang/IllegalStateException;
          localObject2 = localObject2.toString();
          localIllegalStateException.<init>((String)localObject2);
          throw localIllegalStateException;
        }
      }
      Object localObject2 = Unit.OooO00o;
      return;
    }
  }
  
  public final boolean isFullyDrawnReported()
  {
    synchronized (this.OooO0OO)
    {
      boolean bool = this.OooO0o;
      return bool;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.FullyDrawnReporter
 * JD-Core Version:    0.7.0.1
 */
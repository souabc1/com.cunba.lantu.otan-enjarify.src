package androidx.lifecycle;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public abstract class ComputableLiveData
{
  public final Executor OooO00o;
  public final LiveData OooO0O0;
  public final LiveData OooO0OO;
  public final AtomicBoolean OooO0Oo;
  public final Runnable OooO0o;
  public final AtomicBoolean OooO0o0;
  public final Runnable OooO0oO;
  
  public ComputableLiveData()
  {
    this(null, 1, null);
  }
  
  public ComputableLiveData(Executor paramExecutor)
  {
    this.OooO00o = paramExecutor;
    paramExecutor = new androidx/lifecycle/ComputableLiveData$_liveData$1;
    paramExecutor.<init>(this);
    this.OooO0O0 = paramExecutor;
    this.OooO0OO = paramExecutor;
    paramExecutor = new java/util/concurrent/atomic/AtomicBoolean;
    paramExecutor.<init>(true);
    this.OooO0Oo = paramExecutor;
    paramExecutor = new java/util/concurrent/atomic/AtomicBoolean;
    paramExecutor.<init>(false);
    this.OooO0o0 = paramExecutor;
    paramExecutor = new androidx/lifecycle/OooO00o;
    paramExecutor.<init>(this);
    this.OooO0o = paramExecutor;
    paramExecutor = new androidx/lifecycle/OooO0O0;
    paramExecutor.<init>(this);
    this.OooO0oO = paramExecutor;
  }
  
  public static final void OooO0Oo(ComputableLiveData paramComputableLiveData)
  {
    Intrinsics.OooO0o(paramComputableLiveData, "this$0");
    Object localObject = paramComputableLiveData.getLiveData();
    boolean bool1 = ((LiveData)localObject).OooO0o();
    AtomicBoolean localAtomicBoolean = paramComputableLiveData.OooO0Oo;
    boolean bool2 = true;
    boolean bool3 = localAtomicBoolean.compareAndSet(false, bool2);
    if ((bool3) && (bool1))
    {
      localObject = paramComputableLiveData.OooO00o;
      paramComputableLiveData = paramComputableLiveData.OooO0o;
      ((Executor)localObject).execute(paramComputableLiveData);
    }
  }
  
  public static final void OooO0o0(ComputableLiveData paramComputableLiveData)
  {
    Object localObject1 = "this$0";
    Intrinsics.OooO0o(paramComputableLiveData, (String)localObject1);
    boolean bool2;
    do
    {
      localObject1 = paramComputableLiveData.OooO0o0;
      int i = 0;
      boolean bool1 = true;
      float f = 1.4E-45F;
      bool2 = ((AtomicBoolean)localObject1).compareAndSet(false, bool1);
      if (bool2)
      {
        bool2 = false;
        localObject1 = null;
        int j = 0;
        try
        {
          for (;;)
          {
            AtomicBoolean localAtomicBoolean2 = paramComputableLiveData.OooO0Oo;
            boolean bool3 = localAtomicBoolean2.compareAndSet(bool1, false);
            if (!bool3) {
              break;
            }
            localObject1 = paramComputableLiveData.OooO0OO();
            j = bool1;
          }
          if (j != 0)
          {
            LiveData localLiveData = paramComputableLiveData.getLiveData();
            localLiveData.OooOO0O(localObject1);
          }
          localObject1 = paramComputableLiveData.OooO0o0;
          ((AtomicBoolean)localObject1).set(false);
          i = j;
        }
        finally
        {
          paramComputableLiveData.OooO0o0.set(false);
        }
      }
      if (i == 0) {
        break;
      }
      AtomicBoolean localAtomicBoolean1 = paramComputableLiveData.OooO0Oo;
      bool2 = localAtomicBoolean1.get();
    } while (bool2);
  }
  
  public abstract Object OooO0OO();
  
  public final AtomicBoolean getComputing$lifecycle_livedata_release()
  {
    return this.OooO0o0;
  }
  
  public final Executor getExecutor$lifecycle_livedata_release()
  {
    return this.OooO00o;
  }
  
  public final AtomicBoolean getInvalid$lifecycle_livedata_release()
  {
    return this.OooO0Oo;
  }
  
  public LiveData getLiveData()
  {
    return this.OooO0OO;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.ComputableLiveData
 * JD-Core Version:    0.7.0.1
 */
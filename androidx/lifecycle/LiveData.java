package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.arch.core.internal.SafeIterableMap.IteratorWithAdditions;
import java.util.Iterator;
import java.util.Map.Entry;

public abstract class LiveData
{
  public static final Object OooOO0O;
  public boolean OooO;
  public final Object OooO00o;
  public SafeIterableMap OooO0O0;
  public int OooO0OO;
  public boolean OooO0Oo;
  public volatile Object OooO0o;
  public volatile Object OooO0o0;
  public int OooO0oO;
  public boolean OooO0oo;
  public final Runnable OooOO0;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooOO0O = localObject;
  }
  
  public LiveData()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.OooO00o = localObject;
    localObject = new androidx/arch/core/internal/SafeIterableMap;
    ((SafeIterableMap)localObject).<init>();
    this.OooO0O0 = ((SafeIterableMap)localObject);
    this.OooO0OO = 0;
    localObject = OooOO0O;
    this.OooO0o = localObject;
    LiveData.1 local1 = new androidx/lifecycle/LiveData$1;
    local1.<init>(this);
    this.OooOO0 = local1;
    this.OooO0o0 = localObject;
    this.OooO0oO = -1;
  }
  
  public static void OooO0O0(String paramString)
  {
    Object localObject = ArchTaskExecutor.getInstance();
    boolean bool = ((ArchTaskExecutor)localObject).isMainThread();
    if (bool) {
      return;
    }
    localObject = new java/lang/IllegalStateException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Cannot invoke ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" on a background thread");
    paramString = localStringBuilder.toString();
    ((IllegalStateException)localObject).<init>(paramString);
    throw ((Throwable)localObject);
  }
  
  public void OooO() {}
  
  public void OooO0OO(int paramInt)
  {
    int i = this.OooO0OO;
    paramInt += i;
    this.OooO0OO = paramInt;
    paramInt = this.OooO0Oo;
    if (paramInt != 0) {
      return;
    }
    paramInt = 1;
    this.OooO0Oo = paramInt;
    try
    {
      for (;;)
      {
        int j = this.OooO0OO;
        if (i == j) {
          break;
        }
        int k;
        if ((i == 0) && (j > 0)) {
          k = paramInt;
        } else {
          k = 0;
        }
        if ((i > 0) && (j == 0)) {
          i = paramInt;
        } else {
          i = 0;
        }
        if (k != 0) {
          OooO();
        } else if (i != 0) {
          OooOO0();
        }
        i = j;
      }
      return;
    }
    finally
    {
      this.OooO0Oo = false;
    }
  }
  
  public final void OooO0Oo(LiveData.ObserverWrapper paramObserverWrapper)
  {
    boolean bool = paramObserverWrapper.o00Ooo00;
    if (!bool) {
      return;
    }
    bool = paramObserverWrapper.OooOO0O();
    if (!bool)
    {
      paramObserverWrapper.OooO0oo(false);
      return;
    }
    int i = paramObserverWrapper.o00Ooo0;
    int j = this.OooO0oO;
    if (i >= j) {
      return;
    }
    paramObserverWrapper.o00Ooo0 = j;
    paramObserverWrapper = paramObserverWrapper.o00OoOoo;
    Object localObject = this.OooO0o0;
    paramObserverWrapper.OooO00o(localObject);
  }
  
  public boolean OooO0o()
  {
    int i = this.OooO0OO;
    if (i > 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public void OooO0o0(LiveData.ObserverWrapper paramObserverWrapper)
  {
    boolean bool1 = this.OooO0oo;
    boolean bool2 = true;
    if (bool1)
    {
      this.OooO = bool2;
      return;
    }
    this.OooO0oo = bool2;
    do
    {
      bool1 = false;
      this.OooO = false;
      if (paramObserverWrapper != null)
      {
        OooO0Oo(paramObserverWrapper);
        paramObserverWrapper = null;
      }
      else
      {
        SafeIterableMap.IteratorWithAdditions localIteratorWithAdditions = this.OooO0O0.OooO0OO();
        boolean bool3;
        do
        {
          bool3 = localIteratorWithAdditions.hasNext();
          if (!bool3) {
            break;
          }
          LiveData.ObserverWrapper localObserverWrapper = (LiveData.ObserverWrapper)((Map.Entry)localIteratorWithAdditions.next()).getValue();
          OooO0Oo(localObserverWrapper);
          bool3 = this.OooO;
        } while (!bool3);
      }
      bool2 = this.OooO;
    } while (bool2);
    this.OooO0oo = false;
  }
  
  public void OooO0oO(LifecycleOwner paramLifecycleOwner, Observer paramObserver)
  {
    OooO0O0("observe");
    Object localObject1 = paramLifecycleOwner.getLifecycle().getCurrentState();
    Object localObject2 = Lifecycle.State.o00OoOoo;
    if (localObject1 == localObject2) {
      return;
    }
    localObject1 = new androidx/lifecycle/LiveData$LifecycleBoundObserver;
    ((LiveData.LifecycleBoundObserver)localObject1).<init>(this, paramLifecycleOwner, paramObserver);
    localObject2 = this.OooO0O0;
    paramObserver = (LiveData.ObserverWrapper)((SafeIterableMap)localObject2).OooO0o(paramObserver, localObject1);
    if (paramObserver != null)
    {
      boolean bool = paramObserver.OooOO0(paramLifecycleOwner);
      if (!bool)
      {
        paramLifecycleOwner = new java/lang/IllegalArgumentException;
        paramLifecycleOwner.<init>("Cannot add the same observer with different lifecycles");
        throw paramLifecycleOwner;
      }
    }
    if (paramObserver != null) {
      return;
    }
    paramLifecycleOwner.getLifecycle().OooO00o((LifecycleObserver)localObject1);
  }
  
  public void OooO0oo(Observer paramObserver)
  {
    OooO0O0("observeForever");
    LiveData.AlwaysActiveObserver localAlwaysActiveObserver = new androidx/lifecycle/LiveData$AlwaysActiveObserver;
    localAlwaysActiveObserver.<init>(this, paramObserver);
    SafeIterableMap localSafeIterableMap = this.OooO0O0;
    paramObserver = (LiveData.ObserverWrapper)localSafeIterableMap.OooO0o(paramObserver, localAlwaysActiveObserver);
    boolean bool = paramObserver instanceof LiveData.LifecycleBoundObserver;
    if (!bool)
    {
      if (paramObserver != null) {
        return;
      }
      localAlwaysActiveObserver.OooO0oo(true);
      return;
    }
    paramObserver = new java/lang/IllegalArgumentException;
    paramObserver.<init>("Cannot add the same observer with different lifecycles");
    throw paramObserver;
  }
  
  public void OooOO0() {}
  
  public void OooOO0O(Object paramObject)
  {
    synchronized (this.OooO00o)
    {
      Object localObject2 = this.OooO0o;
      Object localObject3 = OooOO0O;
      int i;
      if (localObject2 == localObject3)
      {
        i = 1;
      }
      else
      {
        i = 0;
        localObject2 = null;
      }
      this.OooO0o = paramObject;
      if (i == 0) {
        return;
      }
      paramObject = ArchTaskExecutor.getInstance();
      ??? = this.OooOO0;
      paramObject.OooO0O0((Runnable)???);
      return;
    }
  }
  
  public void OooOO0o(Observer paramObserver)
  {
    OooO0O0("removeObserver");
    SafeIterableMap localSafeIterableMap = this.OooO0O0;
    paramObserver = (LiveData.ObserverWrapper)localSafeIterableMap.OooO0oO(paramObserver);
    if (paramObserver == null) {
      return;
    }
    paramObserver.OooO();
    paramObserver.OooO0oo(false);
  }
  
  public Object getValue()
  {
    Object localObject1 = this.OooO0o0;
    Object localObject2 = OooOO0O;
    if (localObject1 != localObject2) {
      return localObject1;
    }
    return null;
  }
  
  public int getVersion()
  {
    return this.OooO0oO;
  }
  
  public boolean isInitialized()
  {
    Object localObject1 = this.OooO0o0;
    Object localObject2 = OooOO0O;
    boolean bool;
    if (localObject1 != localObject2)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localObject1 = null;
    }
    return bool;
  }
  
  public void setValue(Object paramObject)
  {
    OooO0O0("setValue");
    int i = this.OooO0oO + 1;
    this.OooO0oO = i;
    this.OooO0o0 = paramObject;
    OooO0o0(null);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.LiveData
 * JD-Core Version:    0.7.0.1
 */
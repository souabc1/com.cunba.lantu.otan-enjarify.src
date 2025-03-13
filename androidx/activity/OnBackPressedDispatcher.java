package androidx.activity;

import android.os.Build.VERSION;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleOwner;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class OnBackPressedDispatcher
{
  public final Runnable OooO00o;
  public final ArrayDeque OooO0O0;
  public Function0 OooO0OO;
  public OnBackInvokedCallback OooO0Oo;
  public boolean OooO0o;
  public OnBackInvokedDispatcher OooO0o0;
  
  public OnBackPressedDispatcher()
  {
    this(null, 1, null);
  }
  
  public OnBackPressedDispatcher(Runnable paramRunnable)
  {
    this.OooO00o = paramRunnable;
    paramRunnable = new kotlin/collections/ArrayDeque;
    paramRunnable.<init>();
    this.OooO0O0 = paramRunnable;
    int i = Build.VERSION.SDK_INT;
    int j = 33;
    if (i >= j)
    {
      paramRunnable = new androidx/activity/OnBackPressedDispatcher$1;
      paramRunnable.<init>(this);
      this.OooO0OO = paramRunnable;
      paramRunnable = OnBackPressedDispatcher.Api33Impl.OooO00o;
      OnBackPressedDispatcher.2 local2 = new androidx/activity/OnBackPressedDispatcher$2;
      local2.<init>(this);
      paramRunnable = paramRunnable.OooO0O0(local2);
      this.OooO0Oo = paramRunnable;
    }
  }
  
  public final void OooO0O0(LifecycleOwner paramLifecycleOwner, OnBackPressedCallback paramOnBackPressedCallback)
  {
    Intrinsics.OooO0o(paramLifecycleOwner, "owner");
    Intrinsics.OooO0o(paramOnBackPressedCallback, "onBackPressedCallback");
    paramLifecycleOwner = paramLifecycleOwner.getLifecycle();
    Object localObject = paramLifecycleOwner.getCurrentState();
    Lifecycle.State localState = Lifecycle.State.o00OoOoo;
    if (localObject == localState) {
      return;
    }
    localObject = new androidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
    ((OnBackPressedDispatcher.LifecycleOnBackPressedCancellable)localObject).<init>(this, paramLifecycleOwner, paramOnBackPressedCallback);
    paramOnBackPressedCallback.OooO0Oo((Cancellable)localObject);
    int i = Build.VERSION.SDK_INT;
    int j = 33;
    if (i >= j)
    {
      OooO0o();
      paramLifecycleOwner = this.OooO0OO;
      paramOnBackPressedCallback.setEnabledChangedCallback$activity_release(paramLifecycleOwner);
    }
  }
  
  public final Cancellable OooO0OO(OnBackPressedCallback paramOnBackPressedCallback)
  {
    Intrinsics.OooO0o(paramOnBackPressedCallback, "onBackPressedCallback");
    this.OooO0O0.add(paramOnBackPressedCallback);
    OnBackPressedDispatcher.OnBackPressedCancellable localOnBackPressedCancellable = new androidx/activity/OnBackPressedDispatcher$OnBackPressedCancellable;
    localOnBackPressedCancellable.<init>(this, paramOnBackPressedCallback);
    paramOnBackPressedCallback.OooO0Oo(localOnBackPressedCancellable);
    int i = Build.VERSION.SDK_INT;
    int j = 33;
    if (i >= j)
    {
      OooO0o();
      Function0 localFunction0 = this.OooO0OO;
      paramOnBackPressedCallback.setEnabledChangedCallback$activity_release(localFunction0);
    }
    return localOnBackPressedCancellable;
  }
  
  public final boolean OooO0Oo()
  {
    Object localObject = this.OooO0O0;
    boolean bool1 = localObject instanceof Collection;
    boolean bool2 = false;
    if (bool1)
    {
      bool1 = ((Collection)localObject).isEmpty();
      if (bool1) {}
    }
    else
    {
      localObject = ((Iterable)localObject).iterator();
      do
      {
        bool1 = ((Iterator)localObject).hasNext();
        if (!bool1) {
          break;
        }
        OnBackPressedCallback localOnBackPressedCallback = (OnBackPressedCallback)((Iterator)localObject).next();
        bool1 = localOnBackPressedCallback.isEnabled();
      } while (!bool1);
      bool2 = true;
    }
    return bool2;
  }
  
  public final void OooO0o()
  {
    boolean bool1 = OooO0Oo();
    OnBackInvokedDispatcher localOnBackInvokedDispatcher = this.OooO0o0;
    OnBackInvokedCallback localOnBackInvokedCallback = this.OooO0Oo;
    if ((localOnBackInvokedDispatcher != null) && (localOnBackInvokedCallback != null))
    {
      OnBackPressedDispatcher.Api33Impl localApi33Impl;
      if (bool1)
      {
        boolean bool2 = this.OooO0o;
        if (!bool2)
        {
          localApi33Impl = OnBackPressedDispatcher.Api33Impl.OooO00o;
          localApi33Impl.OooO0Oo(localOnBackInvokedDispatcher, 0, localOnBackInvokedCallback);
          bool1 = true;
          this.OooO0o = bool1;
          return;
        }
      }
      if (!bool1)
      {
        bool1 = this.OooO0o;
        if (bool1)
        {
          localApi33Impl = OnBackPressedDispatcher.Api33Impl.OooO00o;
          localApi33Impl.OooO0o0(localOnBackInvokedDispatcher, localOnBackInvokedCallback);
          this.OooO0o = false;
        }
      }
    }
  }
  
  public final void OooO0o0()
  {
    Object localObject1 = this.OooO0O0;
    int i = ((List)localObject1).size();
    localObject1 = ((List)localObject1).listIterator(i);
    boolean bool2;
    do
    {
      bool1 = ((ListIterator)localObject1).hasPrevious();
      if (!bool1) {
        break;
      }
      localObject2 = ((ListIterator)localObject1).previous();
      Object localObject3 = localObject2;
      localObject3 = (OnBackPressedCallback)localObject2;
      bool2 = ((OnBackPressedCallback)localObject3).isEnabled();
    } while (!bool2);
    break label66;
    boolean bool1 = false;
    Object localObject2 = null;
    label66:
    localObject2 = (OnBackPressedCallback)localObject2;
    if (localObject2 != null)
    {
      ((OnBackPressedCallback)localObject2).OooO0o0();
      return;
    }
    localObject1 = this.OooO00o;
    if (localObject1 != null) {
      ((Runnable)localObject1).run();
    }
  }
  
  public final void setOnBackInvokedDispatcher(OnBackInvokedDispatcher paramOnBackInvokedDispatcher)
  {
    Intrinsics.OooO0o(paramOnBackInvokedDispatcher, "invoker");
    this.OooO0o0 = paramOnBackInvokedDispatcher;
    OooO0o();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.OnBackPressedDispatcher
 * JD-Core Version:    0.7.0.1
 */
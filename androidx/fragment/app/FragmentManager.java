package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.IntentSenderRequest.Builder;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.fragment.R.id;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.FragmentStrictMode.Policy;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class FragmentManager
  implements FragmentResultOwner
{
  public static boolean OoooO0O = false;
  public final AtomicInteger OooO;
  public final ArrayList OooO00o;
  public boolean OooO0O0;
  public final FragmentStore OooO0OO;
  public ArrayList OooO0Oo;
  public final FragmentLayoutInflaterFactory OooO0o;
  public ArrayList OooO0o0;
  public OnBackPressedDispatcher OooO0oO;
  public final OnBackPressedCallback OooO0oo;
  public final Map OooOO0;
  public final Map OooOO0O;
  public final Map OooOO0o;
  public final FragmentLifecycleCallbacksDispatcher OooOOO;
  public ArrayList OooOOO0;
  public final CopyOnWriteArrayList OooOOOO;
  public final Consumer OooOOOo;
  public final Consumer OooOOo;
  public final Consumer OooOOo0;
  public final Consumer OooOOoo;
  public Fragment OooOo;
  public int OooOo0;
  public final MenuProvider OooOo00;
  public FragmentHostCallback OooOo0O;
  public FragmentContainer OooOo0o;
  public FragmentFactory OooOoO;
  public Fragment OooOoO0;
  public FragmentFactory OooOoOO;
  public SpecialEffectsControllerFactory OooOoo;
  public SpecialEffectsControllerFactory OooOoo0;
  public ActivityResultLauncher OooOooO;
  public ActivityResultLauncher OooOooo;
  public FragmentManagerViewModel Oooo;
  public boolean Oooo0;
  public ActivityResultLauncher Oooo000;
  public ArrayDeque Oooo00O;
  public boolean Oooo00o;
  public boolean Oooo0O0;
  public boolean Oooo0OO;
  public ArrayList Oooo0o;
  public boolean Oooo0o0;
  public ArrayList Oooo0oO;
  public ArrayList Oooo0oo;
  public Runnable OoooO0;
  public FragmentStrictMode.Policy OoooO00;
  
  public FragmentManager()
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooO00o = ((ArrayList)localObject);
    localObject = new androidx/fragment/app/FragmentStore;
    ((FragmentStore)localObject).<init>();
    this.OooO0OO = ((FragmentStore)localObject);
    localObject = new androidx/fragment/app/FragmentLayoutInflaterFactory;
    ((FragmentLayoutInflaterFactory)localObject).<init>(this);
    this.OooO0o = ((FragmentLayoutInflaterFactory)localObject);
    localObject = new androidx/fragment/app/FragmentManager$1;
    ((FragmentManager.1)localObject).<init>(this, false);
    this.OooO0oo = ((OnBackPressedCallback)localObject);
    localObject = new java/util/concurrent/atomic/AtomicInteger;
    ((AtomicInteger)localObject).<init>();
    this.OooO = ((AtomicInteger)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    localObject = Collections.synchronizedMap((Map)localObject);
    this.OooOO0 = ((Map)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    localObject = Collections.synchronizedMap((Map)localObject);
    this.OooOO0O = ((Map)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    localObject = Collections.synchronizedMap((Map)localObject);
    this.OooOO0o = ((Map)localObject);
    localObject = new androidx/fragment/app/FragmentLifecycleCallbacksDispatcher;
    ((FragmentLifecycleCallbacksDispatcher)localObject).<init>(this);
    this.OooOOO = ((FragmentLifecycleCallbacksDispatcher)localObject);
    localObject = new java/util/concurrent/CopyOnWriteArrayList;
    ((CopyOnWriteArrayList)localObject).<init>();
    this.OooOOOO = ((CopyOnWriteArrayList)localObject);
    localObject = new androidx/fragment/app/Oooo0;
    ((Oooo0)localObject).<init>(this);
    this.OooOOOo = ((Consumer)localObject);
    localObject = new androidx/fragment/app/o000oOoO;
    ((o000oOoO)localObject).<init>(this);
    this.OooOOo0 = ((Consumer)localObject);
    localObject = new androidx/fragment/app/o0OoOo0;
    ((o0OoOo0)localObject).<init>(this);
    this.OooOOo = ((Consumer)localObject);
    localObject = new androidx/fragment/app/o00O0O;
    ((o00O0O)localObject).<init>(this);
    this.OooOOoo = ((Consumer)localObject);
    localObject = new androidx/fragment/app/FragmentManager$2;
    ((FragmentManager.2)localObject).<init>(this);
    this.OooOo00 = ((MenuProvider)localObject);
    this.OooOo0 = -1;
    this.OooOoO = null;
    FragmentManager.3 local3 = new androidx/fragment/app/FragmentManager$3;
    local3.<init>(this);
    this.OooOoOO = local3;
    this.OooOoo0 = null;
    localObject = new androidx/fragment/app/FragmentManager$4;
    ((FragmentManager.4)localObject).<init>(this);
    this.OooOoo = ((SpecialEffectsControllerFactory)localObject);
    localObject = new java/util/ArrayDeque;
    ((ArrayDeque)localObject).<init>();
    this.Oooo00O = ((ArrayDeque)localObject);
    localObject = new androidx/fragment/app/FragmentManager$5;
    ((FragmentManager.5)localObject).<init>(this);
    this.OoooO0 = ((Runnable)localObject);
  }
  
  public static void Oooooo0(ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt1, int paramInt2)
  {
    while (paramInt1 < paramInt2)
    {
      BackStackRecord localBackStackRecord = (BackStackRecord)paramArrayList1.get(paramInt1);
      Boolean localBoolean = (Boolean)paramArrayList2.get(paramInt1);
      boolean bool = localBoolean.booleanValue();
      int i;
      if (bool)
      {
        i = -1;
        localBackStackRecord.OooOoOO(i);
        localBackStackRecord.Oooo00O();
      }
      else
      {
        i = 1;
        localBackStackRecord.OooOoOO(i);
        localBackStackRecord.Oooo000();
      }
      paramInt1 += 1;
    }
  }
  
  public static boolean isLoggingEnabled(int paramInt)
  {
    boolean bool = OoooO0O;
    if (!bool)
    {
      String str = "FragmentManager";
      paramInt = Log.isLoggable(str, paramInt);
      if (paramInt == 0) {
        return 0;
      }
    }
    paramInt = 1;
    return paramInt;
  }
  
  private boolean isParentAdded()
  {
    Object localObject = this.OooOo;
    boolean bool1 = true;
    if (localObject == null) {
      return bool1;
    }
    boolean bool2 = ((Fragment)localObject).isAdded();
    if (bool2)
    {
      localObject = this.OooOo.getParentFragmentManager();
      bool2 = ((FragmentManager)localObject).isParentAdded();
      if (bool2) {}
    }
    else
    {
      bool1 = false;
    }
    return bool1;
  }
  
  public static int o0000o(int paramInt)
  {
    int i = 8194;
    int j = 4097;
    if (paramInt != j)
    {
      int k;
      if (paramInt != i)
      {
        i = 4100;
        j = 8197;
        if (paramInt == j) {
          return i;
        }
        k = 4099;
        if (paramInt == k) {
          break label55;
        }
        if (paramInt != i) {
          return 0;
        }
      }
      return j;
      label55:
      i = k;
    }
    return i;
  }
  
  public static FragmentManager o00Ooo(View paramView)
  {
    Object localObject1 = o00o0O(paramView);
    boolean bool;
    if (localObject1 != null)
    {
      bool = ((Fragment)localObject1).isAdded();
      if (bool)
      {
        paramView = ((Fragment)localObject1).getChildFragmentManager();
      }
      else
      {
        localObject2 = new java/lang/IllegalStateException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("The Fragment ");
        localStringBuilder.append(localObject1);
        localStringBuilder.append(" that owns View ");
        localStringBuilder.append(paramView);
        localStringBuilder.append(" has already been destroyed. Nested fragments should always use the child FragmentManager.");
        paramView = localStringBuilder.toString();
        ((IllegalStateException)localObject2).<init>(paramView);
        throw ((Throwable)localObject2);
      }
    }
    else
    {
      for (localObject1 = paramView.getContext();; localObject1 = ((ContextWrapper)localObject1).getBaseContext())
      {
        bool = localObject1 instanceof ContextWrapper;
        if (!bool) {
          break;
        }
        bool = localObject1 instanceof FragmentActivity;
        if (bool)
        {
          localObject1 = (FragmentActivity)localObject1;
          break label138;
        }
      }
      localObject1 = null;
      label138:
      if (localObject1 == null) {
        break label149;
      }
      paramView = ((FragmentActivity)localObject1).getSupportFragmentManager();
    }
    return paramView;
    label149:
    localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("View ");
    ((StringBuilder)localObject2).append(paramView);
    ((StringBuilder)localObject2).append(" is not within a subclass of FragmentActivity.");
    paramView = ((StringBuilder)localObject2).toString();
    ((IllegalStateException)localObject1).<init>(paramView);
    throw ((Throwable)localObject1);
  }
  
  public static Fragment o00o0O(View paramView)
  {
    while (paramView != null)
    {
      Fragment localFragment = o0ooOoO(paramView);
      if (localFragment != null) {
        return localFragment;
      }
      paramView = paramView.getParent();
      boolean bool = paramView instanceof View;
      if (bool) {
        paramView = (View)paramView;
      } else {
        paramView = null;
      }
    }
    return null;
  }
  
  public static Fragment o0ooOoO(View paramView)
  {
    int i = R.id.fragment_container_view_tag;
    paramView = paramView.getTag(i);
    boolean bool = paramView instanceof Fragment;
    if (bool) {
      return (Fragment)paramView;
    }
    return null;
  }
  
  private void setVisibleRemovingFragment(Fragment paramFragment)
  {
    Object localObject1 = o0ooOOo(paramFragment);
    if (localObject1 != null)
    {
      int i = paramFragment.getEnterAnim();
      int j = paramFragment.getExitAnim();
      i += j;
      j = paramFragment.getPopEnterAnim();
      i += j;
      j = paramFragment.getPopExitAnim();
      i += j;
      if (i > 0)
      {
        i = R.id.visible_removing_fragment_view_tag;
        Object localObject2 = ((View)localObject1).getTag(i);
        if (localObject2 == null)
        {
          i = R.id.visible_removing_fragment_view_tag;
          ((View)localObject1).setTag(i, paramFragment);
        }
        i = R.id.visible_removing_fragment_view_tag;
        localObject1 = (Fragment)((View)localObject1).getTag(i);
        boolean bool = paramFragment.getPopDirection();
        ((Fragment)localObject1).setPopDirection(bool);
      }
    }
  }
  
  public void OooO(BackStackRecord paramBackStackRecord)
  {
    ArrayList localArrayList = this.OooO0Oo;
    if (localArrayList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      this.OooO0Oo = localArrayList;
    }
    this.OooO0Oo.add(paramBackStackRecord);
  }
  
  public FragmentStateManager OooOO0(Fragment paramFragment)
  {
    Object localObject1 = paramFragment.mPreviousWho;
    if (localObject1 != null) {
      FragmentStrictMode.OooO0oo(paramFragment, (String)localObject1);
    }
    boolean bool1 = isLoggingEnabled(2);
    if (bool1)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "add: ";
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(paramFragment);
    }
    localObject1 = OooOoO(paramFragment);
    paramFragment.mFragmentManager = this;
    Object localObject2 = this.OooO0OO;
    ((FragmentStore)localObject2).OooOOO0((FragmentStateManager)localObject1);
    boolean bool2 = paramFragment.mDetached;
    if (!bool2)
    {
      this.OooO0OO.OooO00o(paramFragment);
      bool2 = false;
      localObject2 = null;
      paramFragment.mRemoving = false;
      View localView = paramFragment.mView;
      if (localView == null) {
        paramFragment.mHiddenChanged = false;
      }
      boolean bool3 = o0O0O00(paramFragment);
      if (bool3)
      {
        bool3 = true;
        this.Oooo00o = bool3;
      }
    }
    return localObject1;
  }
  
  public void OooOO0O(FragmentOnAttachListener paramFragmentOnAttachListener)
  {
    this.OooOOOO.add(paramFragmentOnAttachListener);
  }
  
  public void OooOO0o(FragmentManager.OnBackStackChangedListener paramOnBackStackChangedListener)
  {
    ArrayList localArrayList = this.OooOOO0;
    if (localArrayList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      this.OooOOO0 = localArrayList;
    }
    this.OooOOO0.add(paramOnBackStackChangedListener);
  }
  
  public int OooOOO()
  {
    return this.OooO.getAndIncrement();
  }
  
  public void OooOOO0(Fragment paramFragment)
  {
    this.Oooo.OooO0oO(paramFragment);
  }
  
  public void OooOOOO(FragmentHostCallback paramFragmentHostCallback, FragmentContainer paramFragmentContainer, Fragment paramFragment)
  {
    Object localObject1 = this.OooOo0O;
    if (localObject1 == null)
    {
      this.OooOo0O = paramFragmentHostCallback;
      this.OooOo0o = paramFragmentContainer;
      this.OooOo = paramFragment;
      if (paramFragment != null)
      {
        paramFragmentContainer = new androidx/fragment/app/FragmentManager$7;
        paramFragmentContainer.<init>(this, paramFragment);
      }
      for (;;)
      {
        OooOO0O(paramFragmentContainer);
        break;
        bool = paramFragmentHostCallback instanceof FragmentOnAttachListener;
        if (!bool) {
          break;
        }
        paramFragmentContainer = paramFragmentHostCallback;
        paramFragmentContainer = (FragmentOnAttachListener)paramFragmentHostCallback;
      }
      paramFragmentContainer = this.OooOo;
      if (paramFragmentContainer != null) {
        o000Oo0();
      }
      boolean bool = paramFragmentHostCallback instanceof OnBackPressedDispatcherOwner;
      Object localObject2;
      if (bool)
      {
        paramFragmentContainer = paramFragmentHostCallback;
        paramFragmentContainer = (OnBackPressedDispatcherOwner)paramFragmentHostCallback;
        localObject1 = paramFragmentContainer.getOnBackPressedDispatcher();
        this.OooO0oO = ((OnBackPressedDispatcher)localObject1);
        if (paramFragment != null) {
          paramFragmentContainer = paramFragment;
        }
        localObject2 = this.OooO0oo;
        ((OnBackPressedDispatcher)localObject1).OooO0O0(paramFragmentContainer, (OnBackPressedCallback)localObject2);
      }
      if (paramFragment != null) {
        paramFragmentHostCallback = paramFragment.mFragmentManager.o00oO0O(paramFragment);
      }
      for (;;)
      {
        this.Oooo = paramFragmentHostCallback;
        break;
        bool = paramFragmentHostCallback instanceof ViewModelStoreOwner;
        if (bool)
        {
          paramFragmentHostCallback = FragmentManagerViewModel.OooOOO0(((ViewModelStoreOwner)paramFragmentHostCallback).getViewModelStore());
        }
        else
        {
          paramFragmentHostCallback = new androidx/fragment/app/FragmentManagerViewModel;
          bool = false;
          paramFragmentContainer = null;
          paramFragmentHostCallback.<init>(false);
        }
      }
      paramFragmentHostCallback = this.Oooo;
      bool = isStateSaved();
      paramFragmentHostCallback.setIsStateSaved(bool);
      paramFragmentHostCallback = this.OooO0OO;
      paramFragmentContainer = this.Oooo;
      paramFragmentHostCallback.setNonConfig(paramFragmentContainer);
      paramFragmentHostCallback = this.OooOo0O;
      bool = paramFragmentHostCallback instanceof SavedStateRegistryOwner;
      if ((bool) && (paramFragment == null))
      {
        paramFragmentHostCallback = ((SavedStateRegistryOwner)paramFragmentHostCallback).getSavedStateRegistry();
        paramFragmentContainer = new androidx/fragment/app/o00Oo0;
        paramFragmentContainer.<init>(this);
        localObject1 = "android:support:fragments";
        paramFragmentHostCallback.OooO0oo((String)localObject1, paramFragmentContainer);
        paramFragmentHostCallback = paramFragmentHostCallback.OooO0O0((String)localObject1);
        if (paramFragmentHostCallback != null) {
          o0000o0o(paramFragmentHostCallback);
        }
      }
      paramFragmentHostCallback = this.OooOo0O;
      bool = paramFragmentHostCallback instanceof ActivityResultRegistryOwner;
      if (bool)
      {
        paramFragmentHostCallback = ((ActivityResultRegistryOwner)paramFragmentHostCallback).getActivityResultRegistry();
        if (paramFragment != null)
        {
          paramFragmentContainer = new java/lang/StringBuilder;
          paramFragmentContainer.<init>();
          localObject1 = paramFragment.mWho;
          paramFragmentContainer.append((String)localObject1);
          localObject1 = ":";
          paramFragmentContainer.append((String)localObject1);
          paramFragmentContainer = paramFragmentContainer.toString();
        }
        else
        {
          paramFragmentContainer = "";
        }
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("FragmentManager:");
        ((StringBuilder)localObject1).append(paramFragmentContainer);
        paramFragmentContainer = ((StringBuilder)localObject1).toString();
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append(paramFragmentContainer);
        ((StringBuilder)localObject1).append("StartActivityForResult");
        localObject1 = ((StringBuilder)localObject1).toString();
        localObject2 = new androidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;
        ((ActivityResultContracts.StartActivityForResult)localObject2).<init>();
        Object localObject3 = new androidx/fragment/app/FragmentManager$8;
        ((FragmentManager.8)localObject3).<init>(this);
        localObject1 = paramFragmentHostCallback.OooO((String)localObject1, (ActivityResultContract)localObject2, (ActivityResultCallback)localObject3);
        this.OooOooO = ((ActivityResultLauncher)localObject1);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append(paramFragmentContainer);
        ((StringBuilder)localObject1).append("StartIntentSenderForResult");
        localObject1 = ((StringBuilder)localObject1).toString();
        localObject2 = new androidx/fragment/app/FragmentManager$FragmentIntentSenderContract;
        ((FragmentManager.FragmentIntentSenderContract)localObject2).<init>();
        localObject3 = new androidx/fragment/app/FragmentManager$9;
        ((FragmentManager.9)localObject3).<init>(this);
        localObject1 = paramFragmentHostCallback.OooO((String)localObject1, (ActivityResultContract)localObject2, (ActivityResultCallback)localObject3);
        this.OooOooo = ((ActivityResultLauncher)localObject1);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append(paramFragmentContainer);
        ((StringBuilder)localObject1).append("RequestPermissions");
        paramFragmentContainer = ((StringBuilder)localObject1).toString();
        localObject1 = new androidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions;
        ((ActivityResultContracts.RequestMultiplePermissions)localObject1).<init>();
        localObject2 = new androidx/fragment/app/FragmentManager$10;
        ((FragmentManager.10)localObject2).<init>(this);
        paramFragmentHostCallback = paramFragmentHostCallback.OooO(paramFragmentContainer, (ActivityResultContract)localObject1, (ActivityResultCallback)localObject2);
        this.Oooo000 = paramFragmentHostCallback;
      }
      paramFragmentHostCallback = this.OooOo0O;
      bool = paramFragmentHostCallback instanceof OnConfigurationChangedProvider;
      if (bool)
      {
        paramFragmentHostCallback = (OnConfigurationChangedProvider)paramFragmentHostCallback;
        paramFragmentContainer = this.OooOOOo;
        paramFragmentHostCallback.OooO0Oo(paramFragmentContainer);
      }
      paramFragmentHostCallback = this.OooOo0O;
      bool = paramFragmentHostCallback instanceof OnTrimMemoryProvider;
      if (bool)
      {
        paramFragmentHostCallback = (OnTrimMemoryProvider)paramFragmentHostCallback;
        paramFragmentContainer = this.OooOOo0;
        paramFragmentHostCallback.OooOOo0(paramFragmentContainer);
      }
      paramFragmentHostCallback = this.OooOo0O;
      bool = paramFragmentHostCallback instanceof OnMultiWindowModeChangedProvider;
      if (bool)
      {
        paramFragmentHostCallback = (OnMultiWindowModeChangedProvider)paramFragmentHostCallback;
        paramFragmentContainer = this.OooOOo;
        paramFragmentHostCallback.OooOO0O(paramFragmentContainer);
      }
      paramFragmentHostCallback = this.OooOo0O;
      bool = paramFragmentHostCallback instanceof OnPictureInPictureModeChangedProvider;
      if (bool)
      {
        paramFragmentHostCallback = (OnPictureInPictureModeChangedProvider)paramFragmentHostCallback;
        paramFragmentContainer = this.OooOOoo;
        paramFragmentHostCallback.OooO(paramFragmentContainer);
      }
      paramFragmentHostCallback = this.OooOo0O;
      bool = paramFragmentHostCallback instanceof MenuHost;
      if ((bool) && (paramFragment == null))
      {
        paramFragmentHostCallback = (MenuHost)paramFragmentHostCallback;
        paramFragmentContainer = this.OooOo00;
        paramFragmentHostCallback.addMenuProvider(paramFragmentContainer);
      }
      return;
    }
    paramFragmentHostCallback = new java/lang/IllegalStateException;
    paramFragmentHostCallback.<init>("Already attached");
    throw paramFragmentHostCallback;
  }
  
  public void OooOOOo(Fragment paramFragment)
  {
    int i = 2;
    boolean bool2 = isLoggingEnabled(i);
    Object localObject;
    if (bool2)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = "attach: ";
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append(paramFragment);
    }
    bool2 = paramFragment.mDetached;
    if (bool2)
    {
      localObject = null;
      paramFragment.mDetached = false;
      bool2 = paramFragment.mAdded;
      if (!bool2)
      {
        localObject = this.OooO0OO;
        ((FragmentStore)localObject).OooO00o(paramFragment);
        boolean bool1 = isLoggingEnabled(i);
        if (bool1)
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localObject = "add from attach: ";
          localStringBuilder.append((String)localObject);
          localStringBuilder.append(paramFragment);
        }
        boolean bool3 = o0O0O00(paramFragment);
        if (bool3)
        {
          bool3 = true;
          this.Oooo00o = bool3;
        }
      }
    }
  }
  
  public boolean OooOOo()
  {
    Iterator localIterator = this.OooO0OO.getActiveFragments().iterator();
    boolean bool1 = false;
    do
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      Fragment localFragment = (Fragment)localIterator.next();
      if (localFragment != null) {
        bool1 = o0O0O00(localFragment);
      }
    } while (!bool1);
    return true;
    return false;
  }
  
  public FragmentTransaction OooOOo0()
  {
    BackStackRecord localBackStackRecord = new androidx/fragment/app/BackStackRecord;
    localBackStackRecord.<init>(this);
    return localBackStackRecord;
  }
  
  public final void OooOOoo()
  {
    boolean bool = isStateSaved();
    if (!bool) {
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Can not perform this action after onSaveInstanceState");
    throw localIllegalStateException;
  }
  
  public final Set OooOo()
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    Iterator localIterator = this.OooO0OO.getActiveFragmentStateManagers().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = ((FragmentStateManager)localIterator.next()).getFragment().mContainer;
      if (localObject != null)
      {
        SpecialEffectsControllerFactory localSpecialEffectsControllerFactory = getSpecialEffectsControllerFactory();
        localObject = SpecialEffectsController.OooOOo((ViewGroup)localObject, localSpecialEffectsControllerFactory);
        localHashSet.add(localObject);
      }
    }
    return localHashSet;
  }
  
  public boolean OooOo0(ArrayList paramArrayList1, ArrayList paramArrayList2, String paramString)
  {
    boolean bool = o0000o0O(paramArrayList1, paramArrayList2, paramString);
    if (!bool) {
      return false;
    }
    return o0000OO0(paramArrayList1, paramArrayList2, paramString, -1, 1);
  }
  
  public final void OooOo00()
  {
    this.OooO0O0 = false;
    this.Oooo0oO.clear();
    this.Oooo0o.clear();
  }
  
  public final void OooOo0O()
  {
    Object localObject = this.OooOo0O;
    boolean bool1 = localObject instanceof ViewModelStoreOwner;
    boolean bool2;
    if (bool1)
    {
      localObject = this.OooO0OO.getNonConfig();
      bool2 = ((FragmentManagerViewModel)localObject).isCleared();
    }
    else
    {
      localObject = ((FragmentHostCallback)localObject).getContext();
      bool2 = localObject instanceof Activity;
      bool1 = true;
      if (bool2)
      {
        localObject = (Activity)this.OooOo0O.getContext();
        bool2 = ((Activity)localObject).isChangingConfigurations() ^ bool1;
      }
      else
      {
        bool2 = bool1;
      }
    }
    if (bool2)
    {
      localObject = this.OooOO0.values().iterator();
      bool1 = ((Iterator)localObject).hasNext();
      if (bool1)
      {
        Iterator localIterator = ((BackStackState)((Iterator)localObject).next()).o00OoOoo.iterator();
        for (;;)
        {
          boolean bool3 = localIterator.hasNext();
          if (!bool3) {
            break;
          }
          String str = (String)localIterator.next();
          FragmentManagerViewModel localFragmentManagerViewModel = this.OooO0OO.getNonConfig();
          localFragmentManagerViewModel.OooO(str);
        }
      }
    }
  }
  
  public final void OooOo0o(String paramString)
  {
    Object localObject = this.OooOO0O;
    ((Map)localObject).remove(paramString);
    boolean bool = isLoggingEnabled(2);
    if (bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = "Clearing fragment result with key ";
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append(paramString);
    }
  }
  
  public FragmentStateManager OooOoO(Fragment paramFragment)
  {
    Object localObject1 = this.OooO0OO;
    Object localObject2 = paramFragment.mWho;
    localObject1 = ((FragmentStore)localObject1).OooOO0O((String)localObject2);
    if (localObject1 != null) {
      return localObject1;
    }
    localObject1 = new androidx/fragment/app/FragmentStateManager;
    localObject2 = this.OooOOO;
    FragmentStore localFragmentStore = this.OooO0OO;
    ((FragmentStateManager)localObject1).<init>((FragmentLifecycleCallbacksDispatcher)localObject2, localFragmentStore, paramFragment);
    paramFragment = this.OooOo0O.getContext().getClassLoader();
    ((FragmentStateManager)localObject1).OooOOO(paramFragment);
    int i = this.OooOo0;
    ((FragmentStateManager)localObject1).setFragmentManagerState(i);
    return localObject1;
  }
  
  public final Set OooOoO0(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    while (paramInt1 < paramInt2)
    {
      Iterator localIterator = ((BackStackRecord)paramArrayList.get(paramInt1)).OooO0OO.iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        Object localObject = ((FragmentTransaction.Op)localIterator.next()).OooO0O0;
        if (localObject != null)
        {
          localObject = ((Fragment)localObject).mContainer;
          if (localObject != null)
          {
            localObject = SpecialEffectsController.OooOOo0((ViewGroup)localObject, this);
            localHashSet.add(localObject);
          }
        }
      }
      paramInt1 += 1;
    }
    return localHashSet;
  }
  
  public void OooOoOO(Fragment paramFragment)
  {
    int i = 2;
    boolean bool2 = isLoggingEnabled(i);
    String str;
    if (bool2)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      str = "detach: ";
      localStringBuilder.append(str);
      localStringBuilder.append(paramFragment);
    }
    bool2 = paramFragment.mDetached;
    if (!bool2)
    {
      bool2 = true;
      paramFragment.mDetached = bool2;
      boolean bool3 = paramFragment.mAdded;
      if (bool3)
      {
        boolean bool1 = isLoggingEnabled(i);
        if (bool1)
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          str = "remove from detach: ";
          ((StringBuilder)localObject).append(str);
          ((StringBuilder)localObject).append(paramFragment);
        }
        Object localObject = this.OooO0OO;
        ((FragmentStore)localObject).OooOOOo(paramFragment);
        bool1 = o0O0O00(paramFragment);
        if (bool1) {
          this.Oooo00o = bool2;
        }
        setVisibleRemovingFragment(paramFragment);
      }
    }
  }
  
  public void OooOoo()
  {
    this.Oooo0 = false;
    this.Oooo0O0 = false;
    this.Oooo.setIsStateSaved(false);
    OoooOOO(0);
  }
  
  public void OooOoo0()
  {
    this.Oooo0 = false;
    this.Oooo0O0 = false;
    this.Oooo.setIsStateSaved(false);
    OoooOOO(4);
  }
  
  public void OooOooO(Configuration paramConfiguration, boolean paramBoolean)
  {
    Object localObject2;
    if (paramBoolean)
    {
      localObject1 = this.OooOo0O;
      boolean bool1 = localObject1 instanceof OnConfigurationChangedProvider;
      if (bool1)
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject2 = "Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments.";
        ((IllegalStateException)localObject1).<init>((String)localObject2);
        o000Ooo((RuntimeException)localObject1);
      }
    }
    Object localObject1 = this.OooO0OO.getFragments().iterator();
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject1).hasNext();
      if (!bool2) {
        break;
      }
      localObject2 = (Fragment)((Iterator)localObject1).next();
      if (localObject2 != null)
      {
        ((Fragment)localObject2).performConfigurationChanged(paramConfiguration);
        if (paramBoolean)
        {
          localObject2 = ((Fragment)localObject2).mChildFragmentManager;
          boolean bool3 = true;
          ((FragmentManager)localObject2).OooOooO(paramConfiguration, bool3);
        }
      }
    }
  }
  
  public boolean OooOooo(MenuItem paramMenuItem)
  {
    int i = this.OooOo0;
    int j = 1;
    if (i < j) {
      return false;
    }
    Iterator localIterator = this.OooO0OO.getFragments().iterator();
    boolean bool;
    do
    {
      Fragment localFragment;
      do
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localFragment = (Fragment)localIterator.next();
      } while (localFragment == null);
      bool = localFragment.performContextItemSelected(paramMenuItem);
    } while (!bool);
    return j;
    return false;
  }
  
  public final void Oooo(Fragment paramFragment)
  {
    if (paramFragment != null)
    {
      Object localObject = paramFragment.mWho;
      localObject = Ooooooo((String)localObject);
      boolean bool = paramFragment.equals(localObject);
      if (bool) {
        paramFragment.performPrimaryNavigationFragmentChanged();
      }
    }
  }
  
  public void Oooo0()
  {
    OoooOOO(1);
  }
  
  public void Oooo000()
  {
    this.Oooo0 = false;
    this.Oooo0O0 = false;
    this.Oooo.setIsStateSaved(false);
    OoooOOO(1);
  }
  
  public boolean Oooo00O(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    int i = this.OooOo0;
    int j = 0;
    int k = 1;
    if (i < k) {
      return false;
    }
    Iterator localIterator = this.OooO0OO.getFragments().iterator();
    ArrayList localArrayList = null;
    boolean bool1 = false;
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      Fragment localFragment = (Fragment)localIterator.next();
      if (localFragment != null)
      {
        boolean bool3 = o000000(localFragment);
        if (bool3)
        {
          bool3 = localFragment.performCreateOptionsMenu(paramMenu, paramMenuInflater);
          if (bool3)
          {
            if (localArrayList == null)
            {
              localArrayList = new java/util/ArrayList;
              localArrayList.<init>();
            }
            localArrayList.add(localFragment);
            bool1 = k;
          }
        }
      }
    }
    paramMenu = this.OooO0o0;
    if (paramMenu != null) {
      for (;;)
      {
        paramMenu = this.OooO0o0;
        int m = paramMenu.size();
        if (j >= m) {
          break;
        }
        paramMenu = (Fragment)this.OooO0o0.get(j);
        if (localArrayList != null)
        {
          boolean bool4 = localArrayList.contains(paramMenu);
          if (bool4) {}
        }
        else
        {
          paramMenu.onDestroyOptionsMenu();
        }
        j += 1;
      }
    }
    this.OooO0o0 = localArrayList;
    return bool1;
  }
  
  public void Oooo00o()
  {
    boolean bool1 = true;
    this.Oooo0OO = bool1;
    OooooOO(bool1);
    Ooooo00();
    OooOo0O();
    int i = -1;
    OoooOOO(i);
    Object localObject1 = this.OooOo0O;
    boolean bool2 = localObject1 instanceof OnTrimMemoryProvider;
    if (bool2)
    {
      localObject1 = (OnTrimMemoryProvider)localObject1;
      localObject2 = this.OooOOo0;
      ((OnTrimMemoryProvider)localObject1).OooO0oO((Consumer)localObject2);
    }
    localObject1 = this.OooOo0O;
    bool2 = localObject1 instanceof OnConfigurationChangedProvider;
    if (bool2)
    {
      localObject1 = (OnConfigurationChangedProvider)localObject1;
      localObject2 = this.OooOOOo;
      ((OnConfigurationChangedProvider)localObject1).OooOOO0((Consumer)localObject2);
    }
    localObject1 = this.OooOo0O;
    bool2 = localObject1 instanceof OnMultiWindowModeChangedProvider;
    if (bool2)
    {
      localObject1 = (OnMultiWindowModeChangedProvider)localObject1;
      localObject2 = this.OooOOo;
      ((OnMultiWindowModeChangedProvider)localObject1).OooOo00((Consumer)localObject2);
    }
    localObject1 = this.OooOo0O;
    bool2 = localObject1 instanceof OnPictureInPictureModeChangedProvider;
    if (bool2)
    {
      localObject1 = (OnPictureInPictureModeChangedProvider)localObject1;
      localObject2 = this.OooOOoo;
      ((OnPictureInPictureModeChangedProvider)localObject1).OooO0o((Consumer)localObject2);
    }
    localObject1 = this.OooOo0O;
    bool2 = localObject1 instanceof MenuHost;
    if (bool2)
    {
      localObject2 = this.OooOo;
      if (localObject2 == null)
      {
        localObject1 = (MenuHost)localObject1;
        localObject2 = this.OooOo00;
        ((MenuHost)localObject1).removeMenuProvider((MenuProvider)localObject2);
      }
    }
    i = 0;
    localObject1 = null;
    this.OooOo0O = null;
    this.OooOo0o = null;
    this.OooOo = null;
    Object localObject2 = this.OooO0oO;
    if (localObject2 != null)
    {
      localObject2 = this.OooO0oo;
      ((OnBackPressedCallback)localObject2).OooO0o();
      this.OooO0oO = null;
    }
    localObject1 = this.OooOooO;
    if (localObject1 != null)
    {
      ((ActivityResultLauncher)localObject1).OooO0OO();
      this.OooOooo.OooO0OO();
      localObject1 = this.Oooo000;
      ((ActivityResultLauncher)localObject1).OooO0OO();
    }
  }
  
  public void Oooo0O0(boolean paramBoolean)
  {
    Object localObject2;
    if (paramBoolean)
    {
      localObject1 = this.OooOo0O;
      boolean bool1 = localObject1 instanceof OnTrimMemoryProvider;
      if (bool1)
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject2 = "Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments.";
        ((IllegalStateException)localObject1).<init>((String)localObject2);
        o000Ooo((RuntimeException)localObject1);
      }
    }
    Object localObject1 = this.OooO0OO.getFragments().iterator();
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject1).hasNext();
      if (!bool2) {
        break;
      }
      localObject2 = (Fragment)((Iterator)localObject1).next();
      if (localObject2 != null)
      {
        ((Fragment)localObject2).performLowMemory();
        if (paramBoolean)
        {
          localObject2 = ((Fragment)localObject2).mChildFragmentManager;
          boolean bool3 = true;
          ((FragmentManager)localObject2).Oooo0O0(bool3);
        }
      }
    }
  }
  
  public void Oooo0OO(boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject2;
    if (paramBoolean2)
    {
      localObject1 = this.OooOo0O;
      boolean bool1 = localObject1 instanceof OnMultiWindowModeChangedProvider;
      if (bool1)
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject2 = "Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments.";
        ((IllegalStateException)localObject1).<init>((String)localObject2);
        o000Ooo((RuntimeException)localObject1);
      }
    }
    Object localObject1 = this.OooO0OO.getFragments().iterator();
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject1).hasNext();
      if (!bool2) {
        break;
      }
      localObject2 = (Fragment)((Iterator)localObject1).next();
      if (localObject2 != null)
      {
        ((Fragment)localObject2).performMultiWindowModeChanged(paramBoolean1);
        if (paramBoolean2)
        {
          localObject2 = ((Fragment)localObject2).mChildFragmentManager;
          boolean bool3 = true;
          ((FragmentManager)localObject2).Oooo0OO(paramBoolean1, bool3);
        }
      }
    }
  }
  
  public void Oooo0o()
  {
    Iterator localIterator = this.OooO0OO.getActiveFragments().iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      Object localObject = (Fragment)localIterator.next();
      if (localObject != null)
      {
        boolean bool2 = ((Fragment)localObject).isHidden();
        ((Fragment)localObject).onHiddenChanged(bool2);
        localObject = ((Fragment)localObject).mChildFragmentManager;
        ((FragmentManager)localObject).Oooo0o();
      }
    }
  }
  
  public void Oooo0o0(Fragment paramFragment)
  {
    Iterator localIterator = this.OooOOOO.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      FragmentOnAttachListener localFragmentOnAttachListener = (FragmentOnAttachListener)localIterator.next();
      localFragmentOnAttachListener.OooO00o(this, paramFragment);
    }
  }
  
  public boolean Oooo0oO(MenuItem paramMenuItem)
  {
    int i = this.OooOo0;
    int j = 1;
    if (i < j) {
      return false;
    }
    Iterator localIterator = this.OooO0OO.getFragments().iterator();
    boolean bool;
    do
    {
      Fragment localFragment;
      do
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localFragment = (Fragment)localIterator.next();
      } while (localFragment == null);
      bool = localFragment.performOptionsItemSelected(paramMenuItem);
    } while (!bool);
    return j;
    return false;
  }
  
  public void Oooo0oo(Menu paramMenu)
  {
    int i = this.OooOo0;
    int j = 1;
    if (i < j) {
      return;
    }
    Iterator localIterator = this.OooO0OO.getFragments().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Fragment localFragment = (Fragment)localIterator.next();
      if (localFragment != null) {
        localFragment.performOptionsMenuClosed(paramMenu);
      }
    }
  }
  
  public void OoooO()
  {
    o000Oo0();
    Fragment localFragment = this.OooOoO0;
    Oooo(localFragment);
  }
  
  public void OoooO0(boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject2;
    if (paramBoolean2)
    {
      localObject1 = this.OooOo0O;
      boolean bool1 = localObject1 instanceof OnPictureInPictureModeChangedProvider;
      if (bool1)
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject2 = "Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments.";
        ((IllegalStateException)localObject1).<init>((String)localObject2);
        o000Ooo((RuntimeException)localObject1);
      }
    }
    Object localObject1 = this.OooO0OO.getFragments().iterator();
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject1).hasNext();
      if (!bool2) {
        break;
      }
      localObject2 = (Fragment)((Iterator)localObject1).next();
      if (localObject2 != null)
      {
        ((Fragment)localObject2).performPictureInPictureModeChanged(paramBoolean1);
        if (paramBoolean2)
        {
          localObject2 = ((Fragment)localObject2).mChildFragmentManager;
          boolean bool3 = true;
          ((FragmentManager)localObject2).OoooO0(paramBoolean1, bool3);
        }
      }
    }
  }
  
  public void OoooO00()
  {
    OoooOOO(5);
  }
  
  public boolean OoooO0O(Menu paramMenu)
  {
    int i = this.OooOo0;
    boolean bool1 = false;
    int j = 1;
    if (i < j) {
      return false;
    }
    Iterator localIterator = this.OooO0OO.getFragments().iterator();
    for (;;)
    {
      boolean bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      Fragment localFragment = (Fragment)localIterator.next();
      if (localFragment != null)
      {
        boolean bool3 = o000000(localFragment);
        if (bool3)
        {
          bool2 = localFragment.performPrepareOptionsMenu(paramMenu);
          if (bool2) {
            bool1 = j;
          }
        }
      }
    }
    return bool1;
  }
  
  public void OoooOO0()
  {
    this.Oooo0 = false;
    this.Oooo0O0 = false;
    this.Oooo.setIsStateSaved(false);
    OoooOOO(7);
  }
  
  public final void OoooOOO(int paramInt)
  {
    boolean bool1 = true;
    try
    {
      this.OooO0O0 = bool1;
      Object localObject1 = this.OooO0OO;
      ((FragmentStore)localObject1).OooO0Oo(paramInt);
      o00000oO(paramInt, false);
      Object localObject2 = OooOo();
      localObject2 = ((Set)localObject2).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject2).hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = ((Iterator)localObject2).next();
        localObject1 = (SpecialEffectsController)localObject1;
        ((SpecialEffectsController)localObject1).OooOOO();
      }
      this.OooO0O0 = false;
      OooooOO(bool1);
      return;
    }
    finally
    {
      this.OooO0O0 = false;
    }
  }
  
  public void OoooOOo()
  {
    boolean bool = true;
    this.Oooo0O0 = bool;
    this.Oooo.setIsStateSaved(bool);
    OoooOOO(4);
  }
  
  public void OoooOo0()
  {
    OoooOOO(2);
  }
  
  public final void OoooOoO()
  {
    boolean bool = this.Oooo0o0;
    if (bool)
    {
      bool = false;
      this.Oooo0o0 = false;
      o000O0o();
    }
  }
  
  public void OoooOoo(String paramString, FileDescriptor arg2, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append(paramString);
    ((StringBuilder)localObject1).append("    ");
    localObject1 = ((StringBuilder)localObject1).toString();
    Object localObject2 = this.OooO0OO;
    ((FragmentStore)localObject2).OooO0o0(paramString, ???, paramPrintWriter, paramArrayOfString);
    ??? = this.OooO0o0;
    int i = 0;
    paramArrayOfString = null;
    int j;
    int k;
    Object localObject3;
    String str;
    if (??? != null)
    {
      j = ???.size();
      if (j > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Fragments Created Menus:");
        k = 0;
        localObject2 = null;
        while (k < j)
        {
          localObject3 = (Fragment)this.OooO0o0.get(k);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(k);
          str = ": ";
          paramPrintWriter.print(str);
          localObject3 = ((Fragment)localObject3).toString();
          paramPrintWriter.println((String)localObject3);
          k += 1;
        }
      }
    }
    ??? = this.OooO0Oo;
    if (??? != null)
    {
      j = ???.size();
      if (j > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Back Stack:");
        k = 0;
        localObject2 = null;
        while (k < j)
        {
          localObject3 = (BackStackRecord)this.OooO0Oo.get(k);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(k);
          paramPrintWriter.print(": ");
          str = ((BackStackRecord)localObject3).toString();
          paramPrintWriter.println(str);
          ((BackStackRecord)localObject3).OooOooO((String)localObject1, paramPrintWriter);
          k += 1;
        }
      }
    }
    paramPrintWriter.print(paramString);
    ??? = new java/lang/StringBuilder;
    ???.<init>();
    ???.append("Back Stack Index: ");
    localObject1 = this.OooO;
    int m = ((AtomicInteger)localObject1).get();
    ???.append(m);
    ??? = ???.toString();
    paramPrintWriter.println(???);
    synchronized (this.OooO00o)
    {
      localObject1 = this.OooO00o;
      m = ((ArrayList)localObject1).size();
      if (m > 0)
      {
        paramPrintWriter.print(paramString);
        localObject2 = "Pending Actions:";
        paramPrintWriter.println((String)localObject2);
        while (i < m)
        {
          localObject2 = this.OooO00o;
          localObject2 = ((ArrayList)localObject2).get(i);
          localObject2 = (FragmentManager.OpGenerator)localObject2;
          paramPrintWriter.print(paramString);
          localObject3 = "  #";
          paramPrintWriter.print((String)localObject3);
          paramPrintWriter.print(i);
          localObject3 = ": ";
          paramPrintWriter.print((String)localObject3);
          paramPrintWriter.println(localObject2);
          i += 1;
        }
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("FragmentManager misc state:");
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mHost=");
      ??? = this.OooOo0O;
      paramPrintWriter.println(???);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mContainer=");
      ??? = this.OooOo0o;
      paramPrintWriter.println(???);
      ??? = this.OooOo;
      if (??? != null)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  mParent=");
        ??? = this.OooOo;
        paramPrintWriter.println(???);
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mCurState=");
      j = this.OooOo0;
      paramPrintWriter.print(j);
      paramPrintWriter.print(" mStateSaved=");
      boolean bool1 = this.Oooo0;
      paramPrintWriter.print(bool1);
      paramPrintWriter.print(" mStopped=");
      bool1 = this.Oooo0O0;
      paramPrintWriter.print(bool1);
      ??? = " mDestroyed=";
      paramPrintWriter.print(???);
      bool1 = this.Oooo0OO;
      paramPrintWriter.println(bool1);
      bool1 = this.Oooo00o;
      if (bool1)
      {
        paramPrintWriter.print(paramString);
        paramString = "  mNeedMenuInvalidate=";
        paramPrintWriter.print(paramString);
        boolean bool2 = this.Oooo00o;
        paramPrintWriter.println(bool2);
      }
      return;
    }
  }
  
  public final void Ooooo00()
  {
    Iterator localIterator = OooOo().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      SpecialEffectsController localSpecialEffectsController = (SpecialEffectsController)localIterator.next();
      localSpecialEffectsController.OooOOO();
    }
  }
  
  public void Ooooo0o(FragmentManager.OpGenerator paramOpGenerator, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      ??? = this.OooOo0O;
      if (??? == null)
      {
        boolean bool = this.Oooo0OO;
        if (bool)
        {
          paramOpGenerator = new java/lang/IllegalStateException;
          paramOpGenerator.<init>("FragmentManager has been destroyed");
          throw paramOpGenerator;
        }
        paramOpGenerator = new java/lang/IllegalStateException;
        paramOpGenerator.<init>("FragmentManager has not been attached to a host.");
        throw paramOpGenerator;
      }
      OooOOoo();
    }
    synchronized (this.OooO00o)
    {
      FragmentHostCallback localFragmentHostCallback = this.OooOo0O;
      if (localFragmentHostCallback == null)
      {
        if (paramBoolean) {
          return;
        }
        paramOpGenerator = new java/lang/IllegalStateException;
        localObject2 = "Activity has been destroyed";
        paramOpGenerator.<init>((String)localObject2);
        throw paramOpGenerator;
      }
      Object localObject2 = this.OooO00o;
      ((ArrayList)localObject2).add(paramOpGenerator);
      o0000ooO();
      return;
    }
  }
  
  public final void OooooO0(boolean paramBoolean)
  {
    boolean bool = this.OooO0O0;
    if (!bool)
    {
      Object localObject1 = this.OooOo0O;
      if (localObject1 == null)
      {
        paramBoolean = this.Oooo0OO;
        if (paramBoolean)
        {
          localObject2 = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject2).<init>("FragmentManager has been destroyed");
          throw ((Throwable)localObject2);
        }
        localObject2 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject2).<init>("FragmentManager has not been attached to a host.");
        throw ((Throwable)localObject2);
      }
      localObject1 = Looper.myLooper();
      Looper localLooper = this.OooOo0O.getHandler().getLooper();
      if (localObject1 == localLooper)
      {
        if (!paramBoolean) {
          OooOOoo();
        }
        localObject2 = this.Oooo0o;
        if (localObject2 == null)
        {
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
          this.Oooo0o = ((ArrayList)localObject2);
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
          this.Oooo0oO = ((ArrayList)localObject2);
        }
        return;
      }
      localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>("Must be called from main thread of fragment host");
      throw ((Throwable)localObject2);
    }
    Object localObject2 = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject2).<init>("FragmentManager is already executing transactions");
    throw ((Throwable)localObject2);
  }
  
  public boolean OooooOO(boolean paramBoolean)
  {
    OooooO0(paramBoolean);
    paramBoolean = false;
    Object localObject1 = null;
    for (;;)
    {
      ArrayList localArrayList1 = this.Oooo0o;
      ArrayList localArrayList2 = this.Oooo0oO;
      boolean bool = o00oO0o(localArrayList1, localArrayList2);
      if (bool)
      {
        paramBoolean = true;
        this.OooO0O0 = paramBoolean;
        try
        {
          localArrayList1 = this.Oooo0o;
          localArrayList2 = this.Oooo0oO;
          o0000Oo0(localArrayList1, localArrayList2);
          OooOo00();
        }
        finally
        {
          OooOo00();
        }
      }
    }
    o000Oo0();
    OoooOoO();
    this.OooO0OO.OooO0O0();
    return paramBoolean;
  }
  
  public void OooooOo(FragmentManager.OpGenerator paramOpGenerator, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      localObject = this.OooOo0O;
      if (localObject != null)
      {
        boolean bool1 = this.Oooo0OO;
        if (!bool1) {}
      }
      else
      {
        return;
      }
    }
    OooooO0(paramBoolean);
    ArrayList localArrayList = this.Oooo0o;
    Object localObject = this.Oooo0oO;
    boolean bool2 = paramOpGenerator.OooO00o(localArrayList, (ArrayList)localObject);
    if (bool2)
    {
      bool2 = true;
      this.OooO0O0 = bool2;
      try
      {
        paramOpGenerator = this.Oooo0o;
        localArrayList = this.Oooo0oO;
        o0000Oo0(paramOpGenerator, localArrayList);
      }
      finally
      {
        OooOo00();
      }
    }
    o000Oo0();
    OoooOoO();
    this.OooO0OO.OooO0O0();
  }
  
  public final void Oooooo(ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt1, int paramInt2)
  {
    Object localObject1 = (BackStackRecord)paramArrayList1.get(paramInt1);
    boolean bool1 = ((FragmentTransaction)localObject1).OooOOo;
    Object localObject2 = this.Oooo0oo;
    if (localObject2 == null)
    {
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      this.Oooo0oo = ((ArrayList)localObject2);
    }
    else
    {
      ((ArrayList)localObject2).clear();
    }
    localObject2 = this.Oooo0oo;
    Object localObject3 = this.OooO0OO.getFragments();
    ((ArrayList)localObject2).addAll((Collection)localObject3);
    localObject2 = getPrimaryNavigationFragment();
    boolean bool3 = false;
    localObject3 = null;
    int j = paramInt1;
    boolean bool6 = false;
    int m;
    Object localObject4;
    Object localObject5;
    boolean bool7;
    for (;;)
    {
      m = 1;
      if (j >= paramInt2) {
        break;
      }
      localObject4 = (BackStackRecord)paramArrayList1.get(j);
      localObject5 = (Boolean)paramArrayList2.get(j);
      bool7 = ((Boolean)localObject5).booleanValue();
      if (!bool7)
      {
        localObject5 = this.Oooo0oo;
        localObject2 = ((BackStackRecord)localObject4).Oooo00o((ArrayList)localObject5, (Fragment)localObject2);
      }
      else
      {
        localObject5 = this.Oooo0oo;
        localObject2 = ((BackStackRecord)localObject4).Oooo0O0((ArrayList)localObject5, (Fragment)localObject2);
      }
      if (!bool6)
      {
        bool6 = ((FragmentTransaction)localObject4).OooO;
        if (!bool6)
        {
          bool6 = false;
          break label204;
        }
      }
      bool6 = m;
      label204:
      j += 1;
    }
    localObject2 = this.Oooo0oo;
    ((ArrayList)localObject2).clear();
    Object localObject6;
    if (!bool1)
    {
      i = this.OooOo0;
      if (i >= m)
      {
        i = paramInt1;
        while (i < paramInt2)
        {
          localObject2 = ((BackStackRecord)paramArrayList1.get(i)).OooO0OO.iterator();
          for (;;)
          {
            bool3 = ((Iterator)localObject2).hasNext();
            if (!bool3) {
              break;
            }
            localObject3 = ((FragmentTransaction.Op)((Iterator)localObject2).next()).OooO0O0;
            if (localObject3 != null)
            {
              localObject6 = ((Fragment)localObject3).mFragmentManager;
              if (localObject6 != null)
              {
                localObject3 = OooOoO((Fragment)localObject3);
                localObject6 = this.OooO0OO;
                ((FragmentStore)localObject6).OooOOO0((FragmentStateManager)localObject3);
              }
            }
          }
          i += 1;
        }
      }
    }
    Oooooo0(paramArrayList1, paramArrayList2, paramInt1, paramInt2);
    int i = paramInt2 + -1;
    localObject1 = (Boolean)paramArrayList2.get(i);
    boolean bool2 = ((Boolean)localObject1).booleanValue();
    if (bool6)
    {
      localObject2 = this.OooOOO0;
      if (localObject2 != null)
      {
        boolean bool8 = ((ArrayList)localObject2).isEmpty();
        if (!bool8)
        {
          localObject2 = new java/util/LinkedHashSet;
          ((LinkedHashSet)localObject2).<init>();
          localObject3 = paramArrayList1.iterator();
          for (;;)
          {
            bool4 = ((Iterator)localObject3).hasNext();
            if (!bool4) {
              break;
            }
            localObject6 = (BackStackRecord)((Iterator)localObject3).next();
            localObject6 = oo000o((BackStackRecord)localObject6);
            ((Set)localObject2).addAll((Collection)localObject6);
          }
          localObject3 = this.OooOOO0.iterator();
          boolean bool4 = ((Iterator)localObject3).hasNext();
          if (bool4)
          {
            localObject6 = (FragmentManager.OnBackStackChangedListener)((Iterator)localObject3).next();
            localObject4 = ((Set)localObject2).iterator();
            for (;;)
            {
              bool7 = ((Iterator)localObject4).hasNext();
              if (!bool7) {
                break;
              }
              localObject5 = (Fragment)((Iterator)localObject4).next();
              ((FragmentManager.OnBackStackChangedListener)localObject6).OooO0O0((Fragment)localObject5, bool2);
            }
          }
          localObject3 = this.OooOOO0.iterator();
          bool4 = ((Iterator)localObject3).hasNext();
          if (bool4)
          {
            localObject6 = (FragmentManager.OnBackStackChangedListener)((Iterator)localObject3).next();
            localObject4 = ((Set)localObject2).iterator();
            for (;;)
            {
              bool7 = ((Iterator)localObject4).hasNext();
              if (!bool7) {
                break;
              }
              localObject5 = (Fragment)((Iterator)localObject4).next();
              ((FragmentManager.OnBackStackChangedListener)localObject6).OooO00o((Fragment)localObject5, bool2);
            }
          }
        }
      }
    }
    int n = paramInt1;
    while (n < paramInt2)
    {
      localObject3 = (BackStackRecord)paramArrayList1.get(n);
      if (bool2)
      {
        localObject6 = ((FragmentTransaction)localObject3).OooO0OO;
        int k = ((ArrayList)localObject6).size() - m;
        while (k >= 0)
        {
          localObject4 = ((FragmentTransaction.Op)((FragmentTransaction)localObject3).OooO0OO.get(k)).OooO0O0;
          if (localObject4 != null)
          {
            localObject4 = OooOoO((Fragment)localObject4);
            ((FragmentStateManager)localObject4).OooOO0o();
          }
          k += -1;
        }
      }
      localObject3 = ((FragmentTransaction)localObject3).OooO0OO.iterator();
      for (;;)
      {
        boolean bool5 = ((Iterator)localObject3).hasNext();
        if (!bool5) {
          break;
        }
        localObject6 = ((FragmentTransaction.Op)((Iterator)localObject3).next()).OooO0O0;
        if (localObject6 != null)
        {
          localObject6 = OooOoO((Fragment)localObject6);
          ((FragmentStateManager)localObject6).OooOO0o();
        }
      }
      n += 1;
    }
    n = this.OooOo0;
    o00000oO(n, m);
    localObject2 = OooOoO0(paramArrayList1, paramInt1, paramInt2).iterator();
    for (;;)
    {
      bool3 = ((Iterator)localObject2).hasNext();
      if (!bool3) {
        break;
      }
      localObject3 = (SpecialEffectsController)((Iterator)localObject2).next();
      ((SpecialEffectsController)localObject3).OooOo0(bool2);
      ((SpecialEffectsController)localObject3).OooOOoo();
      ((SpecialEffectsController)localObject3).OooOO0O();
    }
    while (paramInt1 < paramInt2)
    {
      localObject1 = (BackStackRecord)paramArrayList1.get(paramInt1);
      localObject2 = (Boolean)paramArrayList2.get(paramInt1);
      boolean bool9 = ((Boolean)localObject2).booleanValue();
      if (bool9)
      {
        int i1 = ((BackStackRecord)localObject1).OooOo0O;
        if (i1 >= 0)
        {
          i1 = -1;
          ((BackStackRecord)localObject1).OooOo0O = i1;
        }
      }
      ((BackStackRecord)localObject1).Oooo0();
      paramInt1 += 1;
    }
    if (bool6) {
      o0000OoO();
    }
  }
  
  public boolean OoooooO()
  {
    boolean bool = OooooOO(true);
    o00ooo();
    return bool;
  }
  
  public Fragment Ooooooo(String paramString)
  {
    return this.OooO0OO.OooO0o(paramString);
  }
  
  public int getActiveFragmentCount()
  {
    return this.OooO0OO.getActiveFragmentCount();
  }
  
  public List getActiveFragments()
  {
    return this.OooO0OO.getActiveFragments();
  }
  
  public FragmentManager.BackStackEntry getBackStackEntryAt(int paramInt)
  {
    return (FragmentManager.BackStackEntry)this.OooO0Oo.get(paramInt);
  }
  
  public int getBackStackEntryCount()
  {
    ArrayList localArrayList = this.OooO0Oo;
    int i;
    if (localArrayList != null)
    {
      i = localArrayList.size();
    }
    else
    {
      i = 0;
      localArrayList = null;
    }
    return i;
  }
  
  public FragmentContainer getContainer()
  {
    return this.OooOo0o;
  }
  
  public FragmentFactory getFragmentFactory()
  {
    Object localObject = this.OooOoO;
    if (localObject != null) {
      return localObject;
    }
    localObject = this.OooOo;
    if (localObject != null) {
      return ((Fragment)localObject).mFragmentManager.getFragmentFactory();
    }
    return this.OooOoOO;
  }
  
  public FragmentStore getFragmentStore()
  {
    return this.OooO0OO;
  }
  
  public List getFragments()
  {
    return this.OooO0OO.getFragments();
  }
  
  public FragmentHostCallback getHost()
  {
    return this.OooOo0O;
  }
  
  public LayoutInflater.Factory2 getLayoutInflaterFactory()
  {
    return this.OooO0o;
  }
  
  public FragmentLifecycleCallbacksDispatcher getLifecycleCallbacksDispatcher()
  {
    return this.OooOOO;
  }
  
  public Fragment getParent()
  {
    return this.OooOo;
  }
  
  public Fragment getPrimaryNavigationFragment()
  {
    return this.OooOoO0;
  }
  
  public SpecialEffectsControllerFactory getSpecialEffectsControllerFactory()
  {
    Object localObject = this.OooOoo0;
    if (localObject != null) {
      return localObject;
    }
    localObject = this.OooOo;
    if (localObject != null) {
      return ((Fragment)localObject).mFragmentManager.getSpecialEffectsControllerFactory();
    }
    return this.OooOoo;
  }
  
  public FragmentStrictMode.Policy getStrictModePolicy()
  {
    return this.OoooO00;
  }
  
  public boolean isDestroyed()
  {
    return this.Oooo0OO;
  }
  
  public boolean isStateAtLeast(int paramInt)
  {
    int i = this.OooOo0;
    if (i >= paramInt) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    return paramInt;
  }
  
  public boolean isStateSaved()
  {
    boolean bool = this.Oooo0;
    if (!bool)
    {
      bool = this.Oooo0O0;
      if (!bool) {
        return false;
      }
    }
    bool = true;
    return bool;
  }
  
  public void o000(Fragment paramFragment, boolean paramBoolean)
  {
    paramFragment = o0ooOOo(paramFragment);
    if (paramFragment != null)
    {
      boolean bool = paramFragment instanceof FragmentContainerView;
      if (bool)
      {
        paramFragment = (FragmentContainerView)paramFragment;
        paramBoolean ^= true;
        paramFragment.setDrawDisappearingViewsLast(paramBoolean);
      }
    }
  }
  
  public void o0000(FragmentContainerView paramFragmentContainerView)
  {
    Iterator localIterator = this.OooO0OO.getActiveFragmentStateManagers().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      FragmentStateManager localFragmentStateManager = (FragmentStateManager)localIterator.next();
      Fragment localFragment = localFragmentStateManager.getFragment();
      int i = localFragment.mContainerId;
      int j = paramFragmentContainerView.getId();
      if (i == j)
      {
        Object localObject = localFragment.mView;
        if (localObject != null)
        {
          localObject = ((View)localObject).getParent();
          if (localObject == null)
          {
            localFragment.mContainer = paramFragmentContainerView;
            localFragmentStateManager.OooO0O0();
          }
        }
      }
    }
  }
  
  public boolean o000000(Fragment paramFragment)
  {
    if (paramFragment == null) {
      return true;
    }
    return paramFragment.isMenuVisible();
  }
  
  public boolean o000000O(Fragment paramFragment)
  {
    boolean bool1 = true;
    if (paramFragment == null) {
      return bool1;
    }
    FragmentManager localFragmentManager = paramFragment.mFragmentManager;
    Fragment localFragment = localFragmentManager.getPrimaryNavigationFragment();
    boolean bool2 = paramFragment.equals(localFragment);
    if (bool2)
    {
      paramFragment = localFragmentManager.OooOo;
      bool2 = o000000O(paramFragment);
      if (bool2) {}
    }
    else
    {
      bool1 = false;
    }
    return bool1;
  }
  
  public void o00000Oo(Fragment paramFragment, String[] paramArrayOfString, int paramInt)
  {
    Object localObject = this.Oooo000;
    if (localObject != null)
    {
      localObject = new androidx/fragment/app/FragmentManager$LaunchedFragmentInfo;
      paramFragment = paramFragment.mWho;
      ((FragmentManager.LaunchedFragmentInfo)localObject).<init>(paramFragment, paramInt);
      this.Oooo00O.addLast(localObject);
      paramFragment = this.Oooo000;
      paramFragment.OooO00o(paramArrayOfString);
    }
    else
    {
      localObject = this.OooOo0O;
      ((FragmentHostCallback)localObject).OooOOO(paramFragment, paramArrayOfString, paramInt);
    }
  }
  
  public void o00000o0(Fragment paramFragment, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    Object localObject = this.OooOooO;
    if (localObject != null)
    {
      localObject = new androidx/fragment/app/FragmentManager$LaunchedFragmentInfo;
      paramFragment = paramFragment.mWho;
      ((FragmentManager.LaunchedFragmentInfo)localObject).<init>(paramFragment, paramInt);
      paramFragment = this.Oooo00O;
      paramFragment.addLast(localObject);
      if (paramBundle != null)
      {
        paramFragment = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";
        paramIntent.putExtra(paramFragment, paramBundle);
      }
      paramFragment = this.OooOooO;
      paramFragment.OooO00o(paramIntent);
    }
    else
    {
      localObject = this.OooOo0O;
      ((FragmentHostCallback)localObject).OooOOOo(paramFragment, paramIntent, paramInt, paramBundle);
    }
  }
  
  public void o00000oO(int paramInt, boolean paramBoolean)
  {
    FragmentHostCallback localFragmentHostCallback = this.OooOo0O;
    int i;
    if (localFragmentHostCallback == null)
    {
      i = -1;
      if (paramInt != i)
      {
        localObject = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject).<init>("No activity");
        throw ((Throwable)localObject);
      }
    }
    if (!paramBoolean)
    {
      paramBoolean = this.OooOo0;
      if (paramInt == paramBoolean) {
        return;
      }
    }
    this.OooOo0 = paramInt;
    Object localObject = this.OooO0OO;
    ((FragmentStore)localObject).OooOOOO();
    o000O0o();
    paramInt = this.Oooo00o;
    if (paramInt != 0)
    {
      localObject = this.OooOo0O;
      if (localObject != null)
      {
        paramBoolean = this.OooOo0;
        i = 7;
        if (paramBoolean == i)
        {
          ((FragmentHostCallback)localObject).OooOOoo();
          paramInt = 0;
          localObject = null;
          this.Oooo00o = false;
        }
      }
    }
  }
  
  public void o00000oo()
  {
    Object localObject1 = this.OooOo0O;
    if (localObject1 == null) {
      return;
    }
    this.Oooo0 = false;
    this.Oooo0O0 = false;
    Object localObject2 = this.Oooo;
    ((FragmentManagerViewModel)localObject2).setIsStateSaved(false);
    localObject1 = this.OooO0OO.getFragments().iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject1).hasNext();
      if (!bool) {
        break;
      }
      localObject2 = (Fragment)((Iterator)localObject1).next();
      if (localObject2 != null) {
        ((Fragment)localObject2).noteStateNotSaved();
      }
    }
  }
  
  public final boolean o0000O(String paramString, int paramInt1, int paramInt2)
  {
    OooooOO(false);
    boolean bool1 = true;
    OooooO0(bool1);
    Object localObject = this.OooOoO0;
    if ((localObject != null) && (paramInt1 < 0) && (paramString == null))
    {
      localObject = ((Fragment)localObject).getChildFragmentManager();
      boolean bool2 = ((FragmentManager)localObject).o0000O0O();
      if (bool2) {
        return bool1;
      }
    }
    ArrayList localArrayList1 = this.Oooo0o;
    ArrayList localArrayList2 = this.Oooo0oO;
    boolean bool3 = o0000OO0(localArrayList1, localArrayList2, paramString, paramInt1, paramInt2);
    if (bool3)
    {
      this.OooO0O0 = bool1;
      try
      {
        ArrayList localArrayList3 = this.Oooo0o;
        ArrayList localArrayList4 = this.Oooo0oO;
        o0000Oo0(localArrayList3, localArrayList4);
      }
      finally
      {
        OooOo00();
      }
    }
    o000Oo0();
    OoooOoO();
    this.OooO0OO.OooO0O0();
    return bool3;
  }
  
  public void o0000O0(String paramString, int paramInt)
  {
    FragmentManager.PopBackStackState localPopBackStackState = new androidx/fragment/app/FragmentManager$PopBackStackState;
    localPopBackStackState.<init>(this, paramString, -1, paramInt);
    Ooooo0o(localPopBackStackState, false);
  }
  
  public void o0000O00(FragmentStateManager paramFragmentStateManager)
  {
    Fragment localFragment = paramFragmentStateManager.getFragment();
    boolean bool = localFragment.mDeferStart;
    if (bool)
    {
      bool = this.OooO0O0;
      if (bool)
      {
        this.Oooo0o0 = true;
        return;
      }
      bool = false;
      localFragment.mDeferStart = false;
      paramFragmentStateManager.OooOO0o();
    }
  }
  
  public boolean o0000O0O()
  {
    return o0000O(null, -1, 0);
  }
  
  public void o0000OO(Bundle paramBundle, String paramString, Fragment paramFragment)
  {
    Object localObject1 = paramFragment.mFragmentManager;
    if (localObject1 != this)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("Fragment ");
      ((StringBuilder)localObject2).append(paramFragment);
      String str = " is not currently in the FragmentManager";
      ((StringBuilder)localObject2).append(str);
      localObject2 = ((StringBuilder)localObject2).toString();
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      o000Ooo((RuntimeException)localObject1);
    }
    paramFragment = paramFragment.mWho;
    paramBundle.putString(paramString, paramFragment);
  }
  
  public boolean o0000OO0(ArrayList paramArrayList1, ArrayList paramArrayList2, String paramString, int paramInt1, int paramInt2)
  {
    int i = 1;
    paramInt2 &= i;
    Object localObject;
    if (paramInt2 != 0)
    {
      paramInt2 = i;
    }
    else
    {
      paramInt2 = 0;
      localObject = null;
    }
    int j = o0OoOo0(paramString, paramInt1, paramInt2);
    if (j < 0) {
      return false;
    }
    ArrayList localArrayList = this.OooO0Oo;
    paramInt1 = localArrayList.size() - i;
    while (paramInt1 >= j)
    {
      localObject = (BackStackRecord)this.OooO0Oo.remove(paramInt1);
      paramArrayList1.add(localObject);
      localObject = Boolean.TRUE;
      paramArrayList2.add(localObject);
      paramInt1 += -1;
    }
    return i;
  }
  
  public void o0000OOO(FragmentManager.FragmentLifecycleCallbacks paramFragmentLifecycleCallbacks, boolean paramBoolean)
  {
    this.OooOOO.OooOOOO(paramFragmentLifecycleCallbacks, paramBoolean);
  }
  
  public void o0000OOo(Fragment paramFragment)
  {
    int i = isLoggingEnabled(2);
    Object localObject;
    if (i != 0)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("remove: ");
      ((StringBuilder)localObject).append(paramFragment);
      String str = " nesting=";
      ((StringBuilder)localObject).append(str);
      j = paramFragment.mBackStackNesting;
      ((StringBuilder)localObject).append(j);
    }
    i = paramFragment.isInBackStack();
    int j = 1;
    i ^= j;
    boolean bool = paramFragment.mDetached;
    if ((!bool) || (i != 0))
    {
      localObject = this.OooO0OO;
      ((FragmentStore)localObject).OooOOOo(paramFragment);
      i = o0O0O00(paramFragment);
      if (i != 0) {
        this.Oooo00o = j;
      }
      paramFragment.mRemoving = j;
      setVisibleRemovingFragment(paramFragment);
    }
  }
  
  public void o0000Oo(Fragment paramFragment)
  {
    this.Oooo.OooOOOO(paramFragment);
  }
  
  public final void o0000Oo0(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    boolean bool1 = paramArrayList1.isEmpty();
    if (bool1) {
      return;
    }
    int i = paramArrayList1.size();
    int j = paramArrayList2.size();
    if (i == j)
    {
      i = paramArrayList1.size();
      j = 0;
      int k = 0;
      while (j < i)
      {
        Object localObject = (BackStackRecord)paramArrayList1.get(j);
        boolean bool2 = ((FragmentTransaction)localObject).OooOOo;
        if (!bool2)
        {
          if (k != j) {
            Oooooo(paramArrayList1, paramArrayList2, k, j);
          }
          k = j + 1;
          localObject = (Boolean)paramArrayList2.get(j);
          bool2 = ((Boolean)localObject).booleanValue();
          if (bool2) {
            while (k < i)
            {
              localObject = (Boolean)paramArrayList2.get(k);
              bool2 = ((Boolean)localObject).booleanValue();
              if (!bool2) {
                break;
              }
              localObject = (BackStackRecord)paramArrayList1.get(k);
              bool2 = ((FragmentTransaction)localObject).OooOOo;
              if (bool2) {
                break;
              }
              k += 1;
            }
          }
          Oooooo(paramArrayList1, paramArrayList2, j, k);
          j = k + -1;
        }
        j += 1;
      }
      if (k != i) {
        Oooooo(paramArrayList1, paramArrayList2, k, i);
      }
      return;
    }
    paramArrayList1 = new java/lang/IllegalStateException;
    paramArrayList1.<init>("Internal error with the back stack records");
    throw paramArrayList1;
  }
  
  public final void o0000OoO()
  {
    ArrayList localArrayList = this.OooOOO0;
    if (localArrayList != null)
    {
      int i = 0;
      localArrayList = null;
      for (;;)
      {
        Object localObject = this.OooOOO0;
        int j = ((ArrayList)localObject).size();
        if (i >= j) {
          break;
        }
        localObject = (FragmentManager.OnBackStackChangedListener)this.OooOOO0.get(i);
        ((FragmentManager.OnBackStackChangedListener)localObject).OooO0OO();
        i += 1;
      }
    }
  }
  
  public void o0000Ooo(Fragment paramFragment, IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
  {
    FragmentManager localFragmentManager = this;
    Object localObject1 = paramFragment;
    Bundle localBundle = paramBundle;
    Object localObject2 = this.OooOooo;
    Object localObject3;
    Object localObject5;
    if (localObject2 != null)
    {
      int i = 2;
      if (paramBundle != null)
      {
        if (paramIntent == null)
        {
          localObject3 = new android/content/Intent;
          ((Intent)localObject3).<init>();
          localObject4 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
          boolean bool2 = true;
          ((Intent)localObject3).putExtra((String)localObject4, bool2);
        }
        else
        {
          localObject3 = paramIntent;
        }
        boolean bool3 = isLoggingEnabled(i);
        if (bool3)
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((StringBuilder)localObject4).append("ActivityOptions ");
          ((StringBuilder)localObject4).append(localBundle);
          ((StringBuilder)localObject4).append(" were added to fillInIntent ");
          ((StringBuilder)localObject4).append(localObject3);
          localObject5 = " for fragment ";
          ((StringBuilder)localObject4).append((String)localObject5);
          ((StringBuilder)localObject4).append(paramFragment);
        }
        localObject4 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";
        ((Intent)localObject3).putExtra((String)localObject4, localBundle);
      }
      else
      {
        localObject3 = paramIntent;
      }
      Object localObject4 = new androidx/activity/result/IntentSenderRequest$Builder;
      localObject5 = paramIntentSender;
      ((IntentSenderRequest.Builder)localObject4).<init>(paramIntentSender);
      localObject3 = ((IntentSenderRequest.Builder)localObject4).OooO0O0((Intent)localObject3).OooO0OO(paramInt3, paramInt2).OooO00o();
      localObject4 = new androidx/fragment/app/FragmentManager$LaunchedFragmentInfo;
      localObject5 = ((Fragment)localObject1).mWho;
      ((FragmentManager.LaunchedFragmentInfo)localObject4).<init>((String)localObject5, paramInt1);
      localObject5 = localFragmentManager.Oooo00O;
      ((ArrayDeque)localObject5).addLast(localObject4);
      boolean bool1 = isLoggingEnabled(i);
      if (bool1)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject4 = "Fragment ";
        ((StringBuilder)localObject2).append((String)localObject4);
        ((StringBuilder)localObject2).append(paramFragment);
        localObject1 = "is launching an IntentSender for result ";
        ((StringBuilder)localObject2).append((String)localObject1);
      }
      localObject2 = localFragmentManager.OooOooo;
      ((ActivityResultLauncher)localObject2).OooO00o(localObject3);
    }
    else
    {
      localObject5 = paramIntentSender;
      localObject2 = this.OooOo0O;
      localObject3 = paramIntentSender;
      int j = paramInt1;
      localObject5 = paramIntent;
      ((FragmentHostCallback)localObject2).OooOOo(paramFragment, paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
    }
  }
  
  public void o0000o0(String paramString)
  {
    FragmentManager.RestoreBackStackState localRestoreBackStackState = new androidx/fragment/app/FragmentManager$RestoreBackStackState;
    localRestoreBackStackState.<init>(this, paramString);
    Ooooo0o(localRestoreBackStackState, false);
  }
  
  public boolean o0000o0O(ArrayList paramArrayList1, ArrayList paramArrayList2, String paramString)
  {
    paramString = (BackStackState)this.OooOO0.remove(paramString);
    if (paramString == null) {
      return false;
    }
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject1 = paramArrayList1.iterator();
    boolean bool2;
    do
    {
      boolean bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = (BackStackRecord)((Iterator)localObject1).next();
      bool2 = ((BackStackRecord)localObject2).OooOo0o;
    } while (!bool2);
    Object localObject2 = ((FragmentTransaction)localObject2).OooO0OO.iterator();
    for (;;)
    {
      bool2 = ((Iterator)localObject2).hasNext();
      if (!bool2) {
        break;
      }
      Fragment localFragment = ((FragmentTransaction.Op)((Iterator)localObject2).next()).OooO0O0;
      if (localFragment != null)
      {
        String str = localFragment.mWho;
        localHashMap.put(str, localFragment);
      }
    }
    paramString = paramString.OooO00o(this, localHashMap).iterator();
    boolean bool3 = false;
    localHashMap = null;
    for (;;)
    {
      boolean bool4 = paramString.hasNext();
      if (!bool4) {
        break label206;
      }
      localObject1 = (BackStackRecord)paramString.next();
      bool4 = ((BackStackRecord)localObject1).OooO00o(paramArrayList1, paramArrayList2);
      if ((!bool4) && (!bool3)) {
        break;
      }
      bool3 = true;
    }
    label206:
    return bool3;
  }
  
  public void o0000o0o(Parcelable paramParcelable)
  {
    if (paramParcelable == null) {
      return;
    }
    paramParcelable = (Bundle)paramParcelable;
    Object localObject1 = paramParcelable.keySet().iterator();
    Object localObject3;
    boolean bool1;
    Object localObject4;
    for (;;)
    {
      i = ((Iterator)localObject1).hasNext();
      if (i == 0) {
        break;
      }
      localObject2 = (String)((Iterator)localObject1).next();
      localObject3 = "result_";
      bool1 = ((String)localObject2).startsWith((String)localObject3);
      if (bool1)
      {
        localObject3 = paramParcelable.getBundle((String)localObject2);
        if (localObject3 != null)
        {
          localObject4 = this.OooOo0O.getContext().getClassLoader();
          ((Bundle)localObject3).setClassLoader((ClassLoader)localObject4);
          int n = 7;
          localObject2 = ((String)localObject2).substring(n);
          localObject4 = this.OooOO0O;
          ((Map)localObject4).put(localObject2, localObject3);
        }
      }
    }
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    Object localObject2 = paramParcelable.keySet().iterator();
    Object localObject5;
    int i1;
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject3 = (String)((Iterator)localObject2).next();
      localObject4 = "fragment_";
      boolean bool3 = ((String)localObject3).startsWith((String)localObject4);
      if (bool3)
      {
        localObject4 = paramParcelable.getBundle((String)localObject3);
        if (localObject4 != null)
        {
          localObject5 = this.OooOo0O.getContext().getClassLoader();
          ((Bundle)localObject4).setClassLoader((ClassLoader)localObject5);
          i1 = 9;
          localObject3 = ((String)localObject3).substring(i1);
          ((HashMap)localObject1).put(localObject3, localObject4);
        }
      }
    }
    localObject2 = this.OooO0OO;
    ((FragmentStore)localObject2).OooOOoo((HashMap)localObject1);
    localObject1 = "state";
    paramParcelable = (FragmentManagerState)paramParcelable.getParcelable((String)localObject1);
    if (paramParcelable == null) {
      return;
    }
    this.OooO0OO.OooOOo0();
    localObject2 = paramParcelable.o00OoOoo.iterator();
    int i2;
    Object localObject6;
    int i3;
    Object localObject7;
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      localObject4 = "): ";
      i1 = 0;
      localObject5 = null;
      i2 = 2;
      if (!bool1) {
        break;
      }
      localObject3 = (String)((Iterator)localObject2).next();
      localObject6 = this.OooO0OO;
      localObject3 = ((FragmentStore)localObject6).OooOo0O((String)localObject3, null);
      if (localObject3 != null)
      {
        localObject5 = (FragmentState)((Bundle)localObject3).getParcelable((String)localObject1);
        localObject6 = this.Oooo;
        localObject5 = ((FragmentState)localObject5).o00Ooo00;
        localObject5 = ((FragmentManagerViewModel)localObject6).OooOO0O((String)localObject5);
        Object localObject8;
        if (localObject5 != null)
        {
          i3 = isLoggingEnabled(i2);
          if (i3 != 0)
          {
            localObject6 = new java/lang/StringBuilder;
            ((StringBuilder)localObject6).<init>();
            localObject7 = "restoreSaveState: re-attaching retained ";
            ((StringBuilder)localObject6).append((String)localObject7);
            ((StringBuilder)localObject6).append(localObject5);
          }
          localObject6 = new androidx/fragment/app/FragmentStateManager;
          localObject7 = this.OooOOO;
          localObject8 = this.OooO0OO;
          ((FragmentStateManager)localObject6).<init>((FragmentLifecycleCallbacksDispatcher)localObject7, (FragmentStore)localObject8, (Fragment)localObject5, (Bundle)localObject3);
        }
        else
        {
          localObject6 = new androidx/fragment/app/FragmentStateManager;
          localObject8 = this.OooOOO;
          FragmentStore localFragmentStore = this.OooO0OO;
          localObject5 = this.OooOo0O.getContext();
          ClassLoader localClassLoader = ((Context)localObject5).getClassLoader();
          FragmentFactory localFragmentFactory = getFragmentFactory();
          localObject7 = localObject6;
          ((FragmentStateManager)localObject6).<init>((FragmentLifecycleCallbacksDispatcher)localObject8, localFragmentStore, localClassLoader, localFragmentFactory, (Bundle)localObject3);
        }
        localObject5 = ((FragmentStateManager)localObject6).getFragment();
        ((Fragment)localObject5).mSavedFragmentState = ((Bundle)localObject3);
        ((Fragment)localObject5).mFragmentManager = this;
        bool1 = isLoggingEnabled(i2);
        if (bool1)
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          ((StringBuilder)localObject3).append("restoreSaveState: active (");
          String str = ((Fragment)localObject5).mWho;
          ((StringBuilder)localObject3).append(str);
          ((StringBuilder)localObject3).append((String)localObject4);
          ((StringBuilder)localObject3).append(localObject5);
        }
        localObject3 = this.OooOo0O.getContext().getClassLoader();
        ((FragmentStateManager)localObject6).OooOOO((ClassLoader)localObject3);
        localObject3 = this.OooO0OO;
        ((FragmentStore)localObject3).OooOOO0((FragmentStateManager)localObject6);
        int k = this.OooOo0;
        ((FragmentStateManager)localObject6).setFragmentManagerState(k);
      }
    }
    localObject1 = this.Oooo.getRetainedFragments().iterator();
    for (;;)
    {
      i = ((Iterator)localObject1).hasNext();
      if (i == 0) {
        break;
      }
      localObject2 = (Fragment)((Iterator)localObject1).next();
      localObject3 = this.OooO0OO;
      localObject6 = ((Fragment)localObject2).mWho;
      boolean bool2 = ((FragmentStore)localObject3).OooO0OO((String)localObject6);
      if (!bool2)
      {
        bool2 = isLoggingEnabled(i2);
        if (bool2)
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          ((StringBuilder)localObject3).append("Discarding retained Fragment ");
          ((StringBuilder)localObject3).append(localObject2);
          ((StringBuilder)localObject3).append(" that was not found in the set of active Fragments ");
          localObject6 = paramParcelable.o00OoOoo;
          ((StringBuilder)localObject3).append(localObject6);
        }
        this.Oooo.OooOOOO((Fragment)localObject2);
        ((Fragment)localObject2).mFragmentManager = this;
        localObject3 = new androidx/fragment/app/FragmentStateManager;
        localObject6 = this.OooOOO;
        localObject7 = this.OooO0OO;
        ((FragmentStateManager)localObject3).<init>((FragmentLifecycleCallbacksDispatcher)localObject6, (FragmentStore)localObject7, (Fragment)localObject2);
        i3 = 1;
        ((FragmentStateManager)localObject3).setFragmentManagerState(i3);
        ((FragmentStateManager)localObject3).OooOO0o();
        ((Fragment)localObject2).mRemoving = i3;
        ((FragmentStateManager)localObject3).OooOO0o();
      }
    }
    localObject1 = this.OooO0OO;
    localObject2 = paramParcelable.o00Ooo00;
    ((FragmentStore)localObject1).OooOOo((List)localObject2);
    localObject1 = paramParcelable.o00Ooo0;
    int i = 0;
    localObject2 = null;
    if (localObject1 != null)
    {
      localObject1 = new java/util/ArrayList;
      localObject3 = paramParcelable.o00Ooo0;
      m = localObject3.length;
      ((ArrayList)localObject1).<init>(m);
      this.OooO0Oo = ((ArrayList)localObject1);
      int i5 = 0;
      localObject1 = null;
      for (;;)
      {
        localObject3 = paramParcelable.o00Ooo0;
        i1 = localObject3.length;
        if (i5 >= i1) {
          break;
        }
        localObject3 = localObject3[i5].OooO0OO(this);
        boolean bool4 = isLoggingEnabled(i2);
        if (bool4)
        {
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          ((StringBuilder)localObject5).append("restoreAllState: back stack #");
          ((StringBuilder)localObject5).append(i5);
          ((StringBuilder)localObject5).append(" (index ");
          int i4 = ((BackStackRecord)localObject3).OooOo0O;
          ((StringBuilder)localObject5).append(i4);
          ((StringBuilder)localObject5).append((String)localObject4);
          ((StringBuilder)localObject5).append(localObject3);
          localObject5 = new androidx/fragment/app/LogWriter;
          ((LogWriter)localObject5).<init>("FragmentManager");
          localObject6 = new java/io/PrintWriter;
          ((PrintWriter)localObject6).<init>((Writer)localObject5);
          localObject5 = "  ";
          ((BackStackRecord)localObject3).OooOooo((String)localObject5, (PrintWriter)localObject6, false);
          ((PrintWriter)localObject6).close();
        }
        localObject5 = this.OooO0Oo;
        ((ArrayList)localObject5).add(localObject3);
        i5 += 1;
      }
    }
    this.OooO0Oo = null;
    localObject1 = this.OooO;
    int m = paramParcelable.o00Ooo0O;
    ((AtomicInteger)localObject1).set(m);
    localObject1 = paramParcelable.o00Ooo0o;
    if (localObject1 != null)
    {
      localObject1 = Ooooooo((String)localObject1);
      this.OooOoO0 = ((Fragment)localObject1);
      Oooo((Fragment)localObject1);
    }
    localObject1 = paramParcelable.o00OooO0;
    if (localObject1 != null) {
      for (;;)
      {
        m = ((ArrayList)localObject1).size();
        if (i >= m) {
          break;
        }
        localObject3 = this.OooOO0;
        localObject4 = (String)((ArrayList)localObject1).get(i);
        localObject5 = (BackStackState)paramParcelable.o00OooO.get(i);
        ((Map)localObject3).put(localObject4, localObject5);
        int j;
        i += 1;
      }
    }
    localObject1 = new java/util/ArrayDeque;
    paramParcelable = paramParcelable.o00OooOO;
    ((ArrayDeque)localObject1).<init>(paramParcelable);
    this.Oooo00O = ((ArrayDeque)localObject1);
  }
  
  public void o0000oO(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramInt1 >= 0)
    {
      FragmentManager.PopBackStackState localPopBackStackState = new androidx/fragment/app/FragmentManager$PopBackStackState;
      localPopBackStackState.<init>(this, null, paramInt1, paramInt2);
      Ooooo0o(localPopBackStackState, paramBoolean);
      return;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Bad id: ");
    localStringBuilder.append(paramInt1);
    String str = localStringBuilder.toString();
    localIllegalArgumentException.<init>(str);
    throw localIllegalArgumentException;
  }
  
  public Bundle o0000oO0()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    o00ooo();
    Ooooo00();
    boolean bool1 = true;
    OooooOO(bool1);
    this.Oooo0 = bool1;
    this.Oooo.setIsStateSaved(bool1);
    Object localObject1 = this.OooO0OO.OooOo00();
    HashMap localHashMap = this.OooO0OO.getAllSavedState();
    boolean bool2 = localHashMap.isEmpty();
    int j = 2;
    if (bool2)
    {
      isLoggingEnabled(j);
    }
    else
    {
      Object localObject2 = this.OooO0OO.OooOo0();
      Object localObject3 = this.OooO0Oo;
      if (localObject3 != null)
      {
        int k = ((ArrayList)localObject3).size();
        if (k > 0)
        {
          arrayOfBackStackRecordState = new BackStackRecordState[k];
          int m = 0;
          while (m < k)
          {
            Object localObject4 = new androidx/fragment/app/BackStackRecordState;
            Object localObject5 = (BackStackRecord)this.OooO0Oo.get(m);
            ((BackStackRecordState)localObject4).<init>((BackStackRecord)localObject5);
            arrayOfBackStackRecordState[m] = localObject4;
            boolean bool3 = isLoggingEnabled(j);
            if (bool3)
            {
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>();
              ((StringBuilder)localObject4).append("saveAllState: adding back stack #");
              ((StringBuilder)localObject4).append(m);
              ((StringBuilder)localObject4).append(": ");
              localObject5 = this.OooO0Oo.get(m);
              ((StringBuilder)localObject4).append(localObject5);
            }
            m += 1;
          }
        }
      }
      BackStackRecordState[] arrayOfBackStackRecordState = null;
      Object localObject6 = new androidx/fragment/app/FragmentManagerState;
      ((FragmentManagerState)localObject6).<init>();
      ((FragmentManagerState)localObject6).o00OoOoo = ((ArrayList)localObject1);
      ((FragmentManagerState)localObject6).o00Ooo00 = ((ArrayList)localObject2);
      ((FragmentManagerState)localObject6).o00Ooo0 = arrayOfBackStackRecordState;
      int i = this.OooO.get();
      ((FragmentManagerState)localObject6).o00Ooo0O = i;
      localObject1 = this.OooOoO0;
      if (localObject1 != null)
      {
        localObject1 = ((Fragment)localObject1).mWho;
        ((FragmentManagerState)localObject6).o00Ooo0o = ((String)localObject1);
      }
      localObject1 = ((FragmentManagerState)localObject6).o00OooO0;
      localObject2 = this.OooOO0.keySet();
      ((ArrayList)localObject1).addAll((Collection)localObject2);
      localObject1 = ((FragmentManagerState)localObject6).o00OooO;
      localObject2 = this.OooOO0.values();
      ((ArrayList)localObject1).addAll((Collection)localObject2);
      localObject1 = new java/util/ArrayList;
      localObject2 = this.Oooo00O;
      ((ArrayList)localObject1).<init>((Collection)localObject2);
      ((FragmentManagerState)localObject6).o00OooOO = ((ArrayList)localObject1);
      localBundle.putParcelable("state", (Parcelable)localObject6);
      localObject1 = this.OooOO0O.keySet().iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject1).hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = (String)((Iterator)localObject1).next();
        localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        ((StringBuilder)localObject6).append("result_");
        ((StringBuilder)localObject6).append((String)localObject2);
        localObject6 = ((StringBuilder)localObject6).toString();
        localObject3 = this.OooOO0O;
        localObject2 = (Bundle)((Map)localObject3).get(localObject2);
        localBundle.putBundle((String)localObject6, (Bundle)localObject2);
      }
      localObject1 = localHashMap.keySet().iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject1).hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = (String)((Iterator)localObject1).next();
        localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        localObject3 = "fragment_";
        ((StringBuilder)localObject6).append((String)localObject3);
        ((StringBuilder)localObject6).append((String)localObject2);
        localObject6 = ((StringBuilder)localObject6).toString();
        localObject2 = (Bundle)localHashMap.get(localObject2);
        localBundle.putBundle((String)localObject6, (Bundle)localObject2);
      }
    }
    return localBundle;
  }
  
  public void o0000oOO(String paramString)
  {
    FragmentManager.SaveBackStackState localSaveBackStackState = new androidx/fragment/app/FragmentManager$SaveBackStackState;
    localSaveBackStackState.<init>(this, paramString);
    Ooooo0o(localSaveBackStackState, false);
  }
  
  public boolean o0000oOo(ArrayList paramArrayList1, ArrayList paramArrayList2, String paramString)
  {
    FragmentManager localFragmentManager = this;
    String str = paramString;
    int i = 1;
    int j = o0OoOo0(paramString, -1, i);
    if (j < 0) {
      return false;
    }
    int k = j;
    Object localObject3;
    Object localObject4;
    for (;;)
    {
      localObject1 = localFragmentManager.OooO0Oo;
      m = ((ArrayList)localObject1).size();
      localObject2 = "saveBackStack(\"";
      if (k >= m) {
        break;
      }
      localObject1 = (BackStackRecord)localFragmentManager.OooO0Oo.get(k);
      boolean bool1 = ((FragmentTransaction)localObject1).OooOOo;
      if (!bool1)
      {
        localObject3 = new java/lang/IllegalArgumentException;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((StringBuilder)localObject4).append((String)localObject2);
        ((StringBuilder)localObject4).append(str);
        localObject2 = "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found ";
        ((StringBuilder)localObject4).append((String)localObject2);
        ((StringBuilder)localObject4).append(localObject1);
        ((StringBuilder)localObject4).append(" that did not use setReorderingAllowed(true).");
        localObject1 = ((StringBuilder)localObject4).toString();
        ((IllegalArgumentException)localObject3).<init>((String)localObject1);
        localFragmentManager.o000Ooo((RuntimeException)localObject3);
      }
      k += 1;
    }
    Object localObject5 = new java/util/HashSet;
    ((HashSet)localObject5).<init>();
    int m = j;
    Object localObject6;
    Object localObject7;
    for (;;)
    {
      localObject3 = localFragmentManager.OooO0Oo;
      int n = ((ArrayList)localObject3).size();
      if (m >= n) {
        break;
      }
      localObject3 = (BackStackRecord)localFragmentManager.OooO0Oo.get(m);
      localObject4 = new java/util/HashSet;
      ((HashSet)localObject4).<init>();
      localObject6 = new java/util/HashSet;
      ((HashSet)localObject6).<init>();
      localObject7 = ((FragmentTransaction)localObject3).OooO0OO.iterator();
      Object localObject8;
      Object localObject9;
      for (;;)
      {
        boolean bool3 = ((Iterator)localObject7).hasNext();
        if (!bool3) {
          break;
        }
        localObject8 = (FragmentTransaction.Op)((Iterator)localObject7).next();
        localObject9 = ((FragmentTransaction.Op)localObject8).OooO0O0;
        if (localObject9 != null)
        {
          boolean bool4 = ((FragmentTransaction.Op)localObject8).OooO0OO;
          int i5 = 2;
          if (bool4)
          {
            int i4 = ((FragmentTransaction.Op)localObject8).OooO00o;
            if ((i4 != i) && (i4 != i5))
            {
              int i6 = 8;
              if (i4 != i6) {
                break label358;
              }
            }
          }
          ((HashSet)localObject5).add(localObject9);
          ((HashSet)localObject4).add(localObject9);
          label358:
          int i2 = ((FragmentTransaction.Op)localObject8).OooO00o;
          if ((i2 == i) || (i2 == i5)) {
            ((HashSet)localObject6).add(localObject9);
          }
        }
      }
      ((AbstractCollection)localObject4).removeAll((Collection)localObject6);
      boolean bool5 = ((HashSet)localObject4).isEmpty();
      if (!bool5)
      {
        localObject6 = new java/lang/IllegalArgumentException;
        localObject7 = new java/lang/StringBuilder;
        ((StringBuilder)localObject7).<init>();
        ((StringBuilder)localObject7).append((String)localObject2);
        ((StringBuilder)localObject7).append(str);
        localObject8 = "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment";
        ((StringBuilder)localObject7).append((String)localObject8);
        int i3 = ((HashSet)localObject4).size();
        if (i3 == i)
        {
          localObject8 = new java/lang/StringBuilder;
          ((StringBuilder)localObject8).<init>();
          localObject9 = " ";
          ((StringBuilder)localObject8).append((String)localObject9);
          localObject4 = ((HashSet)localObject4).iterator().next();
        }
        else
        {
          localObject8 = new java/lang/StringBuilder;
          ((StringBuilder)localObject8).<init>();
          localObject9 = "s ";
          ((StringBuilder)localObject8).append((String)localObject9);
        }
        ((StringBuilder)localObject8).append(localObject4);
        localObject4 = ((StringBuilder)localObject8).toString();
        ((StringBuilder)localObject7).append((String)localObject4);
        localObject4 = " in ";
        ((StringBuilder)localObject7).append((String)localObject4);
        ((StringBuilder)localObject7).append(localObject3);
        ((StringBuilder)localObject7).append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
        localObject3 = ((StringBuilder)localObject7).toString();
        ((IllegalArgumentException)localObject6).<init>((String)localObject3);
        localFragmentManager.o000Ooo((RuntimeException)localObject6);
      }
      m += 1;
    }
    Object localObject1 = new java/util/ArrayDeque;
    ((ArrayDeque)localObject1).<init>((Collection)localObject5);
    boolean bool2 = ((ArrayDeque)localObject1).isEmpty();
    if (!bool2)
    {
      localObject3 = (Fragment)((ArrayDeque)localObject1).removeFirst();
      boolean bool6 = ((Fragment)localObject3).mRetainInstance;
      if (bool6)
      {
        localObject4 = new java/lang/IllegalArgumentException;
        localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        ((StringBuilder)localObject6).append((String)localObject2);
        ((StringBuilder)localObject6).append(str);
        localObject7 = "\") must not contain retained fragments. Found ";
        ((StringBuilder)localObject6).append((String)localObject7);
        boolean bool7 = ((HashSet)localObject5).contains(localObject3);
        if (bool7) {
          localObject7 = "direct reference to retained ";
        } else {
          localObject7 = "retained child ";
        }
        ((StringBuilder)localObject6).append((String)localObject7);
        localObject7 = "fragment ";
        ((StringBuilder)localObject6).append((String)localObject7);
        ((StringBuilder)localObject6).append(localObject3);
        localObject6 = ((StringBuilder)localObject6).toString();
        ((IllegalArgumentException)localObject4).<init>((String)localObject6);
        localFragmentManager.o000Ooo((RuntimeException)localObject4);
      }
      localObject3 = ((Fragment)localObject3).mChildFragmentManager.getActiveFragments().iterator();
      for (;;)
      {
        bool6 = ((Iterator)localObject3).hasNext();
        if (!bool6) {
          break;
        }
        localObject4 = (Fragment)((Iterator)localObject3).next();
        if (localObject4 != null) {
          ((ArrayDeque)localObject1).addLast(localObject4);
        }
      }
    }
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    localObject5 = ((HashSet)localObject5).iterator();
    for (;;)
    {
      boolean bool8 = ((Iterator)localObject5).hasNext();
      if (!bool8) {
        break;
      }
      localObject2 = ((Fragment)((Iterator)localObject5).next()).mWho;
      ((ArrayList)localObject1).add(localObject2);
    }
    localObject5 = new java/util/ArrayList;
    Object localObject2 = localFragmentManager.OooO0Oo;
    int i8 = ((ArrayList)localObject2).size() - j;
    ((ArrayList)localObject5).<init>(i8);
    i8 = j;
    for (;;)
    {
      localObject3 = localFragmentManager.OooO0Oo;
      int i1 = ((ArrayList)localObject3).size();
      if (i8 >= i1) {
        break;
      }
      i1 = 0;
      localObject3 = null;
      ((ArrayList)localObject5).add(null);
      i8 += 1;
    }
    localObject2 = new androidx/fragment/app/BackStackState;
    ((BackStackState)localObject2).<init>((List)localObject1, (List)localObject5);
    localObject1 = localFragmentManager.OooO0Oo;
    m = ((ArrayList)localObject1).size() - i;
    while (m >= j)
    {
      localObject3 = (BackStackRecord)localFragmentManager.OooO0Oo.remove(m);
      localObject4 = new androidx/fragment/app/BackStackRecord;
      ((BackStackRecord)localObject4).<init>((BackStackRecord)localObject3);
      ((BackStackRecord)localObject4).OooOoo0();
      localObject6 = new androidx/fragment/app/BackStackRecordState;
      ((BackStackRecordState)localObject6).<init>((BackStackRecord)localObject4);
      int i7 = m - j;
      ((ArrayList)localObject5).set(i7, localObject6);
      ((BackStackRecord)localObject3).OooOo0o = i;
      localObject4 = paramArrayList1;
      paramArrayList1.add(localObject3);
      localObject3 = Boolean.TRUE;
      localObject6 = paramArrayList2;
      paramArrayList2.add(localObject3);
      m += -1;
    }
    localFragmentManager.OooOO0.put(str, localObject2);
    return i;
  }
  
  public void o0000oo(int paramInt1, int paramInt2)
  {
    o0000oO(paramInt1, paramInt2, false);
  }
  
  public Fragment.SavedState o0000oo0(Fragment paramFragment)
  {
    Object localObject1 = this.OooO0OO;
    Object localObject2 = paramFragment.mWho;
    localObject1 = ((FragmentStore)localObject1).OooOO0O((String)localObject2);
    if (localObject1 != null)
    {
      localObject2 = ((FragmentStateManager)localObject1).getFragment();
      boolean bool = ((Fragment)localObject2).equals(paramFragment);
      if (bool) {}
    }
    else
    {
      localObject2 = new java/lang/IllegalStateException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = "Fragment ";
      localStringBuilder.append(str);
      localStringBuilder.append(paramFragment);
      localStringBuilder.append(" is not currently in the FragmentManager");
      paramFragment = localStringBuilder.toString();
      ((IllegalStateException)localObject2).<init>(paramFragment);
      o000Ooo((RuntimeException)localObject2);
    }
    return ((FragmentStateManager)localObject1).OooOOOo();
  }
  
  public void o0000ooO()
  {
    synchronized (this.OooO00o)
    {
      Object localObject1 = this.OooO00o;
      int i = ((ArrayList)localObject1).size();
      int j = 1;
      Runnable localRunnable;
      if (i != j)
      {
        j = 0;
        localRunnable = null;
      }
      if (j != 0)
      {
        localObject1 = this.OooOo0O;
        localObject1 = ((FragmentHostCallback)localObject1).getHandler();
        localRunnable = this.OoooO0;
        ((Handler)localObject1).removeCallbacks(localRunnable);
        localObject1 = this.OooOo0O;
        localObject1 = ((FragmentHostCallback)localObject1).getHandler();
        localRunnable = this.OoooO0;
        ((Handler)localObject1).post(localRunnable);
        o000Oo0();
      }
      return;
    }
  }
  
  public void o000O000(Fragment paramFragment, Lifecycle.State paramState)
  {
    Object localObject = paramFragment.mWho;
    localObject = Ooooooo((String)localObject);
    boolean bool = paramFragment.equals(localObject);
    if (bool)
    {
      localObject = paramFragment.mHost;
      if (localObject != null)
      {
        localObject = paramFragment.mFragmentManager;
        if (localObject != this) {}
      }
      else
      {
        paramFragment.mMaxState = paramState;
        return;
      }
    }
    paramState = new java/lang/IllegalArgumentException;
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append("Fragment ");
    ((StringBuilder)localObject).append(paramFragment);
    ((StringBuilder)localObject).append(" is not an active fragment of FragmentManager ");
    ((StringBuilder)localObject).append(this);
    paramFragment = ((StringBuilder)localObject).toString();
    paramState.<init>(paramFragment);
    throw paramState;
  }
  
  public void o000O0O(FragmentManager.FragmentLifecycleCallbacks paramFragmentLifecycleCallbacks)
  {
    this.OooOOO.OooOOOo(paramFragmentLifecycleCallbacks);
  }
  
  public final void o000O0o()
  {
    Iterator localIterator = this.OooO0OO.getActiveFragmentStateManagers().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      FragmentStateManager localFragmentStateManager = (FragmentStateManager)localIterator.next();
      o0000O00(localFragmentStateManager);
    }
  }
  
  public boolean o000OO(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= 0) {
      return o0000O(null, paramInt1, paramInt2);
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Bad id: ");
    localStringBuilder.append(paramInt1);
    String str = localStringBuilder.toString();
    localIllegalArgumentException.<init>(str);
    throw localIllegalArgumentException;
  }
  
  public boolean o000OOo(Fragment paramFragment)
  {
    if (paramFragment == null) {
      return false;
    }
    return paramFragment.isHidden();
  }
  
  public final void o000Oo0()
  {
    synchronized (this.OooO00o)
    {
      Object localObject2 = this.OooO00o;
      boolean bool1 = ((ArrayList)localObject2).isEmpty();
      boolean bool3 = true;
      if (!bool1)
      {
        localObject2 = this.OooO0oo;
        ((OnBackPressedCallback)localObject2).setEnabled(bool3);
        return;
      }
      ??? = this.OooO0oo;
      int i = getBackStackEntryCount();
      if (i > 0)
      {
        localObject2 = this.OooOo;
        boolean bool2 = o000000O((Fragment)localObject2);
        if (bool2) {}
      }
      else
      {
        bool3 = false;
      }
      ((OnBackPressedCallback)???).setEnabled(bool3);
      return;
    }
  }
  
  public void o000OoO(Fragment paramFragment)
  {
    boolean bool = isLoggingEnabled(2);
    StringBuilder localStringBuilder;
    if (bool)
    {
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = "show: ";
      localStringBuilder.append(str);
      localStringBuilder.append(paramFragment);
    }
    bool = paramFragment.mHidden;
    if (bool)
    {
      localStringBuilder = null;
      paramFragment.mHidden = false;
      bool = paramFragment.mHiddenChanged ^ true;
      paramFragment.mHiddenChanged = bool;
    }
  }
  
  public final void o000Ooo(RuntimeException paramRuntimeException)
  {
    paramRuntimeException.getMessage();
    Object localObject = new androidx/fragment/app/LogWriter;
    ((LogWriter)localObject).<init>("FragmentManager");
    PrintWriter localPrintWriter = new java/io/PrintWriter;
    localPrintWriter.<init>((Writer)localObject);
    localObject = this.OooOo0O;
    String[] arrayOfString = null;
    String str = "  ";
    if (localObject != null) {}
    try
    {
      arrayOfString = new String[0];
      ((FragmentHostCallback)localObject).OooO0oo(str, null, localPrintWriter, arrayOfString);
    }
    catch (Exception localException)
    {
      label74:
      break label74;
    }
    localObject = new String[0];
    OoooOoo(str, null, localPrintWriter, (String[])localObject);
    throw paramRuntimeException;
  }
  
  public void o000oOoO()
  {
    this.Oooo0 = false;
    this.Oooo0O0 = false;
    this.Oooo.setIsStateSaved(false);
    OoooOOO(5);
  }
  
  public Fragment o00O0O(String paramString)
  {
    return this.OooO0OO.OooO0oo(paramString);
  }
  
  public Fragment o00Oo0(String paramString)
  {
    return this.OooO0OO.OooO(paramString);
  }
  
  public final FragmentManagerViewModel o00oO0O(Fragment paramFragment)
  {
    return this.Oooo.OooOO0o(paramFragment);
  }
  
  public final boolean o00oO0o(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    synchronized (this.OooO00o)
    {
      Object localObject1 = this.OooO00o;
      boolean bool1 = ((ArrayList)localObject1).isEmpty();
      int j = 0;
      if (bool1) {
        return false;
      }
      try
      {
        localObject1 = this.OooO00o;
        int i = ((ArrayList)localObject1).size();
        boolean bool2 = false;
        while (j < i)
        {
          Object localObject2 = this.OooO00o;
          localObject2 = ((ArrayList)localObject2).get(j);
          localObject2 = (FragmentManager.OpGenerator)localObject2;
          boolean bool3 = ((FragmentManager.OpGenerator)localObject2).OooO00o(paramArrayList1, paramArrayList2);
          bool2 |= bool3;
          j += 1;
        }
        paramArrayList1 = this.OooO00o;
        paramArrayList1.clear();
        paramArrayList1 = this.OooOo0O;
        paramArrayList1 = paramArrayList1.getHandler();
        paramArrayList2 = this.OoooO0;
        paramArrayList1.removeCallbacks(paramArrayList2);
        return bool2;
      }
      finally
      {
        paramArrayList2 = this.OooO00o;
        paramArrayList2.clear();
        paramArrayList2 = this.OooOo0O;
        paramArrayList2 = paramArrayList2.getHandler();
        localObject1 = this.OoooO0;
        paramArrayList2.removeCallbacks((Runnable)localObject1);
      }
    }
  }
  
  public final void o00ooo()
  {
    Iterator localIterator = OooOo().iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      SpecialEffectsController localSpecialEffectsController = (SpecialEffectsController)localIterator.next();
      localSpecialEffectsController.OooOOOO();
    }
  }
  
  public final boolean o0O0O00(Fragment paramFragment)
  {
    boolean bool1 = paramFragment.mHasMenu;
    if (bool1)
    {
      bool1 = paramFragment.mMenuVisible;
      if (bool1) {}
    }
    else
    {
      paramFragment = paramFragment.mChildFragmentManager;
      bool2 = paramFragment.OooOOo();
      if (!bool2) {
        break label37;
      }
    }
    boolean bool2 = true;
    return bool2;
    label37:
    bool2 = false;
    paramFragment = null;
    return bool2;
  }
  
  public void o0OO00O(Fragment paramFragment)
  {
    boolean bool1 = isLoggingEnabled(2);
    if (bool1)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = "hide: ";
      localStringBuilder.append(str);
      localStringBuilder.append(paramFragment);
    }
    bool1 = paramFragment.mHidden;
    if (!bool1)
    {
      bool1 = true;
      paramFragment.mHidden = bool1;
      boolean bool2 = paramFragment.mHiddenChanged;
      bool1 ^= bool2;
      paramFragment.mHiddenChanged = bool1;
      setVisibleRemovingFragment(paramFragment);
    }
  }
  
  public ViewModelStore o0OOO0o(Fragment paramFragment)
  {
    return this.Oooo.OooOOO(paramFragment);
  }
  
  public void o0Oo0oo()
  {
    OooooOO(true);
    Object localObject = this.OooO0oo;
    boolean bool = ((OnBackPressedCallback)localObject).isEnabled();
    if (bool)
    {
      o0000O0O();
    }
    else
    {
      localObject = this.OooO0oO;
      ((OnBackPressedDispatcher)localObject).OooO0o0();
    }
  }
  
  public final int o0OoOo0(String paramString, int paramInt, boolean paramBoolean)
  {
    ArrayList localArrayList = this.OooO0Oo;
    int i = -1;
    int j;
    if (localArrayList != null)
    {
      boolean bool1 = localArrayList.isEmpty();
      if (!bool1)
      {
        if ((paramString == null) && (paramInt < 0))
        {
          if (paramBoolean) {
            return 0;
          }
          return this.OooO0Oo.size() + -1;
        }
        localArrayList = this.OooO0Oo;
        int k = localArrayList.size() + -1;
        while (k >= 0)
        {
          BackStackRecord localBackStackRecord = (BackStackRecord)this.OooO0Oo.get(k);
          if (paramString != null)
          {
            String str1 = localBackStackRecord.getName();
            boolean bool2 = paramString.equals(str1);
            if (bool2) {
              break;
            }
          }
          if (paramInt >= 0)
          {
            int m = localBackStackRecord.OooOo0O;
            if (paramInt == m) {
              break;
            }
          }
          k += -1;
        }
        if (k < 0) {
          return k;
        }
        if (paramBoolean) {
          while (k > 0)
          {
            Object localObject = this.OooO0Oo;
            i = k + -1;
            localObject = (BackStackRecord)((ArrayList)localObject).get(i);
            if (paramString != null)
            {
              String str2 = ((BackStackRecord)localObject).getName();
              j = paramString.equals(str2);
              if (j != 0) {}
            }
            else
            {
              if (paramInt < 0) {
                break;
              }
              paramBoolean = ((BackStackRecord)localObject).OooOo0O;
              if (paramInt != paramBoolean) {
                break;
              }
            }
            k += -1;
          }
        }
        paramString = this.OooO0Oo;
        int n = paramString.size() + -1;
        if (k == n) {
          return j;
        }
        k += 1;
        return k;
      }
    }
    return j;
  }
  
  public Fragment o0ooOO0(Bundle paramBundle, String paramString)
  {
    paramBundle = paramBundle.getString(paramString);
    if (paramBundle == null) {
      return null;
    }
    Fragment localFragment = Ooooooo(paramBundle);
    if (localFragment == null)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = "Fragment no longer exists for key ";
      localStringBuilder.append(str);
      localStringBuilder.append(paramString);
      paramString = ": unique id ";
      localStringBuilder.append(paramString);
      localStringBuilder.append(paramBundle);
      paramBundle = localStringBuilder.toString();
      localIllegalStateException.<init>(paramBundle);
      o000Ooo(localIllegalStateException);
    }
    return localFragment;
  }
  
  public final ViewGroup o0ooOOo(Fragment paramFragment)
  {
    Object localObject = paramFragment.mContainer;
    if (localObject != null) {
      return localObject;
    }
    int i = paramFragment.mContainerId;
    if (i <= 0) {
      return null;
    }
    localObject = this.OooOo0o;
    boolean bool = ((FragmentContainer)localObject).OooO0o0();
    if (bool)
    {
      localObject = this.OooOo0o;
      int j = paramFragment.mContainerId;
      paramFragment = ((FragmentContainer)localObject).OooO0OO(j);
      bool = paramFragment instanceof ViewGroup;
      if (bool) {
        return (ViewGroup)paramFragment;
      }
    }
    return null;
  }
  
  public final Set oo000o(BackStackRecord paramBackStackRecord)
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    int i = 0;
    for (;;)
    {
      Object localObject = paramBackStackRecord.OooO0OO;
      int j = ((ArrayList)localObject).size();
      if (i >= j) {
        break;
      }
      localObject = ((FragmentTransaction.Op)paramBackStackRecord.OooO0OO.get(i)).OooO0O0;
      if (localObject != null)
      {
        boolean bool = paramBackStackRecord.OooO;
        if (bool) {
          localHashSet.add(localObject);
        }
      }
      i += 1;
    }
    return localHashSet;
  }
  
  public void oo0o0Oo(Fragment paramFragment)
  {
    boolean bool1 = paramFragment.mAdded;
    if (bool1)
    {
      boolean bool2 = o0O0O00(paramFragment);
      if (bool2)
      {
        bool2 = true;
        this.Oooo00o = bool2;
      }
    }
  }
  
  public Fragment ooOO(int paramInt)
  {
    return this.OooO0OO.OooO0oO(paramInt);
  }
  
  public void setFragmentFactory(FragmentFactory paramFragmentFactory)
  {
    this.OooOoO = paramFragmentFactory;
  }
  
  public void setPrimaryNavigationFragment(Fragment paramFragment)
  {
    if (paramFragment != null)
    {
      localObject = paramFragment.mWho;
      localObject = Ooooooo((String)localObject);
      boolean bool = paramFragment.equals(localObject);
      if (bool)
      {
        localObject = paramFragment.mHost;
        if (localObject != null)
        {
          localObject = paramFragment.mFragmentManager;
          if (localObject == this) {}
        }
      }
      else
      {
        localObject = new java/lang/IllegalArgumentException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Fragment ");
        localStringBuilder.append(paramFragment);
        localStringBuilder.append(" is not an active fragment of FragmentManager ");
        localStringBuilder.append(this);
        paramFragment = localStringBuilder.toString();
        ((IllegalArgumentException)localObject).<init>(paramFragment);
        throw ((Throwable)localObject);
      }
    }
    Object localObject = this.OooOoO0;
    this.OooOoO0 = paramFragment;
    Oooo((Fragment)localObject);
    paramFragment = this.OooOoO0;
    Oooo(paramFragment);
  }
  
  public void setSpecialEffectsControllerFactory(SpecialEffectsControllerFactory paramSpecialEffectsControllerFactory)
  {
    this.OooOoo0 = paramSpecialEffectsControllerFactory;
  }
  
  public void setStrictModePolicy(FragmentStrictMode.Policy paramPolicy)
  {
    this.OoooO00 = paramPolicy;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(128);
    localStringBuilder.append("FragmentManager{");
    int i = System.identityHashCode(this);
    Object localObject = Integer.toHexString(i);
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(" in ");
    localObject = this.OooOo;
    String str1 = "}";
    String str2 = "{";
    if (localObject != null)
    {
      localObject = localObject.getClass().getSimpleName();
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(str2);
    }
    for (localObject = this.OooOo;; localObject = this.OooOo0O)
    {
      i = System.identityHashCode(localObject);
      localObject = Integer.toHexString(i);
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(str1);
      break label162;
      localObject = this.OooOo0O;
      if (localObject == null) {
        break;
      }
      localObject = localObject.getClass().getSimpleName();
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(str2);
    }
    localObject = "null";
    localStringBuilder.append((String)localObject);
    label162:
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentManager
 * JD-Core Version:    0.7.0.1
 */
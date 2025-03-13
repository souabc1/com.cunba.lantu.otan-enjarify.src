package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.fragment.R.id;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistryController;
import java.util.Iterator;
import java.util.List;

class FragmentStateManager
{
  public final FragmentLifecycleCallbacksDispatcher OooO00o;
  public final FragmentStore OooO0O0;
  public final Fragment OooO0OO;
  public boolean OooO0Oo = false;
  public int OooO0o0;
  
  public FragmentStateManager(FragmentLifecycleCallbacksDispatcher paramFragmentLifecycleCallbacksDispatcher, FragmentStore paramFragmentStore, Fragment paramFragment)
  {
    this.OooO0o0 = -1;
    this.OooO00o = paramFragmentLifecycleCallbacksDispatcher;
    this.OooO0O0 = paramFragmentStore;
    this.OooO0OO = paramFragment;
  }
  
  public FragmentStateManager(FragmentLifecycleCallbacksDispatcher paramFragmentLifecycleCallbacksDispatcher, FragmentStore paramFragmentStore, Fragment paramFragment, Bundle paramBundle)
  {
    int i = -1;
    this.OooO0o0 = i;
    this.OooO00o = paramFragmentLifecycleCallbacksDispatcher;
    this.OooO0O0 = paramFragmentStore;
    this.OooO0OO = paramFragment;
    paramFragmentLifecycleCallbacksDispatcher = null;
    paramFragment.mSavedViewState = null;
    paramFragment.mSavedViewRegistryState = null;
    paramFragment.mBackStackNesting = 0;
    paramFragment.mInLayout = false;
    paramFragment.mAdded = false;
    paramFragmentStore = paramFragment.mTarget;
    if (paramFragmentStore != null) {
      paramFragmentStore = paramFragmentStore.mWho;
    } else {
      paramFragmentStore = null;
    }
    paramFragment.mTargetWho = paramFragmentStore;
    paramFragment.mTarget = null;
    paramFragment.mSavedFragmentState = paramBundle;
    paramFragmentLifecycleCallbacksDispatcher = paramBundle.getBundle("arguments");
    paramFragment.mArguments = paramFragmentLifecycleCallbacksDispatcher;
  }
  
  public FragmentStateManager(FragmentLifecycleCallbacksDispatcher paramFragmentLifecycleCallbacksDispatcher, FragmentStore paramFragmentStore, ClassLoader paramClassLoader, FragmentFactory paramFragmentFactory, Bundle paramBundle)
  {
    int i = -1;
    this.OooO0o0 = i;
    this.OooO00o = paramFragmentLifecycleCallbacksDispatcher;
    this.OooO0O0 = paramFragmentStore;
    paramFragmentLifecycleCallbacksDispatcher = ((FragmentState)paramBundle.getParcelable("state")).OooO00o(paramFragmentFactory, paramClassLoader);
    this.OooO0OO = paramFragmentLifecycleCallbacksDispatcher;
    paramFragmentLifecycleCallbacksDispatcher.mSavedFragmentState = paramBundle;
    paramFragmentStore = paramBundle.getBundle("arguments");
    if (paramFragmentStore != null) {
      paramFragmentStore.setClassLoader(paramClassLoader);
    }
    paramFragmentLifecycleCallbacksDispatcher.setArguments(paramFragmentStore);
    boolean bool = FragmentManager.isLoggingEnabled(2);
    if (bool)
    {
      paramFragmentStore = new java/lang/StringBuilder;
      paramFragmentStore.<init>();
      paramClassLoader = "Instantiated fragment ";
      paramFragmentStore.append(paramClassLoader);
      paramFragmentStore.append(paramFragmentLifecycleCallbacksDispatcher);
    }
  }
  
  public void OooO()
  {
    int i = 3;
    boolean bool2 = FragmentManager.isLoggingEnabled(i);
    if (bool2)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("movefrom ATTACHED: ");
      localFragment = this.OooO0OO;
      ((StringBuilder)localObject1).append(localFragment);
    }
    this.OooO0OO.performDetach();
    Object localObject1 = this.OooO00o;
    Fragment localFragment = this.OooO0OO;
    int j = 0;
    ((FragmentLifecycleCallbacksDispatcher)localObject1).OooO0o0(localFragment, false);
    localObject1 = this.OooO0OO;
    ((Fragment)localObject1).mState = -1;
    localFragment = null;
    ((Fragment)localObject1).mHost = null;
    ((Fragment)localObject1).mParentFragment = null;
    ((Fragment)localObject1).mFragmentManager = null;
    boolean bool3 = ((Fragment)localObject1).mRemoving;
    if (bool3)
    {
      bool2 = ((Fragment)localObject1).isInBackStack();
      if (!bool2) {
        j = 1;
      }
    }
    if (j == 0)
    {
      localObject1 = this.OooO0O0.getNonConfig();
      localFragment = this.OooO0OO;
      bool2 = ((FragmentManagerViewModel)localObject1).OooOOOo(localFragment);
      if (!bool2) {}
    }
    else
    {
      boolean bool1 = FragmentManager.isLoggingEnabled(i);
      if (bool1)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("initState called for fragment: ");
        localObject1 = this.OooO0OO;
        ((StringBuilder)localObject2).append(localObject1);
      }
      Object localObject2 = this.OooO0OO;
      ((Fragment)localObject2).initState();
    }
  }
  
  public void OooO00o()
  {
    boolean bool = FragmentManager.isLoggingEnabled(3);
    if (bool)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("moveto ACTIVITY_CREATED: ");
      localObject2 = this.OooO0OO;
      ((StringBuilder)localObject1).append(localObject2);
    }
    Object localObject1 = this.OooO0OO.mSavedFragmentState;
    if (localObject1 != null)
    {
      localObject2 = "savedInstanceState";
      localObject1 = ((Bundle)localObject1).getBundle((String)localObject2);
    }
    else
    {
      bool = false;
      localObject1 = null;
    }
    this.OooO0OO.performActivityCreated((Bundle)localObject1);
    Object localObject2 = this.OooO00o;
    Fragment localFragment = this.OooO0OO;
    ((FragmentLifecycleCallbacksDispatcher)localObject2).OooO00o(localFragment, (Bundle)localObject1, false);
  }
  
  public void OooO0O0()
  {
    Object localObject1 = FragmentManager.o00o0O(this.OooO0OO.mContainer);
    Object localObject2 = this.OooO0OO.getParentFragment();
    if (localObject1 != null)
    {
      boolean bool = ((Fragment)localObject1).equals(localObject2);
      if (!bool)
      {
        localObject2 = this.OooO0OO;
        int i = ((Fragment)localObject2).mContainerId;
        FragmentStrictMode.OooOOo0((Fragment)localObject2, (Fragment)localObject1, i);
      }
    }
    localObject1 = this.OooO0O0;
    localObject2 = this.OooO0OO;
    int j = ((FragmentStore)localObject1).OooOO0((Fragment)localObject2);
    localObject2 = this.OooO0OO;
    ViewGroup localViewGroup = ((Fragment)localObject2).mContainer;
    localObject2 = ((Fragment)localObject2).mView;
    localViewGroup.addView((View)localObject2, j);
  }
  
  public void OooO0OO()
  {
    boolean bool = FragmentManager.isLoggingEnabled(3);
    if (bool)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("moveto ATTACHED: ");
      localObject2 = this.OooO0OO;
      ((StringBuilder)localObject1).append(localObject2);
    }
    Object localObject1 = this.OooO0OO;
    Object localObject2 = ((Fragment)localObject1).mTarget;
    String str = " that does not belong to this FragmentManager!";
    Object localObject3 = " declared target fragment ";
    Object localObject4 = "Fragment ";
    Object localObject5 = null;
    if (localObject2 != null)
    {
      localObject1 = this.OooO0O0;
      localObject2 = ((Fragment)localObject2).mWho;
      localObject1 = ((FragmentStore)localObject1).OooOO0O((String)localObject2);
      if (localObject1 != null)
      {
        localObject2 = this.OooO0OO;
        str = ((Fragment)localObject2).mTarget.mWho;
        ((Fragment)localObject2).mTargetWho = str;
        ((Fragment)localObject2).mTarget = null;
        localObject5 = localObject1;
      }
      else
      {
        localObject1 = new java/lang/IllegalStateException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append((String)localObject4);
        localObject4 = this.OooO0OO;
        ((StringBuilder)localObject2).append(localObject4);
        ((StringBuilder)localObject2).append((String)localObject3);
        localObject3 = this.OooO0OO.mTarget;
        ((StringBuilder)localObject2).append(localObject3);
        ((StringBuilder)localObject2).append(str);
        localObject2 = ((StringBuilder)localObject2).toString();
        ((IllegalStateException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    else
    {
      localObject1 = ((Fragment)localObject1).mTargetWho;
      if (localObject1 != null)
      {
        localObject2 = this.OooO0O0;
        localObject5 = ((FragmentStore)localObject2).OooOO0O((String)localObject1);
        if (localObject5 == null)
        {
          localObject1 = new java/lang/IllegalStateException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append((String)localObject4);
          localObject4 = this.OooO0OO;
          ((StringBuilder)localObject2).append(localObject4);
          ((StringBuilder)localObject2).append((String)localObject3);
          localObject3 = this.OooO0OO.mTargetWho;
          ((StringBuilder)localObject2).append((String)localObject3);
          ((StringBuilder)localObject2).append(str);
          localObject2 = ((StringBuilder)localObject2).toString();
          ((IllegalStateException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
    }
    if (localObject5 != null) {
      ((FragmentStateManager)localObject5).OooOO0o();
    }
    localObject1 = this.OooO0OO;
    localObject2 = ((Fragment)localObject1).mFragmentManager.getHost();
    ((Fragment)localObject1).mHost = ((FragmentHostCallback)localObject2);
    localObject1 = this.OooO0OO;
    localObject2 = ((Fragment)localObject1).mFragmentManager.getParent();
    ((Fragment)localObject1).mParentFragment = ((Fragment)localObject2);
    localObject1 = this.OooO00o;
    localObject2 = this.OooO0OO;
    ((FragmentLifecycleCallbacksDispatcher)localObject1).OooO0oO((Fragment)localObject2, false);
    this.OooO0OO.performAttach();
    localObject1 = this.OooO00o;
    localObject2 = this.OooO0OO;
    ((FragmentLifecycleCallbacksDispatcher)localObject1).OooO0O0((Fragment)localObject2, false);
  }
  
  public int OooO0Oo()
  {
    Object localObject1 = this.OooO0OO;
    FragmentManager localFragmentManager = ((Fragment)localObject1).mFragmentManager;
    if (localFragmentManager == null) {
      return ((Fragment)localObject1).mState;
    }
    int i = this.OooO0o0;
    Object localObject2 = FragmentStateManager.2.OooO00o;
    localObject1 = ((Fragment)localObject1).mMaxState;
    int j = ((Enum)localObject1).ordinal();
    j = localObject2[j];
    int n = -1;
    int i1 = 5;
    int i2 = 3;
    int i3 = 4;
    int i4 = 2;
    int i5 = 1;
    if (j != i5) {
      if (j != i4)
      {
        if (j != i2)
        {
          if (j != i3)
          {
            i = Math.min(i, n);
          }
          else
          {
            j = 0;
            localObject1 = null;
            i = Math.min(i, 0);
          }
        }
        else {
          i = Math.min(i, i5);
        }
      }
      else {
        i = Math.min(i, i1);
      }
    }
    localObject1 = this.OooO0OO;
    boolean bool6 = ((Fragment)localObject1).mFromLayout;
    if (bool6)
    {
      bool6 = ((Fragment)localObject1).mInLayout;
      if (bool6)
      {
        j = this.OooO0o0;
        i = Math.max(j, i4);
        localObject1 = this.OooO0OO.mView;
        if (localObject1 != null)
        {
          localObject1 = ((View)localObject1).getParent();
          if (localObject1 == null) {
            i = Math.min(i, i4);
          }
        }
      }
      else
      {
        int i6 = this.OooO0o0;
        if (i6 < i3)
        {
          j = ((Fragment)localObject1).mState;
          i = Math.min(i, j);
        }
        else
        {
          i = Math.min(i, i5);
        }
      }
    }
    localObject1 = this.OooO0OO;
    boolean bool1 = ((Fragment)localObject1).mAdded;
    if (!bool1) {
      i = Math.min(i, i5);
    }
    localObject1 = this.OooO0OO;
    Object localObject3 = ((Fragment)localObject1).mContainer;
    if (localObject3 != null)
    {
      localObject1 = ((Fragment)localObject1).getParentFragmentManager();
      localObject1 = SpecialEffectsController.OooOOo0((ViewGroup)localObject3, (FragmentManager)localObject1).OooOOOo(this);
    }
    else
    {
      bool1 = false;
      localObject1 = null;
    }
    localObject3 = SpecialEffectsController.Operation.LifecycleImpact.o00Ooo00;
    if (localObject1 == localObject3)
    {
      int k = 6;
      i = Math.min(i, k);
    }
    else
    {
      localObject3 = SpecialEffectsController.Operation.LifecycleImpact.o00Ooo0;
      if (localObject1 == localObject3)
      {
        i = Math.max(i, i2);
      }
      else
      {
        localObject1 = this.OooO0OO;
        boolean bool5 = ((Fragment)localObject1).mRemoving;
        if (bool5)
        {
          boolean bool2 = ((Fragment)localObject1).isInBackStack();
          if (bool2) {
            i = Math.min(i, i5);
          } else {
            i = Math.min(i, n);
          }
        }
      }
    }
    localObject1 = this.OooO0OO;
    boolean bool4 = ((Fragment)localObject1).mDeferStart;
    if (bool4)
    {
      int m = ((Fragment)localObject1).mState;
      if (m < i1) {
        i = Math.min(i, i3);
      }
    }
    boolean bool3 = FragmentManager.isLoggingEnabled(i4);
    if (bool3)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("computeExpectedState() of ");
      ((StringBuilder)localObject1).append(i);
      ((StringBuilder)localObject1).append(" for ");
      localObject2 = this.OooO0OO;
      ((StringBuilder)localObject1).append(localObject2);
    }
    return i;
  }
  
  public void OooO0o()
  {
    Object localObject1 = this.OooO0OO;
    boolean bool1 = ((Fragment)localObject1).mFromLayout;
    if (bool1) {
      return;
    }
    int i = 3;
    boolean bool3 = FragmentManager.isLoggingEnabled(i);
    if (bool3)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("moveto CREATE_VIEW: ");
      localObject3 = this.OooO0OO;
      ((StringBuilder)localObject2).append(localObject3);
    }
    Object localObject2 = this.OooO0OO.mSavedFragmentState;
    int m = 0;
    Object localObject3 = null;
    float f;
    if (localObject2 != null)
    {
      localObject4 = "savedInstanceState";
      localObject2 = ((Bundle)localObject2).getBundle((String)localObject4);
    }
    else
    {
      bool3 = false;
      localObject2 = null;
      f = 0.0F;
    }
    Object localObject4 = this.OooO0OO.performGetLayoutInflater((Bundle)localObject2);
    Fragment localFragment = this.OooO0OO;
    Object localObject5 = localFragment.mContainer;
    if (localObject5 != null)
    {
      localObject3 = localObject5;
    }
    else
    {
      int i1 = localFragment.mContainerId;
      if (i1 != 0)
      {
        m = -1;
        if (i1 != m)
        {
          localObject3 = localFragment.mFragmentManager.getContainer();
          localFragment = this.OooO0OO;
          int i2 = localFragment.mContainerId;
          localObject3 = (ViewGroup)((FragmentContainer)localObject3).OooO0OO(i2);
          if (localObject3 == null)
          {
            localFragment = this.OooO0OO;
            boolean bool6 = localFragment.mRestored;
            if (!bool6)
            {
              try
              {
                localObject1 = localFragment.getResources();
                localObject2 = this.OooO0OO;
                int k = ((Fragment)localObject2).mContainerId;
                localObject1 = ((Resources)localObject1).getResourceName(k);
              }
              catch (Resources.NotFoundException localNotFoundException)
              {
                localObject1 = "unknown";
              }
              localObject2 = new java/lang/IllegalArgumentException;
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              ((StringBuilder)localObject3).append("No view found for id 0x");
              localObject4 = Integer.toHexString(this.OooO0OO.mContainerId);
              ((StringBuilder)localObject3).append((String)localObject4);
              ((StringBuilder)localObject3).append(" (");
              ((StringBuilder)localObject3).append((String)localObject1);
              ((StringBuilder)localObject3).append(") for fragment ");
              localObject1 = this.OooO0OO;
              ((StringBuilder)localObject3).append(localObject1);
              localObject1 = ((StringBuilder)localObject3).toString();
              ((IllegalArgumentException)localObject2).<init>((String)localObject1);
              throw ((Throwable)localObject2);
            }
          }
          else
          {
            boolean bool7 = localObject3 instanceof FragmentContainerView;
            if (!bool7)
            {
              localFragment = this.OooO0OO;
              FragmentStrictMode.OooOOOo(localFragment, (ViewGroup)localObject3);
            }
          }
        }
        else
        {
          localObject1 = new java/lang/IllegalArgumentException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append("Cannot create fragment ");
          localObject3 = this.OooO0OO;
          ((StringBuilder)localObject2).append(localObject3);
          ((StringBuilder)localObject2).append(" for a container view with no id");
          localObject2 = ((StringBuilder)localObject2).toString();
          ((IllegalArgumentException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
    }
    localFragment = this.OooO0OO;
    localFragment.mContainer = ((ViewGroup)localObject3);
    localFragment.performCreateView((LayoutInflater)localObject4, (ViewGroup)localObject3, (Bundle)localObject2);
    localObject4 = this.OooO0OO.mView;
    int i3 = 2;
    if (localObject4 != null)
    {
      boolean bool2 = FragmentManager.isLoggingEnabled(i);
      if (bool2)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("moveto VIEW_CREATED: ");
        localObject4 = this.OooO0OO;
        ((StringBuilder)localObject1).append(localObject4);
      }
      localObject1 = this.OooO0OO.mView;
      localObject4 = null;
      ((View)localObject1).setSaveFromParentEnabled(false);
      localObject1 = this.OooO0OO;
      localObject5 = ((Fragment)localObject1).mView;
      int i4 = R.id.fragment_container_view_tag;
      ((View)localObject5).setTag(i4, localObject1);
      if (localObject3 != null) {
        OooO0O0();
      }
      localObject1 = this.OooO0OO;
      boolean bool5 = ((Fragment)localObject1).mHidden;
      if (bool5)
      {
        localObject1 = ((Fragment)localObject1).mView;
        int n = 8;
        ((View)localObject1).setVisibility(n);
      }
      localObject1 = this.OooO0OO.mView;
      bool2 = ViewCompat.o000oOoO((View)localObject1);
      if (bool2)
      {
        localObject1 = this.OooO0OO.mView;
        ViewCompat.o00o0O((View)localObject1);
      }
      else
      {
        localObject1 = this.OooO0OO.mView;
        localObject3 = new androidx/fragment/app/FragmentStateManager$1;
        ((FragmentStateManager.1)localObject3).<init>(this, (View)localObject1);
        ((View)localObject1).addOnAttachStateChangeListener((View.OnAttachStateChangeListener)localObject3);
      }
      this.OooO0OO.performViewCreated();
      localObject1 = this.OooO00o;
      localObject3 = this.OooO0OO;
      localObject5 = ((Fragment)localObject3).mView;
      ((FragmentLifecycleCallbacksDispatcher)localObject1).OooOOO0((Fragment)localObject3, (View)localObject5, (Bundle)localObject2, false);
      localObject1 = this.OooO0OO.mView;
      int j = ((View)localObject1).getVisibility();
      f = this.OooO0OO.mView.getAlpha();
      this.OooO0OO.setPostOnViewCreatedAlpha(f);
      localObject2 = this.OooO0OO;
      localObject3 = ((Fragment)localObject2).mContainer;
      if ((localObject3 != null) && (j == 0))
      {
        localObject1 = ((Fragment)localObject2).mView.findFocus();
        if (localObject1 != null)
        {
          localObject2 = this.OooO0OO;
          ((Fragment)localObject2).setFocusedView((View)localObject1);
          bool4 = FragmentManager.isLoggingEnabled(i3);
          if (bool4)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject3 = "requestFocus: Saved focused view ";
            ((StringBuilder)localObject2).append((String)localObject3);
            ((StringBuilder)localObject2).append(localObject1);
            ((StringBuilder)localObject2).append(" for Fragment ");
            localObject1 = this.OooO0OO;
            ((StringBuilder)localObject2).append(localObject1);
          }
        }
        localObject1 = this.OooO0OO.mView;
        boolean bool4 = false;
        f = 0.0F;
        localObject2 = null;
        ((View)localObject1).setAlpha(0.0F);
      }
    }
    this.OooO0OO.mState = i3;
  }
  
  public void OooO0o0()
  {
    int i = FragmentManager.isLoggingEnabled(3);
    if (i != 0)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("moveto CREATED: ");
      localObject2 = this.OooO0OO;
      ((StringBuilder)localObject1).append(localObject2);
    }
    Object localObject1 = this.OooO0OO.mSavedFragmentState;
    if (localObject1 != null)
    {
      localObject2 = "savedInstanceState";
      localObject1 = ((Bundle)localObject1).getBundle((String)localObject2);
    }
    else
    {
      i = 0;
      localObject1 = null;
    }
    Object localObject2 = this.OooO0OO;
    boolean bool = ((Fragment)localObject2).mIsCreated;
    if (!bool)
    {
      this.OooO00o.OooO0oo((Fragment)localObject2, (Bundle)localObject1, false);
      this.OooO0OO.performCreate((Bundle)localObject1);
      localObject2 = this.OooO00o;
      Fragment localFragment = this.OooO0OO;
      ((FragmentLifecycleCallbacksDispatcher)localObject2).OooO0OO(localFragment, (Bundle)localObject1, false);
    }
    else
    {
      i = 1;
      ((Fragment)localObject2).mState = i;
      ((Fragment)localObject2).restoreChildFragmentState();
    }
  }
  
  public void OooO0oO()
  {
    boolean bool1 = FragmentManager.isLoggingEnabled(3);
    if (bool1)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("movefrom CREATED: ");
      localObject2 = this.OooO0OO;
      ((StringBuilder)localObject1).append(localObject2);
    }
    Object localObject1 = this.OooO0OO;
    boolean bool2 = ((Fragment)localObject1).mRemoving;
    boolean bool3 = true;
    boolean bool4 = false;
    Object localObject3 = null;
    if (bool2)
    {
      bool1 = ((Fragment)localObject1).isInBackStack();
      if (!bool1)
      {
        bool1 = bool3;
        break label80;
      }
    }
    bool1 = false;
    localObject1 = null;
    label80:
    bool2 = false;
    Object localObject2 = null;
    Object localObject4;
    boolean bool5;
    Object localObject5;
    if (bool1)
    {
      localObject4 = this.OooO0OO;
      bool5 = ((Fragment)localObject4).mBeingSaved;
      if (!bool5)
      {
        localObject5 = this.OooO0O0;
        localObject4 = ((Fragment)localObject4).mWho;
        ((FragmentStore)localObject5).OooOo0O((String)localObject4, null);
      }
    }
    if (!bool1)
    {
      localObject4 = this.OooO0O0.getNonConfig();
      localObject5 = this.OooO0OO;
      bool6 = ((FragmentManagerViewModel)localObject4).OooOOOo((Fragment)localObject5);
      if (!bool6)
      {
        bool6 = false;
        localObject4 = null;
        break label178;
      }
    }
    boolean bool6 = bool3;
    label178:
    if (bool6)
    {
      localObject4 = this.OooO0OO.mHost;
      bool5 = localObject4 instanceof ViewModelStoreOwner;
      if (bool5)
      {
        localObject6 = this.OooO0O0.getNonConfig();
        bool3 = ((FragmentManagerViewModel)localObject6).isCleared();
      }
      else
      {
        localObject5 = ((FragmentHostCallback)localObject4).getContext();
        bool5 = localObject5 instanceof Activity;
        if (bool5)
        {
          localObject4 = (Activity)((FragmentHostCallback)localObject4).getContext();
          bool6 = ((Activity)localObject4).isChangingConfigurations();
          bool3 ^= bool6;
        }
      }
      if (bool1)
      {
        localObject1 = this.OooO0OO;
        bool1 = ((Fragment)localObject1).mBeingSaved;
        if (!bool1) {}
      }
      else
      {
        if (!bool3) {
          break label309;
        }
      }
      localObject1 = this.OooO0O0.getNonConfig();
      Object localObject6 = this.OooO0OO;
      ((FragmentManagerViewModel)localObject1).OooO0oo((Fragment)localObject6);
      label309:
      this.OooO0OO.performDestroy();
      localObject1 = this.OooO00o;
      localObject6 = this.OooO0OO;
      ((FragmentLifecycleCallbacksDispatcher)localObject1).OooO0Oo((Fragment)localObject6, false);
      localObject1 = this.OooO0O0.getActiveFragmentStateManagers().iterator();
      for (;;)
      {
        bool3 = ((Iterator)localObject1).hasNext();
        if (!bool3) {
          break;
        }
        localObject6 = (FragmentStateManager)((Iterator)localObject1).next();
        if (localObject6 != null)
        {
          localObject6 = ((FragmentStateManager)localObject6).getFragment();
          localObject3 = this.OooO0OO.mWho;
          localObject4 = ((Fragment)localObject6).mTargetWho;
          bool4 = ((String)localObject3).equals(localObject4);
          if (bool4)
          {
            localObject3 = this.OooO0OO;
            ((Fragment)localObject6).mTarget = ((Fragment)localObject3);
            ((Fragment)localObject6).mTargetWho = null;
          }
        }
      }
      localObject1 = this.OooO0OO;
      localObject2 = ((Fragment)localObject1).mTargetWho;
      if (localObject2 != null)
      {
        localObject6 = this.OooO0O0;
        localObject2 = ((FragmentStore)localObject6).OooO0o((String)localObject2);
        ((Fragment)localObject1).mTarget = ((Fragment)localObject2);
      }
      localObject1 = this.OooO0O0;
      ((FragmentStore)localObject1).OooOOO(this);
    }
    else
    {
      localObject1 = this.OooO0OO.mTargetWho;
      if (localObject1 != null)
      {
        localObject2 = this.OooO0O0;
        localObject1 = ((FragmentStore)localObject2).OooO0o((String)localObject1);
        if (localObject1 != null)
        {
          bool2 = ((Fragment)localObject1).mRetainInstance;
          if (bool2)
          {
            localObject2 = this.OooO0OO;
            ((Fragment)localObject2).mTarget = ((Fragment)localObject1);
          }
        }
      }
      localObject1 = this.OooO0OO;
      ((Fragment)localObject1).mState = 0;
    }
  }
  
  public void OooO0oo()
  {
    boolean bool = FragmentManager.isLoggingEnabled(3);
    if (bool)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("movefrom CREATE_VIEW: ");
      localObject2 = this.OooO0OO;
      ((StringBuilder)localObject1).append(localObject2);
    }
    Object localObject1 = this.OooO0OO;
    Object localObject2 = ((Fragment)localObject1).mContainer;
    if (localObject2 != null)
    {
      localObject1 = ((Fragment)localObject1).mView;
      if (localObject1 != null) {
        ((ViewGroup)localObject2).removeView((View)localObject1);
      }
    }
    this.OooO0OO.performDestroyView();
    localObject1 = this.OooO00o;
    localObject2 = this.OooO0OO;
    ((FragmentLifecycleCallbacksDispatcher)localObject1).OooOOO((Fragment)localObject2, false);
    localObject1 = this.OooO0OO;
    ((Fragment)localObject1).mContainer = null;
    ((Fragment)localObject1).mView = null;
    ((Fragment)localObject1).mViewLifecycleOwner = null;
    ((Fragment)localObject1).mViewLifecycleOwnerLiveData.setValue(null);
    this.OooO0OO.mInLayout = false;
  }
  
  public void OooOO0()
  {
    Object localObject1 = this.OooO0OO;
    boolean bool1 = ((Fragment)localObject1).mFromLayout;
    if (bool1)
    {
      bool1 = ((Fragment)localObject1).mInLayout;
      if (bool1)
      {
        boolean bool2 = ((Fragment)localObject1).mPerformedCreateView;
        if (!bool2)
        {
          bool2 = FragmentManager.isLoggingEnabled(3);
          if (bool2)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            ((StringBuilder)localObject1).append("moveto CREATE_VIEW: ");
            localObject2 = this.OooO0OO;
            ((StringBuilder)localObject1).append(localObject2);
          }
          localObject1 = this.OooO0OO.mSavedFragmentState;
          bool1 = false;
          Object localObject2 = null;
          if (localObject1 != null)
          {
            localObject3 = "savedInstanceState";
            localObject1 = ((Bundle)localObject1).getBundle((String)localObject3);
          }
          else
          {
            bool2 = false;
            localObject1 = null;
          }
          Object localObject3 = this.OooO0OO;
          Object localObject4 = ((Fragment)localObject3).performGetLayoutInflater((Bundle)localObject1);
          ((Fragment)localObject3).performCreateView((LayoutInflater)localObject4, null, (Bundle)localObject1);
          localObject2 = this.OooO0OO.mView;
          if (localObject2 != null)
          {
            localObject3 = null;
            ((View)localObject2).setSaveFromParentEnabled(false);
            localObject2 = this.OooO0OO;
            localObject4 = ((Fragment)localObject2).mView;
            int j = R.id.fragment_container_view_tag;
            ((View)localObject4).setTag(j, localObject2);
            localObject2 = this.OooO0OO;
            boolean bool3 = ((Fragment)localObject2).mHidden;
            if (bool3)
            {
              localObject2 = ((Fragment)localObject2).mView;
              int k = 8;
              ((View)localObject2).setVisibility(k);
            }
            this.OooO0OO.performViewCreated();
            localObject2 = this.OooO00o;
            localObject4 = this.OooO0OO;
            View localView = ((Fragment)localObject4).mView;
            ((FragmentLifecycleCallbacksDispatcher)localObject2).OooOOO0((Fragment)localObject4, localView, (Bundle)localObject1, false);
            localObject1 = this.OooO0OO;
            int i = 2;
            ((Fragment)localObject1).mState = i;
          }
        }
      }
    }
  }
  
  public final boolean OooOO0O(View paramView)
  {
    View localView = this.OooO0OO.mView;
    boolean bool = true;
    if (paramView == localView) {
      return bool;
    }
    for (paramView = paramView.getParent(); paramView != null; paramView = paramView.getParent())
    {
      localView = this.OooO0OO.mView;
      if (paramView == localView) {
        return bool;
      }
    }
    return false;
  }
  
  public void OooOO0o()
  {
    boolean bool1 = this.OooO0Oo;
    int i = 2;
    Object localObject1;
    if (bool1)
    {
      bool1 = FragmentManager.isLoggingEnabled(i);
      if (bool1)
      {
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Ignoring re-entrant call to moveToExpectedState() for ");
        localObject1 = getFragment();
        localStringBuilder.append(localObject1);
      }
      return;
    }
    bool1 = false;
    StringBuilder localStringBuilder = null;
    int j = 1;
    try
    {
      this.OooO0Oo = j;
      int k = 0;
      Object localObject3 = null;
      Object localObject4;
      int n;
      int i1;
      boolean bool3;
      for (;;)
      {
        int m = OooO0Oo();
        localObject4 = this.OooO0OO;
        n = ((Fragment)localObject4).mState;
        i1 = 3;
        if (m == n) {
          break;
        }
        Object localObject5;
        if (m > n)
        {
          n += 1;
          switch (n)
          {
          default: 
            break;
          case 7: 
            OooOOOO();
            break;
          case 6: 
            k = 6;
            ((Fragment)localObject4).mState = k;
            break;
          case 5: 
            OooOOoo();
            break;
          case 4: 
            localObject3 = ((Fragment)localObject4).mView;
            if (localObject3 != null)
            {
              localObject3 = ((Fragment)localObject4).mContainer;
              if (localObject3 != null)
              {
                localObject5 = ((Fragment)localObject4).getParentFragmentManager();
                localObject3 = SpecialEffectsController.OooOOo0((ViewGroup)localObject3, (FragmentManager)localObject5);
                localObject5 = this.OooO0OO;
                localObject5 = ((Fragment)localObject5).mView;
                m = ((View)localObject5).getVisibility();
                localObject5 = SpecialEffectsController.Operation.State.OooO0Oo(m);
                ((SpecialEffectsController)localObject3).OooO0o((SpecialEffectsController.Operation.State)localObject5, this);
              }
            }
            localObject3 = this.OooO0OO;
            m = 4;
            ((Fragment)localObject3).mState = m;
            break;
          case 3: 
            OooO00o();
            break;
          case 2: 
            OooOO0();
            OooO0o();
            break;
          case 1: 
            OooO0o0();
            break;
          case 0: 
            OooO0OO();
            break;
          }
        }
        else
        {
          n += -1;
          switch (n)
          {
          default: 
            break;
          case 6: 
            OooOOO0();
            break;
          case 5: 
            k = 5;
            ((Fragment)localObject4).mState = k;
            break;
          case 4: 
            OooOo00();
            break;
          case 3: 
            bool3 = FragmentManager.isLoggingEnabled(i1);
            if (bool3)
            {
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject5 = "movefrom ACTIVITY_CREATED: ";
              ((StringBuilder)localObject3).append((String)localObject5);
              localObject5 = this.OooO0OO;
              ((StringBuilder)localObject3).append(localObject5);
            }
            localObject3 = this.OooO0OO;
            boolean bool4 = ((Fragment)localObject3).mBeingSaved;
            if (bool4)
            {
              localObject5 = this.OooO0O0;
              localObject3 = ((Fragment)localObject3).mWho;
              localObject4 = OooOOo0();
              ((FragmentStore)localObject5).OooOo0O((String)localObject3, (Bundle)localObject4);
            }
            else
            {
              localObject5 = ((Fragment)localObject3).mView;
              if (localObject5 != null)
              {
                localObject3 = ((Fragment)localObject3).mSavedViewState;
                if (localObject3 == null) {
                  OooOOo();
                }
              }
            }
            localObject3 = this.OooO0OO;
            localObject5 = ((Fragment)localObject3).mView;
            if (localObject5 != null)
            {
              localObject5 = ((Fragment)localObject3).mContainer;
              if (localObject5 != null)
              {
                localObject3 = ((Fragment)localObject3).getParentFragmentManager();
                localObject3 = SpecialEffectsController.OooOOo0((ViewGroup)localObject5, (FragmentManager)localObject3);
                ((SpecialEffectsController)localObject3).OooO0oo(this);
              }
            }
            localObject3 = this.OooO0OO;
            ((Fragment)localObject3).mState = i1;
            break;
          case 2: 
            ((Fragment)localObject4).mInLayout = false;
            ((Fragment)localObject4).mState = i;
            break;
          case 1: 
            OooO0oo();
            localObject3 = this.OooO0OO;
            ((Fragment)localObject3).mState = j;
            break;
          case 0: 
            bool3 = ((Fragment)localObject4).mBeingSaved;
            if (bool3)
            {
              localObject3 = this.OooO0O0;
              localObject5 = ((Fragment)localObject4).mWho;
              localObject3 = ((FragmentStore)localObject3).OooOO0o((String)localObject5);
              if (localObject3 == null)
              {
                localObject3 = this.OooO0O0;
                localObject5 = this.OooO0OO;
                localObject5 = ((Fragment)localObject5).mWho;
                localObject4 = OooOOo0();
                ((FragmentStore)localObject3).OooOo0O((String)localObject5, (Bundle)localObject4);
              }
            }
            OooO0oO();
            break;
          case -1: 
            OooO();
          }
        }
        bool3 = j;
      }
      Object localObject6;
      if (!bool3)
      {
        i = -1;
        if (n == i)
        {
          boolean bool2 = ((Fragment)localObject4).mRemoving;
          if (bool2)
          {
            bool2 = ((Fragment)localObject4).isInBackStack();
            if (!bool2)
            {
              localObject1 = this.OooO0OO;
              bool2 = ((Fragment)localObject1).mBeingSaved;
              if (!bool2)
              {
                bool2 = FragmentManager.isLoggingEnabled(i1);
                if (bool2)
                {
                  localObject1 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject1).<init>();
                  localObject6 = "Cleaning up state of never attached fragment: ";
                  ((StringBuilder)localObject1).append((String)localObject6);
                  localObject6 = this.OooO0OO;
                  ((StringBuilder)localObject1).append(localObject6);
                }
                localObject1 = this.OooO0O0;
                localObject1 = ((FragmentStore)localObject1).getNonConfig();
                localObject6 = this.OooO0OO;
                ((FragmentManagerViewModel)localObject1).OooO0oo((Fragment)localObject6);
                localObject1 = this.OooO0O0;
                ((FragmentStore)localObject1).OooOOO(this);
                bool2 = FragmentManager.isLoggingEnabled(i1);
                if (bool2)
                {
                  localObject1 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject1).<init>();
                  localObject6 = "initState called for fragment: ";
                  ((StringBuilder)localObject1).append((String)localObject6);
                  localObject6 = this.OooO0OO;
                  ((StringBuilder)localObject1).append(localObject6);
                }
                localObject1 = this.OooO0OO;
                ((Fragment)localObject1).initState();
              }
            }
          }
        }
      }
      localObject1 = this.OooO0OO;
      j = ((Fragment)localObject1).mHiddenChanged;
      if (j != 0)
      {
        localObject6 = ((Fragment)localObject1).mView;
        if (localObject6 != null)
        {
          localObject6 = ((Fragment)localObject1).mContainer;
          if (localObject6 != null)
          {
            localObject1 = ((Fragment)localObject1).getParentFragmentManager();
            localObject1 = SpecialEffectsController.OooOOo0((ViewGroup)localObject6, (FragmentManager)localObject1);
            localObject6 = this.OooO0OO;
            j = ((Fragment)localObject6).mHidden;
            if (j != 0) {
              ((SpecialEffectsController)localObject1).OooO0oO(this);
            } else {
              ((SpecialEffectsController)localObject1).OooO(this);
            }
          }
        }
        localObject1 = this.OooO0OO;
        localObject6 = ((Fragment)localObject1).mFragmentManager;
        if (localObject6 != null) {
          ((FragmentManager)localObject6).oo0o0Oo((Fragment)localObject1);
        }
        localObject1 = this.OooO0OO;
        ((Fragment)localObject1).mHiddenChanged = false;
        j = ((Fragment)localObject1).mHidden;
        ((Fragment)localObject1).onHiddenChanged(j);
        localObject1 = this.OooO0OO;
        localObject1 = ((Fragment)localObject1).mChildFragmentManager;
        ((FragmentManager)localObject1).Oooo0o();
      }
      return;
    }
    finally
    {
      this.OooO0Oo = false;
    }
  }
  
  public void OooOOO(ClassLoader paramClassLoader)
  {
    Object localObject1 = this.OooO0OO.mSavedFragmentState;
    if (localObject1 == null) {
      return;
    }
    ((Bundle)localObject1).setClassLoader(paramClassLoader);
    paramClassLoader = this.OooO0OO.mSavedFragmentState;
    localObject1 = "savedInstanceState";
    paramClassLoader = paramClassLoader.getBundle((String)localObject1);
    if (paramClassLoader == null)
    {
      paramClassLoader = this.OooO0OO.mSavedFragmentState;
      localObject2 = new android/os/Bundle;
      ((Bundle)localObject2).<init>();
      paramClassLoader.putBundle((String)localObject1, (Bundle)localObject2);
    }
    paramClassLoader = this.OooO0OO;
    localObject1 = paramClassLoader.mSavedFragmentState.getSparseParcelableArray("viewState");
    paramClassLoader.mSavedViewState = ((SparseArray)localObject1);
    paramClassLoader = this.OooO0OO;
    localObject1 = paramClassLoader.mSavedFragmentState;
    Object localObject2 = "viewRegistryState";
    localObject1 = ((Bundle)localObject1).getBundle((String)localObject2);
    paramClassLoader.mSavedViewRegistryState = ((Bundle)localObject1);
    paramClassLoader = this.OooO0OO.mSavedFragmentState;
    localObject1 = "state";
    paramClassLoader = (FragmentState)paramClassLoader.getParcelable((String)localObject1);
    if (paramClassLoader != null)
    {
      localObject1 = this.OooO0OO;
      localObject2 = paramClassLoader.o00Ooooo;
      ((Fragment)localObject1).mTargetWho = ((String)localObject2);
      int i = paramClassLoader.o00o0000;
      ((Fragment)localObject1).mTargetRequestCode = i;
      localObject2 = ((Fragment)localObject1).mSavedUserVisibleHint;
      boolean bool1;
      if (localObject2 != null)
      {
        bool1 = ((Boolean)localObject2).booleanValue();
        ((Fragment)localObject1).mUserVisibleHint = bool1;
        paramClassLoader = this.OooO0OO;
        bool2 = false;
        localObject1 = null;
        paramClassLoader.mSavedUserVisibleHint = null;
      }
      else
      {
        bool1 = paramClassLoader.o00o000;
        ((Fragment)localObject1).mUserVisibleHint = bool1;
      }
    }
    paramClassLoader = this.OooO0OO;
    boolean bool2 = paramClassLoader.mUserVisibleHint;
    if (!bool2)
    {
      bool2 = true;
      paramClassLoader.mDeferStart = bool2;
    }
  }
  
  public void OooOOO0()
  {
    boolean bool = FragmentManager.isLoggingEnabled(3);
    if (bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("movefrom RESUMED: ");
      localFragment = this.OooO0OO;
      ((StringBuilder)localObject).append(localFragment);
    }
    this.OooO0OO.performPause();
    Object localObject = this.OooO00o;
    Fragment localFragment = this.OooO0OO;
    ((FragmentLifecycleCallbacksDispatcher)localObject).OooO0o(localFragment, false);
  }
  
  public void OooOOOO()
  {
    boolean bool1 = FragmentManager.isLoggingEnabled(3);
    if (bool1)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("moveto RESUMED: ");
      Fragment localFragment = this.OooO0OO;
      ((StringBuilder)localObject1).append(localFragment);
    }
    Object localObject1 = this.OooO0OO.getFocusedView();
    if (localObject1 != null)
    {
      boolean bool2 = OooOO0O((View)localObject1);
      if (bool2)
      {
        bool2 = ((View)localObject1).requestFocus();
        boolean bool3 = FragmentManager.isLoggingEnabled(2);
        if (bool3)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          String str = "requestFocus: Restoring focused view ";
          ((StringBuilder)localObject2).append(str);
          ((StringBuilder)localObject2).append(localObject1);
          localObject1 = " ";
          ((StringBuilder)localObject2).append((String)localObject1);
          if (bool2) {
            localObject1 = "succeeded";
          } else {
            localObject1 = "failed";
          }
          ((StringBuilder)localObject2).append((String)localObject1);
          ((StringBuilder)localObject2).append(" on Fragment ");
          localObject1 = this.OooO0OO;
          ((StringBuilder)localObject2).append(localObject1);
          ((StringBuilder)localObject2).append(" resulting in focused view ");
          localObject1 = this.OooO0OO.mView.findFocus();
          ((StringBuilder)localObject2).append(localObject1);
        }
      }
    }
    this.OooO0OO.setFocusedView(null);
    this.OooO0OO.performResume();
    localObject1 = this.OooO00o;
    Object localObject2 = this.OooO0OO;
    ((FragmentLifecycleCallbacksDispatcher)localObject1).OooO((Fragment)localObject2, false);
    localObject1 = this.OooO0OO;
    ((Fragment)localObject1).mSavedFragmentState = null;
    ((Fragment)localObject1).mSavedViewState = null;
    ((Fragment)localObject1).mSavedViewRegistryState = null;
  }
  
  public Fragment.SavedState OooOOOo()
  {
    Object localObject = this.OooO0OO;
    int i = ((Fragment)localObject).mState;
    int j = -1;
    if (i > j)
    {
      localObject = new androidx/fragment/app/Fragment$SavedState;
      Bundle localBundle = OooOOo0();
      ((Fragment.SavedState)localObject).<init>(localBundle);
      return localObject;
    }
    return null;
  }
  
  public void OooOOo()
  {
    Object localObject1 = this.OooO0OO.mView;
    if (localObject1 == null) {
      return;
    }
    boolean bool1 = FragmentManager.isLoggingEnabled(2);
    if (bool1)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("Saving view state for fragment ");
      localObject2 = this.OooO0OO;
      ((StringBuilder)localObject1).append(localObject2);
      ((StringBuilder)localObject1).append(" with view ");
      localObject2 = this.OooO0OO.mView;
      ((StringBuilder)localObject1).append(localObject2);
    }
    localObject1 = new android/util/SparseArray;
    ((SparseArray)localObject1).<init>();
    Object localObject2 = this.OooO0OO.mView;
    ((View)localObject2).saveHierarchyState((SparseArray)localObject1);
    int i = ((SparseArray)localObject1).size();
    if (i > 0)
    {
      localObject2 = this.OooO0OO;
      ((Fragment)localObject2).mSavedViewState = ((SparseArray)localObject1);
    }
    localObject1 = new android/os/Bundle;
    ((Bundle)localObject1).<init>();
    localObject2 = this.OooO0OO.mViewLifecycleOwner;
    ((FragmentViewLifecycleOwner)localObject2).OooO0Oo((Bundle)localObject1);
    boolean bool2 = ((BaseBundle)localObject1).isEmpty();
    if (!bool2)
    {
      localObject2 = this.OooO0OO;
      ((Fragment)localObject2).mSavedViewRegistryState = ((Bundle)localObject1);
    }
  }
  
  public Bundle OooOOo0()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    Object localObject1 = this.OooO0OO;
    int i = ((Fragment)localObject1).mState;
    int j = -1;
    if (i == j)
    {
      localObject1 = ((Fragment)localObject1).mSavedFragmentState;
      if (localObject1 != null) {
        localBundle.putAll((Bundle)localObject1);
      }
    }
    localObject1 = new androidx/fragment/app/FragmentState;
    Object localObject2 = this.OooO0OO;
    ((FragmentState)localObject1).<init>((Fragment)localObject2);
    localObject2 = "state";
    localBundle.putParcelable((String)localObject2, (Parcelable)localObject1);
    localObject1 = this.OooO0OO;
    int k = ((Fragment)localObject1).mState;
    if (k > j)
    {
      localObject1 = new android/os/Bundle;
      ((Bundle)localObject1).<init>();
      localObject2 = this.OooO0OO;
      ((Fragment)localObject2).performSaveInstanceState((Bundle)localObject1);
      boolean bool = ((BaseBundle)localObject1).isEmpty();
      if (!bool)
      {
        localObject2 = "savedInstanceState";
        localBundle.putBundle((String)localObject2, (Bundle)localObject1);
      }
      localObject2 = this.OooO00o;
      Fragment localFragment = this.OooO0OO;
      ((FragmentLifecycleCallbacksDispatcher)localObject2).OooOO0(localFragment, (Bundle)localObject1, false);
      localObject1 = new android/os/Bundle;
      ((Bundle)localObject1).<init>();
      localObject2 = this.OooO0OO.mSavedStateRegistryController;
      ((SavedStateRegistryController)localObject2).OooO0Oo((Bundle)localObject1);
      bool = ((BaseBundle)localObject1).isEmpty();
      if (!bool)
      {
        localObject2 = "registryState";
        localBundle.putBundle((String)localObject2, (Bundle)localObject1);
      }
      localObject1 = this.OooO0OO.mChildFragmentManager.o0000oO0();
      bool = ((BaseBundle)localObject1).isEmpty();
      if (!bool)
      {
        localObject2 = "childFragmentManager";
        localBundle.putBundle((String)localObject2, (Bundle)localObject1);
      }
      localObject1 = this.OooO0OO.mView;
      if (localObject1 != null) {
        OooOOo();
      }
      localObject1 = this.OooO0OO.mSavedViewState;
      if (localObject1 != null)
      {
        localObject2 = "viewState";
        localBundle.putSparseParcelableArray((String)localObject2, (SparseArray)localObject1);
      }
      localObject1 = this.OooO0OO.mSavedViewRegistryState;
      if (localObject1 != null)
      {
        localObject2 = "viewRegistryState";
        localBundle.putBundle((String)localObject2, (Bundle)localObject1);
      }
    }
    localObject1 = this.OooO0OO.mArguments;
    if (localObject1 != null)
    {
      localObject2 = "arguments";
      localBundle.putBundle((String)localObject2, (Bundle)localObject1);
    }
    return localBundle;
  }
  
  public void OooOOoo()
  {
    boolean bool = FragmentManager.isLoggingEnabled(3);
    if (bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("moveto STARTED: ");
      localFragment = this.OooO0OO;
      ((StringBuilder)localObject).append(localFragment);
    }
    this.OooO0OO.performStart();
    Object localObject = this.OooO00o;
    Fragment localFragment = this.OooO0OO;
    ((FragmentLifecycleCallbacksDispatcher)localObject).OooOO0O(localFragment, false);
  }
  
  public void OooOo00()
  {
    boolean bool = FragmentManager.isLoggingEnabled(3);
    if (bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("movefrom STARTED: ");
      localFragment = this.OooO0OO;
      ((StringBuilder)localObject).append(localFragment);
    }
    this.OooO0OO.performStop();
    Object localObject = this.OooO00o;
    Fragment localFragment = this.OooO0OO;
    ((FragmentLifecycleCallbacksDispatcher)localObject).OooOO0o(localFragment, false);
  }
  
  public Fragment getFragment()
  {
    return this.OooO0OO;
  }
  
  public void setFragmentManagerState(int paramInt)
  {
    this.OooO0o0 = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentStateManager
 * JD-Core Version:    0.7.0.1
 */
package androidx.fragment.app.strictmode;

import OooO0O0.OooO00o;
import OooO0O0.OooO0O0;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentHostCallback;
import androidx.fragment.app.FragmentManager;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class FragmentStrictMode
{
  public static final FragmentStrictMode OooO00o;
  public static FragmentStrictMode.Policy OooO0O0 = FragmentStrictMode.Policy.OooO0o0;
  
  static
  {
    FragmentStrictMode localFragmentStrictMode = new androidx/fragment/app/strictmode/FragmentStrictMode;
    localFragmentStrictMode.<init>();
    OooO00o = localFragmentStrictMode;
  }
  
  public static final void OooO(Fragment paramFragment, ViewGroup paramViewGroup)
  {
    Intrinsics.OooO0o(paramFragment, "fragment");
    FragmentTagUsageViolation localFragmentTagUsageViolation = new androidx/fragment/app/strictmode/FragmentTagUsageViolation;
    localFragmentTagUsageViolation.<init>(paramFragment, paramViewGroup);
    paramViewGroup = OooO00o;
    paramViewGroup.OooO0oO(localFragmentTagUsageViolation);
    FragmentStrictMode.Policy localPolicy = paramViewGroup.OooO0OO(paramFragment);
    Object localObject = localPolicy.getFlags$fragment_release();
    FragmentStrictMode.Flag localFlag = FragmentStrictMode.Flag.o00Ooo0O;
    boolean bool1 = ((Set)localObject).contains(localFlag);
    if (bool1)
    {
      paramFragment = paramFragment.getClass();
      localObject = localFragmentTagUsageViolation.getClass();
      boolean bool2 = paramViewGroup.OooOOoo(localPolicy, paramFragment, (Class)localObject);
      if (bool2) {
        paramViewGroup.OooO0Oo(localPolicy, localFragmentTagUsageViolation);
      }
    }
  }
  
  public static final void OooO0o(String paramString, Violation paramViolation)
  {
    Intrinsics.OooO0o(paramViolation, "$violation");
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Policy violation with PENALTY_DEATH in ");
    localStringBuilder.append(paramString);
    throw paramViolation;
  }
  
  public static final void OooO0o0(FragmentStrictMode.Policy paramPolicy, Violation paramViolation)
  {
    Intrinsics.OooO0o(paramPolicy, "$policy");
    Intrinsics.OooO0o(paramViolation, "$violation");
    paramPolicy.getListener$fragment_release().OooO00o(paramViolation);
  }
  
  public static final void OooO0oo(Fragment paramFragment, String paramString)
  {
    Intrinsics.OooO0o(paramFragment, "fragment");
    Intrinsics.OooO0o(paramString, "previousFragmentId");
    FragmentReuseViolation localFragmentReuseViolation = new androidx/fragment/app/strictmode/FragmentReuseViolation;
    localFragmentReuseViolation.<init>(paramFragment, paramString);
    paramString = OooO00o;
    paramString.OooO0oO(localFragmentReuseViolation);
    FragmentStrictMode.Policy localPolicy = paramString.OooO0OO(paramFragment);
    Object localObject = localPolicy.getFlags$fragment_release();
    FragmentStrictMode.Flag localFlag = FragmentStrictMode.Flag.o00Ooo0;
    boolean bool1 = ((Set)localObject).contains(localFlag);
    if (bool1)
    {
      paramFragment = paramFragment.getClass();
      localObject = localFragmentReuseViolation.getClass();
      boolean bool2 = paramString.OooOOoo(localPolicy, paramFragment, (Class)localObject);
      if (bool2) {
        paramString.OooO0Oo(localPolicy, localFragmentReuseViolation);
      }
    }
  }
  
  public static final void OooOO0(Fragment paramFragment)
  {
    Intrinsics.OooO0o(paramFragment, "fragment");
    GetRetainInstanceUsageViolation localGetRetainInstanceUsageViolation = new androidx/fragment/app/strictmode/GetRetainInstanceUsageViolation;
    localGetRetainInstanceUsageViolation.<init>(paramFragment);
    FragmentStrictMode localFragmentStrictMode = OooO00o;
    localFragmentStrictMode.OooO0oO(localGetRetainInstanceUsageViolation);
    FragmentStrictMode.Policy localPolicy = localFragmentStrictMode.OooO0OO(paramFragment);
    Object localObject = localPolicy.getFlags$fragment_release();
    FragmentStrictMode.Flag localFlag = FragmentStrictMode.Flag.o00OooO0;
    boolean bool1 = ((Set)localObject).contains(localFlag);
    if (bool1)
    {
      paramFragment = paramFragment.getClass();
      localObject = localGetRetainInstanceUsageViolation.getClass();
      boolean bool2 = localFragmentStrictMode.OooOOoo(localPolicy, paramFragment, (Class)localObject);
      if (bool2) {
        localFragmentStrictMode.OooO0Oo(localPolicy, localGetRetainInstanceUsageViolation);
      }
    }
  }
  
  public static final void OooOO0O(Fragment paramFragment)
  {
    Intrinsics.OooO0o(paramFragment, "fragment");
    GetTargetFragmentRequestCodeUsageViolation localGetTargetFragmentRequestCodeUsageViolation = new androidx/fragment/app/strictmode/GetTargetFragmentRequestCodeUsageViolation;
    localGetTargetFragmentRequestCodeUsageViolation.<init>(paramFragment);
    FragmentStrictMode localFragmentStrictMode = OooO00o;
    localFragmentStrictMode.OooO0oO(localGetTargetFragmentRequestCodeUsageViolation);
    FragmentStrictMode.Policy localPolicy = localFragmentStrictMode.OooO0OO(paramFragment);
    Object localObject = localPolicy.getFlags$fragment_release();
    FragmentStrictMode.Flag localFlag = FragmentStrictMode.Flag.o00OooOO;
    boolean bool1 = ((Set)localObject).contains(localFlag);
    if (bool1)
    {
      paramFragment = paramFragment.getClass();
      localObject = localGetTargetFragmentRequestCodeUsageViolation.getClass();
      boolean bool2 = localFragmentStrictMode.OooOOoo(localPolicy, paramFragment, (Class)localObject);
      if (bool2) {
        localFragmentStrictMode.OooO0Oo(localPolicy, localGetTargetFragmentRequestCodeUsageViolation);
      }
    }
  }
  
  public static final void OooOO0o(Fragment paramFragment)
  {
    Intrinsics.OooO0o(paramFragment, "fragment");
    GetTargetFragmentUsageViolation localGetTargetFragmentUsageViolation = new androidx/fragment/app/strictmode/GetTargetFragmentUsageViolation;
    localGetTargetFragmentUsageViolation.<init>(paramFragment);
    FragmentStrictMode localFragmentStrictMode = OooO00o;
    localFragmentStrictMode.OooO0oO(localGetTargetFragmentUsageViolation);
    FragmentStrictMode.Policy localPolicy = localFragmentStrictMode.OooO0OO(paramFragment);
    Object localObject = localPolicy.getFlags$fragment_release();
    FragmentStrictMode.Flag localFlag = FragmentStrictMode.Flag.o00OooOO;
    boolean bool1 = ((Set)localObject).contains(localFlag);
    if (bool1)
    {
      paramFragment = paramFragment.getClass();
      localObject = localGetTargetFragmentUsageViolation.getClass();
      boolean bool2 = localFragmentStrictMode.OooOOoo(localPolicy, paramFragment, (Class)localObject);
      if (bool2) {
        localFragmentStrictMode.OooO0Oo(localPolicy, localGetTargetFragmentUsageViolation);
      }
    }
  }
  
  public static final void OooOOO(Fragment paramFragment1, Fragment paramFragment2, int paramInt)
  {
    Intrinsics.OooO0o(paramFragment1, "violatingFragment");
    Intrinsics.OooO0o(paramFragment2, "targetFragment");
    SetTargetFragmentUsageViolation localSetTargetFragmentUsageViolation = new androidx/fragment/app/strictmode/SetTargetFragmentUsageViolation;
    localSetTargetFragmentUsageViolation.<init>(paramFragment1, paramFragment2, paramInt);
    paramFragment2 = OooO00o;
    paramFragment2.OooO0oO(localSetTargetFragmentUsageViolation);
    FragmentStrictMode.Policy localPolicy = paramFragment2.OooO0OO(paramFragment1);
    Object localObject = localPolicy.getFlags$fragment_release();
    FragmentStrictMode.Flag localFlag = FragmentStrictMode.Flag.o00OooOO;
    boolean bool1 = ((Set)localObject).contains(localFlag);
    if (bool1)
    {
      paramFragment1 = paramFragment1.getClass();
      localObject = localSetTargetFragmentUsageViolation.getClass();
      boolean bool2 = paramFragment2.OooOOoo(localPolicy, paramFragment1, (Class)localObject);
      if (bool2) {
        paramFragment2.OooO0Oo(localPolicy, localSetTargetFragmentUsageViolation);
      }
    }
  }
  
  public static final void OooOOO0(Fragment paramFragment)
  {
    Intrinsics.OooO0o(paramFragment, "fragment");
    SetRetainInstanceUsageViolation localSetRetainInstanceUsageViolation = new androidx/fragment/app/strictmode/SetRetainInstanceUsageViolation;
    localSetRetainInstanceUsageViolation.<init>(paramFragment);
    FragmentStrictMode localFragmentStrictMode = OooO00o;
    localFragmentStrictMode.OooO0oO(localSetRetainInstanceUsageViolation);
    FragmentStrictMode.Policy localPolicy = localFragmentStrictMode.OooO0OO(paramFragment);
    Object localObject = localPolicy.getFlags$fragment_release();
    FragmentStrictMode.Flag localFlag = FragmentStrictMode.Flag.o00OooO0;
    boolean bool1 = ((Set)localObject).contains(localFlag);
    if (bool1)
    {
      paramFragment = paramFragment.getClass();
      localObject = localSetRetainInstanceUsageViolation.getClass();
      boolean bool2 = localFragmentStrictMode.OooOOoo(localPolicy, paramFragment, (Class)localObject);
      if (bool2) {
        localFragmentStrictMode.OooO0Oo(localPolicy, localSetRetainInstanceUsageViolation);
      }
    }
  }
  
  public static final void OooOOOO(Fragment paramFragment, boolean paramBoolean)
  {
    Intrinsics.OooO0o(paramFragment, "fragment");
    SetUserVisibleHintViolation localSetUserVisibleHintViolation = new androidx/fragment/app/strictmode/SetUserVisibleHintViolation;
    localSetUserVisibleHintViolation.<init>(paramFragment, paramBoolean);
    FragmentStrictMode localFragmentStrictMode = OooO00o;
    localFragmentStrictMode.OooO0oO(localSetUserVisibleHintViolation);
    FragmentStrictMode.Policy localPolicy = localFragmentStrictMode.OooO0OO(paramFragment);
    Object localObject = localPolicy.getFlags$fragment_release();
    FragmentStrictMode.Flag localFlag = FragmentStrictMode.Flag.o00OooO;
    boolean bool1 = ((Set)localObject).contains(localFlag);
    if (bool1)
    {
      paramFragment = paramFragment.getClass();
      localObject = localSetUserVisibleHintViolation.getClass();
      boolean bool2 = localFragmentStrictMode.OooOOoo(localPolicy, paramFragment, (Class)localObject);
      if (bool2) {
        localFragmentStrictMode.OooO0Oo(localPolicy, localSetUserVisibleHintViolation);
      }
    }
  }
  
  public static final void OooOOOo(Fragment paramFragment, ViewGroup paramViewGroup)
  {
    Intrinsics.OooO0o(paramFragment, "fragment");
    Intrinsics.OooO0o(paramViewGroup, "container");
    WrongFragmentContainerViolation localWrongFragmentContainerViolation = new androidx/fragment/app/strictmode/WrongFragmentContainerViolation;
    localWrongFragmentContainerViolation.<init>(paramFragment, paramViewGroup);
    paramViewGroup = OooO00o;
    paramViewGroup.OooO0oO(localWrongFragmentContainerViolation);
    FragmentStrictMode.Policy localPolicy = paramViewGroup.OooO0OO(paramFragment);
    Object localObject = localPolicy.getFlags$fragment_release();
    FragmentStrictMode.Flag localFlag = FragmentStrictMode.Flag.o00OooOo;
    boolean bool1 = ((Set)localObject).contains(localFlag);
    if (bool1)
    {
      paramFragment = paramFragment.getClass();
      localObject = localWrongFragmentContainerViolation.getClass();
      boolean bool2 = paramViewGroup.OooOOoo(localPolicy, paramFragment, (Class)localObject);
      if (bool2) {
        paramViewGroup.OooO0Oo(localPolicy, localWrongFragmentContainerViolation);
      }
    }
  }
  
  public static final void OooOOo0(Fragment paramFragment1, Fragment paramFragment2, int paramInt)
  {
    Intrinsics.OooO0o(paramFragment1, "fragment");
    Intrinsics.OooO0o(paramFragment2, "expectedParentFragment");
    WrongNestedHierarchyViolation localWrongNestedHierarchyViolation = new androidx/fragment/app/strictmode/WrongNestedHierarchyViolation;
    localWrongNestedHierarchyViolation.<init>(paramFragment1, paramFragment2, paramInt);
    paramFragment2 = OooO00o;
    paramFragment2.OooO0oO(localWrongNestedHierarchyViolation);
    FragmentStrictMode.Policy localPolicy = paramFragment2.OooO0OO(paramFragment1);
    Object localObject = localPolicy.getFlags$fragment_release();
    FragmentStrictMode.Flag localFlag = FragmentStrictMode.Flag.o00Ooo0o;
    boolean bool1 = ((Set)localObject).contains(localFlag);
    if (bool1)
    {
      paramFragment1 = paramFragment1.getClass();
      localObject = localWrongNestedHierarchyViolation.getClass();
      boolean bool2 = paramFragment2.OooOOoo(localPolicy, paramFragment1, (Class)localObject);
      if (bool2) {
        paramFragment2.OooO0Oo(localPolicy, localWrongNestedHierarchyViolation);
      }
    }
  }
  
  public final FragmentStrictMode.Policy OooO0OO(Fragment paramFragment)
  {
    while (paramFragment != null)
    {
      boolean bool = paramFragment.isAdded();
      if (bool)
      {
        FragmentManager localFragmentManager = paramFragment.getParentFragmentManager();
        Intrinsics.OooO0o0(localFragmentManager, "declaringFragment.parentFragmentManager");
        FragmentStrictMode.Policy localPolicy = localFragmentManager.getStrictModePolicy();
        if (localPolicy != null)
        {
          paramFragment = localFragmentManager.getStrictModePolicy();
          Intrinsics.OooO0OO(paramFragment);
          return paramFragment;
        }
      }
      paramFragment = paramFragment.getParentFragment();
    }
    return OooO0O0;
  }
  
  public final void OooO0Oo(FragmentStrictMode.Policy paramPolicy, Violation paramViolation)
  {
    Fragment localFragment = paramViolation.getFragment();
    String str = localFragment.getClass().getName();
    Object localObject1 = paramPolicy.getFlags$fragment_release();
    Object localObject2 = FragmentStrictMode.Flag.o00OoOoo;
    boolean bool1 = ((Set)localObject1).contains(localObject2);
    if (bool1)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Policy violation in ";
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(str);
    }
    localObject1 = paramPolicy.getListener$fragment_release();
    if (localObject1 != null)
    {
      localObject1 = new OooO0O0/OooO00o;
      ((OooO00o)localObject1).<init>(paramPolicy, paramViolation);
      OooOOo(localFragment, (Runnable)localObject1);
    }
    paramPolicy = paramPolicy.getFlags$fragment_release();
    localObject1 = FragmentStrictMode.Flag.o00Ooo00;
    boolean bool2 = paramPolicy.contains(localObject1);
    if (bool2)
    {
      paramPolicy = new OooO0O0/OooO0O0;
      paramPolicy.<init>(str, paramViolation);
      OooOOo(localFragment, paramPolicy);
    }
  }
  
  public final void OooO0oO(Violation paramViolation)
  {
    boolean bool = FragmentManager.isLoggingEnabled(3);
    if (bool)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = "StrictMode violation in ";
      localStringBuilder.append(str);
      paramViolation = paramViolation.getFragment().getClass().getName();
      localStringBuilder.append(paramViolation);
    }
  }
  
  public final void OooOOo(Fragment paramFragment, Runnable paramRunnable)
  {
    boolean bool = paramFragment.isAdded();
    if (bool)
    {
      paramFragment = paramFragment.getParentFragmentManager().getHost().getHandler();
      Intrinsics.OooO0o0(paramFragment, "fragment.parentFragmentManager.host.handler");
      Looper localLooper1 = paramFragment.getLooper();
      Looper localLooper2 = Looper.myLooper();
      bool = Intrinsics.OooO00o(localLooper1, localLooper2);
      if (!bool)
      {
        paramFragment.post(paramRunnable);
        return;
      }
    }
    paramRunnable.run();
  }
  
  public final boolean OooOOoo(FragmentStrictMode.Policy paramPolicy, Class paramClass1, Class paramClass2)
  {
    paramClass1 = paramClass1.getName();
    paramPolicy = (Set)paramPolicy.getMAllowedViolations$fragment_release().get(paramClass1);
    boolean bool1 = true;
    if (paramPolicy == null) {
      return bool1;
    }
    Class localClass = paramClass2.getSuperclass();
    Violation localViolation = Violation.class;
    boolean bool2 = Intrinsics.OooO00o(localClass, localViolation);
    if (!bool2)
    {
      localClass = paramClass2.getSuperclass();
      bool2 = CollectionsKt.Oooo0OO(paramPolicy, localClass);
      if (bool2) {
        return false;
      }
    }
    return paramPolicy.contains(paramClass2) ^ bool1;
  }
  
  public final FragmentStrictMode.Policy getDefaultPolicy()
  {
    return OooO0O0;
  }
  
  public final void setDefaultPolicy(FragmentStrictMode.Policy paramPolicy)
  {
    Intrinsics.OooO0o(paramPolicy, "<set-?>");
    OooO0O0 = paramPolicy;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.strictmode.FragmentStrictMode
 * JD-Core Version:    0.7.0.1
 */
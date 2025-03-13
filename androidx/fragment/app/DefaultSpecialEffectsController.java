package androidx.fragment.app;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.os.CancellationSignal.OnCancelListener;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class DefaultSpecialEffectsController
  extends SpecialEffectsController
{
  public DefaultSpecialEffectsController(ViewGroup paramViewGroup)
  {
    super(paramViewGroup);
  }
  
  public static final void OooOooo(List paramList, SpecialEffectsController.Operation paramOperation, DefaultSpecialEffectsController paramDefaultSpecialEffectsController)
  {
    Intrinsics.OooO0o(paramList, "$awaitingContainerChanges");
    Intrinsics.OooO0o(paramOperation, "$operation");
    String str = "this$0";
    Intrinsics.OooO0o(paramDefaultSpecialEffectsController, str);
    boolean bool = paramList.contains(paramOperation);
    if (bool)
    {
      paramList.remove(paramOperation);
      paramDefaultSpecialEffectsController.OooOoo(paramOperation);
    }
  }
  
  public static final void Oooo0(Animator paramAnimator, SpecialEffectsController.Operation paramOperation)
  {
    String str = "$operation";
    Intrinsics.OooO0o(paramOperation, str);
    paramAnimator.end();
    boolean bool = FragmentManager.isLoggingEnabled(2);
    if (bool)
    {
      paramAnimator = new java/lang/StringBuilder;
      paramAnimator.<init>();
      str = "Animator from operation ";
      paramAnimator.append(str);
      paramAnimator.append(paramOperation);
      paramOperation = " has been canceled.";
      paramAnimator.append(paramOperation);
    }
  }
  
  public static final void Oooo0O0(View paramView, DefaultSpecialEffectsController paramDefaultSpecialEffectsController, DefaultSpecialEffectsController.AnimationInfo paramAnimationInfo, SpecialEffectsController.Operation paramOperation)
  {
    Intrinsics.OooO0o(paramDefaultSpecialEffectsController, "this$0");
    Intrinsics.OooO0o(paramAnimationInfo, "$animationInfo");
    String str = "$operation";
    Intrinsics.OooO0o(paramOperation, str);
    paramView.clearAnimation();
    paramDefaultSpecialEffectsController = paramDefaultSpecialEffectsController.getContainer();
    paramDefaultSpecialEffectsController.endViewTransition(paramView);
    paramAnimationInfo.OooO00o();
    boolean bool = FragmentManager.isLoggingEnabled(2);
    if (bool)
    {
      paramView = new java/lang/StringBuilder;
      paramView.<init>();
      paramView.append("Animation from operation ");
      paramView.append(paramOperation);
      paramDefaultSpecialEffectsController = " has been cancelled.";
      paramView.append(paramDefaultSpecialEffectsController);
    }
  }
  
  public static final void Oooo0o(ArrayList paramArrayList)
  {
    Intrinsics.OooO0o(paramArrayList, "$transitioningViews");
    FragmentTransition.OooO0o0(paramArrayList, 4);
  }
  
  public static final void Oooo0o0(FragmentTransitionImpl paramFragmentTransitionImpl, View paramView, Rect paramRect)
  {
    Intrinsics.OooO0o(paramFragmentTransitionImpl, "$impl");
    Intrinsics.OooO0o(paramRect, "$lastInEpicenterRect");
    paramFragmentTransitionImpl.OooO0oo(paramView, paramRect);
  }
  
  public static final void Oooo0oO(DefaultSpecialEffectsController.TransitionInfo paramTransitionInfo, SpecialEffectsController.Operation paramOperation)
  {
    Intrinsics.OooO0o(paramTransitionInfo, "$transitionInfo");
    String str = "$operation";
    Intrinsics.OooO0o(paramOperation, str);
    paramTransitionInfo.OooO00o();
    boolean bool = FragmentManager.isLoggingEnabled(2);
    if (bool)
    {
      paramTransitionInfo = new java/lang/StringBuilder;
      paramTransitionInfo.<init>();
      str = "Transition for operation ";
      paramTransitionInfo.append(str);
      paramTransitionInfo.append(paramOperation);
      paramOperation = " has completed";
      paramTransitionInfo.append(paramOperation);
    }
  }
  
  public static final void Oooo0oo(SpecialEffectsController.Operation paramOperation1, SpecialEffectsController.Operation paramOperation2, boolean paramBoolean, ArrayMap paramArrayMap)
  {
    Intrinsics.OooO0o(paramArrayMap, "$lastInViews");
    paramOperation1 = paramOperation1.getFragment();
    paramOperation2 = paramOperation2.getFragment();
    FragmentTransition.OooO00o(paramOperation1, paramOperation2, paramBoolean, paramArrayMap, false);
  }
  
  public void OooOO0(List paramList, boolean paramBoolean)
  {
    DefaultSpecialEffectsController localDefaultSpecialEffectsController = this;
    Object localObject1 = paramList;
    boolean bool1 = paramBoolean;
    Intrinsics.OooO0o(paramList, "operations");
    Object localObject2 = paramList.iterator();
    boolean bool3;
    Object localObject8;
    int i;
    do
    {
      bool2 = ((Iterator)localObject2).hasNext();
      localObject3 = "operation.fragment.mView";
      localObject4 = null;
      bool3 = true;
      if (!bool2) {
        break;
      }
      localObject5 = ((Iterator)localObject2).next();
      localObject6 = localObject5;
      localObject6 = (SpecialEffectsController.Operation)localObject5;
      localObject7 = SpecialEffectsController.Operation.State.o00OoOoo;
      localObject8 = ((SpecialEffectsController.Operation)localObject6).getFragment().mView;
      Intrinsics.OooO0o0(localObject8, (String)localObject3);
      localObject7 = ((SpecialEffectsController.Operation.State.Companion)localObject7).OooO00o((View)localObject8);
      localObject8 = SpecialEffectsController.Operation.State.o00Ooo0;
      if (localObject7 == localObject8)
      {
        localObject6 = ((SpecialEffectsController.Operation)localObject6).getFinalState();
        if (localObject6 != localObject8)
        {
          i = bool3;
          continue;
        }
      }
      i = 0;
      localObject6 = null;
    } while (i == 0);
    break label150;
    boolean bool2 = false;
    Object localObject5 = null;
    label150:
    Object localObject6 = localObject5;
    localObject6 = (SpecialEffectsController.Operation)localObject5;
    int j = paramList.size();
    localObject2 = ((List)localObject1).listIterator(j);
    int k;
    do
    {
      bool2 = ((ListIterator)localObject2).hasPrevious();
      if (!bool2) {
        break;
      }
      localObject5 = ((ListIterator)localObject2).previous();
      localObject7 = localObject5;
      localObject7 = (SpecialEffectsController.Operation)localObject5;
      localObject8 = SpecialEffectsController.Operation.State.o00OoOoo;
      localObject9 = ((SpecialEffectsController.Operation)localObject7).getFragment().mView;
      Intrinsics.OooO0o0(localObject9, (String)localObject3);
      localObject8 = ((SpecialEffectsController.Operation.State.Companion)localObject8).OooO00o((View)localObject9);
      localObject9 = SpecialEffectsController.Operation.State.o00Ooo0;
      if (localObject8 != localObject9)
      {
        localObject7 = ((SpecialEffectsController.Operation)localObject7).getFinalState();
        if (localObject7 == localObject9)
        {
          k = bool3;
          continue;
        }
      }
      k = 0;
      localObject7 = null;
    } while (k == 0);
    Object localObject4 = localObject5;
    Object localObject7 = localObject4;
    localObject7 = (SpecialEffectsController.Operation)localObject4;
    int m = 2;
    boolean bool4 = FragmentManager.isLoggingEnabled(m);
    Object localObject9 = " to ";
    if (bool4)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject5 = "Executing operations from ";
      ((StringBuilder)localObject2).append((String)localObject5);
      ((StringBuilder)localObject2).append(localObject6);
      ((StringBuilder)localObject2).append((String)localObject9);
      ((StringBuilder)localObject2).append(localObject7);
    }
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    List localList = CollectionsKt.o0OoOo0(paramList);
    Oooo(paramList);
    localObject1 = paramList.iterator();
    for (;;)
    {
      bool2 = ((Iterator)localObject1).hasNext();
      if (!bool2) {
        break;
      }
      localObject5 = (SpecialEffectsController.Operation)((Iterator)localObject1).next();
      localObject3 = new androidx/core/os/CancellationSignal;
      ((CancellationSignal)localObject3).<init>();
      ((SpecialEffectsController.Operation)localObject5).OooO0oO((CancellationSignal)localObject3);
      localObject4 = new androidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;
      ((DefaultSpecialEffectsController.AnimationInfo)localObject4).<init>((SpecialEffectsController.Operation)localObject5, (CancellationSignal)localObject3, bool1);
      localArrayList.add(localObject4);
      localObject3 = new androidx/core/os/CancellationSignal;
      ((CancellationSignal)localObject3).<init>();
      ((SpecialEffectsController.Operation)localObject5).OooO0oO((CancellationSignal)localObject3);
      localObject4 = new androidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;
      boolean bool5;
      if (bool1 ? localObject5 == localObject6 : localObject5 == localObject7) {
        bool5 = bool3;
      } else {
        bool5 = false;
      }
      ((DefaultSpecialEffectsController.TransitionInfo)localObject4).<init>((SpecialEffectsController.Operation)localObject5, (CancellationSignal)localObject3, bool1, bool5);
      ((List)localObject2).add(localObject4);
      localObject3 = new androidx/fragment/app/OooO00o;
      ((OooO00o)localObject3).<init>(localList, (SpecialEffectsController.Operation)localObject5, localDefaultSpecialEffectsController);
      ((SpecialEffectsController.Operation)localObject5).OooO0OO((Runnable)localObject3);
    }
    localObject1 = this;
    localObject5 = localList;
    bool1 = paramBoolean;
    Object localObject3 = localObject6;
    localObject4 = localObject7;
    localObject1 = Oooo0OO((List)localObject2, localList, paramBoolean, (SpecialEffectsController.Operation)localObject6, (SpecialEffectsController.Operation)localObject7);
    localObject2 = Boolean.TRUE;
    bool4 = ((Map)localObject1).containsValue(localObject2);
    localDefaultSpecialEffectsController.Oooo00o(localArrayList, localList, bool4, (Map)localObject1);
    localObject1 = localList.iterator();
    for (;;)
    {
      bool4 = ((Iterator)localObject1).hasNext();
      if (!bool4) {
        break;
      }
      localObject2 = (SpecialEffectsController.Operation)((Iterator)localObject1).next();
      localDefaultSpecialEffectsController.OooOoo((SpecialEffectsController.Operation)localObject2);
    }
    localList.clear();
    boolean bool6 = FragmentManager.isLoggingEnabled(m);
    if (bool6)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "Completed executing operations from ";
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(localObject6);
      ((StringBuilder)localObject1).append((String)localObject9);
      ((StringBuilder)localObject1).append(localObject7);
    }
  }
  
  public final void OooOoo(SpecialEffectsController.Operation paramOperation)
  {
    View localView = paramOperation.getFragment().mView;
    paramOperation = paramOperation.getFinalState();
    Intrinsics.OooO0o0(localView, "view");
    paramOperation.OooO0OO(localView);
  }
  
  public final void OooOooO(ArrayList paramArrayList, View paramView)
  {
    boolean bool = paramView instanceof ViewGroup;
    if (bool)
    {
      Object localObject = paramView;
      localObject = (ViewGroup)paramView;
      int i = ViewGroupCompat.OooO00o((ViewGroup)localObject);
      if (i != 0)
      {
        bool = paramArrayList.contains(paramView);
        if (bool) {
          return;
        }
      }
      else
      {
        int k = ((ViewGroup)localObject).getChildCount();
        i = 0;
        while (i < k)
        {
          View localView = ((ViewGroup)localObject).getChildAt(i);
          int m = localView.getVisibility();
          if (m == 0)
          {
            String str = "child";
            Intrinsics.OooO0o0(localView, str);
            OooOooO(paramArrayList, localView);
          }
          int j;
          i += 1;
        }
      }
    }
    else
    {
      bool = paramArrayList.contains(paramView);
      if (bool) {
        return;
      }
    }
    paramArrayList.add(paramView);
  }
  
  public final void Oooo(List paramList)
  {
    Fragment localFragment = ((SpecialEffectsController.Operation)CollectionsKt.o000oOoO(paramList)).getFragment();
    paramList = paramList.iterator();
    for (;;)
    {
      boolean bool = paramList.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = (SpecialEffectsController.Operation)paramList.next();
      Fragment.AnimationInfo localAnimationInfo1 = ((SpecialEffectsController.Operation)localObject).getFragment().mAnimationInfo;
      int i = localFragment.mAnimationInfo.OooO0OO;
      localAnimationInfo1.OooO0OO = i;
      localAnimationInfo1 = ((SpecialEffectsController.Operation)localObject).getFragment().mAnimationInfo;
      i = localFragment.mAnimationInfo.OooO0Oo;
      localAnimationInfo1.OooO0Oo = i;
      localAnimationInfo1 = ((SpecialEffectsController.Operation)localObject).getFragment().mAnimationInfo;
      Fragment.AnimationInfo localAnimationInfo2 = localFragment.mAnimationInfo;
      i = localAnimationInfo2.OooO0o0;
      localAnimationInfo1.OooO0o0 = i;
      localObject = ((SpecialEffectsController.Operation)localObject).getFragment().mAnimationInfo;
      localAnimationInfo1 = localFragment.mAnimationInfo;
      int j = localAnimationInfo1.OooO0o;
      ((Fragment.AnimationInfo)localObject).OooO0o = j;
    }
  }
  
  public final void Oooo000(Map paramMap, View paramView)
  {
    String str1 = ViewCompat.Oooo0O0(paramView);
    if (str1 != null) {
      paramMap.put(str1, paramView);
    }
    boolean bool = paramView instanceof ViewGroup;
    if (bool)
    {
      paramView = (ViewGroup)paramView;
      int i = paramView.getChildCount();
      int j = 0;
      while (j < i)
      {
        View localView = paramView.getChildAt(j);
        int k = localView.getVisibility();
        if (k == 0)
        {
          String str2 = "child";
          Intrinsics.OooO0o0(localView, str2);
          Oooo000(paramMap, localView);
        }
        j += 1;
      }
    }
  }
  
  public final void Oooo00O(ArrayMap paramArrayMap, Collection paramCollection)
  {
    paramArrayMap = paramArrayMap.entrySet();
    Intrinsics.OooO0o0(paramArrayMap, "entries");
    DefaultSpecialEffectsController.retainMatchingViews.1 local1 = new androidx/fragment/app/DefaultSpecialEffectsController$retainMatchingViews$1;
    local1.<init>(paramCollection);
    CollectionsKt.OooOoO(paramArrayMap, local1);
  }
  
  public final void Oooo00o(List paramList1, List paramList2, boolean paramBoolean, Map paramMap)
  {
    DefaultSpecialEffectsController localDefaultSpecialEffectsController = this;
    Context localContext = getContainer().getContext();
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = paramList1.iterator();
    boolean bool1 = false;
    Object localObject3 = null;
    String str;
    Object localObject4;
    int i;
    label95:
    Object localObject7;
    label156:
    Object localObject8;
    boolean bool5;
    Object localObject9;
    Object localObject10;
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject2).hasNext();
      str = " has started.";
      localObject4 = "context";
      i = 2;
      if (!bool2) {
        break;
      }
      localObject5 = ((Iterator)localObject2).next();
      Object localObject6 = localObject5;
      localObject6 = (DefaultSpecialEffectsController.AnimationInfo)localObject5;
      bool2 = ((DefaultSpecialEffectsController.SpecialEffectsInfo)localObject6).isVisibilityUnchanged();
      if (bool2) {
        ((DefaultSpecialEffectsController.SpecialEffectsInfo)localObject6).OooO00o();
      }
      Animator localAnimator;
      for (;;)
      {
        localObject7 = paramMap;
        break;
        Intrinsics.OooO0o0(localContext, (String)localObject4);
        localObject5 = ((DefaultSpecialEffectsController.AnimationInfo)localObject6).OooO0O0(localContext);
        if (localObject5 == null) {
          break label95;
        }
        localAnimator = ((FragmentAnim.AnimationOrAnimator)localObject5).OooO0O0;
        if (localAnimator != null) {
          break label156;
        }
        ((List)localObject1).add(localObject6);
      }
      SpecialEffectsController.Operation localOperation = ((DefaultSpecialEffectsController.SpecialEffectsInfo)localObject6).getOperation();
      localObject5 = localOperation.getFragment();
      localObject7 = paramMap;
      localObject4 = paramMap.get(localOperation);
      localObject8 = Boolean.TRUE;
      boolean bool3 = Intrinsics.OooO00o(localObject4, localObject8);
      if (bool3)
      {
        bool3 = FragmentManager.isLoggingEnabled(i);
        if (bool3)
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject8 = "Ignoring Animator set on ";
          ((StringBuilder)localObject4).append((String)localObject8);
          ((StringBuilder)localObject4).append(localObject5);
          localObject5 = " as this Fragment was involved in a Transition.";
          ((StringBuilder)localObject4).append((String)localObject5);
        }
        ((DefaultSpecialEffectsController.SpecialEffectsInfo)localObject6).OooO00o();
      }
      else
      {
        localObject3 = localOperation.getFinalState();
        localObject4 = SpecialEffectsController.Operation.State.o00Ooo0O;
        boolean bool4 = true;
        if (localObject3 == localObject4)
        {
          bool5 = bool4;
        }
        else
        {
          bool5 = false;
          localObject8 = null;
        }
        localObject9 = paramList2;
        if (bool5) {
          paramList2.remove(localOperation);
        }
        localObject4 = ((Fragment)localObject5).mView;
        getContainer().startViewTransition((View)localObject4);
        localObject5 = new androidx/fragment/app/DefaultSpecialEffectsController$startAnimations$1;
        localObject3 = localObject5;
        localObject10 = localObject5;
        localObject5 = this;
        localObject9 = localOperation;
        localObject7 = localObject6;
        ((DefaultSpecialEffectsController.startAnimations.1)localObject3).<init>(this, (View)localObject4, bool5, localOperation, (DefaultSpecialEffectsController.AnimationInfo)localObject6);
        localAnimator.addListener((Animator.AnimatorListener)localObject3);
        localObject3 = localObject4;
        localAnimator.setTarget(localObject4);
        localAnimator.start();
        bool1 = FragmentManager.isLoggingEnabled(i);
        if (bool1)
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject5 = "Animator from operation ";
          ((StringBuilder)localObject3).append((String)localObject5);
          ((StringBuilder)localObject3).append(localOperation);
          ((StringBuilder)localObject3).append(str);
        }
        localObject3 = ((DefaultSpecialEffectsController.SpecialEffectsInfo)localObject6).getSignal();
        localObject5 = new androidx/fragment/app/OooOO0;
        ((OooOO0)localObject5).<init>(localAnimator, localOperation);
        ((CancellationSignal)localObject3).setOnCancelListener((CancellationSignal.OnCancelListener)localObject5);
        bool1 = bool4;
      }
    }
    Object localObject5 = ((List)localObject1).iterator();
    for (;;)
    {
      bool5 = ((Iterator)localObject5).hasNext();
      if (!bool5) {
        return;
      }
      localObject8 = (DefaultSpecialEffectsController.AnimationInfo)((Iterator)localObject5).next();
      localObject9 = ((DefaultSpecialEffectsController.SpecialEffectsInfo)localObject8).getOperation();
      localObject7 = ((SpecialEffectsController.Operation)localObject9).getFragment();
      localObject1 = "Ignoring Animation set on ";
      boolean bool6;
      if (paramBoolean)
      {
        bool6 = FragmentManager.isLoggingEnabled(i);
        if (bool6)
        {
          localObject9 = new java/lang/StringBuilder;
          ((StringBuilder)localObject9).<init>();
          ((StringBuilder)localObject9).append((String)localObject1);
          ((StringBuilder)localObject9).append(localObject7);
        }
      }
      for (localObject7 = " as Animations cannot run alongside Transitions.";; localObject7 = " as Animations cannot run alongside Animators.")
      {
        ((StringBuilder)localObject9).append((String)localObject7);
        do
        {
          ((DefaultSpecialEffectsController.SpecialEffectsInfo)localObject8).OooO00o();
          break;
          if (!bool1) {
            break label650;
          }
          bool6 = FragmentManager.isLoggingEnabled(i);
        } while (!bool6);
        localObject9 = new java/lang/StringBuilder;
        ((StringBuilder)localObject9).<init>();
        ((StringBuilder)localObject9).append((String)localObject1);
        ((StringBuilder)localObject9).append(localObject7);
      }
      label650:
      localObject7 = ((Fragment)localObject7).mView;
      Intrinsics.OooO0o0(localContext, (String)localObject4);
      localObject1 = ((DefaultSpecialEffectsController.AnimationInfo)localObject8).OooO0O0(localContext);
      localObject2 = "Required value was null.";
      if (localObject1 == null) {
        break label899;
      }
      localObject1 = ((FragmentAnim.AnimationOrAnimator)localObject1).OooO00o;
      if (localObject1 == null) {
        break;
      }
      localObject2 = ((SpecialEffectsController.Operation)localObject9).getFinalState();
      localObject10 = SpecialEffectsController.Operation.State.o00Ooo00;
      if (localObject2 != localObject10)
      {
        ((View)localObject7).startAnimation((Animation)localObject1);
        ((DefaultSpecialEffectsController.SpecialEffectsInfo)localObject8).OooO00o();
      }
      else
      {
        getContainer().startViewTransition((View)localObject7);
        localObject2 = new androidx/fragment/app/FragmentAnim$EndViewTransitionAnimation;
        localObject10 = getContainer();
        ((FragmentAnim.EndViewTransitionAnimation)localObject2).<init>((Animation)localObject1, (ViewGroup)localObject10, (View)localObject7);
        localObject1 = new androidx/fragment/app/DefaultSpecialEffectsController$startAnimations$3;
        ((DefaultSpecialEffectsController.startAnimations.3)localObject1).<init>((SpecialEffectsController.Operation)localObject9, localDefaultSpecialEffectsController, (View)localObject7, (DefaultSpecialEffectsController.AnimationInfo)localObject8);
        ((Animation)localObject2).setAnimationListener((Animation.AnimationListener)localObject1);
        ((View)localObject7).startAnimation((Animation)localObject2);
        boolean bool7 = FragmentManager.isLoggingEnabled(i);
        if (bool7)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject2 = "Animation from operation ";
          ((StringBuilder)localObject1).append((String)localObject2);
          ((StringBuilder)localObject1).append(localObject9);
          ((StringBuilder)localObject1).append(str);
        }
      }
      localObject1 = ((DefaultSpecialEffectsController.SpecialEffectsInfo)localObject8).getSignal();
      localObject2 = new androidx/fragment/app/OooOO0O;
      ((OooOO0O)localObject2).<init>((View)localObject7, localDefaultSpecialEffectsController, (DefaultSpecialEffectsController.AnimationInfo)localObject8, (SpecialEffectsController.Operation)localObject9);
      ((CancellationSignal)localObject1).setOnCancelListener((CancellationSignal.OnCancelListener)localObject2);
    }
    localObject3 = new java/lang/IllegalStateException;
    localObject5 = localObject2.toString();
    ((IllegalStateException)localObject3).<init>((String)localObject5);
    throw ((Throwable)localObject3);
    label899:
    localObject3 = new java/lang/IllegalStateException;
    localObject5 = localObject2.toString();
    ((IllegalStateException)localObject3).<init>((String)localObject5);
    throw ((Throwable)localObject3);
  }
  
  public final Map Oooo0OO(List paramList1, List paramList2, boolean paramBoolean, SpecialEffectsController.Operation paramOperation1, SpecialEffectsController.Operation paramOperation2)
  {
    Object localObject1 = this;
    boolean bool1 = paramBoolean;
    Object localObject2 = paramOperation1;
    Object localObject3 = paramOperation2;
    Object localObject4 = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject4).<init>();
    Object localObject5 = new java/util/ArrayList;
    ((ArrayList)localObject5).<init>();
    Object localObject6 = paramList1.iterator();
    boolean bool3;
    for (;;)
    {
      bool2 = ((Iterator)localObject6).hasNext();
      if (!bool2) {
        break;
      }
      localObject7 = ((Iterator)localObject6).next();
      localObject8 = localObject7;
      localObject8 = (DefaultSpecialEffectsController.TransitionInfo)localObject7;
      bool3 = ((DefaultSpecialEffectsController.SpecialEffectsInfo)localObject8).isVisibilityUnchanged();
      if (!bool3) {
        ((Collection)localObject5).add(localObject7);
      }
    }
    localObject6 = new java/util/ArrayList;
    ((ArrayList)localObject6).<init>();
    localObject5 = ((Iterable)localObject5).iterator();
    for (;;)
    {
      bool2 = ((Iterator)localObject5).hasNext();
      if (!bool2) {
        break;
      }
      localObject7 = ((Iterator)localObject5).next();
      localObject9 = localObject7;
      localObject9 = ((DefaultSpecialEffectsController.TransitionInfo)localObject7).getHandlingImpl();
      if (localObject9 != null)
      {
        bool3 = true;
      }
      else
      {
        bool3 = false;
        localObject8 = null;
      }
      if (bool3) {
        ((Collection)localObject6).add(localObject7);
      }
    }
    localObject5 = ((Iterable)localObject6).iterator();
    boolean bool2 = false;
    for (Object localObject7 = null;; localObject7 = localObject10)
    {
      bool4 = ((Iterator)localObject5).hasNext();
      if (!bool4) {
        break label378;
      }
      localObject9 = (DefaultSpecialEffectsController.TransitionInfo)((Iterator)localObject5).next();
      localObject10 = ((DefaultSpecialEffectsController.TransitionInfo)localObject9).getHandlingImpl();
      if ((localObject7 != null) && (localObject10 != localObject7))
      {
        bool2 = false;
        localObject7 = null;
      }
      else
      {
        bool2 = true;
      }
      if (!bool2) {
        break;
      }
    }
    Object localObject11 = new java/lang/StringBuilder;
    ((StringBuilder)localObject11).<init>();
    ((StringBuilder)localObject11).append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
    localObject2 = ((DefaultSpecialEffectsController.SpecialEffectsInfo)localObject9).getOperation().getFragment();
    ((StringBuilder)localObject11).append(localObject2);
    ((StringBuilder)localObject11).append(" returned Transition ");
    localObject2 = ((DefaultSpecialEffectsController.TransitionInfo)localObject9).getTransition();
    ((StringBuilder)localObject11).append(localObject2);
    ((StringBuilder)localObject11).append(" which uses a different Transition type than other Fragments.");
    localObject11 = ((StringBuilder)localObject11).toString();
    localObject2 = new java/lang/IllegalArgumentException;
    localObject11 = localObject11.toString();
    ((IllegalArgumentException)localObject2).<init>((String)localObject11);
    throw ((Throwable)localObject2);
    label378:
    if (localObject7 == null)
    {
      localObject11 = paramList1.iterator();
      for (;;)
      {
        bool7 = ((Iterator)localObject11).hasNext();
        if (!bool7) {
          break;
        }
        localObject2 = (DefaultSpecialEffectsController.TransitionInfo)((Iterator)localObject11).next();
        localObject3 = ((DefaultSpecialEffectsController.SpecialEffectsInfo)localObject2).getOperation();
        localObject5 = Boolean.FALSE;
        ((Map)localObject4).put(localObject3, localObject5);
        ((DefaultSpecialEffectsController.SpecialEffectsInfo)localObject2).OooO00o();
      }
      return localObject4;
    }
    localObject5 = new android/view/View;
    Object localObject9 = getContainer().getContext();
    ((View)localObject5).<init>((Context)localObject9);
    Object localObject12 = new android/graphics/Rect;
    ((Rect)localObject12).<init>();
    Object localObject13 = new java/util/ArrayList;
    ((ArrayList)localObject13).<init>();
    Object localObject14 = new java/util/ArrayList;
    ((ArrayList)localObject14).<init>();
    Object localObject15 = new androidx/collection/ArrayMap;
    ((ArrayMap)localObject15).<init>();
    Object localObject16 = paramList1.iterator();
    boolean bool4 = false;
    localObject9 = null;
    boolean bool8 = false;
    Object localObject10 = null;
    int m = 0;
    boolean bool9;
    int n;
    int i1;
    Object localObject19;
    Object localObject21;
    Object localObject22;
    Object localObject23;
    boolean bool10;
    boolean bool13;
    label2081:
    int i6;
    for (;;)
    {
      bool9 = ((Iterator)localObject16).hasNext();
      n = 2;
      if (!bool9) {
        break;
      }
      localObject17 = (DefaultSpecialEffectsController.TransitionInfo)((Iterator)localObject16).next();
      i1 = ((DefaultSpecialEffectsController.TransitionInfo)localObject17).OooO0OO();
      if ((i1 != 0) && (localObject2 != null) && (localObject3 != null))
      {
        localObject10 = ((DefaultSpecialEffectsController.TransitionInfo)localObject17).getSharedElementTransition();
        localObject10 = ((FragmentTransitionImpl)localObject7).OooO0o(localObject10);
        localObject10 = ((FragmentTransitionImpl)localObject7).OooOo0(localObject10);
        localObject6 = paramOperation2.getFragment().getSharedElementSourceNames();
        Intrinsics.OooO0o0(localObject6, "lastIn.fragment.sharedElementSourceNames");
        localObject18 = paramOperation1.getFragment().getSharedElementSourceNames();
        Intrinsics.OooO0o0(localObject18, "firstOut.fragment.sharedElementSourceNames");
        localObject8 = paramOperation1.getFragment().getSharedElementTargetNames();
        localObject17 = localObject9;
        localObject9 = "firstOut.fragment.sharedElementTargetNames";
        Intrinsics.OooO0o0(localObject8, (String)localObject9);
        int j = ((ArrayList)localObject8).size();
        localObject19 = localObject4;
        Object localObject20 = localObject5;
        int i2 = 0;
        localObject4 = null;
        for (;;)
        {
          i3 = -1;
          if (i2 >= j) {
            break;
          }
          i1 = j;
          localObject9 = ((ArrayList)localObject8).get(i2);
          j = ((ArrayList)localObject6).indexOf(localObject9);
          if (j != i3)
          {
            localObject5 = ((ArrayList)localObject18).get(i2);
            ((ArrayList)localObject6).set(j, localObject5);
          }
          i2 += 1;
          j = i1;
        }
        localObject4 = paramOperation2.getFragment().getSharedElementTargetNames();
        Intrinsics.OooO0o0(localObject4, "lastIn.fragment.sharedElementTargetNames");
        localObject8 = paramOperation1.getFragment();
        if (!bool1)
        {
          localObject8 = ((Fragment)localObject8).getExitTransitionCallback();
          localObject18 = paramOperation2.getFragment().getEnterTransitionCallback();
        }
        else
        {
          localObject8 = ((Fragment)localObject8).getEnterTransitionCallback();
          localObject18 = paramOperation2.getFragment().getExitTransitionCallback();
        }
        localObject8 = TuplesKt.OooO00o(localObject8, localObject18);
        localObject18 = (SharedElementCallback)((Pair)localObject8).OooO00o();
        localObject8 = (SharedElementCallback)((Pair)localObject8).OooO0O0();
        j = ((ArrayList)localObject6).size();
        int i3 = 0;
        localObject5 = null;
        while (i3 < j)
        {
          localObject21 = ((ArrayList)localObject6).get(i3);
          localObject9 = localObject21;
          localObject9 = (String)localObject21;
          localObject21 = ((ArrayList)localObject4).get(i3);
          localObject22 = localObject12;
          localObject12 = localObject21;
          localObject12 = (String)localObject21;
          ((Map)localObject15).put(localObject9, localObject12);
          i3 += 1;
          localObject12 = localObject22;
        }
        localObject22 = localObject12;
        boolean bool11 = FragmentManager.isLoggingEnabled(n);
        boolean bool5;
        if (bool11)
        {
          for (localObject5 = ((ArrayList)localObject4).iterator();; localObject5 = localObject21)
          {
            bool5 = ((Iterator)localObject5).hasNext();
            localObject12 = "Name: ";
            if (!bool5) {
              break;
            }
            localObject9 = (String)((Iterator)localObject5).next();
            localObject21 = localObject5;
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            ((StringBuilder)localObject5).append((String)localObject12);
            ((StringBuilder)localObject5).append((String)localObject9);
          }
          for (localObject5 = ((ArrayList)localObject6).iterator();; localObject5 = localObject21)
          {
            bool5 = ((Iterator)localObject5).hasNext();
            if (!bool5) {
              break;
            }
            localObject9 = (String)((Iterator)localObject5).next();
            localObject21 = localObject5;
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            ((StringBuilder)localObject5).append((String)localObject12);
            ((StringBuilder)localObject5).append((String)localObject9);
          }
        }
        localObject5 = new androidx/collection/ArrayMap;
        ((ArrayMap)localObject5).<init>();
        localObject9 = paramOperation1.getFragment().mView;
        localObject12 = "firstOut.fragment.mView";
        Intrinsics.OooO0o0(localObject9, (String)localObject12);
        ((DefaultSpecialEffectsController)localObject1).Oooo000((Map)localObject5, (View)localObject9);
        ((ArrayMap)localObject5).OooOOO((Collection)localObject6);
        if (localObject18 != null)
        {
          bool5 = FragmentManager.isLoggingEnabled(n);
          if (bool5)
          {
            localObject9 = new java/lang/StringBuilder;
            ((StringBuilder)localObject9).<init>();
            localObject12 = "Executing exit callback for operation ";
            ((StringBuilder)localObject9).append((String)localObject12);
            ((StringBuilder)localObject9).append(localObject2);
          }
          ((SharedElementCallback)localObject18).OooO0Oo((List)localObject6, (Map)localObject5);
          int i4 = ((ArrayList)localObject6).size();
          int k = -1;
          i4 += k;
          if (i4 >= 0) {
            for (;;)
            {
              k = i4 + -1;
              localObject18 = (String)((ArrayList)localObject6).get(i4);
              localObject12 = (View)((SimpleArrayMap)localObject5).get(localObject18);
              if (localObject12 == null)
              {
                ((SimpleArrayMap)localObject15).remove(localObject18);
                localObject21 = localObject7;
              }
              else
              {
                localObject21 = localObject7;
                localObject7 = ViewCompat.Oooo0O0((View)localObject12);
                bool2 = Intrinsics.OooO00o(localObject18, localObject7);
                if (!bool2)
                {
                  localObject7 = (String)((SimpleArrayMap)localObject15).remove(localObject18);
                  localObject18 = ViewCompat.Oooo0O0((View)localObject12);
                  ((Map)localObject15).put(localObject18, localObject7);
                }
              }
              if (k < 0) {
                break;
              }
              i4 = k;
              localObject7 = localObject21;
            }
          }
          localObject21 = localObject7;
        }
        else
        {
          localObject21 = localObject7;
          localObject7 = ((ArrayMap)localObject5).keySet();
          ((ArrayMap)localObject15).OooOOO((Collection)localObject7);
        }
        localObject7 = new androidx/collection/ArrayMap;
        ((ArrayMap)localObject7).<init>();
        localObject18 = paramOperation2.getFragment().mView;
        localObject9 = "lastIn.fragment.mView";
        Intrinsics.OooO0o0(localObject18, (String)localObject9);
        ((DefaultSpecialEffectsController)localObject1).Oooo000((Map)localObject7, (View)localObject18);
        ((ArrayMap)localObject7).OooOOO((Collection)localObject4);
        localObject18 = ((ArrayMap)localObject15).values();
        ((ArrayMap)localObject7).OooOOO((Collection)localObject18);
        if (localObject8 != null)
        {
          boolean bool12 = FragmentManager.isLoggingEnabled(n);
          if (bool12)
          {
            localObject18 = new java/lang/StringBuilder;
            ((StringBuilder)localObject18).<init>();
            localObject9 = "Executing enter callback for operation ";
            ((StringBuilder)localObject18).append((String)localObject9);
            ((StringBuilder)localObject18).append(localObject3);
          }
          ((SharedElementCallback)localObject8).OooO0Oo((List)localObject4, (Map)localObject7);
          i = ((ArrayList)localObject4).size();
          i5 = -1;
          i += i5;
          if (i >= 0) {
            for (;;)
            {
              i5 = i + -1;
              localObject8 = (String)((ArrayList)localObject4).get(i);
              localObject9 = (View)((SimpleArrayMap)localObject7).get(localObject8);
              localObject12 = "name";
              if (localObject9 == null)
              {
                Intrinsics.OooO0o0(localObject8, (String)localObject12);
                localObject8 = FragmentTransition.OooO0O0((ArrayMap)localObject15, (String)localObject8);
                if (localObject8 != null) {
                  ((SimpleArrayMap)localObject15).remove(localObject8);
                }
                localObject23 = localObject4;
              }
              else
              {
                localObject23 = localObject4;
                localObject4 = ViewCompat.Oooo0O0((View)localObject9);
                bool10 = Intrinsics.OooO00o(localObject8, localObject4);
                if (!bool10)
                {
                  Intrinsics.OooO0o0(localObject8, (String)localObject12);
                  localObject4 = FragmentTransition.OooO0O0((ArrayMap)localObject15, (String)localObject8);
                  if (localObject4 != null)
                  {
                    localObject8 = ViewCompat.Oooo0O0((View)localObject9);
                    ((Map)localObject15).put(localObject4, localObject8);
                  }
                }
              }
              if (i5 < 0) {
                break;
              }
              i = i5;
              localObject4 = localObject23;
            }
          }
          localObject23 = localObject4;
        }
        else
        {
          localObject23 = localObject4;
          FragmentTransition.OooO0Oo((ArrayMap)localObject15, (ArrayMap)localObject7);
        }
        localObject4 = ((ArrayMap)localObject15).keySet();
        Intrinsics.OooO0o0(localObject4, "sharedElementNameMapping.keys");
        ((DefaultSpecialEffectsController)localObject1).Oooo00O((ArrayMap)localObject5, (Collection)localObject4);
        localObject4 = ((ArrayMap)localObject15).values();
        localObject8 = "sharedElementNameMapping.values";
        Intrinsics.OooO0o0(localObject4, (String)localObject8);
        ((DefaultSpecialEffectsController)localObject1).Oooo00O((ArrayMap)localObject7, (Collection)localObject4);
        bool10 = ((SimpleArrayMap)localObject15).isEmpty();
        if (bool10)
        {
          ((ArrayList)localObject13).clear();
          ((ArrayList)localObject14).clear();
          localObject9 = localObject17;
          localObject4 = localObject19;
          localObject5 = localObject20;
          localObject7 = localObject21;
          localObject12 = localObject22;
          bool8 = false;
          localObject10 = null;
          continue;
        }
        localObject4 = paramOperation2.getFragment();
        localObject8 = paramOperation1.getFragment();
        int i5 = 1;
        FragmentTransition.OooO00o((Fragment)localObject4, (Fragment)localObject8, bool1, (ArrayMap)localObject5, i5);
        localObject4 = getContainer();
        localObject8 = new androidx/fragment/app/OooO0O0;
        ((OooO0O0)localObject8).<init>((SpecialEffectsController.Operation)localObject3, (SpecialEffectsController.Operation)localObject2, bool1, (ArrayMap)localObject7);
        OneShotPreDrawListener.OooO00o((View)localObject4, (Runnable)localObject8);
        localObject4 = ((ArrayMap)localObject5).values();
        ((ArrayList)localObject13).addAll((Collection)localObject4);
        bool10 = ((Collection)localObject6).isEmpty() ^ i5;
        if (bool10)
        {
          bool10 = false;
          localObject6 = (String)((ArrayList)localObject6).get(0);
          localObject4 = (View)((SimpleArrayMap)localObject5).get(localObject6);
          localObject6 = localObject21;
          localObject21.OooOOOo(localObject10, (View)localObject4);
        }
        else
        {
          localObject6 = localObject21;
          localObject4 = localObject17;
        }
        localObject5 = ((ArrayMap)localObject7).values();
        ((ArrayList)localObject14).addAll((Collection)localObject5);
        bool11 = localObject23.isEmpty();
        bool13 = true;
        bool11 ^= bool13;
        if (bool11)
        {
          localObject5 = localObject23;
          i = 0;
          localObject8 = null;
          localObject5 = (String)localObject23.get(0);
          localObject5 = (View)((SimpleArrayMap)localObject7).get(localObject5);
          if (localObject5 != null)
          {
            localObject7 = getContainer();
            localObject8 = new androidx/fragment/app/OooO0OO;
            localObject12 = localObject22;
            ((OooO0OO)localObject8).<init>((FragmentTransitionImpl)localObject6, (View)localObject5, localObject22);
            OneShotPreDrawListener.OooO00o((View)localObject7, (Runnable)localObject8);
            m = bool13;
            break label2081;
          }
        }
        localObject12 = localObject22;
        localObject5 = localObject20;
        ((FragmentTransitionImpl)localObject6).OooOOoo(localObject10, localObject20, (ArrayList)localObject13);
        bool2 = false;
        int i = 0;
        bool9 = false;
        i1 = 0;
        localObject9 = localObject6;
        localObject24 = localObject15;
        i6 = 0;
        localObject15 = null;
        localObject7 = localObject14;
        localObject8 = localObject13;
        localObject18 = localObject12;
        localObject17 = localObject10;
        localObject23 = localObject14;
        ((FragmentTransitionImpl)localObject6).OooOOO(localObject10, null, null, null, null, localObject10, (ArrayList)localObject14);
        localObject9 = Boolean.TRUE;
        localObject12 = localObject19;
        localObject19.put(localObject2, localObject9);
        localObject19.put(localObject3, localObject9);
        localObject9 = localObject4;
        localObject4 = localObject19;
      }
      else
      {
        localObject6 = localObject7;
        localObject17 = localObject9;
        localObject24 = localObject15;
        localObject7 = localObject14;
        localObject8 = localObject13;
        localObject18 = localObject12;
        localObject12 = localObject4;
      }
      localObject15 = localObject24;
      localObject7 = localObject6;
      localObject12 = localObject18;
    }
    localObject6 = localObject7;
    Object localObject17 = localObject9;
    Object localObject24 = localObject15;
    localObject7 = localObject14;
    Object localObject8 = localObject13;
    Object localObject18 = localObject12;
    localObject12 = localObject4;
    localObject11 = new java/util/ArrayList;
    ((ArrayList)localObject11).<init>();
    localObject4 = paramList1.iterator();
    localObject14 = null;
    localObject13 = null;
    boolean bool6;
    for (;;)
    {
      bool6 = ((Iterator)localObject4).hasNext();
      if (!bool6) {
        break;
      }
      localObject9 = ((Iterator)localObject4).next();
      localObject16 = localObject9;
      localObject16 = (DefaultSpecialEffectsController.TransitionInfo)localObject9;
      bool6 = ((DefaultSpecialEffectsController.SpecialEffectsInfo)localObject16).isVisibilityUnchanged();
      if (bool6) {
        localObject9 = ((DefaultSpecialEffectsController.SpecialEffectsInfo)localObject16).getOperation();
      }
      for (;;)
      {
        localObject15 = Boolean.FALSE;
        ((Map)localObject12).put(localObject9, localObject15);
        ((DefaultSpecialEffectsController.SpecialEffectsInfo)localObject16).OooO00o();
        break;
        localObject9 = ((DefaultSpecialEffectsController.TransitionInfo)localObject16).getTransition();
        localObject15 = ((FragmentTransitionImpl)localObject6).OooO0o(localObject9);
        localObject9 = ((DefaultSpecialEffectsController.SpecialEffectsInfo)localObject16).getOperation();
        if ((localObject10 != null) && ((localObject9 == localObject2) || (localObject9 == localObject3)))
        {
          i1 = 1;
        }
        else
        {
          i1 = 0;
          localObject23 = null;
        }
        if (localObject15 != null) {
          break label2441;
        }
        if (i1 != 0) {
          break;
        }
      }
      label2441:
      localObject19 = localObject12;
      localObject12 = new java/util/ArrayList;
      ((ArrayList)localObject12).<init>();
      Object localObject25 = localObject4;
      localObject4 = ((SpecialEffectsController.Operation)localObject9).getFragment().mView;
      localObject21 = localObject10;
      localObject10 = "operation.fragment.mView";
      Intrinsics.OooO0o0(localObject4, (String)localObject10);
      ((DefaultSpecialEffectsController)localObject1).OooOooO((ArrayList)localObject12, (View)localObject4);
      if (i1 != 0)
      {
        if (localObject9 == localObject2) {
          localObject4 = CollectionsKt.o00O0O((Iterable)localObject8);
        } else {
          localObject4 = CollectionsKt.o00O0O((Iterable)localObject7);
        }
        ((ArrayList)localObject12).removeAll((Collection)localObject4);
      }
      bool10 = ((ArrayList)localObject12).isEmpty();
      Object localObject26;
      Object localObject27;
      Object localObject28;
      if (bool10)
      {
        ((FragmentTransitionImpl)localObject6).OooO00o(localObject15, (View)localObject5);
        localObject26 = localObject5;
        localObject10 = localObject9;
        localObject1 = localObject14;
        localObject5 = localObject13;
        localObject14 = localObject12;
        localObject27 = localObject17;
        localObject4 = localObject19;
        localObject28 = localObject21;
        localObject9 = paramList2;
        localObject12 = localObject15;
      }
      else
      {
        ((FragmentTransitionImpl)localObject6).OooO0O0(localObject15, (ArrayList)localObject12);
        bool10 = false;
        localObject22 = null;
        Object localObject29 = localObject9;
        localObject10 = localObject17;
        localObject9 = localObject6;
        localObject27 = localObject17;
        localObject28 = localObject21;
        localObject10 = localObject15;
        localObject21 = localObject15;
        localObject1 = localObject14;
        localObject14 = localObject12;
        localObject26 = localObject5;
        localObject5 = localObject13;
        localObject13 = null;
        localObject4 = localObject19;
        localObject12 = null;
        bool9 = false;
        localObject17 = null;
        i1 = 0;
        localObject23 = null;
        ((FragmentTransitionImpl)localObject6).OooOOO(localObject15, localObject15, (ArrayList)localObject14, null, null, null, null);
        localObject9 = localObject29.getFinalState();
        localObject10 = SpecialEffectsController.Operation.State.o00Ooo0O;
        if (localObject9 == localObject10)
        {
          localObject9 = paramList2;
          localObject10 = localObject29;
          paramList2.remove(localObject29);
          localObject15 = new java/util/ArrayList;
          ((ArrayList)localObject15).<init>((Collection)localObject14);
          localObject13 = localObject29.getFragment().mView;
          ((ArrayList)localObject15).remove(localObject13);
          localObject13 = localObject29.getFragment().mView;
          localObject12 = localObject21;
          ((FragmentTransitionImpl)localObject6).OooOOO0(localObject21, (View)localObject13, (ArrayList)localObject15);
          localObject15 = getContainer();
          localObject13 = new androidx/fragment/app/OooO0o;
          ((OooO0o)localObject13).<init>((ArrayList)localObject14);
          OneShotPreDrawListener.OooO00o((View)localObject15, (Runnable)localObject13);
        }
        else
        {
          localObject9 = paramList2;
          localObject12 = localObject15;
          localObject10 = localObject29;
        }
      }
      localObject15 = ((SpecialEffectsController.Operation)localObject10).getFinalState();
      localObject13 = SpecialEffectsController.Operation.State.o00Ooo0;
      if (localObject15 == localObject13)
      {
        ((ArrayList)localObject11).addAll((Collection)localObject14);
        if (m != 0) {
          ((FragmentTransitionImpl)localObject6).OooOOOO(localObject12, (Rect)localObject18);
        }
        localObject15 = localObject27;
      }
      else
      {
        localObject15 = localObject27;
        ((FragmentTransitionImpl)localObject6).OooOOOo(localObject12, localObject27);
      }
      localObject14 = Boolean.TRUE;
      ((Map)localObject4).put(localObject10, localObject14);
      bool8 = ((DefaultSpecialEffectsController.TransitionInfo)localObject16).isOverlapAllowed();
      if (bool8)
      {
        bool8 = false;
        localObject13 = ((FragmentTransitionImpl)localObject6).OooOO0O(localObject5, localObject12, null);
        localObject14 = localObject1;
        localObject12 = localObject4;
        localObject17 = localObject15;
        localObject10 = localObject28;
        localObject5 = localObject26;
        localObject1 = this;
      }
      else
      {
        bool8 = false;
        localObject14 = ((FragmentTransitionImpl)localObject6).OooOO0O(localObject1, localObject12, null);
        localObject1 = this;
        localObject12 = localObject4;
        localObject13 = localObject5;
        localObject17 = localObject15;
        localObject10 = localObject28;
        localObject5 = localObject26;
      }
      localObject4 = localObject25;
    }
    localObject1 = localObject14;
    localObject5 = localObject13;
    localObject4 = localObject12;
    localObject12 = localObject10;
    localObject1 = ((FragmentTransitionImpl)localObject6).OooOO0(localObject13, localObject14, localObject10);
    if (localObject1 == null) {
      return localObject4;
    }
    localObject5 = new java/util/ArrayList;
    ((ArrayList)localObject5).<init>();
    localObject18 = paramList1.iterator();
    for (;;)
    {
      bool6 = ((Iterator)localObject18).hasNext();
      if (!bool6) {
        break;
      }
      localObject9 = ((Iterator)localObject18).next();
      localObject10 = localObject9;
      localObject10 = (DefaultSpecialEffectsController.TransitionInfo)localObject9;
      bool8 = ((DefaultSpecialEffectsController.SpecialEffectsInfo)localObject10).isVisibilityUnchanged();
      if (!bool8) {
        ((Collection)localObject5).add(localObject9);
      }
    }
    localObject5 = ((Iterable)localObject5).iterator();
    for (;;)
    {
      bool13 = ((Iterator)localObject5).hasNext();
      if (!bool13) {
        break;
      }
      localObject18 = (DefaultSpecialEffectsController.TransitionInfo)((Iterator)localObject5).next();
      localObject9 = ((DefaultSpecialEffectsController.TransitionInfo)localObject18).getTransition();
      localObject10 = ((DefaultSpecialEffectsController.SpecialEffectsInfo)localObject18).getOperation();
      if ((localObject12 != null) && ((localObject10 == localObject2) || (localObject10 == localObject3)))
      {
        i6 = 1;
      }
      else
      {
        i6 = 0;
        localObject15 = null;
      }
      if ((localObject9 != null) || (i6 != 0))
      {
        localObject9 = getContainer();
        bool6 = ViewCompat.OoooOOO((View)localObject9);
        if (!bool6)
        {
          bool6 = FragmentManager.isLoggingEnabled(n);
          if (bool6)
          {
            localObject9 = new java/lang/StringBuilder;
            ((StringBuilder)localObject9).<init>();
            ((StringBuilder)localObject9).append("SpecialEffectsController: Container ");
            localObject15 = getContainer();
            ((StringBuilder)localObject9).append(localObject15);
            localObject15 = " has not been laid out. Completing operation ";
            ((StringBuilder)localObject9).append((String)localObject15);
            ((StringBuilder)localObject9).append(localObject10);
          }
          ((DefaultSpecialEffectsController.SpecialEffectsInfo)localObject18).OooO00o();
        }
        else
        {
          localObject9 = ((DefaultSpecialEffectsController.SpecialEffectsInfo)localObject18).getOperation().getFragment();
          localObject15 = ((DefaultSpecialEffectsController.SpecialEffectsInfo)localObject18).getSignal();
          localObject14 = new androidx/fragment/app/OooO;
          ((OooO)localObject14).<init>((DefaultSpecialEffectsController.TransitionInfo)localObject18, (SpecialEffectsController.Operation)localObject10);
          ((FragmentTransitionImpl)localObject6).OooOOo0((Fragment)localObject9, localObject1, (CancellationSignal)localObject15, (Runnable)localObject14);
        }
      }
    }
    localObject2 = getContainer();
    boolean bool7 = ViewCompat.OoooOOO((View)localObject2);
    if (!bool7) {
      return localObject4;
    }
    FragmentTransition.OooO0o0((List)localObject11, 4);
    localObject13 = ((FragmentTransitionImpl)localObject6).OooOO0o((ArrayList)localObject7);
    bool7 = FragmentManager.isLoggingEnabled(n);
    if (bool7)
    {
      localObject2 = ((ArrayList)localObject8).iterator();
      boolean bool14;
      for (;;)
      {
        bool14 = ((Iterator)localObject2).hasNext();
        localObject5 = " Name: ";
        localObject18 = "View: ";
        if (!bool14) {
          break;
        }
        localObject3 = ((Iterator)localObject2).next();
        Intrinsics.OooO0o0(localObject3, "sharedElementFirstOutViews");
        localObject3 = (View)localObject3;
        localObject9 = new java/lang/StringBuilder;
        ((StringBuilder)localObject9).<init>();
        ((StringBuilder)localObject9).append((String)localObject18);
        ((StringBuilder)localObject9).append(localObject3);
        ((StringBuilder)localObject9).append((String)localObject5);
        localObject3 = ViewCompat.Oooo0O0((View)localObject3);
        ((StringBuilder)localObject9).append((String)localObject3);
      }
      localObject2 = ((ArrayList)localObject7).iterator();
      for (;;)
      {
        bool14 = ((Iterator)localObject2).hasNext();
        if (!bool14) {
          break;
        }
        localObject3 = ((Iterator)localObject2).next();
        Intrinsics.OooO0o0(localObject3, "sharedElementLastInViews");
        localObject3 = (View)localObject3;
        localObject9 = new java/lang/StringBuilder;
        ((StringBuilder)localObject9).<init>();
        ((StringBuilder)localObject9).append((String)localObject18);
        ((StringBuilder)localObject9).append(localObject3);
        ((StringBuilder)localObject9).append((String)localObject5);
        localObject3 = ViewCompat.Oooo0O0((View)localObject3);
        ((StringBuilder)localObject9).append((String)localObject3);
      }
    }
    localObject2 = getContainer();
    ((FragmentTransitionImpl)localObject6).OooO0OO((ViewGroup)localObject2, localObject1);
    localObject10 = getContainer();
    localObject9 = localObject6;
    localObject15 = localObject8;
    localObject14 = localObject7;
    localObject1 = localObject12;
    localObject12 = localObject24;
    ((FragmentTransitionImpl)localObject6).OooOOo((View)localObject10, (ArrayList)localObject8, (ArrayList)localObject7, (ArrayList)localObject13, localObject24);
    FragmentTransition.OooO0o0((List)localObject11, 0);
    ((FragmentTransitionImpl)localObject6).OooOo00(localObject1, (ArrayList)localObject8, (ArrayList)localObject7);
    return localObject4;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.DefaultSpecialEffectsController
 * JD-Core Version:    0.7.0.1
 */
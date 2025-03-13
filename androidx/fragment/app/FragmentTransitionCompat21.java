package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;

class FragmentTransitionCompat21
  extends FragmentTransitionImpl
{
  public static boolean OooOo0O(Transition paramTransition)
  {
    List localList = paramTransition.getTargetIds();
    boolean bool1 = FragmentTransitionImpl.OooO(localList);
    if (bool1)
    {
      localList = paramTransition.getTargetNames();
      bool1 = FragmentTransitionImpl.OooO(localList);
      if (bool1)
      {
        paramTransition = paramTransition.getTargetTypes();
        bool2 = FragmentTransitionImpl.OooO(paramTransition);
        if (bool2)
        {
          bool2 = false;
          paramTransition = null;
          return bool2;
        }
      }
    }
    boolean bool2 = true;
    return bool2;
  }
  
  public void OooO00o(Object paramObject, View paramView)
  {
    if (paramObject != null)
    {
      paramObject = (Transition)paramObject;
      paramObject.addTarget(paramView);
    }
  }
  
  public void OooO0O0(Object paramObject, ArrayList paramArrayList)
  {
    paramObject = (Transition)paramObject;
    if (paramObject == null) {
      return;
    }
    boolean bool1 = paramObject instanceof TransitionSet;
    int k = 0;
    Object localObject;
    if (bool1)
    {
      paramObject = (TransitionSet)paramObject;
      int i = paramObject.getTransitionCount();
      while (k < i)
      {
        localObject = paramObject.getTransitionAt(k);
        OooO0O0(localObject, paramArrayList);
        k += 1;
      }
    }
    boolean bool2 = OooOo0O(paramObject);
    if (!bool2)
    {
      List localList = paramObject.getTargets();
      bool2 = FragmentTransitionImpl.OooO(localList);
      if (bool2)
      {
        int j = paramArrayList.size();
        while (k < j)
        {
          localObject = (View)paramArrayList.get(k);
          paramObject.addTarget((View)localObject);
          k += 1;
        }
      }
    }
  }
  
  public void OooO0OO(ViewGroup paramViewGroup, Object paramObject)
  {
    paramObject = (Transition)paramObject;
    TransitionManager.beginDelayedTransition(paramViewGroup, paramObject);
  }
  
  public Object OooO0o(Object paramObject)
  {
    if (paramObject != null) {
      paramObject = ((Transition)paramObject).clone();
    } else {
      paramObject = null;
    }
    return paramObject;
  }
  
  public boolean OooO0o0(Object paramObject)
  {
    return paramObject instanceof Transition;
  }
  
  public Object OooOO0(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    paramObject1 = (Transition)paramObject1;
    paramObject2 = (Transition)paramObject2;
    paramObject3 = (Transition)paramObject3;
    if ((paramObject1 != null) && (paramObject2 != null))
    {
      TransitionSet localTransitionSet = new android/transition/TransitionSet;
      localTransitionSet.<init>();
      paramObject1 = localTransitionSet.addTransition(paramObject1).addTransition(paramObject2);
      int i = 1;
      paramObject1 = paramObject1.setOrdering(i);
    }
    else if (paramObject1 == null)
    {
      if (paramObject2 != null) {
        paramObject1 = paramObject2;
      } else {
        paramObject1 = null;
      }
    }
    if (paramObject3 != null)
    {
      paramObject2 = new android/transition/TransitionSet;
      paramObject2.<init>();
      if (paramObject1 != null) {
        paramObject2.addTransition(paramObject1);
      }
      paramObject2.addTransition(paramObject3);
      return paramObject2;
    }
    return paramObject1;
  }
  
  public Object OooOO0O(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    TransitionSet localTransitionSet = new android/transition/TransitionSet;
    localTransitionSet.<init>();
    if (paramObject1 != null)
    {
      paramObject1 = (Transition)paramObject1;
      localTransitionSet.addTransition(paramObject1);
    }
    if (paramObject2 != null)
    {
      paramObject2 = (Transition)paramObject2;
      localTransitionSet.addTransition(paramObject2);
    }
    if (paramObject3 != null)
    {
      paramObject3 = (Transition)paramObject3;
      localTransitionSet.addTransition(paramObject3);
    }
    return localTransitionSet;
  }
  
  public void OooOOO(Object paramObject1, Object paramObject2, ArrayList paramArrayList1, Object paramObject3, ArrayList paramArrayList2, Object paramObject4, ArrayList paramArrayList3)
  {
    Object localObject = paramObject1;
    localObject = (Transition)paramObject1;
    FragmentTransitionCompat21.3 local3 = new androidx/fragment/app/FragmentTransitionCompat21$3;
    local3.<init>(this, paramObject2, paramArrayList1, paramObject3, paramArrayList2, paramObject4, paramArrayList3);
    ((Transition)localObject).addListener(local3);
  }
  
  public void OooOOO0(Object paramObject, View paramView, ArrayList paramArrayList)
  {
    paramObject = (Transition)paramObject;
    FragmentTransitionCompat21.2 local2 = new androidx/fragment/app/FragmentTransitionCompat21$2;
    local2.<init>(this, paramView, paramArrayList);
    paramObject.addListener(local2);
  }
  
  public void OooOOOO(Object paramObject, Rect paramRect)
  {
    if (paramObject != null)
    {
      paramObject = (Transition)paramObject;
      FragmentTransitionCompat21.5 local5 = new androidx/fragment/app/FragmentTransitionCompat21$5;
      local5.<init>(this, paramRect);
      paramObject.setEpicenterCallback(local5);
    }
  }
  
  public void OooOOOo(Object paramObject, View paramView)
  {
    if (paramView != null)
    {
      paramObject = (Transition)paramObject;
      Rect localRect = new android/graphics/Rect;
      localRect.<init>();
      OooO0oo(paramView, localRect);
      paramView = new androidx/fragment/app/FragmentTransitionCompat21$1;
      paramView.<init>(this, localRect);
      paramObject.setEpicenterCallback(paramView);
    }
  }
  
  public void OooOOo0(Fragment paramFragment, Object paramObject, CancellationSignal paramCancellationSignal, Runnable paramRunnable)
  {
    paramObject = (Transition)paramObject;
    paramFragment = new androidx/fragment/app/FragmentTransitionCompat21$4;
    paramFragment.<init>(this, paramRunnable);
    paramObject.addListener(paramFragment);
  }
  
  public void OooOOoo(Object paramObject, View paramView, ArrayList paramArrayList)
  {
    paramObject = (TransitionSet)paramObject;
    List localList = paramObject.getTargets();
    localList.clear();
    int i = paramArrayList.size();
    int j = 0;
    while (j < i)
    {
      View localView = (View)paramArrayList.get(j);
      FragmentTransitionImpl.OooO0Oo(localList, localView);
      j += 1;
    }
    localList.add(paramView);
    paramArrayList.add(paramView);
    OooO0O0(paramObject, paramArrayList);
  }
  
  public Object OooOo0(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    TransitionSet localTransitionSet = new android/transition/TransitionSet;
    localTransitionSet.<init>();
    paramObject = (Transition)paramObject;
    localTransitionSet.addTransition(paramObject);
    return localTransitionSet;
  }
  
  public void OooOo00(Object paramObject, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    paramObject = (TransitionSet)paramObject;
    if (paramObject != null)
    {
      paramObject.getTargets().clear();
      List localList = paramObject.getTargets();
      localList.addAll(paramArrayList2);
      OooOo0o(paramObject, paramArrayList1, paramArrayList2);
    }
  }
  
  public void OooOo0o(Object paramObject, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    paramObject = (Transition)paramObject;
    boolean bool1 = paramObject instanceof TransitionSet;
    int k = 0;
    Object localObject1;
    if (bool1)
    {
      paramObject = (TransitionSet)paramObject;
      int i = paramObject.getTransitionCount();
      while (k < i)
      {
        localObject1 = paramObject.getTransitionAt(k);
        OooOo0o(localObject1, paramArrayList1, paramArrayList2);
        k += 1;
      }
    }
    boolean bool2 = OooOo0O(paramObject);
    if (!bool2)
    {
      Object localObject2 = paramObject.getTargets();
      if (localObject2 != null)
      {
        int m = ((List)localObject2).size();
        int n = paramArrayList1.size();
        if (m == n)
        {
          bool2 = ((List)localObject2).containsAll(paramArrayList1);
          if (bool2)
          {
            int j;
            if (paramArrayList2 == null)
            {
              bool2 = false;
              localObject2 = null;
            }
            else
            {
              j = paramArrayList2.size();
            }
            while (k < j)
            {
              localObject1 = (View)paramArrayList2.get(k);
              paramObject.addTarget((View)localObject1);
              k += 1;
            }
            int i1 = paramArrayList1.size() + -1;
            while (i1 >= 0)
            {
              localObject2 = (View)paramArrayList1.get(i1);
              paramObject.removeTarget((View)localObject2);
              i1 += -1;
            }
          }
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentTransitionCompat21
 * JD-Core Version:    0.7.0.1
 */
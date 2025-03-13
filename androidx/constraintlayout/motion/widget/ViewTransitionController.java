package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.SharedValues;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class ViewTransitionController
{
  public final MotionLayout OooO00o;
  public ArrayList OooO0O0;
  public HashSet OooO0OO;
  public String OooO0Oo;
  public ArrayList OooO0o;
  public ArrayList OooO0o0;
  
  public ViewTransitionController(MotionLayout paramMotionLayout)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO0O0 = localArrayList;
    this.OooO0Oo = "ViewTransitionController";
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO0o = localArrayList;
    this.OooO00o = paramMotionLayout;
  }
  
  public void OooO(int paramInt, View... paramVarArgs)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Iterator localIterator = this.OooO0O0.iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      ViewTransition localViewTransition = (ViewTransition)localIterator.next();
      int i = localViewTransition.getId();
      if (i == paramInt)
      {
        i = paramVarArgs.length;
        int j = 0;
        while (j < i)
        {
          View localView = paramVarArgs[j];
          boolean bool3 = localViewTransition.OooO0Oo(localView);
          if (bool3) {
            localArrayList.add(localView);
          }
          j += 1;
        }
        boolean bool2 = localArrayList.isEmpty();
        if (!bool2)
        {
          View[] arrayOfView = new View[0];
          arrayOfView = (View[])localArrayList.toArray(arrayOfView);
          OooOO0(localViewTransition, arrayOfView);
          localArrayList.clear();
        }
      }
    }
  }
  
  public void OooO00o(ViewTransition paramViewTransition)
  {
    this.OooO0O0.add(paramViewTransition);
    this.OooO0OO = null;
    int i = paramViewTransition.getStateTransition();
    int k = 4;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0)
    {
      OooO0o(paramViewTransition, i);
      break;
      j = paramViewTransition.getStateTransition();
      int m = 5;
      if (j != m) {
        break;
      }
    }
  }
  
  public void OooO0O0(ViewTransition.Animate paramAnimate)
  {
    ArrayList localArrayList = this.OooO0o0;
    if (localArrayList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      this.OooO0o0 = localArrayList;
    }
    this.OooO0o0.add(paramAnimate);
  }
  
  public void OooO0OO()
  {
    Object localObject1 = this.OooO0o0;
    if (localObject1 == null) {
      return;
    }
    localObject1 = ((ArrayList)localObject1).iterator();
    for (;;)
    {
      boolean bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = (ViewTransition.Animate)((Iterator)localObject1).next();
      ((ViewTransition.Animate)localObject2).OooO00o();
    }
    localObject1 = this.OooO0o0;
    Object localObject2 = this.OooO0o;
    ((ArrayList)localObject1).removeAll((Collection)localObject2);
    this.OooO0o.clear();
    localObject1 = this.OooO0o0;
    boolean bool2 = ((ArrayList)localObject1).isEmpty();
    if (bool2)
    {
      bool2 = false;
      localObject1 = null;
      this.OooO0o0 = null;
    }
  }
  
  public boolean OooO0Oo(int paramInt, MotionController paramMotionController)
  {
    Iterator localIterator = this.OooO0O0.iterator();
    ViewTransition localViewTransition;
    int i;
    do
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localViewTransition = (ViewTransition)localIterator.next();
      i = localViewTransition.getId();
    } while (i != paramInt);
    localViewTransition.OooO0o.OooO00o(paramMotionController);
    return true;
    return false;
  }
  
  public final void OooO0o(ViewTransition paramViewTransition, boolean paramBoolean)
  {
    int i = paramViewTransition.getSharedValueID();
    int j = paramViewTransition.getSharedValue();
    SharedValues localSharedValues = ConstraintLayout.getSharedValues();
    int k = paramViewTransition.getSharedValueID();
    ViewTransitionController.1 local1 = new androidx/constraintlayout/motion/widget/ViewTransitionController$1;
    local1.<init>(this, paramViewTransition, i, paramBoolean, j);
    localSharedValues.OooO00o(k, local1);
  }
  
  public void OooO0o0()
  {
    this.OooO00o.invalidate();
  }
  
  public void OooO0oO(ViewTransition.Animate paramAnimate)
  {
    this.OooO0o.add(paramAnimate);
  }
  
  public void OooO0oo(MotionEvent paramMotionEvent)
  {
    ViewTransitionController localViewTransitionController = this;
    Object localObject1 = this.OooO00o;
    int i = ((MotionLayout)localObject1).getCurrentState();
    int j = -1;
    if (i == j) {
      return;
    }
    localObject1 = this.OooO0OO;
    boolean bool2;
    Object localObject2;
    MotionLayout localMotionLayout;
    int m;
    int n;
    Object localObject3;
    Object localObject4;
    if (localObject1 == null)
    {
      localObject1 = new java/util/HashSet;
      ((HashSet)localObject1).<init>();
      this.OooO0OO = ((HashSet)localObject1);
      localObject1 = this.OooO0O0.iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject1).hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = (ViewTransition)((Iterator)localObject1).next();
        localMotionLayout = localViewTransitionController.OooO00o;
        m = localMotionLayout.getChildCount();
        n = 0;
        while (n < m)
        {
          localObject3 = localViewTransitionController.OooO00o.getChildAt(n);
          boolean bool4 = ((ViewTransition)localObject2).OooO0oO((View)localObject3);
          if (bool4)
          {
            ((View)localObject3).getId();
            localObject4 = localViewTransitionController.OooO0OO;
            ((HashSet)localObject4).add(localObject3);
          }
          n += 1;
        }
      }
    }
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    int i1 = paramMotionEvent.getAction();
    localObject1 = localViewTransitionController.OooO0o0;
    boolean bool1;
    if (localObject1 != null)
    {
      bool1 = ((ArrayList)localObject1).isEmpty();
      if (!bool1)
      {
        localObject1 = localViewTransitionController.OooO0o0.iterator();
        for (;;)
        {
          bool2 = ((Iterator)localObject1).hasNext();
          if (!bool2) {
            break;
          }
          localObject2 = (ViewTransition.Animate)((Iterator)localObject1).next();
          ((ViewTransition.Animate)localObject2).OooO0Oo(i1, f1, f2);
        }
      }
    }
    int i2 = 1;
    if ((i1 == 0) || (i1 == i2))
    {
      ConstraintSet localConstraintSet = localViewTransitionController.OooO00o.getConstraintSet(i);
      localObject1 = localViewTransitionController.OooO0O0;
      Iterator localIterator1 = ((ArrayList)localObject1).iterator();
      do
      {
        bool1 = localIterator1.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = localIterator1.next();
        localObject4 = localObject1;
        localObject4 = (ViewTransition)localObject1;
        bool1 = ((ViewTransition)localObject4).OooO(i1);
      } while (!bool1);
      localObject1 = localViewTransitionController.OooO0OO;
      Iterator localIterator2 = ((HashSet)localObject1).iterator();
      for (;;)
      {
        bool1 = localIterator2.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (View)localIterator2.next();
        bool2 = ((ViewTransition)localObject4).OooO0oO((View)localObject1);
        if (bool2)
        {
          ((View)localObject1).getHitRect(localRect);
          int k = (int)f1;
          m = (int)f2;
          boolean bool3 = localRect.contains(k, m);
          Object localObject6;
          if (bool3)
          {
            localMotionLayout = localViewTransitionController.OooO00o;
            localObject3 = new View[i2];
            localObject3[0] = localObject1;
            localObject1 = localObject4;
            localObject2 = this;
            n = i;
            Object localObject5 = localObject3;
            localObject3 = localConstraintSet;
            localObject6 = localObject4;
            localObject4 = localObject5;
            ((ViewTransition)localObject1).OooO0OO(this, localMotionLayout, i, localConstraintSet, localObject5);
          }
          else
          {
            localObject6 = localObject4;
          }
          localObject4 = localObject6;
        }
      }
    }
  }
  
  public final void OooOO0(ViewTransition paramViewTransition, View... paramVarArgs)
  {
    MotionLayout localMotionLayout1 = this.OooO00o;
    int i = localMotionLayout1.getCurrentState();
    int j = paramViewTransition.OooO0o0;
    int k = 2;
    ConstraintSet localConstraintSet;
    MotionLayout localMotionLayout2;
    if (j != k)
    {
      j = -1;
      if (i == j)
      {
        paramViewTransition = new java/lang/StringBuilder;
        paramViewTransition.<init>();
        paramViewTransition.append("No support for ViewTransition within transition yet. Currently: ");
        paramVarArgs = this.OooO00o.toString();
        paramViewTransition.append(paramVarArgs);
        return;
      }
      localMotionLayout1 = this.OooO00o;
      localConstraintSet = localMotionLayout1.getConstraintSet(i);
      if (localConstraintSet == null) {
        return;
      }
      localMotionLayout2 = this.OooO00o;
      paramViewTransition.OooO0OO(this, localMotionLayout2, i, localConstraintSet, paramVarArgs);
    }
    else
    {
      localMotionLayout2 = this.OooO00o;
      localConstraintSet = null;
      paramViewTransition.OooO0OO(this, localMotionLayout2, i, null, paramVarArgs);
    }
  }
  
  public boolean isViewTransitionEnabled(int paramInt)
  {
    Iterator localIterator = this.OooO0O0.iterator();
    ViewTransition localViewTransition;
    int i;
    do
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localViewTransition = (ViewTransition)localIterator.next();
      i = localViewTransition.getId();
    } while (i != paramInt);
    return localViewTransition.isEnabled();
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.ViewTransitionController
 * JD-Core Version:    0.7.0.1
 */
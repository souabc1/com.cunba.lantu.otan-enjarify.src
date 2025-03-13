package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.Placeholder;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.core.widgets.WidgetContainer;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Constraints.LayoutParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class MotionLayout$Model
{
  public ConstraintWidgetContainer OooO00o;
  public ConstraintWidgetContainer OooO0O0;
  public ConstraintSet OooO0OO;
  public ConstraintSet OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  
  public final void OooO(ConstraintWidgetContainer paramConstraintWidgetContainer, ConstraintSet paramConstraintSet)
  {
    SparseArray localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>();
    Constraints.LayoutParams localLayoutParams = new androidx/constraintlayout/widget/Constraints$LayoutParams;
    int i = -2;
    localLayoutParams.<init>(i, i);
    localSparseArray.clear();
    localSparseArray.put(0, paramConstraintWidgetContainer);
    Object localObject1 = this.OooO0oO;
    i = ((View)localObject1).getId();
    localSparseArray.put(i, paramConstraintWidgetContainer);
    Object localObject2;
    int m;
    Object localObject3;
    Object localObject4;
    if (paramConstraintSet != null)
    {
      i = paramConstraintSet.OooO0Oo;
      if (i != 0)
      {
        localObject1 = this.OooO0oO;
        localObject2 = this.OooO0O0;
        m = ((ConstraintLayout)localObject1).getOptimizationLevel();
        localObject3 = this.OooO0oO;
        int n = ((View)localObject3).getHeight();
        int i1 = 1073741824;
        n = View.MeasureSpec.makeMeasureSpec(n, i1);
        localObject4 = this.OooO0oO;
        int i2 = ((View)localObject4).getWidth();
        i1 = View.MeasureSpec.makeMeasureSpec(i2, i1);
        MotionLayout.OooO0oo((MotionLayout)localObject1, (ConstraintWidgetContainer)localObject2, m, n, i1);
      }
    }
    localObject1 = paramConstraintWidgetContainer.getChildren().iterator();
    boolean bool4;
    int i3;
    Object localObject5;
    for (;;)
    {
      bool4 = ((Iterator)localObject1).hasNext();
      i3 = 1;
      if (!bool4) {
        break;
      }
      localObject2 = (ConstraintWidget)((Iterator)localObject1).next();
      ((ConstraintWidget)localObject2).setAnimated(i3);
      localObject5 = (View)((ConstraintWidget)localObject2).getCompanionWidget();
      m = ((View)localObject5).getId();
      localSparseArray.put(m, localObject2);
    }
    localObject1 = paramConstraintWidgetContainer.getChildren();
    Iterator localIterator = ((ArrayList)localObject1).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = localIterator.next();
      Object localObject6 = localObject1;
      localObject6 = (ConstraintWidget)localObject1;
      localObject1 = ((ConstraintWidget)localObject6).getCompanionWidget();
      Object localObject7 = localObject1;
      localObject7 = (View)localObject1;
      int j = ((View)localObject7).getId();
      paramConstraintSet.OooOO0o(j, localLayoutParams);
      j = ((View)localObject7).getId();
      j = paramConstraintSet.getWidth(j);
      ((ConstraintWidget)localObject6).setWidth(j);
      j = ((View)localObject7).getId();
      j = paramConstraintSet.getHeight(j);
      ((ConstraintWidget)localObject6).setHeight(j);
      boolean bool2 = localObject7 instanceof ConstraintHelper;
      if (bool2)
      {
        localObject1 = localObject7;
        localObject1 = (ConstraintHelper)localObject7;
        paramConstraintSet.OooOO0((ConstraintHelper)localObject1, (ConstraintWidget)localObject6, localLayoutParams, localSparseArray);
        bool2 = localObject7 instanceof androidx.constraintlayout.widget.Barrier;
        if (bool2)
        {
          localObject1 = localObject7;
          localObject1 = (androidx.constraintlayout.widget.Barrier)localObject7;
          ((ConstraintHelper)localObject1).OooOo0o();
        }
      }
      int k = this.OooO0oO.getLayoutDirection();
      localLayoutParams.resolveLayoutDirection(k);
      localObject1 = this.OooO0oO;
      bool4 = false;
      localObject2 = null;
      localObject5 = localObject7;
      localObject3 = localObject6;
      localObject4 = localSparseArray;
      MotionLayout.OooO((MotionLayout)localObject1, false, (View)localObject7, (ConstraintWidget)localObject6, localLayoutParams, localSparseArray);
      k = ((View)localObject7).getId();
      k = paramConstraintSet.getVisibilityMode(k);
      if (k == i3)
      {
        k = ((View)localObject7).getVisibility();
      }
      else
      {
        k = ((View)localObject7).getId();
        k = paramConstraintSet.getVisibility(k);
      }
      ((ConstraintWidget)localObject6).setVisibility(k);
    }
    paramConstraintSet = paramConstraintWidgetContainer.getChildren().iterator();
    for (;;)
    {
      boolean bool3 = paramConstraintSet.hasNext();
      if (!bool3) {
        break;
      }
      localObject1 = (ConstraintWidget)paramConstraintSet.next();
      bool4 = localObject1 instanceof VirtualLayout;
      if (bool4)
      {
        localObject2 = (ConstraintHelper)((ConstraintWidget)localObject1).getCompanionWidget();
        localObject1 = (Helper)localObject1;
        ((ConstraintHelper)localObject2).OooOo0(paramConstraintWidgetContainer, (Helper)localObject1, localSparseArray);
        localObject1 = (VirtualLayout)localObject1;
        ((VirtualLayout)localObject1).OoooOO0();
      }
    }
  }
  
  public void OooO00o()
  {
    Model localModel = this;
    MotionLayout localMotionLayout1 = this.OooO0oO;
    int i = localMotionLayout1.getChildCount();
    this.OooO0oO.o00OoooO.clear();
    SparseArray localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>();
    int[] arrayOfInt = new int[i];
    int j = 0;
    MotionController localMotionController = null;
    Object localObject1;
    Object localObject2;
    int k;
    Object localObject3;
    while (j < i)
    {
      localObject1 = localModel.OooO0oO.getChildAt(j);
      localObject2 = new androidx/constraintlayout/motion/widget/MotionController;
      ((MotionController)localObject2).<init>((View)localObject1);
      k = ((View)localObject1).getId();
      arrayOfInt[j] = k;
      localSparseArray.put(k, localObject2);
      localObject3 = localModel.OooO0oO.o00OoooO;
      ((HashMap)localObject3).put(localObject1, localObject2);
      j += 1;
    }
    j = 0;
    localMotionController = null;
    label489:
    int i2;
    while (j < i)
    {
      localObject1 = localModel.OooO0oO.getChildAt(j);
      localObject2 = localModel.OooO0oO.o00OoooO.get(localObject1);
      Object localObject4 = localObject2;
      localObject4 = (MotionController)localObject2;
      if (localObject4 != null)
      {
        localObject2 = localModel.OooO0OO;
        String str1 = ")";
        String str2 = " (";
        String str3 = "no widget for  ";
        Object localObject5;
        int n;
        if (localObject2 != null)
        {
          localObject2 = localModel.OooO00o;
          localObject2 = localModel.OooO0Oo((ConstraintWidgetContainer)localObject2, (View)localObject1);
          if (localObject2 != null)
          {
            localObject2 = MotionLayout.OooOOoo(localModel.OooO0oO, (ConstraintWidget)localObject2);
            localObject3 = localModel.OooO0OO;
            localObject5 = localModel.OooO0oO;
            int m = ((View)localObject5).getWidth();
            MotionLayout localMotionLayout2 = localModel.OooO0oO;
            n = localMotionLayout2.getHeight();
            ((MotionController)localObject4).OooOOo((Rect)localObject2, (ConstraintSet)localObject3, m, n);
          }
          else
          {
            localObject2 = localModel.OooO0oO;
            int i1 = ((MotionLayout)localObject2).o00o00oO;
            if (i1 != 0)
            {
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject3 = Debug.getLocation();
              ((StringBuilder)localObject2).append((String)localObject3);
              ((StringBuilder)localObject2).append(str3);
              localObject3 = Debug.OooO0O0((View)localObject1);
              ((StringBuilder)localObject2).append((String)localObject3);
              ((StringBuilder)localObject2).append(str2);
              localObject3 = localObject1.getClass().getName();
              ((StringBuilder)localObject2).append((String)localObject3);
              ((StringBuilder)localObject2).append(str1);
            }
          }
        }
        else
        {
          localObject2 = localModel.OooO0oO;
          boolean bool = MotionLayout.OooOo0O((MotionLayout)localObject2);
          if (bool)
          {
            localObject2 = localModel.OooO0oO.o00oOooO.get(localObject1);
            localObject3 = localObject2;
            localObject3 = (ViewState)localObject2;
            localObject2 = localModel.OooO0oO;
            n = ((MotionLayout)localObject2).o00oOo00;
            int i3 = MotionLayout.OooOo00((MotionLayout)localObject2);
            int i4 = MotionLayout.OooOo0(localModel.OooO0oO);
            localObject2 = localObject4;
            localObject5 = localObject1;
            localObject6 = str3;
            ((MotionController)localObject4).OooOOoo((ViewState)localObject3, (View)localObject1, n, i3, i4);
            break label489;
          }
        }
        localObject6 = str3;
        localObject2 = localModel.OooO0Oo;
        if (localObject2 != null)
        {
          localObject2 = localModel.OooO0O0;
          localObject2 = localModel.OooO0Oo((ConstraintWidgetContainer)localObject2, (View)localObject1);
          if (localObject2 != null)
          {
            localObject6 = MotionLayout.OooOOoo(localModel.OooO0oO, (ConstraintWidget)localObject2);
            localObject1 = localModel.OooO0Oo;
            localObject2 = localModel.OooO0oO;
            i2 = ((View)localObject2).getWidth();
            localObject3 = localModel.OooO0oO;
            k = ((View)localObject3).getHeight();
            ((MotionController)localObject4).OooOOo0((Rect)localObject6, (ConstraintSet)localObject1, i2, k);
          }
          else
          {
            localObject2 = localModel.OooO0oO;
            i2 = ((MotionLayout)localObject2).o00o00oO;
            if (i2 != 0)
            {
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject3 = Debug.getLocation();
              ((StringBuilder)localObject2).append((String)localObject3);
              ((StringBuilder)localObject2).append((String)localObject6);
              localObject6 = Debug.OooO0O0((View)localObject1);
              ((StringBuilder)localObject2).append((String)localObject6);
              ((StringBuilder)localObject2).append(str2);
              localObject6 = localObject1.getClass().getName();
              ((StringBuilder)localObject2).append((String)localObject6);
              ((StringBuilder)localObject2).append(str1);
            }
          }
        }
      }
      j += 1;
    }
    int i5 = 0;
    Object localObject6 = null;
    while (i5 < i)
    {
      j = arrayOfInt[i5];
      localMotionController = (MotionController)localSparseArray.get(j);
      int i6 = localMotionController.getAnimateRelativeTo();
      i2 = -1;
      if (i6 != i2)
      {
        localObject1 = (MotionController)localSparseArray.get(i6);
        localMotionController.setupRelative((MotionController)localObject1);
      }
      i5 += 1;
    }
  }
  
  public final void OooO0O0(int paramInt1, int paramInt2)
  {
    MotionLayout localMotionLayout = this.OooO0oO;
    int i = localMotionLayout.getOptimizationLevel();
    Object localObject1 = this.OooO0oO;
    int j = ((MotionLayout)localObject1).o00OooO0;
    int k = ((MotionLayout)localObject1).getStartState();
    Object localObject2;
    Object localObject3;
    int m;
    label85:
    int n;
    if (j == k)
    {
      localObject1 = this.OooO0oO;
      localObject2 = this.OooO0O0;
      localObject3 = this.OooO0Oo;
      if (localObject3 != null)
      {
        m = ((ConstraintSet)localObject3).OooO0Oo;
        if (m != 0)
        {
          m = paramInt2;
          break label85;
        }
      }
      m = paramInt1;
      if (localObject3 != null)
      {
        n = ((ConstraintSet)localObject3).OooO0Oo;
        if (n != 0)
        {
          n = paramInt1;
          break label114;
        }
      }
      n = paramInt2;
      label114:
      MotionLayout.OooOOO((MotionLayout)localObject1, (ConstraintWidgetContainer)localObject2, i, m, n);
      localObject1 = this.OooO0OO;
      if (localObject1 != null)
      {
        localObject2 = this.OooO0oO;
        localObject3 = this.OooO00o;
        k = ((ConstraintSet)localObject1).OooO0Oo;
        if (k == 0) {
          m = paramInt1;
        } else {
          m = paramInt2;
        }
        if (k == 0) {
          paramInt1 = paramInt2;
        }
        MotionLayout.OooOOOO((MotionLayout)localObject2, (ConstraintWidgetContainer)localObject3, i, m, paramInt1);
      }
    }
    else
    {
      localObject1 = this.OooO0OO;
      if (localObject1 != null)
      {
        localObject2 = this.OooO0oO;
        localObject3 = this.OooO00o;
        k = ((ConstraintSet)localObject1).OooO0Oo;
        if (k == 0) {
          m = paramInt1;
        } else {
          m = paramInt2;
        }
        if (k == 0) {
          k = paramInt2;
        } else {
          k = paramInt1;
        }
        MotionLayout.OooOOOo((MotionLayout)localObject2, (ConstraintWidgetContainer)localObject3, i, m, k);
      }
      localObject1 = this.OooO0oO;
      localObject2 = this.OooO0O0;
      localObject3 = this.OooO0Oo;
      if (localObject3 != null)
      {
        m = ((ConstraintSet)localObject3).OooO0Oo;
        if (m != 0)
        {
          m = paramInt2;
          break label311;
        }
      }
      m = paramInt1;
      label311:
      if (localObject3 != null)
      {
        n = ((ConstraintSet)localObject3).OooO0Oo;
        if (n != 0) {}
      }
      else
      {
        paramInt1 = paramInt2;
      }
      MotionLayout.OooOOo0((MotionLayout)localObject1, (ConstraintWidgetContainer)localObject2, i, m, paramInt1);
    }
  }
  
  public void OooO0OO(ConstraintWidgetContainer paramConstraintWidgetContainer1, ConstraintWidgetContainer paramConstraintWidgetContainer2)
  {
    Object localObject1 = paramConstraintWidgetContainer1.getChildren();
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    localHashMap.put(paramConstraintWidgetContainer1, paramConstraintWidgetContainer2);
    Object localObject2 = paramConstraintWidgetContainer2.getChildren();
    ((ArrayList)localObject2).clear();
    paramConstraintWidgetContainer2.OooOOO(paramConstraintWidgetContainer1, localHashMap);
    paramConstraintWidgetContainer1 = ((ArrayList)localObject1).iterator();
    for (;;)
    {
      boolean bool1 = paramConstraintWidgetContainer1.hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = (ConstraintWidget)paramConstraintWidgetContainer1.next();
      boolean bool2 = localObject2 instanceof androidx.constraintlayout.core.widgets.Barrier;
      Object localObject3;
      if (bool2)
      {
        localObject3 = new androidx/constraintlayout/core/widgets/Barrier;
        ((androidx.constraintlayout.core.widgets.Barrier)localObject3).<init>();
      }
      else
      {
        bool2 = localObject2 instanceof Guideline;
        if (bool2)
        {
          localObject3 = new androidx/constraintlayout/core/widgets/Guideline;
          ((Guideline)localObject3).<init>();
        }
        else
        {
          bool2 = localObject2 instanceof Flow;
          if (bool2)
          {
            localObject3 = new androidx/constraintlayout/core/widgets/Flow;
            ((Flow)localObject3).<init>();
          }
          else
          {
            bool2 = localObject2 instanceof Placeholder;
            if (bool2)
            {
              localObject3 = new androidx/constraintlayout/core/widgets/Placeholder;
              ((Placeholder)localObject3).<init>();
            }
            else
            {
              bool2 = localObject2 instanceof Helper;
              if (bool2)
              {
                localObject3 = new androidx/constraintlayout/core/widgets/HelperWidget;
                ((HelperWidget)localObject3).<init>();
              }
              else
              {
                localObject3 = new androidx/constraintlayout/core/widgets/ConstraintWidget;
                ((ConstraintWidget)localObject3).<init>();
              }
            }
          }
        }
      }
      paramConstraintWidgetContainer2.OooO0O0((ConstraintWidget)localObject3);
      localHashMap.put(localObject2, localObject3);
    }
    paramConstraintWidgetContainer1 = ((ArrayList)localObject1).iterator();
    for (;;)
    {
      boolean bool3 = paramConstraintWidgetContainer1.hasNext();
      if (!bool3) {
        break;
      }
      paramConstraintWidgetContainer2 = (ConstraintWidget)paramConstraintWidgetContainer1.next();
      localObject1 = (ConstraintWidget)localHashMap.get(paramConstraintWidgetContainer2);
      ((ConstraintWidget)localObject1).OooOOO(paramConstraintWidgetContainer2, localHashMap);
    }
  }
  
  public ConstraintWidget OooO0Oo(ConstraintWidgetContainer paramConstraintWidgetContainer, View paramView)
  {
    Object localObject1 = paramConstraintWidgetContainer.getCompanionWidget();
    if (localObject1 == paramView) {
      return paramConstraintWidgetContainer;
    }
    paramConstraintWidgetContainer = paramConstraintWidgetContainer.getChildren();
    int i = paramConstraintWidgetContainer.size();
    int j = 0;
    while (j < i)
    {
      ConstraintWidget localConstraintWidget = (ConstraintWidget)paramConstraintWidgetContainer.get(j);
      Object localObject2 = localConstraintWidget.getCompanionWidget();
      if (localObject2 == paramView) {
        return localConstraintWidget;
      }
      j += 1;
    }
    return null;
  }
  
  public boolean OooO0o(int paramInt1, int paramInt2)
  {
    int i = this.OooO0o0;
    if (paramInt1 == i)
    {
      paramInt1 = this.OooO0o;
      if (paramInt2 == paramInt1) {
        return 0;
      }
    }
    paramInt1 = 1;
    return paramInt1;
  }
  
  public void OooO0o0(ConstraintWidgetContainer paramConstraintWidgetContainer, ConstraintSet paramConstraintSet1, ConstraintSet paramConstraintSet2)
  {
    this.OooO0OO = paramConstraintSet1;
    this.OooO0Oo = paramConstraintSet2;
    paramConstraintWidgetContainer = new androidx/constraintlayout/core/widgets/ConstraintWidgetContainer;
    paramConstraintWidgetContainer.<init>();
    this.OooO00o = paramConstraintWidgetContainer;
    paramConstraintWidgetContainer = new androidx/constraintlayout/core/widgets/ConstraintWidgetContainer;
    paramConstraintWidgetContainer.<init>();
    this.OooO0O0 = paramConstraintWidgetContainer;
    paramConstraintWidgetContainer = this.OooO00o;
    Object localObject = MotionLayout.OooOo(this.OooO0oO).getMeasurer();
    paramConstraintWidgetContainer.setMeasurer((BasicMeasure.Measurer)localObject);
    paramConstraintWidgetContainer = this.OooO0O0;
    localObject = MotionLayout.OooOoO0(this.OooO0oO).getMeasurer();
    paramConstraintWidgetContainer.setMeasurer((BasicMeasure.Measurer)localObject);
    this.OooO00o.OoooO();
    this.OooO0O0.OoooO();
    paramConstraintWidgetContainer = MotionLayout.OooOoO(this.OooO0oO);
    localObject = this.OooO00o;
    OooO0OO(paramConstraintWidgetContainer, (ConstraintWidgetContainer)localObject);
    paramConstraintWidgetContainer = MotionLayout.OooOoOO(this.OooO0oO);
    localObject = this.OooO0O0;
    OooO0OO(paramConstraintWidgetContainer, (ConstraintWidgetContainer)localObject);
    paramConstraintWidgetContainer = this.OooO0oO;
    float f = paramConstraintWidgetContainer.o00o000O;
    double d1 = f;
    double d2 = 0.5D;
    boolean bool1 = d1 < d2;
    if (bool1)
    {
      if (paramConstraintSet1 != null)
      {
        paramConstraintWidgetContainer = this.OooO00o;
        OooO(paramConstraintWidgetContainer, paramConstraintSet1);
      }
      paramConstraintWidgetContainer = this.OooO0O0;
      OooO(paramConstraintWidgetContainer, paramConstraintSet2);
    }
    else
    {
      paramConstraintWidgetContainer = this.OooO0O0;
      OooO(paramConstraintWidgetContainer, paramConstraintSet2);
      if (paramConstraintSet1 != null)
      {
        paramConstraintWidgetContainer = this.OooO00o;
        OooO(paramConstraintWidgetContainer, paramConstraintSet1);
      }
    }
    paramConstraintWidgetContainer = this.OooO00o;
    boolean bool2 = MotionLayout.OooOoo0(this.OooO0oO);
    paramConstraintWidgetContainer.setRtl(bool2);
    this.OooO00o.o00ooo();
    paramConstraintWidgetContainer = this.OooO0O0;
    paramConstraintSet1 = this.OooO0oO;
    bool2 = MotionLayout.OooOoo(paramConstraintSet1);
    paramConstraintWidgetContainer.setRtl(bool2);
    this.OooO0O0.o00ooo();
    paramConstraintWidgetContainer = this.OooO0oO.getLayoutParams();
    if (paramConstraintWidgetContainer != null)
    {
      int j = paramConstraintWidgetContainer.width;
      int k = -2;
      if (j == k)
      {
        paramConstraintSet1 = this.OooO00o;
        localObject = ConstraintWidget.DimensionBehaviour.o00Ooo00;
        paramConstraintSet1.setHorizontalDimensionBehaviour((ConstraintWidget.DimensionBehaviour)localObject);
        paramConstraintSet1 = this.OooO0O0;
        paramConstraintSet1.setHorizontalDimensionBehaviour((ConstraintWidget.DimensionBehaviour)localObject);
      }
      int i = paramConstraintWidgetContainer.height;
      if (i == k)
      {
        paramConstraintWidgetContainer = this.OooO00o;
        paramConstraintSet1 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
        paramConstraintWidgetContainer.setVerticalDimensionBehaviour(paramConstraintSet1);
        paramConstraintWidgetContainer = this.OooO0O0;
        paramConstraintWidgetContainer.setVerticalDimensionBehaviour(paramConstraintSet1);
      }
    }
  }
  
  public void OooO0oO(int paramInt1, int paramInt2)
  {
    Model localModel = this;
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getMode(paramInt2);
    Object localObject1 = this.OooO0oO;
    ((MotionLayout)localObject1).o00oO0 = i;
    ((MotionLayout)localObject1).o00oO0O0 = j;
    ((ConstraintLayout)localObject1).getOptimizationLevel();
    OooO0O0(paramInt1, paramInt2);
    localObject1 = this.OooO0oO.getParent();
    boolean bool2 = localObject1 instanceof MotionLayout;
    int m = 1;
    float f1 = 1.4E-45F;
    if (bool2)
    {
      k = 1073741824;
      if ((i == k) && (j == k))
      {
        i = 0;
        localObject2 = null;
        f2 = 0.0F;
        break label112;
      }
    }
    i = m;
    float f2 = f1;
    label112:
    float f3;
    if (i != 0)
    {
      OooO0O0(paramInt1, paramInt2);
      localObject2 = localModel.OooO0oO;
      j = localModel.OooO00o.getWidth();
      ((MotionLayout)localObject2).o00oO000 = j;
      localObject2 = localModel.OooO0oO;
      j = localModel.OooO00o.getHeight();
      ((MotionLayout)localObject2).o00oO00O = j;
      localObject2 = localModel.OooO0oO;
      j = localModel.OooO0O0.getWidth();
      ((MotionLayout)localObject2).o00oO00o = j;
      localObject2 = localModel.OooO0oO;
      ConstraintWidgetContainer localConstraintWidgetContainer = localModel.OooO0O0;
      j = localConstraintWidgetContainer.getHeight();
      ((MotionLayout)localObject2).o00oOo = j;
      localObject2 = localModel.OooO0oO;
      j = ((MotionLayout)localObject2).o00oO000;
      k = ((MotionLayout)localObject2).o00oO00o;
      if (j == k)
      {
        j = ((MotionLayout)localObject2).o00oO00O;
        k = ((MotionLayout)localObject2).o00oOo;
        if (j == k)
        {
          j = 0;
          localConstraintWidgetContainer = null;
          f3 = 0.0F;
          break label286;
        }
      }
      j = m;
      f3 = f1;
      label286:
      ((MotionLayout)localObject2).o00oo000 = j;
    }
    Object localObject2 = localModel.OooO0oO;
    j = ((MotionLayout)localObject2).o00oO000;
    int k = ((MotionLayout)localObject2).o00oO00O;
    int n = ((MotionLayout)localObject2).o00oO0;
    int i1 = -1 << -1;
    float f4;
    if ((n == i1) || (n == 0))
    {
      f4 = j;
      float f5 = ((MotionLayout)localObject2).o0oOOo;
      i2 = ((MotionLayout)localObject2).o00oO00o - j;
      f3 = i2;
      f5 *= f3;
      f4 += f5;
      j = (int)f4;
    }
    int i3 = j;
    j = ((MotionLayout)localObject2).o00oO0O0;
    if ((j == i1) || (j == 0))
    {
      f3 = k;
      f4 = ((MotionLayout)localObject2).o0oOOo;
      i = ((MotionLayout)localObject2).o00oOo - k;
      f2 = i;
      f4 *= f2;
      f3 += f4;
      k = (int)f3;
    }
    int i4 = k;
    localObject2 = localModel.OooO00o;
    boolean bool1 = ((ConstraintWidgetContainer)localObject2).isWidthMeasuredTooSmall();
    if (!bool1)
    {
      localObject2 = localModel.OooO0O0;
      bool1 = ((ConstraintWidgetContainer)localObject2).isWidthMeasuredTooSmall();
      if (!bool1)
      {
        bool3 = false;
        break label505;
      }
    }
    boolean bool3 = m;
    label505:
    localObject2 = localModel.OooO00o;
    bool1 = ((ConstraintWidgetContainer)localObject2).isHeightMeasuredTooSmall();
    if (!bool1)
    {
      localObject2 = localModel.OooO0O0;
      bool1 = ((ConstraintWidgetContainer)localObject2).isHeightMeasuredTooSmall();
      if (!bool1)
      {
        bool4 = false;
        break label554;
      }
    }
    boolean bool4 = m;
    label554:
    MotionLayout localMotionLayout = localModel.OooO0oO;
    int i2 = paramInt1;
    MotionLayout.OooOOO0(localMotionLayout, paramInt1, paramInt2, i3, i4, bool3, bool4);
  }
  
  public void OooO0oo()
  {
    int i = MotionLayout.OooOO0(this.OooO0oO);
    int j = MotionLayout.OooOO0O(this.OooO0oO);
    OooO0oO(i, j);
    MotionLayout.OooOO0o(this.OooO0oO);
  }
  
  public void setMeasuredId(int paramInt1, int paramInt2)
  {
    this.OooO0o0 = paramInt1;
    this.OooO0o = paramInt2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionLayout.Model
 * JD-Core Version:    0.7.0.1
 */
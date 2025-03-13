package androidx.constraintlayout.widget;

import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer;
import java.util.ArrayList;

class ConstraintLayout$Measurer
  implements BasicMeasure.Measurer
{
  public ConstraintLayout OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  public int OooO0oO;
  
  public ConstraintLayout$Measurer(ConstraintLayout paramConstraintLayout1, ConstraintLayout paramConstraintLayout2)
  {
    this.OooO00o = paramConstraintLayout2;
  }
  
  public final void OooO00o()
  {
    Object localObject1 = this.OooO00o;
    int i = ((ViewGroup)localObject1).getChildCount();
    int j = 0;
    int k = 0;
    ConstraintHelper localConstraintHelper = null;
    Object localObject2;
    while (k < i)
    {
      localObject2 = this.OooO00o.getChildAt(k);
      boolean bool = localObject2 instanceof Placeholder;
      if (bool)
      {
        localObject2 = (Placeholder)localObject2;
        ConstraintLayout localConstraintLayout = this.OooO00o;
        ((Placeholder)localObject2).OooO00o(localConstraintLayout);
      }
      k += 1;
    }
    localObject1 = ConstraintLayout.access$100(this.OooO00o);
    i = ((ArrayList)localObject1).size();
    if (i > 0) {
      while (j < i)
      {
        localConstraintHelper = (ConstraintHelper)ConstraintLayout.access$100(this.OooO00o).get(j);
        localObject2 = this.OooO00o;
        localConstraintHelper.OooOOoo((ConstraintLayout)localObject2);
        j += 1;
      }
    }
  }
  
  public final void OooO0O0(ConstraintWidget paramConstraintWidget, BasicMeasure.Measure paramMeasure)
  {
    Measurer localMeasurer = this;
    ConstraintWidget localConstraintWidget = paramConstraintWidget;
    BasicMeasure.Measure localMeasure = paramMeasure;
    if (paramConstraintWidget == null) {
      return;
    }
    int i = paramConstraintWidget.getVisibility();
    int m = 8;
    float f1 = 1.121039E-044F;
    int n = 0;
    float f2 = 0.0F;
    if (i == m)
    {
      boolean bool1 = paramConstraintWidget.isInPlaceholder();
      if (!bool1)
      {
        paramMeasure.OooO0o0 = 0;
        paramMeasure.OooO0o = 0;
        paramMeasure.OooO0oO = 0;
        return;
      }
    }
    Object localObject1 = paramConstraintWidget.getParent();
    if (localObject1 == null) {
      return;
    }
    localObject1 = localMeasure.OooO00o;
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour1 = localMeasure.OooO0O0;
    int i1 = localMeasure.OooO0OO;
    int i3 = localMeasure.OooO0Oo;
    int i4 = localMeasurer.OooO0O0;
    int i11 = localMeasurer.OooO0OO;
    i4 += i11;
    i11 = localMeasurer.OooO0Oo;
    View localView = (View)paramConstraintWidget.getCompanionWidget();
    Object localObject2 = ConstraintLayout.1.OooO00o;
    int i16 = ((Enum)localObject1).ordinal();
    i16 = localObject2[i16];
    int i18 = 4;
    float f3 = 5.605194E-045F;
    int i23 = 3;
    int i25 = 2;
    n = 1;
    f2 = 1.4E-45F;
    Object localObject3;
    label414:
    int i17;
    if (i16 != n)
    {
      if (i16 != i25)
      {
        int i12;
        if (i16 != i23)
        {
          if (i16 != i18)
          {
            i1 = 0;
            localConstraintLayout = null;
            break label500;
          }
          i1 = localMeasurer.OooO0o;
          i16 = -2;
          f4 = 0.0F / 0.0F;
          i1 = ViewGroup.getChildMeasureSpec(i1, i11, i16);
          i11 = localConstraintWidget.OooOo0o;
          if (i11 == n)
          {
            i11 = n;
          }
          else
          {
            i11 = 0;
            localObject3 = null;
          }
          i16 = localMeasure.OooOO0;
          int i19 = BasicMeasure.Measure.OooOO0o;
          if (i16 != i19)
          {
            int i20 = BasicMeasure.Measure.OooOOO0;
            if (i16 != i20) {
              break label500;
            }
          }
          i16 = localView.getMeasuredHeight();
          int i21 = paramConstraintWidget.getHeight();
          if (i16 == i21)
          {
            i16 = n;
            f4 = f2;
          }
          else
          {
            i16 = 0;
            f4 = 0.0F;
            localDimensionBehaviour2 = null;
          }
          int i22 = localMeasure.OooOO0;
          i24 = BasicMeasure.Measure.OooOOO0;
          if ((i22 != i24) && (i11 != 0) && ((i11 == 0) || (i16 == 0)))
          {
            i12 = localView instanceof Placeholder;
            if (i12 == 0)
            {
              i12 = paramConstraintWidget.isResolvedHorizontally();
              if (i12 == 0)
              {
                i12 = 0;
                localObject3 = null;
                break label414;
              }
            }
          }
          i12 = n;
          if (i12 == 0) {
            break label500;
          }
          i1 = paramConstraintWidget.getWidth();
          break label487;
        }
        i1 = localMeasurer.OooO0o;
        i16 = paramConstraintWidget.getHorizontalMargin();
        i12 += i16;
        i17 = -1;
        f4 = 0.0F / 0.0F;
      }
      else
      {
        i1 = localMeasurer.OooO0o;
        i17 = -2;
        f4 = 0.0F / 0.0F;
      }
      i1 = ViewGroup.getChildMeasureSpec(i1, i13, i17);
      break label500;
    }
    label487:
    int i13 = 1073741824;
    i1 = View.MeasureSpec.makeMeasureSpec(i1, i13);
    label500:
    i13 = localDimensionBehaviour1.ordinal();
    i13 = localObject2[i13];
    label742:
    int i14;
    if (i13 != n)
    {
      if (i13 != i25)
      {
        i3 = 3;
        int i5;
        if (i13 != i3)
        {
          i3 = 4;
          if (i13 != i3)
          {
            i3 = 0;
            break label818;
          }
          i3 = localMeasurer.OooO0oO;
          i13 = -2;
          i3 = ViewGroup.getChildMeasureSpec(i3, i4, i13);
          i4 = localConstraintWidget.OooOo;
          if (i4 == n)
          {
            i4 = n;
          }
          else
          {
            i4 = 0;
            localObject4 = null;
          }
          i13 = localMeasure.OooOO0;
          int i27 = BasicMeasure.Measure.OooOO0o;
          if (i13 != i27)
          {
            int i28 = BasicMeasure.Measure.OooOOO0;
            if (i13 != i28) {
              break label818;
            }
          }
          i13 = ((View)localView).getMeasuredWidth();
          int i29 = paramConstraintWidget.getWidth();
          if (i13 == i29)
          {
            i13 = n;
          }
          else
          {
            i13 = 0;
            localObject3 = null;
          }
          i30 = localMeasure.OooOO0;
          i17 = BasicMeasure.Measure.OooOOO0;
          if ((i30 != i17) && (i4 != 0) && ((i4 == 0) || (i13 == 0)))
          {
            i5 = localView instanceof Placeholder;
            if (i5 == 0)
            {
              i5 = paramConstraintWidget.isResolvedVertically();
              if (i5 == 0)
              {
                i5 = 0;
                localObject4 = null;
                break label742;
              }
            }
          }
          i5 = n;
          if (i5 == 0) {
            break label818;
          }
          i3 = paramConstraintWidget.getHeight();
          break label805;
        }
        i3 = localMeasurer.OooO0oO;
        i13 = paramConstraintWidget.getVerticalMargin();
        i5 += i13;
        i14 = -1;
      }
      else
      {
        i3 = localMeasurer.OooO0oO;
        i14 = -2;
      }
      i3 = ViewGroup.getChildMeasureSpec(i3, i6, i14);
      break label818;
    }
    label805:
    int i6 = 1073741824;
    i3 = View.MeasureSpec.makeMeasureSpec(i3, i6);
    label818:
    Object localObject4 = (ConstraintWidgetContainer)paramConstraintWidget.getParent();
    boolean bool6;
    label1063:
    int i31;
    if (localObject4 != null)
    {
      localObject3 = localMeasurer.OooO0oo;
      i14 = ConstraintLayout.access$000((ConstraintLayout)localObject3);
      i30 = 256;
      boolean bool8 = Optimizer.OooO0O0(i14, i30);
      if (bool8)
      {
        i15 = ((View)localView).getMeasuredWidth();
        i30 = paramConstraintWidget.getWidth();
        if (i15 == i30)
        {
          i15 = ((View)localView).getMeasuredWidth();
          i30 = ((ConstraintWidget)localObject4).getWidth();
          if (i15 < i30)
          {
            i15 = ((View)localView).getMeasuredHeight();
            i30 = paramConstraintWidget.getHeight();
            if (i15 == i30)
            {
              i15 = ((View)localView).getMeasuredHeight();
              i6 = ((ConstraintWidget)localObject4).getHeight();
              if (i15 < i6)
              {
                i6 = ((View)localView).getBaseline();
                i15 = paramConstraintWidget.getBaselineDistance();
                if (i6 == i15)
                {
                  boolean bool4 = paramConstraintWidget.isMeasureRequested();
                  if (!bool4)
                  {
                    int i7 = paramConstraintWidget.getLastHorizontalMeasureSpec();
                    i15 = paramConstraintWidget.getWidth();
                    boolean bool5 = localMeasurer.OooO0Oo(i7, i1, i15);
                    if (bool5)
                    {
                      int i8 = paramConstraintWidget.getLastVerticalMeasureSpec();
                      i15 = paramConstraintWidget.getHeight();
                      bool6 = localMeasurer.OooO0Oo(i8, i3, i15);
                      if (bool6)
                      {
                        bool6 = n;
                        break label1063;
                      }
                    }
                    bool6 = false;
                    localObject4 = null;
                    if (bool6)
                    {
                      j = paramConstraintWidget.getWidth();
                      localMeasure.OooO0o0 = j;
                      j = paramConstraintWidget.getHeight();
                      localMeasure.OooO0o = j;
                      i31 = paramConstraintWidget.getBaselineDistance();
                      localMeasure.OooO0oO = i31;
                      return;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    localObject4 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
    if (localObject1 == localObject4)
    {
      i15 = n;
    }
    else
    {
      i15 = 0;
      localObject3 = null;
    }
    if (localDimensionBehaviour1 == localObject4)
    {
      bool6 = n;
    }
    else
    {
      bool6 = false;
      localObject4 = null;
    }
    localObject2 = ConstraintWidget.DimensionBehaviour.o00Ooo0O;
    if (localDimensionBehaviour1 != localObject2)
    {
      localDimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
      if (localDimensionBehaviour1 != localDimensionBehaviour2)
      {
        m = 0;
        f1 = 0.0F;
        localDimensionBehaviour1 = null;
        break label1200;
      }
    }
    m = n;
    f1 = f2;
    label1200:
    if (localObject1 != localObject2)
    {
      localObject2 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
      if (localObject1 != localObject2)
      {
        j = 0;
        f5 = 0.0F;
        localObject1 = null;
        break label1242;
      }
    }
    int j = n;
    float f5 = f2;
    label1242:
    int i30 = 0;
    localObject2 = null;
    if (i15 != 0)
    {
      f4 = localConstraintWidget.OooooOo;
      bool9 = f4 < 0.0F;
      if (bool9)
      {
        bool9 = n;
        f4 = f2;
        break label1291;
      }
    }
    boolean bool9 = false;
    float f4 = 0.0F;
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour2 = null;
    label1291:
    if (bool6)
    {
      f3 = localConstraintWidget.OooooOo;
      bool10 = f3 < 0.0F;
      if (bool10)
      {
        bool10 = n;
        break label1327;
      }
    }
    boolean bool10 = false;
    localObject2 = null;
    label1327:
    if (localView == null) {
      return;
    }
    ConstraintLayout.LayoutParams localLayoutParams = (ConstraintLayout.LayoutParams)((View)localView).getLayoutParams();
    int i24 = localMeasure.OooOO0;
    int i26 = BasicMeasure.Measure.OooOO0o;
    if (i24 != i26)
    {
      i26 = BasicMeasure.Measure.OooOOO0;
      if ((i24 != i26) && (i15 != 0))
      {
        i15 = localConstraintWidget.OooOo0o;
        if ((i15 == 0) && (bool6))
        {
          int i9 = localConstraintWidget.OooOo;
          if (i9 == 0)
          {
            i32 = -1;
            f6 = 0.0F / 0.0F;
            n = 0;
            f2 = 0.0F;
            i24 = 0;
            i26 = 0;
            break label1918;
          }
        }
      }
    }
    boolean bool7 = localView instanceof VirtualLayout;
    if (bool7)
    {
      bool7 = localConstraintWidget instanceof androidx.constraintlayout.core.widgets.VirtualLayout;
      if (bool7)
      {
        localObject4 = localConstraintWidget;
        localObject4 = (androidx.constraintlayout.core.widgets.VirtualLayout)localConstraintWidget;
        localObject3 = localView;
        localObject3 = (VirtualLayout)localView;
        ((VirtualLayout)localObject3).OooOo((androidx.constraintlayout.core.widgets.VirtualLayout)localObject4, i1, i3);
        break label1509;
      }
    }
    ((View)localView).measure(i1, i3);
    label1509:
    ((ConstraintWidget)localConstraintWidget).setLastMeasureSpec(i1, i3);
    int i10 = ((View)localView).getMeasuredWidth();
    int i15 = ((View)localView).getMeasuredHeight();
    i24 = ((View)localView).getBaseline();
    i26 = ((ConstraintWidget)localConstraintWidget).OooOoO;
    if (i26 > 0) {
      i26 = Math.max(i26, i10);
    } else {
      i26 = i10;
    }
    n = ((ConstraintWidget)localConstraintWidget).OooOoOO;
    if (n > 0) {
      i26 = Math.min(n, i26);
    }
    n = ((ConstraintWidget)localConstraintWidget).OooOoo;
    int i33;
    if (n > 0)
    {
      n = Math.max(n, i15);
      i33 = i1;
    }
    else
    {
      i33 = i1;
      n = i15;
    }
    i1 = ((ConstraintWidget)localConstraintWidget).OooOooO;
    if (i1 > 0) {
      n = Math.min(i1, n);
    }
    ConstraintLayout localConstraintLayout = localMeasurer.OooO0oo;
    i1 = ConstraintLayout.access$000(localConstraintLayout);
    int i32 = 1;
    float f6 = 1.4E-45F;
    boolean bool3 = Optimizer.OooO0O0(i1, i32);
    if (!bool3)
    {
      i32 = 1056964608;
      f6 = 0.5F;
      if ((bool9) && (m != 0))
      {
        f5 = ((ConstraintWidget)localConstraintWidget).OooooOo;
        f1 = n * f5 + f6;
        i26 = (int)f1;
      }
      else if ((bool10) && (j != 0))
      {
        f5 = ((ConstraintWidget)localConstraintWidget).OooooOo;
        f1 = i26 / f5 + f6;
        n = (int)f1;
      }
    }
    if ((i10 == i26) && (i15 == n)) {}
    for (;;)
    {
      i32 = -1;
      f6 = 0.0F / 0.0F;
      break;
      i32 = 1073741824;
      f6 = 2.0F;
      int i2;
      if (i10 != i26) {
        i2 = View.MeasureSpec.makeMeasureSpec(i26, i32);
      } else {
        i2 = i33;
      }
      if (i15 != n) {
        i3 = View.MeasureSpec.makeMeasureSpec(n, i32);
      }
      ((View)localView).measure(i2, i3);
      ((ConstraintWidget)localConstraintWidget).setLastMeasureSpec(i2, i3);
      i26 = ((View)localView).getMeasuredWidth();
      n = ((View)localView).getMeasuredHeight();
      i24 = ((View)localView).getBaseline();
    }
    label1918:
    if (i24 != i32)
    {
      i32 = 1;
      f6 = 1.4E-45F;
    }
    else
    {
      i32 = 0;
      f6 = 0.0F;
      localMeasurer = null;
    }
    j = localMeasure.OooO0OO;
    if (i26 == j)
    {
      j = localMeasure.OooO0Oo;
      if (n == j)
      {
        j = 0;
        f5 = 0.0F;
        localObject1 = null;
        break label1993;
      }
    }
    j = 1;
    f5 = 1.4E-45F;
    label1993:
    localMeasure.OooO = j;
    boolean bool2 = localLayoutParams.Oooooo0;
    if (bool2)
    {
      i32 = 1;
      f6 = 1.4E-45F;
    }
    if (i32 != 0)
    {
      int k = -1;
      f5 = 0.0F / 0.0F;
      if (i24 != k)
      {
        i31 = paramConstraintWidget.getBaselineDistance();
        if (i31 != i24)
        {
          i31 = 1;
          localMeasure.OooO = i31;
        }
      }
    }
    localMeasure.OooO0o0 = i26;
    localMeasure.OooO0o = n;
    localMeasure.OooO0oo = i32;
    localMeasure.OooO0oO = i24;
  }
  
  public void OooO0OO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    this.OooO0O0 = paramInt3;
    this.OooO0OO = paramInt4;
    this.OooO0Oo = paramInt5;
    this.OooO0o0 = paramInt6;
    this.OooO0o = paramInt1;
    this.OooO0oO = paramInt2;
  }
  
  public final boolean OooO0Oo(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = true;
    if (paramInt1 == paramInt2) {
      return bool;
    }
    int i = View.MeasureSpec.getMode(paramInt1);
    View.MeasureSpec.getSize(paramInt1);
    paramInt1 = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    int j = 1073741824;
    if (paramInt1 == j)
    {
      paramInt1 = -1 << -1;
      if (((i == paramInt1) || (i == 0)) && (paramInt3 == paramInt2)) {
        return bool;
      }
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintLayout.Measurer
 * JD-Core Version:    0.7.0.1
 */
package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.core.widgets.WidgetContainer;
import java.util.ArrayList;

public class BasicMeasure
{
  public final ArrayList OooO00o;
  public BasicMeasure.Measure OooO0O0;
  public ConstraintWidgetContainer OooO0OO;
  
  public BasicMeasure(ConstraintWidgetContainer paramConstraintWidgetContainer)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooO00o = ((ArrayList)localObject);
    localObject = new androidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;
    ((BasicMeasure.Measure)localObject).<init>();
    this.OooO0O0 = ((BasicMeasure.Measure)localObject);
    this.OooO0OO = paramConstraintWidgetContainer;
  }
  
  public final boolean OooO00o(BasicMeasure.Measurer paramMeasurer, ConstraintWidget paramConstraintWidget, int paramInt)
  {
    BasicMeasure.Measure localMeasure = this.OooO0O0;
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour1 = paramConstraintWidget.getHorizontalDimensionBehaviour();
    localMeasure.OooO00o = localDimensionBehaviour1;
    localMeasure = this.OooO0O0;
    localDimensionBehaviour1 = paramConstraintWidget.getVerticalDimensionBehaviour();
    localMeasure.OooO0O0 = localDimensionBehaviour1;
    localMeasure = this.OooO0O0;
    int i = paramConstraintWidget.getWidth();
    localMeasure.OooO0OO = i;
    localMeasure = this.OooO0O0;
    i = paramConstraintWidget.getHeight();
    localMeasure.OooO0Oo = i;
    localMeasure = this.OooO0O0;
    i = 0;
    localDimensionBehaviour1 = null;
    localMeasure.OooO = false;
    localMeasure.OooOO0 = paramInt;
    Object localObject = localMeasure.OooO00o;
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
    int j = 1;
    float f1 = 1.4E-45F;
    if (localObject == localDimensionBehaviour2)
    {
      paramInt = j;
      f2 = f1;
    }
    else
    {
      paramInt = 0;
      localObject = null;
      f2 = 0.0F;
    }
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour3 = localMeasure.OooO0O0;
    if (localDimensionBehaviour3 == localDimensionBehaviour2)
    {
      bool1 = j;
      f3 = f1;
    }
    else
    {
      bool1 = false;
      localDimensionBehaviour2 = null;
      f3 = 0.0F;
    }
    int k = 0;
    localDimensionBehaviour3 = null;
    if (paramInt != 0)
    {
      f2 = paramConstraintWidget.OooooOo;
      paramInt = f2 < 0.0F;
      if (paramInt > 0)
      {
        paramInt = j;
        f2 = f1;
        break label221;
      }
    }
    paramInt = 0;
    localObject = null;
    float f2 = 0.0F;
    label221:
    if (bool1)
    {
      f3 = paramConstraintWidget.OooooOo;
      bool1 = f3 < 0.0F;
      if (bool1)
      {
        bool1 = j;
        f3 = f1;
        break label263;
      }
    }
    boolean bool1 = false;
    localDimensionBehaviour2 = null;
    float f3 = 0.0F;
    label263:
    k = 4;
    if (paramInt != 0)
    {
      localObject = paramConstraintWidget.OooOoO0;
      paramInt = localObject[0];
      if (paramInt == k)
      {
        localObject = ConstraintWidget.DimensionBehaviour.o00OoOoo;
        localMeasure.OooO00o = ((ConstraintWidget.DimensionBehaviour)localObject);
      }
    }
    if (bool1)
    {
      localObject = paramConstraintWidget.OooOoO0;
      paramInt = localObject[j];
      if (paramInt == k)
      {
        localObject = ConstraintWidget.DimensionBehaviour.o00OoOoo;
        localMeasure.OooO0O0 = ((ConstraintWidget.DimensionBehaviour)localObject);
      }
    }
    paramMeasurer.OooO0O0(paramConstraintWidget, localMeasure);
    int m = this.OooO0O0.OooO0o0;
    paramConstraintWidget.setWidth(m);
    m = this.OooO0O0.OooO0o;
    paramConstraintWidget.setHeight(m);
    boolean bool2 = this.OooO0O0.OooO0oo;
    paramConstraintWidget.setHasBaseline(bool2);
    int n = this.OooO0O0.OooO0oO;
    paramConstraintWidget.setBaselineDistance(n);
    paramMeasurer = this.OooO0O0;
    int i1 = BasicMeasure.Measure.OooOO0O;
    paramMeasurer.OooOO0 = i1;
    return paramMeasurer.OooO;
  }
  
  public final void OooO0O0(ConstraintWidgetContainer paramConstraintWidgetContainer)
  {
    ArrayList localArrayList = paramConstraintWidgetContainer.o000OO;
    int i = localArrayList.size();
    boolean bool1 = paramConstraintWidgetContainer.o00Oo0(64);
    BasicMeasure.Measurer localMeasurer = paramConstraintWidgetContainer.getMeasurer();
    int j = 0;
    while (j < i)
    {
      Object localObject1 = (ConstraintWidget)paramConstraintWidgetContainer.o000OO.get(j);
      boolean bool2 = localObject1 instanceof Guideline;
      if (!bool2)
      {
        bool2 = localObject1 instanceof Barrier;
        if (!bool2)
        {
          bool2 = ((ConstraintWidget)localObject1).isInVirtualLayout();
          if (!bool2)
          {
            if (bool1)
            {
              localObject2 = ((ConstraintWidget)localObject1).OooO0o0;
              if (localObject2 != null)
              {
                VerticalWidgetRun localVerticalWidgetRun = ((ConstraintWidget)localObject1).OooO0o;
                if (localVerticalWidgetRun != null)
                {
                  localObject2 = ((WidgetRun)localObject2).OooO0o0;
                  bool2 = ((DependencyNode)localObject2).OooOO0;
                  if (bool2)
                  {
                    localObject2 = localVerticalWidgetRun.OooO0o0;
                    bool2 = ((DependencyNode)localObject2).OooOO0;
                    if (bool2) {
                      break label480;
                    }
                  }
                }
              }
            }
            Object localObject2 = ((ConstraintWidget)localObject1).getDimensionBehaviour(0);
            int m = 1;
            float f1 = 1.4E-45F;
            ConstraintWidget.DimensionBehaviour localDimensionBehaviour1 = ((ConstraintWidget)localObject1).getDimensionBehaviour(m);
            ConstraintWidget.DimensionBehaviour localDimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
            if (localObject2 == localDimensionBehaviour2)
            {
              n = ((ConstraintWidget)localObject1).OooOo0o;
              if ((n != m) && (localDimensionBehaviour1 == localDimensionBehaviour2))
              {
                n = ((ConstraintWidget)localObject1).OooOo;
                if (n != m)
                {
                  n = m;
                  f2 = f1;
                  break label250;
                }
              }
            }
            int n = 0;
            float f2 = 0.0F;
            label250:
            if (n == 0)
            {
              boolean bool3 = paramConstraintWidgetContainer.o00Oo0(m);
              if (bool3)
              {
                bool3 = localObject1 instanceof VirtualLayout;
                if (!bool3)
                {
                  if (localObject2 == localDimensionBehaviour2)
                  {
                    int i1 = ((ConstraintWidget)localObject1).OooOo0o;
                    if ((i1 == 0) && (localDimensionBehaviour1 != localDimensionBehaviour2))
                    {
                      boolean bool4 = ((ConstraintWidget)localObject1).isInHorizontalChain();
                      if (!bool4)
                      {
                        n = m;
                        f2 = f1;
                      }
                    }
                  }
                  if (localDimensionBehaviour1 == localDimensionBehaviour2)
                  {
                    int i2 = ((ConstraintWidget)localObject1).OooOo;
                    if ((i2 == 0) && (localObject2 != localDimensionBehaviour2))
                    {
                      boolean bool5 = ((ConstraintWidget)localObject1).isInHorizontalChain();
                      if (!bool5)
                      {
                        n = m;
                        f2 = f1;
                      }
                    }
                  }
                  if ((localObject2 == localDimensionBehaviour2) || (localDimensionBehaviour1 == localDimensionBehaviour2))
                  {
                    float f3 = ((ConstraintWidget)localObject1).OooooOo;
                    localDimensionBehaviour1 = null;
                    bool2 = f3 < 0.0F;
                    if (bool2) {
                      break label418;
                    }
                  }
                }
              }
            }
            m = n;
            f1 = f2;
            label418:
            if (m == 0)
            {
              int k = BasicMeasure.Measure.OooOO0O;
              OooO00o(localMeasurer, (ConstraintWidget)localObject1, k);
              localObject1 = paramConstraintWidgetContainer.o0000Oo0;
              if (localObject1 != null)
              {
                long l1 = ((Metrics)localObject1).OooO00o;
                long l2 = 1L;
                l1 += l2;
                ((Metrics)localObject1).OooO00o = l1;
              }
            }
          }
        }
      }
      label480:
      j += 1;
    }
    localMeasurer.OooO00o();
  }
  
  public final void OooO0OO(ConstraintWidgetContainer paramConstraintWidgetContainer, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramConstraintWidgetContainer.getMinWidth();
    int j = paramConstraintWidgetContainer.getMinHeight();
    paramConstraintWidgetContainer.setMinWidth(0);
    paramConstraintWidgetContainer.setMinHeight(0);
    paramConstraintWidgetContainer.setWidth(paramInt2);
    paramConstraintWidgetContainer.setHeight(paramInt3);
    paramConstraintWidgetContainer.setMinWidth(i);
    paramConstraintWidgetContainer.setMinHeight(j);
    this.OooO0OO.setPass(paramInt1);
    this.OooO0OO.OoooO0();
  }
  
  public long OooO0Oo(ConstraintWidgetContainer paramConstraintWidgetContainer, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
  {
    BasicMeasure localBasicMeasure = this;
    ConstraintWidgetContainer localConstraintWidgetContainer = paramConstraintWidgetContainer;
    int i = paramInt1;
    int m = paramInt4;
    int i4 = paramInt6;
    Object localObject1 = paramConstraintWidgetContainer.getMeasurer();
    Object localObject2 = paramConstraintWidgetContainer.o000OO;
    int i6 = ((ArrayList)localObject2).size();
    int i7 = paramConstraintWidgetContainer.getWidth();
    int i9 = paramConstraintWidgetContainer.getHeight();
    boolean bool2 = Optimizer.OooO0O0(paramInt1, 128);
    Object localObject3 = null;
    int i14;
    String str;
    if (!bool2)
    {
      i14 = 64;
      j = Optimizer.OooO0O0(paramInt1, i14);
      if (j == 0)
      {
        j = 0;
        str = null;
        break label97;
      }
    }
    int j = 1;
    label97:
    DimensionDependency localDimensionDependency;
    Object localObject4;
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour1;
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour2;
    int i18;
    Object localObject5;
    if (j != 0)
    {
      i14 = 0;
      localDimensionDependency = null;
      while (i14 < i6)
      {
        localObject4 = (ConstraintWidget)localConstraintWidgetContainer.o000OO.get(i14);
        localDimensionBehaviour1 = ((ConstraintWidget)localObject4).getHorizontalDimensionBehaviour();
        localDimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
        if (localDimensionBehaviour1 == localDimensionBehaviour2)
        {
          i18 = 1;
        }
        else
        {
          i18 = 0;
          localDimensionBehaviour1 = null;
        }
        localObject5 = ((ConstraintWidget)localObject4).getVerticalDimensionBehaviour();
        if (localObject5 == localDimensionBehaviour2)
        {
          bool7 = true;
          f = 1.4E-45F;
        }
        else
        {
          bool7 = false;
          localObject5 = null;
          f = 0.0F;
        }
        if ((i18 != 0) && (bool7))
        {
          f = ((ConstraintWidget)localObject4).getDimensionRatio();
          i18 = 0;
          localDimensionBehaviour1 = null;
          bool7 = f < 0.0F;
          if (bool7)
          {
            bool7 = true;
            f = 1.4E-45F;
            break label247;
          }
        }
        boolean bool7 = false;
        localObject5 = null;
        float f = 0.0F;
        label247:
        i18 = ((ConstraintWidget)localObject4).isInHorizontalChain();
        if ((i18 != 0) && (bool7)) {}
        do
        {
          do
          {
            do
            {
              do
              {
                j = 0;
                str = null;
                break;
                i18 = ((ConstraintWidget)localObject4).isInVerticalChain();
              } while ((i18 != 0) && (bool7));
              bool7 = localObject4 instanceof VirtualLayout;
            } while (bool7);
            bool7 = ((ConstraintWidget)localObject4).isInHorizontalChain();
          } while (bool7);
          bool7 = ((ConstraintWidget)localObject4).isInVerticalChain();
        } while (bool7);
        i14 += 1;
      }
    }
    long l1 = 1L;
    if (j != 0)
    {
      localObject4 = LinearSystem.OooOo;
      if (localObject4 != null)
      {
        long l2 = ((Metrics)localObject4).OooO0OO + l1;
        ((Metrics)localObject4).OooO0OO = l2;
      }
    }
    int i24 = 1073741824;
    if (((m == i24) && (i4 == i24)) || (bool2))
    {
      i18 = 1;
    }
    else
    {
      i18 = 0;
      localDimensionBehaviour1 = null;
    }
    j &= i18;
    int i19 = 2;
    int i15;
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour3;
    if (j != 0)
    {
      int i27 = paramConstraintWidgetContainer.getMaxWidth();
      int i22 = paramInt5;
      i22 = Math.min(i27, paramInt5);
      i14 = paramConstraintWidgetContainer.getMaxHeight();
      i27 = paramInt7;
      i14 = Math.min(i14, paramInt7);
      if (m == i24)
      {
        i27 = paramConstraintWidgetContainer.getWidth();
        if (i27 != i22)
        {
          localConstraintWidgetContainer.setWidth(i22);
          paramConstraintWidgetContainer.Ooooooo();
        }
      }
      if (i4 == i24)
      {
        i22 = paramConstraintWidgetContainer.getHeight();
        if (i22 != i14)
        {
          localConstraintWidgetContainer.setHeight(i14);
          paramConstraintWidgetContainer.Ooooooo();
        }
      }
      if ((m == i24) && (i4 == i24))
      {
        bool2 = localConstraintWidgetContainer.OooooOO(bool2);
        i14 = i19;
      }
      else
      {
        boolean bool8 = localConstraintWidgetContainer.OooooOo(bool2);
        boolean bool3;
        if (m == i24)
        {
          bool3 = localConstraintWidgetContainer.Oooooo0(bool2, 0);
          bool8 &= bool3;
          bool3 = true;
        }
        else
        {
          bool3 = false;
          localDimensionDependency = null;
        }
        if (i4 == i24)
        {
          i27 = 1;
          bool2 = localConstraintWidgetContainer.Oooooo0(bool2, i27) & bool8;
          bool3 += true;
        }
        else
        {
          bool2 = bool8;
        }
      }
      if (bool2)
      {
        if (m == i24)
        {
          i27 = 1;
        }
        else
        {
          i27 = 0;
          localDimensionBehaviour2 = null;
        }
        if (i4 == i24) {
          m = 1;
        } else {
          m = 0;
        }
        localConstraintWidgetContainer.Oooo(i27, m);
      }
    }
    else
    {
      bool2 = false;
      localDimensionBehaviour3 = null;
      i15 = 0;
      localDimensionDependency = null;
    }
    if ((!bool2) || (i15 != i19))
    {
      int n = paramConstraintWidgetContainer.getOptimizationLevel();
      if (i6 > 0) {
        OooO0O0(paramConstraintWidgetContainer);
      }
      OooO0o0(paramConstraintWidgetContainer);
      Object localObject6 = localBasicMeasure.OooO00o;
      i4 = ((ArrayList)localObject6).size();
      if (i6 > 0)
      {
        localObject2 = "First pass";
        bool2 = false;
        localDimensionBehaviour3 = null;
        paramInt4 = 0;
        paramInt5 = i7;
        paramInt6 = i9;
        OooO0OO(paramConstraintWidgetContainer, (String)localObject2, 0, i7, i9);
      }
      label1511:
      label1529:
      int k;
      label1906:
      int i3;
      if (i4 > 0)
      {
        localObject2 = paramConstraintWidgetContainer.getHorizontalDimensionBehaviour();
        localDimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
        int i28;
        if (localObject2 == localDimensionBehaviour3)
        {
          i28 = 1;
        }
        else
        {
          i28 = 0;
          localDimensionBehaviour2 = null;
        }
        localObject2 = paramConstraintWidgetContainer.getVerticalDimensionBehaviour();
        if (localObject2 == localDimensionBehaviour3)
        {
          i6 = 1;
        }
        else
        {
          i6 = 0;
          localObject2 = null;
        }
        int i12 = paramConstraintWidgetContainer.getWidth();
        localObject5 = localBasicMeasure.OooO0OO;
        int i23 = ((ConstraintWidget)localObject5).getMinWidth();
        i12 = Math.max(i12, i23);
        i23 = paramConstraintWidgetContainer.getHeight();
        i15 = localBasicMeasure.OooO0OO.getMinHeight();
        i23 = Math.max(i23, i15);
        i15 = 0;
        localDimensionDependency = null;
        int i25 = 0;
        localObject4 = null;
        long l4;
        int i11;
        int i21;
        while (i15 < i4)
        {
          localObject3 = (ConstraintWidget)localBasicMeasure.OooO00o.get(i15);
          boolean bool6 = localObject3 instanceof VirtualLayout;
          if (!bool6)
          {
            paramInt7 = n;
            i29 = i7;
            i30 = i9;
          }
          else
          {
            int i20 = ((ConstraintWidget)localObject3).getWidth();
            paramInt7 = n;
            n = ((ConstraintWidget)localObject3).getHeight();
            i30 = i9;
            i9 = BasicMeasure.Measure.OooOO0o;
            int i10 = localBasicMeasure.OooO00o((BasicMeasure.Measurer)localObject1, (ConstraintWidget)localObject3, i9) | i25;
            localObject4 = localConstraintWidgetContainer.o0000Oo0;
            i29 = i7;
            paramInt1 = i10;
            if (localObject4 != null)
            {
              long l3 = ((Metrics)localObject4).OooO0O0;
              l4 = 1L;
              l3 += l4;
              ((Metrics)localObject4).OooO0O0 = l3;
            }
            i7 = ((ConstraintWidget)localObject3).getWidth();
            i11 = ((ConstraintWidget)localObject3).getHeight();
            if (i7 != i20)
            {
              ((ConstraintWidget)localObject3).setWidth(i7);
              if (i28 != 0)
              {
                i7 = ((ConstraintWidget)localObject3).getRight();
                if (i7 > i12)
                {
                  i7 = ((ConstraintWidget)localObject3).getRight();
                  localObject4 = ConstraintAnchor.Type.o00Ooo0O;
                  localObject4 = ((ConstraintWidget)localObject3).OooOOo0((ConstraintAnchor.Type)localObject4);
                  i25 = ((ConstraintAnchor)localObject4).getMargin();
                  i7 += i25;
                  i7 = Math.max(i12, i7);
                  i12 = i7;
                }
              }
              i7 = 1;
            }
            else
            {
              i7 = paramInt1;
            }
            if (i11 != n)
            {
              ((ConstraintWidget)localObject3).setHeight(i11);
              if (i6 != 0)
              {
                n = ((ConstraintWidget)localObject3).getBottom();
                if (n > i23)
                {
                  n = ((ConstraintWidget)localObject3).getBottom();
                  Object localObject7 = ConstraintAnchor.Type.o00Ooo0o;
                  localObject7 = ((ConstraintWidget)localObject3).OooOOo0((ConstraintAnchor.Type)localObject7);
                  i7 = ((ConstraintAnchor)localObject7).getMargin();
                  n += i7;
                  n = Math.max(i23, n);
                  i23 = n;
                }
              }
              i7 = 1;
            }
            localObject3 = (VirtualLayout)localObject3;
            int i1 = ((VirtualLayout)localObject3).OoooOoO();
            i25 = i7 | i1;
          }
          i15 += 1;
          i2 = paramInt7;
          i11 = i30;
          i7 = i29;
          localObject3 = null;
          i21 = 2;
        }
        paramInt7 = i2;
        int i29 = i7;
        int i30 = i11;
        i7 = i21;
        int i2 = 0;
        while (i2 < i7)
        {
          i11 = 0;
          int i5;
          while (i11 < i4)
          {
            localObject3 = (ConstraintWidget)localBasicMeasure.OooO00o.get(i11);
            boolean bool4 = localObject3 instanceof Helper;
            if (bool4)
            {
              bool4 = localObject3 instanceof VirtualLayout;
              if (!bool4) {}
            }
            else
            {
              bool4 = localObject3 instanceof Guideline;
              if (!bool4)
              {
                int i16 = ((ConstraintWidget)localObject3).getVisibility();
                i21 = 8;
                if (i16 != i21)
                {
                  if (j != 0)
                  {
                    localDimensionDependency = ((ConstraintWidget)localObject3).OooO0o0.OooO0o0;
                    bool5 = localDimensionDependency.OooOO0;
                    if (bool5)
                    {
                      localDimensionDependency = ((ConstraintWidget)localObject3).OooO0o.OooO0o0;
                      bool5 = localDimensionDependency.OooOO0;
                      if (bool5) {
                        break label1511;
                      }
                    }
                  }
                  boolean bool5 = localObject3 instanceof VirtualLayout;
                  if (!bool5) {
                    break label1529;
                  }
                }
              }
            }
            i31 = j;
            i32 = i4;
            localObject8 = localObject1;
            l4 = 1L;
            break label1906;
            int i17 = ((ConstraintWidget)localObject3).getWidth();
            i21 = ((ConstraintWidget)localObject3).getHeight();
            i8 = ((ConstraintWidget)localObject3).getBaselineDistance();
            int i33 = BasicMeasure.Measure.OooOO0o;
            i31 = j;
            j = 1;
            if (i2 == j) {
              i33 = BasicMeasure.Measure.OooOOO0;
            }
            j = i33;
            j = localBasicMeasure.OooO00o((BasicMeasure.Measurer)localObject1, (ConstraintWidget)localObject3, i33) | i25;
            localObject4 = localConstraintWidgetContainer.o0000Oo0;
            i32 = i4;
            localObject8 = localObject1;
            if (localObject4 != null)
            {
              long l5 = ((Metrics)localObject4).OooO0O0;
              l4 = 1L;
              l5 += l4;
              ((Metrics)localObject4).OooO0O0 = l5;
            }
            else
            {
              l4 = 1L;
            }
            i4 = ((ConstraintWidget)localObject3).getWidth();
            int i34 = ((ConstraintWidget)localObject3).getHeight();
            if (i4 != i17)
            {
              ((ConstraintWidget)localObject3).setWidth(i4);
              if (i28 != 0)
              {
                k = ((ConstraintWidget)localObject3).getRight();
                if (k > i12)
                {
                  k = ((ConstraintWidget)localObject3).getRight();
                  localObject6 = ConstraintAnchor.Type.o00Ooo0O;
                  localObject6 = ((ConstraintWidget)localObject3).OooOOo0((ConstraintAnchor.Type)localObject6);
                  i4 = ((ConstraintAnchor)localObject6).getMargin();
                  k += i4;
                  int i13 = Math.max(i12, k);
                }
              }
              k = 1;
            }
            if (i34 != i21)
            {
              ((ConstraintWidget)localObject3).setHeight(i34);
              if (i6 != 0)
              {
                k = ((ConstraintWidget)localObject3).getBottom();
                if (k > i23)
                {
                  k = ((ConstraintWidget)localObject3).getBottom();
                  localObject6 = ConstraintAnchor.Type.o00Ooo0o;
                  localObject6 = ((ConstraintWidget)localObject3).OooOOo0((ConstraintAnchor.Type)localObject6);
                  i4 = ((ConstraintAnchor)localObject6).getMargin();
                  k += i4;
                  k = Math.max(i23, k);
                  i23 = k;
                }
              }
              k = 1;
            }
            boolean bool1 = ((ConstraintWidget)localObject3).OooOo0();
            if (bool1)
            {
              i5 = ((ConstraintWidget)localObject3).getBaselineDistance();
              if (i8 != i5)
              {
                i26 = 1;
                break label1906;
              }
            }
            i26 = k;
            i11 += 1;
            localObject1 = localObject8;
            k = i31;
            i5 = i32;
            i8 = 2;
          }
          int i31 = k;
          int i32 = i5;
          Object localObject8 = localObject1;
          l4 = 1L;
          if (i26 == 0) {
            break;
          }
          str = "intermediate pass";
          i2 += 1;
          paramInt4 = i3;
          paramInt5 = i29;
          paramInt6 = i30;
          OooO0OO(paramConstraintWidgetContainer, str, i3, i29, i30);
          int i8 = 2;
          int i26 = 0;
          localObject4 = null;
        }
        k = paramInt7;
      }
      else
      {
        k = i3;
      }
      localConstraintWidgetContainer.setOptimizationLevel(k);
    }
    return 0L;
  }
  
  public void OooO0o0(ConstraintWidgetContainer paramConstraintWidgetContainer)
  {
    this.OooO00o.clear();
    ArrayList localArrayList = paramConstraintWidgetContainer.o000OO;
    int i = localArrayList.size();
    int j = 0;
    while (j < i)
    {
      ConstraintWidget localConstraintWidget = (ConstraintWidget)paramConstraintWidgetContainer.o000OO.get(j);
      Object localObject = localConstraintWidget.getHorizontalDimensionBehaviour();
      ConstraintWidget.DimensionBehaviour localDimensionBehaviour = ConstraintWidget.DimensionBehaviour.o00Ooo0;
      if (localObject != localDimensionBehaviour)
      {
        localObject = localConstraintWidget.getVerticalDimensionBehaviour();
        if (localObject != localDimensionBehaviour) {}
      }
      else
      {
        localObject = this.OooO00o;
        ((ArrayList)localObject).add(localConstraintWidget);
      }
      j += 1;
    }
    paramConstraintWidgetContainer.Ooooooo();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.BasicMeasure
 * JD-Core Version:    0.7.0.1
 */
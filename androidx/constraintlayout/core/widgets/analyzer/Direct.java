package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.WidgetContainer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Direct
{
  public static BasicMeasure.Measure OooO00o;
  public static int OooO0O0 = 0;
  public static int OooO0OO = 0;
  
  static
  {
    BasicMeasure.Measure localMeasure = new androidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;
    localMeasure.<init>();
    OooO00o = localMeasure;
  }
  
  public static void OooO(int paramInt, ConstraintWidget paramConstraintWidget, BasicMeasure.Measurer paramMeasurer)
  {
    ConstraintWidget localConstraintWidget1 = paramConstraintWidget;
    BasicMeasure.Measurer localMeasurer = paramMeasurer;
    boolean bool1 = paramConstraintWidget.isVerticalSolvingPassDone();
    if (bool1) {
      return;
    }
    int i = OooO0OO;
    int k = 1;
    OooO0OO = i + k;
    boolean bool2 = paramConstraintWidget instanceof ConstraintWidgetContainer;
    boolean bool4;
    if (!bool2)
    {
      bool2 = paramConstraintWidget.isMeasureRequested();
      if (bool2)
      {
        int j = paramInt + 1;
        bool4 = OooO00o(j, paramConstraintWidget);
        if (bool4)
        {
          localObject1 = new androidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;
          ((BasicMeasure.Measure)localObject1).<init>();
          i2 = BasicMeasure.Measure.OooOO0O;
          ConstraintWidgetContainer.o00O0O(j, paramConstraintWidget, paramMeasurer, (BasicMeasure.Measure)localObject1, i2);
        }
      }
    }
    Object localObject2 = ConstraintAnchor.Type.o00Ooo0;
    localObject2 = ((ConstraintWidget)localConstraintWidget1).OooOOo0((ConstraintAnchor.Type)localObject2);
    Object localObject1 = ConstraintAnchor.Type.o00Ooo0o;
    localObject1 = ((ConstraintWidget)localConstraintWidget1).OooOOo0((ConstraintAnchor.Type)localObject1);
    int i2 = ((ConstraintAnchor)localObject2).getFinalValue();
    int i4 = ((ConstraintAnchor)localObject1).getFinalValue();
    Object localObject3 = ((ConstraintAnchor)localObject2).getDependents();
    boolean bool8 = false;
    ConstraintAnchor localConstraintAnchor = null;
    int i5 = 8;
    Object localObject4;
    int i9;
    label365:
    label378:
    Object localObject6;
    Object localObject7;
    if (localObject3 != null)
    {
      boolean bool10 = ((ConstraintAnchor)localObject2).OooO0o();
      if (bool10)
      {
        localObject2 = ((ConstraintAnchor)localObject2).getDependents().iterator();
        for (;;)
        {
          bool10 = ((Iterator)localObject2).hasNext();
          if (!bool10) {
            break;
          }
          localObject3 = (ConstraintAnchor)((Iterator)localObject2).next();
          localObject4 = ((ConstraintAnchor)localObject3).OooO0Oo;
          i9 = paramInt + 1;
          boolean bool13 = OooO00o(i9, (ConstraintWidget)localObject4);
          boolean bool14 = ((ConstraintWidget)localObject4).isMeasureRequested();
          if ((bool14) && (bool13))
          {
            localObject5 = new androidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;
            ((BasicMeasure.Measure)localObject5).<init>();
            int i10 = BasicMeasure.Measure.OooOO0O;
            ConstraintWidgetContainer.o00O0O(i9, (ConstraintWidget)localObject4, localMeasurer, (BasicMeasure.Measure)localObject5, i10);
          }
          Object localObject5 = ((ConstraintWidget)localObject4).OoooO0;
          if (localObject3 == localObject5)
          {
            localObject5 = ((ConstraintWidget)localObject4).OoooO.OooO0o;
            if (localObject5 != null)
            {
              bool14 = ((ConstraintAnchor)localObject5).OooO0o();
              if (bool14) {
                break label365;
              }
            }
          }
          localObject5 = ((ConstraintWidget)localObject4).OoooO;
          if (localObject3 == localObject5)
          {
            localObject5 = ((ConstraintWidget)localObject4).OoooO0.OooO0o;
            if (localObject5 != null)
            {
              bool14 = ((ConstraintAnchor)localObject5).OooO0o();
              if (bool14)
              {
                bool14 = k;
                break label378;
              }
            }
          }
          bool14 = false;
          localObject5 = null;
          ConstraintWidget.DimensionBehaviour localDimensionBehaviour = ((ConstraintWidget)localObject4).getVerticalDimensionBehaviour();
          localObject6 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
          if ((localDimensionBehaviour == localObject6) && (!bool13))
          {
            localObject3 = ((ConstraintWidget)localObject4).getVerticalDimensionBehaviour();
            if (localObject3 == localObject6)
            {
              int i6 = ((ConstraintWidget)localObject4).OooOooO;
              if (i6 >= 0)
              {
                i6 = ((ConstraintWidget)localObject4).OooOoo;
                if (i6 >= 0)
                {
                  i6 = ((ConstraintWidget)localObject4).getVisibility();
                  boolean bool11;
                  if (i6 != i5)
                  {
                    i6 = ((ConstraintWidget)localObject4).OooOo;
                    if (i6 == 0)
                    {
                      float f1 = ((ConstraintWidget)localObject4).getDimensionRatio();
                      bool11 = f1 < 0.0F;
                      if (bool11) {}
                    }
                  }
                  else
                  {
                    bool11 = ((ConstraintWidget)localObject4).isInVerticalChain();
                    if (!bool11)
                    {
                      bool11 = ((ConstraintWidget)localObject4).isInVirtualLayout();
                      if ((!bool11) && (bool14))
                      {
                        bool11 = ((ConstraintWidget)localObject4).isInVerticalChain();
                        if (!bool11) {
                          OooO0oO(i9, (ConstraintWidget)localConstraintWidget1, localMeasurer, (ConstraintWidget)localObject4);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          else
          {
            boolean bool15 = ((ConstraintWidget)localObject4).isMeasureRequested();
            if (!bool15)
            {
              localObject6 = ((ConstraintWidget)localObject4).OoooO0;
              int i7;
              int i11;
              if (localObject3 == localObject6)
              {
                localObject7 = ((ConstraintWidget)localObject4).OoooO.OooO0o;
                if (localObject7 == null)
                {
                  i7 = ((ConstraintAnchor)localObject6).getMargin() + i2;
                  i11 = ((ConstraintWidget)localObject4).getHeight() + i7;
                  ((ConstraintWidget)localObject4).setFinalVertical(i7, i11);
                }
              }
              for (;;)
              {
                OooO(i9, (ConstraintWidget)localObject4, localMeasurer);
                break;
                localObject7 = ((ConstraintWidget)localObject4).OoooO;
                if (localObject3 != localObject7) {
                  break label695;
                }
                localObject3 = ((ConstraintAnchor)localObject6).OooO0o;
                if (localObject3 != null) {
                  break label695;
                }
                i7 = ((ConstraintAnchor)localObject7).getMargin();
                i7 = i2 - i7;
                i11 = ((ConstraintWidget)localObject4).getHeight();
                i11 = i7 - i11;
                ((ConstraintWidget)localObject4).setFinalVertical(i11, i7);
              }
              label695:
              if (bool14)
              {
                boolean bool12 = ((ConstraintWidget)localObject4).isInVerticalChain();
                if (!bool12) {
                  OooO0o(i9, localMeasurer, (ConstraintWidget)localObject4);
                }
              }
            }
          }
        }
      }
    }
    boolean bool3 = localConstraintWidget1 instanceof Guideline;
    if (bool3) {
      return;
    }
    localObject2 = ((ConstraintAnchor)localObject1).getDependents();
    Object localObject8;
    int i8;
    label945:
    label958:
    int i12;
    label1275:
    boolean bool6;
    if (localObject2 != null)
    {
      bool3 = ((ConstraintAnchor)localObject1).OooO0o();
      if (bool3)
      {
        localObject2 = ((ConstraintAnchor)localObject1).getDependents().iterator();
        for (;;)
        {
          bool4 = ((Iterator)localObject2).hasNext();
          if (!bool4) {
            break;
          }
          localObject1 = (ConstraintAnchor)((Iterator)localObject2).next();
          localObject8 = ((ConstraintAnchor)localObject1).OooO0Oo;
          i8 = paramInt + 1;
          boolean bool16 = OooO00o(i8, (ConstraintWidget)localObject8);
          boolean bool17 = ((ConstraintWidget)localObject8).isMeasureRequested();
          if ((bool17) && (bool16))
          {
            localObject4 = new androidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;
            ((BasicMeasure.Measure)localObject4).<init>();
            i9 = BasicMeasure.Measure.OooOO0O;
            ConstraintWidgetContainer.o00O0O(i8, (ConstraintWidget)localObject8, localMeasurer, (BasicMeasure.Measure)localObject4, i9);
          }
          localObject4 = ((ConstraintWidget)localObject8).OoooO0;
          if (localObject1 == localObject4)
          {
            localObject4 = ((ConstraintWidget)localObject8).OoooO.OooO0o;
            if (localObject4 != null)
            {
              bool17 = ((ConstraintAnchor)localObject4).OooO0o();
              if (bool17) {
                break label945;
              }
            }
          }
          localObject4 = ((ConstraintWidget)localObject8).OoooO;
          if (localObject1 == localObject4)
          {
            localObject4 = ((ConstraintWidget)localObject8).OoooO0.OooO0o;
            if (localObject4 != null)
            {
              bool17 = ((ConstraintAnchor)localObject4).OooO0o();
              if (bool17)
              {
                bool17 = k;
                break label958;
              }
            }
          }
          bool17 = false;
          localObject4 = null;
          Object localObject9 = ((ConstraintWidget)localObject8).getVerticalDimensionBehaviour();
          localObject7 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
          if ((localObject9 == localObject7) && (!bool16))
          {
            localObject1 = ((ConstraintWidget)localObject8).getVerticalDimensionBehaviour();
            if (localObject1 == localObject7)
            {
              int m = ((ConstraintWidget)localObject8).OooOooO;
              if (m >= 0)
              {
                m = ((ConstraintWidget)localObject8).OooOoo;
                if (m >= 0)
                {
                  m = ((ConstraintWidget)localObject8).getVisibility();
                  boolean bool5;
                  if (m != i5)
                  {
                    m = ((ConstraintWidget)localObject8).OooOo;
                    if (m == 0)
                    {
                      float f2 = ((ConstraintWidget)localObject8).getDimensionRatio();
                      bool5 = f2 < 0.0F;
                      if (bool5) {}
                    }
                  }
                  else
                  {
                    bool5 = ((ConstraintWidget)localObject8).isInVerticalChain();
                    if (!bool5)
                    {
                      bool5 = ((ConstraintWidget)localObject8).isInVirtualLayout();
                      if ((!bool5) && (bool17))
                      {
                        bool5 = ((ConstraintWidget)localObject8).isInVerticalChain();
                        if (!bool5) {
                          OooO0oO(i8, (ConstraintWidget)localConstraintWidget1, localMeasurer, (ConstraintWidget)localObject8);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          else
          {
            bool16 = ((ConstraintWidget)localObject8).isMeasureRequested();
            if (!bool16)
            {
              localObject6 = ((ConstraintWidget)localObject8).OoooO0;
              int n;
              if (localObject1 == localObject6)
              {
                localObject9 = ((ConstraintWidget)localObject8).OoooO.OooO0o;
                if (localObject9 == null)
                {
                  n = ((ConstraintAnchor)localObject6).getMargin() + i4;
                  i12 = ((ConstraintWidget)localObject8).getHeight() + n;
                  ((ConstraintWidget)localObject8).setFinalVertical(n, i12);
                }
              }
              for (;;)
              {
                OooO(i8, (ConstraintWidget)localObject8, localMeasurer);
                break;
                localObject9 = ((ConstraintWidget)localObject8).OoooO;
                if (localObject1 != localObject9) {
                  break label1275;
                }
                localObject1 = ((ConstraintAnchor)localObject6).OooO0o;
                if (localObject1 != null) {
                  break label1275;
                }
                n = ((ConstraintAnchor)localObject9).getMargin();
                n = i4 - n;
                i12 = ((ConstraintWidget)localObject8).getHeight();
                i12 = n - i12;
                ((ConstraintWidget)localObject8).setFinalVertical(i12, n);
              }
              if (bool17)
              {
                bool6 = ((ConstraintWidget)localObject8).isInVerticalChain();
                if (!bool6) {
                  OooO0o(i8, localMeasurer, (ConstraintWidget)localObject8);
                }
              }
            }
          }
        }
      }
    }
    localObject2 = ConstraintAnchor.Type.o00OooO0;
    localObject2 = ((ConstraintWidget)localConstraintWidget1).OooOOo0((ConstraintAnchor.Type)localObject2);
    localObject1 = ((ConstraintAnchor)localObject2).getDependents();
    if (localObject1 != null)
    {
      bool6 = ((ConstraintAnchor)localObject2).OooO0o();
      if (bool6)
      {
        int i1 = ((ConstraintAnchor)localObject2).getFinalValue();
        localObject2 = ((ConstraintAnchor)localObject2).getDependents().iterator();
        for (;;)
        {
          boolean bool7 = ((Iterator)localObject2).hasNext();
          if (!bool7) {
            break;
          }
          localObject8 = (ConstraintAnchor)((Iterator)localObject2).next();
          ConstraintWidget localConstraintWidget2 = ((ConstraintAnchor)localObject8).OooO0Oo;
          i8 = paramInt + 1;
          bool8 = OooO00o(i8, localConstraintWidget2);
          boolean bool9 = localConstraintWidget2.isMeasureRequested();
          if ((bool9) && (bool8))
          {
            localObject10 = new androidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;
            ((BasicMeasure.Measure)localObject10).<init>();
            i12 = BasicMeasure.Measure.OooOO0O;
            ConstraintWidgetContainer.o00O0O(i8, localConstraintWidget2, localMeasurer, (BasicMeasure.Measure)localObject10, i12);
          }
          Object localObject10 = localConstraintWidget2.getVerticalDimensionBehaviour();
          localObject6 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
          if ((localObject10 != localObject6) || (bool8))
          {
            bool8 = localConstraintWidget2.isMeasureRequested();
            if (!bool8)
            {
              localConstraintAnchor = localConstraintWidget2.OoooOO0;
              if (localObject8 == localConstraintAnchor)
              {
                int i3 = ((ConstraintAnchor)localObject8).getMargin() + i1;
                localConstraintWidget2.setFinalBaseline(i3);
                OooO(i8, localConstraintWidget2, localMeasurer);
              }
            }
          }
        }
      }
    }
    paramConstraintWidget.OooOoo0();
  }
  
  public static boolean OooO00o(int paramInt, ConstraintWidget paramConstraintWidget)
  {
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour1 = paramConstraintWidget.getHorizontalDimensionBehaviour();
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour2 = paramConstraintWidget.getVerticalDimensionBehaviour();
    Object localObject = paramConstraintWidget.getParent();
    boolean bool1;
    if (localObject != null)
    {
      localObject = (ConstraintWidgetContainer)paramConstraintWidget.getParent();
    }
    else
    {
      bool1 = false;
      localObject = null;
    }
    if (localObject != null) {
      ((ConstraintWidget)localObject).getHorizontalDimensionBehaviour();
    }
    if (localObject != null) {
      localObject = ((ConstraintWidget)localObject).getVerticalDimensionBehaviour();
    }
    localObject = ConstraintWidget.DimensionBehaviour.o00OoOoo;
    boolean bool2 = false;
    int i = 1;
    if (localDimensionBehaviour1 != localObject)
    {
      boolean bool3 = paramConstraintWidget.isResolvedHorizontally();
      if (!bool3)
      {
        ConstraintWidget.DimensionBehaviour localDimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
        if (localDimensionBehaviour1 != localDimensionBehaviour3)
        {
          localDimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
          if (localDimensionBehaviour1 == localDimensionBehaviour3)
          {
            int k = paramConstraintWidget.OooOo0o;
            if (k == 0)
            {
              float f1 = paramConstraintWidget.OooooOo;
              boolean bool5 = f1 < 0.0F;
              if (!bool5)
              {
                bool5 = paramConstraintWidget.OooOo0O(0);
                if (bool5) {
                  break label203;
                }
              }
            }
          }
          if (localDimensionBehaviour1 == localDimensionBehaviour3)
          {
            paramInt = paramConstraintWidget.OooOo0o;
            if (paramInt == i)
            {
              paramInt = paramConstraintWidget.getWidth();
              paramInt = paramConstraintWidget.OooOoO0(0, paramInt);
              if (paramInt != 0) {
                break label203;
              }
            }
          }
          paramInt = 0;
          localDimensionBehaviour1 = null;
          break label206;
        }
      }
    }
    label203:
    paramInt = i;
    label206:
    if (localDimensionBehaviour2 != localObject)
    {
      bool1 = paramConstraintWidget.isResolvedVertically();
      if (!bool1)
      {
        localObject = ConstraintWidget.DimensionBehaviour.o00Ooo00;
        if (localDimensionBehaviour2 != localObject)
        {
          localObject = ConstraintWidget.DimensionBehaviour.o00Ooo0;
          if (localDimensionBehaviour2 == localObject)
          {
            int j = paramConstraintWidget.OooOo;
            if (j == 0)
            {
              float f2 = paramConstraintWidget.OooooOo;
              boolean bool4 = f2 < 0.0F;
              if (!bool4)
              {
                bool4 = paramConstraintWidget.OooOo0O(i);
                if (bool4) {
                  break label337;
                }
              }
            }
          }
          if (localDimensionBehaviour2 == localObject)
          {
            int m = paramConstraintWidget.OooOo;
            if (m == i)
            {
              m = paramConstraintWidget.getHeight();
              bool6 = paramConstraintWidget.OooOoO0(i, m);
              if (bool6) {
                break label337;
              }
            }
          }
          boolean bool6 = false;
          localDimensionBehaviour2 = null;
          break label341;
        }
      }
    }
    label337:
    int n = i;
    label341:
    float f3 = paramConstraintWidget.OooooOo;
    boolean bool7 = f3 < 0.0F;
    if ((bool7) && ((paramInt != 0) || (n != 0))) {
      return i;
    }
    if ((paramInt != 0) && (n != 0)) {
      bool2 = i;
    }
    return bool2;
  }
  
  public static void OooO0O0(int paramInt, ConstraintWidget paramConstraintWidget, BasicMeasure.Measurer paramMeasurer, boolean paramBoolean)
  {
    ConstraintWidget localConstraintWidget = paramConstraintWidget;
    BasicMeasure.Measurer localMeasurer = paramMeasurer;
    boolean bool1 = paramBoolean;
    boolean bool2 = paramConstraintWidget.isHorizontalSolvingPassDone();
    if (bool2) {
      return;
    }
    int i = OooO0O0;
    int k = 1;
    float f = 1.4E-45F;
    OooO0O0 = i + k;
    boolean bool3 = paramConstraintWidget instanceof ConstraintWidgetContainer;
    if (!bool3)
    {
      bool3 = paramConstraintWidget.isMeasureRequested();
      if (bool3)
      {
        int j = paramInt + 1;
        boolean bool9 = OooO00o(j, paramConstraintWidget);
        if (bool9)
        {
          localObject1 = new androidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;
          ((BasicMeasure.Measure)localObject1).<init>();
          i2 = BasicMeasure.Measure.OooOO0O;
          ConstraintWidgetContainer.o00O0O(j, paramConstraintWidget, paramMeasurer, (BasicMeasure.Measure)localObject1, i2);
        }
      }
    }
    Object localObject2 = ConstraintAnchor.Type.o00Ooo00;
    localObject2 = ((ConstraintWidget)localConstraintWidget).OooOOo0((ConstraintAnchor.Type)localObject2);
    Object localObject1 = ConstraintAnchor.Type.o00Ooo0O;
    localObject1 = ((ConstraintWidget)localConstraintWidget).OooOOo0((ConstraintAnchor.Type)localObject1);
    int i2 = ((ConstraintAnchor)localObject2).getFinalValue();
    int i3 = ((ConstraintAnchor)localObject1).getFinalValue();
    Object localObject3 = ((ConstraintAnchor)localObject2).getDependents();
    int i4 = 8;
    Object localObject4;
    int i6;
    ConstraintAnchor localConstraintAnchor;
    boolean bool13;
    label369:
    label382:
    Object localObject6;
    label573:
    Object localObject7;
    int i5;
    label711:
    boolean bool6;
    if (localObject3 != null)
    {
      boolean bool10 = ((ConstraintAnchor)localObject2).OooO0o();
      if (bool10)
      {
        localObject2 = ((ConstraintAnchor)localObject2).getDependents().iterator();
        bool10 = ((Iterator)localObject2).hasNext();
        if (bool10)
        {
          localObject3 = (ConstraintAnchor)((Iterator)localObject2).next();
          localObject4 = ((ConstraintAnchor)localObject3).OooO0Oo;
          i6 = paramInt + 1;
          boolean bool11 = OooO00o(i6, (ConstraintWidget)localObject4);
          boolean bool12 = ((ConstraintWidget)localObject4).isMeasureRequested();
          if ((bool12) && (bool11))
          {
            localObject5 = new androidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;
            ((BasicMeasure.Measure)localObject5).<init>();
            int i7 = BasicMeasure.Measure.OooOO0O;
            ConstraintWidgetContainer.o00O0O(i6, (ConstraintWidget)localObject4, localMeasurer, (BasicMeasure.Measure)localObject5, i7);
          }
          localConstraintAnchor = ((ConstraintWidget)localObject4).OoooO00;
          if (localObject3 == localConstraintAnchor)
          {
            localConstraintAnchor = ((ConstraintWidget)localObject4).OoooO0O.OooO0o;
            if (localConstraintAnchor != null)
            {
              bool13 = localConstraintAnchor.OooO0o();
              if (bool13) {
                break label369;
              }
            }
          }
          localConstraintAnchor = ((ConstraintWidget)localObject4).OoooO0O;
          if (localObject3 == localConstraintAnchor)
          {
            localConstraintAnchor = ((ConstraintWidget)localObject4).OoooO00.OooO0o;
            if (localConstraintAnchor != null)
            {
              bool13 = localConstraintAnchor.OooO0o();
              if (bool13)
              {
                bool13 = k;
                break label382;
              }
            }
          }
          bool13 = false;
          localConstraintAnchor = null;
          Object localObject5 = ((ConstraintWidget)localObject4).getHorizontalDimensionBehaviour();
          localObject6 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
          boolean bool5;
          if ((localObject5 == localObject6) && (!bool11))
          {
            localObject3 = ((ConstraintWidget)localObject4).getHorizontalDimensionBehaviour();
            if (localObject3 == localObject6)
            {
              k = ((ConstraintWidget)localObject4).OooOoOO;
              if (k >= 0)
              {
                k = ((ConstraintWidget)localObject4).OooOoO;
                if (k >= 0)
                {
                  k = ((ConstraintWidget)localObject4).getVisibility();
                  if (k != i4)
                  {
                    k = ((ConstraintWidget)localObject4).OooOo0o;
                    if (k == 0)
                    {
                      f = ((ConstraintWidget)localObject4).getDimensionRatio();
                      bool5 = f < 0.0F;
                      if (bool5) {}
                    }
                  }
                  else
                  {
                    bool5 = ((ConstraintWidget)localObject4).isInHorizontalChain();
                    if (!bool5)
                    {
                      bool5 = ((ConstraintWidget)localObject4).isInVirtualLayout();
                      if ((!bool5) && (bool13))
                      {
                        bool5 = ((ConstraintWidget)localObject4).isInHorizontalChain();
                        if (!bool5) {
                          OooO0o0(i6, (ConstraintWidget)localConstraintWidget, localMeasurer, (ConstraintWidget)localObject4, bool1);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          else
          {
            bool5 = ((ConstraintWidget)localObject4).isMeasureRequested();
            if (!bool5) {
              break label573;
            }
          }
          for (;;)
          {
            bool5 = true;
            f = 1.4E-45F;
            break;
            localObject6 = ((ConstraintWidget)localObject4).OoooO00;
            int m;
            if (localObject3 == localObject6)
            {
              localObject7 = ((ConstraintWidget)localObject4).OoooO0O.OooO0o;
              if (localObject7 == null)
              {
                m = ((ConstraintAnchor)localObject6).getMargin() + i2;
                i5 = ((ConstraintWidget)localObject4).getWidth() + m;
                ((ConstraintWidget)localObject4).setFinalHorizontal(m, i5);
              }
            }
            for (;;)
            {
              OooO0O0(i6, (ConstraintWidget)localObject4, localMeasurer, bool1);
              break;
              localObject7 = ((ConstraintWidget)localObject4).OoooO0O;
              if (localObject3 != localObject7) {
                break label711;
              }
              localObject6 = ((ConstraintAnchor)localObject6).OooO0o;
              if (localObject6 != null) {
                break label711;
              }
              m = ((ConstraintAnchor)localObject7).getMargin();
              m = i2 - m;
              i5 = ((ConstraintWidget)localObject4).getWidth();
              i5 = m - i5;
              ((ConstraintWidget)localObject4).setFinalHorizontal(i5, m);
            }
            if (bool13)
            {
              bool6 = ((ConstraintWidget)localObject4).isInHorizontalChain();
              if (!bool6) {
                OooO0Oo(i6, localMeasurer, (ConstraintWidget)localObject4, bool1);
              }
            }
          }
        }
      }
    }
    boolean bool4 = localConstraintWidget instanceof Guideline;
    if (bool4) {
      return;
    }
    localObject2 = ((ConstraintAnchor)localObject1).getDependents();
    if (localObject2 != null)
    {
      bool4 = ((ConstraintAnchor)localObject1).OooO0o();
      if (bool4)
      {
        localObject2 = ((ConstraintAnchor)localObject1).getDependents().iterator();
        for (;;)
        {
          bool6 = ((Iterator)localObject2).hasNext();
          if (!bool6) {
            break;
          }
          localObject6 = (ConstraintAnchor)((Iterator)localObject2).next();
          localObject1 = ((ConstraintAnchor)localObject6).OooO0Oo;
          i2 = 1;
          i5 = paramInt + 1;
          bool13 = OooO00o(i5, (ConstraintWidget)localObject1);
          boolean bool14 = ((ConstraintWidget)localObject1).isMeasureRequested();
          if ((bool14) && (bool13))
          {
            localObject4 = new androidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;
            ((BasicMeasure.Measure)localObject4).<init>();
            i6 = BasicMeasure.Measure.OooOO0O;
            ConstraintWidgetContainer.o00O0O(i5, (ConstraintWidget)localObject1, localMeasurer, (BasicMeasure.Measure)localObject4, i6);
          }
          localObject4 = ((ConstraintWidget)localObject1).OoooO00;
          if (localObject6 == localObject4)
          {
            localObject4 = ((ConstraintWidget)localObject1).OoooO0O.OooO0o;
            if (localObject4 != null)
            {
              bool14 = ((ConstraintAnchor)localObject4).OooO0o();
              if (bool14) {
                break label967;
              }
            }
          }
          localObject4 = ((ConstraintWidget)localObject1).OoooO0O;
          if (localObject6 == localObject4)
          {
            localObject4 = ((ConstraintWidget)localObject1).OoooO00.OooO0o;
            if (localObject4 != null)
            {
              bool14 = ((ConstraintAnchor)localObject4).OooO0o();
              if (bool14)
              {
                label967:
                bool14 = i2;
                break label980;
              }
            }
          }
          bool14 = false;
          localObject4 = null;
          label980:
          Object localObject8 = ((ConstraintWidget)localObject1).getHorizontalDimensionBehaviour();
          localObject7 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
          if ((localObject8 == localObject7) && (!bool13))
          {
            localObject6 = ((ConstraintWidget)localObject1).getHorizontalDimensionBehaviour();
            if (localObject6 == localObject7)
            {
              int n = ((ConstraintWidget)localObject1).OooOoOO;
              if (n >= 0)
              {
                n = ((ConstraintWidget)localObject1).OooOoO;
                if (n >= 0)
                {
                  n = ((ConstraintWidget)localObject1).getVisibility();
                  boolean bool7;
                  if (n != i4)
                  {
                    n = ((ConstraintWidget)localObject1).OooOo0o;
                    if (n == 0)
                    {
                      f = ((ConstraintWidget)localObject1).getDimensionRatio();
                      bool7 = f < 0.0F;
                      if (bool7) {}
                    }
                  }
                  else
                  {
                    bool7 = ((ConstraintWidget)localObject1).isInHorizontalChain();
                    if (!bool7)
                    {
                      bool7 = ((ConstraintWidget)localObject1).isInVirtualLayout();
                      if ((!bool7) && (bool14))
                      {
                        bool7 = ((ConstraintWidget)localObject1).isInHorizontalChain();
                        if (!bool7) {
                          OooO0o0(i5, (ConstraintWidget)localConstraintWidget, localMeasurer, (ConstraintWidget)localObject1, bool1);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          else
          {
            bool13 = ((ConstraintWidget)localObject1).isMeasureRequested();
            if (!bool13)
            {
              localConstraintAnchor = ((ConstraintWidget)localObject1).OoooO00;
              int i1;
              int i8;
              if (localObject6 == localConstraintAnchor)
              {
                localObject8 = ((ConstraintWidget)localObject1).OoooO0O.OooO0o;
                if (localObject8 == null)
                {
                  i1 = localConstraintAnchor.getMargin() + i3;
                  i8 = ((ConstraintWidget)localObject1).getWidth() + i1;
                  ((ConstraintWidget)localObject1).setFinalHorizontal(i1, i8);
                }
              }
              for (;;)
              {
                OooO0O0(i5, (ConstraintWidget)localObject1, localMeasurer, bool1);
                break;
                localObject8 = ((ConstraintWidget)localObject1).OoooO0O;
                if (localObject6 != localObject8) {
                  break label1302;
                }
                localObject6 = localConstraintAnchor.OooO0o;
                if (localObject6 != null) {
                  break label1302;
                }
                i1 = ((ConstraintAnchor)localObject8).getMargin();
                i1 = i3 - i1;
                i8 = ((ConstraintWidget)localObject1).getWidth();
                i8 = i1 - i8;
                ((ConstraintWidget)localObject1).setFinalHorizontal(i8, i1);
              }
              label1302:
              if (bool14)
              {
                boolean bool8 = ((ConstraintWidget)localObject1).isInHorizontalChain();
                if (!bool8) {
                  OooO0Oo(i5, localMeasurer, (ConstraintWidget)localObject1, bool1);
                }
              }
            }
          }
        }
      }
    }
    paramConstraintWidget.OooOoOO();
  }
  
  public static void OooO0OO(int paramInt1, Barrier paramBarrier, BasicMeasure.Measurer paramMeasurer, int paramInt2, boolean paramBoolean)
  {
    boolean bool = paramBarrier.OoooO();
    if (bool)
    {
      paramInt1 += 1;
      if (paramInt2 == 0) {
        OooO0O0(paramInt1, paramBarrier, paramMeasurer, paramBoolean);
      } else {
        OooO(paramInt1, paramBarrier, paramMeasurer);
      }
    }
  }
  
  public static void OooO0Oo(int paramInt, BasicMeasure.Measurer paramMeasurer, ConstraintWidget paramConstraintWidget, boolean paramBoolean)
  {
    float f1 = paramConstraintWidget.getHorizontalBiasPercent();
    ConstraintAnchor localConstraintAnchor1 = paramConstraintWidget.OoooO00.OooO0o;
    int i = localConstraintAnchor1.getFinalValue();
    ConstraintAnchor localConstraintAnchor2 = paramConstraintWidget.OoooO0O.OooO0o;
    int j = localConstraintAnchor2.getFinalValue();
    ConstraintAnchor localConstraintAnchor3 = paramConstraintWidget.OoooO00;
    int k = localConstraintAnchor3.getMargin() + i;
    ConstraintAnchor localConstraintAnchor4 = paramConstraintWidget.OoooO0O;
    int m = localConstraintAnchor4.getMargin();
    m = j - m;
    int n = 1056964608;
    float f2 = 0.5F;
    if (i == j)
    {
      i1 = n;
      f1 = f2;
    }
    else
    {
      i = k;
      j = m;
    }
    k = paramConstraintWidget.getWidth();
    m = j - i - k;
    if (i > j) {
      m = i - j - k;
    }
    float f3;
    if (m > 0)
    {
      f3 = m;
      f1 = f1 * f3 + f2;
    }
    else
    {
      f3 = m;
      f1 *= f3;
    }
    int i1 = (int)f1 + i;
    m = i1 + k;
    if (i > j) {
      m = i1 - k;
    }
    paramConstraintWidget.setFinalHorizontal(i1, m);
    OooO0O0(paramInt + 1, paramConstraintWidget, paramMeasurer, paramBoolean);
  }
  
  public static void OooO0o(int paramInt, BasicMeasure.Measurer paramMeasurer, ConstraintWidget paramConstraintWidget)
  {
    float f1 = paramConstraintWidget.getVerticalBiasPercent();
    ConstraintAnchor localConstraintAnchor1 = paramConstraintWidget.OoooO0.OooO0o;
    int i = localConstraintAnchor1.getFinalValue();
    ConstraintAnchor localConstraintAnchor2 = paramConstraintWidget.OoooO.OooO0o;
    int j = localConstraintAnchor2.getFinalValue();
    ConstraintAnchor localConstraintAnchor3 = paramConstraintWidget.OoooO0;
    int k = localConstraintAnchor3.getMargin() + i;
    ConstraintAnchor localConstraintAnchor4 = paramConstraintWidget.OoooO;
    int m = localConstraintAnchor4.getMargin();
    m = j - m;
    int n = 1056964608;
    float f2 = 0.5F;
    if (i == j)
    {
      i1 = n;
      f1 = f2;
    }
    else
    {
      i = k;
      j = m;
    }
    k = paramConstraintWidget.getHeight();
    m = j - i - k;
    if (i > j) {
      m = i - j - k;
    }
    float f3;
    if (m > 0)
    {
      f3 = m;
      f1 = f1 * f3 + f2;
    }
    else
    {
      f3 = m;
      f1 *= f3;
    }
    int i1 = (int)f1;
    m = i + i1;
    n = m + k;
    if (i > j)
    {
      m = i - i1;
      n = m - k;
    }
    paramConstraintWidget.setFinalVertical(m, n);
    OooO(paramInt + 1, paramConstraintWidget, paramMeasurer);
  }
  
  public static void OooO0o0(int paramInt, ConstraintWidget paramConstraintWidget1, BasicMeasure.Measurer paramMeasurer, ConstraintWidget paramConstraintWidget2, boolean paramBoolean)
  {
    float f1 = paramConstraintWidget2.getHorizontalBiasPercent();
    ConstraintAnchor localConstraintAnchor1 = paramConstraintWidget2.OoooO00.OooO0o;
    int i = localConstraintAnchor1.getFinalValue();
    int j = paramConstraintWidget2.OoooO00.getMargin();
    i += j;
    ConstraintAnchor localConstraintAnchor2 = paramConstraintWidget2.OoooO0O.OooO0o;
    j = localConstraintAnchor2.getFinalValue();
    ConstraintAnchor localConstraintAnchor3 = paramConstraintWidget2.OoooO0O;
    int k = localConstraintAnchor3.getMargin();
    j -= k;
    if (j >= i)
    {
      k = paramConstraintWidget2.getWidth();
      int n = paramConstraintWidget2.getVisibility();
      int i1 = 8;
      float f2 = 0.5F;
      int m;
      if (n != i1)
      {
        n = paramConstraintWidget2.OooOo0o;
        i1 = 2;
        if (n == i1)
        {
          boolean bool = paramConstraintWidget1 instanceof ConstraintWidgetContainer;
          if (!bool) {
            paramConstraintWidget1 = paramConstraintWidget1.getParent();
          }
          i2 = ((ConstraintWidget)paramConstraintWidget1).getWidth();
          float f3 = paramConstraintWidget2.getHorizontalBiasPercent() * f2;
          f4 = i2;
          f3 *= f4;
          m = (int)f3;
        }
        else if (n == 0)
        {
          m = j - i;
        }
        m = Math.max(paramConstraintWidget2.OooOoO, m);
        i2 = paramConstraintWidget2.OooOoOO;
        if (i2 > 0) {
          m = Math.min(i2, m);
        }
      }
      j = j - i - m;
      float f4 = j;
      f1 = f1 * f4 + f2;
      int i2 = (int)f1;
      i += i2;
      m += i;
      paramConstraintWidget2.setFinalHorizontal(i, m);
      paramInt += 1;
      OooO0O0(paramInt, paramConstraintWidget2, paramMeasurer, paramBoolean);
    }
  }
  
  public static void OooO0oO(int paramInt, ConstraintWidget paramConstraintWidget1, BasicMeasure.Measurer paramMeasurer, ConstraintWidget paramConstraintWidget2)
  {
    float f1 = paramConstraintWidget2.getVerticalBiasPercent();
    ConstraintAnchor localConstraintAnchor1 = paramConstraintWidget2.OoooO0.OooO0o;
    int i = localConstraintAnchor1.getFinalValue();
    int j = paramConstraintWidget2.OoooO0.getMargin();
    i += j;
    ConstraintAnchor localConstraintAnchor2 = paramConstraintWidget2.OoooO.OooO0o;
    j = localConstraintAnchor2.getFinalValue();
    ConstraintAnchor localConstraintAnchor3 = paramConstraintWidget2.OoooO;
    int k = localConstraintAnchor3.getMargin();
    j -= k;
    if (j >= i)
    {
      k = paramConstraintWidget2.getHeight();
      int n = paramConstraintWidget2.getVisibility();
      int i1 = 8;
      float f2 = 0.5F;
      int m;
      if (n != i1)
      {
        n = paramConstraintWidget2.OooOo;
        i1 = 2;
        if (n == i1)
        {
          boolean bool = paramConstraintWidget1 instanceof ConstraintWidgetContainer;
          if (!bool) {
            paramConstraintWidget1 = paramConstraintWidget1.getParent();
          }
          i2 = ((ConstraintWidget)paramConstraintWidget1).getHeight();
          float f3 = f1 * f2;
          f4 = i2;
          f3 *= f4;
          m = (int)f3;
        }
        else if (n == 0)
        {
          m = j - i;
        }
        m = Math.max(paramConstraintWidget2.OooOoo, m);
        i2 = paramConstraintWidget2.OooOooO;
        if (i2 > 0) {
          m = Math.min(i2, m);
        }
      }
      j = j - i - m;
      float f4 = j;
      f1 = f1 * f4 + f2;
      int i2 = (int)f1;
      i += i2;
      m += i;
      paramConstraintWidget2.setFinalVertical(i, m);
      paramInt += 1;
      OooO(paramInt, paramConstraintWidget2, paramMeasurer);
    }
  }
  
  public static void OooO0oo(ConstraintWidgetContainer paramConstraintWidgetContainer, BasicMeasure.Measurer paramMeasurer)
  {
    Object localObject1 = paramConstraintWidgetContainer.getHorizontalDimensionBehaviour();
    Object localObject2 = paramConstraintWidgetContainer.getVerticalDimensionBehaviour();
    OooO0O0 = 0;
    OooO0OO = 0;
    paramConstraintWidgetContainer.Oooo00O();
    ArrayList localArrayList = paramConstraintWidgetContainer.getChildren();
    int i = localArrayList.size();
    int j = 0;
    while (j < i)
    {
      localObject3 = (ConstraintWidget)localArrayList.get(j);
      ((ConstraintWidget)localObject3).Oooo00O();
      j += 1;
    }
    boolean bool1 = paramConstraintWidgetContainer.isRtl();
    Object localObject3 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
    if (localObject1 == localObject3)
    {
      k = paramConstraintWidgetContainer.getWidth();
      paramConstraintWidgetContainer.setFinalHorizontal(0, k);
    }
    else
    {
      paramConstraintWidgetContainer.setFinalLeft(0);
    }
    int k = 0;
    localObject1 = null;
    int m = 0;
    localObject3 = null;
    float f1 = 0.0F;
    boolean bool4 = false;
    Object localObject4 = null;
    float f2;
    int i6;
    int i7;
    float f4;
    for (;;)
    {
      int i4 = 1056964608;
      f2 = 0.5F;
      i6 = -1;
      float f3 = 0.0F / 0.0F;
      i7 = 1;
      f4 = 1.4E-45F;
      if (k >= i) {
        break;
      }
      Object localObject5 = (ConstraintWidget)localArrayList.get(k);
      boolean bool7 = localObject5 instanceof Guideline;
      if (bool7)
      {
        localObject5 = (Guideline)localObject5;
        int i8 = ((Guideline)localObject5).getOrientation();
        if (i8 == i7)
        {
          m = ((Guideline)localObject5).getRelativeBegin();
          if (m != i6) {
            m = ((Guideline)localObject5).getRelativeBegin();
          }
          for (;;)
          {
            ((Guideline)localObject5).setFinalValue(m);
            break;
            m = ((Guideline)localObject5).getRelativeEnd();
            if (m != i6)
            {
              boolean bool2 = paramConstraintWidgetContainer.isResolvedHorizontally();
              if (bool2)
              {
                int n = paramConstraintWidgetContainer.getWidth();
                i4 = ((Guideline)localObject5).getRelativeEnd();
                n -= i4;
                continue;
              }
            }
            boolean bool3 = paramConstraintWidgetContainer.isResolvedHorizontally();
            if (!bool3) {
              break;
            }
            f1 = ((Guideline)localObject5).getRelativePercent();
            i6 = paramConstraintWidgetContainer.getWidth();
            f3 = i6;
            f1 = f1 * f3 + f2;
            i1 = (int)f1;
          }
          i1 = i7;
          f1 = f4;
        }
      }
      else
      {
        boolean bool6 = localObject5 instanceof Barrier;
        if (bool6)
        {
          localObject5 = (Barrier)localObject5;
          int i5 = ((Barrier)localObject5).getOrientation();
          if (i5 == 0) {
            bool4 = i7;
          }
        }
      }
      k += 1;
    }
    if (i1 != 0)
    {
      k = 0;
      localObject1 = null;
      while (k < i)
      {
        localObject3 = (ConstraintWidget)localArrayList.get(k);
        boolean bool8 = localObject3 instanceof Guideline;
        if (bool8)
        {
          localObject3 = (Guideline)localObject3;
          int i9 = ((Guideline)localObject3).getOrientation();
          if (i9 == i7) {
            OooO0O0(0, (ConstraintWidget)localObject3, paramMeasurer, bool1);
          }
        }
        k += 1;
      }
    }
    OooO0O0(0, paramConstraintWidgetContainer, paramMeasurer, bool1);
    int i2;
    if (bool4)
    {
      k = 0;
      localObject1 = null;
      while (k < i)
      {
        localObject3 = (ConstraintWidget)localArrayList.get(k);
        bool4 = localObject3 instanceof Barrier;
        if (bool4)
        {
          localObject3 = (Barrier)localObject3;
          i2 = ((Barrier)localObject3).getOrientation();
          if (i2 == 0) {
            OooO0OO(0, (Barrier)localObject3, paramMeasurer, 0, bool1);
          }
        }
        k += 1;
      }
    }
    localObject1 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
    if (localObject2 == localObject1)
    {
      k = paramConstraintWidgetContainer.getHeight();
      paramConstraintWidgetContainer.setFinalVertical(0, k);
    }
    else
    {
      paramConstraintWidgetContainer.setFinalTop(0);
    }
    k = 0;
    localObject1 = null;
    int i11 = 0;
    localObject2 = null;
    float f5 = 0.0F;
    int i1 = 0;
    localObject3 = null;
    f1 = 0.0F;
    int i13;
    while (k < i)
    {
      localObject4 = (ConstraintWidget)localArrayList.get(k);
      boolean bool9 = localObject4 instanceof Guideline;
      if (bool9)
      {
        localObject4 = (Guideline)localObject4;
        int i10 = ((Guideline)localObject4).getOrientation();
        if (i10 == 0)
        {
          i11 = ((Guideline)localObject4).getRelativeBegin();
          if (i11 != i6) {
            i11 = ((Guideline)localObject4).getRelativeBegin();
          }
          for (;;)
          {
            ((Guideline)localObject4).setFinalValue(i11);
            break;
            i11 = ((Guideline)localObject4).getRelativeEnd();
            if (i11 != i6)
            {
              boolean bool11 = paramConstraintWidgetContainer.isResolvedVertically();
              if (bool11)
              {
                int i12 = paramConstraintWidgetContainer.getHeight();
                i10 = ((Guideline)localObject4).getRelativeEnd();
                i12 -= i10;
                continue;
              }
            }
            boolean bool12 = paramConstraintWidgetContainer.isResolvedVertically();
            if (!bool12) {
              break;
            }
            f5 = ((Guideline)localObject4).getRelativePercent();
            i10 = paramConstraintWidgetContainer.getHeight();
            float f6 = i10;
            f5 = f5 * f6 + f2;
            i13 = (int)f5;
          }
          i13 = i7;
          f5 = f4;
        }
      }
      else
      {
        boolean bool10 = localObject4 instanceof Barrier;
        if (bool10)
        {
          localObject4 = (Barrier)localObject4;
          i2 = ((Barrier)localObject4).getOrientation();
          if (i2 == i7)
          {
            i1 = i7;
            f1 = f4;
          }
        }
      }
      k += 1;
    }
    if (i13 != 0)
    {
      k = 0;
      localObject1 = null;
      while (k < i)
      {
        localObject2 = (ConstraintWidget)localArrayList.get(k);
        boolean bool5 = localObject2 instanceof Guideline;
        if (bool5)
        {
          localObject2 = (Guideline)localObject2;
          int i3 = ((Guideline)localObject2).getOrientation();
          if (i3 == 0) {
            OooO(i7, (ConstraintWidget)localObject2, paramMeasurer);
          }
        }
        k += 1;
      }
    }
    OooO(0, paramConstraintWidgetContainer, paramMeasurer);
    if (i1 != 0)
    {
      i16 = 0;
      paramConstraintWidgetContainer = null;
      while (i16 < i)
      {
        localObject1 = (ConstraintWidget)localArrayList.get(i16);
        boolean bool13 = localObject1 instanceof Barrier;
        if (bool13)
        {
          localObject1 = (Barrier)localObject1;
          int i14 = ((Barrier)localObject1).getOrientation();
          if (i14 == i7) {
            OooO0OO(0, (Barrier)localObject1, paramMeasurer, i7, bool1);
          }
        }
        i16 += 1;
      }
    }
    int i16 = 0;
    paramConstraintWidgetContainer = null;
    while (i16 < i)
    {
      localObject1 = (ConstraintWidget)localArrayList.get(i16);
      boolean bool14 = ((ConstraintWidget)localObject1).isMeasureRequested();
      if (bool14)
      {
        bool14 = OooO00o(0, (ConstraintWidget)localObject1);
        if (bool14)
        {
          localObject2 = OooO00o;
          i1 = BasicMeasure.Measure.OooOO0O;
          ConstraintWidgetContainer.o00O0O(0, (ConstraintWidget)localObject1, paramMeasurer, (BasicMeasure.Measure)localObject2, i1);
          bool14 = localObject1 instanceof Guideline;
          if (bool14)
          {
            localObject2 = localObject1;
            localObject2 = (Guideline)localObject1;
            int i15 = ((Guideline)localObject2).getOrientation();
            if (i15 != 0)
            {
              OooO0O0(0, (ConstraintWidget)localObject1, paramMeasurer, bool1);
              break label1122;
            }
          }
          else
          {
            OooO0O0(0, (ConstraintWidget)localObject1, paramMeasurer, bool1);
          }
          OooO(0, (ConstraintWidget)localObject1, paramMeasurer);
        }
      }
      label1122:
      i16 += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.Direct
 * JD-Core Version:    0.7.0.1
 */
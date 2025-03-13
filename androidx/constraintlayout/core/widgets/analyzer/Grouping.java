package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.WidgetContainer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Grouping
{
  public static WidgetGroup OooO00o(ConstraintWidget paramConstraintWidget, int paramInt, ArrayList paramArrayList, WidgetGroup paramWidgetGroup)
  {
    int i;
    if (paramInt == 0) {
      i = paramConstraintWidget.o0000oO;
    } else {
      i = paramConstraintWidget.o0000O0;
    }
    int m = 0;
    int n = -1;
    int i1;
    WidgetGroup localWidgetGroup1;
    int i2;
    if (i != n) {
      if (paramWidgetGroup != null)
      {
        i1 = paramWidgetGroup.OooO0O0;
        if (i == i1) {}
      }
      else
      {
        i1 = 0;
        localWidgetGroup1 = null;
        for (;;)
        {
          i2 = paramArrayList.size();
          if (i1 >= i2) {
            break;
          }
          WidgetGroup localWidgetGroup2 = (WidgetGroup)paramArrayList.get(i1);
          int i3 = localWidgetGroup2.getId();
          if (i3 == i)
          {
            if (paramWidgetGroup != null)
            {
              paramWidgetGroup.OooO0Oo(paramInt, localWidgetGroup2);
              paramArrayList.remove(paramWidgetGroup);
            }
            paramWidgetGroup = localWidgetGroup2;
            break;
          }
          i1 += 1;
        }
      }
    }
    if (i != n) {
      return paramWidgetGroup;
    }
    Object localObject;
    ConstraintAnchor localConstraintAnchor;
    if (paramWidgetGroup == null)
    {
      boolean bool1 = paramConstraintWidget instanceof HelperWidget;
      if (bool1)
      {
        localObject = paramConstraintWidget;
        localObject = (HelperWidget)paramConstraintWidget;
        int j = ((HelperWidget)localObject).OoooO0O(paramInt);
        if (j != n)
        {
          n = 0;
          localConstraintAnchor = null;
          for (;;)
          {
            i1 = paramArrayList.size();
            if (n >= i1) {
              break;
            }
            localWidgetGroup1 = (WidgetGroup)paramArrayList.get(n);
            i2 = localWidgetGroup1.getId();
            if (i2 == j)
            {
              paramWidgetGroup = localWidgetGroup1;
              break;
            }
            n += 1;
          }
        }
      }
      if (paramWidgetGroup == null)
      {
        paramWidgetGroup = new androidx/constraintlayout/core/widgets/analyzer/WidgetGroup;
        paramWidgetGroup.<init>(paramInt);
      }
      paramArrayList.add(paramWidgetGroup);
    }
    boolean bool2 = paramWidgetGroup.OooO00o((ConstraintWidget)paramConstraintWidget);
    if (bool2)
    {
      bool2 = paramConstraintWidget instanceof Guideline;
      if (bool2)
      {
        localObject = paramConstraintWidget;
        localObject = (Guideline)paramConstraintWidget;
        localConstraintAnchor = ((Guideline)localObject).getAnchor();
        k = ((Guideline)localObject).getOrientation();
        if (k == 0) {
          m = 1;
        }
        localConstraintAnchor.OooO0OO(m, paramArrayList, paramWidgetGroup);
      }
      int k = paramWidgetGroup.getId();
      if (paramInt == 0)
      {
        ((ConstraintWidget)paramConstraintWidget).o0000oO = k;
        ((ConstraintWidget)paramConstraintWidget).OoooO00.OooO0OO(paramInt, paramArrayList, paramWidgetGroup);
        localObject = ((ConstraintWidget)paramConstraintWidget).OoooO0O;
      }
      else
      {
        ((ConstraintWidget)paramConstraintWidget).o0000O0 = k;
        ((ConstraintWidget)paramConstraintWidget).OoooO0.OooO0OO(paramInt, paramArrayList, paramWidgetGroup);
        ((ConstraintWidget)paramConstraintWidget).OoooOO0.OooO0OO(paramInt, paramArrayList, paramWidgetGroup);
        localObject = ((ConstraintWidget)paramConstraintWidget).OoooO;
      }
      ((ConstraintAnchor)localObject).OooO0OO(paramInt, paramArrayList, paramWidgetGroup);
      paramConstraintWidget = ((ConstraintWidget)paramConstraintWidget).OoooOOo;
      paramConstraintWidget.OooO0OO(paramInt, paramArrayList, paramWidgetGroup);
    }
    return paramWidgetGroup;
  }
  
  public static WidgetGroup OooO0O0(ArrayList paramArrayList, int paramInt)
  {
    int i = paramArrayList.size();
    int j = 0;
    while (j < i)
    {
      WidgetGroup localWidgetGroup = (WidgetGroup)paramArrayList.get(j);
      int k = localWidgetGroup.OooO0O0;
      if (paramInt == k) {
        return localWidgetGroup;
      }
      j += 1;
    }
    return null;
  }
  
  public static boolean OooO0OO(ConstraintWidgetContainer paramConstraintWidgetContainer, BasicMeasure.Measurer paramMeasurer)
  {
    ConstraintWidgetContainer localConstraintWidgetContainer = paramConstraintWidgetContainer;
    Object localObject1 = paramConstraintWidgetContainer.getChildren();
    int i = ((ArrayList)localObject1).size();
    int j = 0;
    Object localObject2 = null;
    int k = 0;
    Object localObject3 = null;
    while (k < i)
    {
      localObject4 = (ConstraintWidget)((ArrayList)localObject1).get(k);
      localObject5 = paramConstraintWidgetContainer.getHorizontalDimensionBehaviour();
      localObject6 = paramConstraintWidgetContainer.getVerticalDimensionBehaviour();
      localObject7 = ((ConstraintWidget)localObject4).getHorizontalDimensionBehaviour();
      localObject8 = ((ConstraintWidget)localObject4).getVerticalDimensionBehaviour();
      i1 = OooO0Oo((ConstraintWidget.DimensionBehaviour)localObject5, (ConstraintWidget.DimensionBehaviour)localObject6, (ConstraintWidget.DimensionBehaviour)localObject7, (ConstraintWidget.DimensionBehaviour)localObject8);
      if (i1 == 0) {
        return false;
      }
      i3 = localObject4 instanceof Flow;
      if (i3 != 0) {
        return false;
      }
      k += 1;
    }
    localObject3 = localConstraintWidgetContainer.o0000Oo0;
    if (localObject3 != null)
    {
      long l1 = ((Metrics)localObject3).Oooo000;
      long l2 = 1L;
      l1 += l2;
      ((Metrics)localObject3).Oooo000 = l1;
    }
    int i3 = 0;
    Object localObject4 = null;
    int i1 = 0;
    Object localObject5 = null;
    int i6 = 0;
    Object localObject6 = null;
    int i8 = 0;
    Object localObject7 = null;
    Object localObject8 = null;
    Object localObject9 = null;
    Object localObject10 = null;
    while (i3 < i)
    {
      ConstraintWidget localConstraintWidget = (ConstraintWidget)((ArrayList)localObject1).get(i3);
      Object localObject11 = paramConstraintWidgetContainer.getHorizontalDimensionBehaviour();
      ConstraintWidget.DimensionBehaviour localDimensionBehaviour = paramConstraintWidgetContainer.getVerticalDimensionBehaviour();
      localObject3 = localConstraintWidget.getHorizontalDimensionBehaviour();
      localObject12 = localConstraintWidget.getVerticalDimensionBehaviour();
      m = OooO0Oo((ConstraintWidget.DimensionBehaviour)localObject11, localDimensionBehaviour, (ConstraintWidget.DimensionBehaviour)localObject3, (ConstraintWidget.DimensionBehaviour)localObject12);
      if (m == 0)
      {
        localObject3 = localConstraintWidgetContainer.o000O0o0;
        i10 = BasicMeasure.Measure.OooOO0O;
        localObject11 = paramMeasurer;
        ConstraintWidgetContainer.o00O0O(0, localConstraintWidget, paramMeasurer, (BasicMeasure.Measure)localObject3, i10);
      }
      else
      {
        localObject11 = paramMeasurer;
      }
      m = localConstraintWidget instanceof Guideline;
      if (m != 0)
      {
        localObject12 = localConstraintWidget;
        localObject12 = (Guideline)localConstraintWidget;
        int i11 = ((Guideline)localObject12).getOrientation();
        if (i11 == 0)
        {
          if (localObject7 == null)
          {
            localObject7 = new java/util/ArrayList;
            ((ArrayList)localObject7).<init>();
          }
          ((ArrayList)localObject7).add(localObject12);
        }
        i11 = ((Guideline)localObject12).getOrientation();
        j = 1;
        if (i11 == j)
        {
          if (localObject5 == null)
          {
            localObject2 = new java/util/ArrayList;
            ((ArrayList)localObject2).<init>();
            localObject5 = localObject2;
          }
          ((ArrayList)localObject5).add(localObject12);
        }
      }
      j = localConstraintWidget instanceof HelperWidget;
      if (j != 0)
      {
        j = localConstraintWidget instanceof Barrier;
        if (j != 0)
        {
          localObject2 = localConstraintWidget;
          localObject2 = (Barrier)localConstraintWidget;
          i10 = ((Barrier)localObject2).getOrientation();
          if (i10 == 0)
          {
            if (localObject6 == null)
            {
              localObject6 = new java/util/ArrayList;
              ((ArrayList)localObject6).<init>();
            }
            ((ArrayList)localObject6).add(localObject2);
          }
          i10 = ((Barrier)localObject2).getOrientation();
          int i12 = 1;
          if (i10 != i12) {
            break label538;
          }
          if (localObject8 == null)
          {
            localObject8 = new java/util/ArrayList;
            ((ArrayList)localObject8).<init>();
          }
        }
        else
        {
          localObject2 = localConstraintWidget;
          localObject2 = (HelperWidget)localConstraintWidget;
          if (localObject6 == null)
          {
            localObject6 = new java/util/ArrayList;
            ((ArrayList)localObject6).<init>();
          }
          ((ArrayList)localObject6).add(localObject2);
          if (localObject8 == null)
          {
            localObject8 = new java/util/ArrayList;
            ((ArrayList)localObject8).<init>();
          }
        }
        ((ArrayList)localObject8).add(localObject2);
      }
      label538:
      localObject2 = ((ConstraintWidget)localConstraintWidget).OoooO00.OooO0o;
      if (localObject2 == null)
      {
        localObject2 = ((ConstraintWidget)localConstraintWidget).OoooO0O.OooO0o;
        if ((localObject2 == null) && (m == 0))
        {
          j = localConstraintWidget instanceof Barrier;
          if (j == 0)
          {
            if (localObject9 == null)
            {
              localObject2 = new java/util/ArrayList;
              ((ArrayList)localObject2).<init>();
              localObject9 = localObject2;
            }
            localObject9.add(localConstraintWidget);
          }
        }
      }
      localObject2 = ((ConstraintWidget)localConstraintWidget).OoooO0.OooO0o;
      if (localObject2 == null)
      {
        localObject2 = ((ConstraintWidget)localConstraintWidget).OoooO.OooO0o;
        if (localObject2 == null)
        {
          localObject2 = ((ConstraintWidget)localConstraintWidget).OoooOO0.OooO0o;
          if ((localObject2 == null) && (m == 0))
          {
            j = localConstraintWidget instanceof Barrier;
            if (j == 0)
            {
              if (localObject10 == null)
              {
                localObject2 = new java/util/ArrayList;
                ((ArrayList)localObject2).<init>();
                localObject10 = localObject2;
              }
              localObject10.add(localConstraintWidget);
            }
          }
        }
      }
      int i4;
      i3 += 1;
      j = 0;
      localObject2 = null;
    }
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    boolean bool2;
    if (localObject5 != null)
    {
      localObject3 = ((ArrayList)localObject5).iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject3).hasNext();
        if (!bool2) {
          break;
        }
        localObject4 = (Guideline)((Iterator)localObject3).next();
        i1 = 0;
        localObject5 = null;
        i10 = 0;
        localObject12 = null;
        OooO00o((ConstraintWidget)localObject4, 0, (ArrayList)localObject2, null);
      }
    }
    i1 = 0;
    localObject5 = null;
    int i10 = 0;
    Object localObject12 = null;
    if (localObject6 != null)
    {
      localObject3 = ((ArrayList)localObject6).iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject3).hasNext();
        if (!bool2) {
          break;
        }
        localObject4 = (HelperWidget)((Iterator)localObject3).next();
        localObject6 = OooO00o((ConstraintWidget)localObject4, 0, (ArrayList)localObject2, null);
        ((HelperWidget)localObject4).OoooO0((ArrayList)localObject2, 0, (WidgetGroup)localObject6);
        ((WidgetGroup)localObject6).OooO0O0((ArrayList)localObject2);
        i1 = 0;
        localObject5 = null;
        i10 = 0;
        localObject12 = null;
      }
    }
    localObject3 = ConstraintAnchor.Type.o00Ooo00;
    localObject3 = localConstraintWidgetContainer.OooOOo0((ConstraintAnchor.Type)localObject3);
    localObject4 = ((ConstraintAnchor)localObject3).getDependents();
    if (localObject4 != null)
    {
      localObject3 = ((ConstraintAnchor)localObject3).getDependents().iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject3).hasNext();
        if (!bool2) {
          break;
        }
        localObject4 = ((ConstraintAnchor)((Iterator)localObject3).next()).OooO0Oo;
        i1 = 0;
        localObject5 = null;
        i6 = 0;
        localObject6 = null;
        OooO00o((ConstraintWidget)localObject4, 0, (ArrayList)localObject2, null);
      }
    }
    localObject3 = ConstraintAnchor.Type.o00Ooo0O;
    localObject3 = localConstraintWidgetContainer.OooOOo0((ConstraintAnchor.Type)localObject3);
    localObject4 = ((ConstraintAnchor)localObject3).getDependents();
    if (localObject4 != null)
    {
      localObject3 = ((ConstraintAnchor)localObject3).getDependents().iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject3).hasNext();
        if (!bool2) {
          break;
        }
        localObject4 = ((ConstraintAnchor)((Iterator)localObject3).next()).OooO0Oo;
        i1 = 0;
        localObject5 = null;
        i6 = 0;
        localObject6 = null;
        OooO00o((ConstraintWidget)localObject4, 0, (ArrayList)localObject2, null);
      }
    }
    localObject3 = ConstraintAnchor.Type.o00OooO;
    localObject3 = localConstraintWidgetContainer.OooOOo0((ConstraintAnchor.Type)localObject3);
    localObject4 = ((ConstraintAnchor)localObject3).getDependents();
    if (localObject4 != null)
    {
      localObject3 = ((ConstraintAnchor)localObject3).getDependents().iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject3).hasNext();
        if (!bool2) {
          break;
        }
        localObject4 = ((ConstraintAnchor)((Iterator)localObject3).next()).OooO0Oo;
        i1 = 0;
        localObject5 = null;
        i6 = 0;
        localObject6 = null;
        OooO00o((ConstraintWidget)localObject4, 0, (ArrayList)localObject2, null);
      }
    }
    i1 = 0;
    localObject5 = null;
    i6 = 0;
    localObject6 = null;
    if (localObject9 != null)
    {
      localObject3 = localObject9.iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject3).hasNext();
        if (!bool2) {
          break;
        }
        localObject4 = (ConstraintWidget)((Iterator)localObject3).next();
        OooO00o((ConstraintWidget)localObject4, 0, (ArrayList)localObject2, null);
      }
    }
    if (localObject7 != null)
    {
      localObject3 = ((ArrayList)localObject7).iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject3).hasNext();
        if (!bool2) {
          break;
        }
        localObject4 = (Guideline)((Iterator)localObject3).next();
        i6 = 1;
        OooO00o((ConstraintWidget)localObject4, i6, (ArrayList)localObject2, null);
      }
    }
    i6 = 1;
    if (localObject8 != null)
    {
      localObject3 = ((ArrayList)localObject8).iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject3).hasNext();
        if (!bool2) {
          break;
        }
        localObject4 = (HelperWidget)((Iterator)localObject3).next();
        localObject7 = OooO00o((ConstraintWidget)localObject4, i6, (ArrayList)localObject2, null);
        ((HelperWidget)localObject4).OoooO0((ArrayList)localObject2, i6, (WidgetGroup)localObject7);
        ((WidgetGroup)localObject7).OooO0O0((ArrayList)localObject2);
        i1 = 0;
        localObject5 = null;
        i6 = 1;
      }
    }
    localObject3 = ConstraintAnchor.Type.o00Ooo0;
    localObject3 = localConstraintWidgetContainer.OooOOo0((ConstraintAnchor.Type)localObject3);
    localObject4 = ((ConstraintAnchor)localObject3).getDependents();
    if (localObject4 != null)
    {
      localObject3 = ((ConstraintAnchor)localObject3).getDependents().iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject3).hasNext();
        if (!bool2) {
          break;
        }
        localObject4 = ((ConstraintAnchor)((Iterator)localObject3).next()).OooO0Oo;
        i1 = 1;
        i6 = 0;
        localObject6 = null;
        OooO00o((ConstraintWidget)localObject4, i1, (ArrayList)localObject2, null);
      }
    }
    localObject3 = ConstraintAnchor.Type.o00OooO0;
    localObject3 = localConstraintWidgetContainer.OooOOo0((ConstraintAnchor.Type)localObject3);
    localObject4 = ((ConstraintAnchor)localObject3).getDependents();
    if (localObject4 != null)
    {
      localObject3 = ((ConstraintAnchor)localObject3).getDependents().iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject3).hasNext();
        if (!bool2) {
          break;
        }
        localObject4 = ((ConstraintAnchor)((Iterator)localObject3).next()).OooO0Oo;
        i2 = 1;
        i6 = 0;
        localObject6 = null;
        OooO00o((ConstraintWidget)localObject4, i2, (ArrayList)localObject2, null);
      }
    }
    localObject3 = ConstraintAnchor.Type.o00Ooo0o;
    localObject3 = localConstraintWidgetContainer.OooOOo0((ConstraintAnchor.Type)localObject3);
    localObject4 = ((ConstraintAnchor)localObject3).getDependents();
    if (localObject4 != null)
    {
      localObject3 = ((ConstraintAnchor)localObject3).getDependents().iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject3).hasNext();
        if (!bool2) {
          break;
        }
        localObject4 = ((ConstraintAnchor)((Iterator)localObject3).next()).OooO0Oo;
        i2 = 1;
        i6 = 0;
        localObject6 = null;
        OooO00o((ConstraintWidget)localObject4, i2, (ArrayList)localObject2, null);
      }
    }
    localObject3 = ConstraintAnchor.Type.o00OooO;
    localObject3 = localConstraintWidgetContainer.OooOOo0((ConstraintAnchor.Type)localObject3);
    localObject4 = ((ConstraintAnchor)localObject3).getDependents();
    if (localObject4 != null)
    {
      localObject3 = ((ConstraintAnchor)localObject3).getDependents().iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject3).hasNext();
        if (!bool2) {
          break;
        }
        localObject4 = ((ConstraintAnchor)((Iterator)localObject3).next()).OooO0Oo;
        i2 = 0;
        localObject5 = null;
        i6 = 1;
        OooO00o((ConstraintWidget)localObject4, i6, (ArrayList)localObject2, null);
      }
    }
    int i2 = 0;
    localObject5 = null;
    i6 = 1;
    if (localObject10 != null)
    {
      localObject3 = localObject10.iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject3).hasNext();
        if (!bool2) {
          break;
        }
        localObject4 = (ConstraintWidget)((Iterator)localObject3).next();
        OooO00o((ConstraintWidget)localObject4, i6, (ArrayList)localObject2, null);
      }
    }
    int m = 0;
    localObject3 = null;
    int i7;
    int i5;
    while (m < i)
    {
      localObject4 = (ConstraintWidget)((ArrayList)localObject1).get(m);
      boolean bool3 = ((ConstraintWidget)localObject4).OooOoo();
      if (bool3)
      {
        i7 = ((ConstraintWidget)localObject4).o0000oO;
        localObject6 = OooO0O0((ArrayList)localObject2, i7);
        i5 = ((ConstraintWidget)localObject4).o0000O0;
        localObject4 = OooO0O0((ArrayList)localObject2, i5);
        if ((localObject6 != null) && (localObject4 != null))
        {
          localObject7 = null;
          ((WidgetGroup)localObject6).OooO0Oo(0, (WidgetGroup)localObject4);
          i8 = 2;
          ((WidgetGroup)localObject4).setOrientation(i8);
          ((ArrayList)localObject2).remove(localObject6);
        }
      }
      int n;
      m += 1;
    }
    int i13 = ((ArrayList)localObject2).size();
    i = 1;
    if (i13 <= i) {
      return false;
    }
    localObject1 = paramConstraintWidgetContainer.getHorizontalDimensionBehaviour();
    Object localObject13 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
    if (localObject1 == localObject13)
    {
      localObject1 = ((ArrayList)localObject2).iterator();
      i = 0;
      localObject13 = null;
      i10 = 0;
      localObject12 = null;
      for (;;)
      {
        bool1 = ((Iterator)localObject1).hasNext();
        if (!bool1) {
          break;
        }
        localObject3 = (WidgetGroup)((Iterator)localObject1).next();
        i5 = ((WidgetGroup)localObject3).getOrientation();
        i7 = 1;
        if (i5 != i7)
        {
          i5 = 0;
          localObject4 = null;
          ((WidgetGroup)localObject3).setAuthoritative(false);
          localObject6 = paramConstraintWidgetContainer.getSystem();
          i7 = ((WidgetGroup)localObject3).OooO0OO((LinearSystem)localObject6, 0);
          if (i7 > i10)
          {
            localObject13 = localObject3;
            i10 = i7;
          }
        }
      }
      if (localObject13 != null)
      {
        localObject1 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
        localConstraintWidgetContainer.setHorizontalDimensionBehaviour((ConstraintWidget.DimensionBehaviour)localObject1);
        localConstraintWidgetContainer.setWidth(i10);
        boolean bool4 = true;
        ((WidgetGroup)localObject13).setAuthoritative(bool4);
        break label2072;
      }
    }
    i = 0;
    localObject13 = null;
    label2072:
    localObject1 = paramConstraintWidgetContainer.getVerticalDimensionBehaviour();
    localObject3 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
    int i9;
    if (localObject1 == localObject3)
    {
      localObject1 = ((ArrayList)localObject2).iterator();
      j = 0;
      localObject2 = null;
      i10 = 0;
      localObject12 = null;
      for (;;)
      {
        bool1 = ((Iterator)localObject1).hasNext();
        if (!bool1) {
          break;
        }
        localObject3 = (WidgetGroup)((Iterator)localObject1).next();
        i5 = ((WidgetGroup)localObject3).getOrientation();
        if (i5 != 0)
        {
          i5 = 0;
          localObject4 = null;
          ((WidgetGroup)localObject3).setAuthoritative(false);
          localObject6 = paramConstraintWidgetContainer.getSystem();
          i8 = 1;
          i7 = ((WidgetGroup)localObject3).OooO0OO((LinearSystem)localObject6, i8);
          if (i7 > i10)
          {
            localObject2 = localObject3;
            i10 = i7;
          }
        }
      }
      i5 = 0;
      localObject4 = null;
      i8 = 1;
      if (localObject2 != null)
      {
        localObject1 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
        localConstraintWidgetContainer.setVerticalDimensionBehaviour((ConstraintWidget.DimensionBehaviour)localObject1);
        localConstraintWidgetContainer.setHeight(i10);
        ((WidgetGroup)localObject2).setAuthoritative(i8);
        localObject3 = localObject2;
        break label2253;
      }
    }
    else
    {
      i5 = 0;
      localObject4 = null;
      i9 = 1;
    }
    boolean bool1 = false;
    localObject3 = null;
    label2253:
    if ((localObject13 == null) && (localObject3 == null))
    {
      j = 0;
      localObject2 = null;
    }
    else
    {
      j = i9;
    }
    return j;
  }
  
  public static boolean OooO0Oo(ConstraintWidget.DimensionBehaviour paramDimensionBehaviour1, ConstraintWidget.DimensionBehaviour paramDimensionBehaviour2, ConstraintWidget.DimensionBehaviour paramDimensionBehaviour3, ConstraintWidget.DimensionBehaviour paramDimensionBehaviour4)
  {
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
    boolean bool = true;
    if (paramDimensionBehaviour3 != localDimensionBehaviour1)
    {
      ConstraintWidget.DimensionBehaviour localDimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
      if (paramDimensionBehaviour3 != localDimensionBehaviour2)
      {
        ConstraintWidget.DimensionBehaviour localDimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.o00Ooo0O;
        if ((paramDimensionBehaviour3 != localDimensionBehaviour3) || (paramDimensionBehaviour1 == localDimensionBehaviour2))
        {
          i = 0;
          paramDimensionBehaviour1 = null;
          break label57;
        }
      }
    }
    int i = bool;
    label57:
    if (paramDimensionBehaviour4 != localDimensionBehaviour1)
    {
      paramDimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
      if (paramDimensionBehaviour4 != paramDimensionBehaviour3)
      {
        localDimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.o00Ooo0O;
        if ((paramDimensionBehaviour4 != localDimensionBehaviour1) || (paramDimensionBehaviour2 == paramDimensionBehaviour3))
        {
          j = 0;
          paramDimensionBehaviour2 = null;
          break label103;
        }
      }
    }
    int j = bool;
    label103:
    if ((i == 0) && (j == 0)) {
      return false;
    }
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.Grouping
 * JD-Core Version:    0.7.0.1
 */
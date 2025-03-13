package androidx.constraintlayout.core.widgets;

class Flow$WidgetsList
{
  public int OooO = 0;
  public int OooO00o;
  public ConstraintWidget OooO0O0 = null;
  public int OooO0OO = 0;
  public ConstraintAnchor OooO0Oo;
  public ConstraintAnchor OooO0o;
  public ConstraintAnchor OooO0o0;
  public ConstraintAnchor OooO0oO;
  public int OooO0oo = 0;
  public int OooOO0 = 0;
  public int OooOO0O = 0;
  public int OooOO0o = 0;
  public int OooOOO = 0;
  public int OooOOO0 = 0;
  public int OooOOOO = 0;
  public int OooOOOo = 0;
  public int OooOOo0 = 0;
  
  public Flow$WidgetsList(Flow paramFlow, int paramInt1, ConstraintAnchor paramConstraintAnchor1, ConstraintAnchor paramConstraintAnchor2, ConstraintAnchor paramConstraintAnchor3, ConstraintAnchor paramConstraintAnchor4, int paramInt2)
  {
    this.OooO00o = paramInt1;
    this.OooO0Oo = paramConstraintAnchor1;
    this.OooO0o0 = paramConstraintAnchor2;
    this.OooO0o = paramConstraintAnchor3;
    this.OooO0oO = paramConstraintAnchor4;
    paramInt1 = paramFlow.getPaddingLeft();
    this.OooO0oo = paramInt1;
    paramInt1 = paramFlow.getPaddingTop();
    this.OooO = paramInt1;
    paramInt1 = paramFlow.getPaddingRight();
    this.OooOO0 = paramInt1;
    int i = paramFlow.getPaddingBottom();
    this.OooOO0O = i;
    this.OooOOo0 = paramInt2;
  }
  
  public void OooO0O0(ConstraintWidget paramConstraintWidget)
  {
    int i = this.OooO00o;
    int j = 8;
    int k = 0;
    Flow localFlow;
    int m;
    Object localObject1;
    Object localObject2;
    int n;
    ConstraintWidget localConstraintWidget;
    if (i == 0)
    {
      localFlow = this.OooOOo;
      m = this.OooOOo0;
      i = Flow.o00Oo0(localFlow, paramConstraintWidget, m);
      localObject1 = paramConstraintWidget.getHorizontalDimensionBehaviour();
      localObject2 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
      if (localObject1 == localObject2)
      {
        i = this.OooOOOo + 1;
        this.OooOOOo = i;
        i = 0;
        localFlow = null;
      }
      localObject1 = this.OooOOo;
      m = Flow.Ooooo00((Flow)localObject1);
      n = paramConstraintWidget.getVisibility();
      if (n != j) {
        k = m;
      }
      j = this.OooOO0o;
      i += k;
      j += i;
      this.OooOO0o = j;
      localFlow = this.OooOOo;
      j = this.OooOOo0;
      i = Flow.o00Ooo(localFlow, paramConstraintWidget, j);
      localConstraintWidget = this.OooO0O0;
      if (localConstraintWidget != null)
      {
        j = this.OooO0OO;
        if (j >= i) {}
      }
      else
      {
        this.OooO0O0 = paramConstraintWidget;
        this.OooO0OO = i;
        this.OooOOO0 = i;
      }
    }
    else
    {
      localFlow = this.OooOOo;
      m = this.OooOOo0;
      i = Flow.o00Oo0(localFlow, paramConstraintWidget, m);
      localObject1 = this.OooOOo;
      n = this.OooOOo0;
      m = Flow.o00Ooo((Flow)localObject1, paramConstraintWidget, n);
      localObject2 = paramConstraintWidget.getVerticalDimensionBehaviour();
      ConstraintWidget.DimensionBehaviour localDimensionBehaviour = ConstraintWidget.DimensionBehaviour.o00Ooo0;
      if (localObject2 == localDimensionBehaviour)
      {
        m = this.OooOOOo + 1;
        this.OooOOOo = m;
        m = 0;
        localObject1 = null;
      }
      localObject2 = this.OooOOo;
      n = Flow.Ooooo0o((Flow)localObject2);
      int i1 = paramConstraintWidget.getVisibility();
      if (i1 != j) {
        k = n;
      }
      j = this.OooOOO0;
      m += k;
      j += m;
      this.OooOOO0 = j;
      localConstraintWidget = this.OooO0O0;
      if (localConstraintWidget != null)
      {
        j = this.OooO0OO;
        if (j >= i) {}
      }
      else
      {
        this.OooO0O0 = paramConstraintWidget;
        this.OooO0OO = i;
        this.OooOO0o = i;
      }
    }
    int i2 = this.OooOOOO + 1;
    this.OooOOOO = i2;
  }
  
  public void OooO0OO()
  {
    this.OooO0OO = 0;
    this.OooO0O0 = null;
    this.OooOO0o = 0;
    this.OooOOO0 = 0;
    this.OooOOO = 0;
    this.OooOOOO = 0;
    this.OooOOOo = 0;
  }
  
  public void OooO0Oo(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    WidgetsList localWidgetsList = this;
    int i = this.OooOOOO;
    int j = 0;
    Object localObject1 = null;
    int m;
    int n;
    Object localObject2;
    while (j < i)
    {
      m = localWidgetsList.OooOOO + j;
      Flow localFlow = localWidgetsList.OooOOo;
      n = Flow.o00o0O(localFlow);
      if (m >= n) {
        break;
      }
      localObject2 = Flow.o00ooo(localWidgetsList.OooOOo);
      n = localWidgetsList.OooOOO + j;
      localObject2 = localObject2[n];
      if (localObject2 != null) {
        ((ConstraintWidget)localObject2).Oooo000();
      }
      j += 1;
    }
    if (i != 0)
    {
      localObject1 = localWidgetsList.OooO0O0;
      if (localObject1 != null)
      {
        if ((paramBoolean2) && (paramInt == 0))
        {
          m = 1;
        }
        else
        {
          m = 0;
          localObject2 = null;
        }
        n = -1;
        int i1 = 0;
        Object localObject3 = null;
        int i2 = n;
        int i3 = n;
        int i5;
        Object localObject4;
        int i9;
        Object localObject5;
        while (i1 < i)
        {
          if (paramBoolean1) {
            i4 = i + -1 - i1;
          } else {
            i4 = i1;
          }
          i5 = localWidgetsList.OooOOO + i4;
          localObject4 = localWidgetsList.OooOOo;
          i9 = Flow.o00o0O((Flow)localObject4);
          if (i5 >= i9) {
            break;
          }
          localObject5 = Flow.o00ooo(localWidgetsList.OooOOo);
          i9 = localWidgetsList.OooOOO + i4;
          localObject6 = localObject5[i9];
          if (localObject6 != null)
          {
            i4 = ((ConstraintWidget)localObject6).getVisibility();
            if (i4 == 0)
            {
              if (i2 == n) {
                i2 = i1;
              }
              i3 = i1;
            }
          }
          i1 += 1;
        }
        i1 = localWidgetsList.OooO00o;
        int i4 = 0;
        float f1 = 0.0F;
        Object localObject6 = null;
        Object localObject7;
        int i11;
        float f2;
        Object localObject9;
        label623:
        int i13;
        label999:
        int i10;
        label1422:
        label1441:
        int i8;
        if (i1 == 0)
        {
          localObject3 = localWidgetsList.OooO0O0;
          localObject5 = localWidgetsList.OooOOo;
          i5 = Flow.oo000o((Flow)localObject5);
          ((ConstraintWidget)localObject3).setVerticalChainStyle(i5);
          i5 = localWidgetsList.OooO;
          if (paramInt > 0)
          {
            localObject4 = localWidgetsList.OooOOo;
            i9 = Flow.Ooooo0o((Flow)localObject4);
            i5 += i9;
          }
          localObject4 = ((ConstraintWidget)localObject3).OoooO0;
          localObject7 = localWidgetsList.OooO0o0;
          ((ConstraintAnchor)localObject4).OooO00o((ConstraintAnchor)localObject7, i5);
          if (paramBoolean2)
          {
            localObject5 = ((ConstraintWidget)localObject3).OoooO;
            localObject4 = localWidgetsList.OooO0oO;
            i11 = localWidgetsList.OooOO0O;
            ((ConstraintAnchor)localObject5).OooO00o((ConstraintAnchor)localObject4, i11);
          }
          if (paramInt > 0)
          {
            localObject5 = localWidgetsList.OooO0o0.OooO0Oo.OoooO;
            localObject4 = ((ConstraintWidget)localObject3).OoooO0;
            ((ConstraintAnchor)localObject5).OooO00o((ConstraintAnchor)localObject4, 0);
          }
          localObject5 = localWidgetsList.OooOOo;
          i5 = Flow.o00oO0o((Flow)localObject5);
          i9 = 3;
          f2 = 4.203895E-045F;
          Object localObject8;
          int i14;
          if (i5 == i9)
          {
            int i6 = ((ConstraintWidget)localObject3).OooOo0();
            if (i6 == 0)
            {
              i6 = 0;
              localObject5 = null;
              while (i6 < i)
              {
                if (paramBoolean1) {
                  i11 = i + -1 - i6;
                } else {
                  i11 = i6;
                }
                int i12 = localWidgetsList.OooOOO + i11;
                localObject8 = localWidgetsList.OooOOo;
                i14 = Flow.o00o0O((Flow)localObject8);
                if (i12 >= i14) {
                  break;
                }
                localObject9 = Flow.o00ooo(localWidgetsList.OooOOo);
                i14 = localWidgetsList.OooOOO + i11;
                localObject7 = localObject9[i14];
                boolean bool2 = ((ConstraintWidget)localObject7).OooOo0();
                if (bool2) {
                  break label623;
                }
                i6 += 1;
              }
            }
          }
          localObject7 = localObject3;
          int i7 = 0;
          localObject5 = null;
          while (i7 < i)
          {
            if (paramBoolean1) {
              i13 = i + -1 - i7;
            } else {
              i13 = i7;
            }
            i14 = localWidgetsList.OooOOO + i13;
            Object localObject10 = localWidgetsList.OooOOo;
            int i15 = Flow.o00o0O((Flow)localObject10);
            if (i14 >= i15) {
              break;
            }
            localObject8 = Flow.o00ooo(localWidgetsList.OooOOo);
            i15 = localWidgetsList.OooOOO + i13;
            localObject8 = localObject8[i15];
            if (localObject8 == null)
            {
              localObject8 = localObject6;
              i4 = i9;
              f1 = f2;
            }
            else
            {
              if (i7 == 0)
              {
                localObject10 = ((ConstraintWidget)localObject8).OoooO00;
                localObject4 = localWidgetsList.OooO0Oo;
                j = localWidgetsList.OooO0oo;
                ((ConstraintWidget)localObject8).OooOO0o((ConstraintAnchor)localObject10, (ConstraintAnchor)localObject4, j);
              }
              if (i13 == 0)
              {
                localObject1 = localWidgetsList.OooOOo;
                j = Flow.o00oO0O((Flow)localObject1);
                i9 = 1065353216;
                f2 = 1.0F;
                localObject9 = localWidgetsList.OooOOo;
                float f3 = Flow.o0ooOO0((Flow)localObject9);
                if (paramBoolean1) {
                  f3 = f2 - f3;
                }
                i15 = localWidgetsList.OooOOO;
                if (i15 == 0)
                {
                  localObject10 = localWidgetsList.OooOOo;
                  i15 = Flow.OooooO0((Flow)localObject10);
                  if (i15 != n)
                  {
                    localObject1 = localWidgetsList.OooOOo;
                    j = Flow.OooooO0((Flow)localObject1);
                    if (paramBoolean1)
                    {
                      localObject9 = localWidgetsList.OooOOo;
                      f3 = Flow.OooooOO((Flow)localObject9);
                      f2 -= f3;
                    }
                    else
                    {
                      localObject4 = localWidgetsList.OooOOo;
                    }
                  }
                }
                for (f2 = Flow.OooooOO((Flow)localObject4);; f2 = Flow.Oooooo0((Flow)localObject4))
                {
                  f3 = f2;
                  break label999;
                  if (!paramBoolean2) {
                    break label999;
                  }
                  localObject10 = localWidgetsList.OooOOo;
                  i15 = Flow.OooooOo((Flow)localObject10);
                  if (i15 == n) {
                    break label999;
                  }
                  localObject1 = localWidgetsList.OooOOo;
                  j = Flow.OooooOo((Flow)localObject1);
                  if (paramBoolean1)
                  {
                    localObject9 = localWidgetsList.OooOOo;
                    f3 = Flow.Oooooo0((Flow)localObject9);
                    break;
                  }
                  localObject4 = localWidgetsList.OooOOo;
                }
                ((ConstraintWidget)localObject8).setHorizontalChainStyle(j);
                ((ConstraintWidget)localObject8).setHorizontalBiasPercent(f3);
              }
              j = i + -1;
              if (i7 == j)
              {
                localObject1 = ((ConstraintWidget)localObject8).OoooO0O;
                localObject4 = localWidgetsList.OooO0o;
                i13 = localWidgetsList.OooOO0;
                ((ConstraintWidget)localObject8).OooOO0o((ConstraintAnchor)localObject1, (ConstraintAnchor)localObject4, i13);
              }
              if (localObject6 != null)
              {
                localObject1 = ((ConstraintWidget)localObject8).OoooO00;
                localObject4 = ((ConstraintWidget)localObject6).OoooO0O;
                localObject9 = localWidgetsList.OooOOo;
                i13 = Flow.Ooooo00((Flow)localObject9);
                ((ConstraintAnchor)localObject1).OooO00o((ConstraintAnchor)localObject4, i13);
                if (i7 == i2)
                {
                  localObject1 = ((ConstraintWidget)localObject8).OoooO00;
                  i9 = localWidgetsList.OooO0oo;
                  ((ConstraintAnchor)localObject1).setGoneMargin(i9);
                }
                localObject1 = ((ConstraintWidget)localObject6).OoooO0O;
                localObject4 = ((ConstraintWidget)localObject8).OoooO00;
                ((ConstraintAnchor)localObject1).OooO00o((ConstraintAnchor)localObject4, 0);
                j = 1;
                i9 = i3 + 1;
                if (i7 == i9)
                {
                  localObject1 = ((ConstraintWidget)localObject6).OoooO0O;
                  i4 = localWidgetsList.OooOO0;
                  ((ConstraintAnchor)localObject1).setGoneMargin(i4);
                }
              }
              if (localObject8 != localObject3)
              {
                localObject1 = localWidgetsList.OooOOo;
                j = Flow.o00oO0o((Flow)localObject1);
                i4 = 3;
                f1 = 4.203895E-045F;
                if (j == i4)
                {
                  boolean bool1 = ((ConstraintWidget)localObject7).OooOo0();
                  if ((bool1) && (localObject8 != localObject7))
                  {
                    bool1 = ((ConstraintWidget)localObject8).OooOo0();
                    if (bool1)
                    {
                      localObject1 = ((ConstraintWidget)localObject8).OoooOO0;
                      localObject4 = ((ConstraintWidget)localObject7).OoooOO0;
                      break label1422;
                    }
                  }
                }
                localObject1 = localWidgetsList.OooOOo;
                int k = Flow.o00oO0o((Flow)localObject1);
                if (k != 0)
                {
                  i10 = 1;
                  f2 = 1.4E-45F;
                  if (k != i10)
                  {
                    localObject1 = ((ConstraintWidget)localObject8).OoooO0;
                    if (m != 0)
                    {
                      localObject4 = localWidgetsList.OooO0o0;
                      i13 = localWidgetsList.OooO;
                      ((ConstraintAnchor)localObject1).OooO00o((ConstraintAnchor)localObject4, i13);
                      localObject1 = ((ConstraintWidget)localObject8).OoooO;
                      localObject4 = localWidgetsList.OooO0oO;
                      i13 = localWidgetsList.OooOO0O;
                      ((ConstraintAnchor)localObject1).OooO00o((ConstraintAnchor)localObject4, i13);
                      break label1441;
                    }
                    localObject4 = ((ConstraintWidget)localObject3).OoooO0;
                    ((ConstraintAnchor)localObject1).OooO00o((ConstraintAnchor)localObject4, 0);
                  }
                  localObject1 = ((ConstraintWidget)localObject8).OoooO;
                  localObject4 = ((ConstraintWidget)localObject3).OoooO;
                }
                else
                {
                  localObject1 = ((ConstraintWidget)localObject8).OoooO0;
                  localObject4 = ((ConstraintWidget)localObject3).OoooO0;
                }
                ((ConstraintAnchor)localObject1).OooO00o((ConstraintAnchor)localObject4, 0);
              }
              else
              {
                i4 = 3;
                f1 = 4.203895E-045F;
              }
            }
            i7 += 1;
            i10 = i4;
            f2 = f1;
            localObject6 = localObject8;
          }
        }
        localObject1 = localWidgetsList.OooO0O0;
        localObject3 = localWidgetsList.OooOOo;
        i1 = Flow.o00oO0O((Flow)localObject3);
        ((ConstraintWidget)localObject1).setHorizontalChainStyle(i1);
        i1 = localWidgetsList.OooO0oo;
        if (paramInt > 0)
        {
          localObject5 = localWidgetsList.OooOOo;
          i8 = Flow.Ooooo00((Flow)localObject5);
          i1 += i8;
        }
        if (paramBoolean1)
        {
          localObject5 = ((ConstraintWidget)localObject1).OoooO0O;
          localObject4 = localWidgetsList.OooO0o;
          ((ConstraintAnchor)localObject5).OooO00o((ConstraintAnchor)localObject4, i1);
          if (paramBoolean2)
          {
            localObject3 = ((ConstraintWidget)localObject1).OoooO00;
            localObject5 = localWidgetsList.OooO0Oo;
            i10 = localWidgetsList.OooOO0;
            ((ConstraintAnchor)localObject3).OooO00o((ConstraintAnchor)localObject5, i10);
          }
          if (paramInt <= 0) {
            break label1704;
          }
          localObject3 = localWidgetsList.OooO0o.OooO0Oo.OoooO00;
          localObject5 = ((ConstraintWidget)localObject1).OoooO0O;
        }
        else
        {
          localObject5 = ((ConstraintWidget)localObject1).OoooO00;
          localObject4 = localWidgetsList.OooO0Oo;
          ((ConstraintAnchor)localObject5).OooO00o((ConstraintAnchor)localObject4, i1);
          if (paramBoolean2)
          {
            localObject3 = ((ConstraintWidget)localObject1).OoooO0O;
            localObject5 = localWidgetsList.OooO0o;
            i10 = localWidgetsList.OooOO0;
            ((ConstraintAnchor)localObject3).OooO00o((ConstraintAnchor)localObject5, i10);
          }
          if (paramInt <= 0) {
            break label1704;
          }
          localObject3 = localWidgetsList.OooO0Oo.OooO0Oo.OoooO0O;
          localObject5 = ((ConstraintWidget)localObject1).OoooO00;
        }
        ((ConstraintAnchor)localObject3).OooO00o((ConstraintAnchor)localObject5, 0);
        label1704:
        i1 = 0;
        localObject3 = null;
        while (i1 < i)
        {
          i8 = localWidgetsList.OooOOO + i1;
          localObject4 = localWidgetsList.OooOOo;
          i10 = Flow.o00o0O((Flow)localObject4);
          if (i8 >= i10) {
            break;
          }
          localObject5 = Flow.o00ooo(localWidgetsList.OooOOo);
          i10 = localWidgetsList.OooOOO + i1;
          localObject5 = localObject5[i10];
          float f4;
          if (localObject5 == null)
          {
            i11 = 1;
            f4 = 1.4E-45F;
          }
          else
          {
            if (i1 == 0)
            {
              localObject4 = ((ConstraintWidget)localObject5).OoooO0;
              localObject7 = localWidgetsList.OooO0o0;
              i13 = localWidgetsList.OooO;
              ((ConstraintWidget)localObject5).OooOO0o((ConstraintAnchor)localObject4, (ConstraintAnchor)localObject7, i13);
              localObject4 = localWidgetsList.OooOOo;
              i10 = Flow.oo000o((Flow)localObject4);
              localObject7 = localWidgetsList.OooOOo;
              f4 = Flow.Oooooo((Flow)localObject7);
              i13 = localWidgetsList.OooOOO;
              if (i13 == 0)
              {
                localObject9 = localWidgetsList.OooOOo;
                i13 = Flow.OoooooO((Flow)localObject9);
                if (i13 != n)
                {
                  localObject4 = localWidgetsList.OooOOo;
                  i10 = Flow.OoooooO((Flow)localObject4);
                  localObject7 = localWidgetsList.OooOOo;
                  f4 = Flow.Ooooooo((Flow)localObject7);
                  break label1975;
                }
              }
              if (paramBoolean2)
              {
                localObject9 = localWidgetsList.OooOOo;
                i13 = Flow.o0OoOo0((Flow)localObject9);
                if (i13 != n)
                {
                  localObject4 = localWidgetsList.OooOOo;
                  i10 = Flow.o0OoOo0((Flow)localObject4);
                  localObject7 = localWidgetsList.OooOOo;
                  f4 = Flow.ooOO((Flow)localObject7);
                }
              }
              label1975:
              ((ConstraintWidget)localObject5).setVerticalChainStyle(i10);
              ((ConstraintWidget)localObject5).setVerticalBiasPercent(f4);
            }
            i10 = i + -1;
            if (i1 == i10)
            {
              localObject4 = ((ConstraintWidget)localObject5).OoooO;
              localObject7 = localWidgetsList.OooO0oO;
              i13 = localWidgetsList.OooOO0O;
              ((ConstraintWidget)localObject5).OooOO0o((ConstraintAnchor)localObject4, (ConstraintAnchor)localObject7, i13);
            }
            if (localObject6 != null)
            {
              localObject4 = ((ConstraintWidget)localObject5).OoooO0;
              localObject7 = ((ConstraintWidget)localObject6).OoooO;
              localObject9 = localWidgetsList.OooOOo;
              i13 = Flow.Ooooo0o((Flow)localObject9);
              ((ConstraintAnchor)localObject4).OooO00o((ConstraintAnchor)localObject7, i13);
              if (i1 == i2)
              {
                localObject4 = ((ConstraintWidget)localObject5).OoooO0;
                i11 = localWidgetsList.OooO;
                ((ConstraintAnchor)localObject4).setGoneMargin(i11);
              }
              localObject4 = ((ConstraintWidget)localObject6).OoooO;
              localObject7 = ((ConstraintWidget)localObject5).OoooO0;
              ((ConstraintAnchor)localObject4).OooO00o((ConstraintAnchor)localObject7, 0);
              i10 = 1;
              f2 = 1.4E-45F;
              i11 = i3 + 1;
              if (i1 == i11)
              {
                localObject6 = ((ConstraintWidget)localObject6).OoooO;
                i10 = localWidgetsList.OooOO0O;
                ((ConstraintAnchor)localObject6).setGoneMargin(i10);
              }
            }
            if (localObject5 != localObject1)
            {
              i4 = 2;
              f1 = 2.802597E-045F;
              localObject4 = localWidgetsList.OooOOo;
              i10 = Flow.o00O0O((Flow)localObject4);
              if (paramBoolean1)
              {
                if (i10 != 0)
                {
                  i11 = 1;
                  f4 = 1.4E-45F;
                  if (i10 != i11)
                  {
                    if (i10 != i4) {
                      break label2457;
                    }
                    localObject6 = ((ConstraintWidget)localObject5).OoooO00;
                    localObject4 = ((ConstraintWidget)localObject1).OoooO00;
                    ((ConstraintAnchor)localObject6).OooO00o((ConstraintAnchor)localObject4, 0);
                  }
                  else
                  {
                    localObject6 = ((ConstraintWidget)localObject5).OoooO00;
                    localObject4 = ((ConstraintWidget)localObject1).OoooO00;
                    break label2287;
                  }
                }
                localObject6 = ((ConstraintWidget)localObject5).OoooO0O;
                localObject4 = ((ConstraintWidget)localObject1).OoooO0O;
                label2287:
                ((ConstraintAnchor)localObject6).OooO00o((ConstraintAnchor)localObject4, 0);
              }
              else
              {
                i11 = 1;
                f4 = 1.4E-45F;
                if (i10 != 0)
                {
                  if (i10 != i11)
                  {
                    if (i10 != i4) {
                      break label2464;
                    }
                    localObject6 = ((ConstraintWidget)localObject5).OoooO00;
                    if (m != 0)
                    {
                      localObject4 = localWidgetsList.OooO0Oo;
                      i13 = localWidgetsList.OooO0oo;
                      ((ConstraintAnchor)localObject6).OooO00o((ConstraintAnchor)localObject4, i13);
                      localObject6 = ((ConstraintWidget)localObject5).OoooO0O;
                      localObject4 = localWidgetsList.OooO0o;
                      i13 = localWidgetsList.OooOO0;
                      ((ConstraintAnchor)localObject6).OooO00o((ConstraintAnchor)localObject4, i13);
                      break label2464;
                    }
                    localObject4 = ((ConstraintWidget)localObject1).OoooO00;
                    ((ConstraintAnchor)localObject6).OooO00o((ConstraintAnchor)localObject4, 0);
                  }
                  localObject6 = ((ConstraintWidget)localObject5).OoooO0O;
                  localObject4 = ((ConstraintWidget)localObject1).OoooO0O;
                }
                else
                {
                  localObject6 = ((ConstraintWidget)localObject5).OoooO00;
                  localObject4 = ((ConstraintWidget)localObject1).OoooO00;
                }
                ((ConstraintAnchor)localObject6).OooO00o((ConstraintAnchor)localObject4, 0);
                break label2464;
              }
            }
            label2457:
            i11 = 1;
            f4 = 1.4E-45F;
            label2464:
            localObject6 = localObject5;
          }
          i1 += 1;
        }
      }
    }
  }
  
  public final void OooO0o()
  {
    this.OooOO0o = 0;
    this.OooOOO0 = 0;
    this.OooO0O0 = null;
    this.OooO0OO = 0;
    int i = this.OooOOOO;
    int j = 0;
    while (j < i)
    {
      int k = this.OooOOO + j;
      Flow localFlow1 = this.OooOOo;
      int m = Flow.o00o0O(localFlow1);
      if (k >= m) {
        break;
      }
      Object localObject = Flow.o00ooo(this.OooOOo);
      m = this.OooOOO + j;
      localObject = localObject[m];
      m = this.OooO00o;
      int n = 8;
      Flow localFlow2;
      int i1;
      int i2;
      ConstraintWidget localConstraintWidget;
      if (m == 0)
      {
        m = ((ConstraintWidget)localObject).getWidth();
        localFlow2 = this.OooOOo;
        i1 = Flow.Ooooo00(localFlow2);
        i2 = ((ConstraintWidget)localObject).getVisibility();
        if (i2 == n)
        {
          i1 = 0;
          localFlow2 = null;
        }
        n = this.OooOO0o;
        m += i1;
        n += m;
        this.OooOO0o = n;
        localFlow1 = this.OooOOo;
        n = this.OooOOo0;
        m = Flow.o00Ooo(localFlow1, (ConstraintWidget)localObject, n);
        localConstraintWidget = this.OooO0O0;
        if (localConstraintWidget != null)
        {
          n = this.OooO0OO;
          if (n >= m) {}
        }
        else
        {
          this.OooO0O0 = ((ConstraintWidget)localObject);
          this.OooO0OO = m;
          this.OooOOO0 = m;
        }
      }
      else
      {
        localFlow1 = this.OooOOo;
        i1 = this.OooOOo0;
        m = Flow.o00Oo0(localFlow1, (ConstraintWidget)localObject, i1);
        localFlow2 = this.OooOOo;
        i2 = this.OooOOo0;
        i1 = Flow.o00Ooo(localFlow2, (ConstraintWidget)localObject, i2);
        Flow localFlow3 = this.OooOOo;
        i2 = Flow.Ooooo0o(localFlow3);
        int i3 = ((ConstraintWidget)localObject).getVisibility();
        if (i3 == n)
        {
          i2 = 0;
          localFlow3 = null;
        }
        n = this.OooOOO0;
        i1 += i2;
        n += i1;
        this.OooOOO0 = n;
        localConstraintWidget = this.OooO0O0;
        if (localConstraintWidget != null)
        {
          n = this.OooO0OO;
          if (n >= m) {}
        }
        else
        {
          this.OooO0O0 = ((ConstraintWidget)localObject);
          this.OooO0OO = m;
          this.OooOO0o = m;
        }
      }
      j += 1;
    }
  }
  
  public void OooO0o0(int paramInt)
  {
    int i = this.OooOOOo;
    if (i == 0) {
      return;
    }
    int j = this.OooOOOO;
    paramInt /= i;
    i = 0;
    while (i < j)
    {
      int k = this.OooOOO + i;
      Flow localFlow = this.OooOOo;
      int m = Flow.o00o0O(localFlow);
      if (k >= m) {
        break;
      }
      Object localObject = Flow.o00ooo(this.OooOOo);
      m = this.OooOOO + i;
      localFlow = localObject[m];
      k = this.OooO00o;
      ConstraintWidget.DimensionBehaviour localDimensionBehaviour1;
      ConstraintWidget.DimensionBehaviour localDimensionBehaviour2;
      int n;
      int i1;
      if (k == 0)
      {
        if (localFlow == null) {
          break label238;
        }
        localObject = localFlow.getHorizontalDimensionBehaviour();
        localDimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
        if (localObject != localDimensionBehaviour1) {
          break label238;
        }
        k = localFlow.OooOo0o;
        if (k != 0) {
          break label238;
        }
        localObject = this.OooOOo;
        localDimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
        localDimensionBehaviour2 = localFlow.getVerticalDimensionBehaviour();
        n = localFlow.getHeight();
        i1 = paramInt;
      }
      else
      {
        if (localFlow == null) {
          break label238;
        }
        localObject = localFlow.getVerticalDimensionBehaviour();
        localDimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
        if (localObject != localDimensionBehaviour1) {
          break label238;
        }
        k = localFlow.OooOo;
        if (k != 0) {
          break label238;
        }
        localObject = this.OooOOo;
        localDimensionBehaviour1 = localFlow.getHorizontalDimensionBehaviour();
        i1 = localFlow.getWidth();
        localDimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
        n = paramInt;
      }
      ((VirtualLayout)localObject).OoooOOo(localFlow, localDimensionBehaviour1, i1, localDimensionBehaviour2, n);
      label238:
      i += 1;
    }
    OooO0o();
  }
  
  public void OooO0oO(int paramInt1, ConstraintAnchor paramConstraintAnchor1, ConstraintAnchor paramConstraintAnchor2, ConstraintAnchor paramConstraintAnchor3, ConstraintAnchor paramConstraintAnchor4, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    this.OooO00o = paramInt1;
    this.OooO0Oo = paramConstraintAnchor1;
    this.OooO0o0 = paramConstraintAnchor2;
    this.OooO0o = paramConstraintAnchor3;
    this.OooO0oO = paramConstraintAnchor4;
    this.OooO0oo = paramInt2;
    this.OooO = paramInt3;
    this.OooOO0 = paramInt4;
    this.OooOO0O = paramInt5;
    this.OooOOo0 = paramInt6;
  }
  
  public int getHeight()
  {
    int i = this.OooO00o;
    int j = 1;
    if (i == j)
    {
      i = this.OooOOO0;
      j = Flow.Ooooo0o(this.OooOOo);
      return i - j;
    }
    return this.OooOOO0;
  }
  
  public int getWidth()
  {
    int i = this.OooO00o;
    if (i == 0)
    {
      i = this.OooOO0o;
      int j = Flow.Ooooo00(this.OooOOo);
      return i - j;
    }
    return this.OooOO0o;
  }
  
  public void setStartIndex(int paramInt)
  {
    this.OooOOO = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.widgets.Flow.WidgetsList
 * JD-Core Version:    0.7.0.1
 */
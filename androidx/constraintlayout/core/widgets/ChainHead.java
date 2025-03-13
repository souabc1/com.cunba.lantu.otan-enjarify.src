package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;

public class ChainHead
{
  public int OooO;
  public ConstraintWidget OooO00o;
  public ConstraintWidget OooO0O0;
  public ConstraintWidget OooO0OO;
  public ConstraintWidget OooO0Oo;
  public ConstraintWidget OooO0o;
  public ConstraintWidget OooO0o0;
  public ConstraintWidget OooO0oO;
  public ArrayList OooO0oo;
  public int OooOO0;
  public float OooOO0O = 0.0F;
  public int OooOO0o;
  public int OooOOO;
  public int OooOOO0;
  public boolean OooOOOO;
  public int OooOOOo;
  public boolean OooOOo;
  public boolean OooOOo0;
  public boolean OooOOoo;
  public boolean OooOo0;
  public boolean OooOo00;
  public boolean OooOo0O;
  
  public ChainHead(ConstraintWidget paramConstraintWidget, int paramInt, boolean paramBoolean)
  {
    this.OooO00o = paramConstraintWidget;
    this.OooOOOo = paramInt;
    this.OooOOo0 = paramBoolean;
  }
  
  public static boolean OooO0OO(ConstraintWidget paramConstraintWidget, int paramInt)
  {
    int i = paramConstraintWidget.getVisibility();
    int j = 8;
    if (i != j)
    {
      ConstraintWidget.DimensionBehaviour localDimensionBehaviour1 = paramConstraintWidget.Ooooo00[paramInt];
      ConstraintWidget.DimensionBehaviour localDimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
      if (localDimensionBehaviour1 == localDimensionBehaviour2)
      {
        paramConstraintWidget = paramConstraintWidget.OooOoO0;
        k = paramConstraintWidget[paramInt];
        if (k != 0)
        {
          paramInt = 3;
          if (k != paramInt) {}
        }
        else
        {
          k = 1;
          break label67;
        }
      }
    }
    int k = 0;
    paramConstraintWidget = null;
    label67:
    return k;
  }
  
  public void OooO00o()
  {
    boolean bool = this.OooOo0O;
    if (!bool) {
      OooO0O0();
    }
    this.OooOo0O = true;
  }
  
  public final void OooO0O0()
  {
    int i = this.OooOOOo;
    int j = 2;
    i *= j;
    Object localObject1 = this.OooO00o;
    int k = 1;
    this.OooOOOO = k;
    Object localObject2 = localObject1;
    int m = 0;
    while (m == 0)
    {
      int n = this.OooO + k;
      this.OooO = n;
      Object localObject3 = ((ConstraintWidget)localObject1).o0000;
      int i3 = this.OooOOOo;
      Object localObject4 = null;
      localObject3[i3] = null;
      localObject3 = ((ConstraintWidget)localObject1).o00000oo;
      localObject3[i3] = null;
      n = ((ConstraintWidget)localObject1).getVisibility();
      i3 = 8;
      if (n != i3)
      {
        n = this.OooOO0o + k;
        this.OooOO0o = n;
        n = this.OooOOOo;
        localObject3 = ((ConstraintWidget)localObject1).getDimensionBehaviour(n);
        ConstraintWidget.DimensionBehaviour localDimensionBehaviour = ConstraintWidget.DimensionBehaviour.o00Ooo0;
        if (localObject3 != localDimensionBehaviour)
        {
          n = this.OooOOO0;
          i4 = this.OooOOOo;
          i4 = ((ConstraintWidget)localObject1).getLength(i4);
          n += i4;
          this.OooOOO0 = n;
        }
        n = this.OooOOO0;
        int i4 = localObject1.OoooOo0[i].getMargin();
        n += i4;
        this.OooOOO0 = n;
        Object localObject5 = ((ConstraintWidget)localObject1).OoooOo0;
        int i6 = i + 1;
        i4 = localObject5[i6].getMargin();
        n += i4;
        this.OooOOO0 = n;
        n = this.OooOOO;
        i4 = localObject1.OoooOo0[i].getMargin();
        n += i4;
        this.OooOOO = n;
        localObject5 = localObject1.OoooOo0[i6];
        i4 = ((ConstraintAnchor)localObject5).getMargin();
        n += i4;
        this.OooOOO = n;
        localObject3 = this.OooO0O0;
        if (localObject3 == null) {
          this.OooO0O0 = ((ConstraintWidget)localObject1);
        }
        this.OooO0Oo = ((ConstraintWidget)localObject1);
        localObject3 = ((ConstraintWidget)localObject1).Ooooo00;
        i4 = this.OooOOOo;
        localObject3 = localObject3[i4];
        if (localObject3 == localDimensionBehaviour)
        {
          localObject3 = ((ConstraintWidget)localObject1).OooOoO0;
          n = localObject3[i4];
          i3 = 0;
          localDimensionBehaviour = null;
          float f1;
          if (n != 0)
          {
            i6 = 3;
            f1 = 4.203895E-045F;
            if ((n != i6) && (n != j)) {}
          }
          else
          {
            n = this.OooOO0 + k;
            this.OooOO0 = n;
            localObject3 = ((ConstraintWidget)localObject1).o00000oO;
            f2 = localObject3[i4];
            boolean bool5 = f2 < 0.0F;
            if (bool5)
            {
              f1 = this.OooOO0O + f2;
              this.OooOO0O = f1;
            }
            boolean bool4 = OooO0OO((ConstraintWidget)localObject1, i4);
            if (bool4)
            {
              boolean bool2 = f2 < 0.0F;
              if (bool2) {
                this.OooOOo = k;
              } else {
                this.OooOOoo = k;
              }
              localObject3 = this.OooO0oo;
              if (localObject3 == null)
              {
                localObject3 = new java/util/ArrayList;
                ((ArrayList)localObject3).<init>();
                this.OooO0oo = ((ArrayList)localObject3);
              }
              localObject3 = this.OooO0oo;
              ((ArrayList)localObject3).add(localObject1);
            }
            localObject3 = this.OooO0o;
            if (localObject3 == null) {
              this.OooO0o = ((ConstraintWidget)localObject1);
            }
            localObject3 = this.OooO0oO;
            if (localObject3 != null)
            {
              localObject3 = ((ConstraintWidget)localObject3).o00000oo;
              int i5 = this.OooOOOo;
              localObject3[i5] = localObject1;
            }
            this.OooO0oO = ((ConstraintWidget)localObject1);
          }
          int i1 = this.OooOOOo;
          if (i1 == 0)
          {
            i1 = ((ConstraintWidget)localObject1).OooOo0o;
            if (i1 == 0)
            {
              i1 = ((ConstraintWidget)localObject1).OooOoO;
              if (i1 == 0)
              {
                i1 = ((ConstraintWidget)localObject1).OooOoOO;
                if (i1 == 0) {
                  break label667;
                }
              }
            }
          }
          else
          {
            i1 = ((ConstraintWidget)localObject1).OooOo;
            if (i1 == 0) {
              break label642;
            }
          }
          label642:
          do
          {
            do
            {
              this.OooOOOO = false;
              break;
              i1 = ((ConstraintWidget)localObject1).OooOoo;
            } while (i1 != 0);
            i1 = ((ConstraintWidget)localObject1).OooOooO;
          } while (i1 != 0);
          label667:
          float f2 = ((ConstraintWidget)localObject1).OooooOo;
          boolean bool3 = f2 < 0.0F;
          if (bool3)
          {
            this.OooOOOO = false;
            this.OooOo0 = k;
          }
        }
      }
      if (localObject2 != localObject1)
      {
        localObject2 = ((ConstraintWidget)localObject2).o0000;
        i2 = this.OooOOOo;
        localObject2[i2] = localObject1;
      }
      localObject2 = ((ConstraintWidget)localObject1).OoooOo0;
      int i2 = i + 1;
      localObject2 = localObject2[i2].OooO0o;
      if (localObject2 != null)
      {
        localObject2 = ((ConstraintAnchor)localObject2).OooO0Oo;
        localObject3 = localObject2.OoooOo0[i].OooO0o;
        if (localObject3 != null)
        {
          localObject3 = ((ConstraintAnchor)localObject3).OooO0Oo;
          if (localObject3 == localObject1) {
            localObject4 = localObject2;
          }
        }
      }
      if (localObject4 == null)
      {
        localObject4 = localObject1;
        m = k;
      }
      localObject2 = localObject1;
      localObject1 = localObject4;
    }
    Object localObject6 = this.OooO0O0;
    int i7;
    if (localObject6 != null)
    {
      i7 = this.OooOOO0;
      localObject6 = localObject6.OoooOo0[i];
      j = ((ConstraintAnchor)localObject6).getMargin();
      i7 -= j;
      this.OooOOO0 = i7;
    }
    localObject6 = this.OooO0Oo;
    if (localObject6 != null)
    {
      i7 = this.OooOOO0;
      localObject6 = ((ConstraintWidget)localObject6).OoooOo0;
      i += k;
      localConstraintWidget = localObject6[i];
      i = localConstraintWidget.getMargin();
      i7 -= i;
      this.OooOOO0 = i7;
    }
    this.OooO0OO = ((ConstraintWidget)localObject1);
    i = this.OooOOOo;
    if (i == 0)
    {
      bool1 = this.OooOOo0;
      if (bool1)
      {
        this.OooO0o0 = ((ConstraintWidget)localObject1);
        break label954;
      }
    }
    ConstraintWidget localConstraintWidget = this.OooO00o;
    this.OooO0o0 = localConstraintWidget;
    label954:
    boolean bool1 = this.OooOOoo;
    if (bool1)
    {
      bool1 = this.OooOOo;
      if (bool1) {}
    }
    else
    {
      k = 0;
    }
    this.OooOo00 = k;
  }
  
  public ConstraintWidget getFirst()
  {
    return this.OooO00o;
  }
  
  public ConstraintWidget getFirstMatchConstraintWidget()
  {
    return this.OooO0o;
  }
  
  public ConstraintWidget getFirstVisibleWidget()
  {
    return this.OooO0O0;
  }
  
  public ConstraintWidget getHead()
  {
    return this.OooO0o0;
  }
  
  public ConstraintWidget getLast()
  {
    return this.OooO0OO;
  }
  
  public ConstraintWidget getLastMatchConstraintWidget()
  {
    return this.OooO0oO;
  }
  
  public ConstraintWidget getLastVisibleWidget()
  {
    return this.OooO0Oo;
  }
  
  public float getTotalWeight()
  {
    return this.OooOO0O;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.widgets.ChainHead
 * JD-Core Version:    0.7.0.1
 */
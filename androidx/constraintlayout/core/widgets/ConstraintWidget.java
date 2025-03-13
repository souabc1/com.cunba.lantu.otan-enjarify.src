package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.Cache;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.analyzer.ChainRun;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ConstraintWidget
{
  public static float o0000O0O = 0.5F;
  public boolean OooO;
  public boolean OooO00o = false;
  public WidgetRun[] OooO0O0;
  public ChainRun OooO0OO;
  public ChainRun OooO0Oo;
  public VerticalWidgetRun OooO0o;
  public HorizontalWidgetRun OooO0o0;
  public boolean[] OooO0oO;
  public boolean OooO0oo;
  public boolean OooOO0;
  public boolean OooOO0O;
  public int OooOO0o;
  public WidgetFrame OooOOO;
  public int OooOOO0;
  public String OooOOOO;
  public boolean OooOOOo;
  public boolean OooOOo;
  public boolean OooOOo0;
  public boolean OooOOoo;
  public int OooOo;
  public int OooOo0;
  public int OooOo00;
  public int OooOo0O;
  public int OooOo0o;
  public int OooOoO;
  public int[] OooOoO0;
  public int OooOoOO;
  public int OooOoo;
  public float OooOoo0;
  public int OooOooO;
  public float OooOooo;
  public int Oooo;
  public float Oooo0;
  public boolean Oooo000;
  public boolean Oooo00O;
  public int Oooo00o;
  public int[] Oooo0O0;
  public float Oooo0OO;
  public boolean Oooo0o;
  public boolean Oooo0o0;
  public boolean Oooo0oO;
  public int Oooo0oo;
  public ConstraintAnchor OoooO;
  public ConstraintAnchor OoooO0;
  public ConstraintAnchor OoooO00;
  public ConstraintAnchor OoooO0O;
  public ConstraintAnchor OoooOO0;
  public ConstraintAnchor OoooOOO;
  public ConstraintAnchor OoooOOo;
  public ConstraintAnchor[] OoooOo0;
  public ArrayList OoooOoO;
  public boolean[] OoooOoo;
  public ConstraintWidget.DimensionBehaviour[] Ooooo00;
  public ConstraintWidget Ooooo0o;
  public int OooooO0;
  public int OooooOO;
  public float OooooOo;
  public int Oooooo;
  public int Oooooo0;
  public int OoooooO;
  public int Ooooooo;
  public ConstraintWidget[] o0000;
  public boolean o00000;
  public boolean o000000;
  public boolean o000000O;
  public boolean o000000o;
  public boolean o00000O;
  public boolean o00000O0;
  public int o00000OO;
  public int o00000Oo;
  public boolean o00000o0;
  public float[] o00000oO;
  public ConstraintWidget[] o00000oo;
  public int o0000O0;
  public ConstraintWidget o0000O00;
  public boolean o0000Ooo;
  public int o0000oO;
  public ConstraintWidget o0000oo;
  public boolean o000OOo;
  public ConstraintAnchor o000oOoO;
  public int o00O0O;
  public int o00Oo0;
  public int o00Ooo;
  public int o00o0O;
  public int o00oO0O;
  public Object o00oO0o;
  public float o00ooo;
  public int o0O0O00;
  public int o0OO00O;
  public String o0OOO0o;
  public int o0Oo0oo;
  public int o0OoOo0;
  public int o0ooOO0;
  public boolean o0ooOOo;
  public String o0ooOoO;
  public float oo000o;
  public int oo0o0Oo;
  public int ooOO;
  
  public ConstraintWidget()
  {
    int i = 2;
    WidgetRun[] arrayOfWidgetRun = new WidgetRun[i];
    this.OooO0O0 = arrayOfWidgetRun;
    this.OooO0o0 = null;
    this.OooO0o = null;
    boolean[] arrayOfBoolean = new boolean[i];
    boolean[] tmp36_35 = arrayOfBoolean;
    tmp36_35[0] = 1;
    tmp36_35[1] = 1;
    this.OooO0oO = arrayOfBoolean;
    this.OooO0oo = false;
    boolean bool = true;
    this.OooO = bool;
    this.OooOO0 = false;
    this.OooOO0O = bool;
    int j = -1;
    this.OooOO0o = j;
    this.OooOOO0 = j;
    Object localObject1 = new androidx/constraintlayout/core/state/WidgetFrame;
    ((WidgetFrame)localObject1).<init>(this);
    this.OooOOO = ((WidgetFrame)localObject1);
    this.OooOOOo = false;
    this.OooOOo0 = false;
    this.OooOOo = false;
    this.OooOOoo = false;
    this.OooOo00 = j;
    this.OooOo0 = j;
    this.OooOo0O = 0;
    this.OooOo0o = 0;
    this.OooOo = 0;
    localObject1 = new int[i];
    this.OooOoO0 = ((int[])localObject1);
    this.OooOoO = 0;
    this.OooOoOO = 0;
    float f = 1.0F;
    this.OooOoo0 = f;
    this.OooOoo = 0;
    this.OooOooO = 0;
    this.OooOooo = f;
    this.Oooo00o = j;
    this.Oooo0 = f;
    int k = -1 >>> 1;
    localObject1 = new int[] { k, k };
    this.Oooo0O0 = ((int[])localObject1);
    this.Oooo0OO = 0.0F;
    this.Oooo0o0 = false;
    this.Oooo0oO = false;
    this.Oooo0oo = 0;
    this.Oooo = 0;
    Object localObject2 = new androidx/constraintlayout/core/widgets/ConstraintAnchor;
    Object localObject3 = ConstraintAnchor.Type.o00Ooo00;
    ((ConstraintAnchor)localObject2).<init>(this, (ConstraintAnchor.Type)localObject3);
    this.OoooO00 = ((ConstraintAnchor)localObject2);
    localObject2 = new androidx/constraintlayout/core/widgets/ConstraintAnchor;
    localObject3 = ConstraintAnchor.Type.o00Ooo0;
    ((ConstraintAnchor)localObject2).<init>(this, (ConstraintAnchor.Type)localObject3);
    this.OoooO0 = ((ConstraintAnchor)localObject2);
    localObject2 = new androidx/constraintlayout/core/widgets/ConstraintAnchor;
    localObject3 = ConstraintAnchor.Type.o00Ooo0O;
    ((ConstraintAnchor)localObject2).<init>(this, (ConstraintAnchor.Type)localObject3);
    this.OoooO0O = ((ConstraintAnchor)localObject2);
    localObject2 = new androidx/constraintlayout/core/widgets/ConstraintAnchor;
    localObject3 = ConstraintAnchor.Type.o00Ooo0o;
    ((ConstraintAnchor)localObject2).<init>(this, (ConstraintAnchor.Type)localObject3);
    this.OoooO = ((ConstraintAnchor)localObject2);
    localObject2 = new androidx/constraintlayout/core/widgets/ConstraintAnchor;
    localObject3 = ConstraintAnchor.Type.o00OooO0;
    ((ConstraintAnchor)localObject2).<init>(this, (ConstraintAnchor.Type)localObject3);
    this.OoooOO0 = ((ConstraintAnchor)localObject2);
    localObject2 = new androidx/constraintlayout/core/widgets/ConstraintAnchor;
    localObject3 = ConstraintAnchor.Type.o00OooOO;
    ((ConstraintAnchor)localObject2).<init>(this, (ConstraintAnchor.Type)localObject3);
    this.o000oOoO = ((ConstraintAnchor)localObject2);
    localObject2 = new androidx/constraintlayout/core/widgets/ConstraintAnchor;
    localObject3 = ConstraintAnchor.Type.o00OooOo;
    ((ConstraintAnchor)localObject2).<init>(this, (ConstraintAnchor.Type)localObject3);
    this.OoooOOO = ((ConstraintAnchor)localObject2);
    localObject2 = new androidx/constraintlayout/core/widgets/ConstraintAnchor;
    localObject3 = ConstraintAnchor.Type.o00OooO;
    ((ConstraintAnchor)localObject2).<init>(this, (ConstraintAnchor.Type)localObject3);
    this.OoooOOo = ((ConstraintAnchor)localObject2);
    localObject3 = new ConstraintAnchor[6];
    ConstraintAnchor localConstraintAnchor1 = this.OoooO00;
    localObject3[0] = localConstraintAnchor1;
    localConstraintAnchor1 = this.OoooO0O;
    localObject3[bool] = localConstraintAnchor1;
    localConstraintAnchor1 = this.OoooO0;
    localObject3[i] = localConstraintAnchor1;
    ConstraintAnchor localConstraintAnchor2 = this.OoooO;
    localObject3[3] = localConstraintAnchor2;
    localConstraintAnchor2 = this.OoooOO0;
    localObject3[4] = localConstraintAnchor2;
    localObject3[5] = localObject2;
    this.OoooOo0 = ((ConstraintAnchor[])localObject3);
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    this.OoooOoO = ((ArrayList)localObject2);
    localObject2 = new boolean[i];
    this.OoooOoo = ((boolean[])localObject2);
    localObject2 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
    localObject2 = new ConstraintWidget.DimensionBehaviour[] { localObject2, localObject2 };
    this.Ooooo00 = ((ConstraintWidget.DimensionBehaviour[])localObject2);
    this.Ooooo0o = null;
    this.OooooO0 = 0;
    this.OooooOO = 0;
    this.OooooOo = 0.0F;
    this.Oooooo0 = j;
    this.Oooooo = 0;
    this.OoooooO = 0;
    this.Ooooooo = 0;
    this.o0OoOo0 = 0;
    this.ooOO = 0;
    this.o00O0O = 0;
    this.o00Oo0 = 0;
    f = o0000O0O;
    this.o00ooo = f;
    this.oo000o = f;
    this.o00oO0O = 0;
    this.o0ooOO0 = 0;
    this.o0ooOOo = false;
    this.o0ooOoO = null;
    this.o0OOO0o = null;
    this.o00000O = false;
    this.o00000OO = 0;
    this.o00000Oo = 0;
    localObject1 = new float[i];
    Object tmp713_711 = localObject1;
    tmp713_711[0] = -1.0F;
    tmp713_711[1] = -1.0F;
    this.o00000oO = ((float[])localObject1);
    localObject1 = new ConstraintWidget[i];
    localObject1[0] = null;
    localObject1[bool] = null;
    this.o00000oo = ((ConstraintWidget[])localObject1);
    ConstraintWidget[] arrayOfConstraintWidget = new ConstraintWidget[i];
    arrayOfConstraintWidget[0] = null;
    arrayOfConstraintWidget[bool] = null;
    this.o0000 = arrayOfConstraintWidget;
    this.o0000O00 = null;
    this.o0000oo = null;
    this.o0000oO = j;
    this.o0000O0 = j;
    OooO0Oo();
  }
  
  public ConstraintWidget(int paramInt1, int paramInt2)
  {
    this(0, 0, paramInt1, paramInt2);
  }
  
  public ConstraintWidget(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 2;
    WidgetRun[] arrayOfWidgetRun = new WidgetRun[i];
    this.OooO0O0 = arrayOfWidgetRun;
    this.OooO0o0 = null;
    this.OooO0o = null;
    boolean[] arrayOfBoolean = new boolean[i];
    boolean[] tmp43_41 = arrayOfBoolean;
    tmp43_41[0] = 1;
    tmp43_41[1] = 1;
    this.OooO0oO = arrayOfBoolean;
    this.OooO0oo = false;
    boolean bool = true;
    this.OooO = bool;
    this.OooOO0 = false;
    this.OooOO0O = bool;
    int j = -1;
    this.OooOO0o = j;
    this.OooOOO0 = j;
    Object localObject1 = new androidx/constraintlayout/core/state/WidgetFrame;
    ((WidgetFrame)localObject1).<init>(this);
    this.OooOOO = ((WidgetFrame)localObject1);
    this.OooOOOo = false;
    this.OooOOo0 = false;
    this.OooOOo = false;
    this.OooOOoo = false;
    this.OooOo00 = j;
    this.OooOo0 = j;
    this.OooOo0O = 0;
    this.OooOo0o = 0;
    this.OooOo = 0;
    localObject1 = new int[i];
    this.OooOoO0 = ((int[])localObject1);
    this.OooOoO = 0;
    this.OooOoOO = 0;
    float f = 1.0F;
    this.OooOoo0 = f;
    this.OooOoo = 0;
    this.OooOooO = 0;
    this.OooOooo = f;
    this.Oooo00o = j;
    this.Oooo0 = f;
    int k = -1 >>> 1;
    localObject1 = new int[] { k, k };
    this.Oooo0O0 = ((int[])localObject1);
    this.Oooo0OO = 0.0F;
    this.Oooo0o0 = false;
    this.Oooo0oO = false;
    this.Oooo0oo = 0;
    this.Oooo = 0;
    Object localObject2 = new androidx/constraintlayout/core/widgets/ConstraintAnchor;
    Object localObject3 = ConstraintAnchor.Type.o00Ooo00;
    ((ConstraintAnchor)localObject2).<init>(this, (ConstraintAnchor.Type)localObject3);
    this.OoooO00 = ((ConstraintAnchor)localObject2);
    localObject2 = new androidx/constraintlayout/core/widgets/ConstraintAnchor;
    localObject3 = ConstraintAnchor.Type.o00Ooo0;
    ((ConstraintAnchor)localObject2).<init>(this, (ConstraintAnchor.Type)localObject3);
    this.OoooO0 = ((ConstraintAnchor)localObject2);
    localObject2 = new androidx/constraintlayout/core/widgets/ConstraintAnchor;
    localObject3 = ConstraintAnchor.Type.o00Ooo0O;
    ((ConstraintAnchor)localObject2).<init>(this, (ConstraintAnchor.Type)localObject3);
    this.OoooO0O = ((ConstraintAnchor)localObject2);
    localObject2 = new androidx/constraintlayout/core/widgets/ConstraintAnchor;
    localObject3 = ConstraintAnchor.Type.o00Ooo0o;
    ((ConstraintAnchor)localObject2).<init>(this, (ConstraintAnchor.Type)localObject3);
    this.OoooO = ((ConstraintAnchor)localObject2);
    localObject2 = new androidx/constraintlayout/core/widgets/ConstraintAnchor;
    localObject3 = ConstraintAnchor.Type.o00OooO0;
    ((ConstraintAnchor)localObject2).<init>(this, (ConstraintAnchor.Type)localObject3);
    this.OoooOO0 = ((ConstraintAnchor)localObject2);
    localObject2 = new androidx/constraintlayout/core/widgets/ConstraintAnchor;
    localObject3 = ConstraintAnchor.Type.o00OooOO;
    ((ConstraintAnchor)localObject2).<init>(this, (ConstraintAnchor.Type)localObject3);
    this.o000oOoO = ((ConstraintAnchor)localObject2);
    localObject2 = new androidx/constraintlayout/core/widgets/ConstraintAnchor;
    localObject3 = ConstraintAnchor.Type.o00OooOo;
    ((ConstraintAnchor)localObject2).<init>(this, (ConstraintAnchor.Type)localObject3);
    this.OoooOOO = ((ConstraintAnchor)localObject2);
    localObject2 = new androidx/constraintlayout/core/widgets/ConstraintAnchor;
    localObject3 = ConstraintAnchor.Type.o00OooO;
    ((ConstraintAnchor)localObject2).<init>(this, (ConstraintAnchor.Type)localObject3);
    this.OoooOOo = ((ConstraintAnchor)localObject2);
    localObject3 = new ConstraintAnchor[6];
    ConstraintAnchor localConstraintAnchor1 = this.OoooO00;
    localObject3[0] = localConstraintAnchor1;
    localConstraintAnchor1 = this.OoooO0O;
    localObject3[bool] = localConstraintAnchor1;
    localConstraintAnchor1 = this.OoooO0;
    localObject3[i] = localConstraintAnchor1;
    ConstraintAnchor localConstraintAnchor2 = this.OoooO;
    localObject3[3] = localConstraintAnchor2;
    localConstraintAnchor2 = this.OoooOO0;
    localObject3[4] = localConstraintAnchor2;
    localObject3[5] = localObject2;
    this.OoooOo0 = ((ConstraintAnchor[])localObject3);
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    this.OoooOoO = ((ArrayList)localObject2);
    localObject2 = new boolean[i];
    this.OoooOoo = ((boolean[])localObject2);
    localObject2 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
    localObject2 = new ConstraintWidget.DimensionBehaviour[] { localObject2, localObject2 };
    this.Ooooo00 = ((ConstraintWidget.DimensionBehaviour[])localObject2);
    this.Ooooo0o = null;
    this.OooooOo = 0.0F;
    this.Oooooo0 = j;
    this.Ooooooo = 0;
    this.o0OoOo0 = 0;
    this.ooOO = 0;
    this.o00O0O = 0;
    this.o00Oo0 = 0;
    f = o0000O0O;
    this.o00ooo = f;
    this.oo000o = f;
    this.o00oO0O = 0;
    this.o0ooOO0 = 0;
    this.o0ooOOo = false;
    this.o0ooOoO = null;
    this.o0OOO0o = null;
    this.o00000O = false;
    this.o00000OO = 0;
    this.o00000Oo = 0;
    localObject1 = new float[i];
    Object tmp705_703 = localObject1;
    tmp705_703[0] = -1.0F;
    tmp705_703[1] = -1.0F;
    this.o00000oO = ((float[])localObject1);
    localObject1 = new ConstraintWidget[i];
    localObject1[0] = null;
    localObject1[bool] = null;
    this.o00000oo = ((ConstraintWidget[])localObject1);
    ConstraintWidget[] arrayOfConstraintWidget = new ConstraintWidget[i];
    arrayOfConstraintWidget[0] = null;
    arrayOfConstraintWidget[bool] = null;
    this.o0000 = arrayOfConstraintWidget;
    this.o0000O00 = null;
    this.o0000oo = null;
    this.o0000oO = j;
    this.o0000O0 = j;
    this.Oooooo = paramInt1;
    this.OoooooO = paramInt2;
    this.OooooO0 = paramInt3;
    this.OooooOO = paramInt4;
    OooO0Oo();
  }
  
  private boolean isChainHead(int paramInt)
  {
    paramInt *= 2;
    Object localObject1 = this.OoooOo0;
    Object localObject2 = localObject1[paramInt];
    ConstraintAnchor localConstraintAnchor = localObject2.OooO0o;
    if (localConstraintAnchor != null)
    {
      localConstraintAnchor = localConstraintAnchor.OooO0o;
      if (localConstraintAnchor != localObject2)
      {
        i = 1;
        paramInt += i;
        Object localObject3 = localObject1[paramInt];
        localObject1 = localObject3.OooO0o;
        if (localObject1 != null)
        {
          localObject1 = ((ConstraintAnchor)localObject1).OooO0o;
          if (localObject1 == localObject3) {
            break label79;
          }
        }
      }
    }
    int i = 0;
    localObject2 = null;
    label79:
    return i;
  }
  
  public final void OooO(LinearSystem paramLinearSystem, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, ConstraintWidget.DimensionBehaviour paramDimensionBehaviour, boolean paramBoolean5, ConstraintAnchor paramConstraintAnchor1, ConstraintAnchor paramConstraintAnchor2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8, boolean paramBoolean9, boolean paramBoolean10, int paramInt5, int paramInt6, int paramInt7, int paramInt8, float paramFloat2, boolean paramBoolean11)
  {
    ConstraintWidget localConstraintWidget = this;
    LinearSystem localLinearSystem = paramLinearSystem;
    Object localObject1 = paramSolverVariable1;
    Object localObject2 = paramSolverVariable2;
    Object localObject3 = paramConstraintAnchor1;
    Object localObject4 = paramConstraintAnchor2;
    int i = paramInt3;
    int j = paramInt4;
    int i4 = paramInt6;
    int i5 = paramInt7;
    int i6 = paramInt8;
    SolverVariable localSolverVariable1 = paramLinearSystem.OooOOo0(paramConstraintAnchor1);
    SolverVariable localSolverVariable2 = paramLinearSystem.OooOOo0(paramConstraintAnchor2);
    Object localObject5 = paramConstraintAnchor1.getTarget();
    Object localObject6 = paramLinearSystem.OooOOo0(localObject5);
    localObject5 = paramConstraintAnchor2.getTarget();
    Object localObject7 = paramLinearSystem.OooOOo0(localObject5);
    localObject5 = LinearSystem.getMetrics();
    if (localObject5 != null)
    {
      localObject5 = LinearSystem.getMetrics();
      long l1 = ((Metrics)localObject5).OooOo0o;
      long l2 = 1L;
      l1 += l2;
      ((Metrics)localObject5).OooOo0o = l1;
    }
    boolean bool10 = paramConstraintAnchor1.isConnected();
    boolean bool11 = paramConstraintAnchor2.isConnected();
    localObject5 = localConstraintWidget.OoooOOo;
    boolean bool12 = ((ConstraintAnchor)localObject5).isConnected();
    boolean bool13;
    if (bool11) {
      bool13 = bool10 + true;
    } else {
      bool13 = bool10;
    }
    if (bool12) {
      bool13 += true;
    }
    if (paramBoolean6) {
      i11 = 3;
    } else {
      i11 = paramInt5;
    }
    int[] arrayOfInt = ConstraintWidget.1.OooO0O0;
    int i13 = paramDimensionBehaviour.ordinal();
    i4 = arrayOfInt[i13];
    int i14 = 1;
    if (i4 != i14)
    {
      i14 = 2;
      if (i4 != i14)
      {
        i14 = 3;
        if (i4 != i14)
        {
          i14 = 4;
          if (i4 == i14) {
            break label268;
          }
        }
      }
    }
    i4 = i11;
    label268:
    do
    {
      i11 = 0;
      break;
      i4 = i11;
    } while (i11 == i14);
    int i11 = 1;
    i14 = localConstraintWidget.OooOO0o;
    int i15 = -1;
    Object localObject8;
    if ((i14 != i15) && (paramBoolean1))
    {
      localConstraintWidget.OooOO0o = i15;
      localObject8 = localObject7;
      i11 = 0;
    }
    else
    {
      i14 = paramInt2;
      localObject8 = localObject7;
    }
    int i16 = localConstraintWidget.OooOOO0;
    if ((i16 != i15) && (!paramBoolean1))
    {
      localConstraintWidget.OooOOO0 = i15;
      i14 = i16;
      i11 = 0;
    }
    i16 = localConstraintWidget.o0ooOO0;
    i15 = 8;
    if (i16 == i15)
    {
      i14 = 0;
      localObject4 = null;
      i11 = 0;
    }
    if (paramBoolean11) {
      if ((!bool10) && (!bool11) && (!bool12))
      {
        i16 = paramInt1;
        localLinearSystem.OooO0o(localSolverVariable1, paramInt1);
      }
      else if ((bool10) && (!bool11))
      {
        i16 = paramConstraintAnchor1.getMargin();
        localLinearSystem.OooO0o0(localSolverVariable1, (SolverVariable)localObject6, i16, i15);
      }
    }
    SolverVariable localSolverVariable3;
    int i18;
    int i12;
    int i19;
    float f1;
    float f2;
    Object localObject10;
    label861:
    Object localObject11;
    label1148:
    int i20;
    if (i11 == 0)
    {
      if (paramBoolean5)
      {
        i15 = 0;
        localObject3 = null;
        localLinearSystem.OooO0o0(localSolverVariable2, localSolverVariable1, 0, 3);
        i16 = 8;
        if (i > 0) {
          localLinearSystem.OooO0oo(localSolverVariable2, localSolverVariable1, i, i16);
        }
        i14 = -1 >>> 1;
        if (j < i14) {
          localLinearSystem.OooOO0(localSolverVariable2, localSolverVariable1, j, i16);
        }
      }
      else
      {
        i16 = i15;
        i15 = 0;
        localObject3 = null;
        localLinearSystem.OooO0o0(localSolverVariable2, localSolverVariable1, i14, i16);
      }
      j = i6;
      paramBoolean5 = bool13;
      localObject3 = localObject6;
      localSolverVariable3 = localSolverVariable2;
      i18 = i11;
      localObject4 = localObject8;
      i12 = paramBoolean4;
      i19 = i5;
    }
    else
    {
      j = 2;
      f1 = 2.802597E-045F;
      i15 = 0;
      localObject3 = null;
      Object localObject9;
      if ((bool13 != j) && (!paramBoolean6))
      {
        j = 1;
        f1 = 1.4E-45F;
        if ((i4 == j) || (i4 == 0))
        {
          j = Math.max(i5, i14);
          if (i6 > 0) {
            j = Math.min(i6, j);
          }
          i16 = 8;
          localLinearSystem.OooO0o0(localSolverVariable2, localSolverVariable1, j, i16);
          i12 = paramBoolean4;
          j = i6;
          paramBoolean5 = bool13;
          localSolverVariable3 = localSolverVariable2;
          i18 = 0;
          localObject9 = null;
          localObject4 = localObject8;
          i19 = i5;
          localObject3 = localObject6;
          break label1292;
        }
      }
      j = -2;
      f1 = 0.0F / 0.0F;
      if (i5 == j) {
        i16 = i14;
      } else {
        i16 = i5;
      }
      if (i6 == j) {
        j = i14;
      } else {
        j = i6;
      }
      if (i14 > 0)
      {
        i5 = 1;
        f2 = 1.4E-45F;
        if (i4 != i5)
        {
          i14 = 0;
          localObject4 = null;
        }
      }
      if (i16 > 0)
      {
        i5 = 8;
        f2 = 1.121039E-044F;
        localLinearSystem.OooO0oo(localSolverVariable2, localSolverVariable1, i16, i5);
        i14 = Math.max(i14, i16);
      }
      if (j > 0)
      {
        if (paramBoolean2)
        {
          i5 = 1;
          f2 = 1.4E-45F;
          if (i4 == i5)
          {
            i5 = 0;
            localObject10 = null;
            f2 = 0.0F;
            break label861;
          }
        }
        i5 = 1;
        f2 = 1.4E-45F;
        if (i5 != 0)
        {
          i5 = 8;
          f2 = 1.121039E-044F;
          localLinearSystem.OooOO0(localSolverVariable2, localSolverVariable1, j, i5);
        }
        else
        {
          i5 = 8;
          f2 = 1.121039E-044F;
        }
        i14 = Math.min(i14, j);
      }
      else
      {
        i5 = 8;
        f2 = 1.121039E-044F;
      }
      i6 = 1;
      if (i4 == i6)
      {
        if (paramBoolean2)
        {
          localLinearSystem.OooO0o0(localSolverVariable2, localSolverVariable1, i14, i5);
          i6 = 5;
        }
        else
        {
          i6 = 5;
          localLinearSystem.OooO0o0(localSolverVariable2, localSolverVariable1, i14, i6);
          localLinearSystem.OooOO0(localSolverVariable2, localSolverVariable1, i14, i5);
        }
        paramBoolean5 = bool13;
        localObject3 = localObject6;
        localSolverVariable3 = localSolverVariable2;
        i18 = i12;
        localObject4 = localObject8;
        i12 = paramBoolean4;
        i19 = i16;
      }
      else
      {
        i6 = 5;
        i14 = 2;
        if (i4 == i14)
        {
          localObject10 = paramConstraintAnchor1.getType();
          localObject11 = ConstraintAnchor.Type.o00Ooo0;
          if (localObject10 != localObject11)
          {
            localObject10 = paramConstraintAnchor1.getType();
            localObject3 = ConstraintAnchor.Type.o00Ooo0o;
            if (localObject10 != localObject3)
            {
              localObject10 = localConstraintWidget.Ooooo0o;
              localObject11 = ConstraintAnchor.Type.o00Ooo00;
              localObject10 = ((ConstraintWidget)localObject10).OooOOo0((ConstraintAnchor.Type)localObject11);
              localObject10 = localLinearSystem.OooOOo0(localObject10);
              localObject11 = localConstraintWidget.Ooooo0o;
              localObject3 = ConstraintAnchor.Type.o00Ooo0O;
              break label1148;
            }
          }
          localObject10 = localConstraintWidget.Ooooo0o.OooOOo0((ConstraintAnchor.Type)localObject11);
          localObject10 = localLinearSystem.OooOOo0(localObject10);
          localObject11 = localConstraintWidget.Ooooo0o;
          localObject3 = ConstraintAnchor.Type.o00Ooo0o;
          localObject11 = ((ConstraintWidget)localObject11).OooOOo0((ConstraintAnchor.Type)localObject3);
          localObject11 = localLinearSystem.OooOOo0(localObject11);
          localObject9 = localObject10;
          localObject3 = localObject11;
          localObject10 = paramLinearSystem.OooOOo();
          i20 = 5;
          localObject11 = localSolverVariable2;
          i14 = bool13;
          localObject5 = localSolverVariable1;
          paramBoolean5 = bool13;
          localObject4 = localObject8;
          i19 = i16;
          localObject7 = localObject3;
          localObject3 = localObject6;
          localObject6 = localObject9;
          localSolverVariable3 = localSolverVariable2;
          localObject10 = ((ArrayRow)localObject10).OooOO0O(localSolverVariable2, localSolverVariable1, (SolverVariable)localObject7, localObject9, paramFloat2);
          localLinearSystem.OooO0Oo((ArrayRow)localObject10);
          if (paramBoolean2) {
            i12 = 0;
          }
          i18 = i12;
          i12 = paramBoolean4;
        }
        else
        {
          paramBoolean5 = bool13;
          localObject3 = localObject6;
          localSolverVariable3 = localSolverVariable2;
          localObject4 = localObject8;
          i19 = i16;
          i18 = i12;
          i12 = 1;
        }
      }
    }
    label1292:
    Object localObject12;
    int i8;
    Object localObject13;
    label1432:
    label2126:
    label2642:
    label2648:
    label2651:
    float f7;
    label2201:
    label2618:
    label2634:
    int i3;
    label3118:
    label3122:
    label3518:
    label3539:
    label3542:
    label3546:
    boolean bool9;
    if (paramBoolean11)
    {
      if (paramBoolean8)
      {
        localObject12 = paramSolverVariable1;
        localObject11 = paramSolverVariable2;
        i8 = paramBoolean5;
        localObject13 = localSolverVariable3;
        i5 = 0;
        f2 = 0.0F;
        localObject10 = null;
        i16 = 2;
        localSolverVariable3 = localSolverVariable1;
      }
      else
      {
        if ((!bool10) && (!bool11) && (!bool12))
        {
          localObject13 = localSolverVariable3;
          j = 5;
          f1 = 7.006492E-045F;
          i5 = 0;
          f2 = 0.0F;
          localObject10 = null;
        }
        else
        {
          if ((bool10) && (!bool11))
          {
            localObject6 = paramConstraintAnchor1;
            i21 = 0;
            localSolverVariable2 = null;
            localObject12 = paramConstraintAnchor1.OooO0o.OooO0Oo;
            if (paramBoolean2)
            {
              boolean bool1 = localObject12 instanceof Barrier;
              if (bool1)
              {
                i15 = 8;
                break label1432;
              }
            }
            i15 = 5;
            bool14 = paramBoolean2;
            i5 = 0;
            localObject10 = null;
            f2 = 0.0F;
            i16 = i15;
            localObject13 = localSolverVariable3;
            break label3546;
          }
          localObject6 = paramConstraintAnchor1;
          int i21 = 0;
          localSolverVariable2 = null;
          int m;
          if ((!bool10) && (bool11))
          {
            int k = -paramConstraintAnchor2.getMargin();
            i4 = 8;
            localLinearSystem.OooO0o0(localSolverVariable3, (SolverVariable)localObject4, k, i4);
            if (paramBoolean2)
            {
              boolean bool2 = localConstraintWidget.OooOO0;
              if (bool2)
              {
                bool2 = localSolverVariable1.o00OooO;
                if (bool2)
                {
                  localObject12 = localConstraintWidget.Ooooo0o;
                  if (localObject12 != null)
                  {
                    localObject12 = (ConstraintWidgetContainer)localObject12;
                    if (paramBoolean1)
                    {
                      ((ConstraintWidgetContainer)localObject12).OoooOo0(paramConstraintAnchor1);
                      break label3518;
                    }
                    ((ConstraintWidgetContainer)localObject12).OooooO0(paramConstraintAnchor1);
                    break label3518;
                  }
                }
              }
              localObject7 = paramSolverVariable1;
              m = 5;
              f1 = 7.006492E-045F;
              localLinearSystem.OooO0oo(localSolverVariable1, paramSolverVariable1, 0, m);
              i5 = 0;
              localObject10 = null;
              f2 = 0.0F;
              localObject13 = localSolverVariable3;
              break label3539;
            }
          }
          else
          {
            localObject7 = paramSolverVariable1;
            if ((bool10) && (bool11))
            {
              localObject10 = ((ConstraintAnchor)localObject6).OooO0o;
              localObject1 = ((ConstraintAnchor)localObject10).OooO0Oo;
              localObject2 = paramConstraintAnchor2;
              i5 = 2;
              f2 = 2.802597E-045F;
              localObject5 = paramConstraintAnchor2.OooO0o.OooO0Oo;
              localObject11 = getParent();
              int i7 = 6;
              float f3 = 8.407791E-045F;
              boolean bool4;
              if (i18 != 0)
              {
                if (i4 == 0)
                {
                  if ((m == 0) && (i19 == 0))
                  {
                    boolean bool3 = ((SolverVariable)localObject3).o00OooO;
                    if (bool3)
                    {
                      bool3 = ((SolverVariable)localObject4).o00OooO;
                      if (bool3)
                      {
                        n = paramConstraintAnchor1.getMargin();
                        i4 = 8;
                        localLinearSystem.OooO0o0(localSolverVariable1, (SolverVariable)localObject3, n, i4);
                        n = -paramConstraintAnchor2.getMargin();
                        localLinearSystem.OooO0o0(localSolverVariable3, (SolverVariable)localObject4, n, i4);
                        return;
                      }
                    }
                    i13 = 0;
                    f4 = 0.0F;
                    i20 = 0;
                    n = 8;
                    f1 = 1.121039E-044F;
                    i5 = 8;
                    f2 = 1.121039E-044F;
                    bool14 = true;
                  }
                  else
                  {
                    bool14 = false;
                    n = 5;
                    f1 = 7.006492E-045F;
                    i5 = 5;
                    f2 = 7.006492E-045F;
                    i13 = 1;
                    f4 = 1.4E-45F;
                    i20 = 1;
                  }
                  i21 = localObject1 instanceof Barrier;
                  if (i21 == 0)
                  {
                    i21 = localObject5 instanceof Barrier;
                    if (i21 == 0)
                    {
                      localSolverVariable2 = paramSolverVariable2;
                      bool15 = bool14;
                      bool14 = i13;
                      i13 = i5;
                      f4 = f2;
                      i5 = n;
                      f2 = f1;
                      n = i7;
                      f1 = f3;
                      break label2651;
                    }
                  }
                  localSolverVariable2 = paramSolverVariable2;
                  i5 = n;
                  f2 = f1;
                  int n = i7;
                  f1 = f3;
                  bool15 = bool14;
                  bool14 = i13;
                  i13 = 4;
                  f4 = 5.605194E-045F;
                  break label2651;
                }
                if (i4 == i5)
                {
                  bool4 = localObject1 instanceof Barrier;
                  if (!bool4)
                  {
                    bool4 = localObject5 instanceof Barrier;
                    if (!bool4)
                    {
                      localSolverVariable2 = paramSolverVariable2;
                      bool4 = i7;
                      f1 = f3;
                      i5 = 5;
                      f2 = 7.006492E-045F;
                      i13 = 5;
                      f4 = 7.006492E-045F;
                      break label2642;
                    }
                  }
                }
              }
              int i23;
              boolean bool5;
              do
              {
                do
                {
                  localSolverVariable2 = paramSolverVariable2;
                  break label2618;
                  i21 = 1;
                  if (i4 == i21)
                  {
                    localSolverVariable2 = paramSolverVariable2;
                    bool4 = i7;
                    f1 = f3;
                    i5 = 8;
                    f2 = 1.121039E-044F;
                    break label2634;
                  }
                  int i22 = 3;
                  if (i4 == i22)
                  {
                    i23 = localConstraintWidget.Oooo00o;
                    i5 = -1;
                    f2 = 0.0F / 0.0F;
                    if (i23 == i5)
                    {
                      localSolverVariable2 = paramSolverVariable2;
                      if (paramBoolean9)
                      {
                        if (paramBoolean2)
                        {
                          i1 = 5;
                          f1 = 7.006492E-045F;
                        }
                        else
                        {
                          i1 = 4;
                          f1 = 5.605194E-045F;
                        }
                      }
                      else
                      {
                        i1 = 8;
                        f1 = 1.121039E-044F;
                      }
                      i5 = 8;
                      f2 = 1.121039E-044F;
                      i13 = 5;
                      f4 = 7.006492E-045F;
                    }
                    for (;;)
                    {
                      bool14 = true;
                      i20 = 1;
                      bool15 = true;
                      break label2651;
                      if (paramBoolean6)
                      {
                        i5 = paramInt6;
                        i23 = 2;
                        if (paramInt6 != i23)
                        {
                          i1 = 1;
                          f1 = 1.4E-45F;
                          if (paramInt6 != i1)
                          {
                            i1 = 0;
                            f1 = 0.0F;
                            localObject12 = null;
                            break label2201;
                          }
                        }
                        i1 = 1;
                        f1 = 1.4E-45F;
                        if (i1 == 0)
                        {
                          i1 = 8;
                          f1 = 1.121039E-044F;
                          i5 = 5;
                          f2 = 7.006492E-045F;
                        }
                        else
                        {
                          i1 = 5;
                          f1 = 7.006492E-045F;
                          i5 = 4;
                          f2 = 5.605194E-045F;
                        }
                        localSolverVariable2 = paramSolverVariable2;
                        i13 = i5;
                        f4 = f2;
                        bool14 = true;
                        i20 = 1;
                        bool15 = true;
                        break;
                      }
                      if (i1 > 0)
                      {
                        localSolverVariable2 = paramSolverVariable2;
                        i1 = i7;
                        f1 = f3;
                        i5 = 5;
                        f2 = 7.006492E-045F;
                        break label2126;
                      }
                      if ((i1 == 0) && (i19 == 0))
                      {
                        if (!paramBoolean9)
                        {
                          localSolverVariable2 = paramSolverVariable2;
                          i1 = i7;
                          f1 = f3;
                          i5 = 5;
                          f2 = 7.006492E-045F;
                          i13 = 8;
                          f4 = 1.121039E-044F;
                          continue;
                        }
                        if ((localObject1 != localObject11) && (localObject5 != localObject11))
                        {
                          i1 = 4;
                          f1 = 5.605194E-045F;
                        }
                        else
                        {
                          i1 = 5;
                          f1 = 7.006492E-045F;
                        }
                        localSolverVariable2 = paramSolverVariable2;
                        i5 = i1;
                        f2 = f1;
                        i1 = i7;
                        f1 = f3;
                      }
                      else
                      {
                        localSolverVariable2 = paramSolverVariable2;
                        i1 = i7;
                        f1 = f3;
                        i5 = 5;
                        f2 = 7.006492E-045F;
                      }
                      i13 = 4;
                      f4 = 5.605194E-045F;
                    }
                  }
                  localSolverVariable2 = paramSolverVariable2;
                  int i1 = i7;
                  f1 = f3;
                  i5 = 5;
                  f2 = 7.006492E-045F;
                  i13 = 4;
                  f4 = 5.605194E-045F;
                  bool14 = false;
                  i20 = 0;
                  break label2648;
                  bool5 = ((SolverVariable)localObject3).o00OooO;
                } while (!bool5);
                bool5 = ((SolverVariable)localObject4).o00OooO;
              } while (!bool5);
              boolean bool6 = paramConstraintAnchor1.getMargin();
              i4 = paramConstraintAnchor2.getMargin();
              i5 = 8;
              f2 = 1.121039E-044F;
              paramBoolean9 = bool6;
              paramInt7 = i4;
              paramInt8 = i5;
              paramLinearSystem.OooO0OO(localSolverVariable1, (SolverVariable)localObject3, bool6, paramFloat1, (SolverVariable)localObject4, localSolverVariable3, i4, i5);
              if ((paramBoolean2) && (i12 != 0))
              {
                localObject12 = paramConstraintAnchor2.OooO0o;
                if (localObject12 != null)
                {
                  i15 = paramConstraintAnchor2.getMargin();
                  localSolverVariable2 = paramSolverVariable2;
                }
                else
                {
                  localSolverVariable2 = paramSolverVariable2;
                  i15 = 0;
                  localObject3 = null;
                }
                if (localObject4 != localSolverVariable2)
                {
                  bool6 = true;
                  f1 = 7.006492E-045F;
                  localLinearSystem.OooO0oo(localSolverVariable2, localSolverVariable3, i15, bool6);
                }
              }
              return;
              bool6 = i7;
              f1 = f3;
              i5 = 5;
              f2 = 7.006492E-045F;
              i13 = 4;
              float f4 = 5.605194E-045F;
              bool14 = true;
              i20 = 1;
              boolean bool15 = false;
              int i24;
              float f5;
              if ((i20 != 0) && (localObject3 == localObject4) && (localObject1 != localObject11))
              {
                i20 = 0;
                i24 = 0;
                f5 = 0.0F;
              }
              else
              {
                i24 = 1;
                f5 = 1.4E-45F;
              }
              int i29;
              Object localObject14;
              SolverVariable localSolverVariable4;
              if (bool14)
              {
                int i25;
                int i26;
                float f6;
                if ((i18 == 0) && (!paramBoolean7) && (!paramBoolean9) && (localObject3 == localObject7) && (localObject4 == localSolverVariable2))
                {
                  bool14 = false;
                  i24 = 8;
                  f5 = 1.121039E-044F;
                  i25 = 8;
                  i26 = 0;
                  f6 = 0.0F;
                }
                else
                {
                  bool14 = paramBoolean2;
                  i25 = bool6;
                  i26 = i24;
                  f6 = f5;
                  i24 = i5;
                  f5 = f2;
                }
                int i27 = paramConstraintAnchor1.getMargin();
                int i28 = paramConstraintAnchor2.getMargin();
                localObject12 = paramLinearSystem;
                i5 = i4;
                localObject13 = localSolverVariable1;
                bool11 = i4;
                localObject10 = localObject3;
                i29 = i4;
                localObject2 = localObject11;
                i6 = i27;
                localObject14 = localObject11;
                localObject2 = localObject5;
                f7 = paramFloat1;
                localObject7 = localObject4;
                localObject6 = localSolverVariable3;
                i23 = i28;
                localSolverVariable4 = localSolverVariable3;
                localSolverVariable3 = localSolverVariable1;
                paramLinearSystem.OooO0OO(localSolverVariable1, (SolverVariable)localObject3, i27, paramFloat1, (SolverVariable)localObject4, (SolverVariable)localObject6, i28, i25);
                i5 = i24;
                f2 = f5;
                i24 = i26;
                f5 = f6;
              }
              else
              {
                i29 = i4;
                localObject14 = localObject11;
                localObject2 = localObject5;
                localSolverVariable4 = localSolverVariable3;
                localSolverVariable3 = localSolverVariable1;
                bool14 = paramBoolean2;
              }
              bool6 = localConstraintWidget.o0ooOO0;
              i4 = 8;
              boolean bool7;
              if (bool6 == i4)
              {
                bool7 = paramConstraintAnchor2.OooO0o0();
                if (!bool7) {
                  return;
                }
              }
              if (i20 != 0)
              {
                if ((bool14) && (localObject3 != localObject4) && (i18 == 0))
                {
                  bool7 = localObject1 instanceof Barrier;
                  if (!bool7)
                  {
                    bool7 = localObject2 instanceof Barrier;
                    if (!bool7) {}
                  }
                  else
                  {
                    i5 = i7;
                    f2 = f3;
                  }
                }
                int i2 = paramConstraintAnchor1.getMargin();
                localLinearSystem.OooO0oo(localSolverVariable3, (SolverVariable)localObject3, i2, i5);
                i2 = -paramConstraintAnchor2.getMargin();
                localObject13 = localSolverVariable4;
                localLinearSystem.OooOO0(localSolverVariable4, (SolverVariable)localObject4, i2, i5);
              }
              else
              {
                localObject13 = localSolverVariable4;
              }
              if ((bool14) && (paramBoolean10))
              {
                boolean bool8 = localObject1 instanceof Barrier;
                if (!bool8)
                {
                  bool8 = localObject2 instanceof Barrier;
                  if (!bool8)
                  {
                    localObject12 = localObject14;
                    if (localObject2 == localObject14) {
                      break label3118;
                    }
                    i5 = i7;
                    f2 = f3;
                    i6 = i7;
                    i24 = 1;
                    f5 = 1.4E-45F;
                    break label3122;
                  }
                }
              }
              localObject12 = localObject14;
              i6 = i13;
              if (i24 != 0)
              {
                if ((bool15) && ((!paramBoolean9) || (paramBoolean3)))
                {
                  if ((localObject1 != localObject12) && (localObject2 != localObject12)) {
                    i16 = i6;
                  } else {
                    i16 = i7;
                  }
                  i8 = localObject1 instanceof Guideline;
                  if (i8 == 0)
                  {
                    i8 = localObject2 instanceof Guideline;
                    if (i8 == 0) {}
                  }
                  else
                  {
                    i16 = 5;
                  }
                  i8 = localObject1 instanceof Barrier;
                  if (i8 == 0)
                  {
                    i8 = localObject2 instanceof Barrier;
                    if (i8 == 0) {}
                  }
                  else
                  {
                    i16 = 5;
                  }
                  if (paramBoolean9) {
                    i16 = 5;
                  }
                  i6 = Math.max(i16, i6);
                }
                if (bool14)
                {
                  i5 = Math.min(i5, i6);
                  if ((paramBoolean6) && (!paramBoolean9) && ((localObject1 == localObject12) || (localObject2 == localObject12))) {
                    i6 = 4;
                  } else {
                    i6 = i5;
                  }
                }
                i3 = paramConstraintAnchor1.getMargin();
                localLinearSystem.OooO0o0(localSolverVariable3, (SolverVariable)localObject3, i3, i6);
                i3 = -paramConstraintAnchor2.getMargin();
                localLinearSystem.OooO0o0((SolverVariable)localObject13, (SolverVariable)localObject4, i3, i6);
              }
              if (bool14)
              {
                localObject12 = paramSolverVariable1;
                if (paramSolverVariable1 == localObject3)
                {
                  i5 = paramConstraintAnchor1.getMargin();
                }
                else
                {
                  i5 = 0;
                  f2 = 0.0F;
                  localObject10 = null;
                }
                if (localObject3 != localObject12)
                {
                  i6 = 5;
                  localLinearSystem.OooO0oo(localSolverVariable3, (SolverVariable)localObject12, i5, i6);
                }
              }
              if ((bool14) && (i18 != 0) && (paramInt3 == 0) && (i19 == 0))
              {
                if (i18 != 0)
                {
                  i3 = i29;
                  i5 = 3;
                  f2 = 4.203895E-045F;
                  if (i29 == i5)
                  {
                    i5 = 0;
                    f2 = 0.0F;
                    localObject10 = null;
                    localLinearSystem.OooO0oo((SolverVariable)localObject13, localSolverVariable3, 0, 8);
                    i3 = 5;
                    f1 = 7.006492E-045F;
                    break label3542;
                  }
                }
                i5 = 0;
                f2 = 0.0F;
                localObject10 = null;
                i3 = 5;
                f1 = 7.006492E-045F;
                localLinearSystem.OooO0oo((SolverVariable)localObject13, localSolverVariable3, 0, i3);
                break label3542;
              }
              i3 = 5;
              f1 = 7.006492E-045F;
              i5 = 0;
              f2 = 0.0F;
              localObject10 = null;
              break label3542;
            }
          }
          i5 = 0;
          localObject10 = null;
          f2 = 0.0F;
          localObject13 = localSolverVariable3;
          i3 = 5;
          f1 = 7.006492E-045F;
        }
        boolean bool14 = paramBoolean2;
        i16 = i3;
        if ((bool14) && (i12 != 0))
        {
          localObject12 = paramConstraintAnchor2;
          localObject11 = paramConstraintAnchor2.OooO0o;
          if (localObject11 != null)
          {
            i15 = paramConstraintAnchor2.getMargin();
            localObject11 = paramSolverVariable2;
          }
          else
          {
            localObject11 = paramSolverVariable2;
            i15 = 0;
            localObject3 = null;
          }
          if (localObject4 != localObject11)
          {
            bool9 = localConstraintWidget.OooOO0;
            if (bool9)
            {
              bool9 = ((SolverVariable)localObject13).o00OooO;
              if (bool9)
              {
                localObject10 = localConstraintWidget.Ooooo0o;
                if (localObject10 != null)
                {
                  localObject10 = (ConstraintWidgetContainer)localObject10;
                  if (paramBoolean1) {
                    ((ConstraintWidgetContainer)localObject10).OoooOOo((ConstraintAnchor)localObject12);
                  } else {
                    ((ConstraintWidgetContainer)localObject10).Ooooo0o((ConstraintAnchor)localObject12);
                  }
                  return;
                }
              }
            }
            localLinearSystem.OooO0oo((SolverVariable)localObject11, (SolverVariable)localObject13, i15, i16);
          }
        }
      }
    }
    else
    {
      localObject12 = paramSolverVariable1;
      localObject11 = paramSolverVariable2;
      localObject13 = localSolverVariable3;
      bool9 = false;
      f2 = 0.0F;
      localObject10 = null;
      localSolverVariable3 = localSolverVariable1;
      i8 = paramBoolean5;
      i16 = 2;
    }
    if ((i8 < i16) && (paramBoolean2) && (i12 != 0))
    {
      int i9 = 8;
      f7 = 1.121039E-044F;
      localLinearSystem.OooO0oo(localSolverVariable3, (SolverVariable)localObject12, 0, i9);
      if (!paramBoolean1)
      {
        localObject12 = localConstraintWidget.OoooOO0.OooO0o;
        if (localObject12 != null)
        {
          i15 = 0;
          localObject3 = null;
          break label3785;
        }
      }
      i15 = 1;
      label3785:
      if (!paramBoolean1)
      {
        localObject12 = localConstraintWidget.OoooOO0.OooO0o;
        if (localObject12 != null)
        {
          localObject12 = ((ConstraintAnchor)localObject12).OooO0Oo;
          f7 = ((ConstraintWidget)localObject12).OooooOo;
          int i17 = 0;
          localObject7 = null;
          int i10 = f7 < 0.0F;
          if (i10 != 0)
          {
            localObject12 = ((ConstraintWidget)localObject12).Ooooo00;
            localObject5 = localObject12[0];
            localObject7 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
            if (localObject5 == localObject7)
            {
              i10 = 1;
              f7 = 1.4E-45F;
              localObject12 = localObject12[i10];
              if (localObject12 == localObject7)
              {
                i14 = i10;
                break label3901;
              }
            }
          }
          i14 = 0;
          localObject4 = null;
          break label3901;
        }
      }
      i14 = i15;
      label3901:
      if (i14 != 0)
      {
        i3 = 8;
        f1 = 1.121039E-044F;
        localLinearSystem.OooO0oo((SolverVariable)localObject11, (SolverVariable)localObject13, 0, i3);
      }
    }
  }
  
  public final void OooO0Oo()
  {
    ArrayList localArrayList = this.OoooOoO;
    ConstraintAnchor localConstraintAnchor = this.OoooO00;
    localArrayList.add(localConstraintAnchor);
    localArrayList = this.OoooOoO;
    localConstraintAnchor = this.OoooO0;
    localArrayList.add(localConstraintAnchor);
    localArrayList = this.OoooOoO;
    localConstraintAnchor = this.OoooO0O;
    localArrayList.add(localConstraintAnchor);
    localArrayList = this.OoooOoO;
    localConstraintAnchor = this.OoooO;
    localArrayList.add(localConstraintAnchor);
    localArrayList = this.OoooOoO;
    localConstraintAnchor = this.o000oOoO;
    localArrayList.add(localConstraintAnchor);
    localArrayList = this.OoooOoO;
    localConstraintAnchor = this.OoooOOO;
    localArrayList.add(localConstraintAnchor);
    localArrayList = this.OoooOoO;
    localConstraintAnchor = this.OoooOOo;
    localArrayList.add(localConstraintAnchor);
    localArrayList = this.OoooOoO;
    localConstraintAnchor = this.OoooOO0;
    localArrayList.add(localConstraintAnchor);
  }
  
  public boolean OooO0o()
  {
    boolean bool = this instanceof VirtualLayout;
    if (!bool)
    {
      bool = this instanceof Guideline;
      if (!bool) {
        return false;
      }
    }
    bool = true;
    return bool;
  }
  
  public void OooO0o0(ConstraintWidgetContainer paramConstraintWidgetContainer, LinearSystem paramLinearSystem, HashSet paramHashSet, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramBoolean = paramHashSet.contains(this);
      if (!paramBoolean) {
        return;
      }
      Optimizer.OooO00o(paramConstraintWidgetContainer, paramLinearSystem, this);
      paramHashSet.remove(this);
      paramBoolean = paramConstraintWidgetContainer.o00Oo0(64);
      OooO0oO(paramLinearSystem, paramBoolean);
    }
    Object localObject;
    boolean bool1;
    ConstraintAnchor localConstraintAnchor;
    ConstraintWidget localConstraintWidget;
    boolean bool2;
    if (paramInt == 0)
    {
      localObject = this.OoooO00.getDependents();
      if (localObject != null)
      {
        localObject = ((HashSet)localObject).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject).hasNext();
          if (!bool1) {
            break;
          }
          localConstraintAnchor = (ConstraintAnchor)((Iterator)localObject).next();
          localConstraintWidget = localConstraintAnchor.OooO0Oo;
          bool2 = true;
          localConstraintWidget.OooO0o0(paramConstraintWidgetContainer, paramLinearSystem, paramHashSet, paramInt, bool2);
        }
      }
      localObject = this.OoooO0O.getDependents();
      if (localObject != null)
      {
        localObject = ((HashSet)localObject).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject).hasNext();
          if (!bool1) {
            break;
          }
          localConstraintAnchor = (ConstraintAnchor)((Iterator)localObject).next();
          localConstraintWidget = localConstraintAnchor.OooO0Oo;
          bool2 = true;
          localConstraintWidget.OooO0o0(paramConstraintWidgetContainer, paramLinearSystem, paramHashSet, paramInt, bool2);
        }
      }
    }
    else
    {
      localObject = this.OoooO0.getDependents();
      if (localObject != null)
      {
        localObject = ((HashSet)localObject).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject).hasNext();
          if (!bool1) {
            break;
          }
          localConstraintAnchor = (ConstraintAnchor)((Iterator)localObject).next();
          localConstraintWidget = localConstraintAnchor.OooO0Oo;
          bool2 = true;
          localConstraintWidget.OooO0o0(paramConstraintWidgetContainer, paramLinearSystem, paramHashSet, paramInt, bool2);
        }
      }
      localObject = this.OoooO.getDependents();
      if (localObject != null)
      {
        localObject = ((HashSet)localObject).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject).hasNext();
          if (!bool1) {
            break;
          }
          localConstraintAnchor = (ConstraintAnchor)((Iterator)localObject).next();
          localConstraintWidget = localConstraintAnchor.OooO0Oo;
          bool2 = true;
          localConstraintWidget.OooO0o0(paramConstraintWidgetContainer, paramLinearSystem, paramHashSet, paramInt, bool2);
        }
      }
      localObject = this.OoooOO0.getDependents();
      if (localObject != null)
      {
        localObject = ((HashSet)localObject).iterator();
        for (;;)
        {
          bool1 = ((Iterator)localObject).hasNext();
          if (!bool1) {
            break;
          }
          localConstraintAnchor = (ConstraintAnchor)((Iterator)localObject).next();
          localConstraintWidget = localConstraintAnchor.OooO0Oo;
          bool2 = true;
          localConstraintWidget.OooO0o0(paramConstraintWidgetContainer, paramLinearSystem, paramHashSet, paramInt, bool2);
        }
      }
    }
  }
  
  public void OooO0oO(LinearSystem paramLinearSystem, boolean paramBoolean)
  {
    ConstraintWidget localConstraintWidget = this;
    LinearSystem localLinearSystem = paramLinearSystem;
    Object localObject1 = this.OoooO00;
    Object localObject2 = paramLinearSystem.OooOOo0(localObject1);
    localObject1 = this.OoooO0O;
    Object localObject3 = paramLinearSystem.OooOOo0(localObject1);
    localObject1 = this.OoooO0;
    Object localObject4 = paramLinearSystem.OooOOo0(localObject1);
    localObject1 = this.OoooO;
    Object localObject5 = paramLinearSystem.OooOOo0(localObject1);
    localObject1 = this.OoooOO0;
    SolverVariable localSolverVariable1 = paramLinearSystem.OooOOo0(localObject1);
    localObject1 = this.Ooooo0o;
    int i = 2;
    int n = 3;
    float f1 = 4.203895E-045F;
    int i5 = 1;
    float f2 = 1.4E-45F;
    int i8 = 0;
    Object localObject6 = null;
    label156:
    float f4;
    if (localObject1 != null)
    {
      if (localObject1 != null)
      {
        localObject7 = localObject1.Ooooo00[0];
        localObject8 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
        if (localObject7 == localObject8)
        {
          int i9 = i5;
          f3 = f2;
          break label156;
        }
      }
      i10 = 0;
      localObject7 = null;
      f3 = 0.0F;
      if (localObject1 != null)
      {
        localObject1 = localObject1.Ooooo00[i5];
        localObject8 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
        if (localObject1 == localObject8)
        {
          int i15 = i5;
          f4 = f2;
          break label203;
        }
      }
      i16 = 0;
      localObject1 = null;
      f4 = 0.0F;
      label203:
      int i31 = localConstraintWidget.OooOo0O;
      if (i31 != i5)
      {
        if (i31 != i)
        {
          if (i31 != n)
          {
            i35 = i16;
            f5 = f4;
            i37 = i10;
            f6 = f3;
            break label301;
          }
        }
        else
        {
          i35 = i16;
          f5 = f4;
          i37 = 0;
          localObject9 = null;
          f6 = 0.0F;
          break label301;
        }
      }
      else
      {
        i37 = i10;
        f6 = f3;
        i35 = 0;
        f5 = 0.0F;
        break label301;
      }
    }
    int i37 = 0;
    Object localObject9 = null;
    float f6 = 0.0F;
    int i35 = 0;
    float f5 = 0.0F;
    label301:
    int i16 = localConstraintWidget.o0ooOO0;
    int i32 = 8;
    float f7 = 1.121039E-044F;
    if (i16 == i32)
    {
      boolean bool7 = localConstraintWidget.o0ooOOo;
      if (!bool7)
      {
        bool7 = OooOo0o();
        if (!bool7)
        {
          localObject1 = localConstraintWidget.OoooOoo;
          i10 = localObject1[0];
          if (i10 == 0)
          {
            int i17 = localObject1[i5];
            if (i17 == 0) {
              return;
            }
          }
        }
      }
    }
    boolean bool8 = localConstraintWidget.OooOOOo;
    int i10 = 5;
    float f3 = 7.006492E-045F;
    if (!bool8)
    {
      boolean bool1 = localConstraintWidget.OooOOo0;
      if (!bool1) {}
    }
    else
    {
      if (bool8)
      {
        int i18 = localConstraintWidget.Oooooo;
        localLinearSystem.OooO0o((SolverVariable)localObject2, i18);
        i18 = localConstraintWidget.Oooooo;
        int j = localConstraintWidget.OooooO0;
        i18 += j;
        localLinearSystem.OooO0o((SolverVariable)localObject3, i18);
        if (i37 != 0)
        {
          localObject1 = localConstraintWidget.Ooooo0o;
          if (localObject1 != null)
          {
            boolean bool2 = localConstraintWidget.OooOO0O;
            if (bool2)
            {
              localObject1 = (ConstraintWidgetContainer)localObject1;
              localObject10 = localConstraintWidget.OoooO00;
              ((ConstraintWidgetContainer)localObject1).OoooOo0((ConstraintAnchor)localObject10);
              localObject10 = localConstraintWidget.OoooO0O;
              ((ConstraintWidgetContainer)localObject1).OoooOOo((ConstraintAnchor)localObject10);
            }
            else
            {
              localObject1 = ((ConstraintWidget)localObject1).OoooO0O;
              localObject1 = localLinearSystem.OooOOo0(localObject1);
              localLinearSystem.OooO0oo((SolverVariable)localObject1, (SolverVariable)localObject3, 0, i10);
            }
          }
        }
      }
      boolean bool9 = localConstraintWidget.OooOOo0;
      if (bool9)
      {
        int i19 = localConstraintWidget.OoooooO;
        localLinearSystem.OooO0o((SolverVariable)localObject4, i19);
        i19 = localConstraintWidget.OoooooO;
        int k = localConstraintWidget.OooooOO;
        i19 += k;
        localLinearSystem.OooO0o((SolverVariable)localObject5, i19);
        localObject1 = localConstraintWidget.OoooOO0;
        boolean bool10 = ((ConstraintAnchor)localObject1).OooO0o0();
        if (bool10)
        {
          int i20 = localConstraintWidget.OoooooO;
          k = localConstraintWidget.o00Oo0;
          i20 += k;
          localLinearSystem.OooO0o(localSolverVariable1, i20);
        }
        if (i35 != 0)
        {
          localObject1 = localConstraintWidget.Ooooo0o;
          if (localObject1 != null)
          {
            boolean bool3 = localConstraintWidget.OooOO0O;
            if (bool3)
            {
              localObject1 = (ConstraintWidgetContainer)localObject1;
              localObject10 = localConstraintWidget.OoooO0;
              ((ConstraintWidgetContainer)localObject1).OooooO0((ConstraintAnchor)localObject10);
              localObject10 = localConstraintWidget.OoooO;
              ((ConstraintWidgetContainer)localObject1).Ooooo0o((ConstraintAnchor)localObject10);
            }
            else
            {
              localObject1 = ((ConstraintWidget)localObject1).OoooO;
              localObject1 = localLinearSystem.OooOOo0(localObject1);
              localLinearSystem.OooO0oo((SolverVariable)localObject1, (SolverVariable)localObject5, 0, i10);
            }
          }
        }
      }
      boolean bool11 = localConstraintWidget.OooOOOo;
      if (bool11)
      {
        bool11 = localConstraintWidget.OooOOo0;
        if (bool11)
        {
          localConstraintWidget.OooOOOo = false;
          localConstraintWidget.OooOOo0 = false;
          return;
        }
      }
    }
    localObject1 = LinearSystem.OooOo;
    long l1 = 1L;
    long l2;
    if (localObject1 != null)
    {
      l2 = ((Metrics)localObject1).OooOoO + l1;
      ((Metrics)localObject1).OooOoO = l2;
    }
    Object localObject11;
    int i1;
    int i23;
    if (paramBoolean)
    {
      localObject11 = localConstraintWidget.OooO0o0;
      if (localObject11 != null)
      {
        localObject7 = localConstraintWidget.OooO0o;
        if (localObject7 != null)
        {
          localObject10 = ((WidgetRun)localObject11).OooO0oo;
          i5 = ((DependencyNode)localObject10).OooOO0;
          if (i5 != 0)
          {
            localObject11 = ((WidgetRun)localObject11).OooO;
            i1 = ((DependencyNode)localObject11).OooOO0;
            if (i1 != 0)
            {
              localObject11 = ((WidgetRun)localObject7).OooO0oo;
              i1 = ((DependencyNode)localObject11).OooOO0;
              if (i1 != 0)
              {
                localObject11 = ((WidgetRun)localObject7).OooO;
                i1 = ((DependencyNode)localObject11).OooOO0;
                if (i1 != 0)
                {
                  if (localObject1 != null)
                  {
                    l2 = ((Metrics)localObject1).OooOOo + l1;
                    ((Metrics)localObject1).OooOOo = l2;
                  }
                  int i21 = ((DependencyNode)localObject10).OooO0oO;
                  localLinearSystem.OooO0o((SolverVariable)localObject2, i21);
                  i21 = localConstraintWidget.OooO0o0.OooO.OooO0oO;
                  localLinearSystem.OooO0o((SolverVariable)localObject3, i21);
                  i21 = localConstraintWidget.OooO0o.OooO0oo.OooO0oO;
                  localLinearSystem.OooO0o((SolverVariable)localObject4, i21);
                  i21 = localConstraintWidget.OooO0o.OooO.OooO0oO;
                  localLinearSystem.OooO0o((SolverVariable)localObject5, i21);
                  i21 = localConstraintWidget.OooO0o.OooOO0O.OooO0oO;
                  localLinearSystem.OooO0o(localSolverVariable1, i21);
                  localObject1 = localConstraintWidget.Ooooo0o;
                  if (localObject1 != null)
                  {
                    if (i37 != 0)
                    {
                      localObject1 = localConstraintWidget.OooO0oO;
                      i21 = localObject1[0];
                      if (i21 != 0)
                      {
                        boolean bool12 = isInHorizontalChain();
                        if (!bool12)
                        {
                          localObject1 = localConstraintWidget.Ooooo0o.OoooO0O;
                          localObject1 = localLinearSystem.OooOOo0(localObject1);
                          localLinearSystem.OooO0oo((SolverVariable)localObject1, (SolverVariable)localObject3, 0, i32);
                        }
                      }
                    }
                    if (i35 != 0)
                    {
                      localObject1 = localConstraintWidget.OooO0oO;
                      i1 = 1;
                      f1 = 1.4E-45F;
                      int i22 = localObject1[i1];
                      if (i22 != 0)
                      {
                        i23 = isInVerticalChain();
                        if (i23 == 0)
                        {
                          localObject1 = localConstraintWidget.Ooooo0o.OoooO;
                          localObject1 = localLinearSystem.OooOOo0(localObject1);
                          localLinearSystem.OooO0oo((SolverVariable)localObject1, (SolverVariable)localObject5, 0, i32);
                        }
                      }
                    }
                  }
                  localConstraintWidget.OooOOOo = false;
                  localConstraintWidget.OooOOo0 = false;
                  return;
                }
              }
            }
          }
        }
      }
    }
    if (localObject1 != null)
    {
      l2 = ((Metrics)localObject1).OooOOoo + l1;
      ((Metrics)localObject1).OooOOoo = l2;
    }
    localObject1 = localConstraintWidget.Ooooo0o;
    int i38;
    int i39;
    if (localObject1 != null)
    {
      i23 = localConstraintWidget.isChainHead(0);
      if (i23 != 0)
      {
        localObject1 = (ConstraintWidgetContainer)localConstraintWidget.Ooooo0o;
        ((ConstraintWidgetContainer)localObject1).OoooOO0(localConstraintWidget, 0);
        i23 = 1;
        f4 = 1.4E-45F;
      }
      else
      {
        i23 = isInHorizontalChain();
      }
      i1 = 1;
      f1 = 1.4E-45F;
      boolean bool4 = localConstraintWidget.isChainHead(i1);
      int i2;
      if (bool4)
      {
        localObject7 = (ConstraintWidgetContainer)localConstraintWidget.Ooooo0o;
        ((ConstraintWidgetContainer)localObject7).OoooOO0(localConstraintWidget, i1);
        i2 = 1;
        f1 = 1.4E-45F;
      }
      else
      {
        i2 = isInVerticalChain();
      }
      if ((i23 == 0) && (i37 != 0))
      {
        i11 = localConstraintWidget.o0ooOO0;
        if (i11 != i32)
        {
          localObject7 = localConstraintWidget.OoooO00.OooO0o;
          if (localObject7 == null)
          {
            localObject7 = localConstraintWidget.OoooO0O.OooO0o;
            if (localObject7 == null)
            {
              localObject7 = localConstraintWidget.Ooooo0o.OoooO0O;
              localObject7 = localLinearSystem.OooOOo0(localObject7);
              i5 = 1;
              f2 = 1.4E-45F;
              localLinearSystem.OooO0oo((SolverVariable)localObject7, (SolverVariable)localObject3, 0, i5);
            }
          }
        }
      }
      if ((i2 == 0) && (i35 != 0))
      {
        i11 = localConstraintWidget.o0ooOO0;
        if (i11 != i32)
        {
          localObject7 = localConstraintWidget.OoooO0.OooO0o;
          if (localObject7 == null)
          {
            localObject7 = localConstraintWidget.OoooO.OooO0o;
            if (localObject7 == null)
            {
              localObject7 = localConstraintWidget.OoooOO0;
              if (localObject7 == null)
              {
                localObject7 = localConstraintWidget.Ooooo0o.OoooO;
                localObject7 = localLinearSystem.OooOOo0(localObject7);
                i6 = 1;
                f2 = 1.4E-45F;
                localLinearSystem.OooO0oo((SolverVariable)localObject7, (SolverVariable)localObject5, 0, i6);
              }
            }
          }
        }
      }
      i38 = i23;
      i39 = i2;
    }
    else
    {
      i39 = 0;
      i38 = 0;
    }
    int i24 = localConstraintWidget.OooooO0;
    int i3 = localConstraintWidget.o00Ooo;
    if (i24 >= i3) {
      i3 = i24;
    }
    int i11 = localConstraintWidget.OooooOO;
    int i6 = localConstraintWidget.o00o0O;
    if (i11 >= i6) {
      i6 = i11;
    }
    Object localObject10 = localConstraintWidget.Ooooo00;
    Object localObject8 = localObject10[0];
    localObject6 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
    int i40 = i3;
    if (localObject8 != localObject6)
    {
      i3 = 1;
      f1 = 1.4E-45F;
    }
    else
    {
      i3 = 0;
      f1 = 0.0F;
      localObject11 = null;
    }
    int i42 = 1;
    float f8 = 1.4E-45F;
    localObject10 = localObject10[i42];
    int i43 = i6;
    SolverVariable localSolverVariable2 = localSolverVariable1;
    Object localObject12;
    if (localObject10 != localObject6)
    {
      i6 = 1;
      f2 = 1.4E-45F;
    }
    else
    {
      i6 = 0;
      f2 = 0.0F;
      localObject12 = null;
    }
    int i45 = localConstraintWidget.Oooooo0;
    localConstraintWidget.Oooo00o = i45;
    Object localObject13 = localObject5;
    float f9 = localConstraintWidget.OooooOo;
    localConstraintWidget.Oooo0 = f9;
    Object localObject14 = localObject4;
    int i46 = localConstraintWidget.OooOo0o;
    Object localObject15 = localObject3;
    int i47 = localConstraintWidget.OooOo;
    boolean bool20 = f9 < 0.0F;
    Object localObject16 = localObject2;
    int i49;
    float f10;
    int i25;
    if (bool20)
    {
      i49 = localConstraintWidget.o0ooOO0;
      i50 = 8;
      if (i49 != i50)
      {
        if ((localObject8 == localObject6) && (i46 == 0))
        {
          i46 = 3;
          f10 = 4.203895E-045F;
        }
        if ((localObject10 == localObject6) && (i47 == 0)) {
          i47 = 3;
        }
        if ((localObject8 == localObject6) && (localObject10 == localObject6))
        {
          i49 = 3;
          if ((i46 == i49) && (i47 == i49))
          {
            localConstraintWidget.Oooo0oo(i37, i35, i3, i6);
            break label2042;
          }
        }
        else
        {
          i49 = 3;
        }
        i4 = 4;
        f1 = 5.605194E-045F;
        if ((localObject8 == localObject6) && (i46 == i49))
        {
          i7 = 0;
          f2 = 0.0F;
          localObject12 = null;
          localConstraintWidget.Oooo00o = 0;
          f4 = i11;
          f9 *= f4;
          i25 = (int)f9;
          if (localObject10 != localObject6)
          {
            i51 = i4;
            i52 = i47;
            i53 = i43;
            i50 = 0;
            localLinearSystem = null;
            i4 = i25;
            break label2086;
          }
          i4 = i25;
          i51 = i46;
          i52 = i47;
        }
        else
        {
          if ((localObject10 == localObject6) && (i47 == i49))
          {
            localConstraintWidget.Oooo00o = 1;
            i12 = -1;
            f3 = 0.0F / 0.0F;
            if (i45 == i12)
            {
              i12 = 1065353216;
              f3 = 1.0F / f9;
              localConstraintWidget.Oooo0 = f3;
            }
            f3 = localConstraintWidget.Oooo0;
            f4 = i25;
            f3 *= f4;
            i7 = (int)f3;
            if (localObject8 != localObject6)
            {
              i52 = i4;
              i53 = i7;
              i51 = i46;
              i4 = i40;
              break label2080;
            }
            i53 = i7;
            i51 = i46;
            i52 = i47;
            i4 = i40;
            break label2058;
          }
          label2042:
          i51 = i46;
          i52 = i47;
          i4 = i40;
        }
        i53 = i43;
        label2058:
        i50 = 1;
        break label2086;
      }
    }
    int i51 = i46;
    int i52 = i47;
    int i4 = i40;
    int i53 = i43;
    label2080:
    int i50 = 0;
    localLinearSystem = null;
    label2086:
    localObject1 = localConstraintWidget.OooOoO0;
    Object localObject7 = null;
    localObject1[0] = i51;
    int i12 = 1;
    f3 = 1.4E-45F;
    localObject1[i12] = i52;
    localConstraintWidget.OooO0oo = i50;
    if (i50 != 0)
    {
      i25 = localConstraintWidget.Oooo00o;
      i12 = -1;
      f3 = 0.0F / 0.0F;
      if ((i25 == 0) || (i25 == i12))
      {
        i55 = 1;
        break label2169;
      }
    }
    else
    {
      i12 = -1;
      f3 = 0.0F / 0.0F;
    }
    int i55 = 0;
    label2169:
    int i33;
    if (i50 != 0)
    {
      i25 = localConstraintWidget.Oooo00o;
      i33 = 1;
      f7 = 1.4E-45F;
      if ((i25 == i33) || (i25 == i12))
      {
        bool21 = true;
        break label2210;
      }
    }
    boolean bool21 = false;
    label2210:
    localObject1 = localConstraintWidget.Ooooo00;
    i12 = 0;
    f3 = 0.0F;
    localObject7 = null;
    localObject1 = localObject1[0];
    localObject2 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
    if (localObject1 == localObject2)
    {
      bool13 = localConstraintWidget instanceof ConstraintWidgetContainer;
      if (bool13)
      {
        i45 = 1;
        break label2266;
      }
    }
    i45 = 0;
    localSolverVariable1 = null;
    label2266:
    int i41;
    if (i45 != 0) {
      i41 = 0;
    } else {
      i41 = i4;
    }
    boolean bool13 = ((ConstraintWidget)localConstraintWidget).OoooOOo.isConnected();
    i4 = 1;
    f1 = 1.4E-45F;
    boolean bool22 = bool13 ^ true;
    localObject1 = ((ConstraintWidget)localConstraintWidget).OoooOoo;
    i12 = 0;
    f3 = 0.0F;
    localObject7 = null;
    int i44 = localObject1[0];
    int i56 = localObject1[i4];
    int i26 = ((ConstraintWidget)localConstraintWidget).OooOo00;
    int m = 2;
    int i60;
    boolean bool23;
    Object localObject22;
    int i61;
    int i48;
    boolean bool24;
    if (i26 != m)
    {
      boolean bool14 = ((ConstraintWidget)localConstraintWidget).OooOOOo;
      if (!bool14)
      {
        if (paramBoolean)
        {
          localObject1 = ((ConstraintWidget)localConstraintWidget).OooO0o0;
          if (localObject1 != null)
          {
            localObject11 = ((WidgetRun)localObject1).OooO0oo;
            boolean bool5 = ((DependencyNode)localObject11).OooOO0;
            if (bool5)
            {
              localObject1 = ((WidgetRun)localObject1).OooO;
              bool14 = ((DependencyNode)localObject1).OooOO0;
              if (bool14)
              {
                if (paramBoolean)
                {
                  int i27 = ((DependencyNode)localObject11).OooO0oO;
                  localObject3 = paramLinearSystem;
                  localObject4 = localObject16;
                  paramLinearSystem.OooO0o(localObject16, i27);
                  i27 = ((ConstraintWidget)localConstraintWidget).OooO0o0.OooO.OooO0oO;
                  localObject5 = localObject15;
                  paramLinearSystem.OooO0o(localObject15, i27);
                  localObject1 = ((ConstraintWidget)localConstraintWidget).Ooooo0o;
                  if ((localObject1 != null) && (i37 != 0))
                  {
                    localObject1 = ((ConstraintWidget)localConstraintWidget).OooO0oO;
                    i4 = 0;
                    f1 = 0.0F;
                    localObject11 = null;
                    i27 = localObject1[0];
                    if (i27 != 0)
                    {
                      boolean bool15 = isInHorizontalChain();
                      if (!bool15)
                      {
                        localObject1 = ((ConstraintWidget)localConstraintWidget).Ooooo0o.OoooO0O;
                        localObject1 = paramLinearSystem.OooOOo0(localObject1);
                        i33 = 8;
                        f7 = 1.121039E-044F;
                        paramLinearSystem.OooO0oo((SolverVariable)localObject1, localObject15, 0, i33);
                      }
                    }
                  }
                  i57 = i37;
                  f11 = f6;
                  i58 = i35;
                  f12 = f5;
                  localObject17 = localObject6;
                  localObject18 = localObject2;
                  i59 = i50;
                  localSolverVariable3 = localSolverVariable2;
                  localObject19 = localObject13;
                  localObject20 = localObject14;
                  localObject13 = localObject5;
                  localObject14 = localObject4;
                  break label3169;
                }
                localObject3 = paramLinearSystem;
                break label3121;
              }
            }
          }
        }
        localObject3 = paramLinearSystem;
        localObject5 = localObject15;
        localObject4 = localObject16;
        i33 = 8;
        f7 = 1.121039E-044F;
        localObject1 = ((ConstraintWidget)localConstraintWidget).Ooooo0o;
        if (localObject1 != null)
        {
          localObject1 = ((ConstraintWidget)localObject1).OoooO0O;
          localObject1 = paramLinearSystem.OooOOo0(localObject1);
          localObject12 = localObject1;
        }
        else
        {
          i7 = 0;
          localObject12 = null;
          f2 = 0.0F;
        }
        localObject1 = ((ConstraintWidget)localConstraintWidget).Ooooo0o;
        if (localObject1 != null)
        {
          localObject1 = ((ConstraintWidget)localObject1).OoooO00;
          localObject1 = ((LinearSystem)localObject3).OooOOo0(localObject1);
          localObject21 = localObject1;
        }
        else
        {
          i60 = 0;
          localObject21 = null;
        }
        localObject1 = ((ConstraintWidget)localConstraintWidget).OooO0oO;
        bool23 = false;
        localObject22 = null;
        i61 = localObject1[0];
        localObject1 = ((ConstraintWidget)localConstraintWidget).Ooooo00;
        localObject15 = localObject1[0];
        localObject11 = ((ConstraintWidget)localConstraintWidget).OoooO00;
        localObject7 = ((ConstraintWidget)localConstraintWidget).OoooO0O;
        Object localObject23 = localObject7;
        int i62 = ((ConstraintWidget)localConstraintWidget).Oooooo;
        int i13 = ((ConstraintWidget)localConstraintWidget).o00Ooo;
        localObject8 = ((ConstraintWidget)localConstraintWidget).Oooo0O0;
        int i63 = localObject8[0];
        f7 = ((ConstraintWidget)localConstraintWidget).o00ooo;
        i42 = 1;
        f8 = 1.4E-45F;
        localObject1 = localObject1[i42];
        int i64;
        if (localObject1 == localObject6) {
          i64 = i42;
        } else {
          i64 = 0;
        }
        i48 = ((ConstraintWidget)localConstraintWidget).OooOoO;
        int i28 = ((ConstraintWidget)localConstraintWidget).OooOoOO;
        f4 = ((ConstraintWidget)localConstraintWidget).OooOoo0;
        localObject1 = this;
        Object localObject24 = localObject11;
        localObject11 = paramLinearSystem;
        int i65 = i13;
        i13 = 1;
        f3 = 1.4E-45F;
        float f13 = f7;
        i33 = i37;
        f7 = f6;
        i57 = i37;
        f11 = f6;
        i37 = i35;
        f6 = f5;
        i58 = i35;
        f12 = f5;
        i35 = i61;
        localObject17 = localObject6;
        localObject6 = localObject21;
        localObject10 = localObject15;
        localSolverVariable3 = localSolverVariable2;
        Object localObject21 = localObject5;
        localObject19 = localObject13;
        localObject5 = localObject24;
        localObject22 = localObject4;
        localObject20 = localObject14;
        localObject4 = localObject23;
        localObject13 = localObject21;
        i47 = i62;
        localObject18 = localObject2;
        localObject14 = localObject22;
        i49 = i41;
        i59 = i50;
        i50 = i65;
        bool23 = i55;
        i61 = i64;
        i55 = i39;
        i42 = i44;
        i41 = i51;
        i44 = i52;
        bool24 = bool22;
        OooO(paramLinearSystem, i13, i33, i37, i35, (SolverVariable)localObject6, (SolverVariable)localObject12, localObject15, i45, localObject24, localObject23, i62, i49, i65, i63, f13, bool23, i64, i38, i39, i42, i51, i52, i48, i28, f4, bool22);
        break label3169;
      }
    }
    label3121:
    int i57 = i37;
    float f11 = f6;
    int i58 = i35;
    float f12 = f5;
    Object localObject17 = localObject6;
    Object localObject18 = localObject2;
    SolverVariable localSolverVariable3 = localSolverVariable2;
    Object localObject19 = localObject13;
    Object localObject20 = localObject14;
    localObject13 = localObject15;
    localObject14 = localObject16;
    int i59 = i50;
    label3169:
    int i14;
    if (paramBoolean)
    {
      localConstraintWidget = this;
      localObject1 = this.OooO0o;
      if (localObject1 != null)
      {
        localObject11 = ((WidgetRun)localObject1).OooO0oo;
        boolean bool6 = ((DependencyNode)localObject11).OooOO0;
        if (bool6)
        {
          localObject1 = ((WidgetRun)localObject1).OooO;
          boolean bool16 = ((DependencyNode)localObject1).OooOO0;
          if (bool16)
          {
            i29 = ((DependencyNode)localObject11).OooO0oO;
            localLinearSystem = paramLinearSystem;
            localObject2 = localObject20;
            paramLinearSystem.OooO0o(localObject20, i29);
            i29 = this.OooO0o.OooO.OooO0oO;
            localObject3 = localObject19;
            paramLinearSystem.OooO0o(localObject19, i29);
            i29 = this.OooO0o.OooOO0O.OooO0oO;
            localObject11 = localSolverVariable3;
            paramLinearSystem.OooO0o(localSolverVariable3, i29);
            localObject1 = this.Ooooo0o;
            if ((localObject1 != null) && (i39 == 0) && (i58 != 0))
            {
              localObject7 = this.OooO0oO;
              i46 = 1;
              f10 = 1.4E-45F;
              i14 = localObject7[i46];
              if (i14 != 0)
              {
                localObject1 = ((ConstraintWidget)localObject1).OoooO;
                localObject1 = paramLinearSystem.OooOOo0(localObject1);
                i14 = 8;
                f3 = 1.121039E-044F;
                f9 = 0.0F;
                localObject5 = null;
                paramLinearSystem.OooO0oo((SolverVariable)localObject1, localObject19, 0, i14);
              }
              else
              {
                i14 = 8;
                f3 = 1.121039E-044F;
                f9 = 0.0F;
                localObject5 = null;
              }
            }
            else
            {
              i14 = 8;
              f3 = 1.121039E-044F;
              f9 = 0.0F;
              localObject5 = null;
              i46 = 1;
              f10 = 1.4E-45F;
            }
            i7 = 0;
            localObject12 = null;
            f2 = 0.0F;
            break label3523;
          }
        }
      }
      localLinearSystem = paramLinearSystem;
      localObject11 = localSolverVariable3;
      localObject3 = localObject19;
      localObject2 = localObject20;
      i14 = 8;
      f3 = 1.121039E-044F;
      f9 = 0.0F;
      localObject5 = null;
      i46 = 1;
      f10 = 1.4E-45F;
    }
    else
    {
      i14 = 8;
      f3 = 1.121039E-044F;
      f9 = 0.0F;
      localObject5 = null;
      i46 = 1;
      f10 = 1.4E-45F;
      localConstraintWidget = this;
      localLinearSystem = paramLinearSystem;
      localObject11 = localSolverVariable3;
      localObject3 = localObject19;
      localObject2 = localObject20;
    }
    int i7 = i46;
    f2 = f10;
    label3523:
    int i29 = localConstraintWidget.OooOo0;
    int i34 = 2;
    f7 = 2.802597E-045F;
    if (i29 == i34)
    {
      i8 = 0;
      localObject6 = null;
    }
    else
    {
      i8 = i7;
    }
    label3616:
    int i30;
    if (i8 != 0)
    {
      boolean bool17 = localConstraintWidget.OooOOo0;
      if (!bool17)
      {
        localObject1 = localConstraintWidget.Ooooo00[i46];
        localObject8 = localObject18;
        if (localObject1 == localObject18)
        {
          bool17 = localConstraintWidget instanceof ConstraintWidgetContainer;
          if (bool17)
          {
            i45 = i46;
            break label3616;
          }
        }
        boolean bool19 = false;
        localSolverVariable1 = null;
        int i54;
        if (bool19) {
          i54 = 0;
        }
        localObject1 = ((ConstraintWidget)localConstraintWidget).Ooooo0o;
        if (localObject1 != null)
        {
          localObject1 = ((ConstraintWidget)localObject1).OoooO;
          localObject1 = localLinearSystem.OooOOo0(localObject1);
          localObject12 = localObject1;
        }
        else
        {
          i7 = 0;
          localObject12 = null;
          f2 = 0.0F;
        }
        localObject1 = ((ConstraintWidget)localConstraintWidget).Ooooo0o;
        if (localObject1 != null)
        {
          localObject1 = ((ConstraintWidget)localObject1).OoooO0;
          localObject1 = localLinearSystem.OooOOo0(localObject1);
          localObject6 = localObject1;
        }
        else
        {
          i8 = 0;
          localObject6 = null;
        }
        i30 = ((ConstraintWidget)localConstraintWidget).o00Oo0;
        if (i30 <= 0)
        {
          i30 = ((ConstraintWidget)localConstraintWidget).o0ooOO0;
          if (i30 != i14) {}
        }
        else
        {
          localObject1 = ((ConstraintWidget)localConstraintWidget).OoooOO0;
          localObject8 = ((ConstraintAnchor)localObject1).OooO0o;
          if (localObject8 != null)
          {
            i30 = getBaselineDistance();
            localLinearSystem.OooO0o0((SolverVariable)localObject11, (SolverVariable)localObject2, i30, i14);
            localObject1 = ((ConstraintWidget)localConstraintWidget).OoooOO0.OooO0o;
            localObject1 = localLinearSystem.OooOOo0(localObject1);
            localObject8 = ((ConstraintWidget)localConstraintWidget).OoooOO0;
            i34 = ((ConstraintAnchor)localObject8).getMargin();
            localLinearSystem.OooO0o0((SolverVariable)localObject11, (SolverVariable)localObject1, i34, i14);
            if (i58 != 0)
            {
              localObject1 = ((ConstraintWidget)localConstraintWidget).OoooO;
              localObject1 = localLinearSystem.OooOOo0(localObject1);
              i4 = 5;
              f1 = 7.006492E-045F;
              localLinearSystem.OooO0oo((SolverVariable)localObject12, (SolverVariable)localObject1, 0, i4);
            }
            bool24 = false;
            localSolverVariable2 = null;
            break label3937;
          }
          i34 = ((ConstraintWidget)localConstraintWidget).o0ooOO0;
          if (i34 == i14) {
            i30 = ((ConstraintAnchor)localObject1).getMargin();
          } else {
            i30 = getBaselineDistance();
          }
          localLinearSystem.OooO0o0((SolverVariable)localObject11, (SolverVariable)localObject2, i30, i14);
        }
        bool24 = bool22;
        label3937:
        int i36 = ((ConstraintWidget)localConstraintWidget).OooO0oO[i46];
        localObject1 = ((ConstraintWidget)localConstraintWidget).Ooooo00;
        localObject10 = localObject1[i46];
        localObject9 = ((ConstraintWidget)localConstraintWidget).OoooO0;
        localObject8 = ((ConstraintWidget)localConstraintWidget).OoooO;
        i4 = ((ConstraintWidget)localConstraintWidget).OoooooO;
        i14 = ((ConstraintWidget)localConstraintWidget).o00o0O;
        localObject5 = ((ConstraintWidget)localConstraintWidget).Oooo0O0;
        i60 = localObject5[i46];
        f9 = ((ConstraintWidget)localConstraintWidget).oo000o;
        bool23 = false;
        localObject22 = null;
        localObject1 = localObject1[0];
        localObject4 = localObject17;
        if (localObject1 == localObject17) {
          i61 = 1;
        } else {
          i61 = 0;
        }
        i48 = ((ConstraintWidget)localConstraintWidget).OooOoo;
        i30 = ((ConstraintWidget)localConstraintWidget).OooOooO;
        f4 = ((ConstraintWidget)localConstraintWidget).OooOooo;
        localObject1 = this;
        localObject11 = paramLinearSystem;
        i55 = i14;
        i14 = 0;
        f3 = 0.0F;
        localObject7 = null;
        localObject4 = localObject8;
        i34 = i58;
        f7 = f12;
        i37 = i57;
        f6 = f11;
        localObject5 = localObject9;
        localObject16 = localObject3;
        i47 = i4;
        localObject25 = localObject2;
        i49 = i54;
        i50 = i55;
        bool23 = bool21;
        i55 = i38;
        i42 = i56;
        i41 = i52;
        i44 = i51;
        OooO(paramLinearSystem, false, i58, i57, i36, (SolverVariable)localObject6, (SolverVariable)localObject12, (ConstraintWidget.DimensionBehaviour)localObject10, bool19, (ConstraintAnchor)localObject9, (ConstraintAnchor)localObject8, i4, i54, i50, i60, f9, bool21, i61, i39, i38, i56, i52, i51, i48, i30, f4, bool24);
        break label4235;
      }
    }
    localObject16 = localObject3;
    Object localObject25 = localObject2;
    label4235:
    if (i59 != 0)
    {
      i8 = 8;
      localObject12 = this;
      i30 = this.Oooo00o;
      i4 = 1;
      f1 = 1.4E-45F;
      f5 = this.Oooo0;
      if (i30 == i4)
      {
        localObject1 = paramLinearSystem;
        localObject11 = localObject16;
        localObject7 = localObject25;
        localObject8 = localObject13;
        localObject9 = localObject14;
      }
      else
      {
        i8 = 8;
        localObject1 = paramLinearSystem;
        localObject11 = localObject13;
        localObject7 = localObject14;
        localObject8 = localObject16;
        localObject9 = localObject25;
      }
      ((LinearSystem)localObject1).OooOO0O((SolverVariable)localObject11, (SolverVariable)localObject7, (SolverVariable)localObject8, (SolverVariable)localObject9, f5, i8);
    }
    else
    {
      localObject12 = this;
    }
    localObject1 = ((ConstraintWidget)localObject12).OoooOOo;
    boolean bool18 = ((ConstraintAnchor)localObject1).isConnected();
    if (bool18)
    {
      localObject1 = ((ConstraintWidget)localObject12).OoooOOo.getTarget().getOwner();
      f1 = ((ConstraintWidget)localObject12).Oooo0OO;
      f3 = 90.0F;
      double d = Math.toRadians(f1 + f3);
      f1 = (float)d;
      localObject7 = ((ConstraintWidget)localObject12).OoooOOo;
      i14 = ((ConstraintAnchor)localObject7).getMargin();
      localObject8 = paramLinearSystem;
      paramLinearSystem.OooO0O0((ConstraintWidget)localObject12, (ConstraintWidget)localObject1, f1, i14);
    }
    ((ConstraintWidget)localObject12).OooOOOo = false;
    ((ConstraintWidget)localObject12).OooOOo0 = false;
  }
  
  public boolean OooO0oo()
  {
    int i = this.o0ooOO0;
    int j = 8;
    if (i != j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public void OooOO0(ConstraintAnchor.Type paramType1, ConstraintWidget paramConstraintWidget, ConstraintAnchor.Type paramType2)
  {
    OooOO0O(paramType1, paramConstraintWidget, paramType2, 0);
  }
  
  public void OooOO0O(ConstraintAnchor.Type paramType1, ConstraintWidget paramConstraintWidget, ConstraintAnchor.Type paramType2, int paramInt)
  {
    Object localObject1 = ConstraintAnchor.Type.o00OooO;
    ConstraintAnchor localConstraintAnchor1 = null;
    Object localObject2;
    Object localObject3;
    ConstraintAnchor.Type localType1;
    Object localObject4;
    ConstraintAnchor.Type localType2;
    if (paramType1 == localObject1)
    {
      paramType1 = ConstraintAnchor.Type.o00Ooo00;
      if (paramType2 == localObject1)
      {
        paramType2 = OooOOo0(paramType1);
        localObject2 = ConstraintAnchor.Type.o00Ooo0O;
        localObject3 = OooOOo0((ConstraintAnchor.Type)localObject2);
        localType1 = ConstraintAnchor.Type.o00Ooo0;
        localObject4 = OooOOo0(localType1);
        localType2 = ConstraintAnchor.Type.o00Ooo0o;
        ConstraintAnchor localConstraintAnchor2 = OooOOo0(localType2);
        int i = 1;
        if (paramType2 != null)
        {
          bool1 = paramType2.isConnected();
          if (bool1) {}
        }
        else
        {
          if (localObject3 == null) {
            break label112;
          }
          bool1 = ((ConstraintAnchor)localObject3).isConnected();
          if (!bool1) {
            break label112;
          }
        }
        int j = 0;
        paramType1 = null;
        break label134;
        label112:
        OooOO0O(paramType1, paramConstraintWidget, paramType1, 0);
        OooOO0O((ConstraintAnchor.Type)localObject2, paramConstraintWidget, (ConstraintAnchor.Type)localObject2, 0);
        j = i;
        label134:
        if (localObject4 != null)
        {
          bool1 = ((ConstraintAnchor)localObject4).isConnected();
          if (bool1) {}
        }
        else
        {
          if (localConstraintAnchor2 == null) {
            break label174;
          }
          bool1 = localConstraintAnchor2.isConnected();
          if (!bool1) {
            break label174;
          }
        }
        i = 0;
        break label194;
        label174:
        OooOO0O(localType1, paramConstraintWidget, localType1, 0);
        OooOO0O(localType2, paramConstraintWidget, localType2, 0);
        label194:
        if ((j != 0) && (i != 0))
        {
          paramType1 = OooOOo0((ConstraintAnchor.Type)localObject1);
          paramConstraintWidget = paramConstraintWidget.OooOOo0((ConstraintAnchor.Type)localObject1);
          break label431;
        }
        if (j != 0) {}
        for (paramType1 = ConstraintAnchor.Type.o00OooOO;; paramType1 = ConstraintAnchor.Type.o00OooOo)
        {
          paramType2 = OooOOo0(paramType1);
          paramType1 = paramConstraintWidget.OooOOo0(paramType1);
          paramType2.OooO00o(paramType1, 0);
          break;
          if (i == 0) {
            break;
          }
        }
      }
      if (paramType2 != paramType1)
      {
        localObject2 = ConstraintAnchor.Type.o00Ooo0O;
        if (paramType2 != localObject2)
        {
          paramType1 = ConstraintAnchor.Type.o00Ooo0;
          if (paramType2 != paramType1)
          {
            localObject2 = ConstraintAnchor.Type.o00Ooo0o;
            if (paramType2 != localObject2) {
              return;
            }
          }
          OooOO0O(paramType1, paramConstraintWidget, paramType2, 0);
          paramType1 = ConstraintAnchor.Type.o00Ooo0o;
          break label330;
        }
      }
      OooOO0O(paramType1, paramConstraintWidget, paramType2, 0);
      paramType1 = ConstraintAnchor.Type.o00Ooo0O;
      label330:
      OooOO0O(paramType1, paramConstraintWidget, paramType2, 0);
      paramType1 = OooOOo0((ConstraintAnchor.Type)localObject1);
    }
    for (;;)
    {
      paramConstraintWidget = paramConstraintWidget.OooOOo0(paramType2);
      break label431;
      localObject3 = ConstraintAnchor.Type.o00OooOO;
      if (paramType1 == localObject3)
      {
        localType1 = ConstraintAnchor.Type.o00Ooo00;
        if (paramType2 != localType1)
        {
          localObject4 = ConstraintAnchor.Type.o00Ooo0O;
          if (paramType2 != localObject4) {}
        }
        else
        {
          paramType1 = OooOOo0(localType1);
          paramConstraintWidget = paramConstraintWidget.OooOOo0(paramType2);
          paramType2 = ConstraintAnchor.Type.o00Ooo0O;
          paramType2 = OooOOo0(paramType2);
          paramType1.OooO00o(paramConstraintWidget, 0);
          paramType2.OooO00o(paramConstraintWidget, 0);
          paramType1 = OooOOo0((ConstraintAnchor.Type)localObject3);
          label431:
          paramType1.OooO00o(paramConstraintWidget, 0);
          return;
        }
      }
      localType1 = ConstraintAnchor.Type.o00OooOo;
      if (paramType1 == localType1)
      {
        localObject4 = ConstraintAnchor.Type.o00Ooo0;
        if (paramType2 != localObject4)
        {
          localType2 = ConstraintAnchor.Type.o00Ooo0o;
          if (paramType2 != localType2) {}
        }
        else
        {
          paramType1 = paramConstraintWidget.OooOOo0(paramType2);
          OooOOo0((ConstraintAnchor.Type)localObject4).OooO00o(paramType1, 0);
          paramConstraintWidget = ConstraintAnchor.Type.o00Ooo0o;
          OooOOo0(paramConstraintWidget).OooO00o(paramType1, 0);
          paramConstraintWidget = OooOOo0(localType1);
          paramConstraintWidget.OooO00o(paramType1, 0);
          return;
        }
      }
      if ((paramType1 == localObject3) && (paramType2 == localObject3))
      {
        paramType1 = ConstraintAnchor.Type.o00Ooo00;
        localObject2 = OooOOo0(paramType1);
        paramType1 = paramConstraintWidget.OooOOo0(paramType1);
        ((ConstraintAnchor)localObject2).OooO00o(paramType1, 0);
        paramType1 = ConstraintAnchor.Type.o00Ooo0O;
        localObject2 = OooOOo0(paramType1);
        paramType1 = paramConstraintWidget.OooOOo0(paramType1);
        ((ConstraintAnchor)localObject2).OooO00o(paramType1, 0);
        paramType1 = OooOOo0((ConstraintAnchor.Type)localObject3);
      }
      else
      {
        if ((paramType1 != localType1) || (paramType2 != localType1)) {
          break;
        }
        paramType1 = ConstraintAnchor.Type.o00Ooo0;
        localObject2 = OooOOo0(paramType1);
        paramType1 = paramConstraintWidget.OooOOo0(paramType1);
        ((ConstraintAnchor)localObject2).OooO00o(paramType1, 0);
        paramType1 = ConstraintAnchor.Type.o00Ooo0o;
        localObject2 = OooOOo0(paramType1);
        paramType1 = paramConstraintWidget.OooOOo0(paramType1);
        ((ConstraintAnchor)localObject2).OooO00o(paramType1, 0);
        paramType1 = OooOOo0(localType1);
      }
    }
    localConstraintAnchor1 = OooOOo0(paramType1);
    paramConstraintWidget = paramConstraintWidget.OooOOo0(paramType2);
    boolean bool1 = localConstraintAnchor1.OooO0oO(paramConstraintWidget);
    if (bool1)
    {
      paramType2 = ConstraintAnchor.Type.o00OooO0;
      boolean bool2;
      if (paramType1 == paramType2)
      {
        paramType1 = ConstraintAnchor.Type.o00Ooo0;
        paramType1 = OooOOo0(paramType1);
        paramType2 = ConstraintAnchor.Type.o00Ooo0o;
        paramType2 = OooOOo0(paramType2);
        if (paramType1 != null) {
          paramType1.OooO0oo();
        }
        if (paramType2 == null) {
          break label909;
        }
      }
      else
      {
        localObject4 = ConstraintAnchor.Type.o00Ooo0;
        if (paramType1 == localObject4) {
          break label842;
        }
        localObject4 = ConstraintAnchor.Type.o00Ooo0o;
        if (paramType1 == localObject4) {
          break label842;
        }
        paramType2 = ConstraintAnchor.Type.o00Ooo00;
        if (paramType1 != paramType2)
        {
          paramType2 = ConstraintAnchor.Type.o00Ooo0O;
          if (paramType1 != paramType2) {
            break label909;
          }
        }
        paramType2 = OooOOo0((ConstraintAnchor.Type)localObject1);
        localObject1 = paramType2.getTarget();
        if (localObject1 != paramConstraintWidget) {
          paramType2.OooO0oo();
        }
        paramType1 = OooOOo0(paramType1).getOpposite();
        paramType2 = OooOOo0((ConstraintAnchor.Type)localObject3);
        bool2 = paramType2.isConnected();
        if (!bool2) {
          break label909;
        }
      }
      label842:
      do
      {
        paramType1.OooO0oo();
        paramType2.OooO0oo();
        break;
        paramType2 = OooOOo0(paramType2);
        if (paramType2 != null) {
          paramType2.OooO0oo();
        }
        paramType2 = OooOOo0((ConstraintAnchor.Type)localObject1);
        localObject1 = paramType2.getTarget();
        if (localObject1 != paramConstraintWidget) {
          paramType2.OooO0oo();
        }
        paramType1 = OooOOo0(paramType1).getOpposite();
        paramType2 = OooOOo0(localType1);
        bool2 = paramType2.isConnected();
      } while (bool2);
      label909:
      localConstraintAnchor1.OooO00o(paramConstraintWidget, paramInt);
    }
  }
  
  public void OooOO0o(ConstraintAnchor paramConstraintAnchor1, ConstraintAnchor paramConstraintAnchor2, int paramInt)
  {
    ConstraintWidget localConstraintWidget = paramConstraintAnchor1.getOwner();
    if (localConstraintWidget == this)
    {
      paramConstraintAnchor1 = paramConstraintAnchor1.getType();
      localConstraintWidget = paramConstraintAnchor2.getOwner();
      paramConstraintAnchor2 = paramConstraintAnchor2.getType();
      OooOO0O(paramConstraintAnchor1, localConstraintWidget, paramConstraintAnchor2, paramInt);
    }
  }
  
  public void OooOOO(ConstraintWidget paramConstraintWidget, HashMap paramHashMap)
  {
    int i = paramConstraintWidget.OooOo00;
    this.OooOo00 = i;
    i = paramConstraintWidget.OooOo0;
    this.OooOo0 = i;
    i = paramConstraintWidget.OooOo0o;
    this.OooOo0o = i;
    i = paramConstraintWidget.OooOo;
    this.OooOo = i;
    Object localObject1 = this.OooOoO0;
    Object localObject2 = paramConstraintWidget.OooOoO0;
    Object localObject3 = null;
    int i1 = localObject2[0];
    localObject1[0] = i1;
    i1 = 1;
    int i2 = localObject2[i1];
    localObject1[i1] = i2;
    i = paramConstraintWidget.OooOoO;
    this.OooOoO = i;
    i = paramConstraintWidget.OooOoOO;
    this.OooOoOO = i;
    i = paramConstraintWidget.OooOoo;
    this.OooOoo = i;
    i = paramConstraintWidget.OooOooO;
    this.OooOooO = i;
    float f1 = paramConstraintWidget.OooOooo;
    this.OooOooo = f1;
    boolean bool1 = paramConstraintWidget.Oooo000;
    this.Oooo000 = bool1;
    bool1 = paramConstraintWidget.Oooo00O;
    this.Oooo00O = bool1;
    int j = paramConstraintWidget.Oooo00o;
    this.Oooo00o = j;
    f1 = paramConstraintWidget.Oooo0;
    this.Oooo0 = f1;
    localObject1 = paramConstraintWidget.Oooo0O0;
    i2 = localObject1.length;
    localObject1 = Arrays.copyOf((int[])localObject1, i2);
    this.Oooo0O0 = ((int[])localObject1);
    f1 = paramConstraintWidget.Oooo0OO;
    this.Oooo0OO = f1;
    boolean bool2 = paramConstraintWidget.Oooo0o0;
    this.Oooo0o0 = bool2;
    bool2 = paramConstraintWidget.Oooo0o;
    this.Oooo0o = bool2;
    this.OoooO00.OooO0oo();
    this.OoooO0.OooO0oo();
    this.OoooO0O.OooO0oo();
    this.OoooO.OooO0oo();
    this.OoooOO0.OooO0oo();
    this.o000oOoO.OooO0oo();
    this.OoooOOO.OooO0oo();
    this.OoooOOo.OooO0oo();
    localObject1 = (ConstraintWidget.DimensionBehaviour[])Arrays.copyOf(this.Ooooo00, 2);
    this.Ooooo00 = ((ConstraintWidget.DimensionBehaviour[])localObject1);
    localObject1 = this.Ooooo0o;
    i2 = 0;
    localObject2 = null;
    if (localObject1 == null)
    {
      bool2 = false;
      localObject1 = null;
      f1 = 0.0F;
    }
    else
    {
      localObject1 = paramConstraintWidget.Ooooo0o;
      localObject1 = (ConstraintWidget)paramHashMap.get(localObject1);
    }
    this.Ooooo0o = ((ConstraintWidget)localObject1);
    int k = paramConstraintWidget.OooooO0;
    this.OooooO0 = k;
    k = paramConstraintWidget.OooooOO;
    this.OooooOO = k;
    f1 = paramConstraintWidget.OooooOo;
    this.OooooOo = f1;
    k = paramConstraintWidget.Oooooo0;
    this.Oooooo0 = k;
    k = paramConstraintWidget.Oooooo;
    this.Oooooo = k;
    k = paramConstraintWidget.OoooooO;
    this.OoooooO = k;
    k = paramConstraintWidget.Ooooooo;
    this.Ooooooo = k;
    k = paramConstraintWidget.o0OoOo0;
    this.o0OoOo0 = k;
    k = paramConstraintWidget.ooOO;
    this.ooOO = k;
    k = paramConstraintWidget.o00O0O;
    this.o00O0O = k;
    k = paramConstraintWidget.o00Oo0;
    this.o00Oo0 = k;
    k = paramConstraintWidget.o00Ooo;
    this.o00Ooo = k;
    k = paramConstraintWidget.o00o0O;
    this.o00o0O = k;
    f1 = paramConstraintWidget.o00ooo;
    this.o00ooo = f1;
    f1 = paramConstraintWidget.oo000o;
    this.oo000o = f1;
    localObject1 = paramConstraintWidget.o00oO0o;
    this.o00oO0o = localObject1;
    k = paramConstraintWidget.o00oO0O;
    this.o00oO0O = k;
    k = paramConstraintWidget.o0ooOO0;
    this.o0ooOO0 = k;
    boolean bool3 = paramConstraintWidget.o0ooOOo;
    this.o0ooOOo = bool3;
    localObject1 = paramConstraintWidget.o0ooOoO;
    this.o0ooOoO = ((String)localObject1);
    localObject1 = paramConstraintWidget.o0OOO0o;
    this.o0OOO0o = ((String)localObject1);
    int m = paramConstraintWidget.o0Oo0oo;
    this.o0Oo0oo = m;
    m = paramConstraintWidget.o0OO00O;
    this.o0OO00O = m;
    m = paramConstraintWidget.oo0o0Oo;
    this.oo0o0Oo = m;
    m = paramConstraintWidget.o0O0O00;
    this.o0O0O00 = m;
    boolean bool4 = paramConstraintWidget.o000OOo;
    this.o000OOo = bool4;
    bool4 = paramConstraintWidget.o000000;
    this.o000000 = bool4;
    bool4 = paramConstraintWidget.o000000O;
    this.o000000O = bool4;
    bool4 = paramConstraintWidget.o000000o;
    this.o000000o = bool4;
    bool4 = paramConstraintWidget.o00000;
    this.o00000 = bool4;
    bool4 = paramConstraintWidget.o00000O0;
    this.o00000O0 = bool4;
    int n = paramConstraintWidget.o00000OO;
    this.o00000OO = n;
    n = paramConstraintWidget.o00000Oo;
    this.o00000Oo = n;
    boolean bool5 = paramConstraintWidget.o00000o0;
    this.o00000o0 = bool5;
    bool5 = paramConstraintWidget.o0000Ooo;
    this.o0000Ooo = bool5;
    localObject1 = this.o00000oO;
    Object localObject4 = paramConstraintWidget.o00000oO;
    float f2 = localObject4[0];
    localObject1[0] = f2;
    float f3 = localObject4[i1];
    localObject1[i1] = f3;
    localObject1 = this.o00000oo;
    localObject4 = paramConstraintWidget.o00000oo;
    Object localObject5 = localObject4[0];
    localObject1[0] = localObject5;
    localObject4 = localObject4[i1];
    localObject1[i1] = localObject4;
    localObject1 = this.o0000;
    localObject4 = paramConstraintWidget.o0000;
    localObject5 = localObject4[0];
    localObject1[0] = localObject5;
    localObject3 = localObject4[i1];
    localObject1[i1] = localObject3;
    localObject1 = paramConstraintWidget.o0000O00;
    if (localObject1 == null)
    {
      bool5 = false;
      localObject1 = null;
      f1 = 0.0F;
    }
    else
    {
      localObject1 = (ConstraintWidget)paramHashMap.get(localObject1);
    }
    this.o0000O00 = ((ConstraintWidget)localObject1);
    paramConstraintWidget = paramConstraintWidget.o0000oo;
    if (paramConstraintWidget != null)
    {
      paramConstraintWidget = paramHashMap.get(paramConstraintWidget);
      localObject2 = paramConstraintWidget;
      localObject2 = (ConstraintWidget)paramConstraintWidget;
    }
    this.o0000oo = ((ConstraintWidget)localObject2);
  }
  
  public void OooOOO0(ConstraintWidget paramConstraintWidget, float paramFloat, int paramInt)
  {
    ConstraintAnchor.Type localType = ConstraintAnchor.Type.o00OooO;
    OooOoO(localType, paramConstraintWidget, localType, paramInt, 0);
    this.Oooo0OO = paramFloat;
  }
  
  public void OooOOOO(LinearSystem paramLinearSystem)
  {
    ConstraintAnchor localConstraintAnchor = this.OoooO00;
    paramLinearSystem.OooOOo0(localConstraintAnchor);
    localConstraintAnchor = this.OoooO0;
    paramLinearSystem.OooOOo0(localConstraintAnchor);
    localConstraintAnchor = this.OoooO0O;
    paramLinearSystem.OooOOo0(localConstraintAnchor);
    localConstraintAnchor = this.OoooO;
    paramLinearSystem.OooOOo0(localConstraintAnchor);
    int i = this.o00Oo0;
    if (i > 0)
    {
      localConstraintAnchor = this.OoooOO0;
      paramLinearSystem.OooOOo0(localConstraintAnchor);
    }
  }
  
  public void OooOOOo()
  {
    Object localObject = this.OooO0o0;
    if (localObject == null)
    {
      localObject = new androidx/constraintlayout/core/widgets/analyzer/HorizontalWidgetRun;
      ((HorizontalWidgetRun)localObject).<init>(this);
      this.OooO0o0 = ((HorizontalWidgetRun)localObject);
    }
    localObject = this.OooO0o;
    if (localObject == null)
    {
      localObject = new androidx/constraintlayout/core/widgets/analyzer/VerticalWidgetRun;
      ((VerticalWidgetRun)localObject).<init>(this);
      this.OooO0o = ((VerticalWidgetRun)localObject);
    }
  }
  
  public void OooOOo(StringBuilder paramStringBuilder)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("  ");
    Object localObject2 = this.OooOOOO;
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(":{\n");
    localObject1 = ((StringBuilder)localObject1).toString();
    paramStringBuilder.append((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("    actualWidth:");
    int i = this.OooooO0;
    ((StringBuilder)localObject1).append(i);
    localObject1 = ((StringBuilder)localObject1).toString();
    paramStringBuilder.append((String)localObject1);
    localObject1 = "\n";
    paramStringBuilder.append((String)localObject1);
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("    actualHeight:");
    int j = this.OooooOO;
    ((StringBuilder)localObject2).append(j);
    localObject2 = ((StringBuilder)localObject2).toString();
    paramStringBuilder.append((String)localObject2);
    paramStringBuilder.append((String)localObject1);
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("    actualLeft:");
    j = this.Oooooo;
    ((StringBuilder)localObject2).append(j);
    localObject2 = ((StringBuilder)localObject2).toString();
    paramStringBuilder.append((String)localObject2);
    paramStringBuilder.append((String)localObject1);
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("    actualTop:");
    j = this.OoooooO;
    ((StringBuilder)localObject2).append(j);
    localObject2 = ((StringBuilder)localObject2).toString();
    paramStringBuilder.append((String)localObject2);
    paramStringBuilder.append((String)localObject1);
    localObject2 = this.OoooO00;
    OooOo00(paramStringBuilder, "left", (ConstraintAnchor)localObject2);
    localObject2 = this.OoooO0;
    OooOo00(paramStringBuilder, "top", (ConstraintAnchor)localObject2);
    localObject2 = this.OoooO0O;
    OooOo00(paramStringBuilder, "right", (ConstraintAnchor)localObject2);
    localObject2 = this.OoooO;
    OooOo00(paramStringBuilder, "bottom", (ConstraintAnchor)localObject2);
    localObject2 = this.OoooOO0;
    OooOo00(paramStringBuilder, "baseline", (ConstraintAnchor)localObject2);
    localObject2 = this.o000oOoO;
    OooOo00(paramStringBuilder, "centerX", (ConstraintAnchor)localObject2);
    localObject2 = this.OoooOOO;
    OooOo00(paramStringBuilder, "centerY", (ConstraintAnchor)localObject2);
    int k = this.OooooO0;
    int m = this.o00Ooo;
    int n = this.Oooo0O0[0];
    int i1 = this.OooOO0o;
    int i2 = this.OooOoO;
    int i3 = this.OooOo0o;
    float f1 = this.OooOoo0;
    float f2 = this.o00000oO[0];
    localObject1 = this;
    localObject2 = paramStringBuilder;
    OooOOoo(paramStringBuilder, "    width", k, m, n, i1, i2, i3, f1, f2);
    k = this.OooooOO;
    m = this.o00o0O;
    localObject1 = this.Oooo0O0;
    i = 1;
    n = localObject1[i];
    i1 = this.OooOOO0;
    i2 = this.OooOoo;
    i3 = this.OooOo;
    f1 = this.OooOooo;
    f2 = this.o00000oO[i];
    localObject1 = this;
    OooOOoo(paramStringBuilder, "    height", k, m, n, i1, i2, i3, f1, f2);
    float f3 = this.OooooOo;
    i = this.Oooooo0;
    Oooo0OO(paramStringBuilder, "    dimensionRatio", f3, i);
    f3 = this.o00ooo;
    float f4 = o0000O0O;
    Oooo0(paramStringBuilder, "    horizontalBias", f3, f4);
    f3 = this.oo000o;
    f4 = o0000O0O;
    Oooo0(paramStringBuilder, "    verticalBias", f3, f4);
    i = this.o00000OO;
    Oooo0O0(paramStringBuilder, "    horizontalChainStyle", i, 0);
    i = this.o00000Oo;
    Oooo0O0(paramStringBuilder, "    verticalChainStyle", i, 0);
    paramStringBuilder.append("  }");
  }
  
  public ConstraintAnchor OooOOo0(ConstraintAnchor.Type paramType)
  {
    Object localObject = ConstraintWidget.1.OooO00o;
    int i = paramType.ordinal();
    int j = localObject[i];
    switch (j)
    {
    default: 
      localObject = new java/lang/AssertionError;
      paramType = paramType.name();
      ((AssertionError)localObject).<init>(paramType);
      throw ((Throwable)localObject);
    case 9: 
      return null;
    case 8: 
      return this.OoooOOO;
    case 7: 
      return this.o000oOoO;
    case 6: 
      return this.OoooOOo;
    case 5: 
      return this.OoooOO0;
    case 4: 
      return this.OoooO;
    case 3: 
      return this.OoooO0O;
    case 2: 
      return this.OoooO0;
    }
    return this.OoooO00;
  }
  
  public final void OooOOoo(StringBuilder paramStringBuilder, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat1, float paramFloat2)
  {
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" :  {\n");
    Oooo0O0(paramStringBuilder, "      size", paramInt1, 0);
    Oooo0O0(paramStringBuilder, "      min", paramInt2, 0);
    Oooo0O0(paramStringBuilder, "      max", paramInt3, -1 >>> 1);
    Oooo0O0(paramStringBuilder, "      matchMin", paramInt5, 0);
    Oooo0O0(paramStringBuilder, "      matchDef", paramInt6, 0);
    Oooo0(paramStringBuilder, "      matchPercent", paramFloat1, 1.0F);
    paramStringBuilder.append("    },\n");
  }
  
  public boolean OooOo()
  {
    int i = this.OooOO0o;
    int j = -1;
    if (i == j)
    {
      i = this.OooOOO0;
      if (i == j) {
        return 0;
      }
    }
    i = 1;
    return i;
  }
  
  public boolean OooOo0()
  {
    return this.Oooo0o0;
  }
  
  public final void OooOo00(StringBuilder paramStringBuilder, String paramString, ConstraintAnchor paramConstraintAnchor)
  {
    Object localObject = paramConstraintAnchor.OooO0o;
    if (localObject == null) {
      return;
    }
    localObject = "    ";
    paramStringBuilder.append((String)localObject);
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" : [ '");
    paramString = paramConstraintAnchor.OooO0o;
    paramStringBuilder.append(paramString);
    paramString = "'";
    paramStringBuilder.append(paramString);
    int i = paramConstraintAnchor.OooO0oo;
    int j = -1 << -1;
    if (i == j)
    {
      i = paramConstraintAnchor.OooO0oO;
      if (i == 0) {}
    }
    else
    {
      paramString = ",";
      paramStringBuilder.append(paramString);
      int k = paramConstraintAnchor.OooO0oO;
      paramStringBuilder.append(k);
      k = paramConstraintAnchor.OooO0oo;
      if (k != j)
      {
        paramStringBuilder.append(paramString);
        int m = paramConstraintAnchor.OooO0oo;
        paramStringBuilder.append(m);
        paramStringBuilder.append(paramString);
      }
    }
    paramStringBuilder.append(" ] ,\n");
  }
  
  public boolean OooOo0O(int paramInt)
  {
    int i = 2;
    int j = 1;
    int k;
    if (paramInt == 0)
    {
      localConstraintAnchor1 = this.OoooO00.OooO0o;
      if (localConstraintAnchor1 != null)
      {
        paramInt = j;
      }
      else
      {
        paramInt = 0;
        localConstraintAnchor1 = null;
      }
      localConstraintAnchor2 = this.OoooO0O.OooO0o;
      if (localConstraintAnchor2 != null)
      {
        k = j;
      }
      else
      {
        k = 0;
        localConstraintAnchor2 = null;
      }
      paramInt += k;
      if (paramInt >= i) {
        j = 0;
      }
      return j;
    }
    ConstraintAnchor localConstraintAnchor1 = this.OoooO0.OooO0o;
    if (localConstraintAnchor1 != null)
    {
      paramInt = j;
    }
    else
    {
      paramInt = 0;
      localConstraintAnchor1 = null;
    }
    ConstraintAnchor localConstraintAnchor2 = this.OoooO.OooO0o;
    if (localConstraintAnchor2 != null)
    {
      k = j;
    }
    else
    {
      k = 0;
      localConstraintAnchor2 = null;
    }
    paramInt += k;
    localConstraintAnchor2 = this.OoooOO0.OooO0o;
    if (localConstraintAnchor2 != null)
    {
      k = j;
    }
    else
    {
      k = 0;
      localConstraintAnchor2 = null;
    }
    paramInt += k;
    if (paramInt >= i) {
      j = 0;
    }
    return j;
  }
  
  public boolean OooOo0o()
  {
    ArrayList localArrayList = this.OoooOoO;
    int i = localArrayList.size();
    int j = 0;
    while (j < i)
    {
      ConstraintAnchor localConstraintAnchor = (ConstraintAnchor)this.OoooOoO.get(j);
      boolean bool = localConstraintAnchor.OooO0o0();
      if (bool) {
        return true;
      }
      j += 1;
    }
    return false;
  }
  
  public void OooOoO(ConstraintAnchor.Type paramType1, ConstraintWidget paramConstraintWidget, ConstraintAnchor.Type paramType2, int paramInt1, int paramInt2)
  {
    paramType1 = OooOOo0(paramType1);
    paramConstraintWidget = paramConstraintWidget.OooOOo0(paramType2);
    paramType1.OooO0O0(paramConstraintWidget, paramInt1, paramInt2, true);
  }
  
  public boolean OooOoO0(int paramInt1, int paramInt2)
  {
    boolean bool = true;
    ConstraintAnchor localConstraintAnchor1;
    int i;
    ConstraintAnchor localConstraintAnchor2;
    ConstraintAnchor localConstraintAnchor3;
    int j;
    if (paramInt1 == 0)
    {
      localConstraintAnchor1 = this.OoooO00.OooO0o;
      if (localConstraintAnchor1 != null)
      {
        paramInt1 = localConstraintAnchor1.OooO0o();
        if (paramInt1 != 0)
        {
          localConstraintAnchor1 = this.OoooO0O.OooO0o;
          if (localConstraintAnchor1 != null)
          {
            paramInt1 = localConstraintAnchor1.OooO0o();
            if (paramInt1 != 0)
            {
              localConstraintAnchor1 = this.OoooO0O.OooO0o;
              paramInt1 = localConstraintAnchor1.getFinalValue();
              i = this.OoooO0O.getMargin();
              paramInt1 -= i;
              localConstraintAnchor2 = this.OoooO00.OooO0o;
              i = localConstraintAnchor2.getFinalValue();
              localConstraintAnchor3 = this.OoooO00;
              j = localConstraintAnchor3.getMargin();
              i += j;
              paramInt1 -= i;
              if (paramInt1 < paramInt2) {
                bool = false;
              }
              return bool;
            }
          }
        }
      }
    }
    else
    {
      localConstraintAnchor1 = this.OoooO0.OooO0o;
      if (localConstraintAnchor1 != null)
      {
        paramInt1 = localConstraintAnchor1.OooO0o();
        if (paramInt1 != 0)
        {
          localConstraintAnchor1 = this.OoooO.OooO0o;
          if (localConstraintAnchor1 != null)
          {
            paramInt1 = localConstraintAnchor1.OooO0o();
            if (paramInt1 != 0)
            {
              localConstraintAnchor1 = this.OoooO.OooO0o;
              paramInt1 = localConstraintAnchor1.getFinalValue();
              i = this.OoooO.getMargin();
              paramInt1 -= i;
              localConstraintAnchor2 = this.OoooO0.OooO0o;
              i = localConstraintAnchor2.getFinalValue();
              localConstraintAnchor3 = this.OoooO0;
              j = localConstraintAnchor3.getMargin();
              i += j;
              paramInt1 -= i;
              if (paramInt1 < paramInt2) {
                bool = false;
              }
              return bool;
            }
          }
        }
      }
    }
    return false;
  }
  
  public void OooOoOO()
  {
    this.OooOOo = true;
  }
  
  public boolean OooOoo()
  {
    Object localObject1 = this.Ooooo00;
    boolean bool1 = false;
    Object localObject2 = localObject1[0];
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour = ConstraintWidget.DimensionBehaviour.o00Ooo0;
    if (localObject2 == localDimensionBehaviour)
    {
      boolean bool2 = true;
      localObject1 = localObject1[bool2];
      if (localObject1 == localDimensionBehaviour) {
        bool1 = bool2;
      }
    }
    return bool1;
  }
  
  public void OooOoo0()
  {
    this.OooOOoo = true;
  }
  
  public void OooOooO()
  {
    this.OoooO00.OooO0oo();
    this.OoooO0.OooO0oo();
    this.OoooO0O.OooO0oo();
    this.OoooO.OooO0oo();
    this.OoooOO0.OooO0oo();
    this.o000oOoO.OooO0oo();
    this.OoooOOO.OooO0oo();
    this.OoooOOo.OooO0oo();
    this.Ooooo0o = null;
    this.Oooo0OO = 0.0F;
    this.OooooO0 = 0;
    this.OooooOO = 0;
    this.OooooOo = 0.0F;
    int i = -1;
    this.Oooooo0 = i;
    this.Oooooo = 0;
    this.OoooooO = 0;
    this.ooOO = 0;
    this.o00O0O = 0;
    this.o00Oo0 = 0;
    this.o00Ooo = 0;
    this.o00o0O = 0;
    float f1 = o0000O0O;
    this.o00ooo = f1;
    this.oo000o = f1;
    ConstraintWidget.DimensionBehaviour[] arrayOfDimensionBehaviour = this.Ooooo00;
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour = ConstraintWidget.DimensionBehaviour.o00OoOoo;
    arrayOfDimensionBehaviour[0] = localDimensionBehaviour;
    boolean bool = true;
    arrayOfDimensionBehaviour[bool] = localDimensionBehaviour;
    this.o00oO0o = null;
    this.o00oO0O = 0;
    this.o0ooOO0 = 0;
    this.o0OOO0o = null;
    this.o00000 = false;
    this.o00000O0 = false;
    this.o00000OO = 0;
    this.o00000Oo = 0;
    this.o00000o0 = false;
    this.o0000Ooo = false;
    Object localObject = this.o00000oO;
    f1 = -1.0F;
    localObject[0] = f1;
    localObject[bool] = f1;
    this.OooOo00 = i;
    this.OooOo0 = i;
    localObject = this.Oooo0O0;
    int j = -1 >>> 1;
    localObject[0] = j;
    localObject[bool] = j;
    this.OooOo0o = 0;
    this.OooOo = 0;
    float f2 = 1.0F;
    this.OooOoo0 = f2;
    this.OooOooo = f2;
    this.OooOoOO = j;
    this.OooOooO = j;
    this.OooOoO = 0;
    this.OooOoo = 0;
    this.OooO0oo = false;
    this.Oooo00o = i;
    this.Oooo0 = f2;
    this.o00000O = false;
    localObject = this.OooO0oO;
    localObject[0] = bool;
    localObject[bool] = bool;
    this.Oooo0oO = false;
    localObject = this.OoooOoo;
    localObject[0] = 0;
    localObject[bool] = 0;
    this.OooO = bool;
    localObject = this.OooOoO0;
    localObject[0] = 0;
    localObject[bool] = 0;
    this.OooOO0o = i;
    this.OooOOO0 = i;
  }
  
  public void OooOooo()
  {
    Oooo000();
    float f = o0000O0O;
    setVerticalBiasPercent(f);
    f = o0000O0O;
    setHorizontalBiasPercent(f);
  }
  
  public void Oooo(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool1 = this.OooO0o0.isResolved();
    paramBoolean1 &= bool1;
    bool1 = this.OooO0o.isResolved();
    paramBoolean2 &= bool1;
    Object localObject1 = this.OooO0o0;
    Object localObject2 = ((WidgetRun)localObject1).OooO0oo;
    boolean bool3 = ((DependencyNode)localObject2).OooO0oO;
    Object localObject3 = this.OooO0o;
    DependencyNode localDependencyNode = ((WidgetRun)localObject3).OooO0oo;
    boolean bool4 = localDependencyNode.OooO0oO;
    localObject1 = ((WidgetRun)localObject1).OooO;
    boolean bool2 = ((DependencyNode)localObject1).OooO0oO;
    localObject3 = ((WidgetRun)localObject3).OooO;
    boolean bool5 = ((DependencyNode)localObject3).OooO0oO;
    boolean bool6 = bool2 - bool3;
    boolean bool7 = bool5 - bool4;
    if ((!bool6) && (!bool7))
    {
      bool6 = -1 << -1;
      if (bool3 != bool6)
      {
        bool7 = -1 >>> 1;
        if ((bool3 != bool7) && (bool4 != bool6) && (bool4 != bool7) && (bool2 != bool6) && (bool2 != bool7) && (bool5 != bool6) && (bool5 != bool7)) {
          break label201;
        }
      }
    }
    bool2 = false;
    localObject1 = null;
    bool3 = false;
    localObject2 = null;
    bool5 = false;
    localObject3 = null;
    bool4 = false;
    localDependencyNode = null;
    label201:
    bool2 -= bool3;
    bool5 -= bool4;
    if (paramBoolean1) {
      this.Oooooo = bool3;
    }
    if (paramBoolean2) {
      this.OoooooO = bool4;
    }
    int i = this.o0ooOO0;
    bool4 = true;
    if (i == bool4)
    {
      this.OooooO0 = 0;
      this.OooooOO = 0;
      return;
    }
    Object localObject4;
    if (paramBoolean1)
    {
      localObject4 = this.Ooooo00[0];
      localObject2 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
      if (localObject4 == localObject2)
      {
        paramBoolean1 = this.OooooO0;
        if (bool2 < paramBoolean1) {
          bool2 = paramBoolean1;
        }
      }
      this.OooooO0 = bool2;
      paramBoolean1 = this.o00Ooo;
      if (bool2 < paramBoolean1) {
        this.OooooO0 = paramBoolean1;
      }
    }
    if (paramBoolean2)
    {
      localObject4 = this.Ooooo00;
      paramBoolean2 = true;
      localObject4 = localObject4[paramBoolean2];
      ConstraintWidget.DimensionBehaviour localDimensionBehaviour = ConstraintWidget.DimensionBehaviour.o00OoOoo;
      if (localObject4 == localDimensionBehaviour)
      {
        paramBoolean1 = this.OooooOO;
        if (bool5 < paramBoolean1) {
          bool5 = paramBoolean1;
        }
      }
      this.OooooOO = bool5;
      paramBoolean1 = this.o00o0O;
      if (bool5 < paramBoolean1) {
        this.OooooOO = paramBoolean1;
      }
    }
  }
  
  public final void Oooo0(StringBuilder paramStringBuilder, String paramString, float paramFloat1, float paramFloat2)
  {
    boolean bool = paramFloat1 < paramFloat2;
    if (!bool) {
      return;
    }
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" :   ");
    paramStringBuilder.append(paramFloat1);
    paramStringBuilder.append(",\n");
  }
  
  public void Oooo000()
  {
    Object localObject = getParent();
    if (localObject != null)
    {
      boolean bool = localObject instanceof ConstraintWidgetContainer;
      if (bool)
      {
        localObject = (ConstraintWidgetContainer)getParent();
        bool = ((ConstraintWidgetContainer)localObject).OoooooO();
        if (bool) {
          return;
        }
      }
    }
    localObject = this.OoooOoO;
    int i = ((ArrayList)localObject).size();
    int j = 0;
    while (j < i)
    {
      ConstraintAnchor localConstraintAnchor = (ConstraintAnchor)this.OoooOoO.get(j);
      localConstraintAnchor.OooO0oo();
      j += 1;
    }
  }
  
  public void Oooo00O()
  {
    int i = 0;
    this.OooOOOo = false;
    this.OooOOo0 = false;
    this.OooOOo = false;
    this.OooOOoo = false;
    ArrayList localArrayList = this.OoooOoO;
    int j = localArrayList.size();
    while (i < j)
    {
      ConstraintAnchor localConstraintAnchor = (ConstraintAnchor)this.OoooOoO.get(i);
      localConstraintAnchor.OooO();
      i += 1;
    }
  }
  
  public void Oooo00o(Cache paramCache)
  {
    this.OoooO00.OooOO0(paramCache);
    this.OoooO0.OooOO0(paramCache);
    this.OoooO0O.OooOO0(paramCache);
    this.OoooO.OooOO0(paramCache);
    this.OoooOO0.OooOO0(paramCache);
    this.OoooOOo.OooOO0(paramCache);
    this.o000oOoO.OooOO0(paramCache);
    this.OoooOOO.OooOO0(paramCache);
  }
  
  public final void Oooo0O0(StringBuilder paramStringBuilder, String paramString, int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {
      return;
    }
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" :   ");
    paramStringBuilder.append(paramInt1);
    paramStringBuilder.append(",\n");
  }
  
  public final void Oooo0OO(StringBuilder paramStringBuilder, String paramString, float paramFloat, int paramInt)
  {
    boolean bool = paramFloat < 0.0F;
    if (!bool) {
      return;
    }
    paramStringBuilder.append(paramString);
    paramStringBuilder.append(" :  [");
    paramStringBuilder.append(paramFloat);
    paramStringBuilder.append(",");
    paramStringBuilder.append(paramInt);
    paramStringBuilder.append("");
    paramStringBuilder.append("],\n");
  }
  
  public void Oooo0o(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    this.OooOo0o = paramInt1;
    this.OooOoO = paramInt2;
    paramInt2 = -1 >>> 1;
    float f = 0.0F / 0.0F;
    if (paramInt3 == paramInt2) {
      paramInt3 = 0;
    }
    this.OooOoOO = paramInt3;
    this.OooOoo0 = paramFloat;
    f = 0.0F;
    paramInt2 = paramFloat < 0.0F;
    if (paramInt2 > 0)
    {
      f = 1.0F;
      paramInt2 = paramFloat < f;
      if ((paramInt2 < 0) && (paramInt1 == 0))
      {
        paramInt1 = 2;
        this.OooOo0o = paramInt1;
      }
    }
  }
  
  public void Oooo0o0(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt3 -= paramInt1;
    paramInt4 -= paramInt2;
    this.Oooooo = paramInt1;
    this.OoooooO = paramInt2;
    paramInt1 = this.o0ooOO0;
    paramInt2 = 8;
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour1 = null;
    if (paramInt1 == paramInt2)
    {
      this.OooooO0 = 0;
      this.OooooOO = 0;
      return;
    }
    Object localObject = this.Ooooo00;
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour2 = localObject[0];
    localDimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
    if (localDimensionBehaviour2 == localDimensionBehaviour1)
    {
      i = this.OooooO0;
      if (paramInt3 < i) {
        paramInt3 = i;
      }
    }
    int i = 1;
    localObject = localObject[i];
    if (localObject == localDimensionBehaviour1)
    {
      paramInt1 = this.OooooOO;
      if (paramInt4 < paramInt1) {
        paramInt4 = paramInt1;
      }
    }
    this.OooooO0 = paramInt3;
    this.OooooOO = paramInt4;
    paramInt1 = this.o00o0O;
    if (paramInt4 < paramInt1) {
      this.OooooOO = paramInt1;
    }
    paramInt1 = this.o00Ooo;
    if (paramInt3 < paramInt1) {
      this.OooooO0 = paramInt1;
    }
    paramInt1 = this.OooOoOO;
    if (paramInt1 > 0)
    {
      localDimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
      if (localDimensionBehaviour2 == localDimensionBehaviour1)
      {
        paramInt2 = this.OooooO0;
        paramInt1 = Math.min(paramInt2, paramInt1);
        this.OooooO0 = paramInt1;
      }
    }
    paramInt1 = this.OooOooO;
    if (paramInt1 > 0)
    {
      localDimensionBehaviour2 = this.Ooooo00[i];
      localDimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
      if (localDimensionBehaviour2 == localDimensionBehaviour1)
      {
        paramInt2 = this.OooooOO;
        paramInt1 = Math.min(paramInt2, paramInt1);
        this.OooooOO = paramInt1;
      }
    }
    paramInt1 = this.OooooO0;
    if (paramInt3 != paramInt1) {
      this.OooOO0o = paramInt1;
    }
    paramInt1 = this.OooooOO;
    if (paramInt4 != paramInt1) {
      this.OooOOO0 = paramInt1;
    }
  }
  
  public void Oooo0oO(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    this.OooOo = paramInt1;
    this.OooOoo = paramInt2;
    paramInt2 = -1 >>> 1;
    float f = 0.0F / 0.0F;
    if (paramInt3 == paramInt2) {
      paramInt3 = 0;
    }
    this.OooOooO = paramInt3;
    this.OooOooo = paramFloat;
    f = 0.0F;
    paramInt2 = paramFloat < 0.0F;
    if (paramInt2 > 0)
    {
      f = 1.0F;
      paramInt2 = paramFloat < f;
      if ((paramInt2 < 0) && (paramInt1 == 0))
      {
        paramInt1 = 2;
        this.OooOo = paramInt1;
      }
    }
  }
  
  public void Oooo0oo(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    paramBoolean1 = this.Oooo00o;
    float f1 = 1.0F;
    boolean bool1 = true;
    boolean bool2 = true;
    float f2;
    if (paramBoolean1 == bool2) {
      if ((paramBoolean3) && (!paramBoolean4))
      {
        this.Oooo00o = 0;
      }
      else if ((!paramBoolean3) && (paramBoolean4))
      {
        this.Oooo00o = bool1;
        paramBoolean1 = this.Oooooo0;
        if (paramBoolean1 == bool2)
        {
          f2 = this.Oooo0;
          f2 = f1 / f2;
          this.Oooo0 = f2;
        }
      }
    }
    paramBoolean1 = this.Oooo00o;
    ConstraintAnchor localConstraintAnchor;
    if (!paramBoolean1)
    {
      localConstraintAnchor = this.OoooO0;
      paramBoolean1 = localConstraintAnchor.isConnected();
      if (paramBoolean1)
      {
        localConstraintAnchor = this.OoooO;
        paramBoolean1 = localConstraintAnchor.isConnected();
        if (paramBoolean1) {}
      }
      else
      {
        this.Oooo00o = bool1;
        break label181;
      }
    }
    paramBoolean1 = this.Oooo00o;
    if (paramBoolean1 == bool1)
    {
      localConstraintAnchor = this.OoooO00;
      paramBoolean1 = localConstraintAnchor.isConnected();
      if (paramBoolean1)
      {
        localConstraintAnchor = this.OoooO0O;
        paramBoolean1 = localConstraintAnchor.isConnected();
        if (paramBoolean1) {}
      }
      else
      {
        this.Oooo00o = 0;
      }
    }
    label181:
    paramBoolean1 = this.Oooo00o;
    if (paramBoolean1 == bool2)
    {
      localConstraintAnchor = this.OoooO0;
      paramBoolean1 = localConstraintAnchor.isConnected();
      if (paramBoolean1)
      {
        localConstraintAnchor = this.OoooO;
        paramBoolean1 = localConstraintAnchor.isConnected();
        if (paramBoolean1)
        {
          localConstraintAnchor = this.OoooO00;
          paramBoolean1 = localConstraintAnchor.isConnected();
          if (paramBoolean1)
          {
            localConstraintAnchor = this.OoooO0O;
            paramBoolean1 = localConstraintAnchor.isConnected();
            if (paramBoolean1) {
              break label353;
            }
          }
        }
      }
      localConstraintAnchor = this.OoooO0;
      paramBoolean1 = localConstraintAnchor.isConnected();
      if (paramBoolean1)
      {
        localConstraintAnchor = this.OoooO;
        paramBoolean1 = localConstraintAnchor.isConnected();
        if (paramBoolean1)
        {
          this.Oooo00o = 0;
          break label353;
        }
      }
      localConstraintAnchor = this.OoooO00;
      paramBoolean1 = localConstraintAnchor.isConnected();
      if (paramBoolean1)
      {
        localConstraintAnchor = this.OoooO0O;
        paramBoolean1 = localConstraintAnchor.isConnected();
        if (paramBoolean1)
        {
          f2 = this.Oooo0;
          f2 = f1 / f2;
          this.Oooo0 = f2;
          this.Oooo00o = bool1;
        }
      }
    }
    label353:
    paramBoolean1 = this.Oooo00o;
    if (paramBoolean1 == bool2)
    {
      paramBoolean1 = this.OooOoO;
      if (paramBoolean1)
      {
        paramBoolean3 = this.OooOoo;
        if (!paramBoolean3)
        {
          this.Oooo00o = 0;
          return;
        }
      }
      if (!paramBoolean1)
      {
        paramBoolean1 = this.OooOoo;
        if (paramBoolean1)
        {
          f2 = this.Oooo0;
          f1 /= f2;
          this.Oooo0 = f1;
          this.Oooo00o = bool1;
        }
      }
    }
  }
  
  public void OoooO00(LinearSystem paramLinearSystem, boolean paramBoolean)
  {
    ConstraintAnchor localConstraintAnchor1 = this.OoooO00;
    boolean bool1 = paramLinearSystem.OooOo0o(localConstraintAnchor1);
    ConstraintAnchor localConstraintAnchor2 = this.OoooO0;
    boolean bool2 = paramLinearSystem.OooOo0o(localConstraintAnchor2);
    ConstraintAnchor localConstraintAnchor3 = this.OoooO0O;
    boolean bool3 = paramLinearSystem.OooOo0o(localConstraintAnchor3);
    Object localObject1 = this.OoooO;
    boolean bool4 = paramLinearSystem.OooOo0o(localObject1);
    if (paramBoolean)
    {
      localObject1 = this.OooO0o0;
      if (localObject1 != null)
      {
        DependencyNode localDependencyNode = ((WidgetRun)localObject1).OooO0oo;
        boolean bool5 = localDependencyNode.OooOO0;
        if (bool5)
        {
          localObject1 = ((WidgetRun)localObject1).OooO;
          bool5 = ((DependencyNode)localObject1).OooOO0;
          if (bool5)
          {
            bool1 = localDependencyNode.OooO0oO;
            bool3 = ((DependencyNode)localObject1).OooO0oO;
          }
        }
      }
    }
    if (paramBoolean)
    {
      Object localObject2 = this.OooO0o;
      if (localObject2 != null)
      {
        localObject1 = ((WidgetRun)localObject2).OooO0oo;
        boolean bool6 = ((DependencyNode)localObject1).OooOO0;
        if (bool6)
        {
          localObject2 = ((WidgetRun)localObject2).OooO;
          bool6 = ((DependencyNode)localObject2).OooOO0;
          if (bool6)
          {
            bool2 = ((DependencyNode)localObject1).OooO0oO;
            bool4 = ((DependencyNode)localObject2).OooO0oO;
          }
        }
      }
    }
    paramBoolean = bool3 - bool1;
    boolean bool7 = bool4 - bool2;
    if ((!paramBoolean) && (!bool7))
    {
      paramBoolean = -1 << -1;
      if (bool1 != paramBoolean)
      {
        bool7 = -1 >>> 1;
        if ((bool1 != bool7) && (bool2 != paramBoolean) && (bool2 != bool7) && (bool3 != paramBoolean) && (bool3 != bool7) && (bool4 != paramBoolean) && (bool4 != bool7)) {
          break label293;
        }
      }
    }
    bool1 = false;
    localConstraintAnchor1 = null;
    bool4 = false;
    paramLinearSystem = null;
    bool2 = false;
    localConstraintAnchor2 = null;
    bool3 = false;
    localConstraintAnchor3 = null;
    label293:
    Oooo0o0(bool1, bool2, bool3, bool4);
  }
  
  public ArrayList getAnchors()
  {
    return this.OoooOoO;
  }
  
  public int getBaselineDistance()
  {
    return this.o00Oo0;
  }
  
  public float getBiasPercent(int paramInt)
  {
    if (paramInt == 0) {
      return this.o00ooo;
    }
    int i = 1;
    if (paramInt == i) {
      return this.oo000o;
    }
    return -1.0F;
  }
  
  public int getBottom()
  {
    int i = getY();
    int j = this.OooooOO;
    return i + j;
  }
  
  public Object getCompanionWidget()
  {
    return this.o00oO0o;
  }
  
  public int getContainerItemSkip()
  {
    return this.o00oO0O;
  }
  
  public String getDebugName()
  {
    return this.o0ooOoO;
  }
  
  public ConstraintWidget.DimensionBehaviour getDimensionBehaviour(int paramInt)
  {
    if (paramInt == 0) {
      return getHorizontalDimensionBehaviour();
    }
    int i = 1;
    if (paramInt == i) {
      return getVerticalDimensionBehaviour();
    }
    return null;
  }
  
  public float getDimensionRatio()
  {
    return this.OooooOo;
  }
  
  public int getDimensionRatioSide()
  {
    return this.Oooooo0;
  }
  
  public boolean getHasBaseline()
  {
    return this.Oooo0o0;
  }
  
  public int getHeight()
  {
    int i = this.o0ooOO0;
    int j = 8;
    if (i == j) {
      return 0;
    }
    return this.OooooOO;
  }
  
  public float getHorizontalBiasPercent()
  {
    return this.o00ooo;
  }
  
  public ConstraintWidget getHorizontalChainControlWidget()
  {
    boolean bool = isInHorizontalChain();
    Object localObject1 = null;
    if (bool)
    {
      Object localObject2 = this;
      bool = false;
      Object localObject3 = null;
      while ((localObject3 == null) && (localObject2 != null))
      {
        Object localObject4 = ConstraintAnchor.Type.o00Ooo00;
        localObject4 = ((ConstraintWidget)localObject2).OooOOo0((ConstraintAnchor.Type)localObject4);
        if (localObject4 == null) {
          localObject4 = null;
        } else {
          localObject4 = ((ConstraintAnchor)localObject4).getTarget();
        }
        if (localObject4 == null) {
          localObject4 = null;
        } else {
          localObject4 = ((ConstraintAnchor)localObject4).getOwner();
        }
        Object localObject5 = getParent();
        if (localObject4 == localObject5) {
          return localObject2;
        }
        if (localObject4 == null)
        {
          localObject5 = null;
        }
        else
        {
          localObject5 = ConstraintAnchor.Type.o00Ooo0O;
          localObject5 = ((ConstraintWidget)localObject4).OooOOo0((ConstraintAnchor.Type)localObject5).getTarget();
        }
        if (localObject5 != null)
        {
          localObject5 = ((ConstraintAnchor)localObject5).getOwner();
          if (localObject5 != localObject2)
          {
            localObject3 = localObject2;
            continue;
          }
        }
        localObject2 = localObject4;
      }
      localObject1 = localObject3;
    }
    return localObject1;
  }
  
  public int getHorizontalChainStyle()
  {
    return this.o00000OO;
  }
  
  public ConstraintWidget.DimensionBehaviour getHorizontalDimensionBehaviour()
  {
    return this.Ooooo00[0];
  }
  
  public int getHorizontalMargin()
  {
    ConstraintAnchor localConstraintAnchor = this.OoooO00;
    int i = 0;
    int j;
    if (localConstraintAnchor != null)
    {
      j = localConstraintAnchor.OooO0oO;
      i = 0 + j;
    }
    localConstraintAnchor = this.OoooO0O;
    if (localConstraintAnchor != null)
    {
      j = localConstraintAnchor.OooO0oO;
      i += j;
    }
    return i;
  }
  
  public int getLastHorizontalMeasureSpec()
  {
    return this.Oooo0oo;
  }
  
  public int getLastVerticalMeasureSpec()
  {
    return this.Oooo;
  }
  
  public int getLeft()
  {
    return getX();
  }
  
  public int getLength(int paramInt)
  {
    if (paramInt == 0) {
      return getWidth();
    }
    int i = 1;
    if (paramInt == i) {
      return getHeight();
    }
    return 0;
  }
  
  public int getMaxHeight()
  {
    return this.Oooo0O0[1];
  }
  
  public int getMaxWidth()
  {
    return this.Oooo0O0[0];
  }
  
  public int getMinHeight()
  {
    return this.o00o0O;
  }
  
  public int getMinWidth()
  {
    return this.o00Ooo;
  }
  
  public ConstraintWidget getNextChainMember(int paramInt)
  {
    ConstraintAnchor localConstraintAnchor1;
    ConstraintAnchor localConstraintAnchor2;
    ConstraintAnchor localConstraintAnchor3;
    if (paramInt == 0)
    {
      localConstraintAnchor1 = this.OoooO0O;
      localConstraintAnchor2 = localConstraintAnchor1.OooO0o;
      if (localConstraintAnchor2 != null)
      {
        localConstraintAnchor3 = localConstraintAnchor2.OooO0o;
        if (localConstraintAnchor3 == localConstraintAnchor1) {
          return localConstraintAnchor2.OooO0Oo;
        }
      }
    }
    else
    {
      int i = 1;
      if (paramInt == i)
      {
        localConstraintAnchor1 = this.OoooO;
        localConstraintAnchor2 = localConstraintAnchor1.OooO0o;
        if (localConstraintAnchor2 != null)
        {
          localConstraintAnchor3 = localConstraintAnchor2.OooO0o;
          if (localConstraintAnchor3 == localConstraintAnchor1) {
            return localConstraintAnchor2.OooO0Oo;
          }
        }
      }
    }
    return null;
  }
  
  public int getOptimizerWrapHeight()
  {
    int i = this.OooooOO;
    Object localObject = this.Ooooo00;
    int j = 1;
    localObject = localObject[j];
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour = ConstraintWidget.DimensionBehaviour.o00Ooo0;
    if (localObject == localDimensionBehaviour)
    {
      int k = this.OooOo;
      if (k == j)
      {
        k = this.OooOoo;
        i = Math.max(k, i);
      }
      else
      {
        i = this.OooOoo;
        if (i > 0) {
          this.OooooOO = i;
        } else {
          i = 0;
        }
      }
      k = this.OooOooO;
      if ((k > 0) && (k < i)) {
        i = k;
      }
    }
    return i;
  }
  
  public int getOptimizerWrapWidth()
  {
    int i = this.OooooO0;
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour1 = this.Ooooo00[0];
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
    if (localDimensionBehaviour1 == localDimensionBehaviour2)
    {
      int j = this.OooOo0o;
      int k = 1;
      if (j == k)
      {
        j = this.OooOoO;
        i = Math.max(j, i);
      }
      else
      {
        i = this.OooOoO;
        if (i > 0) {
          this.OooooO0 = i;
        } else {
          i = 0;
        }
      }
      j = this.OooOoOO;
      if ((j > 0) && (j < i)) {
        i = j;
      }
    }
    return i;
  }
  
  public ConstraintWidget getParent()
  {
    return this.Ooooo0o;
  }
  
  public ConstraintWidget getPreviousChainMember(int paramInt)
  {
    ConstraintAnchor localConstraintAnchor1;
    ConstraintAnchor localConstraintAnchor2;
    ConstraintAnchor localConstraintAnchor3;
    if (paramInt == 0)
    {
      localConstraintAnchor1 = this.OoooO00;
      localConstraintAnchor2 = localConstraintAnchor1.OooO0o;
      if (localConstraintAnchor2 != null)
      {
        localConstraintAnchor3 = localConstraintAnchor2.OooO0o;
        if (localConstraintAnchor3 == localConstraintAnchor1) {
          return localConstraintAnchor2.OooO0Oo;
        }
      }
    }
    else
    {
      int i = 1;
      if (paramInt == i)
      {
        localConstraintAnchor1 = this.OoooO0;
        localConstraintAnchor2 = localConstraintAnchor1.OooO0o;
        if (localConstraintAnchor2 != null)
        {
          localConstraintAnchor3 = localConstraintAnchor2.OooO0o;
          if (localConstraintAnchor3 == localConstraintAnchor1) {
            return localConstraintAnchor2.OooO0Oo;
          }
        }
      }
    }
    return null;
  }
  
  public int getRelativePositioning(int paramInt)
  {
    if (paramInt == 0) {
      return this.Ooooooo;
    }
    int i = 1;
    if (paramInt == i) {
      return this.o0OoOo0;
    }
    return 0;
  }
  
  public int getRight()
  {
    int i = getX();
    int j = this.OooooO0;
    return i + j;
  }
  
  public int getRootX()
  {
    int i = this.Oooooo;
    int j = this.ooOO;
    return i + j;
  }
  
  public int getRootY()
  {
    int i = this.OoooooO;
    int j = this.o00O0O;
    return i + j;
  }
  
  public WidgetRun getRun(int paramInt)
  {
    if (paramInt == 0) {
      return this.OooO0o0;
    }
    int i = 1;
    if (paramInt == i) {
      return this.OooO0o;
    }
    return null;
  }
  
  public int getTop()
  {
    return getY();
  }
  
  public String getType()
  {
    return this.o0OOO0o;
  }
  
  public float getVerticalBiasPercent()
  {
    return this.oo000o;
  }
  
  public ConstraintWidget getVerticalChainControlWidget()
  {
    boolean bool = isInVerticalChain();
    Object localObject1 = null;
    if (bool)
    {
      Object localObject2 = this;
      bool = false;
      Object localObject3 = null;
      while ((localObject3 == null) && (localObject2 != null))
      {
        Object localObject4 = ConstraintAnchor.Type.o00Ooo0;
        localObject4 = ((ConstraintWidget)localObject2).OooOOo0((ConstraintAnchor.Type)localObject4);
        if (localObject4 == null) {
          localObject4 = null;
        } else {
          localObject4 = ((ConstraintAnchor)localObject4).getTarget();
        }
        if (localObject4 == null) {
          localObject4 = null;
        } else {
          localObject4 = ((ConstraintAnchor)localObject4).getOwner();
        }
        Object localObject5 = getParent();
        if (localObject4 == localObject5) {
          return localObject2;
        }
        if (localObject4 == null)
        {
          localObject5 = null;
        }
        else
        {
          localObject5 = ConstraintAnchor.Type.o00Ooo0o;
          localObject5 = ((ConstraintWidget)localObject4).OooOOo0((ConstraintAnchor.Type)localObject5).getTarget();
        }
        if (localObject5 != null)
        {
          localObject5 = ((ConstraintAnchor)localObject5).getOwner();
          if (localObject5 != localObject2)
          {
            localObject3 = localObject2;
            continue;
          }
        }
        localObject2 = localObject4;
      }
      localObject1 = localObject3;
    }
    return localObject1;
  }
  
  public int getVerticalChainStyle()
  {
    return this.o00000Oo;
  }
  
  public ConstraintWidget.DimensionBehaviour getVerticalDimensionBehaviour()
  {
    return this.Ooooo00[1];
  }
  
  public int getVerticalMargin()
  {
    ConstraintAnchor localConstraintAnchor = this.OoooO00;
    int i = 0;
    int j;
    if (localConstraintAnchor != null)
    {
      localConstraintAnchor = this.OoooO0;
      j = localConstraintAnchor.OooO0oO;
      i = 0 + j;
    }
    localConstraintAnchor = this.OoooO0O;
    if (localConstraintAnchor != null)
    {
      localConstraintAnchor = this.OoooO;
      j = localConstraintAnchor.OooO0oO;
      i += j;
    }
    return i;
  }
  
  public int getVisibility()
  {
    return this.o0ooOO0;
  }
  
  public int getWidth()
  {
    int i = this.o0ooOO0;
    int j = 8;
    if (i == j) {
      return 0;
    }
    return this.OooooO0;
  }
  
  public int getWrapBehaviorInParent()
  {
    return this.OooOo0O;
  }
  
  public int getX()
  {
    ConstraintWidget localConstraintWidget = this.Ooooo0o;
    if (localConstraintWidget != null)
    {
      boolean bool = localConstraintWidget instanceof ConstraintWidgetContainer;
      if (bool)
      {
        int j = ((ConstraintWidgetContainer)localConstraintWidget).o0000OoO;
        int i = this.Oooooo;
        return j + i;
      }
    }
    return this.Oooooo;
  }
  
  public int getY()
  {
    ConstraintWidget localConstraintWidget = this.Ooooo0o;
    if (localConstraintWidget != null)
    {
      boolean bool = localConstraintWidget instanceof ConstraintWidgetContainer;
      if (bool)
      {
        int j = ((ConstraintWidgetContainer)localConstraintWidget).o0000o0;
        int i = this.OoooooO;
        return j + i;
      }
    }
    return this.OoooooO;
  }
  
  public boolean isAnimated()
  {
    return this.o0ooOOo;
  }
  
  public boolean isHeightWrapContent()
  {
    return this.Oooo00O;
  }
  
  public boolean isHorizontalSolvingPassDone()
  {
    return this.OooOOo;
  }
  
  public boolean isInBarrier(int paramInt)
  {
    return this.OoooOoo[paramInt];
  }
  
  public boolean isInHorizontalChain()
  {
    ConstraintAnchor localConstraintAnchor1 = this.OoooO00;
    ConstraintAnchor localConstraintAnchor2 = localConstraintAnchor1.OooO0o;
    if (localConstraintAnchor2 != null)
    {
      localConstraintAnchor2 = localConstraintAnchor2.OooO0o;
      if (localConstraintAnchor2 == localConstraintAnchor1) {}
    }
    else
    {
      localConstraintAnchor1 = this.OoooO0O;
      localConstraintAnchor2 = localConstraintAnchor1.OooO0o;
      if (localConstraintAnchor2 == null) {
        break label50;
      }
      localConstraintAnchor2 = localConstraintAnchor2.OooO0o;
      if (localConstraintAnchor2 != localConstraintAnchor1) {
        break label50;
      }
    }
    return true;
    label50:
    return false;
  }
  
  public boolean isInPlaceholder()
  {
    return this.Oooo0o;
  }
  
  public boolean isInVerticalChain()
  {
    ConstraintAnchor localConstraintAnchor1 = this.OoooO0;
    ConstraintAnchor localConstraintAnchor2 = localConstraintAnchor1.OooO0o;
    if (localConstraintAnchor2 != null)
    {
      localConstraintAnchor2 = localConstraintAnchor2.OooO0o;
      if (localConstraintAnchor2 == localConstraintAnchor1) {}
    }
    else
    {
      localConstraintAnchor1 = this.OoooO;
      localConstraintAnchor2 = localConstraintAnchor1.OooO0o;
      if (localConstraintAnchor2 == null) {
        break label50;
      }
      localConstraintAnchor2 = localConstraintAnchor2.OooO0o;
      if (localConstraintAnchor2 != localConstraintAnchor1) {
        break label50;
      }
    }
    return true;
    label50:
    return false;
  }
  
  public boolean isInVirtualLayout()
  {
    return this.Oooo0oO;
  }
  
  public boolean isMeasureRequested()
  {
    boolean bool = this.OooO;
    if (bool)
    {
      i = this.o0ooOO0;
      int j = 8;
      if (i != j) {
        return 1;
      }
    }
    int i = 0;
    return i;
  }
  
  public boolean isResolvedHorizontally()
  {
    boolean bool = this.OooOOOo;
    if (!bool)
    {
      ConstraintAnchor localConstraintAnchor = this.OoooO00;
      bool = localConstraintAnchor.OooO0o();
      if (bool)
      {
        localConstraintAnchor = this.OoooO0O;
        bool = localConstraintAnchor.OooO0o();
        if (bool) {}
      }
      else
      {
        bool = false;
        localConstraintAnchor = null;
        return bool;
      }
    }
    bool = true;
    return bool;
  }
  
  public boolean isResolvedVertically()
  {
    boolean bool = this.OooOOo0;
    if (!bool)
    {
      ConstraintAnchor localConstraintAnchor = this.OoooO0;
      bool = localConstraintAnchor.OooO0o();
      if (bool)
      {
        localConstraintAnchor = this.OoooO;
        bool = localConstraintAnchor.OooO0o();
        if (bool) {}
      }
      else
      {
        bool = false;
        localConstraintAnchor = null;
        return bool;
      }
    }
    bool = true;
    return bool;
  }
  
  public boolean isRoot()
  {
    ConstraintWidget localConstraintWidget = this.Ooooo0o;
    boolean bool;
    if (localConstraintWidget == null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localConstraintWidget = null;
    }
    return bool;
  }
  
  public boolean isSpreadHeight()
  {
    int i = this.OooOo;
    if (i == 0)
    {
      float f = this.OooooOo;
      bool2 = false;
      boolean bool1 = f < 0.0F;
      if (!bool1)
      {
        int j = this.OooOoo;
        if (j == 0)
        {
          j = this.OooOooO;
          if (j == 0)
          {
            Object localObject = this.Ooooo00;
            bool2 = true;
            localObject = localObject[bool2];
            ConstraintWidget.DimensionBehaviour localDimensionBehaviour = ConstraintWidget.DimensionBehaviour.o00Ooo0;
            if (localObject == localDimensionBehaviour) {
              return bool2;
            }
          }
        }
      }
    }
    boolean bool2 = false;
    return bool2;
  }
  
  public boolean isSpreadWidth()
  {
    int i = this.OooOo0o;
    boolean bool2 = false;
    if (i == 0)
    {
      float f = this.OooooOo;
      ConstraintWidget.DimensionBehaviour localDimensionBehaviour1 = null;
      boolean bool1 = f < 0.0F;
      if (!bool1)
      {
        int j = this.OooOoO;
        if (j == 0)
        {
          j = this.OooOoOO;
          if (j == 0)
          {
            ConstraintWidget.DimensionBehaviour localDimensionBehaviour2 = this.Ooooo00[0];
            localDimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
            if (localDimensionBehaviour2 == localDimensionBehaviour1) {
              bool2 = true;
            }
          }
        }
      }
    }
    return bool2;
  }
  
  public boolean isVerticalSolvingPassDone()
  {
    return this.OooOOoo;
  }
  
  public boolean isWidthWrapContent()
  {
    return this.Oooo000;
  }
  
  public void setAnimated(boolean paramBoolean)
  {
    this.o0ooOOo = paramBoolean;
  }
  
  public void setBaselineDistance(int paramInt)
  {
    this.o00Oo0 = paramInt;
    if (paramInt > 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    this.Oooo0o0 = paramInt;
  }
  
  public void setCompanionWidget(Object paramObject)
  {
    this.o00oO0o = paramObject;
  }
  
  public void setContainerItemSkip(int paramInt)
  {
    if (paramInt < 0) {
      paramInt = 0;
    }
    this.o00oO0O = paramInt;
  }
  
  public void setDebugName(String paramString)
  {
    this.o0ooOoO = paramString;
  }
  
  public void setDimension(int paramInt1, int paramInt2)
  {
    this.OooooO0 = paramInt1;
    int i = this.o00Ooo;
    if (paramInt1 < i) {
      this.OooooO0 = i;
    }
    this.OooooOO = paramInt2;
    paramInt1 = this.o00o0O;
    if (paramInt2 < paramInt1) {
      this.OooooOO = paramInt1;
    }
  }
  
  public void setDimensionRatio(String paramString)
  {
    boolean bool1 = false;
    if (paramString != null)
    {
      int i = paramString.length();
      if (i != 0)
      {
        i = paramString.length();
        int j = paramString.indexOf(',');
        int k = 0;
        float f1 = 0.0F;
        String str1 = null;
        int m = 1;
        float f2 = 1.4E-45F;
        int n = -1;
        float f3 = 0.0F / 0.0F;
        if (j > 0)
        {
          int i1 = i + -1;
          if (j < i1)
          {
            String str2 = paramString.substring(0, j);
            String str3 = "W";
            boolean bool3 = str2.equalsIgnoreCase(str3);
            if (!bool3)
            {
              str1 = "H";
              k = str2.equalsIgnoreCase(str1);
              if (k != 0)
              {
                k = m;
                f1 = f2;
              }
              else
              {
                k = n;
                f1 = f3;
              }
            }
            j += m;
            n = k;
            f3 = f1;
            k = j;
          }
        }
        j = paramString.indexOf(':');
        String str4;
        if (j >= 0)
        {
          i -= m;
          if (j < i)
          {
            str4 = paramString.substring(k, j);
            j += m;
            paramString = paramString.substring(j);
            j = str4.length();
            if (j <= 0) {
              break label333;
            }
            j = paramString.length();
            if (j <= 0) {
              break label333;
            }
          }
        }
        float f5;
        try
        {
          float f4 = Float.parseFloat(str4);
          f5 = Float.parseFloat(paramString);
          boolean bool2 = f4 < 0.0F;
          if (!bool2) {
            break label333;
          }
          bool2 = f5 < 0.0F;
          if (!bool2) {
            break label333;
          }
          if (n == m)
          {
            f5 /= f4;
            f5 = Math.abs(f5);
          }
          else
          {
            f4 /= f5;
            f5 = Math.abs(f4);
          }
        }
        catch (NumberFormatException localNumberFormatException) {}
        paramString = paramString.substring(k);
        i = paramString.length();
        if (i > 0)
        {
          f5 = Float.parseFloat(paramString);
        }
        else
        {
          label333:
          paramString = null;
          f5 = 0.0F;
        }
        bool1 = f5 < 0.0F;
        if (bool1)
        {
          this.OooooOo = f5;
          this.Oooooo0 = n;
        }
        return;
      }
    }
    this.OooooOo = 0.0F;
  }
  
  public void setFinalBaseline(int paramInt)
  {
    boolean bool = this.Oooo0o0;
    if (!bool) {
      return;
    }
    int i = this.o00Oo0;
    i = paramInt - i;
    int j = this.OooooOO + i;
    this.OoooooO = i;
    this.OoooO0.setFinalValue(i);
    this.OoooO.setFinalValue(j);
    this.OoooOO0.setFinalValue(paramInt);
    this.OooOOo0 = true;
  }
  
  public void setFinalHorizontal(int paramInt1, int paramInt2)
  {
    boolean bool = this.OooOOOo;
    if (bool) {
      return;
    }
    this.OoooO00.setFinalValue(paramInt1);
    this.OoooO0O.setFinalValue(paramInt2);
    this.Oooooo = paramInt1;
    paramInt2 -= paramInt1;
    this.OooooO0 = paramInt2;
    this.OooOOOo = true;
  }
  
  public void setFinalLeft(int paramInt)
  {
    this.OoooO00.setFinalValue(paramInt);
    this.Oooooo = paramInt;
  }
  
  public void setFinalTop(int paramInt)
  {
    this.OoooO0.setFinalValue(paramInt);
    this.OoooooO = paramInt;
  }
  
  public void setFinalVertical(int paramInt1, int paramInt2)
  {
    boolean bool = this.OooOOo0;
    if (bool) {
      return;
    }
    this.OoooO0.setFinalValue(paramInt1);
    ConstraintAnchor localConstraintAnchor1 = this.OoooO;
    localConstraintAnchor1.setFinalValue(paramInt2);
    this.OoooooO = paramInt1;
    paramInt2 -= paramInt1;
    this.OooooOO = paramInt2;
    paramInt2 = this.Oooo0o0;
    if (paramInt2 != 0)
    {
      ConstraintAnchor localConstraintAnchor2 = this.OoooOO0;
      int i = this.o00Oo0;
      paramInt1 += i;
      localConstraintAnchor2.setFinalValue(paramInt1);
    }
    this.OooOOo0 = true;
  }
  
  public void setHasBaseline(boolean paramBoolean)
  {
    this.Oooo0o0 = paramBoolean;
  }
  
  public void setHeight(int paramInt)
  {
    this.OooooOO = paramInt;
    int i = this.o00o0O;
    if (paramInt < i) {
      this.OooooOO = i;
    }
  }
  
  public void setHeightWrapContent(boolean paramBoolean)
  {
    this.Oooo00O = paramBoolean;
  }
  
  public void setHorizontalBiasPercent(float paramFloat)
  {
    this.o00ooo = paramFloat;
  }
  
  public void setHorizontalChainStyle(int paramInt)
  {
    this.o00000OO = paramInt;
  }
  
  public void setHorizontalDimension(int paramInt1, int paramInt2)
  {
    this.Oooooo = paramInt1;
    paramInt2 -= paramInt1;
    this.OooooO0 = paramInt2;
    paramInt1 = this.o00Ooo;
    if (paramInt2 < paramInt1) {
      this.OooooO0 = paramInt1;
    }
  }
  
  public void setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour paramDimensionBehaviour)
  {
    this.Ooooo00[0] = paramDimensionBehaviour;
  }
  
  public void setHorizontalWeight(float paramFloat)
  {
    this.o00000oO[0] = paramFloat;
  }
  
  public void setInBarrier(int paramInt, boolean paramBoolean)
  {
    this.OoooOoo[paramInt] = paramBoolean;
  }
  
  public void setInPlaceholder(boolean paramBoolean)
  {
    this.Oooo0o = paramBoolean;
  }
  
  public void setInVirtualLayout(boolean paramBoolean)
  {
    this.Oooo0oO = paramBoolean;
  }
  
  public void setLastMeasureSpec(int paramInt1, int paramInt2)
  {
    this.Oooo0oo = paramInt1;
    this.Oooo = paramInt2;
    setMeasureRequested(false);
  }
  
  public void setLength(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0)
    {
      setWidth(paramInt1);
    }
    else
    {
      int i = 1;
      if (paramInt2 == i) {
        setHeight(paramInt1);
      }
    }
  }
  
  public void setMaxHeight(int paramInt)
  {
    this.Oooo0O0[1] = paramInt;
  }
  
  public void setMaxWidth(int paramInt)
  {
    this.Oooo0O0[0] = paramInt;
  }
  
  public void setMeasureRequested(boolean paramBoolean)
  {
    this.OooO = paramBoolean;
  }
  
  public void setMinHeight(int paramInt)
  {
    if (paramInt < 0) {
      paramInt = 0;
    }
    this.o00o0O = paramInt;
  }
  
  public void setMinWidth(int paramInt)
  {
    if (paramInt < 0) {
      paramInt = 0;
    }
    this.o00Ooo = paramInt;
  }
  
  public void setOffset(int paramInt1, int paramInt2)
  {
    this.ooOO = paramInt1;
    this.o00O0O = paramInt2;
  }
  
  public void setOrigin(int paramInt1, int paramInt2)
  {
    this.Oooooo = paramInt1;
    this.OoooooO = paramInt2;
  }
  
  public void setParent(ConstraintWidget paramConstraintWidget)
  {
    this.Ooooo0o = paramConstraintWidget;
  }
  
  public void setRelativePositioning(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0)
    {
      this.Ooooooo = paramInt1;
    }
    else
    {
      int i = 1;
      if (paramInt2 == i) {
        this.o0OoOo0 = paramInt1;
      }
    }
  }
  
  public void setType(String paramString)
  {
    this.o0OOO0o = paramString;
  }
  
  public void setVerticalBiasPercent(float paramFloat)
  {
    this.oo000o = paramFloat;
  }
  
  public void setVerticalChainStyle(int paramInt)
  {
    this.o00000Oo = paramInt;
  }
  
  public void setVerticalDimension(int paramInt1, int paramInt2)
  {
    this.OoooooO = paramInt1;
    paramInt2 -= paramInt1;
    this.OooooOO = paramInt2;
    paramInt1 = this.o00o0O;
    if (paramInt2 < paramInt1) {
      this.OooooOO = paramInt1;
    }
  }
  
  public void setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour paramDimensionBehaviour)
  {
    this.Ooooo00[1] = paramDimensionBehaviour;
  }
  
  public void setVerticalWeight(float paramFloat)
  {
    this.o00000oO[1] = paramFloat;
  }
  
  public void setVisibility(int paramInt)
  {
    this.o0ooOO0 = paramInt;
  }
  
  public void setWidth(int paramInt)
  {
    this.OooooO0 = paramInt;
    int i = this.o00Ooo;
    if (paramInt < i) {
      this.OooooO0 = i;
    }
  }
  
  public void setWidthWrapContent(boolean paramBoolean)
  {
    this.Oooo000 = paramBoolean;
  }
  
  public void setWrapBehaviorInParent(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = 3;
      if (paramInt <= i) {
        this.OooOo0O = paramInt;
      }
    }
  }
  
  public void setX(int paramInt)
  {
    this.Oooooo = paramInt;
  }
  
  public void setY(int paramInt)
  {
    this.OoooooO = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = this.o0OOO0o;
    String str1 = " ";
    String str2 = "";
    if (localObject != null)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("type: ");
      String str3 = this.o0OOO0o;
      ((StringBuilder)localObject).append(str3);
      ((StringBuilder)localObject).append(str1);
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = str2;
    }
    localStringBuilder.append((String)localObject);
    localObject = this.o0ooOoO;
    if (localObject != null)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("id: ");
      str2 = this.o0ooOoO;
      ((StringBuilder)localObject).append(str2);
      ((StringBuilder)localObject).append(str1);
      str2 = ((StringBuilder)localObject).toString();
    }
    localStringBuilder.append(str2);
    localStringBuilder.append("(");
    int i = this.Oooooo;
    localStringBuilder.append(i);
    localStringBuilder.append(", ");
    i = this.OoooooO;
    localStringBuilder.append(i);
    localStringBuilder.append(") - (");
    i = this.OooooO0;
    localStringBuilder.append(i);
    localStringBuilder.append(" x ");
    i = this.OooooOO;
    localStringBuilder.append(i);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.widgets.ConstraintWidget
 * JD-Core Version:    0.7.0.1
 */
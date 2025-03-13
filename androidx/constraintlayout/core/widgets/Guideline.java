package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;
import java.util.HashMap;

public class Guideline
  extends ConstraintWidget
{
  public int o0000O;
  public boolean o0000OO;
  public int o0000OO0;
  public ConstraintAnchor o0000OOO;
  public int o0000OOo;
  public boolean o0000Oo;
  public int o0000Oo0;
  public float o000OO = -1.0F;
  
  public Guideline()
  {
    int i = -1;
    this.o0000O = i;
    this.o0000OO0 = i;
    this.o0000OO = true;
    ConstraintAnchor localConstraintAnchor1 = this.OoooO0;
    this.o0000OOO = localConstraintAnchor1;
    i = 0;
    localConstraintAnchor1 = null;
    this.o0000OOo = 0;
    this.o0000Oo0 = 0;
    this.OoooOoO.clear();
    Object localObject1 = this.OoooOoO;
    Object localObject2 = this.o0000OOO;
    ((ArrayList)localObject1).add(localObject2);
    localObject1 = this.OoooOo0;
    int j = localObject1.length;
    while (i < j)
    {
      localObject2 = this.OoooOo0;
      ConstraintAnchor localConstraintAnchor2 = this.o0000OOO;
      localObject2[i] = localConstraintAnchor2;
      i += 1;
    }
  }
  
  public void OooO0oO(LinearSystem paramLinearSystem, boolean paramBoolean)
  {
    Object localObject1 = (ConstraintWidgetContainer)getParent();
    if (localObject1 == null) {
      return;
    }
    Object localObject2 = ConstraintAnchor.Type.o00Ooo00;
    localObject2 = ((ConstraintWidget)localObject1).OooOOo0((ConstraintAnchor.Type)localObject2);
    Object localObject3 = ConstraintAnchor.Type.o00Ooo0O;
    localObject3 = ((ConstraintWidget)localObject1).OooOOo0((ConstraintAnchor.Type)localObject3);
    Object localObject4 = this.Ooooo0o;
    boolean bool1 = true;
    if (localObject4 != null)
    {
      localObject4 = localObject4.Ooooo00[0];
      ConstraintWidget.DimensionBehaviour localDimensionBehaviour = ConstraintWidget.DimensionBehaviour.o00Ooo00;
      if (localObject4 == localDimensionBehaviour)
      {
        bool3 = bool1;
        break label87;
      }
    }
    boolean bool3 = false;
    localObject4 = null;
    label87:
    int j = this.o0000OOo;
    if (j == 0)
    {
      localObject2 = ConstraintAnchor.Type.o00Ooo0;
      localObject2 = ((ConstraintWidget)localObject1).OooOOo0((ConstraintAnchor.Type)localObject2);
      localObject3 = ConstraintAnchor.Type.o00Ooo0o;
      localObject3 = ((ConstraintWidget)localObject1).OooOOo0((ConstraintAnchor.Type)localObject3);
      localObject1 = this.Ooooo0o;
      if (localObject1 != null)
      {
        localObject1 = localObject1.Ooooo00[bool1];
        localObject4 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
        if (localObject1 == localObject4) {}
      }
      else
      {
        bool1 = false;
      }
      bool3 = bool1;
    }
    paramBoolean = this.o0000Oo;
    bool1 = true;
    j = 5;
    if (paramBoolean)
    {
      localObject1 = this.o0000OOO;
      paramBoolean = ((ConstraintAnchor)localObject1).OooO0o();
      if (paramBoolean)
      {
        localObject1 = this.o0000OOO;
        localObject1 = paramLinearSystem.OooOOo0(localObject1);
        ConstraintAnchor localConstraintAnchor = this.o0000OOO;
        boolean bool4 = localConstraintAnchor.getFinalValue();
        paramLinearSystem.OooO0o((SolverVariable)localObject1, bool4);
        bool4 = this.o0000O;
        if (bool4 != bool1)
        {
          if (bool3)
          {
            localObject2 = paramLinearSystem.OooOOo0(localObject3);
            paramLinearSystem.OooO0oo((SolverVariable)localObject2, (SolverVariable)localObject1, 0, j);
          }
        }
        else
        {
          boolean bool5 = this.o0000OO0;
          if ((bool5 != bool1) && (bool3))
          {
            localObject3 = paramLinearSystem.OooOOo0(localObject3);
            localObject2 = paramLinearSystem.OooOOo0(localObject2);
            paramLinearSystem.OooO0oo((SolverVariable)localObject1, (SolverVariable)localObject2, 0, j);
            paramLinearSystem.OooO0oo((SolverVariable)localObject3, (SolverVariable)localObject1, 0, j);
          }
        }
        this.o0000Oo = false;
        return;
      }
    }
    paramBoolean = this.o0000O;
    int k = 8;
    boolean bool2;
    if (paramBoolean != bool1)
    {
      localObject1 = this.o0000OOO;
      localObject1 = paramLinearSystem.OooOOo0(localObject1);
      localObject2 = paramLinearSystem.OooOOo0(localObject2);
      bool2 = this.o0000O;
      paramLinearSystem.OooO0o0((SolverVariable)localObject1, (SolverVariable)localObject2, bool2, k);
      if (bool3)
      {
        localObject2 = paramLinearSystem.OooOOo0(localObject3);
        paramLinearSystem.OooO0oo((SolverVariable)localObject2, (SolverVariable)localObject1, 0, j);
      }
    }
    else
    {
      paramBoolean = this.o0000OO0;
      if (paramBoolean != bool2)
      {
        localObject1 = this.o0000OOO;
        localObject1 = paramLinearSystem.OooOOo0(localObject1);
        localObject3 = paramLinearSystem.OooOOo0(localObject3);
        int i = -this.o0000OO0;
        paramLinearSystem.OooO0o0((SolverVariable)localObject1, (SolverVariable)localObject3, i, k);
        if (bool3)
        {
          localObject2 = paramLinearSystem.OooOOo0(localObject2);
          paramLinearSystem.OooO0oo((SolverVariable)localObject1, (SolverVariable)localObject2, 0, j);
          paramLinearSystem.OooO0oo((SolverVariable)localObject3, (SolverVariable)localObject1, 0, j);
        }
      }
      else
      {
        float f1 = this.o000OO;
        float f2 = -1.0F;
        paramBoolean = f1 < f2;
        if (paramBoolean)
        {
          localObject1 = this.o0000OOO;
          localObject1 = paramLinearSystem.OooOOo0(localObject1);
          localObject2 = paramLinearSystem.OooOOo0(localObject3);
          float f3 = this.o000OO;
          localObject1 = LinearSystem.OooOOoo(paramLinearSystem, (SolverVariable)localObject1, (SolverVariable)localObject2, f3);
          paramLinearSystem.OooO0Oo((ArrayRow)localObject1);
        }
      }
    }
  }
  
  public boolean OooO0oo()
  {
    return true;
  }
  
  public void OooOOO(ConstraintWidget paramConstraintWidget, HashMap paramHashMap)
  {
    super.OooOOO(paramConstraintWidget, paramHashMap);
    paramConstraintWidget = (Guideline)paramConstraintWidget;
    float f = paramConstraintWidget.o000OO;
    this.o000OO = f;
    int i = paramConstraintWidget.o0000O;
    this.o0000O = i;
    i = paramConstraintWidget.o0000OO0;
    this.o0000OO0 = i;
    boolean bool = paramConstraintWidget.o0000OO;
    this.o0000OO = bool;
    int j = paramConstraintWidget.o0000OOo;
    setOrientation(j);
  }
  
  public ConstraintAnchor OooOOo0(ConstraintAnchor.Type paramType)
  {
    int[] arrayOfInt = Guideline.1.OooO00o;
    int i = paramType.ordinal();
    i = arrayOfInt[i];
    int j = 1;
    if (i != j)
    {
      int k = 2;
      if (i != k)
      {
        j = 3;
        if (i != j)
        {
          j = 4;
          if (i != j) {
            break label82;
          }
        }
        i = this.o0000OOo;
        if (i != 0) {
          break label82;
        }
        return this.o0000OOO;
      }
    }
    i = this.o0000OOo;
    if (i == j) {
      return this.o0000OOO;
    }
    label82:
    return null;
  }
  
  public void OoooO00(LinearSystem paramLinearSystem, boolean paramBoolean)
  {
    Object localObject = getParent();
    if (localObject == null) {
      return;
    }
    localObject = this.o0000OOO;
    int i = paramLinearSystem.OooOo0o(localObject);
    paramBoolean = this.o0000OOo;
    boolean bool = true;
    if (paramBoolean == bool)
    {
      setX(i);
      setY(0);
      paramLinearSystem = getParent();
      i = paramLinearSystem.getHeight();
      setHeight(i);
      setWidth(0);
    }
    else
    {
      setX(0);
      setY(i);
      paramLinearSystem = getParent();
      i = paramLinearSystem.getWidth();
      setWidth(i);
      setHeight(0);
    }
  }
  
  public ConstraintAnchor getAnchor()
  {
    return this.o0000OOO;
  }
  
  public int getOrientation()
  {
    return this.o0000OOo;
  }
  
  public int getRelativeBegin()
  {
    return this.o0000O;
  }
  
  public int getRelativeBehaviour()
  {
    float f1 = this.o000OO;
    int i = -1082130432;
    float f2 = -1.0F;
    boolean bool = f1 < f2;
    if (bool) {
      return 0;
    }
    int j = this.o0000O;
    i = -1;
    f2 = 0.0F / 0.0F;
    if (j != i) {
      return 1;
    }
    j = this.o0000OO0;
    if (j != i) {
      return 2;
    }
    return i;
  }
  
  public int getRelativeEnd()
  {
    return this.o0000OO0;
  }
  
  public float getRelativePercent()
  {
    return this.o000OO;
  }
  
  public String getType()
  {
    return "Guideline";
  }
  
  public boolean isPercent()
  {
    float f1 = this.o000OO;
    int i = -1082130432;
    float f2 = -1.0F;
    boolean bool = f1 < f2;
    if (bool)
    {
      j = this.o0000O;
      i = -1;
      f2 = 0.0F / 0.0F;
      if (j == i)
      {
        j = this.o0000OO0;
        if (j == i)
        {
          j = 1;
          f1 = 1.4E-45F;
          break label65;
        }
      }
    }
    int j = 0;
    f1 = 0.0F;
    label65:
    return j;
  }
  
  public boolean isResolvedHorizontally()
  {
    return this.o0000Oo;
  }
  
  public boolean isResolvedVertically()
  {
    return this.o0000Oo;
  }
  
  public void setFinalValue(int paramInt)
  {
    this.o0000OOO.setFinalValue(paramInt);
    this.o0000Oo = true;
  }
  
  public void setGuideBegin(int paramInt)
  {
    int i = -1;
    if (paramInt > i)
    {
      float f = -1.0F;
      this.o000OO = f;
      this.o0000O = paramInt;
      this.o0000OO0 = i;
    }
  }
  
  public void setGuideEnd(int paramInt)
  {
    int i = -1;
    if (paramInt > i)
    {
      float f = -1.0F;
      this.o000OO = f;
      this.o0000O = i;
      this.o0000OO0 = paramInt;
    }
  }
  
  public void setGuidePercent(float paramFloat)
  {
    float f = -1.0F;
    boolean bool = paramFloat < f;
    if (bool)
    {
      this.o000OO = paramFloat;
      int i = -1;
      paramFloat = 0.0F / 0.0F;
      this.o0000O = i;
      this.o0000OO0 = i;
    }
  }
  
  public void setGuidePercent(int paramInt)
  {
    float f = paramInt / 100.0F;
    setGuidePercent(f);
  }
  
  public void setMinimumPosition(int paramInt)
  {
    this.o0000Oo0 = paramInt;
  }
  
  public void setOrientation(int paramInt)
  {
    int i = this.o0000OOo;
    if (i == paramInt) {
      return;
    }
    this.o0000OOo = paramInt;
    Object localObject = this.OoooOoO;
    ((ArrayList)localObject).clear();
    paramInt = this.o0000OOo;
    i = 1;
    if (paramInt == i) {
      localObject = this.OoooO00;
    } else {
      localObject = this.OoooO0;
    }
    this.o0000OOO = ((ConstraintAnchor)localObject);
    localObject = this.OoooOoO;
    ConstraintAnchor localConstraintAnchor1 = this.o0000OOO;
    ((ArrayList)localObject).add(localConstraintAnchor1);
    localObject = this.OoooOo0;
    paramInt = localObject.length;
    i = 0;
    localConstraintAnchor1 = null;
    while (i < paramInt)
    {
      ConstraintAnchor[] arrayOfConstraintAnchor = this.OoooOo0;
      ConstraintAnchor localConstraintAnchor2 = this.o0000OOO;
      arrayOfConstraintAnchor[i] = localConstraintAnchor2;
      i += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.widgets.Guideline
 * JD-Core Version:    0.7.0.1
 */
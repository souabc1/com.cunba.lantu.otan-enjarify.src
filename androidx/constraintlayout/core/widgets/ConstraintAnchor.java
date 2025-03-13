package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.SolverVariable.Type;
import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ConstraintAnchor
{
  public SolverVariable OooO;
  public HashSet OooO00o = null;
  public int OooO0O0;
  public boolean OooO0OO;
  public final ConstraintWidget OooO0Oo;
  public ConstraintAnchor OooO0o;
  public final ConstraintAnchor.Type OooO0o0;
  public int OooO0oO = 0;
  public int OooO0oo = -1 << -1;
  
  public ConstraintAnchor(ConstraintWidget paramConstraintWidget, ConstraintAnchor.Type paramType)
  {
    this.OooO0Oo = paramConstraintWidget;
    this.OooO0o0 = paramType;
  }
  
  public void OooO()
  {
    this.OooO0OO = false;
    this.OooO0O0 = 0;
  }
  
  public boolean OooO00o(ConstraintAnchor paramConstraintAnchor, int paramInt)
  {
    return OooO0O0(paramConstraintAnchor, paramInt, -1 << -1, false);
  }
  
  public boolean OooO0O0(ConstraintAnchor paramConstraintAnchor, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    boolean bool = true;
    if (paramConstraintAnchor == null)
    {
      OooO0oo();
      return bool;
    }
    if (!paramBoolean)
    {
      paramBoolean = OooO0oO(paramConstraintAnchor);
      if (!paramBoolean) {
        return false;
      }
    }
    this.OooO0o = paramConstraintAnchor;
    HashSet localHashSet = paramConstraintAnchor.OooO00o;
    if (localHashSet == null)
    {
      localHashSet = new java/util/HashSet;
      localHashSet.<init>();
      paramConstraintAnchor.OooO00o = localHashSet;
    }
    paramConstraintAnchor = this.OooO0o.OooO00o;
    if (paramConstraintAnchor != null) {
      paramConstraintAnchor.add(this);
    }
    this.OooO0oO = paramInt1;
    this.OooO0oo = paramInt2;
    return bool;
  }
  
  public void OooO0OO(int paramInt, ArrayList paramArrayList, WidgetGroup paramWidgetGroup)
  {
    Object localObject = this.OooO00o;
    if (localObject != null)
    {
      localObject = ((HashSet)localObject).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject).hasNext();
        if (!bool) {
          break;
        }
        ConstraintWidget localConstraintWidget = ((ConstraintAnchor)((Iterator)localObject).next()).OooO0Oo;
        Grouping.OooO00o(localConstraintWidget, paramInt, paramArrayList, paramWidgetGroup);
      }
    }
  }
  
  public boolean OooO0Oo()
  {
    Object localObject = this.OooO00o;
    if (localObject == null) {
      return false;
    }
    localObject = ((HashSet)localObject).iterator();
    boolean bool;
    do
    {
      bool = ((Iterator)localObject).hasNext();
      if (!bool) {
        break;
      }
      ConstraintAnchor localConstraintAnchor = ((ConstraintAnchor)((Iterator)localObject).next()).getOpposite();
      bool = localConstraintAnchor.isConnected();
    } while (!bool);
    return true;
    return false;
  }
  
  public boolean OooO0o()
  {
    return this.OooO0OO;
  }
  
  public boolean OooO0o0()
  {
    HashSet localHashSet = this.OooO00o;
    boolean bool = false;
    if (localHashSet == null) {
      return false;
    }
    int i = localHashSet.size();
    if (i > 0) {
      bool = true;
    }
    return bool;
  }
  
  public boolean OooO0oO(ConstraintAnchor paramConstraintAnchor)
  {
    int i = 0;
    String str = null;
    if (paramConstraintAnchor == null) {
      return false;
    }
    ConstraintAnchor.Type localType1 = paramConstraintAnchor.getType();
    ConstraintAnchor.Type localType2 = this.OooO0o0;
    int j = 1;
    float f = 1.4E-45F;
    boolean bool1;
    if (localType1 == localType2)
    {
      localType1 = ConstraintAnchor.Type.o00OooO0;
      if (localType2 == localType1)
      {
        paramConstraintAnchor = paramConstraintAnchor.getOwner();
        bool1 = paramConstraintAnchor.OooOo0();
        if (bool1)
        {
          paramConstraintAnchor = getOwner();
          bool1 = paramConstraintAnchor.OooOo0();
          if (bool1) {}
        }
        else
        {
          return false;
        }
      }
      return j;
    }
    int[] arrayOfInt = ConstraintAnchor.1.OooO00o;
    int k = localType2.ordinal();
    k = arrayOfInt[k];
    switch (k)
    {
    default: 
      paramConstraintAnchor = new java/lang/AssertionError;
      str = this.OooO0o0.name();
      paramConstraintAnchor.<init>(str);
      throw paramConstraintAnchor;
    case 7: 
    case 8: 
    case 9: 
      return false;
    case 6: 
      paramConstraintAnchor = ConstraintAnchor.Type.o00Ooo00;
      if (localType1 != paramConstraintAnchor)
      {
        paramConstraintAnchor = ConstraintAnchor.Type.o00Ooo0O;
        if (localType1 != paramConstraintAnchor) {
          return j;
        }
      }
      return false;
    case 4: 
    case 5: 
      localType2 = ConstraintAnchor.Type.o00Ooo0;
      if (localType1 != localType2)
      {
        localType2 = ConstraintAnchor.Type.o00Ooo0o;
        if (localType1 != localType2)
        {
          k = 0;
          localType2 = null;
          break label245;
        }
      }
      k = j;
      paramConstraintAnchor = paramConstraintAnchor.getOwner();
      bool1 = paramConstraintAnchor instanceof Guideline;
      if (bool1)
      {
        if (k == 0)
        {
          paramConstraintAnchor = ConstraintAnchor.Type.o00OooOo;
          if (localType1 != paramConstraintAnchor) {}
        }
        else
        {
          i = j;
        }
        k = i;
      }
      return k;
    case 2: 
    case 3: 
      label245:
      localType2 = ConstraintAnchor.Type.o00Ooo00;
      if (localType1 != localType2)
      {
        localType2 = ConstraintAnchor.Type.o00Ooo0O;
        if (localType1 != localType2)
        {
          bool2 = false;
          localType2 = null;
          break label325;
        }
      }
      boolean bool2 = j;
      label325:
      paramConstraintAnchor = paramConstraintAnchor.getOwner();
      bool1 = paramConstraintAnchor instanceof Guideline;
      if (bool1)
      {
        if (!bool2)
        {
          paramConstraintAnchor = ConstraintAnchor.Type.o00OooOO;
          if (localType1 != paramConstraintAnchor) {}
        }
        else
        {
          i = j;
        }
        bool2 = i;
      }
      return bool2;
    }
    paramConstraintAnchor = ConstraintAnchor.Type.o00OooO0;
    if (localType1 != paramConstraintAnchor)
    {
      paramConstraintAnchor = ConstraintAnchor.Type.o00OooOO;
      if (localType1 != paramConstraintAnchor)
      {
        paramConstraintAnchor = ConstraintAnchor.Type.o00OooOo;
        if (localType1 != paramConstraintAnchor) {
          i = j;
        }
      }
    }
    return i;
  }
  
  public void OooO0oo()
  {
    Object localObject = this.OooO0o;
    if (localObject != null)
    {
      localObject = ((ConstraintAnchor)localObject).OooO00o;
      if (localObject != null)
      {
        ((HashSet)localObject).remove(this);
        localObject = this.OooO0o.OooO00o;
        int i = ((HashSet)localObject).size();
        if (i == 0)
        {
          localObject = this.OooO0o;
          ((ConstraintAnchor)localObject).OooO00o = null;
        }
      }
    }
    this.OooO00o = null;
    this.OooO0o = null;
    this.OooO0oO = 0;
    this.OooO0oo = (-1 << -1);
    this.OooO0OO = false;
    this.OooO0O0 = 0;
  }
  
  public void OooOO0(Cache paramCache)
  {
    paramCache = this.OooO;
    if (paramCache == null)
    {
      paramCache = new androidx/constraintlayout/core/SolverVariable;
      SolverVariable.Type localType = SolverVariable.Type.o00OoOoo;
      paramCache.<init>(localType, null);
      this.OooO = paramCache;
    }
    else
    {
      paramCache.OooO0o();
    }
  }
  
  public HashSet getDependents()
  {
    return this.OooO00o;
  }
  
  public int getFinalValue()
  {
    boolean bool = this.OooO0OO;
    if (!bool) {
      return 0;
    }
    return this.OooO0O0;
  }
  
  public int getMargin()
  {
    Object localObject = this.OooO0Oo;
    int i = ((ConstraintWidget)localObject).getVisibility();
    int j = 8;
    if (i == j) {
      return 0;
    }
    i = this.OooO0oo;
    int k = -1 << -1;
    if (i != k)
    {
      localObject = this.OooO0o;
      if (localObject != null)
      {
        localObject = ((ConstraintAnchor)localObject).OooO0Oo;
        i = ((ConstraintWidget)localObject).getVisibility();
        if (i == j) {
          return this.OooO0oo;
        }
      }
    }
    return this.OooO0oO;
  }
  
  public final ConstraintAnchor getOpposite()
  {
    Object localObject1 = ConstraintAnchor.1.OooO00o;
    Object localObject2 = this.OooO0o0;
    int i = ((Enum)localObject2).ordinal();
    int j = localObject1[i];
    switch (j)
    {
    default: 
      localObject1 = new java/lang/AssertionError;
      localObject2 = this.OooO0o0.name();
      ((AssertionError)localObject1).<init>(localObject2);
      throw ((Throwable)localObject1);
    case 5: 
      return this.OooO0Oo.OoooO0;
    case 4: 
      return this.OooO0Oo.OoooO;
    case 3: 
      return this.OooO0Oo.OoooO00;
    case 2: 
      return this.OooO0Oo.OoooO0O;
    }
    return null;
  }
  
  public ConstraintWidget getOwner()
  {
    return this.OooO0Oo;
  }
  
  public SolverVariable getSolverVariable()
  {
    return this.OooO;
  }
  
  public ConstraintAnchor getTarget()
  {
    return this.OooO0o;
  }
  
  public ConstraintAnchor.Type getType()
  {
    return this.OooO0o0;
  }
  
  public boolean isConnected()
  {
    ConstraintAnchor localConstraintAnchor = this.OooO0o;
    boolean bool;
    if (localConstraintAnchor != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localConstraintAnchor = null;
    }
    return bool;
  }
  
  public boolean isSideAnchor()
  {
    Object localObject1 = ConstraintAnchor.1.OooO00o;
    Object localObject2 = this.OooO0o0;
    int i = ((Enum)localObject2).ordinal();
    int j = localObject1[i];
    switch (j)
    {
    default: 
      localObject1 = new java/lang/AssertionError;
      localObject2 = this.OooO0o0.name();
      ((AssertionError)localObject1).<init>(localObject2);
      throw ((Throwable)localObject1);
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      return true;
    }
    return false;
  }
  
  public boolean isVerticalAnchor()
  {
    Object localObject1 = ConstraintAnchor.1.OooO00o;
    Object localObject2 = this.OooO0o0;
    int i = ((Enum)localObject2).ordinal();
    int j = localObject1[i];
    switch (j)
    {
    default: 
      localObject1 = new java/lang/AssertionError;
      localObject2 = this.OooO0o0.name();
      ((AssertionError)localObject1).<init>(localObject2);
      throw ((Throwable)localObject1);
    case 4: 
    case 5: 
    case 6: 
    case 8: 
    case 9: 
      return true;
    }
    return false;
  }
  
  public void setFinalValue(int paramInt)
  {
    this.OooO0O0 = paramInt;
    this.OooO0OO = true;
  }
  
  public void setGoneMargin(int paramInt)
  {
    boolean bool = isConnected();
    if (bool) {
      this.OooO0oo = paramInt;
    }
  }
  
  public void setMargin(int paramInt)
  {
    boolean bool = isConnected();
    if (bool) {
      this.OooO0oO = paramInt;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = this.OooO0Oo.getDebugName();
    localStringBuilder.append(str);
    localStringBuilder.append(":");
    str = this.OooO0o0.toString();
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.widgets.ConstraintAnchor
 * JD-Core Version:    0.7.0.1
 */
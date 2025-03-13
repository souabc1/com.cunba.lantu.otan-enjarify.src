package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.Chain;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

public class WidgetGroup
{
  public static int OooO0oO;
  public ArrayList OooO00o;
  public int OooO0O0;
  public boolean OooO0OO;
  public int OooO0Oo;
  public int OooO0o;
  public ArrayList OooO0o0;
  
  public WidgetGroup(int paramInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO00o = localArrayList;
    this.OooO0OO = false;
    this.OooO0o0 = null;
    this.OooO0o = -1;
    int i = OooO0oO;
    OooO0oO = i + 1;
    this.OooO0O0 = i;
    this.OooO0Oo = paramInt;
  }
  
  private String getOrientationString()
  {
    int i = this.OooO0Oo;
    if (i == 0) {
      return "Horizontal";
    }
    int j = 1;
    if (i == j) {
      return "Vertical";
    }
    j = 2;
    if (i == j) {
      return "Both";
    }
    return "Unknown";
  }
  
  public boolean OooO00o(ConstraintWidget paramConstraintWidget)
  {
    ArrayList localArrayList = this.OooO00o;
    boolean bool = localArrayList.contains(paramConstraintWidget);
    if (bool) {
      return false;
    }
    this.OooO00o.add(paramConstraintWidget);
    return true;
  }
  
  public void OooO0O0(ArrayList paramArrayList)
  {
    ArrayList localArrayList = this.OooO00o;
    int i = localArrayList.size();
    int j = this.OooO0o;
    int k = -1;
    if ((j != k) && (i > 0))
    {
      j = 0;
      for (;;)
      {
        k = paramArrayList.size();
        if (j >= k) {
          break;
        }
        WidgetGroup localWidgetGroup = (WidgetGroup)paramArrayList.get(j);
        int m = this.OooO0o;
        int n = localWidgetGroup.OooO0O0;
        if (m == n)
        {
          m = this.OooO0Oo;
          OooO0Oo(m, localWidgetGroup);
        }
        j += 1;
      }
    }
    if (i == 0) {
      paramArrayList.remove(this);
    }
  }
  
  public int OooO0OO(LinearSystem paramLinearSystem, int paramInt)
  {
    ArrayList localArrayList = this.OooO00o;
    int i = localArrayList.size();
    if (i == 0) {
      return 0;
    }
    localArrayList = this.OooO00o;
    return OooO0o0(paramLinearSystem, localArrayList, paramInt);
  }
  
  public void OooO0Oo(int paramInt, WidgetGroup paramWidgetGroup)
  {
    Iterator localIterator = this.OooO00o.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      ConstraintWidget localConstraintWidget = (ConstraintWidget)localIterator.next();
      paramWidgetGroup.OooO00o(localConstraintWidget);
      int i = paramWidgetGroup.getId();
      if (paramInt == 0) {
        localConstraintWidget.o0000oO = i;
      } else {
        localConstraintWidget.o0000O0 = i;
      }
    }
    paramInt = paramWidgetGroup.OooO0O0;
    this.OooO0o = paramInt;
  }
  
  public final int OooO0o0(LinearSystem paramLinearSystem, ArrayList paramArrayList, int paramInt)
  {
    int i = 0;
    ConstraintWidgetContainer localConstraintWidgetContainer = (ConstraintWidgetContainer)((ConstraintWidget)paramArrayList.get(0)).getParent();
    paramLinearSystem.OooOoo();
    localConstraintWidgetContainer.OooO0oO(paramLinearSystem, false);
    int j = 0;
    Object localObject1 = null;
    int k;
    Object localObject3;
    for (;;)
    {
      k = paramArrayList.size();
      if (j >= k) {
        break;
      }
      localObject3 = (ConstraintWidget)paramArrayList.get(j);
      ((ConstraintWidget)localObject3).OooO0oO(paramLinearSystem, false);
      j += 1;
    }
    if (paramInt == 0)
    {
      j = localConstraintWidgetContainer.o0000o;
      if (j > 0) {
        Chain.OooO0O0(localConstraintWidgetContainer, paramLinearSystem, paramArrayList, 0);
      }
    }
    j = 1;
    if (paramInt == j)
    {
      k = localConstraintWidgetContainer.o0000oO0;
      if (k > 0) {
        Chain.OooO0O0(localConstraintWidgetContainer, paramLinearSystem, paramArrayList, j);
      }
    }
    try
    {
      paramLinearSystem.OooOoO0();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    Object localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    this.OooO0o0 = ((ArrayList)localObject2);
    for (;;)
    {
      j = paramArrayList.size();
      if (i >= j) {
        break;
      }
      localObject2 = (ConstraintWidget)paramArrayList.get(i);
      localObject3 = new androidx/constraintlayout/core/widgets/analyzer/WidgetGroup$MeasureResult;
      ((WidgetGroup.MeasureResult)localObject3).<init>(this, (ConstraintWidget)localObject2, paramLinearSystem, paramInt);
      localObject2 = this.OooO0o0;
      ((ArrayList)localObject2).add(localObject3);
      i += 1;
    }
    int m;
    if (paramInt == 0)
    {
      paramArrayList = localConstraintWidgetContainer.OoooO00;
      m = paramLinearSystem.OooOo0o(paramArrayList);
    }
    for (ConstraintAnchor localConstraintAnchor = localConstraintWidgetContainer.OoooO0O;; localConstraintAnchor = localConstraintWidgetContainer.OoooO)
    {
      paramInt = paramLinearSystem.OooOo0o(localConstraintAnchor);
      paramLinearSystem.OooOoo();
      return paramInt - m;
      paramArrayList = localConstraintWidgetContainer.OoooO0;
      m = paramLinearSystem.OooOo0o(paramArrayList);
    }
  }
  
  public int getId()
  {
    return this.OooO0O0;
  }
  
  public int getOrientation()
  {
    return this.OooO0Oo;
  }
  
  public boolean isAuthoritative()
  {
    return this.OooO0OO;
  }
  
  public void setAuthoritative(boolean paramBoolean)
  {
    this.OooO0OO = paramBoolean;
  }
  
  public void setOrientation(int paramInt)
  {
    this.OooO0Oo = paramInt;
  }
  
  public String toString()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = getOrientationString();
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(" [");
    int i = this.OooO0O0;
    ((StringBuilder)localObject1).append(i);
    ((StringBuilder)localObject1).append("] <");
    localObject1 = ((StringBuilder)localObject1).toString();
    localObject2 = this.OooO00o.iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      ConstraintWidget localConstraintWidget = (ConstraintWidget)((Iterator)localObject2).next();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append(" ");
      localObject1 = localConstraintWidget.getDebugName();
      localStringBuilder.append((String)localObject1);
      localObject1 = localStringBuilder.toString();
    }
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append((String)localObject1);
    ((StringBuilder)localObject2).append(" >");
    return ((StringBuilder)localObject2).toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.widgets.analyzer.WidgetGroup
 * JD-Core Version:    0.7.0.1
 */
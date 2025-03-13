package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import java.util.ArrayList;

public class WidgetContainer
  extends ConstraintWidget
{
  public ArrayList o000OO;
  
  public WidgetContainer()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.o000OO = localArrayList;
  }
  
  public void OooO0O0(ConstraintWidget paramConstraintWidget)
  {
    this.o000OO.add(paramConstraintWidget);
    Object localObject = paramConstraintWidget.getParent();
    if (localObject != null)
    {
      localObject = (WidgetContainer)paramConstraintWidget.getParent();
      ((WidgetContainer)localObject).OoooO0O(paramConstraintWidget);
    }
    paramConstraintWidget.setParent(this);
  }
  
  public void OooOooO()
  {
    this.o000OO.clear();
    super.OooOooO();
  }
  
  public void Oooo00o(Cache paramCache)
  {
    super.Oooo00o(paramCache);
    ArrayList localArrayList = this.o000OO;
    int i = localArrayList.size();
    int j = 0;
    while (j < i)
    {
      ConstraintWidget localConstraintWidget = (ConstraintWidget)this.o000OO.get(j);
      localConstraintWidget.Oooo00o(paramCache);
      j += 1;
    }
  }
  
  public void OoooO()
  {
    this.o000OO.clear();
  }
  
  public void OoooO0()
  {
    ArrayList localArrayList = this.o000OO;
    if (localArrayList == null) {
      return;
    }
    int i = localArrayList.size();
    int j = 0;
    while (j < i)
    {
      Object localObject = (ConstraintWidget)this.o000OO.get(j);
      boolean bool = localObject instanceof WidgetContainer;
      if (bool)
      {
        localObject = (WidgetContainer)localObject;
        ((WidgetContainer)localObject).OoooO0();
      }
      j += 1;
    }
  }
  
  public void OoooO0O(ConstraintWidget paramConstraintWidget)
  {
    this.o000OO.remove(paramConstraintWidget);
    paramConstraintWidget.OooOooO();
  }
  
  public ArrayList getChildren()
  {
    return this.o000OO;
  }
  
  public ConstraintWidgetContainer getRootConstraintContainer()
  {
    Object localObject1 = getParent();
    boolean bool1 = this instanceof ConstraintWidgetContainer;
    Object localObject2;
    if (bool1)
    {
      localObject2 = this;
      localObject2 = (ConstraintWidgetContainer)this;
    }
    else
    {
      bool1 = false;
      localObject2 = null;
    }
    while (localObject1 != null)
    {
      ConstraintWidget localConstraintWidget = ((ConstraintWidget)localObject1).getParent();
      boolean bool2 = localObject1 instanceof ConstraintWidgetContainer;
      if (bool2)
      {
        localObject2 = localObject1;
        localObject2 = (ConstraintWidgetContainer)localObject1;
      }
      localObject1 = localConstraintWidget;
    }
    return localObject2;
  }
  
  public void setOffset(int paramInt1, int paramInt2)
  {
    super.setOffset(paramInt1, paramInt2);
    ArrayList localArrayList = this.o000OO;
    paramInt1 = localArrayList.size();
    paramInt2 = 0;
    while (paramInt2 < paramInt1)
    {
      ConstraintWidget localConstraintWidget = (ConstraintWidget)this.o000OO.get(paramInt2);
      int i = getRootX();
      int j = getRootY();
      localConstraintWidget.setOffset(i, j);
      paramInt2 += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.widgets.WidgetContainer
 * JD-Core Version:    0.7.0.1
 */
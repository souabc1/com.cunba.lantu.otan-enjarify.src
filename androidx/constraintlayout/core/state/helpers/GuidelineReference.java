package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.Reference;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;

public class GuidelineReference
  implements Facade, Reference
{
  public int OooO00o;
  public Guideline OooO0O0;
  public Object OooO0OO;
  
  public ConstraintWidget getConstraintWidget()
  {
    Guideline localGuideline = this.OooO0O0;
    if (localGuideline == null)
    {
      localGuideline = new androidx/constraintlayout/core/widgets/Guideline;
      localGuideline.<init>();
      this.OooO0O0 = localGuideline;
    }
    return this.OooO0O0;
  }
  
  public Facade getFacade()
  {
    return null;
  }
  
  public Object getKey()
  {
    return this.OooO0OO;
  }
  
  public int getOrientation()
  {
    return this.OooO00o;
  }
  
  public void setConstraintWidget(ConstraintWidget paramConstraintWidget)
  {
    boolean bool = paramConstraintWidget instanceof Guideline;
    if (bool) {
      paramConstraintWidget = (Guideline)paramConstraintWidget;
    } else {
      paramConstraintWidget = null;
    }
    this.OooO0O0 = paramConstraintWidget;
  }
  
  public void setKey(Object paramObject)
  {
    this.OooO0OO = paramObject;
  }
  
  public void setOrientation(int paramInt)
  {
    this.OooO00o = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.state.helpers.GuidelineReference
 * JD-Core Version:    0.7.0.1
 */
package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

public abstract interface Reference
{
  public abstract ConstraintWidget getConstraintWidget();
  
  public abstract Facade getFacade();
  
  public abstract Object getKey();
  
  public abstract void setConstraintWidget(ConstraintWidget paramConstraintWidget);
  
  public abstract void setKey(Object paramObject);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.state.Reference
 * JD-Core Version:    0.7.0.1
 */
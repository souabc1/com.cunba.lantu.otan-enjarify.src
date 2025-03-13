package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

public class ConstraintReference
  implements Reference
{
  public float OooO;
  public Object OooO00o;
  public final State OooO0O0;
  public String OooO0OO = null;
  public Facade OooO0Oo = null;
  public int OooO0o = 0;
  public int OooO0o0 = 0;
  public float OooO0oO;
  public float OooO0oo;
  public float OooOO0;
  public int OooOO0O;
  public int OooOO0o;
  public int OooOOO;
  public int OooOOO0;
  public int OooOOOO;
  public int OooOOOo;
  public int OooOOo;
  public int OooOOo0;
  public int OooOOoo;
  public int OooOo;
  public int OooOo0;
  public int OooOo00;
  public int OooOo0O;
  public int OooOo0o;
  public float OooOoO;
  public float OooOoO0;
  public float OooOoOO;
  public float OooOoo;
  public float OooOoo0;
  public float OooOooO;
  public float OooOooo;
  public Object Oooo;
  public float Oooo0;
  public float Oooo000;
  public float Oooo00O;
  public float Oooo00o;
  public int Oooo0O0;
  public Object Oooo0OO;
  public Object Oooo0o;
  public Object Oooo0o0;
  public Object Oooo0oO;
  public Object Oooo0oo;
  public Object OoooO;
  public Object OoooO0;
  public Object OoooO00;
  public Object OoooO0O;
  public Object OoooOO0;
  public Object OoooOOO;
  public Object OoooOOo;
  public Object OoooOo0;
  public Object OoooOoO;
  public State.Constraint OoooOoo;
  public Dimension Ooooo00;
  public Dimension Ooooo0o;
  public Object OooooO0;
  public ConstraintWidget OooooOO;
  public HashMap OooooOo;
  public HashMap Oooooo0;
  public Object o000oOoO;
  
  public ConstraintReference(State paramState)
  {
    float f = -1.0F;
    this.OooO0oO = f;
    this.OooO0oo = f;
    f = 0.5F;
    this.OooO = f;
    this.OooOO0 = f;
    this.OooOO0O = 0;
    this.OooOO0o = 0;
    this.OooOOO0 = 0;
    this.OooOOO = 0;
    this.OooOOOO = 0;
    this.OooOOOo = 0;
    this.OooOOo0 = 0;
    this.OooOOo = 0;
    this.OooOOoo = 0;
    this.OooOo00 = 0;
    this.OooOo0 = 0;
    this.OooOo0O = 0;
    this.OooOo0o = 0;
    this.OooOo = 0;
    f = 0.0F / 0.0F;
    this.OooOoO0 = f;
    this.OooOoO = f;
    this.OooOoOO = f;
    this.OooOoo0 = f;
    this.OooOoo = f;
    this.OooOooO = f;
    this.OooOooo = f;
    this.Oooo000 = f;
    this.Oooo00O = f;
    this.Oooo00o = f;
    this.Oooo0 = f;
    this.Oooo0O0 = 0;
    this.Oooo0OO = null;
    this.Oooo0o0 = null;
    this.Oooo0o = null;
    this.Oooo0oO = null;
    this.Oooo0oo = null;
    this.Oooo = null;
    this.OoooO00 = null;
    this.OoooO0 = null;
    this.OoooO0O = null;
    this.OoooO = null;
    this.OoooOO0 = null;
    this.o000oOoO = null;
    this.OoooOOO = null;
    this.OoooOOo = null;
    this.OoooOo0 = null;
    this.OoooOoO = null;
    this.OoooOoo = null;
    Object localObject = Dimension.OooOO0;
    Dimension localDimension = Dimension.OooO00o(localObject);
    this.Ooooo00 = localDimension;
    localObject = Dimension.OooO00o(localObject);
    this.Ooooo0o = ((Dimension)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.OooooOo = ((HashMap)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.Oooooo0 = ((HashMap)localObject);
    this.OooO0O0 = paramState;
  }
  
  public ConstraintWidget OooO00o()
  {
    ConstraintWidget localConstraintWidget = new androidx/constraintlayout/core/widgets/ConstraintWidget;
    int i = getWidth().getValue();
    int j = getHeight().getValue();
    localConstraintWidget.<init>(i, j);
    return localConstraintWidget;
  }
  
  public float getAlpha()
  {
    return this.Oooo00O;
  }
  
  public ConstraintWidget getConstraintWidget()
  {
    ConstraintWidget localConstraintWidget = this.OooooOO;
    if (localConstraintWidget == null)
    {
      localConstraintWidget = OooO00o();
      this.OooooOO = localConstraintWidget;
      Object localObject = this.OooooO0;
      localConstraintWidget.setCompanionWidget(localObject);
    }
    return this.OooooOO;
  }
  
  public Facade getFacade()
  {
    return this.OooO0Oo;
  }
  
  public Dimension getHeight()
  {
    return this.Ooooo0o;
  }
  
  public int getHorizontalChainStyle()
  {
    return this.OooO0o0;
  }
  
  public float getHorizontalChainWeight()
  {
    return this.OooO0oO;
  }
  
  public Object getKey()
  {
    return this.OooO00o;
  }
  
  public float getPivotX()
  {
    return this.OooOoO0;
  }
  
  public float getPivotY()
  {
    return this.OooOoO;
  }
  
  public float getRotationX()
  {
    return this.OooOoOO;
  }
  
  public float getRotationY()
  {
    return this.OooOoo0;
  }
  
  public float getRotationZ()
  {
    return this.OooOoo;
  }
  
  public float getScaleX()
  {
    return this.Oooo00o;
  }
  
  public float getScaleY()
  {
    return this.Oooo0;
  }
  
  public String getTag()
  {
    return this.OooO0OO;
  }
  
  public float getTranslationX()
  {
    return this.OooOooO;
  }
  
  public float getTranslationY()
  {
    return this.OooOooo;
  }
  
  public float getTranslationZ()
  {
    return this.Oooo000;
  }
  
  public int getVerticalChainStyle(int paramInt)
  {
    return this.OooO0o;
  }
  
  public float getVerticalChainWeight()
  {
    return this.OooO0oo;
  }
  
  public Object getView()
  {
    return this.OooooO0;
  }
  
  public Dimension getWidth()
  {
    return this.Ooooo00;
  }
  
  public void setConstraintWidget(ConstraintWidget paramConstraintWidget)
  {
    if (paramConstraintWidget == null) {
      return;
    }
    this.OooooOO = paramConstraintWidget;
    Object localObject = this.OooooO0;
    paramConstraintWidget.setCompanionWidget(localObject);
  }
  
  public void setFacade(Facade paramFacade)
  {
    this.OooO0Oo = paramFacade;
    if (paramFacade != null)
    {
      paramFacade = paramFacade.getConstraintWidget();
      setConstraintWidget(paramFacade);
    }
  }
  
  public void setHorizontalChainStyle(int paramInt)
  {
    this.OooO0o0 = paramInt;
  }
  
  public void setHorizontalChainWeight(float paramFloat)
  {
    this.OooO0oO = paramFloat;
  }
  
  public void setKey(Object paramObject)
  {
    this.OooO00o = paramObject;
  }
  
  public void setTag(String paramString)
  {
    this.OooO0OO = paramString;
  }
  
  public void setVerticalChainStyle(int paramInt)
  {
    this.OooO0o = paramInt;
  }
  
  public void setVerticalChainWeight(float paramFloat)
  {
    this.OooO0oo = paramFloat;
  }
  
  public void setView(Object paramObject)
  {
    this.OooooO0 = paramObject;
    ConstraintWidget localConstraintWidget = this.OooooOO;
    if (localConstraintWidget != null) {
      localConstraintWidget.setCompanionWidget(paramObject);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.state.ConstraintReference
 * JD-Core Version:    0.7.0.1
 */
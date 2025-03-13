package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;
import java.util.Set;

public class WidgetFrame
{
  public float OooO;
  public ConstraintWidget OooO00o = null;
  public int OooO0O0 = 0;
  public int OooO0OO = 0;
  public int OooO0Oo = 0;
  public float OooO0o;
  public int OooO0o0 = 0;
  public float OooO0oO;
  public float OooO0oo;
  public float OooOO0;
  public float OooOO0O;
  public float OooOO0o;
  public float OooOOO;
  public float OooOOO0;
  public float OooOOOO;
  public float OooOOOo;
  public int OooOOo;
  public float OooOOo0;
  public final HashMap OooOOoo;
  public String OooOo00;
  
  public WidgetFrame()
  {
    float f = 0.0F / 0.0F;
    this.OooO0o = f;
    this.OooO0oO = f;
    this.OooO0oo = f;
    this.OooO = f;
    this.OooOO0 = f;
    this.OooOO0O = f;
    this.OooOO0o = f;
    this.OooOOO0 = f;
    this.OooOOO = f;
    this.OooOOOO = f;
    this.OooOOOo = f;
    this.OooOOo0 = f;
    this.OooOOo = 0;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooOOoo = localHashMap;
    this.OooOo00 = null;
  }
  
  public WidgetFrame(ConstraintWidget paramConstraintWidget)
  {
    float f = 0.0F / 0.0F;
    this.OooO0o = f;
    this.OooO0oO = f;
    this.OooO0oo = f;
    this.OooO = f;
    this.OooOO0 = f;
    this.OooOO0O = f;
    this.OooOO0o = f;
    this.OooOOO0 = f;
    this.OooOOO = f;
    this.OooOOOO = f;
    this.OooOOOo = f;
    this.OooOOo0 = f;
    this.OooOOo = 0;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooOOoo = localHashMap;
    this.OooOo00 = null;
    this.OooO00o = paramConstraintWidget;
  }
  
  public CustomVariable OooO00o(String paramString)
  {
    return (CustomVariable)this.OooOOoo.get(paramString);
  }
  
  public Set getCustomAttributeNames()
  {
    return this.OooOOoo.keySet();
  }
  
  public String getId()
  {
    ConstraintWidget localConstraintWidget = this.OooO00o;
    if (localConstraintWidget == null) {
      return "unknown";
    }
    return localConstraintWidget.OooOOOO;
  }
  
  public boolean isDefaultTransform()
  {
    float f = this.OooO0oo;
    boolean bool = Float.isNaN(f);
    if (bool)
    {
      f = this.OooO;
      bool = Float.isNaN(f);
      if (bool)
      {
        f = this.OooOO0;
        bool = Float.isNaN(f);
        if (bool)
        {
          f = this.OooOO0O;
          bool = Float.isNaN(f);
          if (bool)
          {
            f = this.OooOO0o;
            bool = Float.isNaN(f);
            if (bool)
            {
              f = this.OooOOO0;
              bool = Float.isNaN(f);
              if (bool)
              {
                f = this.OooOOO;
                bool = Float.isNaN(f);
                if (bool)
                {
                  f = this.OooOOOO;
                  bool = Float.isNaN(f);
                  if (bool)
                  {
                    f = this.OooOOOo;
                    bool = Float.isNaN(f);
                    if (bool)
                    {
                      bool = true;
                      f = 1.4E-45F;
                      return bool;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    bool = false;
    f = 0.0F;
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.state.WidgetFrame
 * JD-Core Version:    0.7.0.1
 */
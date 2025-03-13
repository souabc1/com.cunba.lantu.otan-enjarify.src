package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.WidgetFrame;
import java.util.Set;

public class MotionWidget
  implements TypedValues
{
  public WidgetFrame OooO00o;
  public MotionWidget.Motion OooO0O0;
  public MotionWidget.PropertySet OooO0OO;
  public float OooO0Oo;
  public float OooO0o0;
  
  public MotionWidget()
  {
    Object localObject = new androidx/constraintlayout/core/state/WidgetFrame;
    ((WidgetFrame)localObject).<init>();
    this.OooO00o = ((WidgetFrame)localObject);
    localObject = new androidx/constraintlayout/core/motion/MotionWidget$Motion;
    ((MotionWidget.Motion)localObject).<init>();
    this.OooO0O0 = ((MotionWidget.Motion)localObject);
    localObject = new androidx/constraintlayout/core/motion/MotionWidget$PropertySet;
    ((MotionWidget.PropertySet)localObject).<init>();
    this.OooO0OO = ((MotionWidget.PropertySet)localObject);
  }
  
  public MotionWidget(WidgetFrame paramWidgetFrame)
  {
    Object localObject = new androidx/constraintlayout/core/state/WidgetFrame;
    ((WidgetFrame)localObject).<init>();
    this.OooO00o = ((WidgetFrame)localObject);
    localObject = new androidx/constraintlayout/core/motion/MotionWidget$Motion;
    ((MotionWidget.Motion)localObject).<init>();
    this.OooO0O0 = ((MotionWidget.Motion)localObject);
    localObject = new androidx/constraintlayout/core/motion/MotionWidget$PropertySet;
    ((MotionWidget.PropertySet)localObject).<init>();
    this.OooO0OO = ((MotionWidget.PropertySet)localObject);
    this.OooO00o = paramWidgetFrame;
  }
  
  public boolean OooO00o(int paramInt1, int paramInt2)
  {
    float f = paramInt2;
    return OooO0o(paramInt1, f);
  }
  
  public boolean OooO0O0(int paramInt, float paramFloat)
  {
    boolean bool = OooO0o(paramInt, paramFloat);
    if (bool) {
      return true;
    }
    return OooO0oO(paramInt, paramFloat);
  }
  
  public boolean OooO0OO(int paramInt, String paramString)
  {
    return OooO0oo(paramInt, paramString);
  }
  
  public boolean OooO0Oo(int paramInt, boolean paramBoolean)
  {
    return false;
  }
  
  public boolean OooO0o(int paramInt, float paramFloat)
  {
    WidgetFrame localWidgetFrame;
    switch (paramInt)
    {
    case 307: 
    default: 
      return false;
    case 316: 
      this.OooO0o0 = paramFloat;
      break;
    case 315: 
      this.OooO0Oo = paramFloat;
      break;
    case 314: 
      localWidgetFrame = this.OooO00o;
      localWidgetFrame.OooO0oO = paramFloat;
      break;
    case 313: 
      localWidgetFrame = this.OooO00o;
      localWidgetFrame.OooO0o = paramFloat;
      break;
    case 312: 
      localWidgetFrame = this.OooO00o;
      localWidgetFrame.OooOOOO = paramFloat;
      break;
    case 311: 
      localWidgetFrame = this.OooO00o;
      localWidgetFrame.OooOOO = paramFloat;
      break;
    case 310: 
      localWidgetFrame = this.OooO00o;
      localWidgetFrame.OooOO0 = paramFloat;
      break;
    case 309: 
      localWidgetFrame = this.OooO00o;
      localWidgetFrame.OooO = paramFloat;
      break;
    case 308: 
      localWidgetFrame = this.OooO00o;
      localWidgetFrame.OooO0oo = paramFloat;
      break;
    case 306: 
      localWidgetFrame = this.OooO00o;
      localWidgetFrame.OooOOO0 = paramFloat;
      break;
    case 305: 
      localWidgetFrame = this.OooO00o;
      localWidgetFrame.OooOO0o = paramFloat;
      break;
    case 304: 
      localWidgetFrame = this.OooO00o;
      localWidgetFrame.OooOO0O = paramFloat;
      break;
    case 303: 
      localWidgetFrame = this.OooO00o;
      localWidgetFrame.OooOOOo = paramFloat;
    }
    return true;
  }
  
  public CustomVariable OooO0o0(String paramString)
  {
    return this.OooO00o.OooO00o(paramString);
  }
  
  public boolean OooO0oO(int paramInt, float paramFloat)
  {
    MotionWidget.Motion localMotion;
    switch (paramInt)
    {
    default: 
      return false;
    case 602: 
      localMotion = this.OooO0O0;
      localMotion.OooO = paramFloat;
      break;
    case 601: 
      localMotion = this.OooO0O0;
      localMotion.OooO0oo = paramFloat;
      break;
    case 600: 
      localMotion = this.OooO0O0;
      localMotion.OooO0o = paramFloat;
    }
    return true;
  }
  
  public boolean OooO0oo(int paramInt, String paramString)
  {
    int i = 603;
    MotionWidget.Motion localMotion;
    if (paramInt != i)
    {
      i = 604;
      if (paramInt != i) {
        return false;
      }
      localMotion = this.OooO0O0;
      localMotion.OooOO0O = paramString;
    }
    else
    {
      localMotion = this.OooO0O0;
      localMotion.OooO0OO = paramString;
    }
    return true;
  }
  
  public float getAlpha()
  {
    return this.OooO0OO.OooO0OO;
  }
  
  public int getBottom()
  {
    return this.OooO00o.OooO0o0;
  }
  
  public Set getCustomAttributeNames()
  {
    return this.OooO00o.getCustomAttributeNames();
  }
  
  public int getHeight()
  {
    WidgetFrame localWidgetFrame = this.OooO00o;
    int i = localWidgetFrame.OooO0o0;
    int j = localWidgetFrame.OooO0OO;
    return i - j;
  }
  
  public int getLeft()
  {
    return this.OooO00o.OooO0O0;
  }
  
  public String getName()
  {
    return this.OooO00o.getId();
  }
  
  public MotionWidget getParent()
  {
    return null;
  }
  
  public float getPivotX()
  {
    return this.OooO00o.OooO0o;
  }
  
  public float getPivotY()
  {
    return this.OooO00o.OooO0oO;
  }
  
  public int getRight()
  {
    return this.OooO00o.OooO0Oo;
  }
  
  public float getRotationX()
  {
    return this.OooO00o.OooO0oo;
  }
  
  public float getRotationY()
  {
    return this.OooO00o.OooO;
  }
  
  public float getRotationZ()
  {
    return this.OooO00o.OooOO0;
  }
  
  public float getScaleX()
  {
    return this.OooO00o.OooOOO;
  }
  
  public float getScaleY()
  {
    return this.OooO00o.OooOOOO;
  }
  
  public int getTop()
  {
    return this.OooO00o.OooO0OO;
  }
  
  public float getTranslationX()
  {
    return this.OooO00o.OooOO0O;
  }
  
  public float getTranslationY()
  {
    return this.OooO00o.OooOO0o;
  }
  
  public float getTranslationZ()
  {
    return this.OooO00o.OooOOO0;
  }
  
  public float getValueAttributes(int paramInt)
  {
    switch (paramInt)
    {
    case 307: 
    default: 
      return 0.0F / 0.0F;
    case 316: 
      return this.OooO0o0;
    case 315: 
      return this.OooO0Oo;
    case 314: 
      return this.OooO00o.OooO0oO;
    case 313: 
      return this.OooO00o.OooO0o;
    case 312: 
      return this.OooO00o.OooOOOO;
    case 311: 
      return this.OooO00o.OooOOO;
    case 310: 
      return this.OooO00o.OooOO0;
    case 309: 
      return this.OooO00o.OooO;
    case 308: 
      return this.OooO00o.OooO0oo;
    case 306: 
      return this.OooO00o.OooOOO0;
    case 305: 
      return this.OooO00o.OooOO0o;
    case 304: 
      return this.OooO00o.OooOO0O;
    }
    return this.OooO00o.OooOOOo;
  }
  
  public int getVisibility()
  {
    return this.OooO0OO.OooO00o;
  }
  
  public WidgetFrame getWidgetFrame()
  {
    return this.OooO00o;
  }
  
  public int getWidth()
  {
    WidgetFrame localWidgetFrame = this.OooO00o;
    int i = localWidgetFrame.OooO0Oo;
    int j = localWidgetFrame.OooO0O0;
    return i - j;
  }
  
  public int getX()
  {
    return this.OooO00o.OooO0O0;
  }
  
  public int getY()
  {
    return this.OooO00o.OooO0OO;
  }
  
  public void setPivotX(float paramFloat)
  {
    this.OooO00o.OooO0o = paramFloat;
  }
  
  public void setPivotY(float paramFloat)
  {
    this.OooO00o.OooO0oO = paramFloat;
  }
  
  public void setRotationX(float paramFloat)
  {
    this.OooO00o.OooO0oo = paramFloat;
  }
  
  public void setRotationY(float paramFloat)
  {
    this.OooO00o.OooO = paramFloat;
  }
  
  public void setRotationZ(float paramFloat)
  {
    this.OooO00o.OooOO0 = paramFloat;
  }
  
  public void setScaleX(float paramFloat)
  {
    this.OooO00o.OooOOO = paramFloat;
  }
  
  public void setScaleY(float paramFloat)
  {
    this.OooO00o.OooOOOO = paramFloat;
  }
  
  public void setTranslationX(float paramFloat)
  {
    this.OooO00o.OooOO0O = paramFloat;
  }
  
  public void setTranslationY(float paramFloat)
  {
    this.OooO00o.OooOO0o = paramFloat;
  }
  
  public void setTranslationZ(float paramFloat)
  {
    this.OooO00o.OooOOO0 = paramFloat;
  }
  
  public void setVisibility(int paramInt)
  {
    this.OooO0OO.OooO00o = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    int i = this.OooO00o.OooO0O0;
    localStringBuilder.append(i);
    String str = ", ";
    localStringBuilder.append(str);
    int j = this.OooO00o.OooO0OO;
    localStringBuilder.append(j);
    localStringBuilder.append(str);
    j = this.OooO00o.OooO0Oo;
    localStringBuilder.append(j);
    localStringBuilder.append(str);
    i = this.OooO00o.OooO0o0;
    localStringBuilder.append(i);
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.MotionWidget
 * JD-Core Version:    0.7.0.1
 */
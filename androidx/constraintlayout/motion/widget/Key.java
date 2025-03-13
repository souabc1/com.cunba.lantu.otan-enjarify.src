package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

public abstract class Key
{
  public static int OooO0o = 255;
  public int OooO00o;
  public int OooO0O0;
  public String OooO0OO;
  public int OooO0Oo;
  public HashMap OooO0o0;
  
  public Key()
  {
    int i = OooO0o;
    this.OooO00o = i;
    this.OooO0O0 = i;
    this.OooO0OO = null;
  }
  
  public float OooO(Object paramObject)
  {
    boolean bool = paramObject instanceof Float;
    float f;
    if (bool)
    {
      paramObject = (Float)paramObject;
      f = paramObject.floatValue();
    }
    else
    {
      paramObject = paramObject.toString();
      f = Float.parseFloat(paramObject);
    }
    return f;
  }
  
  public abstract void OooO00o(HashMap paramHashMap);
  
  public abstract Key OooO0O0();
  
  public Key OooO0OO(Key paramKey)
  {
    int i = paramKey.OooO00o;
    this.OooO00o = i;
    i = paramKey.OooO0O0;
    this.OooO0O0 = i;
    String str = paramKey.OooO0OO;
    this.OooO0OO = str;
    i = paramKey.OooO0Oo;
    this.OooO0Oo = i;
    paramKey = paramKey.OooO0o0;
    this.OooO0o0 = paramKey;
    return this;
  }
  
  public abstract void OooO0Oo(HashSet paramHashSet);
  
  public boolean OooO0o(String paramString)
  {
    String str = this.OooO0OO;
    if ((str != null) && (paramString != null)) {
      return paramString.matches(str);
    }
    return false;
  }
  
  public abstract void OooO0o0(Context paramContext, AttributeSet paramAttributeSet);
  
  public Key OooO0oO(int paramInt)
  {
    this.OooO0O0 = paramInt;
    return this;
  }
  
  public boolean OooO0oo(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Boolean;
    boolean bool2;
    if (bool1)
    {
      paramObject = (Boolean)paramObject;
      bool2 = paramObject.booleanValue();
    }
    else
    {
      paramObject = paramObject.toString();
      bool2 = Boolean.parseBoolean(paramObject);
    }
    return bool2;
  }
  
  public int OooOO0(Object paramObject)
  {
    boolean bool = paramObject instanceof Integer;
    int i;
    if (bool)
    {
      paramObject = (Integer)paramObject;
      i = paramObject.intValue();
    }
    else
    {
      paramObject = paramObject.toString();
      i = Integer.parseInt(paramObject);
    }
    return i;
  }
  
  public int getFramePosition()
  {
    return this.OooO00o;
  }
  
  public void setFramePosition(int paramInt)
  {
    this.OooO00o = paramInt;
  }
  
  public void setInterpolation(HashMap paramHashMap) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.Key
 * JD-Core Version:    0.7.0.1
 */
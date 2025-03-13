package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;

public abstract class MotionKey
  implements TypedValues
{
  public static int OooO0o = 255;
  public int OooO00o;
  public int OooO0O0;
  public String OooO0OO;
  public int OooO0Oo;
  public HashMap OooO0o0;
  
  public MotionKey()
  {
    int i = OooO0o;
    this.OooO00o = i;
    this.OooO0O0 = i;
    this.OooO0OO = null;
  }
  
  public boolean OooO00o(int paramInt1, int paramInt2)
  {
    int i = 100;
    if (paramInt1 != i) {
      return false;
    }
    this.OooO00o = paramInt2;
    return true;
  }
  
  public boolean OooO0O0(int paramInt, float paramFloat)
  {
    return false;
  }
  
  public boolean OooO0OO(int paramInt, String paramString)
  {
    int i = 101;
    if (paramInt != i) {
      return false;
    }
    this.OooO0OO = paramString;
    return true;
  }
  
  public boolean OooO0Oo(int paramInt, boolean paramBoolean)
  {
    return false;
  }
  
  public MotionKey OooO0o(MotionKey paramMotionKey)
  {
    int i = paramMotionKey.OooO00o;
    this.OooO00o = i;
    i = paramMotionKey.OooO0O0;
    this.OooO0O0 = i;
    String str = paramMotionKey.OooO0OO;
    this.OooO0OO = str;
    int j = paramMotionKey.OooO0Oo;
    this.OooO0Oo = j;
    return this;
  }
  
  public abstract MotionKey OooO0o0();
  
  public float OooO0oO(Object paramObject)
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
  
  public int OooO0oo(Object paramObject)
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
 * Qualified Name:     androidx.constraintlayout.core.motion.key.MotionKey
 * JD-Core Version:    0.7.0.1
 */
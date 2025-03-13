package androidx.dynamicanimation.animation;

import android.util.FloatProperty;
import android.util.Property;

final class FloatPropertyCompat$1
  extends FloatPropertyCompat
{
  public FloatPropertyCompat$1(String paramString, FloatProperty paramFloatProperty)
  {
    super(paramString);
  }
  
  public float getValue(Object paramObject)
  {
    return ((Float)this.OooO00o.get(paramObject)).floatValue();
  }
  
  public void setValue(Object paramObject, float paramFloat)
  {
    this.OooO00o.setValue(paramObject, paramFloat);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.dynamicanimation.animation.FloatPropertyCompat.1
 * JD-Core Version:    0.7.0.1
 */
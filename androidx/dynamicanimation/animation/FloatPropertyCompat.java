package androidx.dynamicanimation.animation;

import android.util.FloatProperty;
import android.util.Property;

public abstract class FloatPropertyCompat
{
  final String mPropertyName;
  
  public FloatPropertyCompat(String paramString)
  {
    this.mPropertyName = paramString;
  }
  
  public static FloatPropertyCompat createFloatPropertyCompat(FloatProperty paramFloatProperty)
  {
    FloatPropertyCompat.1 local1 = new androidx/dynamicanimation/animation/FloatPropertyCompat$1;
    String str = paramFloatProperty.getName();
    local1.<init>(str, paramFloatProperty);
    return local1;
  }
  
  public abstract float getValue(Object paramObject);
  
  public abstract void setValue(Object paramObject, float paramFloat);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.dynamicanimation.animation.FloatPropertyCompat
 * JD-Core Version:    0.7.0.1
 */
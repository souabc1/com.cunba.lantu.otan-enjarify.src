package androidx.transition;

import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

class PathProperty
  extends Property
{
  public final Property OooO00o;
  public final PathMeasure OooO0O0;
  public final float OooO0OO;
  public final float[] OooO0Oo;
  public float OooO0o;
  public final PointF OooO0o0;
  
  public Float OooO00o(Object paramObject)
  {
    return Float.valueOf(this.OooO0o);
  }
  
  public void OooO0O0(Object paramObject, Float paramFloat)
  {
    float f1 = paramFloat.floatValue();
    this.OooO0o = f1;
    Object localObject = this.OooO0O0;
    float f2 = this.OooO0OO;
    float f3 = paramFloat.floatValue();
    f2 *= f3;
    paramFloat = this.OooO0Oo;
    ((PathMeasure)localObject).getPosTan(f2, paramFloat, null);
    paramFloat = this.OooO0o0;
    localObject = this.OooO0Oo;
    f2 = localObject[0];
    paramFloat.x = f2;
    f1 = localObject[1];
    paramFloat.y = f1;
    this.OooO00o.set(paramObject, paramFloat);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.PathProperty
 * JD-Core Version:    0.7.0.1
 */
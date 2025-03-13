package androidx.core.graphics;

import android.graphics.PointF;

public final class PathSegment
{
  public final PointF OooO00o;
  public final float OooO0O0;
  public final PointF OooO0OO;
  public final float OooO0Oo;
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    boolean bool2 = paramObject instanceof PathSegment;
    if (!bool2) {
      return false;
    }
    paramObject = (PathSegment)paramObject;
    float f1 = this.OooO0O0;
    float f2 = paramObject.OooO0O0;
    int i = Float.compare(f1, f2);
    if (i == 0)
    {
      f1 = this.OooO0Oo;
      f2 = paramObject.OooO0Oo;
      i = Float.compare(f1, f2);
      if (i == 0)
      {
        PointF localPointF1 = this.OooO00o;
        PointF localPointF2 = paramObject.OooO00o;
        boolean bool3 = localPointF1.equals(localPointF2);
        if (bool3)
        {
          localPointF1 = this.OooO0OO;
          paramObject = paramObject.OooO0OO;
          boolean bool4 = localPointF1.equals(paramObject);
          if (bool4) {
            return bool1;
          }
        }
      }
    }
    bool1 = false;
    return bool1;
  }
  
  public PointF getEnd()
  {
    return this.OooO0OO;
  }
  
  public float getEndFraction()
  {
    return this.OooO0Oo;
  }
  
  public PointF getStart()
  {
    return this.OooO00o;
  }
  
  public float getStartFraction()
  {
    return this.OooO0O0;
  }
  
  public int hashCode()
  {
    PointF localPointF1 = this.OooO00o;
    int i = localPointF1.hashCode() * 31;
    float f = this.OooO0O0;
    boolean bool1 = false;
    boolean bool2 = f < 0.0F;
    int j = 0;
    if (bool2)
    {
      k = Float.floatToIntBits(f);
    }
    else
    {
      k = 0;
      localPointF2 = null;
      f = 0.0F;
    }
    i = (i + k) * 31;
    PointF localPointF2 = this.OooO0OO;
    int k = localPointF2.hashCode();
    i = (i + k) * 31;
    f = this.OooO0Oo;
    bool1 = f < 0.0F;
    if (bool1) {
      j = Float.floatToIntBits(f);
    }
    return i + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("PathSegment{start=");
    PointF localPointF = this.OooO00o;
    localStringBuilder.append(localPointF);
    localStringBuilder.append(", startFraction=");
    float f = this.OooO0O0;
    localStringBuilder.append(f);
    localStringBuilder.append(", end=");
    localPointF = this.OooO0OO;
    localStringBuilder.append(localPointF);
    localStringBuilder.append(", endFraction=");
    f = this.OooO0Oo;
    localStringBuilder.append(f);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.PathSegment
 * JD-Core Version:    0.7.0.1
 */
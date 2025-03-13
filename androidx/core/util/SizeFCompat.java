package androidx.core.util;

public final class SizeFCompat
{
  public final float OooO00o;
  public final float OooO0O0;
  
  public SizeFCompat(float paramFloat1, float paramFloat2)
  {
    paramFloat1 = Preconditions.OooO0OO(paramFloat1, "width");
    this.OooO00o = paramFloat1;
    paramFloat1 = Preconditions.OooO0OO(paramFloat2, "height");
    this.OooO0O0 = paramFloat1;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    boolean bool2 = paramObject instanceof SizeFCompat;
    if (!bool2) {
      return false;
    }
    paramObject = (SizeFCompat)paramObject;
    float f1 = paramObject.OooO00o;
    float f2 = this.OooO00o;
    bool2 = f1 < f2;
    if (!bool2)
    {
      float f3 = paramObject.OooO0O0;
      f1 = this.OooO0O0;
      boolean bool3 = f3 < f1;
      if (!bool3) {}
    }
    else
    {
      bool1 = false;
    }
    return bool1;
  }
  
  public float getHeight()
  {
    return this.OooO0O0;
  }
  
  public float getWidth()
  {
    return this.OooO00o;
  }
  
  public int hashCode()
  {
    int i = Float.floatToIntBits(this.OooO00o);
    int j = Float.floatToIntBits(this.OooO0O0);
    return i ^ j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    float f = this.OooO00o;
    localStringBuilder.append(f);
    localStringBuilder.append("x");
    f = this.OooO0O0;
    localStringBuilder.append(f);
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.util.SizeFCompat
 * JD-Core Version:    0.7.0.1
 */
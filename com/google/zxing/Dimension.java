package com.google.zxing;

public final class Dimension
{
  private final int height;
  private final int width;
  
  public Dimension(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt2 >= 0))
    {
      this.width = paramInt1;
      this.height = paramInt2;
      return;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>();
    throw localIllegalArgumentException;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Dimension;
    boolean bool2 = false;
    if (bool1)
    {
      paramObject = (Dimension)paramObject;
      int i = this.width;
      int j = paramObject.width;
      if (i == j)
      {
        i = this.height;
        int k = paramObject.height;
        if (i == k) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public int getHeight()
  {
    return this.height;
  }
  
  public int getWidth()
  {
    return this.width;
  }
  
  public int hashCode()
  {
    int i = this.width * 32713;
    int j = this.height;
    return i + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    int i = this.width;
    localStringBuilder.append(i);
    localStringBuilder.append("x");
    i = this.height;
    localStringBuilder.append(i);
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.Dimension
 * JD-Core Version:    0.7.0.1
 */
package com.google.zxing.oned.rss;

public class DataCharacter
{
  private final int checksumPortion;
  private final int value;
  
  public DataCharacter(int paramInt1, int paramInt2)
  {
    this.value = paramInt1;
    this.checksumPortion = paramInt2;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof DataCharacter;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (DataCharacter)paramObject;
    int i = this.value;
    int j = paramObject.value;
    if (i == j)
    {
      i = this.checksumPortion;
      int k = paramObject.checksumPortion;
      if (i == k) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public final int getChecksumPortion()
  {
    return this.checksumPortion;
  }
  
  public final int getValue()
  {
    return this.value;
  }
  
  public final int hashCode()
  {
    int i = this.value;
    int j = this.checksumPortion;
    return i ^ j;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    int i = this.value;
    localStringBuilder.append(i);
    localStringBuilder.append("(");
    i = this.checksumPortion;
    localStringBuilder.append(i);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.oned.rss.DataCharacter
 * JD-Core Version:    0.7.0.1
 */
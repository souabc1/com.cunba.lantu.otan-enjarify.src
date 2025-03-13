package com.google.zxing.pdf417.decoder;

final class Codeword
{
  private static final int BARCODE_ROW_UNKNOWN = 255;
  private final int bucket;
  private final int endX;
  private int rowNumber = -1;
  private final int startX;
  private final int value;
  
  public Codeword(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.startX = paramInt1;
    this.endX = paramInt2;
    this.bucket = paramInt3;
    this.value = paramInt4;
  }
  
  public int getBucket()
  {
    return this.bucket;
  }
  
  public int getEndX()
  {
    return this.endX;
  }
  
  public int getRowNumber()
  {
    return this.rowNumber;
  }
  
  public int getStartX()
  {
    return this.startX;
  }
  
  public int getValue()
  {
    return this.value;
  }
  
  public int getWidth()
  {
    int i = this.endX;
    int j = this.startX;
    return i - j;
  }
  
  public boolean hasValidRowNumber()
  {
    int i = this.rowNumber;
    return isValidRowNumber(i);
  }
  
  public boolean isValidRowNumber(int paramInt)
  {
    int i = -1;
    if (paramInt != i)
    {
      i = this.bucket;
      paramInt = paramInt % 3 * 3;
      if (i == paramInt) {
        return 1;
      }
    }
    paramInt = 0;
    return paramInt;
  }
  
  public void setRowNumber(int paramInt)
  {
    this.rowNumber = paramInt;
  }
  
  public void setRowNumberAsRowIndicatorColumn()
  {
    int i = this.value / 30 * 3;
    int j = this.bucket / 3;
    i += j;
    this.rowNumber = i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    int i = this.rowNumber;
    localStringBuilder.append(i);
    localStringBuilder.append("|");
    i = this.value;
    localStringBuilder.append(i);
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.pdf417.decoder.Codeword
 * JD-Core Version:    0.7.0.1
 */
package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;

public final class BarcodeMatrix
{
  private int currentRow;
  private final int height;
  private final BarcodeRow[] matrix;
  private final int width;
  
  public BarcodeMatrix(int paramInt1, int paramInt2)
  {
    BarcodeRow[] arrayOfBarcodeRow1 = new BarcodeRow[paramInt1];
    this.matrix = arrayOfBarcodeRow1;
    int i = arrayOfBarcodeRow1.length;
    int j = 0;
    while (j < i)
    {
      BarcodeRow[] arrayOfBarcodeRow2 = this.matrix;
      BarcodeRow localBarcodeRow = new com/google/zxing/pdf417/encoder/BarcodeRow;
      int k = (paramInt2 + 4) * 17 + 1;
      localBarcodeRow.<init>(k);
      arrayOfBarcodeRow2[j] = localBarcodeRow;
      j += 1;
    }
    paramInt2 *= 17;
    this.width = paramInt2;
    this.height = paramInt1;
    this.currentRow = -1;
  }
  
  public BarcodeRow getCurrentRow()
  {
    BarcodeRow[] arrayOfBarcodeRow = this.matrix;
    int i = this.currentRow;
    return arrayOfBarcodeRow[i];
  }
  
  public byte[][] getMatrix()
  {
    int i = 1;
    return getScaledMatrix(i, i);
  }
  
  public byte[][] getScaledMatrix(int paramInt1, int paramInt2)
  {
    int i = this.height * paramInt2;
    int j = this.width * paramInt1;
    Object localObject1 = { i, j };
    Class localClass = Byte.TYPE;
    localObject1 = (byte[][])Array.newInstance(localClass, (int[])localObject1);
    j = this.height * paramInt2;
    int k = 0;
    while (k < j)
    {
      int m = j - k + -1;
      Object localObject2 = this.matrix;
      int n = k / paramInt2;
      localObject2 = localObject2[n].getScaledRow(paramInt1);
      localObject1[m] = localObject2;
      k += 1;
    }
    return localObject1;
  }
  
  public void set(int paramInt1, int paramInt2, byte paramByte)
  {
    this.matrix[paramInt2].set(paramInt1, paramByte);
  }
  
  public void startRow()
  {
    int i = this.currentRow + 1;
    this.currentRow = i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.pdf417.encoder.BarcodeMatrix
 * JD-Core Version:    0.7.0.1
 */
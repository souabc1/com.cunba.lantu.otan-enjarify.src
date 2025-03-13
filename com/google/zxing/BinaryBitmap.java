package com.google.zxing;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;
import m54207b69;

public final class BinaryBitmap
{
  private final Binarizer binarizer;
  private BitMatrix matrix;
  
  public BinaryBitmap(Binarizer paramBinarizer)
  {
    if (paramBinarizer != null)
    {
      this.binarizer = paramBinarizer;
      return;
    }
    paramBinarizer = new java/lang/IllegalArgumentException;
    String str = m54207b69.F54207b69_11("[173596153475D515B4B1A664F4E521F62642271717331755B757639");
    paramBinarizer.<init>(str);
    throw paramBinarizer;
  }
  
  public BinaryBitmap crop(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject = this.binarizer.getLuminanceSource().crop(paramInt1, paramInt2, paramInt3, paramInt4);
    BinaryBitmap localBinaryBitmap = new com/google/zxing/BinaryBitmap;
    localObject = this.binarizer.createBinarizer((LuminanceSource)localObject);
    localBinaryBitmap.<init>((Binarizer)localObject);
    return localBinaryBitmap;
  }
  
  public BitMatrix getBlackMatrix()
  {
    BitMatrix localBitMatrix = this.matrix;
    if (localBitMatrix == null)
    {
      localBitMatrix = this.binarizer.getBlackMatrix();
      this.matrix = localBitMatrix;
    }
    return this.matrix;
  }
  
  public BitArray getBlackRow(int paramInt, BitArray paramBitArray)
  {
    return this.binarizer.getBlackRow(paramInt, paramBitArray);
  }
  
  public int getHeight()
  {
    return this.binarizer.getHeight();
  }
  
  public int getWidth()
  {
    return this.binarizer.getWidth();
  }
  
  public boolean isCropSupported()
  {
    return this.binarizer.getLuminanceSource().isCropSupported();
  }
  
  public boolean isRotateSupported()
  {
    return this.binarizer.getLuminanceSource().isRotateSupported();
  }
  
  public BinaryBitmap rotateCounterClockwise()
  {
    Object localObject = this.binarizer.getLuminanceSource().rotateCounterClockwise();
    BinaryBitmap localBinaryBitmap = new com/google/zxing/BinaryBitmap;
    localObject = this.binarizer.createBinarizer((LuminanceSource)localObject);
    localBinaryBitmap.<init>((Binarizer)localObject);
    return localBinaryBitmap;
  }
  
  public BinaryBitmap rotateCounterClockwise45()
  {
    Object localObject = this.binarizer.getLuminanceSource().rotateCounterClockwise45();
    BinaryBitmap localBinaryBitmap = new com/google/zxing/BinaryBitmap;
    localObject = this.binarizer.createBinarizer((LuminanceSource)localObject);
    localBinaryBitmap.<init>((Binarizer)localObject);
    return localBinaryBitmap;
  }
  
  public String toString()
  {
    try
    {
      BitMatrix localBitMatrix = getBlackMatrix();
      return localBitMatrix.toString();
    }
    catch (NotFoundException localNotFoundException) {}
    return "";
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.BinaryBitmap
 * JD-Core Version:    0.7.0.1
 */
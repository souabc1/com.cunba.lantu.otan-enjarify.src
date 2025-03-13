package com.google.zxing.pdf417.decoder;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

final class BoundingBox
{
  private final ResultPoint bottomLeft;
  private final ResultPoint bottomRight;
  private final BitMatrix image;
  private final int maxX;
  private final int maxY;
  private final int minX;
  private final int minY;
  private final ResultPoint topLeft;
  private final ResultPoint topRight;
  
  public BoundingBox(BitMatrix paramBitMatrix, ResultPoint paramResultPoint1, ResultPoint paramResultPoint2, ResultPoint paramResultPoint3, ResultPoint paramResultPoint4)
  {
    int i = 0;
    float f1 = 0.0F;
    int j = 1;
    float f2 = 1.4E-45F;
    int k;
    if ((paramResultPoint1 != null) && (paramResultPoint2 != null)) {
      k = 0;
    } else {
      k = j;
    }
    if ((paramResultPoint3 == null) || (paramResultPoint4 == null))
    {
      i = j;
      f1 = f2;
    }
    if ((k != 0) && (i != 0)) {
      throw NotFoundException.getNotFoundInstance();
    }
    if (k != 0)
    {
      paramResultPoint1 = new com/google/zxing/ResultPoint;
      float f3 = paramResultPoint3.getY();
      i = 0;
      f1 = 0.0F;
      paramResultPoint1.<init>(0.0F, f3);
      paramResultPoint2 = new com/google/zxing/ResultPoint;
      f2 = paramResultPoint4.getY();
      paramResultPoint2.<init>(0.0F, f2);
    }
    else if (i != 0)
    {
      paramResultPoint3 = new com/google/zxing/ResultPoint;
      int m = paramBitMatrix.getWidth() - j;
      float f4 = m;
      f1 = paramResultPoint1.getY();
      paramResultPoint3.<init>(f4, f1);
      paramResultPoint4 = new com/google/zxing/ResultPoint;
      i = paramBitMatrix.getWidth() - j;
      f1 = i;
      f2 = paramResultPoint2.getY();
      paramResultPoint4.<init>(f1, f2);
    }
    this.image = paramBitMatrix;
    this.topLeft = paramResultPoint1;
    this.bottomLeft = paramResultPoint2;
    this.topRight = paramResultPoint3;
    this.bottomRight = paramResultPoint4;
    float f5 = paramResultPoint1.getX();
    f1 = paramResultPoint2.getX();
    int n = (int)Math.min(f5, f1);
    this.minX = n;
    f5 = paramResultPoint3.getX();
    f1 = paramResultPoint4.getX();
    n = (int)Math.max(f5, f1);
    this.maxX = n;
    f5 = paramResultPoint1.getY();
    float f6 = paramResultPoint3.getY();
    n = (int)Math.min(f5, f6);
    this.minY = n;
    f5 = paramResultPoint2.getY();
    f6 = paramResultPoint4.getY();
    n = (int)Math.max(f5, f6);
    this.maxY = n;
  }
  
  public BoundingBox(BoundingBox paramBoundingBox)
  {
    Object localObject = paramBoundingBox.image;
    this.image = ((BitMatrix)localObject);
    localObject = paramBoundingBox.topLeft;
    this.topLeft = ((ResultPoint)localObject);
    localObject = paramBoundingBox.bottomLeft;
    this.bottomLeft = ((ResultPoint)localObject);
    localObject = paramBoundingBox.topRight;
    this.topRight = ((ResultPoint)localObject);
    localObject = paramBoundingBox.bottomRight;
    this.bottomRight = ((ResultPoint)localObject);
    int i = paramBoundingBox.minX;
    this.minX = i;
    i = paramBoundingBox.maxX;
    this.maxX = i;
    i = paramBoundingBox.minY;
    this.minY = i;
    int j = paramBoundingBox.maxY;
    this.maxY = j;
  }
  
  public static BoundingBox merge(BoundingBox paramBoundingBox1, BoundingBox paramBoundingBox2)
  {
    if (paramBoundingBox1 == null) {
      return paramBoundingBox2;
    }
    if (paramBoundingBox2 == null) {
      return paramBoundingBox1;
    }
    BoundingBox localBoundingBox = new com/google/zxing/pdf417/decoder/BoundingBox;
    BitMatrix localBitMatrix = paramBoundingBox1.image;
    ResultPoint localResultPoint1 = paramBoundingBox1.topLeft;
    ResultPoint localResultPoint2 = paramBoundingBox1.bottomLeft;
    ResultPoint localResultPoint3 = paramBoundingBox2.topRight;
    ResultPoint localResultPoint4 = paramBoundingBox2.bottomRight;
    localBoundingBox.<init>(localBitMatrix, localResultPoint1, localResultPoint2, localResultPoint3, localResultPoint4);
    return localBoundingBox;
  }
  
  public BoundingBox addMissingRows(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    ResultPoint localResultPoint1 = this.topLeft;
    ResultPoint localResultPoint2 = this.bottomLeft;
    ResultPoint localResultPoint3 = this.topRight;
    ResultPoint localResultPoint4 = this.bottomRight;
    Object localObject2;
    if (paramInt1 > 0)
    {
      ResultPoint localResultPoint5;
      if (paramBoolean) {
        localResultPoint5 = localResultPoint1;
      } else {
        localResultPoint5 = localResultPoint3;
      }
      float f1 = localResultPoint5.getY();
      int i = (int)f1 - paramInt1;
      if (i < 0)
      {
        i = 0;
        f1 = 0.0F;
      }
      localObject1 = new com/google/zxing/ResultPoint;
      float f2 = localResultPoint5.getX();
      f1 = i;
      ((ResultPoint)localObject1).<init>(f2, f1);
      if (paramBoolean)
      {
        localObject2 = localObject1;
      }
      else
      {
        localObject3 = localObject1;
        localObject2 = localResultPoint1;
        break label124;
      }
    }
    else
    {
      localObject2 = localResultPoint1;
    }
    Object localObject3 = localResultPoint3;
    label124:
    Object localObject5;
    if (paramInt2 > 0)
    {
      if (paramBoolean) {
        localObject1 = this.bottomLeft;
      } else {
        localObject1 = this.bottomRight;
      }
      float f3 = ((ResultPoint)localObject1).getY();
      int j = (int)f3 + paramInt2;
      Object localObject4 = this.image;
      paramInt2 = ((BitMatrix)localObject4).getHeight();
      if (j >= paramInt2)
      {
        localObject4 = this.image;
        paramInt2 = ((BitMatrix)localObject4).getHeight();
        j = paramInt2 + -1;
      }
      localObject4 = new com/google/zxing/ResultPoint;
      float f4 = ((ResultPoint)localObject1).getX();
      f3 = j;
      ((ResultPoint)localObject4).<init>(f4, f3);
      if (paramBoolean)
      {
        localObject5 = localObject4;
      }
      else
      {
        localObject6 = localObject4;
        localObject5 = localResultPoint2;
        break label252;
      }
    }
    else
    {
      localObject5 = localResultPoint2;
    }
    Object localObject6 = localResultPoint4;
    label252:
    Object localObject1 = new com/google/zxing/pdf417/decoder/BoundingBox;
    BitMatrix localBitMatrix = this.image;
    ((BoundingBox)localObject1).<init>(localBitMatrix, (ResultPoint)localObject2, (ResultPoint)localObject5, (ResultPoint)localObject3, (ResultPoint)localObject6);
    return localObject1;
  }
  
  public ResultPoint getBottomLeft()
  {
    return this.bottomLeft;
  }
  
  public ResultPoint getBottomRight()
  {
    return this.bottomRight;
  }
  
  public int getMaxX()
  {
    return this.maxX;
  }
  
  public int getMaxY()
  {
    return this.maxY;
  }
  
  public int getMinX()
  {
    return this.minX;
  }
  
  public int getMinY()
  {
    return this.minY;
  }
  
  public ResultPoint getTopLeft()
  {
    return this.topLeft;
  }
  
  public ResultPoint getTopRight()
  {
    return this.topRight;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.pdf417.decoder.BoundingBox
 * JD-Core Version:    0.7.0.1
 */
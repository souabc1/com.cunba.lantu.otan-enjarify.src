package com.google.zxing.pdf417.decoder.ec;

import com.google.zxing.ChecksumException;

public final class ErrorCorrection
{
  private final ModulusGF field;
  
  public ErrorCorrection()
  {
    ModulusGF localModulusGF = ModulusGF.PDF417_GF;
    this.field = localModulusGF;
  }
  
  private int[] findErrorLocations(ModulusPoly paramModulusPoly)
  {
    int i = paramModulusPoly.getDegree();
    int[] arrayOfInt = new int[i];
    int j = 0;
    int k = 1;
    for (;;)
    {
      ModulusGF localModulusGF = this.field;
      int m = localModulusGF.getSize();
      if ((k >= m) || (j >= i)) {
        break;
      }
      m = paramModulusPoly.evaluateAt(k);
      if (m == 0)
      {
        localModulusGF = this.field;
        m = localModulusGF.inverse(k);
        arrayOfInt[j] = m;
        j += 1;
      }
      k += 1;
    }
    if (j == i) {
      return arrayOfInt;
    }
    throw ChecksumException.getChecksumInstance();
  }
  
  private int[] findErrorMagnitudes(ModulusPoly paramModulusPoly1, ModulusPoly paramModulusPoly2, int[] paramArrayOfInt)
  {
    int i = paramModulusPoly2.getDegree();
    int j = 1;
    if (i < j) {
      return new int[0];
    }
    int[] arrayOfInt1 = new int[i];
    int k;
    ModulusGF localModulusGF1;
    int m;
    int n;
    while (j <= i)
    {
      k = i - j;
      localModulusGF1 = this.field;
      m = paramModulusPoly2.getCoefficient(j);
      n = localModulusGF1.multiply(j, m);
      arrayOfInt1[k] = n;
      j += 1;
    }
    paramModulusPoly2 = new com/google/zxing/pdf417/decoder/ec/ModulusPoly;
    ModulusGF localModulusGF2 = this.field;
    paramModulusPoly2.<init>(localModulusGF2, arrayOfInt1);
    i = paramArrayOfInt.length;
    int[] arrayOfInt2 = new int[i];
    int i1 = 0;
    arrayOfInt1 = null;
    while (i1 < i)
    {
      ModulusGF localModulusGF3 = this.field;
      n = paramArrayOfInt[i1];
      k = localModulusGF3.inverse(n);
      localModulusGF1 = this.field;
      m = paramModulusPoly1.evaluateAt(k);
      n = localModulusGF1.subtract(0, m);
      ModulusGF localModulusGF4 = this.field;
      k = paramModulusPoly2.evaluateAt(k);
      k = localModulusGF4.inverse(k);
      localModulusGF4 = this.field;
      k = localModulusGF4.multiply(n, k);
      arrayOfInt2[i1] = k;
      i1 += 1;
    }
    return arrayOfInt2;
  }
  
  private ModulusPoly[] runEuclideanAlgorithm(ModulusPoly paramModulusPoly1, ModulusPoly paramModulusPoly2, int paramInt)
  {
    int i = paramModulusPoly1.getDegree();
    int j = paramModulusPoly2.getDegree();
    ModulusPoly localModulusPoly1;
    if (i < j)
    {
      localModulusPoly1 = paramModulusPoly2;
      paramModulusPoly2 = paramModulusPoly1;
      paramModulusPoly1 = localModulusPoly1;
    }
    Object localObject1 = this.field.getZero();
    Object localObject3;
    ModulusPoly localModulusPoly2;
    for (Object localObject2 = this.field.getOne();; localObject2 = localModulusPoly2.subtract((ModulusPoly)localObject2).negative())
    {
      localModulusPoly1 = paramModulusPoly2;
      paramModulusPoly2 = paramModulusPoly1;
      paramModulusPoly1 = localModulusPoly1;
      localObject3 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject3;
      int k = localModulusPoly1.getDegree();
      int m = paramInt / 2;
      if (k < m) {
        break label286;
      }
      boolean bool1 = localModulusPoly1.isZero();
      if (bool1) {
        break;
      }
      localModulusPoly2 = this.field.getZero();
      m = localModulusPoly1.getDegree();
      m = localModulusPoly1.getCoefficient(m);
      Object localObject4 = this.field;
      m = ((ModulusGF)localObject4).inverse(m);
      for (;;)
      {
        int n = paramModulusPoly2.getDegree();
        int i2 = paramModulusPoly1.getDegree();
        if (n < i2) {
          break;
        }
        boolean bool2 = paramModulusPoly2.isZero();
        if (bool2) {
          break;
        }
        int i1 = paramModulusPoly2.getDegree();
        i2 = paramModulusPoly1.getDegree();
        i1 -= i2;
        ModulusGF localModulusGF = this.field;
        int i3 = paramModulusPoly2.getDegree();
        i3 = paramModulusPoly2.getCoefficient(i3);
        i2 = localModulusGF.multiply(i3, m);
        ModulusPoly localModulusPoly3 = this.field.buildMonomial(i1, i2);
        localModulusPoly2 = localModulusPoly2.add(localModulusPoly3);
        localObject4 = paramModulusPoly1.multiplyByMonomial(i1, i2);
        paramModulusPoly2 = paramModulusPoly2.subtract((ModulusPoly)localObject4);
      }
      localModulusPoly2 = localModulusPoly2.multiply((ModulusPoly)localObject1);
    }
    throw ChecksumException.getChecksumInstance();
    label286:
    paramModulusPoly2 = null;
    int i4 = localObject3.getCoefficient(0);
    if (i4 != 0)
    {
      i4 = this.field.inverse(i4);
      ModulusPoly localModulusPoly4 = localObject3.multiply(i4);
      paramModulusPoly1 = localModulusPoly1.multiply(i4);
      return new ModulusPoly[] { localModulusPoly4, paramModulusPoly1 };
    }
    throw ChecksumException.getChecksumInstance();
  }
  
  public int decode(int[] paramArrayOfInt1, int paramInt, int[] paramArrayOfInt2)
  {
    Object localObject1 = new com/google/zxing/pdf417/decoder/ec/ModulusPoly;
    Object localObject2 = this.field;
    ((ModulusPoly)localObject1).<init>((ModulusGF)localObject2, paramArrayOfInt1);
    localObject2 = new int[paramInt];
    int i = 0;
    int j = paramInt;
    int k = 0;
    int m;
    Object localObject3;
    int n;
    for (;;)
    {
      m = 1;
      if (j <= 0) {
        break;
      }
      localObject3 = this.field;
      n = ((ModulusGF)localObject3).exp(j);
      n = ((ModulusPoly)localObject1).evaluateAt(n);
      int i1 = paramInt - j;
      localObject2[i1] = n;
      if (n != 0) {
        k = m;
      }
      j += -1;
    }
    if (k == 0) {
      return 0;
    }
    localObject1 = this.field.getOne();
    if (paramArrayOfInt2 != null)
    {
      j = paramArrayOfInt2.length;
      k = 0;
      while (k < j)
      {
        n = paramArrayOfInt2[k];
        Object localObject4 = this.field;
        int i2 = paramArrayOfInt1.length - m - n;
        n = ((ModulusGF)localObject4).exp(i2);
        localObject4 = new com/google/zxing/pdf417/decoder/ec/ModulusPoly;
        ModulusGF localModulusGF = this.field;
        n = localModulusGF.subtract(0, n);
        localObject3 = new int[] { n, m };
        ((ModulusPoly)localObject4).<init>(localModulusGF, (int[])localObject3);
        localObject1 = ((ModulusPoly)localObject1).multiply((ModulusPoly)localObject4);
        k += 1;
      }
    }
    paramArrayOfInt2 = new com/google/zxing/pdf417/decoder/ec/ModulusPoly;
    localObject1 = this.field;
    paramArrayOfInt2.<init>((ModulusGF)localObject1, (int[])localObject2);
    localObject1 = this.field.buildMonomial(paramInt, m);
    Object localObject5 = runEuclideanAlgorithm((ModulusPoly)localObject1, paramArrayOfInt2, paramInt);
    paramArrayOfInt2 = localObject5[0];
    localObject5 = localObject5[m];
    localObject1 = findErrorLocations(paramArrayOfInt2);
    localObject5 = findErrorMagnitudes((ModulusPoly)localObject5, paramArrayOfInt2, (int[])localObject1);
    for (;;)
    {
      int i3 = localObject1.length;
      if (i >= i3) {
        break label396;
      }
      i3 = paramArrayOfInt1.length - m;
      localObject2 = this.field;
      j = localObject1[i];
      int i4 = ((ModulusGF)localObject2).log(j);
      i3 -= i4;
      if (i3 < 0) {
        break;
      }
      localObject2 = this.field;
      j = paramArrayOfInt1[i3];
      k = localObject5[i];
      i4 = ((ModulusGF)localObject2).subtract(j, k);
      paramArrayOfInt1[i3] = i4;
      i += 1;
    }
    throw ChecksumException.getChecksumInstance();
    label396:
    return localObject1.length;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.pdf417.decoder.ec.ErrorCorrection
 * JD-Core Version:    0.7.0.1
 */
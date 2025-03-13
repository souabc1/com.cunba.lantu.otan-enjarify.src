package com.google.zxing.common.reedsolomon;

import m54207b69;

public final class ReedSolomonDecoder
{
  private final GenericGF field;
  
  public ReedSolomonDecoder(GenericGF paramGenericGF)
  {
    this.field = paramGenericGF;
  }
  
  private int[] findErrorLocations(GenericGFPoly paramGenericGFPoly)
  {
    int i = paramGenericGFPoly.getDegree();
    int j = 1;
    if (i == j)
    {
      int k = paramGenericGFPoly.getCoefficient(j);
      return new int[] { k };
    }
    int[] arrayOfInt = new int[i];
    int m = 0;
    for (;;)
    {
      GenericGF localGenericGF = this.field;
      int n = localGenericGF.getSize();
      if ((j >= n) || (m >= i)) {
        break;
      }
      n = paramGenericGFPoly.evaluateAt(j);
      if (n == 0)
      {
        localGenericGF = this.field;
        n = localGenericGF.inverse(j);
        arrayOfInt[m] = n;
        m += 1;
      }
      j += 1;
    }
    if (m == i) {
      return arrayOfInt;
    }
    paramGenericGFPoly = new com/google/zxing/common/reedsolomon/ReedSolomonException;
    String str = m54207b69.F54207b69_11("g\\192F30363281363A4746323E3A8946484B3F4B4C904D495047954C4E44994F5C4860569F564E57656157A65E66A95C62635961");
    paramGenericGFPoly.<init>(str);
    throw paramGenericGFPoly;
  }
  
  private int[] findErrorMagnitudes(GenericGFPoly paramGenericGFPoly, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    int[] arrayOfInt = new int[i];
    int j = 0;
    while (j < i)
    {
      GenericGF localGenericGF1 = this.field;
      int k = paramArrayOfInt[j];
      int m = localGenericGF1.inverse(k);
      k = 1;
      int n = 0;
      GenericGF localGenericGF2 = null;
      while (n < i)
      {
        if (j != n)
        {
          GenericGF localGenericGF3 = this.field;
          int i1 = paramArrayOfInt[n];
          i2 = localGenericGF3.multiply(i1, m);
          i1 = i2 & 0x1;
          if (i1 == 0) {
            i2 |= 0x1;
          } else {
            i2 &= 0xFFFFFFFE;
          }
          localGenericGF4 = this.field;
          k = localGenericGF4.multiply(k, i2);
        }
        n += 1;
      }
      localGenericGF2 = this.field;
      int i2 = paramGenericGFPoly.evaluateAt(m);
      GenericGF localGenericGF4 = this.field;
      k = localGenericGF4.inverse(k);
      k = localGenericGF2.multiply(i2, k);
      arrayOfInt[j] = k;
      GenericGF localGenericGF5 = this.field;
      k = localGenericGF5.getGeneratorBase();
      if (k != 0)
      {
        localGenericGF5 = this.field;
        n = arrayOfInt[j];
        m = localGenericGF5.multiply(n, m);
        arrayOfInt[j] = m;
      }
      j += 1;
    }
    return arrayOfInt;
  }
  
  private GenericGFPoly[] runEuclideanAlgorithm(GenericGFPoly paramGenericGFPoly1, GenericGFPoly paramGenericGFPoly2, int paramInt)
  {
    int i = paramGenericGFPoly1.getDegree();
    int j = paramGenericGFPoly2.getDegree();
    GenericGFPoly localGenericGFPoly1;
    if (i < j)
    {
      localGenericGFPoly1 = paramGenericGFPoly2;
      paramGenericGFPoly2 = paramGenericGFPoly1;
      paramGenericGFPoly1 = localGenericGFPoly1;
    }
    Object localObject1 = this.field.getZero();
    Object localObject2 = this.field.getOne();
    Object localObject3;
    int n;
    int m;
    do
    {
      localGenericGFPoly1 = paramGenericGFPoly2;
      paramGenericGFPoly2 = paramGenericGFPoly1;
      paramGenericGFPoly1 = localGenericGFPoly1;
      localObject3 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject3;
      int k = localGenericGFPoly1.getDegree() * 2;
      if (k < paramInt) {
        break label383;
      }
      boolean bool1 = localGenericGFPoly1.isZero();
      if (bool1) {
        break;
      }
      GenericGFPoly localGenericGFPoly2 = this.field.getZero();
      n = localGenericGFPoly1.getDegree();
      n = localGenericGFPoly1.getCoefficient(n);
      Object localObject4 = this.field;
      n = ((GenericGF)localObject4).inverse(n);
      for (;;)
      {
        int i1 = paramGenericGFPoly2.getDegree();
        int i3 = paramGenericGFPoly1.getDegree();
        if (i1 < i3) {
          break;
        }
        boolean bool2 = paramGenericGFPoly2.isZero();
        if (bool2) {
          break;
        }
        int i2 = paramGenericGFPoly2.getDegree();
        i3 = paramGenericGFPoly1.getDegree();
        i2 -= i3;
        GenericGF localGenericGF = this.field;
        int i4 = paramGenericGFPoly2.getDegree();
        i4 = paramGenericGFPoly2.getCoefficient(i4);
        i3 = localGenericGF.multiply(i4, n);
        GenericGFPoly localGenericGFPoly3 = this.field.buildMonomial(i2, i3);
        localGenericGFPoly2 = localGenericGFPoly2.addOrSubtract(localGenericGFPoly3);
        localObject4 = paramGenericGFPoly1.multiplyByMonomial(i2, i3);
        paramGenericGFPoly2 = paramGenericGFPoly2.addOrSubtract((GenericGFPoly)localObject4);
      }
      localGenericGFPoly2 = localGenericGFPoly2.multiply((GenericGFPoly)localObject1);
      localObject2 = localGenericGFPoly2.addOrSubtract((GenericGFPoly)localObject2);
      m = paramGenericGFPoly2.getDegree();
      n = paramGenericGFPoly1.getDegree();
    } while (m < n);
    Object localObject5 = new java/lang/IllegalStateException;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = m54207b69.F54207b69_11("RJ0E243E263D282B2B723430383145314D32387C3F3F383C464683584086554D4D5F4A518D5E4A4C5A4C4E514E5753A39968A19C");
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(paramGenericGFPoly2);
    paramGenericGFPoly2 = m54207b69.F54207b69_11("0U7976291C382B27767D");
    ((StringBuilder)localObject1).append(paramGenericGFPoly2);
    ((StringBuilder)localObject1).append(paramGenericGFPoly1);
    paramGenericGFPoly1 = ((StringBuilder)localObject1).toString();
    ((IllegalStateException)localObject5).<init>(paramGenericGFPoly1);
    throw ((Throwable)localObject5);
    paramGenericGFPoly1 = new com/google/zxing/common/reedsolomon/ReedSolomonException;
    paramGenericGFPoly2 = m54207b69.F54207b69_11("M$567C61500D1A5F0B5B4E610F6A4E645A");
    paramGenericGFPoly1.<init>(paramGenericGFPoly2);
    throw paramGenericGFPoly1;
    label383:
    paramGenericGFPoly2 = null;
    int i5 = localObject3.getCoefficient(0);
    if (i5 != 0)
    {
      i5 = this.field.inverse(i5);
      localObject5 = localObject3.multiply(i5);
      paramGenericGFPoly1 = localGenericGFPoly1.multiply(i5);
      return new GenericGFPoly[] { localObject5, paramGenericGFPoly1 };
    }
    paramGenericGFPoly1 = new com/google/zxing/common/reedsolomon/ReedSolomonException;
    paramGenericGFPoly2 = m54207b69.F54207b69_11("s&5550434E4B7755514A4C18211B135F5665176E56685E");
    paramGenericGFPoly1.<init>(paramGenericGFPoly2);
    throw paramGenericGFPoly1;
  }
  
  public void decode(int[] paramArrayOfInt, int paramInt)
  {
    Object localObject1 = new com/google/zxing/common/reedsolomon/GenericGFPoly;
    Object localObject2 = this.field;
    ((GenericGFPoly)localObject1).<init>((GenericGF)localObject2, paramArrayOfInt);
    localObject2 = new int[paramInt];
    int i = 1;
    int j = 0;
    int k = i;
    int m = 0;
    GenericGF localGenericGF1 = null;
    while (m < paramInt)
    {
      GenericGF localGenericGF2 = this.field;
      int n = localGenericGF2.getGeneratorBase() + m;
      int i1 = localGenericGF2.exp(n);
      i1 = ((GenericGFPoly)localObject1).evaluateAt(i1);
      n = paramInt + -1 - m;
      localObject2[n] = i1;
      if (i1 != 0) {
        k = 0;
      }
      m += 1;
    }
    if (k != 0) {
      return;
    }
    localObject1 = new com/google/zxing/common/reedsolomon/GenericGFPoly;
    localGenericGF1 = this.field;
    ((GenericGFPoly)localObject1).<init>(localGenericGF1, (int[])localObject2);
    localObject2 = this.field.buildMonomial(paramInt, i);
    Object localObject3 = runEuclideanAlgorithm((GenericGFPoly)localObject2, (GenericGFPoly)localObject1, paramInt);
    localObject1 = localObject3[0];
    localObject3 = localObject3[i];
    localObject1 = findErrorLocations((GenericGFPoly)localObject1);
    localObject3 = findErrorMagnitudes((GenericGFPoly)localObject3, (int[])localObject1);
    for (;;)
    {
      int i2 = localObject1.length;
      if (j >= i2) {
        return;
      }
      i2 = paramArrayOfInt.length - i;
      localGenericGF1 = this.field;
      k = localObject1[j];
      m = localGenericGF1.log(k);
      i2 -= m;
      if (i2 < 0) {
        break;
      }
      m = paramArrayOfInt[i2];
      k = localObject3[j];
      m = GenericGF.addOrSubtract(m, k);
      paramArrayOfInt[i2] = m;
      j += 1;
    }
    paramArrayOfInt = new com/google/zxing/common/reedsolomon/ReedSolomonException;
    localObject3 = m54207b69.F54207b69_11("gu37151358140C0D210F5E232522210F2B2A2C");
    paramArrayOfInt.<init>((String)localObject3);
    throw paramArrayOfInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.common.reedsolomon.ReedSolomonDecoder
 * JD-Core Version:    0.7.0.1
 */
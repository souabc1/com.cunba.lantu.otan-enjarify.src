package com.google.zxing.pdf417.decoder.ec;

import m54207b69;

final class ModulusPoly
{
  private final int[] coefficients;
  private final ModulusGF field;
  
  public ModulusPoly(ModulusGF paramModulusGF, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    if (i != 0)
    {
      this.field = paramModulusGF;
      int j = paramArrayOfInt.length;
      i = 1;
      if (j > i)
      {
        int k = paramArrayOfInt[0];
        if (k == 0)
        {
          while (i < j)
          {
            k = paramArrayOfInt[i];
            if (k != 0) {
              break;
            }
            i += 1;
          }
          if (i == j)
          {
            paramModulusGF = new int[] { 0 };
            this.coefficients = paramModulusGF;
            break label120;
          }
          j -= i;
          paramModulusGF = new int[j];
          this.coefficients = paramModulusGF;
          k = paramModulusGF.length;
          System.arraycopy(paramArrayOfInt, i, paramModulusGF, 0, k);
          break label120;
        }
      }
      this.coefficients = paramArrayOfInt;
      label120:
      return;
    }
    paramModulusGF = new java/lang/IllegalArgumentException;
    paramModulusGF.<init>();
    throw paramModulusGF;
  }
  
  public ModulusPoly add(ModulusPoly paramModulusPoly)
  {
    Object localObject1 = this.field;
    Object localObject2 = paramModulusPoly.field;
    boolean bool = localObject1.equals(localObject2);
    if (bool)
    {
      bool = isZero();
      if (bool) {
        return paramModulusPoly;
      }
      bool = paramModulusPoly.isZero();
      if (bool) {
        return this;
      }
      localObject1 = this.coefficients;
      paramModulusPoly = paramModulusPoly.coefficients;
      int i = localObject1.length;
      int j = paramModulusPoly.length;
      if (i <= j)
      {
        Object localObject3 = localObject1;
        localObject1 = paramModulusPoly;
        paramModulusPoly = localObject3;
      }
      i = localObject1.length;
      localObject2 = new int[i];
      j = localObject1.length;
      int k = paramModulusPoly.length;
      j -= k;
      System.arraycopy(localObject1, 0, localObject2, 0, j);
      k = j;
      for (;;)
      {
        int m = localObject1.length;
        if (k >= m) {
          break;
        }
        ModulusGF localModulusGF = this.field;
        int n = k - j;
        n = paramModulusPoly[n];
        int i1 = localObject1[k];
        m = localModulusGF.add(n, i1);
        localObject2[k] = m;
        k += 1;
      }
      paramModulusPoly = new com/google/zxing/pdf417/decoder/ec/ModulusPoly;
      localObject1 = this.field;
      paramModulusPoly.<init>((ModulusGF)localObject1, (int[])localObject2);
      return paramModulusPoly;
    }
    paramModulusPoly = new java/lang/IllegalArgumentException;
    localObject1 = m54207b69.F54207b69_11("~`2D100618101A19371715231E4C111D4F1E2026531C162C1C582C1B28215D4B2E24362E38374C4C672E322F3730");
    paramModulusPoly.<init>((String)localObject1);
    throw paramModulusPoly;
  }
  
  public int evaluateAt(int paramInt)
  {
    int i = 0;
    if (paramInt == 0) {
      return getCoefficient(0);
    }
    int j = 1;
    Object localObject;
    if (paramInt == j)
    {
      int[] arrayOfInt1 = this.coefficients;
      j = arrayOfInt1.length;
      k = 0;
      arrayOfInt2 = null;
      while (i < j)
      {
        int m = arrayOfInt1[i];
        localObject = this.field;
        k = ((ModulusGF)localObject).add(k, m);
        i += 1;
      }
      return k;
    }
    int[] arrayOfInt2 = this.coefficients;
    i = arrayOfInt2[0];
    int k = arrayOfInt2.length;
    while (j < k)
    {
      ModulusGF localModulusGF = this.field;
      i = localModulusGF.multiply(paramInt, i);
      localObject = this.coefficients;
      int n = localObject[j];
      i = localModulusGF.add(i, n);
      j += 1;
    }
    return i;
  }
  
  public int getCoefficient(int paramInt)
  {
    int[] arrayOfInt = this.coefficients;
    int i = arrayOfInt.length + -1 - paramInt;
    return arrayOfInt[i];
  }
  
  public int[] getCoefficients()
  {
    return this.coefficients;
  }
  
  public int getDegree()
  {
    return this.coefficients.length + -1;
  }
  
  public boolean isZero()
  {
    int[] arrayOfInt = this.coefficients;
    boolean bool = false;
    int i = arrayOfInt[0];
    if (i == 0) {
      bool = true;
    }
    return bool;
  }
  
  public ModulusPoly multiply(int paramInt)
  {
    if (paramInt == 0) {
      return this.field.getZero();
    }
    int i = 1;
    if (paramInt == i) {
      return this;
    }
    Object localObject = this.coefficients;
    i = localObject.length;
    int[] arrayOfInt1 = new int[i];
    int j = 0;
    while (j < i)
    {
      ModulusGF localModulusGF = this.field;
      int[] arrayOfInt2 = this.coefficients;
      int k = arrayOfInt2[j];
      int m = localModulusGF.multiply(k, paramInt);
      arrayOfInt1[j] = m;
      j += 1;
    }
    ModulusPoly localModulusPoly = new com/google/zxing/pdf417/decoder/ec/ModulusPoly;
    localObject = this.field;
    localModulusPoly.<init>((ModulusGF)localObject, arrayOfInt1);
    return localModulusPoly;
  }
  
  public ModulusPoly multiply(ModulusPoly paramModulusPoly)
  {
    Object localObject = this.field;
    ModulusGF localModulusGF1 = paramModulusPoly.field;
    boolean bool = localObject.equals(localModulusGF1);
    if (bool)
    {
      bool = isZero();
      if (!bool)
      {
        bool = paramModulusPoly.isZero();
        if (!bool)
        {
          localObject = this.coefficients;
          int i = localObject.length;
          paramModulusPoly = paramModulusPoly.coefficients;
          int j = paramModulusPoly.length;
          int k = i + j + -1;
          int[] arrayOfInt = new int[k];
          int m = 0;
          while (m < i)
          {
            int n = localObject[m];
            int i1 = 0;
            while (i1 < j)
            {
              int i2 = m + i1;
              ModulusGF localModulusGF2 = this.field;
              int i3 = arrayOfInt[i2];
              int i4 = paramModulusPoly[i1];
              i4 = localModulusGF2.multiply(n, i4);
              int i5 = localModulusGF2.add(i3, i4);
              arrayOfInt[i2] = i5;
              i1 += 1;
            }
            m += 1;
          }
          paramModulusPoly = new com/google/zxing/pdf417/decoder/ec/ModulusPoly;
          localObject = this.field;
          paramModulusPoly.<init>((ModulusGF)localObject, arrayOfInt);
          return paramModulusPoly;
        }
      }
      return this.field.getZero();
    }
    paramModulusPoly = new java/lang/IllegalArgumentException;
    localObject = m54207b69.F54207b69_11("~`2D100618101A19371715231E4C111D4F1E2026531C162C1C582C1B28215D4B2E24362E38374C4C672E322F3730");
    paramModulusPoly.<init>((String)localObject);
    throw paramModulusPoly;
  }
  
  public ModulusPoly multiplyByMonomial(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= 0)
    {
      if (paramInt2 == 0) {
        return this.field.getZero();
      }
      Object localObject1 = this.coefficients;
      int i = localObject1.length;
      paramInt1 += i;
      localObject2 = new int[paramInt1];
      int j = 0;
      while (j < i)
      {
        ModulusGF localModulusGF = this.field;
        int[] arrayOfInt = this.coefficients;
        int k = arrayOfInt[j];
        int m = localModulusGF.multiply(k, paramInt2);
        localObject2[j] = m;
        j += 1;
      }
      ModulusPoly localModulusPoly = new com/google/zxing/pdf417/decoder/ec/ModulusPoly;
      localObject1 = this.field;
      localModulusPoly.<init>((ModulusGF)localObject1, (int[])localObject2);
      return localModulusPoly;
    }
    Object localObject2 = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject2).<init>();
    throw ((Throwable)localObject2);
  }
  
  public ModulusPoly negative()
  {
    Object localObject = this.coefficients;
    int i = localObject.length;
    int[] arrayOfInt1 = new int[i];
    ModulusGF localModulusGF1 = null;
    int j = 0;
    while (j < i)
    {
      ModulusGF localModulusGF2 = this.field;
      int[] arrayOfInt2 = this.coefficients;
      int k = arrayOfInt2[j];
      int m = localModulusGF2.subtract(0, k);
      arrayOfInt1[j] = m;
      j += 1;
    }
    localObject = new com/google/zxing/pdf417/decoder/ec/ModulusPoly;
    localModulusGF1 = this.field;
    ((ModulusPoly)localObject).<init>(localModulusGF1, arrayOfInt1);
    return localObject;
  }
  
  public ModulusPoly subtract(ModulusPoly paramModulusPoly)
  {
    Object localObject = this.field;
    ModulusGF localModulusGF = paramModulusPoly.field;
    boolean bool = localObject.equals(localModulusGF);
    if (bool)
    {
      bool = paramModulusPoly.isZero();
      if (bool) {
        return this;
      }
      paramModulusPoly = paramModulusPoly.negative();
      return add(paramModulusPoly);
    }
    paramModulusPoly = new java/lang/IllegalArgumentException;
    localObject = m54207b69.F54207b69_11("~`2D100618101A19371715231E4C111D4F1E2026531C162C1C582C1B28215D4B2E24362E38374C4C672E322F3730");
    paramModulusPoly.<init>((String)localObject);
    throw paramModulusPoly;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int i = getDegree() * 8;
    localStringBuilder.<init>(i);
    i = getDegree();
    while (i >= 0)
    {
      int j = getCoefficient(i);
      if (j != 0)
      {
        String str1;
        if (j < 0)
        {
          str1 = " - ";
          localStringBuilder.append(str1);
          j = -j;
        }
        else
        {
          k = localStringBuilder.length();
          if (k > 0)
          {
            str1 = " + ";
            localStringBuilder.append(str1);
          }
        }
        int k = 1;
        if ((i == 0) || (j != k)) {
          localStringBuilder.append(j);
        }
        if (i != 0) {
          if (i == k)
          {
            j = 120;
            localStringBuilder.append(j);
          }
          else
          {
            String str2 = "x^";
            localStringBuilder.append(str2);
            localStringBuilder.append(i);
          }
        }
      }
      i += -1;
    }
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.pdf417.decoder.ec.ModulusPoly
 * JD-Core Version:    0.7.0.1
 */
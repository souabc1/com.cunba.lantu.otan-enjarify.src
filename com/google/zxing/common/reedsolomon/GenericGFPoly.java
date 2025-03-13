package com.google.zxing.common.reedsolomon;

import m54207b69;

final class GenericGFPoly
{
  private final int[] coefficients;
  private final GenericGF field;
  
  public GenericGFPoly(GenericGF paramGenericGF, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    if (i != 0)
    {
      this.field = paramGenericGF;
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
            paramGenericGF = new int[] { 0 };
            this.coefficients = paramGenericGF;
            break label120;
          }
          j -= i;
          paramGenericGF = new int[j];
          this.coefficients = paramGenericGF;
          k = paramGenericGF.length;
          System.arraycopy(paramArrayOfInt, i, paramGenericGF, 0, k);
          break label120;
        }
      }
      this.coefficients = paramArrayOfInt;
      label120:
      return;
    }
    paramGenericGF = new java/lang/IllegalArgumentException;
    paramGenericGF.<init>();
    throw paramGenericGF;
  }
  
  public GenericGFPoly addOrSubtract(GenericGFPoly paramGenericGFPoly)
  {
    Object localObject1 = this.field;
    Object localObject2 = paramGenericGFPoly.field;
    boolean bool = localObject1.equals(localObject2);
    if (bool)
    {
      bool = isZero();
      if (bool) {
        return paramGenericGFPoly;
      }
      bool = paramGenericGFPoly.isZero();
      if (bool) {
        return this;
      }
      localObject1 = this.coefficients;
      paramGenericGFPoly = paramGenericGFPoly.coefficients;
      int i = localObject1.length;
      int j = paramGenericGFPoly.length;
      if (i <= j)
      {
        Object localObject3 = localObject1;
        localObject1 = paramGenericGFPoly;
        paramGenericGFPoly = localObject3;
      }
      i = localObject1.length;
      localObject2 = new int[i];
      j = localObject1.length;
      int k = paramGenericGFPoly.length;
      j -= k;
      System.arraycopy(localObject1, 0, localObject2, 0, j);
      k = j;
      for (;;)
      {
        int m = localObject1.length;
        if (k >= m) {
          break;
        }
        m = k - j;
        m = paramGenericGFPoly[m];
        int n = localObject1[k];
        m = GenericGF.addOrSubtract(m, n);
        localObject2[k] = m;
        k += 1;
      }
      paramGenericGFPoly = new com/google/zxing/common/reedsolomon/GenericGFPoly;
      localObject1 = this.field;
      paramGenericGFPoly.<init>((GenericGF)localObject1, (int[])localObject2);
      return paramGenericGFPoly;
    }
    paramGenericGFPoly = new java/lang/IllegalArgumentException;
    localObject1 = m54207b69.F54207b69_11("187F5E58604E5661868671615F4D58266B6729686A602D66706676326675727B379F7E78806E7681A6A641887C89818A");
    paramGenericGFPoly.<init>((String)localObject1);
    throw paramGenericGFPoly;
  }
  
  public GenericGFPoly[] divide(GenericGFPoly paramGenericGFPoly)
  {
    Object localObject = this.field;
    GenericGF localGenericGF1 = paramGenericGFPoly.field;
    boolean bool1 = localObject.equals(localGenericGF1);
    if (bool1)
    {
      bool1 = paramGenericGFPoly.isZero();
      if (!bool1)
      {
        localObject = this.field.getZero();
        int i = paramGenericGFPoly.getDegree();
        i = paramGenericGFPoly.getCoefficient(i);
        i = this.field.inverse(i);
        GenericGFPoly localGenericGFPoly2;
        for (GenericGFPoly localGenericGFPoly1 = this;; localGenericGFPoly1 = localGenericGFPoly1.addOrSubtract(localGenericGFPoly2))
        {
          int j = localGenericGFPoly1.getDegree();
          int m = paramGenericGFPoly.getDegree();
          if (j < m) {
            break;
          }
          boolean bool2 = localGenericGFPoly1.isZero();
          if (bool2) {
            break;
          }
          int k = localGenericGFPoly1.getDegree();
          m = paramGenericGFPoly.getDegree();
          k -= m;
          GenericGF localGenericGF2 = this.field;
          int n = localGenericGFPoly1.getDegree();
          n = localGenericGFPoly1.getCoefficient(n);
          m = localGenericGF2.multiply(n, i);
          localGenericGFPoly2 = paramGenericGFPoly.multiplyByMonomial(k, m);
          GenericGF localGenericGF3 = this.field;
          GenericGFPoly localGenericGFPoly3 = localGenericGF3.buildMonomial(k, m);
          localObject = ((GenericGFPoly)localObject).addOrSubtract(localGenericGFPoly3);
        }
        return new GenericGFPoly[] { localObject, localGenericGFPoly1 };
      }
      paramGenericGFPoly = new java/lang/IllegalArgumentException;
      localObject = m54207b69.F54207b69_11("g3775B475D5B5B1958521C0D");
      paramGenericGFPoly.<init>((String)localObject);
      throw paramGenericGFPoly;
    }
    paramGenericGFPoly = new java/lang/IllegalArgumentException;
    localObject = m54207b69.F54207b69_11("187F5E58604E5661868671615F4D58266B6729686A602D66706676326675727B379F7E78806E7681A6A641887C89818A");
    paramGenericGFPoly.<init>((String)localObject);
    throw paramGenericGFPoly;
  }
  
  public int evaluateAt(int paramInt)
  {
    int i = 0;
    if (paramInt == 0) {
      return getCoefficient(0);
    }
    int j = 1;
    int m;
    if (paramInt == j)
    {
      int[] arrayOfInt1 = this.coefficients;
      j = arrayOfInt1.length;
      k = 0;
      arrayOfInt2 = null;
      while (i < j)
      {
        m = arrayOfInt1[i];
        k = GenericGF.addOrSubtract(k, m);
        i += 1;
      }
      return k;
    }
    int[] arrayOfInt2 = this.coefficients;
    i = arrayOfInt2[0];
    int k = arrayOfInt2.length;
    while (j < k)
    {
      i = this.field.multiply(paramInt, i);
      int[] arrayOfInt3 = this.coefficients;
      m = arrayOfInt3[j];
      i = GenericGF.addOrSubtract(i, m);
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
  
  public GenericGFPoly multiply(int paramInt)
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
      GenericGF localGenericGF = this.field;
      int[] arrayOfInt2 = this.coefficients;
      int k = arrayOfInt2[j];
      int m = localGenericGF.multiply(k, paramInt);
      arrayOfInt1[j] = m;
      j += 1;
    }
    GenericGFPoly localGenericGFPoly = new com/google/zxing/common/reedsolomon/GenericGFPoly;
    localObject = this.field;
    localGenericGFPoly.<init>((GenericGF)localObject, arrayOfInt1);
    return localGenericGFPoly;
  }
  
  public GenericGFPoly multiply(GenericGFPoly paramGenericGFPoly)
  {
    Object localObject = this.field;
    GenericGF localGenericGF1 = paramGenericGFPoly.field;
    boolean bool = localObject.equals(localGenericGF1);
    if (bool)
    {
      bool = isZero();
      if (!bool)
      {
        bool = paramGenericGFPoly.isZero();
        if (!bool)
        {
          localObject = this.coefficients;
          int i = localObject.length;
          paramGenericGFPoly = paramGenericGFPoly.coefficients;
          int j = paramGenericGFPoly.length;
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
              int i3 = arrayOfInt[i2];
              GenericGF localGenericGF2 = this.field;
              int i4 = paramGenericGFPoly[i1];
              int i5 = localGenericGF2.multiply(n, i4);
              i3 = GenericGF.addOrSubtract(i3, i5);
              arrayOfInt[i2] = i3;
              i1 += 1;
            }
            m += 1;
          }
          paramGenericGFPoly = new com/google/zxing/common/reedsolomon/GenericGFPoly;
          localObject = this.field;
          paramGenericGFPoly.<init>((GenericGF)localObject, arrayOfInt);
          return paramGenericGFPoly;
        }
      }
      return this.field.getZero();
    }
    paramGenericGFPoly = new java/lang/IllegalArgumentException;
    localObject = m54207b69.F54207b69_11("187F5E58604E5661868671615F4D58266B6729686A602D66706676326675727B379F7E78806E7681A6A641887C89818A");
    paramGenericGFPoly.<init>((String)localObject);
    throw paramGenericGFPoly;
  }
  
  public GenericGFPoly multiplyByMonomial(int paramInt1, int paramInt2)
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
        GenericGF localGenericGF = this.field;
        int[] arrayOfInt = this.coefficients;
        int k = arrayOfInt[j];
        int m = localGenericGF.multiply(k, paramInt2);
        localObject2[j] = m;
        j += 1;
      }
      GenericGFPoly localGenericGFPoly = new com/google/zxing/common/reedsolomon/GenericGFPoly;
      localObject1 = this.field;
      localGenericGFPoly.<init>((GenericGF)localObject1, (int[])localObject2);
      return localGenericGFPoly;
    }
    Object localObject2 = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject2).<init>();
    throw ((Throwable)localObject2);
  }
  
  public String toString()
  {
    boolean bool = isZero();
    if (bool) {
      return "0";
    }
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
          k = getDegree();
          if (i == k) {
            str1 = "-";
          } else {
            str1 = " - ";
          }
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
        char c;
        if ((i == 0) || (j != k))
        {
          Object localObject = this.field;
          j = ((GenericGF)localObject).log(j);
          if (j == 0) {}
          for (j = 49;; c = 'a')
          {
            localStringBuilder.append(j);
            break label195;
            if (j != k) {
              break;
            }
          }
          localObject = "a^";
          localStringBuilder.append((String)localObject);
          localStringBuilder.append(c);
        }
        label195:
        if (i != 0) {
          if (i == k)
          {
            c = 'x';
            localStringBuilder.append(c);
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
 * Qualified Name:     com.google.zxing.common.reedsolomon.GenericGFPoly
 * JD-Core Version:    0.7.0.1
 */
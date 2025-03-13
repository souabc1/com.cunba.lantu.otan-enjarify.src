package com.google.zxing.pdf417.decoder.ec;

public final class ModulusGF
{
  public static final ModulusGF PDF417_GF;
  private final int[] expTable;
  private final int[] logTable;
  private final int modulus;
  private final ModulusPoly one;
  private final ModulusPoly zero;
  
  static
  {
    ModulusGF localModulusGF = new com/google/zxing/pdf417/decoder/ec/ModulusGF;
    localModulusGF.<init>(929, 3);
    PDF417_GF = localModulusGF;
  }
  
  private ModulusGF(int paramInt1, int paramInt2)
  {
    this.modulus = paramInt1;
    int[] arrayOfInt1 = new int[paramInt1];
    this.expTable = arrayOfInt1;
    arrayOfInt1 = new int[paramInt1];
    this.logTable = arrayOfInt1;
    int i = 1;
    int j = i;
    int k = 0;
    int[] arrayOfInt2 = null;
    while (k < paramInt1)
    {
      int[] arrayOfInt3 = this.expTable;
      arrayOfInt3[k] = j;
      j = j * paramInt2 % paramInt1;
      k += 1;
    }
    paramInt2 = 0;
    int[] arrayOfInt4 = null;
    for (;;)
    {
      k = paramInt1 + -1;
      if (paramInt2 >= k) {
        break;
      }
      arrayOfInt2 = this.logTable;
      int[] arrayOfInt5 = this.expTable;
      j = arrayOfInt5[paramInt2];
      arrayOfInt2[j] = paramInt2;
      paramInt2 += 1;
    }
    ModulusPoly localModulusPoly = new com/google/zxing/pdf417/decoder/ec/ModulusPoly;
    arrayOfInt4 = new int[] { 0 };
    localModulusPoly.<init>(this, arrayOfInt4);
    this.zero = localModulusPoly;
    localModulusPoly = new com/google/zxing/pdf417/decoder/ec/ModulusPoly;
    arrayOfInt4 = new int[] { i };
    localModulusPoly.<init>(this, arrayOfInt4);
    this.one = localModulusPoly;
  }
  
  public int add(int paramInt1, int paramInt2)
  {
    paramInt1 += paramInt2;
    paramInt2 = this.modulus;
    return paramInt1 % paramInt2;
  }
  
  public ModulusPoly buildMonomial(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= 0)
    {
      if (paramInt2 == 0) {
        return this.zero;
      }
      localObject = new int[paramInt1 + 1];
      localObject[0] = paramInt2;
      ModulusPoly localModulusPoly = new com/google/zxing/pdf417/decoder/ec/ModulusPoly;
      localModulusPoly.<init>(this, (int[])localObject);
      return localModulusPoly;
    }
    Object localObject = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject).<init>();
    throw ((Throwable)localObject);
  }
  
  public int exp(int paramInt)
  {
    return this.expTable[paramInt];
  }
  
  public ModulusPoly getOne()
  {
    return this.one;
  }
  
  public int getSize()
  {
    return this.modulus;
  }
  
  public ModulusPoly getZero()
  {
    return this.zero;
  }
  
  public int inverse(int paramInt)
  {
    if (paramInt != 0)
    {
      int[] arrayOfInt = this.expTable;
      int i = this.modulus;
      paramInt = this.logTable[paramInt];
      i = i - paramInt + -1;
      return arrayOfInt[i];
    }
    ArithmeticException localArithmeticException = new java/lang/ArithmeticException;
    localArithmeticException.<init>();
    throw localArithmeticException;
  }
  
  public int log(int paramInt)
  {
    if (paramInt != 0) {
      return this.logTable[paramInt];
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>();
    throw localIllegalArgumentException;
  }
  
  public int multiply(int paramInt1, int paramInt2)
  {
    if ((paramInt1 != 0) && (paramInt2 != 0))
    {
      int[] arrayOfInt1 = this.expTable;
      int[] arrayOfInt2 = this.logTable;
      paramInt1 = arrayOfInt2[paramInt1];
      paramInt2 = arrayOfInt2[paramInt2];
      paramInt1 += paramInt2;
      paramInt2 = this.modulus + -1;
      paramInt1 %= paramInt2;
      return arrayOfInt1[paramInt1];
    }
    return 0;
  }
  
  public int subtract(int paramInt1, int paramInt2)
  {
    int i = this.modulus;
    return (paramInt1 + i - paramInt2) % i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.pdf417.decoder.ec.ModulusGF
 * JD-Core Version:    0.7.0.1
 */
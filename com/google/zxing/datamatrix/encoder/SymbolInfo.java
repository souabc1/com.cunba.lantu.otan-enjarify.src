package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;
import m54207b69;

public class SymbolInfo
{
  static final SymbolInfo[] PROD_SYMBOLS;
  private static SymbolInfo[] symbols;
  private final int dataCapacity;
  private final int dataRegions;
  private final int errorCodewords;
  public final int matrixHeight;
  public final int matrixWidth;
  private final boolean rectangular;
  private final int rsBlockData;
  private final int rsBlockError;
  
  static
  {
    SymbolInfo[] arrayOfSymbolInfo = new SymbolInfo[30];
    SymbolInfo localSymbolInfo = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    Object localObject = localSymbolInfo;
    localSymbolInfo.<init>(false, 3, 5, 8, 8, 1);
    arrayOfSymbolInfo[0] = localSymbolInfo;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    ((SymbolInfo)localObject).<init>(false, 5, 7, 10, 10, 1);
    arrayOfSymbolInfo[1] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    int i = 1;
    ((SymbolInfo)localObject).<init>(true, 5, 7, 16, 6, i);
    arrayOfSymbolInfo[2] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    ((SymbolInfo)localObject).<init>(false, 8, 10, 12, 12, i);
    arrayOfSymbolInfo[3] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    int j = 14;
    ((SymbolInfo)localObject).<init>(true, 10, 11, j, 6, 2);
    arrayOfSymbolInfo[4] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    i = 1;
    ((SymbolInfo)localObject).<init>(false, 12, 12, j, 14, i);
    arrayOfSymbolInfo[5] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    int k = 14;
    ((SymbolInfo)localObject).<init>(true, 16, k, 24, 10, i);
    arrayOfSymbolInfo[6] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    ((SymbolInfo)localObject).<init>(false, 18, k, 16, 16, i);
    arrayOfSymbolInfo[7] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    int m = 22;
    k = 18;
    ((SymbolInfo)localObject).<init>(false, m, k, 18, 18, i);
    arrayOfSymbolInfo[8] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    ((SymbolInfo)localObject).<init>(true, m, k, 16, 10, 2);
    arrayOfSymbolInfo[9] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    ((SymbolInfo)localObject).<init>(false, 30, 20, 20, 20, 1);
    arrayOfSymbolInfo[10] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    k = 24;
    ((SymbolInfo)localObject).<init>(true, 32, k, 16, 14, 2);
    arrayOfSymbolInfo[11] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    i = 1;
    ((SymbolInfo)localObject).<init>(false, 36, k, 22, 22, i);
    arrayOfSymbolInfo[12] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    k = 28;
    ((SymbolInfo)localObject).<init>(false, 44, k, 24, 24, i);
    arrayOfSymbolInfo[13] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    int n = 14;
    ((SymbolInfo)localObject).<init>(true, 49, k, 22, n, 2);
    arrayOfSymbolInfo[14] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    i = 4;
    ((SymbolInfo)localObject).<init>(false, 62, 36, 14, n, i);
    arrayOfSymbolInfo[15] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    ((SymbolInfo)localObject).<init>(false, 86, 42, 16, 16, i);
    arrayOfSymbolInfo[16] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    ((SymbolInfo)localObject).<init>(false, 114, 48, 18, 18, i);
    arrayOfSymbolInfo[17] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    ((SymbolInfo)localObject).<init>(false, 144, 56, 20, 20, i);
    arrayOfSymbolInfo[18] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    ((SymbolInfo)localObject).<init>(false, 174, 68, 22, 22, i);
    arrayOfSymbolInfo[19] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    ((SymbolInfo)localObject).<init>(false, 204, 84, 24, 24, i, 102, 42);
    arrayOfSymbolInfo[20] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    i = 16;
    ((SymbolInfo)localObject).<init>(false, 280, 112, 14, 14, i, 140, 56);
    arrayOfSymbolInfo[21] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    ((SymbolInfo)localObject).<init>(false, 368, 144, 16, 16, i, 92, 36);
    arrayOfSymbolInfo[22] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    ((SymbolInfo)localObject).<init>(false, 456, 192, 18, 18, i, 114, 48);
    arrayOfSymbolInfo[23] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    ((SymbolInfo)localObject).<init>(false, 576, 224, 20, 20, i, 144, 56);
    arrayOfSymbolInfo[24] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    ((SymbolInfo)localObject).<init>(false, 696, 272, 22, 22, i, 174, 68);
    arrayOfSymbolInfo[25] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    ((SymbolInfo)localObject).<init>(false, 816, 336, 24, 24, i, 136, 56);
    arrayOfSymbolInfo[26] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    i = 36;
    ((SymbolInfo)localObject).<init>(false, 1050, 408, 18, 18, i, 175, 68);
    arrayOfSymbolInfo[27] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/SymbolInfo;
    ((SymbolInfo)localObject).<init>(false, 1304, 496, 20, 20, i, 163, 62);
    arrayOfSymbolInfo[28] = localObject;
    localObject = new com/google/zxing/datamatrix/encoder/DataMatrixSymbolInfo144;
    ((DataMatrixSymbolInfo144)localObject).<init>();
    arrayOfSymbolInfo[29] = localObject;
    PROD_SYMBOLS = arrayOfSymbolInfo;
    symbols = arrayOfSymbolInfo;
  }
  
  public SymbolInfo(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    this(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt1, paramInt2);
  }
  
  public SymbolInfo(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    this.rectangular = paramBoolean;
    this.dataCapacity = paramInt1;
    this.errorCodewords = paramInt2;
    this.matrixWidth = paramInt3;
    this.matrixHeight = paramInt4;
    this.dataRegions = paramInt5;
    this.rsBlockData = paramInt6;
    this.rsBlockError = paramInt7;
  }
  
  private int getHorizontalDataRegions()
  {
    int i = this.dataRegions;
    int j = 1;
    if (i != j)
    {
      j = 2;
      if (i != j)
      {
        int k = 4;
        if (i != k)
        {
          j = 16;
          if (i != j)
          {
            j = 36;
            if (i == j) {
              return 6;
            }
            IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
            String str = m54207b69.F54207b69_11("-e26050D0E0E164B140C140B140C521F1C1C27571E241D1D172F5E241E611E223024663923263130323E");
            localIllegalStateException.<init>(str);
            throw localIllegalStateException;
          }
          return k;
        }
      }
    }
    return j;
  }
  
  private int getVerticalDataRegions()
  {
    int i = this.dataRegions;
    int j = 1;
    if (i != j)
    {
      int k = 2;
      if (i != k)
      {
        j = 4;
        if (i != j)
        {
          k = 16;
          if (i != k)
          {
            j = 36;
            if (i == j) {
              return 6;
            }
            IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
            String str = m54207b69.F54207b69_11("-e26050D0E0E164B140C140B140C521F1C1C27571E241D1D172F5E241E611E223024663923263130323E");
            localIllegalStateException.<init>(str);
            throw localIllegalStateException;
          }
          return j;
        }
        return k;
      }
    }
    return j;
  }
  
  public static SymbolInfo lookup(int paramInt)
  {
    SymbolShapeHint localSymbolShapeHint = SymbolShapeHint.FORCE_NONE;
    return lookup(paramInt, localSymbolShapeHint, true);
  }
  
  public static SymbolInfo lookup(int paramInt, SymbolShapeHint paramSymbolShapeHint)
  {
    return lookup(paramInt, paramSymbolShapeHint, true);
  }
  
  public static SymbolInfo lookup(int paramInt, SymbolShapeHint paramSymbolShapeHint, Dimension paramDimension1, Dimension paramDimension2, boolean paramBoolean)
  {
    SymbolInfo[] arrayOfSymbolInfo = symbols;
    int i = arrayOfSymbolInfo.length;
    int j = 0;
    while (j < i)
    {
      SymbolInfo localSymbolInfo = arrayOfSymbolInfo[j];
      SymbolShapeHint localSymbolShapeHint = SymbolShapeHint.FORCE_SQUARE;
      boolean bool;
      if (paramSymbolShapeHint == localSymbolShapeHint)
      {
        bool = localSymbolInfo.rectangular;
        if (bool) {}
      }
      else
      {
        localSymbolShapeHint = SymbolShapeHint.FORCE_RECTANGLE;
        if (paramSymbolShapeHint == localSymbolShapeHint)
        {
          bool = localSymbolInfo.rectangular;
          if (!bool) {}
        }
        else
        {
          int k;
          int m;
          if (paramDimension1 != null)
          {
            k = localSymbolInfo.getSymbolWidth();
            m = paramDimension1.getWidth();
            if (k >= m)
            {
              k = localSymbolInfo.getSymbolHeight();
              m = paramDimension1.getHeight();
              if (k < m) {}
            }
          }
          else if (paramDimension2 != null)
          {
            k = localSymbolInfo.getSymbolWidth();
            m = paramDimension2.getWidth();
            if (k <= m)
            {
              k = localSymbolInfo.getSymbolHeight();
              m = paramDimension2.getHeight();
              if (k > m) {}
            }
          }
          else
          {
            k = localSymbolInfo.dataCapacity;
            if (paramInt <= k) {
              return localSymbolInfo;
            }
          }
        }
      }
      j += 1;
    }
    if (!paramBoolean) {
      return null;
    }
    paramSymbolShapeHint = new java/lang/IllegalArgumentException;
    paramDimension1 = new java/lang/StringBuilder;
    paramDimension1.<init>();
    paramDimension2 = m54207b69.F54207b69_11("~v35181A54065B1626201B602262121D2A242A2C692B191A2E302A2D362F352075223F39257A403D293D473D30822F4C42864C4538394C474A908F6C523E549454595355445D49584C949F");
    paramDimension1.append(paramDimension2);
    paramDimension1.append(paramInt);
    String str = paramDimension1.toString();
    paramSymbolShapeHint.<init>(str);
    throw paramSymbolShapeHint;
  }
  
  private static SymbolInfo lookup(int paramInt, SymbolShapeHint paramSymbolShapeHint, boolean paramBoolean)
  {
    return lookup(paramInt, paramSymbolShapeHint, null, null, paramBoolean);
  }
  
  public static SymbolInfo lookup(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    SymbolShapeHint localSymbolShapeHint;
    if (paramBoolean1) {
      localSymbolShapeHint = SymbolShapeHint.FORCE_NONE;
    } else {
      localSymbolShapeHint = SymbolShapeHint.FORCE_SQUARE;
    }
    return lookup(paramInt, localSymbolShapeHint, paramBoolean2);
  }
  
  public static void overrideSymbolSet(SymbolInfo[] paramArrayOfSymbolInfo)
  {
    symbols = paramArrayOfSymbolInfo;
  }
  
  public int getCodewordCount()
  {
    int i = this.dataCapacity;
    int j = this.errorCodewords;
    return i + j;
  }
  
  public final int getDataCapacity()
  {
    return this.dataCapacity;
  }
  
  public int getDataLengthForInterleavedBlock(int paramInt)
  {
    return this.rsBlockData;
  }
  
  public final int getErrorCodewords()
  {
    return this.errorCodewords;
  }
  
  public final int getErrorLengthForInterleavedBlock(int paramInt)
  {
    return this.rsBlockError;
  }
  
  public int getInterleavedBlockCount()
  {
    int i = this.dataCapacity;
    int j = this.rsBlockData;
    return i / j;
  }
  
  public final int getSymbolDataHeight()
  {
    int i = getVerticalDataRegions();
    int j = this.matrixHeight;
    return i * j;
  }
  
  public final int getSymbolDataWidth()
  {
    int i = getHorizontalDataRegions();
    int j = this.matrixWidth;
    return i * j;
  }
  
  public final int getSymbolHeight()
  {
    int i = getSymbolDataHeight();
    int j = getVerticalDataRegions() * 2;
    return i + j;
  }
  
  public final int getSymbolWidth()
  {
    int i = getSymbolDataWidth();
    int j = getHorizontalDataRegions() * 2;
    return i + j;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    boolean bool = this.rectangular;
    if (bool) {
      str1 = m54207b69.F54207b69_11("@p2216150715231D0C241A0C5B2F162B212F2D5C");
    } else {
      str1 = m54207b69.F54207b69_11("U^0D302D42304084142F3C463C3E71");
    }
    localStringBuilder.append(str1);
    String str1 = m54207b69.F54207b69_11("AR723735293777263E3D4447477E");
    localStringBuilder.append(str1);
    int i = this.matrixWidth;
    localStringBuilder.append(i);
    i = 120;
    localStringBuilder.append(i);
    int k = this.matrixHeight;
    localStringBuilder.append(k);
    String str2 = m54207b69.F54207b69_11("1;171C4A455A5E5A5E23515C4C6A28");
    localStringBuilder.append(str2);
    k = getSymbolWidth();
    localStringBuilder.append(k);
    localStringBuilder.append(i);
    k = getSymbolHeight();
    localStringBuilder.append(k);
    str2 = m54207b69.F54207b69_11("R11D12444B60586464195E5A505C1E50675B6523");
    localStringBuilder.append(str2);
    k = getSymbolDataWidth();
    localStringBuilder.append(k);
    localStringBuilder.append(i);
    int j = getSymbolDataHeight();
    localStringBuilder.append(j);
    str1 = m54207b69.F54207b69_11("/11D12546159594C654B5E4C1C");
    localStringBuilder.append(str1);
    j = this.dataCapacity;
    localStringBuilder.append(j);
    localStringBuilder.append('+');
    j = this.errorCodewords;
    localStringBuilder.append(j);
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.datamatrix.encoder.SymbolInfo
 * JD-Core Version:    0.7.0.1
 */
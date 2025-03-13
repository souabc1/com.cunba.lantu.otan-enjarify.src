package com.google.zxing.qrcode.encoder;

import com.google.zxing.WriterException;
import com.google.zxing.common.ECIEncoderSet;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import m54207b69;

final class MinimalEncoder
{
  private final ErrorCorrectionLevel ecLevel;
  private final ECIEncoderSet encoders;
  private final boolean isGS1;
  private final String stringToEncode;
  
  public MinimalEncoder(String paramString, Charset paramCharset, boolean paramBoolean, ErrorCorrectionLevel paramErrorCorrectionLevel)
  {
    this.stringToEncode = paramString;
    this.isGS1 = paramBoolean;
    ECIEncoderSet localECIEncoderSet = new com/google/zxing/common/ECIEncoderSet;
    localECIEncoderSet.<init>(paramString, paramCharset, -1);
    this.encoders = localECIEncoderSet;
    this.ecLevel = paramErrorCorrectionLevel;
  }
  
  public static MinimalEncoder.ResultList encode(String paramString, Version paramVersion, Charset paramCharset, boolean paramBoolean, ErrorCorrectionLevel paramErrorCorrectionLevel)
  {
    MinimalEncoder localMinimalEncoder = new com/google/zxing/qrcode/encoder/MinimalEncoder;
    localMinimalEncoder.<init>(paramString, paramCharset, paramBoolean, paramErrorCorrectionLevel);
    return localMinimalEncoder.encode(paramVersion);
  }
  
  public static int getCompactedOrdinal(Mode paramMode)
  {
    int i = 0;
    IllegalStateException localIllegalStateException = null;
    if (paramMode == null) {
      return 0;
    }
    Object localObject = MinimalEncoder.1.$SwitchMap$com$google$zxing$qrcode$decoder$Mode;
    int j = paramMode.ordinal();
    int k = localObject[j];
    j = 1;
    if (k != j)
    {
      i = 2;
      if (k != i)
      {
        j = 3;
        if (k != j)
        {
          i = 4;
          if (k == i) {
            return j;
          }
          localIllegalStateException = new java/lang/IllegalStateException;
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          String str = m54207b69.F54207b69_11("KV1F3B3C36353C407D43423C3E82");
          ((StringBuilder)localObject).append(str);
          ((StringBuilder)localObject).append(paramMode);
          paramMode = ((StringBuilder)localObject).toString();
          localIllegalStateException.<init>(paramMode);
          throw localIllegalStateException;
        }
        return i;
      }
      return j;
    }
    return 0;
  }
  
  public static Version getVersion(MinimalEncoder.VersionSize paramVersionSize)
  {
    int[] arrayOfInt = MinimalEncoder.1.$SwitchMap$com$google$zxing$qrcode$encoder$MinimalEncoder$VersionSize;
    int i = paramVersionSize.ordinal();
    i = arrayOfInt[i];
    int j = 1;
    if (i != j)
    {
      j = 2;
      if (i != j) {
        i = 40;
      }
    }
    for (;;)
    {
      return Version.getVersionForNumber(i);
      i = 26;
      continue;
      i = 9;
    }
  }
  
  public static MinimalEncoder.VersionSize getVersionSize(Version paramVersion)
  {
    int i = paramVersion.getVersionNumber();
    int j = 9;
    if (i <= j)
    {
      paramVersion = MinimalEncoder.VersionSize.SMALL;
    }
    else
    {
      int k = paramVersion.getVersionNumber();
      i = 26;
      if (k <= i) {
        paramVersion = MinimalEncoder.VersionSize.MEDIUM;
      } else {
        paramVersion = MinimalEncoder.VersionSize.LARGE;
      }
    }
    return paramVersion;
  }
  
  public static boolean isAlphanumeric(char paramChar)
  {
    paramChar = Encoder.getAlphanumericCode(paramChar);
    char c = 'ð¿¿';
    if (paramChar != c) {
      paramChar = '\001';
    } else {
      paramChar = '\000';
    }
    return paramChar;
  }
  
  public static boolean isDoubleByteKanji(char paramChar)
  {
    return Encoder.isOnlyDoubleByteKanji(String.valueOf(paramChar));
  }
  
  public static boolean isNumeric(char paramChar)
  {
    char c = '0';
    if (paramChar >= c)
    {
      c = '9';
      if (paramChar <= c) {
        return '\001';
      }
    }
    paramChar = '\000';
    return paramChar;
  }
  
  public void addEdge(MinimalEncoder.Edge[][][] paramArrayOfEdge, int paramInt, MinimalEncoder.Edge paramEdge)
  {
    int i = MinimalEncoder.Edge.access$000(paramEdge);
    paramInt += i;
    paramArrayOfEdge = paramArrayOfEdge[paramInt];
    paramInt = MinimalEncoder.Edge.access$100(paramEdge);
    paramArrayOfEdge = paramArrayOfEdge[paramInt];
    Mode localMode = MinimalEncoder.Edge.access$200(paramEdge);
    paramInt = getCompactedOrdinal(localMode);
    MinimalEncoder.Edge[][] arrayOfEdge = paramArrayOfEdge[paramInt];
    if (arrayOfEdge != null)
    {
      i = MinimalEncoder.Edge.access$300(arrayOfEdge);
      int j = MinimalEncoder.Edge.access$300(paramEdge);
      if (i <= j) {}
    }
    else
    {
      paramArrayOfEdge[paramInt] = paramEdge;
    }
  }
  
  public void addEdges(Version paramVersion, MinimalEncoder.Edge[][][] paramArrayOfEdge, int paramInt, MinimalEncoder.Edge paramEdge)
  {
    MinimalEncoder localMinimalEncoder = this;
    MinimalEncoder.Edge[][][] arrayOfEdge = paramArrayOfEdge;
    int i = paramInt;
    Object localObject1 = this.encoders;
    int j = ((ECIEncoderSet)localObject1).length();
    Object localObject2 = this.encoders;
    int i2 = ((ECIEncoderSet)localObject2).getPriorityEncoderIndex();
    if (i2 >= 0)
    {
      localObject3 = this.encoders;
      String str = this.stringToEncode;
      char c4 = str.charAt(paramInt);
      boolean bool8 = ((ECIEncoderSet)localObject3).canEncode(c4, i2);
      if (bool8)
      {
        j = i2 + 1;
        break label91;
      }
    }
    i2 = 0;
    localObject2 = null;
    label91:
    int i4 = j;
    int i5 = i2;
    int i7;
    int i3;
    while (i5 < i4)
    {
      localObject1 = localMinimalEncoder.encoders;
      localObject2 = localMinimalEncoder.stringToEncode;
      i2 = ((String)localObject2).charAt(i);
      boolean bool1 = ((ECIEncoderSet)localObject1).canEncode(i2, i5);
      if (bool1)
      {
        MinimalEncoder.Edge localEdge1 = new com/google/zxing/qrcode/encoder/MinimalEncoder$Edge;
        localObject3 = Mode.BYTE;
        i7 = 1;
        localObject1 = localEdge1;
        localObject2 = this;
        i3 = paramInt;
        localEdge1.<init>(this, (Mode)localObject3, paramInt, i5, i7, paramEdge, paramVersion, null);
        localMinimalEncoder.addEdge(arrayOfEdge, i, localEdge1);
      }
      i5 += 1;
    }
    Object localObject3 = Mode.KANJI;
    localObject1 = localMinimalEncoder.stringToEncode;
    char c1 = ((String)localObject1).charAt(i);
    boolean bool2 = localMinimalEncoder.canEncode((Mode)localObject3, c1);
    if (bool2)
    {
      MinimalEncoder.Edge localEdge2 = new com/google/zxing/qrcode/encoder/MinimalEncoder$Edge;
      i7 = 1;
      localObject1 = localEdge2;
      localObject2 = this;
      i3 = paramInt;
      localEdge2.<init>(this, (Mode)localObject3, paramInt, 0, i7, paramEdge, paramVersion, null);
      localMinimalEncoder.addEdge(arrayOfEdge, i, localEdge2);
    }
    i4 = localMinimalEncoder.stringToEncode.length();
    localObject3 = Mode.ALPHANUMERIC;
    localObject1 = localMinimalEncoder.stringToEncode;
    char c2 = ((String)localObject1).charAt(i);
    boolean bool3 = localMinimalEncoder.canEncode((Mode)localObject3, c2);
    int i6 = 2;
    int i8 = 1;
    MinimalEncoder.Edge localEdge3;
    if (bool3)
    {
      localEdge3 = new com/google/zxing/qrcode/encoder/MinimalEncoder$Edge;
      int k = i + 1;
      if (k < i4)
      {
        localObject2 = localMinimalEncoder.stringToEncode;
        k = ((String)localObject2).charAt(k);
        boolean bool4 = localMinimalEncoder.canEncode((Mode)localObject3, k);
        if (bool4)
        {
          i7 = i6;
          break label404;
        }
      }
      i7 = i8;
      label404:
      localObject1 = localEdge3;
      localObject2 = this;
      i3 = paramInt;
      localEdge3.<init>(this, (Mode)localObject3, paramInt, 0, i7, paramEdge, paramVersion, null);
      localMinimalEncoder.addEdge(arrayOfEdge, i, localEdge3);
    }
    localObject3 = Mode.NUMERIC;
    localObject1 = localMinimalEncoder.stringToEncode;
    char c3 = ((String)localObject1).charAt(i);
    boolean bool5 = localMinimalEncoder.canEncode((Mode)localObject3, c3);
    if (bool5)
    {
      localEdge3 = new com/google/zxing/qrcode/encoder/MinimalEncoder$Edge;
      int m = i + 1;
      if (m < i4)
      {
        localObject2 = localMinimalEncoder.stringToEncode;
        m = ((String)localObject2).charAt(m);
        boolean bool6 = localMinimalEncoder.canEncode((Mode)localObject3, m);
        if (bool6)
        {
          int n = i + 2;
          if (n < i4)
          {
            localObject2 = localMinimalEncoder.stringToEncode;
            n = ((String)localObject2).charAt(n);
            boolean bool7 = localMinimalEncoder.canEncode((Mode)localObject3, n);
            if (bool7)
            {
              int i1 = 3;
              i7 = i1;
              break label600;
            }
          }
          i7 = i6;
          break label600;
        }
      }
      i7 = i8;
      label600:
      localObject1 = localEdge3;
      localObject2 = this;
      i3 = paramInt;
      localEdge3.<init>(this, (Mode)localObject3, paramInt, 0, i7, paramEdge, paramVersion, null);
      localMinimalEncoder.addEdge(arrayOfEdge, i, localEdge3);
    }
  }
  
  public boolean canEncode(Mode paramMode, char paramChar)
  {
    int[] arrayOfInt = MinimalEncoder.1.$SwitchMap$com$google$zxing$qrcode$decoder$Mode;
    char c1 = paramMode.ordinal();
    c1 = arrayOfInt[c1];
    char c2 = '\001';
    if (c1 != c2)
    {
      char c3 = '\002';
      if (c1 != c3)
      {
        c3 = '\003';
        if (c1 != c3)
        {
          paramChar = '\004';
          if (c1 != paramChar) {
            return false;
          }
          return c2;
        }
        return isNumeric(paramChar);
      }
      return isAlphanumeric(paramChar);
    }
    return isDoubleByteKanji(paramChar);
  }
  
  public MinimalEncoder.ResultList encode(Version paramVersion)
  {
    if (paramVersion == null)
    {
      paramVersion = getVersion(MinimalEncoder.VersionSize.SMALL);
      localObject1 = getVersion(MinimalEncoder.VersionSize.MEDIUM);
      localObject2 = getVersion(MinimalEncoder.VersionSize.LARGE);
      Version[] tmp29_26 = new Version[3];
      Version[] tmp30_29 = tmp29_26;
      Version[] tmp30_29 = tmp29_26;
      tmp30_29[0] = paramVersion;
      tmp30_29[1] = localObject1;
      tmp30_29[2] = localObject2;
      paramVersion = tmp30_29;
      int i = 0;
      localObject1 = null;
      localObject2 = paramVersion[0];
      localObject2 = encodeSpecificVersion((Version)localObject2);
      localObject3 = paramVersion[1];
      localObject3 = encodeSpecificVersion((Version)localObject3);
      localObject4 = paramVersion[2];
      localObject4 = encodeSpecificVersion((Version)localObject4);
      MinimalEncoder.ResultList[] tmp86_83 = new MinimalEncoder.ResultList[3];
      MinimalEncoder.ResultList[] tmp87_86 = tmp86_83;
      MinimalEncoder.ResultList[] tmp87_86 = tmp86_83;
      tmp87_86[0] = localObject2;
      tmp87_86[1] = localObject3;
      tmp87_86[2] = localObject4;
      localObject2 = tmp87_86;
      int j = -1 >>> 1;
      int k = -1;
      for (;;)
      {
        int m = 3;
        if (i >= m) {
          break;
        }
        Object localObject5 = localObject2[i];
        m = localObject5.getSize();
        Version localVersion = paramVersion[i];
        ErrorCorrectionLevel localErrorCorrectionLevel = this.ecLevel;
        boolean bool1 = Encoder.willFit(m, localVersion, localErrorCorrectionLevel);
        if ((bool1) && (m < j))
        {
          k = i;
          j = m;
        }
        i += 1;
      }
      if (k >= 0) {
        return localObject2[k];
      }
      paramVersion = new com/google/zxing/WriterException;
      localObject1 = m54207b69.F54207b69_11("0}391D0B1F610E181965281E256928201E6D2D251771202E26262D2C2E");
      paramVersion.<init>((String)localObject1);
      throw paramVersion;
    }
    Object localObject1 = encodeSpecificVersion(paramVersion);
    int n = ((MinimalEncoder.ResultList)localObject1).getSize();
    Object localObject3 = getVersion(getVersionSize(((MinimalEncoder.ResultList)localObject1).getVersion()));
    Object localObject4 = this.ecLevel;
    boolean bool2 = Encoder.willFit(n, (Version)localObject3, (ErrorCorrectionLevel)localObject4);
    if (bool2) {
      return localObject1;
    }
    localObject1 = new com/google/zxing/WriterException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject3 = m54207b69.F54207b69_11("j/6B4F5D5113604647175650531B564E6C1F6A5C70705B5658");
    ((StringBuilder)localObject2).append((String)localObject3);
    ((StringBuilder)localObject2).append(paramVersion);
    paramVersion = ((StringBuilder)localObject2).toString();
    ((WriterException)localObject1).<init>(paramVersion);
    throw ((Throwable)localObject1);
  }
  
  public MinimalEncoder.ResultList encodeSpecificVersion(Version paramVersion)
  {
    Object localObject1 = this.stringToEncode;
    int i = ((String)localObject1).length();
    int j = i + 1;
    int k = this.encoders.length();
    int m = 4;
    int[] tmp30_28 = new int[3];
    int[] tmp31_30 = tmp30_28;
    int[] tmp31_30 = tmp30_28;
    tmp31_30[0] = j;
    tmp31_30[1] = k;
    tmp31_30[2] = m;
    Object localObject2 = tmp31_30;
    localObject2 = (MinimalEncoder.Edge[][][])Array.newInstance(MinimalEncoder.Edge.class, (int[])localObject2);
    addEdges(paramVersion, (MinimalEncoder.Edge[][][])localObject2, 0, null);
    k = 1;
    while (k <= i)
    {
      n = 0;
      for (;;)
      {
        ECIEncoderSet localECIEncoderSet1 = this.encoders;
        i1 = localECIEncoderSet1.length();
        if (n >= i1) {
          break;
        }
        i1 = 0;
        localECIEncoderSet1 = null;
        while (i1 < m)
        {
          localEdge1 = localObject2[k][n][i1];
          if ((localEdge1 != null) && (k < i)) {
            addEdges(paramVersion, (MinimalEncoder.Edge[][][])localObject2, k, localEdge1);
          }
          i1 += 1;
        }
        n += 1;
      }
      k += 1;
    }
    k = -1;
    int i2 = 0;
    MinimalEncoder.Edge localEdge1 = null;
    int i1 = -1 >>> 1;
    int n = k;
    for (;;)
    {
      ECIEncoderSet localECIEncoderSet2 = this.encoders;
      int i3 = localECIEncoderSet2.length();
      if (i2 >= i3) {
        break;
      }
      i3 = 0;
      localECIEncoderSet2 = null;
      while (i3 < m)
      {
        MinimalEncoder.Edge localEdge2 = localObject2[i][i2][i3];
        if (localEdge2 != null)
        {
          int i4 = MinimalEncoder.Edge.access$300(localEdge2);
          if (i4 < i1)
          {
            i1 = MinimalEncoder.Edge.access$300(localEdge2);
            k = i2;
            n = i3;
          }
        }
        i3 += 1;
      }
      i2 += 1;
    }
    if (k >= 0)
    {
      MinimalEncoder.ResultList localResultList = new com/google/zxing/qrcode/encoder/MinimalEncoder$ResultList;
      localObject1 = localObject2[i][k][n];
      localResultList.<init>(this, paramVersion, (MinimalEncoder.Edge)localObject1);
      return localResultList;
    }
    paramVersion = new com/google/zxing/WriterException;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = m54207b69.F54207b69_11("HP193F263826433743783E2C2D4B2F787F46424B4F4949863B57894F594F5C52549093");
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = this.stringToEncode;
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append("\"");
    localObject1 = ((StringBuilder)localObject1).toString();
    paramVersion.<init>((String)localObject1);
    throw paramVersion;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.encoder.MinimalEncoder
 * JD-Core Version:    0.7.0.1
 */
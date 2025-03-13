package com.google.zxing.qrcode.encoder;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.ECIEncoderSet;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import java.nio.charset.Charset;

final class MinimalEncoder$ResultList$ResultNode
{
  private final int characterLength;
  private final int charsetEncoderIndex;
  private final int fromPosition;
  private final Mode mode;
  
  public MinimalEncoder$ResultList$ResultNode(MinimalEncoder.ResultList paramResultList, Mode paramMode, int paramInt1, int paramInt2, int paramInt3)
  {
    this.mode = paramMode;
    this.fromPosition = paramInt1;
    this.charsetEncoderIndex = paramInt2;
    this.characterLength = paramInt3;
  }
  
  private void getBits(BitArray paramBitArray)
  {
    Object localObject1 = this.mode;
    int i = ((Mode)localObject1).getBits();
    int j = 4;
    paramBitArray.appendBits(i, j);
    i = this.characterLength;
    Object localObject2;
    if (i > 0)
    {
      i = getCharacterCountIndicator();
      localMode = this.mode;
      localObject2 = MinimalEncoder.ResultList.access$1400(this.this$1);
      j = localMode.getCharacterCountBits((Version)localObject2);
      paramBitArray.appendBits(i, j);
    }
    localObject1 = this.mode;
    Mode localMode = Mode.ECI;
    if (localObject1 == localMode)
    {
      localObject1 = MinimalEncoder.access$600(this.this$1.this$0);
      j = this.charsetEncoderIndex;
      i = ((ECIEncoderSet)localObject1).getECIValue(j);
      j = 8;
      paramBitArray.appendBits(i, j);
    }
    else
    {
      i = this.characterLength;
      if (i > 0)
      {
        localObject1 = MinimalEncoder.access$500(this.this$1.this$0);
        j = this.fromPosition;
        int k = this.characterLength + j;
        localObject1 = ((String)localObject1).substring(j, k);
        localMode = this.mode;
        localObject2 = MinimalEncoder.access$600(this.this$1.this$0);
        int m = this.charsetEncoderIndex;
        localObject2 = ((ECIEncoderSet)localObject2).getCharset(m);
        Encoder.appendBytes((String)localObject1, localMode, paramBitArray, (Charset)localObject2);
      }
    }
  }
  
  private int getCharacterCountIndicator()
  {
    Object localObject1 = this.mode;
    Object localObject2 = Mode.BYTE;
    int k;
    if (localObject1 == localObject2)
    {
      localObject1 = MinimalEncoder.access$600(this.this$1.this$0);
      localObject2 = MinimalEncoder.access$500(this.this$1.this$0);
      int i = this.fromPosition;
      int j = this.characterLength + i;
      localObject2 = ((String)localObject2).substring(i, j);
      i = this.charsetEncoderIndex;
      localObject1 = ((ECIEncoderSet)localObject1).encode((String)localObject2, i);
      k = localObject1.length;
    }
    else
    {
      k = this.characterLength;
    }
    return k;
  }
  
  private int getSize(Version paramVersion)
  {
    Mode localMode1 = this.mode;
    int i = localMode1.getCharacterCountBits(paramVersion);
    int j = 4;
    i += j;
    int[] arrayOfInt = MinimalEncoder.1.$SwitchMap$com$google$zxing$qrcode$decoder$Mode;
    Mode localMode2 = this.mode;
    int k = localMode2.ordinal();
    int m = arrayOfInt[k];
    k = 1;
    if (m != k)
    {
      int n = 0;
      int i1 = 2;
      if (m != i1)
      {
        int i2 = 3;
        if (m != i2)
        {
          if (m != j)
          {
            j = 5;
            if (m != j) {
              return i;
            }
            i += 8;
            return i;
          }
          j = getCharacterCountIndicator() * 8;
        }
        else
        {
          m = this.characterLength;
          int i3 = m / 3 * 10;
          i += i3;
          m %= i2;
          if (m != k) {
            if (m == i1)
            {
              j = 7;
            }
            else
            {
              j = 0;
              localMode1 = null;
            }
          }
        }
      }
      else
      {
        j = this.characterLength;
        m = j / 2 * 11;
        i += m;
        j %= i1;
        if (j == k) {
          n = 6;
        }
        i += n;
        return i;
      }
    }
    else
    {
      j = this.characterLength * 13;
    }
    i += j;
    return i;
  }
  
  private String makePrintable(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    int i = 0;
    for (;;)
    {
      int j = paramString.length();
      if (i >= j) {
        break;
      }
      j = paramString.charAt(i);
      int k = 32;
      if (j >= k)
      {
        j = paramString.charAt(i);
        int m = 126;
        if (j <= m)
        {
          j = paramString.charAt(i);
          break label75;
        }
      }
      j = 46;
      label75:
      localStringBuilder.append(j);
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = this.mode;
    localStringBuilder.append(localObject);
    char c = '(';
    localStringBuilder.append(c);
    localObject = this.mode;
    Mode localMode = Mode.ECI;
    int i;
    if (localObject == localMode)
    {
      localObject = MinimalEncoder.access$600(this.this$1.this$0);
      i = this.charsetEncoderIndex;
      localObject = ((ECIEncoderSet)localObject).getCharset(i).displayName();
    }
    else
    {
      localObject = MinimalEncoder.access$500(this.this$1.this$0);
      i = this.fromPosition;
      int j = this.characterLength + i;
      localObject = ((String)localObject).substring(i, j);
      localObject = makePrintable((String)localObject);
    }
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.encoder.MinimalEncoder.ResultList.ResultNode
 * JD-Core Version:    0.7.0.1
 */
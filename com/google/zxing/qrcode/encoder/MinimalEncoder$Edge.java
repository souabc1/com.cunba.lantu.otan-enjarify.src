package com.google.zxing.qrcode.encoder;

import com.google.zxing.common.ECIEncoderSet;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;

final class MinimalEncoder$Edge
{
  private final int cachedTotalSize;
  private final int characterLength;
  private final int charsetEncoderIndex;
  private final int fromPosition;
  private final Mode mode;
  private final Edge previous;
  
  private MinimalEncoder$Edge(MinimalEncoder paramMinimalEncoder, Mode paramMode, int paramInt1, int paramInt2, int paramInt3, Edge paramEdge, Version paramVersion)
  {
    this.mode = paramMode;
    this.fromPosition = paramInt1;
    Mode localMode = Mode.BYTE;
    int i;
    if ((paramMode != localMode) && (paramEdge != null)) {
      i = paramEdge.charsetEncoderIndex;
    } else {
      i = paramInt2;
    }
    this.charsetEncoderIndex = i;
    this.characterLength = paramInt3;
    this.previous = paramEdge;
    int j = 0;
    int k;
    if (paramEdge != null) {
      k = paramEdge.cachedTotalSize;
    } else {
      k = 0;
    }
    int m = 1;
    if ((paramMode != localMode) || (paramEdge != null) || (i == 0))
    {
      if (paramEdge != null)
      {
        n = paramEdge.charsetEncoderIndex;
        if (i == n) {}
      }
    }
    else {
      j = m;
    }
    int n = 4;
    int i1;
    if (paramEdge != null)
    {
      paramEdge = paramEdge.mode;
      if ((paramMode == paramEdge) && (j == 0)) {}
    }
    else
    {
      i1 = paramMode.getCharacterCountBits(paramVersion) + n;
      k += i1;
    }
    paramEdge = MinimalEncoder.1.$SwitchMap$com$google$zxing$qrcode$decoder$Mode;
    int i2 = paramMode.ordinal();
    i2 = paramEdge[i2];
    if (i2 != m)
    {
      i1 = 2;
      int i4;
      if (i2 != i1)
      {
        int i3 = 3;
        if (i2 != i3)
        {
          if (i2 == n)
          {
            paramMode = MinimalEncoder.access$600(paramMinimalEncoder);
            paramMinimalEncoder = MinimalEncoder.access$500(paramMinimalEncoder);
            paramInt3 += paramInt1;
            paramMinimalEncoder = paramMinimalEncoder.substring(paramInt1, paramInt3);
            paramMinimalEncoder = paramMode.encode(paramMinimalEncoder, paramInt2);
            i4 = paramMinimalEncoder.length * 8;
            k += i4;
            if (j != 0) {
              k += 12;
            }
          }
        }
        else
        {
          if (paramInt3 != m) {
            if (paramInt3 == i1) {
              n = 7;
            } else {
              n = 10;
            }
          }
          k += n;
        }
      }
      else
      {
        if (paramInt3 == m) {
          i4 = 6;
        } else {
          i4 = 11;
        }
        k += i4;
      }
    }
    else
    {
      k += 13;
    }
    this.cachedTotalSize = k;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.encoder.MinimalEncoder.Edge
 * JD-Core Version:    0.7.0.1
 */
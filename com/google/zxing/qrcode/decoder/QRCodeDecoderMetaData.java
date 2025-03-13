package com.google.zxing.qrcode.decoder;

import com.google.zxing.ResultPoint;

public final class QRCodeDecoderMetaData
{
  private final boolean mirrored;
  
  public QRCodeDecoderMetaData(boolean paramBoolean)
  {
    this.mirrored = paramBoolean;
  }
  
  public void applyMirroredCorrection(ResultPoint[] paramArrayOfResultPoint)
  {
    boolean bool = this.mirrored;
    if ((bool) && (paramArrayOfResultPoint != null))
    {
      int i = paramArrayOfResultPoint.length;
      int j = 3;
      if (i >= j)
      {
        i = 0;
        ResultPoint localResultPoint1 = paramArrayOfResultPoint[0];
        int k = 2;
        ResultPoint localResultPoint2 = paramArrayOfResultPoint[k];
        paramArrayOfResultPoint[0] = localResultPoint2;
        paramArrayOfResultPoint[k] = localResultPoint1;
      }
    }
  }
  
  public boolean isMirrored()
  {
    return this.mirrored;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.decoder.QRCodeDecoderMetaData
 * JD-Core Version:    0.7.0.1
 */
package com.google.zxing.qrcode.decoder;

public enum ErrorCorrectionLevel
{
  private static final ErrorCorrectionLevel[] FOR_BITS = tmp118_107;
  private final int bits;
  
  static
  {
    ErrorCorrectionLevel localErrorCorrectionLevel1 = new com/google/zxing/qrcode/decoder/ErrorCorrectionLevel;
    int i = 1;
    localErrorCorrectionLevel1.<init>("L", 0, i);
    L = localErrorCorrectionLevel1;
    ErrorCorrectionLevel localErrorCorrectionLevel2 = new com/google/zxing/qrcode/decoder/ErrorCorrectionLevel;
    localErrorCorrectionLevel2.<init>("M", i, 0);
    M = localErrorCorrectionLevel2;
    ErrorCorrectionLevel localErrorCorrectionLevel3 = new com/google/zxing/qrcode/decoder/ErrorCorrectionLevel;
    int j = 2;
    int k = 3;
    localErrorCorrectionLevel3.<init>("Q", j, k);
    Q = localErrorCorrectionLevel3;
    ErrorCorrectionLevel localErrorCorrectionLevel4 = new com/google/zxing/qrcode/decoder/ErrorCorrectionLevel;
    localErrorCorrectionLevel4.<init>("H", k, j);
    H = localErrorCorrectionLevel4;
    ErrorCorrectionLevel[] tmp83_80 = new ErrorCorrectionLevel[4];
    ErrorCorrectionLevel[] tmp84_83 = tmp83_80;
    ErrorCorrectionLevel[] tmp84_83 = tmp83_80;
    tmp84_83[0] = localErrorCorrectionLevel1;
    tmp84_83[1] = localErrorCorrectionLevel2;
    tmp84_83[2] = localErrorCorrectionLevel3;
    ErrorCorrectionLevel[] tmp94_84 = tmp84_83;
    tmp94_84[3] = localErrorCorrectionLevel4;
    $VALUES = tmp94_84;
    ErrorCorrectionLevel[] tmp106_103 = new ErrorCorrectionLevel[4];
    ErrorCorrectionLevel[] tmp107_106 = tmp106_103;
    ErrorCorrectionLevel[] tmp107_106 = tmp106_103;
    tmp107_106[0] = localErrorCorrectionLevel2;
    tmp107_106[1] = localErrorCorrectionLevel1;
    tmp107_106[2] = localErrorCorrectionLevel4;
    ErrorCorrectionLevel[] tmp118_107 = tmp107_106;
    tmp118_107[3] = localErrorCorrectionLevel3;
  }
  
  private ErrorCorrectionLevel(int paramInt)
  {
    this.bits = paramInt;
  }
  
  public static ErrorCorrectionLevel forBits(int paramInt)
  {
    if (paramInt >= 0)
    {
      ErrorCorrectionLevel[] arrayOfErrorCorrectionLevel = FOR_BITS;
      int i = arrayOfErrorCorrectionLevel.length;
      if (paramInt < i) {
        return arrayOfErrorCorrectionLevel[paramInt];
      }
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>();
    throw localIllegalArgumentException;
  }
  
  public int getBits()
  {
    return this.bits;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.decoder.ErrorCorrectionLevel
 * JD-Core Version:    0.7.0.1
 */
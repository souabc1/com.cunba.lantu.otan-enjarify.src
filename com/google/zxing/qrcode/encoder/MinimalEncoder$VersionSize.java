package com.google.zxing.qrcode.encoder;

import m54207b69;

 enum MinimalEncoder$VersionSize
{
  private final String description;
  
  static
  {
    VersionSize localVersionSize1 = new com/google/zxing/qrcode/encoder/MinimalEncoder$VersionSize;
    Object localObject = m54207b69.F54207b69_11("7\\2A3A303239383883757A6F");
    String str1 = m54207b69.F54207b69_11("0w243B383E3F");
    localVersionSize1.<init>(str1, 0, (String)localObject);
    SMALL = localVersionSize1;
    VersionSize localVersionSize2 = new com/google/zxing/qrcode/encoder/MinimalEncoder$VersionSize;
    str1 = m54207b69.F54207b69_11("=84E5E4C4E555C5C1F11111F151A");
    String str2 = m54207b69.F54207b69_11("SL010A0A081D06");
    localVersionSize2.<init>(str2, 1, str1);
    MEDIUM = localVersionSize2;
    localObject = new com/google/zxing/qrcode/encoder/MinimalEncoder$VersionSize;
    str2 = m54207b69.F54207b69_11("G\\2A3A30323938388376747B7378");
    String str3 = m54207b69.F54207b69_11(")Y15190D2120");
    ((VersionSize)localObject).<init>(str3, 2, str2);
    LARGE = (VersionSize)localObject;
    VersionSize[] tmp91_88 = new VersionSize[3];
    VersionSize[] tmp92_91 = tmp91_88;
    VersionSize[] tmp92_91 = tmp91_88;
    tmp92_91[0] = localVersionSize1;
    tmp92_91[1] = localVersionSize2;
    tmp92_91[2] = localObject;
  }
  
  private MinimalEncoder$VersionSize(String paramString)
  {
    this.description = paramString;
  }
  
  public String toString()
  {
    return this.description;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.encoder.MinimalEncoder.VersionSize
 * JD-Core Version:    0.7.0.1
 */
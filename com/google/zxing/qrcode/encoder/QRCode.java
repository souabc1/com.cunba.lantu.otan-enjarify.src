package com.google.zxing.qrcode.encoder;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import m54207b69;

public final class QRCode
{
  public static final int NUM_MASK_PATTERNS = 8;
  private ErrorCorrectionLevel ecLevel;
  private int maskPattern = -1;
  private ByteMatrix matrix;
  private Mode mode;
  private Version version;
  
  public static boolean isValidMaskPattern(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = 8;
      if (paramInt < i) {
        return 1;
      }
    }
    paramInt = 0;
    return paramInt;
  }
  
  public ErrorCorrectionLevel getECLevel()
  {
    return this.ecLevel;
  }
  
  public int getMaskPattern()
  {
    return this.maskPattern;
  }
  
  public ByteMatrix getMatrix()
  {
    return this.matrix;
  }
  
  public Mode getMode()
  {
    return this.mode;
  }
  
  public Version getVersion()
  {
    return this.version;
  }
  
  public void setECLevel(ErrorCorrectionLevel paramErrorCorrectionLevel)
  {
    this.ecLevel = paramErrorCorrectionLevel;
  }
  
  public void setMaskPattern(int paramInt)
  {
    this.maskPattern = paramInt;
  }
  
  public void setMatrix(ByteMatrix paramByteMatrix)
  {
    this.matrix = paramByteMatrix;
  }
  
  public void setMode(Mode paramMode)
  {
    this.mode = paramMode;
  }
  
  public void setVersion(Version paramVersion)
  {
    this.version = paramVersion;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(200);
    localStringBuilder.append("<<\n");
    Object localObject = m54207b69.F54207b69_11("fz5A181721234560");
    localStringBuilder.append((String)localObject);
    localObject = this.mode;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("ZB48632924122C3A2E36816C");
    localStringBuilder.append((String)localObject);
    localObject = this.ecLevel;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("gX527930402E30373E3E6B82");
    localStringBuilder.append((String)localObject);
    localObject = this.version;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("BD4E652B283B341A2C38392B41368B72");
    localStringBuilder.append((String)localObject);
    int i = this.maskPattern;
    localStringBuilder.append(i);
    localObject = this.matrix;
    if (localObject == null)
    {
      localObject = m54207b69.F54207b69_11("RC496430253B363042816C37413B3C57");
      localStringBuilder.append((String)localObject);
    }
    else
    {
      localObject = m54207b69.F54207b69_11("NF4C672D2A363935458455");
      localStringBuilder.append((String)localObject);
      localObject = this.matrix;
      localStringBuilder.append(localObject);
    }
    localStringBuilder.append(">>\n");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.encoder.QRCode
 * JD-Core Version:    0.7.0.1
 */
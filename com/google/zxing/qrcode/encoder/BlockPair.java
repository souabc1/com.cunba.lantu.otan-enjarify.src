package com.google.zxing.qrcode.encoder;

final class BlockPair
{
  private final byte[] dataBytes;
  private final byte[] errorCorrectionBytes;
  
  public BlockPair(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    this.dataBytes = paramArrayOfByte1;
    this.errorCorrectionBytes = paramArrayOfByte2;
  }
  
  public byte[] getDataBytes()
  {
    return this.dataBytes;
  }
  
  public byte[] getErrorCorrectionBytes()
  {
    return this.errorCorrectionBytes;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.encoder.BlockPair
 * JD-Core Version:    0.7.0.1
 */
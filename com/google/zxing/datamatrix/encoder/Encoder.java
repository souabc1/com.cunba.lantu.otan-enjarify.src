package com.google.zxing.datamatrix.encoder;

abstract interface Encoder
{
  public abstract void encode(EncoderContext paramEncoderContext);
  
  public abstract int getEncodingMode();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.datamatrix.encoder.Encoder
 * JD-Core Version:    0.7.0.1
 */
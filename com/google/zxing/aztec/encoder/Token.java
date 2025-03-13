package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

abstract class Token
{
  static final Token EMPTY;
  private final Token previous;
  
  static
  {
    SimpleToken localSimpleToken = new com/google/zxing/aztec/encoder/SimpleToken;
    localSimpleToken.<init>(null, 0, 0);
    EMPTY = localSimpleToken;
  }
  
  public Token(Token paramToken)
  {
    this.previous = paramToken;
  }
  
  public final Token add(int paramInt1, int paramInt2)
  {
    SimpleToken localSimpleToken = new com/google/zxing/aztec/encoder/SimpleToken;
    localSimpleToken.<init>(this, paramInt1, paramInt2);
    return localSimpleToken;
  }
  
  public final Token addBinaryShift(int paramInt1, int paramInt2)
  {
    BinaryShiftToken localBinaryShiftToken = new com/google/zxing/aztec/encoder/BinaryShiftToken;
    localBinaryShiftToken.<init>(this, paramInt1, paramInt2);
    return localBinaryShiftToken;
  }
  
  public abstract void appendTo(BitArray paramBitArray, byte[] paramArrayOfByte);
  
  public final Token getPrevious()
  {
    return this.previous;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.aztec.encoder.Token
 * JD-Core Version:    0.7.0.1
 */
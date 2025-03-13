package com.google.zxing;

import java.util.Map;

public abstract interface Reader
{
  public abstract Result decode(BinaryBitmap paramBinaryBitmap);
  
  public abstract Result decode(BinaryBitmap paramBinaryBitmap, Map paramMap);
  
  public abstract void reset();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.Reader
 * JD-Core Version:    0.7.0.1
 */
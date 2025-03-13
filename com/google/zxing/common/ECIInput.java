package com.google.zxing.common;

public abstract interface ECIInput
{
  public abstract char charAt(int paramInt);
  
  public abstract int getECIValue(int paramInt);
  
  public abstract boolean haveNCharacters(int paramInt1, int paramInt2);
  
  public abstract boolean isECI(int paramInt);
  
  public abstract int length();
  
  public abstract CharSequence subSequence(int paramInt1, int paramInt2);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.common.ECIInput
 * JD-Core Version:    0.7.0.1
 */
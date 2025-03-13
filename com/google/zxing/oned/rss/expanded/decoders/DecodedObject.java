package com.google.zxing.oned.rss.expanded.decoders;

abstract class DecodedObject
{
  private final int newPosition;
  
  public DecodedObject(int paramInt)
  {
    this.newPosition = paramInt;
  }
  
  public final int getNewPosition()
  {
    return this.newPosition;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.oned.rss.expanded.decoders.DecodedObject
 * JD-Core Version:    0.7.0.1
 */
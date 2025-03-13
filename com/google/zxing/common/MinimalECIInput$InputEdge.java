package com.google.zxing.common;

final class MinimalECIInput$InputEdge
{
  private final char c;
  private final int cachedTotalSize;
  private final int encoderIndex;
  private final InputEdge previous;
  
  private MinimalECIInput$InputEdge(char paramChar, ECIEncoderSet paramECIEncoderSet, int paramInt1, InputEdge paramInputEdge, int paramInt2)
  {
    int i = 1000;
    if (paramChar == paramInt2) {
      paramInt2 = i;
    } else {
      paramInt2 = paramChar;
    }
    this.c = paramInt2;
    this.encoderIndex = paramInt1;
    this.previous = paramInputEdge;
    if (paramInt2 == i)
    {
      paramChar = '\001';
    }
    else
    {
      byte[] arrayOfByte = paramECIEncoderSet.encode(paramChar, paramInt1);
      paramChar = arrayOfByte.length;
    }
    int j;
    if (paramInputEdge == null)
    {
      j = 0;
      paramECIEncoderSet = null;
    }
    else
    {
      j = paramInputEdge.encoderIndex;
    }
    if (j != paramInt1) {
      paramChar += '\003';
    }
    if (paramInputEdge != null)
    {
      j = paramInputEdge.cachedTotalSize;
      paramChar += j;
    }
    this.cachedTotalSize = paramChar;
  }
  
  public boolean isFNC1()
  {
    int i = this.c;
    int j = 1000;
    if (i == j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.common.MinimalECIInput.InputEdge
 * JD-Core Version:    0.7.0.1
 */
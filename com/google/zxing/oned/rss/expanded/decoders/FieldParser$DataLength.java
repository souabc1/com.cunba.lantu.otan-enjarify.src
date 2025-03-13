package com.google.zxing.oned.rss.expanded.decoders;

final class FieldParser$DataLength
{
  final int length;
  final boolean variable;
  
  private FieldParser$DataLength(boolean paramBoolean, int paramInt)
  {
    this.variable = paramBoolean;
    this.length = paramInt;
  }
  
  public static DataLength fixed(int paramInt)
  {
    DataLength localDataLength = new com/google/zxing/oned/rss/expanded/decoders/FieldParser$DataLength;
    localDataLength.<init>(false, paramInt);
    return localDataLength;
  }
  
  public static DataLength variable(int paramInt)
  {
    DataLength localDataLength = new com/google/zxing/oned/rss/expanded/decoders/FieldParser$DataLength;
    localDataLength.<init>(true, paramInt);
    return localDataLength;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength
 * JD-Core Version:    0.7.0.1
 */
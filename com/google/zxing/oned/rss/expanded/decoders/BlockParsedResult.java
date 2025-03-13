package com.google.zxing.oned.rss.expanded.decoders;

final class BlockParsedResult
{
  private final DecodedInformation decodedInformation;
  private final boolean finished;
  
  public BlockParsedResult()
  {
    this(null, false);
  }
  
  public BlockParsedResult(DecodedInformation paramDecodedInformation, boolean paramBoolean)
  {
    this.finished = paramBoolean;
    this.decodedInformation = paramDecodedInformation;
  }
  
  public DecodedInformation getDecodedInformation()
  {
    return this.decodedInformation;
  }
  
  public boolean isFinished()
  {
    return this.finished;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.oned.rss.expanded.decoders.BlockParsedResult
 * JD-Core Version:    0.7.0.1
 */
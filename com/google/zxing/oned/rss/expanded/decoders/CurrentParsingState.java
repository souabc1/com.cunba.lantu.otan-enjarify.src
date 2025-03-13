package com.google.zxing.oned.rss.expanded.decoders;

final class CurrentParsingState
{
  private CurrentParsingState.State encoding;
  private int position = 0;
  
  public CurrentParsingState()
  {
    CurrentParsingState.State localState = CurrentParsingState.State.NUMERIC;
    this.encoding = localState;
  }
  
  public int getPosition()
  {
    return this.position;
  }
  
  public void incrementPosition(int paramInt)
  {
    int i = this.position + paramInt;
    this.position = i;
  }
  
  public boolean isAlpha()
  {
    CurrentParsingState.State localState1 = this.encoding;
    CurrentParsingState.State localState2 = CurrentParsingState.State.ALPHA;
    boolean bool;
    if (localState1 == localState2)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localState1 = null;
    }
    return bool;
  }
  
  public boolean isIsoIec646()
  {
    CurrentParsingState.State localState1 = this.encoding;
    CurrentParsingState.State localState2 = CurrentParsingState.State.ISO_IEC_646;
    boolean bool;
    if (localState1 == localState2)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localState1 = null;
    }
    return bool;
  }
  
  public boolean isNumeric()
  {
    CurrentParsingState.State localState1 = this.encoding;
    CurrentParsingState.State localState2 = CurrentParsingState.State.NUMERIC;
    boolean bool;
    if (localState1 == localState2)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localState1 = null;
    }
    return bool;
  }
  
  public void setAlpha()
  {
    CurrentParsingState.State localState = CurrentParsingState.State.ALPHA;
    this.encoding = localState;
  }
  
  public void setIsoIec646()
  {
    CurrentParsingState.State localState = CurrentParsingState.State.ISO_IEC_646;
    this.encoding = localState;
  }
  
  public void setNumeric()
  {
    CurrentParsingState.State localState = CurrentParsingState.State.NUMERIC;
    this.encoding = localState;
  }
  
  public void setPosition(int paramInt)
  {
    this.position = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.oned.rss.expanded.decoders.CurrentParsingState
 * JD-Core Version:    0.7.0.1
 */
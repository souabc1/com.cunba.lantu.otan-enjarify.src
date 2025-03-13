package com.google.zxing.aztec.encoder;

import java.util.Comparator;

class HighLevelEncoder$1
  implements Comparator
{
  public HighLevelEncoder$1(HighLevelEncoder paramHighLevelEncoder) {}
  
  public int compare(State paramState1, State paramState2)
  {
    int i = paramState1.getBitCount();
    int j = paramState2.getBitCount();
    return i - j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.aztec.encoder.HighLevelEncoder.1
 * JD-Core Version:    0.7.0.1
 */
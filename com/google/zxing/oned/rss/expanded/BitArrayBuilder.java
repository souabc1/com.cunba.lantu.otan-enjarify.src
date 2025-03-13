package com.google.zxing.oned.rss.expanded;

import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.DataCharacter;
import java.util.List;

final class BitArrayBuilder
{
  public static BitArray buildBitArray(List paramList)
  {
    int i = paramList.size() * 2;
    int j = 1;
    i -= j;
    int k = paramList.size() - j;
    Object localObject1 = ((ExpandedPair)paramList.get(k)).getRightChar();
    if (localObject1 == null) {
      i += -1;
    }
    i *= 12;
    localObject1 = new com/google/zxing/common/BitArray;
    ((BitArray)localObject1).<init>(i);
    i = 0;
    DataCharacter localDataCharacter1 = ((ExpandedPair)paramList.get(0)).getRightChar();
    int m = localDataCharacter1.getValue();
    int n = 11;
    int i1 = n;
    int i2;
    while (i1 >= 0)
    {
      i2 = j << i1 & m;
      if (i2 != 0) {
        ((BitArray)localObject1).set(i);
      }
      i += 1;
      i1 += -1;
    }
    m = j;
    for (;;)
    {
      i1 = paramList.size();
      if (m >= i1) {
        break;
      }
      Object localObject2 = (ExpandedPair)paramList.get(m);
      DataCharacter localDataCharacter2 = ((ExpandedPair)localObject2).getLeftChar();
      i2 = localDataCharacter2.getValue();
      int i3 = n;
      while (i3 >= 0)
      {
        int i4 = j << i3 & i2;
        if (i4 != 0) {
          ((BitArray)localObject1).set(i);
        }
        i += 1;
        i3 += -1;
      }
      localDataCharacter2 = ((ExpandedPair)localObject2).getRightChar();
      if (localDataCharacter2 != null)
      {
        localObject2 = ((ExpandedPair)localObject2).getRightChar();
        i1 = ((DataCharacter)localObject2).getValue();
        i2 = n;
        while (i2 >= 0)
        {
          i3 = j << i2 & i1;
          if (i3 != 0) {
            ((BitArray)localObject1).set(i);
          }
          i += 1;
          i2 += -1;
        }
      }
      m += 1;
    }
    return localObject1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.oned.rss.expanded.BitArrayBuilder
 * JD-Core Version:    0.7.0.1
 */
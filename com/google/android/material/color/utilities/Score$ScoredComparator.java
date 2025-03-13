package com.google.android.material.color.utilities;

import java.util.Comparator;
import java.util.Map.Entry;

class Score$ScoredComparator
  implements Comparator
{
  public int compare(Map.Entry paramEntry1, Map.Entry paramEntry2)
  {
    paramEntry1 = (Double)paramEntry1.getValue();
    paramEntry2 = (Double)paramEntry2.getValue();
    return -paramEntry1.compareTo(paramEntry2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.utilities.Score.ScoredComparator
 * JD-Core Version:    0.7.0.1
 */
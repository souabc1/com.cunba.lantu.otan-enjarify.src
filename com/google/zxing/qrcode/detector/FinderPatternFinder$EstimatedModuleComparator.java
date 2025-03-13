package com.google.zxing.qrcode.detector;

import java.io.Serializable;
import java.util.Comparator;

final class FinderPatternFinder$EstimatedModuleComparator
  implements Comparator, Serializable
{
  public int compare(FinderPattern paramFinderPattern1, FinderPattern paramFinderPattern2)
  {
    float f1 = paramFinderPattern1.getEstimatedModuleSize();
    float f2 = paramFinderPattern2.getEstimatedModuleSize();
    return Float.compare(f1, f2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.detector.FinderPatternFinder.EstimatedModuleComparator
 * JD-Core Version:    0.7.0.1
 */
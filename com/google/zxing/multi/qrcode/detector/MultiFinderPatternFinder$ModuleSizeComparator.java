package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.qrcode.detector.FinderPattern;
import java.io.Serializable;
import java.util.Comparator;

final class MultiFinderPatternFinder$ModuleSizeComparator
  implements Comparator, Serializable
{
  public int compare(FinderPattern paramFinderPattern1, FinderPattern paramFinderPattern2)
  {
    float f1 = paramFinderPattern2.getEstimatedModuleSize();
    float f2 = paramFinderPattern1.getEstimatedModuleSize();
    f1 -= f2;
    double d1 = f1;
    double d2 = 0.0D;
    boolean bool = d1 < d2;
    int j;
    if (bool)
    {
      int i = -1;
      f2 = 0.0F / 0.0F;
    }
    else
    {
      j = d1 < d2;
      if (j > 0)
      {
        j = 1;
        f2 = 1.4E-45F;
      }
      else
      {
        j = 0;
        f2 = 0.0F;
        paramFinderPattern1 = null;
      }
    }
    return j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.multi.qrcode.detector.MultiFinderPatternFinder.ModuleSizeComparator
 * JD-Core Version:    0.7.0.1
 */
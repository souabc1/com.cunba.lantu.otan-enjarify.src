package com.google.android.material.color.utilities;

final class QuantizerWsmeans$Distance
  implements Comparable
{
  double distance = -1.0D;
  int index = -1;
  
  public int compareTo(Distance paramDistance)
  {
    Double localDouble = Double.valueOf(this.distance);
    paramDistance = Double.valueOf(paramDistance.distance);
    return localDouble.compareTo(paramDistance);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.utilities.QuantizerWsmeans.Distance
 * JD-Core Version:    0.7.0.1
 */
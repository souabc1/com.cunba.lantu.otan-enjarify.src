package com.google.android.material.color.utilities;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class QuantizerCelebi
{
  public static Map quantize(int[] paramArrayOfInt, int paramInt)
  {
    Object localObject = new com/google/android/material/color/utilities/QuantizerWu;
    ((QuantizerWu)localObject).<init>();
    localObject = ((QuantizerWu)localObject).quantize(paramArrayOfInt, paramInt).colorToCount.keySet();
    int i = ((Set)localObject).size();
    int[] arrayOfInt = new int[i];
    localObject = ((Set)localObject).iterator();
    int m;
    for (int j = 0;; j = m)
    {
      boolean bool = ((Iterator)localObject).hasNext();
      if (!bool) {
        break;
      }
      Integer localInteger = (Integer)((Iterator)localObject).next();
      m = j + 1;
      int k = localInteger.intValue();
      arrayOfInt[j] = k;
    }
    return QuantizerWsmeans.quantize(paramArrayOfInt, arrayOfInt, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.utilities.QuantizerCelebi
 * JD-Core Version:    0.7.0.1
 */
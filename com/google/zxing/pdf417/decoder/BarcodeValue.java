package com.google.zxing.pdf417.decoder;

import com.google.zxing.pdf417.PDF417Common;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class BarcodeValue
{
  private final Map values;
  
  public BarcodeValue()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.values = localHashMap;
  }
  
  public Integer getConfidence(int paramInt)
  {
    Map localMap = this.values;
    Integer localInteger = Integer.valueOf(paramInt);
    return (Integer)localMap.get(localInteger);
  }
  
  public int[] getValue()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Iterator localIterator = this.values.entrySet().iterator();
    int i = -1;
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = (Map.Entry)localIterator.next();
      Integer localInteger1 = (Integer)((Map.Entry)localObject).getValue();
      int j = localInteger1.intValue();
      if (j > i)
      {
        Integer localInteger2 = (Integer)((Map.Entry)localObject).getValue();
        i = localInteger2.intValue();
        localArrayList.clear();
      }
      else
      {
        localInteger1 = (Integer)((Map.Entry)localObject).getValue();
        j = localInteger1.intValue();
        if (j != i) {
          continue;
        }
      }
      localObject = ((Map.Entry)localObject).getKey();
      localArrayList.add(localObject);
    }
    return PDF417Common.toIntArray(localArrayList);
  }
  
  public void setValue(int paramInt)
  {
    Object localObject1 = this.values;
    Object localObject2 = Integer.valueOf(paramInt);
    localObject1 = (Integer)((Map)localObject1).get(localObject2);
    if (localObject1 == null) {
      localObject1 = Integer.valueOf(0);
    }
    localObject1 = Integer.valueOf(((Integer)localObject1).intValue() + 1);
    localObject2 = this.values;
    Integer localInteger = Integer.valueOf(paramInt);
    ((Map)localObject2).put(localInteger, localObject1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.pdf417.decoder.BarcodeValue
 * JD-Core Version:    0.7.0.1
 */
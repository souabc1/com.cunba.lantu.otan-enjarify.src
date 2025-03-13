package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.BitArray;
import m54207b69;

public abstract class AbstractExpandedDecoder
{
  private final GeneralAppIdDecoder generalDecoder;
  private final BitArray information;
  
  public AbstractExpandedDecoder(BitArray paramBitArray)
  {
    this.information = paramBitArray;
    GeneralAppIdDecoder localGeneralAppIdDecoder = new com/google/zxing/oned/rss/expanded/decoders/GeneralAppIdDecoder;
    localGeneralAppIdDecoder.<init>(paramBitArray);
    this.generalDecoder = localGeneralAppIdDecoder;
  }
  
  public static AbstractExpandedDecoder createDecoder(BitArray paramBitArray)
  {
    int i = 1;
    boolean bool = paramBitArray.get(i);
    if (bool)
    {
      localObject1 = new com/google/zxing/oned/rss/expanded/decoders/AI01AndOtherAIs;
      ((AI01AndOtherAIs)localObject1).<init>(paramBitArray);
      return localObject1;
    }
    bool = paramBitArray.get(2);
    if (!bool)
    {
      localObject1 = new com/google/zxing/oned/rss/expanded/decoders/AnyAIDecoder;
      ((AnyAIDecoder)localObject1).<init>(paramBitArray);
      return localObject1;
    }
    int j = 4;
    int k = GeneralAppIdDecoder.extractNumericValueFromBitArray(paramBitArray, i, j);
    if (k != j)
    {
      j = 5;
      if (k != j)
      {
        j = GeneralAppIdDecoder.extractNumericValueFromBitArray(paramBitArray, i, j);
        k = 12;
        if (j != k)
        {
          k = 13;
          if (j != k)
          {
            j = 7;
            i = GeneralAppIdDecoder.extractNumericValueFromBitArray(paramBitArray, i, j);
            Object localObject2 = "17";
            String str1 = "15";
            String str2 = "13";
            String str3 = "11";
            String str4 = "320";
            String str5 = "310";
            switch (i)
            {
            default: 
              localObject1 = new java/lang/IllegalStateException;
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              str1 = m54207b69.F54207b69_11("oI3C28242A2A432D70353534313939498279");
              ((StringBuilder)localObject2).append(str1);
              ((StringBuilder)localObject2).append(paramBitArray);
              paramBitArray = ((StringBuilder)localObject2).toString();
              ((IllegalStateException)localObject1).<init>(paramBitArray);
              throw ((Throwable)localObject1);
            case 63: 
              localObject1 = new com/google/zxing/oned/rss/expanded/decoders/AI013x0x1xDecoder;
              ((AI013x0x1xDecoder)localObject1).<init>(paramBitArray, str4, (String)localObject2);
              return localObject1;
            case 62: 
              localObject1 = new com/google/zxing/oned/rss/expanded/decoders/AI013x0x1xDecoder;
              ((AI013x0x1xDecoder)localObject1).<init>(paramBitArray, str5, (String)localObject2);
              return localObject1;
            case 61: 
              localObject1 = new com/google/zxing/oned/rss/expanded/decoders/AI013x0x1xDecoder;
              ((AI013x0x1xDecoder)localObject1).<init>(paramBitArray, str4, str1);
              return localObject1;
            case 60: 
              localObject1 = new com/google/zxing/oned/rss/expanded/decoders/AI013x0x1xDecoder;
              ((AI013x0x1xDecoder)localObject1).<init>(paramBitArray, str5, str1);
              return localObject1;
            case 59: 
              localObject1 = new com/google/zxing/oned/rss/expanded/decoders/AI013x0x1xDecoder;
              ((AI013x0x1xDecoder)localObject1).<init>(paramBitArray, str4, str2);
              return localObject1;
            case 58: 
              localObject1 = new com/google/zxing/oned/rss/expanded/decoders/AI013x0x1xDecoder;
              ((AI013x0x1xDecoder)localObject1).<init>(paramBitArray, str5, str2);
              return localObject1;
            case 57: 
              localObject1 = new com/google/zxing/oned/rss/expanded/decoders/AI013x0x1xDecoder;
              ((AI013x0x1xDecoder)localObject1).<init>(paramBitArray, str4, str3);
              return localObject1;
            }
            localObject1 = new com/google/zxing/oned/rss/expanded/decoders/AI013x0x1xDecoder;
            ((AI013x0x1xDecoder)localObject1).<init>(paramBitArray, str5, str3);
            return localObject1;
          }
          localObject1 = new com/google/zxing/oned/rss/expanded/decoders/AI01393xDecoder;
          ((AI01393xDecoder)localObject1).<init>(paramBitArray);
          return localObject1;
        }
        localObject1 = new com/google/zxing/oned/rss/expanded/decoders/AI01392xDecoder;
        ((AI01392xDecoder)localObject1).<init>(paramBitArray);
        return localObject1;
      }
      localObject1 = new com/google/zxing/oned/rss/expanded/decoders/AI01320xDecoder;
      ((AI01320xDecoder)localObject1).<init>(paramBitArray);
      return localObject1;
    }
    Object localObject1 = new com/google/zxing/oned/rss/expanded/decoders/AI013103decoder;
    ((AI013103decoder)localObject1).<init>(paramBitArray);
    return localObject1;
  }
  
  public final GeneralAppIdDecoder getGeneralDecoder()
  {
    return this.generalDecoder;
  }
  
  public final BitArray getInformation()
  {
    return this.information;
  }
  
  public abstract String parseInformation();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
 * JD-Core Version:    0.7.0.1
 */
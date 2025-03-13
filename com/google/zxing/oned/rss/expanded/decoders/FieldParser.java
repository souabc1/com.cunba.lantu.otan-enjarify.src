package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import java.util.HashMap;
import java.util.Map;
import m54207b69;

final class FieldParser
{
  private static final Map FOUR_DIGIT_DATA_LENGTH;
  private static final Map THREE_DIGIT_DATA_LENGTH;
  private static final Map THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH;
  private static final Map TWO_DIGIT_DATA_LENGTH;
  
  static
  {
    Object localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    TWO_DIGIT_DATA_LENGTH = (Map)localObject1;
    int i = 18;
    Object localObject2 = FieldParser.DataLength.fixed(i);
    ((Map)localObject1).put("00", localObject2);
    int j = 14;
    Object localObject3 = FieldParser.DataLength.fixed(j);
    ((Map)localObject1).put("01", localObject3);
    localObject3 = "02";
    FieldParser.DataLength localDataLength1 = FieldParser.DataLength.fixed(j);
    ((Map)localObject1).put(localObject3, localDataLength1);
    int k = 20;
    localDataLength1 = FieldParser.DataLength.variable(k);
    ((Map)localObject1).put("10", localDataLength1);
    int m = 6;
    Object localObject4 = FieldParser.DataLength.fixed(m);
    ((Map)localObject1).put("11", localObject4);
    Object localObject5 = FieldParser.DataLength.fixed(m);
    ((Map)localObject1).put("12", localObject5);
    localObject5 = FieldParser.DataLength.fixed(m);
    ((Map)localObject1).put("13", localObject5);
    localObject5 = FieldParser.DataLength.fixed(m);
    ((Map)localObject1).put("15", localObject5);
    localObject4 = "17";
    localObject5 = FieldParser.DataLength.fixed(m);
    ((Map)localObject1).put(localObject4, localObject5);
    int n = 2;
    localObject5 = FieldParser.DataLength.fixed(n);
    ((Map)localObject1).put("20", localObject5);
    Object localObject6 = FieldParser.DataLength.variable(k);
    ((Map)localObject1).put("21", localObject6);
    localObject5 = FieldParser.DataLength.variable(29);
    ((Map)localObject1).put("22", localObject5);
    int i1 = 8;
    localObject6 = FieldParser.DataLength.variable(i1);
    Object localObject7 = "30";
    ((Map)localObject1).put(localObject7, localObject6);
    localObject6 = "37";
    localObject5 = FieldParser.DataLength.variable(i1);
    ((Map)localObject1).put(localObject6, localObject5);
    int i2 = 90;
    int i3;
    for (;;)
    {
      i1 = 99;
      i3 = 30;
      if (i2 > i1) {
        break;
      }
      localObject5 = TWO_DIGIT_DATA_LENGTH;
      localObject7 = String.valueOf(i2);
      localObject6 = FieldParser.DataLength.variable(i3);
      ((Map)localObject5).put(localObject7, localObject6);
      i2 += 1;
    }
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    THREE_DIGIT_DATA_LENGTH = (Map)localObject1;
    localObject7 = FieldParser.DataLength.variable(i3);
    ((Map)localObject1).put("240", localObject7);
    localObject7 = FieldParser.DataLength.variable(i3);
    ((Map)localObject1).put("241", localObject7);
    localObject7 = FieldParser.DataLength.variable(m);
    ((Map)localObject1).put("242", localObject7);
    localObject7 = FieldParser.DataLength.variable(i3);
    ((Map)localObject1).put("250", localObject7);
    localObject7 = FieldParser.DataLength.variable(i3);
    ((Map)localObject1).put("251", localObject7);
    int i4 = 17;
    FieldParser.DataLength localDataLength2 = FieldParser.DataLength.variable(i4);
    ((Map)localObject1).put("253", localDataLength2);
    localDataLength2 = FieldParser.DataLength.variable(k);
    ((Map)localObject1).put("254", localDataLength2);
    localDataLength2 = FieldParser.DataLength.variable(i3);
    ((Map)localObject1).put("400", localDataLength2);
    localDataLength2 = FieldParser.DataLength.variable(i3);
    ((Map)localObject1).put("401", localDataLength2);
    localObject7 = FieldParser.DataLength.fixed(i4);
    ((Map)localObject1).put("402", localObject7);
    localObject7 = FieldParser.DataLength.variable(i3);
    ((Map)localObject1).put("403", localObject7);
    i4 = 13;
    localDataLength2 = FieldParser.DataLength.fixed(i4);
    ((Map)localObject1).put("410", localDataLength2);
    localDataLength2 = FieldParser.DataLength.fixed(i4);
    ((Map)localObject1).put("411", localDataLength2);
    localDataLength2 = FieldParser.DataLength.fixed(i4);
    ((Map)localObject1).put("412", localDataLength2);
    localDataLength2 = FieldParser.DataLength.fixed(i4);
    ((Map)localObject1).put("413", localDataLength2);
    localDataLength2 = FieldParser.DataLength.fixed(i4);
    ((Map)localObject1).put("414", localDataLength2);
    localDataLength2 = FieldParser.DataLength.variable(k);
    ((Map)localObject1).put("420", localDataLength2);
    int i5 = 15;
    Object localObject8 = FieldParser.DataLength.variable(i5);
    ((Map)localObject1).put("421", localObject8);
    int i6 = 3;
    FieldParser.DataLength localDataLength3 = FieldParser.DataLength.fixed(i6);
    ((Map)localObject1).put("422", localDataLength3);
    localDataLength3 = FieldParser.DataLength.variable(i5);
    ((Map)localObject1).put("423", localDataLength3);
    localDataLength3 = FieldParser.DataLength.fixed(i6);
    ((Map)localObject1).put("424", localDataLength3);
    localDataLength3 = FieldParser.DataLength.fixed(i6);
    ((Map)localObject1).put("425", localDataLength3);
    localObject5 = "426";
    localObject8 = FieldParser.DataLength.fixed(i6);
    ((Map)localObject1).put(localObject5, localObject8);
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH = (Map)localObject1;
    i2 = 310;
    for (;;)
    {
      i1 = 316;
      if (i2 > i1) {
        break;
      }
      localObject5 = THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH;
      localObject8 = String.valueOf(i2);
      localDataLength3 = FieldParser.DataLength.fixed(m);
      ((Map)localObject5).put(localObject8, localDataLength3);
      i2 += 1;
    }
    i2 = 320;
    for (;;)
    {
      i1 = 336;
      if (i2 > i1) {
        break;
      }
      localObject5 = THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH;
      localObject8 = String.valueOf(i2);
      localDataLength3 = FieldParser.DataLength.fixed(m);
      ((Map)localObject5).put(localObject8, localDataLength3);
      i2 += 1;
    }
    i2 = 340;
    for (;;)
    {
      i1 = 357;
      if (i2 > i1) {
        break;
      }
      localObject5 = THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH;
      localObject8 = String.valueOf(i2);
      localDataLength3 = FieldParser.DataLength.fixed(m);
      ((Map)localObject5).put(localObject8, localDataLength3);
      i2 += 1;
    }
    i2 = 360;
    for (;;)
    {
      i1 = 369;
      if (i2 > i1) {
        break;
      }
      localObject5 = THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH;
      localObject8 = String.valueOf(i2);
      localDataLength3 = FieldParser.DataLength.fixed(m);
      ((Map)localObject5).put(localObject8, localDataLength3);
      i2 += 1;
    }
    localObject1 = THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH;
    localObject8 = FieldParser.DataLength.variable(i5);
    ((Map)localObject1).put("390", localObject8);
    localObject8 = FieldParser.DataLength.variable(i);
    ((Map)localObject1).put("391", localObject8);
    localDataLength2 = FieldParser.DataLength.variable(i5);
    ((Map)localObject1).put("392", localDataLength2);
    localDataLength2 = FieldParser.DataLength.variable(i);
    ((Map)localObject1).put("393", localDataLength2);
    localDataLength2 = FieldParser.DataLength.variable(i3);
    ((Map)localObject1).put("703", localDataLength2);
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    FOUR_DIGIT_DATA_LENGTH = (Map)localObject1;
    localObject5 = m54207b69.F54207b69_11("xk5C5C5D5D");
    localObject7 = FieldParser.DataLength.fixed(i4);
    ((Map)localObject1).put(localObject5, localObject7);
    localObject5 = m54207b69.F54207b69_11("BT63656669");
    localObject7 = FieldParser.DataLength.variable(i3);
    ((Map)localObject1).put(localObject5, localObject7);
    localObject5 = m54207b69.F54207b69_11("680F090A0E");
    i4 = 10;
    localDataLength2 = FieldParser.DataLength.fixed(i4);
    ((Map)localObject1).put(localObject5, localDataLength2);
    localObject5 = m54207b69.F54207b69_11("BF7E77787A");
    localObject2 = FieldParser.DataLength.fixed(j);
    ((Map)localObject1).put(localObject5, localObject2);
    localObject2 = m54207b69.F54207b69_11("MS6B646564");
    localObject3 = FieldParser.DataLength.variable(k);
    ((Map)localObject1).put(localObject2, localObject3);
    localObject2 = m54207b69.F54207b69_11("0b5A535454");
    localObject3 = FieldParser.DataLength.variable(i3);
    ((Map)localObject1).put(localObject2, localObject3);
    localObject2 = m54207b69.F54207b69_11("&E7D767774");
    localObject3 = FieldParser.DataLength.variable(i3);
    ((Map)localObject1).put(localObject2, localObject3);
    localObject2 = m54207b69.F54207b69_11("'-151E1F1B");
    localObject3 = FieldParser.DataLength.fixed(m);
    ((Map)localObject1).put(localObject2, localObject3);
    localObject2 = m54207b69.F54207b69_11("?H70797A81");
    localObject3 = FieldParser.DataLength.fixed(i);
    ((Map)localObject1).put(localObject2, localObject3);
    localObject2 = m54207b69.F54207b69_11("I`5851525A");
    localObject3 = FieldParser.DataLength.variable(i3);
    ((Map)localObject1).put(localObject2, localObject3);
    localObject2 = FieldParser.DataLength.variable(12);
    localObject3 = m54207b69.F54207b69_11("/j525B5C55");
    ((Map)localObject1).put(localObject3, localObject2);
    localObject2 = m54207b69.F54207b69_11("h'1F181822");
    Object localObject9 = FieldParser.DataLength.fixed(i);
    ((Map)localObject1).put(localObject2, localObject9);
    localObject9 = FieldParser.DataLength.variable(25);
    localObject2 = m54207b69.F54207b69_11("^70F08070A");
    ((Map)localObject1).put(localObject2, localObject9);
    localObject9 = m54207b69.F54207b69_11(";@78727273");
    localObject2 = FieldParser.DataLength.fixed(m);
    ((Map)localObject1).put(localObject9, localObject2);
    localObject9 = m54207b69.F54207b69_11("CU6D656767");
    localObject2 = FieldParser.DataLength.fixed(i4);
    ((Map)localObject1).put(localObject9, localObject2);
    localObject9 = m54207b69.F54207b69_11("Xo575F6160");
    localObject2 = FieldParser.DataLength.fixed(n);
    ((Map)localObject1).put(localObject9, localObject2);
    localObject9 = m54207b69.F54207b69_11(">008020303");
    j = 70;
    localObject3 = FieldParser.DataLength.variable(j);
    ((Map)localObject1).put(localObject9, localObject3);
    localObject9 = m54207b69.F54207b69_11("L/171E2122");
    localObject2 = FieldParser.DataLength.variable(j);
    ((Map)localObject1).put(localObject9, localObject2);
  }
  
  public static String parseFieldsInGeneralPurpose(String paramString)
  {
    boolean bool1 = paramString.isEmpty();
    if (bool1) {
      return null;
    }
    int i = paramString.length();
    int k = 2;
    if (i >= k)
    {
      Object localObject1 = TWO_DIGIT_DATA_LENGTH;
      boolean bool4 = false;
      Object localObject2 = paramString.substring(0, k);
      localObject1 = (FieldParser.DataLength)((Map)localObject1).get(localObject2);
      if (localObject1 != null)
      {
        bool4 = ((FieldParser.DataLength)localObject1).variable;
        i = ((FieldParser.DataLength)localObject1).length;
        if (bool4) {
          return processVariableAI(k, i, paramString);
        }
        return processFixedAI(k, i, paramString);
      }
      i = paramString.length();
      k = 3;
      if (i >= k)
      {
        localObject1 = paramString.substring(0, k);
        localObject2 = (FieldParser.DataLength)THREE_DIGIT_DATA_LENGTH.get(localObject1);
        int j;
        if (localObject2 != null)
        {
          boolean bool2 = ((FieldParser.DataLength)localObject2).variable;
          if (bool2)
          {
            j = ((FieldParser.DataLength)localObject2).length;
            return processVariableAI(k, j, paramString);
          }
          j = ((FieldParser.DataLength)localObject2).length;
          return processFixedAI(k, j, paramString);
        }
        k = paramString.length();
        int m = 4;
        if (k >= m)
        {
          Object localObject3 = THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH;
          localObject1 = (FieldParser.DataLength)((Map)localObject3).get(localObject1);
          boolean bool3;
          if (localObject1 != null)
          {
            bool3 = ((FieldParser.DataLength)localObject1).variable;
            j = ((FieldParser.DataLength)localObject1).length;
            if (bool3) {
              return processVariableAI(m, j, paramString);
            }
            return processFixedAI(m, j, paramString);
          }
          localObject1 = FOUR_DIGIT_DATA_LENGTH;
          localObject3 = paramString.substring(0, m);
          localObject1 = (FieldParser.DataLength)((Map)localObject1).get(localObject3);
          if (localObject1 != null)
          {
            bool3 = ((FieldParser.DataLength)localObject1).variable;
            j = ((FieldParser.DataLength)localObject1).length;
            if (bool3) {
              return processVariableAI(m, j, paramString);
            }
            return processFixedAI(m, j, paramString);
          }
          throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
      }
      throw NotFoundException.getNotFoundInstance();
    }
    throw NotFoundException.getNotFoundInstance();
  }
  
  private static String processFixedAI(int paramInt1, int paramInt2, String paramString)
  {
    int i = paramString.length();
    if (i >= paramInt1)
    {
      i = 0;
      String str1 = paramString.substring(0, paramInt1);
      int j = paramString.length();
      paramInt2 += paramInt1;
      if (j >= paramInt2)
      {
        String str2 = paramString.substring(paramInt1, paramInt2);
        String str3 = paramString.substring(paramInt2);
        paramString = new java/lang/StringBuilder;
        paramString.<init>();
        j = 40;
        paramString.append(j);
        paramString.append(str1);
        i = 41;
        paramString.append(i);
        paramString.append(str2);
        str2 = paramString.toString();
        str3 = parseFieldsInGeneralPurpose(str3);
        if (str3 != null)
        {
          paramString = new java/lang/StringBuilder;
          paramString.<init>();
          paramString.append(str2);
          paramString.append(str3);
          str2 = paramString.toString();
        }
        return str2;
      }
      throw NotFoundException.getNotFoundInstance();
    }
    throw NotFoundException.getNotFoundInstance();
  }
  
  private static String processVariableAI(int paramInt1, int paramInt2, String paramString)
  {
    String str1 = paramString.substring(0, paramInt1);
    int i = paramString.length();
    paramInt2 += paramInt1;
    paramInt2 = Math.min(i, paramInt2);
    String str2 = paramString.substring(paramInt1, paramInt2);
    String str3 = paramString.substring(paramInt2);
    paramString = new java/lang/StringBuilder;
    paramString.<init>();
    i = 40;
    paramString.append(i);
    paramString.append(str1);
    char c = ')';
    paramString.append(c);
    paramString.append(str2);
    str2 = paramString.toString();
    str3 = parseFieldsInGeneralPurpose(str3);
    if (str3 != null)
    {
      paramString = new java/lang/StringBuilder;
      paramString.<init>();
      paramString.append(str2);
      paramString.append(str3);
      str2 = paramString.toString();
    }
    return str2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.oned.rss.expanded.decoders.FieldParser
 * JD-Core Version:    0.7.0.1
 */
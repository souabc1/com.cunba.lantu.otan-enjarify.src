package com.google.zxing.common;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m54207b69;

public final class ECIEncoderSet
{
  private static final List ENCODERS;
  private final CharsetEncoder[] encoders;
  private final int priorityEncoderIndex;
  
  static
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    ENCODERS = (List)localObject1;
    String str1 = m54207b69.F54207b69_11(":B0B011179757A");
    Object localObject2 = m54207b69.F54207b69_11("xB0B120F727E7F7D827779");
    Object localObject3 = m54207b69.F54207b69_11("i57C677C1B11120613200F");
    String str2 = m54207b69.F54207b69_11(":L0520056478797F7C6981");
    String str3 = m54207b69.F54207b69_11("[d2D382D4C60615764515A");
    String str4 = m54207b69.F54207b69_11("b17863801F0D0E0A0F2410");
    String str5 = m54207b69.F54207b69_11("T47D687D1C10110714210C");
    String str6 = m54207b69.F54207b69_11("='6E756A0D232418251228");
    String str7 = m54207b69.F54207b69_11("cI001B0867757682776C79");
    String str8 = m54207b69.F54207b69_11("w$6D786D0C20211724111E1E");
    String str9 = m54207b69.F54207b69_11("k%6C776C0B21221623101D1E");
    String str10 = m54207b69.F54207b69_11("5E0C170C6B81827683707D80");
    String str11 = m54207b69.F54207b69_11(">=746F7413090A0E0B181513");
    String str12 = m54207b69.F54207b69_11("eF0F160B6E8283798673807D");
    String str13 = m54207b69.F54207b69_11("C?766D72150B0C100D1A1713");
    String str14 = m54207b69.F54207b69_11("F%524D4D444E575C0F1C201A20");
    String str15 = m54207b69.F54207b69_11(">4435E5C535F484D200D0F0B10");
    String str16 = m54207b69.F54207b69_11("4A36293128323B3873787C7E7E");
    String str17 = m54207b69.F54207b69_11("q.5948424D455E630A27252523");
    String str18 = m54207b69.F54207b69_11("02615B5D574A727E8269");
    String[] tmp154_151 = new String[20];
    String[] tmp155_154 = tmp154_151;
    String[] tmp155_154 = tmp154_151;
    tmp155_154[0] = str1;
    tmp155_154[1] = localObject2;
    String[] tmp162_155 = tmp155_154;
    String[] tmp162_155 = tmp155_154;
    tmp162_155[2] = localObject3;
    tmp162_155[3] = str2;
    String[] tmp170_162 = tmp162_155;
    String[] tmp170_162 = tmp162_155;
    tmp170_162[4] = str3;
    tmp170_162[5] = str4;
    String[] tmp179_170 = tmp170_162;
    String[] tmp179_170 = tmp170_162;
    tmp179_170[6] = str5;
    tmp179_170[7] = str6;
    String[] tmp190_179 = tmp179_170;
    String[] tmp190_179 = tmp179_170;
    tmp190_179[8] = str7;
    tmp190_179[9] = str8;
    String[] tmp201_190 = tmp190_179;
    String[] tmp201_190 = tmp190_179;
    tmp201_190[10] = str9;
    tmp201_190[11] = str10;
    String[] tmp212_201 = tmp201_190;
    String[] tmp212_201 = tmp201_190;
    tmp212_201[12] = str11;
    tmp212_201[13] = str12;
    String[] tmp223_212 = tmp212_201;
    String[] tmp223_212 = tmp212_201;
    tmp223_212[14] = str13;
    tmp223_212[15] = str14;
    String[] tmp234_223 = tmp223_212;
    String[] tmp234_223 = tmp223_212;
    tmp234_223[16] = str15;
    tmp234_223[17] = str16;
    tmp234_223[18] = str17;
    String[] tmp250_234 = tmp234_223;
    tmp250_234[19] = str18;
    localObject1 = tmp250_234;
    int i = 0;
    str1 = null;
    for (;;)
    {
      int j = 20;
      if (i >= j) {
        break;
      }
      localObject2 = localObject1[i];
      localObject3 = CharacterSetECI.getCharacterSetECIByName((String)localObject2);
      if (localObject3 != null) {}
      try
      {
        localObject3 = ENCODERS;
        localObject2 = Charset.forName((String)localObject2);
        localObject2 = ((Charset)localObject2).newEncoder();
        ((List)localObject3).add(localObject2);
      }
      catch (UnsupportedCharsetException localUnsupportedCharsetException)
      {
        label309:
        break label309;
      }
      i += 1;
    }
  }
  
  public ECIEncoderSet(String paramString, Charset paramCharset, int paramInt)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    CharsetEncoder localCharsetEncoder1 = StandardCharsets.ISO_8859_1.newEncoder();
    ((List)localObject1).add(localCharsetEncoder1);
    int i = 0;
    localCharsetEncoder1 = null;
    int j = 1;
    if (paramCharset != null)
    {
      localObject2 = paramCharset.name();
      str = "UTF";
      boolean bool1 = ((String)localObject2).startsWith(str);
      if (bool1)
      {
        k = j;
        break label82;
      }
    }
    int k = 0;
    Object localObject2 = null;
    label82:
    int m = 0;
    String str = null;
    for (;;)
    {
      int n = paramString.length();
      if (m >= n) {
        break;
      }
      Iterator localIterator = ((List)localObject1).iterator();
      boolean bool2;
      Object localObject3;
      do
      {
        bool2 = localIterator.hasNext();
        if (!bool2) {
          break label171;
        }
        localObject3 = (CharsetEncoder)localIterator.next();
        int i1 = paramString.charAt(m);
        if (i1 == paramInt) {
          break;
        }
        bool2 = ((CharsetEncoder)localObject3).canEncode(i1);
      } while (!bool2);
      n = j;
      break label177;
      label171:
      n = 0;
      localIterator = null;
      label177:
      if (n == 0)
      {
        localObject3 = ENCODERS.iterator();
        CharsetEncoder localCharsetEncoder2;
        boolean bool4;
        do
        {
          boolean bool3 = ((Iterator)localObject3).hasNext();
          if (!bool3) {
            break;
          }
          localCharsetEncoder2 = (CharsetEncoder)((Iterator)localObject3).next();
          char c = paramString.charAt(m);
          bool4 = localCharsetEncoder2.canEncode(c);
        } while (!bool4);
        ((List)localObject1).add(localCharsetEncoder2);
        n = j;
      }
      if (n == 0) {
        k = j;
      }
      m += 1;
    }
    int i2 = ((List)localObject1).size();
    Object localObject4;
    if ((i2 == j) && (k == 0))
    {
      paramString = new CharsetEncoder[j];
      localObject4 = (CharsetEncoder)((List)localObject1).get(0);
      paramString[0] = localObject4;
      this.encoders = paramString;
    }
    else
    {
      i2 = ((List)localObject1).size() + 2;
      paramString = new CharsetEncoder[i2];
      this.encoders = paramString;
      paramString = ((List)localObject1).iterator();
      paramInt = 0;
      localObject4 = null;
      for (;;)
      {
        boolean bool6 = paramString.hasNext();
        if (!bool6) {
          break;
        }
        localObject1 = (CharsetEncoder)paramString.next();
        localObject2 = this.encoders;
        m = paramInt + 1;
        localObject2[paramInt] = localObject1;
        paramInt = m;
      }
      paramString = this.encoders;
      localObject1 = StandardCharsets.UTF_8.newEncoder();
      paramString[paramInt] = localObject1;
      paramString = this.encoders;
      paramInt += j;
      localObject1 = StandardCharsets.UTF_16BE.newEncoder();
      paramString[paramInt] = localObject1;
    }
    if (paramCharset != null) {
      for (;;)
      {
        paramString = this.encoders;
        paramInt = paramString.length;
        if (i >= paramInt) {
          break;
        }
        paramString = paramString[i];
        if (paramString != null)
        {
          paramString = paramCharset.name();
          localObject4 = this.encoders[i].charset().name();
          boolean bool5 = paramString.equals(localObject4);
          if (bool5) {
            break label523;
          }
        }
        i += 1;
      }
    }
    i = -1;
    label523:
    this.priorityEncoderIndex = i;
  }
  
  public boolean canEncode(char paramChar, int paramInt)
  {
    CharsetEncoder localCharsetEncoder = this.encoders[paramInt];
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("");
    localStringBuilder.append(paramChar);
    String str = localStringBuilder.toString();
    return localCharsetEncoder.canEncode(str);
  }
  
  public byte[] encode(char paramChar, int paramInt)
  {
    Object localObject = this.encoders[paramInt];
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("");
    localStringBuilder.append(paramChar);
    String str = localStringBuilder.toString();
    localObject = ((CharsetEncoder)localObject).charset();
    return str.getBytes((Charset)localObject);
  }
  
  public byte[] encode(String paramString, int paramInt)
  {
    Charset localCharset = this.encoders[paramInt].charset();
    return paramString.getBytes(localCharset);
  }
  
  public Charset getCharset(int paramInt)
  {
    return this.encoders[paramInt].charset();
  }
  
  public String getCharsetName(int paramInt)
  {
    return this.encoders[paramInt].charset().name();
  }
  
  public int getECIValue(int paramInt)
  {
    return CharacterSetECI.getCharacterSetECI(this.encoders[paramInt].charset()).getValue();
  }
  
  public int getPriorityEncoderIndex()
  {
    return this.priorityEncoderIndex;
  }
  
  public int length()
  {
    return this.encoders.length;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.common.ECIEncoderSet
 * JD-Core Version:    0.7.0.1
 */
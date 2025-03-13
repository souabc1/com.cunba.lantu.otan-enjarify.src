package com.google.zxing.common;

import com.google.zxing.DecodeHintType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Map;
import m54207b69;

public final class StringUtils
{
  private static final boolean ASSUME_SHIFT_JIS = false;
  private static final Charset EUC_JP;
  public static final String GB2312 = "GB2312";
  public static final Charset GB2312_CHARSET;
  private static final Charset PLATFORM_DEFAULT_ENCODING = ;
  public static final String SHIFT_JIS = "SJIS";
  public static final Charset SHIFT_JIS_CHARSET = Charset.forName(m54207b69.F54207b69_11("':6971756C"));
  
  static
  {
    Object localObject = "jv313546484B49";
    try
    {
      localObject = m54207b69.F54207b69_11((String)localObject);
      localObject = Charset.forName((String)localObject);
    }
    catch (UnsupportedCharsetException localUnsupportedCharsetException)
    {
      bool1 = false;
      localObject = null;
    }
    GB2312_CHARSET = (Charset)localObject;
    localObject = Charset.forName(m54207b69.F54207b69_11("b[1E0F1A071510"));
    EUC_JP = (Charset)localObject;
    Charset localCharset1 = SHIFT_JIS_CHARSET;
    Charset localCharset2 = PLATFORM_DEFAULT_ENCODING;
    boolean bool2 = localCharset1.equals(localCharset2);
    if (!bool2)
    {
      bool1 = ((Charset)localObject).equals(localCharset2);
      if (!bool1)
      {
        bool1 = false;
        localObject = null;
        break label97;
      }
    }
    boolean bool1 = true;
    label97:
    ASSUME_SHIFT_JIS = bool1;
  }
  
  public static Charset guessCharset(byte[] paramArrayOfByte, Map paramMap)
  {
    Object localObject = paramArrayOfByte;
    if (paramMap != null)
    {
      localDecodeHintType = DecodeHintType.CHARACTER_SET;
      i = paramMap.containsKey(localDecodeHintType);
      if (i != 0) {
        return Charset.forName(paramMap.get(localDecodeHintType).toString());
      }
    }
    int j = localObject.length;
    int k = 2;
    int i = 1;
    int m = 0;
    if (j > k)
    {
      j = localObject[0];
      n = -2;
      i1 = -1;
      if (j == n)
      {
        i2 = localObject[i];
        if (i2 == i1) {}
      }
      else
      {
        if (j != i1) {
          break label114;
        }
        j = localObject[i];
        if (j != n) {
          break label114;
        }
      }
      return StandardCharsets.UTF_16;
    }
    label114:
    j = localObject.length;
    int n = localObject.length;
    int i1 = 3;
    if (n > i1)
    {
      n = localObject[0];
      i2 = -17;
      if (n == i2)
      {
        n = localObject[i];
        i2 = -69;
        if (n == i2)
        {
          n = localObject[k];
          i2 = -65;
          if (n == i2)
          {
            n = i;
            break label192;
          }
        }
      }
    }
    n = 0;
    label192:
    int i2 = i;
    boolean bool1 = i;
    k = 0;
    DecodeHintType localDecodeHintType = null;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    while ((i3 < j) && ((i != 0) || (i2 != 0) || (bool1)))
    {
      i1 = localObject[i3] & 0xFF;
      if (bool1)
      {
        i13 = i1 & 0x80;
        if (i4 > 0) {
          if (i13 != 0) {}
        }
        do
        {
          do
          {
            bool1 = false;
            break;
            i4 += -1;
            break;
            if (i13 == 0) {
              break;
            }
            i13 = i1 & 0x40;
          } while (i13 == 0);
          i4 += 1;
          i13 = i1 & 0x20;
          if (i13 == 0)
          {
            i6 += 1;
            break;
          }
          i4 += 1;
          i13 = i1 & 0x10;
          if (i13 == 0)
          {
            i7 += 1;
            break;
          }
          i4 += 1;
          i13 = i1 & 0x8;
        } while (i13 != 0);
        i8 += 1;
      }
      int i13 = 127;
      if (i != 0)
      {
        if (i1 > i13)
        {
          i13 = 160;
          if (i1 < i13)
          {
            i = 0;
            break label491;
          }
        }
        i13 = 159;
        if (i1 > i13)
        {
          i13 = 192;
          if (i1 >= i13)
          {
            i13 = 215;
            if (i1 != i13)
            {
              i13 = 247;
              if (i1 != i13) {
                break label491;
              }
            }
          }
          i10 += 1;
        }
      }
      label491:
      if (i2 != 0)
      {
        if (i5 > 0)
        {
          i13 = 64;
          if (i1 >= i13)
          {
            i13 = 127;
            if (i1 != i13)
            {
              i13 = 252;
              if (i1 <= i13)
              {
                i5 += -1;
                break label710;
              }
            }
          }
        }
        else
        {
          i13 = 128;
          if (i1 != i13)
          {
            i13 = 160;
            if (i1 != i13)
            {
              i13 = 239;
              if (i1 <= i13)
              {
                i13 = 160;
                if (i1 > i13)
                {
                  i13 = 224;
                  if (i1 < i13)
                  {
                    k += 1;
                    i13 = i12 + 1;
                    if (i13 > i9)
                    {
                      i9 = i13;
                      i12 = i13;
                    }
                    else
                    {
                      i12 = i13;
                    }
                    i11 = 0;
                    break label710;
                  }
                }
                i13 = 127;
                if (i1 > i13)
                {
                  i5 += 1;
                  i13 = i11 + 1;
                  if (i13 > m)
                  {
                    m = i13;
                    i11 = i13;
                  }
                  else
                  {
                    i11 = i13;
                  }
                }
                else
                {
                  i11 = 0;
                }
                i12 = 0;
                break label710;
              }
            }
          }
        }
        i2 = 0;
      }
      label710:
      i3 += 1;
      localObject = paramArrayOfByte;
      i1 = 3;
    }
    if ((bool1) && (i4 > 0)) {
      bool1 = false;
    }
    if ((i2 != 0) && (i5 > 0)) {
      i2 = 0;
    }
    if (bool1) {
      if (n == 0)
      {
        i6 = i6 + i7 + i8;
        if (i6 <= 0) {}
      }
      else
      {
        return StandardCharsets.UTF_8;
      }
    }
    int i14;
    if (i2 != 0)
    {
      boolean bool2 = ASSUME_SHIFT_JIS;
      if (!bool2)
      {
        i14 = 3;
        if ((i9 < i14) && (m < i14)) {}
      }
      else
      {
        return SHIFT_JIS_CHARSET;
      }
    }
    if ((i != 0) && (i2 != 0))
    {
      i14 = 2;
      if ((i9 != i14) || (k != i14))
      {
        i14 = i10 * 10;
        if (i14 < j) {}
      }
      else
      {
        localObject = SHIFT_JIS_CHARSET;
        break label867;
      }
      localObject = StandardCharsets.ISO_8859_1;
      label867:
      return localObject;
    }
    if (i != 0) {
      return StandardCharsets.ISO_8859_1;
    }
    if (i2 != 0) {
      return SHIFT_JIS_CHARSET;
    }
    if (bool1) {
      return StandardCharsets.UTF_8;
    }
    return PLATFORM_DEFAULT_ENCODING;
  }
  
  public static String guessEncoding(byte[] paramArrayOfByte, Map paramMap)
  {
    paramArrayOfByte = guessCharset(paramArrayOfByte, paramMap);
    paramMap = SHIFT_JIS_CHARSET;
    boolean bool = paramArrayOfByte.equals(paramMap);
    if (bool) {
      return m54207b69.F54207b69_11("':6971756C");
    }
    paramMap = StandardCharsets.UTF_8;
    bool = paramArrayOfByte.equals(paramMap);
    if (bool) {
      return m54207b69.F54207b69_11(";&73736221");
    }
    paramMap = StandardCharsets.ISO_8859_1;
    bool = paramArrayOfByte.equals(paramMap);
    if (bool) {
      return m54207b69.F54207b69_11("$K021906767783781B82");
    }
    return paramArrayOfByte.name();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.common.StringUtils
 * JD-Core Version:    0.7.0.1
 */
package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m54207b69;

public abstract class ResultParser
{
  private static final Pattern AMPERSAND;
  private static final String BYTE_ORDER_MARK = "﻿";
  private static final Pattern DIGITS;
  static final String[] EMPTY_STR_ARRAY = new String[0];
  private static final Pattern EQUALS;
  private static final ResultParser[] PARSERS;
  
  static
  {
    ResultParser[] arrayOfResultParser = new ResultParser[20];
    Object localObject = new com/google/zxing/client/result/BookmarkDoCoMoResultParser;
    ((BookmarkDoCoMoResultParser)localObject).<init>();
    arrayOfResultParser[0] = localObject;
    localObject = new com/google/zxing/client/result/AddressBookDoCoMoResultParser;
    ((AddressBookDoCoMoResultParser)localObject).<init>();
    arrayOfResultParser[1] = localObject;
    localObject = new com/google/zxing/client/result/EmailDoCoMoResultParser;
    ((EmailDoCoMoResultParser)localObject).<init>();
    arrayOfResultParser[2] = localObject;
    localObject = new com/google/zxing/client/result/AddressBookAUResultParser;
    ((AddressBookAUResultParser)localObject).<init>();
    arrayOfResultParser[3] = localObject;
    localObject = new com/google/zxing/client/result/VCardResultParser;
    ((VCardResultParser)localObject).<init>();
    arrayOfResultParser[4] = localObject;
    localObject = new com/google/zxing/client/result/BizcardResultParser;
    ((BizcardResultParser)localObject).<init>();
    arrayOfResultParser[5] = localObject;
    localObject = new com/google/zxing/client/result/VEventResultParser;
    ((VEventResultParser)localObject).<init>();
    arrayOfResultParser[6] = localObject;
    localObject = new com/google/zxing/client/result/EmailAddressResultParser;
    ((EmailAddressResultParser)localObject).<init>();
    arrayOfResultParser[7] = localObject;
    localObject = new com/google/zxing/client/result/SMTPResultParser;
    ((SMTPResultParser)localObject).<init>();
    arrayOfResultParser[8] = localObject;
    localObject = new com/google/zxing/client/result/TelResultParser;
    ((TelResultParser)localObject).<init>();
    arrayOfResultParser[9] = localObject;
    localObject = new com/google/zxing/client/result/SMSMMSResultParser;
    ((SMSMMSResultParser)localObject).<init>();
    arrayOfResultParser[10] = localObject;
    localObject = new com/google/zxing/client/result/SMSTOMMSTOResultParser;
    ((SMSTOMMSTOResultParser)localObject).<init>();
    arrayOfResultParser[11] = localObject;
    localObject = new com/google/zxing/client/result/GeoResultParser;
    ((GeoResultParser)localObject).<init>();
    arrayOfResultParser[12] = localObject;
    localObject = new com/google/zxing/client/result/WifiResultParser;
    ((WifiResultParser)localObject).<init>();
    arrayOfResultParser[13] = localObject;
    localObject = new com/google/zxing/client/result/URLTOResultParser;
    ((URLTOResultParser)localObject).<init>();
    arrayOfResultParser[14] = localObject;
    localObject = new com/google/zxing/client/result/URIResultParser;
    ((URIResultParser)localObject).<init>();
    arrayOfResultParser[15] = localObject;
    localObject = new com/google/zxing/client/result/ISBNResultParser;
    ((ISBNResultParser)localObject).<init>();
    arrayOfResultParser[16] = localObject;
    localObject = new com/google/zxing/client/result/ProductResultParser;
    ((ProductResultParser)localObject).<init>();
    arrayOfResultParser[17] = localObject;
    localObject = new com/google/zxing/client/result/ExpandedProductResultParser;
    ((ExpandedProductResultParser)localObject).<init>();
    arrayOfResultParser[18] = localObject;
    localObject = new com/google/zxing/client/result/VINResultParser;
    ((VINResultParser)localObject).<init>();
    arrayOfResultParser[19] = localObject;
    PARSERS = arrayOfResultParser;
    DIGITS = Pattern.compile("\\d+");
    AMPERSAND = Pattern.compile("&");
    EQUALS = Pattern.compile("=");
  }
  
  private static void appendKeyValue(CharSequence paramCharSequence, Map paramMap)
  {
    Pattern localPattern = EQUALS;
    int i = 2;
    paramCharSequence = localPattern.split(paramCharSequence, i);
    int j = paramCharSequence.length;
    if (j == i)
    {
      j = 0;
      localPattern = paramCharSequence[0];
      i = 1;
      paramCharSequence = paramCharSequence[i];
    }
    try
    {
      paramCharSequence = urlDecode(paramCharSequence);
      paramMap.put(localPattern, paramCharSequence);
      label50:
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      break label50;
    }
  }
  
  private static int countPrecedingBackslashes(CharSequence paramCharSequence, int paramInt)
  {
    paramInt += -1;
    int i = 0;
    while (paramInt >= 0)
    {
      int j = paramCharSequence.charAt(paramInt);
      int k = 92;
      if (j != k) {
        break;
      }
      i += 1;
      paramInt += -1;
    }
    return i;
  }
  
  public static String getMassagedText(Result paramResult)
  {
    paramResult = paramResult.getText();
    String str = "﻿";
    int i = paramResult.startsWith(str);
    if (i != 0)
    {
      i = 1;
      paramResult = paramResult.substring(i);
    }
    return paramResult;
  }
  
  public static boolean isStringOfDigits(CharSequence paramCharSequence, int paramInt)
  {
    if ((paramCharSequence != null) && (paramInt > 0))
    {
      int i = paramCharSequence.length();
      if (paramInt == i)
      {
        Pattern localPattern = DIGITS;
        paramCharSequence = localPattern.matcher(paramCharSequence);
        bool = paramCharSequence.matches();
        if (bool)
        {
          bool = true;
          break label52;
        }
      }
    }
    boolean bool = false;
    paramCharSequence = null;
    label52:
    return bool;
  }
  
  public static boolean isSubstringOfDigits(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    if ((paramCharSequence != null) && (paramInt2 > 0))
    {
      paramInt2 += paramInt1;
      int i = paramCharSequence.length();
      if (i >= paramInt2)
      {
        Pattern localPattern = DIGITS;
        paramCharSequence = paramCharSequence.subSequence(paramInt1, paramInt2);
        paramCharSequence = localPattern.matcher(paramCharSequence);
        boolean bool2 = paramCharSequence.matches();
        if (bool2) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public static String[] matchPrefixedField(String paramString1, String paramString2, char paramChar, boolean paramBoolean)
  {
    int i = paramString2.length();
    int j = 0;
    Object localObject1 = null;
    int k = 0;
    while (k < i)
    {
      k = paramString2.indexOf(paramString1, k);
      if (k < 0) {
        break;
      }
      int m = paramString1.length();
      k += m;
      m = 1;
      int n = m;
      Object localObject2 = localObject1;
      j = k;
      if (n != 0)
      {
        j = paramString2.indexOf(paramChar, j);
        if (j < 0) {
          j = paramString2.length();
        }
        for (;;)
        {
          n = 0;
          String str = null;
          break;
          int i1 = countPrecedingBackslashes(paramString2, j) % 2;
          if (i1 != 0)
          {
            j += 1;
            break;
          }
          if (localObject2 == null)
          {
            localObject2 = new java/util/ArrayList;
            n = 3;
            ((ArrayList)localObject2).<init>(n);
          }
          str = unescapeBackslash(paramString2.substring(k, j));
          if (paramBoolean) {
            str = str.trim();
          }
          boolean bool1 = str.isEmpty();
          if (!bool1) {
            ((List)localObject2).add(str);
          }
          j += 1;
        }
      }
      k = j;
      localObject1 = localObject2;
    }
    if (localObject1 != null)
    {
      boolean bool2 = localObject1.isEmpty();
      if (!bool2)
      {
        paramString1 = EMPTY_STR_ARRAY;
        return (String[])localObject1.toArray(paramString1);
      }
    }
    return null;
  }
  
  public static String matchSinglePrefixedField(String paramString1, String paramString2, char paramChar, boolean paramBoolean)
  {
    paramString1 = matchPrefixedField(paramString1, paramString2, paramChar, paramBoolean);
    if (paramString1 == null)
    {
      paramString1 = null;
    }
    else
    {
      paramString2 = null;
      paramString1 = paramString1[0];
    }
    return paramString1;
  }
  
  public static void maybeAppend(String paramString, StringBuilder paramStringBuilder)
  {
    if (paramString != null)
    {
      char c = '\n';
      paramStringBuilder.append(c);
      paramStringBuilder.append(paramString);
    }
  }
  
  public static void maybeAppend(String[] paramArrayOfString, StringBuilder paramStringBuilder)
  {
    if (paramArrayOfString != null)
    {
      int i = paramArrayOfString.length;
      int j = 0;
      while (j < i)
      {
        String str = paramArrayOfString[j];
        char c = '\n';
        paramStringBuilder.append(c);
        paramStringBuilder.append(str);
        j += 1;
      }
    }
  }
  
  public static String[] maybeWrap(String paramString)
  {
    if (paramString == null) {
      paramString = null;
    } else {
      paramString = new String[] { paramString };
    }
    return paramString;
  }
  
  public static int parseHexDigit(char paramChar)
  {
    char c1 = '0';
    char c2;
    if (paramChar >= c1)
    {
      c2 = '9';
      if (paramChar <= c2) {
        return paramChar - c1;
      }
    }
    c1 = 'a';
    if (paramChar >= c1)
    {
      c2 = 'f';
      if (paramChar > c2) {}
    }
    do
    {
      return paramChar - c1 + 10;
      c1 = 'A';
      if (paramChar < c1) {
        break;
      }
      c2 = 'F';
    } while (paramChar <= c2);
    return -1;
  }
  
  public static Map parseNameValuePairs(String paramString)
  {
    int i = paramString.indexOf('?');
    if (i < 0) {
      return null;
    }
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>(3);
    Pattern localPattern = AMPERSAND;
    i += 1;
    paramString = paramString.substring(i);
    paramString = localPattern.split(paramString);
    i = paramString.length;
    int j = 0;
    localPattern = null;
    while (j < i)
    {
      CharSequence localCharSequence = paramString[j];
      appendKeyValue(localCharSequence, localHashMap);
      j += 1;
    }
    return localHashMap;
  }
  
  public static ParsedResult parseResult(Result paramResult)
  {
    Object localObject = PARSERS;
    int i = localObject.length;
    int j = 0;
    while (j < i)
    {
      ParsedResult localParsedResult = localObject[j].parse(paramResult);
      if (localParsedResult != null) {
        return localParsedResult;
      }
      j += 1;
    }
    localObject = new com/google/zxing/client/result/TextParsedResult;
    paramResult = paramResult.getText();
    ((TextParsedResult)localObject).<init>(paramResult, null);
    return localObject;
  }
  
  public static String unescapeBackslash(String paramString)
  {
    int i = 92;
    int j = paramString.indexOf(i);
    if (j < 0) {
      return paramString;
    }
    int k = paramString.length();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int m = k + -1;
    localStringBuilder.<init>(m);
    char[] arrayOfChar = paramString.toCharArray();
    localStringBuilder.append(arrayOfChar, 0, j);
    m = 0;
    arrayOfChar = null;
    while (j < k)
    {
      char c = paramString.charAt(j);
      if ((m == 0) && (c == i))
      {
        m = 1;
      }
      else
      {
        localStringBuilder.append(c);
        m = 0;
        arrayOfChar = null;
      }
      j += 1;
    }
    return localStringBuilder.toString();
  }
  
  public static String urlDecode(String paramString)
  {
    Object localObject = "2i3C3E314755";
    try
    {
      localObject = m54207b69.F54207b69_11((String)localObject);
      return URLDecoder.decode(paramString, (String)localObject);
    }
    catch (UnsupportedEncodingException paramString)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>(paramString);
      throw ((Throwable)localObject);
    }
  }
  
  public abstract ParsedResult parse(Result paramResult);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.client.result.ResultParser
 * JD-Core Version:    0.7.0.1
 */
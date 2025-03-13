package com.qinggan.util;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import m54207b69;
import org.xmlpull.v1.XmlSerializer;

public class XmlUtils
{
  public static final void OooO00o(byte[] paramArrayOfByte, String paramString, XmlSerializer paramXmlSerializer)
  {
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = m54207b69.F54207b69_11("C?514B5556");
      paramXmlSerializer.startTag(null, paramArrayOfByte);
      paramXmlSerializer.endTag(null, paramArrayOfByte);
      return;
    }
    String str1 = m54207b69.F54207b69_11("$d061E12044D0A1C1D0D26");
    paramXmlSerializer.startTag(null, str1);
    if (paramString != null)
    {
      localObject = m54207b69.F54207b69_11("NI2729262F");
      paramXmlSerializer.attribute(null, (String)localObject, paramString);
    }
    int i = paramArrayOfByte.length;
    String str2 = Integer.toString(i);
    paramXmlSerializer.attribute(null, "num", str2);
    Object localObject = new java/lang/StringBuilder;
    int j = paramArrayOfByte.length * 2;
    ((StringBuilder)localObject).<init>(j);
    j = 0;
    str2 = null;
    while (j < i)
    {
      int k = paramArrayOfByte[j];
      int m = k >> 4;
      int n = 10;
      if (m >= n) {
        m = m + 97 - n;
      } else {
        m += 48;
      }
      ((StringBuilder)localObject).append(m);
      k &= 0xFF;
      if (k >= n) {
        k = k + 97 - n;
      } else {
        k += 48;
      }
      ((StringBuilder)localObject).append(k);
      j += 1;
    }
    paramArrayOfByte = ((StringBuilder)localObject).toString();
    paramXmlSerializer.text(paramArrayOfByte);
    paramXmlSerializer.endTag(null, str1);
  }
  
  public static final void OooO0O0(int[] paramArrayOfInt, String paramString, XmlSerializer paramXmlSerializer)
  {
    if (paramArrayOfInt == null)
    {
      paramArrayOfInt = m54207b69.F54207b69_11("C?514B5556");
      paramXmlSerializer.startTag(null, paramArrayOfInt);
      paramXmlSerializer.endTag(null, paramArrayOfInt);
      return;
    }
    String str1 = m54207b69.F54207b69_11("Fx11170E581D0F102009");
    paramXmlSerializer.startTag(null, str1);
    if (paramString != null)
    {
      str2 = m54207b69.F54207b69_11("NI2729262F");
      paramXmlSerializer.attribute(null, str2, paramString);
    }
    int i = paramArrayOfInt.length;
    String str3 = Integer.toString(i);
    paramXmlSerializer.attribute(null, "num", str3);
    int j = 0;
    String str2 = null;
    while (j < i)
    {
      str3 = m54207b69.F54207b69_11("qY302E3E37");
      paramXmlSerializer.startTag(null, str3);
      int k = paramArrayOfInt[j];
      String str4 = Integer.toString(k);
      String str5 = m54207b69.F54207b69_11("M046525E4859");
      paramXmlSerializer.attribute(null, str5, str4);
      paramXmlSerializer.endTag(null, str3);
      j += 1;
    }
    paramXmlSerializer.endTag(null, str1);
  }
  
  public static final void OooO0OO(List paramList, String paramString, XmlSerializer paramXmlSerializer)
  {
    if (paramList == null)
    {
      paramList = m54207b69.F54207b69_11("C?514B5556");
      paramXmlSerializer.startTag(null, paramList);
      paramXmlSerializer.endTag(null, paramList);
      return;
    }
    String str1 = m54207b69.F54207b69_11("K^32382F2D");
    paramXmlSerializer.startTag(null, str1);
    if (paramString != null)
    {
      str2 = m54207b69.F54207b69_11("NI2729262F");
      paramXmlSerializer.attribute(null, str2, paramString);
    }
    int i = paramList.size();
    int j = 0;
    String str2 = null;
    while (j < i)
    {
      Object localObject = paramList.get(j);
      OooO0o(localObject, null, paramXmlSerializer);
      j += 1;
    }
    paramXmlSerializer.endTag(null, str1);
  }
  
  public static final void OooO0Oo(Map paramMap, OutputStream paramOutputStream)
  {
    FastXmlSerializer localFastXmlSerializer = new com/qinggan/util/FastXmlSerializer;
    localFastXmlSerializer.<init>();
    String str = m54207b69.F54207b69_11("OO3A3C2B657B");
    localFastXmlSerializer.setOutput(paramOutputStream, str);
    paramOutputStream = Boolean.TRUE;
    localFastXmlSerializer.startDocument(null, paramOutputStream);
    paramOutputStream = m54207b69.F54207b69_11("B;5350514E05191A4A5E60555963642363596D26601E29756B702D7779766C6C687E693776737B7D3F7A7E8989817C44837E807D8183");
    localFastXmlSerializer.setFeature(paramOutputStream, true);
    OooO0o0(paramMap, null, localFastXmlSerializer);
    localFastXmlSerializer.endDocument();
  }
  
  public static final void OooO0o(Object paramObject, String paramString, XmlSerializer paramXmlSerializer)
  {
    String str1 = m54207b69.F54207b69_11("NI2729262F");
    if (paramObject == null)
    {
      String str2 = "C?514B5556";
      paramObject = m54207b69.F54207b69_11(str2);
      paramXmlSerializer.startTag(null, paramObject);
      if (paramString != null) {
        paramXmlSerializer.attribute(null, str1, paramString);
      }
      paramXmlSerializer.endTag(null, paramObject);
      return;
    }
    boolean bool = paramObject instanceof String;
    String str3 = m54207b69.F54207b69_11("MR2127223E403A");
    if (bool)
    {
      paramXmlSerializer.startTag(null, str3);
      if (paramString != null) {
        paramXmlSerializer.attribute(null, str1, paramString);
      }
      paramObject = paramObject.toString();
      paramXmlSerializer.text(paramObject);
      paramXmlSerializer.endTag(null, str3);
      return;
    }
    bool = paramObject instanceof Integer;
    String str4;
    if (bool)
    {
      str4 = "int";
    }
    else
    {
      bool = paramObject instanceof Long;
      if (bool)
      {
        str4 = m54207b69.F54207b69_11("x^3232323C");
      }
      else
      {
        bool = paramObject instanceof Float;
        if (bool)
        {
          str4 = m54207b69.F54207b69_11(".o090402111F");
        }
        else
        {
          bool = paramObject instanceof Double;
          if (bool)
          {
            str4 = m54207b69.F54207b69_11("=N2A223D2F2630");
          }
          else
          {
            bool = paramObject instanceof Boolean;
            if (!bool) {
              break label274;
            }
            str4 = m54207b69.F54207b69_11("`M2F2324242C3129");
          }
        }
      }
    }
    paramXmlSerializer.startTag(null, str4);
    if (paramString != null) {
      paramXmlSerializer.attribute(null, str1, paramString);
    }
    paramString = m54207b69.F54207b69_11("M046525E4859");
    paramObject = paramObject.toString();
    paramXmlSerializer.attribute(null, paramString, paramObject);
    paramXmlSerializer.endTag(null, str4);
    return;
    label274:
    bool = paramObject instanceof byte[];
    if (bool)
    {
      OooO00o((byte[])paramObject, paramString, paramXmlSerializer);
      return;
    }
    bool = paramObject instanceof int[];
    if (bool)
    {
      OooO0O0((int[])paramObject, paramString, paramXmlSerializer);
      return;
    }
    bool = paramObject instanceof Map;
    if (bool)
    {
      OooO0o0((Map)paramObject, paramString, paramXmlSerializer);
      return;
    }
    bool = paramObject instanceof List;
    if (bool)
    {
      OooO0OO((List)paramObject, paramString, paramXmlSerializer);
      return;
    }
    bool = paramObject instanceof CharSequence;
    if (bool)
    {
      paramXmlSerializer.startTag(null, str3);
      if (paramString != null) {
        paramXmlSerializer.attribute(null, str1, paramString);
      }
      paramObject = paramObject.toString();
      paramXmlSerializer.text(paramObject);
      paramXmlSerializer.endTag(null, str3);
      return;
    }
    paramString = new java/lang/StringBuilder;
    paramString.<init>();
    paramXmlSerializer = m54207b69.F54207b69_11("7b15110D190B3909151F10441A1A6550261C1412211B572C245A2E2A2632246033232F392A66");
    paramString.append(paramXmlSerializer);
    paramString.append(paramObject);
    paramObject = new java/lang/RuntimeException;
    paramString = paramString.toString();
    paramObject.<init>(paramString);
    throw paramObject;
  }
  
  public static final void OooO0o0(Map paramMap, String paramString, XmlSerializer paramXmlSerializer)
  {
    if (paramMap == null)
    {
      paramMap = m54207b69.F54207b69_11("C?514B5556");
      paramXmlSerializer.startTag(null, paramMap);
      paramXmlSerializer.endTag(null, paramMap);
      return;
    }
    paramMap = paramMap.entrySet().iterator();
    String str = "map";
    paramXmlSerializer.startTag(null, str);
    Object localObject;
    if (paramString != null)
    {
      localObject = m54207b69.F54207b69_11("NI2729262F");
      paramXmlSerializer.attribute(null, (String)localObject, paramString);
    }
    for (;;)
    {
      boolean bool = paramMap.hasNext();
      if (!bool) {
        break;
      }
      paramString = (Map.Entry)paramMap.next();
      localObject = paramString.getValue();
      paramString = (String)paramString.getKey();
      OooO0o(localObject, paramString, paramXmlSerializer);
    }
    paramXmlSerializer.endTag(null, str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.util.XmlUtils
 * JD-Core Version:    0.7.0.1
 */
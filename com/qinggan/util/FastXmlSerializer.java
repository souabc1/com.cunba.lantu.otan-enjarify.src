package com.qinggan.util;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import m54207b69;
import org.xmlpull.v1.XmlSerializer;

public class FastXmlSerializer
  implements XmlSerializer
{
  public static final String[] OooO0oo = tmp307_294;
  public ByteBuffer OooO00o;
  public CharsetEncoder OooO0O0;
  public boolean OooO0OO;
  public OutputStream OooO0Oo;
  public final char[] OooO0o;
  public int OooO0o0;
  public Writer OooO0oO;
  
  static
  {
    String str1 = m54207b69.F54207b69_11("[]7B2D2A352D6B");
    String str2 = m54207b69.F54207b69_11("}`46020F135F");
    String str3 = m54207b69.F54207b69_11(".81E554E06");
    String str4 = m54207b69.F54207b69_11("Nz5C1E1044");
    String[] tmp29_26 = new String[64];
    String[] tmp30_29 = tmp29_26;
    String[] tmp30_29 = tmp29_26;
    tmp30_29[0] = null;
    tmp30_29[1] = null;
    String[] tmp37_30 = tmp30_29;
    String[] tmp37_30 = tmp30_29;
    tmp37_30[2] = null;
    tmp37_30[3] = null;
    String[] tmp44_37 = tmp37_30;
    String[] tmp44_37 = tmp37_30;
    tmp44_37[4] = null;
    tmp44_37[5] = null;
    String[] tmp51_44 = tmp44_37;
    String[] tmp51_44 = tmp44_37;
    tmp51_44[6] = null;
    tmp51_44[7] = null;
    String[] tmp60_51 = tmp51_44;
    String[] tmp60_51 = tmp51_44;
    tmp60_51[8] = null;
    tmp60_51[9] = null;
    String[] tmp69_60 = tmp60_51;
    String[] tmp69_60 = tmp60_51;
    tmp69_60[10] = null;
    tmp69_60[11] = null;
    String[] tmp78_69 = tmp69_60;
    String[] tmp78_69 = tmp69_60;
    tmp78_69[12] = null;
    tmp78_69[13] = null;
    String[] tmp87_78 = tmp78_69;
    String[] tmp87_78 = tmp78_69;
    tmp87_78[14] = null;
    tmp87_78[15] = null;
    String[] tmp96_87 = tmp87_78;
    String[] tmp96_87 = tmp87_78;
    tmp96_87[16] = null;
    tmp96_87[17] = null;
    String[] tmp105_96 = tmp96_87;
    String[] tmp105_96 = tmp96_87;
    tmp105_96[18] = null;
    tmp105_96[19] = null;
    String[] tmp114_105 = tmp105_96;
    String[] tmp114_105 = tmp105_96;
    tmp114_105[20] = null;
    tmp114_105[21] = null;
    String[] tmp123_114 = tmp114_105;
    String[] tmp123_114 = tmp114_105;
    tmp123_114[22] = null;
    tmp123_114[23] = null;
    String[] tmp132_123 = tmp123_114;
    String[] tmp132_123 = tmp123_114;
    tmp132_123[24] = null;
    tmp132_123[25] = null;
    String[] tmp141_132 = tmp132_123;
    String[] tmp141_132 = tmp132_123;
    tmp141_132[26] = null;
    tmp141_132[27] = null;
    String[] tmp150_141 = tmp141_132;
    String[] tmp150_141 = tmp141_132;
    tmp150_141[28] = null;
    tmp150_141[29] = null;
    String[] tmp159_150 = tmp150_141;
    String[] tmp159_150 = tmp150_141;
    tmp159_150[30] = null;
    tmp159_150[31] = null;
    String[] tmp168_159 = tmp159_150;
    String[] tmp168_159 = tmp159_150;
    tmp168_159[32] = null;
    tmp168_159[33] = null;
    String[] tmp177_168 = tmp168_159;
    String[] tmp177_168 = tmp168_159;
    tmp177_168[34] = str1;
    tmp177_168[35] = null;
    String[] tmp186_177 = tmp177_168;
    String[] tmp186_177 = tmp177_168;
    tmp186_177[36] = null;
    tmp186_177[37] = null;
    String[] tmp195_186 = tmp186_177;
    String[] tmp195_186 = tmp186_177;
    tmp195_186[38] = str2;
    tmp195_186[39] = null;
    String[] tmp204_195 = tmp195_186;
    String[] tmp204_195 = tmp195_186;
    tmp204_195[40] = null;
    tmp204_195[41] = null;
    String[] tmp213_204 = tmp204_195;
    String[] tmp213_204 = tmp204_195;
    tmp213_204[42] = null;
    tmp213_204[43] = null;
    String[] tmp222_213 = tmp213_204;
    String[] tmp222_213 = tmp213_204;
    tmp222_213[44] = null;
    tmp222_213[45] = null;
    String[] tmp231_222 = tmp222_213;
    String[] tmp231_222 = tmp222_213;
    tmp231_222[46] = null;
    tmp231_222[47] = null;
    String[] tmp240_231 = tmp231_222;
    String[] tmp240_231 = tmp231_222;
    tmp240_231[48] = null;
    tmp240_231[49] = null;
    String[] tmp249_240 = tmp240_231;
    String[] tmp249_240 = tmp240_231;
    tmp249_240[50] = null;
    tmp249_240[51] = null;
    String[] tmp258_249 = tmp249_240;
    String[] tmp258_249 = tmp249_240;
    tmp258_249[52] = null;
    tmp258_249[53] = null;
    String[] tmp267_258 = tmp258_249;
    String[] tmp267_258 = tmp258_249;
    tmp267_258[54] = null;
    tmp267_258[55] = null;
    String[] tmp276_267 = tmp267_258;
    String[] tmp276_267 = tmp267_258;
    tmp276_267[56] = null;
    tmp276_267[57] = null;
    String[] tmp285_276 = tmp276_267;
    String[] tmp285_276 = tmp276_267;
    tmp285_276[58] = null;
    tmp285_276[59] = null;
    String[] tmp294_285 = tmp285_276;
    String[] tmp294_285 = tmp285_276;
    tmp294_285[60] = str3;
    tmp294_285[61] = null;
    tmp294_285[62] = str4;
    String[] tmp307_294 = tmp294_285;
    tmp307_294[63] = null;
  }
  
  public FastXmlSerializer()
  {
    int i = 8192;
    char[] arrayOfChar = new char[i];
    this.OooO0o = arrayOfChar;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);
    this.OooO00o = localByteBuffer;
  }
  
  public final void OooO00o(char paramChar)
  {
    int i = this.OooO0o0;
    int j = 8191;
    if (i >= j)
    {
      flush();
      i = this.OooO0o0;
    }
    char[] arrayOfChar = this.OooO0o;
    paramChar = (char)paramChar;
    arrayOfChar[i] = paramChar;
    i += 1;
    this.OooO0o0 = i;
  }
  
  public final void OooO0O0(String paramString)
  {
    int i = paramString.length();
    OooO0OO(paramString, 0, i);
  }
  
  public final void OooO0OO(String paramString, int paramInt1, int paramInt2)
  {
    int i = 8192;
    if (paramInt2 > i)
    {
      paramInt2 += paramInt1;
      while (paramInt1 < paramInt2)
      {
        j = paramInt1 + 8192;
        if (j < paramInt2) {
          k = i;
        } else {
          k = paramInt2 - paramInt1;
        }
        OooO0OO(paramString, paramInt1, k);
        paramInt1 = j;
      }
      return;
    }
    int j = this.OooO0o0;
    int k = j + paramInt2;
    if (k > i)
    {
      flush();
      j = this.OooO0o0;
    }
    i = paramInt1 + paramInt2;
    char[] arrayOfChar = this.OooO0o;
    paramString.getChars(paramInt1, i, arrayOfChar, j);
    j += paramInt2;
    this.OooO0o0 = j;
  }
  
  public final void OooO0Oo(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = 8192;
    if (paramInt2 > i)
    {
      paramInt2 += paramInt1;
      while (paramInt1 < paramInt2)
      {
        j = paramInt1 + 8192;
        if (j < paramInt2) {
          k = i;
        } else {
          k = paramInt2 - paramInt1;
        }
        OooO0Oo(paramArrayOfChar, paramInt1, k);
        paramInt1 = j;
      }
      return;
    }
    int j = this.OooO0o0;
    int k = j + paramInt2;
    if (k > i)
    {
      flush();
      j = this.OooO0o0;
    }
    char[] arrayOfChar = this.OooO0o;
    System.arraycopy(paramArrayOfChar, paramInt1, arrayOfChar, j, paramInt2);
    j += paramInt2;
    this.OooO0o0 = j;
  }
  
  public final void OooO0o(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    String[] arrayOfString = OooO0oo;
    int i = (char)arrayOfString.length;
    int j = paramInt1;
    int k = paramInt1;
    for (;;)
    {
      int m = paramInt1 + paramInt2;
      if (j >= m) {
        break;
      }
      m = paramArrayOfChar[j];
      if (m < i)
      {
        String str = arrayOfString[m];
        if (str != null)
        {
          if (k < j)
          {
            int n = j - k;
            OooO0Oo(paramArrayOfChar, k, n);
          }
          k = j + 1;
          OooO0O0(str);
        }
      }
      j += 1;
    }
    if (k < j)
    {
      j -= k;
      OooO0Oo(paramArrayOfChar, k, j);
    }
  }
  
  public final void OooO0o0(String paramString)
  {
    int i = paramString.length();
    String[] arrayOfString = OooO0oo;
    int j = (char)arrayOfString.length;
    int k = 0;
    int m = 0;
    while (k < i)
    {
      int n = paramString.charAt(k);
      if (n < j)
      {
        String str = arrayOfString[n];
        if (str != null)
        {
          if (m < k)
          {
            int i1 = k - m;
            OooO0OO(paramString, m, i1);
          }
          m = k + 1;
          OooO0O0(str);
        }
      }
      k += 1;
    }
    if (m < k)
    {
      k -= m;
      OooO0OO(paramString, m, k);
    }
  }
  
  public final void OooO0oO()
  {
    ByteBuffer localByteBuffer = this.OooO00o;
    int i = localByteBuffer.position();
    if (i > 0)
    {
      this.OooO00o.flip();
      OutputStream localOutputStream = this.OooO0Oo;
      byte[] arrayOfByte = this.OooO00o.array();
      localOutputStream.write(arrayOfByte, 0, i);
      localByteBuffer = this.OooO00o;
      localByteBuffer.clear();
    }
  }
  
  public XmlSerializer attribute(String paramString1, String paramString2, String paramString3)
  {
    char c1 = ' ';
    OooO00o(c1);
    if (paramString1 != null)
    {
      OooO0O0(paramString1);
      char c2 = ':';
      OooO00o(c2);
    }
    OooO0O0(paramString2);
    OooO0O0("=\"");
    OooO0o0(paramString3);
    OooO00o('"');
    return this;
  }
  
  public void cdsect(String paramString)
  {
    paramString = new java/lang/UnsupportedOperationException;
    paramString.<init>();
    throw paramString;
  }
  
  public void comment(String paramString)
  {
    paramString = new java/lang/UnsupportedOperationException;
    paramString.<init>();
    throw paramString;
  }
  
  public void docdecl(String paramString)
  {
    paramString = new java/lang/UnsupportedOperationException;
    paramString.<init>();
    throw paramString;
  }
  
  public void endDocument()
  {
    flush();
  }
  
  public XmlSerializer endTag(String paramString1, String paramString2)
  {
    boolean bool = this.OooO0OO;
    if (bool) {}
    for (paramString1 = m54207b69.F54207b69_11("QN6E627247");; paramString1 = ">\n")
    {
      OooO0O0(paramString1);
      break;
      String str = "</";
      OooO0O0(str);
      if (paramString1 != null)
      {
        OooO0O0(paramString1);
        char c = ':';
        OooO00o(c);
      }
      OooO0O0(paramString2);
    }
    this.OooO0OO = false;
    return this;
  }
  
  public void entityRef(String paramString)
  {
    paramString = new java/lang/UnsupportedOperationException;
    paramString.<init>();
    throw paramString;
  }
  
  public void flush()
  {
    int i = this.OooO0o0;
    if (i > 0)
    {
      Object localObject1 = this.OooO0Oo;
      Object localObject2;
      Object localObject3;
      if (localObject1 != null)
      {
        localObject2 = CharBuffer.wrap(this.OooO0o, 0, i);
        localObject1 = this.OooO0O0;
        localObject3 = this.OooO00o;
        boolean bool1 = true;
        for (;;)
        {
          localObject1 = ((CharsetEncoder)localObject1).encode((CharBuffer)localObject2, (ByteBuffer)localObject3, bool1);
          boolean bool2 = ((CoderResult)localObject1).isError();
          if (bool2) {
            break label104;
          }
          boolean bool3 = ((CoderResult)localObject1).isOverflow();
          OooO0oO();
          if (!bool3) {
            break;
          }
          localObject1 = this.OooO0O0;
          localObject3 = this.OooO00o;
        }
        localObject2 = this.OooO0Oo;
        ((OutputStream)localObject2).flush();
        break label148;
        label104:
        localObject2 = new java/io/IOException;
        localObject1 = ((CoderResult)localObject1).toString();
        ((IOException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
      }
      else
      {
        localObject1 = this.OooO0oO;
        localObject3 = this.OooO0o;
        ((Writer)localObject1).write((char[])localObject3, 0, i);
        localObject2 = this.OooO0oO;
        ((Writer)localObject2).flush();
      }
      label148:
      this.OooO0o0 = 0;
    }
  }
  
  public int getDepth()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public boolean getFeature(String paramString)
  {
    paramString = new java/lang/UnsupportedOperationException;
    paramString.<init>();
    throw paramString;
  }
  
  public String getName()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public String getNamespace()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public String getPrefix(String paramString, boolean paramBoolean)
  {
    paramString = new java/lang/UnsupportedOperationException;
    paramString.<init>();
    throw paramString;
  }
  
  public Object getProperty(String paramString)
  {
    paramString = new java/lang/UnsupportedOperationException;
    paramString.<init>();
    throw paramString;
  }
  
  public void ignorableWhitespace(String paramString)
  {
    paramString = new java/lang/UnsupportedOperationException;
    paramString.<init>();
    throw paramString;
  }
  
  public void processingInstruction(String paramString)
  {
    paramString = new java/lang/UnsupportedOperationException;
    paramString.<init>();
    throw paramString;
  }
  
  public void setFeature(String paramString, boolean paramBoolean)
  {
    String str = m54207b69.F54207b69_11("B;5350514E05191A4A5E60555963642363596D26601E29756B702D7779766C6C687E693776737B7D3F7A7E8989817C44837E807D8183");
    boolean bool = paramString.equals(str);
    if (bool) {
      return;
    }
    paramString = new java/lang/UnsupportedOperationException;
    paramString.<init>();
    throw paramString;
  }
  
  public void setOutput(OutputStream paramOutputStream, String paramString)
  {
    if (paramOutputStream != null) {
      try
      {
        localObject = Charset.forName(paramString);
        localObject = ((Charset)localObject).newEncoder();
        this.OooO0O0 = ((CharsetEncoder)localObject);
        this.OooO0Oo = paramOutputStream;
        return;
      }
      catch (UnsupportedCharsetException paramOutputStream)
      {
        localObject = new java/io/UnsupportedEncodingException;
        ((UnsupportedEncodingException)localObject).<init>(paramString);
        throw ((UnsupportedEncodingException)((Throwable)localObject).initCause(paramOutputStream));
      }
      catch (IllegalCharsetNameException paramOutputStream)
      {
        Object localObject = new java/io/UnsupportedEncodingException;
        ((UnsupportedEncodingException)localObject).<init>(paramString);
        throw ((UnsupportedEncodingException)((Throwable)localObject).initCause(paramOutputStream));
      }
    }
    paramOutputStream = new java/lang/IllegalArgumentException;
    paramOutputStream.<init>();
    throw paramOutputStream;
  }
  
  public void setOutput(Writer paramWriter)
  {
    this.OooO0oO = paramWriter;
  }
  
  public void setPrefix(String paramString1, String paramString2)
  {
    paramString1 = new java/lang/UnsupportedOperationException;
    paramString1.<init>();
    throw paramString1;
  }
  
  public void setProperty(String paramString, Object paramObject)
  {
    paramString = new java/lang/UnsupportedOperationException;
    paramString.<init>();
    throw paramString;
  }
  
  public void startDocument(String paramString, Boolean paramBoolean)
  {
    paramString = new java/lang/StringBuilder;
    paramString.<init>();
    String str = m54207b69.F54207b69_11("470B09515D5F1C47594D4D686365171E152918222A666E6A6F6B77736B262D6062713B31333B69697D817C80868486803940");
    paramString.append(str);
    boolean bool = paramBoolean.booleanValue();
    if (bool) {
      paramBoolean = "yes";
    } else {
      paramBoolean = "no";
    }
    paramString.append(paramBoolean);
    paramBoolean = m54207b69.F54207b69_11("[1161210123F");
    paramString.append(paramBoolean);
    paramString = paramString.toString();
    OooO0O0(paramString);
  }
  
  public XmlSerializer startTag(String paramString1, String paramString2)
  {
    boolean bool = this.OooO0OO;
    if (bool)
    {
      String str = ">\n";
      OooO0O0(str);
    }
    char c1 = '<';
    OooO00o(c1);
    if (paramString1 != null)
    {
      OooO0O0(paramString1);
      char c2 = ':';
      OooO00o(c2);
    }
    OooO0O0(paramString2);
    this.OooO0OO = true;
    return this;
  }
  
  public XmlSerializer text(String paramString)
  {
    boolean bool = this.OooO0OO;
    if (bool)
    {
      OooO0O0(">");
      bool = false;
      this.OooO0OO = false;
    }
    OooO0o0(paramString);
    return this;
  }
  
  public XmlSerializer text(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    boolean bool = this.OooO0OO;
    if (bool)
    {
      OooO0O0(">");
      bool = false;
      this.OooO0OO = false;
    }
    OooO0o(paramArrayOfChar, paramInt1, paramInt2);
    return this;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.util.FastXmlSerializer
 * JD-Core Version:    0.7.0.1
 */
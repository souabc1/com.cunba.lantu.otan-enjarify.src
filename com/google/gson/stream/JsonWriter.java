package com.google.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import m54207b69;

public class JsonWriter
  implements Closeable, Flushable
{
  private static final String[] HTML_SAFE_REPLACEMENT_CHARS;
  private static final String[] REPLACEMENT_CHARS = new String[''];
  private String deferredName;
  private boolean htmlSafe;
  private String indent;
  private boolean lenient;
  private final Writer out;
  private String separator;
  private boolean serializeNulls;
  private int[] stack;
  private int stackSize;
  
  static
  {
    int i = 0;
    String[] arrayOfString1 = null;
    for (;;)
    {
      int j = 31;
      if (i > j) {
        break;
      }
      String[] arrayOfString2 = REPLACEMENT_CHARS;
      localObject = Integer.valueOf(i);
      localObject = new Object[] { localObject };
      String str = m54207b69.F54207b69_11("HB1E3869757A3F");
      localObject = String.format(str, (Object[])localObject);
      arrayOfString2[i] = localObject;
      i += 1;
    }
    arrayOfString1 = REPLACEMENT_CHARS;
    arrayOfString1[34] = "\\\"";
    arrayOfString1[92] = "\\\\";
    arrayOfString1[9] = "\\t";
    arrayOfString1[8] = "\\b";
    arrayOfString1[10] = "\\n";
    arrayOfString1[13] = "\\r";
    arrayOfString1[12] = "\\f";
    arrayOfString1 = (String[])arrayOfString1.clone();
    HTML_SAFE_REPLACEMENT_CHARS = arrayOfString1;
    Object localObject = m54207b69.F54207b69_11("Wd381256575B0C");
    arrayOfString1[60] = localObject;
    localObject = m54207b69.F54207b69_11("`B1E387475752C");
    arrayOfString1[62] = localObject;
    localObject = m54207b69.F54207b69_11("|l301A5E5F625F");
    arrayOfString1[38] = localObject;
    localObject = m54207b69.F54207b69_11("Q+775F1D1E1C54");
    arrayOfString1[61] = localObject;
    localObject = m54207b69.F54207b69_11("^U092167686B67");
    arrayOfString1[39] = localObject;
  }
  
  public JsonWriter(Writer paramWriter)
  {
    Object localObject = new int[32];
    this.stack = ((int[])localObject);
    this.stackSize = 0;
    push(6);
    localObject = ":";
    this.separator = ((String)localObject);
    boolean bool = true;
    this.serializeNulls = bool;
    if (paramWriter != null)
    {
      this.out = paramWriter;
      return;
    }
    paramWriter = new java/lang/NullPointerException;
    localObject = m54207b69.F54207b69_11("&.415C5C1117181447634B4C");
    paramWriter.<init>((String)localObject);
    throw paramWriter;
  }
  
  private void beforeName()
  {
    int i = peek();
    int j = 5;
    if (i == j)
    {
      localObject = this.out;
      j = 44;
      ((Writer)localObject).write(j);
    }
    else
    {
      j = 3;
      if (i != j) {
        break label45;
      }
    }
    newline();
    replaceTop(4);
    return;
    label45:
    Object localObject = new java/lang/IllegalStateException;
    String str = m54207b69.F54207b69_11("e=7359504C5858602455585C6A5D655E22");
    ((IllegalStateException)localObject).<init>(str);
    throw ((Throwable)localObject);
  }
  
  private void beforeValue()
  {
    int i = peek();
    int k = 1;
    int m = 2;
    if (i != k)
    {
      if (i != m)
      {
        k = 4;
        if (i != k)
        {
          k = 6;
          m = 7;
          if (i != k) {
            if (i == m)
            {
              boolean bool = this.lenient;
              if (!bool)
              {
                localObject = new java/lang/IllegalStateException;
                str = m54207b69.F54207b69_11("Xm273F242651051E2521560F1727155B111312266016181E64311B375B1D253927216E3D2F253D2E6A");
                ((IllegalStateException)localObject).<init>(str);
                throw ((Throwable)localObject);
              }
            }
            else
            {
              localObject = new java/lang/IllegalStateException;
              str = m54207b69.F54207b69_11("e=7359504C5858602455585C6A5D655E22");
              ((IllegalStateException)localObject).<init>(str);
              throw ((Throwable)localObject);
            }
          }
          replaceTop(m);
          return;
        }
        localObject = this.out;
        String str = this.separator;
        ((Writer)localObject).append(str);
        int j = 5;
        replaceTop(j);
        return;
      }
      Object localObject = this.out;
      k = 44;
      ((Writer)localObject).append(k);
    }
    else
    {
      replaceTop(m);
    }
    newline();
  }
  
  private JsonWriter close(int paramInt1, int paramInt2, String paramString)
  {
    int i = peek();
    if ((i != paramInt2) && (i != paramInt1))
    {
      localObject1 = new java/lang/IllegalStateException;
      localObject2 = m54207b69.F54207b69_11("e=7359504C5858602455585C6A5D655E22");
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = this.deferredName;
    if (localObject1 == null)
    {
      paramInt1 = this.stackSize + -1;
      this.stackSize = paramInt1;
      if (i == paramInt2) {
        newline();
      }
      this.out.write(paramString);
      return this;
    }
    localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    paramString = m54207b69.F54207b69_11("EA05213129312D352D69382A3730886F");
    ((StringBuilder)localObject2).append(paramString);
    paramString = this.deferredName;
    ((StringBuilder)localObject2).append(paramString);
    localObject2 = ((StringBuilder)localObject2).toString();
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  private void newline()
  {
    Object localObject = this.indent;
    if (localObject == null) {
      return;
    }
    localObject = this.out;
    String str1 = "\n";
    ((Writer)localObject).write(str1);
    int i = this.stackSize;
    int j = 1;
    while (j < i)
    {
      Writer localWriter = this.out;
      String str2 = this.indent;
      localWriter.write(str2);
      j += 1;
    }
  }
  
  private JsonWriter open(int paramInt, String paramString)
  {
    beforeValue();
    push(paramInt);
    this.out.write(paramString);
    return this;
  }
  
  private int peek()
  {
    int i = this.stackSize;
    if (i != 0)
    {
      localObject = this.stack;
      i += -1;
      return localObject[i];
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    Object localObject = m54207b69.F54207b69_11("R=774F54566E545A506058275F5A2A6C60625F6A6C27");
    localIllegalStateException.<init>((String)localObject);
    throw localIllegalStateException;
  }
  
  private void push(int paramInt)
  {
    int i = this.stackSize;
    int[] arrayOfInt1 = this.stack;
    int j = arrayOfInt1.length;
    if (i == j)
    {
      j = i * 2;
      int[] arrayOfInt2 = new int[j];
      System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, i);
      this.stack = arrayOfInt2;
    }
    int[] arrayOfInt3 = this.stack;
    int k = this.stackSize;
    j = k + 1;
    this.stackSize = j;
    arrayOfInt3[k] = paramInt;
  }
  
  private void replaceTop(int paramInt)
  {
    int[] arrayOfInt = this.stack;
    int i = this.stackSize + -1;
    arrayOfInt[i] = paramInt;
  }
  
  private void string(String paramString)
  {
    boolean bool = this.htmlSafe;
    Object localObject;
    if (bool) {
      localObject = HTML_SAFE_REPLACEMENT_CHARS;
    } else {
      localObject = REPLACEMENT_CHARS;
    }
    Writer localWriter1 = this.out;
    String str1 = "\"";
    localWriter1.write(str1);
    int i = paramString.length();
    int j = 0;
    int k = 0;
    Writer localWriter2 = null;
    while (j < i)
    {
      int m = paramString.charAt(j);
      int n = 128;
      String str2;
      if (m < n)
      {
        str2 = localObject[m];
        if (str2 == null) {
          break label183;
        }
      }
      else
      {
        n = 8232;
        if (m == n)
        {
          str2 = m54207b69.F54207b69_11("Gq2D054544474E");
        }
        else
        {
          n = 8233;
          if (m != n) {
            break label183;
          }
          str2 = m54207b69.F54207b69_11("/@1C367473767E");
        }
      }
      if (k < j)
      {
        Writer localWriter3 = this.out;
        int i1 = j - k;
        localWriter3.write(paramString, k, i1);
      }
      localWriter2 = this.out;
      localWriter2.write(str2);
      k = j + 1;
      label183:
      j += 1;
    }
    if (k < i)
    {
      localObject = this.out;
      i -= k;
      ((Writer)localObject).write(paramString, k, i);
    }
    this.out.write(str1);
  }
  
  private void writeDeferredName()
  {
    String str = this.deferredName;
    if (str != null)
    {
      beforeName();
      str = this.deferredName;
      string(str);
      str = null;
      this.deferredName = null;
    }
  }
  
  public JsonWriter beginArray()
  {
    writeDeferredName();
    return open(1, "[");
  }
  
  public JsonWriter beginObject()
  {
    writeDeferredName();
    return open(3, "{");
  }
  
  public void close()
  {
    Object localObject = this.out;
    ((Writer)localObject).close();
    int i = this.stackSize;
    int j = 1;
    if (i <= j) {
      if (i == j)
      {
        int[] arrayOfInt = this.stack;
        i -= j;
        i = arrayOfInt[i];
        j = 7;
        if (i != j) {}
      }
      else
      {
        this.stackSize = 0;
        return;
      }
    }
    localObject = new java/io/IOException;
    String str = m54207b69.F54207b69_11("N|3513211615111620102266231F2C172029231A");
    ((IOException)localObject).<init>(str);
    throw ((Throwable)localObject);
  }
  
  public JsonWriter endArray()
  {
    return close(1, 2, "]");
  }
  
  public JsonWriter endObject()
  {
    return close(3, 5, "}");
  }
  
  public void flush()
  {
    int i = this.stackSize;
    if (i != 0)
    {
      this.out.flush();
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    String str = m54207b69.F54207b69_11("R=774F54566E545A506058275F5A2A6C60625F6A6C27");
    localIllegalStateException.<init>(str);
    throw localIllegalStateException;
  }
  
  public final boolean getSerializeNulls()
  {
    return this.serializeNulls;
  }
  
  public final boolean isHtmlSafe()
  {
    return this.htmlSafe;
  }
  
  public boolean isLenient()
  {
    return this.lenient;
  }
  
  public JsonWriter jsonValue(String paramString)
  {
    if (paramString == null) {
      return nullValue();
    }
    writeDeferredName();
    beforeValue();
    this.out.append(paramString);
    return this;
  }
  
  public JsonWriter name(String paramString)
  {
    if (paramString != null)
    {
      str = this.deferredName;
      if (str == null)
      {
        int i = this.stackSize;
        if (i != 0)
        {
          this.deferredName = paramString;
          return this;
        }
        paramString = new java/lang/IllegalStateException;
        str = m54207b69.F54207b69_11("R=774F54566E545A506058275F5A2A6C60625F6A6C27");
        paramString.<init>(str);
        throw paramString;
      }
      paramString = new java/lang/IllegalStateException;
      paramString.<init>();
      throw paramString;
    }
    paramString = new java/lang/NullPointerException;
    String str = m54207b69.F54207b69_11("f`0E020F0844626347161E1617");
    paramString.<init>(str);
    throw paramString;
  }
  
  public JsonWriter nullValue()
  {
    Object localObject = this.deferredName;
    if (localObject != null)
    {
      boolean bool = this.serializeNulls;
      if (bool)
      {
        writeDeferredName();
      }
      else
      {
        this.deferredName = null;
        return this;
      }
    }
    beforeValue();
    localObject = this.out;
    String str = m54207b69.F54207b69_11("C?514B5556");
    ((Writer)localObject).write(str);
    return this;
  }
  
  public final void setHtmlSafe(boolean paramBoolean)
  {
    this.htmlSafe = paramBoolean;
  }
  
  public final void setIndent(String paramString)
  {
    int i = paramString.length();
    if (i == 0)
    {
      this.indent = null;
      paramString = ":";
    }
    else
    {
      this.indent = paramString;
      paramString = ": ";
    }
    this.separator = paramString;
  }
  
  public final void setLenient(boolean paramBoolean)
  {
    this.lenient = paramBoolean;
  }
  
  public final void setSerializeNulls(boolean paramBoolean)
  {
    this.serializeNulls = paramBoolean;
  }
  
  public JsonWriter value(double paramDouble)
  {
    writeDeferredName();
    boolean bool = this.lenient;
    if (!bool)
    {
      bool = Double.isNaN(paramDouble);
      if (!bool)
      {
        bool = Double.isInfinite(paramDouble);
        if (!bool) {}
      }
      else
      {
        localObject = new java/lang/IllegalArgumentException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str1 = m54207b69.F54207b69_11("uJ044029323C282F714434304A3B4678364F4A507D3C4480433B3D3D594B8388475F5F8C604F5E90");
        localStringBuilder.append(str1);
        localStringBuilder.append(paramDouble);
        str2 = localStringBuilder.toString();
        ((IllegalArgumentException)localObject).<init>(str2);
        throw ((Throwable)localObject);
      }
    }
    beforeValue();
    Object localObject = this.out;
    String str2 = Double.toString(paramDouble);
    ((Writer)localObject).append(str2);
    return this;
  }
  
  public JsonWriter value(long paramLong)
  {
    writeDeferredName();
    beforeValue();
    Writer localWriter = this.out;
    String str = Long.toString(paramLong);
    localWriter.write(str);
    return this;
  }
  
  public JsonWriter value(Boolean paramBoolean)
  {
    if (paramBoolean == null) {
      return nullValue();
    }
    writeDeferredName();
    beforeValue();
    Writer localWriter = this.out;
    boolean bool = paramBoolean.booleanValue();
    if (bool) {
      paramBoolean = m54207b69.F54207b69_11("/541484253");
    } else {
      paramBoolean = m54207b69.F54207b69_11("5%43454B5944");
    }
    localWriter.write(paramBoolean);
    return this;
  }
  
  public JsonWriter value(Number paramNumber)
  {
    if (paramNumber == null) {
      return nullValue();
    }
    writeDeferredName();
    Object localObject1 = paramNumber.toString();
    boolean bool = this.lenient;
    if (!bool)
    {
      Object localObject2 = m54207b69.F54207b69_11("rT791E3C35413F432735");
      bool = ((String)localObject1).equals(localObject2);
      if (!bool)
      {
        localObject2 = m54207b69.F54207b69_11("%V1F3932423C442836");
        bool = ((String)localObject1).equals(localObject2);
        if (!bool)
        {
          localObject2 = "NaN";
          bool = ((String)localObject1).equals(localObject2);
          if (!bool) {
            break label134;
          }
        }
      }
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = m54207b69.F54207b69_11("uJ044029323C282F714434304A3B4678364F4A507D3C4480433B3D3D594B8388475F5F8C604F5E90");
      ((StringBuilder)localObject2).append(str);
      ((StringBuilder)localObject2).append(paramNumber);
      paramNumber = ((StringBuilder)localObject2).toString();
      ((IllegalArgumentException)localObject1).<init>(paramNumber);
      throw ((Throwable)localObject1);
    }
    label134:
    beforeValue();
    this.out.append((CharSequence)localObject1);
    return this;
  }
  
  public JsonWriter value(String paramString)
  {
    if (paramString == null) {
      return nullValue();
    }
    writeDeferredName();
    beforeValue();
    string(paramString);
    return this;
  }
  
  public JsonWriter value(boolean paramBoolean)
  {
    writeDeferredName();
    beforeValue();
    Writer localWriter = this.out;
    String str;
    if (paramBoolean) {
      str = m54207b69.F54207b69_11("/541484253");
    } else {
      str = m54207b69.F54207b69_11("5%43454B5944");
    }
    localWriter.write(str);
    return this;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.gson.stream.JsonWriter
 * JD-Core Version:    0.7.0.1
 */
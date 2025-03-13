package com.google.zxing.common;

import com.google.zxing.FormatException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class ECIStringBuilder
{
  private StringBuilder currentBytes;
  private Charset currentCharset;
  private StringBuilder result;
  
  public ECIStringBuilder()
  {
    Object localObject = StandardCharsets.ISO_8859_1;
    this.currentCharset = ((Charset)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    this.currentBytes = ((StringBuilder)localObject);
  }
  
  public ECIStringBuilder(int paramInt)
  {
    Object localObject = StandardCharsets.ISO_8859_1;
    this.currentCharset = ((Charset)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>(paramInt);
    this.currentBytes = ((StringBuilder)localObject);
  }
  
  private void encodeCurrentBytesIfAny()
  {
    Object localObject1 = this.currentCharset;
    Object localObject2 = StandardCharsets.ISO_8859_1;
    boolean bool = ((Charset)localObject1).equals(localObject2);
    int i;
    if (bool)
    {
      localObject1 = this.currentBytes;
      i = ((StringBuilder)localObject1).length();
      if (i > 0)
      {
        localObject1 = this.result;
        if (localObject1 == null)
        {
          localObject1 = this.currentBytes;
          this.result = ((StringBuilder)localObject1);
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
        }
        else
        {
          localObject2 = this.currentBytes;
          ((StringBuilder)localObject1).append((CharSequence)localObject2);
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
        }
        this.currentBytes = ((StringBuilder)localObject1);
      }
    }
    else
    {
      localObject1 = this.currentBytes;
      i = ((StringBuilder)localObject1).length();
      if (i > 0)
      {
        localObject1 = this.currentBytes.toString();
        localObject2 = StandardCharsets.ISO_8859_1;
        localObject1 = ((String)localObject1).getBytes((Charset)localObject2);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        this.currentBytes = ((StringBuilder)localObject2);
        localObject2 = this.result;
        String str;
        Charset localCharset;
        if (localObject2 == null)
        {
          localObject2 = new java/lang/StringBuilder;
          str = new java/lang/String;
          localCharset = this.currentCharset;
          str.<init>((byte[])localObject1, localCharset);
          ((StringBuilder)localObject2).<init>(str);
          this.result = ((StringBuilder)localObject2);
        }
        else
        {
          str = new java/lang/String;
          localCharset = this.currentCharset;
          str.<init>((byte[])localObject1, localCharset);
          ((StringBuilder)localObject2).append(str);
        }
      }
    }
  }
  
  public void append(byte paramByte)
  {
    StringBuilder localStringBuilder = this.currentBytes;
    paramByte = (char)(paramByte & 0xFF);
    localStringBuilder.append(paramByte);
  }
  
  public void append(char paramChar)
  {
    StringBuilder localStringBuilder = this.currentBytes;
    paramChar = (char)(paramChar & 0xFF);
    localStringBuilder.append(paramChar);
  }
  
  public void append(int paramInt)
  {
    String str = String.valueOf(paramInt);
    append(str);
  }
  
  public void append(String paramString)
  {
    this.currentBytes.append(paramString);
  }
  
  public void appendCharacters(StringBuilder paramStringBuilder)
  {
    encodeCurrentBytesIfAny();
    this.result.append(paramStringBuilder);
  }
  
  public void appendECI(int paramInt)
  {
    encodeCurrentBytesIfAny();
    Object localObject = CharacterSetECI.getCharacterSetECIByValue(paramInt);
    if (localObject != null)
    {
      localObject = ((CharacterSetECI)localObject).getCharset();
      this.currentCharset = ((Charset)localObject);
      return;
    }
    throw FormatException.getFormatInstance();
  }
  
  public boolean isEmpty()
  {
    StringBuilder localStringBuilder = this.currentBytes;
    int i = localStringBuilder.length();
    if (i == 0)
    {
      localStringBuilder = this.result;
      if (localStringBuilder != null)
      {
        i = localStringBuilder.length();
        if (i != 0) {}
      }
      else
      {
        return 1;
      }
    }
    i = 0;
    localStringBuilder = null;
    return i;
  }
  
  public int length()
  {
    return toString().length();
  }
  
  public String toString()
  {
    encodeCurrentBytesIfAny();
    Object localObject = this.result;
    if (localObject == null) {
      localObject = "";
    } else {
      localObject = ((StringBuilder)localObject).toString();
    }
    return localObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.common.ECIStringBuilder
 * JD-Core Version:    0.7.0.1
 */
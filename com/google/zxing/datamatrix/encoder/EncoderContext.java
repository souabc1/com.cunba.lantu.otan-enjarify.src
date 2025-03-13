package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import m54207b69;

final class EncoderContext
{
  private final StringBuilder codewords;
  private Dimension maxSize;
  private Dimension minSize;
  private final String msg;
  private int newEncoding;
  int pos;
  private SymbolShapeHint shape;
  private int skipAtEnd;
  private SymbolInfo symbolInfo;
  
  public EncoderContext(String paramString)
  {
    Object localObject = StandardCharsets.ISO_8859_1;
    localObject = paramString.getBytes((Charset)localObject);
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int i = localObject.length;
    localStringBuilder.<init>(i);
    i = localObject.length;
    int j = 0;
    while (j < i)
    {
      char c1 = (char)(localObject[j] & 0xFF);
      char c2 = '?';
      if (c1 == c2)
      {
        char c3 = paramString.charAt(j);
        if (c3 != c2)
        {
          paramString = new java/lang/IllegalArgumentException;
          localObject = m54207b69.F54207b69_11("y8755E4D4E5D64631F63606057655E645A286C626C5E6E716375636533736A6A6A717D7F3B95909D3C2829372C4136468C868C898F858B954D");
          paramString.<init>((String)localObject);
          throw paramString;
        }
      }
      localStringBuilder.append(c1);
      j += 1;
    }
    localObject = localStringBuilder.toString();
    this.msg = ((String)localObject);
    localObject = SymbolShapeHint.FORCE_NONE;
    this.shape = ((SymbolShapeHint)localObject);
    localObject = new java/lang/StringBuilder;
    int k = paramString.length();
    ((StringBuilder)localObject).<init>(k);
    this.codewords = ((StringBuilder)localObject);
    this.newEncoding = -1;
  }
  
  private int getTotalMessageCharCount()
  {
    int i = this.msg.length();
    int j = this.skipAtEnd;
    return i - j;
  }
  
  public int getCodewordCount()
  {
    return this.codewords.length();
  }
  
  public StringBuilder getCodewords()
  {
    return this.codewords;
  }
  
  public char getCurrent()
  {
    String str = this.msg;
    int i = this.pos;
    return str.charAt(i);
  }
  
  public char getCurrentChar()
  {
    String str = this.msg;
    int i = this.pos;
    return str.charAt(i);
  }
  
  public String getMessage()
  {
    return this.msg;
  }
  
  public int getNewEncoding()
  {
    return this.newEncoding;
  }
  
  public int getRemainingCharacters()
  {
    int i = getTotalMessageCharCount();
    int j = this.pos;
    return i - j;
  }
  
  public SymbolInfo getSymbolInfo()
  {
    return this.symbolInfo;
  }
  
  public boolean hasMoreCharacters()
  {
    int i = this.pos;
    int j = getTotalMessageCharCount();
    if (i < j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public void resetEncoderSignal()
  {
    this.newEncoding = -1;
  }
  
  public void resetSymbolInfo()
  {
    this.symbolInfo = null;
  }
  
  public void setSizeConstraints(Dimension paramDimension1, Dimension paramDimension2)
  {
    this.minSize = paramDimension1;
    this.maxSize = paramDimension2;
  }
  
  public void setSkipAtEnd(int paramInt)
  {
    this.skipAtEnd = paramInt;
  }
  
  public void setSymbolShape(SymbolShapeHint paramSymbolShapeHint)
  {
    this.shape = paramSymbolShapeHint;
  }
  
  public void signalEncoderChange(int paramInt)
  {
    this.newEncoding = paramInt;
  }
  
  public void updateSymbolInfo()
  {
    int i = getCodewordCount();
    updateSymbolInfo(i);
  }
  
  public void updateSymbolInfo(int paramInt)
  {
    Object localObject = this.symbolInfo;
    if (localObject != null)
    {
      int i = ((SymbolInfo)localObject).getDataCapacity();
      if (paramInt <= i) {}
    }
    else
    {
      localObject = this.shape;
      Dimension localDimension1 = this.minSize;
      Dimension localDimension2 = this.maxSize;
      boolean bool = true;
      SymbolInfo localSymbolInfo = SymbolInfo.lookup(paramInt, (SymbolShapeHint)localObject, localDimension1, localDimension2, bool);
      this.symbolInfo = localSymbolInfo;
    }
  }
  
  public void writeCodeword(char paramChar)
  {
    this.codewords.append(paramChar);
  }
  
  public void writeCodewords(String paramString)
  {
    this.codewords.append(paramString);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.datamatrix.encoder.EncoderContext
 * JD-Core Version:    0.7.0.1
 */
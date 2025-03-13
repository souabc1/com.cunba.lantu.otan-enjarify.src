package com.google.zxing.common;

import java.util.List;

public final class DecoderResult
{
  private final List byteSegments;
  private final String ecLevel;
  private Integer erasures;
  private Integer errorsCorrected;
  private int numBits;
  private Object other;
  private final byte[] rawBytes;
  private final int structuredAppendParity;
  private final int structuredAppendSequenceNumber;
  private final int symbologyModifier;
  private final String text;
  
  public DecoderResult(byte[] paramArrayOfByte, String paramString1, List paramList, String paramString2)
  {
    this(paramArrayOfByte, paramString1, paramList, paramString2, -1, -1, 0);
  }
  
  public DecoderResult(byte[] paramArrayOfByte, String paramString1, List paramList, String paramString2, int paramInt)
  {
    this(paramArrayOfByte, paramString1, paramList, paramString2, -1, -1, paramInt);
  }
  
  public DecoderResult(byte[] paramArrayOfByte, String paramString1, List paramList, String paramString2, int paramInt1, int paramInt2)
  {
    this(paramArrayOfByte, paramString1, paramList, paramString2, paramInt1, paramInt2, 0);
  }
  
  public DecoderResult(byte[] paramArrayOfByte, String paramString1, List paramList, String paramString2, int paramInt1, int paramInt2, int paramInt3)
  {
    this.rawBytes = paramArrayOfByte;
    int i;
    if (paramArrayOfByte == null)
    {
      i = 0;
      paramArrayOfByte = null;
    }
    else
    {
      i = paramArrayOfByte.length * 8;
    }
    this.numBits = i;
    this.text = paramString1;
    this.byteSegments = paramList;
    this.ecLevel = paramString2;
    this.structuredAppendParity = paramInt2;
    this.structuredAppendSequenceNumber = paramInt1;
    this.symbologyModifier = paramInt3;
  }
  
  public List getByteSegments()
  {
    return this.byteSegments;
  }
  
  public String getECLevel()
  {
    return this.ecLevel;
  }
  
  public Integer getErasures()
  {
    return this.erasures;
  }
  
  public Integer getErrorsCorrected()
  {
    return this.errorsCorrected;
  }
  
  public int getNumBits()
  {
    return this.numBits;
  }
  
  public Object getOther()
  {
    return this.other;
  }
  
  public byte[] getRawBytes()
  {
    return this.rawBytes;
  }
  
  public int getStructuredAppendParity()
  {
    return this.structuredAppendParity;
  }
  
  public int getStructuredAppendSequenceNumber()
  {
    return this.structuredAppendSequenceNumber;
  }
  
  public int getSymbologyModifier()
  {
    return this.symbologyModifier;
  }
  
  public String getText()
  {
    return this.text;
  }
  
  public boolean hasStructuredAppend()
  {
    int i = this.structuredAppendParity;
    if (i >= 0)
    {
      i = this.structuredAppendSequenceNumber;
      if (i >= 0) {
        return 1;
      }
    }
    i = 0;
    return i;
  }
  
  public void setErasures(Integer paramInteger)
  {
    this.erasures = paramInteger;
  }
  
  public void setErrorsCorrected(Integer paramInteger)
  {
    this.errorsCorrected = paramInteger;
  }
  
  public void setNumBits(int paramInt)
  {
    this.numBits = paramInt;
  }
  
  public void setOther(Object paramObject)
  {
    this.other = paramObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.common.DecoderResult
 * JD-Core Version:    0.7.0.1
 */
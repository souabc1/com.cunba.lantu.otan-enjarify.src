package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

public final class Result
{
  private final BarcodeFormat format;
  private final int numBits;
  private final byte[] rawBytes;
  private Map resultMetadata;
  private ResultPoint[] resultPoints;
  private final String text;
  private final long timestamp;
  
  public Result(String paramString, byte[] paramArrayOfByte, int paramInt, ResultPoint[] paramArrayOfResultPoint, BarcodeFormat paramBarcodeFormat, long paramLong)
  {
    this.text = paramString;
    this.rawBytes = paramArrayOfByte;
    this.numBits = paramInt;
    this.resultPoints = paramArrayOfResultPoint;
    this.format = paramBarcodeFormat;
    this.resultMetadata = null;
    this.timestamp = paramLong;
  }
  
  public Result(String paramString, byte[] paramArrayOfByte, ResultPoint[] paramArrayOfResultPoint, BarcodeFormat paramBarcodeFormat)
  {
    this(paramString, paramArrayOfByte, paramArrayOfResultPoint, paramBarcodeFormat, l);
  }
  
  public Result(String paramString, byte[] paramArrayOfByte, ResultPoint[] paramArrayOfResultPoint, BarcodeFormat paramBarcodeFormat, long paramLong)
  {
    this(paramString, paramArrayOfByte, i, paramArrayOfResultPoint, paramBarcodeFormat, paramLong);
  }
  
  public void addResultPoints(ResultPoint[] paramArrayOfResultPoint)
  {
    ResultPoint[] arrayOfResultPoint1 = this.resultPoints;
    if (arrayOfResultPoint1 == null)
    {
      this.resultPoints = paramArrayOfResultPoint;
    }
    else if (paramArrayOfResultPoint != null)
    {
      int i = paramArrayOfResultPoint.length;
      if (i > 0)
      {
        i = arrayOfResultPoint1.length;
        int j = paramArrayOfResultPoint.length;
        i += j;
        ResultPoint[] arrayOfResultPoint2 = new ResultPoint[i];
        j = arrayOfResultPoint1.length;
        System.arraycopy(arrayOfResultPoint1, 0, arrayOfResultPoint2, 0, j);
        int k = arrayOfResultPoint1.length;
        j = paramArrayOfResultPoint.length;
        System.arraycopy(paramArrayOfResultPoint, 0, arrayOfResultPoint2, k, j);
        this.resultPoints = arrayOfResultPoint2;
      }
    }
  }
  
  public BarcodeFormat getBarcodeFormat()
  {
    return this.format;
  }
  
  public int getNumBits()
  {
    return this.numBits;
  }
  
  public byte[] getRawBytes()
  {
    return this.rawBytes;
  }
  
  public Map getResultMetadata()
  {
    return this.resultMetadata;
  }
  
  public ResultPoint[] getResultPoints()
  {
    return this.resultPoints;
  }
  
  public String getText()
  {
    return this.text;
  }
  
  public long getTimestamp()
  {
    return this.timestamp;
  }
  
  public void putAllMetadata(Map paramMap)
  {
    if (paramMap != null)
    {
      Map localMap = this.resultMetadata;
      if (localMap == null) {
        this.resultMetadata = paramMap;
      } else {
        localMap.putAll(paramMap);
      }
    }
  }
  
  public void putMetadata(ResultMetadataType paramResultMetadataType, Object paramObject)
  {
    Object localObject = this.resultMetadata;
    if (localObject == null)
    {
      localObject = new java/util/EnumMap;
      ResultMetadataType localResultMetadataType = ResultMetadataType.class;
      ((EnumMap)localObject).<init>(localResultMetadataType);
      this.resultMetadata = ((Map)localObject);
    }
    this.resultMetadata.put(paramResultMetadataType, paramObject);
  }
  
  public String toString()
  {
    return this.text;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.Result
 * JD-Core Version:    0.7.0.1
 */
package com.google.zxing.pdf417;

public final class PDF417ResultMetadata
{
  private String addressee;
  private int checksum;
  private String fileId;
  private String fileName;
  private long fileSize;
  private boolean lastSegment;
  private int[] optionalData;
  private int segmentCount;
  private int segmentIndex;
  private String sender;
  private long timestamp;
  
  public PDF417ResultMetadata()
  {
    int i = -1;
    this.segmentCount = i;
    long l = -1;
    this.fileSize = l;
    this.timestamp = l;
    this.checksum = i;
  }
  
  public String getAddressee()
  {
    return this.addressee;
  }
  
  public int getChecksum()
  {
    return this.checksum;
  }
  
  public String getFileId()
  {
    return this.fileId;
  }
  
  public String getFileName()
  {
    return this.fileName;
  }
  
  public long getFileSize()
  {
    return this.fileSize;
  }
  
  public int[] getOptionalData()
  {
    return this.optionalData;
  }
  
  public int getSegmentCount()
  {
    return this.segmentCount;
  }
  
  public int getSegmentIndex()
  {
    return this.segmentIndex;
  }
  
  public String getSender()
  {
    return this.sender;
  }
  
  public long getTimestamp()
  {
    return this.timestamp;
  }
  
  public boolean isLastSegment()
  {
    return this.lastSegment;
  }
  
  public void setAddressee(String paramString)
  {
    this.addressee = paramString;
  }
  
  public void setChecksum(int paramInt)
  {
    this.checksum = paramInt;
  }
  
  public void setFileId(String paramString)
  {
    this.fileId = paramString;
  }
  
  public void setFileName(String paramString)
  {
    this.fileName = paramString;
  }
  
  public void setFileSize(long paramLong)
  {
    this.fileSize = paramLong;
  }
  
  public void setLastSegment(boolean paramBoolean)
  {
    this.lastSegment = paramBoolean;
  }
  
  public void setOptionalData(int[] paramArrayOfInt)
  {
    this.optionalData = paramArrayOfInt;
  }
  
  public void setSegmentCount(int paramInt)
  {
    this.segmentCount = paramInt;
  }
  
  public void setSegmentIndex(int paramInt)
  {
    this.segmentIndex = paramInt;
  }
  
  public void setSender(String paramString)
  {
    this.sender = paramString;
  }
  
  public void setTimestamp(long paramLong)
  {
    this.timestamp = paramLong;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.pdf417.PDF417ResultMetadata
 * JD-Core Version:    0.7.0.1
 */
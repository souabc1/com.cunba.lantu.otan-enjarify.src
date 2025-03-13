package com.xuexiang.xhttp2.model;

import m54207b69;

public class ExpiredInfo
{
  private String mBodyString;
  private int mCode;
  private int mExpiredType;
  private boolean mIsExpired;
  
  public ExpiredInfo(int paramInt)
  {
    this.mCode = paramInt;
  }
  
  public String getBodyString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1302, arrayOfObject);
  }
  
  public int getCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(1303, arrayOfObject);
  }
  
  public int getExpiredType()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(1304, arrayOfObject);
  }
  
  public boolean isExpired()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(1305, arrayOfObject);
  }
  
  public ExpiredInfo setBodyString(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (ExpiredInfo)m54207b69.F54207b69_09(1306, arrayOfObject);
  }
  
  public ExpiredInfo setCode(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (ExpiredInfo)m54207b69.F54207b69_09(1307, arrayOfObject);
  }
  
  public ExpiredInfo setExpired(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    return (ExpiredInfo)m54207b69.F54207b69_09(1308, arrayOfObject);
  }
  
  public ExpiredInfo setExpiredType(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (ExpiredInfo)m54207b69.F54207b69_09(1309, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.model.ExpiredInfo
 * JD-Core Version:    0.7.0.1
 */
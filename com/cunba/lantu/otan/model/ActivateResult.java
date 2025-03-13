package com.cunba.lantu.otan.model;

import m54207b69;

public class ActivateResult
{
  public static final int EXPIRED = 0;
  public static final int PERMANENT = 1;
  public static final int SUBSCRIBE = 2;
  public static final int TRIAL = 255;
  private String activateCode;
  private int activateType;
  private String enc;
  private long subscribeEndTime;
  private int subscribeLeftDays;
  
  public String getActivateCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(366, arrayOfObject);
  }
  
  public int getActivateType()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(367, arrayOfObject);
  }
  
  public int getActivationResult()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(368, arrayOfObject);
  }
  
  public String getEnc()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(369, arrayOfObject);
  }
  
  public long getSubscribeEndTime()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_06(370, arrayOfObject);
  }
  
  public int getSubscribeLeftDays()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(371, arrayOfObject);
  }
  
  public void setActivateCode(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    m54207b69.F54207b69_00(372, arrayOfObject);
  }
  
  public void setActivateType(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(373, arrayOfObject);
  }
  
  public void setEnc(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    m54207b69.F54207b69_00(374, arrayOfObject);
  }
  
  public void setSubscribeEndTime(long paramLong)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Long localLong = Long.valueOf(paramLong);
    arrayOfObject[1] = localLong;
    m54207b69.F54207b69_00(375, arrayOfObject);
  }
  
  public void setSubscribeLeftDays(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(376, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.model.ActivateResult
 * JD-Core Version:    0.7.0.1
 */
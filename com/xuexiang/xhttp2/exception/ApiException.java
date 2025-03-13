package com.xuexiang.xhttp2.exception;

import m54207b69;

public class ApiException
  extends Exception
{
  public int o00OoOoo;
  
  public ApiException(String paramString, int paramInt)
  {
    super(paramString);
    this.o00OoOoo = paramInt;
  }
  
  public ApiException(Throwable paramThrowable, int paramInt)
  {
    super(paramThrowable);
    this.o00OoOoo = paramInt;
  }
  
  public static ApiException OooO00o(Throwable paramThrowable)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramThrowable;
    return (ApiException)m54207b69.F54207b69_09(1229, arrayOfObject);
  }
  
  public int getCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(1230, arrayOfObject);
  }
  
  public String getDetailMessage()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1231, arrayOfObject);
  }
  
  public String getDisplayMessage()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1232, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.exception.ApiException
 * JD-Core Version:    0.7.0.1
 */
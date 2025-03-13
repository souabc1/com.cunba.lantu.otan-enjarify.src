package com.xuexiang.xhttp2.exception;

import m54207b69;

public class ServerException
  extends RuntimeException
{
  public int o00OoOoo;
  public String o00Ooo00;
  
  public ServerException(int paramInt, String paramString)
  {
    super(paramString);
    this.o00OoOoo = paramInt;
    this.o00Ooo00 = paramString;
  }
  
  public int getErrCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(1235, arrayOfObject);
  }
  
  public String getMessage()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1236, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.exception.ServerException
 * JD-Core Version:    0.7.0.1
 */
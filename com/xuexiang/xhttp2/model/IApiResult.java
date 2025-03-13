package com.xuexiang.xhttp2.model;

public abstract interface IApiResult
{
  public abstract int getCode();
  
  public abstract Object getData();
  
  public abstract String getMsg();
  
  public abstract boolean isSuccess();
  
  public abstract void setData(Object paramObject);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.model.IApiResult
 * JD-Core Version:    0.7.0.1
 */
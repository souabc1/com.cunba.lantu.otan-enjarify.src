package com.xuexiang.xhttp2.cache.model;

import java.io.Serializable;
import m54207b69;

public class CacheResult
  implements Serializable
{
  public Object data;
  public boolean isFromCache;
  
  public CacheResult() {}
  
  public CacheResult(boolean paramBoolean)
  {
    this.isFromCache = paramBoolean;
  }
  
  public CacheResult(boolean paramBoolean, Object paramObject)
  {
    this.isFromCache = paramBoolean;
    this.data = paramObject;
  }
  
  public Object getData()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_09(1159, arrayOfObject);
  }
  
  public boolean isCache()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(1160, arrayOfObject);
  }
  
  public void setCache(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(1161, arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1162, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.cache.model.CacheResult
 * JD-Core Version:    0.7.0.1
 */
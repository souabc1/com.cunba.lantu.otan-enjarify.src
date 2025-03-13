package com.xuexiang.xhttp2;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.ConcurrentHashMap;
import m54207b69;

public class XHttpRequestPool
{
  public static XHttpRequestPool OooO0O0;
  public ConcurrentHashMap OooO00o;
  
  private XHttpRequestPool()
  {
    ConcurrentHashMap localConcurrentHashMap = new java/util/concurrent/ConcurrentHashMap;
    localConcurrentHashMap.<init>();
    this.OooO00o = localConcurrentHashMap;
  }
  
  public static XHttpRequestPool get()
  {
    Object[] arrayOfObject = new Object[0];
    return (XHttpRequestPool)m54207b69.F54207b69_09(1053, arrayOfObject);
  }
  
  public Disposable OooO00o(Object paramObject, Disposable paramDisposable)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramObject;
    arrayOfObject[2] = paramDisposable;
    return (Disposable)m54207b69.F54207b69_09(1051, arrayOfObject);
  }
  
  public void OooO0O0(Object paramObject)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramObject;
    m54207b69.F54207b69_00(1052, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.XHttpRequestPool
 * JD-Core Version:    0.7.0.1
 */
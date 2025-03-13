package com.xuexiang.xhttp2.callback;

import java.io.Serializable;
import m54207b69;

public class UIProgressResponseCallBack$ProgressModel
  implements Serializable
{
  public long o00OoOoo;
  public boolean o00Ooo0;
  public long o00Ooo00;
  
  public UIProgressResponseCallBack$ProgressModel(UIProgressResponseCallBack paramUIProgressResponseCallBack, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    this.o00OoOoo = paramLong1;
    this.o00Ooo00 = paramLong2;
    this.o00Ooo0 = paramBoolean;
  }
  
  public long getContentLength()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_06(1211, arrayOfObject);
  }
  
  public long getCurrentBytes()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_06(1212, arrayOfObject);
  }
  
  public boolean isDone()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(1213, arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1214, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.callback.UIProgressResponseCallBack.ProgressModel
 * JD-Core Version:    0.7.0.1
 */
package com.xuexiang.xhttp2.callback;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import m54207b69;

class UIProgressResponseCallBack$UIHandler
  extends Handler
{
  public final WeakReference OooO00o;
  
  public UIProgressResponseCallBack$UIHandler(Looper paramLooper, UIProgressResponseCallBack paramUIProgressResponseCallBack)
  {
    super(paramLooper);
    paramLooper = new java/lang/ref/WeakReference;
    paramLooper.<init>(paramUIProgressResponseCallBack);
    this.OooO00o = paramLooper;
  }
  
  public void handleMessage(Message paramMessage)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMessage;
    m54207b69.F54207b69_00(1215, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.callback.UIProgressResponseCallBack.UIHandler
 * JD-Core Version:    0.7.0.1
 */
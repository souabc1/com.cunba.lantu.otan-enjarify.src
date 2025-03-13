package com.qinggan.util;

import android.os.Message;

class AsyncTaskHandler$WorkerThread
  extends Thread
{
  public Message o00OoOoo;
  
  public AsyncTaskHandler$WorkerThread(AsyncTaskHandler paramAsyncTaskHandler, Message paramMessage)
  {
    paramAsyncTaskHandler = Message.obtain(paramMessage);
    this.o00OoOoo = paramAsyncTaskHandler;
  }
  
  public void run()
  {
    AsyncTaskHandler localAsyncTaskHandler = this.o00Ooo00;
    Object localObject = this.o00OoOoo;
    int i = ((Message)localObject).what;
    int j = ((Message)localObject).arg1;
    int k = ((Message)localObject).arg2;
    localObject = ((Message)localObject).obj;
    localAsyncTaskHandler.OooO0O0(i, j, k, localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.util.AsyncTaskHandler.WorkerThread
 * JD-Core Version:    0.7.0.1
 */
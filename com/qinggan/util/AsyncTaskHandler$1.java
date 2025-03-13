package com.qinggan.util;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.ExecutorService;

class AsyncTaskHandler$1
  extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    ExecutorService localExecutorService = AsyncTaskHandler.OooO00o(this.OooO00o);
    AsyncTaskHandler.WorkerThread localWorkerThread = new com/qinggan/util/AsyncTaskHandler$WorkerThread;
    AsyncTaskHandler localAsyncTaskHandler = this.OooO00o;
    localWorkerThread.<init>(localAsyncTaskHandler, paramMessage, null);
    localExecutorService.submit(localWorkerThread);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.util.AsyncTaskHandler.1
 * JD-Core Version:    0.7.0.1
 */
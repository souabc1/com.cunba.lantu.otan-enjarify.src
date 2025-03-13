package androidx.loader.content;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class ModernAsyncTask$InternalHandler
  extends Handler
{
  public ModernAsyncTask$InternalHandler()
  {
    super(localLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    Object localObject = (ModernAsyncTask.AsyncTaskResult)paramMessage.obj;
    int i = paramMessage.what;
    int j = 1;
    if (i != j)
    {
      j = 2;
      if (i == j)
      {
        paramMessage = ((ModernAsyncTask.AsyncTaskResult)localObject).OooO00o;
        localObject = ((ModernAsyncTask.AsyncTaskResult)localObject).OooO0O0;
        paramMessage.OooO((Object[])localObject);
      }
    }
    else
    {
      paramMessage = ((ModernAsyncTask.AsyncTaskResult)localObject).OooO00o;
      localObject = ((ModernAsyncTask.AsyncTaskResult)localObject).OooO0O0;
      j = 0;
      localObject = localObject[0];
      paramMessage.OooO0Oo(localObject);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.loader.content.ModernAsyncTask.InternalHandler
 * JD-Core Version:    0.7.0.1
 */
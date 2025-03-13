package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ConcurrencyHelpers
{
  public static ThreadPoolExecutor OooO0O0(String paramString)
  {
    OooO00o localOooO00o = new androidx/emoji2/text/OooO00o;
    localOooO00o.<init>(paramString);
    paramString = new java/util/concurrent/ThreadPoolExecutor;
    TimeUnit localTimeUnit = TimeUnit.SECONDS;
    LinkedBlockingDeque localLinkedBlockingDeque = new java/util/concurrent/LinkedBlockingDeque;
    localLinkedBlockingDeque.<init>();
    paramString.<init>(0, 1, 15, localTimeUnit, localLinkedBlockingDeque, localOooO00o);
    paramString.allowCoreThreadTimeOut(true);
    return paramString;
  }
  
  public static Handler OooO0Oo()
  {
    return ConcurrencyHelpers.Handler28Impl.OooO00o(Looper.getMainLooper());
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.ConcurrencyHelpers
 * JD-Core Version:    0.7.0.1
 */
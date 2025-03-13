package androidx.core.provider;

import android.os.Handler;
import android.os.Looper;

class CalleeHandler
{
  public static Handler OooO00o()
  {
    Object localObject = Looper.myLooper();
    if (localObject == null)
    {
      localObject = new android/os/Handler;
      Looper localLooper = Looper.getMainLooper();
      ((Handler)localObject).<init>(localLooper);
    }
    else
    {
      localObject = new android/os/Handler;
      ((Handler)localObject).<init>();
    }
    return localObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.CalleeHandler
 * JD-Core Version:    0.7.0.1
 */
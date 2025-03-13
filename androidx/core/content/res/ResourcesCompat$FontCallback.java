package androidx.core.content.res;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

public abstract class ResourcesCompat$FontCallback
{
  public static Handler getHandler(Handler paramHandler)
  {
    if (paramHandler == null)
    {
      paramHandler = new android/os/Handler;
      Looper localLooper = Looper.getMainLooper();
      paramHandler.<init>(localLooper);
    }
    return paramHandler;
  }
  
  public final void callbackFailAsync(int paramInt, Handler paramHandler)
  {
    paramHandler = getHandler(paramHandler);
    OooO0O0 localOooO0O0 = new androidx/core/content/res/OooO0O0;
    localOooO0O0.<init>(this, paramInt);
    paramHandler.post(localOooO0O0);
  }
  
  public final void callbackSuccessAsync(Typeface paramTypeface, Handler paramHandler)
  {
    paramHandler = getHandler(paramHandler);
    OooO00o localOooO00o = new androidx/core/content/res/OooO00o;
    localOooO00o.<init>(this, paramTypeface);
    paramHandler.post(localOooO00o);
  }
  
  public abstract void onFontRetrievalFailed(int paramInt);
  
  public abstract void onFontRetrieved(Typeface paramTypeface);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.res.ResourcesCompat.FontCallback
 * JD-Core Version:    0.7.0.1
 */
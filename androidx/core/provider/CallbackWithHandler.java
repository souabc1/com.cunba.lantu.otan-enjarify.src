package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;

class CallbackWithHandler
{
  public final FontsContractCompat.FontRequestCallback OooO00o;
  public final Handler OooO0O0;
  
  public CallbackWithHandler(FontsContractCompat.FontRequestCallback paramFontRequestCallback, Handler paramHandler)
  {
    this.OooO00o = paramFontRequestCallback;
    this.OooO0O0 = paramHandler;
  }
  
  public final void OooO00o(int paramInt)
  {
    FontsContractCompat.FontRequestCallback localFontRequestCallback = this.OooO00o;
    Handler localHandler = this.OooO0O0;
    CallbackWithHandler.2 local2 = new androidx/core/provider/CallbackWithHandler$2;
    local2.<init>(this, localFontRequestCallback, paramInt);
    localHandler.post(local2);
  }
  
  public void OooO0O0(FontRequestWorker.TypefaceResult paramTypefaceResult)
  {
    boolean bool = paramTypefaceResult.isSuccess();
    if (bool)
    {
      paramTypefaceResult = paramTypefaceResult.OooO00o;
      OooO0OO(paramTypefaceResult);
    }
    else
    {
      int i = paramTypefaceResult.OooO0O0;
      OooO00o(i);
    }
  }
  
  public final void OooO0OO(Typeface paramTypeface)
  {
    FontsContractCompat.FontRequestCallback localFontRequestCallback = this.OooO00o;
    Handler localHandler = this.OooO0O0;
    CallbackWithHandler.1 local1 = new androidx/core/provider/CallbackWithHandler$1;
    local1.<init>(this, localFontRequestCallback, paramTypeface);
    localHandler.post(local1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.CallbackWithHandler
 * JD-Core Version:    0.7.0.1
 */
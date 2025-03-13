package androidx.core.provider;

import android.graphics.Typeface;

class CallbackWithHandler$1
  implements Runnable
{
  public CallbackWithHandler$1(CallbackWithHandler paramCallbackWithHandler, FontsContractCompat.FontRequestCallback paramFontRequestCallback, Typeface paramTypeface) {}
  
  public void run()
  {
    FontsContractCompat.FontRequestCallback localFontRequestCallback = this.o00OoOoo;
    Typeface localTypeface = this.o00Ooo00;
    localFontRequestCallback.OooO0O0(localTypeface);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.CallbackWithHandler.1
 * JD-Core Version:    0.7.0.1
 */
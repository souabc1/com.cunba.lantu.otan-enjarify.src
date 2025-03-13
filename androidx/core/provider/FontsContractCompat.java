package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.graphics.TypefaceCompat;

public class FontsContractCompat
{
  public static Typeface OooO00o(Context paramContext, CancellationSignal paramCancellationSignal, FontsContractCompat.FontInfo[] paramArrayOfFontInfo)
  {
    return TypefaceCompat.OooO0O0(paramContext, paramCancellationSignal, paramArrayOfFontInfo, 0);
  }
  
  public static FontsContractCompat.FontFamilyResult OooO0O0(Context paramContext, CancellationSignal paramCancellationSignal, FontRequest paramFontRequest)
  {
    return FontProvider.OooO0o0(paramContext, paramFontRequest, paramCancellationSignal);
  }
  
  public static Typeface OooO0OO(Context paramContext, FontRequest paramFontRequest, int paramInt1, boolean paramBoolean, int paramInt2, Handler paramHandler, FontsContractCompat.FontRequestCallback paramFontRequestCallback)
  {
    CallbackWithHandler localCallbackWithHandler = new androidx/core/provider/CallbackWithHandler;
    localCallbackWithHandler.<init>(paramFontRequestCallback, paramHandler);
    if (paramBoolean) {
      return FontRequestWorker.OooO0o0(paramContext, paramFontRequest, localCallbackWithHandler, paramInt1, paramInt2);
    }
    return FontRequestWorker.OooO0Oo(paramContext, paramFontRequest, paramInt1, null, localCallbackWithHandler);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.FontsContractCompat
 * JD-Core Version:    0.7.0.1
 */
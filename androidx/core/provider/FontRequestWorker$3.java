package androidx.core.provider;

import android.content.Context;
import java.util.concurrent.Callable;

class FontRequestWorker$3
  implements Callable
{
  public FontRequestWorker$3(String paramString, Context paramContext, FontRequest paramFontRequest, int paramInt) {}
  
  public FontRequestWorker.TypefaceResult OooO00o()
  {
    Object localObject;
    try
    {
      localObject = this.o00OoOoo;
      Context localContext = this.o00Ooo00;
      FontRequest localFontRequest = this.o00Ooo0;
      int i = this.o00Ooo0O;
      return FontRequestWorker.OooO0OO((String)localObject, localContext, localFontRequest, i);
    }
    finally
    {
      localObject = new androidx/core/provider/FontRequestWorker$TypefaceResult;
      ((FontRequestWorker.TypefaceResult)localObject).<init>(-3);
    }
    return localObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.FontRequestWorker.3
 * JD-Core Version:    0.7.0.1
 */
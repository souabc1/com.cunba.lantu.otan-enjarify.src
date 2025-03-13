package androidx.core.text;

import android.text.Html;
import android.text.Html.ImageGetter;
import android.text.Html.TagHandler;
import android.text.Spanned;

class HtmlCompat$Api24Impl
{
  public static Spanned OooO00o(String paramString, int paramInt)
  {
    return Html.fromHtml(paramString, paramInt);
  }
  
  public static Spanned OooO0O0(String paramString, int paramInt, Html.ImageGetter paramImageGetter, Html.TagHandler paramTagHandler)
  {
    return Html.fromHtml(paramString, paramInt, paramImageGetter, paramTagHandler);
  }
  
  public static String OooO0OO(Spanned paramSpanned, int paramInt)
  {
    return Html.toHtml(paramSpanned, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.text.HtmlCompat.Api24Impl
 * JD-Core Version:    0.7.0.1
 */
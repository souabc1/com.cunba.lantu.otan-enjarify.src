package androidx.core.text.util;

import android.text.Spannable;
import android.text.util.Linkify;
import android.text.util.Linkify.MatchFilter;
import android.text.util.Linkify.TransformFilter;
import android.widget.TextView;
import java.util.regex.Pattern;

class LinkifyCompat$Api24Impl
{
  public static void OooO00o(TextView paramTextView, Pattern paramPattern, String paramString, String[] paramArrayOfString, Linkify.MatchFilter paramMatchFilter, Linkify.TransformFilter paramTransformFilter)
  {
    Linkify.addLinks(paramTextView, paramPattern, paramString, paramArrayOfString, paramMatchFilter, paramTransformFilter);
  }
  
  public static boolean OooO0O0(Spannable paramSpannable, Pattern paramPattern, String paramString, String[] paramArrayOfString, Linkify.MatchFilter paramMatchFilter, Linkify.TransformFilter paramTransformFilter)
  {
    return Linkify.addLinks(paramSpannable, paramPattern, paramString, paramArrayOfString, paramMatchFilter, paramTransformFilter);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.text.util.LinkifyCompat.Api24Impl
 * JD-Core Version:    0.7.0.1
 */
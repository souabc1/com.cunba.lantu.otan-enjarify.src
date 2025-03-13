package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.util.Locale;

class AppCompatTextHelper$Api17Impl
{
  public static Drawable[] OooO00o(TextView paramTextView)
  {
    return paramTextView.getCompoundDrawablesRelative();
  }
  
  public static void OooO0O0(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    paramTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
  }
  
  public static void OooO0OO(TextView paramTextView, Locale paramLocale)
  {
    paramTextView.setTextLocale(paramLocale);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatTextHelper.Api17Impl
 * JD-Core Version:    0.7.0.1
 */
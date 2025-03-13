package androidx.core.widget;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

class TextViewCompat$Api17Impl
{
  public static Drawable[] OooO00o(TextView paramTextView)
  {
    return paramTextView.getCompoundDrawablesRelative();
  }
  
  public static int OooO0O0(View paramView)
  {
    return paramView.getLayoutDirection();
  }
  
  public static int OooO0OO(View paramView)
  {
    return paramView.getTextDirection();
  }
  
  public static Locale OooO0Oo(TextView paramTextView)
  {
    return paramTextView.getTextLocale();
  }
  
  public static void OooO0o(TextView paramTextView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void OooO0o0(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    paramTextView.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
  }
  
  public static void OooO0oO(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    paramTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
  }
  
  public static void OooO0oo(View paramView, int paramInt)
  {
    paramView.setTextDirection(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.widget.TextViewCompat.Api17Impl
 * JD-Core Version:    0.7.0.1
 */
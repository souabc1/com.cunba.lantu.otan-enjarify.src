package androidx.appcompat.widget;

import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

final class AppCompatTextViewAutoSizeHelper$Api16Impl
{
  public static StaticLayout OooO00o(CharSequence paramCharSequence, Layout.Alignment paramAlignment, int paramInt, TextView paramTextView, TextPaint paramTextPaint)
  {
    float f1 = paramTextView.getLineSpacingMultiplier();
    float f2 = paramTextView.getLineSpacingExtra();
    boolean bool = paramTextView.getIncludeFontPadding();
    paramTextView = new android/text/StaticLayout;
    paramTextView.<init>(paramCharSequence, paramTextPaint, paramInt, paramAlignment, f1, f2, bool);
    return paramTextView;
  }
  
  public static int OooO0O0(TextView paramTextView)
  {
    return paramTextView.getMaxLines();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Api16Impl
 * JD-Core Version:    0.7.0.1
 */
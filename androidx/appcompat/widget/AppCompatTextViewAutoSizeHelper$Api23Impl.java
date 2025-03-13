package androidx.appcompat.widget;

import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextPaint;
import android.widget.TextView;

final class AppCompatTextViewAutoSizeHelper$Api23Impl
{
  public static StaticLayout OooO00o(CharSequence paramCharSequence, Layout.Alignment paramAlignment, int paramInt1, int paramInt2, TextView paramTextView, TextPaint paramTextPaint, AppCompatTextViewAutoSizeHelper.Impl paramImpl)
  {
    int i = paramCharSequence.length();
    paramCharSequence = StaticLayout.Builder.obtain(paramCharSequence, 0, i, paramTextPaint, paramInt1);
    paramAlignment = paramCharSequence.setAlignment(paramAlignment);
    float f1 = paramTextView.getLineSpacingExtra();
    float f2 = paramTextView.getLineSpacingMultiplier();
    paramAlignment = paramAlignment.setLineSpacing(f1, f2);
    paramInt1 = paramTextView.getIncludeFontPadding();
    paramAlignment = paramAlignment.setIncludePad(paramInt1);
    paramInt1 = paramTextView.getBreakStrategy();
    paramAlignment = paramAlignment.setBreakStrategy(paramInt1);
    paramInt1 = paramTextView.getHyphenationFrequency();
    paramAlignment = paramAlignment.setHyphenationFrequency(paramInt1);
    paramInt1 = -1;
    f1 = 0.0F / 0.0F;
    if (paramInt2 == paramInt1) {
      paramInt2 = -1 >>> 1;
    }
    paramAlignment.setMaxLines(paramInt2);
    try
    {
      paramImpl.OooO00o(paramCharSequence, paramTextView);
      label114:
      return paramCharSequence.build();
    }
    catch (ClassCastException localClassCastException)
    {
      break label114;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Api23Impl
 * JD-Core Version:    0.7.0.1
 */
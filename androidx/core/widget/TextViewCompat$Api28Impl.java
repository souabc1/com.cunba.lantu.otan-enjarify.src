package androidx.core.widget;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText.Params;
import android.widget.TextView;

class TextViewCompat$Api28Impl
{
  public static String[] OooO00o(DecimalFormatSymbols paramDecimalFormatSymbols)
  {
    return paramDecimalFormatSymbols.getDigitStrings();
  }
  
  public static PrecomputedText.Params OooO0O0(TextView paramTextView)
  {
    return paramTextView.getTextMetricsParams();
  }
  
  public static void OooO0OO(TextView paramTextView, int paramInt)
  {
    paramTextView.setFirstBaselineToTopHeight(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.widget.TextViewCompat.Api28Impl
 * JD-Core Version:    0.7.0.1
 */
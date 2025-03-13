package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.widget.TextView;

class TextViewCompat$Api23Impl
{
  public static int OooO00o(TextView paramTextView)
  {
    return paramTextView.getBreakStrategy();
  }
  
  public static ColorStateList OooO0O0(TextView paramTextView)
  {
    return paramTextView.getCompoundDrawableTintList();
  }
  
  public static PorterDuff.Mode OooO0OO(TextView paramTextView)
  {
    return paramTextView.getCompoundDrawableTintMode();
  }
  
  public static int OooO0Oo(TextView paramTextView)
  {
    return paramTextView.getHyphenationFrequency();
  }
  
  public static void OooO0o(TextView paramTextView, ColorStateList paramColorStateList)
  {
    paramTextView.setCompoundDrawableTintList(paramColorStateList);
  }
  
  public static void OooO0o0(TextView paramTextView, int paramInt)
  {
    paramTextView.setBreakStrategy(paramInt);
  }
  
  public static void OooO0oO(TextView paramTextView, PorterDuff.Mode paramMode)
  {
    paramTextView.setCompoundDrawableTintMode(paramMode);
  }
  
  public static void OooO0oo(TextView paramTextView, int paramInt)
  {
    paramTextView.setHyphenationFrequency(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.widget.TextViewCompat.Api23Impl
 * JD-Core Version:    0.7.0.1
 */
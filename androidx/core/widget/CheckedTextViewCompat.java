package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

public final class CheckedTextViewCompat
{
  public static Drawable OooO00o(CheckedTextView paramCheckedTextView)
  {
    return CheckedTextViewCompat.Api16Impl.OooO00o(paramCheckedTextView);
  }
  
  public static void OooO0O0(CheckedTextView paramCheckedTextView, ColorStateList paramColorStateList)
  {
    CheckedTextViewCompat.Api21Impl.OooO00o(paramCheckedTextView, paramColorStateList);
  }
  
  public static void OooO0OO(CheckedTextView paramCheckedTextView, PorterDuff.Mode paramMode)
  {
    CheckedTextViewCompat.Api21Impl.OooO0O0(paramCheckedTextView, paramMode);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.widget.CheckedTextViewCompat
 * JD-Core Version:    0.7.0.1
 */
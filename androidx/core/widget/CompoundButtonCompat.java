package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

public final class CompoundButtonCompat
{
  public static Drawable OooO00o(CompoundButton paramCompoundButton)
  {
    return CompoundButtonCompat.Api23Impl.OooO00o(paramCompoundButton);
  }
  
  public static ColorStateList OooO0O0(CompoundButton paramCompoundButton)
  {
    return CompoundButtonCompat.Api21Impl.OooO00o(paramCompoundButton);
  }
  
  public static PorterDuff.Mode OooO0OO(CompoundButton paramCompoundButton)
  {
    return CompoundButtonCompat.Api21Impl.OooO0O0(paramCompoundButton);
  }
  
  public static void OooO0Oo(CompoundButton paramCompoundButton, ColorStateList paramColorStateList)
  {
    CompoundButtonCompat.Api21Impl.OooO0OO(paramCompoundButton, paramColorStateList);
  }
  
  public static void OooO0o0(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode)
  {
    CompoundButtonCompat.Api21Impl.OooO0Oo(paramCompoundButton, paramMode);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.widget.CompoundButtonCompat
 * JD-Core Version:    0.7.0.1
 */
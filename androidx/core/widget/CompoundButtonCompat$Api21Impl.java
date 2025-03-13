package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.widget.CompoundButton;

class CompoundButtonCompat$Api21Impl
{
  public static ColorStateList OooO00o(CompoundButton paramCompoundButton)
  {
    return paramCompoundButton.getButtonTintList();
  }
  
  public static PorterDuff.Mode OooO0O0(CompoundButton paramCompoundButton)
  {
    return paramCompoundButton.getButtonTintMode();
  }
  
  public static void OooO0OO(CompoundButton paramCompoundButton, ColorStateList paramColorStateList)
  {
    paramCompoundButton.setButtonTintList(paramColorStateList);
  }
  
  public static void OooO0Oo(CompoundButton paramCompoundButton, PorterDuff.Mode paramMode)
  {
    paramCompoundButton.setButtonTintMode(paramMode);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.widget.CompoundButtonCompat.Api21Impl
 * JD-Core Version:    0.7.0.1
 */
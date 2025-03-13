package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;

public abstract interface TintableCompoundButton
{
  public abstract ColorStateList getSupportButtonTintList();
  
  public abstract PorterDuff.Mode getSupportButtonTintMode();
  
  public abstract void setSupportButtonTintList(ColorStateList paramColorStateList);
  
  public abstract void setSupportButtonTintMode(PorterDuff.Mode paramMode);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.widget.TintableCompoundButton
 * JD-Core Version:    0.7.0.1
 */
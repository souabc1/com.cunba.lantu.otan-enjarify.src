package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;

public abstract interface TintableCheckedTextView
{
  public abstract ColorStateList getSupportCheckMarkTintList();
  
  public abstract PorterDuff.Mode getSupportCheckMarkTintMode();
  
  public abstract void setSupportCheckMarkTintList(ColorStateList paramColorStateList);
  
  public abstract void setSupportCheckMarkTintMode(PorterDuff.Mode paramMode);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.widget.TintableCheckedTextView
 * JD-Core Version:    0.7.0.1
 */
package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;

public abstract interface TintableImageSourceView
{
  public abstract ColorStateList getSupportImageTintList();
  
  public abstract PorterDuff.Mode getSupportImageTintMode();
  
  public abstract void setSupportImageTintList(ColorStateList paramColorStateList);
  
  public abstract void setSupportImageTintMode(PorterDuff.Mode paramMode);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.widget.TintableImageSourceView
 * JD-Core Version:    0.7.0.1
 */
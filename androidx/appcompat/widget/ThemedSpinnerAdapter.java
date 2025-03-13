package androidx.appcompat.widget;

import android.content.res.Resources.Theme;
import android.widget.SpinnerAdapter;

public abstract interface ThemedSpinnerAdapter
  extends SpinnerAdapter
{
  public abstract Resources.Theme getDropDownViewTheme();
  
  public abstract void setDropDownViewTheme(Resources.Theme paramTheme);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ThemedSpinnerAdapter
 * JD-Core Version:    0.7.0.1
 */
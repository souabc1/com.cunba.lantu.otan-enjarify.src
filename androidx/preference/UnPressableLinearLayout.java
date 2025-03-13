package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class UnPressableLinearLayout
  extends LinearLayout
{
  public UnPressableLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void dispatchSetPressed(boolean paramBoolean) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.preference.UnPressableLinearLayout
 * JD-Core Version:    0.7.0.1
 */
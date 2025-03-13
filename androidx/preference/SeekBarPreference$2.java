package androidx.preference;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

class SeekBarPreference$2
  implements View.OnKeyListener
{
  public SeekBarPreference$2(SeekBarPreference paramSeekBarPreference) {}
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    int i = paramKeyEvent.getAction();
    if (i != 0) {
      return false;
    }
    paramView = this.o00OoOoo;
    boolean bool = paramView.o00oO00O;
    if (!bool)
    {
      j = 21;
      if (paramInt != j)
      {
        j = 22;
        if (paramInt != j) {}
      }
      else
      {
        return false;
      }
    }
    int j = 23;
    if (paramInt != j)
    {
      j = 66;
      if (paramInt != j)
      {
        paramView = paramView.o00oo000;
        if (paramView == null) {
          return false;
        }
        return paramView.onKeyDown(paramInt, paramKeyEvent);
      }
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.preference.SeekBarPreference.2
 * JD-Core Version:    0.7.0.1
 */
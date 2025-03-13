package androidx.preference;

import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

class SeekBarPreference$1
  implements SeekBar.OnSeekBarChangeListener
{
  public SeekBarPreference$1(SeekBarPreference paramSeekBarPreference) {}
  
  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      SeekBarPreference localSeekBarPreference = this.OooO00o;
      boolean bool = localSeekBarPreference.o00oOo;
      if (!bool)
      {
        bool = localSeekBarPreference.o00o;
        if (bool) {}
      }
      else
      {
        localSeekBarPreference.OoooOOo(paramSeekBar);
        return;
      }
    }
    paramSeekBar = this.OooO00o;
    paramBoolean = paramSeekBar.o00o0oo0;
    paramInt += paramBoolean;
    paramSeekBar.OoooOo0(paramInt);
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar)
  {
    this.OooO00o.o00o = true;
  }
  
  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    SeekBarPreference localSeekBarPreference1 = this.OooO00o;
    localSeekBarPreference1.o00o = false;
    int i = paramSeekBar.getProgress();
    SeekBarPreference localSeekBarPreference2 = this.OooO00o;
    int j = localSeekBarPreference2.o00o0oo0;
    i += j;
    j = localSeekBarPreference2.o00o0oOo;
    if (i != j) {
      localSeekBarPreference2.OoooOOo(paramSeekBar);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.preference.SeekBarPreference.1
 * JD-Core Version:    0.7.0.1
 */
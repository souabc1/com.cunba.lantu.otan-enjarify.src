package androidx.core.widget;

import androidx.core.view.ViewCompat;

class AutoScrollHelper$ScrollAnimationRunnable
  implements Runnable
{
  public AutoScrollHelper$ScrollAnimationRunnable(AutoScrollHelper paramAutoScrollHelper) {}
  
  public void run()
  {
    Object localObject = this.o00OoOoo;
    boolean bool1 = ((AutoScrollHelper)localObject).o00o000O;
    if (!bool1) {
      return;
    }
    bool1 = ((AutoScrollHelper)localObject).o00o0000;
    if (bool1)
    {
      ((AutoScrollHelper)localObject).o00o0000 = false;
      localObject = ((AutoScrollHelper)localObject).o00OoOoo;
      ((AutoScrollHelper.ClampedScroller)localObject).OooO0o();
    }
    localObject = this.o00OoOoo.o00OoOoo;
    bool1 = ((AutoScrollHelper.ClampedScroller)localObject).isFinished();
    if (!bool1)
    {
      AutoScrollHelper localAutoScrollHelper = this.o00OoOoo;
      bool1 = localAutoScrollHelper.OooOo0();
      if (bool1)
      {
        localAutoScrollHelper = this.o00OoOoo;
        boolean bool2 = localAutoScrollHelper.o00o000;
        if (bool2)
        {
          localAutoScrollHelper.o00o000 = false;
          localAutoScrollHelper.OooO0OO();
        }
        ((AutoScrollHelper.ClampedScroller)localObject).OooO00o();
        int i = ((AutoScrollHelper.ClampedScroller)localObject).getDeltaX();
        int j = ((AutoScrollHelper.ClampedScroller)localObject).getDeltaY();
        this.o00OoOoo.OooOO0(i, j);
        ViewCompat.o0OoOo0(this.o00OoOoo.o00Ooo0, this);
        return;
      }
    }
    this.o00OoOoo.o00o000O = false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.widget.AutoScrollHelper.ScrollAnimationRunnable
 * JD-Core Version:    0.7.0.1
 */
package androidx.constraintlayout.motion.widget;

import android.os.BaseBundle;
import android.os.Bundle;

class MotionLayout$StateCache
{
  public float OooO00o;
  public float OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  public final String OooO0o;
  public final String OooO0o0;
  public final String OooO0oO;
  public final String OooO0oo;
  
  public MotionLayout$StateCache(MotionLayout paramMotionLayout)
  {
    float f = 0.0F / 0.0F;
    this.OooO00o = f;
    this.OooO0O0 = f;
    int i = -1;
    this.OooO0OO = i;
    this.OooO0Oo = i;
    this.OooO0o0 = "motion.progress";
    this.OooO0o = "motion.velocity";
    this.OooO0oO = "motion.StartState";
    this.OooO0oo = "motion.EndState";
  }
  
  public void OooO00o()
  {
    int i = this.OooO0OO;
    int j = -1;
    float f1 = 0.0F / 0.0F;
    int k;
    if (i == j)
    {
      k = this.OooO0Oo;
      if (k == j) {}
    }
    else
    {
      if (i == j)
      {
        localMotionLayout1 = this.OooO;
        k = this.OooO0Oo;
        localMotionLayout1.Ooooo0o(k);
      }
      else
      {
        k = this.OooO0Oo;
        if (k == j)
        {
          localObject = this.OooO;
          ((MotionLayout)localObject).setState(i, j, j);
        }
        else
        {
          MotionLayout localMotionLayout2 = this.OooO;
          localMotionLayout2.setTransition(i, k);
        }
      }
      localMotionLayout1 = this.OooO;
      Object localObject = MotionLayout.TransitionState.o00Ooo00;
      localMotionLayout1.setState((MotionLayout.TransitionState)localObject);
    }
    float f2 = this.OooO0O0;
    boolean bool = Float.isNaN(f2);
    if (bool)
    {
      f2 = this.OooO00o;
      bool = Float.isNaN(f2);
      if (bool) {
        return;
      }
      localMotionLayout1 = this.OooO;
      f1 = this.OooO00o;
      localMotionLayout1.setProgress(f1);
      return;
    }
    MotionLayout localMotionLayout1 = this.OooO;
    float f3 = this.OooO00o;
    float f4 = this.OooO0O0;
    localMotionLayout1.o000oOoO(f3, f4);
    f2 = 0.0F / 0.0F;
    this.OooO00o = f2;
    this.OooO0O0 = f2;
    this.OooO0OO = j;
    this.OooO0Oo = j;
  }
  
  public void OooO0O0()
  {
    int i = MotionLayout.OooO0oO(this.OooO);
    this.OooO0Oo = i;
    i = MotionLayout.OooOOo(this.OooO);
    this.OooO0OO = i;
    float f = this.OooO.getVelocity();
    this.OooO0O0 = f;
    f = this.OooO.getProgress();
    this.OooO00o = f;
  }
  
  public Bundle getTransitionState()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    float f = this.OooO00o;
    localBundle.putFloat("motion.progress", f);
    f = this.OooO0O0;
    localBundle.putFloat("motion.velocity", f);
    int i = this.OooO0OO;
    localBundle.putInt("motion.StartState", i);
    i = this.OooO0Oo;
    localBundle.putInt("motion.EndState", i);
    return localBundle;
  }
  
  public void setEndState(int paramInt)
  {
    this.OooO0Oo = paramInt;
  }
  
  public void setProgress(float paramFloat)
  {
    this.OooO00o = paramFloat;
  }
  
  public void setStartState(int paramInt)
  {
    this.OooO0OO = paramInt;
  }
  
  public void setTransitionState(Bundle paramBundle)
  {
    float f = paramBundle.getFloat("motion.progress");
    this.OooO00o = f;
    f = paramBundle.getFloat("motion.velocity");
    this.OooO0O0 = f;
    int i = paramBundle.getInt("motion.StartState");
    this.OooO0OO = i;
    int j = paramBundle.getInt("motion.EndState");
    this.OooO0Oo = j;
  }
  
  public void setVelocity(float paramFloat)
  {
    this.OooO0O0 = paramFloat;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionLayout.StateCache
 * JD-Core Version:    0.7.0.1
 */
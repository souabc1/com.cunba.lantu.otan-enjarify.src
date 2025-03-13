package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

class FragmentTransitionCompat21$5
  extends Transition.EpicenterCallback
{
  public FragmentTransitionCompat21$5(FragmentTransitionCompat21 paramFragmentTransitionCompat21, Rect paramRect) {}
  
  public Rect onGetEpicenter(Transition paramTransition)
  {
    paramTransition = this.OooO00o;
    if (paramTransition != null)
    {
      boolean bool = paramTransition.isEmpty();
      if (!bool) {
        return this.OooO00o;
      }
    }
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentTransitionCompat21.5
 * JD-Core Version:    0.7.0.1
 */
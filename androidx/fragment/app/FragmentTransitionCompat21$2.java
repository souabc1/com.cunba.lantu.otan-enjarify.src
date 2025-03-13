package androidx.fragment.app;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import android.view.View;
import java.util.ArrayList;

class FragmentTransitionCompat21$2
  implements Transition.TransitionListener
{
  public FragmentTransitionCompat21$2(FragmentTransitionCompat21 paramFragmentTransitionCompat21, View paramView, ArrayList paramArrayList) {}
  
  public void onTransitionCancel(Transition paramTransition) {}
  
  public void onTransitionEnd(Transition paramTransition)
  {
    paramTransition.removeListener(this);
    this.OooO00o.setVisibility(8);
    paramTransition = this.OooO0O0;
    int i = paramTransition.size();
    int j = 0;
    while (j < i)
    {
      View localView = (View)this.OooO0O0.get(j);
      localView.setVisibility(0);
      j += 1;
    }
  }
  
  public void onTransitionPause(Transition paramTransition) {}
  
  public void onTransitionResume(Transition paramTransition) {}
  
  public void onTransitionStart(Transition paramTransition)
  {
    paramTransition.removeListener(this);
    paramTransition.addListener(this);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentTransitionCompat21.2
 * JD-Core Version:    0.7.0.1
 */
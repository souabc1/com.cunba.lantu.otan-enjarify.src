package androidx.fragment.app;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import java.util.ArrayList;

class FragmentTransitionCompat21$3
  implements Transition.TransitionListener
{
  public FragmentTransitionCompat21$3(FragmentTransitionCompat21 paramFragmentTransitionCompat21, Object paramObject1, ArrayList paramArrayList1, Object paramObject2, ArrayList paramArrayList2, Object paramObject3, ArrayList paramArrayList3) {}
  
  public void onTransitionCancel(Transition paramTransition) {}
  
  public void onTransitionEnd(Transition paramTransition)
  {
    paramTransition.removeListener(this);
  }
  
  public void onTransitionPause(Transition paramTransition) {}
  
  public void onTransitionResume(Transition paramTransition) {}
  
  public void onTransitionStart(Transition paramTransition)
  {
    paramTransition = this.OooO00o;
    FragmentTransitionCompat21 localFragmentTransitionCompat21;
    ArrayList localArrayList;
    if (paramTransition != null)
    {
      localFragmentTransitionCompat21 = this.OooO0oO;
      localArrayList = this.OooO0O0;
      localFragmentTransitionCompat21.OooOo0o(paramTransition, localArrayList, null);
    }
    paramTransition = this.OooO0OO;
    if (paramTransition != null)
    {
      localFragmentTransitionCompat21 = this.OooO0oO;
      localArrayList = this.OooO0Oo;
      localFragmentTransitionCompat21.OooOo0o(paramTransition, localArrayList, null);
    }
    paramTransition = this.OooO0o0;
    if (paramTransition != null)
    {
      localFragmentTransitionCompat21 = this.OooO0oO;
      localArrayList = this.OooO0o;
      localFragmentTransitionCompat21.OooOo0o(paramTransition, localArrayList, null);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentTransitionCompat21.3
 * JD-Core Version:    0.7.0.1
 */
package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

public class Scene
{
  public int OooO00o;
  public ViewGroup OooO0O0;
  public Runnable OooO0OO;
  public Runnable OooO0Oo;
  
  public static Scene OooO0O0(ViewGroup paramViewGroup)
  {
    int i = R.id.transition_current_scene;
    return (Scene)paramViewGroup.getTag(i);
  }
  
  public static void OooO0OO(ViewGroup paramViewGroup, Scene paramScene)
  {
    int i = R.id.transition_current_scene;
    paramViewGroup.setTag(i, paramScene);
  }
  
  public void OooO00o()
  {
    Object localObject = OooO0O0(this.OooO0O0);
    if (localObject == this)
    {
      localObject = this.OooO0Oo;
      if (localObject != null) {
        ((Runnable)localObject).run();
      }
    }
  }
  
  public ViewGroup getSceneRoot()
  {
    return this.OooO0O0;
  }
  
  public boolean isCreatedFromLayoutResource()
  {
    int i = this.OooO00o;
    if (i > 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public void setEnterAction(Runnable paramRunnable)
  {
    this.OooO0OO = paramRunnable;
  }
  
  public void setExitAction(Runnable paramRunnable)
  {
    this.OooO0Oo = paramRunnable;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.Scene
 * JD-Core Version:    0.7.0.1
 */
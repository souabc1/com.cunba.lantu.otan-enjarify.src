package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.core.view.ViewCompat;

class GhostViewPort$1
  implements ViewTreeObserver.OnPreDrawListener
{
  public GhostViewPort$1(GhostViewPort paramGhostViewPort) {}
  
  public boolean onPreDraw()
  {
    ViewCompat.Ooooooo(this.o00OoOoo);
    Object localObject = this.o00OoOoo;
    ViewGroup localViewGroup = ((GhostViewPort)localObject).o00OoOoo;
    if (localViewGroup != null)
    {
      localObject = ((GhostViewPort)localObject).o00Ooo00;
      if (localObject != null)
      {
        localViewGroup.endViewTransition((View)localObject);
        ViewCompat.Ooooooo(this.o00OoOoo.o00OoOoo);
        localObject = this.o00OoOoo;
        localViewGroup = null;
        ((GhostViewPort)localObject).o00OoOoo = null;
        ((GhostViewPort)localObject).o00Ooo00 = null;
      }
    }
    return true;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.GhostViewPort.1
 * JD-Core Version:    0.7.0.1
 */
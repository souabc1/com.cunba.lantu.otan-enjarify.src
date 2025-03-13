package androidx.fragment.app;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import androidx.core.view.ViewCompat;

class FragmentStateManager$1
  implements View.OnAttachStateChangeListener
{
  public FragmentStateManager$1(FragmentStateManager paramFragmentStateManager, View paramView) {}
  
  public void onViewAttachedToWindow(View paramView)
  {
    this.o00OoOoo.removeOnAttachStateChangeListener(this);
    ViewCompat.o00o0O(this.o00OoOoo);
  }
  
  public void onViewDetachedFromWindow(View paramView) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentStateManager.1
 * JD-Core Version:    0.7.0.1
 */
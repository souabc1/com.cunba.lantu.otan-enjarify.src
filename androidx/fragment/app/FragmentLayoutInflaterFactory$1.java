package androidx.fragment.app;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;

class FragmentLayoutInflaterFactory$1
  implements View.OnAttachStateChangeListener
{
  public FragmentLayoutInflaterFactory$1(FragmentLayoutInflaterFactory paramFragmentLayoutInflaterFactory, FragmentStateManager paramFragmentStateManager) {}
  
  public void onViewAttachedToWindow(View paramView)
  {
    paramView = this.o00OoOoo.getFragment();
    this.o00OoOoo.OooOO0o();
    paramView = (ViewGroup)paramView.mView.getParent();
    FragmentManager localFragmentManager = this.o00Ooo00.o00OoOoo;
    SpecialEffectsController.OooOOo0(paramView, localFragmentManager).OooOOO();
  }
  
  public void onViewDetachedFromWindow(View paramView) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentLayoutInflaterFactory.1
 * JD-Core Version:    0.7.0.1
 */
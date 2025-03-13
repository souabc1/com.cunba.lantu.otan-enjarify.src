package androidx.appcompat.app;

import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;

class AppCompatDelegateImpl$6
  implements Runnable
{
  public AppCompatDelegateImpl$6(AppCompatDelegateImpl paramAppCompatDelegateImpl) {}
  
  public void run()
  {
    Object localObject1 = this.o00OoOoo;
    Object localObject2 = ((AppCompatDelegateImpl)localObject1).o00o00oO;
    localObject1 = ((AppCompatDelegateImpl)localObject1).o00o00o;
    int i = 55;
    ((PopupWindow)localObject2).showAtLocation((View)localObject1, i, 0, 0);
    this.o00OoOoo.OoooOOo();
    localObject1 = this.o00OoOoo;
    boolean bool = ((AppCompatDelegateImpl)localObject1).o000000();
    float f = 1.0F;
    if (bool)
    {
      localObject1 = this.o00OoOoo.o00o00o;
      i = 0;
      ((View)localObject1).setAlpha(0.0F);
      localObject1 = this.o00OoOoo;
      ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat = ViewCompat.OooO0o0(((AppCompatDelegateImpl)localObject1).o00o00o);
      localObject2 = localViewPropertyAnimatorCompat.OooO0O0(f);
      ((AppCompatDelegateImpl)localObject1).o00o0 = ((ViewPropertyAnimatorCompat)localObject2);
      localObject1 = this.o00OoOoo.o00o0;
      localObject2 = new androidx/appcompat/app/AppCompatDelegateImpl$6$1;
      ((AppCompatDelegateImpl.6.1)localObject2).<init>(this);
      ((ViewPropertyAnimatorCompat)localObject1).OooO0oO((ViewPropertyAnimatorListener)localObject2);
    }
    else
    {
      this.o00OoOoo.o00o00o.setAlpha(f);
      localObject1 = this.o00OoOoo.o00o00o;
      ((ActionBarContextView)localObject1).setVisibility(0);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.6
 * JD-Core Version:    0.7.0.1
 */
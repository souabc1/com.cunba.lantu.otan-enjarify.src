package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.ContentFrameLayout;

class AppCompatDelegateImpl$ListMenuDecorView
  extends ContentFrameLayout
{
  public AppCompatDelegateImpl$ListMenuDecorView(AppCompatDelegateImpl paramAppCompatDelegateImpl, Context paramContext)
  {
    super(paramContext);
  }
  
  public final boolean OooO0O0(int paramInt1, int paramInt2)
  {
    int i = -5;
    if ((paramInt1 >= i) && (paramInt2 >= i))
    {
      i = getWidth() + 5;
      if (paramInt1 <= i)
      {
        paramInt1 = getHeight() + 5;
        if (paramInt2 <= paramInt1) {
          return 0;
        }
      }
    }
    paramInt1 = 1;
    return paramInt1;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppCompatDelegateImpl localAppCompatDelegateImpl = this.o00OooOo;
    boolean bool1 = localAppCompatDelegateImpl.o000oOoO(paramKeyEvent);
    if (!bool1)
    {
      bool2 = super.dispatchKeyEvent(paramKeyEvent);
      if (!bool2)
      {
        bool2 = false;
        paramKeyEvent = null;
        break label41;
      }
    }
    boolean bool2 = true;
    label41:
    return bool2;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    if (i == 0)
    {
      float f1 = paramMotionEvent.getX();
      i = (int)f1;
      float f2 = paramMotionEvent.getY();
      int j = (int)f2;
      boolean bool = OooO0O0(i, j);
      if (bool)
      {
        this.o00OooOo.Oooo(0);
        return true;
      }
    }
    return super.onInterceptTouchEvent(paramMotionEvent);
  }
  
  public void setBackgroundResource(int paramInt)
  {
    Drawable localDrawable = AppCompatResources.OooO0O0(getContext(), paramInt);
    setBackgroundDrawable(localDrawable);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.ListMenuDecorView
 * JD-Core Version:    0.7.0.1
 */
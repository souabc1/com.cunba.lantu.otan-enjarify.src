package androidx.appcompat.app;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.drawerlayout.widget.DrawerLayout.DrawerListener;

public class ActionBarDrawerToggle
  implements DrawerLayout.DrawerListener
{
  public final int OooO;
  public final ActionBarDrawerToggle.Delegate OooO00o;
  public final DrawerLayout OooO0O0;
  public DrawerArrowDrawable OooO0OO;
  public boolean OooO0Oo;
  public boolean OooO0o;
  public Drawable OooO0o0;
  public boolean OooO0oO;
  public final int OooO0oo;
  public View.OnClickListener OooOO0;
  public boolean OooOO0O;
  
  private void setPosition(float paramFloat)
  {
    float f = 1.0F;
    boolean bool1 = paramFloat < f;
    DrawerArrowDrawable localDrawerArrowDrawable;
    if (!bool1) {
      localDrawerArrowDrawable = this.OooO0OO;
    }
    for (boolean bool2 = true;; bool2 = false)
    {
      localDrawerArrowDrawable.setVerticalMirror(bool2);
      break;
      f = 0.0F;
      localDrawerArrowDrawable = null;
      bool1 = paramFloat < 0.0F;
      if (bool1) {
        break;
      }
      localDrawerArrowDrawable = this.OooO0OO;
    }
    this.OooO0OO.setProgress(paramFloat);
  }
  
  public void OooO00o(View paramView)
  {
    float f = 1.0F;
    setPosition(f);
    boolean bool = this.OooO0o;
    if (bool)
    {
      int i = this.OooO;
      setActionBarDescription(i);
    }
  }
  
  public void OooO0O0(View paramView)
  {
    setPosition(0.0F);
    boolean bool = this.OooO0o;
    if (bool)
    {
      int i = this.OooO0oo;
      setActionBarDescription(i);
    }
  }
  
  public void OooO0OO(int paramInt) {}
  
  public void OooO0Oo(View paramView, float paramFloat)
  {
    boolean bool = this.OooO0Oo;
    if (bool)
    {
      int i = 1065353216;
      paramFloat = Math.max(0.0F, paramFloat);
      float f = Math.min(1.0F, paramFloat);
      setPosition(f);
    }
    else
    {
      setPosition(0.0F);
    }
  }
  
  public void OooO0o()
  {
    Object localObject = this.OooO0O0;
    int i = 8388611;
    boolean bool2 = ((DrawerLayout)localObject).isDrawerOpen(i);
    int k;
    float f;
    if (bool2)
    {
      k = 1065353216;
      f = 1.0F;
    }
    else
    {
      k = 0;
      f = 0.0F;
      localObject = null;
    }
    setPosition(f);
    boolean bool3 = this.OooO0o;
    if (bool3)
    {
      localObject = this.OooO0OO;
      DrawerLayout localDrawerLayout = this.OooO0O0;
      boolean bool1 = localDrawerLayout.isDrawerOpen(i);
      int j;
      if (bool1) {
        j = this.OooO;
      } else {
        j = this.OooO0oo;
      }
      OooO0o0((Drawable)localObject, j);
    }
  }
  
  public void OooO0o0(Drawable paramDrawable, int paramInt)
  {
    boolean bool = this.OooOO0O;
    if (!bool)
    {
      ActionBarDrawerToggle.Delegate localDelegate = this.OooO00o;
      bool = localDelegate.isNavigationVisible();
      if (!bool)
      {
        bool = true;
        this.OooOO0O = bool;
      }
    }
    this.OooO00o.OooO00o(paramDrawable, paramInt);
  }
  
  public void OooO0oO()
  {
    DrawerLayout localDrawerLayout1 = this.OooO0O0;
    int i = 8388611;
    int j = localDrawerLayout1.getDrawerLockMode(i);
    DrawerLayout localDrawerLayout2 = this.OooO0O0;
    boolean bool = localDrawerLayout2.isDrawerVisible(i);
    if (bool)
    {
      k = 2;
      if (j != k)
      {
        localDrawerLayout1 = this.OooO0O0;
        localDrawerLayout1.OooO0Oo(i);
        return;
      }
    }
    int k = 1;
    if (j != k)
    {
      localDrawerLayout1 = this.OooO0O0;
      localDrawerLayout1.Oooo00O(i);
    }
  }
  
  public DrawerArrowDrawable getDrawerArrowDrawable()
  {
    return this.OooO0OO;
  }
  
  public Drawable getThemeUpIndicator()
  {
    return this.OooO00o.getThemeUpIndicator();
  }
  
  public View.OnClickListener getToolbarNavigationClickListener()
  {
    return this.OooOO0;
  }
  
  public boolean isDrawerIndicatorEnabled()
  {
    return this.OooO0o;
  }
  
  public boolean isDrawerSlideAnimationEnabled()
  {
    return this.OooO0Oo;
  }
  
  public void setActionBarDescription(int paramInt)
  {
    this.OooO00o.setActionBarDescription(paramInt);
  }
  
  public void setDrawerArrowDrawable(DrawerArrowDrawable paramDrawerArrowDrawable)
  {
    this.OooO0OO = paramDrawerArrowDrawable;
    OooO0o();
  }
  
  public void setDrawerIndicatorEnabled(boolean paramBoolean)
  {
    boolean bool1 = this.OooO0o;
    if (paramBoolean != bool1)
    {
      Object localObject;
      DrawerLayout localDrawerLayout;
      int j;
      if (paramBoolean)
      {
        localObject = this.OooO0OO;
        localDrawerLayout = this.OooO0O0;
        int i = 8388611;
        boolean bool2 = localDrawerLayout.isDrawerOpen(i);
        if (bool2) {
          j = this.OooO;
        } else {
          j = this.OooO0oo;
        }
      }
      else
      {
        localObject = this.OooO0o0;
        j = 0;
        localDrawerLayout = null;
      }
      OooO0o0((Drawable)localObject, j);
      this.OooO0o = paramBoolean;
    }
  }
  
  public void setDrawerSlideAnimationEnabled(boolean paramBoolean)
  {
    this.OooO0Oo = paramBoolean;
    if (!paramBoolean)
    {
      paramBoolean = false;
      setPosition(0.0F);
    }
  }
  
  public void setHomeAsUpIndicator(int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0)
    {
      Resources localResources = this.OooO0O0.getResources();
      localDrawable = localResources.getDrawable(paramInt);
    }
    else
    {
      paramInt = 0;
      localDrawable = null;
    }
    setHomeAsUpIndicator(localDrawable);
  }
  
  public void setHomeAsUpIndicator(Drawable paramDrawable)
  {
    if (paramDrawable == null)
    {
      paramDrawable = getThemeUpIndicator();
      this.OooO0o0 = paramDrawable;
      this.OooO0oO = false;
    }
    else
    {
      this.OooO0o0 = paramDrawable;
      bool = true;
      this.OooO0oO = bool;
    }
    boolean bool = this.OooO0o;
    if (!bool)
    {
      paramDrawable = this.OooO0o0;
      OooO0o0(paramDrawable, 0);
    }
  }
  
  public void setToolbarNavigationClickListener(View.OnClickListener paramOnClickListener)
  {
    this.OooOO0 = paramOnClickListener;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.ActionBarDrawerToggle
 * JD-Core Version:    0.7.0.1
 */
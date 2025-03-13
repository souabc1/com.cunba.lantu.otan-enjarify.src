package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ActionMode.Callback;

public abstract class ActionBar
{
  public void OooO(boolean paramBoolean) {}
  
  public boolean OooO0oO()
  {
    return false;
  }
  
  public boolean OooO0oo()
  {
    return false;
  }
  
  public boolean OooOO0()
  {
    return false;
  }
  
  public void OooOO0O(Configuration paramConfiguration) {}
  
  public void OooOO0o() {}
  
  public boolean OooOOO(KeyEvent paramKeyEvent)
  {
    return false;
  }
  
  public boolean OooOOO0(int paramInt, KeyEvent paramKeyEvent)
  {
    return false;
  }
  
  public boolean OooOOOO()
  {
    return false;
  }
  
  public ActionMode OooOOOo(ActionMode.Callback paramCallback)
  {
    return null;
  }
  
  public abstract View getCustomView();
  
  public abstract int getDisplayOptions();
  
  public float getElevation()
  {
    return 0.0F;
  }
  
  public abstract int getHeight();
  
  public int getHideOffset()
  {
    return 0;
  }
  
  public abstract int getNavigationItemCount();
  
  public abstract int getNavigationMode();
  
  public abstract int getSelectedNavigationIndex();
  
  public abstract ActionBar.Tab getSelectedTab();
  
  public abstract CharSequence getSubtitle();
  
  public abstract ActionBar.Tab getTabAt(int paramInt);
  
  public abstract int getTabCount();
  
  public Context getThemedContext()
  {
    return null;
  }
  
  public abstract CharSequence getTitle();
  
  public boolean isHideOnContentScrollEnabled()
  {
    return false;
  }
  
  public abstract boolean isShowing();
  
  public boolean isTitleTruncated()
  {
    return false;
  }
  
  public abstract void setBackgroundDrawable(Drawable paramDrawable);
  
  public abstract void setCustomView(int paramInt);
  
  public abstract void setCustomView(View paramView);
  
  public void setDefaultDisplayHomeAsUpEnabled(boolean paramBoolean) {}
  
  public abstract void setDisplayHomeAsUpEnabled(boolean paramBoolean);
  
  public abstract void setDisplayOptions(int paramInt);
  
  public abstract void setDisplayOptions(int paramInt1, int paramInt2);
  
  public abstract void setDisplayShowCustomEnabled(boolean paramBoolean);
  
  public abstract void setDisplayShowHomeEnabled(boolean paramBoolean);
  
  public abstract void setDisplayShowTitleEnabled(boolean paramBoolean);
  
  public abstract void setDisplayUseLogoEnabled(boolean paramBoolean);
  
  public void setElevation(float paramFloat)
  {
    boolean bool = paramFloat < 0.0F;
    if (!bool) {
      return;
    }
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Setting a non-zero elevation is not supported in this action bar configuration.");
    throw localUnsupportedOperationException;
  }
  
  public void setHideOffset(int paramInt)
  {
    if (paramInt == 0) {
      return;
    }
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
    throw localUnsupportedOperationException;
  }
  
  public void setHideOnContentScrollEnabled(boolean paramBoolean)
  {
    if (!paramBoolean) {
      return;
    }
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Hide on content scroll is not supported in this action bar configuration.");
    throw localUnsupportedOperationException;
  }
  
  public void setHomeActionContentDescription(int paramInt) {}
  
  public void setHomeActionContentDescription(CharSequence paramCharSequence) {}
  
  public void setHomeAsUpIndicator(int paramInt) {}
  
  public void setHomeAsUpIndicator(Drawable paramDrawable) {}
  
  public void setHomeButtonEnabled(boolean paramBoolean) {}
  
  public abstract void setIcon(int paramInt);
  
  public abstract void setIcon(Drawable paramDrawable);
  
  public abstract void setLogo(int paramInt);
  
  public abstract void setLogo(Drawable paramDrawable);
  
  public abstract void setNavigationMode(int paramInt);
  
  public abstract void setSelectedNavigationItem(int paramInt);
  
  public void setShowHideAnimationEnabled(boolean paramBoolean) {}
  
  public void setSplitBackgroundDrawable(Drawable paramDrawable) {}
  
  public void setStackedBackgroundDrawable(Drawable paramDrawable) {}
  
  public abstract void setSubtitle(int paramInt);
  
  public abstract void setSubtitle(CharSequence paramCharSequence);
  
  public abstract void setTitle(int paramInt);
  
  public abstract void setTitle(CharSequence paramCharSequence);
  
  public void setWindowTitle(CharSequence paramCharSequence) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.ActionBar
 * JD-Core Version:    0.7.0.1
 */
package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public abstract class ActionMode
{
  public Object o00OoOoo;
  public boolean o00Ooo00;
  
  public abstract void OooO00o();
  
  public abstract void OooO0O0();
  
  public abstract View getCustomView();
  
  public abstract Menu getMenu();
  
  public abstract MenuInflater getMenuInflater();
  
  public abstract CharSequence getSubtitle();
  
  public Object getTag()
  {
    return this.o00OoOoo;
  }
  
  public abstract CharSequence getTitle();
  
  public boolean getTitleOptionalHint()
  {
    return this.o00Ooo00;
  }
  
  public boolean isTitleOptional()
  {
    return false;
  }
  
  public boolean isUiFocusable()
  {
    return true;
  }
  
  public abstract void setCustomView(View paramView);
  
  public abstract void setSubtitle(int paramInt);
  
  public abstract void setSubtitle(CharSequence paramCharSequence);
  
  public void setTag(Object paramObject)
  {
    this.o00OoOoo = paramObject;
  }
  
  public abstract void setTitle(int paramInt);
  
  public abstract void setTitle(CharSequence paramCharSequence);
  
  public void setTitleOptionalHint(boolean paramBoolean)
  {
    this.o00Ooo00 = paramBoolean;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.ActionMode
 * JD-Core Version:    0.7.0.1
 */
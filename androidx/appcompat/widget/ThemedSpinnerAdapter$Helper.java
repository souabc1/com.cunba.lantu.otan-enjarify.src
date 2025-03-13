package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.view.LayoutInflater;
import androidx.appcompat.view.ContextThemeWrapper;

public final class ThemedSpinnerAdapter$Helper
{
  public final Context OooO00o;
  public final LayoutInflater OooO0O0;
  public LayoutInflater OooO0OO;
  
  public LayoutInflater getDropDownViewInflater()
  {
    LayoutInflater localLayoutInflater = this.OooO0OO;
    if (localLayoutInflater == null) {
      localLayoutInflater = this.OooO0O0;
    }
    return localLayoutInflater;
  }
  
  public Resources.Theme getDropDownViewTheme()
  {
    Object localObject = this.OooO0OO;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((LayoutInflater)localObject).getContext().getTheme();
    }
    return localObject;
  }
  
  public void setDropDownViewTheme(Resources.Theme paramTheme)
  {
    if (paramTheme == null) {
      paramTheme = null;
    }
    for (;;)
    {
      this.OooO0OO = paramTheme;
      break;
      Object localObject = this.OooO00o.getTheme();
      boolean bool = paramTheme.equals(localObject);
      if (bool)
      {
        paramTheme = this.OooO0O0;
      }
      else
      {
        localObject = new androidx/appcompat/view/ContextThemeWrapper;
        Context localContext = this.OooO00o;
        ((ContextThemeWrapper)localObject).<init>(localContext, paramTheme);
        paramTheme = LayoutInflater.from((Context)localObject);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ThemedSpinnerAdapter.Helper
 * JD-Core Version:    0.7.0.1
 */
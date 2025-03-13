package com.xuexiang.xui.widget.dialog.materialdialog.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;
import m54207b69;

public class MDButton
  extends TextView
{
  public boolean o00OoOoo = false;
  public int o00Ooo0;
  public GravityEnum o00Ooo00;
  public Drawable o00Ooo0O;
  public Drawable o00Ooo0o;
  
  public MDButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    OooO00o(paramContext);
  }
  
  public final void OooO00o(Context paramContext)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramContext;
    m54207b69.F54207b69_00(3182, arrayOfObject);
  }
  
  public void OooO0O0(boolean paramBoolean1, boolean paramBoolean2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean1);
    arrayOfObject[1] = localBoolean;
    localBoolean = Boolean.valueOf(paramBoolean2);
    arrayOfObject[2] = localBoolean;
    m54207b69.F54207b69_00(3183, arrayOfObject);
  }
  
  public void setAllCapsCompat(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(3184, arrayOfObject);
  }
  
  public void setDefaultSelector(Drawable paramDrawable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDrawable;
    m54207b69.F54207b69_00(3185, arrayOfObject);
  }
  
  public void setStackedGravity(GravityEnum paramGravityEnum)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramGravityEnum;
    m54207b69.F54207b69_00(3186, arrayOfObject);
  }
  
  public void setStackedSelector(Drawable paramDrawable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDrawable;
    m54207b69.F54207b69_00(3187, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.dialog.materialdialog.internal.MDButton
 * JD-Core Version:    0.7.0.1
 */
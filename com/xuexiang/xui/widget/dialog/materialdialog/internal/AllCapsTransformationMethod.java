package com.xuexiang.xui.widget.dialog.materialdialog.internal;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;
import m54207b69;

class AllCapsTransformationMethod
  implements TransformationMethod
{
  public Locale o00OoOoo;
  
  public CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence;
    arrayOfObject[2] = paramView;
    return (CharSequence)m54207b69.F54207b69_09(3180, arrayOfObject);
  }
  
  public void onFocusChanged(View paramView, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, Rect paramRect)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    arrayOfObject[2] = paramCharSequence;
    Object localObject = Boolean.valueOf(paramBoolean);
    arrayOfObject[3] = localObject;
    localObject = Integer.valueOf(paramInt);
    arrayOfObject[4] = localObject;
    arrayOfObject[5] = paramRect;
    m54207b69.F54207b69_00(3181, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.dialog.materialdialog.internal.AllCapsTransformationMethod
 * JD-Core Version:    0.7.0.1
 */
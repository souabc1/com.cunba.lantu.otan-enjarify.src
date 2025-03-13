package com.xuexiang.xui.widget.toast;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Toast;
import m54207b69;

public class XToast
{
  public static Toast OooO00o;
  
  private XToast()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("V64317575A5C16481D67614F4D6365506E675365296F682E2F30");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public static Toast OooO0OO(Context paramContext, CharSequence paramCharSequence, Drawable paramDrawable, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object[] arrayOfObject = new Object[8];
    arrayOfObject[0] = paramContext;
    arrayOfObject[1] = paramCharSequence;
    arrayOfObject[2] = paramDrawable;
    Object localObject = Integer.valueOf(paramInt1);
    arrayOfObject[3] = localObject;
    localObject = Integer.valueOf(paramInt2);
    arrayOfObject[4] = localObject;
    localObject = Integer.valueOf(paramInt3);
    arrayOfObject[5] = localObject;
    localObject = Boolean.valueOf(paramBoolean1);
    arrayOfObject[6] = localObject;
    localObject = Boolean.valueOf(paramBoolean2);
    arrayOfObject[7] = localObject;
    return (Toast)m54207b69.F54207b69_09(6554, arrayOfObject);
  }
  
  public static Toast OooO0Oo(Context paramContext, CharSequence paramCharSequence)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramContext;
    arrayOfObject[1] = paramCharSequence;
    return (Toast)m54207b69.F54207b69_09(6555, arrayOfObject);
  }
  
  public static Toast OooO0o0(Context paramContext, CharSequence paramCharSequence, int paramInt, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = paramContext;
    arrayOfObject[1] = paramCharSequence;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[2] = localObject;
    localObject = Boolean.valueOf(paramBoolean);
    arrayOfObject[3] = localObject;
    return (Toast)m54207b69.F54207b69_09(6556, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.toast.XToast
 * JD-Core Version:    0.7.0.1
 */
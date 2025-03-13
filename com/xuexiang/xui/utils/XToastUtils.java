package com.xuexiang.xui.utils;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.xuexiang.xui.XUI;
import com.xuexiang.xui.widget.toast.XToast.Config;
import m54207b69;

public final class XToastUtils
{
  public static final Handler OooO00o;
  
  static
  {
    Object localObject1 = new android/os/Handler;
    Object localObject2 = Looper.getMainLooper();
    ((Handler)localObject1).<init>((Looper)localObject2);
    OooO00o = (Handler)localObject1;
    localObject1 = XToast.Config.get().OooOO0O(200);
    localObject2 = XUI.getDefaultTypeface();
    ((XToast.Config)localObject1).OooOO0o((Typeface)localObject2).OooOO0(false);
  }
  
  private XToastUtils()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("V64317575A5C16481D67614F4D6365506E675365296F682E2F30");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public static void OooO00o(CharSequence paramCharSequence)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramCharSequence;
    m54207b69.F54207b69_00(2229, arrayOfObject);
  }
  
  public static void OooO0O0(Toast paramToast)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramToast;
    m54207b69.F54207b69_00(2230, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.utils.XToastUtils
 * JD-Core Version:    0.7.0.1
 */
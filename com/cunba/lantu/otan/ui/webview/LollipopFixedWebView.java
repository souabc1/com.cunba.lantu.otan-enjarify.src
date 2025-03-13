package com.cunba.lantu.otan.ui.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import m54207b69;

public class LollipopFixedWebView
  extends WebView
{
  public LollipopFixedWebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public static Context OooO00o(Context paramContext)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramContext;
    return (Context)m54207b69.F54207b69_09(759, arrayOfObject);
  }
  
  public static boolean isLollipopWebViewBug()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(760, arrayOfObject);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    requestDisallowInterceptTouchEvent(true);
    return super.onTouchEvent(paramMotionEvent);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.ui.webview.LollipopFixedWebView
 * JD-Core Version:    0.7.0.1
 */
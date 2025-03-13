package androidx.core.view;

import android.view.ContentInfo;
import android.view.View;

final class ViewCompat$Api31Impl
{
  public static String[] OooO00o(View paramView)
  {
    return paramView.getReceiveContentMimeTypes();
  }
  
  public static ContentInfoCompat OooO0O0(View paramView, ContentInfoCompat paramContentInfoCompat)
  {
    ContentInfo localContentInfo = paramContentInfoCompat.OooO0o0();
    paramView = paramView.performReceiveContent(localContentInfo);
    if (paramView == null) {
      return null;
    }
    if (paramView == localContentInfo) {
      return paramContentInfoCompat;
    }
    return ContentInfoCompat.OooO0o(paramView);
  }
  
  public static void OooO0OO(View paramView, String[] paramArrayOfString, OnReceiveContentListener paramOnReceiveContentListener)
  {
    if (paramOnReceiveContentListener == null)
    {
      paramOnReceiveContentListener = null;
      paramView.setOnReceiveContentListener(paramArrayOfString, null);
    }
    else
    {
      ViewCompat.OnReceiveContentListenerAdapter localOnReceiveContentListenerAdapter = new androidx/core/view/ViewCompat$OnReceiveContentListenerAdapter;
      localOnReceiveContentListenerAdapter.<init>(paramOnReceiveContentListener);
      paramView.setOnReceiveContentListener(paramArrayOfString, localOnReceiveContentListenerAdapter);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewCompat.Api31Impl
 * JD-Core Version:    0.7.0.1
 */
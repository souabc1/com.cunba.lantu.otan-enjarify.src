package androidx.core.view;

import android.view.ContentInfo;
import android.view.View;

final class ViewCompat$OnReceiveContentListenerAdapter
  implements android.view.OnReceiveContentListener
{
  public final OnReceiveContentListener OooO00o;
  
  public ViewCompat$OnReceiveContentListenerAdapter(OnReceiveContentListener paramOnReceiveContentListener)
  {
    this.OooO00o = paramOnReceiveContentListener;
  }
  
  public ContentInfo onReceiveContent(View paramView, ContentInfo paramContentInfo)
  {
    ContentInfoCompat localContentInfoCompat = ContentInfoCompat.OooO0o(paramContentInfo);
    OnReceiveContentListener localOnReceiveContentListener = this.OooO00o;
    paramView = localOnReceiveContentListener.OooO00o(paramView, localContentInfoCompat);
    if (paramView == null) {
      return null;
    }
    if (paramView == localContentInfoCompat) {
      return paramContentInfo;
    }
    return paramView.OooO0o0();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewCompat.OnReceiveContentListenerAdapter
 * JD-Core Version:    0.7.0.1
 */
package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

final class InputContentInfoCompat$InputContentInfoCompatApi25Impl
  implements InputContentInfoCompat.InputContentInfoCompatImpl
{
  public final InputContentInfo OooO00o;
  
  public InputContentInfoCompat$InputContentInfoCompatApi25Impl(Uri paramUri1, ClipDescription paramClipDescription, Uri paramUri2)
  {
    InputContentInfo localInputContentInfo = new android/view/inputmethod/InputContentInfo;
    localInputContentInfo.<init>(paramUri1, paramClipDescription, paramUri2);
    this.OooO00o = localInputContentInfo;
  }
  
  public InputContentInfoCompat$InputContentInfoCompatApi25Impl(Object paramObject)
  {
    paramObject = (InputContentInfo)paramObject;
    this.OooO00o = paramObject;
  }
  
  public void OooO00o()
  {
    this.OooO00o.requestPermission();
  }
  
  public Uri getContentUri()
  {
    return this.OooO00o.getContentUri();
  }
  
  public ClipDescription getDescription()
  {
    return this.OooO00o.getDescription();
  }
  
  public Object getInputContentInfo()
  {
    return this.OooO00o;
  }
  
  public Uri getLinkUri()
  {
    return this.OooO00o.getLinkUri();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatApi25Impl
 * JD-Core Version:    0.7.0.1
 */
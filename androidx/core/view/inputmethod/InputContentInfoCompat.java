package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;

public final class InputContentInfoCompat
{
  public final InputContentInfoCompat.InputContentInfoCompatImpl OooO00o;
  
  public InputContentInfoCompat(Uri paramUri1, ClipDescription paramClipDescription, Uri paramUri2)
  {
    InputContentInfoCompat.InputContentInfoCompatApi25Impl localInputContentInfoCompatApi25Impl = new androidx/core/view/inputmethod/InputContentInfoCompat$InputContentInfoCompatApi25Impl;
    localInputContentInfoCompatApi25Impl.<init>(paramUri1, paramClipDescription, paramUri2);
    this.OooO00o = localInputContentInfoCompatApi25Impl;
  }
  
  public InputContentInfoCompat(InputContentInfoCompat.InputContentInfoCompatImpl paramInputContentInfoCompatImpl)
  {
    this.OooO00o = paramInputContentInfoCompatImpl;
  }
  
  public static InputContentInfoCompat OooO0OO(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    InputContentInfoCompat localInputContentInfoCompat = new androidx/core/view/inputmethod/InputContentInfoCompat;
    InputContentInfoCompat.InputContentInfoCompatApi25Impl localInputContentInfoCompatApi25Impl = new androidx/core/view/inputmethod/InputContentInfoCompat$InputContentInfoCompatApi25Impl;
    localInputContentInfoCompatApi25Impl.<init>(paramObject);
    localInputContentInfoCompat.<init>(localInputContentInfoCompatApi25Impl);
    return localInputContentInfoCompat;
  }
  
  public void OooO00o()
  {
    this.OooO00o.OooO00o();
  }
  
  public Object OooO0O0()
  {
    return this.OooO00o.getInputContentInfo();
  }
  
  public Uri getContentUri()
  {
    return this.OooO00o.getContentUri();
  }
  
  public ClipDescription getDescription()
  {
    return this.OooO00o.getDescription();
  }
  
  public Uri getLinkUri()
  {
    return this.OooO00o.getLinkUri();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.inputmethod.InputContentInfoCompat
 * JD-Core Version:    0.7.0.1
 */
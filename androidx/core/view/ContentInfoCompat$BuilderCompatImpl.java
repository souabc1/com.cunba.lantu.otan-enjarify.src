package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

final class ContentInfoCompat$BuilderCompatImpl
  implements ContentInfoCompat.BuilderCompat
{
  public ClipData OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public Uri OooO0Oo;
  public Bundle OooO0o0;
  
  public ContentInfoCompat$BuilderCompatImpl(ClipData paramClipData, int paramInt)
  {
    this.OooO00o = paramClipData;
    this.OooO0O0 = paramInt;
  }
  
  public ContentInfoCompat OooO00o()
  {
    ContentInfoCompat localContentInfoCompat = new androidx/core/view/ContentInfoCompat;
    ContentInfoCompat.CompatImpl localCompatImpl = new androidx/core/view/ContentInfoCompat$CompatImpl;
    localCompatImpl.<init>(this);
    localContentInfoCompat.<init>(localCompatImpl);
    return localContentInfoCompat;
  }
  
  public void setClip(ClipData paramClipData)
  {
    this.OooO00o = paramClipData;
  }
  
  public void setExtras(Bundle paramBundle)
  {
    this.OooO0o0 = paramBundle;
  }
  
  public void setFlags(int paramInt)
  {
    this.OooO0OO = paramInt;
  }
  
  public void setLinkUri(Uri paramUri)
  {
    this.OooO0Oo = paramUri;
  }
  
  public void setSource(int paramInt)
  {
    this.OooO0O0 = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ContentInfoCompat.BuilderCompatImpl
 * JD-Core Version:    0.7.0.1
 */
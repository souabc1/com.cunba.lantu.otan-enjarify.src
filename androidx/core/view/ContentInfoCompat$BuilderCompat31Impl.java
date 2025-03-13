package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.ContentInfo.Builder;

final class ContentInfoCompat$BuilderCompat31Impl
  implements ContentInfoCompat.BuilderCompat
{
  public final ContentInfo.Builder OooO00o;
  
  public ContentInfoCompat$BuilderCompat31Impl(ClipData paramClipData, int paramInt)
  {
    paramClipData = OooOOO.OooO00o(paramClipData, paramInt);
    this.OooO00o = paramClipData;
  }
  
  public ContentInfoCompat OooO00o()
  {
    ContentInfoCompat localContentInfoCompat = new androidx/core/view/ContentInfoCompat;
    ContentInfoCompat.Compat31Impl localCompat31Impl = new androidx/core/view/ContentInfoCompat$Compat31Impl;
    ContentInfo localContentInfo = OooOOO0.OooO00o(this.OooO00o);
    localCompat31Impl.<init>(localContentInfo);
    localContentInfoCompat.<init>(localCompat31Impl);
    return localContentInfoCompat;
  }
  
  public void setClip(ClipData paramClipData)
  {
    OooOO0O.OooO00o(this.OooO00o, paramClipData);
  }
  
  public void setExtras(Bundle paramBundle)
  {
    OooO0OO.OooO00o(this.OooO00o, paramBundle);
  }
  
  public void setFlags(int paramInt)
  {
    OooO.OooO00o(this.OooO00o, paramInt);
  }
  
  public void setLinkUri(Uri paramUri)
  {
    OooOO0.OooO00o(this.OooO00o, paramUri);
  }
  
  public void setSource(int paramInt)
  {
    OooO0o.OooO00o(this.OooO00o, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ContentInfoCompat.BuilderCompat31Impl
 * JD-Core Version:    0.7.0.1
 */
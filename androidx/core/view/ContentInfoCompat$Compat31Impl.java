package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.core.util.Preconditions;

final class ContentInfoCompat$Compat31Impl
  implements ContentInfoCompat.Compat
{
  public final ContentInfo OooO00o;
  
  public ContentInfoCompat$Compat31Impl(ContentInfo paramContentInfo)
  {
    paramContentInfo = OooO00o.OooO00o(Preconditions.OooO0oo(paramContentInfo));
    this.OooO00o = paramContentInfo;
  }
  
  public ClipData getClip()
  {
    return OooOOOO.OooO00o(this.OooO00o);
  }
  
  public Bundle getExtras()
  {
    return OooOo00.OooO00o(this.OooO00o);
  }
  
  public int getFlags()
  {
    return Oooo000.OooO00o(this.OooO00o);
  }
  
  public Uri getLinkUri()
  {
    return OooOo.OooO00o(this.OooO00o);
  }
  
  public int getSource()
  {
    return Oooo0.OooO00o(this.OooO00o);
  }
  
  public ContentInfo getWrapped()
  {
    return this.OooO00o;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("ContentInfoCompat{");
    ContentInfo localContentInfo = this.OooO00o;
    localStringBuilder.append(localContentInfo);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ContentInfoCompat.Compat31Impl
 * JD-Core Version:    0.7.0.1
 */
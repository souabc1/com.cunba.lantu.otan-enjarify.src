package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;

public final class ContentInfoCompat$Builder
{
  public final ContentInfoCompat.BuilderCompat OooO00o;
  
  public ContentInfoCompat$Builder(ClipData paramClipData, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 31;
    Object localObject;
    if (i >= j)
    {
      localObject = new androidx/core/view/ContentInfoCompat$BuilderCompat31Impl;
      ((ContentInfoCompat.BuilderCompat31Impl)localObject).<init>(paramClipData, paramInt);
    }
    else
    {
      localObject = new androidx/core/view/ContentInfoCompat$BuilderCompatImpl;
      ((ContentInfoCompat.BuilderCompatImpl)localObject).<init>(paramClipData, paramInt);
    }
    this.OooO00o = ((ContentInfoCompat.BuilderCompat)localObject);
  }
  
  public ContentInfoCompat OooO00o()
  {
    return this.OooO00o.OooO00o();
  }
  
  public Builder OooO0O0(Bundle paramBundle)
  {
    this.OooO00o.setExtras(paramBundle);
    return this;
  }
  
  public Builder OooO0OO(int paramInt)
  {
    this.OooO00o.setFlags(paramInt);
    return this;
  }
  
  public Builder OooO0Oo(Uri paramUri)
  {
    this.OooO00o.setLinkUri(paramUri);
    return this;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ContentInfoCompat.Builder
 * JD-Core Version:    0.7.0.1
 */
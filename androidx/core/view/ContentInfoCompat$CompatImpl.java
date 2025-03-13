package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.core.util.Preconditions;

final class ContentInfoCompat$CompatImpl
  implements ContentInfoCompat.Compat
{
  public final ClipData OooO00o;
  public final int OooO0O0;
  public final int OooO0OO;
  public final Uri OooO0Oo;
  public final Bundle OooO0o0;
  
  public ContentInfoCompat$CompatImpl(ContentInfoCompat.BuilderCompatImpl paramBuilderCompatImpl)
  {
    Object localObject = (ClipData)Preconditions.OooO0oo(paramBuilderCompatImpl.OooO00o);
    this.OooO00o = ((ClipData)localObject);
    int i = Preconditions.OooO0Oo(paramBuilderCompatImpl.OooO0O0, 0, 5, "source");
    this.OooO0O0 = i;
    i = Preconditions.OooO0oO(paramBuilderCompatImpl.OooO0OO, 1);
    this.OooO0OO = i;
    localObject = paramBuilderCompatImpl.OooO0Oo;
    this.OooO0Oo = ((Uri)localObject);
    paramBuilderCompatImpl = paramBuilderCompatImpl.OooO0o0;
    this.OooO0o0 = paramBuilderCompatImpl;
  }
  
  public ClipData getClip()
  {
    return this.OooO00o;
  }
  
  public Bundle getExtras()
  {
    return this.OooO0o0;
  }
  
  public int getFlags()
  {
    return this.OooO0OO;
  }
  
  public Uri getLinkUri()
  {
    return this.OooO0Oo;
  }
  
  public int getSource()
  {
    return this.OooO0O0;
  }
  
  public ContentInfo getWrapped()
  {
    return null;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("ContentInfoCompat{clip=");
    Object localObject = this.OooO00o.getDescription();
    localStringBuilder.append(localObject);
    localStringBuilder.append(", source=");
    localObject = ContentInfoCompat.OooO0Oo(this.OooO0O0);
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(", flags=");
    int i = this.OooO0OO;
    localObject = ContentInfoCompat.OooO0O0(i);
    localStringBuilder.append((String)localObject);
    localObject = this.OooO0Oo;
    String str1 = "";
    if (localObject == null)
    {
      localObject = str1;
    }
    else
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append(", hasLinkUri(");
      int j = this.OooO0Oo.toString().length();
      ((StringBuilder)localObject).append(j);
      String str2 = ")";
      ((StringBuilder)localObject).append(str2);
      localObject = ((StringBuilder)localObject).toString();
    }
    localStringBuilder.append((String)localObject);
    localObject = this.OooO0o0;
    if (localObject != null) {
      str1 = ", hasExtras";
    }
    localStringBuilder.append(str1);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ContentInfoCompat.CompatImpl
 * JD-Core Version:    0.7.0.1
 */
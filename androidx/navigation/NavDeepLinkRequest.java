package androidx.navigation;

import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

public class NavDeepLinkRequest
{
  public final Uri OooO00o;
  public final String OooO0O0;
  public final String OooO0OO;
  
  public NavDeepLinkRequest(Intent paramIntent)
  {
    this(localUri, str, paramIntent);
  }
  
  public NavDeepLinkRequest(Uri paramUri, String paramString1, String paramString2)
  {
    this.OooO00o = paramUri;
    this.OooO0O0 = paramString1;
    this.OooO0OO = paramString2;
  }
  
  public String getAction()
  {
    return this.OooO0O0;
  }
  
  public String getMimeType()
  {
    return this.OooO0OO;
  }
  
  public Uri getUri()
  {
    return this.OooO00o;
  }
  
  public String toString()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("NavDeepLinkRequest");
    ((StringBuilder)localObject1).append("{");
    Object localObject2 = getUri();
    if (localObject2 != null)
    {
      ((StringBuilder)localObject1).append(" uri=");
      localObject2 = String.valueOf(getUri());
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    localObject2 = getAction();
    if (localObject2 != null)
    {
      ((StringBuilder)localObject1).append(" action=");
      localObject2 = getAction();
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    localObject2 = getMimeType();
    if (localObject2 != null)
    {
      ((StringBuilder)localObject1).append(" mimetype=");
      localObject2 = getMimeType();
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    ((StringBuilder)localObject1).append(" }");
    localObject1 = ((StringBuilder)localObject1).toString();
    Intrinsics.OooO0o0(localObject1, "sb.toString()");
    return localObject1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavDeepLinkRequest
 * JD-Core Version:    0.7.0.1
 */
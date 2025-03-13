package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.Preconditions;
import java.util.List;

public final class FontRequest
{
  public final String OooO00o;
  public final String OooO0O0;
  public final String OooO0OO;
  public final List OooO0Oo;
  public final String OooO0o;
  public final int OooO0o0;
  
  public FontRequest(String paramString1, String paramString2, String paramString3, List paramList)
  {
    String str = (String)Preconditions.OooO0oo(paramString1);
    this.OooO00o = str;
    str = (String)Preconditions.OooO0oo(paramString2);
    this.OooO0O0 = str;
    str = (String)Preconditions.OooO0oo(paramString3);
    this.OooO0OO = str;
    paramList = (List)Preconditions.OooO0oo(paramList);
    this.OooO0Oo = paramList;
    this.OooO0o0 = 0;
    paramString1 = OooO00o(paramString1, paramString2, paramString3);
    this.OooO0o = paramString1;
  }
  
  public final String OooO00o(String paramString1, String paramString2, String paramString3)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(paramString1);
    paramString1 = "-";
    localStringBuilder.append(paramString1);
    localStringBuilder.append(paramString2);
    localStringBuilder.append(paramString1);
    localStringBuilder.append(paramString3);
    return localStringBuilder.toString();
  }
  
  public List getCertificates()
  {
    return this.OooO0Oo;
  }
  
  public int getCertificatesArrayResId()
  {
    return this.OooO0o0;
  }
  
  public String getId()
  {
    return this.OooO0o;
  }
  
  public String getIdentifier()
  {
    return this.OooO0o;
  }
  
  public String getProviderAuthority()
  {
    return this.OooO00o;
  }
  
  public String getProviderPackage()
  {
    return this.OooO0O0;
  }
  
  public String getQuery()
  {
    return this.OooO0OO;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("FontRequest {mProviderAuthority: ");
    String str1 = this.OooO00o;
    ((StringBuilder)localObject1).append(str1);
    ((StringBuilder)localObject1).append(", mProviderPackage: ");
    str1 = this.OooO0O0;
    ((StringBuilder)localObject1).append(str1);
    ((StringBuilder)localObject1).append(", mQuery: ");
    str1 = this.OooO0OO;
    ((StringBuilder)localObject1).append(str1);
    ((StringBuilder)localObject1).append(", mCertificates:");
    localObject1 = ((StringBuilder)localObject1).toString();
    localStringBuilder.append((String)localObject1);
    localObject1 = null;
    int i = 0;
    str1 = null;
    for (;;)
    {
      Object localObject2 = this.OooO0Oo;
      int j = ((List)localObject2).size();
      if (i >= j) {
        break;
      }
      localStringBuilder.append(" [");
      localObject2 = (List)this.OooO0Oo.get(i);
      int k = 0;
      for (;;)
      {
        int m = ((List)localObject2).size();
        if (k >= m) {
          break;
        }
        localStringBuilder.append(" \"");
        String str2 = Base64.encodeToString((byte[])((List)localObject2).get(k), 0);
        localStringBuilder.append(str2);
        str2 = "\"";
        localStringBuilder.append(str2);
        k += 1;
      }
      localObject2 = " ]";
      localStringBuilder.append((String)localObject2);
      i += 1;
    }
    localStringBuilder.append("}");
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("mCertificatesArray: ");
    i = this.OooO0o0;
    ((StringBuilder)localObject1).append(i);
    localObject1 = ((StringBuilder)localObject1).toString();
    localStringBuilder.append((String)localObject1);
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.FontRequest
 * JD-Core Version:    0.7.0.1
 */
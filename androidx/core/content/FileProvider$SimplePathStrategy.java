package androidx.core.content;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class FileProvider$SimplePathStrategy
  implements FileProvider.PathStrategy
{
  public final String OooO00o;
  public final HashMap OooO0O0;
  
  public FileProvider$SimplePathStrategy(String paramString)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooO0O0 = localHashMap;
    this.OooO00o = paramString;
  }
  
  public File OooO00o(Uri paramUri)
  {
    Object localObject1 = paramUri.getEncodedPath();
    int i = 1;
    int j = ((String)localObject1).indexOf('/', i);
    String str = Uri.decode(((String)localObject1).substring(i, j));
    j += i;
    localObject1 = Uri.decode(((String)localObject1).substring(j));
    Object localObject2 = (File)this.OooO0O0.get(str);
    if (localObject2 != null)
    {
      paramUri = new java/io/File;
      paramUri.<init>((File)localObject2, (String)localObject1);
      try
      {
        paramUri = paramUri.getCanonicalFile();
        localObject1 = paramUri.getPath();
        localObject2 = ((File)localObject2).getPath();
        boolean bool = ((String)localObject1).startsWith((String)localObject2);
        if (bool) {
          return paramUri;
        }
        paramUri = new java/lang/SecurityException;
        paramUri.<init>("Resolved path jumped beyond configured root");
        throw paramUri;
      }
      catch (IOException localIOException)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("Failed to resolve canonical path for ");
        ((StringBuilder)localObject2).append(paramUri);
        paramUri = ((StringBuilder)localObject2).toString();
        ((IllegalArgumentException)localObject1).<init>(paramUri);
        throw ((Throwable)localObject1);
      }
    }
    localObject1 = new java/lang/IllegalArgumentException;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("Unable to find configured root for ");
    ((StringBuilder)localObject2).append(paramUri);
    paramUri = ((StringBuilder)localObject2).toString();
    ((IllegalArgumentException)localObject1).<init>(paramUri);
    throw ((Throwable)localObject1);
  }
  
  public Uri OooO0O0(File paramFile)
  {
    try
    {
      paramFile = paramFile.getCanonicalPath();
      localObject1 = this.OooO0O0.entrySet().iterator();
      localObject2 = null;
      Object localObject3;
      for (;;)
      {
        boolean bool1 = ((Iterator)localObject1).hasNext();
        if (!bool1) {
          break;
        }
        localObject3 = (Map.Entry)((Iterator)localObject1).next();
        String str1 = ((File)((Map.Entry)localObject3).getValue()).getPath();
        boolean bool2 = paramFile.startsWith(str1);
        if (bool2) {
          if (localObject2 != null)
          {
            int j = str1.length();
            String str2 = ((File)((Map.Entry)localObject2).getValue()).getPath();
            int i = str2.length();
            if (j <= i) {}
          }
          else
          {
            localObject2 = localObject3;
          }
        }
      }
      if (localObject2 != null)
      {
        localObject1 = ((File)((Map.Entry)localObject2).getValue()).getPath();
        localObject3 = "/";
        boolean bool3 = ((String)localObject1).endsWith((String)localObject3);
        int k = ((String)localObject1).length();
        if (!bool3) {
          k += 1;
        }
        paramFile = paramFile.substring(k);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = Uri.encode((String)((Map.Entry)localObject2).getKey());
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append('/');
        paramFile = Uri.encode(paramFile, (String)localObject3);
        ((StringBuilder)localObject1).append(paramFile);
        paramFile = ((StringBuilder)localObject1).toString();
        localObject1 = new android/net/Uri$Builder;
        ((Uri.Builder)localObject1).<init>();
        localObject1 = ((Uri.Builder)localObject1).scheme("content");
        localObject2 = this.OooO00o;
        return ((Uri.Builder)localObject1).authority((String)localObject2).encodedPath(paramFile).build();
      }
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("Failed to find configured root that contains ");
      ((StringBuilder)localObject2).append(paramFile);
      paramFile = ((StringBuilder)localObject2).toString();
      ((IllegalArgumentException)localObject1).<init>(paramFile);
      throw ((Throwable)localObject1);
    }
    catch (IOException localIOException)
    {
      Object localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("Failed to resolve canonical path for ");
      ((StringBuilder)localObject2).append(paramFile);
      paramFile = ((StringBuilder)localObject2).toString();
      ((IllegalArgumentException)localObject1).<init>(paramFile);
      throw ((Throwable)localObject1);
    }
  }
  
  public void OooO0OO(String paramString, File paramFile)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (!bool) {
      try
      {
        paramFile = paramFile.getCanonicalFile();
        this.OooO0O0.put(paramString, paramFile);
        return;
      }
      catch (IOException paramString)
      {
        IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Failed to resolve canonical path for ");
        localStringBuilder.append(paramFile);
        paramFile = localStringBuilder.toString();
        localIllegalArgumentException.<init>(paramFile, paramString);
        throw localIllegalArgumentException;
      }
    }
    paramString = new java/lang/IllegalArgumentException;
    paramString.<init>("Name must not be empty");
    throw paramString;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.FileProvider.SimplePathStrategy
 * JD-Core Version:    0.7.0.1
 */
package androidx.documentfile.provider;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;

class RawDocumentFile
  extends DocumentFile
{
  public File OooO0O0;
  
  public static String OooO00o(String paramString)
  {
    int i = paramString.lastIndexOf('.');
    if (i >= 0)
    {
      i += 1;
      paramString = paramString.substring(i).toLowerCase();
      MimeTypeMap localMimeTypeMap = MimeTypeMap.getSingleton();
      paramString = localMimeTypeMap.getMimeTypeFromExtension(paramString);
      if (paramString != null) {
        return paramString;
      }
    }
    return "application/octet-stream";
  }
  
  public String getName()
  {
    return this.OooO0O0.getName();
  }
  
  public String getType()
  {
    File localFile = this.OooO0O0;
    boolean bool = localFile.isDirectory();
    if (bool) {
      return null;
    }
    return OooO00o(this.OooO0O0.getName());
  }
  
  public Uri getUri()
  {
    return Uri.fromFile(this.OooO0O0);
  }
  
  public boolean isDirectory()
  {
    return this.OooO0O0.isDirectory();
  }
  
  public boolean isFile()
  {
    return this.OooO0O0.isFile();
  }
  
  public boolean isVirtual()
  {
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.documentfile.provider.RawDocumentFile
 * JD-Core Version:    0.7.0.1
 */
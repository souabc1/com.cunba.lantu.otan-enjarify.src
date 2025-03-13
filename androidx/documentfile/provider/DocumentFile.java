package androidx.documentfile.provider;

import android.net.Uri;

public abstract class DocumentFile
{
  public final DocumentFile OooO00o;
  
  public abstract String getName();
  
  public DocumentFile getParentFile()
  {
    return this.OooO00o;
  }
  
  public abstract String getType();
  
  public abstract Uri getUri();
  
  public abstract boolean isDirectory();
  
  public abstract boolean isFile();
  
  public abstract boolean isVirtual();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.documentfile.provider.DocumentFile
 * JD-Core Version:    0.7.0.1
 */
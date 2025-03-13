package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;

class SingleDocumentFile
  extends DocumentFile
{
  public Context OooO0O0;
  public Uri OooO0OO;
  
  public String getName()
  {
    Context localContext = this.OooO0O0;
    Uri localUri = this.OooO0OO;
    return DocumentsContractApi19.OooO0OO(localContext, localUri);
  }
  
  public String getType()
  {
    Context localContext = this.OooO0O0;
    Uri localUri = this.OooO0OO;
    return DocumentsContractApi19.OooO0o0(localContext, localUri);
  }
  
  public Uri getUri()
  {
    return this.OooO0OO;
  }
  
  public boolean isDirectory()
  {
    Context localContext = this.OooO0O0;
    Uri localUri = this.OooO0OO;
    return DocumentsContractApi19.OooO0o(localContext, localUri);
  }
  
  public boolean isFile()
  {
    Context localContext = this.OooO0O0;
    Uri localUri = this.OooO0OO;
    return DocumentsContractApi19.OooO0oO(localContext, localUri);
  }
  
  public boolean isVirtual()
  {
    Context localContext = this.OooO0O0;
    Uri localUri = this.OooO0OO;
    return DocumentsContractApi19.OooO0oo(localContext, localUri);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.documentfile.provider.SingleDocumentFile
 * JD-Core Version:    0.7.0.1
 */
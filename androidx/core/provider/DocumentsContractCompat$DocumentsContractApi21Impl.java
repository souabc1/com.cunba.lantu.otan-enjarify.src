package androidx.core.provider;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.DocumentsContract;

class DocumentsContractCompat$DocumentsContractApi21Impl
{
  public static Uri OooO00o(String paramString1, String paramString2)
  {
    return DocumentsContract.buildChildDocumentsUri(paramString1, paramString2);
  }
  
  public static Uri OooO0O0(Uri paramUri, String paramString)
  {
    return DocumentsContract.buildChildDocumentsUriUsingTree(paramUri, paramString);
  }
  
  public static Uri OooO0OO(Uri paramUri, String paramString)
  {
    return DocumentsContract.buildDocumentUriUsingTree(paramUri, paramString);
  }
  
  public static Uri OooO0Oo(String paramString1, String paramString2)
  {
    return DocumentsContract.buildTreeDocumentUri(paramString1, paramString2);
  }
  
  public static String OooO0o(Uri paramUri)
  {
    return DocumentsContract.getTreeDocumentId(paramUri);
  }
  
  public static Uri OooO0o0(ContentResolver paramContentResolver, Uri paramUri, String paramString1, String paramString2)
  {
    return DocumentsContract.createDocument(paramContentResolver, paramUri, paramString1, paramString2);
  }
  
  public static Uri OooO0oO(ContentResolver paramContentResolver, Uri paramUri, String paramString)
  {
    return DocumentsContract.renameDocument(paramContentResolver, paramUri, paramString);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.DocumentsContractCompat.DocumentsContractApi21Impl
 * JD-Core Version:    0.7.0.1
 */
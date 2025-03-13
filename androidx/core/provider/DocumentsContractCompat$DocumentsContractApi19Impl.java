package androidx.core.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

class DocumentsContractCompat$DocumentsContractApi19Impl
{
  public static Uri OooO00o(String paramString1, String paramString2)
  {
    return DocumentsContract.buildDocumentUri(paramString1, paramString2);
  }
  
  public static boolean OooO0O0(ContentResolver paramContentResolver, Uri paramUri)
  {
    return DocumentsContract.deleteDocument(paramContentResolver, paramUri);
  }
  
  public static String OooO0OO(Uri paramUri)
  {
    return DocumentsContract.getDocumentId(paramUri);
  }
  
  public static boolean OooO0Oo(Context paramContext, Uri paramUri)
  {
    return DocumentsContract.isDocumentUri(paramContext, paramUri);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.DocumentsContractCompat.DocumentsContractApi19Impl
 * JD-Core Version:    0.7.0.1
 */
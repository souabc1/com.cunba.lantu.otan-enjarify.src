package androidx.core.provider;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.DocumentsContract;

class DocumentsContractCompat$DocumentsContractApi24Impl
{
  public static boolean OooO00o(Uri paramUri)
  {
    return DocumentsContract.isTreeUri(paramUri);
  }
  
  public static boolean OooO0O0(ContentResolver paramContentResolver, Uri paramUri1, Uri paramUri2)
  {
    return DocumentsContract.removeDocument(paramContentResolver, paramUri1, paramUri2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.DocumentsContractCompat.DocumentsContractApi24Impl
 * JD-Core Version:    0.7.0.1
 */
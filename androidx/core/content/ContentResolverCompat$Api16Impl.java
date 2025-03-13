package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;

class ContentResolverCompat$Api16Impl
{
  public static Cursor OooO00o(ContentResolver paramContentResolver, Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, CancellationSignal paramCancellationSignal)
  {
    return paramContentResolver.query(paramUri, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2, paramCancellationSignal);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.ContentResolverCompat.Api16Impl
 * JD-Core Version:    0.7.0.1
 */
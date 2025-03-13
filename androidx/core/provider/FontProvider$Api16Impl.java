package androidx.core.provider;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;

class FontProvider$Api16Impl
{
  public static Cursor OooO00o(ContentResolver paramContentResolver, Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, Object paramObject)
  {
    Object localObject = paramObject;
    localObject = (CancellationSignal)paramObject;
    return paramContentResolver.query(paramUri, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2, (CancellationSignal)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.FontProvider.Api16Impl
 * JD-Core Version:    0.7.0.1
 */
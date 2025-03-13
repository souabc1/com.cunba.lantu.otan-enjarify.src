package androidx.core.graphics;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;

class TypefaceCompatUtil$Api19Impl
{
  public static ParcelFileDescriptor OooO00o(ContentResolver paramContentResolver, Uri paramUri, String paramString, CancellationSignal paramCancellationSignal)
  {
    return paramContentResolver.openFileDescriptor(paramUri, paramString, paramCancellationSignal);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.TypefaceCompatUtil.Api19Impl
 * JD-Core Version:    0.7.0.1
 */
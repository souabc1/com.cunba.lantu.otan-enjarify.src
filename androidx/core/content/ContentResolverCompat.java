package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

public final class ContentResolverCompat
{
  public static Cursor OooO00o(ContentResolver paramContentResolver, Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, androidx.core.os.CancellationSignal paramCancellationSignal)
  {
    if (paramCancellationSignal != null) {
      try
      {
        paramCancellationSignal = paramCancellationSignal.getCancellationSignalObject();
      }
      catch (Exception paramContentResolver)
      {
        break label47;
      }
    } else {
      paramCancellationSignal = null;
    }
    Object localObject = paramCancellationSignal;
    localObject = (android.os.CancellationSignal)paramCancellationSignal;
    return ContentResolverCompat.Api16Impl.OooO00o(paramContentResolver, paramUri, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2, (android.os.CancellationSignal)localObject);
    label47:
    boolean bool = paramContentResolver instanceof android.os.OperationCanceledException;
    if (bool)
    {
      paramContentResolver = new androidx/core/os/OperationCanceledException;
      paramContentResolver.<init>();
      throw paramContentResolver;
    }
    throw paramContentResolver;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.ContentResolverCompat
 * JD-Core Version:    0.7.0.1
 */
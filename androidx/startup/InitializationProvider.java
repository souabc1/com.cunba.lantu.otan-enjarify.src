package androidx.startup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public class InitializationProvider
  extends ContentProvider
{
  public final int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    paramUri = new java/lang/IllegalStateException;
    paramUri.<init>("Not allowed.");
    throw paramUri;
  }
  
  public final String getType(Uri paramUri)
  {
    paramUri = new java/lang/IllegalStateException;
    paramUri.<init>("Not allowed.");
    throw paramUri;
  }
  
  public final Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    paramUri = new java/lang/IllegalStateException;
    paramUri.<init>("Not allowed.");
    throw paramUri;
  }
  
  public final boolean onCreate()
  {
    Object localObject = getContext();
    if (localObject != null)
    {
      Context localContext = ((Context)localObject).getApplicationContext();
      if (localContext != null)
      {
        localObject = AppInitializer.OooO0o0((Context)localObject);
        ((AppInitializer)localObject).OooO00o();
      }
      return true;
    }
    localObject = new androidx/startup/StartupException;
    ((StartupException)localObject).<init>("Context cannot be null");
    throw ((Throwable)localObject);
  }
  
  public final Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    paramUri = new java/lang/IllegalStateException;
    paramUri.<init>("Not allowed.");
    throw paramUri;
  }
  
  public final int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    paramUri = new java/lang/IllegalStateException;
    paramUri.<init>("Not allowed.");
    throw paramUri;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.startup.InitializationProvider
 * JD-Core Version:    0.7.0.1
 */
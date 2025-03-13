package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider
  extends ContentProvider
{
  private static final String ATTR_NAME = "name";
  private static final String ATTR_PATH = "path";
  private static final String[] COLUMNS = { "_display_name", "_size" };
  private static final File DEVICE_ROOT;
  private static final String DISPLAYNAME_FIELD = "displayName";
  private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
  private static final String TAG_CACHE_PATH = "cache-path";
  private static final String TAG_EXTERNAL = "external-path";
  private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
  private static final String TAG_EXTERNAL_FILES = "external-files-path";
  private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
  private static final String TAG_FILES_PATH = "files-path";
  private static final String TAG_ROOT_PATH = "root-path";
  private static final HashMap sCache;
  private int mResourceId = 0;
  private FileProvider.PathStrategy mStrategy;
  
  static
  {
    Object localObject = new java/io/File;
    ((File)localObject).<init>("/");
    DEVICE_ROOT = (File)localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    sCache = (HashMap)localObject;
  }
  
  public static File OooO00o(File paramFile, String... paramVarArgs)
  {
    int i = paramVarArgs.length;
    int j = 0;
    while (j < i)
    {
      String str = paramVarArgs[j];
      if (str != null)
      {
        File localFile = new java/io/File;
        localFile.<init>(paramFile, str);
        paramFile = localFile;
      }
      j += 1;
    }
    return paramFile;
  }
  
  public static Object[] OooO0O0(Object[] paramArrayOfObject, int paramInt)
  {
    Object[] arrayOfObject = new Object[paramInt];
    System.arraycopy(paramArrayOfObject, 0, arrayOfObject, 0, paramInt);
    return arrayOfObject;
  }
  
  public static String[] OooO0OO(String[] paramArrayOfString, int paramInt)
  {
    String[] arrayOfString = new String[paramInt];
    System.arraycopy(paramArrayOfString, 0, arrayOfString, 0, paramInt);
    return arrayOfString;
  }
  
  public static FileProvider.PathStrategy OooO0Oo(Context paramContext, String paramString, int paramInt)
  {
    synchronized (sCache)
    {
      Object localObject = ???.get(paramString);
      localObject = (FileProvider.PathStrategy)localObject;
      if (localObject == null) {
        try
        {
          localObject = OooO0o(paramContext, paramString, paramInt);
          ???.put(paramString, localObject);
        }
        catch (XmlPullParserException paramContext)
        {
          paramString = new java/lang/IllegalArgumentException;
          str = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data";
          paramString.<init>(str, paramContext);
          throw paramString;
        }
        catch (IOException paramContext)
        {
          paramString = new java/lang/IllegalArgumentException;
          String str = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data";
          paramString.<init>(str, paramContext);
          throw paramString;
        }
      }
      return localObject;
    }
  }
  
  public static FileProvider.PathStrategy OooO0o(Context paramContext, String paramString, int paramInt)
  {
    FileProvider.SimplePathStrategy localSimplePathStrategy = new androidx/core/content/FileProvider$SimplePathStrategy;
    localSimplePathStrategy.<init>(paramString);
    Object localObject1 = paramContext.getPackageManager();
    int i = 128;
    localObject1 = ((PackageManager)localObject1).resolveContentProvider(paramString, i);
    paramString = getFileProviderPathsMetaData(paramContext, paramString, (ProviderInfo)localObject1, paramInt);
    for (;;)
    {
      paramInt = paramString.next();
      int j = 1;
      if (paramInt == j) {
        break;
      }
      j = 2;
      if (paramInt == j)
      {
        Object localObject2 = paramString.getName();
        i = 0;
        File localFile = null;
        localObject1 = paramString.getAttributeValue(null, "name");
        String str1 = paramString.getAttributeValue(null, "path");
        String str2 = "root-path";
        boolean bool1 = str2.equals(localObject2);
        if (bool1)
        {
          localFile = DEVICE_ROOT;
        }
        else
        {
          str2 = "files-path";
          bool1 = str2.equals(localObject2);
          if (bool1)
          {
            localFile = paramContext.getFilesDir();
          }
          else
          {
            str2 = "cache-path";
            bool1 = str2.equals(localObject2);
            if (bool1)
            {
              localFile = paramContext.getCacheDir();
            }
            else
            {
              str2 = "external-path";
              bool1 = str2.equals(localObject2);
              if (bool1)
              {
                localFile = Environment.getExternalStorageDirectory();
              }
              else
              {
                str2 = "external-files-path";
                bool1 = str2.equals(localObject2);
                if (bool1)
                {
                  localObject2 = ContextCompat.OooO0oO(paramContext, null);
                  int k = localObject2.length;
                  if (k > 0) {
                    localFile = localObject2[0];
                  }
                }
                else
                {
                  str2 = "external-cache-path";
                  boolean bool2 = str2.equals(localObject2);
                  int m;
                  if (bool2)
                  {
                    localObject2 = ContextCompat.OooO0o(paramContext);
                    m = localObject2.length;
                    if (m > 0) {
                      localFile = localObject2[0];
                    }
                  }
                  else
                  {
                    str2 = "external-media-path";
                    paramInt = str2.equals(localObject2);
                    if (paramInt != 0)
                    {
                      localObject2 = FileProvider.Api21Impl.OooO00o(paramContext);
                      m = localObject2.length;
                      if (m > 0) {
                        localFile = localObject2[0];
                      }
                    }
                  }
                }
              }
            }
          }
        }
        if (localFile != null)
        {
          localObject2 = new String[] { str1 };
          localObject2 = OooO00o(localFile, (String[])localObject2);
          localSimplePathStrategy.OooO0OO((String)localObject1, (File)localObject2);
        }
      }
    }
    return localSimplePathStrategy;
  }
  
  public static int OooO0o0(String paramString)
  {
    Object localObject = "r";
    boolean bool = ((String)localObject).equals(paramString);
    int i;
    if (bool)
    {
      i = 268435456;
    }
    else
    {
      localObject = "w";
      bool = ((String)localObject).equals(paramString);
      if (!bool)
      {
        localObject = "wt";
        bool = ((String)localObject).equals(paramString);
        if (!bool)
        {
          localObject = "wa";
          bool = ((String)localObject).equals(paramString);
          if (bool) {
            return 704643072;
          }
          localObject = "rw";
          bool = ((String)localObject).equals(paramString);
          if (bool) {
            return 939524096;
          }
          localObject = "rwt";
          bool = ((String)localObject).equals(paramString);
          if (bool) {
            return 1006632960;
          }
          localObject = new java/lang/IllegalArgumentException;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append("Invalid mode: ");
          localStringBuilder.append(paramString);
          paramString = localStringBuilder.toString();
          ((IllegalArgumentException)localObject).<init>(paramString);
          throw ((Throwable)localObject);
        }
      }
      i = 738197504;
    }
    return i;
  }
  
  public static XmlResourceParser getFileProviderPathsMetaData(Context paramContext, String paramString, ProviderInfo paramProviderInfo, int paramInt)
  {
    if (paramProviderInfo != null)
    {
      paramString = paramProviderInfo.metaData;
      String str = "android.support.FILE_PROVIDER_PATHS";
      if ((paramString == null) && (paramInt != 0))
      {
        paramString = new android/os/Bundle;
        int i = 1;
        paramString.<init>(i);
        paramProviderInfo.metaData = paramString;
        paramString.putInt(str, paramInt);
      }
      paramContext = paramContext.getPackageManager();
      paramContext = paramProviderInfo.loadXmlMetaData(paramContext, str);
      if (paramContext != null) {
        return paramContext;
      }
      paramContext = new java/lang/IllegalArgumentException;
      paramContext.<init>("Missing android.support.FILE_PROVIDER_PATHS meta-data");
      throw paramContext;
    }
    paramContext = new java/lang/IllegalArgumentException;
    paramProviderInfo = new java/lang/StringBuilder;
    paramProviderInfo.<init>();
    paramProviderInfo.append("Couldn't find meta-data for provider with authority ");
    paramProviderInfo.append(paramString);
    paramString = paramProviderInfo.toString();
    paramContext.<init>(paramString);
    throw paramContext;
  }
  
  public static Uri getUriForFile(Context paramContext, String paramString, File paramFile)
  {
    return OooO0Oo(paramContext, paramString, 0).OooO0O0(paramFile);
  }
  
  public static Uri getUriForFile(Context paramContext, String paramString1, File paramFile, String paramString2)
  {
    return getUriForFile(paramContext, paramString1, paramFile).buildUpon().appendQueryParameter("displayName", paramString2).build();
  }
  
  public void attachInfo(Context paramContext, ProviderInfo paramProviderInfo)
  {
    super.attachInfo(paramContext, paramProviderInfo);
    boolean bool = paramProviderInfo.exported;
    if (!bool)
    {
      bool = paramProviderInfo.grantUriPermissions;
      if (bool)
      {
        paramProviderInfo = paramProviderInfo.authority.split(";");
        bool = false;
        paramProviderInfo = paramProviderInfo[0];
        synchronized (sCache)
        {
          ???.remove(paramProviderInfo);
          int i = this.mResourceId;
          paramContext = OooO0Oo(paramContext, paramProviderInfo, i);
          this.mStrategy = paramContext;
          return;
        }
      }
      paramContext = new java/lang/SecurityException;
      paramContext.<init>("Provider must grant uri permissions");
      throw paramContext;
    }
    paramContext = new java/lang/SecurityException;
    paramContext.<init>("Provider must not be exported");
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return this.mStrategy.OooO00o(paramUri).delete();
  }
  
  public String getType(Uri paramUri)
  {
    paramUri = this.mStrategy.OooO00o(paramUri);
    Object localObject = paramUri.getName();
    int i = 46;
    int j = ((String)localObject).lastIndexOf(i);
    if (j >= 0)
    {
      paramUri = paramUri.getName();
      j += 1;
      paramUri = paramUri.substring(j);
      localObject = MimeTypeMap.getSingleton();
      paramUri = ((MimeTypeMap)localObject).getMimeTypeFromExtension(paramUri);
      if (paramUri != null) {
        return paramUri;
      }
    }
    return "application/octet-stream";
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    paramUri = new java/lang/UnsupportedOperationException;
    paramUri.<init>("No external inserts");
    throw paramUri;
  }
  
  public boolean onCreate()
  {
    return true;
  }
  
  public ParcelFileDescriptor openFile(Uri paramUri, String paramString)
  {
    paramUri = this.mStrategy.OooO00o(paramUri);
    int i = OooO0o0(paramString);
    return ParcelFileDescriptor.open(paramUri, i);
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    paramString1 = this.mStrategy.OooO00o(paramUri);
    paramArrayOfString2 = "displayName";
    paramUri = paramUri.getQueryParameter(paramArrayOfString2);
    if (paramArrayOfString1 == null) {
      paramArrayOfString1 = COLUMNS;
    }
    int i = paramArrayOfString1.length;
    paramArrayOfString2 = new String[i];
    int j = paramArrayOfString1.length;
    paramString2 = new Object[j];
    int k = paramArrayOfString1.length;
    int m = 0;
    int n = 0;
    while (m < k)
    {
      String str = paramArrayOfString1[m];
      Object localObject = "_display_name";
      boolean bool1 = ((String)localObject).equals(str);
      int i2;
      if (bool1)
      {
        paramArrayOfString2[n] = localObject;
        int i1 = n + 1;
        if (paramUri == null) {
          localObject = paramString1.getName();
        } else {
          localObject = paramUri;
        }
        paramString2[n] = localObject;
      }
      else
      {
        localObject = "_size";
        boolean bool2 = ((String)localObject).equals(str);
        if (!bool2) {
          break label187;
        }
        paramArrayOfString2[n] = localObject;
        i2 = n + 1;
        long l = paramString1.length();
        localObject = Long.valueOf(l);
        paramString2[n] = localObject;
      }
      n = i2;
      label187:
      m += 1;
    }
    paramUri = OooO0OO(paramArrayOfString2, n);
    paramArrayOfString1 = OooO0O0(paramString2, n);
    paramString1 = new android/database/MatrixCursor;
    paramString1.<init>(paramUri, 1);
    paramString1.addRow(paramArrayOfString1);
    return paramString1;
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    paramUri = new java/lang/UnsupportedOperationException;
    paramUri.<init>("No external updates");
    throw paramUri;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.FileProvider
 * JD-Core Version:    0.7.0.1
 */
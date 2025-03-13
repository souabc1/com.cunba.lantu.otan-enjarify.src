package com.xuexiang.xhttp2.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.Closeable;
import java.io.File;
import java.io.OutputStream;
import m54207b69;
import okhttp3.MediaType;

public final class Utils
{
  public static final String OooO00o;
  public static final String OooO0O0;
  public static final String OooO0OO;
  public static final String OooO0Oo;
  public static final String OooO0o = getExtDCIMPath();
  public static final String OooO0o0;
  
  static
  {
    String str = getExtStoragePath();
    OooO00o = str;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(str);
    str = File.separator;
    localStringBuilder.append(str);
    str = localStringBuilder.toString();
    OooO0O0 = str;
    localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(str);
    str = m54207b69.F54207b69_11("jY18383F2E3A3543");
    localStringBuilder.append(str);
    OooO0OO = localStringBuilder.toString();
    OooO0Oo = getExtDownloadsPath();
    OooO0o0 = getExtPicturesPath();
  }
  
  private Utils()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("V64317575A5C16481D67614F4D6365506E675365296F682E2F30");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public static Uri OooO(String paramString1, String paramString2, MediaType paramMediaType)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = paramString2;
    arrayOfObject[2] = paramMediaType;
    return (Uri)m54207b69.F54207b69_09(1548, arrayOfObject);
  }
  
  public static Object OooO00o(Object paramObject, String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramObject;
    arrayOfObject[1] = paramString;
    return m54207b69.F54207b69_09(1549, arrayOfObject);
  }
  
  public static void OooO0O0(Closeable... paramVarArgs)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramVarArgs;
    m54207b69.F54207b69_00(1550, arrayOfObject);
  }
  
  public static String OooO0OO(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return (String)m54207b69.F54207b69_09(1551, arrayOfObject);
  }
  
  public static File OooO0Oo(Context paramContext, String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramContext;
    arrayOfObject[1] = paramString;
    return (File)m54207b69.F54207b69_09(1552, arrayOfObject);
  }
  
  public static Uri OooO0o(String paramString1, String paramString2, MediaType paramMediaType)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = paramString2;
    arrayOfObject[2] = paramMediaType;
    return (Uri)m54207b69.F54207b69_09(1553, arrayOfObject);
  }
  
  public static String OooO0o0(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return (String)m54207b69.F54207b69_09(1554, arrayOfObject);
  }
  
  public static String OooO0oO(String paramString1, String paramString2)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = paramString2;
    return (String)m54207b69.F54207b69_09(1555, arrayOfObject);
  }
  
  public static Uri OooO0oo(String paramString1, String paramString2, MediaType paramMediaType)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = paramString2;
    arrayOfObject[2] = paramMediaType;
    return (Uri)m54207b69.F54207b69_09(1556, arrayOfObject);
  }
  
  public static Uri OooOO0(String paramString1, String paramString2, MediaType paramMediaType)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = paramString2;
    arrayOfObject[2] = paramMediaType;
    return (Uri)m54207b69.F54207b69_09(1557, arrayOfObject);
  }
  
  public static String OooOO0O(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return (String)m54207b69.F54207b69_09(1558, arrayOfObject);
  }
  
  public static boolean OooOO0o(CharSequence paramCharSequence)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramCharSequence;
    return m54207b69.F54207b69_01(1559, arrayOfObject);
  }
  
  public static boolean OooOOO(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return m54207b69.F54207b69_01(1560, arrayOfObject);
  }
  
  public static boolean OooOOO0(Context paramContext)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramContext;
    return m54207b69.F54207b69_01(1561, arrayOfObject);
  }
  
  public static OutputStream OooOOOO(Uri paramUri)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramUri;
    return (OutputStream)m54207b69.F54207b69_09(1562, arrayOfObject);
  }
  
  public static long OooOOOo(String paramString, long paramLong)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    Long localLong = Long.valueOf(paramLong);
    arrayOfObject[1] = localLong;
    return m54207b69.F54207b69_06(1563, arrayOfObject);
  }
  
  private static ContentResolver getContentResolver()
  {
    Object[] arrayOfObject = new Object[0];
    return (ContentResolver)m54207b69.F54207b69_09(1564, arrayOfObject);
  }
  
  private static String getDiskFilesDir()
  {
    Object[] arrayOfObject = new Object[0];
    return (String)m54207b69.F54207b69_09(1565, arrayOfObject);
  }
  
  public static String getExtDCIMPath()
  {
    Object[] arrayOfObject = new Object[0];
    return (String)m54207b69.F54207b69_09(1566, arrayOfObject);
  }
  
  public static String getExtDownloadsPath()
  {
    Object[] arrayOfObject = new Object[0];
    return (String)m54207b69.F54207b69_09(1567, arrayOfObject);
  }
  
  public static String getExtPicturesPath()
  {
    Object[] arrayOfObject = new Object[0];
    return (String)m54207b69.F54207b69_09(1568, arrayOfObject);
  }
  
  public static String getExtStoragePath()
  {
    Object[] arrayOfObject = new Object[0];
    return (String)m54207b69.F54207b69_09(1569, arrayOfObject);
  }
  
  private static boolean isSDCardExist()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(1570, arrayOfObject);
  }
  
  public static boolean isScopedStorageMode()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(1571, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.utils.Utils
 * JD-Core Version:    0.7.0.1
 */
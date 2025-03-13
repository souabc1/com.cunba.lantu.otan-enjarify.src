package com.xuexiang.xui;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import m54207b69;

public final class XUIInitProvider
  extends ContentProvider
{
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramUri;
    arrayOfObject[2] = paramString;
    arrayOfObject[3] = paramArrayOfString;
    return m54207b69.F54207b69_05(1873, arrayOfObject);
  }
  
  public String getType(Uri paramUri)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramUri;
    return (String)m54207b69.F54207b69_09(1874, arrayOfObject);
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramUri;
    arrayOfObject[2] = paramContentValues;
    return (Uri)m54207b69.F54207b69_09(1875, arrayOfObject);
  }
  
  public boolean onCreate()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(1876, arrayOfObject);
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramUri;
    arrayOfObject[2] = paramArrayOfString1;
    arrayOfObject[3] = paramString1;
    arrayOfObject[4] = paramArrayOfString2;
    arrayOfObject[5] = paramString2;
    return (Cursor)m54207b69.F54207b69_09(1877, arrayOfObject);
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramUri;
    arrayOfObject[2] = paramContentValues;
    arrayOfObject[3] = paramString;
    arrayOfObject[4] = paramArrayOfString;
    return m54207b69.F54207b69_05(1878, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.XUIInitProvider
 * JD-Core Version:    0.7.0.1
 */
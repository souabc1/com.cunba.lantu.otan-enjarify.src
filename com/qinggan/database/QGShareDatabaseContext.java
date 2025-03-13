package com.qinggan.database;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import m54207b69;

public class QGShareDatabaseContext
  extends ContextWrapper
{
  public static final String[] OooO0O0 = new String[0];
  public final Object OooO00o;
  
  public static final String getDatabaseRoot()
  {
    return m54207b69.F54207b69_11("UA6E32352B3B253B2B762E2A402C302E41347F");
  }
  
  private File getDatabasesDir()
  {
    synchronized (this.OooO00o)
    {
      String str1 = getPackageName();
      File localFile = new java/io/File;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = "UA6E32352B3B253B2B762E2A402C302E41347F";
      str2 = m54207b69.F54207b69_11(str2);
      localStringBuilder.append(str2);
      localStringBuilder.append(str1);
      str1 = localStringBuilder.toString();
      localFile.<init>(str1);
      return localFile;
    }
  }
  
  public final File OooO00o(String paramString)
  {
    String str1 = getPackageName();
    Object localObject = new java/io/File;
    String str2 = m54207b69.F54207b69_11("UA6E32352B3B253B2B762E2A402C302E41347F");
    ((File)localObject).<init>(str2);
    boolean bool1 = ((File)localObject).exists();
    if (!bool1) {
      ((File)localObject).mkdir();
    }
    bool1 = true;
    boolean bool2 = false;
    ((File)localObject).setReadable(bool1, false);
    ((File)localObject).setWritable(bool1, false);
    ((File)localObject).setExecutable(bool1, false);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append(str2);
    ((StringBuilder)localObject).append(str1);
    File localFile = new java/io/File;
    localObject = ((StringBuilder)localObject).toString();
    localFile.<init>((String)localObject);
    boolean bool3 = localFile.exists();
    if (!bool3) {
      localFile.mkdir();
    }
    localFile.setReadable(bool1, false);
    localFile.setWritable(bool1, false);
    localFile.setExecutable(bool1, false);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append(str2);
    ((StringBuilder)localObject).append(str1);
    ((StringBuilder)localObject).append("/");
    ((StringBuilder)localObject).append(paramString);
    paramString = new java/io/File;
    str1 = ((StringBuilder)localObject).toString();
    paramString.<init>(str1);
    boolean bool4 = paramString.exists();
    if (!bool4)
    {
      try
      {
        bool4 = paramString.createNewFile();
        try
        {
          paramString.setReadable(bool1, false);
          paramString.setWritable(bool1, false);
          paramString.setExecutable(bool1, false);
          bool1 = bool4;
        }
        catch (IOException localIOException1)
        {
          bool2 = bool4;
        }
        Log.getStackTraceString(localIOException2);
      }
      catch (IOException localIOException2) {}
      bool1 = bool2;
    }
    if (bool1) {
      return paramString;
    }
    return null;
  }
  
  public String[] databaseList()
  {
    try
    {
      Object localObject = getDatabasesDir();
      localObject = ((File)localObject).list();
      if (localObject == null) {
        localObject = OooO0O0;
      }
      return localObject;
    }
    catch (Exception localException)
    {
      Log.getStackTraceString(localException);
    }
    return OooO0O0;
  }
  
  public boolean deleteDatabase(String paramString)
  {
    return SQLiteDatabase.deleteDatabase(getDatabasePath(paramString));
  }
  
  public File getDatabasePath(String paramString)
  {
    return OooO00o(paramString);
  }
  
  public SQLiteDatabase openOrCreateDatabase(String paramString, int paramInt, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(paramString), paramCursorFactory);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.database.QGShareDatabaseContext
 * JD-Core Version:    0.7.0.1
 */
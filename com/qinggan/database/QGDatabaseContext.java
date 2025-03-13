package com.qinggan.database;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.os.Build;
import android.util.Log;
import com.qinggan.account.AccountConstantUtil;
import com.qinggan.account.AccountInfoBean;
import com.qinggan.account.AccountUserManager;
import java.io.File;
import java.io.IOException;
import m54207b69;

public class QGDatabaseContext
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
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = m54207b69.F54207b69_11("`I272D40113042132F45313533463927374D32");
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(paramString);
    localObject1 = new java/io/File;
    localObject2 = getFilesDir().getPath();
    ((File)localObject1).<init>((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    Object localObject3 = ((File)localObject1).getParent();
    ((StringBuilder)localObject2).append((String)localObject3);
    localObject3 = m54207b69.F54207b69_11("Bx571D1B0F1D1F1F122514");
    ((StringBuilder)localObject2).append((String)localObject3);
    localObject3 = new java/io/File;
    localObject2 = ((StringBuilder)localObject2).toString();
    ((File)localObject3).<init>((String)localObject2);
    boolean bool1 = ((File)localObject3).exists();
    if (!bool1) {
      ((File)localObject3).mkdirs();
    }
    localObject1 = ((File)localObject1).getParent();
    bool1 = AccountConstantUtil.OooO00o;
    if ((!bool1) && (localObject1 != null))
    {
      localObject2 = m54207b69.F54207b69_11("1]3E3332763039394142453D7E483A3B824039404752");
      bool1 = ((String)localObject1).contains((CharSequence)localObject2);
      if (!bool1)
      {
        localObject2 = m54207b69.F54207b69_11("aU363B3A7E284141393A3D45864032338A3745434F4E");
        boolean bool2 = ((String)localObject1).contains((CharSequence)localObject2);
        if (!bool2) {}
      }
      else
      {
        localObject1 = AccountUserManager.getInstance().OooO00o();
        localObject2 = m54207b69.F54207b69_11(">l020A1D2E0D1D2E14201618182B164A1C28155E18161F19592322321D291E27");
        Object localObject4;
        boolean bool3;
        if (localObject1 != null)
        {
          localObject4 = ((AccountInfoBean)localObject1).getName();
          if (localObject4 != null)
          {
            localObject4 = ((AccountInfoBean)localObject1).getName();
            str = "0";
            bool3 = ((String)localObject4).equals(str);
            if (bool3)
            {
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>();
              ((StringBuilder)localObject4).append((String)localObject2);
              localObject1 = ((AccountInfoBean)localObject1).getName();
              ((StringBuilder)localObject4).append((String)localObject1);
              break label380;
            }
          }
        }
        if (localObject1 != null)
        {
          localObject4 = ((AccountInfoBean)localObject1).getName();
          if (localObject4 != null)
          {
            localObject4 = ((AccountInfoBean)localObject1).getName();
            str = m54207b69.F54207b69_11("5o081B0C1F1F");
            bool3 = ((String)localObject4).equals(str);
            if (bool3)
            {
              localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>();
              ((StringBuilder)localObject4).append((String)localObject2);
              localObject1 = ((AccountInfoBean)localObject1).getName();
              ((StringBuilder)localObject4).append((String)localObject1);
              break label383;
            }
          }
        }
        if (localObject1 != null)
        {
          localObject2 = ((AccountInfoBean)localObject1).getAccountId();
          if (localObject2 != null)
          {
            str = ((AccountInfoBean)localObject1).getAccountId();
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject4 = m54207b69.F54207b69_11("+_313B2A1B3E3021453347474938471D4D3B489149454E46885053452C464F5B594D");
            ((StringBuilder)localObject2).append((String)localObject4);
            localObject1 = ((AccountInfoBean)localObject1).getAccountId();
            ((StringBuilder)localObject2).append((String)localObject1);
            break label383;
          }
        }
      }
    }
    label380:
    String str = null;
    label383:
    localObject1 = "/";
    localObject2 = new java/lang/StringBuilder;
    if (str != null)
    {
      ((StringBuilder)localObject2).<init>();
      localObject3 = ((File)localObject3).getPath();
      ((StringBuilder)localObject2).append((String)localObject3);
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(paramString);
      ((StringBuilder)localObject2).append(str);
    }
    else
    {
      ((StringBuilder)localObject2).<init>();
      localObject3 = ((File)localObject3).getPath();
      ((StringBuilder)localObject2).append((String)localObject3);
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(paramString);
    }
    paramString = ((StringBuilder)localObject2).toString();
    localObject1 = new java/io/File;
    ((File)localObject1).<init>(paramString);
    boolean bool4 = ((File)localObject1).exists();
    if (!bool4) {
      try
      {
        bool4 = ((File)localObject1).createNewFile();
      }
      catch (IOException localIOException)
      {
        Log.getStackTraceString(localIOException);
        bool4 = false;
        paramString = null;
      }
    } else {
      bool4 = true;
    }
    if (bool4) {
      return localObject1;
    }
    return null;
  }
  
  public final File OooO0O0(String paramString)
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
    boolean bool2 = localFile.exists();
    if (!bool2) {
      localFile.mkdir();
    }
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append(str2);
    ((StringBuilder)localObject).append(str1);
    ((StringBuilder)localObject).append("/");
    ((StringBuilder)localObject).append(paramString);
    paramString = new java/io/File;
    str1 = ((StringBuilder)localObject).toString();
    paramString.<init>(str1);
    boolean bool3 = paramString.exists();
    if (!bool3) {
      try
      {
        bool3 = paramString.createNewFile();
        bool1 = bool3;
      }
      catch (IOException localIOException)
      {
        Log.getStackTraceString(localIOException);
        bool1 = false;
      }
    }
    if (bool1) {
      return paramString;
    }
    return null;
  }
  
  public String[] databaseList()
  {
    Object localObject = Build.PRODUCT;
    String str = m54207b69.F54207b69_11("^}1E4F4F504D1A");
    boolean bool1 = str.equals(localObject);
    if (!bool1)
    {
      str = m54207b69.F54207b69_11("}K2D7C7A7E8028");
      boolean bool2 = str.equals(localObject);
      if (!bool2) {
        try
        {
          localObject = getDatabasesDir();
          localObject = ((File)localObject).list();
          if (localObject == null) {
            localObject = OooO0O0;
          }
          return localObject;
        }
        catch (Exception localException)
        {
          Log.getStackTraceString(localException);
          return OooO0O0;
        }
      }
    }
    return super.databaseList();
  }
  
  public boolean deleteDatabase(String paramString)
  {
    return SQLiteDatabase.deleteDatabase(getDatabasePath(paramString));
  }
  
  public File getDatabasePath(String paramString)
  {
    boolean bool = AccountConstantUtil.OooO00o;
    if (!bool) {
      return OooO00o(paramString);
    }
    return OooO0O0(paramString);
  }
  
  public SQLiteDatabase openOrCreateDatabase(String paramString, int paramInt, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(paramString), paramCursorFactory);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.database.QGDatabaseContext
 * JD-Core Version:    0.7.0.1
 */
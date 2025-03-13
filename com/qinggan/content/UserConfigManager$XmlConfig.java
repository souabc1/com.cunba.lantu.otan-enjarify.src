package com.qinggan.content;

import com.qinggan.os.FileUtils;
import com.qinggan.os.FileUtils.FileStatus;
import com.qinggan.util.QueuedWork;
import com.qinggan.util.XmlUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import m54207b69;
import org.xmlpull.v1.XmlPullParserException;

public final class UserConfigManager$XmlConfig
{
  public final Object OooO;
  public final File OooO00o;
  public int OooO0O0;
  public final File OooO0OO;
  public boolean OooO0Oo;
  public final int OooO0o;
  public Map OooO0o0;
  public long OooO0oO;
  public long OooO0oo;
  
  public static FileOutputStream OooO(File paramFile)
  {
    Object localObject;
    try
    {
      localObject = new java/io/FileOutputStream;
      ((FileOutputStream)localObject).<init>(paramFile);
    }
    catch (FileNotFoundException localFileNotFoundException1)
    {
      localObject = paramFile.getParentFile();
      boolean bool = ((File)localObject).mkdir();
      String str;
      if (!bool)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        str = m54207b69.F54207b69_11("ET173C233B343F79277C40303C412D3F83404E38444B35513D458D4C564291255B55475353284B5759594F5B65635E55A3626E6A64A8");
        ((StringBuilder)localObject).append(str);
        ((StringBuilder)localObject).append(paramFile);
        return null;
      }
      localObject = ((File)localObject).getPath();
      int i = 511;
      int j = -1;
      FileUtils.setPermissions((String)localObject, i, j, j);
      try
      {
        localObject = new java/io/FileOutputStream;
        ((FileOutputStream)localObject).<init>(paramFile);
      }
      catch (FileNotFoundException localFileNotFoundException2)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        str = m54207b69.F54207b69_11("hI0A273E28312C744471334537344A3A782A323A4E40422F52444846564844484B5A8A514349518F");
        ((StringBuilder)localObject).append(str);
        ((StringBuilder)localObject).append(paramFile);
        localObject = null;
      }
    }
    return localObject;
  }
  
  public final void OooOO0(UserConfigManager.XmlConfig.MemoryCommitResult paramMemoryCommitResult, Runnable paramRunnable)
  {
    UserConfigManager.XmlConfig.1 local1 = new com/qinggan/content/UserConfigManager$XmlConfig$1;
    local1.<init>(this, paramMemoryCommitResult, paramRunnable);
    int i = 1;
    int j;
    if (paramRunnable == null)
    {
      j = i;
    }
    else
    {
      j = 0;
      paramRunnable = null;
    }
    if (j != 0) {
      try
      {
        j = this.OooO0O0;
        if (j != i)
        {
          i = 0;
          paramMemoryCommitResult = null;
        }
        if (i != 0)
        {
          local1.run();
          return;
        }
      }
      finally {}
    }
    QueuedWork.OooO0OO().execute(local1);
  }
  
  public final void OooOO0O(UserConfigManager.XmlConfig.MemoryCommitResult paramMemoryCommitResult)
  {
    Object localObject1 = this.OooO0OO;
    boolean bool1 = ((File)localObject1).exists();
    boolean bool2 = true;
    Object localObject4;
    Object localObject5;
    if (bool1)
    {
      bool1 = paramMemoryCommitResult.OooO00o;
      if (!bool1)
      {
        paramMemoryCommitResult.setDiskWriteResult(bool2);
        return;
      }
      localObject1 = this.OooO00o;
      bool1 = ((File)localObject1).exists();
      if (!bool1)
      {
        localObject1 = this.OooO0OO;
        localObject4 = this.OooO00o;
        bool1 = ((File)localObject1).renameTo((File)localObject4);
        if (!bool1)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject5 = m54207b69.F54207b69_11("^$674C534B444F09570C5F4B5551564F13525E5A5418");
          ((StringBuilder)localObject1).append((String)localObject5);
          localObject5 = this.OooO0OO;
          ((StringBuilder)localObject1).append(localObject5);
          localObject5 = m54207b69.F54207b69_11("mG67342A6A292B2A333A40712C3A383076");
          ((StringBuilder)localObject1).append((String)localObject5);
          localObject5 = this.OooO00o;
          ((StringBuilder)localObject1).append(localObject5);
          paramMemoryCommitResult.setDiskWriteResult(false);
        }
      }
      else
      {
        localObject1 = this.OooO0OO;
        ((File)localObject1).delete();
      }
    }
    try
    {
      localObject1 = this.OooO0OO;
      localObject1 = OooO((File)localObject1);
      if (localObject1 == null)
      {
        paramMemoryCommitResult.setDiskWriteResult(false);
        return;
      }
      localObject4 = paramMemoryCommitResult.OooO0O0;
      XmlUtils.OooO0Oo((Map)localObject4, (OutputStream)localObject1);
      FileUtils.OooO00o((FileOutputStream)localObject1);
      ((FileOutputStream)localObject1).close();
      localObject1 = this.OooO0OO;
      localObject1 = ((File)localObject1).getPath();
      int i = this.OooO0o;
      UserConfigManager.OooO00o((String)localObject1, i, 0);
      localObject1 = new com/qinggan/os/FileUtils$FileStatus;
      ((FileUtils.FileStatus)localObject1).<init>();
      localObject4 = this.OooO0OO;
      localObject4 = ((File)localObject4).getPath();
      boolean bool3 = UserConfigManager.OooO0O0((String)localObject4, (FileUtils.FileStatus)localObject1);
      if (bool3) {
        try
        {
          long l = ((FileUtils.FileStatus)localObject1).OooO00o;
          this.OooO0oo = l;
          l = ((FileUtils.FileStatus)localObject1).OooO0O0;
          this.OooO0oO = l;
        }
        finally {}
      }
      localObject3 = this.OooO00o;
      ((File)localObject3).delete();
      paramMemoryCommitResult.setDiskWriteResult(bool2);
      return;
    }
    catch (XmlPullParserException|IOException localXmlPullParserException)
    {
      Object localObject3 = this.OooO0OO;
      bool1 = ((File)localObject3).exists();
      if (bool1)
      {
        localObject3 = this.OooO0OO;
        bool1 = ((File)localObject3).delete();
        if (!bool1)
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject5 = m54207b69.F54207b69_11("Z)6A475E48514C146411534F575454176B691A6B5B6F72565F5D5E6A1F7A785E7C7D6D692C73656B7331");
          ((StringBuilder)localObject3).append((String)localObject5);
          localObject5 = this.OooO0OO;
          ((StringBuilder)localObject3).append(localObject5);
        }
      }
      paramMemoryCommitResult.setDiskWriteResult(false);
    }
  }
  
  public Map getAll()
  {
    try
    {
      HashMap localHashMap = new java/util/HashMap;
      Map localMap = this.OooO0o0;
      localHashMap.<init>(localMap);
      return localHashMap;
    }
    finally {}
  }
  
  public boolean isLoaded()
  {
    try
    {
      boolean bool = this.OooO0Oo;
      return bool;
    }
    finally {}
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.content.UserConfigManager.XmlConfig
 * JD-Core Version:    0.7.0.1
 */
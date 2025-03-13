package com.qinggan.content;

import android.content.SharedPreferences.Editor;
import com.qinggan.util.QueuedWork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public final class UserConfigManager$XmlConfig$EditorImpl
  implements SharedPreferences.Editor
{
  public boolean OooO00o;
  public final Map OooO0O0;
  
  public final UserConfigManager.XmlConfig.MemoryCommitResult OooO00o()
  {
    UserConfigManager.XmlConfig.MemoryCommitResult localMemoryCommitResult = new com/qinggan/content/UserConfigManager$XmlConfig$MemoryCommitResult;
    localMemoryCommitResult.<init>(null);
    synchronized (this.OooO0OO)
    {
      Object localObject3 = this.OooO0OO;
      int i = UserConfigManager.XmlConfig.OooO0O0((UserConfigManager.XmlConfig)localObject3);
      Object localObject4;
      if (i > 0)
      {
        localObject3 = this.OooO0OO;
        HashMap localHashMap = new java/util/HashMap;
        localObject4 = this.OooO0OO;
        localObject4 = UserConfigManager.XmlConfig.OooO0o0((UserConfigManager.XmlConfig)localObject4);
        localHashMap.<init>((Map)localObject4);
        UserConfigManager.XmlConfig.OooO0o((UserConfigManager.XmlConfig)localObject3, localHashMap);
      }
      localObject3 = this.OooO0OO;
      localObject3 = UserConfigManager.XmlConfig.OooO0o0((UserConfigManager.XmlConfig)localObject3);
      localMemoryCommitResult.OooO0O0 = ((Map)localObject3);
      localObject3 = this.OooO0OO;
      UserConfigManager.XmlConfig.OooO0OO((UserConfigManager.XmlConfig)localObject3);
      try
      {
        boolean bool1 = this.OooO00o;
        boolean bool2 = true;
        if (bool1)
        {
          localObject3 = this.OooO0OO;
          localObject3 = UserConfigManager.XmlConfig.OooO0o0((UserConfigManager.XmlConfig)localObject3);
          bool1 = ((Map)localObject3).isEmpty();
          if (!bool1)
          {
            localMemoryCommitResult.OooO00o = bool2;
            localObject3 = this.OooO0OO;
            localObject3 = UserConfigManager.XmlConfig.OooO0o0((UserConfigManager.XmlConfig)localObject3);
            ((Map)localObject3).clear();
          }
          bool1 = false;
          localObject3 = null;
          this.OooO00o = false;
        }
        localObject3 = this.OooO0O0;
        localObject3 = ((Map)localObject3).entrySet();
        localObject3 = ((Set)localObject3).iterator();
        for (;;)
        {
          boolean bool3 = ((Iterator)localObject3).hasNext();
          if (!bool3) {
            break;
          }
          localObject4 = ((Iterator)localObject3).next();
          localObject4 = (Map.Entry)localObject4;
          Object localObject5 = ((Map.Entry)localObject4).getKey();
          localObject5 = (String)localObject5;
          localObject4 = ((Map.Entry)localObject4).getValue();
          if (localObject4 == this)
          {
            localObject4 = this.OooO0OO;
            localObject4 = UserConfigManager.XmlConfig.OooO0o0((UserConfigManager.XmlConfig)localObject4);
            bool3 = ((Map)localObject4).containsKey(localObject5);
            if (!bool3) {
              continue;
            }
            localObject4 = this.OooO0OO;
            localObject4 = UserConfigManager.XmlConfig.OooO0o0((UserConfigManager.XmlConfig)localObject4);
            ((Map)localObject4).remove(localObject5);
          }
          else
          {
            Object localObject6 = this.OooO0OO;
            localObject6 = UserConfigManager.XmlConfig.OooO0o0((UserConfigManager.XmlConfig)localObject6);
            boolean bool4 = ((Map)localObject6).containsKey(localObject5);
            if (bool4)
            {
              localObject6 = this.OooO0OO;
              localObject6 = UserConfigManager.XmlConfig.OooO0o0((UserConfigManager.XmlConfig)localObject6);
              localObject6 = ((Map)localObject6).get(localObject5);
              if (localObject6 != null)
              {
                bool4 = localObject6.equals(localObject4);
                if (bool4) {
                  continue;
                }
              }
            }
            localObject6 = this.OooO0OO;
            localObject6 = UserConfigManager.XmlConfig.OooO0o0((UserConfigManager.XmlConfig)localObject6);
            ((Map)localObject6).put(localObject5, localObject4);
          }
          localMemoryCommitResult.OooO00o = bool2;
        }
        localObject3 = this.OooO0O0;
        ((Map)localObject3).clear();
        return localMemoryCommitResult;
      }
      finally {}
    }
  }
  
  public void apply()
  {
    UserConfigManager.XmlConfig.MemoryCommitResult localMemoryCommitResult = OooO00o();
    UserConfigManager.XmlConfig.EditorImpl.1 local1 = new com/qinggan/content/UserConfigManager$XmlConfig$EditorImpl$1;
    local1.<init>(this, localMemoryCommitResult);
    QueuedWork.OooO00o(local1);
    UserConfigManager.XmlConfig.EditorImpl.2 local2 = new com/qinggan/content/UserConfigManager$XmlConfig$EditorImpl$2;
    local2.<init>(this, local1);
    UserConfigManager.XmlConfig.OooO00o(this.OooO0OO, localMemoryCommitResult, local2);
  }
  
  public SharedPreferences.Editor clear()
  {
    boolean bool = true;
    try
    {
      this.OooO00o = bool;
      return this;
    }
    finally {}
  }
  
  public boolean commit()
  {
    UserConfigManager.XmlConfig.MemoryCommitResult localMemoryCommitResult = OooO00o();
    Object localObject = this.OooO0OO;
    UserConfigManager.XmlConfig.OooO00o((UserConfigManager.XmlConfig)localObject, localMemoryCommitResult, null);
    try
    {
      localObject = localMemoryCommitResult.OooO0Oo;
      ((CountDownLatch)localObject).await();
      return localMemoryCommitResult.OooO0OO;
    }
    catch (InterruptedException localInterruptedException) {}
    return false;
  }
  
  public SharedPreferences.Editor putBoolean(String paramString, boolean paramBoolean)
  {
    try
    {
      Map localMap = this.OooO0O0;
      Boolean localBoolean = Boolean.valueOf(paramBoolean);
      localMap.put(paramString, localBoolean);
      return this;
    }
    finally {}
  }
  
  public SharedPreferences.Editor putFloat(String paramString, float paramFloat)
  {
    try
    {
      Map localMap = this.OooO0O0;
      Float localFloat = Float.valueOf(paramFloat);
      localMap.put(paramString, localFloat);
      return this;
    }
    finally {}
  }
  
  public SharedPreferences.Editor putInt(String paramString, int paramInt)
  {
    try
    {
      Map localMap = this.OooO0O0;
      Integer localInteger = Integer.valueOf(paramInt);
      localMap.put(paramString, localInteger);
      return this;
    }
    finally {}
  }
  
  public SharedPreferences.Editor putLong(String paramString, long paramLong)
  {
    try
    {
      Map localMap = this.OooO0O0;
      Long localLong = Long.valueOf(paramLong);
      localMap.put(paramString, localLong);
      return this;
    }
    finally {}
  }
  
  public SharedPreferences.Editor putString(String paramString1, String paramString2)
  {
    try
    {
      Map localMap = this.OooO0O0;
      localMap.put(paramString1, paramString2);
      return this;
    }
    finally {}
  }
  
  public SharedPreferences.Editor putStringSet(String paramString, Set paramSet)
  {
    return null;
  }
  
  public SharedPreferences.Editor remove(String paramString)
  {
    try
    {
      Map localMap = this.OooO0O0;
      localMap.put(paramString, this);
      return this;
    }
    finally {}
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.content.UserConfigManager.XmlConfig.EditorImpl
 * JD-Core Version:    0.7.0.1
 */
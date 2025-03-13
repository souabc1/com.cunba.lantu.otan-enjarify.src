package com.xuexiang.xpage.core;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.xuexiang.xpage.base.XPageFragment;
import com.xuexiang.xpage.logger.PageLog;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;
import m54207b69;

public class CorePageManager
{
  public static volatile CorePageManager OooO0O0;
  public Map OooO00o;
  
  private CorePageManager()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooO00o = localHashMap;
  }
  
  public static void OooO0O0(Closeable... paramVarArgs)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramVarArgs;
    m54207b69.F54207b69_00(1638, arrayOfObject);
  }
  
  public static CorePageManager getInstance()
  {
    Object[] arrayOfObject = new Object[0];
    return (CorePageManager)m54207b69.F54207b69_09(1645, arrayOfObject);
  }
  
  public final Bundle OooO00o(CorePage paramCorePage)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCorePage;
    return (Bundle)m54207b69.F54207b69_09(1637, arrayOfObject);
  }
  
  public void OooO0OO(Context paramContext)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramContext;
    m54207b69.F54207b69_00(1639, arrayOfObject);
  }
  
  public void OooO0Oo(Context paramContext, String paramString)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramContext;
    arrayOfObject[2] = paramString;
    m54207b69.F54207b69_00(1640, arrayOfObject);
  }
  
  public XPageFragment OooO0o(FragmentManager paramFragmentManager, String paramString, Bundle paramBundle, int[] paramArrayOfInt, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramFragmentManager;
    arrayOfObject[2] = paramString;
    arrayOfObject[3] = paramBundle;
    arrayOfObject[4] = paramArrayOfInt;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[5] = localBoolean;
    return (XPageFragment)m54207b69.F54207b69_09(1641, arrayOfObject);
  }
  
  public final XPageFragment OooO0o0(CorePage paramCorePage, String paramString, Bundle paramBundle)
  {
    boolean bool = CoreConfig.isOpenAtlas();
    if (bool)
    {
      localObject = CoreConfig.getBundleClassLoader();
      if (localObject == null)
      {
        PageLog.OooO00o(m54207b69.F54207b69_11("9&6957454B6B57504E5D0F4E5E544F585216765C5A696A80605F5B5D6F226C732568746C6D2B"));
        return null;
      }
      localObject = CoreConfig.getBundleClassLoader();
      String str = paramCorePage.getClazz();
      localObject = ((ClassLoader)localObject).loadClass(str);
    }
    else
    {
      localObject = Class.forName(paramCorePage.getClazz());
    }
    Object localObject = (XPageFragment)((Class)localObject).newInstance();
    paramCorePage = OooO00o(paramCorePage);
    if (paramBundle != null) {
      paramCorePage.putAll(paramBundle);
    }
    ((Fragment)localObject).setArguments(paramCorePage);
    ((XPageFragment)localObject).setPageName(paramString);
    return localObject;
  }
  
  public void OooO0oO(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    m54207b69.F54207b69_00(1643, arrayOfObject);
  }
  
  public final String OooO0oo(Context paramContext)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramContext;
    return (String)m54207b69.F54207b69_09(1644, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xpage.core.CorePageManager
 * JD-Core Version:    0.7.0.1
 */
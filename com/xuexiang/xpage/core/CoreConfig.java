package com.xuexiang.xpage.core;

import android.content.Context;
import java.util.List;
import m54207b69;

public class CoreConfig
{
  public static boolean OooO00o = false;
  public static ClassLoader OooO0O0;
  public static Context OooO0OO;
  
  public static void OooO00o(Context paramContext, String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramContext;
    arrayOfObject[1] = paramString;
    m54207b69.F54207b69_00(1622, arrayOfObject);
  }
  
  public static void OooO0O0(Context paramContext, List paramList)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramContext;
    arrayOfObject[1] = paramList;
    m54207b69.F54207b69_00(1623, arrayOfObject);
  }
  
  public static void OooO0OO()
  {
    Object[] arrayOfObject = new Object[0];
    m54207b69.F54207b69_00(1624, arrayOfObject);
  }
  
  public static ClassLoader getBundleClassLoader()
  {
    Object[] arrayOfObject = new Object[0];
    return (ClassLoader)m54207b69.F54207b69_09(1625, arrayOfObject);
  }
  
  public static Context getContext()
  {
    Object[] arrayOfObject = new Object[0];
    return (Context)m54207b69.F54207b69_09(1626, arrayOfObject);
  }
  
  public static boolean isOpenAtlas()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(1627, arrayOfObject);
  }
  
  public static void setBundleClassLoader(ClassLoader paramClassLoader)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramClassLoader;
    m54207b69.F54207b69_00(1628, arrayOfObject);
  }
  
  public static void setIsOpenAtlas(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[1];
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[0] = localBoolean;
    m54207b69.F54207b69_00(1629, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xpage.core.CoreConfig
 * JD-Core Version:    0.7.0.1
 */
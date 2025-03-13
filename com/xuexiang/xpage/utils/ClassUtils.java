package com.xuexiang.xpage.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import com.xuexiang.xpage.logger.PageLog;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import m54207b69;

public final class ClassUtils
{
  public static final String OooO00o;
  
  static
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11(">P334036381338373A403E");
    localStringBuilder.append(str);
    str = File.separator;
    localStringBuilder.append(str);
    str = m54207b69.F54207b69_11("ib11080310100B09172358101226141F");
    localStringBuilder.append(str);
    OooO00o = localStringBuilder.toString();
  }
  
  private ClassUtils()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("V64317575A5C16481D67614F4D6365506E675365296F682E2F30");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public static Set OooO00o(Context paramContext, String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramContext;
    arrayOfObject[1] = paramString;
    return (Set)m54207b69.F54207b69_09(1700, arrayOfObject);
  }
  
  public static SharedPreferences OooO0O0(Context paramContext)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramContext;
    return (SharedPreferences)m54207b69.F54207b69_09(1701, arrayOfObject);
  }
  
  public static List OooO0OO(Context paramContext)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramContext;
    return (List)m54207b69.F54207b69_09(1702, arrayOfObject);
  }
  
  public static List OooO0Oo(ApplicationInfo paramApplicationInfo)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = paramApplicationInfo.splitSourceDirs;
    String str1 = m54207b69.F54207b69_11("IA072F363229660E363A3E2A3A4120423E714346444543494C");
    if (localObject1 != null)
    {
      paramApplicationInfo = Arrays.asList((Object[])localObject1);
      localArrayList.addAll(paramApplicationInfo);
      PageLog.OooO00o(str1);
    }
    else
    {
      localObject1 = "a.4D424503534550634950540B664E4F516D115A5D1471715772605D661C9B6D79667E";
    }
    try
    {
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject1 = Class.forName((String)localObject1);
      Object localObject2 = "zQ36352718382E1D3F453D1F432F4140344E343A";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      boolean bool1 = true;
      Object localObject3 = new Class[bool1];
      String str2 = String.class;
      int i = 0;
      localObject3[0] = str2;
      localObject1 = ((Class)localObject1).getMethod((String)localObject2, (Class[])localObject3);
      localObject2 = new Object[bool1];
      paramApplicationInfo = paramApplicationInfo.packageName;
      localObject2[0] = paramApplicationInfo;
      boolean bool2 = false;
      paramApplicationInfo = null;
      paramApplicationInfo = ((Method)localObject1).invoke(null, (Object[])localObject2);
      paramApplicationInfo = (String)paramApplicationInfo;
      localObject1 = new java/io/File;
      ((File)localObject1).<init>(paramApplicationInfo);
      bool2 = ((File)localObject1).exists();
      if (bool2)
      {
        bool2 = ((File)localObject1).isDirectory();
        if (bool2)
        {
          paramApplicationInfo = ((File)localObject1).listFiles();
          int j = paramApplicationInfo.length;
          while (i < j)
          {
            localObject2 = paramApplicationInfo[i];
            if (localObject2 != null)
            {
              bool1 = ((File)localObject2).exists();
              if (bool1)
              {
                bool1 = ((File)localObject2).isFile();
                if (bool1)
                {
                  String str3 = ((File)localObject2).getName();
                  localObject3 = "A>105B5D49";
                  localObject3 = m54207b69.F54207b69_11((String)localObject3);
                  bool1 = str3.endsWith((String)localObject3);
                  if (bool1)
                  {
                    localObject2 = ((File)localObject2).getAbsolutePath();
                    localArrayList.add(localObject2);
                  }
                }
              }
            }
            i += 1;
          }
          PageLog.OooO00o(str1);
        }
      }
    }
    catch (Exception localException)
    {
      label277:
      break label277;
    }
    return localArrayList;
  }
  
  private static boolean isVMMultidexCapable()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(1704, arrayOfObject);
  }
  
  private static boolean isYunOS()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(1705, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xpage.utils.ClassUtils
 * JD-Core Version:    0.7.0.1
 */
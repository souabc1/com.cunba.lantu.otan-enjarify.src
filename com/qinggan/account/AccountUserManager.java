package com.qinggan.account;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.UserHandle;
import android.text.TextUtils;
import com.qinggan.os.SystemProperties;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import m54207b69;

public class AccountUserManager
{
  public static AccountUserManager OooO00o;
  
  public static boolean OooO0O0(Context paramContext, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    Object localObject1 = UserHandle.class;
    Object localObject2 = "OB0D160E0A14";
    try
    {
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      localObject2 = ((Class)localObject1).getDeclaredField((String)localObject2);
      boolean bool = true;
      ((AccessibleObject)localObject2).setAccessible(bool);
      Object localObject3 = null;
      localObject2 = ((Field)localObject2).get(null);
      localObject2 = (UserHandle)localObject2;
      localObject3 = paramContext.getClass();
      String str = "l(4A42484F7F52606549545774678A695C6A";
      str = m54207b69.F54207b69_11(str);
      int i = 4;
      Class[] arrayOfClass = new Class[i];
      Object localObject4 = Intent.class;
      arrayOfClass[0] = localObject4;
      localObject4 = ServiceConnection.class;
      arrayOfClass[bool] = localObject4;
      localObject4 = Integer.TYPE;
      int j = 2;
      arrayOfClass[j] = localObject4;
      int k = 3;
      arrayOfClass[k] = localObject1;
      localObject1 = ((Class)localObject3).getMethod(str, arrayOfClass);
      localObject3 = new Object[i];
      localObject3[0] = paramIntent;
      localObject3[bool] = paramServiceConnection;
      paramIntent = Integer.valueOf(paramInt);
      localObject3[j] = paramIntent;
      localObject3[k] = localObject2;
      paramContext = ((Method)localObject1).invoke(paramContext, (Object[])localObject3);
      if (paramContext != null) {
        return bool;
      }
      return false;
    }
    catch (Exception localException)
    {
      localException.toString();
    }
    return false;
  }
  
  public static String OooO0OO(String paramString)
  {
    Object localObject1 = System.out;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    Object localObject3 = m54207b69.F54207b69_11("4>4C5C615D7C51575A80605C66102B");
    ((StringBuilder)localObject2).append((String)localObject3);
    ((StringBuilder)localObject2).append(paramString);
    localObject2 = ((StringBuilder)localObject2).toString();
    ((PrintStream)localObject1).println((String)localObject2);
    localObject1 = new java/io/File;
    ((File)localObject1).<init>(paramString);
    boolean bool = ((File)localObject1).exists();
    localObject2 = "";
    if (!bool) {
      return localObject2;
    }
    try
    {
      paramString = new java/io/BufferedReader;
      localObject3 = new java/io/FileReader;
      ((FileReader)localObject3).<init>((File)localObject1);
      paramString.<init>((Reader)localObject3);
      localObject1 = new java/lang/StringBuffer;
      ((StringBuffer)localObject1).<init>();
      for (;;)
      {
        localObject3 = paramString.readLine();
        if (localObject3 == null) {
          break;
        }
        PrintStream localPrintStream = System.out;
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        String str = "YY2B3D3A4039353D436B82";
        str = m54207b69.F54207b69_11(str);
        ((StringBuilder)localObject4).append(str);
        ((StringBuilder)localObject4).append((String)localObject3);
        localObject4 = ((StringBuilder)localObject4).toString();
        localPrintStream.println((String)localObject4);
        ((StringBuffer)localObject1).append((String)localObject3);
      }
      paramString.close();
      return ((StringBuffer)localObject1).toString();
    }
    catch (IOException paramString) {}catch (FileNotFoundException paramString) {}
    paramString.printStackTrace();
    return localObject2;
  }
  
  public static AccountUserManager getInstance()
  {
    AccountUserManager localAccountUserManager = AccountUserManager.class;
    try
    {
      localAccountUserManager = OooO00o;
      if (localAccountUserManager == null)
      {
        localAccountUserManager = new com/qinggan/account/AccountUserManager;
        localAccountUserManager.<init>();
        OooO00o = localAccountUserManager;
      }
      localAccountUserManager = OooO00o;
      return localAccountUserManager;
    }
    finally {}
  }
  
  public static boolean isLoginDisableWakeup()
  {
    String str = SystemProperties.OooO00o(m54207b69.F54207b69_11("@i0A07064A1C050D151611115211131C0F17471F132E1D211C244F38231E293A38"));
    boolean bool = TextUtils.isEmpty(str);
    return !bool;
  }
  
  public static boolean isLogined()
  {
    String str = SystemProperties.OooO00o(m54207b69.F54207b69_11("'_3C313474323B373F40473B7C3639483C103D3D5141405052"));
    boolean bool = TextUtils.isEmpty(str);
    return !bool;
  }
  
  public AccountInfoBean OooO00o()
  {
    return getCurrentAccount();
  }
  
  public AccountInfoBean getCurrentAccount()
  {
    String str = OooO0OO(m54207b69.F54207b69_11("JA6E32352B3B253B2B762B383A333534417E46403D384484373A3B484F4B52264E474F"));
    boolean bool = TextUtils.isEmpty(str);
    if (bool) {
      str = m54207b69.F54207b69_11("5o081B0C1F1F");
    }
    AccountInfoBean localAccountInfoBean = new com/qinggan/account/AccountInfoBean;
    localAccountInfoBean.<init>(str);
    return localAccountInfoBean;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.account.AccountUserManager
 * JD-Core Version:    0.7.0.1
 */
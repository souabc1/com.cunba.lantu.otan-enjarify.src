package com.qinggan.os;

import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.lang.reflect.Method;
import java.util.regex.Pattern;
import m54207b69;

public class SystemProperties
{
  public static final Object OooO00o;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO00o = localObject;
  }
  
  public static String OooO(int paramInt)
  {
    synchronized (OooO00o)
    {
      String str = NvramNative.native_nvramread64(paramInt);
      return str;
    }
  }
  
  public static String OooO00o(String paramString)
  {
    Object localObject1 = "@[3A36412C3837457C3C317F132E353D4D461C3B473F533F464A5742";
    try
    {
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject1 = Class.forName((String)localObject1);
      Object localObject2 = "get";
      int i = 1;
      Class[] arrayOfClass = new Class[i];
      String str = String.class;
      arrayOfClass[0] = str;
      localObject2 = ((Class)localObject1).getDeclaredMethod((String)localObject2, arrayOfClass);
      paramString = new Object[] { paramString };
      paramString = ((Method)localObject2).invoke(localObject1, paramString);
      paramString = (String)paramString;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      paramString = null;
    }
    return paramString;
  }
  
  public static String OooO0O0(String paramString1, String paramString2)
  {
    Object localObject1 = String.class;
    Object localObject2 = "@[3A36412C3837457C3C317F132E353D4D461C3B473F533F464A5742";
    try
    {
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      localObject2 = Class.forName((String)localObject2);
      String str = "get";
      int i = 2;
      Class[] arrayOfClass = new Class[i];
      int j = 0;
      arrayOfClass[0] = localObject1;
      j = 1;
      arrayOfClass[j] = localObject1;
      localObject1 = ((Class)localObject2).getDeclaredMethod(str, arrayOfClass);
      paramString1 = new Object[] { paramString1, paramString2 };
      paramString1 = ((Method)localObject1).invoke(localObject2, paramString1);
      paramString1 = (String)paramString1;
      paramString2 = paramString1;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
    return paramString2;
  }
  
  public static boolean OooO0OO(String paramString, boolean paramBoolean)
  {
    Object localObject1 = "@[3A36412C3837457C3C317F132E353D4D461C3B473F533F464A5742";
    try
    {
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject1 = Class.forName((String)localObject1);
      Object localObject2 = ".^393C2C1F353638424739";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      int i = 2;
      Class[] arrayOfClass = new Class[i];
      Object localObject3 = String.class;
      arrayOfClass[0] = localObject3;
      localObject3 = Boolean.TYPE;
      int j = 1;
      arrayOfClass[j] = localObject3;
      localObject2 = ((Class)localObject1).getDeclaredMethod((String)localObject2, arrayOfClass);
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = paramString;
      paramString = Boolean.valueOf(paramBoolean);
      arrayOfObject[j] = paramString;
      paramString = ((Method)localObject2).invoke(localObject1, arrayOfObject);
      paramString = (Boolean)paramString;
      paramBoolean = paramString.booleanValue();
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return paramBoolean;
  }
  
  public static int OooO0Oo(String paramString, int paramInt)
  {
    Object localObject1 = "@[3A36412C3837457C3C317F132E353D4D461C3B473F533F464A5742";
    try
    {
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject1 = Class.forName((String)localObject1);
      Object localObject2 = "%>595C4C7A544F";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      int i = 2;
      Class[] arrayOfClass = new Class[i];
      Object localObject3 = String.class;
      arrayOfClass[0] = localObject3;
      localObject3 = Integer.TYPE;
      int j = 1;
      arrayOfClass[j] = localObject3;
      localObject2 = ((Class)localObject1).getDeclaredMethod((String)localObject2, arrayOfClass);
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = paramString;
      paramString = Integer.valueOf(paramInt);
      arrayOfObject[j] = paramString;
      paramString = ((Method)localObject2).invoke(localObject1, arrayOfObject);
      paramString = (Integer)paramString;
      paramInt = paramString.intValue();
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return paramInt;
  }
  
  public static boolean OooO0o(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("^g0E152C0B091311094F50");
    localStringBuilder.append(str);
    localStringBuilder.append(paramString);
    localStringBuilder = null;
    if (paramString == null) {
      return false;
    }
    int i = paramString.length();
    int j = 11;
    if (i != j) {
      return false;
    }
    return Pattern.matches(m54207b69.F54207b69_11("`R0C0A65120D66846D867088708A771D1872907D223D80458D"), paramString);
  }
  
  public static long OooO0o0(String paramString, long paramLong)
  {
    Object localObject1 = "@[3A36412C3837457C3C317F132E353D4D461C3B473F533F464A5742";
    try
    {
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject1 = Class.forName((String)localObject1);
      Object localObject2 = "SA2625371032342C";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      int i = 2;
      Class[] arrayOfClass = new Class[i];
      Object localObject3 = String.class;
      arrayOfClass[0] = localObject3;
      localObject3 = Long.TYPE;
      int j = 1;
      arrayOfClass[j] = localObject3;
      localObject2 = ((Class)localObject1).getDeclaredMethod((String)localObject2, arrayOfClass);
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = paramString;
      paramString = Long.valueOf(paramLong);
      arrayOfObject[j] = paramString;
      paramString = ((Method)localObject2).invoke(localObject1, arrayOfObject);
      paramString = (Long)paramString;
      paramLong = paramString.longValue();
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return paramLong;
  }
  
  public static boolean OooO0oO(String paramString)
  {
    if (paramString == null) {
      return false;
    }
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("Rs051B1F56231B231B0F245D");
    localStringBuilder.append(str);
    int i = paramString.length();
    localStringBuilder.append(i);
    int j = paramString.length();
    i = 17;
    if (j != i) {
      return false;
    }
    paramString = paramString.toUpperCase().toCharArray();
    j = paramString.length;
    i = 0;
    str = null;
    while (i < j)
    {
      int k = paramString[i];
      int m = 65;
      if (k >= m)
      {
        m = 90;
        if (k < m)
        {
          m = 73;
          if (k != m)
          {
            m = 79;
            if (k != m)
            {
              m = 81;
              if (k != m) {
                break label161;
              }
            }
          }
        }
      }
      m = 48;
      if (k >= m)
      {
        m = 57;
        if (k <= m)
        {
          label161:
          i += 1;
          continue;
        }
      }
      return false;
    }
    return true;
  }
  
  public static String OooO0oo(int paramInt)
  {
    synchronized (OooO00o)
    {
      String str = NvramNative.native_nvramread(paramInt);
      return str;
    }
  }
  
  public static int OooOO0(String paramString, int paramInt)
  {
    synchronized (OooO00o)
    {
      int i = NvramNative.native_nvramwrite(paramString, paramInt);
      return i;
    }
  }
  
  public static String OooOO0O(int paramInt)
  {
    String str1 = m54207b69.F54207b69_11("J=5E0F0F0F115A");
    String str2 = Build.PRODUCT;
    boolean bool = str1.equals(str2);
    if (bool) {
      return OooO(paramInt);
    }
    return OooO0oo(paramInt);
  }
  
  public static int OooOO0o(String paramString, int paramInt)
  {
    return OooOO0(paramString, paramInt);
  }
  
  public static void OooOOO0(String paramString1, String paramString2)
  {
    Object localObject1 = String.class;
    Object localObject2 = "@[3A36412C3837457C3C317F132E353D4D461C3B473F533F464A5742";
    try
    {
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      localObject2 = Class.forName((String)localObject2);
      String str = "set";
      int i = 2;
      Class[] arrayOfClass = new Class[i];
      int j = 0;
      arrayOfClass[0] = localObject1;
      j = 1;
      arrayOfClass[j] = localObject1;
      localObject1 = ((Class)localObject2).getDeclaredMethod(str, arrayOfClass);
      paramString1 = new Object[] { paramString1, paramString2 };
      paramString2 = null;
      ((Method)localObject1).invoke(null, paramString1);
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
  }
  
  public static String getActivationCode()
  {
    return OooOO0O(18);
  }
  
  public static String getActivationFlag()
  {
    int i = 8;
    String str1 = OooOO0O(i);
    File localFile = new java/io/File;
    String str2 = m54207b69.F54207b69_11("AW78243C2A7C363C433A1145433C4B47");
    localFile.<init>(str2);
    boolean bool = localFile.exists();
    if (bool) {
      str1 = m54207b69.F54207b69_11("/541484253");
    }
    return str1;
  }
  
  public static String getEolReverse()
  {
    return OooOO0O(82);
  }
  
  public static String getExternalSN()
  {
    return OooOO0O(80);
  }
  
  public static int getFakeLoginCount()
  {
    int i = 24;
    String str = OooOO0O(i);
    try
    {
      i = Integer.parseInt(str);
    }
    catch (Exception localException)
    {
      i = 0;
      str = null;
    }
    return i;
  }
  
  public static String getHardwareVersionNum()
  {
    return OooOO0O(2);
  }
  
  public static String getHubSim()
  {
    int i = 36;
    String str1 = OooOO0O(i);
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str2 = m54207b69.F54207b69_11(">a060517442D1909391015594C46");
    localStringBuilder.append(str2);
    localStringBuilder.append(str1);
    str2 = "]";
    localStringBuilder.append(str2);
    boolean bool = OooO0o(str1);
    if (bool) {
      return str1;
    }
    return null;
  }
  
  public static String getIMEI()
  {
    return OooOO0O(6);
  }
  
  public static String getIMSICode()
  {
    return OooOO0O(5);
  }
  
  public static String getLocalCarNum()
  {
    return OooO00o(m54207b69.F54207b69_11("]{0B1F0B0B160D155C1F1D222523312629193527212A"));
  }
  
  public static String getLoginAccount()
  {
    int i = 22;
    String str1 = OooOO0O(i);
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str2 = m54207b69.F54207b69_11("p*4D50600D4F4E4F4C674D680F167E");
    localStringBuilder.append(str2);
    localStringBuilder.append(str1);
    str2 = "]";
    localStringBuilder.append(str2);
    boolean bool = OooO0o(str1);
    if (bool) {
      return str1;
    }
    return null;
  }
  
  public static String getLoginFlag()
  {
    int i = 17;
    String str1 = OooOO0O(i);
    File localFile = new java/io/File;
    String str2 = m54207b69.F54207b69_11("AW78243C2A7C363C433A1145433C4B47");
    localFile.<init>(str2);
    boolean bool = localFile.exists();
    if (bool) {
      str1 = m54207b69.F54207b69_11("/541484253");
    }
    return str1;
  }
  
  public static String getMotherBoardSN()
  {
    return OooOO0O(0);
  }
  
  public static String getProductSN()
  {
    return OooOO0O(1);
  }
  
  public static String getVehicleTypeSub()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("=[7B3D4032114339394040481A2E384C173E4A788E");
    localStringBuilder.append(str1);
    int i = 51;
    String str2 = OooOO0O(i);
    localStringBuilder.append(str2);
    return OooOO0O(i);
  }
  
  public static String getVinCode()
  {
    int i = 21;
    String str1 = OooOO0O(i);
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str2 = m54207b69.F54207b69_11("~x1F1E0E5B32161C421F25274D2F");
    localStringBuilder.append(str2);
    localStringBuilder.append(str1);
    str2 = "]";
    localStringBuilder.append(str2);
    boolean bool = OooO0oO(str1);
    if (bool) {
      return str1;
    }
    return null;
  }
  
  public static boolean isCarlifeUsage()
  {
    String str1 = OooO0O0(m54207b69.F54207b69_11(")?4D5113525155615164541B55586B6669"), "");
    String str2 = m54207b69.F54207b69_11("LX3B3A2C37354343");
    return str1.equals(str2);
  }
  
  public static boolean isDynaCanDsp()
  {
    String str1 = m54207b69.F54207b69_11("]A32322C72393D372B");
    String str2 = "0";
    str1 = OooO0O0(str1, str2);
    if (str1 != null)
    {
      str2 = "2";
      boolean bool = str1.equals(str2);
      if (bool) {
        return true;
      }
    }
    return false;
  }
  
  public static void setActivationFlag(String paramString)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = m54207b69.F54207b69_11("{R21382816352B412B3B2F454848214C424579");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(paramString);
    OooOO0o(paramString, 8);
    paramString = new java/lang/StringBuilder;
    paramString.<init>();
    localObject = m54207b69.F54207b69_11("hs14170935140C200C1A10242729422D21245A");
    paramString.append((String)localObject);
    localObject = getActivationFlag();
    paramString.append((String)localObject);
  }
  
  public static void setEolReverse(String paramString)
  {
    if (paramString != null)
    {
      boolean bool = paramString.isEmpty();
      if (!bool)
      {
        String str = getEolReverse();
        bool = paramString.equals(str);
        if (!bool)
        {
          int i = 82;
          OooOO0o(paramString, i);
        }
      }
    }
  }
  
  public static void setExternalSN(String paramString)
  {
    if (paramString != null)
    {
      boolean bool = paramString.isEmpty();
      if (!bool)
      {
        String str = getExternalSN();
        bool = paramString.equals(str);
        if (!bool)
        {
          int i = 80;
          OooOO0o(paramString, i);
        }
      }
    }
  }
  
  public static void setHubSim(String paramString)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = m54207b69.F54207b69_11("_W24332522263A0A454280");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(paramString);
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool) {
      return;
    }
    localObject = getHubSim();
    bool = paramString.equals(localObject);
    if (bool) {
      return;
    }
    OooOO0o(paramString, 36);
  }
  
  public static void setIMSICode(String paramString)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = m54207b69.F54207b69_11("HL3F2A3A0805240B162B313381");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(paramString);
    OooOO0o(paramString, 5);
    paramString = new java/lang/StringBuilder;
    paramString.<init>();
    localObject = m54207b69.F54207b69_11("z4475242807D6C837E63595B1F");
    paramString.append((String)localObject);
    localObject = getIMSICode();
    paramString.append((String)localObject);
  }
  
  public static void setLocalCarNum(String paramString)
  {
    OooOOO0(m54207b69.F54207b69_11("]{0B1F0B0B160D155C1F1D222523312629193527212A"), paramString);
  }
  
  public static void setLoginAccount(String paramString)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("");
    localObject = ((StringBuilder)localObject).toString();
    String str = getLoginAccount();
    boolean bool = ((String)localObject).equals(str);
    if (bool) {
      return;
    }
    OooOO0o(paramString, 22);
  }
  
  public static void setLoginFlag(String paramString)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = m54207b69.F54207b69_11("Ao1C0B1D26040D0C08310C18135B");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(paramString);
    OooOO0o(paramString, 17);
    paramString = new java/lang/StringBuilder;
    paramString.<init>();
    localObject = m54207b69.F54207b69_11("~f0104142D0D06150F2813110C52");
    paramString.append((String)localObject);
    localObject = getLoginFlag();
    paramString.append((String)localObject);
  }
  
  public static void setMotherBoardSN(String paramString)
  {
    if (paramString != null)
    {
      boolean bool = paramString.isEmpty();
      if (!bool)
      {
        String str = getMotherBoardSN();
        bool = paramString.equals(str);
        if (!bool)
        {
          bool = false;
          str = null;
          OooOO0o(paramString, 0);
        }
      }
    }
  }
  
  public static void setProductSN(String paramString)
  {
    if (paramString != null)
    {
      int i = paramString.isEmpty();
      if (i == 0)
      {
        String str = getProductSN();
        i = paramString.equals(str);
        if (i == 0)
        {
          i = 1;
          OooOO0o(paramString, i);
        }
      }
    }
  }
  
  public static void setVinCode(String paramString)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("");
    localObject = ((StringBuilder)localObject).toString();
    String str = getVinCode();
    boolean bool = ((String)localObject).equals(str);
    if (bool) {
      return;
    }
    OooOO0o(paramString, 21);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.os.SystemProperties
 * JD-Core Version:    0.7.0.1
 */
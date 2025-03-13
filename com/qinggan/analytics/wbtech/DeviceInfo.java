package com.qinggan.analytics.wbtech;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import m54207b69;

class DeviceInfo
{
  public static String OooO00o;
  public static BluetoothAdapter OooO0O0;
  public static Context OooO0OO;
  public static Location OooO0Oo;
  public static SensorManager OooO0o;
  public static LocationManager OooO0o0;
  public static TelephonyManager OooO0oO;
  
  public static String OooO00o(String paramString)
  {
    if (paramString != null)
    {
      int i = paramString.length();
      if (i != 0)
      {
        i = paramString.charAt(0);
        boolean bool = Character.isUpperCase(i);
        if (bool) {
          return paramString;
        }
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        char c = Character.toUpperCase(i);
        localStringBuilder.append(c);
        paramString = paramString.substring(1);
        localStringBuilder.append(paramString);
        return localStringBuilder.toString();
      }
    }
    return "";
  }
  
  public static void OooO0O0(Context paramContext)
  {
    OooO0OO = paramContext;
    Object localObject = "mC332C2E302A";
    try
    {
      localObject = m54207b69.F54207b69_11((String)localObject);
      localObject = paramContext.getSystemService((String)localObject);
      localObject = (TelephonyManager)localObject;
      OooO0oO = (TelephonyManager)localObject;
      localObject = "O&4A4A474A56544F4F";
      localObject = m54207b69.F54207b69_11((String)localObject);
      paramContext = paramContext.getSystemService((String)localObject);
      paramContext = (LocationManager)paramContext;
      OooO0o0 = paramContext;
      paramContext = BluetoothAdapter.getDefaultAdapter();
      OooO0O0 = paramContext;
    }
    catch (Exception paramContext)
    {
      localObject = m54207b69.F54207b69_11("5J0E303E262D34092B342E");
      paramContext = paramContext.toString();
      CobubLog.OooO0OO((String)localObject, paramContext);
    }
    getLocation();
  }
  
  public static boolean getBluetoothAvailable()
  {
    BluetoothAdapter localBluetoothAdapter = OooO0O0;
    return localBluetoothAdapter != null;
  }
  
  public static String getDeviceIMEI()
  {
    String str1 = m54207b69.F54207b69_11("5J0E303E262D34092B342E");
    String str2 = "";
    try
    {
      Object localObject = OooO0OO;
      String str3 = "C2535D584361605C234A604A6A674E4F6A6D6D2E738B888C847A939797938A7F85938799";
      str3 = m54207b69.F54207b69_11(str3);
      boolean bool = CommonUtil.OooO00o((Context)localObject, str3);
      if (!bool)
      {
        localObject = "c_0D1B201E04141D1719230A17172B19298F404C40464B42434E494B9A48544E49535CA1605EA46462636365AA625E595FAF4F636E61656C724A776B7175776A6AB1687476B5";
        localObject = m54207b69.F54207b69_11((String)localObject);
        CobubLog.OooO0OO(str1, (String)localObject);
        return str2;
      }
      localObject = OooO0oO;
      str1 = ((TelephonyManager)localObject).getDeviceId();
      if (str1 != null) {
        str2 = str1;
      }
    }
    catch (Exception localException)
    {
      CobubLog.OooO0O0(str1, localException);
    }
    return str2;
  }
  
  public static String getDeviceId()
  {
    String str1 = OooO00o;
    boolean bool;
    if (str1 != null)
    {
      bool = str1.isEmpty();
      if (!bool) {
        return OooO00o;
      }
    }
    String str2;
    try
    {
      str1 = getDeviceIMEI();
      str3 = getIMSI();
      Object localObject = OooO0OO;
      localObject = CommonUtil.OooO0oO((Context)localObject);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append(str1);
      localStringBuilder.append(str3);
      localStringBuilder.append((String)localObject);
      str1 = localStringBuilder.toString();
      str1 = CommonUtil.OooOOOO(str1);
    }
    catch (Exception localException)
    {
      String str3 = m54207b69.F54207b69_11("5J0E303E262D34092B342E");
      CobubLog.OooO0O0(str3, localException);
      bool = false;
      str2 = null;
    }
    return str2;
  }
  
  public static String getDeviceName()
  {
    String str1 = "";
    try
    {
      String str2 = Build.MANUFACTURER;
      if (str2 == null) {
        str2 = str1;
      }
      String str3 = Build.MODEL;
      if (str3 == null) {
        str3 = str1;
      }
      boolean bool = str3.startsWith(str2);
      if (bool)
      {
        str2 = OooO00o(str3);
        return str2.trim();
      }
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      str2 = OooO00o(str2);
      localStringBuilder.append(str2);
      str2 = " ";
      localStringBuilder.append(str2);
      localStringBuilder.append(str3);
      str2 = localStringBuilder.toString();
      return str2.trim();
    }
    catch (Exception localException)
    {
      CobubLog.OooO0O0(m54207b69.F54207b69_11("5J0E303E262D34092B342E"), localException);
    }
    return str1;
  }
  
  public static String getDeviceProduct()
  {
    String str1 = Build.PRODUCT;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str2 = m54207b69.F54207b69_11("AJ2D30401133412930372342303A4C374D727489");
    ((StringBuilder)localObject).append(str2);
    ((StringBuilder)localObject).append(str1);
    str2 = m54207b69.F54207b69_11("5J0E303E262D34092B342E");
    localObject = ((StringBuilder)localObject).toString();
    CobubLog.OooO0Oo(str2, (String)localObject);
    if (str1 == null) {
      str1 = "";
    }
    return str1;
  }
  
  public static String getDeviceTime()
  {
    try
    {
      Date localDate = new java/util/Date;
      localDate.<init>();
      SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
      String str = "XY2021222378191A7B4546831C1D704243733B3C";
      str = m54207b69.F54207b69_11(str);
      Locale localLocale = Locale.US;
      localSimpleDateFormat.<init>(str, localLocale);
      return localSimpleDateFormat.format(localDate);
    }
    catch (Exception localException) {}
    return "";
  }
  
  public static String getGPSAvailable()
  {
    Location localLocation = OooO0Oo;
    if (localLocation == null) {
      return m54207b69.F54207b69_11("5%43454B5944");
    }
    return m54207b69.F54207b69_11("/541484253");
  }
  
  public static boolean getGravityAvailable()
  {
    boolean bool1 = false;
    try
    {
      boolean bool2 = isSimulator();
      if (bool2)
      {
        bool2 = false;
        localObject = null;
        OooO0o = null;
      }
      else
      {
        localObject = OooO0OO;
        str = "3L3F2A24422743";
        str = m54207b69.F54207b69_11(str);
        localObject = ((Context)localObject).getSystemService(str);
        localObject = (SensorManager)localObject;
        OooO0o = (SensorManager)localObject;
      }
      Object localObject = "5J0E303E262D34092B342E";
      localObject = m54207b69.F54207b69_11((String)localObject);
      String str = "/:5D6050804C60525A564C85576760646A6867712527";
      str = m54207b69.F54207b69_11(str);
      CobubLog.OooO0Oo((String)localObject, str);
      localObject = OooO0o;
      if (localObject != null) {
        bool1 = true;
      }
    }
    catch (Exception localException)
    {
      label82:
      break label82;
    }
    return bool1;
  }
  
  public static String getIMSI()
  {
    String str1 = m54207b69.F54207b69_11("5J0E303E262D34092B342E");
    String str2 = "";
    Object localObject1;
    try
    {
      Object localObject2 = OooO0OO;
      Object localObject3 = "C2535D584361605C234A604A6A674E4F6A6D6D2E738B888C847A939797938A7F85938799";
      localObject3 = m54207b69.F54207b69_11((String)localObject3);
      boolean bool = CommonUtil.OooO00o((Context)localObject2, (String)localObject3);
      if (!bool)
      {
        localObject2 = "c_0D1B201E04141D1719230A17172B19298F404C40464B42434E494B9A48544E49535CA1605EA46462636365AA625E595FAF4F636E61656C724A776B7175776A6AB1687476B5";
        localObject2 = m54207b69.F54207b69_11((String)localObject2);
        CobubLog.OooO0OO(str1, (String)localObject2);
        return str2;
      }
      localObject2 = OooO0oO;
      localObject2 = ((TelephonyManager)localObject2).getSubscriberId();
      try
      {
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str3 = "Z/484B5D6966816C0E0E1B";
        str3 = m54207b69.F54207b69_11(str3);
        ((StringBuilder)localObject3).append(str3);
        ((StringBuilder)localObject3).append((String)localObject2);
        localObject3 = ((StringBuilder)localObject3).toString();
        CobubLog.OooO0Oo(str1, (String)localObject3);
        if (localObject2 == null) {
          return str2;
        }
        return localObject2;
      }
      catch (Exception localException1)
      {
        Object localObject4 = localObject2;
        localObject2 = localException1;
        localObject1 = localObject4;
      }
      CobubLog.OooO0O0(str1, localException2);
    }
    catch (Exception localException2) {}
    return localObject1;
  }
  
  public static String getLanguage()
  {
    String str1 = Locale.getDefault().getLanguage();
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str2 = m54207b69.F54207b69_11("?w1013053E1A1E16091E191C6A6A57");
    ((StringBuilder)localObject).append(str2);
    ((StringBuilder)localObject).append(str1);
    str2 = m54207b69.F54207b69_11("5J0E303E262D34092B342E");
    localObject = ((StringBuilder)localObject).toString();
    CobubLog.OooO0Oo(str2, (String)localObject);
    if (str1 == null) {
      str1 = "";
    }
    return str1;
  }
  
  public static String getLatitude()
  {
    Location localLocation = OooO0Oo;
    if (localLocation == null) {
      return "";
    }
    return String.valueOf(localLocation.getLatitude());
  }
  
  private static void getLocation()
  {
    Object localObject1 = m54207b69.F54207b69_11("jh0F0E1E270B100F23091010");
    String str = m54207b69.F54207b69_11("5J0E303E262D34092B342E");
    CobubLog.OooO0Oo(str, (String)localObject1);
    try
    {
      localObject1 = OooO0o0;
      localObject1 = ((LocationManager)localObject1).getAllProviders();
      localObject1 = ((List)localObject1).iterator();
      Object localObject2;
      do
      {
        boolean bool = ((Iterator)localObject1).hasNext();
        if (!bool) {
          break;
        }
        localObject2 = ((Iterator)localObject1).next();
        localObject2 = (String)localObject2;
        LocationManager localLocationManager = OooO0o0;
        localObject2 = localLocationManager.getLastKnownLocation((String)localObject2);
        OooO0Oo = (Location)localObject2;
      } while (localObject2 == null);
    }
    catch (Exception localException)
    {
      localObject1 = localException.toString();
      CobubLog.OooO0OO(str, (String)localObject1);
    }
  }
  
  public static String getLongitude()
  {
    Location localLocation = OooO0Oo;
    if (localLocation == null) {
      return "";
    }
    return String.valueOf(localLocation.getLongitude());
  }
  
  public static String getMCCMNC()
  {
    Object localObject1 = "";
    try
    {
      Object localObject2 = OooO0oO;
      localObject2 = ((TelephonyManager)localObject2).getNetworkOperator();
      if (localObject2 != null) {
        localObject1 = localObject2;
      }
    }
    catch (Exception localException)
    {
      String str2 = m54207b69.F54207b69_11("5J0E303E262D34092B342E");
      String str1 = localException.toString();
      CobubLog.OooO0OO(str2, str1);
    }
    return localObject1;
  }
  
  public static String getNetworkTypeWIFI2G3G()
  {
    try
    {
      Object localObject1 = OooO0OO;
      Object localObject2 = "Jc000D0F100A051D111D132125";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      localObject1 = ((Context)localObject1).getSystemService((String)localObject2);
      localObject1 = (ConnectivityManager)localObject1;
      localObject2 = ((ConnectivityManager)localObject1).getActiveNetworkInfo();
      localObject2 = ((NetworkInfo)localObject2).getTypeName();
      Object localObject3 = Locale.US;
      localObject2 = ((String)localObject2).toLowerCase((Locale)localObject3);
      localObject3 = "aE322D252F";
      localObject3 = m54207b69.F54207b69_11((String)localObject3);
      boolean bool = ((String)localObject2).equals(localObject3);
      if (!bool)
      {
        localObject2 = null;
        localObject1 = ((ConnectivityManager)localObject1).getNetworkInfo(0);
        localObject2 = ((NetworkInfo)localObject1).getExtraInfo();
      }
      return localObject2;
    }
    catch (Exception localException) {}
    return "";
  }
  
  public static String getOsVersion()
  {
    String str1 = Build.VERSION.RELEASE;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str2 = m54207b69.F54207b69_11("5{1C1F11370C322410101B1E205F5F54");
    ((StringBuilder)localObject).append(str2);
    ((StringBuilder)localObject).append(str1);
    str2 = m54207b69.F54207b69_11("5J0E303E262D34092B342E");
    localObject = ((StringBuilder)localObject).toString();
    CobubLog.OooO0Oo(str2, (String)localObject);
    if (str1 == null) {
      str1 = "";
    }
    return str1;
  }
  
  public static int getPhoneType()
  {
    TelephonyManager localTelephonyManager = OooO0oO;
    if (localTelephonyManager == null) {
      return -1;
    }
    int i = localTelephonyManager.getPhoneType();
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = m54207b69.F54207b69_11("5J2D30401D262A2A36263C443A6E7085");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(i);
    str = m54207b69.F54207b69_11("5J0E303E262D34092B342E");
    localObject = ((StringBuilder)localObject).toString();
    CobubLog.OooO0Oo(str, (String)localObject);
    return i;
  }
  
  public static String getResolution()
  {
    DisplayMetrics localDisplayMetrics = new android/util/DisplayMetrics;
    localDisplayMetrics.<init>();
    Object localObject = OooO0OO;
    String str1 = m54207b69.F54207b69_11("LM3A25252C263F");
    ((WindowManager)((Context)localObject).getSystemService(str1)).getDefaultDisplay().getMetrics(localDisplayMetrics);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    str1 = m54207b69.F54207b69_11("F,4B4A5A814D64494761614F4E4E111320");
    ((StringBuilder)localObject).append(str1);
    int i = localDisplayMetrics.widthPixels;
    ((StringBuilder)localObject).append(i);
    str1 = "x";
    ((StringBuilder)localObject).append(str1);
    int j = localDisplayMetrics.heightPixels;
    ((StringBuilder)localObject).append(j);
    String str2 = m54207b69.F54207b69_11("5J0E303E262D34092B342E");
    localObject = ((StringBuilder)localObject).toString();
    CobubLog.OooO0Oo(str2, (String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    j = localDisplayMetrics.widthPixels;
    ((StringBuilder)localObject).append(j);
    ((StringBuilder)localObject).append(str1);
    int k = localDisplayMetrics.heightPixels;
    ((StringBuilder)localObject).append(k);
    return ((StringBuilder)localObject).toString();
  }
  
  private static String getSSN()
  {
    String str1 = m54207b69.F54207b69_11("5J0E303E262D34092B342E");
    String str2 = "";
    try
    {
      Object localObject = OooO0OO;
      String str3 = "C2535D584361605C234A604A6A674E4F6A6D6D2E738B888C847A939797938A7F85938799";
      str3 = m54207b69.F54207b69_11(str3);
      boolean bool = CommonUtil.OooO00o((Context)localObject, str3);
      if (!bool)
      {
        localObject = "c_0D1B201E04141D1719230A17172B19298F404C40464B42434E494B9A48544E49535CA1605EA46462636365AA625E595FAF4F636E61656C724A776B7175776A6AB1687476B5";
        localObject = m54207b69.F54207b69_11((String)localObject);
        CobubLog.OooO0OO(str1, (String)localObject);
        return str2;
      }
      localObject = OooO0oO;
      str1 = ((TelephonyManager)localObject).getSimSerialNumber();
      if (str1 != null) {
        str2 = str1;
      }
    }
    catch (Exception localException)
    {
      CobubLog.OooO0O0(str1, localException);
    }
    return str2;
  }
  
  public static boolean getWiFiAvailable()
  {
    try
    {
      Object localObject = OooO0OO;
      String str1 = "iE242C233A2E3127723D2941333843443B3A3C7D171A1B162D2E332C271F29383531253323";
      str1 = m54207b69.F54207b69_11(str1);
      boolean bool1 = CommonUtil.OooO00o((Context)localObject, str1);
      if (!bool1)
      {
        localObject = "5J0E303E262D34092B342E";
        localObject = m54207b69.F54207b69_11((String)localObject);
        str1 = "`'6665666578797E77766A78838080748272186955695F646B6C67626423716D67726C652A69672D6D6B6C6C6E337B77827838987C778A7E857BA380848A7E8093934AA18D8F4E";
        str1 = m54207b69.F54207b69_11(str1);
        CobubLog.OooO0OO((String)localObject, str1);
        return false;
      }
      localObject = OooO0OO;
      str1 = "Jc000D0F100A051D111D132125";
      str1 = m54207b69.F54207b69_11(str1);
      localObject = ((Context)localObject).getSystemService(str1);
      localObject = (ConnectivityManager)localObject;
      if (localObject != null)
      {
        localObject = ((ConnectivityManager)localObject).getAllNetworkInfo();
        if (localObject != null)
        {
          int i = 0;
          str1 = null;
          for (;;)
          {
            int j = localObject.length;
            if (i >= j) {
              break;
            }
            String str2 = localObject[i];
            str2 = str2.getTypeName();
            String str3 = "7A1609090B";
            str3 = m54207b69.F54207b69_11(str3);
            boolean bool2 = str2.equals(str3);
            if (bool2)
            {
              str2 = localObject[i];
              bool2 = str2.isConnected();
              if (bool2) {
                return true;
              }
            }
            i += 1;
          }
        }
      }
      return false;
    }
    catch (Exception localException) {}
  }
  
  public static String getWifiMac()
  {
    String str1 = "";
    String str2 = m54207b69.F54207b69_11("5J0E303E262D34092B342E");
    try
    {
      Object localObject1 = OooO0OO;
      Object localObject2 = "aE322D252F";
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      localObject1 = ((Context)localObject1).getSystemService((String)localObject2);
      localObject1 = (WifiManager)localObject1;
      localObject1 = ((WifiManager)localObject1).getConnectionInfo();
      localObject1 = ((WifiInfo)localObject1).getMacAddress();
      if (localObject1 == null) {
        localObject1 = str1;
      }
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str3 = "0.494C5C7C4B4D4D6A575610121F";
      str3 = m54207b69.F54207b69_11(str3);
      ((StringBuilder)localObject2).append(str3);
      ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = ((StringBuilder)localObject2).toString();
      CobubLog.OooO0Oo(str2, (String)localObject2);
      return localObject1;
    }
    catch (Exception localException)
    {
      CobubLog.OooO0O0(str2, localException);
    }
    return str1;
  }
  
  private static boolean isSimulator()
  {
    String str1 = getDeviceIMEI();
    String str2 = m54207b69.F54207b69_11("*K7B7C7D7E7F80818283848586878889");
    boolean bool = str1.equals(str2);
    return bool;
  }
  
  public static void setDeviceId(String paramString)
  {
    OooO00o = paramString;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.wbtech.DeviceInfo
 * JD-Core Version:    0.7.0.1
 */
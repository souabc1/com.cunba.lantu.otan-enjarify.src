package com.cunba.lantu.otan.model;

import androidx.lifecycle.MutableLiveData;
import com.cunba.lantu.otan.App;
import com.cunba.lantu.otan.utils.MMKVUtil;
import com.qinggan.os.SystemProperties;
import m54207b69;

public class SystemProperty
{
  private static MutableLiveData _model;
  private static MutableLiveData _serial;
  private static MutableLiveData _vin;
  
  static
  {
    Object localObject = new androidx/lifecycle/MutableLiveData;
    ((MutableLiveData)localObject).<init>();
    _vin = (MutableLiveData)localObject;
    localObject = new androidx/lifecycle/MutableLiveData;
    ((MutableLiveData)localObject).<init>();
    _serial = (MutableLiveData)localObject;
    localObject = new androidx/lifecycle/MutableLiveData;
    ((MutableLiveData)localObject).<init>();
    _model = (MutableLiveData)localObject;
    localObject = m54207b69.F54207b69_11("ct072C04201E");
    boolean bool1 = MMKVUtil.OooO00o((String)localObject);
    String str1 = "";
    if (bool1)
    {
      String str2 = MMKVUtil.OooO0o0((String)localObject, str1);
      bool1 = str2.equals(str1);
      if (!bool1)
      {
        localObject = MMKVUtil.OooO0o0((String)localObject, str1);
        break label102;
      }
    }
    boolean bool2 = App.isDebug();
    if (bool2) {
      localObject = m54207b69.F54207b69_11("aH040D1A7481127785800E17838585898D8D");
    } else {
      localObject = SystemProperties.getVinCode();
    }
    label102:
    set_vin((String)localObject);
    localObject = m54207b69.F54207b69_11("YS200D2239253F3846");
    bool1 = MMKVUtil.OooO00o((String)localObject);
    if (bool1) {
      localObject = MMKVUtil.OooO0o0((String)localObject, str1);
    }
    for (;;)
    {
      set_serial((String)localObject);
      break;
      bool2 = App.isDebug();
      if (bool2) {
        localObject = m54207b69.F54207b69_11("'M087E7E8082807E");
      } else {
        localObject = SystemProperties.getProductSN();
      }
    }
    set_model(MMKVUtil.OooO0o0(m54207b69.F54207b69_11("U_2C0134333F3F39"), str1));
  }
  
  public static MutableLiveData get_model()
  {
    Object[] arrayOfObject = new Object[0];
    return (MutableLiveData)m54207b69.F54207b69_09(426, arrayOfObject);
  }
  
  public static MutableLiveData get_serial()
  {
    Object[] arrayOfObject = new Object[0];
    return (MutableLiveData)m54207b69.F54207b69_09(427, arrayOfObject);
  }
  
  public static MutableLiveData get_vin()
  {
    Object[] arrayOfObject = new Object[0];
    return (MutableLiveData)m54207b69.F54207b69_09(428, arrayOfObject);
  }
  
  public static void set_model(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    m54207b69.F54207b69_00(429, arrayOfObject);
  }
  
  public static void set_serial(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    m54207b69.F54207b69_00(430, arrayOfObject);
  }
  
  public static void set_vin(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    m54207b69.F54207b69_00(431, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.model.SystemProperty
 * JD-Core Version:    0.7.0.1
 */
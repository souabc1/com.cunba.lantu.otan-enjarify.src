package com.qinggan.util;

import com.qinggan.os.SystemProperties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m54207b69;

public class VehicleHelper
{
  public static final String OooO00o = "VehicleHelper";
  public static int OooO0O0;
  
  public static int getVehicleType()
  {
    int i = getVehicleTypeID();
    int j = 36;
    if (i != j) {
      i = 2;
    } else {
      i = 1;
    }
    return i;
  }
  
  public static int getVehicleTypeID()
  {
    int i = OooO0O0;
    if (i != 0) {
      return i;
    }
    i = 43;
    Object localObject1 = SystemProperties.OooOO0O(i);
    localObject1 = Pattern.compile(m54207b69.F54207b69_11("_O141281657A17")).matcher((CharSequence)localObject1);
    String str1 = "";
    localObject1 = ((Matcher)localObject1).replaceAll(str1).trim();
    String str2 = OooO00o;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str3 = m54207b69.F54207b69_11("}&414454734753554C524C7C6A62507D71165B71611A655965675E645E8E7C74628F83977578746E68432F");
    ((StringBuilder)localObject2).append(str3);
    ((StringBuilder)localObject2).append((String)localObject1);
    localObject2 = ((StringBuilder)localObject2).toString();
    Log.OooO00o(str2, (String)localObject2);
    boolean bool = ((String)localObject1).equals(str1);
    if (bool) {
      return 0;
    }
    return Integer.parseInt((String)localObject1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.util.VehicleHelper
 * JD-Core Version:    0.7.0.1
 */
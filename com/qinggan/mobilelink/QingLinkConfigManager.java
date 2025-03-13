package com.qinggan.mobilelink;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import com.qinggan.analytics.wbtech.OooO00o;
import com.qinggan.util.Log;
import java.util.List;
import m54207b69;

public class QingLinkConfigManager
{
  public ServiceConnection OooO00o;
  public Context OooO0O0;
  public Handler OooO0OO;
  public IQingLinkConfigManager OooO0Oo;
  
  public final void OooO0o0()
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    Object localObject1 = new android/content/ComponentName;
    Object localObject2 = m54207b69.F54207b69_11("0q121F1E62041D251D1E19296A0E151014242D1331312D281F");
    String str = m54207b69.F54207b69_11("Ny1A17165A0C151D2526212162141D252D252129256B3D262E364E2A322E5527285439393B424131514434393B4649");
    ((ComponentName)localObject1).<init>((String)localObject2, str);
    localIntent.setComponent((ComponentName)localObject1);
    localObject1 = this.OooO0O0;
    localObject2 = this.OooO00o;
    ((Context)localObject1).bindService(localIntent, (ServiceConnection)localObject2, 1);
  }
  
  public boolean isMobileInDisplay()
  {
    String str1 = m54207b69.F54207b69_11("+y2811192139151D19421F212A1C2B42272729302F1F");
    String str2 = m54207b69.F54207b69_11("p(415C674A4E464A54694F764C6765525861");
    Log.OooO00o(str1, str2);
    str1 = null;
    str2 = "Me060B0A4E181111090A0D1556201919111615282415212C2C211D36663D29343429253E472A36323A343A46";
    try
    {
      str2 = m54207b69.F54207b69_11(str2);
      Object localObject = this.OooO0O0;
      String str3 = ":'4645555155535965";
      str3 = m54207b69.F54207b69_11(str3);
      localObject = ((Context)localObject).getSystemService(str3);
      localObject = (ActivityManager)localObject;
      int i = 1;
      localObject = ((ActivityManager)localObject).getRunningTasks(i);
      localObject = ((List)localObject).get(0);
      localObject = (ActivityManager.RunningTaskInfo)localObject;
      localObject = OooO00o.OooO00o((ActivityManager.RunningTaskInfo)localObject);
      localObject = ((ComponentName)localObject).getClassName();
      return str2.equals(localObject);
    }
    catch (Exception localException)
    {
      localException;
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.mobilelink.QingLinkConfigManager
 * JD-Core Version:    0.7.0.1
 */
package com.qinggan.analytics.wbtech;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import m54207b69;

class UploadHistoryLog
  extends Thread
{
  public Context o00OoOoo;
  public final String o00Ooo00;
  
  public UploadHistoryLog(Context paramContext)
  {
    String str = m54207b69.F54207b69_11("=m381E0305100E2B0B26220C2A202E1019");
    this.o00Ooo00 = str;
    this.o00OoOoo = paramContext;
  }
  
  public void run()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = this.o00OoOoo.getCacheDir();
    ((StringBuilder)localObject1).append(localObject2);
    localObject2 = m54207b69.F54207b69_11("5V79363B3727397E3C3F3E483E");
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = ((StringBuilder)localObject1).toString();
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str1 = m54207b69.F54207b69_11("l<7B5A4A1F6362655B612564605C662A");
    ((StringBuilder)localObject2).append(str1);
    ((StringBuilder)localObject2).append((String)localObject1);
    localObject2 = ((StringBuilder)localObject2).toString();
    str1 = m54207b69.F54207b69_11("=m381E0305100E2B0B26220C2A202E1019");
    CobubLog.OooO0Oo(str1, (String)localObject2);
    try
    {
      localObject2 = new java/io/File;
      ((File)localObject2).<init>((String)localObject1);
      boolean bool = ((File)localObject2).exists();
      if (!bool)
      {
        localObject1 = "V>705220595B5250585450285D5D662C6767636D316C6661677238";
        localObject1 = m54207b69.F54207b69_11((String)localObject1);
        CobubLog.OooO00o(str1, (String)localObject1);
        return;
      }
      Object localObject3 = new java/io/FileInputStream;
      ((FileInputStream)localObject3).<init>((File)localObject2);
      localObject2 = new java/lang/StringBuffer;
      ((StringBuffer)localObject2).<init>();
      int i = 4096;
      Object localObject4 = new byte[i];
      for (;;)
      {
        int j = ((FileInputStream)localObject3).read((byte[])localObject4);
        int k = -1;
        if (j == k) {
          break;
        }
        String str2 = new java/lang/String;
        str2.<init>((byte[])localObject4, 0, j);
        ((StringBuffer)localObject2).append(str2);
      }
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject4 = UmsConstants.OooO0oO;
      ((StringBuilder)localObject3).append((String)localObject4);
      localObject4 = "H{540F180B5813111E1C2329422029";
      localObject4 = m54207b69.F54207b69_11((String)localObject4);
      ((StringBuilder)localObject3).append((String)localObject4);
      localObject3 = ((StringBuilder)localObject3).toString();
      localObject2 = ((StringBuffer)localObject2).toString();
      localObject2 = NetworkUtil.OooO00o((String)localObject3, (String)localObject2);
      localObject2 = NetworkUtil.OooO0O0((String)localObject2);
      if (localObject2 == null) {
        return;
      }
      int m = ((MyMessage)localObject2).getFlag();
      if (m > 0)
      {
        localObject2 = new java/io/File;
        ((File)localObject2).<init>((String)localObject1);
        ((File)localObject2).delete();
      }
    }
    catch (Exception localException)
    {
      CobubLog.OooO0O0(str1, localException);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.wbtech.UploadHistoryLog
 * JD-Core Version:    0.7.0.1
 */
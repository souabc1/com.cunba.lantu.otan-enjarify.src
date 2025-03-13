package com.qinggan.os;

import android.content.ContentResolver;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import m54207b69;

public class SystemInfo
{
  public ContentResolver OooO00o;
  public TelephonyManager OooO0O0;
  
  /* Error */
  public final String OooO00o(String paramString)
  {
    // Byte code:
    //   0: new 10	java/io/File
    //   3: astore_2
    //   4: aload_2
    //   5: aload_1
    //   6: invokespecial 14	java/io/File:<init>	(Ljava/lang/String;)V
    //   9: aconst_null
    //   10: astore_1
    //   11: new 16	java/io/BufferedReader
    //   14: astore_3
    //   15: new 18	java/io/FileReader
    //   18: astore 4
    //   20: aload 4
    //   22: aload_2
    //   23: invokespecial 21	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   26: aload_3
    //   27: aload 4
    //   29: invokespecial 24	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   32: aload_3
    //   33: invokevirtual 28	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   36: astore_1
    //   37: goto +37 -> 74
    //   40: astore_1
    //   41: goto +8 -> 49
    //   44: astore_2
    //   45: aconst_null
    //   46: astore_3
    //   47: aload_2
    //   48: astore_1
    //   49: aload_3
    //   50: ifnull +15 -> 65
    //   53: aload_3
    //   54: invokevirtual 32	java/io/BufferedReader:close	()V
    //   57: goto +8 -> 65
    //   60: astore_2
    //   61: aload_2
    //   62: invokevirtual 37	java/lang/Throwable:printStackTrace	()V
    //   65: aload_1
    //   66: athrow
    //   67: pop
    //   68: aconst_null
    //   69: astore_3
    //   70: aload_3
    //   71: ifnull +15 -> 86
    //   74: aload_3
    //   75: invokevirtual 32	java/io/BufferedReader:close	()V
    //   78: goto +8 -> 86
    //   81: astore_2
    //   82: aload_2
    //   83: invokevirtual 37	java/lang/Throwable:printStackTrace	()V
    //   86: aload_1
    //   87: areturn
    //   88: pop
    //   89: goto -19 -> 70
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	this	SystemInfo
    //   0	92	1	paramString	String
    //   3	20	2	localFile	java.io.File
    //   44	4	2	localObject	Object
    //   60	2	2	localIOException1	java.io.IOException
    //   81	2	2	localIOException2	java.io.IOException
    //   14	61	3	localBufferedReader	java.io.BufferedReader
    //   18	10	4	localFileReader	java.io.FileReader
    //   67	1	8	localIOException3	java.io.IOException
    //   88	1	9	localIOException4	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   32	36	40	finally
    //   11	14	44	finally
    //   15	18	44	finally
    //   22	26	44	finally
    //   27	32	44	finally
    //   53	57	60	java/io/IOException
    //   11	14	67	java/io/IOException
    //   15	18	67	java/io/IOException
    //   22	26	67	java/io/IOException
    //   27	32	67	java/io/IOException
    //   74	78	81	java/io/IOException
    //   32	36	88	java/io/IOException
  }
  
  public String getIMEI()
  {
    String str1 = this.OooO0O0.getDeviceId();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str2 = m54207b69.F54207b69_11("+55251437F7C7582161D");
    localStringBuilder.append(str2);
    localStringBuilder.append(str1);
    return str1;
  }
  
  public String getIMSI()
  {
    String str1 = this.OooO0O0.getSubscriberId();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str2 = m54207b69.F54207b69_11("jm0A091B2724432A5E55");
    localStringBuilder.append(str2);
    localStringBuilder.append(str1);
    return str1;
  }
  
  public String getIVokaFirmwareFilePath()
  {
    return m54207b69.F54207b69_11("Vr5D020D04611B1D0B231A210C690F2C2216252F13337231362278355B2D795E7C3B613382648266866A6B70708941492F4F3645334B623A4E383A555858");
  }
  
  public String getIVokaFirmwareVersion()
  {
    String str1 = getIVokaFirmwareFilePath();
    str1 = OooO00o(str1);
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str2 = m54207b69.F54207b69_11("@<5B5A4A786E585D64825E585C576A5C687A6A60626968681D34");
    localStringBuilder.append(str2);
    localStringBuilder.append(str1);
    return str1;
  }
  
  public String getIVokaResourceFilePath()
  {
    return "";
  }
  
  public String getIVokaResourceVersion()
  {
    String str1 = getIVokaResourceFilePath();
    str1 = OooO00o(str1);
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str2 = m54207b69.F54207b69_11("Oh0F0E1E24420C0910421625122927191C4E1E2C2E151C1C6960");
    localStringBuilder.append(str2);
    localStringBuilder.append(str1);
    return str1;
  }
  
  public String getMSISDN()
  {
    String str1 = this.OooO0O0.getLine1Number();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str2 = m54207b69.F54207b69_11("8j0D10202A3D283F352C5954");
    localStringBuilder.append(str2);
    localStringBuilder.append(str1);
    return str1;
  }
  
  public String getNaviMapVersion()
  {
    ContentResolver localContentResolver = this.OooO00o;
    String str = m54207b69.F54207b69_11("s954594B6953615151585F61");
    return Settings.System.getString(localContentResolver, str);
  }
  
  public String getScreenVersion()
  {
    return BackLightNative.getBackLightVersion();
  }
  
  public String getSystemSoftwareVersion()
  {
    String str1 = getSystemVersonFilePath();
    str1 = OooO00o(str1);
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str2 = m54207b69.F54207b69_11(">A262537153C373B2B341B383241432E4234283646463D4446937A");
    localStringBuilder.append(str2);
    localStringBuilder.append(str1);
    return str1;
  }
  
  public String getSystemSoftwareVersionSysA()
  {
    String str1 = MiniRecoveryNative.getSystemVersion(0);
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str2 = m54207b69.F54207b69_11("Cs141709230E050D1D262926201311201026362814142F323438231A4D6570");
    localStringBuilder.append(str2);
    localStringBuilder.append(str1);
    return str1;
  }
  
  public String getSystemSoftwareVersionSysB()
  {
    String str1 = MiniRecoveryNative.getSystemVersion(1);
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str2 = m54207b69.F54207b69_11("Ly1E1D0F2D040F13231C33202A191B261A2C402E1E1E252C2E421924565F76");
    localStringBuilder.append(str2);
    localStringBuilder.append(str1);
    return str1;
  }
  
  public String getSystemVersonFilePath()
  {
    return m54207b69.F54207b69_11("]C6C313C333B2B34732E402A773C473E46363F2E483A464641444687564A4C");
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.os.SystemInfo
 * JD-Core Version:    0.7.0.1
 */
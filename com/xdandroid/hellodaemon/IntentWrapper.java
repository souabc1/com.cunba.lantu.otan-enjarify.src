package com.xdandroid.hellodaemon;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.List;
import m54207b69;

public class IntentWrapper
{
  public static List OooO0OO;
  public static String OooO0Oo;
  public Intent OooO00o;
  public int OooO0O0;
  
  public IntentWrapper(Intent paramIntent, int paramInt)
  {
    this.OooO00o = paramIntent;
    this.OooO0O0 = paramInt;
  }
  
  public static String getApplicationName()
  {
    Object localObject1 = OooO0Oo;
    if (localObject1 == null)
    {
      boolean bool = DaemonEnv.OooO0Oo;
      if (!bool) {
        return "";
      }
      try
      {
        localObject1 = DaemonEnv.OooO00o;
        localObject1 = ((Context)localObject1).getPackageManager();
        Object localObject2 = DaemonEnv.OooO00o;
        localObject2 = ((Context)localObject2).getPackageName();
        localObject2 = ((PackageManager)localObject1).getApplicationInfo((String)localObject2, 0);
        localObject1 = ((PackageManager)localObject1).getApplicationLabel((ApplicationInfo)localObject2);
        localObject1 = ((CharSequence)localObject1).toString();
        OooO0Oo = (String)localObject1;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        localNameNotFoundException.printStackTrace();
        localObject1 = DaemonEnv.OooO00o.getPackageName();
        OooO0Oo = (String)localObject1;
      }
    }
    return OooO0Oo;
  }
  
  public static List getIntentWrapperList()
  {
    Object localObject1 = OooO0OO;
    if (localObject1 == null)
    {
      boolean bool = DaemonEnv.OooO0Oo;
      if (!bool)
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        return localObject1;
      }
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      OooO0OO = (List)localObject1;
      localObject1 = DaemonEnv.OooO00o;
      Object localObject2 = m54207b69.F54207b69_11("Qd140C15041A");
      localObject1 = (PowerManager)((Context)localObject1).getSystemService((String)localObject2);
      localObject2 = DaemonEnv.OooO00o.getPackageName();
      bool = ((PowerManager)localObject1).isIgnoringBatteryOptimizations((String)localObject2);
      if (!bool)
      {
        localObject1 = new android/content/Intent;
        localObject2 = m54207b69.F54207b69_11("Vk0A06111C0807154C2017292A0E121A27554A404D52434E564C3B464040564C53494B6162525E585B4C64694D524F5F596F5356586C");
        ((Intent)localObject1).<init>((String)localObject2);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = m54207b69.F54207b69_11("ni19090C050C13125A");
        ((StringBuilder)localObject2).append((String)localObject3);
        localObject3 = DaemonEnv.OooO00o.getPackageName();
        ((StringBuilder)localObject2).append((String)localObject3);
        localObject2 = Uri.parse(((StringBuilder)localObject2).toString());
        ((Intent)localObject1).setData((Uri)localObject2);
        localObject2 = OooO0OO;
        localObject3 = new com/xdandroid/hellodaemon/IntentWrapper;
        i = 98;
        ((IntentWrapper)localObject3).<init>((Intent)localObject1, i);
        ((List)localObject2).add(localObject3);
      }
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject2 = m54207b69.F54207b69_11("yr1A0815081B206222240F212712692120162C2F2F704F375645495758425040414D60555F575A5D47");
      ((Intent)localObject1).setAction((String)localObject2);
      localObject2 = OooO0OO;
      Object localObject3 = new com/xdandroid/hellodaemon/IntentWrapper;
      ((IntentWrapper)localObject3).<init>((Intent)localObject1, 99);
      ((List)localObject2).add(localObject3);
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject2 = new android/content/ComponentName;
      localObject3 = m54207b69.F54207b69_11("05565B5A1E61455A495865255158534F5F6869666E6867665E");
      Object localObject4 = m54207b69.F54207b69_11("6\\3F343375382E4332413E7C3A313C364841424F4551504F458A4C4643514E534559934E5157645F56579B36595F55676E584E715B695F6B5F5D");
      ((ComponentName)localObject2).<init>((String)localObject3, (String)localObject4);
      ((Intent)localObject1).setComponent((ComponentName)localObject2);
      localObject2 = OooO0OO;
      localObject3 = new com/xdandroid/hellodaemon/IntentWrapper;
      int i = 100;
      ((IntentWrapper)localObject3).<init>((Intent)localObject1, i);
      ((List)localObject2).add(localObject3);
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject2 = m54207b69.F54207b69_11(",(45425F440A464C63554F661155586A505757187A8C8C7F94948091969886989B");
      ((Intent)localObject1).setAction((String)localObject2);
      localObject2 = m54207b69.F54207b69_11("el0D030A21070A0E490D0B22140E25501E1D291B1E17332B5940424448553D56");
      ((Intent)localObject1).addCategory((String)localObject2);
      localObject3 = OooO0OO;
      localObject4 = new com/xdandroid/hellodaemon/IntentWrapper;
      ((IntentWrapper)localObject4).<init>((Intent)localObject1, 101);
      ((List)localObject3).add(localObject4);
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject3 = new android/content/ComponentName;
      localObject4 = m54207b69.F54207b69_11("`@23302F71312E3B3076393942313F393435413745");
      String str = m54207b69.F54207b69_11("R]3E33327634392E3B7B363C35443C4447483E4A42873D4A8A2D4D535454503A4C4D4F405557605A614467535F57615753");
      ((ComponentName)localObject3).<init>((String)localObject4, str);
      ((Intent)localObject1).setComponent((ComponentName)localObject3);
      localObject3 = DaemonEnv.OooO00o.getPackageName();
      localObject4 = m54207b69.F54207b69_11("gE3525283128272621332D322B");
      ((Intent)localObject1).putExtra((String)localObject4, (String)localObject3);
      localObject3 = m54207b69.F54207b69_11("0>4E605F58635E61685A6866665E");
      localObject4 = getApplicationName();
      ((Intent)localObject1).putExtra((String)localObject3, (String)localObject4);
      localObject3 = OooO0OO;
      localObject4 = new com/xdandroid/hellodaemon/IntentWrapper;
      int j = 102;
      ((IntentWrapper)localObject4).<init>((Intent)localObject1, j);
      ((List)localObject3).add(localObject4);
      localObject1 = DaemonEnv.OooO00o.getPackageManager();
      localObject3 = m54207b69.F54207b69_11("If050A0D4B190C111C1B110B53131510231920145B2920");
      localObject1 = ((PackageManager)localObject1).getLaunchIntentForPackage((String)localObject3);
      if (localObject1 != null)
      {
        localObject3 = OooO0OO;
        localObject4 = new com/xdandroid/hellodaemon/IntentWrapper;
        j = 103;
        ((IntentWrapper)localObject4).<init>((Intent)localObject1, j);
        ((List)localObject3).add(localObject4);
      }
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject3 = new android/content/ComponentName;
      localObject4 = m54207b69.F54207b69_11("F]3E33327632413635303C447E4840473E42454B86424518554B");
      str = m54207b69.F54207b69_11("|d070C0B4D1B0A0F1E19130D5511170E251B1E125D2B1E6028256320202C2D1F353D6B48283435273D454E313B393F3B3F4D");
      ((ComponentName)localObject3).<init>((String)localObject4, str);
      ((Intent)localObject1).setComponent((ComponentName)localObject3);
      localObject3 = OooO0OO;
      localObject4 = new com/xdandroid/hellodaemon/IntentWrapper;
      ((IntentWrapper)localObject4).<init>((Intent)localObject1, 107);
      ((List)localObject3).add(localObject4);
      localObject1 = new android/content/Intent;
      localObject3 = m54207b69.F54207b69_11("Ha020F0E5210090E221C581C0B13115D21141326261C2A2E664A4248515A3D4F50524544");
      ((Intent)localObject1).<init>((String)localObject3);
      ((Intent)localObject1).addCategory((String)localObject2);
      localObject2 = DaemonEnv.OooO00o.getPackageName();
      localObject3 = m54207b69.F54207b69_11("BN3E302F28332E3107372C35");
      ((Intent)localObject1).putExtra((String)localObject3, (String)localObject2);
      localObject2 = OooO0OO;
      localObject3 = new com/xdandroid/hellodaemon/IntentWrapper;
      ((IntentWrapper)localObject3).<init>((Intent)localObject1, 104);
      ((List)localObject2).add(localObject3);
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject2 = new android/content/ComponentName;
      localObject3 = m54207b69.F54207b69_11("><5F545315555E5B4D511B59686666");
      localObject4 = m54207b69.F54207b69_11("aF252A2D6B2F2835433B713F322C3076453942354747447E2D414A3D4F2353543543554D52595A555050304F5D5B5D5D616F");
      ((ComponentName)localObject2).<init>((String)localObject3, (String)localObject4);
      ((Intent)localObject1).setComponent((ComponentName)localObject2);
      localObject2 = OooO0OO;
      localObject3 = new com/xdandroid/hellodaemon/IntentWrapper;
      ((IntentWrapper)localObject3).<init>((Intent)localObject1, 105);
      ((List)localObject2).add(localObject3);
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject2 = new android/content/ComponentName;
      localObject3 = m54207b69.F54207b69_11(";L2F2423653328262A462C496D4B3A38383F3A344B3D53");
      localObject4 = m54207b69.F54207b69_11("IW34393C7C383D413F2D412E8430433F4144434B36463A8F3E4A3E545940415C57599A46465A4A49494FA22E4E625251515747595A4F735A5A4E6D5D795D7B616D");
      ((ComponentName)localObject2).<init>((String)localObject3, (String)localObject4);
      ((Intent)localObject1).setComponent((ComponentName)localObject2);
      localObject2 = OooO0OO;
      localObject3 = new com/xdandroid/hellodaemon/IntentWrapper;
      ((IntentWrapper)localObject3).<init>((Intent)localObject1, 106);
      ((List)localObject2).add(localObject3);
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject2 = new android/content/ComponentName;
      localObject3 = m54207b69.F54207b69_11("SK282528682C292D2B416E4235393B363D3550404C");
      localObject4 = m54207b69.F54207b69_11("WD272C2B6D2B302E323E7341302E2E35303A4133497E49374D41465152494848895751475954565A913F594F615C5E623464653A606B653B5E68666C686C7A");
      ((ComponentName)localObject2).<init>((String)localObject3, (String)localObject4);
      ((Intent)localObject1).setComponent((ComponentName)localObject2);
      localObject2 = OooO0OO;
      localObject3 = new com/xdandroid/hellodaemon/IntentWrapper;
      ((IntentWrapper)localObject3).<init>((Intent)localObject1, 108);
      ((List)localObject2).add(localObject3);
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject2 = new android/content/ComponentName;
      localObject3 = m54207b69.F54207b69_11("wT373C3B7D26422842823E403C");
      localObject4 = m54207b69.F54207b69_11("jb010E114F18101A14540C1C1D1A180F12261C1F1F141C201A2C24272B2329232A2C286E3A2F714D4129303B3C374135613D4639436338423A3D404A5E3D5349534B575D");
      ((ComponentName)localObject2).<init>((String)localObject3, (String)localObject4);
      ((Intent)localObject1).setComponent((ComponentName)localObject2);
      localObject2 = OooO0OO;
      localObject3 = new com/xdandroid/hellodaemon/IntentWrapper;
      ((IntentWrapper)localObject3).<init>((Intent)localObject1, 109);
      ((List)localObject2).add(localObject3);
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject2 = new android/content/ComponentName;
      localObject3 = m54207b69.F54207b69_11("(.4D4245034D4C474753540A684D5568525F51615C5F71");
      localObject4 = m54207b69.F54207b69_11("m1525F5E225A5D64665C5D294D6A64536B60706269685835936871798B6E62766678666A");
      ((ComponentName)localObject2).<init>((String)localObject3, (String)localObject4);
      ((Intent)localObject1).setComponent((ComponentName)localObject2);
      localObject2 = OooO0OO;
      localObject3 = new com/xdandroid/hellodaemon/IntentWrapper;
      ((IntentWrapper)localObject3).<init>((Intent)localObject1, 110);
      ((List)localObject2).add(localObject3);
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject2 = new android/content/ComponentName;
      localObject3 = m54207b69.F54207b69_11("kK282528682B3345446D332F3A4531303E75384052514D4044467E24595B4147434460284D494F52553251694D694F6D61");
      localObject4 = m54207b69.F54207b69_11("'_3C313474373F313079473B46393D444A81444C3E3D41545052");
      ((ComponentName)localObject2).<init>((String)localObject4, (String)localObject3);
      ((Intent)localObject1).setComponent((ComponentName)localObject2);
      localObject2 = OooO0OO;
      localObject3 = new com/xdandroid/hellodaemon/IntentWrapper;
      ((IntentWrapper)localObject3).<init>((Intent)localObject1, 111);
      ((List)localObject2).add(localObject3);
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject2 = new android/content/ComponentName;
      localObject3 = m54207b69.F54207b69_11("ge060B0A4E0D05171A530D150C23171A105B1A1224272B1A1A1864411F222B20362A312D24483A3B4F2C342E2D2C5134403C443E4450");
      ((ComponentName)localObject2).<init>((String)localObject4, (String)localObject3);
      ((Intent)localObject1).setComponent((ComponentName)localObject2);
      localObject2 = OooO0OO;
      localObject3 = new com/xdandroid/hellodaemon/IntentWrapper;
      ((IntentWrapper)localObject3).<init>((Intent)localObject1, 112);
      ((List)localObject2).add(localObject3);
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject2 = new android/content/ComponentName;
      localObject3 = m54207b69.F54207b69_11("X;5855581846535D5B5D651F65616C57636270275B726D64606A685C");
      localObject4 = m54207b69.F54207b69_11("n-4E434206585D47494B530D574F566D51545A15715C63645F5B72627A1F766A6E6F6D8163706969");
      ((ComponentName)localObject2).<init>((String)localObject3, (String)localObject4);
      ((Intent)localObject1).setComponent((ComponentName)localObject2);
      localObject2 = OooO0OO;
      localObject3 = new com/xdandroid/hellodaemon/IntentWrapper;
      ((IntentWrapper)localObject3).<init>((Intent)localObject1, 113);
      ((List)localObject2).add(localObject3);
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject2 = new android/content/ComponentName;
      localObject3 = m54207b69.F54207b69_11("rG24292C6C2F272F2F3931733F2E3140443E4450");
      localObject4 = m54207b69.F54207b69_11("cS303D4080433B43432D45872B423D34304A383C90373B374D494B4A53503E5A455D589F264A465C385A59625F4D69546C6743625A6E5A705E62");
      ((ComponentName)localObject2).<init>((String)localObject3, (String)localObject4);
      ((Intent)localObject1).setComponent((ComponentName)localObject2);
      localObject2 = OooO0OO;
      localObject3 = new com/xdandroid/hellodaemon/IntentWrapper;
      ((IntentWrapper)localObject3).<init>((Intent)localObject1, 114);
      ((List)localObject2).add(localObject3);
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject2 = new android/content/ComponentName;
      localObject3 = m54207b69.F54207b69_11("-M2E232266252D2929432B6D482E47364E4E394B4C383840");
      localObject4 = m54207b69.F54207b69_11("LB212E316F322C32343C36763D3942353F413848493F413B834F44862C4353544A4C4653892E504B513A565F525C3060615E5C53566A606363693C5B71677169757B");
      ((ComponentName)localObject2).<init>((String)localObject3, (String)localObject4);
      ((Intent)localObject1).setComponent((ComponentName)localObject2);
      localObject2 = OooO0OO;
      localObject3 = new com/xdandroid/hellodaemon/IntentWrapper;
      ((IntentWrapper)localObject3).<init>((Intent)localObject1, 115);
      ((List)localObject2).add(localObject3);
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject2 = new android/content/ComponentName;
      localObject3 = m54207b69.F54207b69_11("_]3E3332762B2E3E7A3D41463A35313C473F3C46514C88523F414B49434F903A4C4D3D4A4C56344E5A38655D6766655D");
      localObject4 = m54207b69.F54207b69_11("zg04090C4C21180850170B10201F2B22112522201716");
      ((ComponentName)localObject2).<init>((String)localObject4, (String)localObject3);
      ((Intent)localObject1).setComponent((ComponentName)localObject2);
      localObject2 = OooO0OO;
      localObject3 = new com/xdandroid/hellodaemon/IntentWrapper;
      j = 116;
      ((IntentWrapper)localObject3).<init>((Intent)localObject1, j);
      ((List)localObject2).add(localObject3);
      localObject1 = new android/content/Intent;
      ((Intent)localObject1).<init>();
      localObject2 = new android/content/ComponentName;
      localObject3 = m54207b69.F54207b69_11("?l0F0403451A1D0F490C12172924222D182E2B17221D57352030311F1D275F4D1F292E40504041653040412F2D374C5B3E48364C384C4A");
      ((ComponentName)localObject2).<init>((String)localObject4, (String)localObject3);
      ((Intent)localObject1).setComponent((ComponentName)localObject2);
      localObject2 = OooO0OO;
      localObject3 = new com/xdandroid/hellodaemon/IntentWrapper;
      i = 117;
      ((IntentWrapper)localObject3).<init>((Intent)localObject1, i);
      ((List)localObject2).add(localObject3);
    }
    return OooO0OO;
  }
  
  public void OooO00o(Activity paramActivity)
  {
    try
    {
      Intent localIntent = this.OooO00o;
      paramActivity.startActivity(localIntent);
    }
    catch (Exception paramActivity)
    {
      paramActivity.printStackTrace();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xdandroid.hellodaemon.IntentWrapper
 * JD-Core Version:    0.7.0.1
 */
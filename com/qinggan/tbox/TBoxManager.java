package com.qinggan.tbox;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.RemoteException;
import com.qinggan.os.ServiceManager;
import java.util.HashMap;
import java.util.List;
import m54207b69;

public class TBoxManager
{
  public static TBoxManager.TBoxHandler OooO;
  public static TBoxManager OooOO0;
  public HashMap OooO00o;
  public Context OooO0O0;
  public IBinder.DeathRecipient OooO0OO;
  public boolean OooO0Oo;
  public TBoxManager.ObtainServiceThread OooO0o;
  public final List OooO0o0;
  public volatile ITBoxService OooO0oO;
  public volatile IBinder OooO0oo;
  
  private boolean isServiceAvailable()
  {
    Object localObject1 = this.OooO0oo;
    if (localObject1 != null)
    {
      localObject1 = this.OooO0oo;
      boolean bool1 = ((IBinder)localObject1).isBinderAlive();
      if (bool1)
      {
        localObject1 = this.OooO0oo;
        bool1 = ((IBinder)localObject1).pingBinder();
        if (bool1) {
          return true;
        }
      }
    }
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = m54207b69.F54207b69_11("/A1225353A2C272A682D312E308A6E213345443A4A3876483B4B50423D407D7F4B3245555A4C474A2A50584F4F5F8E");
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = this.OooO0oo;
    ((StringBuilder)localObject1).append(localObject2);
    localObject1 = this.OooO0oo;
    if (localObject1 != null)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = m54207b69.F54207b69_11("K8556C5F4D52566164825A6067695724605B8B6369707260906C6A68782C2E");
      ((StringBuilder)localObject1).append((String)localObject2);
      boolean bool2 = this.OooO0oo.isBinderAlive();
      ((StringBuilder)localObject1).append(bool2);
      localObject2 = m54207b69.F54207b69_11("(418155B6A554B48645F5A8068665D5F552A556F6D678B7371686A60373931");
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = this.OooO0oo;
      bool2 = ((IBinder)localObject2).pingBinder();
      ((StringBuilder)localObject1).append(bool2);
    }
    return false;
  }
  
  public final void OooOO0o()
  {
    Object localObject1 = "DJ2E273B18422D2B391D4239434830373E";
    try
    {
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      localObject1 = ServiceManager.OooO0O0((String)localObject1);
      this.OooO0oo = ((IBinder)localObject1);
      localObject1 = this.OooO0oo;
      Object localObject4;
      String str;
      if (localObject1 == null)
      {
        localObject1 = this.OooO0O0;
        if (localObject1 == null) {
          return;
        }
        localObject1 = new android/content/Intent;
        ((Intent)localObject1).<init>();
        localObject4 = ";95A57561A4C555D656661612259686450275B6E5E63657073";
        localObject4 = m54207b69.F54207b69_11((String)localObject4);
        str = "gQ323F3E82243D453D3E39498A31404C388F3346363B4D484B971E2D59451F524247595457";
        str = m54207b69.F54207b69_11(str);
        ((Intent)localObject1).setClassName((String)localObject4, str);
        localObject4 = this.OooO0O0;
        ((Context)localObject4).startService((Intent)localObject1);
        localObject1 = this.OooO0o;
        localObject4 = null;
        if (localObject1 == null)
        {
          localObject1 = new com/qinggan/tbox/TBoxManager$ObtainServiceThread;
          ((TBoxManager.ObtainServiceThread)localObject1).<init>(this, null);
        }
        for (this.OooO0o = ((TBoxManager.ObtainServiceThread)localObject1);; this.OooO0o = ((TBoxManager.ObtainServiceThread)localObject1))
        {
          ((Thread)localObject1).start();
          break;
          bool = ((Thread)localObject1).isAlive();
          if (bool) {
            break;
          }
          this.OooO0o = null;
          localObject1 = new com/qinggan/tbox/TBoxManager$ObtainServiceThread;
          ((TBoxManager.ObtainServiceThread)localObject1).<init>(this, null);
        }
        return;
      }
      boolean bool = true;
      this.OooO0Oo = bool;
      localObject1 = this.OooO0oo;
      localObject1 = ITBoxService.Stub.o0Oo0o0O((IBinder)localObject1);
      this.OooO0oO = ((ITBoxService)localObject1);
      try
      {
        localObject1 = this.OooO0oo;
        localObject4 = this.OooO0OO;
        str = null;
        ((IBinder)localObject1).linkToDeath((IBinder.DeathRecipient)localObject4, 0);
      }
      catch (RemoteException localRemoteException)
      {
        localRemoteException.printStackTrace();
      }
      Object localObject2 = this.OooO00o;
      int i = ((HashMap)localObject2).size();
      if (i > 0)
      {
        localObject2 = this.OooO00o;
        localObject4 = this.OooO0O0;
        localObject2 = ((HashMap)localObject2).get(localObject4);
        localObject2 = (TBoxManager.OnInitListener)localObject2;
        OooOOO0((TBoxManager.OnInitListener)localObject2);
      }
      return;
    }
    finally {}
  }
  
  public final void OooOOO0(TBoxManager.OnInitListener paramOnInitListener)
  {
    Message localMessage = new android/os/Message;
    localMessage.<init>();
    localMessage.what = 0;
    Context localContext = this.OooO0O0;
    paramOnInitListener = new Object[] { localContext, paramOnInitListener };
    localMessage.obj = paramOnInitListener;
    OooO.OooO00o(localMessage, 50);
  }
  
  public boolean getDatacomSwitchStatus()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getDatacomSwitchStatus();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("')4E4D5F704C624E514E4D84694C6A58508A6E5A70706F1F63737460762F");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return false;
  }
  
  public boolean getEFenceEnable()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getEFenceEnable();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("-I2E2D3F0F13312D313415313337323A783C4C4D394F88");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return false;
  }
  
  public int getEFenceRange()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getEFenceRange();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("0354574979795B63575E6A5C686063216551526E541D");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return -1;
  }
  
  public int getEFenceSensitivity()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getEFenceSensitivity();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("O@272636080A2A342A2D1C2F393F364238463A464C743A4849474B94");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return -1;
  }
  
  public int getEcallType()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getECallType();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("UZ3D4030223D403C3D162C344A864C3637453972");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return 255;
  }
  
  public String getNetworkOperator()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getNetworkOperator();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("`v1114043B170707200C2643111F1125112915682618192F1B64");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return "N/A";
  }
  
  public int getNetworkStatus()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getNetworkStatus();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("\\\\3B3A2A153D2D313A364019334935373E8C4A404147437C");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return 255;
  }
  
  public int getNetworkType()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getNetworkType();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("wE2221330E243638313F371B47412D732F47483C4A93");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return 255;
  }
  
  public String getPhoneNumber()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getPhoneNumber();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("TN292C3C212A26263208442D3737497C3A4C4D334F88");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return null;
  }
  
  public int getSimCardstatus()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getSimCardStatus();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("Pf0104143813102B0E1C0B1F1D131F2124561426271D2972");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return 255;
  }
  
  public int getTBoxCallStatus()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getTBoxCallStatus();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("td030212332A10222E0D1112421C121E20275513292A202C75");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return 255;
  }
  
  public int getTBoxCallType()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getTBoxCallType();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("*z1D2010313C1A0840231F20390F172D692F191A281C55");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return 255;
  }
  
  public String getTBoxDumpInfo()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getTBoxDumpInfo();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("pv11140425381E14390B24104A241D27652315162C1861");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return null;
  }
  
  public String getTBoxHWVersion()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getTBoxHWVersion();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("lR35382809144230210D0D412B2D484B4B8248323351357E");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return "N/A";
  }
  
  public String getTBoxICCID()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getTBoxICCID();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("-35457496A75615181787984821F634F506C521B");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return "N/A";
  }
  
  public String getTBoxIMEI()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getTBoxIMEI();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("4750534566795D5585827B88225E525367551E");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return "N/A";
  }
  
  public String getTBoxIMSI()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getTBoxIMSI();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("bK2C2F41220D2939090E210C763A4647334982");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return "N/A";
  }
  
  public String getTBoxInfo(int paramInt)
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getTBoxInfo(paramInt);
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str1 = m54207b69.F54207b69_11("LC2427391A05314111352E366E");
      localStringBuilder.append(str1);
      localStringBuilder.append(paramInt);
      String str2 = m54207b69.F54207b69_11("+<1C5A505157530C");
      localStringBuilder.append(str2);
      str2 = localException.toString();
      localStringBuilder.append(str2);
    }
    return "";
  }
  
  public String getTBoxMCUVersion()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getTBoxMCUVersion();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("em0A091B3C33071B27364145132B2B1211135E1A323317356E");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return "N/A";
  }
  
  public String getTBoxMPUVersion()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getTBoxMPUVersion();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("1o080B1D3E31051D29474343152929140F11601C303115336C");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return "N/A";
  }
  
  public String getTBoxMSISDN()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getTBoxMSISDN();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("tS3437290A1541312508230A2229804430314D337C");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return "N/A";
  }
  
  public String getTBoxPDSN()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getTBoxPDSN();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("h651544465785E546D7A6E82215F515268541D");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return "N/A";
  }
  
  public int getTBoxSignalStrength()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getTBoxSignalStrength();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("f$434252736A50627E554C545054845E65515B55636019576D6E647039");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return 255;
  }
  
  public String getTBoxVIN()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getTBoxVIN();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("2F21243415082E44171711702E404137438C");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return "N/A";
  }
  
  public int getUpgradePercentage()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getUpgradePercentage();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("^Y3E3D2F0F2D43313F4545134737474A463D49504F8D5141424E447D");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return -1;
  }
  
  public int getUpgradeStatus()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.getUpgradeStatus();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("id0302123418081C0C080A411B111D1F26541228291F2B74");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return 0;
  }
  
  public boolean isLianLuTBox()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.isLianLuTBox();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("9447524278667F6A624B5A50724C624E50572563595A705C25");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return false;
  }
  
  public boolean isTBoxConnected()
  {
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        ITBoxService localITBoxService = this.OooO0oO;
        return localITBoxService.isTBoxConnected();
      }
      OooOO0o();
    }
    catch (Exception localException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("%K2239210C28380E2B2D2E38334B3B3D7A3E4A4B374D86");
      localStringBuilder.append(str2);
      String str1 = localException.toString();
      localStringBuilder.append(str1);
    }
    return false;
  }
  
  public void set5GSwitch(int paramInt)
  {
    int i = 1;
    if (paramInt != i)
    {
      i = 2;
      if (paramInt != i) {
        return;
      }
    }
    try
    {
      boolean bool = isServiceAvailable();
      if (bool)
      {
        localObject = this.OooO0oO;
        ((ITBoxService)localObject).set5GSwitch(paramInt);
      }
      else
      {
        OooOO0o();
      }
    }
    catch (Exception localException)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = m54207b69.F54207b69_11("mb1108185A29361B121E0A144D131D1E1C2069");
      ((StringBuilder)localObject).append(str2);
      String str1 = localException.toString();
      ((StringBuilder)localObject).append(str1);
    }
  }
  
  public void setTimeZone(int paramInt)
  {
    int i = -1200;
    if (paramInt >= i)
    {
      i = 1200;
      if (paramInt <= i) {
        try
        {
          boolean bool = isServiceAvailable();
          if (bool)
          {
            localObject = this.OooO0oO;
            ((ITBoxService)localObject).setTimeZone(paramInt);
          }
          else
          {
            OooOO0o();
          }
        }
        catch (Exception localException)
        {
          Object localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          String str2 = m54207b69.F54207b69_11("),5F4A5A7B49464F7D4B4B5317556B6C526E27");
          ((StringBuilder)localObject).append(str2);
          String str1 = localException.toString();
          ((StringBuilder)localObject).append(str1);
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.tbox.TBoxManager
 * JD-Core Version:    0.7.0.1
 */
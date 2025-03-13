package com.qinggan.audiopolicy;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m54207b69;

public class AudioPolicyManager
{
  public static String OooOOo = "com.qinggan.audiopolicy.service";
  public static String OooOOo0 = "com.qinggan.audiopolicy.action.AUDIO_POLICY_SERVICE";
  public static Object OooOOoo;
  public static Object OooOo0;
  public static Object OooOo00;
  public static Object OooOo0O;
  public final Context OooO;
  public ServiceConnection OooO00o;
  public IBinder.DeathRecipient OooO0O0;
  public final HashMap OooO0OO;
  public IAudioPolicyService OooO0Oo;
  public Object OooO0o;
  public List OooO0o0;
  public List OooO0oO;
  public List OooO0oo;
  public AudioPolicyManager.IAudioExceptionListener OooOO0;
  public AudioPolicyManager.IAudioFadeListener OooOO0O;
  public AudioPolicyManager.IAudioFadeListener OooOO0o;
  public List OooOOO;
  public List OooOOO0;
  public boolean OooOOOO;
  public final Object OooOOOo;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooOo0 = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    OooOo00 = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    OooOo0O = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    OooOOoo = localObject;
  }
  
  private AudioPolicyInfo getAudioPolicyInfoByType(int paramInt)
  {
    Object localObject1 = null;
    try
    {
      localObject2 = this.OooO0Oo;
      if (localObject2 != null)
      {
        localObject2 = this.OooO;
        localObject2 = ((Context)localObject2).getPackageName();
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str1 = "'~191C0C420F1F1D18361A1C222914451F28224E1A3E1C243276272F2B3B303963";
        str1 = m54207b69.F54207b69_11(str1);
        ((StringBuilder)localObject3).append(str1);
        ((StringBuilder)localObject3).append((String)localObject2);
        AudioPolicyInfo localAudioPolicyInfo;
        if (localObject2 == null)
        {
          localObject2 = this.OooO0Oo;
          localObject3 = ":^0B313733352E36";
          localObject3 = m54207b69.F54207b69_11((String)localObject3);
          localAudioPolicyInfo = ((IAudioPolicyService)localObject2).o00oo000(paramInt, (String)localObject3);
        }
        else
        {
          localObject3 = this.OooO0Oo;
          localAudioPolicyInfo = ((IAudioPolicyService)localObject3).o00oo000(paramInt, (String)localObject2);
        }
        localObject1 = localAudioPolicyInfo;
      }
      else
      {
        OooOo00();
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = m54207b69.F54207b69_11(")<5B5A4A804D5D5B5A745C5A606B5283616A6490587C5A6270348B636B6C89717472697B71407E6A86817572807F7F34");
      ((StringBuilder)localObject2).append((String)localObject3);
      String str2 = localNullPointerException.getMessage();
      ((StringBuilder)localObject2).append(str2);
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      Object localObject3 = m54207b69.F54207b69_11("/2555848764B5B61646A6668665D58896B646E825E7A60586E2A70646C735F647A7D7D2A");
      ((StringBuilder)localObject2).append((String)localObject3);
      String str3 = localRemoteException.getMessage();
      ((StringBuilder)localObject2).append(str3);
      OooOo00();
    }
    return localObject1;
  }
  
  public static String getPolicyMessage(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return m54207b69.F54207b69_11("Y*5F45434749624A");
    case 6: 
      return m54207b69.F54207b69_11("TU3421333F3E0F2B4141454037163048483049421D343A");
    case 5: 
      return m54207b69.F54207b69_11("l'465345514C7D5D4F53574E69845E565A625B548B575D6660");
    case 4: 
      return m54207b69.F54207b69_11("Ea0015070B1243171515110C234A1F231D21");
    case 3: 
      return m54207b69.F54207b69_11("?r1308181E2132082426241B16390D2510173029");
    case 2: 
      return m54207b69.F54207b69_11("c>5F4C5C5A556654585A6067526D5B6D5A5D6C");
    case 1: 
      return m54207b69.F54207b69_11("19584D5F535A6B4F5D5D59644B7256636750");
    }
    return m54207b69.F54207b69_11("AC2237292D3021393337332A45283A3A3C36");
  }
  
  public static final String getRecordClientId(int paramInt)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("DC0237292D301832363229442711393F2B2137323F453C");
    localStringBuilder.append(str);
    localStringBuilder.append(paramInt);
    return localStringBuilder.toString();
  }
  
  public static String getStreamTypeString(int paramInt)
  {
    int i = 9;
    if (paramInt != i)
    {
      switch (paramInt)
      {
      default: 
        switch (paramInt)
        {
        default: 
          return m54207b69.F54207b69_11("Y*5F45434749624A");
        }
      case 7: 
        return m54207b69.F54207b69_11("l/5C5C5F4D524776635E6565554E7D585059516F5F5E60");
      case 6: 
        return m54207b69.F54207b69_11("|V252326363B400F3B422C3D2D4546304D1936474C");
      case 5: 
        return m54207b69.F54207b69_11("`X2B2D2C403D3A0D3D3F353B493D48473B414848");
      case 4: 
        return m54207b69.F54207b69_11("Hl1F19200C11063914661126");
      case 3: 
        return m54207b69.F54207b69_11("w.5D5B5E4E5348774A5353515A");
      case 2: 
        return m54207b69.F54207b69_11("3\\2F29303C413609353D3B45");
      case 1: 
        return m54207b69.F54207b69_11("2l1F19200C1106390915230F");
      }
      return m54207b69.F54207b69_11("z|0F09101C211629111B1E29242F2C2B1F20");
      return m54207b69.F54207b69_11("b=4E4A515B605568525A5D57");
      return m54207b69.F54207b69_11("ga12161507041144071C22");
      return m54207b69.F54207b69_11("V6454346565B606F6648626762");
      return m54207b69.F54207b69_11("9d17111804090E411D0D091716");
      return m54207b69.F54207b69_11(":J393F3A322F2C1B3F37322F433A");
      return m54207b69.F54207b69_11("_k18201B110E0B3A1F1216182A1E412D112B");
    }
    return m54207b69.F54207b69_11("Hf151316060B103F191A1E");
  }
  
  public static boolean isCommunicationStreamType(int paramInt)
  {
    if (paramInt != 0)
    {
      int i = 2;
      if (paramInt != i)
      {
        i = 6;
        if (paramInt != i)
        {
          i = 24;
          if (paramInt != i) {
            return false;
          }
        }
      }
    }
    return true;
  }
  
  private boolean isConnected()
  {
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      boolean bool;
      if (localIAudioPolicyService != null)
      {
        bool = true;
      }
      else
      {
        bool = false;
        localIAudioPolicyService = null;
      }
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public static boolean isMediaStreamType(int paramInt)
  {
    int i = 3;
    boolean bool = true;
    if (paramInt != i)
    {
      i = 4;
      if (paramInt != i)
      {
        i = 21;
        if (paramInt != i)
        {
          i = 23;
          if (paramInt != i) {
            return false;
          }
        }
      }
    }
    return bool;
  }
  
  public final void OooOOoo(AudioPolicyManager.OnInitListener paramOnInitListener)
  {
    List localList1 = this.OooOOO;
    if (paramOnInitListener != null) {}
    try
    {
      List localList2 = this.OooOOO;
      boolean bool = localList2.contains(paramOnInitListener);
      if (!bool)
      {
        localList2 = this.OooOOO;
        localList2.add(paramOnInitListener);
      }
      return;
    }
    finally {}
  }
  
  public final void OooOo()
  {
    synchronized (this.OooOOOo)
    {
      Object localObject2 = this.OooO0OO;
      localObject2 = ((HashMap)localObject2).keySet();
      localObject2 = ((Set)localObject2).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        Object localObject4 = this.OooO0OO;
        Object localObject5 = ((Iterator)localObject2).next();
        localObject4 = ((HashMap)localObject4).get(localObject5);
        localObject4 = (AudioPolicyManager.OnAudioPolicyListener)localObject4;
        if (localObject4 != null) {
          ((AudioPolicyManager.OnAudioPolicyListener)localObject4).onStop();
        }
      }
      localObject2 = this.OooO0OO;
      ((HashMap)localObject2).clear();
      return;
    }
  }
  
  public final void OooOo0(boolean paramBoolean)
  {
    synchronized (this.OooOOO)
    {
      Object localObject1 = this.OooOOO;
      localObject1 = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject1).hasNext();
        if (!bool) {
          break;
        }
        Object localObject2 = ((Iterator)localObject1).next();
        localObject2 = (AudioPolicyManager.OnInitListener)localObject2;
        if (localObject2 != null) {
          ((AudioPolicyManager.OnInitListener)localObject2).OooO00o(paramBoolean);
        }
      }
      return;
    }
  }
  
  public final void OooOo00()
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    Object localObject = OooOOo0;
    localIntent.setAction((String)localObject);
    localObject = OooOOo;
    localIntent.setPackage((String)localObject);
    localObject = this.OooO;
    ServiceConnection localServiceConnection = this.OooO00o;
    int i = 1;
    boolean bool = ((Context)localObject).bindService(localIntent, localServiceConnection, i);
    if (!bool)
    {
      bool = false;
      localIntent = null;
      OooOo0(false);
    }
  }
  
  public final void OooOo0O(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = 24;
      if (paramInt <= i) {
        return;
      }
    }
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = m54207b69.F54207b69_11(">U373533782A262D373C417F2C38323E84");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(paramInt);
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localObject = ((StringBuilder)localObject).toString();
    localIllegalArgumentException.<init>((String)localObject);
    throw localIllegalArgumentException;
  }
  
  public final AudioPolicyManager.OnAudioPolicyListener OooOo0o(String paramString)
  {
    return (AudioPolicyManager.OnAudioPolicyListener)this.OooO0OO.get(paramString);
  }
  
  public void OooOoO0(boolean paramBoolean, int paramInt)
  {
    try
    {
      localObject = this.OooO0Oo;
      if (localObject != null) {
        ((IAudioPolicyService)localObject).o00OO000(paramBoolean, paramInt);
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      Object localObject = m54207b69.F54207b69_11("p'5443556D4A5959495D735C5E4E14506E54536966625D5F34");
      localStringBuilder.append((String)localObject);
      String str = localRemoteException.getMessage();
      localStringBuilder.append(str);
      OooOo00();
    }
  }
  
  public AudioPolicyInfo getA2dpAudioPolicyInfo()
  {
    AudioPolicyInfo localAudioPolicyInfo = null;
    try
    {
      Object localObject1 = this.OooO0Oo;
      if (localObject1 != null)
      {
        localObject1 = this.OooO;
        localObject1 = ((Context)localObject1).getPackageName();
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str3 = ")-4A495B6F234E637360524E4D894F4F535E6576565F5723745E5C665B6434";
        str3 = m54207b69.F54207b69_11(str3);
        ((StringBuilder)localObject2).append(str3);
        ((StringBuilder)localObject2).append((String)localObject1);
        if (localObject1 == null)
        {
          localObject1 = this.OooO0Oo;
          localObject2 = ":^0B313733352E36";
          localObject2 = m54207b69.F54207b69_11((String)localObject2);
          localAudioPolicyInfo = ((IAudioPolicyService)localObject1).o0OoOoOo((String)localObject2);
        }
        else
        {
          localObject2 = this.OooO0Oo;
          localAudioPolicyInfo = ((IAudioPolicyService)localObject2).o0OoOoOo((String)localObject1);
        }
      }
      else
      {
        OooOo00();
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str3 = m54207b69.F54207b69_11("tg0003152959081D2D1A0C18134315191D142F401C151D5D402A242552242B2732223669254329283E3B37323489");
      ((StringBuilder)localObject2).append(str3);
      String str1 = localNullPointerException.getMessage();
      ((StringBuilder)localObject2).append(str1);
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str3 = m54207b69.F54207b69_11("}.494C5C72204F64766353514C8A4E50565D6879535C5624626E66657976645F5F34");
      ((StringBuilder)localObject2).append(str3);
      String str2 = localRemoteException.getMessage();
      ((StringBuilder)localObject2).append(str2);
      OooOo00();
    }
    return localAudioPolicyInfo;
  }
  
  public int getArkarmysMode()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getArkarmysMode();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("\\x1F1E0E3C0E181F111D0A154023292B672D112D301C21272E2E5B");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int getAtmosMode()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getAtmosMode();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("&0575646744862654A85685E601C6256626551566C737320");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public List getAudioClients()
  {
    List localList = null;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        localList = localIAudioPolicyService.getAudioClients();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("Pf0104142A170715102D13190E141F2355132F17162A2725202075");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return localList;
  }
  
  public List getAudioPolicyInfo(int paramInt)
  {
    Object localObject1 = null;
    try
    {
      localObject2 = this.OooO0Oo;
      if (localObject2 != null)
      {
        List localList = ((IAudioPolicyService)localObject2).getAudioPolicyInfo(paramInt);
        localObject1 = localList;
      }
      else
      {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str2 = m54207b69.F54207b69_11("YA26253703382A2E35193737332E45163E373F73374D373A484D41484A97");
      ((StringBuilder)localObject2).append(str2);
      String str1 = localRemoteException.getMessage();
      ((StringBuilder)localObject2).append(str1);
      OooOo00();
    }
    return localObject1;
  }
  
  public int getBTSourceVolume()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getBTSourceVolume();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("\\F21243407161A2F3A3C2E2D1B3537413A3377355139384C4947424297");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int[] getBalanceFaderLevel()
  {
    int i = -1;
    int[] arrayOfInt = { i, i };
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        arrayOfInt = localIAudioPolicyService.getBalanceFaderLevel();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("NS3437291436443844383F1F3D43432F2E46364852874B41474E3C4155585A87");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return arrayOfInt;
  }
  
  public int getBandValue(int paramInt)
  {
    int i = -1;
    try
    {
      localObject = this.OooO0Oo;
      if (localObject != null)
      {
        paramInt = ((IAudioPolicyService)localObject).getBandValue(paramInt);
        i = paramInt;
      }
      else
      {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = m54207b69.F54207b69_11("4<5B5A4A8161575E71655953642866526E695D5A6867671C");
      ((StringBuilder)localObject).append(str2);
      String str1 = localRemoteException.getMessage();
      ((StringBuilder)localObject).append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int getBassFreq()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getBassFreq();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("1g000315280A191A281D0B20520E2C12112724201B1D72");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int getCanDspType()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getCanDspType();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("Yy1E1D0F3D1C1C431111360A1428662A102A2D1B20242B2D5A");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int getChannel()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getChannel();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("Y&41445468524C4E4F4B53104E6A52516562605B5B30");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int getChimeMode()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getChimeMode();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("YZ3D40301C36383D461F3E484A864C30484F3B4046494976");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public AudioPolicyInfo getCurrAudioPolicyInfoByChannel(int paramInt)
  {
    Object localObject1 = null;
    try
    {
      localObject2 = this.OooO0Oo;
      if (localObject2 != null)
      {
        AudioPolicyInfo localAudioPolicyInfo = ((IAudioPolicyService)localObject2).getCurrAudioPolicyInfoByChannel(paramInt);
        localObject1 = localAudioPolicyInfo;
      }
      else
      {
        OooOo00();
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str3 = m54207b69.F54207b69_11("Gf0104142817191A2E1B0B19144216181E1530411B141E3A363D2721232420286548342C2D5A2E352F3A2C3E712F4B33324643413C3C91");
      ((StringBuilder)localObject2).append(str3);
      String str1 = localNullPointerException.getMessage();
      ((StringBuilder)localObject2).append(str1);
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str3 = m54207b69.F54207b69_11(".?585B4D7F4E5253855264605B7B5D61656C5788646D65935D9470786C6D77713E7A687E7D73707C77792E");
      ((StringBuilder)localObject2).append(str3);
      String str2 = localRemoteException.getMessage();
      ((StringBuilder)localObject2).append(str2);
      OooOo00();
    }
    return localObject1;
  }
  
  public AudioPolicyInfo getCurrMediaAudioPolicyInfoByChannel(int paramInt)
  {
    Object localObject1 = null;
    try
    {
      localObject2 = this.OooO0Oo;
      if (localObject2 != null)
      {
        AudioPolicyInfo localAudioPolicyInfo = ((IAudioPolicyService)localObject2).getCurrMediaAudioPolicyInfoByChannel(paramInt);
        localObject1 = localAudioPolicyInfo;
      }
      else
      {
        OooOo00();
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str3 = m54207b69.F54207b69_11("LA26253705383839132C2E322B0C4133373E2240403C374E1F4740481E541F473F4F50465085345A54553A58535B62526291556B5558666B5F6668B5");
      ((StringBuilder)localObject2).append(str3);
      String str1 = localNullPointerException.getMessage();
      ((StringBuilder)localObject2).append(str1);
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str3 = m54207b69.F54207b69_11("c:5D60507C534D4E7E67675D66875C6C62657B6769676E598A6C756F935F96707A747581793E8468808773787E81812E");
      ((StringBuilder)localObject2).append(str3);
      String str2 = localRemoteException.getMessage();
      ((StringBuilder)localObject2).append(str2);
      OooOo00();
    }
    return localObject1;
  }
  
  public AudioPolicyInfo getCurrentAudioPolicyInfo()
  {
    return getAudioPolicyInfoByType(0);
  }
  
  public AudioPolicyInfo getCurrentCommunicationInfo()
  {
    return getAudioPolicyInfoByType(2);
  }
  
  public AudioPolicyInfo getCurrentMediaInfo()
  {
    return getAudioPolicyInfoByType(1);
  }
  
  public int getDtsMode()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getDtsMode();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("s<5B5A4A7B4C54775A60622664506C675B586665651A");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int[] getEQDefault()
  {
    int[] arrayOfInt = null;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        arrayOfInt = localIAudioPolicyService.getEQDefault();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("c$43425264796547494D5A525B104E6A56516562605F5F34");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return arrayOfInt;
  }
  
  public AudioEQMode getEQMode()
  {
    AudioEQMode localAudioEQMode = null;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        localAudioEQMode = localIAudioPolicyService.getEQMode();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("n(4F4E5E707D6A4D535511575B575A666B51585825");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return localAudioEQMode;
  }
  
  public AudioEQMode getEQModeByIndex(int paramInt)
  {
    Object localObject1 = null;
    try
    {
      localObject2 = this.OooO0Oo;
      if (localObject2 != null)
      {
        AudioEQMode localAudioEQMode = ((IAudioPolicyService)localObject2).getEQModeByIndex(paramInt);
        localObject1 = localAudioEQMode;
      }
      else
      {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str2 = m54207b69.F54207b69_11("~H2F2E3E101D0A2D3335133B0C32393B3F783E423E414D52383F3F8C");
      ((StringBuilder)localObject2).append(str2);
      String str1 = localRemoteException.getMessage();
      ((StringBuilder)localObject2).append(str1);
      OooOo00();
    }
    return localObject1;
  }
  
  public int getEQModeIndex()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getEQModeIndex();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("L}1A190B3B30351820203D1D2424126B27152F2A201D29282A5F");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int getHighFreq()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getHighFreq();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("jv11140441231624370C1C11611F1B23221613312C2C61");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int getHintToneState()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getHintToneState();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("['40435572524E597A50524C7F5F53615117537157566C6965606237");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public AudioPolicyInfo getLastMediaAudioPolicyInfoByChannel(int paramInt)
  {
    Object localObject1 = null;
    try
    {
      localObject2 = this.OooO0Oo;
      if (localObject2 != null)
      {
        AudioPolicyInfo localAudioPolicyInfo = ((IAudioPolicyService)localObject2).getLastMediaAudioPolicyInfoByChannel(paramInt);
        localObject1 = localAudioPolicyInfo;
      }
      else
      {
        OooOo00();
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str3 = m54207b69.F54207b69_11("Zk0C0F212A0E1D252D16180C15362B1D11144C161A161D28391D261E442E4521292526302A6F4A442E2F642E2D314C3C487B3F453B425055393C3E8B");
      ((StringBuilder)localObject2).append(str3);
      String str1 = localNullPointerException.getMessage();
      ((StringBuilder)localObject2).append(str1);
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str3 = m54207b69.F54207b69_11(">D2322320B293C361029293730113E2E3C3B253D3B413C5324423B452159244A444A4B434B8846624E495D5A585757AC");
      ((StringBuilder)localObject2).append(str3);
      String str2 = localRemoteException.getMessage();
      ((StringBuilder)localObject2).append(str2);
      OooOo00();
    }
    return localObject1;
  }
  
  public int getLoudnessState()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getLoudnessState();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("B354574982604B5D645E494A6B535F556523675D636A585D71747623");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int getLowFreq()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getLowFreq();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("az1D2010391912420F2714642A0E262D191E24272754");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int getMaxBalanceFaderLevel()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getMaxBalanceFaderLevel();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("OS3437292136301739473B473B4222404646321745533B4C8A4E444A513F44585B5D8A");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int getMaxBandIndex()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getMaxBandIndex();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("%a0605172F041E2907170E321A11112750142A1417252A1E252774");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int getMaxBandValue()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getMaxBandValue();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("V-4A495B63505A75534B5285574D65561C5866605B716E5A595B30");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int getMidFreq()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getMidFreq();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("-L2B2A3A04292D104531467634403C374B483635358A");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int getMixPolicy()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getMixPolicy();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("42555848825F4F686466645B561E6458606753586E71711E");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int getPhoneMixPolicy()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getPhoneMixPolicy();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("kc040719360F11130D3613253E181C180F2A54182E141B292E22252774");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int getReversePolicy()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getReversePolicy();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("J3545749645A4A5C48485F6D676B675E5923675D636A585D71747623");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int getScreenSoundState()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getScreenSoundState();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("&?585B4D6F6052606159755A555D687A5A6E5C6C326E5C72716764706B6D22");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int getSoundFeature()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getSoundFeature();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("OG202335172C372F2A092B303E3E423076325036354B48443F4196");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int getSoundField()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getSoundField();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("aQ363527054229453C1F413E48417E4238424533384C535582");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int getSpeedCoefMode()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getSpeedCoefMode();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("1&414454785A4849496D524D4B76505E525A17557159586C6967626237");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int getStreamMaxVolume(int paramInt)
  {
    OooOo0O(paramInt);
    int i = -1;
    try
    {
      localObject = this.OooO0Oo;
      if (localObject != null)
      {
        paramInt = ((IAudioPolicyService)localObject).getStreamMaxVolume(paramInt);
        i = paramInt;
      }
      else
      {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = m54207b69.F54207b69_11("b,4B4A5A825C634F54496A575F86504E68515A1E5C68645F73705E5D5D32");
      ((StringBuilder)localObject).append(str2);
      String str1 = localRemoteException.getMessage();
      ((StringBuilder)localObject).append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int getStreamVolume(int paramInt)
  {
    OooOo0O(paramInt);
    int i = -1;
    try
    {
      localObject = this.OooO0Oo;
      if (localObject != null)
      {
        paramInt = ((IAudioPolicyService)localObject).getStreamVolume(paramInt);
        i = paramInt;
      }
      else
      {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = m54207b69.F54207b69_11("22555848644A455D5A676D6769536C6521675B636A565B71747421");
      ((StringBuilder)localObject).append(str2);
      String str1 = localRemoteException.getMessage();
      ((StringBuilder)localObject).append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int getSubwooferMode()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getSubwooferMode();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("v~191C0C300F210F181921253E1D27296D2B172F2E221F2D28285D");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public int getVehicleState()
  {
    int i = -1;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        i = localIAudioPolicyService.getVehicleState();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("FH2F2E3E21312527322C36254735493B773D413D404C51373E3E8B");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return i;
  }
  
  public boolean isAtmos()
  {
    boolean bool = false;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        bool = localIAudioPolicyService.isAtmos();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("NK22390C422A293E72363C3239474C30333582");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return bool;
  }
  
  public boolean isBTSourceConnected()
  {
    boolean bool = false;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        bool = localIAudioPolicyService.isBTSourceConnected();
      } else {
        OooOo00();
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      str3 = m54207b69.F54207b69_11("li001B2D403E0B22221215341113141A192D1D1F5C3B311B1C511F1A22392939682C322C2F3D42262D2F7C");
      localStringBuilder.append(str3);
      String str1 = localNullPointerException.getMessage();
      localStringBuilder.append(str1);
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str3 = m54207b69.F54207b69_11(":+42596B827C4964605057724F51525C576F5F611E62685E6573785C5F612E");
      localStringBuilder.append(str3);
      String str2 = localRemoteException.getMessage();
      localStringBuilder.append(str2);
      OooOo00();
    }
    return bool;
  }
  
  public boolean isBabyInCar()
  {
    boolean bool = false;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        bool = localIAudioPolicyService.isBabyInCar();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("3Z332A1A3E3C28193B214432854B2F474E3A3F45484875");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return bool;
  }
  
  public boolean isDtsEnabled()
  {
    boolean bool = false;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        bool = localIAudioPolicyService.isDtsEnabled();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("=e0C1723141A25110B0F120A0C510D2B151026231F1E2075");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return bool;
  }
  
  public boolean isInCall()
  {
    boolean bool = false;
    try
    {
      Object localObject1 = this.OooO0Oo;
      if (localObject1 != null)
      {
        localObject1 = this.OooO;
        localObject1 = ((Context)localObject1).getPackageName();
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str3 = "p@29340B3107263233683935392D3A3389";
        str3 = m54207b69.F54207b69_11(str3);
        ((StringBuilder)localObject2).append(str3);
        ((StringBuilder)localObject2).append((String)localObject1);
        if (localObject1 == null)
        {
          localObject1 = this.OooO0Oo;
          localObject2 = ":^0B313733352E36";
          localObject2 = m54207b69.F54207b69_11((String)localObject2);
          bool = ((IAudioPolicyService)localObject1).o000Ooo((String)localObject2);
        }
        else
        {
          localObject2 = this.OooO0Oo;
          bool = ((IAudioPolicyService)localObject2).o000Ooo((String)localObject1);
        }
      }
      else
      {
        OooOo00();
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      str3 = m54207b69.F54207b69_11("DW3E25203C183B41427F222C464714464D493444388B47454B4A403D5954568B");
      ((StringBuilder)localObject2).append(str3);
      String str1 = localNullPointerException.getMessage();
      ((StringBuilder)localObject2).append(str1);
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str3 = m54207b69.F54207b69_11("s8514C73597F5E5A5B20664A6669555A60676714");
      ((StringBuilder)localObject2).append(str3);
      String str2 = localRemoteException.getMessage();
      ((StringBuilder)localObject2).append(str2);
      OooOo00();
    }
    return bool;
  }
  
  public boolean isInIVoka()
  {
    boolean bool = false;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        bool = localIAudioPolicyService.isInIVoka();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("k)405B624A64844C495012565C5659676C50575926");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return bool;
  }
  
  public boolean isMasterMute()
  {
    boolean bool = false;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        bool = localIAudioPolicyService.isMasterMute();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("3G2E350C293838283C123B3D2D732F4D33324845413C3E93");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return bool;
  }
  
  public boolean isMediaPlaying()
  {
    boolean bool = false;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        bool = localIAudioPolicyService.isMediaPlaying();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("wt1D083B1414221B2B201E1728262062201C2823171432313166");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return bool;
  }
  
  public boolean isMicMute()
  {
    boolean bool = false;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        bool = localIAudioPolicyService.isMicMute();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("^_362D1439401730324288443248473D3A46414378");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return bool;
  }
  
  public boolean isNaviMix()
  {
    boolean bool = true;
    try
    {
      IAudioPolicyService localIAudioPolicyService = this.OooO0Oo;
      if (localIAudioPolicyService != null) {
        bool = localIAudioPolicyService.isNaviMix();
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("zy100B391B13153A170962260C2629171C20272956");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOo00();
    }
    return bool;
  }
  
  public boolean isStreamMute(int paramInt)
  {
    OooOo0O(paramInt);
    int i = 0;
    try
    {
      localObject = this.OooO0Oo;
      if (localObject != null)
      {
        paramInt = ((IAudioPolicyService)localObject).isStreamMute(paramInt);
        i = paramInt;
      }
      else
      {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = m54207b69.F54207b69_11("CZ332A0B312C44413E1F38384A864C30484F3B4046494976");
      ((StringBuilder)localObject).append(str2);
      String str1 = localRemoteException.getMessage();
      ((StringBuilder)localObject).append(str1);
      OooOo00();
    }
    return i;
  }
  
  public void setEQModeByIndex(int paramInt, int[] paramArrayOfInt)
  {
    try
    {
      localObject = this.OooO0Oo;
      if (localObject != null) {
        ((IAudioPolicyService)localObject).setEQModeByIndex(paramInt, paramArrayOfInt);
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      paramArrayOfInt = new java/lang/StringBuilder;
      paramArrayOfInt.<init>();
      Object localObject = m54207b69.F54207b69_11("Pe16011323382D100808302637170E0E2C55112F19142A2723222479");
      paramArrayOfInt.append((String)localObject);
      String str = localRemoteException.getMessage();
      paramArrayOfInt.append(str);
      OooOo00();
    }
  }
  
  public void setEcnr(boolean paramBoolean)
  {
    try
    {
      localObject = this.OooO0Oo;
      if (localObject != null) {
        ((IAudioPolicyService)localObject).setEcnr(paramBoolean);
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = m54207b69.F54207b69_11("X+584F61714C4A5F12565C5259676C50535522");
      ((StringBuilder)localObject).append(str2);
      String str1 = localRemoteException.getMessage();
      ((StringBuilder)localObject).append(str1);
      OooOo00();
    }
  }
  
  public void setMasterMute(boolean paramBoolean)
  {
    OooOoO0(paramBoolean, 0);
  }
  
  public void setNaviMix(boolean paramBoolean)
  {
    try
    {
      localObject = this.OooO0Oo;
      if (localObject != null) {
        ((IAudioPolicyService)localObject).setNaviMix(paramBoolean);
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = m54207b69.F54207b69_11("%p03160641150B1F4421115A201420230F142A31315E");
      ((StringBuilder)localObject).append(str2);
      String str1 = localRemoteException.getMessage();
      ((StringBuilder)localObject).append(str1);
      OooOo00();
    }
  }
  
  public void setStreamMute(int paramInt, boolean paramBoolean)
  {
    OooOo0O(paramInt);
    try
    {
      localObject = this.OooO0Oo;
      if (localObject != null) {
        ((IAudioPolicyService)localObject).setStreamMute(paramInt, paramBoolean);
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      Object localObject = m54207b69.F54207b69_11(";F352434183639292E33143D3D2F73314D35344845433E3E93");
      localStringBuilder.append((String)localObject);
      String str = localRemoteException.getMessage();
      localStringBuilder.append(str);
      OooOo00();
    }
  }
  
  public void setVoiceMute(boolean paramBoolean)
  {
    try
    {
      localObject = this.OooO0Oo;
      if (localObject != null) {
        ((IAudioPolicyService)localObject).setVoiceMute(paramBoolean);
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = m54207b69.F54207b69_11("0:4960506F59585F667F58586A266C50686F5B6066696916");
      ((StringBuilder)localObject).append(str2);
      String str1 = localRemoteException.getMessage();
      ((StringBuilder)localObject).append(str1);
      OooOo00();
    }
  }
  
  public void setXCallState(boolean paramBoolean)
  {
    try
    {
      localObject = this.OooO0Oo;
      if (localObject != null) {
        ((IAudioPolicyService)localObject).setXCallState(paramBoolean);
      } else {
        OooOo00();
      }
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = m54207b69.F54207b69_11("u$5742527F6B4A4E4F7F594F5B4D114F6B5752666361606035");
      ((StringBuilder)localObject).append(str2);
      String str1 = localRemoteException.getMessage();
      ((StringBuilder)localObject).append(str1);
      OooOo00();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.audiopolicy.AudioPolicyManager
 * JD-Core Version:    0.7.0.1
 */
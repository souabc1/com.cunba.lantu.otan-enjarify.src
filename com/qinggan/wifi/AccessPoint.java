package com.qinggan.wifi;

import android.content.Context;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.net.NetworkInfo.State;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TtsSpan.Builder;
import android.text.style.TtsSpan.VerbatimBuilder;
import android.util.LruCache;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import m54207b69;

public class AccessPoint
  implements Comparable
{
  public AccessPoint.AccessPointListener o00OoOoo;
  public final Context o00Ooo0;
  public WifiConfiguration o00Ooo00;
  public WifiInfo o00Ooo0O;
  public NetworkInfo o00Ooo0o;
  public LruCache o00OooO;
  public int o00OooO0;
  public long o00OooOO;
  public Object o00OooOo;
  public int o00OoooO;
  public int o00Ooooo;
  public String o00o0000;
  public int o0O00o0;
  
  public AccessPoint(Context paramContext, ScanResult paramScanResult)
  {
    LruCache localLruCache = new android/util/LruCache;
    localLruCache.<init>(32);
    this.o00OooO = localLruCache;
    this.o0O00o0 = -1;
    this.o00OoooO = 0;
    this.o00OooO0 = (-1 >>> 1);
    this.o00OooOO = 0L;
    this.o00Ooo0 = paramContext;
    OooO0oO(paramScanResult);
  }
  
  public AccessPoint(Context paramContext, WifiConfiguration paramWifiConfiguration)
  {
    LruCache localLruCache = new android/util/LruCache;
    localLruCache.<init>(32);
    this.o00OooO = localLruCache;
    this.o0O00o0 = -1;
    this.o00OoooO = 0;
    this.o00OooO0 = (-1 >>> 1);
    this.o00OooOO = 0L;
    this.o00Ooo0 = paramContext;
    OooO(paramWifiConfiguration);
  }
  
  public static int OooO0Oo(ScanResult paramScanResult)
  {
    Object localObject = paramScanResult.capabilities;
    String str1 = m54207b69.F54207b69_11("`p27213360242841");
    boolean bool1 = ((String)localObject).contains(str1);
    str1 = paramScanResult.capabilities;
    String str2 = m54207b69.F54207b69_11(",*7D7B6D1B0B7F7F68");
    boolean bool2 = str1.contains(str2);
    if ((bool2) && (bool1)) {
      return 3;
    }
    if (bool2) {
      return 2;
    }
    if (bool1) {
      return 1;
    }
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    str1 = m54207b69.F54207b69_11("e?6D5B5E5D5A4E60622767675C5C5A606D63306B66726D35636366706C74223D");
    ((StringBuilder)localObject).append(str1);
    paramScanResult = paramScanResult.capabilities;
    ((StringBuilder)localObject).append(paramScanResult);
    return 0;
  }
  
  public static int OooO0o(WifiConfiguration paramWifiConfiguration)
  {
    BitSet localBitSet = paramWifiConfiguration.allowedKeyManagement;
    int i = 1;
    boolean bool = localBitSet.get(i);
    int j = 2;
    if (bool) {
      return j;
    }
    localBitSet = paramWifiConfiguration.allowedKeyManagement;
    bool = localBitSet.get(j);
    j = 3;
    if (!bool)
    {
      localBitSet = paramWifiConfiguration.allowedKeyManagement;
      bool = localBitSet.get(j);
      if (!bool)
      {
        paramWifiConfiguration = paramWifiConfiguration.wepKeys;
        bool = false;
        localBitSet = null;
        paramWifiConfiguration = paramWifiConfiguration[0];
        if (paramWifiConfiguration == null) {
          i = 0;
        }
        return i;
      }
    }
    return j;
  }
  
  public static int OooO0o0(ScanResult paramScanResult)
  {
    String str1 = paramScanResult.capabilities;
    String str2 = "WEP";
    boolean bool1 = str1.contains(str2);
    if (bool1) {
      return 1;
    }
    str1 = paramScanResult.capabilities;
    str2 = "PSK";
    bool1 = str1.contains(str2);
    if (bool1) {
      return 2;
    }
    paramScanResult = paramScanResult.capabilities;
    str1 = "EAP";
    boolean bool2 = paramScanResult.contains(str1);
    if (bool2) {
      return 3;
    }
    return 0;
  }
  
  public static String OooOO0o(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool) {
      return "";
    }
    int i = paramString.length();
    int j = 1;
    if (i > j)
    {
      int k = paramString.charAt(0);
      int m = 34;
      if (k == m)
      {
        i -= j;
        k = paramString.charAt(i);
        if (k == m) {
          paramString = paramString.substring(j, i);
        }
      }
    }
    return paramString;
  }
  
  public static String OooOOO0(int paramInt1, int paramInt2)
  {
    int i = 1;
    if (paramInt1 == i) {
      return "WEP";
    }
    int j = 3;
    int k = 2;
    if (paramInt1 == k)
    {
      if (paramInt2 == i) {
        return "WPA";
      }
      if (paramInt2 == k) {
        return m54207b69.F54207b69_11("-^090F216F");
      }
      if (paramInt2 == j) {
        return m54207b69.F54207b69_11("AP070113120B051769");
      }
      return "PSK";
    }
    if (paramInt1 == j) {
      return "EAP";
    }
    return m54207b69.F54207b69_11("fS1D1D1F19");
  }
  
  private String getVisibilityStatus()
  {
    return "";
  }
  
  public void OooO(WifiConfiguration paramWifiConfiguration)
  {
    boolean bool = paramWifiConfiguration.isPasspoint();
    String str;
    if (bool) {
      str = paramWifiConfiguration.providerFriendlyName;
    }
    for (;;)
    {
      this.o00o0000 = str;
      break;
      str = paramWifiConfiguration.SSID;
      if (str == null) {
        str = "";
      } else {
        str = OooOO0o(str);
      }
    }
    int i = OooO0o(paramWifiConfiguration);
    this.o00Ooooo = i;
    i = paramWifiConfiguration.networkId;
    this.o0O00o0 = i;
    this.o00Ooo00 = paramWifiConfiguration;
  }
  
  public void OooO0O0()
  {
    this.o00Ooo00 = null;
    this.o0O00o0 = -1;
  }
  
  public int OooO0OO(AccessPoint paramAccessPoint)
  {
    boolean bool = isActive();
    int j = -1;
    if (bool)
    {
      bool = paramAccessPoint.isActive();
      if (!bool) {
        return j;
      }
    }
    bool = isActive();
    int k = 1;
    if (!bool)
    {
      bool = paramAccessPoint.isActive();
      if (bool) {
        return k;
      }
    }
    int i = this.o00OooO0;
    int m = -1 >>> 1;
    int n;
    if (i != m)
    {
      n = paramAccessPoint.o00OooO0;
      if (n == m) {
        return j;
      }
    }
    if (i == m)
    {
      n = paramAccessPoint.o00OooO0;
      if (n != m) {
        return k;
      }
    }
    m = this.o0O00o0;
    if (m != j)
    {
      n = paramAccessPoint.o0O00o0;
      if (n == j) {
        return j;
      }
    }
    if (m == j)
    {
      m = paramAccessPoint.o0O00o0;
      if (m != j) {
        return k;
      }
    }
    j = paramAccessPoint.o00OooO0;
    i = WifiManager.compareSignalLevel(j, i);
    if (i != 0) {
      return i;
    }
    String str = this.o00o0000;
    paramAccessPoint = paramAccessPoint.o00o0000;
    return str.compareToIgnoreCase(paramAccessPoint);
  }
  
  public final void OooO0oO(ScanResult paramScanResult)
  {
    String str = paramScanResult.SSID;
    this.o00o0000 = str;
    int i = OooO0o0(paramScanResult);
    this.o00Ooooo = i;
    int j = 2;
    if (i == j)
    {
      i = OooO0Oo(paramScanResult);
      this.o00OoooO = i;
    }
    i = paramScanResult.level;
    this.o00OooO0 = i;
    long l = paramScanResult.timestamp;
    this.o00OooOO = l;
  }
  
  public final boolean OooO0oo(WifiConfiguration paramWifiConfiguration, WifiInfo paramWifiInfo)
  {
    boolean bool = isPasspoint();
    if (!bool)
    {
      int i = this.o0O00o0;
      int j = -1;
      if (i != j)
      {
        int k = paramWifiInfo.getNetworkId();
        if (i == k)
        {
          k = 1;
        }
        else
        {
          k = 0;
          paramWifiConfiguration = null;
        }
        return k;
      }
    }
    if (paramWifiConfiguration != null) {
      return OooOO0O(paramWifiConfiguration);
    }
    paramWifiConfiguration = this.o00o0000;
    paramWifiInfo = OooOO0o(paramWifiInfo.getSSID());
    return paramWifiConfiguration.equals(paramWifiInfo);
  }
  
  public boolean OooOO0(ScanResult paramScanResult)
  {
    String str1 = this.o00o0000;
    String str2 = paramScanResult.SSID;
    boolean bool = str1.equals(str2);
    if (bool)
    {
      int i = this.o00Ooooo;
      j = OooO0o0(paramScanResult);
      if (i == j)
      {
        j = 1;
        break label52;
      }
    }
    int j = 0;
    paramScanResult = null;
    label52:
    return j;
  }
  
  public boolean OooOO0O(WifiConfiguration paramWifiConfiguration)
  {
    boolean bool = paramWifiConfiguration.isPasspoint();
    if (bool)
    {
      localObject = this.o00Ooo00;
      if (localObject != null)
      {
        bool = ((WifiConfiguration)localObject).isPasspoint();
        if (bool)
        {
          paramWifiConfiguration = paramWifiConfiguration.FQDN;
          localObject = this.o00Ooo00.providerFriendlyName;
          return paramWifiConfiguration.equals(localObject);
        }
      }
    }
    Object localObject = this.o00o0000;
    String str = OooOO0o(paramWifiConfiguration.SSID);
    bool = ((String)localObject).equals(str);
    if (bool)
    {
      int i = this.o00Ooooo;
      j = OooO0o(paramWifiConfiguration);
      if (i == j)
      {
        j = 1;
        break label99;
      }
    }
    int j = 0;
    paramWifiConfiguration = null;
    label99:
    return j;
  }
  
  public void OooOOO(WifiConfiguration paramWifiConfiguration)
  {
    this.o00Ooo00 = paramWifiConfiguration;
    int i = paramWifiConfiguration.networkId;
    this.o0O00o0 = i;
    paramWifiConfiguration = this.o00OoOoo;
    if (paramWifiConfiguration != null) {
      paramWifiConfiguration.OooO00o(this);
    }
  }
  
  public boolean OooOOOO(ScanResult paramScanResult)
  {
    boolean bool = OooOO0(paramScanResult);
    if (bool)
    {
      Object localObject = this.o00OooO;
      String str = paramScanResult.BSSID;
      ((LruCache)localObject).get(str);
      localObject = this.o00OooO;
      str = paramScanResult.BSSID;
      ((LruCache)localObject).put(str, paramScanResult);
      int i = getLevel();
      int j = getRssi();
      long l = getSeen();
      this.o00OooOO = l;
      int k = getRssi() + j;
      j = 2;
      k /= j;
      this.o00OooO0 = k;
      k = getLevel();
      if ((k > 0) && (k != i))
      {
        localObject = this.o00OoOoo;
        if (localObject != null) {
          ((AccessPoint.AccessPointListener)localObject).OooO0O0(this);
        }
      }
      i = this.o00Ooooo;
      if (i == j)
      {
        int m = OooO0Oo(paramScanResult);
        this.o00OoooO = m;
      }
      paramScanResult = this.o00OoOoo;
      if (paramScanResult != null) {
        paramScanResult.OooO00o(this);
      }
      return true;
    }
    return false;
  }
  
  public boolean OooOOOo(WifiConfiguration paramWifiConfiguration, WifiInfo paramWifiInfo, NetworkInfo paramNetworkInfo)
  {
    boolean bool1 = true;
    int i;
    if (paramWifiInfo != null)
    {
      boolean bool2 = OooO0oo(paramWifiConfiguration, paramWifiInfo);
      if (bool2)
      {
        paramWifiConfiguration = this.o00Ooo0O;
        if (paramWifiConfiguration != null) {
          bool1 = false;
        }
        i = paramWifiInfo.getRssi();
        this.o00OooO0 = i;
        this.o00Ooo0O = paramWifiInfo;
        this.o00Ooo0o = paramNetworkInfo;
        paramWifiConfiguration = this.o00OoOoo;
        if (paramWifiConfiguration == null) {
          break label113;
        }
      }
    }
    for (;;)
    {
      paramWifiConfiguration.OooO00o(this);
      break label113;
      paramWifiConfiguration = this.o00Ooo0O;
      if (paramWifiConfiguration == null) {
        break;
      }
      i = 0;
      this.o00Ooo0O = null;
      this.o00Ooo0o = null;
      paramWifiConfiguration = this.o00OoOoo;
      if (paramWifiConfiguration == null) {
        break label113;
      }
    }
    bool1 = false;
    label113:
    return bool1;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof AccessPoint;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (AccessPoint)paramObject;
    int i = OooO0OO(paramObject);
    if (i == 0) {
      bool2 = true;
    }
    return bool2;
  }
  
  public WifiConfiguration getConfig()
  {
    return this.o00Ooo00;
  }
  
  public String getConfigName()
  {
    WifiConfiguration localWifiConfiguration = this.o00Ooo00;
    if (localWifiConfiguration != null)
    {
      boolean bool = localWifiConfiguration.isPasspoint();
      if (bool) {
        return this.o00Ooo00.providerFriendlyName;
      }
    }
    return this.o00o0000;
  }
  
  public NetworkInfo.DetailedState getDetailedState()
  {
    Object localObject = this.o00Ooo0o;
    if (localObject != null) {
      localObject = ((NetworkInfo)localObject).getDetailedState();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public WifiInfo getInfo()
  {
    return this.o00Ooo0O;
  }
  
  public int getLevel()
  {
    int i = this.o00OooO0;
    int j = -1 >>> 1;
    if (i == j) {
      return -1;
    }
    return WifiManager.calculateSignalLevel(i, 5);
  }
  
  public NetworkInfo getNetworkInfo()
  {
    return this.o00Ooo0o;
  }
  
  public int getPskType()
  {
    return this.o00OoooO;
  }
  
  public int getRssi()
  {
    Iterator localIterator = this.o00OooO.snapshot().values().iterator();
    int i = -1 << -1;
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      ScanResult localScanResult = (ScanResult)localIterator.next();
      int j = localScanResult.level;
      if (j > i) {
        i = j;
      }
    }
    return i;
  }
  
  public String getSavedNetworkSummary()
  {
    return "";
  }
  
  public int getSecurity()
  {
    return this.o00Ooooo;
  }
  
  public long getSeen()
  {
    Iterator localIterator = this.o00OooO.snapshot().values().iterator();
    long l1 = 0L;
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      ScanResult localScanResult = (ScanResult)localIterator.next();
      long l2 = localScanResult.timestamp;
      boolean bool2 = l2 < l1;
      if (bool2) {
        l1 = l2;
      }
    }
    return l1;
  }
  
  public String getSettingsSummary()
  {
    return "";
  }
  
  public CharSequence getSsid()
  {
    SpannableString localSpannableString = new android/text/SpannableString;
    Object localObject = this.o00o0000;
    localSpannableString.<init>((CharSequence)localObject);
    localObject = new android/text/style/TtsSpan$VerbatimBuilder;
    String str = this.o00o0000;
    ((TtsSpan.VerbatimBuilder)localObject).<init>(str);
    localObject = ((TtsSpan.Builder)localObject).build();
    int i = this.o00o0000.length();
    localSpannableString.setSpan(localObject, 0, i, 18);
    return localSpannableString;
  }
  
  public String getSsidStr()
  {
    return this.o00o0000;
  }
  
  public String getSummary()
  {
    return getSettingsSummary();
  }
  
  public Object getTag()
  {
    return this.o00OooOo;
  }
  
  public int hashCode()
  {
    WifiInfo localWifiInfo = this.o00Ooo0O;
    int i = 0;
    if (localWifiInfo != null)
    {
      j = localWifiInfo.hashCode() * 13;
      i = 0 + j;
    }
    int j = this.o00OooO0 * 19;
    i += j;
    j = this.o0O00o0 * 23;
    i += j;
    j = this.o00o0000.hashCode() * 29;
    return i + j;
  }
  
  public boolean isActive()
  {
    Object localObject = this.o00Ooo0o;
    if (localObject != null)
    {
      int i = this.o0O00o0;
      int j = -1;
      if (i == j)
      {
        localObject = ((NetworkInfo)localObject).getState();
        NetworkInfo.State localState = NetworkInfo.State.DISCONNECTED;
        if (localObject == localState) {}
      }
      else
      {
        bool = true;
        break label48;
      }
    }
    boolean bool = false;
    localObject = null;
    label48:
    return bool;
  }
  
  public boolean isConnectable()
  {
    int i = getLevel();
    int j = -1;
    if (i != j)
    {
      localDetailedState = getDetailedState();
      if (localDetailedState == null) {
        return 1;
      }
    }
    i = 0;
    NetworkInfo.DetailedState localDetailedState = null;
    return i;
  }
  
  public boolean isConnected()
  {
    Object localObject = this.o00Ooo0o;
    if (localObject != null)
    {
      int i = this.o0O00o0;
      int j = -1;
      if (i != j)
      {
        localObject = ((NetworkInfo)localObject).getState();
        NetworkInfo.State localState = NetworkInfo.State.CONNECTED;
        if (localObject == localState)
        {
          bool = true;
          break label48;
        }
      }
    }
    boolean bool = false;
    localObject = null;
    label48:
    return bool;
  }
  
  public boolean isEphemeral()
  {
    return false;
  }
  
  public boolean isPasspoint()
  {
    WifiConfiguration localWifiConfiguration = this.o00Ooo00;
    if (localWifiConfiguration != null)
    {
      bool = localWifiConfiguration.isPasspoint();
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    localWifiConfiguration = null;
    return bool;
  }
  
  public boolean isSaved()
  {
    int i = this.o0O00o0;
    int j = -1;
    if (i != j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public void setListener(AccessPoint.AccessPointListener paramAccessPointListener)
  {
    this.o00OoOoo = paramAccessPointListener;
  }
  
  public void setTag(Object paramObject)
  {
    this.o00OooOo = paramObject;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("2K0A292A313C3D212B2A2E496E");
    localStringBuilder.append((String)localObject);
    localObject = this.o00o0000;
    localStringBuilder.append((String)localObject);
    boolean bool = isSaved();
    char c = ',';
    if (bool)
    {
      localStringBuilder.append(c);
      localObject = m54207b69.F54207b69_11("V3405347595B");
      localStringBuilder.append((String)localObject);
    }
    bool = isActive();
    if (bool)
    {
      localStringBuilder.append(c);
      localObject = m54207b69.F54207b69_11("Ky181B0F131321");
      localStringBuilder.append((String)localObject);
    }
    bool = isEphemeral();
    if (bool)
    {
      localStringBuilder.append(c);
      localObject = m54207b69.F54207b69_11("D055415A58615A485864");
      localStringBuilder.append((String)localObject);
    }
    bool = isConnectable();
    if (bool)
    {
      localStringBuilder.append(c);
      localObject = m54207b69.F54207b69_11("kl0F0404050D141E14160913");
      localStringBuilder.append((String)localObject);
    }
    int i = this.o00Ooooo;
    if (i != 0)
    {
      localStringBuilder.append(c);
      i = this.o00Ooooo;
      int j = this.o00OoooO;
      localObject = OooOOO0(i, j);
      localStringBuilder.append((String)localObject);
    }
    localObject = this.o00Ooo00;
    if (localObject != null)
    {
      localStringBuilder.append(c);
      localObject = this.o00Ooo00.toString();
      localStringBuilder.append((String)localObject);
    }
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wifi.AccessPoint
 * JD-Core Version:    0.7.0.1
 */
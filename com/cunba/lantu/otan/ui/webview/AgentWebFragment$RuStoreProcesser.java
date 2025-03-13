package com.cunba.lantu.otan.ui.webview;

import com.cunba.lantu.otan.utils.FileUtil;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import m54207b69;

final class AgentWebFragment$RuStoreProcesser
{
  public static final Map OooO00o;
  
  static
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    OooO00o = localHashMap;
  }
  
  public AgentWebFragment$RuStoreProcesser()
  {
    Object localObject1 = new java/io/File;
    Object localObject2 = m54207b69.F54207b69_11("@D6B38222A293B267208343D353438332F7B38433D3A3A81424A3A5043415A89555158524E5A469047535C545357524E");
    ((File)localObject1).<init>((String)localObject2);
    localObject2 = new java/io/File;
    String str = m54207b69.F54207b69_11("`6194654585B4958207A624B63666665612966556B686C2F70586C5E75736C37636366647C68783E7E6E6F897D");
    ((File)localObject2).<init>(str);
    boolean bool1 = ((File)localObject1).exists();
    if (bool1)
    {
      localObject1 = FileUtil.OooO0o(((File)localObject1).getAbsolutePath());
      if (localObject1 != null) {
        AgentWebFragment.OooOoOO((String)localObject1);
      }
    }
    boolean bool2 = ((File)localObject2).exists();
    if (bool2)
    {
      localObject1 = FileUtil.OooO0o(((File)localObject2).getAbsolutePath());
      if (localObject1 != null) {
        AgentWebFragment.OooOooO((String)localObject1);
      }
    }
  }
  
  public static String OooO00o(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    return (String)m54207b69.F54207b69_09(716, arrayOfObject);
  }
  
  public void getAppIdProps(String paramString1, String paramString2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString1;
    arrayOfObject[2] = paramString2;
    m54207b69.F54207b69_00(717, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.ui.webview.AgentWebFragment.RuStoreProcesser
 * JD-Core Version:    0.7.0.1
 */
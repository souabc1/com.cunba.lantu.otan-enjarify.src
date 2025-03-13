package com.qinggan.app.launcher;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import m54207b69;

public abstract class QGBoxProvider
{
  public HashMap OooO;
  public String OooO00o;
  public String OooO0O0;
  public boolean OooO0OO;
  public boolean OooO0Oo;
  public List OooO0o;
  public List OooO0o0;
  public List OooO0oO;
  public HashMap OooO0oo;
  public int OooOO0;
  public Handler OooOO0O;
  public HashMap OooOO0o;
  
  public void OooO(HashMap paramHashMap)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str1 = m54207b69.F54207b69_11("+x1717361C111B211725134524202148282B2462646C312F23314E332361");
    ((StringBuilder)localObject).append(str1);
    ((StringBuilder)localObject).append(paramHashMap);
    if (paramHashMap != null)
    {
      int i = paramHashMap.size();
      if (i > 0)
      {
        paramHashMap = paramHashMap.entrySet().iterator();
        for (;;)
        {
          boolean bool = paramHashMap.hasNext();
          if (!bool) {
            break;
          }
          localObject = (Map.Entry)paramHashMap.next();
          str1 = (String)((Map.Entry)localObject).getKey();
          localObject = ((Map.Entry)localObject).getValue();
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          String str2 = m54207b69.F54207b69_11("cs1C1E41150A2216221E0A3A1D2B2C3F2120296D6D672C281E2A572C1E6F3534296E");
          localStringBuilder.append(str2);
          localStringBuilder.append(str1);
          str1 = m54207b69.F54207b69_11("CZ762D3D396B");
          localStringBuilder.append(str1);
          localStringBuilder.append(localObject);
        }
      }
    }
  }
  
  public abstract View OooO00o(String paramString);
  
  public View OooO0O0(String paramString)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = m54207b69.F54207b69_11("=E2221331630253874746E3B2F2E85");
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(paramString);
    localObject1 = this.OooOO0o;
    boolean bool = ((HashMap)localObject1).containsKey(paramString);
    if (bool)
    {
      localObject1 = this.OooOO0o;
      paramString = (View)((HashMap)localObject1).get(paramString);
    }
    else
    {
      localObject1 = OooO00o(paramString);
      localObject2 = this.OooOO0o;
      ((HashMap)localObject2).put(paramString, localObject1);
      paramString = (String)localObject1;
    }
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = m54207b69.F54207b69_11(".&4144547353485715170F55705361507F5F54632E");
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(paramString);
    return paramString;
  }
  
  public void OooO0OO()
  {
    Message localMessage = getLauncherNotifyHandler().obtainMessage(11);
    OooO0Oo(localMessage);
  }
  
  public void OooO0Oo(Message paramMessage)
  {
    Handler localHandler = this.OooOO0O;
    if (localHandler != null) {
      localHandler.sendMessage(paramMessage);
    }
  }
  
  public void OooO0o()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("RL23231130422D142A3C0C46342E363673757D4036483143463F4645448D");
    localStringBuilder.append(str);
    str = this.OooO0O0;
    localStringBuilder.append(str);
    str = m54207b69.F54207b69_11("b%09484C606A4E4A5D5E21");
    localStringBuilder.append(str);
    str = this.OooO00o;
    localStringBuilder.append(str);
  }
  
  public void OooO0o0()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("vS3C3E1235253C1743331949472C43458A8A84434F3F184847504B4E518A");
    localStringBuilder.append(str);
    str = this.OooO0O0;
    localStringBuilder.append(str);
    str = m54207b69.F54207b69_11("b%09484C606A4E4A5D5E21");
    localStringBuilder.append(str);
    str = this.OooO00o;
    localStringBuilder.append(str);
  }
  
  public void OooO0oO(String paramString) {}
  
  public void OooO0oo() {}
  
  public void OooOO0()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("j0725245586447654D615D5F4D2A6C6C725462545785585F756B95796C70767C76383A3275836D86787B847B82813A");
    localStringBuilder.append(str);
    str = this.OooO0O0;
    localStringBuilder.append(str);
    str = m54207b69.F54207b69_11("b%09484C606A4E4A5D5E21");
    localStringBuilder.append(str);
    str = this.OooO00o;
    localStringBuilder.append(str);
    OooO0OO();
  }
  
  public LinkedHashMap getAllCover()
  {
    LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
    localLinkedHashMap.<init>();
    Iterator localIterator = this.OooO0oO.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      String str = (String)localIterator.next();
      HashMap localHashMap = (HashMap)this.OooO.get(str);
      localLinkedHashMap.put(str, localHashMap);
    }
    return localLinkedHashMap;
  }
  
  public String getBoxClass()
  {
    return this.OooO00o;
  }
  
  public List getBoxCoverTags()
  {
    return this.OooO0oO;
  }
  
  public String getBoxPackage()
  {
    return this.OooO0O0;
  }
  
  public HashMap getBoxParams()
  {
    return this.OooO0oo;
  }
  
  public List getButtonList()
  {
    return this.OooO0o0;
  }
  
  public List getCardList()
  {
    return this.OooO0o;
  }
  
  public View getCardView(int paramInt)
  {
    if (paramInt >= 0)
    {
      List localList = this.OooO0o;
      int i = localList.size();
      if (paramInt < i)
      {
        String str = (String)this.OooO0o.get(paramInt);
        return OooO0O0(str);
      }
    }
    return null;
  }
  
  public LinkedHashMap getCards()
  {
    LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
    localLinkedHashMap.<init>();
    int i = 0;
    for (;;)
    {
      Object localObject1 = this.OooO0o;
      int j = ((List)localObject1).size();
      if (i >= j) {
        break;
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      Object localObject2 = m54207b69.F54207b69_11(":x1F1E0E3E1D0F2212585A622625172A32");
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(i);
      ((StringBuilder)localObject1).append("]=");
      localObject2 = (String)this.OooO0o.get(i);
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = (String)this.OooO0o.get(i);
      localObject2 = this.OooO;
      Object localObject3 = this.OooO0o.get(i);
      localObject2 = (HashMap)((HashMap)localObject2).get(localObject3);
      localLinkedHashMap.put(localObject1, localObject2);
      i += 1;
    }
    return localLinkedHashMap;
  }
  
  public LinkedHashMap getCover()
  {
    LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
    localLinkedHashMap.<init>();
    Object localObject1 = this.OooO0oO;
    int i = ((List)localObject1).size();
    if (i > 0)
    {
      localObject1 = (String)this.OooO0oO.get(0);
      HashMap localHashMap = this.OooO;
      List localList = this.OooO0oO;
      Object localObject2 = localList.get(0);
      localObject2 = (HashMap)localHashMap.get(localObject2);
      localLinkedHashMap.put(localObject1, localObject2);
    }
    return localLinkedHashMap;
  }
  
  public int getIntoAppPage()
  {
    return this.OooOO0;
  }
  
  public Handler getLauncherNotifyHandler()
  {
    return this.OooOO0O;
  }
  
  public String getViewTag(int paramInt)
  {
    if (paramInt >= 0)
    {
      List localList = this.OooO0o;
      int i = localList.size();
      if (paramInt < i) {
        return (String)this.OooO0o.get(paramInt);
      }
    }
    return null;
  }
  
  public boolean isSetDefaultCover()
  {
    return this.OooO0OO;
  }
  
  public boolean isSpeechInteraction()
  {
    return this.OooO0Oo;
  }
  
  public void setBoxBackground(String paramString)
  {
    HashMap localHashMap = this.OooO0oo;
    String str = m54207b69.F54207b69_11("a`02101A42060609120F1B19201A11");
    localHashMap.put(str, paramString);
  }
  
  public void setBoxClass(String paramString)
  {
    this.OooO00o = paramString;
  }
  
  public void setBoxPackage(String paramString)
  {
    this.OooO0O0 = paramString;
  }
  
  public void setCover(String paramString)
  {
    List localList = this.OooO0oO;
    boolean bool = localList.contains(paramString);
    if (bool)
    {
      localList = this.OooO0oO;
      localList.remove(paramString);
    }
    this.OooO0oO.add(0, paramString);
  }
  
  public void setFixedCard(String paramString)
  {
    HashMap localHashMap = this.OooO0oo;
    String str = m54207b69.F54207b69_11("+M2B25372B2D17343347321C443837");
    localHashMap.put(str, paramString);
  }
  
  public void setIntoAppPage(int paramInt)
  {
    this.OooOO0 = paramInt;
  }
  
  public void setLauncherNotifyHandler(Handler paramHandler)
  {
    this.OooOO0O = paramHandler;
  }
  
  public void setSetDefaultCover(boolean paramBoolean)
  {
    this.OooO0OO = paramBoolean;
  }
  
  public void setSpeechInteraction(boolean paramBoolean)
  {
    this.OooO0Oo = paramBoolean;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.app.launcher.QGBoxProvider
 * JD-Core Version:    0.7.0.1
 */
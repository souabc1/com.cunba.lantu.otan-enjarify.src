package com.qinggan.wechat;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.qinggan.common.OnInitListener;
import com.qinggan.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import m54207b69;

public class WeChatManager
{
  public static String OooOO0 = "com.qinggan.wechat.action.WECHAT_SERVICE";
  public static String OooOO0O = "com.qinggan.wechat.service";
  public String OooO;
  public ServiceConnection OooO00o;
  public HashMap OooO0O0;
  public Context OooO0OO;
  public HashMap OooO0Oo;
  public IWeChatCallback OooO0o;
  public OnInitListener OooO0o0;
  public WeChatListener OooO0oO;
  public IWeChatService OooO0oo;
  
  public final void OooOO0(List paramList)
  {
    if (paramList != null)
    {
      boolean bool = paramList.isEmpty();
      if (!bool)
      {
        localObject1 = this.OooO0O0;
        ((HashMap)localObject1).clear();
        paramList = paramList.iterator();
        for (;;)
        {
          bool = paramList.hasNext();
          if (!bool) {
            break;
          }
          localObject1 = (Contact)paramList.next();
          if (localObject1 != null)
          {
            Object localObject2 = ((Contact)localObject1).getUserName();
            if (localObject2 != null)
            {
              localObject2 = this.OooO0O0;
              String str = ((Contact)localObject1).getUserName();
              ((HashMap)localObject2).put(str, localObject1);
            }
          }
        }
        return;
      }
    }
    paramList = m54207b69.F54207b69_11("Lj3D102B050F232D120C14171A24");
    Object localObject1 = m54207b69.F54207b69_11("i:595656515F5E547D5B5258256B64585D53");
    Log.OooO00o(paramList, (String)localObject1);
  }
  
  public final void OooOO0O(List paramList)
  {
    if (paramList != null)
    {
      boolean bool1 = paramList.isEmpty();
      if (!bool1)
      {
        paramList = paramList.iterator();
        for (;;)
        {
          bool1 = paramList.hasNext();
          if (!bool1) {
            break;
          }
          Contact localContact = (Contact)paramList.next();
          if (localContact != null)
          {
            Object localObject = localContact.getUserName();
            if (localObject != null)
            {
              localObject = this.OooO0Oo;
              String str = localContact.getUserName();
              boolean bool2 = ((HashMap)localObject).containsKey(str);
              if (!bool2)
              {
                localObject = this.OooO0Oo;
                str = localContact.getUserName();
                ((HashMap)localObject).put(str, localContact);
              }
            }
          }
        }
      }
    }
  }
  
  public final void OooOO0o()
  {
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    Object localObject = OooOO0;
    localIntent.setAction((String)localObject);
    localObject = OooOO0O;
    localIntent.setPackage((String)localObject);
    localObject = this.OooO0OO;
    ServiceConnection localServiceConnection = this.OooO00o;
    ((Context)localObject).bindService(localIntent, localServiceConnection, 1);
  }
  
  public List getContacts()
  {
    List localList = null;
    try
    {
      IWeChatService localIWeChatService = this.OooO0oo;
      if (localIWeChatService != null) {
        localList = localIWeChatService.getContacts();
      } else {
        OooOO0o();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("l/484B5D6F444661555464661A56645A596F6C5853552A");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOO0o();
    }
    return localList;
  }
  
  public void getQRCode()
  {
    try
    {
      IWeChatService localIWeChatService = this.OooO0oo;
      if (localIWeChatService != null) {
        localIWeChatService.getQRCode();
      } else {
        OooOO0o();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("d`070616343628150B0D490F230F121E231920206D");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOO0o();
    }
  }
  
  public String getUrlPrefix()
  {
    String str1 = null;
    try
    {
      IWeChatService localIWeChatService = this.OooO0oo;
      if (localIWeChatService != null) {
        str1 = localIWeChatService.getUrlPrefix();
      } else {
        OooOO0o();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str3 = m54207b69.F54207b69_11("e<5B5A4A6C5255725561635F4F2866526E695D5A6867671C");
      localStringBuilder.append(str3);
      String str2 = localRemoteException.getMessage();
      localStringBuilder.append(str2);
      OooOO0o();
    }
    return str1;
  }
  
  public UserInfo getUserInfo()
  {
    UserInfo localUserInfo = null;
    try
    {
      IWeChatService localIWeChatService = this.OooO0oo;
      if (localIWeChatService != null) {
        localUserInfo = localIWeChatService.getUserInfo();
      } else {
        OooOO0o();
      }
    }
    catch (RemoteException localRemoteException)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str2 = m54207b69.F54207b69_11("_r1518082A051C0642241D275D23171F2612172D30305D");
      localStringBuilder.append(str2);
      String str1 = localRemoteException.getMessage();
      localStringBuilder.append(str1);
      OooOO0o();
    }
    return localUserInfo;
  }
  
  public void setWeChatListener(WeChatListener paramWeChatListener)
  {
    this.OooO0oO = paramWeChatListener;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wechat.WeChatManager
 * JD-Core Version:    0.7.0.1
 */
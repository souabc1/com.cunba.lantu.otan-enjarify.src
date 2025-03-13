package com.qinggan.content;

import android.content.Context;
import com.qinggan.account.AccountConstantUtil;
import com.qinggan.account.AccountInfoBean;
import com.qinggan.account.AccountUserManager;
import m54207b69;

public class UserFileConfigs
{
  public static Context OooO00o;
  
  public String getConfigDir()
  {
    boolean bool1 = AccountConstantUtil.OooO00o;
    Object localObject1 = m54207b69.F54207b69_11("&G68383731352B3929702D32342D3B2E4378");
    if (!bool1)
    {
      localObject2 = AccountUserManager.getInstance().OooO00o();
      Object localObject3;
      String str;
      if (localObject2 != null)
      {
        localObject3 = ((AccountInfoBean)localObject2).getName();
        if (localObject3 != null)
        {
          localObject3 = ((AccountInfoBean)localObject2).getName();
          str = m54207b69.F54207b69_11("5o081B0C1F1F");
          boolean bool2 = ((String)localObject3).equals(str);
          if (bool2)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject3 = m54207b69.F54207b69_11(":g32150418251311092C11130C1A0D22561E1A131B5D15182A211F241D");
            ((StringBuilder)localObject1).append((String)localObject3);
            localObject2 = ((AccountInfoBean)localObject2).getName();
            ((StringBuilder)localObject1).append((String)localObject2);
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject1 = m54207b69.F54207b69_11("<V79272642243C283A813E43433C4C3F348942354639378F");
            ((StringBuilder)localObject2).append((String)localObject1);
            localObject1 = OooO00o.getPackageName().toString();
            ((StringBuilder)localObject2).append((String)localObject1);
            return ((StringBuilder)localObject2).toString();
          }
        }
      }
      if (localObject2 != null)
      {
        localObject3 = ((AccountInfoBean)localObject2).getAccountId();
        if (localObject3 != null)
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          str = m54207b69.F54207b69_11("I(7D5C4F5D72464A54735050594D5C69175F5E6E7E5B5B645867855B75245E646D67277170808E71726F8670878D79");
          ((StringBuilder)localObject3).append(str);
          str = ((AccountInfoBean)localObject2).getAccountId();
          ((StringBuilder)localObject3).append(str);
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          ((StringBuilder)localObject3).append((String)localObject1);
          localObject2 = ((AccountInfoBean)localObject2).getAccountId();
          ((StringBuilder)localObject3).append((String)localObject2);
          ((StringBuilder)localObject3).append("/");
          localObject2 = OooO00o.getPackageName().toString();
          ((StringBuilder)localObject3).append((String)localObject2);
          return ((StringBuilder)localObject3).toString();
        }
      }
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append((String)localObject1);
      localObject1 = OooO00o.getPackageName().toString();
      ((StringBuilder)localObject2).append((String)localObject1);
      return ((StringBuilder)localObject2).toString();
    }
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append((String)localObject1);
    localObject1 = OooO00o.getPackageName().toString();
    ((StringBuilder)localObject2).append((String)localObject1);
    return ((StringBuilder)localObject2).toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.content.UserFileConfigs
 * JD-Core Version:    0.7.0.1
 */
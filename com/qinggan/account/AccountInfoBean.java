package com.qinggan.account;

import com.qinggan.util.Log;
import java.io.File;
import java.io.PrintStream;
import m54207b69;

public class AccountInfoBean
{
  public String OooO00o;
  public String OooO0O0;
  public boolean OooO0OO;
  public boolean OooO0Oo;
  public String OooO0o;
  public String OooO0o0;
  public int OooO0oO;
  
  public AccountInfoBean()
  {
    this.OooO0Oo = false;
    this.OooO0OO = false;
  }
  
  public AccountInfoBean(String paramString)
  {
    Object localObject1 = null;
    this.OooO0Oo = false;
    this.OooO0OO = false;
    Object localObject2 = m54207b69.F54207b69_11("*r331213200B210C42241D273B23202A");
    String str2 = m54207b69.F54207b69_11("NI2729262F");
    Log.OooO0O0((String)localObject2, str2);
    System.out.println(paramString);
    localObject2 = "%";
    try
    {
      localObject2 = paramString.split((String)localObject2);
      str2 = "5o081B0C1F1F";
      str2 = m54207b69.F54207b69_11(str2);
      boolean bool1 = str2.equals(paramString);
      int i = 1;
      if (bool1)
      {
        this.OooO0o0 = paramString;
        this.OooO0OO = i;
      }
      else
      {
        int j = localObject2.length;
        if (j > i)
        {
          paramString = localObject2[0];
          this.OooO0o0 = paramString;
          paramString = localObject2[i];
          this.OooO0o = paramString;
          j = 2;
          paramString = localObject2[j];
          localObject1 = "1";
          boolean bool2 = paramString.equals(localObject1);
          if (bool2) {
            this.OooO0Oo = i;
          }
          int k = 3;
          paramString = localObject2[k];
          if (paramString != null) {
            this.OooO00o = paramString;
          }
          k = 4;
          paramString = localObject2[k];
          if (paramString != null)
          {
            paramString = Integer.valueOf(paramString);
            k = paramString.intValue();
            this.OooO0oO = k;
          }
        }
        else
        {
          paramString = "mT322239426A";
          paramString = m54207b69.F54207b69_11(paramString);
          Log.OooO0O0(str1, paramString);
          paramString = localObject2[0];
          this.OooO0o0 = paramString;
        }
      }
    }
    catch (Exception paramString)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = m54207b69.F54207b69_11("j~1F1E130E140F5B22");
      ((StringBuilder)localObject1).append((String)localObject2);
      paramString = paramString.toString();
      ((StringBuilder)localObject1).append(paramString);
      paramString = ((StringBuilder)localObject1).toString();
      Log.OooO0O0(str1, paramString);
    }
  }
  
  public String getAccountId()
  {
    return this.OooO00o;
  }
  
  public String getIconPath()
  {
    Object localObject = getAccountId();
    String str1 = null;
    if (localObject != null)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str2 = m54207b69.F54207b69_11("^$0B555850564A5648134E5C505C52641A");
      ((StringBuilder)localObject).append(str2);
      String str3 = this.OooO00o;
      ((StringBuilder)localObject).append(str3);
      str3 = m54207b69.F54207b69_11("_}530E151D");
      ((StringBuilder)localObject).append(str3);
      File localFile = new java/io/File;
      localObject = ((StringBuilder)localObject).toString();
      localFile.<init>((String)localObject);
      boolean bool = localFile.exists();
      if (bool)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append(str2);
        str1 = this.OooO00o;
        ((StringBuilder)localObject).append(str1);
        ((StringBuilder)localObject).append(str3);
        return ((StringBuilder)localObject).toString();
      }
    }
    return null;
  }
  
  public String getName()
  {
    return this.OooO0o0;
  }
  
  public String getNumber()
  {
    return this.OooO0o;
  }
  
  public int getUserid()
  {
    return this.OooO0oO;
  }
  
  public boolean isGuest()
  {
    return this.OooO0OO;
  }
  
  public boolean isGuestUser()
  {
    return this.OooO0OO;
  }
  
  public boolean isOwner()
  {
    return this.OooO0Oo;
  }
  
  public boolean isOwnerUser()
  {
    return this.OooO0Oo;
  }
  
  public void setAccountId(String paramString)
  {
    this.OooO00o = paramString;
  }
  
  public void setGuest(boolean paramBoolean)
  {
    this.OooO0OO = paramBoolean;
  }
  
  public void setIconPath(String paramString)
  {
    this.OooO0O0 = paramString;
  }
  
  public void setName(String paramString)
  {
    this.OooO0o0 = paramString;
  }
  
  public void setNumber(String paramString)
  {
    this.OooO0o = paramString;
  }
  
  public void setOwner(boolean paramBoolean)
  {
    this.OooO0Oo = paramBoolean;
  }
  
  public void setUserid(int paramInt)
  {
    this.OooO0oO = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.account.AccountInfoBean
 * JD-Core Version:    0.7.0.1
 */
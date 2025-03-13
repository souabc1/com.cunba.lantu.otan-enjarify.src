package com.qinggan.turnbyturn;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.qinggan.account.AccountUserManager;
import com.qinggan.util.Log;
import m54207b69;

public class TurnByTurnInfo
{
  public ITurnByTurnInfo OooO;
  public TurnByTurnInfo.OnTurnByTurnInfoChangedListener OooO00o;
  public Context OooO0O0;
  public TurnByTurnInfo.OnInitListener OooO0OO;
  public String OooO0Oo;
  public final Object OooO0o;
  public ServiceConnection OooO0o0;
  public boolean OooO0oO;
  public ITurnByTurnInfoCallback OooO0oo;
  
  public final void OooO0oO()
  {
    this.OooO0oO = false;
    Object localObject1 = new com/qinggan/turnbyturn/TurnByTurnInfo$1;
    ((TurnByTurnInfo.1)localObject1).<init>(this);
    this.OooO0o0 = ((ServiceConnection)localObject1);
    localObject1 = new android/content/Intent;
    Object localObject2 = m54207b69.F54207b69_11("~w161A15081C23196026220D1D251067252414302B2D6E3A3A4E3E3D433F3F4358554F4545495E4E4B5A4E4B69605F");
    ((Intent)localObject1).<init>((String)localObject2);
    localObject2 = m54207b69.F54207b69_11("CH2B2827693D262C3637323071473E494B3D364D404E53374245");
    ((Intent)localObject1).setPackage((String)localObject2);
    localObject2 = m54207b69.F54207b69_11("}i08080F1E0A05134E08102717132A5519182E1E211A30265E55353522472D5B3B3B28422A332B");
    ((Intent)localObject1).addCategory((String)localObject2);
    localObject2 = this.OooO0O0;
    ServiceConnection localServiceConnection = this.OooO0o0;
    int i = 1;
    boolean bool = AccountUserManager.OooO0O0((Context)localObject2, (Intent)localObject1, localServiceConnection, i);
    localObject2 = m54207b69.F54207b69_11("Bp24060421360E2A0C0A274329222C");
    if (!bool)
    {
      localObject1 = m54207b69.F54207b69_11("3D2D2B2F3314363C310E461A3C4237253046433F3A3579383C45413B3B804D4983464E4C438855518B5F4A605D59544F");
      Log.OooO0O0((String)localObject2, (String)localObject1);
      localObject1 = this.OooO0OO;
      if (localObject1 != null)
      {
        int j = -1;
        ((TurnByTurnInfo.OnInitListener)localObject1).OooO00o(j);
        bool = false;
        localObject1 = null;
        this.OooO0OO = null;
      }
    }
    else
    {
      localObject1 = m54207b69.F54207b69_11("8|1513170B2C0E1419460E32141A1F3D281E1B27322D7125203738332A2B37272F30267E41372E383F84313D873B463C3945504B");
      Log.OooO0OO((String)localObject2, (String)localObject1);
    }
  }
  
  public int OooO0oo(TurnByTurnInfo.OnTurnByTurnInfoChangedListener paramOnTurnByTurnInfoChangedListener)
  {
    synchronized (this.OooO0o)
    {
      boolean bool = this.OooO0oO;
      int i = -1;
      if (!bool)
      {
        paramOnTurnByTurnInfoChangedListener = "Bp24060421360E2A0C0A274329222C";
        paramOnTurnByTurnInfoChangedListener = m54207b69.F54207b69_11(paramOnTurnByTurnInfoChangedListener);
        str1 = "UC0F2D22253B2F323412362F376F1D3440453B32397742424E7B49513D4D544446";
        str1 = m54207b69.F54207b69_11(str1);
        Log.OooO0O0(paramOnTurnByTurnInfoChangedListener, str1);
        OooO0oO();
        return i;
      }
      this.OooO00o = paramOnTurnByTurnInfoChangedListener;
      bool = false;
      String str1 = null;
      Object localObject2;
      String str2;
      if (paramOnTurnByTurnInfoChangedListener != null)
      {
        localObject2 = new com/qinggan/turnbyturn/TurnByTurnInfo$2;
        ((TurnByTurnInfo.2)localObject2).<init>(this, paramOnTurnByTurnInfoChangedListener);
        this.OooO0oo = ((ITurnByTurnInfoCallback)localObject2);
        try
        {
          paramOnTurnByTurnInfoChangedListener = this.OooO;
          str2 = this.OooO0Oo;
          i = paramOnTurnByTurnInfoChangedListener.o00OoOO(str2, (ITurnByTurnInfoCallback)localObject2);
        }
        catch (IllegalStateException paramOnTurnByTurnInfoChangedListener)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          str2 = "Os0017093F212C0C08253A1432120E2B492D262E432F27332B2E3059351C24343C3622755D43443C3B3A484A323E3444653B4148363B4F525481";
          str2 = m54207b69.F54207b69_11(str2);
          ((StringBuilder)localObject2).append(str2);
          str2 = paramOnTurnByTurnInfoChangedListener.getMessage();
          ((StringBuilder)localObject2).append(str2);
          str2 = "Bp24060421360E2A0C0A274329222C";
          str2 = m54207b69.F54207b69_11(str2);
          localObject2 = ((StringBuilder)localObject2).toString();
          Log.OooO0O0(str2, (String)localObject2);
          paramOnTurnByTurnInfoChangedListener.printStackTrace();
          this.OooO0oO = false;
          OooO0oO();
        }
        catch (NullPointerException paramOnTurnByTurnInfoChangedListener)
        {
          for (;;)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            str2 = "M54651437D5F66464E6380566C4C54698B6B646C8971697169686A9377625E6E7A7068379E647E7F8C8285856C7C749E7C86817774908F9146";
            str2 = m54207b69.F54207b69_11(str2);
            ((StringBuilder)localObject2).append(str2);
            str2 = paramOnTurnByTurnInfoChangedListener.getMessage();
            ((StringBuilder)localObject2).append(str2);
            str2 = "Bp24060421360E2A0C0A274329222C";
            str2 = m54207b69.F54207b69_11(str2);
            localObject2 = ((StringBuilder)localObject2).toString();
            Log.OooO0O0(str2, (String)localObject2);
            paramOnTurnByTurnInfoChangedListener.printStackTrace();
            this.OooO0oO = false;
          }
        }
        catch (RemoteException paramOnTurnByTurnInfoChangedListener)
        {
          for (;;)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            str2 = "1r01180840202B0D0724391531130D2A4A2C252F442E28322C2F2F58361D23353B372174433B44432D3F60343C432F344A4D4D7A";
            str2 = m54207b69.F54207b69_11(str2);
            ((StringBuilder)localObject2).append(str2);
            str2 = paramOnTurnByTurnInfoChangedListener.getMessage();
            ((StringBuilder)localObject2).append(str2);
            str2 = "Bp24060421360E2A0C0A274329222C";
            str2 = m54207b69.F54207b69_11(str2);
            localObject2 = ((StringBuilder)localObject2).toString();
            Log.OooO0O0(str2, (String)localObject2);
            paramOnTurnByTurnInfoChangedListener.printStackTrace();
            this.OooO0oO = false;
          }
        }
        return i;
      }
      try
      {
        paramOnTurnByTurnInfoChangedListener = this.OooO;
        localObject2 = this.OooO0Oo;
        i = paramOnTurnByTurnInfoChangedListener.o00O0Oo0((String)localObject2);
      }
      catch (IllegalStateException paramOnTurnByTurnInfoChangedListener)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str2 = "Os0017093F212C0C08253A1432120E2B492D262E432F27332B2E3059351C24343C3622755D43443C3B3A484A323E3444653B4148363B4F525481";
        str2 = m54207b69.F54207b69_11(str2);
        ((StringBuilder)localObject2).append(str2);
        str2 = paramOnTurnByTurnInfoChangedListener.getMessage();
        ((StringBuilder)localObject2).append(str2);
        str2 = "Bp24060421360E2A0C0A274329222C";
        str2 = m54207b69.F54207b69_11(str2);
        localObject2 = ((StringBuilder)localObject2).toString();
        Log.OooO0O0(str2, (String)localObject2);
        paramOnTurnByTurnInfoChangedListener.printStackTrace();
        this.OooO0oO = false;
        OooO0oO();
      }
      catch (NullPointerException paramOnTurnByTurnInfoChangedListener)
      {
        for (;;)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          str2 = "M54651437D5F66464E6380566C4C54698B6B646C8971697169686A9377625E6E7A7068379E647E7F8C8285856C7C749E7C86817774908F9146";
          str2 = m54207b69.F54207b69_11(str2);
          ((StringBuilder)localObject2).append(str2);
          str2 = paramOnTurnByTurnInfoChangedListener.getMessage();
          ((StringBuilder)localObject2).append(str2);
          str2 = "Bp24060421360E2A0C0A274329222C";
          str2 = m54207b69.F54207b69_11(str2);
          localObject2 = ((StringBuilder)localObject2).toString();
          Log.OooO0O0(str2, (String)localObject2);
          paramOnTurnByTurnInfoChangedListener.printStackTrace();
          this.OooO0oO = false;
        }
      }
      catch (RemoteException paramOnTurnByTurnInfoChangedListener)
      {
        for (;;)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          str2 = "1r01180840202B0D0724391531130D2A4A2C252F442E28322C2F2F58361D23353B372174433B44432D3F60343C432F344A4D4D7A";
          str2 = m54207b69.F54207b69_11(str2);
          ((StringBuilder)localObject2).append(str2);
          str2 = paramOnTurnByTurnInfoChangedListener.getMessage();
          ((StringBuilder)localObject2).append(str2);
          str2 = "Bp24060421360E2A0C0A274329222C";
          str2 = m54207b69.F54207b69_11(str2);
          localObject2 = ((StringBuilder)localObject2).toString();
          Log.OooO0O0(str2, (String)localObject2);
          paramOnTurnByTurnInfoChangedListener.printStackTrace();
          this.OooO0oO = false;
        }
      }
      return i;
    }
  }
  
  public int[] getTurnByTurnInfo(int paramInt)
  {
    Object localObject1 = null;
    if (paramInt >= 0)
    {
      int i = 12;
      if (paramInt < i) {
        synchronized (this.OooO0o)
        {
          boolean bool = this.OooO0oO;
          Object localObject3;
          if (!bool)
          {
            localObject3 = "Bp24060421360E2A0C0A274329222C";
            localObject3 = m54207b69.F54207b69_11((String)localObject3);
            str1 = "YE2221330A24293D33332C3470222D45423C3732783F3F477C4E4A3E524D3D3F";
            str1 = m54207b69.F54207b69_11(str1);
            Log.OooO0O0((String)localObject3, str1);
            OooO0oO();
            return null;
          }
          bool = false;
          String str1 = null;
          try
          {
            localObject5 = this.OooO;
            localObject3 = ((ITurnByTurnInfo)localObject5).getTurnByTurnInfo(paramInt);
            localObject1 = localObject3;
          }
          catch (IllegalStateException localIllegalStateException)
          {
            localObject5 = "Bp24060421360E2A0C0A274329222C";
            localObject5 = m54207b69.F54207b69_11((String)localObject5);
            str2 = "^)4E4D5F6E504D61474F5850146C52535B5E59578D715D7363846A6467757A5E6567";
            str2 = m54207b69.F54207b69_11(str2);
            Log.OooO0O0((String)localObject5, str2);
            localIllegalStateException.printStackTrace();
            this.OooO0oO = false;
            OooO0oO();
          }
          catch (NullPointerException localNullPointerException)
          {
            for (;;)
            {
              localObject5 = "Bp24060421360E2A0C0A274329222C";
              localObject5 = m54207b69.F54207b69_11((String)localObject5);
              str2 = "+T33322219353A2C44423B457F262E4647144C4F4D34463C2844504B3F3C5A5959";
              str2 = m54207b69.F54207b69_11(str2);
              Log.OooO0O0((String)localObject5, str2);
              localNullPointerException.printStackTrace();
              this.OooO0oO = false;
            }
          }
          catch (RemoteException localRemoteException)
          {
            for (;;)
            {
              Object localObject5 = "Bp24060421360E2A0C0A274329222C";
              localObject5 = m54207b69.F54207b69_11((String)localObject5);
              String str2 = ".F21243407272C3A3630293371203039384234155139384C49474242";
              str2 = m54207b69.F54207b69_11(str2);
              Log.OooO0O0((String)localObject5, str2);
              localRemoteException.printStackTrace();
              this.OooO0oO = false;
            }
          }
          return localObject1;
        }
      }
    }
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.turnbyturn.TurnByTurnInfo
 * JD-Core Version:    0.7.0.1
 */
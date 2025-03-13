package com.hjq.permissions;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m54207b69;

final class PermissionChecker
{
  public static void OooO(List paramList, AndroidManifestInfo paramAndroidManifestInfo)
  {
    String str1 = m54207b69.F54207b69_11("pf070904170D14084F1E0C1E161B22231E19195A37433D385040424C4A3C4C434652504B4B5D4F555C5A4C524E606663526461615857");
    boolean bool1 = PermissionUtils.OooO0o(paramList, str1);
    if (!bool1) {
      return;
    }
    if (paramAndroidManifestInfo == null) {
      return;
    }
    paramList = paramAndroidManifestInfo.OooO0o;
    int i = 0;
    paramAndroidManifestInfo = null;
    for (;;)
    {
      int j = paramList.size();
      if (i >= j) {
        break;
      }
      String str2 = ((AndroidManifestInfo.ServiceInfo)paramList.get(i)).OooO0O0;
      boolean bool2 = TextUtils.equals(str2, str1);
      if (bool2) {
        return;
      }
      i += 1;
    }
    paramList = new java/lang/IllegalArgumentException;
    paramAndroidManifestInfo = m54207b69.F54207b69_11("Gx36185A0E210F141823266215292C1F1A1C2E1C30306D1E34222E2B26272E3535783A2E2F2E36403434467E8334414B483B4E8A3D515447424456449380485B494E525D609C5E5C6352605B678E556B5965625D5E656C6C9CB272707766746F7BB6697F6D79767172798080C1A69EA4AB97A7A99FA5B3A7B2B1A5ABB2B2A4B2B0ABADBFB9C1AFADB2C5B3B8BCC7CAE8E7D6E9A3A9ECCEACB3A2B0ABB7D1B6B4B0BEBEADAFFAA5BBBB");
    paramList.<init>(paramAndroidManifestInfo);
    throw paramList;
  }
  
  public static boolean OooO00o(Activity paramActivity, boolean paramBoolean)
  {
    String str;
    if (paramActivity == null)
    {
      if (!paramBoolean) {
        return false;
      }
      paramActivity = new java/lang/IllegalArgumentException;
      str = m54207b69.F54207b69_11("SL18252B6F2927453F352B39347830387B48353B7F4338384F414D52873D565D578C4F4B8F5147925457614F655165639B535F585C636D");
      paramActivity.<init>(str);
      throw paramActivity;
    }
    boolean bool1 = paramActivity.isFinishing();
    if (bool1)
    {
      if (!paramBoolean) {
        return false;
      }
      paramActivity = new java/lang/IllegalStateException;
      str = m54207b69.F54207b69_11("&G1330246A2A29393539373D49733C3443773634353D7C374541474E4A4A463E8A87584D454A59488E524F535D5258596D97545466566A6065615BA16E6B5FA5737367757578AC6E68AF7C796DB37372827E82808692");
      paramActivity.<init>(str);
      throw paramActivity;
    }
    bool1 = AndroidVersion.isAndroid4_2();
    if (bool1)
    {
      boolean bool2 = paramActivity.isDestroyed();
      if (bool2)
      {
        if (!paramBoolean) {
          return false;
        }
        paramActivity = new java/lang/IllegalStateException;
        str = m54207b69.F54207b69_11("},78454B0F51545E4C624E626018515B6E1C5F5B5C56215E607771785E7166661F2C7D626C71846F3369766C84796D6E843C797B8B7D93777C7A82469380864A9E988E9A9CA351899154A18E94589A9DA795AB97ABA9");
        paramActivity.<init>(str);
        throw paramActivity;
      }
    }
    return true;
  }
  
  public static void OooO0O0(List paramList)
  {
    String str1 = m54207b69.F54207b69_11("0f070904170D14084F1E0C1E161B22231E19195A373D3755504D3C4250455153584448475045594F5A504B");
    boolean bool1 = PermissionUtils.OooO0o(paramList, str1);
    if (!bool1) {
      return;
    }
    boolean bool2 = PermissionUtils.OooO0o(paramList, str1);
    if (bool2)
    {
      str1 = m54207b69.F54207b69_11("N958585F4E5A55631E5165555F5C57585F6668298E8A92767D82959185928888");
      bool2 = PermissionUtils.OooO0o(paramList, str1);
      if (!bool2)
      {
        paramList = new java/lang/IllegalArgumentException;
        str1 = m54207b69.F54207b69_11("f/6E6061465A4B474F17524A681B5A5C5B54596F536E56612674635B775C7A2D7E6A7E646980816C676985396D8689893E7C71738E827B7746867A85987C8389409F8B9F858AA1A28D888A4BB8ACB8C4BFCCBBB3CFB4D2D2");
        paramList.<init>(str1);
        throw paramList;
      }
    }
    paramList = paramList.iterator();
    do
    {
      bool2 = paramList.hasNext();
      if (!bool2) {
        return;
      }
      str1 = (String)paramList.next();
      String str2 = m54207b69.F54207b69_11("j~1F111C0F151C20571624161E231A1B262121625251525144453A565A5952574B514C525D455757646753615C5C");
      bool1 = PermissionUtils.OooO0oO(str1, str2);
      if (bool1) {
        break;
      }
      str2 = m54207b69.F54207b69_11("Nl0D030A21070A0E492412280C112C2D141313544043443F56574C3B4444424B52404451505C4A4949");
      bool2 = PermissionUtils.OooO0oO(str1, str2);
    } while (!bool2);
    paramList = new java/lang/IllegalArgumentException;
    str1 = m54207b69.F54207b69_11("Gt3505061B1122201A5C1B251160111F15292E191A3130301E6C2E342B22383B2F7A2533293D422D2E4544448562685E5C5B58636D5B705C5E636F6F727B70647A617B7297595F569B5D635A51676A5EA95462586C715C5D747373B49093948F86878C9B9494A29B92A0A4A1A08CAAA9A9C48672C7749187CB7F8E938CD07D9B9891D59F8AD89FA187DC908B8F90A8948FA1A1");
    paramList.<init>(str1);
    throw paramList;
    paramList = new java/lang/IllegalArgumentException;
    str1 = m54207b69.F54207b69_11("N&6757584D63544E480E49535F126351635B606768635E5E6C1E60625D70666D61287765776F747B7C77727233909690AEA9A6959BA99EAAACB19DA1A0A99EB2A8B3A9A4498B8D884D8F918C9F959C9057A694A69EA3AAABA6A1A162C2C1C2C1D4D5DAC6CAC9D2C7DBD1DCD2CDE5D7D7D4D7E3E1DCDC7BBDC97ECBC8BE82D2C5CAC387D4D2CFC88CD6DD8FD2D4DE93E3E2E6E7DBE7E6D8D8");
    paramList.<init>(str1);
    throw paramList;
  }
  
  public static void OooO0OO(List paramList)
  {
    String str1 = m54207b69.F54207b69_11("j~1F111C0F151C20571624161E231A1B262121625251525144453A565A5952574B514C525D455757646753615C5C");
    boolean bool1 = PermissionUtils.OooO0o(paramList, str1);
    if (!bool1) {
      return;
    }
    String str2 = m54207b69.F54207b69_11("9W363A35283C4339802F3B2F454A31324D484A8B292829281B1C212E3332222231283C3A373A28443F41");
    boolean bool2 = PermissionUtils.OooO0o(paramList, str2);
    String str3 = m54207b69.F54207b69_11("LA20302736322D2B76392D3D37343F40373E40811316171A292A3721232B213C2C2E2322382C3335");
    if (bool2)
    {
      bool2 = PermissionUtils.OooO0o(paramList, str3);
      if (!bool2)
      {
        paramList = new java/lang/IllegalArgumentException;
        str1 = m54207b69.F54207b69_11("=67747485D53645E581E59634F226165646D62566C576D682D5E725F7A5E7C77777F7973396A786A82876E6F8A858573458B7477754A948E8C927C8C8E52949691849AA1955C8B998BA3A88F90ABA6A667C7C6C7C6B9BABFC7D7D1CDC4D6D6D3D6C2E0DBDB");
        paramList.<init>(str1);
        throw paramList;
      }
    }
    paramList = paramList.iterator();
    do
    {
      String str4;
      boolean bool3;
      do
      {
        do
        {
          bool2 = paramList.hasNext();
          if (!bool2) {
            break;
          }
          str4 = (String)paramList.next();
          bool3 = PermissionUtils.OooO0oO(str4, str3);
        } while (bool3);
        bool3 = PermissionUtils.OooO0oO(str4, str2);
      } while (bool3);
      bool2 = PermissionUtils.OooO0oO(str4, str1);
    } while (bool2);
    paramList = new java/lang/IllegalArgumentException;
    str1 = m54207b69.F54207b69_11("@n2C0C0F121F2211550F2358120C1A102A1A1C2F612024231C21351B361C276C21212E313D2B2626754634462E334A4B3631314F75823F3785383A54894B5B5C41578F4A4460936452644C516869544F4F6D9F6D5370605866726464A9765EAC61616E717D6B6666");
    paramList.<init>(str1);
    throw paramList;
  }
  
  public static void OooO0Oo(List paramList, String paramString)
  {
    OooO0o0(paramList, paramString, -1 >>> 1);
  }
  
  public static void OooO0o(Context paramContext, List paramList, AndroidManifestInfo paramAndroidManifestInfo)
  {
    if (paramAndroidManifestInfo == null) {
      return;
    }
    List localList = paramAndroidManifestInfo.OooO0OO;
    boolean bool1 = localList.isEmpty();
    if (!bool1)
    {
      bool1 = AndroidVersion.isAndroid7();
      int j;
      if (bool1)
      {
        paramAndroidManifestInfo = paramContext.getApplicationInfo();
        j = paramAndroidManifestInfo.minSdkVersion;
      }
      else
      {
        paramAndroidManifestInfo = paramAndroidManifestInfo.OooO0O0;
        if (paramAndroidManifestInfo != null) {
          j = paramAndroidManifestInfo.OooO00o;
        } else {
          j = 14;
        }
      }
      paramList = paramList.iterator();
      for (;;)
      {
        bool1 = paramList.hasNext();
        if (!bool1) {
          break;
        }
        String str1 = (String)paramList.next();
        boolean bool3 = Permission.OooO0Oo(str1);
        if (bool3)
        {
          OooO0Oo(localList, str1);
          String str2 = m54207b69.F54207b69_11("0f070904170D14084F1E0C1E161B22231E19195A373D3755504D3C4250455153584448475045594F5A504B");
          bool3 = PermissionUtils.OooO0oO(str1, str2);
          if (bool3) {
            str1 = m54207b69.F54207b69_11("N958585F4E5A55631E5165555F5C57585F6668298E8A92767D82959185928888");
          }
          String str3;
          int i1;
          int i;
          for (;;)
          {
            OooO0Oo(localList, str1);
            break;
            str2 = m54207b69.F54207b69_11("j~1F111C0F151C20571624161E231A1B262121625251525144453A565A5952574B514C525D455757646753615C5C");
            bool3 = PermissionUtils.OooO0oO(str1, str2);
            str3 = m54207b69.F54207b69_11("LA20302736322D2B76392D3D37343F40373E40811316171A292A3721232B213C2C2E2322382C3335");
            i1 = 30;
            if (bool3)
            {
              i = AndroidVersion.OooO00o(paramContext);
              int k = 31;
              if (i >= k)
              {
                OooO0o0(localList, str3, i1);
                str1 = m54207b69.F54207b69_11("9W363A35283C4339802F3B2F454A31324D484A8B292829281B1C212E3332222231283C3A373A28443F41");
                continue;
              }
              OooO0Oo(localList, str3);
              break;
            }
            str2 = m54207b69.F54207b69_11("4L2F24236531272E452B2E326D48364C30355051383737782221312D201E3C362C20212B2B3732424347");
            boolean bool4 = PermissionUtils.OooO0oO(str1, str2);
            if (!bool4) {
              break label265;
            }
            str1 = m54207b69.F54207b69_11("Am0C040B2206090F4A2511290B102B2C131214554F4C3D554B4A453B3C4E5A4A4D464D4C4B62");
          }
          label265:
          int m = Permission.OooO0O0(str1);
          if (j >= m) {
            return;
          }
          str2 = m54207b69.F54207b69_11("uY38383F2E3A35437E3145353F3C37383F4648891E302D331D2C35372B34232E33383F3E2D");
          boolean bool5 = PermissionUtils.OooO0oO(str1, str2);
          int i2 = 32;
          String str4 = m54207b69.F54207b69_11("QO2E222D40242B31684733472D32494A35303273301E23212722303525391E2C22303D3D2341332E31");
          if (!bool5)
          {
            str2 = m54207b69.F54207b69_11("IY38383F2E3A35437E3145353F3C37383F4648891E302D331D2C35372B34232D2F3D3D38");
            bool5 = PermissionUtils.OooO0oO(str1, str2);
            if (!bool5)
            {
              str2 = m54207b69.F54207b69_11("VS323E3924403F3D842B3F2B49462D2E494C4E8F142A272D23362F31352E293025373B3E");
              bool5 = PermissionUtils.OooO0oO(str1, str2);
              if (!bool5)
              {
                str2 = m54207b69.F54207b69_11("+^3F313C2F353C40773644363E433A3B46414182232F3422331F1A233234341F393B2939403F32");
                bool5 = PermissionUtils.OooO0oO(str1, str2);
                if (bool5)
                {
                  OooO0o0(localList, str3, i2);
                  continue;
                }
                str2 = m54207b69.F54207b69_11("^H29272E3D2B26326D403644302D4849303737781D183223331F20361B3338292826");
                bool5 = PermissionUtils.OooO0oO(str1, str2);
                String str5 = m54207b69.F54207b69_11("iU343C332A3E4137822D3931434833344B4A4C8D2A2D15261832331B3826312F373C3C");
                if (bool5)
                {
                  OooO0o0(localList, str5, i1);
                  OooO0o0(localList, str3, i1);
                  continue;
                }
                str2 = m54207b69.F54207b69_11("%D252B22392F3226713C2A40343944453C3B3B7C191C26172723242A27372429292A222933");
                bool5 = PermissionUtils.OooO0oO(str1, str2);
                if (bool5)
                {
                  str1 = m54207b69.F54207b69_11("W*4B45505B4948540B625862524F6667525555167B7A9485957D7E987D");
                  OooO0o0(localList, str1, i1);
                  continue;
                }
                str2 = m54207b69.F54207b69_11("II28282F3E2A25336E4135452F2C47482F3638791E193122341E1F371C32252B3E2C3C3F233E31");
                bool5 = PermissionUtils.OooO0oO(str1, str2);
                if (bool5)
                {
                  OooO0o0(localList, str5, i1);
                  continue;
                }
                str2 = m54207b69.F54207b69_11("$l0D030A21070A0E492412280C112C2D141313543441374342414C434F54465C414D4155625C4864545352");
                bool5 = PermissionUtils.OooO0oO(str1, str2);
                if (bool5)
                {
                  i = 29;
                  OooO0o0(localList, str4, i);
                  str2 = m54207b69.F54207b69_11("~t151B12091F2216610C1A10242914152C2B2B6C363A523648434A463B4D435854584C49435F4B5B5A59");
                  OooO0o0(localList, str2, i);
                  continue;
                }
                str2 = m54207b69.F54207b69_11("_/4E424D60444B51086753674D52696A55505213907E83818797807A7C868D7F99828E8CA0A0");
                boolean bool2 = PermissionUtils.OooO0oO(str1, str2);
                if (!bool2) {
                  continue;
                }
                str1 = m54207b69.F54207b69_11("C2535D584361605C234A604A6A674E4F6A6D6D2E738B888C847A939797938A7F85938799");
                int n = 25;
                OooO0o0(localList, str1, n);
                continue;
              }
            }
          }
          OooO0o0(localList, str4, i2);
        }
      }
      return;
    }
    paramContext = new java/lang/IllegalStateException;
    paramList = m54207b69.F54207b69_11("FW1939792A362A40452C2D484345318545354389384645543B3B4B3F4D4F945C58974461559B3B5F5A4D61685E4663676D61635656AD647072AF6A78766E");
    paramContext.<init>(paramList);
    throw paramContext;
  }
  
  public static void OooO0o0(List paramList, String paramString, int paramInt)
  {
    paramList = paramList.iterator();
    Object localObject2;
    boolean bool2;
    do
    {
      bool1 = paramList.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (AndroidManifestInfo.PermissionInfo)paramList.next();
      localObject2 = ((AndroidManifestInfo.PermissionInfo)localObject1).OooO00o;
      bool2 = TextUtils.equals((CharSequence)localObject2, paramString);
    } while (!bool2);
    break label57;
    boolean bool1 = false;
    Object localObject1 = null;
    label57:
    if (localObject1 != null)
    {
      int i = ((AndroidManifestInfo.PermissionInfo)localObject1).OooO0O0;
      if (i < paramInt)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str1 = m54207b69.F54207b69_11("*m39060A5030080F260A0D132B1810121A182F2B5629151764231D1B23696E363D283F62402C44262B46472E2D2F7A3A32395034373D8C394338418A8A");
        ((StringBuilder)localObject2).append(str1);
        ((StringBuilder)localObject2).append(paramString);
        paramString = m54207b69.F54207b69_11("d=1F1E5E565D54585B61105A67517B67657B6961616867691737");
        ((StringBuilder)localObject2).append(paramString);
        ((StringBuilder)localObject2).append(i);
        paramString = m54207b69.F54207b69_11("?=1F1E1406215E585F56265D5D552A5E67685A2F5C696D33667065626F6B756E77736A703441");
        ((StringBuilder)localObject2).append(paramString);
        int j = -1 >>> 1;
        if (paramInt != j)
        {
          paramList = new java/lang/StringBuilder;
          paramList.<init>();
          paramString = m54207b69.F54207b69_11("Ck1F04104E0A070B090E271056251B282D122A2019221A3562251D3366222731572F215F313D3D282B2D742C4377");
          paramList.append(paramString);
          paramList.append(paramInt);
          paramList = paramList.toString();
        }
        else
        {
          paramString = new java/lang/StringBuilder;
          paramString.<init>();
          localObject3 = m54207b69.F54207b69_11("bD342923283B266A2729312B3B2D713E3B3175373D344B41443897434058343E4E3242585A515050A08E");
          paramString.append((String)localObject3);
          paramString.append(i);
          String str2 = "'J686B2D41423D292F474739";
          paramList = m54207b69.F54207b69_11(str2);
          paramString.append(paramList);
          paramList = paramString.toString();
        }
        ((StringBuilder)localObject2).append(paramList);
        paramList = ((StringBuilder)localObject2).toString();
        ((IllegalArgumentException)localObject1).<init>(paramList);
        throw ((Throwable)localObject1);
      }
      return;
    }
    paramList = new java/lang/IllegalStateException;
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject1 = m54207b69.F54207b69_11("jZ0A37413E2D44802F47463D343A4C36893A503A4A473E3F4A4D4D43954F51984D52609C3E58634E5C5B67416660606A6E595FA6556B6BB0736B6F79B5A26C677E69B86C826C7C7970717C7F7FC688828D78868591B489918E97C0D2");
    ((StringBuilder)localObject3).append((String)localObject1);
    ((StringBuilder)localObject3).append(paramString);
    paramString = m54207b69.F54207b69_11("1|5E5D5545");
    ((StringBuilder)localObject3).append(paramString);
    paramString = ((StringBuilder)localObject3).toString();
    paramList.<init>(paramString);
    throw paramList;
  }
  
  public static void OooO0oO(Context paramContext, List paramList)
  {
    String str1 = m54207b69.F54207b69_11("Nl0D030A21070A0E492412280C112C2D141313544043443F56574C3B4444424B52404451505C4A4949");
    boolean bool1 = PermissionUtils.OooO0o(paramList, str1);
    if (!bool1) {
      return;
    }
    Iterator localIterator = paramList.iterator();
    boolean bool2;
    String str2;
    String str3;
    String str4;
    do
    {
      String str5;
      boolean bool4;
      do
      {
        do
        {
          do
          {
            boolean bool3;
            do
            {
              bool2 = localIterator.hasNext();
              str2 = m54207b69.F54207b69_11("uY38383F2E3A35437E3145353F3C37383F4648891E302D331D2C35372B34232E33383F3E2D");
              str3 = m54207b69.F54207b69_11("QO2E222D40242B31684733472D32494A35303273301E23212722303525391E2C22303D3D2341332E31");
              str4 = m54207b69.F54207b69_11("$l0D030A21070A0E492412280C112C2D141313543441374342414C434F54465C414D4155625C4864545352");
              if (!bool2) {
                break;
              }
              str5 = (String)localIterator.next();
              bool3 = PermissionUtils.OooO0oO(str5, str1);
            } while (bool3);
            bool4 = PermissionUtils.OooO0oO(str5, str2);
          } while (bool4);
          bool4 = PermissionUtils.OooO0oO(str5, str3);
        } while (bool4);
        str2 = m54207b69.F54207b69_11("~t151B12091F2216610C1A10242914152C2B2B6C363A523648434A463B4D435854584C49435F4B5B5A59");
        bool4 = PermissionUtils.OooO0oO(str5, str2);
      } while (bool4);
      bool2 = PermissionUtils.OooO0oO(str5, str4);
    } while (bool2);
    paramContext = new java/lang/IllegalArgumentException;
    paramList = m54207b69.F54207b69_11("L577515857444B561C644A1F676763674F61615828686B6C675E5F2F736C6E7A73357A7C7978668281833E6F7B73858A75768D8C8E7A4E4B88924E95957D529284859A8E58979F8D5C8D9991A3A89394ABAAAC986894B09DA7B1AD9BABAD729FB975B5B8B9B4ABAC7CC0B9BBC7C082C7C9C6C5B3CFCED0");
    paramContext.<init>(paramList);
    throw paramContext;
    int i = AndroidVersion.OooO00o(paramContext);
    int j = 33;
    boolean bool5;
    if (i >= j)
    {
      bool5 = PermissionUtils.OooO0o(paramList, str2);
      if (!bool5)
      {
        bool5 = PermissionUtils.OooO0o(paramList, str4);
        if (!bool5)
        {
          paramContext = new java/lang/IllegalArgumentException;
          paramList = m54207b69.F54207b69_11("t]04332A80342D343085454344894941483F43464C87424E46484D4849504F51922F393E3C26353E403C452C3F3C4948473EAE6462B1716970676B6E74AF6A766E70757071787779BA58655D6766655067555A6A626771675966626C6A787776DC8F959C988D93E3909AE6A698999E92ECABA3A1F0B0A8AFA6AAADB3EEA9B5ADAFB4AFB0B7B6B8F9A3A6A7A2999A8F9EA7A9A5AE95A5A7B4B3A1ADACAE19CCD2D9D5CAD0");
          paramContext.<init>(paramList);
          throw paramContext;
        }
      }
    }
    else
    {
      bool5 = PermissionUtils.OooO0o(paramList, str3);
      if (!bool5)
      {
        bool5 = PermissionUtils.OooO0o(paramList, str4);
        if (!bool5)
        {
          paramContext = new java/lang/IllegalArgumentException;
          paramList = m54207b69.F54207b69_11("K=64534A20544D545025656364296961685F63666C27626E66686D6869706F71328F999E9C869D8B90A0989DA79D8F9C98A2A0AEADAC52888655958D948B8F9298538E9A92949994959C9B9D5EBCC9C1CBCAC9B4CBB9BECEC6CBD5CBBDCAC6D0CEDCDBDA80B3B9C0BCB1B787B4BE8ACABCBDC2B690CFC7C594D4CCD3CACED1D792CDD9D1D3D8D3D4DBDADC9D070A0B06FDFEF3020B0D0912F9090B181705111012BDF0F6FDF9EEF4");
          paramContext.<init>(paramList);
          throw paramContext;
        }
      }
    }
  }
  
  public static void OooO0oo(List paramList, AndroidManifestInfo paramAndroidManifestInfo)
  {
    Object localObject1 = m54207b69.F54207b69_11("^H29272E3D2B26326D403644302D4849303737781D183223331F20361B3338292826");
    boolean bool1 = PermissionUtils.OooO0o(paramList, (String)localObject1);
    String str1 = m54207b69.F54207b69_11("+^3F313C2F353C40773644363E433A3B46414182232F3422331F1A233234341F393B2939403F32");
    if (!bool1)
    {
      bool1 = PermissionUtils.OooO0o(paramList, str1);
      if (!bool1) {
        return;
      }
    }
    String str2 = m54207b69.F54207b69_11("LA20302736322D2B76392D3D37343F40373E40811316171A292A3721232B213C2C2E2322382C3335");
    boolean bool2 = PermissionUtils.OooO0o(paramList, str2);
    if (bool2) {
      return;
    }
    if (paramAndroidManifestInfo == null) {
      return;
    }
    paramList = paramAndroidManifestInfo.OooO0OO.iterator();
    boolean bool4;
    do
    {
      do
      {
        boolean bool3 = paramList.hasNext();
        if (!bool3) {
          return;
        }
        paramAndroidManifestInfo = (AndroidManifestInfo.PermissionInfo)paramList.next();
        localObject2 = paramAndroidManifestInfo.OooO00o;
        bool4 = PermissionUtils.OooO0oO((String)localObject2, (String)localObject1);
        if (bool4) {
          break;
        }
        localObject2 = paramAndroidManifestInfo.OooO00o;
        bool4 = PermissionUtils.OooO0oO((String)localObject2, str1);
      } while (!bool4);
      bool4 = paramAndroidManifestInfo.OooO00o();
    } while (bool4);
    int i = paramAndroidManifestInfo.OooO0O0;
    int j = -1 >>> 1;
    str1 = "\" ";
    if (i != j)
    {
      paramList = new java/lang/StringBuilder;
      paramList.<init>();
      localObject1 = m54207b69.F54207b69_11("%b030D081311100C5F170C243C1216421620221D20207456");
      paramList.append((String)localObject1);
      j = paramAndroidManifestInfo.OooO0O0;
      paramList.append(j);
      paramList.append(str1);
      paramList = paramList.toString();
    }
    else
    {
      paramList = "";
    }
    localObject1 = new java/lang/IllegalArgumentException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str3 = m54207b69.F54207b69_11("2L052B6E38273E4473354546773430374E327C4A7F4D543F83");
    ((StringBuilder)localObject2).append(str3);
    str3 = paramAndroidManifestInfo.OooO00o;
    ((StringBuilder)localObject2).append(str3);
    str3 = m54207b69.F54207b69_11("%/0F5C42124C4F61166750606752595C521F54525F62705C57591C297A5F676C7B6A306E6A72666E71378471753B40888B7A8D34927E92787D9495807B7D4C8C808B9E82898F5A87958A935C58");
    ((StringBuilder)localObject2).append(str3);
    str3 = paramAndroidManifestInfo.OooO00o;
    ((StringBuilder)localObject2).append(str3);
    ((StringBuilder)localObject2).append(str1);
    ((StringBuilder)localObject2).append(paramList);
    str1 = m54207b69.F54207b69_11("G$0B1B064D4F45470B55530E5B584E1258555B5F55556C661B5A66625C206D6923387279647B2E7A687E727782837A797934767C738A80837756837F847D5644");
    ((StringBuilder)localObject2).append(str1);
    str1 = paramAndroidManifestInfo.OooO00o;
    ((StringBuilder)localObject2).append(str1);
    str1 = m54207b69.F54207b69_11("7j484B0D07121D0B0A165929241B26481E2818152C2D181B1B441F2528357466232F3D313B502A3E4D2D3235492F3232777A");
    ((StringBuilder)localObject2).append(str1);
    ((StringBuilder)localObject2).append(paramList);
    paramList = m54207b69.F54207b69_11("jC6C7E6530302C2C766B332F6E463944407333454677423C3D3F7C504B4280");
    ((StringBuilder)localObject2).append(paramList);
    paramList = paramAndroidManifestInfo.OooO00o;
    ((StringBuilder)localObject2).append(paramList);
    paramList = m54207b69.F54207b69_11("AB62372F65292C3C693A33453C372E313D723F3F34374B414444877C3E4A4E4B814C484949865B53894B4F508D");
    ((StringBuilder)localObject2).append(paramList);
    ((StringBuilder)localObject2).append(str2);
    paramList = m54207b69.F54207b69_11("Um4D1E0A22040924250C0B0D29");
    ((StringBuilder)localObject2).append(paramList);
    paramList = ((StringBuilder)localObject2).toString();
    ((IllegalArgumentException)localObject1).<init>(paramList);
    throw ((Throwable)localObject1);
  }
  
  public static boolean OooOO0(List paramList, boolean paramBoolean)
  {
    int i = 0;
    String str1 = null;
    if (paramList != null)
    {
      boolean bool2 = paramList.isEmpty();
      if (!bool2)
      {
        int j = AndroidVersion.getAndroidVersionCode();
        int k = 33;
        boolean bool4 = true;
        if (j > k) {
          return bool4;
        }
        if (paramBoolean)
        {
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          Object localObject2 = Permission.class.getDeclaredFields();
          k = localObject2.length;
          if (k == 0) {
            return bool4;
          }
          k = localObject2.length;
          while (i < k)
          {
            Object localObject3 = localObject2[i];
            Class localClass = ((Field)localObject3).getType();
            String str2 = String.class;
            boolean bool5 = str2.equals(localClass);
            if (bool5)
            {
              bool5 = false;
              localClass = null;
              try
              {
                localObject3 = ((Field)localObject3).get(null);
                localObject3 = (String)localObject3;
                ((List)localObject1).add(localObject3);
              }
              catch (IllegalAccessException localIllegalAccessException)
              {
                localIllegalAccessException.printStackTrace();
              }
            }
            i += 1;
          }
          paramList = paramList.iterator();
          boolean bool3;
          do
          {
            boolean bool1 = paramList.hasNext();
            if (!bool1) {
              break;
            }
            str1 = (String)paramList.next();
            bool3 = PermissionUtils.OooO0o((Collection)localObject1, str1);
          } while (bool3);
          paramList = new java/lang/IllegalArgumentException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject2 = m54207b69.F54207b69_11("~I1D222E6C");
          ((StringBuilder)localObject1).append((String)localObject2);
          ((StringBuilder)localObject1).append(str1);
          str1 = m54207b69.F54207b69_11("'%054D58084F4F570C4C0E4B4F574F4E665A61681869556D5F646F70676668236977267878646B726B712E7F6B83757A85867D7C7E3D3A8B80787D907B417E88448B8B93489B859A97889F9B508DA99993989D98979D9EB2");
          ((StringBuilder)localObject1).append(str1);
          localObject1 = ((StringBuilder)localObject1).toString();
          paramList.<init>((String)localObject1);
          throw paramList;
        }
        return bool4;
      }
    }
    if (!paramBoolean) {
      return false;
    }
    paramList = new java/lang/IllegalArgumentException;
    Object localObject1 = m54207b69.F54207b69_11("zg3310044A19071C190A1D1D0D0F542511251B202728231E205F1D202425253166252369252E3C3945");
    paramList.<init>((String)localObject1);
    throw paramList;
  }
  
  public static void OooOO0O(Activity paramActivity, List paramList, AndroidManifestInfo paramAndroidManifestInfo)
  {
    Object localObject = m54207b69.F54207b69_11("7b030D081311100C531A101A1A171E1F1A1D1D5E453F364C4E48405746485A504A415759534B");
    boolean bool1 = PermissionUtils.OooO0o(paramList, (String)localObject);
    if (!bool1) {
      return;
    }
    if (paramAndroidManifestInfo == null) {
      return;
    }
    paramList = paramAndroidManifestInfo.OooO0o0;
    int i = 0;
    paramAndroidManifestInfo = null;
    for (;;)
    {
      int j = paramList.size();
      if (i >= j) {
        break;
      }
      localObject = (AndroidManifestInfo.ActivityInfo)paramList.get(i);
      boolean bool2 = ((AndroidManifestInfo.ActivityInfo)localObject).OooO0O0;
      if (bool2) {
        return;
      }
      i += 1;
    }
    paramList = paramActivity.getClass().getName();
    paramActivity = paramActivity.getPackageName();
    paramActivity = paramList.replace(paramActivity, "");
    paramList = new java/lang/IllegalArgumentException;
    paramAndroidManifestInfo = new java/lang/StringBuilder;
    paramAndroidManifestInfo.<init>();
    localObject = m54207b69.F54207b69_11("pi27074B0B0E22062608261A5427191C0F2A2E1E2E20225F3134323321373A3858202B3F3F3F31462E6129344848483A78384E4F4E34405254447E8354414946594C8A5D4F52456064546493AEA155586C50705270649E5E5E6574605B69B06567646DB6AE");
    paramAndroidManifestInfo.append((String)localObject);
    paramAndroidManifestInfo.append(paramActivity);
    paramActivity = m54207b69.F54207b69_11("kO6D7030242F42262D337E46454B4C2E4C4B4D313940505054421F3B3A424959595D4B94905F62605195989B9A524E9D3D515C6F535A603865595F636578789F766264");
    paramAndroidManifestInfo.append(paramActivity);
    paramActivity = paramAndroidManifestInfo.toString();
    paramList.<init>(paramActivity);
    throw paramList;
  }
  
  public static void OooOO0o(List paramList)
  {
    String str = m54207b69.F54207b69_11("d]3C343B3236393F7A3541393B403B3C43424485222C312F192831332F381F29332E293E34262D343F372B38433D454C38484A");
    boolean bool1 = PermissionUtils.OooO0o(paramList, str);
    if (!bool1) {
      return;
    }
    str = m54207b69.F54207b69_11("uY38383F2E3A35437E3145353F3C37383F4648891E302D331D2C35372B34232E33383F3E2D");
    bool1 = PermissionUtils.OooO0o(paramList, str);
    if (!bool1)
    {
      str = m54207b69.F54207b69_11("IY38383F2E3A35437E3145353F3C37383F4648891E302D331D2C35372B34232D2F3D3D38");
      boolean bool2 = PermissionUtils.OooO0o(paramList, str);
      if (!bool2)
      {
        paramList = new java/lang/IllegalArgumentException;
        str = m54207b69.F54207b69_11("OB1B2E396525283233353F6C3B33404536414774493E3C783A443F4A4847438A514751514E5556515454953A322F334B3E37373D36514941484F3C4858534E454F5D5249514B465C4E4EAB7C727C7C7980817C7F7FB67884848480C6BD8B948F95C2848889C68C919D92909ACD8F99949F9D9C98DFA69CA6A6A3AAABA6A9A9EA8F878488A0938C8C928BA6959A8F9295A0F2BEC2F5B7C1BCC7C5C4C007CEC4CECECBD2D3CED1D112B7AFACB0C8BBB4B4BAB3CEC6BEBABCC319EAE0EAEAE7EEEFEAEDED3025F1F528F6EB04EAF22EEDFB05FA");
        paramList.<init>(str);
        throw paramList;
      }
    }
  }
  
  public static void OooOOO(Context paramContext, List paramList)
  {
    paramList = paramList.iterator();
    int i;
    int j;
    do
    {
      boolean bool1 = paramList.hasNext();
      if (!bool1) {
        break;
      }
      str1 = (String)paramList.next();
      String str2 = m54207b69.F54207b69_11("d]3C343B3236393F7A3541393B403B3C43424485222C312F192831332F381F29332E293E34262D343F372B38433D454C38484A");
      boolean bool2 = PermissionUtils.OooO0oO(str1, str2);
      if (bool2) {
        i = 33;
      } else {
        i = Permission.OooO0O0(str1);
      }
      j = AndroidVersion.OooO00o(paramContext);
    } while (j >= i);
    paramContext = new java/lang/IllegalStateException;
    paramList = new java/lang/StringBuilder;
    paramList.<init>();
    String str3 = m54207b69.F54207b69_11("&P0236232839282A77");
    paramList.append(str3);
    paramList.append(str1);
    String str1 = m54207b69.F54207b69_11("rO6F402C40262B42432E292B6E7B2835397F4C40503C3F5133433D33455959443F41903E2E2894486164649958569C");
    paramList.append(str1);
    paramList.append(i);
    str1 = m54207b69.F54207b69_11("Yk4B051B4E0A091F154F540C18571F122D5B20165E1919356234231F3A673C226A3E3C2E3C2E343472473343373A4C663E306E404C4C373A3C7F8455424A47564D8B4B5D5E4B5791634A684D966B505C9A5458619E6F636F5D5A71725D6062");
    paramList.append(str1);
    paramList = paramList.toString();
    paramContext.<init>(paramList);
    throw paramContext;
  }
  
  public static void OooOOO0(Context paramContext, List paramList, AndroidManifestInfo paramAndroidManifestInfo)
  {
    String str1 = m54207b69.F54207b69_11("uY38383F2E3A35437E3145353F3C37383F4648891E302D331D2C35372B34232E33383F3E2D");
    boolean bool1 = PermissionUtils.OooO0o(paramList, str1);
    String str2 = m54207b69.F54207b69_11("VS323E3924403F3D842B3F2B49462D2E494C4E8F142A272D23362F31352E293025373B3E");
    String str3 = m54207b69.F54207b69_11("QO2E222D40242B31684733472D32494A35303273301E23212722303525391E2C22303D3D2341332E31");
    String str4 = m54207b69.F54207b69_11("IY38383F2E3A35437E3145353F3C37383F4648891E302D331D2C35372B34232D2F3D3D38");
    String str5 = m54207b69.F54207b69_11("$l0D030A21070A0E492412280C112C2D141313543441374342414C434F54465C414D4155625C4864545352");
    if (!bool1)
    {
      bool1 = PermissionUtils.OooO0o(paramList, str4);
      if (!bool1)
      {
        bool1 = PermissionUtils.OooO0o(paramList, str2);
        if (!bool1)
        {
          bool1 = PermissionUtils.OooO0o(paramList, str5);
          if (!bool1)
          {
            bool1 = PermissionUtils.OooO0o(paramList, str3);
            if (!bool1)
            {
              String str6 = m54207b69.F54207b69_11("~t151B12091F2216610C1A10242914152C2B2B6C363A523648434A463B4D435854584C49435F4B5B5A59");
              bool1 = PermissionUtils.OooO0o(paramList, str6);
              if (!bool1) {
                return;
              }
            }
          }
        }
      }
    }
    int i = AndroidVersion.OooO00o(paramContext);
    int k = 33;
    if (i >= k)
    {
      boolean bool2 = PermissionUtils.OooO0o(paramList, str3);
      if (bool2)
      {
        paramContext = new java/lang/IllegalArgumentException;
        paramList = m54207b69.F54207b69_11("|?68585C542350645460635577676177695D5D6863653417193725263A68746E69737C416D707F45857984777B82883F7E8A7E848980818C87894AA7B5BAB89EB1BABCB8C1A4BBB8C5C0C3B65E6BAB9FAA9DA1A8AE65A4B0A4AAAFA6A7B2ADAF70CDDBE0DEC4D7E0E2DEE7CAD4E2E8E8DF8390D0C4CFC2C6CDD38AC9D5C9CFD4CBCCD7D2D495F2000503E9FC0507030CEF0EFB0D0904B4ECE8E4E4F4F9F7BCEEF8BFFFF3FEF1F5FC02B9F804F8FE03FAFB060103C4212F343218332126362A2F3D33212E2E3432443F42");
        paramContext.<init>(paramList);
        throw paramContext;
      }
    }
    boolean bool3 = PermissionUtils.OooO0o(paramList, str1);
    if (!bool3)
    {
      bool3 = PermissionUtils.OooO0o(paramList, str4);
      if (!bool3)
      {
        bool3 = PermissionUtils.OooO0o(paramList, str2);
        if (!bool3)
        {
          str1 = m54207b69.F54207b69_11("Nl0D030A21070A0E492412280C112C2D141313544043443F56574C3B4444424B52404451505C4A4949");
          bool3 = PermissionUtils.OooO0o(paramList, str1);
          if (bool3) {
            return;
          }
          if (paramAndroidManifestInfo == null) {
            return;
          }
          paramAndroidManifestInfo = paramAndroidManifestInfo.OooO0Oo;
          if (paramAndroidManifestInfo == null) {
            return;
          }
          bool3 = PermissionUtils.OooOOOO(paramContext);
          int m = AndroidVersion.OooO00o(paramContext);
          boolean bool5 = paramAndroidManifestInfo.OooO0O0;
          int j = 29;
          if ((m >= j) && (!bool5))
          {
            bool5 = PermissionUtils.OooO0o(paramList, str5);
            if ((bool5) || (!bool3))
            {
              paramContext = new java/lang/IllegalStateException;
              paramList = m54207b69.F54207b69_11("b_0F343C41303F85344241403737473B8E3B484C9252465144484F558049574C495A4D4D365E5D64634E435156665A5F6D633D5D6361736E719AB665686677BBBE7E6C6D707A82707282C8807CCB788589CF6F838E81858C926A978B9195978A8AD1889496E39E9C9AA2DCE99B97A4A89C98A79EADF3ABA1F6A0AFADAEFBB9BCA9ACBB01B9B5C1B6B9B7C7B5C1C9C3C1C5BBB711BBCAC0CD16C3D0D41ACCD0D91EC9DBCFCFDAD5D7");
              paramContext.<init>(paramList);
              throw paramContext;
            }
          }
          int n = 30;
          if (m >= n)
          {
            boolean bool4 = PermissionUtils.OooO0o(paramList, str5);
            if ((!bool4) && (!bool3))
            {
              paramContext = new java/lang/IllegalArgumentException;
              paramList = m54207b69.F54207b69_11("dL18252B6F433D29453534337748364C30355051383737824454553A404B4A564443438E48639153554A4C684C594D909B355B9E68576EA25B657363A769656B7B786A6AAF7C696FB387786D8775B98D87738F7F7E7DB5C2937882879A85C99C888B86A19B8DA3D29F8C92D6DB8D96A69CD1999FABA1E1A399A0B79DA0A4F3A0ACA1AAF3F1A3B4A9C3B1B1A9C3AFCBBBBAB9FFFEC0B6BDD4BABDC110D5C9BDD7C8110FDAE1DDCE14130B1B16D8E4E5ECD4DEEAEADC20DAD823F0DDE327C9DFE6FDE3E6EAC4F1E7EBF1F108022D00EEEE3BFAF6F2FC3641DB014411FE041A064A041F4D040650120E14242117231110105B2F20152F1D61352F1B372726255D6A3B202A2F422D713F463175372D344B313438734E3C52363B56573E3D3D7E1E2B212D2C2B362D393E30462B372B3F4C46324E3E3D3CA06D59A36575765B71A968627EAD7E6C82666B86876E6D6D");
              paramContext.<init>(paramList);
              throw paramContext;
            }
          }
        }
      }
    }
  }
  
  public static void OooOOOO(List paramList)
  {
    boolean bool1 = AndroidVersion.isAndroid13();
    String str1 = m54207b69.F54207b69_11("LA20302736322D2B76392D3D37343F40373E40811316171A292A3721232B213C2C2E2322382C3335");
    String str2 = m54207b69.F54207b69_11("QO2E222D40242B31684733472D32494A35303273301E23212722303525391E2C22303D3D2341332E31");
    if (!bool1)
    {
      str3 = m54207b69.F54207b69_11("Q4555B52495F6256214C5A50646954556C6B6B2C778F7C768292947A988E9A9594809E9D9D8B");
      bool1 = PermissionUtils.OooO0o(paramList, str3);
      if (bool1)
      {
        str3 = m54207b69.F54207b69_11("2[3A36412C3837457C334733413E35364144468728282428342A31342A2E313323283F2B30363D44");
        boolean bool2 = PermissionUtils.OooO0o(paramList, str3);
        if (!bool2) {
          paramList.add(str3);
        }
      }
      str3 = m54207b69.F54207b69_11("+^3F313C2F353C40773644363E433A3B46414182232F3422331F1A233234341F393B2939403F32");
      bool1 = PermissionUtils.OooO0o(paramList, str3);
      if (bool1)
      {
        bool1 = PermissionUtils.OooO0o(paramList, str1);
        if (!bool1) {
          paramList.add(str1);
        }
      }
      str3 = m54207b69.F54207b69_11("uY38383F2E3A35437E3145353F3C37383F4648891E302D331D2C35372B34232E33383F3E2D");
      bool1 = PermissionUtils.OooO0o(paramList, str3);
      if (!bool1)
      {
        str3 = m54207b69.F54207b69_11("IY38383F2E3A35437E3145353F3C37383F4648891E302D331D2C35372B34232D2F3D3D38");
        bool1 = PermissionUtils.OooO0o(paramList, str3);
        if (!bool1)
        {
          str3 = m54207b69.F54207b69_11("VS323E3924403F3D842B3F2B49462D2E494C4E8F142A272D23362F31352E293025373B3E");
          bool1 = PermissionUtils.OooO0o(paramList, str3);
          if (!bool1) {
            break label177;
          }
        }
      }
      bool1 = PermissionUtils.OooO0o(paramList, str2);
      if (!bool1) {
        paramList.add(str2);
      }
    }
    label177:
    bool1 = AndroidVersion.isAndroid12();
    if (!bool1)
    {
      str3 = m54207b69.F54207b69_11("^H29272E3D2B26326D403644302D4849303737781D183223331F20361B3338292826");
      bool1 = PermissionUtils.OooO0o(paramList, str3);
      if (bool1)
      {
        bool1 = PermissionUtils.OooO0o(paramList, str1);
        if (!bool1) {
          paramList.add(str1);
        }
      }
    }
    String str3 = m54207b69.F54207b69_11("$l0D030A21070A0E492412280C112C2D141313543441374342414C434F54465C414D4155625C4864545352");
    bool1 = PermissionUtils.OooO0o(paramList, str3);
    boolean bool3;
    if (bool1)
    {
      bool1 = PermissionUtils.OooO0o(paramList, str2);
      if (!bool1)
      {
        str3 = m54207b69.F54207b69_11("~t151B12091F2216610C1A10242914152C2B2B6C363A523648434A463B4D435854584C49435F4B5B5A59");
        bool3 = PermissionUtils.OooO0o(paramList, str3);
        if (!bool3)
        {
          bool3 = AndroidVersion.isAndroid11();
          if (bool3) {
            break label319;
          }
          paramList.add(str2);
          paramList.add(str3);
          break label319;
        }
      }
      paramList = new java/lang/IllegalArgumentException;
      str3 = m54207b69.F54207b69_11("d47D5316505F461A635D4B5B1F615152676D62622766705C2B918E94908F8E89908C8193899E9A9E928F89A591A1A09F437482788C917C7D9493938153508D99539A9C825799898A9F955D9CA692618EABA165B8C4C9C5C1C8C4B9CBC1D6D2D6CAC7C1DDC9D9D8D77BBDC3BA7FCFD3EBCFE1DCE3DFD4E6DCF1EDF1E5E2DCF8E4F4F3F296C7D5CBDFE4CFD0E7E6E6D4");
      paramList.<init>(str3);
      throw paramList;
    }
    label319:
    bool1 = AndroidVersion.isAndroid10();
    if (!bool1)
    {
      str3 = m54207b69.F54207b69_11("`j0B05101B0908144B221822120F2627121515563E3D5339533B574D50544C47444D454561474A4A");
      bool1 = PermissionUtils.OooO0o(paramList, str3);
      if (bool1)
      {
        str3 = m54207b69.F54207b69_11("N958585F4E5A55631E5165555F5C57585F6668298E8A92767D82959185928888");
        bool3 = PermissionUtils.OooO0o(paramList, str3);
        if (!bool3) {
          paramList.add(str3);
        }
      }
    }
    bool1 = AndroidVersion.isAndroid8();
    if (!bool1)
    {
      str3 = m54207b69.F54207b69_11("_/4E424D60444B51086753674D52696A55505213907E83818797807A7C868D7F99828E8CA0A0");
      bool1 = PermissionUtils.OooO0o(paramList, str3);
      if (bool1)
      {
        str3 = m54207b69.F54207b69_11("C2535D584361605C234A604A6A674E4F6A6D6D2E738B888C847A939797938A7F85938799");
        bool3 = PermissionUtils.OooO0o(paramList, str3);
        if (!bool3) {
          paramList.add(str3);
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.permissions.PermissionChecker
 * JD-Core Version:    0.7.0.1
 */
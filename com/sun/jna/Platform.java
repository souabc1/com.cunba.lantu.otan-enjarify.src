package com.sun.jna;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import m54207b69;

public final class Platform
{
  public static final int OooO;
  public static final boolean OooO00o;
  public static final boolean OooO0O0;
  public static final boolean OooO0OO;
  public static final boolean OooO0Oo;
  public static final String OooO0o;
  public static final String OooO0o0;
  public static final boolean OooO0oO;
  public static final String OooO0oo = getNativeLibraryResourcePrefix();
  public static final String OooOO0;
  
  static
  {
    Object localObject1 = System.getProperty(m54207b69.F54207b69_11("sH273C68292D2A33"));
    String str1 = m54207b69.F54207b69_11("`97551594F45");
    boolean bool1 = ((String)localObject1).startsWith(str1);
    int j = 8;
    int k = 7;
    int m = 2;
    int n = 6;
    boolean bool2 = false;
    int i1 = 1;
    int i3;
    if (bool1)
    {
      localObject1 = System.getProperty(m54207b69.F54207b69_11("Cl060E1C10461F07490A160B14")).toLowerCase();
      str1 = m54207b69.F54207b69_11("VN2A30243B2B2A");
      boolean bool3 = str1.equals(localObject1);
      if (bool3)
      {
        OooO = j;
        localObject1 = m54207b69.F54207b69_11("7-47444E0647475E4A65555851");
        str1 = m54207b69.F54207b69_11("/541484253");
        System.setProperty((String)localObject1, str1);
      }
      else
      {
        OooO = i1;
      }
    }
    else
    {
      str1 = "AIX";
      bool1 = ((String)localObject1).startsWith(str1);
      if (bool1)
      {
        OooO = k;
      }
      else
      {
        str1 = "Mac";
        bool1 = ((String)localObject1).startsWith(str1);
        if (!bool1)
        {
          str1 = m54207b69.F54207b69_11("dI0D293D41242C");
          bool1 = ((String)localObject1).startsWith(str1);
          if (!bool1)
          {
            str1 = m54207b69.F54207b69_11("BB152C2E29313A37690910");
            bool1 = ((String)localObject1).startsWith(str1);
            if (bool1)
            {
              OooO = n;
              break label377;
            }
            str1 = m54207b69.F54207b69_11("N86F52585F5B5451");
            bool1 = ((String)localObject1).startsWith(str1);
            if (bool1)
            {
              OooO = m;
              break label377;
            }
            str1 = m54207b69.F54207b69_11("+\\0F343240323A35");
            bool1 = ((String)localObject1).startsWith(str1);
            if (!bool1)
            {
              str1 = m54207b69.F54207b69_11("gr21081E4025");
              bool1 = ((String)localObject1).startsWith(str1);
              if (!bool1)
              {
                str1 = m54207b69.F54207b69_11("XT122733341A0C16");
                bool1 = ((String)localObject1).startsWith(str1);
                int i2;
                if (bool1)
                {
                  i2 = 4;
                  break label365;
                }
                str1 = m54207b69.F54207b69_11("sZ152B41371C0E24");
                bool1 = ((String)localObject1).startsWith(str1);
                if (bool1)
                {
                  i2 = 5;
                  break label365;
                }
                str1 = "gnu";
                bool1 = ((String)localObject1).equalsIgnoreCase(str1);
                if (bool1)
                {
                  i2 = 9;
                  break label365;
                }
                str1 = m54207b69.F54207b69_11("_I2E283E692634413334344438");
                bool1 = ((String)localObject1).equalsIgnoreCase(str1);
                if (bool1)
                {
                  i2 = 10;
                  break label365;
                }
                str1 = m54207b69.F54207b69_11("Yy171D0F1E0E22");
                boolean bool4 = ((String)localObject1).equalsIgnoreCase(str1);
                if (bool4)
                {
                  i3 = 11;
                  break label365;
                }
                i3 = -1;
                break label365;
              }
            }
            i3 = 3;
            label365:
            OooO = i3;
            break label377;
          }
        }
        OooO = 0;
      }
    }
    label377:
    localObject1 = "'W3D3723397D3E443F811E2C3C3D3F33";
    try
    {
      localObject1 = m54207b69.F54207b69_11((String)localObject1);
      Class.forName((String)localObject1);
      i3 = i1;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      i3 = 0;
      localObject1 = null;
    }
    int i = OooO;
    if ((i != n) && (i != j) && (i != k))
    {
      j = i1;
    }
    else
    {
      j = 0;
      str2 = null;
    }
    OooO0OO = j;
    if ((j != 0) && (i != 0))
    {
      j = i1;
    }
    else
    {
      j = 0;
      str2 = null;
    }
    OooO0Oo = j;
    OooO0O0 = i3;
    if (i != n)
    {
      i3 = i1;
    }
    else
    {
      i3 = 0;
      localObject1 = null;
    }
    OooO00o = i3;
    localObject1 = m54207b69.F54207b69_11("B]3E33313B3D3637");
    String str2 = m54207b69.F54207b69_11("D_322D2B3F3130");
    Object localObject2;
    if (i == m) {
      localObject2 = str2;
    } else if (i == n) {
      localObject2 = localObject1;
    } else {
      localObject2 = "c";
    }
    OooO0o = (String)localObject2;
    if (i == m) {
      localObject1 = str2;
    } else if (i != n) {
      localObject1 = "m";
    }
    OooO0o0 = (String)localObject1;
    localObject1 = OooO00o(System.getProperty(m54207b69.F54207b69_11("HZ352A763E2C3E38")), i);
    OooOO0 = (String)localObject1;
    if (i == m)
    {
      str1 = m54207b69.F54207b69_11("GR333422343E");
      boolean bool5 = ((String)localObject1).startsWith(str1);
      if (!bool5) {
        bool2 = i1;
      }
    }
    OooO0oO = bool2;
  }
  
  public static String OooO00o(String paramString, int paramInt)
  {
    paramString = paramString.toLowerCase().trim();
    String str1 = m54207b69.F54207b69_11("Hm1D031C0B232214");
    int i = str1.equals(paramString);
    String str2 = m54207b69.F54207b69_11("d_2F303E6C6F");
    String str3;
    if (i != 0)
    {
      paramString = "ppc";
    }
    else
    {
      str1 = m54207b69.F54207b69_11("YS233D26392528366C6F");
      i = str1.equals(paramString);
      if (i != 0)
      {
        paramString = str2;
      }
      else
      {
        str1 = m54207b69.F54207b69_11("%n075E585B");
        i = str1.equals(paramString);
        if (i == 0)
        {
          str1 = m54207b69.F54207b69_11("j&4F112013");
          i = str1.equals(paramString);
          if (i == 0)
          {
            str1 = m54207b69.F54207b69_11("1i115261396362");
            i = str1.equals(paramString);
            if (i == 0)
            {
              str1 = m54207b69.F54207b69_11("Q.4F444C1B1E");
              i = str1.equals(paramString);
              if (i == 0) {
                break label142;
              }
            }
            str3 = "0Y216271777372";
            paramString = m54207b69.F54207b69_11(str3);
            break label142;
          }
        }
        paramString = "x86";
      }
    }
    label142:
    i = str2.equals(paramString);
    if (i != 0)
    {
      str1 = System.getProperty(m54207b69.F54207b69_11("RI3A3D296A2E3E426E3430372B3434"));
      str2 = m54207b69.F54207b69_11("@v1A2004051E18");
      i = str2.equals(str1);
      if (i != 0)
      {
        str3 = "3~0E0F1F4B4E1721";
        paramString = m54207b69.F54207b69_11(str3);
      }
    }
    str1 = "arm";
    i = str1.equals(paramString);
    if (i != 0)
    {
      i = 1;
      if (paramInt == i)
      {
        paramInt = isSoftFloat();
        if (paramInt != 0)
        {
          str3 = "(g06160C050F";
          paramString = m54207b69.F54207b69_11(str3);
        }
      }
    }
    return paramString;
  }
  
  public static String OooO0O0(int paramInt, String paramString1, String paramString2)
  {
    paramString1 = OooO00o(paramString1, paramInt);
    switch (paramInt)
    {
    case 7: 
    case 9: 
    default: 
      localObject = paramString2.toLowerCase();
      paramString2 = " ";
      int i = ((String)localObject).indexOf(paramString2);
      int j = -1;
      if (i == j) {
        break label311;
      }
      j = 0;
      localObject = ((String)localObject).substring(0, i);
      break;
    case 11: 
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      paramString2 = m54207b69.F54207b69_11("8[353F313C2C447C");
      break;
    case 10: 
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      paramString2 = m54207b69.F54207b69_11("ZO242A3F2D2E3242326A");
      break;
    case 8: 
      localObject = "arm";
      boolean bool = paramString1.startsWith((String)localObject);
      if (bool) {
        paramString1 = (String)localObject;
      }
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      paramString2 = m54207b69.F54207b69_11("uV373934273D443882");
      break;
    case 6: 
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      paramString2 = m54207b69.F54207b69_11("5X2F6C6C3E417A");
      break;
    case 5: 
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      paramString2 = m54207b69.F54207b69_11("YA2E32263227372B73");
      break;
    case 4: 
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      paramString2 = m54207b69.F54207b69_11("sZ3C2941423C2E447E");
      break;
    case 3: 
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      paramString2 = m54207b69.F54207b69_11("j546415D5D4A1D");
      break;
    case 2: 
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      paramString2 = m54207b69.F54207b69_11(":X2F32386E6E7A");
      break;
    case 1: 
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      paramString2 = m54207b69.F54207b69_11("VY3531392F2579");
      break;
    case 0: 
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      paramString2 = m54207b69.F54207b69_11("We0105191510104E");
    }
    ((StringBuilder)localObject).append(paramString2);
    ((StringBuilder)localObject).append(paramString1);
    Object localObject = ((StringBuilder)localObject).toString();
    return localObject;
    label311:
    paramString2 = new java/lang/StringBuilder;
    paramString2.<init>();
    paramString2.append((String)localObject);
    paramString2.append("-");
    paramString2.append(paramString1);
    localObject = paramString2.toString();
    return localObject;
  }
  
  public static String getNativeLibraryResourcePrefix()
  {
    String str1 = System.getProperty(m54207b69.F54207b69_11("7\\36333F7530333F413D2D"));
    if (str1 != null) {
      return str1;
    }
    int i = getOSType();
    String str2 = System.getProperty(m54207b69.F54207b69_11("HZ352A763E2C3E38"));
    String str3 = System.getProperty(m54207b69.F54207b69_11("sH273C68292D2A33"));
    return OooO0O0(i, str2, str3);
  }
  
  public static final int getOSType()
  {
    return OooO;
  }
  
  public static final boolean is64Bit()
  {
    String str1 = System.getProperty(m54207b69.F54207b69_11("@S303D40803E3644842D47873C46344C4B4747"));
    String str2 = m54207b69.F54207b69_11("d@333630712537292F762D2B3F2D7B3B3E34363E");
    str1 = System.getProperty(str2, str1);
    if (str1 != null) {
      return "64".equals(str1);
    }
    str1 = OooOO0;
    str2 = m54207b69.F54207b69_11("0Y216271777372");
    boolean bool1 = str2.equals(str1);
    boolean bool2 = true;
    if (!bool1)
    {
      str2 = m54207b69.F54207b69_11("=O262F7B7E");
      bool1 = str2.equals(str1);
      if (!bool1)
      {
        str2 = m54207b69.F54207b69_11("d_2F303E6C6F");
        bool1 = str2.equals(str1);
        if (!bool1)
        {
          str2 = m54207b69.F54207b69_11("3~0E0F1F4B4E1721");
          bool1 = str2.equals(str1);
          if (!bool1)
          {
            str2 = m54207b69.F54207b69_11("gm1E1E0E2212205A");
            bool1 = str2.equals(str1);
            if (!bool1)
            {
              str2 = m54207b69.F54207b69_11("cX35322A2E7271");
              bool1 = str2.equals(str1);
              if (!bool1)
              {
                str2 = m54207b69.F54207b69_11("j<51564E520E0D5F57");
                bool1 = str2.equals(str1);
                if (!bool1)
                {
                  str2 = m54207b69.F54207b69_11("Q.4F444C1B1E");
                  bool1 = str2.equals(str1);
                  if (!bool1)
                  {
                    str2 = m54207b69.F54207b69_11("%-4C4D615149201F");
                    boolean bool3 = str2.equals(str1);
                    if (!bool3)
                    {
                      int j = Native.OooOO0o;
                      int i = 8;
                      if (j != i) {
                        bool2 = false;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return bool2;
  }
  
  public static final boolean isAIX()
  {
    int i = OooO;
    int j = 7;
    if (i == j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static final boolean isARM()
  {
    String str1 = OooOO0;
    String str2 = "arm";
    boolean bool1 = str1.startsWith(str2);
    if (!bool1)
    {
      str2 = m54207b69.F54207b69_11("GR333422343E");
      bool2 = str1.startsWith(str2);
      if (!bool2)
      {
        bool2 = false;
        str1 = null;
        return bool2;
      }
    }
    boolean bool2 = true;
    return bool2;
  }
  
  public static final boolean isAndroid()
  {
    int i = OooO;
    int j = 8;
    if (i == j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static final boolean isFreeBSD()
  {
    int i = OooO;
    int j = 4;
    if (i == j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static final boolean isGNU()
  {
    int i = OooO;
    int j = 9;
    if (i == j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static final boolean isIntel()
  {
    String str1 = OooOO0;
    String str2 = "x86";
    boolean bool = str1.startsWith(str2);
    return bool;
  }
  
  public static final boolean isLinux()
  {
    int i = OooO;
    int j = 1;
    if (i != j) {
      j = 0;
    }
    return j;
  }
  
  public static final boolean isMIPS()
  {
    String str1 = OooOO0;
    String str2 = m54207b69.F54207b69_11("_25F5C4444");
    boolean bool1 = str1.equals(str2);
    if (!bool1)
    {
      str2 = m54207b69.F54207b69_11("cX35322A2E7271");
      bool1 = str1.equals(str2);
      if (!bool1)
      {
        str2 = m54207b69.F54207b69_11("_s1E1B05031A24");
        bool1 = str1.equals(str2);
        if (!bool1)
        {
          str2 = m54207b69.F54207b69_11("j<51564E520E0D5F57");
          boolean bool2 = str1.equals(str2);
          if (!bool2) {
            return false;
          }
        }
      }
    }
    return true;
  }
  
  public static final boolean isMac()
  {
    int i = OooO;
    if (i == 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static final boolean isNetBSD()
  {
    int i = OooO;
    int j = 11;
    if (i == j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static final boolean isOpenBSD()
  {
    int i = OooO;
    int j = 5;
    if (i == j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static final boolean isPPC()
  {
    String str1 = OooOO0;
    String str2 = "ppc";
    boolean bool = str1.startsWith(str2);
    return bool;
  }
  
  public static final boolean isSPARC()
  {
    String str1 = OooOO0;
    String str2 = m54207b69.F54207b69_11("K14242524656");
    return str1.startsWith(str2);
  }
  
  public static boolean isSoftFloat()
  {
    Object localObject1 = Platform.class;
    Object localObject3;
    String str;
    try
    {
      Object localObject2 = new java/io/File;
      localObject3 = "C31C44435F5421465D675E26615763";
      localObject3 = m54207b69.F54207b69_11((String)localObject3);
      ((File)localObject2).<init>((String)localObject3);
      boolean bool = ((File)localObject2).exists();
      if (!bool) {
        break label100;
      }
      localObject2 = ((File)localObject2).getCanonicalPath();
      localObject2 = ELFAnalyser.OooO00o((String)localObject2);
      return ((ELFAnalyser)localObject2).isArmHardFloat() ^ true;
    }
    catch (SecurityException localSecurityException)
    {
      localObject1 = Logger.getLogger(((Class)localObject1).getName());
      localObject3 = Level.INFO;
      str = m54207b69.F54207b69_11("rd370209141A1216242925110C201D1B1A1A55251F211D175B1D231F2339342B292365656E383B312E73402B332E782F4B3174763E4A794643397D4A4052403F4F84474F4D495B6391");
    }
    catch (IOException localIOException)
    {
      localObject1 = Logger.getLogger(((Class)localObject1).getName());
      localObject3 = Level.INFO;
      str = m54207b69.F54207b69_11("i67058615D57571C49611F4E5E635F24202957566C692E5B6A7269336E6A702F357965386582783C697F6D7B7E6E43828E888876824C");
    }
    ((Logger)localObject1).log((Level)localObject3, str, localIOException);
    label100:
    return false;
  }
  
  public static final boolean isSolaris()
  {
    int i = OooO;
    int j = 3;
    if (i == j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static final boolean isWindows()
  {
    int i = OooO;
    int j = 2;
    if (i != j)
    {
      int k = 6;
      if (i != k) {
        return 0;
      }
    }
    i = 1;
    return i;
  }
  
  public static final boolean isWindowsCE()
  {
    int i = OooO;
    int j = 6;
    if (i == j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static final boolean isX11()
  {
    boolean bool = isWindows();
    if (!bool)
    {
      bool = isMac();
      if (!bool) {
        return true;
      }
    }
    bool = false;
    return bool;
  }
  
  public static final boolean iskFreeBSD()
  {
    int i = OooO;
    int j = 10;
    if (i == j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.sun.jna.Platform
 * JD-Core Version:    0.7.0.1
 */
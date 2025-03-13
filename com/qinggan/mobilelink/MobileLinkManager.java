package com.qinggan.mobilelink;

import com.qinggan.os.SystemProperties;
import m54207b69;

public class MobileLinkManager
{
  public static Object OooO00o;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO00o = localObject;
  }
  
  public int get_ANDROID_AppLaunch_Id()
  {
    String str1 = get_ANDROID_AppLaunch_Name();
    Object localObject = m54207b69.F54207b69_11("S?72574F505452795D595D");
    boolean bool1 = ((String)localObject).equals(str1);
    int i;
    int j;
    if (bool1)
    {
      i = 98;
    }
    else
    {
      localObject = m54207b69.F54207b69_11("Oo2C0F1F260A0E10");
      bool1 = ((String)localObject).equals(str1);
      if (bool1)
      {
        i = 99;
      }
      else
      {
        localObject = "SDL";
        boolean bool2 = ((String)localObject).equals(str1);
        if (bool2) {
          j = 97;
        } else {
          j = 96;
        }
      }
    }
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str2 = m54207b69.F54207b69_11("MS3437290F16221D08242321171E30312E42374F434F21304E8B828D23");
    ((StringBuilder)localObject).append(str2);
    ((StringBuilder)localObject).append(j);
    ((StringBuilder)localObject).append("]");
    return j;
  }
  
  public String get_ANDROID_AppLaunch_Name()
  {
    String str1 = m54207b69.F54207b69_11("-H382E3C3E2540426D433A457135333A4937323E793D4D4E7D3C425741473D");
    String str2 = m54207b69.F54207b69_11("Oo2C0F1F260A0E10");
    str1 = SystemProperties.OooO0O0(str1, str2);
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str3 = m54207b69.F54207b69_11("Aw1013052B3A3E392C40473D334214154A26132B27333D4F2D322B71687349");
    ((StringBuilder)localObject).append(str3);
    ((StringBuilder)localObject).append(str1);
    str3 = "]";
    ((StringBuilder)localObject).append(str3);
    localObject = m54207b69.F54207b69_11("S?72574F505452795D595D");
    boolean bool1 = ((String)localObject).equals(str1);
    if (!bool1)
    {
      boolean bool2 = str2.equals(str1);
      if (!bool2)
      {
        str2 = "SDL";
        bool2 = str2.equals(str1);
        if (!bool2) {
          str1 = "";
        }
      }
    }
    return str1;
  }
  
  public int get_IOS_AppLaunch_Id()
  {
    String str1 = get_IOS_AppLaunch_Name();
    Object localObject = m54207b69.F54207b69_11("I-6E4D618045515A");
    boolean bool1 = ((String)localObject).equals(str1);
    int i;
    int j;
    if (bool1)
    {
      i = 81;
    }
    else
    {
      localObject = m54207b69.F54207b69_11("Oo2C0F1F260A0E10");
      bool1 = ((String)localObject).equals(str1);
      if (bool1)
      {
        i = 82;
      }
      else
      {
        localObject = "SDL";
        boolean bool2 = ((String)localObject).equals(str1);
        if (bool2) {
          j = 83;
        } else {
          j = 80;
        }
      }
    }
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str2 = m54207b69.F54207b69_11("lo080B1D332A2542373628292E1A270F1B1741381E636A654B");
    ((StringBuilder)localObject).append(str2);
    ((StringBuilder)localObject).append(j);
    ((StringBuilder)localObject).append("]");
    return j;
  }
  
  public String get_IOS_AppLaunch_Name()
  {
    String str1 = m54207b69.F54207b69_11("R|0C1A101219140E59170E195D192860241C2525252D673323246B2A38252F3D33");
    Object localObject = m54207b69.F54207b69_11("Oo2C0F1F260A0E10");
    str1 = SystemProperties.OooO0O0(str1, (String)localObject);
    String str2 = m54207b69.F54207b69_11("I-6E4D618045515A");
    boolean bool1 = str2.equals(str1);
    if (!bool1)
    {
      boolean bool2 = ((String)localObject).equals(str1);
      if (!bool2)
      {
        localObject = "SDL";
        bool2 = ((String)localObject).equals(str1);
        if (!bool2) {
          str1 = "";
        }
      }
    }
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    str2 = m54207b69.F54207b69_11("Z]3A392B05181714092436371C4835414D4513254F444D937E951F");
    ((StringBuilder)localObject).append(str2);
    ((StringBuilder)localObject).append(str1);
    ((StringBuilder)localObject).append("]");
    return str1;
  }
  
  public void set_ANDROID_AppLaunch_Id(int paramInt)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("j;485F51677E7A85707C7B896F865859866A5F676B67798876331A357B");
    localStringBuilder.append(str1);
    localStringBuilder.append(paramInt);
    str1 = "]";
    localStringBuilder.append(str1);
    String str2;
    switch (paramInt)
    {
    default: 
      str2 = "";
      break;
    case 99: 
      str2 = m54207b69.F54207b69_11("Oo2C0F1F260A0E10");
      break;
    case 98: 
      str2 = m54207b69.F54207b69_11("S?72574F505452795D595D");
      break;
    case 97: 
      str2 = "SDL";
    }
    set_ANDROID_AppLaunch_Name(str2);
  }
  
  public void set_ANDROID_AppLaunch_Name(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("n%5641537D6870677E72756B857062637854615D59618F815B60591F3A219B");
    localStringBuilder.append(str);
    localStringBuilder.append(paramString);
    localStringBuilder.append("]");
    SystemProperties.OooOOO0(m54207b69.F54207b69_11("-H382E3C3E2540426D433A457135333A4937323E793D4D4E7D3C425741473D"), paramString);
  }
  
  public void set_IOS_AppLaunch_Id(int paramInt)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("IL3F2A3A160908251A1545460B3946303E3424173B808B822E");
    localStringBuilder.append(str1);
    localStringBuilder.append(paramInt);
    str1 = "]";
    localStringBuilder.append(str1);
    String str2;
    switch (paramInt)
    {
    default: 
      str2 = "";
      break;
    case 83: 
      str2 = "SDL";
      break;
    case 82: 
      str2 = m54207b69.F54207b69_11("Oo2C0F1F260A0E10");
      break;
    case 81: 
      str2 = m54207b69.F54207b69_11("I-6E4D618045515A");
    }
    set_IOS_AppLaunch_Name(str2);
  }
  
  public void set_IOS_AppLaunch_Name(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("hp031606323D44293639090A471D122C2228405024312A66616844");
    localStringBuilder.append(str);
    localStringBuilder.append(paramString);
    localStringBuilder.append("]");
    SystemProperties.OooOOO0(m54207b69.F54207b69_11("R|0C1A101219140E59170E195D192860241C2525252D673323246B2A38252F3D33"), paramString);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.mobilelink.MobileLinkManager
 * JD-Core Version:    0.7.0.1
 */
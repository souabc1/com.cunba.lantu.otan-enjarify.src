package androidx.core.os;

import android.os.Build.VERSION;
import java.util.Locale;

public class BuildCompat
{
  public static boolean OooO00o(String paramString1, String paramString2)
  {
    Object localObject = "REL";
    boolean bool1 = ((String)localObject).equals(paramString2);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    localObject = Locale.ROOT;
    paramString2 = paramString2.toUpperCase((Locale)localObject);
    paramString1 = paramString1.toUpperCase((Locale)localObject);
    int i = paramString2.compareTo(paramString1);
    if (i >= 0) {
      bool2 = true;
    }
    return bool2;
  }
  
  public static boolean isAtLeastN()
  {
    return true;
  }
  
  public static boolean isAtLeastNMR1()
  {
    return true;
  }
  
  public static boolean isAtLeastO()
  {
    return true;
  }
  
  public static boolean isAtLeastOMR1()
  {
    return true;
  }
  
  public static boolean isAtLeastP()
  {
    return true;
  }
  
  public static boolean isAtLeastQ()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static boolean isAtLeastR()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if (i >= j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static boolean isAtLeastS()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 31;
    if (i < j)
    {
      j = 30;
      String str1;
      if (i >= j)
      {
        str1 = "S";
        String str2 = Build.VERSION.CODENAME;
        bool = OooO00o(str1, str2);
        if (bool) {}
      }
      else
      {
        bool = false;
        str1 = null;
        return bool;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public static boolean isAtLeastSv2()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 32;
    if (i < j)
    {
      j = 31;
      String str1;
      if (i >= j)
      {
        str1 = "Sv2";
        String str2 = Build.VERSION.CODENAME;
        bool = OooO00o(str1, str2);
        if (bool) {}
      }
      else
      {
        bool = false;
        str1 = null;
        return bool;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public static boolean isAtLeastT()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 33;
    if (i < j)
    {
      j = 32;
      String str1;
      if (i >= j)
      {
        str1 = "Tiramisu";
        String str2 = Build.VERSION.CODENAME;
        bool = OooO00o(str1, str2);
        if (bool) {}
      }
      else
      {
        bool = false;
        str1 = null;
        return bool;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public static boolean isAtLeastU()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 33;
    if (i >= j)
    {
      str1 = "UpsideDownCake";
      String str2 = Build.VERSION.CODENAME;
      bool = OooO00o(str1, str2);
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    String str1 = null;
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.os.BuildCompat
 * JD-Core Version:    0.7.0.1
 */
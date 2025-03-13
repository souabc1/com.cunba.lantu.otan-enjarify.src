package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

public final class LocaleListCompat
{
  public static final LocaleListCompat OooO0O0 = OooO00o(new Locale[0]);
  public final LocaleListInterface OooO00o;
  
  public LocaleListCompat(LocaleListInterface paramLocaleListInterface)
  {
    this.OooO00o = paramLocaleListInterface;
  }
  
  public static LocaleListCompat OooO00o(Locale... paramVarArgs)
  {
    return OooO0o(LocaleListCompat.Api24Impl.OooO00o(paramVarArgs));
  }
  
  public static Locale OooO0O0(String paramString)
  {
    Object localObject1 = "-";
    boolean bool1 = paramString.contains((CharSequence)localObject1);
    int k = -1;
    int m = 2;
    int n = 1;
    String str;
    if (bool1)
    {
      localObject1 = paramString.split((String)localObject1, k);
      int i = localObject1.length;
      if (i > m)
      {
        paramString = new java/util/Locale;
        localObject2 = localObject1[0];
        str = localObject1[n];
        localObject1 = localObject1[m];
        paramString.<init>((String)localObject2, str, (String)localObject1);
        return paramString;
      }
      i = localObject1.length;
      if (i > n)
      {
        paramString = new java/util/Locale;
        localObject2 = localObject1[0];
        localObject1 = localObject1[n];
        paramString.<init>((String)localObject2, (String)localObject1);
        return paramString;
      }
      i = localObject1.length;
      if (i == n)
      {
        paramString = new java/util/Locale;
        localObject1 = localObject1[0];
        paramString.<init>((String)localObject1);
        return paramString;
      }
    }
    else
    {
      localObject1 = "_";
      boolean bool2 = paramString.contains((CharSequence)localObject1);
      if (!bool2) {
        break label290;
      }
      localObject1 = paramString.split((String)localObject1, k);
      int j = localObject1.length;
      if (j > m)
      {
        paramString = new java/util/Locale;
        localObject2 = localObject1[0];
        str = localObject1[n];
        localObject1 = localObject1[m];
        paramString.<init>((String)localObject2, str, (String)localObject1);
        return paramString;
      }
      j = localObject1.length;
      if (j > n)
      {
        paramString = new java/util/Locale;
        localObject2 = localObject1[0];
        localObject1 = localObject1[n];
        paramString.<init>((String)localObject2, (String)localObject1);
        return paramString;
      }
      j = localObject1.length;
      if (j == n)
      {
        paramString = new java/util/Locale;
        localObject1 = localObject1[0];
        paramString.<init>((String)localObject1);
        return paramString;
      }
    }
    localObject1 = new java/lang/IllegalArgumentException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("Can not parse language tag: [");
    ((StringBuilder)localObject2).append(paramString);
    ((StringBuilder)localObject2).append("]");
    paramString = ((StringBuilder)localObject2).toString();
    ((IllegalArgumentException)localObject1).<init>(paramString);
    throw ((Throwable)localObject1);
    label290:
    localObject1 = new java/util/Locale;
    ((Locale)localObject1).<init>(paramString);
    return localObject1;
  }
  
  public static LocaleListCompat OooO0OO(String paramString)
  {
    if (paramString != null)
    {
      boolean bool = paramString.isEmpty();
      if (!bool)
      {
        String str = ",";
        int j = -1;
        paramString = paramString.split(str, j);
        int i = paramString.length;
        Locale[] arrayOfLocale = new Locale[i];
        int k = 0;
        while (k < i)
        {
          Locale localLocale = LocaleListCompat.Api21Impl.OooO00o(paramString[k]);
          arrayOfLocale[k] = localLocale;
          k += 1;
        }
        return OooO00o(arrayOfLocale);
      }
    }
    return getEmptyLocaleList();
  }
  
  public static LocaleListCompat OooO0o(LocaleList paramLocaleList)
  {
    LocaleListCompat localLocaleListCompat = new androidx/core/os/LocaleListCompat;
    LocaleListPlatformWrapper localLocaleListPlatformWrapper = new androidx/core/os/LocaleListPlatformWrapper;
    localLocaleListPlatformWrapper.<init>(paramLocaleList);
    localLocaleListCompat.<init>(localLocaleListPlatformWrapper);
    return localLocaleListCompat;
  }
  
  public static LocaleListCompat getAdjustedDefault()
  {
    return OooO0o(LocaleListCompat.Api24Impl.getAdjustedDefault());
  }
  
  public static LocaleListCompat getDefault()
  {
    return OooO0o(LocaleListCompat.Api24Impl.getDefault());
  }
  
  public static LocaleListCompat getEmptyLocaleList()
  {
    return OooO0O0;
  }
  
  public int OooO0Oo()
  {
    return this.OooO00o.size();
  }
  
  public String OooO0o0()
  {
    return this.OooO00o.OooO00o();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof LocaleListCompat;
    if (bool1)
    {
      LocaleListInterface localLocaleListInterface = this.OooO00o;
      paramObject = ((LocaleListCompat)paramObject).OooO00o;
      bool2 = localLocaleListInterface.equals(paramObject);
      if (bool2)
      {
        bool2 = true;
        break label45;
      }
    }
    boolean bool2 = false;
    paramObject = null;
    label45:
    return bool2;
  }
  
  public Locale get(int paramInt)
  {
    return this.OooO00o.get(paramInt);
  }
  
  public int hashCode()
  {
    return this.OooO00o.hashCode();
  }
  
  public boolean isEmpty()
  {
    return this.OooO00o.isEmpty();
  }
  
  public String toString()
  {
    return this.OooO00o.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.os.LocaleListCompat
 * JD-Core Version:    0.7.0.1
 */
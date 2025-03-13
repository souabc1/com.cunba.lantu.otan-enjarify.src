package androidx.core.os;

import java.util.Locale;

final class LocaleListCompatWrapper
  implements LocaleListInterface
{
  public static final Locale[] OooO0OO = new Locale[0];
  public static final Locale OooO0Oo;
  public static final Locale OooO0o = LocaleListCompat.OooO0O0("en-Latn");
  public static final Locale OooO0o0;
  public final Locale[] OooO00o;
  public final String OooO0O0;
  
  static
  {
    Locale localLocale = new java/util/Locale;
    localLocale.<init>("en", "XA");
    OooO0Oo = localLocale;
    localLocale = new java/util/Locale;
    localLocale.<init>("ar", "XB");
    OooO0o0 = localLocale;
  }
  
  public String OooO00o()
  {
    return this.OooO0O0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {
      return bool1;
    }
    boolean bool2 = paramObject instanceof LocaleListCompatWrapper;
    if (!bool2) {
      return false;
    }
    paramObject = ((LocaleListCompatWrapper)paramObject).OooO00o;
    Locale[] arrayOfLocale = this.OooO00o;
    int i = arrayOfLocale.length;
    int j = paramObject.length;
    if (i != j) {
      return false;
    }
    i = 0;
    arrayOfLocale = null;
    for (;;)
    {
      Object localObject1 = this.OooO00o;
      int k = localObject1.length;
      if (i >= k) {
        break;
      }
      localObject1 = localObject1[i];
      Object localObject2 = paramObject[i];
      boolean bool3 = ((Locale)localObject1).equals(localObject2);
      if (!bool3) {
        return false;
      }
      i += 1;
    }
    return bool1;
  }
  
  public Locale get(int paramInt)
  {
    if (paramInt >= 0)
    {
      Locale[] arrayOfLocale = this.OooO00o;
      int i = arrayOfLocale.length;
      if (paramInt < i)
      {
        localLocale = arrayOfLocale[paramInt];
        break label30;
      }
    }
    paramInt = 0;
    Locale localLocale = null;
    label30:
    return localLocale;
  }
  
  public Object getLocaleList()
  {
    return null;
  }
  
  public int hashCode()
  {
    Locale[] arrayOfLocale = this.OooO00o;
    int i = arrayOfLocale.length;
    int j = 1;
    int k = 0;
    while (k < i)
    {
      Locale localLocale = arrayOfLocale[k];
      j *= 31;
      int m = localLocale.hashCode();
      j += m;
      k += 1;
    }
    return j;
  }
  
  public boolean isEmpty()
  {
    Locale[] arrayOfLocale = this.OooO00o;
    int i = arrayOfLocale.length;
    if (i == 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      arrayOfLocale = null;
    }
    return i;
  }
  
  public int size()
  {
    return this.OooO00o.length;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("[");
    int i = 0;
    for (;;)
    {
      Object localObject = this.OooO00o;
      int j = localObject.length;
      if (i >= j) {
        break;
      }
      localObject = localObject[i];
      localStringBuilder.append(localObject);
      localObject = this.OooO00o;
      int k = localObject.length + -1;
      if (i < k)
      {
        k = 44;
        localStringBuilder.append(k);
      }
      i += 1;
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.os.LocaleListCompatWrapper
 * JD-Core Version:    0.7.0.1
 */
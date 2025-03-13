package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

final class LocaleListPlatformWrapper
  implements LocaleListInterface
{
  public final LocaleList OooO00o;
  
  public LocaleListPlatformWrapper(Object paramObject)
  {
    paramObject = (LocaleList)paramObject;
    this.OooO00o = paramObject;
  }
  
  public String OooO00o()
  {
    return this.OooO00o.toLanguageTags();
  }
  
  public boolean equals(Object paramObject)
  {
    LocaleList localLocaleList = this.OooO00o;
    paramObject = ((LocaleListInterface)paramObject).getLocaleList();
    return localLocaleList.equals(paramObject);
  }
  
  public Locale get(int paramInt)
  {
    return this.OooO00o.get(paramInt);
  }
  
  public Object getLocaleList()
  {
    return this.OooO00o;
  }
  
  public int hashCode()
  {
    return this.OooO00o.hashCode();
  }
  
  public boolean isEmpty()
  {
    return this.OooO00o.isEmpty();
  }
  
  public int size()
  {
    return this.OooO00o.size();
  }
  
  public String toString()
  {
    return this.OooO00o.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.os.LocaleListPlatformWrapper
 * JD-Core Version:    0.7.0.1
 */
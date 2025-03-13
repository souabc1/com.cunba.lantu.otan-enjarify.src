package androidx.navigation;

import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

final class NavDeepLink$MimeType
  implements Comparable
{
  public String o00OoOoo;
  public String o00Ooo00;
  
  public NavDeepLink$MimeType(String paramString)
  {
    Object localObject = new kotlin/text/Regex;
    ((Regex)localObject).<init>("/");
    paramString = ((Regex)localObject).OooO0OO(paramString, 0);
    boolean bool1 = paramString.isEmpty();
    int j = 1;
    if (!bool1)
    {
      int i = paramString.size();
      localObject = paramString.listIterator(i);
      int k;
      do
      {
        boolean bool2 = ((ListIterator)localObject).hasPrevious();
        if (!bool2) {
          break;
        }
        String str = (String)((ListIterator)localObject).previous();
        k = str.length();
        if (k == 0)
        {
          k = j;
        }
        else
        {
          k = 0;
          str = null;
        }
      } while (k != 0);
      i = ((ListIterator)localObject).nextIndex() + j;
      paramString = CollectionsKt.OooooOo(paramString, i);
    }
    else
    {
      paramString = CollectionsKt.OooO0oo();
    }
    localObject = (String)paramString.get(0);
    this.o00OoOoo = ((String)localObject);
    paramString = (String)paramString.get(j);
    this.o00Ooo00 = paramString;
  }
  
  public int OooO0O0(MimeType paramMimeType)
  {
    Intrinsics.OooO0o(paramMimeType, "other");
    String str1 = this.o00OoOoo;
    String str2 = paramMimeType.o00OoOoo;
    boolean bool1 = Intrinsics.OooO00o(str1, str2);
    int i;
    if (bool1)
    {
      i = 2;
    }
    else
    {
      i = 0;
      str1 = null;
    }
    str2 = this.o00Ooo00;
    paramMimeType = paramMimeType.o00Ooo00;
    boolean bool2 = Intrinsics.OooO00o(str2, paramMimeType);
    if (bool2) {
      i += 1;
    }
    return i;
  }
  
  public final String getSubType()
  {
    return this.o00Ooo00;
  }
  
  public final String getType()
  {
    return this.o00OoOoo;
  }
  
  public final void setSubType(String paramString)
  {
    Intrinsics.OooO0o(paramString, "<set-?>");
    this.o00Ooo00 = paramString;
  }
  
  public final void setType(String paramString)
  {
    Intrinsics.OooO0o(paramString, "<set-?>");
    this.o00OoOoo = paramString;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavDeepLink.MimeType
 * JD-Core Version:    0.7.0.1
 */
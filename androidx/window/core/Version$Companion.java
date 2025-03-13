package androidx.window.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class Version$Companion
{
  public final Version OooO00o(String paramString)
  {
    int i = 0;
    if (paramString != null)
    {
      int j = StringsKt.OooOO0O(paramString);
      if (j == 0)
      {
        Object localObject = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?");
        paramString = ((Pattern)localObject).matcher(paramString);
        j = paramString.matches();
        if (j == 0) {
          return null;
        }
        j = 1;
        localObject = paramString.group(j);
        if (localObject == null)
        {
          k = 0;
          localObject = null;
        }
        else
        {
          k = Integer.parseInt((String)localObject);
          localObject = Integer.valueOf(k);
        }
        if (localObject == null) {
          return null;
        }
        int m = ((Integer)localObject).intValue();
        int k = 2;
        localObject = paramString.group(k);
        if (localObject == null)
        {
          k = 0;
          localObject = null;
        }
        else
        {
          k = Integer.parseInt((String)localObject);
          localObject = Integer.valueOf(k);
        }
        if (localObject == null) {
          return null;
        }
        int n = ((Integer)localObject).intValue();
        k = 3;
        localObject = paramString.group(k);
        if (localObject == null)
        {
          k = 0;
          localObject = null;
        }
        else
        {
          k = Integer.parseInt((String)localObject);
          localObject = Integer.valueOf(k);
        }
        if (localObject == null) {
          return null;
        }
        int i1 = ((Integer)localObject).intValue();
        i = 4;
        localObject = paramString.group(i);
        if (localObject != null) {
          paramString = paramString.group(i);
        } else {
          paramString = "";
        }
        String str = paramString;
        paramString = new androidx/window/core/Version;
        Intrinsics.OooO0o0(str, "description");
        paramString.<init>(m, n, i1, str, null);
        return paramString;
      }
    }
    return null;
  }
  
  public final Version getCURRENT()
  {
    return Version.OooO0O0();
  }
  
  public final Version getUNKNOWN()
  {
    return Version.OooO0OO();
  }
  
  public final Version getVERSION_0_1()
  {
    return Version.OooO0Oo();
  }
  
  public final Version getVERSION_1_0()
  {
    return Version.OooO0o0();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.core.Version.Companion
 * JD-Core Version:    0.7.0.1
 */
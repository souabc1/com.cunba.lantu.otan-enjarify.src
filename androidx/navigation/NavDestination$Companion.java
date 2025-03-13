package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

public final class NavDestination$Companion
{
  public final String OooO00o(String paramString)
  {
    if (paramString != null)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      String str = "android-app://androidx.navigation/";
      localStringBuilder.append(str);
      localStringBuilder.append(paramString);
      paramString = localStringBuilder.toString();
    }
    else
    {
      paramString = "";
    }
    return paramString;
  }
  
  public final String OooO0O0(Context paramContext, int paramInt)
  {
    String str1 = "context";
    Intrinsics.OooO0o(paramContext, str1);
    int i = 16777215;
    if (paramInt <= i)
    {
      paramContext = String.valueOf(paramInt);
    }
    else
    {
      try
      {
        paramContext = paramContext.getResources();
        paramContext = paramContext.getResourceName(paramInt);
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        paramContext = String.valueOf(paramInt);
      }
      String str2 = "try {\n                co….toString()\n            }";
      Intrinsics.OooO0o0(paramContext, str2);
    }
    return paramContext;
  }
  
  public final Sequence OooO0OO(NavDestination paramNavDestination)
  {
    Intrinsics.OooO0o(paramNavDestination, "<this>");
    NavDestination.Companion.hierarchy.1 local1 = NavDestination.Companion.hierarchy.1.o00OoOoo;
    return SequencesKt.OooO0o(paramNavDestination, local1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavDestination.Companion
 * JD-Core Version:    0.7.0.1
 */
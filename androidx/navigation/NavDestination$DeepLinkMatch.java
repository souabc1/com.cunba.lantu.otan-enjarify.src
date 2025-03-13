package androidx.navigation;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class NavDestination$DeepLinkMatch
  implements Comparable
{
  public final NavDestination o00OoOoo;
  public final boolean o00Ooo0;
  public final Bundle o00Ooo00;
  public final int o00Ooo0O;
  public final boolean o00Ooo0o;
  public final int o00OooO0;
  
  public NavDestination$DeepLinkMatch(NavDestination paramNavDestination, Bundle paramBundle, boolean paramBoolean1, int paramInt1, boolean paramBoolean2, int paramInt2)
  {
    this.o00OoOoo = paramNavDestination;
    this.o00Ooo00 = paramBundle;
    this.o00Ooo0 = paramBoolean1;
    this.o00Ooo0O = paramInt1;
    this.o00Ooo0o = paramBoolean2;
    this.o00OooO0 = paramInt2;
  }
  
  public int OooO0O0(DeepLinkMatch paramDeepLinkMatch)
  {
    Object localObject = "other";
    Intrinsics.OooO0o(paramDeepLinkMatch, (String)localObject);
    boolean bool1 = this.o00Ooo0;
    int k = 1;
    if (bool1)
    {
      boolean bool3 = paramDeepLinkMatch.o00Ooo0;
      if (!bool3) {
        return k;
      }
    }
    int m = -1;
    if (!bool1)
    {
      bool1 = paramDeepLinkMatch.o00Ooo0;
      if (bool1) {
        return m;
      }
    }
    int i = this.o00Ooo0O;
    int n = paramDeepLinkMatch.o00Ooo0O;
    i -= n;
    if (i > 0) {
      return k;
    }
    if (i < 0) {
      return m;
    }
    localObject = this.o00Ooo00;
    Bundle localBundle;
    if (localObject != null)
    {
      localBundle = paramDeepLinkMatch.o00Ooo00;
      if (localBundle == null) {
        return k;
      }
    }
    if (localObject == null)
    {
      localBundle = paramDeepLinkMatch.o00Ooo00;
      if (localBundle != null) {
        return m;
      }
    }
    if (localObject != null)
    {
      i = ((BaseBundle)localObject).size();
      localBundle = paramDeepLinkMatch.o00Ooo00;
      Intrinsics.OooO0OO(localBundle);
      n = localBundle.size();
      i -= n;
      if (i > 0) {
        return k;
      }
      if (i < 0) {
        return m;
      }
    }
    boolean bool2 = this.o00Ooo0o;
    if (bool2)
    {
      boolean bool4 = paramDeepLinkMatch.o00Ooo0o;
      if (!bool4) {
        return k;
      }
    }
    if (!bool2)
    {
      bool2 = paramDeepLinkMatch.o00Ooo0o;
      if (bool2) {
        return m;
      }
    }
    int j = this.o00OooO0;
    int i1 = paramDeepLinkMatch.o00OooO0;
    return j - i1;
  }
  
  public final boolean OooO0OO(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      Object localObject1 = this.o00Ooo00;
      if (localObject1 != null)
      {
        localObject1 = ((BaseBundle)localObject1).keySet();
        String str1 = "matchingArgs.keySet()";
        Intrinsics.OooO0o0(localObject1, str1);
        localObject1 = ((Iterable)localObject1).iterator();
        boolean bool1;
        do
        {
          bool1 = ((Iterator)localObject1).hasNext();
          if (!bool1) {
            break;
          }
          str1 = (String)((Iterator)localObject1).next();
          boolean bool2 = paramBundle.containsKey(str1);
          if (!bool2) {
            return false;
          }
          Object localObject2 = (NavArgument)this.o00OoOoo.getArguments().get(str1);
          Object localObject3 = null;
          if (localObject2 != null)
          {
            localObject2 = ((NavArgument)localObject2).getType();
          }
          else
          {
            bool2 = false;
            localObject2 = null;
          }
          String str2 = "key";
          Object localObject4;
          if (localObject2 != null)
          {
            localObject4 = this.o00Ooo00;
            Intrinsics.OooO0o0(str1, str2);
            localObject4 = ((NavType)localObject2).OooO00o((Bundle)localObject4, str1);
          }
          else
          {
            localObject4 = null;
          }
          if (localObject2 != null)
          {
            Intrinsics.OooO0o0(str1, str2);
            localObject3 = ((NavType)localObject2).OooO00o(paramBundle, str1);
          }
          bool1 = Intrinsics.OooO00o(localObject4, localObject3);
        } while (bool1);
        return false;
        return true;
      }
    }
    return false;
  }
  
  public final NavDestination getDestination()
  {
    return this.o00OoOoo;
  }
  
  public final Bundle getMatchingArgs()
  {
    return this.o00Ooo00;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavDestination.DeepLinkMatch
 * JD-Core Version:    0.7.0.1
 */
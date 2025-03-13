package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class MatcherUtils
{
  public static final MatcherUtils OooO00o;
  
  static
  {
    MatcherUtils localMatcherUtils = new androidx/window/embedding/MatcherUtils;
    localMatcherUtils.<init>();
    OooO00o = localMatcherUtils;
  }
  
  public final boolean OooO00o(Activity paramActivity, ComponentName paramComponentName)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
    Intrinsics.OooO0o(paramComponentName, "ruleComponent");
    Object localObject = paramActivity.getComponentName();
    boolean bool = OooO0O0((ComponentName)localObject, paramComponentName);
    if (bool) {
      return true;
    }
    paramActivity = paramActivity.getIntent();
    bool = false;
    localObject = null;
    if (paramActivity != null)
    {
      paramActivity = paramActivity.getComponent();
      if (paramActivity != null)
      {
        localObject = OooO00o;
        bool = ((MatcherUtils)localObject).OooO0O0(paramActivity, paramComponentName);
      }
    }
    return bool;
  }
  
  public final boolean OooO0O0(ComponentName paramComponentName1, ComponentName paramComponentName2)
  {
    Intrinsics.OooO0o(paramComponentName2, "ruleComponent");
    String str1 = "*";
    boolean bool1 = true;
    boolean bool2;
    if (paramComponentName1 == null)
    {
      paramComponentName1 = paramComponentName2.getPackageName();
      bool2 = Intrinsics.OooO00o(paramComponentName1, str1);
      if (bool2)
      {
        paramComponentName1 = paramComponentName2.getClassName();
        bool2 = Intrinsics.OooO00o(paramComponentName1, str1);
        if (bool2) {}
      }
      else
      {
        bool1 = false;
      }
      return bool1;
    }
    String str2 = paramComponentName1.toString();
    String str3 = "activityComponent.toString()";
    Intrinsics.OooO0o0(str2, str3);
    int i = 2;
    boolean bool3 = StringsKt.OooOo0O(str2, str1, false, i, null) ^ bool1;
    if (bool3)
    {
      str1 = paramComponentName1.getPackageName();
      str2 = paramComponentName2.getPackageName();
      bool3 = Intrinsics.OooO00o(str1, str2);
      if (!bool3)
      {
        str1 = paramComponentName1.getPackageName();
        Intrinsics.OooO0o0(str1, "activityComponent.packageName");
        str2 = paramComponentName2.getPackageName();
        str3 = "ruleComponent.packageName";
        Intrinsics.OooO0o0(str2, str3);
        bool3 = OooO0OO(str1, str2);
        if (!bool3)
        {
          bool3 = false;
          str1 = null;
          break label180;
        }
      }
      bool3 = bool1;
      label180:
      str2 = paramComponentName1.getClassName();
      str3 = paramComponentName2.getClassName();
      boolean bool4 = Intrinsics.OooO00o(str2, str3);
      if (!bool4)
      {
        paramComponentName1 = paramComponentName1.getClassName();
        Intrinsics.OooO0o0(paramComponentName1, "activityComponent.className");
        paramComponentName2 = paramComponentName2.getClassName();
        str2 = "ruleComponent.className";
        Intrinsics.OooO0o0(paramComponentName2, str2);
        bool2 = OooO0OO(paramComponentName1, paramComponentName2);
        if (!bool2)
        {
          bool2 = false;
          paramComponentName1 = null;
          break label260;
        }
      }
      bool2 = bool1;
      label260:
      if ((!bool3) || (!bool2)) {
        bool1 = false;
      }
      return bool1;
    }
    paramComponentName1 = new java/lang/IllegalArgumentException;
    paramComponentName2 = "Wildcard can only be part of the rule.".toString();
    paramComponentName1.<init>(paramComponentName2);
    throw paramComponentName1;
  }
  
  public final boolean OooO0OO(String paramString1, String paramString2)
  {
    String str1 = "*";
    int i = 2;
    boolean bool1 = StringsKt.OooOo0O(paramString2, str1, false, i, null);
    if (!bool1) {
      return false;
    }
    bool1 = Intrinsics.OooO00o(paramString2, str1);
    int k = 1;
    if (bool1) {
      return k;
    }
    int m = 6;
    int j = StringsKt.OooOooo(paramString2, "*", 0, false, m, null);
    String str2 = "*";
    int n = StringsKt.Oooo0OO(paramString2, str2, 0, false, m, null);
    if (j == n)
    {
      bool2 = StringsKt.OooO(paramString2, str1, false, i, null);
      if (bool2)
      {
        bool2 = k;
        break label111;
      }
    }
    boolean bool2 = false;
    str1 = null;
    label111:
    if (bool2)
    {
      int i1 = paramString2.length() - k;
      paramString2 = paramString2.substring(0, i1);
      Intrinsics.OooO0o0(paramString2, "this as java.lang.String…ing(startIndex, endIndex)");
      return StringsKt.OooOOo0(paramString1, paramString2, false, i, null);
    }
    paramString1 = new java/lang/IllegalArgumentException;
    paramString2 = "Name pattern with a wildcard must only contain a single wildcard in the end".toString();
    paramString1.<init>(paramString2);
    throw paramString1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.embedding.MatcherUtils
 * JD-Core Version:    0.7.0.1
 */
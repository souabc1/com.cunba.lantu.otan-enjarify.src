package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

public final class SplitPairFilter
{
  public final ComponentName OooO00o;
  public final ComponentName OooO0O0;
  public final String OooO0OO;
  
  public final boolean OooO00o(Activity paramActivity, Intent paramIntent)
  {
    Intrinsics.OooO0o(paramActivity, "primaryActivity");
    Intrinsics.OooO0o(paramIntent, "secondaryActivityIntent");
    paramActivity = paramActivity.getComponentName();
    MatcherUtils localMatcherUtils = MatcherUtils.OooO00o;
    ComponentName localComponentName1 = this.OooO00o;
    boolean bool1 = localMatcherUtils.OooO0O0(paramActivity, localComponentName1);
    boolean bool2 = false;
    localComponentName1 = null;
    if (bool1)
    {
      paramActivity = paramIntent.getComponent();
      ComponentName localComponentName2 = this.OooO0O0;
      bool1 = localMatcherUtils.OooO0O0(paramActivity, localComponentName2);
      if (bool1)
      {
        paramActivity = this.OooO0OO;
        if (paramActivity != null)
        {
          paramIntent = paramIntent.getAction();
          bool1 = Intrinsics.OooO00o(paramActivity, paramIntent);
          if (!bool1) {}
        }
        else
        {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public final boolean OooO0O0(Activity paramActivity1, Activity paramActivity2)
  {
    Intrinsics.OooO0o(paramActivity1, "primaryActivity");
    Intrinsics.OooO0o(paramActivity2, "secondaryActivity");
    Object localObject1 = MatcherUtils.OooO00o;
    Object localObject2 = paramActivity1.getComponentName();
    ComponentName localComponentName1 = this.OooO00o;
    boolean bool1 = ((MatcherUtils)localObject1).OooO0O0((ComponentName)localObject2, localComponentName1);
    boolean bool2 = true;
    if (bool1)
    {
      localObject2 = paramActivity2.getComponentName();
      ComponentName localComponentName2 = this.OooO0O0;
      bool3 = ((MatcherUtils)localObject1).OooO0O0((ComponentName)localObject2, localComponentName2);
      if (bool3)
      {
        bool3 = bool2;
        break label85;
      }
    }
    boolean bool3 = false;
    localObject1 = null;
    label85:
    localObject2 = paramActivity2.getIntent();
    if (localObject2 != null)
    {
      if (bool3)
      {
        paramActivity2 = paramActivity2.getIntent();
        localObject1 = "secondaryActivity.intent";
        Intrinsics.OooO0o0(paramActivity2, (String)localObject1);
        boolean bool4 = OooO00o(paramActivity1, paramActivity2);
        if (bool4) {}
      }
      else
      {
        bool2 = false;
        localComponentName1 = null;
      }
      bool3 = bool2;
    }
    return bool3;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    boolean bool2 = paramObject instanceof SplitPairFilter;
    if (!bool2) {
      return false;
    }
    Object localObject = this.OooO00o;
    paramObject = (SplitPairFilter)paramObject;
    ComponentName localComponentName = paramObject.OooO00o;
    bool2 = Intrinsics.OooO00o(localObject, localComponentName);
    if (!bool2) {
      return false;
    }
    localObject = this.OooO0O0;
    localComponentName = paramObject.OooO0O0;
    bool2 = Intrinsics.OooO00o(localObject, localComponentName);
    if (!bool2) {
      return false;
    }
    localObject = this.OooO0OO;
    paramObject = paramObject.OooO0OO;
    boolean bool3 = Intrinsics.OooO00o(localObject, paramObject);
    if (!bool3) {
      return false;
    }
    return bool1;
  }
  
  public final ComponentName getPrimaryActivityName()
  {
    return this.OooO00o;
  }
  
  public final String getSecondaryActivityIntentAction()
  {
    return this.OooO0OO;
  }
  
  public final ComponentName getSecondaryActivityName()
  {
    return this.OooO0O0;
  }
  
  public int hashCode()
  {
    ComponentName localComponentName = this.OooO00o;
    int i = localComponentName.hashCode() * 31;
    int j = this.OooO0O0.hashCode();
    i = (i + j) * 31;
    String str = this.OooO0OO;
    if (str == null)
    {
      j = 0;
      str = null;
    }
    else
    {
      j = str.hashCode();
    }
    return i + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SplitPairFilter{primaryActivityName=");
    Object localObject = this.OooO00o;
    localStringBuilder.append(localObject);
    localStringBuilder.append(", secondaryActivityName=");
    localObject = this.OooO0O0;
    localStringBuilder.append(localObject);
    localStringBuilder.append(", secondaryActivityAction=");
    localObject = this.OooO0OO;
    localStringBuilder.append(localObject);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.embedding.SplitPairFilter
 * JD-Core Version:    0.7.0.1
 */
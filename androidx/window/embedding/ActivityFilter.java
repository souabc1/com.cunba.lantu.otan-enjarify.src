package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

public final class ActivityFilter
{
  public final ComponentName OooO00o;
  public final String OooO0O0;
  
  public final boolean OooO00o(Activity paramActivity)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
    Object localObject = MatcherUtils.OooO00o;
    ComponentName localComponentName = this.OooO00o;
    boolean bool1 = ((MatcherUtils)localObject).OooO00o(paramActivity, localComponentName);
    if (bool1)
    {
      localObject = this.OooO0O0;
      if (localObject != null)
      {
        paramActivity = paramActivity.getIntent();
        if (paramActivity == null)
        {
          bool2 = false;
          paramActivity = null;
        }
        else
        {
          paramActivity = paramActivity.getAction();
        }
        bool2 = Intrinsics.OooO00o(localObject, paramActivity);
        if (!bool2) {}
      }
      else
      {
        bool2 = true;
        break label82;
      }
    }
    boolean bool2 = false;
    paramActivity = null;
    label82:
    return bool2;
  }
  
  public final boolean OooO0O0(Intent paramIntent)
  {
    Intrinsics.OooO0o(paramIntent, "intent");
    Object localObject = MatcherUtils.OooO00o;
    ComponentName localComponentName1 = paramIntent.getComponent();
    ComponentName localComponentName2 = this.OooO00o;
    boolean bool1 = ((MatcherUtils)localObject).OooO0O0(localComponentName1, localComponentName2);
    boolean bool2 = false;
    localComponentName1 = null;
    if (bool1)
    {
      localObject = this.OooO0O0;
      if (localObject != null)
      {
        paramIntent = paramIntent.getAction();
        boolean bool3 = Intrinsics.OooO00o(localObject, paramIntent);
        if (!bool3) {}
      }
      else
      {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    boolean bool2 = paramObject instanceof ActivityFilter;
    if (!bool2) {
      return false;
    }
    Object localObject = this.OooO00o;
    paramObject = (ActivityFilter)paramObject;
    ComponentName localComponentName = paramObject.OooO00o;
    bool2 = Intrinsics.OooO00o(localObject, localComponentName);
    if (!bool2) {
      return false;
    }
    localObject = this.OooO0O0;
    paramObject = paramObject.OooO0O0;
    boolean bool3 = Intrinsics.OooO00o(localObject, paramObject);
    if (!bool3) {
      return false;
    }
    return bool1;
  }
  
  public final ComponentName getComponentName()
  {
    return this.OooO00o;
  }
  
  public final String getIntentAction()
  {
    return this.OooO0O0;
  }
  
  public int hashCode()
  {
    ComponentName localComponentName = this.OooO00o;
    int i = localComponentName.hashCode() * 31;
    String str = this.OooO0O0;
    int j;
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
    localStringBuilder.append("ActivityFilter(componentName=");
    Object localObject = this.OooO00o;
    localStringBuilder.append(localObject);
    localStringBuilder.append(", intentAction=");
    localObject = this.OooO0O0;
    localStringBuilder.append(localObject);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.embedding.ActivityFilter
 * JD-Core Version:    0.7.0.1
 */
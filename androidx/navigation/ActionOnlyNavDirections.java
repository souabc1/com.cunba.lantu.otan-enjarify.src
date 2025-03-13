package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public final class ActionOnlyNavDirections
  implements NavDirections
{
  public final int OooO00o;
  public final Bundle OooO0O0;
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    if (paramObject != null)
    {
      ActionOnlyNavDirections localActionOnlyNavDirections = ActionOnlyNavDirections.class;
      Class localClass = paramObject.getClass();
      boolean bool2 = Intrinsics.OooO00o(localActionOnlyNavDirections, localClass);
      if (bool2)
      {
        paramObject = (ActionOnlyNavDirections)paramObject;
        int i = getActionId();
        int j = paramObject.getActionId();
        if (i != j) {
          bool1 = false;
        }
        return bool1;
      }
    }
    return false;
  }
  
  public int getActionId()
  {
    return this.OooO00o;
  }
  
  public Bundle getArguments()
  {
    return this.OooO0O0;
  }
  
  public int hashCode()
  {
    int i = getActionId();
    return 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("ActionOnlyNavDirections(actionId=");
    int i = getActionId();
    localStringBuilder.append(i);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.ActionOnlyNavDirections
 * JD-Core Version:    0.7.0.1
 */
package androidx.window.embedding;

import android.app.Activity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class ActivityStack
{
  public final List OooO00o;
  public final boolean OooO0O0;
  
  public ActivityStack(List paramList, boolean paramBoolean)
  {
    this.OooO00o = paramList;
    this.OooO0O0 = paramBoolean;
  }
  
  public final boolean OooO00o(Activity paramActivity)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
    return this.OooO00o.contains(paramActivity);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    boolean bool2 = paramObject instanceof ActivityStack;
    if (!bool2) {
      return false;
    }
    List localList1 = this.OooO00o;
    paramObject = (ActivityStack)paramObject;
    List localList2 = paramObject.OooO00o;
    bool2 = Intrinsics.OooO00o(localList1, localList2);
    if (!bool2)
    {
      bool2 = this.OooO0O0;
      boolean bool3 = paramObject.OooO0O0;
      if (bool2 != bool3) {}
    }
    else
    {
      bool1 = false;
    }
    return bool1;
  }
  
  public final List getActivities$window_release()
  {
    return this.OooO00o;
  }
  
  public int hashCode()
  {
    int i = this.OooO0O0 * true;
    int j = this.OooO00o.hashCode();
    return i + j;
  }
  
  public final boolean isEmpty()
  {
    return this.OooO0O0;
  }
  
  public String toString()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("ActivityStack{");
    List localList = getActivities$window_release();
    Object localObject2 = Intrinsics.OooOOOO("activities=", localList);
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("isEmpty=");
    boolean bool = this.OooO0O0;
    ((StringBuilder)localObject2).append(bool);
    ((StringBuilder)localObject2).append('}');
    localObject2 = ((StringBuilder)localObject2).toString();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = ((StringBuilder)localObject1).toString();
    Intrinsics.OooO0o0(localObject1, "StringBuilder().apply(builderAction).toString()");
    return localObject1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.embedding.ActivityStack
 * JD-Core Version:    0.7.0.1
 */
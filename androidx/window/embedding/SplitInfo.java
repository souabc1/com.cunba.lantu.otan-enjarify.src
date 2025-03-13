package androidx.window.embedding;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

public final class SplitInfo
{
  public final ActivityStack OooO00o;
  public final ActivityStack OooO0O0;
  public final float OooO0OO;
  
  public SplitInfo(ActivityStack paramActivityStack1, ActivityStack paramActivityStack2, float paramFloat)
  {
    this.OooO00o = paramActivityStack1;
    this.OooO0O0 = paramActivityStack2;
    this.OooO0OO = paramFloat;
  }
  
  public final boolean OooO00o(Activity paramActivity)
  {
    Intrinsics.OooO0o(paramActivity, "activity");
    ActivityStack localActivityStack = this.OooO00o;
    boolean bool1 = localActivityStack.OooO00o(paramActivity);
    if (!bool1)
    {
      localActivityStack = this.OooO0O0;
      bool2 = localActivityStack.OooO00o(paramActivity);
      if (!bool2)
      {
        bool2 = false;
        paramActivity = null;
        break label52;
      }
    }
    boolean bool2 = true;
    label52:
    return bool2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    float f1 = 1.4E-45F;
    if (this == paramObject) {
      return bool1;
    }
    boolean bool2 = paramObject instanceof SplitInfo;
    if (!bool2) {
      return false;
    }
    ActivityStack localActivityStack1 = this.OooO00o;
    paramObject = (SplitInfo)paramObject;
    ActivityStack localActivityStack2 = paramObject.OooO00o;
    bool2 = Intrinsics.OooO00o(localActivityStack1, localActivityStack2);
    if (!bool2) {
      return false;
    }
    localActivityStack1 = this.OooO0O0;
    localActivityStack2 = paramObject.OooO0O0;
    bool2 = Intrinsics.OooO00o(localActivityStack1, localActivityStack2);
    if (!bool2) {
      return false;
    }
    float f2 = this.OooO0OO;
    float f3 = paramObject.OooO0OO;
    boolean bool3 = f2 < f3;
    if (!bool3)
    {
      bool3 = bool1;
      f3 = f1;
    }
    else
    {
      bool3 = false;
      paramObject = null;
      f3 = 0.0F;
    }
    if (!bool3) {
      return false;
    }
    return bool1;
  }
  
  public final ActivityStack getPrimaryActivityStack()
  {
    return this.OooO00o;
  }
  
  public final ActivityStack getSecondaryActivityStack()
  {
    return this.OooO0O0;
  }
  
  public final float getSplitRatio()
  {
    return this.OooO0OO;
  }
  
  public int hashCode()
  {
    int i = this.OooO00o.hashCode() * 31;
    int j = this.OooO0O0.hashCode();
    i = (i + j) * 31;
    j = Float.hashCode(this.OooO0OO);
    return i + j;
  }
  
  public String toString()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("SplitInfo:{");
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("primaryActivityStack=");
    ActivityStack localActivityStack1 = getPrimaryActivityStack();
    ((StringBuilder)localObject2).append(localActivityStack1);
    char c = ',';
    ((StringBuilder)localObject2).append(c);
    localObject2 = ((StringBuilder)localObject2).toString();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("secondaryActivityStack=");
    ActivityStack localActivityStack2 = getSecondaryActivityStack();
    ((StringBuilder)localObject2).append(localActivityStack2);
    ((StringBuilder)localObject2).append(c);
    localObject2 = ((StringBuilder)localObject2).toString();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("splitRatio=");
    float f = getSplitRatio();
    ((StringBuilder)localObject2).append(f);
    ((StringBuilder)localObject2).append('}');
    localObject2 = ((StringBuilder)localObject2).toString();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = ((StringBuilder)localObject1).toString();
    Intrinsics.OooO0o0(localObject1, "StringBuilder().apply(builderAction).toString()");
    return localObject1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.embedding.SplitInfo
 * JD-Core Version:    0.7.0.1
 */
package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

public final class LifecycleRegistry$Companion
{
  public final Lifecycle.State OooO00o(Lifecycle.State paramState1, Lifecycle.State paramState2)
  {
    String str = "state1";
    Intrinsics.OooO0o(paramState1, str);
    if (paramState2 != null)
    {
      int i = paramState2.compareTo(paramState1);
      if (i < 0) {
        paramState1 = paramState2;
      }
    }
    return paramState1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.LifecycleRegistry.Companion
 * JD-Core Version:    0.7.0.1
 */
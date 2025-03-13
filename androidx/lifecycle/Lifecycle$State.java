package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

public enum Lifecycle$State
{
  static
  {
    State localState = new androidx/lifecycle/Lifecycle$State;
    localState.<init>("DESTROYED", 0);
    o00OoOoo = localState;
    localState = new androidx/lifecycle/Lifecycle$State;
    localState.<init>("INITIALIZED", 1);
    o00Ooo00 = localState;
    localState = new androidx/lifecycle/Lifecycle$State;
    localState.<init>("CREATED", 2);
    o00Ooo0 = localState;
    localState = new androidx/lifecycle/Lifecycle$State;
    localState.<init>("STARTED", 3);
    o00Ooo0O = localState;
    localState = new androidx/lifecycle/Lifecycle$State;
    localState.<init>("RESUMED", 4);
    o00Ooo0o = localState;
  }
  
  public final boolean OooO0OO(State paramState)
  {
    String str = "state";
    Intrinsics.OooO0o(paramState, str);
    int i = compareTo(paramState);
    if (i >= 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      paramState = null;
    }
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.Lifecycle.State
 * JD-Core Version:    0.7.0.1
 */
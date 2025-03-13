package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

public final class Lifecycle$Event$Companion
{
  public final Lifecycle.Event OooO00o(Lifecycle.State paramState)
  {
    Intrinsics.OooO0o(paramState, "state");
    int[] arrayOfInt = Lifecycle.Event.Companion.WhenMappings.OooO00o;
    int i = paramState.ordinal();
    i = arrayOfInt[i];
    int j = 1;
    if (i != j)
    {
      j = 2;
      if (i != j)
      {
        j = 3;
        if (i != j)
        {
          i = 0;
          paramState = null;
        }
        else
        {
          paramState = Lifecycle.Event.ON_PAUSE;
        }
      }
      else
      {
        paramState = Lifecycle.Event.ON_STOP;
      }
    }
    else
    {
      paramState = Lifecycle.Event.ON_DESTROY;
    }
    return paramState;
  }
  
  public final Lifecycle.Event OooO0O0(Lifecycle.State paramState)
  {
    Intrinsics.OooO0o(paramState, "state");
    int[] arrayOfInt = Lifecycle.Event.Companion.WhenMappings.OooO00o;
    int i = paramState.ordinal();
    i = arrayOfInt[i];
    int j = 1;
    if (i != j)
    {
      j = 2;
      if (i != j)
      {
        j = 5;
        if (i != j)
        {
          i = 0;
          paramState = null;
        }
        else
        {
          paramState = Lifecycle.Event.ON_CREATE;
        }
      }
      else
      {
        paramState = Lifecycle.Event.ON_RESUME;
      }
    }
    else
    {
      paramState = Lifecycle.Event.ON_START;
    }
    return paramState;
  }
  
  public final Lifecycle.Event OooO0OO(Lifecycle.State paramState)
  {
    Intrinsics.OooO0o(paramState, "state");
    int[] arrayOfInt = Lifecycle.Event.Companion.WhenMappings.OooO00o;
    int i = paramState.ordinal();
    i = arrayOfInt[i];
    int j = 1;
    if (i != j)
    {
      j = 2;
      if (i != j)
      {
        j = 3;
        if (i != j)
        {
          i = 0;
          paramState = null;
        }
        else
        {
          paramState = Lifecycle.Event.ON_RESUME;
        }
      }
      else
      {
        paramState = Lifecycle.Event.ON_START;
      }
    }
    else
    {
      paramState = Lifecycle.Event.ON_CREATE;
    }
    return paramState;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.Lifecycle.Event.Companion
 * JD-Core Version:    0.7.0.1
 */
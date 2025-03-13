package androidx.lifecycle;

public enum Lifecycle$Event
{
  public static final Lifecycle.Event.Companion Companion;
  
  static
  {
    Object localObject = new androidx/lifecycle/Lifecycle$Event;
    ((Event)localObject).<init>("ON_CREATE", 0);
    ON_CREATE = (Event)localObject;
    localObject = new androidx/lifecycle/Lifecycle$Event;
    ((Event)localObject).<init>("ON_START", 1);
    ON_START = (Event)localObject;
    localObject = new androidx/lifecycle/Lifecycle$Event;
    ((Event)localObject).<init>("ON_RESUME", 2);
    ON_RESUME = (Event)localObject;
    localObject = new androidx/lifecycle/Lifecycle$Event;
    ((Event)localObject).<init>("ON_PAUSE", 3);
    ON_PAUSE = (Event)localObject;
    localObject = new androidx/lifecycle/Lifecycle$Event;
    ((Event)localObject).<init>("ON_STOP", 4);
    ON_STOP = (Event)localObject;
    localObject = new androidx/lifecycle/Lifecycle$Event;
    ((Event)localObject).<init>("ON_DESTROY", 5);
    ON_DESTROY = (Event)localObject;
    localObject = new androidx/lifecycle/Lifecycle$Event;
    ((Event)localObject).<init>("ON_ANY", 6);
    ON_ANY = (Event)localObject;
    $VALUES = OooO0O0();
    localObject = new androidx/lifecycle/Lifecycle$Event$Companion;
    ((Lifecycle.Event.Companion)localObject).<init>(null);
    Companion = (Lifecycle.Event.Companion)localObject;
  }
  
  public static final Event OooO0OO(Lifecycle.State paramState)
  {
    return Companion.OooO00o(paramState);
  }
  
  public static final Event OooO0Oo(Lifecycle.State paramState)
  {
    return Companion.OooO0OO(paramState);
  }
  
  public final Lifecycle.State getTargetState()
  {
    Object localObject1 = Lifecycle.Event.WhenMappings.OooO00o;
    int i = ordinal();
    int j = localObject1[i];
    switch (j)
    {
    default: 
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append(this);
      ((StringBuilder)localObject2).append(" has no target state");
      localObject2 = ((StringBuilder)localObject2).toString();
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 6: 
      return Lifecycle.State.o00OoOoo;
    case 5: 
      return Lifecycle.State.o00Ooo0o;
    case 3: 
    case 4: 
      return Lifecycle.State.o00Ooo0O;
    }
    return Lifecycle.State.o00Ooo0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.Lifecycle.Event
 * JD-Core Version:    0.7.0.1
 */
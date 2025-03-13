package androidx.navigation;

import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

public final class NavGraph$Companion
{
  public final NavDestination OooO00o(NavGraph paramNavGraph)
  {
    Intrinsics.OooO0o(paramNavGraph, "<this>");
    int i = paramNavGraph.getStartDestinationId();
    paramNavGraph = paramNavGraph.OooOOOo(i);
    NavGraph.Companion.findStartDestination.1 local1 = NavGraph.Companion.findStartDestination.1.o00OoOoo;
    return (NavDestination)SequencesKt.OooOO0o(SequencesKt.OooO0o(paramNavGraph, local1));
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavGraph.Companion
 * JD-Core Version:    0.7.0.1
 */
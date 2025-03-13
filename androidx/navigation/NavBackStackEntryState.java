package androidx.navigation;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.lifecycle.Lifecycle.State;
import kotlin.jvm.internal.Intrinsics;

public final class NavBackStackEntryState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final NavBackStackEntryState.Companion o00Ooo0o;
  public final String o00OoOoo;
  public final Bundle o00Ooo0;
  public final int o00Ooo00;
  public final Bundle o00Ooo0O;
  
  static
  {
    Object localObject = new androidx/navigation/NavBackStackEntryState$Companion;
    ((NavBackStackEntryState.Companion)localObject).<init>(null);
    o00Ooo0o = (NavBackStackEntryState.Companion)localObject;
    localObject = new androidx/navigation/NavBackStackEntryState$Companion$CREATOR$1;
    ((NavBackStackEntryState.Companion.CREATOR.1)localObject).<init>();
    CREATOR = (Parcelable.Creator)localObject;
  }
  
  public NavBackStackEntryState(Parcel paramParcel)
  {
    Object localObject1 = paramParcel.readString();
    Intrinsics.OooO0OO(localObject1);
    this.o00OoOoo = ((String)localObject1);
    int i = paramParcel.readInt();
    this.o00Ooo00 = i;
    localObject1 = NavBackStackEntryState.class;
    Object localObject2 = ((Class)localObject1).getClassLoader();
    localObject2 = paramParcel.readBundle((ClassLoader)localObject2);
    this.o00Ooo0 = ((Bundle)localObject2);
    localObject1 = ((Class)localObject1).getClassLoader();
    paramParcel = paramParcel.readBundle((ClassLoader)localObject1);
    Intrinsics.OooO0OO(paramParcel);
    this.o00Ooo0O = paramParcel;
  }
  
  public NavBackStackEntryState(NavBackStackEntry paramNavBackStackEntry)
  {
    Object localObject = paramNavBackStackEntry.getId();
    this.o00OoOoo = ((String)localObject);
    int i = paramNavBackStackEntry.getDestination().getId();
    this.o00Ooo00 = i;
    localObject = paramNavBackStackEntry.getArguments();
    this.o00Ooo0 = ((Bundle)localObject);
    localObject = new android/os/Bundle;
    ((Bundle)localObject).<init>();
    this.o00Ooo0O = ((Bundle)localObject);
    paramNavBackStackEntry.OooO0Oo((Bundle)localObject);
  }
  
  public final NavBackStackEntry OooO00o(Context paramContext, NavDestination paramNavDestination, Lifecycle.State paramState, NavControllerViewModel paramNavControllerViewModel)
  {
    Intrinsics.OooO0o(paramContext, "context");
    Intrinsics.OooO0o(paramNavDestination, "destination");
    Intrinsics.OooO0o(paramState, "hostLifecycleState");
    Bundle localBundle1 = this.o00Ooo0;
    if (localBundle1 != null)
    {
      localObject = paramContext.getClassLoader();
      localBundle1.setClassLoader((ClassLoader)localObject);
    }
    else
    {
      localBundle1 = null;
    }
    Object localObject = NavBackStackEntry.o00o000O;
    String str = this.o00OoOoo;
    Bundle localBundle2 = this.o00Ooo0O;
    return ((NavBackStackEntry.Companion)localObject).OooO00o(paramContext, paramNavDestination, localBundle1, paramState, paramNavControllerViewModel, str, localBundle2);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final Bundle getArgs()
  {
    return this.o00Ooo0;
  }
  
  public final int getDestinationId()
  {
    return this.o00Ooo00;
  }
  
  public final String getId()
  {
    return this.o00OoOoo;
  }
  
  public final Bundle getSavedState()
  {
    return this.o00Ooo0O;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Intrinsics.OooO0o(paramParcel, "parcel");
    Object localObject = this.o00OoOoo;
    paramParcel.writeString((String)localObject);
    paramInt = this.o00Ooo00;
    paramParcel.writeInt(paramInt);
    localObject = this.o00Ooo0;
    paramParcel.writeBundle((Bundle)localObject);
    localObject = this.o00Ooo0O;
    paramParcel.writeBundle((Bundle)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavBackStackEntryState
 * JD-Core Version:    0.7.0.1
 */
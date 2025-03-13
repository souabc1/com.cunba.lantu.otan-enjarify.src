package com.just.agentweb.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;

public class Action
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public ArrayList o00OoOoo;
  public int o00Ooo0;
  public int o00Ooo00;
  
  static
  {
    Action.1 local1 = new com/just/agentweb/action/Action$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public Action()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.o00OoOoo = localArrayList;
  }
  
  public Action(Parcel paramParcel)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.o00OoOoo = localArrayList;
    localArrayList = paramParcel.createStringArrayList();
    this.o00OoOoo = localArrayList;
    int i = paramParcel.readInt();
    this.o00Ooo00 = i;
    int j = paramParcel.readInt();
    this.o00Ooo0 = j;
  }
  
  public static Action OooO00o(String[] paramArrayOfString)
  {
    Action localAction = new com/just/agentweb/action/Action;
    localAction.<init>();
    localAction.setAction(1);
    paramArrayOfString = Arrays.asList(paramArrayOfString);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(paramArrayOfString);
    localAction.setPermissions(localArrayList);
    return localAction;
  }
  
  public Action OooO0OO(int paramInt)
  {
    this.o00Ooo0 = paramInt;
    return this;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getAction()
  {
    return this.o00Ooo00;
  }
  
  public int getFromIntention()
  {
    return this.o00Ooo0;
  }
  
  public ArrayList getPermissions()
  {
    return this.o00OoOoo;
  }
  
  public void setAction(int paramInt)
  {
    this.o00Ooo00 = paramInt;
  }
  
  public void setPermissions(ArrayList paramArrayList)
  {
    this.o00OoOoo = paramArrayList;
  }
  
  public void setPermissions(String[] paramArrayOfString)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    paramArrayOfString = Arrays.asList(paramArrayOfString);
    localArrayList.<init>(paramArrayOfString);
    this.o00OoOoo = localArrayList;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ArrayList localArrayList = this.o00OoOoo;
    paramParcel.writeStringList(localArrayList);
    paramInt = this.o00Ooo00;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.action.Action
 * JD-Core Version:    0.7.0.1
 */
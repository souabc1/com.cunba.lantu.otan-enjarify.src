package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

final class FragmentManagerState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public ArrayList o00OoOoo;
  public BackStackRecordState[] o00Ooo0;
  public ArrayList o00Ooo00;
  public int o00Ooo0O;
  public String o00Ooo0o = null;
  public ArrayList o00OooO;
  public ArrayList o00OooO0;
  public ArrayList o00OooOO;
  
  static
  {
    FragmentManagerState.1 local1 = new androidx/fragment/app/FragmentManagerState$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public FragmentManagerState()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.o00OooO0 = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.o00OooO = localArrayList;
  }
  
  public FragmentManagerState(Parcel paramParcel)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.o00OooO0 = ((ArrayList)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.o00OooO = ((ArrayList)localObject);
    localObject = paramParcel.createStringArrayList();
    this.o00OoOoo = ((ArrayList)localObject);
    localObject = paramParcel.createStringArrayList();
    this.o00Ooo00 = ((ArrayList)localObject);
    localObject = BackStackRecordState.CREATOR;
    localObject = (BackStackRecordState[])paramParcel.createTypedArray((Parcelable.Creator)localObject);
    this.o00Ooo0 = ((BackStackRecordState[])localObject);
    int i = paramParcel.readInt();
    this.o00Ooo0O = i;
    localObject = paramParcel.readString();
    this.o00Ooo0o = ((String)localObject);
    localObject = paramParcel.createStringArrayList();
    this.o00OooO0 = ((ArrayList)localObject);
    localObject = BackStackState.CREATOR;
    localObject = paramParcel.createTypedArrayList((Parcelable.Creator)localObject);
    this.o00OooO = ((ArrayList)localObject);
    localObject = FragmentManager.LaunchedFragmentInfo.CREATOR;
    paramParcel = paramParcel.createTypedArrayList((Parcelable.Creator)localObject);
    this.o00OooOO = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject1 = this.o00OoOoo;
    paramParcel.writeStringList((List)localObject1);
    localObject1 = this.o00Ooo00;
    paramParcel.writeStringList((List)localObject1);
    localObject1 = this.o00Ooo0;
    paramParcel.writeTypedArray((Parcelable[])localObject1, paramInt);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
    Object localObject2 = this.o00Ooo0o;
    paramParcel.writeString((String)localObject2);
    localObject2 = this.o00OooO0;
    paramParcel.writeStringList((List)localObject2);
    localObject2 = this.o00OooO;
    paramParcel.writeTypedList((List)localObject2);
    localObject2 = this.o00OooOO;
    paramParcel.writeTypedList((List)localObject2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentManagerState
 * JD-Core Version:    0.7.0.1
 */
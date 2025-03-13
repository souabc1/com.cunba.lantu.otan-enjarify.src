package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

class FragmentManager$LaunchedFragmentInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public int o00Ooo00;
  
  static
  {
    FragmentManager.LaunchedFragmentInfo.1 local1 = new androidx/fragment/app/FragmentManager$LaunchedFragmentInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public FragmentManager$LaunchedFragmentInfo(Parcel paramParcel)
  {
    String str = paramParcel.readString();
    this.o00OoOoo = str;
    int i = paramParcel.readInt();
    this.o00Ooo00 = i;
  }
  
  public FragmentManager$LaunchedFragmentInfo(String paramString, int paramInt)
  {
    this.o00OoOoo = paramString;
    this.o00Ooo00 = paramInt;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00OoOoo;
    paramParcel.writeString(str);
    paramInt = this.o00Ooo00;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentManager.LaunchedFragmentInfo
 * JD-Core Version:    0.7.0.1
 */
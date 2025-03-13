package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  public int[] o00Ooo0;
  public int o00Ooo00;
  public boolean o00Ooo0O;
  
  static
  {
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.1 local1 = new androidx/recyclerview/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem() {}
  
  public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    this.o00OoOoo = i;
    i = paramParcel.readInt();
    this.o00Ooo00 = i;
    i = paramParcel.readInt();
    int j = 1;
    if (i != j) {
      j = 0;
    }
    this.o00Ooo0O = j;
    i = paramParcel.readInt();
    if (i > 0)
    {
      int[] arrayOfInt = new int[i];
      this.o00Ooo0 = arrayOfInt;
      paramParcel.readIntArray(arrayOfInt);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getGapForSpan(int paramInt)
  {
    int[] arrayOfInt = this.o00Ooo0;
    if (arrayOfInt == null) {
      paramInt = 0;
    } else {
      paramInt = arrayOfInt[paramInt];
    }
    return paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("FullSpanItem{mPosition=");
    int i = this.o00OoOoo;
    localStringBuilder.append(i);
    localStringBuilder.append(", mGapDir=");
    i = this.o00Ooo00;
    localStringBuilder.append(i);
    localStringBuilder.append(", mHasUnwantedGapAfter=");
    boolean bool = this.o00Ooo0O;
    localStringBuilder.append(bool);
    localStringBuilder.append(", mGapPerSpan=");
    String str = Arrays.toString(this.o00Ooo0);
    localStringBuilder.append(str);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = this.o00OoOoo;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo00;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
    int[] arrayOfInt = this.o00Ooo0;
    if (arrayOfInt != null)
    {
      int i = arrayOfInt.length;
      if (i > 0)
      {
        paramInt = arrayOfInt.length;
        paramParcel.writeInt(paramInt);
        arrayOfInt = this.o00Ooo0;
        paramParcel.writeIntArray(arrayOfInt);
        return;
      }
    }
    paramInt = 0;
    arrayOfInt = null;
    paramParcel.writeInt(0);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem
 * JD-Core Version:    0.7.0.1
 */
package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class ActivityResult
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public final int o00OoOoo;
  public final Intent o00Ooo00;
  
  static
  {
    ActivityResult.1 local1 = new androidx/activity/result/ActivityResult$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public ActivityResult(int paramInt, Intent paramIntent)
  {
    this.o00OoOoo = paramInt;
    this.o00Ooo00 = paramIntent;
  }
  
  public ActivityResult(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    this.o00OoOoo = i;
    i = paramParcel.readInt();
    if (i == 0)
    {
      paramParcel = null;
    }
    else
    {
      Parcelable.Creator localCreator = Intent.CREATOR;
      paramParcel = (Intent)localCreator.createFromParcel(paramParcel);
    }
    this.o00Ooo00 = paramParcel;
  }
  
  public static String OooO00o(int paramInt)
  {
    int i = -1;
    if (paramInt != i)
    {
      if (paramInt != 0) {
        return String.valueOf(paramInt);
      }
      return "RESULT_CANCELED";
    }
    return "RESULT_OK";
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Intent getData()
  {
    return this.o00Ooo00;
  }
  
  public int getResultCode()
  {
    return this.o00OoOoo;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("ActivityResult{resultCode=");
    Object localObject = OooO00o(this.o00OoOoo);
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(", data=");
    localObject = this.o00Ooo00;
    localStringBuilder.append(localObject);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = this.o00OoOoo;
    paramParcel.writeInt(i);
    Intent localIntent = this.o00Ooo00;
    if (localIntent == null)
    {
      i = 0;
      localIntent = null;
    }
    else
    {
      i = 1;
    }
    paramParcel.writeInt(i);
    localIntent = this.o00Ooo00;
    if (localIntent != null) {
      localIntent.writeToParcel(paramParcel, paramInt);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.ActivityResult
 * JD-Core Version:    0.7.0.1
 */
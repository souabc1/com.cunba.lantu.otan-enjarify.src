package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.Intrinsics;

public final class IntentSenderRequest
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final IntentSenderRequest.Companion o00Ooo0o;
  public final IntentSender o00OoOoo;
  public final int o00Ooo0;
  public final Intent o00Ooo00;
  public final int o00Ooo0O;
  
  static
  {
    Object localObject = new androidx/activity/result/IntentSenderRequest$Companion;
    ((IntentSenderRequest.Companion)localObject).<init>(null);
    o00Ooo0o = (IntentSenderRequest.Companion)localObject;
    localObject = new androidx/activity/result/IntentSenderRequest$Companion$CREATOR$1;
    ((IntentSenderRequest.Companion.CREATOR.1)localObject).<init>();
    CREATOR = (Parcelable.Creator)localObject;
  }
  
  public IntentSenderRequest(IntentSender paramIntentSender, Intent paramIntent, int paramInt1, int paramInt2)
  {
    this.o00OoOoo = paramIntentSender;
    this.o00Ooo00 = paramIntent;
    this.o00Ooo0 = paramInt1;
    this.o00Ooo0O = paramInt2;
  }
  
  public IntentSenderRequest(Parcel paramParcel)
  {
    this((IntentSender)localObject1, (Intent)localObject2, i, j);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final Intent getFillInIntent()
  {
    return this.o00Ooo00;
  }
  
  public final int getFlagsMask()
  {
    return this.o00Ooo0;
  }
  
  public final int getFlagsValues()
  {
    return this.o00Ooo0O;
  }
  
  public final IntentSender getIntentSender()
  {
    return this.o00OoOoo;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Intrinsics.OooO0o(paramParcel, "dest");
    Object localObject = this.o00OoOoo;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    localObject = this.o00Ooo00;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.IntentSenderRequest
 * JD-Core Version:    0.7.0.1
 */
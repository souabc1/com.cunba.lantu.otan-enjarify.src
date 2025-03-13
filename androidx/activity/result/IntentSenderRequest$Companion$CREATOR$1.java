package androidx.activity.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.Intrinsics;

public final class IntentSenderRequest$Companion$CREATOR$1
  implements Parcelable.Creator
{
  public IntentSenderRequest OooO00o(Parcel paramParcel)
  {
    Intrinsics.OooO0o(paramParcel, "inParcel");
    IntentSenderRequest localIntentSenderRequest = new androidx/activity/result/IntentSenderRequest;
    localIntentSenderRequest.<init>(paramParcel);
    return localIntentSenderRequest;
  }
  
  public IntentSenderRequest[] OooO0O0(int paramInt)
  {
    return new IntentSenderRequest[paramInt];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.activity.result.IntentSenderRequest.Companion.CREATOR.1
 * JD-Core Version:    0.7.0.1
 */
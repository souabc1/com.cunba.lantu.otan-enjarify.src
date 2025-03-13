package com.qinggan.now;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum NowFeedBackAction
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  
  static
  {
    Object localObject1 = new com/qinggan/now/NowFeedBackAction;
    Object localObject2 = m54207b69.F54207b69_11(">d2A2C353E262627272E2E313A47383D");
    ((NowFeedBackAction)localObject1).<init>((String)localObject2, 0);
    o00Ooo0O = (NowFeedBackAction)localObject1;
    localObject2 = new com/qinggan/now/NowFeedBackAction;
    Object localObject3 = m54207b69.F54207b69_11("Ug2929323B2527282A2D2F2E374431343834333D");
    ((NowFeedBackAction)localObject2).<init>((String)localObject3, 1);
    o00Ooo00 = (NowFeedBackAction)localObject2;
    localObject3 = new com/qinggan/now/NowFeedBackAction;
    Object localObject4 = m54207b69.F54207b69_11("k17F7F68717B797A7C7B797C857A747E8C7485");
    ((NowFeedBackAction)localObject3).<init>((String)localObject4, 2);
    o00OooOO = (NowFeedBackAction)localObject3;
    localObject4 = new com/qinggan/now/NowFeedBackAction;
    Object localObject5 = m54207b69.F54207b69_11("A/61617A736D6F70727577766F7C876F7370728A74");
    ((NowFeedBackAction)localObject4).<init>((String)localObject5, 3);
    o00OooO0 = (NowFeedBackAction)localObject4;
    localObject5 = new com/qinggan/now/NowFeedBackAction;
    Object localObject6 = m54207b69.F54207b69_11("ft3A3C252E363637373E3E414A37344A4A33");
    ((NowFeedBackAction)localObject5).<init>((String)localObject6, 4);
    o00Ooo0o = (NowFeedBackAction)localObject5;
    localObject6 = new com/qinggan/now/NowFeedBackAction;
    Object localObject7 = m54207b69.F54207b69_11("+M03031C150F0D0E10171518111E252B181C2A1A");
    ((NowFeedBackAction)localObject6).<init>((String)localObject7, 5);
    o00OooO = (NowFeedBackAction)localObject6;
    localObject7 = new com/qinggan/now/NowFeedBackAction;
    String str = m54207b69.F54207b69_11("W87678716A828283838282857E737D7F8B8D");
    ((NowFeedBackAction)localObject7).<init>(str, 6);
    o00Ooo0 = (NowFeedBackAction)localObject7;
    NowFeedBackAction[] tmp163_160 = new NowFeedBackAction[7];
    NowFeedBackAction[] tmp164_163 = tmp163_160;
    NowFeedBackAction[] tmp164_163 = tmp163_160;
    tmp164_163[0] = localObject1;
    tmp164_163[1] = localObject2;
    NowFeedBackAction[] tmp171_164 = tmp164_163;
    NowFeedBackAction[] tmp171_164 = tmp164_163;
    tmp171_164[2] = localObject3;
    tmp171_164[3] = localObject4;
    NowFeedBackAction[] tmp178_171 = tmp171_164;
    NowFeedBackAction[] tmp178_171 = tmp171_164;
    tmp178_171[4] = localObject5;
    tmp178_171[5] = localObject6;
    tmp178_171[6] = localObject7;
    o00OoOoo = tmp178_171;
    localObject1 = new com/qinggan/now/NowFeedBackAction$1;
    ((NowFeedBackAction.1)localObject1).<init>();
    CREATOR = (Parcelable.Creator)localObject1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = ordinal();
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.NowFeedBackAction
 * JD-Core Version:    0.7.0.1
 */
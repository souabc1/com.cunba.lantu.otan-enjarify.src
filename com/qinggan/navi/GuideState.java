package com.qinggan.navi;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum GuideState
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  
  static
  {
    Object localObject1 = new com/qinggan/navi/GuideState;
    Object localObject2 = m54207b69.F54207b69_11(".;48505C4C536962555A6868");
    Object localObject3 = m54207b69.F54207b69_11("a_0C0C20100F");
    ((GuideState)localObject1).<init>((String)localObject3, 0, (String)localObject2);
    o00OooOo = (GuideState)localObject1;
    GuideState localGuideState = new com/qinggan/navi/GuideState;
    localObject3 = m54207b69.F54207b69_11("4_3E2B2D330431313737");
    Object localObject4 = m54207b69.F54207b69_11("G-6C797B6576837F6985");
    localGuideState.<init>((String)localObject4, 1, (String)localObject3);
    o00Ooo0 = localGuideState;
    localObject2 = new com/qinggan/navi/GuideState;
    localObject4 = m54207b69.F54207b69_11("=558555D6D4A46604C");
    Object localObject5 = m54207b69.F54207b69_11("@u38353D2D2A26402C");
    ((GuideState)localObject2).<init>((String)localObject5, 2, (String)localObject4);
    o00Ooo0o = (GuideState)localObject2;
    localObject3 = new com/qinggan/navi/GuideState;
    localObject5 = m54207b69.F54207b69_11("I*534C5F785164495557");
    Object localObject6 = m54207b69.F54207b69_11("-u2C35242D3625423838");
    ((GuideState)localObject3).<init>((String)localObject6, 3, (String)localObject5);
    o00OoooO = (GuideState)localObject3;
    localObject4 = new com/qinggan/navi/GuideState;
    localObject6 = m54207b69.F54207b69_11("s3505C5460585B72634D5F4B4E5E4D4E");
    Object localObject7 = m54207b69.F54207b69_11("M:756D816B696F817071");
    ((GuideState)localObject4).<init>((String)localObject7, 4, (String)localObject6);
    o00OooO0 = (GuideState)localObject4;
    localObject5 = new com/qinggan/navi/GuideState;
    localObject7 = m54207b69.F54207b69_11("[057465B575D635D");
    Object localObject8 = m54207b69.F54207b69_11("Cg20333026322E26");
    ((GuideState)localObject5).<init>((String)localObject8, 5, (String)localObject7);
    o00Ooo0O = (GuideState)localObject5;
    localObject6 = new com/qinggan/navi/GuideState;
    localObject8 = m54207b69.F54207b69_11("~^2C324136");
    String str1 = m54207b69.F54207b69_11(".+79656C69");
    ((GuideState)localObject6).<init>(str1, 6, (String)localObject8);
    o00OooO = (GuideState)localObject6;
    localObject7 = new com/qinggan/navi/GuideState;
    str1 = m54207b69.F54207b69_11("HI3A21263F292D43272F37");
    String str2 = m54207b69.F54207b69_11("4f35302D362E2C3836302A");
    ((GuideState)localObject7).<init>(str2, 7, str1);
    o00OooOO = (GuideState)localObject7;
    localObject8 = new com/qinggan/navi/GuideState;
    str2 = m54207b69.F54207b69_11("Y*5F45434749624A");
    String str3 = m54207b69.F54207b69_11("0b372D2B2F313A32");
    ((GuideState)localObject8).<init>(str3, 8, str2);
    o0O00o0 = (GuideState)localObject8;
    GuideState[] tmp296_293 = new GuideState[9];
    GuideState[] tmp297_296 = tmp296_293;
    GuideState[] tmp297_296 = tmp296_293;
    tmp297_296[0] = localObject1;
    tmp297_296[1] = localGuideState;
    GuideState[] tmp304_297 = tmp297_296;
    GuideState[] tmp304_297 = tmp297_296;
    tmp304_297[2] = localObject2;
    tmp304_297[3] = localObject3;
    GuideState[] tmp311_304 = tmp304_297;
    GuideState[] tmp311_304 = tmp304_297;
    tmp311_304[4] = localObject4;
    tmp311_304[5] = localObject5;
    GuideState[] tmp320_311 = tmp311_304;
    GuideState[] tmp320_311 = tmp311_304;
    tmp320_311[6] = localObject6;
    tmp320_311[7] = localObject7;
    tmp320_311[8] = localObject8;
    o00Ooo00 = tmp320_311;
    localObject1 = new com/qinggan/navi/GuideState$1;
    ((GuideState.1)localObject1).<init>();
    CREATOR = (Parcelable.Creator)localObject1;
  }
  
  public GuideState(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public static GuideState OooO0OO(String paramString)
  {
    String str = m54207b69.F54207b69_11(".;48505C4C536962555A6868");
    boolean bool1 = paramString.equals(str);
    if (bool1) {
      return o00OooOo;
    }
    str = m54207b69.F54207b69_11("4_3E2B2D330431313737");
    bool1 = paramString.equals(str);
    if (bool1) {
      return o00Ooo0;
    }
    str = m54207b69.F54207b69_11("=558555D6D4A46604C");
    bool1 = paramString.equals(str);
    if (bool1) {
      return o00Ooo0o;
    }
    str = m54207b69.F54207b69_11("I*534C5F785164495557");
    bool1 = paramString.equals(str);
    if (bool1) {
      return o00OoooO;
    }
    str = m54207b69.F54207b69_11("s3505C5460585B72634D5F4B4E5E4D4E");
    bool1 = paramString.equals(str);
    if (bool1) {
      return o00OooO0;
    }
    str = m54207b69.F54207b69_11("[057465B575D635D");
    bool1 = paramString.equals(str);
    if (bool1) {
      return o00Ooo0O;
    }
    str = m54207b69.F54207b69_11("~^2C324136");
    bool1 = paramString.equals(str);
    if (bool1) {
      return o00OooO;
    }
    str = m54207b69.F54207b69_11("HI3A21263F292D43272F37");
    boolean bool2 = paramString.equals(str);
    if (bool2) {
      return o00OooOO;
    }
    return o0O00o0;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = ordinal();
    paramParcel.writeInt(paramInt);
    String str = this.o00OoOoo;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.navi.GuideState
 * JD-Core Version:    0.7.0.1
 */
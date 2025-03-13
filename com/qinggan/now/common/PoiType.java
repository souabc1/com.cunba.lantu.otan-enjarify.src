package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public enum PoiType
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final String o00OooOo;
  public String o00OoOoo;
  
  static
  {
    Object localObject1 = new com/qinggan/now/common/PoiType;
    Object localObject2 = m54207b69.F54207b69_11("<^0E12190421241210271620");
    ((PoiType)localObject1).<init>((String)localObject2, 0, "洗车场");
    o00Ooo0 = (PoiType)localObject1;
    PoiType localPoiType1 = new com/qinggan/now/common/PoiType;
    Object localObject3 = m54207b69.F54207b69_11("Gq213F3A3140353E462D3D493B4B3F42");
    localPoiType1.<init>((String)localObject3, 1, "维修厂");
    o00Ooo0o = localPoiType1;
    PoiType localPoiType2 = new com/qinggan/now/common/PoiType;
    Object localObject4 = m54207b69.F54207b69_11("fr223E3D302638264043453F494933");
    localPoiType2.<init>((String)localObject4, 2, "停车场");
    o00OooO0 = localPoiType2;
    localObject2 = new com/qinggan/now/common/PoiType;
    String str1 = m54207b69.F54207b69_11("A060807B727B7669766B6D7B6F858C8C");
    ((PoiType)localObject2).<init>(str1, 3, "加油站");
    o00Ooo0O = (PoiType)localObject2;
    localObject3 = new com/qinggan/now/common/PoiType;
    String str2 = m54207b69.F54207b69_11("=r223E3D30243C272D3B302A3E4833");
    ((PoiType)localObject3).<init>(str2, 4, "饭店");
    o00OooO = (PoiType)localObject3;
    localObject4 = new com/qinggan/now/common/PoiType;
    String str3 = m54207b69.F54207b69_11("7j3A2625384329272B2D462E");
    ((PoiType)localObject4).<init>(str3, 5, "未知");
    o00OooOO = (PoiType)localObject4;
    PoiType[] tmp151_148 = new PoiType[6];
    PoiType[] tmp152_151 = tmp151_148;
    PoiType[] tmp152_151 = tmp151_148;
    tmp152_151[0] = localObject1;
    tmp152_151[1] = localPoiType1;
    PoiType[] tmp159_152 = tmp152_151;
    PoiType[] tmp159_152 = tmp152_151;
    tmp159_152[2] = localPoiType2;
    tmp159_152[3] = localObject2;
    tmp159_152[4] = localObject3;
    PoiType[] tmp170_159 = tmp159_152;
    tmp170_159[5] = localObject4;
    o00Ooo00 = tmp170_159;
    o00OooOo = PoiType.class.getSimpleName();
    localObject1 = new com/qinggan/now/common/PoiType$1;
    ((PoiType.1)localObject1).<init>();
    CREATOR = (Parcelable.Creator)localObject1;
  }
  
  public PoiType(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public static PoiType OooO0Oo(int paramInt)
  {
    if (paramInt != 0)
    {
      int i = 1;
      if (paramInt != i)
      {
        i = 2;
        if (paramInt != i)
        {
          i = 3;
          if (paramInt != i)
          {
            i = 4;
            if (paramInt != i) {
              return o00OooOO;
            }
            return o00OooO;
          }
          return o00Ooo0O;
        }
        return o00OooO0;
      }
      return o00Ooo0o;
    }
    return o00Ooo0;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getKeyWord()
  {
    return this.o00OoOoo;
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
 * Qualified Name:     com.qinggan.now.common.PoiType
 * JD-Core Version:    0.7.0.1
 */
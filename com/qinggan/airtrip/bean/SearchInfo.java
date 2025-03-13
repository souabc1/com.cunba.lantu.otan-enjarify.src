package com.qinggan.airtrip.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Date;
import m54207b69;

public class SearchInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo0;
  public String o00Ooo00;
  public Date o00Ooo0O;
  public Date o00Ooo0o;
  public String o00OooO;
  public String o00OooO0;
  public String o00OooOO;
  public String o00OooOo;
  public ErrorCode o00OoooO;
  public String o00Ooooo;
  public int o00o000;
  public int o00o0000;
  public int o00o000O;
  public int o00o000o;
  public Date o0O00o0;
  
  static
  {
    SearchInfo.1 local1 = new com/qinggan/airtrip/bean/SearchInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public SearchInfo()
  {
    String str = SearchInfo.class.getSimpleName();
    this.o00OoOoo = str;
    str = "";
    this.o00OooO = str;
    this.o00OooO0 = str;
    this.o00OooOO = str;
    this.o00OooOo = str;
    this.o00Ooooo = str;
    this.o00o000 = 1;
    this.o00o000O = 20;
    this.o00o0000 = 0;
    this.o00Ooo0 = str;
    this.o00Ooo00 = str;
    this.o00o000o = -1;
  }
  
  public SearchInfo(Parcel paramParcel)
  {
    Object localObject1 = SearchInfo.class.getSimpleName();
    this.o00OoOoo = ((String)localObject1);
    localObject1 = "";
    this.o00OooO = ((String)localObject1);
    this.o00OooO0 = ((String)localObject1);
    this.o00OooOO = ((String)localObject1);
    this.o00OooOo = ((String)localObject1);
    this.o00Ooooo = ((String)localObject1);
    this.o00o000 = 1;
    this.o00o000O = 20;
    int i = 0;
    this.o00o0000 = 0;
    this.o00Ooo0 = ((String)localObject1);
    this.o00Ooo00 = ((String)localObject1);
    int j = -1;
    this.o00o000o = j;
    String str = paramParcel.readString();
    this.o00OoOoo = str;
    str = paramParcel.readString();
    this.o00OooO = str;
    str = paramParcel.readString();
    this.o00OooO0 = str;
    str = paramParcel.readString();
    this.o00OooOO = str;
    str = paramParcel.readString();
    this.o00OooOo = str;
    str = paramParcel.readString();
    this.o00Ooooo = str;
    long l1 = paramParcel.readLong();
    long l2 = -1;
    boolean bool1 = l1 < l2;
    Object localObject2 = null;
    Date localDate1;
    if (!bool1)
    {
      bool1 = false;
      localDate1 = null;
    }
    else
    {
      localDate1 = new java/util/Date;
      localDate1.<init>(l1);
    }
    this.o00Ooo0O = localDate1;
    i = paramParcel.readInt();
    this.o00o000 = i;
    i = paramParcel.readInt();
    this.o00o000O = i;
    i = paramParcel.readInt();
    this.o00o0000 = i;
    l1 = paramParcel.readLong();
    bool1 = l1 < l2;
    if (!bool1)
    {
      bool1 = false;
      localDate1 = null;
    }
    else
    {
      localDate1 = new java/util/Date;
      localDate1.<init>(l1);
    }
    this.o00Ooo0o = localDate1;
    l1 = paramParcel.readLong();
    boolean bool2 = l1 < l2;
    Date localDate2;
    if (!bool2)
    {
      bool2 = false;
      localDate2 = null;
    }
    else
    {
      localDate2 = new java/util/Date;
      localDate2.<init>(l1);
    }
    this.o0O00o0 = localDate2;
    str = paramParcel.readString();
    this.o00Ooo0 = str;
    str = paramParcel.readString();
    this.o00Ooo00 = str;
    int k = paramParcel.readInt();
    if (k != j)
    {
      localObject1 = ErrorCode.values();
      localObject2 = localObject1[k];
    }
    this.o00OoooO = localObject2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11(")^0D3C412F413B1D37403A2F45473B384C414B4D768D");
    localStringBuilder.append(str);
    str = this.o00OooO;
    localStringBuilder.append(str);
    char c = '\'';
    localStringBuilder.append(c);
    Object localObject = m54207b69.F54207b69_11("G-010E4B4B615165606068521B16");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooO0;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("=5191653534A465C615959121D");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooOO;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("H]717E3B3B322E3A3A44323E3D3F6D88");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooOo;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("nW7B78333E32193E3A3A737A");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooooo;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("OT78753834374240173D293B74");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0O;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("=,000D5E504F4E6860491A");
    localStringBuilder.append((String)localObject);
    int i = this.o00o000;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("wf4A47180A05083B16240C65");
    localStringBuilder.append((String)localObject);
    i = this.o00o000O;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("Pn424F091D0F08400822180C4813211962");
    localStringBuilder.append((String)localObject);
    i = this.o00o0000;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("^R7E73323A3940420D4348417A");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0o;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("s.020F4D434E7F4D4A531C");
    localStringBuilder.append((String)localObject);
    localObject = this.o0O00o0;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("=31F14545D457562484B865C69621B22");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11(">[777C3C352D1D3A3033213E4A4A738A");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo00;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(c);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00OoOoo;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OooO;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OooO0;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OooOO;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OooOo;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooooo;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo0O;
    long l1 = -1;
    long l2;
    if (localObject != null) {
      l2 = ((Date)localObject).getTime();
    } else {
      l2 = l1;
    }
    paramParcel.writeLong(l2);
    paramInt = this.o00o000;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00o000O;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00o0000;
    paramParcel.writeInt(paramInt);
    localObject = this.o00Ooo0o;
    if (localObject != null) {
      l2 = ((Date)localObject).getTime();
    } else {
      l2 = l1;
    }
    paramParcel.writeLong(l2);
    localObject = this.o0O00o0;
    if (localObject != null) {
      l1 = ((Date)localObject).getTime();
    }
    paramParcel.writeLong(l1);
    localObject = this.o00Ooo0;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo00;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OoooO;
    if (localObject == null) {
      paramInt = -1;
    } else {
      paramInt = ((Enum)localObject).ordinal();
    }
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.bean.SearchInfo
 * JD-Core Version:    0.7.0.1
 */
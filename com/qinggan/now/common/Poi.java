package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class Poi
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public City o00Ooo0;
  public PoiCategory o00Ooo00;
  public CoordSystem o00Ooo0O;
  public long o00Ooo0o;
  public double o00OooO;
  public double o00OooO0;
  public String o00OooOO;
  public double o00OooOo;
  public String o00OoooO;
  public String o00Ooooo;
  public long o00o000;
  public String o00o0000;
  public PoiType o00o000O;
  public double o0O00o0;
  
  static
  {
    Poi.1 local1 = new com/qinggan/now/common/Poi$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public Poi() {}
  
  public Poi(Poi paramPoi)
  {
    Object localObject = paramPoi.o00o000O;
    this.o00o000O = ((PoiType)localObject);
    localObject = paramPoi.o00OooOO;
    this.o00OooOO = ((String)localObject);
    localObject = paramPoi.o00OoooO;
    this.o00OoooO = ((String)localObject);
    localObject = paramPoi.o00OoOoo;
    this.o00OoOoo = ((String)localObject);
    localObject = paramPoi.o00o0000;
    this.o00o0000 = ((String)localObject);
    double d = paramPoi.o0O00o0;
    this.o0O00o0 = d;
    d = paramPoi.o00OooOo;
    this.o00OooOo = d;
    localObject = paramPoi.o00Ooo0O;
    this.o00Ooo0O = ((CoordSystem)localObject);
    d = paramPoi.o00OooO;
    this.o00OooO = d;
    d = paramPoi.o00OooO0;
    this.o00OooO0 = d;
    long l = paramPoi.o00Ooo0o;
    this.o00Ooo0o = l;
    l = paramPoi.o00o000;
    this.o00o000 = l;
    localObject = paramPoi.o00Ooo0;
    this.o00Ooo0 = ((City)localObject);
    localObject = paramPoi.o00Ooo00;
    this.o00Ooo00 = ((PoiCategory)localObject);
    paramPoi = paramPoi.o00Ooooo;
    this.o00Ooooo = paramPoi;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAddress()
  {
    return this.o00OoOoo;
  }
  
  public PoiCategory getCategory()
  {
    return this.o00Ooo00;
  }
  
  public City getCity()
  {
    return this.o00Ooo0;
  }
  
  public CoordSystem getCoordSystem()
  {
    return this.o00Ooo0O;
  }
  
  public long getDistance()
  {
    return this.o00Ooo0o;
  }
  
  public double getGuideLat()
  {
    return this.o00OooO0;
  }
  
  public double getGuideLon()
  {
    return this.o00OooO;
  }
  
  public String getId()
  {
    return this.o00OooOO;
  }
  
  public double getLat()
  {
    return this.o00OooOo;
  }
  
  public double getLon()
  {
    return this.o0O00o0;
  }
  
  public String getName()
  {
    return this.o00OoooO;
  }
  
  public String getPoiTag()
  {
    return this.o00Ooooo;
  }
  
  public String getTel()
  {
    return this.o00o0000;
  }
  
  public long getTime()
  {
    return this.o00o000;
  }
  
  public PoiType getType()
  {
    return this.o00o000O;
  }
  
  public void setAddress(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setCategory(PoiCategory paramPoiCategory)
  {
    this.o00Ooo00 = paramPoiCategory;
  }
  
  public void setCity(City paramCity)
  {
    this.o00Ooo0 = paramCity;
  }
  
  public void setCoordSystem(CoordSystem paramCoordSystem)
  {
    this.o00Ooo0O = paramCoordSystem;
  }
  
  public void setDistance(long paramLong)
  {
    this.o00Ooo0o = paramLong;
  }
  
  public void setGuideLat(double paramDouble)
  {
    this.o00OooO0 = paramDouble;
  }
  
  public void setGuideLon(double paramDouble)
  {
    this.o00OooO = paramDouble;
  }
  
  public void setId(String paramString)
  {
    this.o00OooOO = paramString;
  }
  
  public void setLat(double paramDouble)
  {
    this.o00OooOo = paramDouble;
  }
  
  public void setLon(double paramDouble)
  {
    this.o0O00o0 = paramDouble;
  }
  
  public void setName(String paramString)
  {
    this.o00OoooO = paramString;
  }
  
  public void setPoiTag(String paramString)
  {
    this.o00Ooooo = paramString;
  }
  
  public void setTel(String paramString)
  {
    this.o00o0000 = paramString;
  }
  
  public void setTime(long paramLong)
  {
    this.o00o000 = paramLong;
  }
  
  public void setType(PoiType paramPoiType)
  {
    this.o00o000O = paramPoiType;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("_e350B0E484216221C0861");
    localStringBuilder.append((String)localObject);
    localObject = this.o00o000O;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("j^727F393D67");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooOO;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("VG6B682B292E2780");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoooO;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("1\\707D3F3B3C333F36376A");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoOoo;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("Cc4F4419091363");
    localStringBuilder.append((String)localObject);
    localObject = this.o00o0000;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("MO637025232577");
    localStringBuilder.append((String)localObject);
    double d = this.o0O00o0;
    localStringBuilder.append(d);
    localObject = m54207b69.F54207b69_11("{|505D12200C46");
    localStringBuilder.append((String)localObject);
    d = this.o00OooOo;
    localStringBuilder.append(d);
    localObject = m54207b69.F54207b69_11("h;171C5A57584E656F4A5159696213");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0O;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("o]717E3C2B383E3E183A3C6A");
    localStringBuilder.append((String)localObject);
    d = this.o00OooO;
    localStringBuilder.append(d);
    localObject = m54207b69.F54207b69_11("o-010E4C5B484E4E6854621A");
    localStringBuilder.append((String)localObject);
    d = this.o00OooO0;
    localStringBuilder.append(d);
    localObject = m54207b69.F54207b69_11("1e4946080F15215E");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("G)050A4C4B6151544D63591E");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo00;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("-<101D4E56596D636209");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooooo;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("Ty555A1F130E121E1E22254E");
    localStringBuilder.append((String)localObject);
    long l = this.o00Ooo0o;
    localStringBuilder.append(l);
    localObject = m54207b69.F54207b69_11("(%0906534F4C451E");
    localStringBuilder.append((String)localObject);
    l = this.o00o000;
    localStringBuilder.append(l);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00o000O;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    localObject = this.o00OooOO;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OoooO;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OoOoo;
    paramParcel.writeString((String)localObject);
    localObject = this.o00o0000;
    paramParcel.writeString((String)localObject);
    double d = this.o0O00o0;
    paramParcel.writeDouble(d);
    d = this.o00OooOo;
    paramParcel.writeDouble(d);
    localObject = this.o00Ooo0O;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    d = this.o00OooO;
    paramParcel.writeDouble(d);
    d = this.o00OooO0;
    paramParcel.writeDouble(d);
    long l = this.o00Ooo0o;
    paramParcel.writeLong(l);
    l = this.o00o000;
    paramParcel.writeLong(l);
    localObject = this.o00Ooo0;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    localObject = this.o00Ooo00;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    String str = this.o00Ooooo;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.Poi
 * JD-Core Version:    0.7.0.1
 */
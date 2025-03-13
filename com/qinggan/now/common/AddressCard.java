package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class AddressCard
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public City o00Ooo0;
  public AddressCategory o00Ooo00;
  public int o00Ooo0O;
  public GeoPoint o00Ooo0o;
  public AddressLabel o00OooO;
  public long o00OooO0;
  public String o00OooOO;
  public float o00OooOo;
  public float o0O00o0;
  
  static
  {
    AddressCard.1 local1 = new com/qinggan/now/common/AddressCard$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAddress()
  {
    return this.o00OoOoo;
  }
  
  public AddressCategory getCategory()
  {
    return this.o00Ooo00;
  }
  
  public City getCity()
  {
    return this.o00Ooo0;
  }
  
  public int getCount()
  {
    return this.o00Ooo0O;
  }
  
  public GeoPoint getGeoPoint()
  {
    return this.o00Ooo0o;
  }
  
  public long getId()
  {
    return this.o00OooO0;
  }
  
  public AddressLabel getLabel()
  {
    return this.o00OooO;
  }
  
  public String getName()
  {
    return this.o00OooOO;
  }
  
  public float getProbability()
  {
    return this.o00OooOo;
  }
  
  public float getStopLen()
  {
    return this.o0O00o0;
  }
  
  public void setAddress(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setCategory(AddressCategory paramAddressCategory)
  {
    this.o00Ooo00 = paramAddressCategory;
  }
  
  public void setCity(City paramCity)
  {
    this.o00Ooo0 = paramCity;
  }
  
  public void setCount(int paramInt)
  {
    this.o00Ooo0O = paramInt;
  }
  
  public void setGeoPoint(GeoPoint paramGeoPoint)
  {
    this.o00Ooo0o = paramGeoPoint;
  }
  
  public void setId(long paramLong)
  {
    this.o00OooO0 = paramLong;
  }
  
  public void setLabel(AddressLabel paramAddressLabel)
  {
    this.o00OooO = paramAddressLabel;
  }
  
  public void setName(String paramString)
  {
    this.o00OooOO = paramString;
  }
  
  public void setProbability(float paramFloat)
  {
    this.o00OooOo = paramFloat;
  }
  
  public void setStopLen(float paramFloat)
  {
    this.o0O00o0 = paramFloat;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("AZ011C40412C442F30214432496C2E424A475072");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooOO;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("><105C5B5650585B59500F");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0o;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11(")%094543445B455C5D27");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoOoo;
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11("?)054B4A6050534C62581C");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo00;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("Pe490A060A040E65");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooO.toString();
    localStringBuilder.append((String)localObject);
    localObject = m54207b69.F54207b69_11(">R7E323F2A402B6E");
    localStringBuilder.append((String)localObject);
    int i = this.o00Ooo0O;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("M'0B55554B5B50485025");
    localStringBuilder.append((String)localObject);
    float f = this.o0O00o0;
    localStringBuilder.append(f);
    localObject = m54207b69.F54207b69_11("%M613E41253331352B292D433F83");
    localStringBuilder.append((String)localObject);
    f = this.o00OooOo;
    localStringBuilder.append(f);
    localObject = m54207b69.F54207b69_11("/519575E445014");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0;
    localStringBuilder.append(localObject);
    localStringBuilder.append("}]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    long l = this.o00OooO0;
    paramParcel.writeLong(l);
    Object localObject = this.o00OooOO;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo0o;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    localObject = this.o00OoOoo;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo00;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    localObject = this.o00OooO;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    int i = this.o00Ooo0O;
    paramParcel.writeInt(i);
    float f = this.o0O00o0;
    paramParcel.writeFloat(f);
    f = this.o00OooOo;
    paramParcel.writeFloat(f);
    localObject = this.o00Ooo0;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.AddressCard
 * JD-Core Version:    0.7.0.1
 */
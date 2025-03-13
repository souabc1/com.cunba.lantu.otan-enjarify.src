package com.qinggan.bluetooth.phone;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m54207b69;

public class ContactIndex
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public int[] o00Ooo0;
  public String o00Ooo00;
  public ArrayList o00Ooo0O;
  public String o00Ooo0o;
  public ArrayList o00OooO0;
  
  static
  {
    ContactIndex.1 local1 = new com/qinggan/bluetooth/phone/ContactIndex$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public ContactIndex() {}
  
  public ContactIndex(Parcel paramParcel)
  {
    Object localObject = paramParcel.readString();
    this.o00OoOoo = ((String)localObject);
    localObject = paramParcel.createStringArrayList();
    this.o00Ooo0O = ((ArrayList)localObject);
    localObject = paramParcel.createIntArray();
    this.o00Ooo0 = ((int[])localObject);
    localObject = paramParcel.readString();
    this.o00Ooo0o = ((String)localObject);
    localObject = paramParcel.readString();
    this.o00Ooo00 = ((String)localObject);
    paramParcel = paramParcel.createStringArrayList();
    this.o00OooO0 = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getFirstChars()
  {
    return this.o00OoOoo;
  }
  
  public String getFirstT9Codes()
  {
    return this.o00Ooo00;
  }
  
  public int[] getPinyinMapCounts()
  {
    return this.o00Ooo0;
  }
  
  public ArrayList getPinyins()
  {
    return this.o00Ooo0O;
  }
  
  public String getT9Code()
  {
    return this.o00Ooo0o;
  }
  
  public ArrayList getT9Codes()
  {
    return this.o00OooO0;
  }
  
  public void setFirstChars(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setFirstT9Codes(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setPinyinMapCounts(int[] paramArrayOfInt)
  {
    this.o00Ooo0 = paramArrayOfInt;
  }
  
  public void setPinyins(ArrayList paramArrayList)
  {
    this.o00Ooo0O = paramArrayList;
  }
  
  public void setT9Code(String paramString)
  {
    this.o00Ooo0o = paramString;
  }
  
  public void setT9Codes(ArrayList paramArrayList)
  {
    this.o00OooO0 = paramArrayList;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    Object localObject1 = m54207b69.F54207b69_11("cu361B1D04181B0743231A1A181A");
    localStringBuilder.<init>((String)localObject1);
    localObject1 = m54207b69.F54207b69_11("YL2A2640423C142A3446487B76");
    localStringBuilder.append((String)localObject1);
    localObject1 = this.o00OoOoo;
    localStringBuilder.append((String)localObject1);
    char c = '\'';
    localStringBuilder.append(c);
    Object localObject2 = m54207b69.F54207b69_11("701C11425C624E5F654B16");
    localStringBuilder.append((String)localObject2);
    localObject2 = this.o00Ooo0O;
    localStringBuilder.append(localObject2);
    localObject2 = m54207b69.F54207b69_11("KU7976273F3F314242203D2F21462D49303679");
    localStringBuilder.append((String)localObject2);
    localObject2 = Arrays.toString(this.o00Ooo0);
    localStringBuilder.append((String)localObject2);
    localObject2 = m54207b69.F54207b69_11("8g4B481561280D09096249");
    localStringBuilder.append((String)localObject2);
    localObject2 = this.o00Ooo0o;
    localStringBuilder.append((String)localObject2);
    localStringBuilder.append(c);
    localObject2 = m54207b69.F54207b69_11(";]717E3D3733332F106C273C44443B6E89");
    localStringBuilder.append((String)localObject2);
    localObject2 = this.o00Ooo00;
    localStringBuilder.append((String)localObject2);
    localStringBuilder.append(c);
    localObject1 = m54207b69.F54207b69_11("yf4A471462290E080A1D64");
    localStringBuilder.append((String)localObject1);
    localObject1 = this.o00OooO0;
    localStringBuilder.append(localObject1);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00OoOoo;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo0O;
    paramParcel.writeStringList((List)localObject);
    localObject = this.o00Ooo0;
    paramParcel.writeIntArray((int[])localObject);
    localObject = this.o00Ooo0o;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo00;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OooO0;
    paramParcel.writeStringList((List)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.bluetooth.phone.ContactIndex
 * JD-Core Version:    0.7.0.1
 */
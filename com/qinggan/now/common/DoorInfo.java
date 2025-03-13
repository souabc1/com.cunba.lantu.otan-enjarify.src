package com.qinggan.now.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class DoorInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public BonnetStatus o00OoOoo;
  public CarDoorStatus o00Ooo0;
  public CarDoorStatus o00Ooo00;
  public LoadSpaceStatus o00Ooo0O;
  public CarDoorStatus o00Ooo0o;
  public CarDoorStatus o00OooO0;
  
  static
  {
    DoorInfo.1 local1 = new com/qinggan/now/common/DoorInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public final boolean OooO00o(CarDoorStatus paramCarDoorStatus)
  {
    CarDoorStatus localCarDoorStatus = CarDoorStatus.o00Ooo0o;
    if (paramCarDoorStatus != localCarDoorStatus)
    {
      localCarDoorStatus = CarDoorStatus.o00Ooo00;
      if (paramCarDoorStatus != localCarDoorStatus)
      {
        localCarDoorStatus = CarDoorStatus.o00Ooo0O;
        if (paramCarDoorStatus != localCarDoorStatus) {
          return false;
        }
      }
    }
    return true;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public BonnetStatus getBonnetDoorStatus()
  {
    return this.o00OoOoo;
  }
  
  public CarDoorStatus getFLDoorStatus()
  {
    return this.o00Ooo00;
  }
  
  public CarDoorStatus getFRDoorStatus()
  {
    return this.o00Ooo0;
  }
  
  public LoadSpaceStatus getLoadSpaceStatus()
  {
    return this.o00Ooo0O;
  }
  
  public int getOpenDoorState()
  {
    CarDoorStatus localCarDoorStatus = this.o00Ooo00;
    boolean bool1 = OooO00o(localCarDoorStatus);
    Object localObject1 = this.o00Ooo0;
    boolean bool2 = OooO00o((CarDoorStatus)localObject1);
    int i;
    if (bool2) {
      bool1 |= true;
    }
    localObject1 = this.o00Ooo0o;
    bool2 = OooO00o((CarDoorStatus)localObject1);
    if (bool2) {
      i |= 0x4;
    }
    localObject1 = this.o00OooO0;
    bool2 = OooO00o((CarDoorStatus)localObject1);
    if (bool2) {
      i |= 0x8;
    }
    localObject1 = this.o00OoOoo;
    Object localObject2 = BonnetStatus.o00Ooo0;
    if (localObject1 == localObject2) {
      i |= 0x10;
    }
    localObject1 = this.o00Ooo0O;
    localObject2 = LoadSpaceStatus.o00Ooo0;
    if (localObject1 == localObject2) {
      i |= 0x20;
    }
    return i;
  }
  
  public CarDoorStatus getRLDoorStatus()
  {
    return this.o00Ooo0o;
  }
  
  public CarDoorStatus getRRDoorStatus()
  {
    return this.o00OooO0;
  }
  
  public void setBonnetDoorStatus(BonnetStatus paramBonnetStatus)
  {
    this.o00OoOoo = paramBonnetStatus;
  }
  
  public void setFLDoorStatus(CarDoorStatus paramCarDoorStatus)
  {
    this.o00Ooo00 = paramCarDoorStatus;
  }
  
  public void setFRDoorStatus(CarDoorStatus paramCarDoorStatus)
  {
    this.o00Ooo0 = paramCarDoorStatus;
  }
  
  public void setLoadSpaceStatus(LoadSpaceStatus paramLoadSpaceStatus)
  {
    this.o00Ooo0O = paramLoadSpaceStatus;
  }
  
  public void setRLDoorStatus(CarDoorStatus paramCarDoorStatus)
  {
    this.o00Ooo0o = paramCarDoorStatus;
  }
  
  public void setRRDoorStatus(CarDoorStatus paramCarDoorStatus)
  {
    this.o00OooO0 = paramCarDoorStatus;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("cJ092C3A11292A3E40721A36111A323347294F3D51534E8D");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo00;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("dQ7D7239061943442A0A2E3A30302F7A");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("}d4845182B2410111D3F190F1B1D2467");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0o;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("5v5A570627361E1F0B2D0B210D0F1259");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooO0;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("401C11546262635B4B7C68694D6F515F5355541F");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoOoo;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("&h4449060A0D11411F1114174628162A2C2B66");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0O;
    localStringBuilder.append(localObject);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00Ooo00;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    localObject = this.o00Ooo0;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    localObject = this.o00Ooo0o;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    localObject = this.o00OooO0;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    localObject = this.o00OoOoo;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    localObject = this.o00Ooo0O;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.now.common.DoorInfo
 * JD-Core Version:    0.7.0.1
 */
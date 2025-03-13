package com.qinggan.airtrip.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SeatRoom
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public static String o00OooOo = "=";
  public static String o0O00o0 = "E";
  public String o00OoOoo;
  public int o00Ooo0;
  public int o00Ooo00;
  public Map o00Ooo0O;
  public List o00Ooo0o;
  public Map o00OooO;
  public List o00OooO0;
  public String o00OooOO;
  
  static
  {
    SeatRoom.1 local1 = new com/qinggan/airtrip/bean/SeatRoom$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public SeatRoom(Parcel paramParcel)
  {
    Object localObject1 = SeatRoom.class.getSimpleName();
    this.o00OoOoo = ((String)localObject1);
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    this.o00OooO = ((Map)localObject1);
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    this.o00Ooo0O = ((Map)localObject1);
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.o00OooO0 = ((List)localObject1);
    int i = 0;
    localObject1 = null;
    this.o00Ooo00 = 0;
    this.o00Ooo0 = 0;
    Object localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    this.o00Ooo0o = ((List)localObject2);
    localObject2 = paramParcel.readString();
    this.o00OoOoo = ((String)localObject2);
    localObject2 = paramParcel.readString();
    this.o00OooOO = ((String)localObject2);
    int j = paramParcel.readInt();
    Object localObject3 = new java/util/HashMap;
    ((HashMap)localObject3).<init>(j);
    this.o00OooO = ((Map)localObject3);
    int k = 0;
    localObject3 = null;
    Object localObject4;
    Object localObject5;
    Map localMap;
    for (;;)
    {
      localObject4 = SeatInfo.class;
      if (k >= j) {
        break;
      }
      localObject5 = paramParcel.readString();
      localObject4 = ((Class)localObject4).getClassLoader();
      localObject4 = (SeatInfo)paramParcel.readParcelable((ClassLoader)localObject4);
      localMap = this.o00OooO;
      localMap.put(localObject5, localObject4);
      k += 1;
    }
    j = paramParcel.readInt();
    localObject3 = new java/util/HashMap;
    ((HashMap)localObject3).<init>(j);
    this.o00Ooo0O = ((Map)localObject3);
    while (i < j)
    {
      localObject3 = Integer.class.getClassLoader();
      localObject3 = (Integer)paramParcel.readValue((ClassLoader)localObject3);
      localObject5 = ((Class)localObject4).getClassLoader();
      localObject5 = (SeatInfo)paramParcel.readParcelable((ClassLoader)localObject5);
      localMap = this.o00Ooo0O;
      localMap.put(localObject3, localObject5);
      i += 1;
    }
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.o00OooO0 = ((List)localObject1);
    localObject2 = ((Class)localObject4).getClassLoader();
    paramParcel.readList((List)localObject1, (ClassLoader)localObject2);
    i = paramParcel.readInt();
    this.o00Ooo00 = i;
    int m = paramParcel.readInt();
    this.o00Ooo0 = m;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getColumns()
  {
    return this.o00Ooo00;
  }
  
  public int getRows()
  {
    return this.o00Ooo0;
  }
  
  public SeatInfo getSeatByItemIndex(int paramInt)
  {
    Map localMap = this.o00Ooo0O;
    Integer localInteger = Integer.valueOf(paramInt);
    return (SeatInfo)localMap.get(localInteger);
  }
  
  public List getSeatInfos()
  {
    return this.o00OooO0;
  }
  
  public int getTotalCount()
  {
    int i = getColumns();
    int j = getRows();
    return i * j;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject1 = this.o00OoOoo;
    paramParcel.writeString((String)localObject1);
    localObject1 = this.o00OooOO;
    paramParcel.writeString((String)localObject1);
    int i = this.o00OooO.size();
    paramParcel.writeInt(i);
    localObject1 = this.o00OooO.entrySet().iterator();
    boolean bool;
    Object localObject2;
    Object localObject3;
    for (;;)
    {
      bool = ((Iterator)localObject1).hasNext();
      if (!bool) {
        break;
      }
      localObject2 = (Map.Entry)((Iterator)localObject1).next();
      localObject3 = (String)((Map.Entry)localObject2).getKey();
      paramParcel.writeString((String)localObject3);
      localObject2 = (Parcelable)((Map.Entry)localObject2).getValue();
      paramParcel.writeParcelable((Parcelable)localObject2, paramInt);
    }
    i = this.o00Ooo0O.size();
    paramParcel.writeInt(i);
    localObject1 = this.o00Ooo0O.entrySet().iterator();
    for (;;)
    {
      bool = ((Iterator)localObject1).hasNext();
      if (!bool) {
        break;
      }
      localObject2 = (Map.Entry)((Iterator)localObject1).next();
      localObject3 = ((Map.Entry)localObject2).getKey();
      paramParcel.writeValue(localObject3);
      localObject2 = (Parcelable)((Map.Entry)localObject2).getValue();
      paramParcel.writeParcelable((Parcelable)localObject2, paramInt);
    }
    List localList = this.o00OooO0;
    paramParcel.writeList(localList);
    paramInt = this.o00Ooo00;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.airtrip.bean.SeatRoom
 * JD-Core Version:    0.7.0.1
 */
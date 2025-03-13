package com.xuexiang.xpage.core;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.xuexiang.xpage.PageConfig;
import com.xuexiang.xpage.enums.CoreAnim;
import m54207b69;

public class CoreSwitchBean
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public int[] o00Ooo0;
  public Bundle o00Ooo00;
  public boolean o00Ooo0O;
  public boolean o00Ooo0o;
  public int o00OooO;
  public String o00OooO0;
  
  static
  {
    CoreSwitchBean.1 local1 = new com/xuexiang/xpage/core/CoreSwitchBean$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public CoreSwitchBean(Parcel paramParcel)
  {
    String str = null;
    this.o00Ooo0 = null;
    int i = 1;
    this.o00Ooo0O = i;
    this.o00Ooo0o = false;
    Object localObject = PageConfig.getContainActivityClassName();
    this.o00OooO0 = ((String)localObject);
    this.o00OooO = -1;
    localObject = paramParcel.readString();
    this.o00OoOoo = ((String)localObject);
    localObject = getClass().getClassLoader();
    localObject = paramParcel.readBundle((ClassLoader)localObject);
    this.o00Ooo00 = ((Bundle)localObject);
    int j = paramParcel.readInt();
    int k = paramParcel.readInt();
    int m = paramParcel.readInt();
    int n = paramParcel.readInt();
    int[] tmp101_99 = new int[4];
    int[] tmp102_101 = tmp101_99;
    int[] tmp102_101 = tmp101_99;
    tmp102_101[0] = j;
    tmp102_101[1] = k;
    tmp102_101[2] = m;
    int[] tmp115_102 = tmp102_101;
    tmp115_102[3] = n;
    localObject = tmp115_102;
    this.o00Ooo0 = ((int[])localObject);
    j = paramParcel.readInt();
    if (j == i)
    {
      j = i;
    }
    else
    {
      j = 0;
      localObject = null;
    }
    this.o00Ooo0O = j;
    j = paramParcel.readInt();
    if (j != i)
    {
      i = 0;
      str = null;
    }
    this.o00Ooo0o = i;
    str = paramParcel.readString();
    this.o00OooO0 = str;
    int i1 = paramParcel.readInt();
    this.o00OooO = i1;
  }
  
  public CoreSwitchBean(String paramString, Bundle paramBundle)
  {
    this.o00Ooo0 = null;
    this.o00Ooo0O = true;
    this.o00Ooo0o = false;
    String str = PageConfig.getContainActivityClassName();
    this.o00OooO0 = str;
    this.o00OooO = -1;
    this.o00OoOoo = paramString;
    this.o00Ooo00 = paramBundle;
  }
  
  public CoreSwitchBean(String paramString, Bundle paramBundle, int[] paramArrayOfInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.o00Ooo0 = null;
    this.o00Ooo0O = true;
    this.o00Ooo0o = false;
    String str = PageConfig.getContainActivityClassName();
    this.o00OooO0 = str;
    this.o00OooO = -1;
    this.o00OoOoo = paramString;
    this.o00Ooo00 = paramBundle;
    this.o00Ooo0 = paramArrayOfInt;
    this.o00Ooo0O = paramBoolean1;
    this.o00Ooo0o = paramBoolean2;
  }
  
  public static int[] OooO00o(CoreAnim paramCoreAnim)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramCoreAnim;
    return (int[])m54207b69.F54207b69_09(1650, arrayOfObject);
  }
  
  public int describeContents()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(1651, arrayOfObject);
  }
  
  public int[] getAnim()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (int[])m54207b69.F54207b69_09(1652, arrayOfObject);
  }
  
  public Bundle getBundle()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Bundle)m54207b69.F54207b69_09(1653, arrayOfObject);
  }
  
  public Class getContainActivityClazz()
  {
    return Class.forName(this.o00OooO0);
  }
  
  public String getPageName()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1655, arrayOfObject);
  }
  
  public int getRequestCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(1656, arrayOfObject);
  }
  
  public boolean isAddToBackStack()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(1657, arrayOfObject);
  }
  
  public boolean isNewActivity()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(1658, arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(1659, arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramParcel;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(1660, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xpage.core.CoreSwitchBean
 * JD-Core Version:    0.7.0.1
 */
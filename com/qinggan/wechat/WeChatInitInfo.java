package com.qinggan.wechat;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;
import m54207b69;

public class WeChatInitInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public List o00OoOoo;
  public UserInfo o00Ooo0;
  public List o00Ooo00;
  
  static
  {
    WeChatInitInfo.1 local1 = new com/qinggan/wechat/WeChatInitInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public WeChatInitInfo() {}
  
  public WeChatInitInfo(Parcel paramParcel)
  {
    OooO00o(paramParcel);
  }
  
  public void OooO00o(Parcel paramParcel)
  {
    Object localObject = UserInfo.class.getClassLoader();
    localObject = (UserInfo)paramParcel.readParcelable((ClassLoader)localObject);
    this.o00Ooo0 = ((UserInfo)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.o00Ooo00 = ((List)localObject);
    Parcelable.Creator localCreator = Contact.CREATOR;
    paramParcel.readTypedList((List)localObject, localCreator);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.o00OoOoo = ((List)localObject);
    paramParcel.readStringList((List)localObject);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public List getChatSet()
  {
    return this.o00OoOoo;
  }
  
  public List getContactList()
  {
    return this.o00Ooo00;
  }
  
  public UserInfo getUserInfo()
  {
    return this.o00Ooo0;
  }
  
  public void setChatSet(List paramList)
  {
    this.o00OoOoo = paramList;
  }
  
  public void setContactList(List paramList)
  {
    this.o00Ooo00 = paramList;
  }
  
  public void setUserInfo(UserInfo paramUserInfo)
  {
    this.o00Ooo0 = paramUserInfo;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("H\\1533372B1937403A2F3239443A2240494372");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("Z41815595E5E455B5E488167524C16");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo00;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("Gv5A5717211B072B1A0A54");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoOoo;
    localStringBuilder.append(localObject);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    UserInfo localUserInfo = this.o00Ooo0;
    paramParcel.writeParcelable(localUserInfo, paramInt);
    List localList = this.o00Ooo00;
    paramParcel.writeTypedList(localList);
    localList = this.o00OoOoo;
    paramParcel.writeStringList(localList);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wechat.WeChatInitInfo
 * JD-Core Version:    0.7.0.1
 */
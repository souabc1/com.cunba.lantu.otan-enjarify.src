package com.qinggan.wechat;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;
import org.json.JSONObject;

public class UserInfo
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo0;
  public String o00Ooo00;
  public int o00Ooo0O;
  public JSONObject o00Ooo0o;
  public String o00OooO0;
  
  static
  {
    UserInfo.1 local1 = new com/qinggan/wechat/UserInfo$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getHeadImgUrl()
  {
    return this.o00OoOoo;
  }
  
  public String getNickName()
  {
    return this.o00Ooo00;
  }
  
  public String getRemarkName()
  {
    return this.o00Ooo0;
  }
  
  public int getSex()
  {
    return this.o00Ooo0O;
  }
  
  public JSONObject getSyncKey()
  {
    return this.o00Ooo0o;
  }
  
  public String getUserName()
  {
    return this.o00OooO0;
  }
  
  public void setHeadImgUrl(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setNickName(String paramString)
  {
    this.o00Ooo00 = paramString;
  }
  
  public void setRemarkName(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setSex(int paramInt)
  {
    this.o00Ooo0O = paramInt;
  }
  
  public void setSyncKey(JSONObject paramJSONObject)
  {
    this.o00Ooo0o = paramJSONObject;
  }
  
  public void setUserName(String paramString)
  {
    this.o00OooO0 = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("$i3C1B0E1E240C150D1A100A150E3416131C6560");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo00;
    localStringBuilder.append((String)localObject);
    char c = '\'';
    localStringBuilder.append(c);
    String str = m54207b69.F54207b69_11("hf4A47151807192E0E130C654C");
    localStringBuilder.append(str);
    str = this.o00OooO0;
    localStringBuilder.append(str);
    localStringBuilder.append(c);
    str = m54207b69.F54207b69_11(">q5D521B17141A3E231E2D0D285863");
    localStringBuilder.append(str);
    str = this.o00OoOoo;
    localStringBuilder.append(str);
    localStringBuilder.append(c);
    str = m54207b69.F54207b69_11("-x54590C20191E101A3E221F28516C");
    localStringBuilder.append(str);
    str = this.o00Ooo0;
    localStringBuilder.append(str);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("XI656A3C2F3579");
    localStringBuilder.append((String)localObject);
    int i = this.o00Ooo0O;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("nC6F64323D31250E2D4287");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0o;
    localStringBuilder.append(localObject);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00Ooo00;
    paramParcel.writeString(str);
    str = this.o00OooO0;
    paramParcel.writeString(str);
    str = this.o00OoOoo;
    paramParcel.writeString(str);
    str = this.o00Ooo0;
    paramParcel.writeString(str);
    paramInt = this.o00Ooo0O;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wechat.UserInfo
 * JD-Core Version:    0.7.0.1
 */
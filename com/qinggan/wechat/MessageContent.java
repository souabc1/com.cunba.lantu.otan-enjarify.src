package com.qinggan.wechat;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class MessageContent
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public String o00Ooo0;
  public boolean o00Ooo00;
  public MsgContentType o00Ooo0O;
  
  static
  {
    MessageContent.1 local1 = new com/qinggan/wechat/MessageContent$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public MessageContent()
  {
    MsgContentType localMsgContentType = MsgContentType.o0O00o0;
    this.o00Ooo0O = localMsgContentType;
  }
  
  public MessageContent(MessageContent paramMessageContent)
  {
    Object localObject = paramMessageContent.o00Ooo0;
    this.o00Ooo0 = ((String)localObject);
    localObject = paramMessageContent.o00Ooo0O;
    this.o00Ooo0O = ((MsgContentType)localObject);
    boolean bool = paramMessageContent.isGroup();
    this.o00Ooo00 = bool;
    paramMessageContent = paramMessageContent.o00OoOoo;
    this.o00OoOoo = paramMessageContent;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getFromUser()
  {
    return this.o00OoOoo;
  }
  
  public String getRawContent()
  {
    return this.o00Ooo0;
  }
  
  public MsgContentType getType()
  {
    return this.o00Ooo0O;
  }
  
  public boolean isGroup()
  {
    return this.o00Ooo00;
  }
  
  public void setFromUser(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setGroup(boolean paramBoolean)
  {
    this.o00Ooo00 = paramBoolean;
  }
  
  public void setRawContent(String paramString)
  {
    this.o00Ooo0 = paramString;
  }
  
  public void setType(MsgContentType paramMsgContentType)
  {
    this.o00Ooo0O = paramMsgContentType;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("1M00294041302F2E152A2C43332F464448444E3A83");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0O;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("wP7C7124342B1845452C3E482F7984");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0;
    localStringBuilder.append((String)localObject);
    char c = '\'';
    localStringBuilder.append(c);
    String str = m54207b69.F54207b69_11("r\\707D37321F333930346A");
    localStringBuilder.append(str);
    boolean bool = this.o00Ooo00;
    localStringBuilder.append(bool);
    str = m54207b69.F54207b69_11("UY757A412E3A39123144346E89");
    localStringBuilder.append(str);
    str = this.o00OoOoo;
    localStringBuilder.append(str);
    localStringBuilder.append(c);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    MsgContentType localMsgContentType = this.o00Ooo0O;
    paramParcel.writeParcelable(localMsgContentType, paramInt);
    String str = this.o00Ooo0;
    paramParcel.writeString(str);
    paramInt = this.o00Ooo00;
    paramParcel.writeInt(paramInt);
    str = this.o00OoOoo;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wechat.MessageContent
 * JD-Core Version:    0.7.0.1
 */
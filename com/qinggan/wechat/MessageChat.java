package com.qinggan.wechat;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class MessageChat
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public int o00OoOoo;
  public long o00Ooo0;
  public MessageContent o00Ooo00;
  public String o00Ooo0O;
  public String o00Ooo0o;
  public String o00OooO;
  public int o00OooO0;
  public int o00OooOO;
  public int o00OooOo;
  public String o00OoooO;
  public String o00Ooooo;
  public String o00o00;
  public String o00o000;
  public MsgType o00o0000;
  public int o00o000O;
  public int o00o000o;
  public int o00o00O0;
  public String o00o00Oo;
  public String o00o00o;
  public String o00o00o0;
  public int o00o00oO;
  public int o0O00o0;
  public int oo00oO;
  
  static
  {
    MessageChat.1 local1 = new com/qinggan/wechat/MessageChat$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public MessageChat() {}
  
  public MessageChat(Parcel paramParcel)
  {
    OooO00o(paramParcel);
  }
  
  public void OooO00o(Parcel paramParcel)
  {
    Object localObject = paramParcel.readString();
    this.o00Ooooo = ((String)localObject);
    localObject = paramParcel.readString();
    this.o00OooO = ((String)localObject);
    localObject = paramParcel.readString();
    this.o00o00o0 = ((String)localObject);
    localObject = MsgType.class.getClassLoader();
    localObject = (MsgType)paramParcel.readParcelable((ClassLoader)localObject);
    this.o00o0000 = ((MsgType)localObject);
    localObject = MessageContent.class.getClassLoader();
    localObject = (MessageContent)paramParcel.readParcelable((ClassLoader)localObject);
    this.o00Ooo00 = ((MessageContent)localObject);
    int i = paramParcel.readInt();
    this.o00o000o = i;
    i = paramParcel.readInt();
    this.o00OooOo = i;
    long l = paramParcel.readLong();
    this.o00Ooo0 = l;
    i = paramParcel.readInt();
    this.o00o00oO = i;
    i = paramParcel.readInt();
    this.o00o000O = i;
    localObject = paramParcel.readString();
    this.o00Ooo0O = ((String)localObject);
    localObject = paramParcel.readString();
    this.o00Ooo0o = ((String)localObject);
    localObject = paramParcel.readString();
    this.o00OoooO = ((String)localObject);
    localObject = paramParcel.readString();
    this.o00o00o = ((String)localObject);
    i = paramParcel.readInt();
    this.o00OoOoo = i;
    i = paramParcel.readInt();
    this.oo00oO = i;
    localObject = paramParcel.readString();
    this.o00o00 = ((String)localObject);
    i = paramParcel.readInt();
    this.o00OooO0 = i;
    localObject = paramParcel.readString();
    this.o00o00Oo = ((String)localObject);
    i = paramParcel.readInt();
    this.o00OooOO = i;
    i = paramParcel.readInt();
    this.o0O00o0 = i;
    i = paramParcel.readInt();
    this.o00o00O0 = i;
    paramParcel = paramParcel.readString();
    this.o00o000 = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getAppMsgType()
  {
    return this.o00OoOoo;
  }
  
  public MessageContent getContent()
  {
    return this.o00Ooo00;
  }
  
  public long getCreateTime()
  {
    return this.o00Ooo0;
  }
  
  public String getFileName()
  {
    return this.o00Ooo0O;
  }
  
  public String getFileSize()
  {
    return this.o00Ooo0o;
  }
  
  public int getForwardFlag()
  {
    return this.o00OooO0;
  }
  
  public String getFromUserName()
  {
    return this.o00OooO;
  }
  
  public int getImgHeight()
  {
    return this.o00OooOO;
  }
  
  public int getImgStatus()
  {
    return this.o00OooOo;
  }
  
  public int getImgWidth()
  {
    return this.o0O00o0;
  }
  
  public String getMediaId()
  {
    return this.o00OoooO;
  }
  
  public String getMsgId()
  {
    return this.o00Ooooo;
  }
  
  public MsgType getMsgType()
  {
    return this.o00o0000;
  }
  
  public String getNewMsgId()
  {
    return this.o00o000;
  }
  
  public int getPlayLength()
  {
    return this.o00o000O;
  }
  
  public int getStatus()
  {
    return this.o00o000o;
  }
  
  public int getStatusNotifyCode()
  {
    return this.oo00oO;
  }
  
  public String getStatusNotifyUserName()
  {
    return this.o00o00;
  }
  
  public int getSubMsgType()
  {
    return this.o00o00O0;
  }
  
  public String getTicket()
  {
    return this.o00o00Oo;
  }
  
  public String getToUserName()
  {
    return this.o00o00o0;
  }
  
  public String getUrl()
  {
    return this.o00o00o;
  }
  
  public int getVoiceLength()
  {
    return this.o00o00oO;
  }
  
  public void setAppMsgType(int paramInt)
  {
    this.o00OoOoo = paramInt;
  }
  
  public void setContent(MessageContent paramMessageContent)
  {
    this.o00Ooo00 = paramMessageContent;
  }
  
  public void setCreateTime(long paramLong)
  {
    this.o00Ooo0 = paramLong;
  }
  
  public void setFileName(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public void setFileSize(String paramString)
  {
    this.o00Ooo0o = paramString;
  }
  
  public void setForwardFlag(int paramInt)
  {
    this.o00OooO0 = paramInt;
  }
  
  public void setFromUserName(String paramString)
  {
    this.o00OooO = paramString;
  }
  
  public void setImgHeight(int paramInt)
  {
    this.o00OooOO = paramInt;
  }
  
  public void setImgStatus(int paramInt)
  {
    this.o00OooOo = paramInt;
  }
  
  public void setImgWidth(int paramInt)
  {
    this.o0O00o0 = paramInt;
  }
  
  public void setMediaId(String paramString)
  {
    this.o00OoooO = paramString;
  }
  
  public void setMsgId(String paramString)
  {
    this.o00Ooooo = paramString;
  }
  
  public void setMsgType(MsgType paramMsgType)
  {
    this.o00o0000 = paramMsgType;
  }
  
  public void setNewMsgId(String paramString)
  {
    this.o00o000 = paramString;
  }
  
  public void setPlayLength(int paramInt)
  {
    this.o00o000O = paramInt;
  }
  
  public void setStatus(int paramInt)
  {
    this.o00o000o = paramInt;
  }
  
  public void setStatusNotifyCode(int paramInt)
  {
    this.oo00oO = paramInt;
  }
  
  public void setStatusNotifyUserName(String paramString)
  {
    this.o00o00 = paramString;
  }
  
  public void setSubMsgType(int paramInt)
  {
    this.o00o00O0 = paramInt;
  }
  
  public void setTicket(String paramString)
  {
    this.o00o00Oo = paramString;
  }
  
  public void setToUserName(String paramString)
  {
    this.o00o00o0 = paramString;
  }
  
  public void setUrl(String paramString)
  {
    this.o00o00o = paramString;
  }
  
  public void setVoiceLength(int paramInt)
  {
    this.o00o00oO = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("\\O022B3E3F322D30132F37453F2E4936153B837A");
    localStringBuilder.append(str);
    str = this.o00Ooooo;
    localStringBuilder.append(str);
    char c = '\'';
    localStringBuilder.append(c);
    Object localObject = m54207b69.F54207b69_11("(,000D4C6147467F6651676C584D561F1A");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OooO;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("Xj464B2008431E151F2C14111A635A");
    localStringBuilder.append((String)localObject);
    localObject = this.o00o00o0;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("R;171C584B60744852660F");
    localStringBuilder.append((String)localObject);
    localObject = this.o00o0000;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("Ek474C0A070924140C275F56");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo00;
    localStringBuilder.append(localObject);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("xg4B4816160A18181B62");
    localStringBuilder.append((String)localObject);
    int i = this.o00o000o;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("]_738038353C1131453333366D");
    localStringBuilder.append((String)localObject);
    i = this.o00OooOo;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("4Y757A3C2E403D334315393E4770");
    localStringBuilder.append((String)localObject);
    long l = this.o00Ooo0;
    localStringBuilder.append(l);
    localObject = m54207b69.F54207b69_11("Ap5C5108221D181B431D27210F245A");
    localStringBuilder.append((String)localObject);
    i = this.o00o00oO;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("nh44491A070D162A140E18260B61");
    localStringBuilder.append((String)localObject);
    i = this.o00o000O;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("~_73803B39373F17453A436C83");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0O;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("N`4C41080C100A3910220E6752");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooo0o;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("{M616E222B2D29320B317974");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoooO;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("=b4E43191312644B");
    localStringBuilder.append((String)localObject);
    localObject = this.o00o00o;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("d&0A0749595A705B487A68604E27");
    localStringBuilder.append((String)localObject);
    i = this.o00OoOoo;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("IK676C3A422E44443F0D2D492D393F16333F3F88");
    localStringBuilder.append((String)localObject);
    i = this.oo00oO;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11(":-010E605C505E5E656B4B634F5761866D5870755F545D2621");
    localStringBuilder.append((String)localObject);
    localObject = this.o00o00;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("[l404D0C062220132510330A18175E");
    localStringBuilder.append((String)localObject);
    i = this.o00OooO0;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("xb4E43180E050E0D1D674E");
    localStringBuilder.append((String)localObject);
    localObject = this.o00o00Oo;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(c);
    localObject = m54207b69.F54207b69_11("Jg4B48100D0434081508181D65");
    localStringBuilder.append((String)localObject);
    i = this.o00OooOO;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("Pq5D521A1F1A2B1E1C0D2256");
    localStringBuilder.append((String)localObject);
    i = this.o0O00o0;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("?[777C2A313D1B2E43172B354972");
    localStringBuilder.append((String)localObject);
    i = this.o00o00O0;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("Zo4350030D1C27220F2E145C53");
    localStringBuilder.append((String)localObject);
    localObject = this.o00o000;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(c);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.o00Ooooo;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OooO;
    paramParcel.writeString((String)localObject);
    localObject = this.o00o00o0;
    paramParcel.writeString((String)localObject);
    localObject = this.o00o0000;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    localObject = this.o00Ooo00;
    paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    paramInt = this.o00o000o;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00OooOo;
    paramParcel.writeInt(paramInt);
    long l = this.o00Ooo0;
    paramParcel.writeLong(l);
    paramInt = this.o00o00oO;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00o000O;
    paramParcel.writeInt(paramInt);
    String str = this.o00Ooo0O;
    paramParcel.writeString(str);
    str = this.o00Ooo0o;
    paramParcel.writeString(str);
    str = this.o00OoooO;
    paramParcel.writeString(str);
    str = this.o00o00o;
    paramParcel.writeString(str);
    paramInt = this.o00OoOoo;
    paramParcel.writeInt(paramInt);
    paramInt = this.oo00oO;
    paramParcel.writeInt(paramInt);
    str = this.o00o00;
    paramParcel.writeString(str);
    paramInt = this.o00OooO0;
    paramParcel.writeInt(paramInt);
    str = this.o00o00Oo;
    paramParcel.writeString(str);
    paramInt = this.o00OooOO;
    paramParcel.writeInt(paramInt);
    paramInt = this.o0O00o0;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00o00O0;
    paramParcel.writeInt(paramInt);
    str = this.o00o000;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wechat.MessageChat
 * JD-Core Version:    0.7.0.1
 */
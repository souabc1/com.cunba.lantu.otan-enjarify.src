package com.qinggan.wechat;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;
import m54207b69;

public class Contact
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo;
  public int o00Ooo0;
  public int o00Ooo00;
  public String o00Ooo0O;
  public int o00Ooo0o;
  public String o00OooO;
  public String o00OooO0;
  public String o00OooOO;
  public String o00OooOo;
  public List o00OoooO;
  public String o00Ooooo;
  public int o00o0;
  public String o00o00;
  public String o00o000;
  public String o00o0000;
  public String o00o000O;
  public String o00o000o;
  public int o00o00O0;
  public String o00o00Oo;
  public int o00o00o;
  public int o00o00o0;
  public int o00o00oO;
  public String o00o00oo;
  public int o0O00o0;
  public String oo00oO;
  
  static
  {
    Contact.1 local1 = new com/qinggan/wechat/Contact$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public Contact() {}
  
  public Contact(Parcel paramParcel)
  {
    OooO00o(paramParcel);
  }
  
  public void OooO00o(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    this.o00o00o = i;
    Object localObject = paramParcel.readString();
    this.o00o00oo = ((String)localObject);
    localObject = paramParcel.readString();
    this.o00Ooooo = ((String)localObject);
    localObject = paramParcel.readString();
    this.o00OooOO = ((String)localObject);
    i = paramParcel.readInt();
    this.o00Ooo0o = i;
    localObject = paramParcel.readString();
    this.o00o000o = ((String)localObject);
    i = paramParcel.readInt();
    this.o00o00O0 = i;
    localObject = paramParcel.readString();
    this.o00o00Oo = ((String)localObject);
    localObject = paramParcel.readString();
    this.o00o000 = ((String)localObject);
    localObject = paramParcel.readString();
    this.o00o000O = ((String)localObject);
    localObject = paramParcel.readString();
    this.oo00oO = ((String)localObject);
    localObject = paramParcel.readString();
    this.o00o00 = ((String)localObject);
    i = paramParcel.readInt();
    this.o00Ooo00 = i;
    localObject = paramParcel.readString();
    this.o00o0000 = ((String)localObject);
    localObject = paramParcel.readString();
    this.o00Ooo0O = ((String)localObject);
    localObject = paramParcel.readString();
    this.o00OoOoo = ((String)localObject);
    i = paramParcel.readInt();
    this.o00o00o0 = i;
    i = paramParcel.readInt();
    this.o00o00oO = i;
    localObject = paramParcel.readString();
    this.o00OooO0 = ((String)localObject);
    i = paramParcel.readInt();
    this.o00Ooo0 = i;
    localObject = paramParcel.readString();
    this.o00OooO = ((String)localObject);
    localObject = paramParcel.readString();
    this.o00OooOo = ((String)localObject);
    i = paramParcel.readInt();
    this.o0O00o0 = i;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.o00OoooO = ((List)localObject);
    Parcelable.Creator localCreator = Member.CREATOR;
    paramParcel.readTypedList((List)localObject, localCreator);
    int j = paramParcel.readInt();
    this.o00o0 = j;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAlias()
  {
    return this.o00OoOoo;
  }
  
  public int getAttrStatus()
  {
    return this.o00Ooo00;
  }
  
  public int getChatRoomId()
  {
    return this.o00Ooo0;
  }
  
  public String getCity()
  {
    return this.o00Ooo0O;
  }
  
  public int getContactFlag()
  {
    return this.o00Ooo0o;
  }
  
  public String getDisplayName()
  {
    return this.o00OooO0;
  }
  
  public String getEncryChatRoomId()
  {
    return this.o00OooO;
  }
  
  public String getHeadImgUrl()
  {
    return this.o00OooOO;
  }
  
  public String getKeyWord()
  {
    return this.o00OooOo;
  }
  
  public int getMemberCount()
  {
    return this.o0O00o0;
  }
  
  public List getMemberList()
  {
    return this.o00OoooO;
  }
  
  public String getNickName()
  {
    return this.o00Ooooo;
  }
  
  public String getPYInitial()
  {
    return this.o00o000;
  }
  
  public String getPYQuanPin()
  {
    return this.o00o000O;
  }
  
  public String getProvince()
  {
    return this.o00o0000;
  }
  
  public String getRemarkName()
  {
    return this.o00o000o;
  }
  
  public String getRemarkPYInitial()
  {
    return this.oo00oO;
  }
  
  public String getRemarkPYQuanPin()
  {
    return this.o00o00;
  }
  
  public int getSex()
  {
    return this.o00o00O0;
  }
  
  public String getSignature()
  {
    return this.o00o00Oo;
  }
  
  public int getSnsFlag()
  {
    return this.o00o00o0;
  }
  
  public int getUin()
  {
    return this.o00o00o;
  }
  
  public int getUniFriend()
  {
    return this.o00o00oO;
  }
  
  public String getUserName()
  {
    return this.o00o00oo;
  }
  
  public int getVerifyFlag()
  {
    return this.o00o0;
  }
  
  public boolean isGroup()
  {
    String str1 = this.o00o00oo;
    if (str1 != null)
    {
      String str2 = "@@";
      int i = str1.indexOf(str2);
      if (i >= 0) {
        return true;
      }
    }
    return false;
  }
  
  public void setAlias(String paramString)
  {
    this.o00OoOoo = paramString;
  }
  
  public void setAttrStatus(int paramInt)
  {
    this.o00Ooo00 = paramInt;
  }
  
  public void setChatRoomId(int paramInt)
  {
    this.o00Ooo0 = paramInt;
  }
  
  public void setCity(String paramString)
  {
    this.o00Ooo0O = paramString;
  }
  
  public void setContactFlag(int paramInt)
  {
    this.o00Ooo0o = paramInt;
  }
  
  public void setDisplayName(String paramString)
  {
    this.o00OooO0 = paramString;
  }
  
  public void setEncryChatRoomId(String paramString)
  {
    this.o00OooO = paramString;
  }
  
  public void setHeadImgUrl(String paramString)
  {
    this.o00OooOO = paramString;
  }
  
  public void setKeyWord(String paramString)
  {
    this.o00OooOo = paramString;
  }
  
  public void setMemberCount(int paramInt)
  {
    this.o0O00o0 = paramInt;
  }
  
  public void setMemberList(List paramList)
  {
    this.o00OoooO = paramList;
  }
  
  public void setNickName(String paramString)
  {
    this.o00Ooooo = paramString;
  }
  
  public void setPYInitial(String paramString)
  {
    this.o00o000 = paramString;
  }
  
  public void setPYQuanPin(String paramString)
  {
    this.o00o000O = paramString;
  }
  
  public void setProvince(String paramString)
  {
    this.o00o0000 = paramString;
  }
  
  public void setRemarkName(String paramString)
  {
    this.o00o000o = paramString;
  }
  
  public void setRemarkPYInitial(String paramString)
  {
    this.oo00oO = paramString;
  }
  
  public void setRemarkPYQuanPin(String paramString)
  {
    this.o00o00 = paramString;
  }
  
  public void setSex(int paramInt)
  {
    this.o00o00O0 = paramInt;
  }
  
  public void setSignature(String paramString)
  {
    this.o00o00Oo = paramString;
  }
  
  public void setSnsFlag(int paramInt)
  {
    this.o00o00o0 = paramInt;
  }
  
  public void setUin(int paramInt)
  {
    this.o00o00o = paramInt;
  }
  
  public void setUniFriend(int paramInt)
  {
    this.o00o00oO = paramInt;
  }
  
  public void setUserName(String paramString)
  {
    this.o00o00oo = paramString;
  }
  
  public void setVerifyFlag(int paramInt)
  {
    this.o00o0 = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("Dv351A1A051B1A08140B282256");
    localStringBuilder.append((String)localObject);
    int i = this.o00o00o;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("[W7B783B4138411F3D423B747B");
    localStringBuilder.append((String)localObject);
    localObject = this.o00Ooooo;
    localStringBuilder.append((String)localObject);
    i = 39;
    localStringBuilder.append(i);
    String str = m54207b69.F54207b69_11("::161B536247725B4F661027");
    localStringBuilder.append(str);
    str = this.o00OooOo;
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("hf4A47151807192E0E130C654C");
    localStringBuilder.append(str);
    str = this.o00o00oo;
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11(">q5D521B17141A3E231E2D0D285863");
    localStringBuilder.append(str);
    str = this.o00OooOO;
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("3g4B48060B0D180C0B1B2A15110C67");
    localStringBuilder.append(str);
    int k = this.o00Ooo0o;
    localStringBuilder.append(k);
    str = m54207b69.F54207b69_11("N^727F2F3A3D3545313335456E85");
    localStringBuilder.append(str);
    str = this.o00o00Oo;
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("-x54590C20191E101A3E221F28516C");
    localStringBuilder.append(str);
    str = this.o00o000o;
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("ln424F201F051D0D0715145D54");
    localStringBuilder.append(str);
    str = this.o00o0000;
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("l41815596044520F1A");
    localStringBuilder.append(str);
    str = this.o00Ooo0O;
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("?q5D5212201C1508535E");
    localStringBuilder.append(str);
    str = this.o00OoOoo;
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("XI656A3C2F3579");
    localStringBuilder.append(str);
    k = this.o00o00O0;
    localStringBuilder.append(k);
    str = m54207b69.F54207b69_11("6o435021192A060C220E170D5D54");
    localStringBuilder.append(str);
    str = this.o00o000;
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("7p5C51020C250A17252822285863");
    localStringBuilder.append(str);
    str = this.o00o000O;
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("/l404D200C0512240E443E2F0D1125131C10625D");
    localStringBuilder.append(str);
    str = this.oo00oO;
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("@m414E210B0411250D453D462318104B1313615C");
    localStringBuilder.append(str);
    str = this.o00o00;
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("=31F14544A4B46664E5A50504B1A");
    localStringBuilder.append(str);
    k = this.o00Ooo00;
    localStringBuilder.append(k);
    str = m54207b69.F54207b69_11("yS7F742240241A45393C77");
    localStringBuilder.append(str);
    k = this.o00o00o0;
    localStringBuilder.append(k);
    str = m54207b69.F54207b69_11("bT7875233D41172C4439433A74");
    localStringBuilder.append(str);
    k = this.o00o00oO;
    localStringBuilder.append(k);
    str = m54207b69.F54207b69_11("\\21E13585E4547645A53855D6A631C23");
    localStringBuilder.append(str);
    str = this.o00OooO0;
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("/g4B4806120A183B0F1013380E66");
    localStringBuilder.append(str);
    k = this.o00Ooo0;
    localStringBuilder.append(k);
    str = m54207b69.F54207b69_11("~814195F595F4F478258625675636463806C1631");
    localStringBuilder.append(str);
    str = this.o00OooO;
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("fH64692730292F3341133047314882");
    localStringBuilder.append((String)localObject);
    int j = this.o0O00o0;
    localStringBuilder.append(j);
    localObject = m54207b69.F54207b69_11("aU79763A333C3C362E2145302C74");
    localStringBuilder.append((String)localObject);
    localObject = this.o00OoooO;
    localStringBuilder.append(localObject);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = this.o00o00o;
    paramParcel.writeInt(paramInt);
    Object localObject = this.o00o00oo;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooooo;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OooOO;
    paramParcel.writeString((String)localObject);
    paramInt = this.o00Ooo0o;
    paramParcel.writeInt(paramInt);
    localObject = this.o00o000o;
    paramParcel.writeString((String)localObject);
    paramInt = this.o00o00O0;
    paramParcel.writeInt(paramInt);
    localObject = this.o00o00Oo;
    paramParcel.writeString((String)localObject);
    localObject = this.o00o000;
    paramParcel.writeString((String)localObject);
    localObject = this.o00o000O;
    paramParcel.writeString((String)localObject);
    localObject = this.oo00oO;
    paramParcel.writeString((String)localObject);
    localObject = this.o00o00;
    paramParcel.writeString((String)localObject);
    paramInt = this.o00Ooo00;
    paramParcel.writeInt(paramInt);
    localObject = this.o00o0000;
    paramParcel.writeString((String)localObject);
    localObject = this.o00Ooo0O;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OoOoo;
    paramParcel.writeString((String)localObject);
    paramInt = this.o00o00o0;
    paramParcel.writeInt(paramInt);
    paramInt = this.o00o00oO;
    paramParcel.writeInt(paramInt);
    localObject = this.o00OooO0;
    paramParcel.writeString((String)localObject);
    paramInt = this.o00Ooo0;
    paramParcel.writeInt(paramInt);
    localObject = this.o00OooO;
    paramParcel.writeString((String)localObject);
    localObject = this.o00OooOo;
    paramParcel.writeString((String)localObject);
    paramInt = this.o0O00o0;
    paramParcel.writeInt(paramInt);
    localObject = this.o00OoooO;
    paramParcel.writeTypedList((List)localObject);
    paramInt = this.o00o0;
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.wechat.Contact
 * JD-Core Version:    0.7.0.1
 */
package com.qinggan.ota;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import m54207b69;

public class OTAVersion
  implements Parcelable, Comparable
{
  public static final Parcelable.Creator CREATOR;
  public String o00OoOoo = null;
  public String o00Ooo00 = null;
  
  static
  {
    OTAVersion.1 local1 = new com/qinggan/ota/OTAVersion$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public int OooO0OO(OTAVersion paramOTAVersion)
  {
    String str1 = this.o00Ooo00;
    String str2 = paramOTAVersion.o00Ooo00;
    int i = OooO0Oo(str1, str2);
    if (i == 0)
    {
      str1 = this.o00OoOoo;
      paramOTAVersion = paramOTAVersion.o00OoOoo;
      i = OooO0Oo(str1, paramOTAVersion);
    }
    return i;
  }
  
  public final int OooO0Oo(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString2 != null))
    {
      paramString1 = paramString1.trim();
      String str1 = "\\.";
      paramString1 = paramString1.split(str1);
      paramString2 = paramString2.trim().split(str1);
      int i = 0;
      str1 = null;
      for (;;)
      {
        int j = paramString1.length;
        if (i >= j) {
          break;
        }
        j = paramString2.length;
        if (i >= j) {
          break;
        }
        try
        {
          str2 = paramString1[i];
          long l1 = OooO0o0(str2);
          String str3 = paramString2[i];
          long l2 = OooO0o0(str3);
          boolean bool = l1 < l2;
          if (bool) {
            return -1;
          }
          if (bool) {
            return 1;
          }
        }
        catch (NumberFormatException localNumberFormatException)
        {
          String str2 = paramString1[i];
          String str4 = paramString2[i];
          int k = str2.compareToIgnoreCase(str4);
          if (k != 0) {
            return k;
          }
          i += 1;
        }
      }
    }
    return 0;
  }
  
  public final long OooO0o0(String paramString)
  {
    if (paramString != null)
    {
      boolean bool = paramString.isEmpty();
      if (!bool)
      {
        String str1 = paramString.toLowerCase();
        String str2 = "rc";
        bool = str1.startsWith(str2);
        if (bool)
        {
          paramString = paramString.toLowerCase();
          str1 = "";
          paramString = paramString.replace(str2, str1);
        }
        l = Long.parseLong(paramString);
        break label61;
      }
    }
    long l = 0L;
    label61:
    return l;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("Tf2933293307191B161111501622206A55");
    localStringBuilder.append(str);
    str = this.o00Ooo00;
    localStringBuilder.append(str);
    str = m54207b69.F54207b69_11("A81419575E51071E");
    localStringBuilder.append(str);
    str = this.o00OoOoo;
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    String str = this.o00Ooo00;
    paramParcel.writeString(str);
    str = this.o00OoOoo;
    paramParcel.writeString(str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.ota.OTAVersion
 * JD-Core Version:    0.7.0.1
 */
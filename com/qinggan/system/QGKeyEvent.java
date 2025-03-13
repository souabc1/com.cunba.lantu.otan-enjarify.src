package com.qinggan.system;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.KeyEvent;
import java.lang.reflect.Field;
import m54207b69;

public class QGKeyEvent
  extends KeyEvent
{
  public static final Parcelable.Creator CREATOR;
  public Bundle o00OoOoo;
  public int o00Ooo00;
  
  static
  {
    QGKeyEvent.1 local1 = new com/qinggan/system/QGKeyEvent$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public QGKeyEvent(int paramInt1, int paramInt2, int paramInt3, Bundle paramBundle)
  {
    super(paramInt2, paramInt1);
    this.o00OoOoo = paramBundle;
    this.o00Ooo00 = paramInt3;
  }
  
  public static QGKeyEvent OooO00o(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    int j = paramParcel.readInt();
    Bundle localBundle = paramParcel.readBundle();
    QGKeyEvent localQGKeyEvent = new com/qinggan/system/QGKeyEvent;
    int k = paramParcel.readInt();
    localQGKeyEvent.<init>(i, j, k, localBundle);
    return localQGKeyEvent;
  }
  
  public static String OooO0OO(int paramInt)
  {
    if (paramInt != 0)
    {
      int i = 4096;
      if (paramInt != i)
      {
        i = 8192;
        if (paramInt != i)
        {
          i = 16384;
          if (paramInt != i)
          {
            i = 32768;
            if (paramInt != i)
            {
              i = 65536;
              if (paramInt != i)
              {
                i = 131072;
                if (paramInt != i)
                {
                  i = 262144;
                  if (paramInt != i)
                  {
                    i = 524288;
                    if (paramInt != i) {
                      return m54207b69.F54207b69_11("*U1417031F1E201007232725250E28");
                    }
                    return m54207b69.F54207b69_11("c@0104160C131325131717112A1F211D1F");
                  }
                  return m54207b69.F54207b69_11("/p3134263C4343353F47453E3A2F314D2F");
                }
                return m54207b69.F54207b69_11("+07174667C8383757B876E7C8781");
              }
              return m54207b69.F54207b69_11("}H090C1E040B0B1D2420");
            }
            return m54207b69.F54207b69_11("$V171604221D1D0F2121211B");
          }
          return m54207b69.F54207b69_11("3h292C3E242B2B3D272F2D36");
        }
        return m54207b69.F54207b69_11("^6777664827D7D6F6C86826E6D");
      }
      return m54207b69.F54207b69_11(".T151802201F1F1117230C24");
    }
    return m54207b69.F54207b69_11("Z+6A698165686A7A6C6C6E78");
  }
  
  public static String OooO0Oo(int paramInt)
  {
    Object localObject = QGKeyEvent.class;
    Field[] arrayOfField = ((Class)localObject).getDeclaredFields();
    int i = arrayOfField.length;
    int j = 0;
    String str1;
    for (;;)
    {
      str1 = m54207b69.F54207b69_11("7j2406061239");
      if (j < i)
      {
        Field localField = arrayOfField[j];
        try
        {
          String str2 = localField.getName();
          String str3 = "j_141B081F14202007";
          str3 = m54207b69.F54207b69_11(str3);
          boolean bool = str2.startsWith(str3);
          if (bool)
          {
            int k = localField.getInt(localObject);
            if (k == paramInt) {
              return localField.getName();
            }
          }
          j += 1;
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
        }
      }
    }
    for (;;)
    {
      ((StringBuilder)localObject).append(str1);
      ((StringBuilder)localObject).append(paramInt);
      return ((StringBuilder)localObject).toString();
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
    }
  }
  
  public static boolean isDirectionKey(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    return true;
  }
  
  public static boolean isPhoneKey(int paramInt)
  {
    int i = 128;
    if (paramInt != i)
    {
      i = 129;
      if (paramInt != i)
      {
        i = 176;
        if (paramInt != i)
        {
          i = 179;
          if (paramInt != i) {
            return false;
          }
        }
      }
    }
    return true;
  }
  
  public static boolean isQGMediaKey(int paramInt)
  {
    int i = 3;
    if (paramInt != i)
    {
      i = 4;
      if (paramInt != i)
      {
        i = 13;
        if (paramInt != i)
        {
          i = 14;
          if (paramInt != i) {
            switch (paramInt)
            {
            default: 
              switch (paramInt)
              {
              default: 
                switch (paramInt)
                {
                default: 
                  return false;
                }
                break;
              }
              break;
            }
          }
        }
      }
    }
    return true;
  }
  
  public Bundle getData()
  {
    return this.o00OoOoo;
  }
  
  public int getKeyDisplayId()
  {
    return this.o00Ooo00;
  }
  
  public void setData(Bundle paramBundle)
  {
    this.o00OoOoo = paramBundle;
  }
  
  public void setKeyDisplayId(int paramInt)
  {
    this.o00Ooo00 = paramInt;
  }
  
  public String toString()
  {
    int i = getKeyCode();
    Object localObject1 = OooO0Oo(i);
    int j = getAction();
    String str1 = OooO0OO(j);
    Object localObject2 = this.o00OoOoo;
    if (localObject2 == null) {
      localObject2 = "";
    } else {
      localObject2 = ((Bundle)localObject2).toString();
    }
    String str2 = m54207b69.F54207b69_11("'R113E383A6C7C27861B3A304649497686319028463A487E");
    Object[] tmp57_54 = new Object[3];
    Object[] tmp58_57 = tmp57_54;
    Object[] tmp58_57 = tmp57_54;
    tmp58_57[0] = localObject1;
    tmp58_57[1] = str1;
    tmp58_57[2] = localObject2;
    localObject1 = tmp58_57;
    return String.format(str2, (Object[])localObject1);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = getKeyCode();
    paramParcel.writeInt(paramInt);
    paramInt = getAction();
    paramParcel.writeInt(paramInt);
    Bundle localBundle = this.o00OoOoo;
    paramParcel.writeBundle(localBundle);
    paramInt = getKeyDisplayId();
    paramParcel.writeInt(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.QGKeyEvent
 * JD-Core Version:    0.7.0.1
 */
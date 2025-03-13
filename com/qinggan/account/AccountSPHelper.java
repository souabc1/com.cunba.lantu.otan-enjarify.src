package com.qinggan.account;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import m54207b69;

public class AccountSPHelper
{
  public static Context OooO00o;
  
  public static void OooO00o()
  {
    Object localObject = OooO00o;
    if (localObject != null) {
      return;
    }
    localObject = new java/lang/IllegalStateException;
    String str = m54207b69.F54207b69_11("Vy1A171910200613601921146423231B682B2D2E2A6D252D2725293230383A");
    ((IllegalStateException)localObject).<init>(str);
    throw ((Throwable)localObject);
  }
  
  public static Map getAll()
  {
    OooO00o();
    Object localObject1 = OooO00o.getContentResolver();
    Object localObject2 = Uri.parse(m54207b69.F54207b69_11("-@2330303729333A8177782D3A397B3F383E3839344283373A3B484F49508B514F48464E534957954E4D5D494C5859"));
    int i = 0;
    String str1 = null;
    int j = 0;
    String str2 = null;
    boolean bool1 = false;
    String str3 = null;
    int k = 0;
    float f = 0.0F;
    Object localObject3 = null;
    Cursor localCursor = ((ContentResolver)localObject1).query((Uri)localObject2, null, null, null, null);
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    if (localCursor != null)
    {
      boolean bool3 = localCursor.moveToFirst();
      if (bool3)
      {
        localObject2 = m54207b69.F54207b69_11("c*49605A5C495D7B4B535059");
        int m = localCursor.getColumnIndex((String)localObject2);
        str1 = m54207b69.F54207b69_11("9`031614161317451B21190F");
        i = localCursor.getColumnIndex(str1);
        str2 = m54207b69.F54207b69_11("DL2F3A40422743194135294334");
        j = localCursor.getColumnIndex(str2);
        do
        {
          str3 = localCursor.getString(m);
          localObject3 = localCursor.getString(i);
          String str4 = m54207b69.F54207b69_11("MR2127223E403A");
          boolean bool4 = ((String)localObject3).equalsIgnoreCase(str4);
          if (bool4)
          {
            localObject3 = localCursor.getString(j);
            str4 = m54207b69.F54207b69_11("c'7879666B6E6F6C7F80");
            boolean bool5 = ((String)localObject3).contains(str4);
            if (bool5)
            {
              String str5 = m54207b69.F54207b69_11("866A6E1A1F6E70");
              bool5 = ((String)localObject3).matches(str5);
              if (bool5)
              {
                int n = ((String)localObject3).length();
                int i1 = 1;
                n -= i1;
                localObject3 = ((String)localObject3).substring(i1, n);
                str5 = ", ";
                localObject3 = ((String)localObject3).split(str5);
                HashSet localHashSet = new java/util/HashSet;
                localHashSet.<init>();
                int i2 = localObject3.length;
                int i3 = 0;
                while (i3 < i2)
                {
                  String str6 = localObject3[i3].replace(str4, str5);
                  localHashSet.add(str6);
                  i3 += 1;
                }
                localObject3 = localHashSet;
              }
            }
          }
          else
          {
            str4 = m54207b69.F54207b69_11("`M2F2324242C3129");
            bool4 = ((String)localObject3).equalsIgnoreCase(str4);
            if (bool4) {}
            do
            {
              localObject3 = localCursor.getString(j);
              break;
              str4 = "int";
              bool4 = ((String)localObject3).equalsIgnoreCase(str4);
              if (bool4)
              {
                k = localCursor.getInt(j);
                localObject3 = Integer.valueOf(k);
                break;
              }
              str4 = m54207b69.F54207b69_11("x^3232323C");
              bool4 = ((String)localObject3).equalsIgnoreCase(str4);
              if (bool4)
              {
                long l = localCursor.getLong(j);
                localObject3 = Long.valueOf(l);
                break;
              }
              str4 = m54207b69.F54207b69_11(".o090402111F");
              bool4 = ((String)localObject3).equalsIgnoreCase(str4);
              if (bool4)
              {
                f = localCursor.getFloat(j);
                localObject3 = Float.valueOf(f);
                break;
              }
              str4 = m54207b69.F54207b69_11("KX2B2D2C343A440D324535");
              bool2 = ((String)localObject3).equalsIgnoreCase(str4);
            } while (bool2);
            boolean bool2 = false;
            f = 0.0F;
            localObject3 = null;
          }
          ((HashMap)localObject1).put(str3, localObject3);
          bool1 = localCursor.moveToNext();
        } while (bool1);
        localCursor.close();
      }
    }
    return localObject1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.account.AccountSPHelper
 * JD-Core Version:    0.7.0.1
 */
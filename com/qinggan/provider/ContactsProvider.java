package com.qinggan.provider;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MatrixCursor.RowBuilder;
import android.net.Uri;
import com.qinggan.bluetooth.bean.BTCallLogItem;
import com.qinggan.bluetooth.bean.BTContactItem;
import com.qinggan.bluetooth.bean.BTPhoneNumber;
import java.util.List;
import m54207b69;

public class ContactsProvider
  extends ContentProvider
{
  public static final UriMatcher o00OoOoo;
  
  static
  {
    UriMatcher localUriMatcher = new android/content/UriMatcher;
    localUriMatcher.<init>(-1);
    o00OoOoo = localUriMatcher;
    String str1 = m54207b69.F54207b69_11("wP3340402735382A");
    String str2 = m54207b69.F54207b69_11("Me060B0A4E181111090A0D155613161E0F211B1C24212A23212319");
    localUriMatcher.addURI(str2, str1, 1);
    str1 = m54207b69.F54207b69_11("*H2B2A2627282C35");
    localUriMatcher.addURI(str2, str1, 2);
  }
  
  public int bulkInsert(Uri paramUri, ContentValues[] paramArrayOfContentValues)
  {
    return 0;
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
  
  public String getType(Uri paramUri)
  {
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }
  
  public boolean onCreate()
  {
    return true;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    paramArrayOfString1 = new java/lang/StringBuilder;
    paramArrayOfString1.<init>();
    paramString2 = m54207b69.F54207b69_11("r.5F5C4D5F5B1914");
    paramArrayOfString1.append(paramString2);
    paramArrayOfString1.append(paramUri);
    paramArrayOfString1.append(", ");
    paramArrayOfString1.append(paramString1);
    paramArrayOfString1 = o00OoOoo;
    int i = paramArrayOfString1.match(paramUri);
    int j = 1;
    paramString2 = m54207b69.F54207b69_11("0759435C58564A");
    Object localObject1 = m54207b69.F54207b69_11("NI2729262F");
    int n = 0;
    Object localObject2 = null;
    label186:
    int i1;
    int i2;
    Object localObject3;
    Object localObject4;
    if (i == j)
    {
      paramUri = QGBluetoothPhoneStore.OooO0O0;
      if (paramUri != null)
      {
        paramUri = new android/database/MatrixCursor;
        paramArrayOfString1 = new String[] { localObject1, paramString2 };
        paramUri.<init>(paramArrayOfString1);
        if ((paramString1 != null) && (paramArrayOfString2 != null))
        {
          j = paramArrayOfString2.length;
          if (j > 0)
          {
            bool1 = paramString1.contains((CharSequence)localObject1);
            if (bool1)
            {
              localObject2 = paramArrayOfString2[0];
              bool1 = false;
              paramArrayOfString1 = null;
              break label186;
            }
            bool1 = paramString1.contains(paramString2);
            if (bool1)
            {
              paramArrayOfString1 = paramArrayOfString2[0];
              break label186;
            }
          }
        }
        boolean bool1 = false;
        paramArrayOfString1 = null;
        i1 = 0;
        paramString1 = null;
        for (;;)
        {
          paramArrayOfString2 = QGBluetoothPhoneStore.OooO0O0;
          i2 = paramArrayOfString2.size();
          if (i1 >= i2) {
            break;
          }
          paramArrayOfString2 = (BTContactItem)QGBluetoothPhoneStore.OooO0O0.get(i1);
          int i3;
          if (localObject2 != null)
          {
            paramString2 = paramArrayOfString2.OooO00o;
            i3 = ((String)localObject2).equals(paramString2);
            if (i3 == 0) {}
          }
          else
          {
            i3 = 0;
            paramString2 = null;
            for (;;)
            {
              localObject1 = paramArrayOfString2.OooO0O0;
              int i6 = ((List)localObject1).size();
              if (i3 >= i6) {
                break;
              }
              localObject1 = ((BTPhoneNumber)paramArrayOfString2.OooO0O0.get(i3)).OooO00o;
              if (paramArrayOfString1 != null)
              {
                boolean bool5 = paramArrayOfString1.equals(localObject1);
                if (!bool5) {}
              }
              else
              {
                localObject3 = paramUri.newRow();
                localObject4 = paramArrayOfString2.OooO00o;
                localObject3 = ((MatrixCursor.RowBuilder)localObject3).add(localObject4);
                ((MatrixCursor.RowBuilder)localObject3).add(localObject1);
              }
              int i4;
              i3 += 1;
            }
          }
          i1 += 1;
        }
        localObject2 = paramUri;
      }
    }
    else
    {
      int k = 2;
      if (i == k)
      {
        paramUri = QGBluetoothPhoneStore.OooO00o;
        if (paramUri != null)
        {
          paramUri = new android/database/MatrixCursor;
          paramArrayOfString1 = m54207b69.F54207b69_11("NS273B4039");
          localObject3 = m54207b69.F54207b69_11("J)5D515B4F");
          String[] tmp412_409 = new String[4];
          String[] tmp413_412 = tmp412_409;
          String[] tmp413_412 = tmp412_409;
          tmp413_412[0] = localObject1;
          tmp413_412[1] = paramString2;
          tmp413_412[2] = paramArrayOfString1;
          String[] tmp425_413 = tmp413_412;
          tmp425_413[3] = localObject3;
          localObject4 = tmp425_413;
          paramUri.<init>((String[])localObject4);
          int i8 = -1;
          boolean bool4;
          if ((paramString1 != null) && (paramArrayOfString2 != null))
          {
            int i9 = paramArrayOfString2.length;
            if (i9 > 0)
            {
              bool4 = paramString1.contains((CharSequence)localObject1);
              if (bool4)
              {
                paramArrayOfString1 = paramArrayOfString2[0];
                i1 = 0;
                paramString1 = null;
                i2 = 0;
                paramArrayOfString2 = null;
                localObject2 = paramArrayOfString1;
                break label606;
              }
              boolean bool3 = paramString1.contains(paramString2);
              if (bool3)
              {
                paramArrayOfString1 = paramArrayOfString2[0];
                paramString1 = paramArrayOfString1;
                i2 = 0;
                paramArrayOfString2 = null;
                break label606;
              }
              boolean bool2 = paramString1.contains(paramArrayOfString1);
              if (bool2)
              {
                paramArrayOfString1 = paramArrayOfString2[0];
                paramArrayOfString2 = paramArrayOfString1;
                i1 = 0;
                paramString1 = null;
                break label606;
              }
              bool2 = paramString1.contains((CharSequence)localObject3);
              if (bool2) {
                try
                {
                  paramArrayOfString1 = paramArrayOfString2[0];
                  m = Integer.parseInt(paramArrayOfString1);
                  i1 = 0;
                  paramString1 = null;
                  i2 = 0;
                  paramArrayOfString2 = null;
                }
                catch (NumberFormatException paramArrayOfString1)
                {
                  paramArrayOfString1.printStackTrace();
                }
              }
            }
          }
          i1 = 0;
          paramString1 = null;
          i2 = 0;
          paramArrayOfString2 = null;
          label606:
          int m = i8;
          for (;;)
          {
            paramString2 = QGBluetoothPhoneStore.OooO00o;
            int i5 = paramString2.size();
            if (n >= i5) {
              break;
            }
            paramString2 = (BTCallLogItem)QGBluetoothPhoneStore.OooO00o.get(n);
            if (localObject2 != null)
            {
              localObject1 = paramString2.OooO00o;
              bool4 = ((String)localObject2).equals(localObject1);
              if (!bool4) {}
            }
            else if (paramString1 != null)
            {
              localObject1 = paramString2.OooO0O0;
              bool4 = paramString1.equals(localObject1);
              if (!bool4) {}
            }
            else if (paramArrayOfString2 != null)
            {
              localObject1 = paramString2.OooO0OO;
              bool4 = paramArrayOfString2.equals(localObject1);
              if (!bool4) {}
            }
            else if (m != i8)
            {
              int i7 = paramString2.OooO0Oo;
              if (m != i7) {}
            }
            else
            {
              localObject1 = paramUri.newRow();
              localObject3 = paramString2.OooO00o;
              localObject1 = ((MatrixCursor.RowBuilder)localObject1).add(localObject3);
              localObject3 = paramString2.OooO0O0;
              localObject1 = ((MatrixCursor.RowBuilder)localObject1).add(localObject3);
              localObject3 = paramString2.OooO0OO;
              localObject1 = ((MatrixCursor.RowBuilder)localObject1).add(localObject3);
              i5 = paramString2.OooO0Oo;
              paramString2 = Integer.valueOf(i5);
              ((MatrixCursor.RowBuilder)localObject1).add(paramString2);
            }
            n += 1;
          }
        }
      }
    }
    return localObject2;
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    paramContentValues = new java/lang/StringBuilder;
    paramContentValues.<init>();
    paramArrayOfString = m54207b69.F54207b69_11("g(5D594E4C6052180F");
    paramContentValues.append(paramArrayOfString);
    paramContentValues.append(paramUri);
    paramContentValues.append(", ");
    paramContentValues.append(paramString);
    getContext().getContentResolver().notifyChange(paramUri, null);
    return 0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.provider.ContactsProvider
 * JD-Core Version:    0.7.0.1
 */
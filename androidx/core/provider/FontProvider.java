package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.CancellationSignal;
import androidx.core.content.res.FontResourcesParserCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class FontProvider
{
  public static final Comparator OooO00o;
  
  static
  {
    OooO00o localOooO00o = new androidx/core/provider/OooO00o;
    localOooO00o.<init>();
    OooO00o = localOooO00o;
  }
  
  public static List OooO0O0(Signature[] paramArrayOfSignature)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = paramArrayOfSignature.length;
    int j = 0;
    while (j < i)
    {
      byte[] arrayOfByte = paramArrayOfSignature[j].toByteArray();
      localArrayList.add(arrayOfByte);
      j += 1;
    }
    return localArrayList;
  }
  
  public static boolean OooO0OO(List paramList1, List paramList2)
  {
    int i = paramList1.size();
    int j = paramList2.size();
    if (i != j) {
      return false;
    }
    i = 0;
    for (;;)
    {
      j = paramList1.size();
      if (i >= j) {
        break;
      }
      byte[] arrayOfByte1 = (byte[])paramList1.get(i);
      byte[] arrayOfByte2 = (byte[])paramList2.get(i);
      boolean bool = Arrays.equals(arrayOfByte1, arrayOfByte2);
      if (!bool) {
        return false;
      }
      i += 1;
    }
    return true;
  }
  
  public static List OooO0Oo(FontRequest paramFontRequest, Resources paramResources)
  {
    List localList = paramFontRequest.getCertificates();
    if (localList != null) {
      return paramFontRequest.getCertificates();
    }
    int i = paramFontRequest.getCertificatesArrayResId();
    return FontResourcesParserCompat.OooO0OO(paramResources, i);
  }
  
  public static ProviderInfo OooO0o(PackageManager paramPackageManager, FontRequest paramFontRequest, Resources paramResources)
  {
    Object localObject = paramFontRequest.getProviderAuthority();
    int i = 0;
    ProviderInfo localProviderInfo = paramPackageManager.resolveContentProvider((String)localObject, 0);
    if (localProviderInfo != null)
    {
      String str1 = localProviderInfo.packageName;
      String str2 = paramFontRequest.getProviderPackage();
      boolean bool1 = str1.equals(str2);
      if (bool1)
      {
        localObject = localProviderInfo.packageName;
        int j = 64;
        paramPackageManager = OooO0O0(paramPackageManager.getPackageInfo((String)localObject, j).signatures);
        localObject = OooO00o;
        Collections.sort(paramPackageManager, (Comparator)localObject);
        paramFontRequest = OooO0Oo(paramFontRequest, paramResources);
        for (;;)
        {
          int k = paramFontRequest.size();
          if (i >= k) {
            break;
          }
          paramResources = new java/util/ArrayList;
          localObject = (Collection)paramFontRequest.get(i);
          paramResources.<init>((Collection)localObject);
          localObject = OooO00o;
          Collections.sort(paramResources, (Comparator)localObject);
          boolean bool2 = OooO0OO(paramPackageManager, paramResources);
          if (bool2) {
            return localProviderInfo;
          }
          i += 1;
        }
        return null;
      }
      paramPackageManager = new android/content/pm/PackageManager$NameNotFoundException;
      paramResources = new java/lang/StringBuilder;
      paramResources.<init>();
      paramResources.append("Found content provider ");
      paramResources.append((String)localObject);
      paramResources.append(", but package was not ");
      paramFontRequest = paramFontRequest.getProviderPackage();
      paramResources.append(paramFontRequest);
      paramFontRequest = paramResources.toString();
      paramPackageManager.<init>(paramFontRequest);
      throw paramPackageManager;
    }
    paramPackageManager = new android/content/pm/PackageManager$NameNotFoundException;
    paramFontRequest = new java/lang/StringBuilder;
    paramFontRequest.<init>();
    paramFontRequest.append("No package found for authority: ");
    paramFontRequest.append((String)localObject);
    paramFontRequest = paramFontRequest.toString();
    paramPackageManager.<init>(paramFontRequest);
    throw paramPackageManager;
  }
  
  public static FontsContractCompat.FontFamilyResult OooO0o0(Context paramContext, FontRequest paramFontRequest, CancellationSignal paramCancellationSignal)
  {
    Object localObject = paramContext.getPackageManager();
    Resources localResources = paramContext.getResources();
    localObject = OooO0o((PackageManager)localObject, paramFontRequest, localResources);
    if (localObject == null) {
      return FontsContractCompat.FontFamilyResult.OooO00o(1, null);
    }
    localObject = ((ProviderInfo)localObject).authority;
    paramContext = OooO0oo(paramContext, paramFontRequest, (String)localObject, paramCancellationSignal);
    return FontsContractCompat.FontFamilyResult.OooO00o(0, paramContext);
  }
  
  public static FontsContractCompat.FontInfo[] OooO0oo(Context paramContext, FontRequest paramFontRequest, String paramString, CancellationSignal paramCancellationSignal)
  {
    Object localObject1 = paramString;
    String str1 = "result_code";
    String str2 = "font_italic";
    String str3 = "font_weight";
    String str4 = "font_ttc_index";
    String str5 = "file_id";
    String str6 = "_id";
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject4 = new android/net/Uri$Builder;
    ((Uri.Builder)localObject4).<init>();
    String str7 = "content";
    localObject4 = ((Uri.Builder)localObject4).scheme(str7).authority(paramString).build();
    Object localObject5 = new android/net/Uri$Builder;
    ((Uri.Builder)localObject5).<init>();
    localObject1 = ((Uri.Builder)localObject5).scheme(str7).authority(paramString);
    str7 = "file";
    localObject1 = ((Uri.Builder)localObject1).appendPath(str7).build();
    int i = 7;
    Object localObject6 = null;
    try
    {
      String[] arrayOfString = new String[i];
      i = 0;
      str7 = null;
      arrayOfString[0] = str6;
      int j = 1;
      float f = 1.4E-45F;
      arrayOfString[j] = str5;
      int k = 2;
      arrayOfString[k] = str4;
      localObject5 = "font_variation_settings";
      int m = 3;
      arrayOfString[m] = localObject5;
      k = 4;
      arrayOfString[k] = str3;
      k = 5;
      arrayOfString[k] = str2;
      k = 6;
      arrayOfString[k] = str1;
      localObject5 = paramContext.getContentResolver();
      String str8 = "query = ?";
      Object localObject7 = new String[j];
      Object localObject8 = paramFontRequest.getQuery();
      localObject7[0] = localObject8;
      localObject8 = localObject4;
      i = j;
      j = 0;
      f = 0.0F;
      localObject5 = FontProvider.Api16Impl.OooO00o((ContentResolver)localObject5, (Uri)localObject4, arrayOfString, str8, (String[])localObject7, null, paramCancellationSignal);
      if (localObject5 != null) {
        try
        {
          m = ((Cursor)localObject5).getCount();
          if (m > 0)
          {
            int i1 = ((Cursor)localObject5).getColumnIndex(str1);
            localArrayList = new java/util/ArrayList;
            localArrayList.<init>();
            int i2 = ((Cursor)localObject5).getColumnIndex(str6);
            int i3 = ((Cursor)localObject5).getColumnIndex(str5);
            int i4 = ((Cursor)localObject5).getColumnIndex(str4);
            int i5 = ((Cursor)localObject5).getColumnIndex(str3);
            int i6 = ((Cursor)localObject5).getColumnIndex(str2);
            for (;;)
            {
              boolean bool = ((Cursor)localObject5).moveToNext();
              if (!bool) {
                break;
              }
              int n = -1;
              int i7;
              if (i1 != n)
              {
                i7 = ((Cursor)localObject5).getInt(i1);
              }
              else
              {
                i7 = 0;
                arrayOfString = null;
              }
              int i8;
              if (i4 != n)
              {
                i8 = ((Cursor)localObject5).getInt(i4);
              }
              else
              {
                i8 = 0;
                str8 = null;
              }
              long l;
              if (i3 == n)
              {
                l = ((Cursor)localObject5).getLong(i2);
                localObject7 = ContentUris.withAppendedId((Uri)localObject4, l);
              }
              else
              {
                l = ((Cursor)localObject5).getLong(i3);
                localObject7 = ContentUris.withAppendedId((Uri)localObject1, l);
              }
              if (i5 != n)
              {
                j = ((Cursor)localObject5).getInt(i5);
              }
              else
              {
                j = 400;
                f = 5.605194E-043F;
              }
              if (i6 != n)
              {
                n = ((Cursor)localObject5).getInt(i6);
                if (n == i)
                {
                  n = i;
                  break label545;
                }
              }
              n = 0;
              localObject8 = null;
              label545:
              localObject8 = FontsContractCompat.FontInfo.OooO00o((Uri)localObject7, i8, j, n, i7);
              localArrayList.add(localObject8);
            }
          }
          if (localObject5 == null) {
            break label592;
          }
        }
        finally
        {
          localObject6 = localObject5;
          break label611;
        }
      }
      ((Cursor)localObject5).close();
      label592:
      FontsContractCompat.FontInfo[] arrayOfFontInfo = new FontsContractCompat.FontInfo[0];
      return (FontsContractCompat.FontInfo[])localArrayList.toArray(arrayOfFontInfo);
    }
    finally
    {
      label611:
      if (localObject6 != null) {
        localObject6.close();
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.provider.FontProvider
 * JD-Core Version:    0.7.0.1
 */
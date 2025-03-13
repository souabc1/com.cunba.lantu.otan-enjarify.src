package com.xuexiang.xhttp2.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Audio.Media;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import android.text.TextUtils;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import m54207b69;

public final class PathUtils
{
  private PathUtils()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("V64317575A5C16481D67614F4D6365506E675365296F682E2F30");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public static boolean OooO(Uri paramUri)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramUri;
    return m54207b69.F54207b69_01(1523, arrayOfObject);
  }
  
  public static String OooO00o(Context paramContext, Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = paramContext;
    arrayOfObject[1] = paramUri;
    arrayOfObject[2] = paramString;
    arrayOfObject[3] = paramArrayOfString;
    return (String)m54207b69.F54207b69_09(1524, arrayOfObject);
  }
  
  public static String OooO0O0(Context paramContext, long paramLong)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramContext;
    Long localLong = Long.valueOf(paramLong);
    arrayOfObject[1] = localLong;
    return (String)m54207b69.F54207b69_09(1525, arrayOfObject);
  }
  
  public static String OooO0OO(Context paramContext, Uri paramUri)
  {
    Object localObject1 = paramContext;
    Object localObject2 = paramUri;
    if ((paramContext != null) && (paramUri != null))
    {
      String str1 = paramUri.getScheme();
      Object localObject3 = m54207b69.F54207b69_11("u4525E5A54");
      boolean bool1 = ((String)localObject3).equals(str1);
      if (bool1) {
        return paramUri.getPath();
      }
      String str2 = m54207b69.F54207b69_11("p85B58584F615B52");
      boolean bool2 = str2.equals(str1);
      bool2 = str2.equals(str1);
      label560:
      boolean bool6;
      if (bool2)
      {
        int j = Build.VERSION.SDK_INT;
        boolean bool3 = DocumentsContract.isDocumentUri(paramContext, paramUri);
        if (bool3)
        {
          boolean bool4 = OooO0o(paramUri);
          int m = 2;
          str2 = ":";
          bool3 = true;
          int n;
          boolean bool7;
          if (bool4)
          {
            localObject2 = DocumentsContract.getDocumentId(paramUri).split(str2);
            int k = localObject2.length;
            if (k == m)
            {
              str1 = localObject2[0];
              localObject3 = m54207b69.F54207b69_11("HH383B23282D3F37");
              n = ((String)localObject3).equalsIgnoreCase(str1);
              str2 = "/";
              if (n != 0)
              {
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>();
                localObject4 = Environment.getExternalStorageDirectory();
                ((StringBuilder)localObject1).append(localObject4);
                ((StringBuilder)localObject1).append(str2);
                localObject2 = localObject2[bool3];
                ((StringBuilder)localObject1).append((String)localObject2);
                return ((StringBuilder)localObject1).toString();
              }
              localObject3 = m54207b69.F54207b69_11("&&55534B574B4649");
              localObject1 = (StorageManager)paramContext.getSystemService((String)localObject3);
              localObject3 = "rZ3B35402B3938447B3D327E343A42364A4D50861C424A3E5255582650524C555E";
              try
              {
                localObject3 = m54207b69.F54207b69_11((String)localObject3);
                localObject3 = Class.forName((String)localObject3);
                Object localObject5 = localObject1.getClass();
                Object localObject6 = "9a0605173A12121A130C36121D21";
                localObject6 = m54207b69.F54207b69_11((String)localObject6);
                Object localObject7 = new Class[0];
                localObject5 = ((Class)localObject5).getMethod((String)localObject6, (Class[])localObject7);
                localObject6 = "T@27263618392E2A";
                localObject6 = m54207b69.F54207b69_11((String)localObject6);
                localObject7 = new Class[0];
                localObject6 = ((Class)localObject3).getMethod((String)localObject6, (Class[])localObject7);
                localObject7 = "so080B1D3F1F132111";
                localObject7 = m54207b69.F54207b69_11((String)localObject7);
                Object localObject8 = new Class[0];
                localObject7 = ((Class)localObject3).getMethod((String)localObject7, (Class[])localObject8);
                localObject8 = "W354574966564C61";
                localObject8 = m54207b69.F54207b69_11((String)localObject8);
                Object localObject9 = new Class[0];
                localObject8 = ((Class)localObject3).getMethod((String)localObject8, (Class[])localObject9);
                localObject9 = "a~170E300F1B1825130F";
                localObject9 = m54207b69.F54207b69_11((String)localObject9);
                Object localObject10 = new Class[0];
                localObject9 = ((Class)localObject3).getMethod((String)localObject9, (Class[])localObject10);
                localObject10 = "m{12094019121C20162628";
                localObject10 = m54207b69.F54207b69_11((String)localObject10);
                Object localObject11 = new Class[0];
                localObject3 = ((Class)localObject3).getMethod((String)localObject10, (Class[])localObject11);
                localObject10 = new Object[0];
                localObject1 = ((Method)localObject5).invoke(localObject1, (Object[])localObject10);
                j = Array.getLength(localObject1);
                int i1 = 0;
                localObject10 = null;
                while (i1 < j)
                {
                  localObject11 = Array.get(localObject1, i1);
                  Object localObject12 = "DZ37363137324444";
                  localObject12 = m54207b69.F54207b69_11((String)localObject12);
                  localObject4 = new Object[0];
                  localObject4 = ((Method)localObject7).invoke(localObject11, (Object[])localObject4);
                  bool7 = ((String)localObject12).equals(localObject4);
                  if (!bool7)
                  {
                    localObject4 = "~u181B021E051517310F23";
                    localObject4 = m54207b69.F54207b69_11((String)localObject4);
                    localObject12 = new Object[0];
                    localObject12 = ((Method)localObject7).invoke(localObject11, (Object[])localObject12);
                    bool7 = ((String)localObject4).equals(localObject12);
                    if (!bool7)
                    {
                      bool7 = false;
                      localObject4 = null;
                      break label560;
                    }
                  }
                  bool7 = bool3;
                  if (bool7)
                  {
                    localObject4 = new Object[0];
                    localObject4 = ((Method)localObject9).invoke(localObject11, (Object[])localObject4);
                    localObject4 = (Boolean)localObject4;
                    bool7 = ((Boolean)localObject4).booleanValue();
                    if (bool7)
                    {
                      localObject4 = new Object[0];
                      localObject4 = ((Method)localObject3).invoke(localObject11, (Object[])localObject4);
                      localObject4 = (Boolean)localObject4;
                      bool7 = ((Boolean)localObject4).booleanValue();
                      if (bool7) {}
                    }
                    else
                    {
                      localObject4 = new Object[0];
                      localObject4 = ((Method)localObject6).invoke(localObject11, (Object[])localObject4);
                      localObject4 = (String)localObject4;
                      if (localObject4 != null)
                      {
                        bool7 = ((String)localObject4).equals(str1);
                        if (bool7)
                        {
                          localObject1 = new java/lang/StringBuilder;
                          ((StringBuilder)localObject1).<init>();
                          localObject4 = new Object[0];
                          localObject4 = ((Method)localObject8).invoke(localObject11, (Object[])localObject4);
                          ((StringBuilder)localObject1).append(localObject4);
                          ((StringBuilder)localObject1).append(str2);
                          localObject2 = localObject2[bool3];
                          ((StringBuilder)localObject1).append((String)localObject2);
                          return ((StringBuilder)localObject1).toString();
                        }
                      }
                    }
                  }
                  i1 += 1;
                }
                bool7 = OooO0o0(paramUri);
              }
              catch (Exception localException)
              {
                localException.printStackTrace();
              }
            }
          }
          else
          {
            str1 = m54207b69.F54207b69_11("$*7544501A19");
            if (bool7)
            {
              localObject2 = DocumentsContract.getDocumentId(paramUri);
              bool7 = TextUtils.isEmpty((CharSequence)localObject2);
              if (bool7) {
                return null;
              }
              localObject4 = m54207b69.F54207b69_11("ic1103165C");
              bool7 = ((String)localObject2).startsWith((String)localObject4);
              if (bool7) {
                return ((String)localObject2).substring(4);
              }
              localObject4 = m54207b69.F54207b69_11("8@2D34287D");
              bool7 = ((String)localObject2).startsWith((String)localObject4);
              if (bool7)
              {
                int i2 = 29;
                if (j >= i2)
                {
                  localObject4 = ((String)localObject2).split(str2);
                  int i = localObject4.length;
                  if (i == n)
                  {
                    localObject2 = OooO00o.OooO00o();
                    localObject4 = localObject4[bool3];
                    localObject4 = new String[] { localObject4 };
                    return OooO00o(paramContext, (Uri)localObject2, str1, (String[])localObject4);
                  }
                }
              }
              long l1 = -1;
              long l2 = Utils.OooOOOo((String)localObject2, l1);
              boolean bool9 = l2 < l1;
              if (bool9) {
                return OooO0O0(localException, l2);
              }
            }
            else
            {
              bool8 = OooO(paramUri);
              if (bool8)
              {
                localObject2 = DocumentsContract.getDocumentId(paramUri).split(str2);
                localObject4 = localObject2[0];
                localObject3 = m54207b69.F54207b69_11("M>5754615C5F");
                bool6 = ((String)localObject3).equals(localObject4);
                if (bool6)
                {
                  localObject4 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                }
                else
                {
                  localObject3 = m54207b69.F54207b69_11("Y$524E42444F");
                  bool6 = ((String)localObject3).equals(localObject4);
                  if (bool6)
                  {
                    localObject4 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                  }
                  else
                  {
                    localObject3 = m54207b69.F54207b69_11("aq1005171B22");
                    bool8 = ((String)localObject3).equals(localObject4);
                    if (bool8)
                    {
                      localObject4 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    else
                    {
                      bool8 = false;
                      localObject4 = null;
                    }
                  }
                }
                localObject2 = localObject2[bool3];
                localObject2 = new String[] { localObject2 };
                return OooO00o(localException, (Uri)localObject4, str1, (String[])localObject2);
              }
            }
          }
          bool8 = false;
          localObject4 = null;
          break label1277;
        }
      }
      boolean bool8 = str2.equalsIgnoreCase(str1);
      if (bool8)
      {
        bool8 = OooO0oO(paramUri);
        if (bool8) {
          return paramUri.getLastPathSegment();
        }
        bool8 = OooO0oo(paramUri);
        boolean bool5;
        StringBuilder localStringBuilder;
        if (bool8)
        {
          localObject4 = paramUri.getPath();
          bool5 = Utils.OooOO0o((CharSequence)localObject4);
          if (!bool5)
          {
            str1 = m54207b69.F54207b69_11("hL633F25263C");
            bool6 = ((String)localObject4).startsWith(str1);
            if (bool6) {
              return ((String)localObject4).replace(str1, "");
            }
          }
        }
        else
        {
          bool8 = OooOO0(paramUri);
          if (bool8)
          {
            localObject4 = paramUri.getPath();
            bool5 = Utils.OooOO0o((CharSequence)localObject4);
            if (!bool5)
            {
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              localObject2 = Environment.getExternalStorageDirectory();
              localStringBuilder.append(localObject2);
              localObject2 = ((String)localObject4).substring(10);
              localStringBuilder.append((String)localObject2);
              return localStringBuilder.toString();
            }
          }
        }
        return OooO00o(localStringBuilder, (Uri)localObject2, null, null);
      }
      bool8 = false;
      Object localObject4 = null;
      boolean bool10 = ((String)localObject3).equalsIgnoreCase(str1);
      if (bool10) {
        return paramUri.getPath();
      }
      label1277:
      return null;
    }
    return null;
  }
  
  public static String OooO0Oo(Uri paramUri)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramUri;
    return (String)m54207b69.F54207b69_09(1527, arrayOfObject);
  }
  
  public static boolean OooO0o(Uri paramUri)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramUri;
    return m54207b69.F54207b69_01(1528, arrayOfObject);
  }
  
  public static boolean OooO0o0(Uri paramUri)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramUri;
    return m54207b69.F54207b69_01(1529, arrayOfObject);
  }
  
  public static boolean OooO0oO(Uri paramUri)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramUri;
    return m54207b69.F54207b69_01(1530, arrayOfObject);
  }
  
  public static boolean OooO0oo(Uri paramUri)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramUri;
    return m54207b69.F54207b69_01(1531, arrayOfObject);
  }
  
  public static boolean OooOO0(Uri paramUri)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramUri;
    return m54207b69.F54207b69_01(1532, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xhttp2.utils.PathUtils
 * JD-Core Version:    0.7.0.1
 */
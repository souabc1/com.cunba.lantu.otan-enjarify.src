package com.tencent.mmkv;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.io.File;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import m54207b69;

public class MMKV
  implements SharedPreferences, SharedPreferences.Editor
{
  public static boolean OooO = false;
  public static final EnumMap OooO00o;
  public static final EnumMap OooO0O0;
  public static final MMKVLogLevel[] OooO0OO;
  public static final Set OooO0Oo;
  public static boolean OooO0o;
  public static String OooO0o0;
  public static final HashMap OooO0oO;
  public static MMKVHandler OooO0oo;
  public static MMKVContentChangeNotification OooOO0;
  private final long nativeHandle;
  
  static
  {
    Object localObject1 = new java/util/EnumMap;
    ((EnumMap)localObject1).<init>(MMKVRecoverStrategic.class);
    OooO00o = (EnumMap)localObject1;
    Object localObject2 = MMKVRecoverStrategic.o00OoOoo;
    Object localObject3 = Integer.valueOf(0);
    ((EnumMap)localObject1).put((Enum)localObject2, localObject3);
    localObject2 = MMKVRecoverStrategic.o00Ooo00;
    int i = 1;
    Object localObject4 = Integer.valueOf(i);
    ((EnumMap)localObject1).put((Enum)localObject2, localObject4);
    localObject1 = new java/util/EnumMap;
    ((EnumMap)localObject1).<init>(MMKVLogLevel.class);
    OooO0O0 = (EnumMap)localObject1;
    localObject2 = MMKVLogLevel.o00OoOoo;
    ((EnumMap)localObject1).put((Enum)localObject2, localObject3);
    localObject3 = MMKVLogLevel.o00Ooo00;
    ((EnumMap)localObject1).put((Enum)localObject3, localObject4);
    localObject4 = MMKVLogLevel.o00Ooo0;
    Object localObject5 = Integer.valueOf(2);
    ((EnumMap)localObject1).put((Enum)localObject4, localObject5);
    localObject5 = MMKVLogLevel.o00Ooo0O;
    Object localObject6 = Integer.valueOf(3);
    ((EnumMap)localObject1).put((Enum)localObject5, localObject6);
    localObject6 = MMKVLogLevel.o00Ooo0o;
    Integer localInteger = Integer.valueOf(4);
    ((EnumMap)localObject1).put((Enum)localObject6, localInteger);
    MMKVLogLevel[] tmp151_148 = new MMKVLogLevel[5];
    MMKVLogLevel[] tmp152_151 = tmp151_148;
    MMKVLogLevel[] tmp152_151 = tmp151_148;
    tmp152_151[0] = localObject2;
    tmp152_151[1] = localObject3;
    MMKVLogLevel[] tmp159_152 = tmp152_151;
    MMKVLogLevel[] tmp159_152 = tmp152_151;
    tmp159_152[2] = localObject4;
    tmp159_152[3] = localObject5;
    tmp159_152[4] = localObject6;
    OooO0OO = tmp159_152;
    localObject1 = new java/util/HashSet;
    ((HashSet)localObject1).<init>();
    OooO0Oo = (Set)localObject1;
    OooO0o0 = null;
    OooO0o = i;
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    OooO0oO = (HashMap)localObject1;
  }
  
  public MMKV(long paramLong)
  {
    this.nativeHandle = paramLong;
  }
  
  public static MMKV OooO00o(long paramLong, String paramString, int paramInt)
  {
    long l = 0L;
    boolean bool1 = paramLong < l;
    if (bool1)
    {
      bool1 = OooO0o;
      if (!bool1)
      {
        paramString = new com/tencent/mmkv/MMKV;
        paramString.<init>(paramLong);
        return paramString;
      }
      synchronized (OooO0Oo)
      {
        Long localLong = Long.valueOf(paramLong);
        boolean bool2 = ???.contains(localLong);
        if (!bool2)
        {
          bool2 = checkProcessMode(paramLong);
          if (!bool2)
          {
            int i = 1;
            Object localObject1;
            if (paramInt == i)
            {
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>();
              localObject3 = "ND0B35232D312F296B2D6D333C343D3B7844473D3A354C4D7B2122292D804A485650464C4A458945";
              localObject3 = m54207b69.F54207b69_11((String)localObject3);
              ((StringBuilder)localObject1).append((String)localObject3);
              ((StringBuilder)localObject1).append(paramString);
              localObject3 = "gX0579313430357E12191F291F29141619272C2F1E1F1C2B2E343693";
              localObject3 = m54207b69.F54207b69_11((String)localObject3);
              ((StringBuilder)localObject1).append((String)localObject3);
              localObject1 = ((StringBuilder)localObject1).toString();
            }
            else
            {
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>();
              localObject3 = "+[142C4038363A4282423E8521221D1B8A42463A424E4A4E559319";
              localObject3 = m54207b69.F54207b69_11((String)localObject3);
              ((StringBuilder)localObject1).append((String)localObject3);
              ((StringBuilder)localObject1).append(paramString);
              localObject3 = "U[067C2E353338811D1620191D10181723282F1A1B182B2A36369095";
              localObject3 = m54207b69.F54207b69_11((String)localObject3);
              ((StringBuilder)localObject1).append((String)localObject3);
              localObject1 = ((StringBuilder)localObject1).toString();
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              ((StringBuilder)localObject3).append((String)localObject1);
              String str1 = "-g1010100E064C141A481D511117221015132F591816171F5E20301C241E20652F2E34316A58534F47534B62626155525164656A5D5C58587E3D57814F44474047494389574C4F4857574B5F4D934F59635297";
              localObject1 = m54207b69.F54207b69_11(str1);
              ((StringBuilder)localObject3).append((String)localObject1);
              localObject1 = ((StringBuilder)localObject3).toString();
            }
            localObject3 = new java/lang/IllegalArgumentException;
            ((IllegalArgumentException)localObject3).<init>((String)localObject1);
            throw ((Throwable)localObject3);
          }
          paramString = Long.valueOf(paramLong);
          ???.add(paramString);
        }
        paramString = new com/tencent/mmkv/MMKV;
        paramString.<init>(paramLong);
        return paramString;
      }
    }
    localRuntimeException = new java/lang/RuntimeException;
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    String str2 = m54207b69.F54207b69_11("577157605E1B485E1E5C4E5C614F5F256569288C8D90762D75715D5D71757170368C");
    ((StringBuilder)localObject3).append(str2);
    ((StringBuilder)localObject3).append(paramString);
    paramString = m54207b69.F54207b69_11("(V0B77413B7A211E26");
    ((StringBuilder)localObject3).append(paramString);
    localObject3 = ((StringBuilder)localObject3).toString();
    localRuntimeException.<init>((String)localObject3);
  }
  
  public static void OooOOO()
  {
    Set localSet = OooO0Oo;
    Object localObject1 = null;
    try
    {
      OooO0o = false;
      return;
    }
    finally {}
  }
  
  public static MMKV OooOOO0()
  {
    Object localObject = OooO0o0;
    if (localObject != null)
    {
      int i = 1;
      long l = getDefaultMMKV(i, null);
      localObject = m54207b69.F54207b69_11("Q/6B4B4B515E4861696A6D83");
      return OooO00o(l, (String)localObject, i);
    }
    localObject = new java/lang/IllegalStateException;
    String str = m54207b69.F54207b69_11("C-74435A10624A485F49521779584E4F1C7071788E1759595B715D665C60746624242E6D6783837F2A");
    ((IllegalStateException)localObject).<init>(str);
    throw ((Throwable)localObject);
  }
  
  public static String OooOOOO(String paramString, MMKV.LibLoader paramLibLoader, MMKVLogLevel paramMMKVLogLevel)
  {
    String str1 = m54207b69.F54207b69_11("9]3E777805323A42364042");
    String str2 = m54207b69.F54207b69_11("|X35363531");
    if (paramLibLoader != null)
    {
      paramLibLoader.OooO00o(str1);
      paramLibLoader.OooO00o(str2);
    }
    else
    {
      System.loadLibrary(str1);
      System.loadLibrary(str2);
    }
    int i = OooOoo0(paramMMKVLogLevel);
    jniInitialize(paramString, i);
    OooO0o0 = paramString;
    return paramString;
  }
  
  public static void OooOOOo()
  {
    Set localSet = OooO0Oo;
    boolean bool = true;
    try
    {
      OooO0o = bool;
      return;
    }
    finally {}
  }
  
  public static String OooOoO(Context paramContext)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = paramContext.getFilesDir().getAbsolutePath();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = m54207b69.F54207b69_11("GH6726272642");
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = ((StringBuilder)localObject1).toString();
    localObject2 = MMKVLogLevel.o00Ooo00;
    return OooOoOO(paramContext, (String)localObject1, null, (MMKVLogLevel)localObject2);
  }
  
  public static String OooOoOO(Context paramContext, String paramString, MMKV.LibLoader paramLibLoader, MMKVLogLevel paramMMKVLogLevel)
  {
    paramContext = paramContext.getApplicationInfo();
    int i = paramContext.flags & 0x2;
    if (i == 0) {
      OooOOO();
    } else {
      OooOOOo();
    }
    return OooOOOO(paramString, paramLibLoader, paramMMKVLogLevel);
  }
  
  public static MMKV OooOoo(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    long l1 = getMMKVWithAshmemFD(paramString1, paramInt1, paramInt2, paramString2);
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool)
    {
      paramString1 = new com/tencent/mmkv/MMKV;
      paramString1.<init>(l1);
      return paramString1;
    }
    RuntimeException localRuntimeException = new java/lang/RuntimeException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    paramString2 = m54207b69.F54207b69_11("fl2A0E0703501D09531727131824165A1C125D1F3218161F18643A3B42566923213F392F25332E725E");
    localStringBuilder.append(paramString2);
    localStringBuilder.append(paramString1);
    paramString1 = m54207b69.F54207b69_11("(V0B77413B7A211E26");
    localStringBuilder.append(paramString1);
    paramString1 = localStringBuilder.toString();
    localRuntimeException.<init>(paramString1);
    throw localRuntimeException;
  }
  
  public static int OooOoo0(MMKVLogLevel paramMMKVLogLevel)
  {
    int[] arrayOfInt = MMKV.1.OooO00o;
    int i = paramMMKVLogLevel.ordinal();
    i = arrayOfInt[i];
    int j = 1;
    if (i != j)
    {
      int k = 2;
      if (i != k)
      {
        k = 3;
        if (i != k)
        {
          k = 4;
          if (i != k) {
            return j;
          }
        }
      }
      j = k;
    }
    else
    {
      j = 0;
      arrayOfInt = null;
    }
    return j;
  }
  
  public static MMKV OooOooO(Context paramContext, String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    Object localObject1 = OooO0o0;
    if (localObject1 != null)
    {
      int i = Process.myPid();
      localObject1 = MMKVContentProvider.OooO0O0(paramContext, i);
      if (localObject1 != null)
      {
        int j = ((String)localObject1).length();
        if (j != 0)
        {
          Object localObject2 = ":";
          boolean bool1 = ((String)localObject1).contains((CharSequence)localObject2);
          if (bool1)
          {
            localObject1 = MMKVContentProvider.OooO00o(paramContext);
            if (localObject1 != null)
            {
              localObject2 = MMKVLogLevel.o00Ooo00;
              Object localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              String str1 = m54207b69.F54207b69_11("kP373626273D433D77283A2C3E41493F414C46825051503C8751578A3B3E5C515443449E9329475F979599");
              ((StringBuilder)localObject3).append(str1);
              ((StringBuilder)localObject3).append(localObject1);
              localObject3 = ((StringBuilder)localObject3).toString();
              Oooo000((MMKVLogLevel)localObject2, (String)localObject3);
              localObject3 = new android/os/Bundle;
              ((Bundle)localObject3).<init>();
              str1 = m54207b69.F54207b69_11("&Z112005080D180626");
              ((BaseBundle)localObject3).putInt(str1, paramInt1);
              str1 = m54207b69.F54207b69_11("007B766B7281847A7C");
              ((BaseBundle)localObject3).putInt(str1, paramInt2);
              if (paramString2 != null)
              {
                str1 = m54207b69.F54207b69_11("Wh232E333A2F3F373F44");
                ((BaseBundle)localObject3).putString(str1, paramString2);
              }
              paramContext = paramContext.getContentResolver();
              str1 = m54207b69.F54207b69_11("^-4041485E6F64484774674F4B544D7278");
              paramContext = paramContext.call((Uri)localObject1, str1, paramString1, (Bundle)localObject3);
              if (paramContext != null)
              {
                localObject1 = ParcelableMMKV.class.getClassLoader();
                paramContext.setClassLoader((ClassLoader)localObject1);
                localObject1 = "KEY";
                paramContext = (ParcelableMMKV)paramContext.getParcelable((String)localObject1);
                if (paramContext != null)
                {
                  paramContext = paramContext.OooO00o();
                  if (paramContext != null)
                  {
                    paramString1 = new java/lang/StringBuilder;
                    paramString1.<init>();
                    localObject4 = paramContext.mmapID();
                    paramString1.append((String)localObject4);
                    localObject4 = m54207b69.F54207b69_11("g:1A5D601D0B1F");
                    paramString1.append((String)localObject4);
                    paramInt1 = paramContext.ashmemFD();
                    paramString1.append(paramInt1);
                    localObject4 = m54207b69.F54207b69_11("bY757A363F313D7F4645826E84");
                    paramString1.append((String)localObject4);
                    paramInt1 = paramContext.ashmemMetaFD();
                    paramString1.append(paramInt1);
                    paramString1 = paramString1.toString();
                    Oooo000((MMKVLogLevel)localObject2, paramString1);
                    return paramContext;
                  }
                }
              }
            }
            else
            {
              paramContext = MMKVLogLevel.o00Ooo0O;
              paramString1 = m54207b69.F54207b69_11("Is3E3F3A283421230E1E26112E0D291329272713662F27166A32361F2D3B3735723227293E4026402E32");
              Oooo000(paramContext, paramString1);
              paramContext = new java/lang/IllegalStateException;
              paramContext.<init>(paramString1);
              throw paramContext;
            }
          }
          paramContext = MMKVLogLevel.o00Ooo00;
          localObject1 = m54207b69.F54207b69_11("K<5B5A4A4B59576123595A61552862602B616E67653061646A7772696A");
          Oooo000(paramContext, (String)localObject1);
          int k = paramInt2 | 0x8;
          long l1 = getMMKVWithIDAndSize(paramString1, paramInt1, k, paramString2);
          long l2 = 0L;
          boolean bool2 = l1 < l2;
          if (bool2)
          {
            paramContext = new com/tencent/mmkv/MMKV;
            paramContext.<init>(l1);
            return paramContext;
          }
          paramContext = new java/lang/IllegalStateException;
          Object localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          String str2 = m54207b69.F54207b69_11("\\Y1F3932387D323C804234464339498747478A2A3D4549524B912D2E2D2B964E564A4E5A5A5E619F29");
          ((StringBuilder)localObject4).append(str2);
          ((StringBuilder)localObject4).append(paramString1);
          ((StringBuilder)localObject4).append("]");
          paramString1 = ((StringBuilder)localObject4).toString();
          paramContext.<init>(paramString1);
          throw paramContext;
        }
      }
      paramContext = MMKVLogLevel.o00Ooo0O;
      paramString1 = m54207b69.F54207b69_11("hu05081C19140B0C5C231D221B611E1E102027136827293230716E1B2228723231343D3D783D3927372F");
      Oooo000(paramContext, paramString1);
      paramContext = new java/lang/IllegalStateException;
      paramContext.<init>(paramString1);
      throw paramContext;
    }
    paramContext = new java/lang/IllegalStateException;
    paramString1 = m54207b69.F54207b69_11("C-74435A10624A485F49521779584E4F1C7071788E1759595B715D665C60746624242E6D6783837F2A");
    paramContext.<init>(paramString1);
    throw paramContext;
  }
  
  public static void Oooo000(MMKVLogLevel paramMMKVLogLevel, String paramString)
  {
    Object localObject1 = Thread.currentThread().getStackTrace();
    int i = localObject1.length + -1;
    localObject1 = localObject1[i];
    Object localObject2 = OooO0O0;
    paramMMKVLogLevel = (Integer)((EnumMap)localObject2).get(paramMMKVLogLevel);
    int j;
    if (paramMMKVLogLevel == null)
    {
      j = 0;
      paramMMKVLogLevel = null;
    }
    else
    {
      j = paramMMKVLogLevel.intValue();
    }
    localObject2 = ((StackTraceElement)localObject1).getFileName();
    int k = ((StackTraceElement)localObject1).getLineNumber();
    localObject1 = ((StackTraceElement)localObject1).getMethodName();
    mmkvLogImp(j, (String)localObject2, k, (String)localObject1, paramString);
  }
  
  private native long actualSize(long paramLong);
  
  private static native boolean checkProcessMode(long paramLong);
  
  private native boolean containsKey(long paramLong, String paramString);
  
  private native long count(long paramLong);
  
  private static native long createNB(int paramInt);
  
  private native boolean decodeBool(long paramLong, String paramString, boolean paramBoolean);
  
  private native byte[] decodeBytes(long paramLong, String paramString);
  
  private native double decodeDouble(long paramLong, String paramString, double paramDouble);
  
  private native float decodeFloat(long paramLong, String paramString, float paramFloat);
  
  private native int decodeInt(long paramLong, String paramString, int paramInt);
  
  private native long decodeLong(long paramLong1, String paramString, long paramLong2);
  
  private native String decodeString(long paramLong, String paramString1, String paramString2);
  
  private native String[] decodeStringSet(long paramLong, String paramString);
  
  private static native void destroyNB(long paramLong, int paramInt);
  
  private native boolean encodeBool(long paramLong, String paramString, boolean paramBoolean);
  
  private native boolean encodeBytes(long paramLong, String paramString, byte[] paramArrayOfByte);
  
  private native boolean encodeDouble(long paramLong, String paramString, double paramDouble);
  
  private native boolean encodeFloat(long paramLong, String paramString, float paramFloat);
  
  private native boolean encodeInt(long paramLong, String paramString, int paramInt);
  
  private native boolean encodeLong(long paramLong1, String paramString, long paramLong2);
  
  private native boolean encodeSet(long paramLong, String paramString, String[] paramArrayOfString);
  
  private native boolean encodeString(long paramLong, String paramString1, String paramString2);
  
  private static native long getDefaultMMKV(int paramInt, String paramString);
  
  private static native long getMMKVWithAshmemFD(String paramString1, int paramInt1, int paramInt2, String paramString2);
  
  private static native long getMMKVWithID(String paramString1, int paramInt, String paramString2, String paramString3);
  
  private static native long getMMKVWithIDAndSize(String paramString1, int paramInt1, int paramInt2, String paramString2);
  
  public static String getRootDir()
  {
    return OooO0o0;
  }
  
  public static native boolean isFileValid(String paramString1, String paramString2);
  
  private static native void jniInitialize(String paramString, int paramInt);
  
  private static void mmkvLogImp(int paramInt1, String paramString1, int paramInt2, String paramString2, String paramString3)
  {
    MMKVHandler localMMKVHandler = OooO0oo;
    if (localMMKVHandler != null)
    {
      boolean bool = OooO;
      if (bool)
      {
        MMKVLogLevel localMMKVLogLevel1 = OooO0OO[paramInt1];
        localMMKVHandler.OooO0O0(localMMKVLogLevel1, paramString1, paramInt2, paramString2, paramString3);
        return;
      }
    }
    paramString1 = MMKV.1.OooO00o;
    MMKVLogLevel[] arrayOfMMKVLogLevel = OooO0OO;
    MMKVLogLevel localMMKVLogLevel2 = arrayOfMMKVLogLevel[paramInt1];
    paramInt1 = localMMKVLogLevel2.ordinal();
    paramInt1 = paramString1[paramInt1];
  }
  
  private static void onContentChangedByOuterProcess(String paramString)
  {
    MMKVContentChangeNotification localMMKVContentChangeNotification = OooOO0;
    if (localMMKVContentChangeNotification != null) {
      localMMKVContentChangeNotification.OooO00o(paramString);
    }
  }
  
  public static native void onExit();
  
  private static int onMMKVCRCCheckFail(String paramString)
  {
    MMKVRecoverStrategic localMMKVRecoverStrategic = MMKVRecoverStrategic.o00OoOoo;
    Object localObject = OooO0oo;
    if (localObject != null) {
      localMMKVRecoverStrategic = ((MMKVHandler)localObject).OooO0OO(paramString);
    }
    localObject = MMKVLogLevel.o00Ooo00;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("R^0C3C3F342C4032853533364A364847464D8F4A444093");
    localStringBuilder.append(str1);
    localStringBuilder.append(paramString);
    String str2 = "iW773F267A";
    paramString = m54207b69.F54207b69_11(str2);
    localStringBuilder.append(paramString);
    localStringBuilder.append(localMMKVRecoverStrategic);
    paramString = localStringBuilder.toString();
    Oooo000((MMKVLogLevel)localObject, paramString);
    paramString = (Integer)OooO00o.get(localMMKVRecoverStrategic);
    int i;
    if (paramString == null)
    {
      i = 0;
      paramString = null;
    }
    else
    {
      i = paramString.intValue();
    }
    return i;
  }
  
  private static int onMMKVFileLengthError(String paramString)
  {
    MMKVRecoverStrategic localMMKVRecoverStrategic = MMKVRecoverStrategic.o00OoOoo;
    Object localObject = OooO0oo;
    if (localObject != null) {
      localMMKVRecoverStrategic = ((MMKVHandler)localObject).OooO00o(paramString);
    }
    localObject = MMKVLogLevel.o00Ooo00;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str1 = m54207b69.F54207b69_11("R^0C3C3F342C4032853533364A364847464D8F4A444093");
    localStringBuilder.append(str1);
    localStringBuilder.append(paramString);
    String str2 = "iW773F267A";
    paramString = m54207b69.F54207b69_11(str2);
    localStringBuilder.append(paramString);
    localStringBuilder.append(localMMKVRecoverStrategic);
    paramString = localStringBuilder.toString();
    Oooo000((MMKVLogLevel)localObject, paramString);
    paramString = (Integer)OooO00o.get(localMMKVRecoverStrategic);
    int i;
    if (paramString == null)
    {
      i = 0;
      paramString = null;
    }
    else
    {
      i = paramString.intValue();
    }
    return i;
  }
  
  public static native int pageSize();
  
  private native void removeValueForKey(long paramLong, String paramString);
  
  private static native void setCallbackHandler(boolean paramBoolean1, boolean paramBoolean2);
  
  private static native void setLogLevel(int paramInt);
  
  public static void setLogLevel(MMKVLogLevel paramMMKVLogLevel)
  {
    setLogLevel(OooOoo0(paramMMKVLogLevel));
  }
  
  private static native void setWantsContentChangeNotify(boolean paramBoolean);
  
  private native void sync(boolean paramBoolean);
  
  private native long totalSize(long paramLong);
  
  private native int valueSize(long paramLong, String paramString, boolean paramBoolean);
  
  public static native String version();
  
  private native int writeValueToNB(long paramLong1, String paramString, long paramLong2, int paramInt);
  
  public long OooO(String paramString, long paramLong)
  {
    long l = this.nativeHandle;
    return decodeLong(l, paramString, paramLong);
  }
  
  public boolean OooO0O0(String paramString)
  {
    long l = this.nativeHandle;
    return containsKey(l, paramString);
  }
  
  public boolean OooO0OO(String paramString, boolean paramBoolean)
  {
    long l = this.nativeHandle;
    return decodeBool(l, paramString, paramBoolean);
  }
  
  public byte[] OooO0Oo(String paramString)
  {
    return OooO0o0(paramString, null);
  }
  
  public double OooO0o(String paramString, double paramDouble)
  {
    long l = this.nativeHandle;
    return decodeDouble(l, paramString, paramDouble);
  }
  
  public byte[] OooO0o0(String paramString, byte[] paramArrayOfByte)
  {
    long l = this.nativeHandle;
    paramString = decodeBytes(l, paramString);
    if (paramString != null) {
      paramArrayOfByte = paramString;
    }
    return paramArrayOfByte;
  }
  
  public float OooO0oO(String paramString, float paramFloat)
  {
    long l = this.nativeHandle;
    return decodeFloat(l, paramString, paramFloat);
  }
  
  public int OooO0oo(String paramString, int paramInt)
  {
    long l = this.nativeHandle;
    return decodeInt(l, paramString, paramInt);
  }
  
  public String OooOO0(String paramString1, String paramString2)
  {
    long l = this.nativeHandle;
    return decodeString(l, paramString1, paramString2);
  }
  
  public Set OooOO0O(String paramString, Set paramSet)
  {
    return OooOO0o(paramString, paramSet, HashSet.class);
  }
  
  public Set OooOO0o(String paramString, Set paramSet, Class paramClass)
  {
    long l = this.nativeHandle;
    paramString = decodeStringSet(l, paramString);
    if (paramString == null) {
      return paramSet;
    }
    try
    {
      paramClass = paramClass.newInstance();
      paramClass = (Set)paramClass;
      paramString = Arrays.asList(paramString);
      paramClass.addAll(paramString);
      return paramClass;
    }
    catch (IllegalAccessException|InstantiationException localIllegalAccessException) {}
    return paramSet;
  }
  
  public boolean OooOOo(String paramString, float paramFloat)
  {
    long l = this.nativeHandle;
    return encodeFloat(l, paramString, paramFloat);
  }
  
  public boolean OooOOo0(String paramString, double paramDouble)
  {
    long l = this.nativeHandle;
    return encodeDouble(l, paramString, paramDouble);
  }
  
  public boolean OooOOoo(String paramString, int paramInt)
  {
    long l = this.nativeHandle;
    return encodeInt(l, paramString, paramInt);
  }
  
  public boolean OooOo(String paramString, boolean paramBoolean)
  {
    long l = this.nativeHandle;
    return encodeBool(l, paramString, paramBoolean);
  }
  
  public boolean OooOo0(String paramString, Parcelable paramParcelable)
  {
    long l;
    if (paramParcelable == null)
    {
      l = this.nativeHandle;
      paramParcelable = null;
    }
    for (;;)
    {
      return encodeBytes(l, paramString, paramParcelable);
      Parcel localParcel = Parcel.obtain();
      int i = paramParcelable.describeContents();
      paramParcelable.writeToParcel(localParcel, i);
      paramParcelable = localParcel.marshall();
      localParcel.recycle();
      l = this.nativeHandle;
    }
  }
  
  public boolean OooOo00(String paramString, long paramLong)
  {
    long l = this.nativeHandle;
    return encodeLong(l, paramString, paramLong);
  }
  
  public boolean OooOo0O(String paramString1, String paramString2)
  {
    long l = this.nativeHandle;
    return encodeString(l, paramString1, paramString2);
  }
  
  public boolean OooOo0o(String paramString, Set paramSet)
  {
    long l = this.nativeHandle;
    if (paramSet == null)
    {
      paramSet = null;
    }
    else
    {
      String[] arrayOfString = new String[0];
      paramSet = (String[])paramSet.toArray(arrayOfString);
    }
    return encodeSet(l, paramString, paramSet);
  }
  
  public boolean OooOoO0(String paramString, byte[] paramArrayOfByte)
  {
    long l = this.nativeHandle;
    return encodeBytes(l, paramString, paramArrayOfByte);
  }
  
  public void OooOooo(String paramString)
  {
    long l = this.nativeHandle;
    removeValueForKey(l, paramString);
  }
  
  public native String[] allKeys();
  
  public void apply()
  {
    sync(false);
  }
  
  public native int ashmemFD();
  
  public native int ashmemMetaFD();
  
  public native void checkContentChangedByOuterProcess();
  
  public native void checkReSetCryptKey(String paramString);
  
  public SharedPreferences.Editor clear()
  {
    clearAll();
    return this;
  }
  
  public native void clearAll();
  
  public native void clearMemoryCache();
  
  public native void close();
  
  public boolean commit()
  {
    boolean bool = true;
    sync(bool);
    return bool;
  }
  
  public boolean contains(String paramString)
  {
    return OooO0O0(paramString);
  }
  
  public native String cryptKey();
  
  public SharedPreferences.Editor edit()
  {
    return this;
  }
  
  public Map getAll()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("Zg2E0A15050D18140F110F15162A543717235846252B2C1E2C2B1B1D64634F322167272D2E5027443B777771393541413136347D7A3437495D4344898983464652874F4C5A4F475049515C91504E51546164539966726C58A15A6E606F6E7260A66E6A76716767AD7172757B");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public boolean getBoolean(String paramString, boolean paramBoolean)
  {
    long l = this.nativeHandle;
    return decodeBool(l, paramString, paramBoolean);
  }
  
  public float getFloat(String paramString, float paramFloat)
  {
    long l = this.nativeHandle;
    return decodeFloat(l, paramString, paramFloat);
  }
  
  public int getInt(String paramString, int paramInt)
  {
    long l = this.nativeHandle;
    return decodeInt(l, paramString, paramInt);
  }
  
  public long getLong(String paramString, long paramLong)
  {
    long l = this.nativeHandle;
    return decodeLong(l, paramString, paramLong);
  }
  
  public String getString(String paramString1, String paramString2)
  {
    long l = this.nativeHandle;
    return decodeString(l, paramString1, paramString2);
  }
  
  public Set getStringSet(String paramString, Set paramSet)
  {
    return OooOO0O(paramString, paramSet);
  }
  
  public native void lock();
  
  public native String mmapID();
  
  public SharedPreferences.Editor putBoolean(String paramString, boolean paramBoolean)
  {
    long l = this.nativeHandle;
    encodeBool(l, paramString, paramBoolean);
    return this;
  }
  
  public SharedPreferences.Editor putFloat(String paramString, float paramFloat)
  {
    long l = this.nativeHandle;
    encodeFloat(l, paramString, paramFloat);
    return this;
  }
  
  public SharedPreferences.Editor putInt(String paramString, int paramInt)
  {
    long l = this.nativeHandle;
    encodeInt(l, paramString, paramInt);
    return this;
  }
  
  public SharedPreferences.Editor putLong(String paramString, long paramLong)
  {
    long l = this.nativeHandle;
    encodeLong(l, paramString, paramLong);
    return this;
  }
  
  public SharedPreferences.Editor putString(String paramString1, String paramString2)
  {
    long l = this.nativeHandle;
    encodeString(l, paramString1, paramString2);
    return this;
  }
  
  public SharedPreferences.Editor putStringSet(String paramString, Set paramSet)
  {
    OooOo0o(paramString, paramSet);
    return this;
  }
  
  public native boolean reKey(String paramString);
  
  public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    paramOnSharedPreferenceChangeListener = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("<S1A3E2939412C4043453B494A36802B4B37844C5137544C554E56418E565A913D3E3927");
    paramOnSharedPreferenceChangeListener.<init>(str);
    throw paramOnSharedPreferenceChangeListener;
  }
  
  public SharedPreferences.Editor remove(String paramString)
  {
    OooOooo(paramString);
    return this;
  }
  
  public native void removeValuesForKeys(String[] paramArrayOfString);
  
  public native void trim();
  
  public native boolean tryLock();
  
  public native void unlock();
  
  public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    paramOnSharedPreferenceChangeListener = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("<S1A3E2939412C4043453B494A36802B4B37844C5137544C554E56418E565A913D3E3927");
    paramOnSharedPreferenceChangeListener.<init>(str);
    throw paramOnSharedPreferenceChangeListener;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.tencent.mmkv.MMKV
 * JD-Core Version:    0.7.0.1
 */
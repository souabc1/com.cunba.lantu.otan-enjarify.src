package com.hjq.permissions;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.List;
import m54207b69;
import org.xmlpull.v1.XmlPullParser;

final class AndroidManifestParser
{
  public static AndroidManifestInfo.ActivityInfo OooO00o(XmlResourceParser paramXmlResourceParser)
  {
    AndroidManifestInfo.ActivityInfo localActivityInfo = new com/hjq/permissions/AndroidManifestInfo$ActivityInfo;
    localActivityInfo.<init>();
    String str1 = m54207b69.F54207b69_11("NI2729262F");
    String str2 = m54207b69.F54207b69_11("ic0B1819165D515217081410190E1D5B111D18231F1E1C63172427661D2F256A3026316E25312C37333230");
    str1 = paramXmlResourceParser.getAttributeValue(str2, str1);
    localActivityInfo.OooO00o = str1;
    str1 = m54207b69.F54207b69_11("/K383F3D3E283E453F232B324A4A463C11352C343B53534F45");
    boolean bool = paramXmlResourceParser.getAttributeBooleanValue(str2, str1, false);
    localActivityInfo.OooO0O0 = bool;
    return localActivityInfo;
  }
  
  public static AndroidManifestInfo OooO0O0(Context paramContext, int paramInt)
  {
    AndroidManifestInfo localAndroidManifestInfo = new com/hjq/permissions/AndroidManifestInfo;
    localAndroidManifestInfo.<init>();
    paramContext = paramContext.getAssets();
    Object localObject1 = m54207b69.F54207b69_11(";2735D584361605C865B65655F634E542B5A7070");
    paramContext = paramContext.openXmlResourceParser(paramInt, (String)localObject1);
    int j;
    label203:
    do
    {
      paramInt = paramContext.getEventType();
      int i = 2;
      if (paramInt == i)
      {
        Object localObject2 = paramContext.getName();
        localObject1 = m54207b69.F54207b69_11("hM202D25272F2D4440");
        j = TextUtils.equals((CharSequence)localObject1, (CharSequence)localObject2);
        if (j != 0)
        {
          j = 0;
          localObject3 = m54207b69.F54207b69_11(";o1F0F0E07120D10");
          localObject1 = paramContext.getAttributeValue(null, (String)localObject3);
          localAndroidManifestInfo.OooO00o = ((String)localObject1);
        }
        localObject1 = m54207b69.F54207b69_11("mh1D1C0F1E4920120A");
        j = TextUtils.equals((CharSequence)localObject1, (CharSequence)localObject2);
        if (j != 0)
        {
          localObject1 = OooO0o(paramContext);
          localAndroidManifestInfo.OooO0O0 = ((AndroidManifestInfo.UsesSdkInfo)localObject1);
        }
        localObject1 = m54207b69.F54207b69_11("{(5D5C4F5E095D53614D4A65664D5454");
        j = TextUtils.equals((CharSequence)localObject1, (CharSequence)localObject2);
        if (j == 0)
        {
          localObject1 = m54207b69.F54207b69_11("no1A1D0C1F462410240A0F2627120D0F512C1C16557171");
          j = TextUtils.equals((CharSequence)localObject1, (CharSequence)localObject2);
          if (j == 0)
          {
            localObject1 = m54207b69.F54207b69_11("N,59604B6205614F65494E696A515050106F59591455");
            j = TextUtils.equals((CharSequence)localObject1, (CharSequence)localObject2);
            if (j == 0) {
              break label203;
            }
          }
        }
        localObject1 = OooO0Oo(paramContext);
        Object localObject3 = localAndroidManifestInfo.OooO0OO;
        ((List)localObject3).add(localObject1);
        localObject1 = m54207b69.F54207b69_11("WG2638392E32292C3A363133");
        j = TextUtils.equals((CharSequence)localObject1, (CharSequence)localObject2);
        if (j != 0)
        {
          localObject1 = OooO0OO(paramContext);
          localAndroidManifestInfo.OooO0Oo = ((AndroidManifestInfo.ApplicationInfo)localObject1);
        }
        localObject1 = m54207b69.F54207b69_11(":'4645555155535965");
        j = TextUtils.equals((CharSequence)localObject1, (CharSequence)localObject2);
        if (j == 0)
        {
          localObject1 = m54207b69.F54207b69_11("f(494C5E44624662580D524E4C5568");
          j = TextUtils.equals((CharSequence)localObject1, (CharSequence)localObject2);
          if (j == 0) {}
        }
        else
        {
          localObject1 = OooO00o(paramContext);
          localObject3 = localAndroidManifestInfo.OooO0o0;
          ((List)localObject3).add(localObject1);
        }
        localObject1 = m54207b69.F54207b69_11("Bc100713180E050C");
        paramInt = TextUtils.equals((CharSequence)localObject1, (CharSequence)localObject2);
        if (paramInt != 0)
        {
          localObject2 = OooO0o0(paramContext);
          localObject1 = localAndroidManifestInfo.OooO0o;
          ((List)localObject1).add(localObject2);
        }
      }
      paramInt = paramContext.next();
      j = 1;
    } while (paramInt != j);
    paramContext.close();
    return localAndroidManifestInfo;
  }
  
  public static AndroidManifestInfo.ApplicationInfo OooO0OO(XmlResourceParser paramXmlResourceParser)
  {
    AndroidManifestInfo.ApplicationInfo localApplicationInfo = new com/hjq/permissions/AndroidManifestInfo$ApplicationInfo;
    localApplicationInfo.<init>();
    String str1 = m54207b69.F54207b69_11("NI2729262F");
    String str2 = m54207b69.F54207b69_11("ic0B1819165D515217081410190E1D5B111D18231F1E1C63172427661D2F256A3026316E25312C37333230");
    str1 = paramXmlResourceParser.getAttributeValue(str2, str1);
    localApplicationInfo.OooO00o = str1;
    str1 = m54207b69.F54207b69_11("SE37213633243B3710282B2E31480D4B4030483D373D2B47414F3D3C3B");
    boolean bool = paramXmlResourceParser.getAttributeBooleanValue(str2, str1, false);
    localApplicationInfo.OooO0O0 = bool;
    return localApplicationInfo;
  }
  
  public static AndroidManifestInfo.PermissionInfo OooO0Oo(XmlResourceParser paramXmlResourceParser)
  {
    AndroidManifestInfo.PermissionInfo localPermissionInfo = new com/hjq/permissions/AndroidManifestInfo$PermissionInfo;
    localPermissionInfo.<init>();
    String str1 = m54207b69.F54207b69_11("NI2729262F");
    String str2 = m54207b69.F54207b69_11("ic0B1819165D515217081410190E1D5B111D18231F1E1C63172427661D2F256A3026316E25312C37333230");
    str1 = paramXmlResourceParser.getAttributeValue(str2, str1);
    localPermissionInfo.OooO00o = str1;
    str1 = m54207b69.F54207b69_11("F,414E56824C4C805066684F4E4E");
    int i = paramXmlResourceParser.getAttributeIntValue(str2, str1, -1 >>> 1);
    localPermissionInfo.OooO0O0 = i;
    str1 = m54207b69.F54207b69_11(":f131605183A081A12171E1F1A15152E19171227");
    int j = paramXmlResourceParser.getAttributeIntValue(str2, str1, 0);
    localPermissionInfo.OooO0OO = j;
    return localPermissionInfo;
  }
  
  public static AndroidManifestInfo.UsesSdkInfo OooO0o(XmlResourceParser paramXmlResourceParser)
  {
    AndroidManifestInfo.UsesSdkInfo localUsesSdkInfo = new com/hjq/permissions/AndroidManifestInfo$UsesSdkInfo;
    localUsesSdkInfo.<init>();
    String str1 = m54207b69.F54207b69_11("/-404545814D4B814F67674E4D4F");
    String str2 = m54207b69.F54207b69_11("ic0B1819165D515217081410190E1D5B111D18231F1E1C63172427661D2F256A3026316E25312C37333230");
    int i = paramXmlResourceParser.getAttributeIntValue(str2, str1, 0);
    localUsesSdkInfo.OooO00o = i;
    return localUsesSdkInfo;
  }
  
  public static AndroidManifestInfo.ServiceInfo OooO0o0(XmlResourceParser paramXmlResourceParser)
  {
    AndroidManifestInfo.ServiceInfo localServiceInfo = new com/hjq/permissions/AndroidManifestInfo$ServiceInfo;
    localServiceInfo.<init>();
    String str1 = m54207b69.F54207b69_11("NI2729262F");
    String str2 = m54207b69.F54207b69_11("ic0B1819165D515217081410190E1D5B111D18231F1E1C63172427661D2F256A3026316E25312C37333230");
    str1 = paramXmlResourceParser.getAttributeValue(str2, str1);
    localServiceInfo.OooO00o = str1;
    str1 = m54207b69.F54207b69_11("=x081E0C18151011181F1F");
    paramXmlResourceParser = paramXmlResourceParser.getAttributeValue(str2, str1);
    localServiceInfo.OooO0O0 = paramXmlResourceParser;
    return localServiceInfo;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.hjq.permissions.AndroidManifestParser
 * JD-Core Version:    0.7.0.1
 */
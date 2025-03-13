package com.google.android.material.color;

import android.content.Context;
import android.content.res.Resources;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import m54207b69;

final class ColorResourcesTableCreator
{
  private static final byte ANDROID_PACKAGE_ID = 1;
  private static final ColorResourcesTableCreator.PackageInfo ANDROID_PACKAGE_INFO;
  private static final byte APPLICATION_PACKAGE_ID = 127;
  private static final Comparator COLOR_RESOURCE_COMPARATOR;
  private static final short HEADER_TYPE_PACKAGE = 512;
  private static final short HEADER_TYPE_RES_TABLE = 2;
  private static final short HEADER_TYPE_STRING_POOL = 1;
  private static final short HEADER_TYPE_TYPE = 513;
  private static final short HEADER_TYPE_TYPE_SPEC = 514;
  private static final String RESOURCE_TYPE_NAME_COLOR = "color";
  private static byte typeIdColor;
  
  static
  {
    Object localObject = new com/google/android/material/color/ColorResourcesTableCreator$PackageInfo;
    String str = m54207b69.F54207b69_11(")l0D030A21070A0E");
    ((ColorResourcesTableCreator.PackageInfo)localObject).<init>(1, str);
    ANDROID_PACKAGE_INFO = (ColorResourcesTableCreator.PackageInfo)localObject;
    localObject = new com/google/android/material/color/ColorResourcesTableCreator$1;
    ((ColorResourcesTableCreator.1)localObject).<init>();
    COLOR_RESOURCE_COMPARATOR = (Comparator)localObject;
  }
  
  private static byte[] charToByteArray(char paramChar)
  {
    byte[] arrayOfByte = new byte[2];
    int i = (byte)(paramChar & 0xFF);
    arrayOfByte[0] = i;
    paramChar = (byte)(paramChar >> '\b' & 0xFF);
    arrayOfByte[1] = paramChar;
    return arrayOfByte;
  }
  
  public static byte[] create(Context paramContext, Map paramMap)
  {
    Object localObject1 = paramMap.entrySet();
    boolean bool1 = ((Set)localObject1).isEmpty();
    if (!bool1)
    {
      localObject1 = new com/google/android/material/color/ColorResourcesTableCreator$PackageInfo;
      Object localObject2 = paramContext.getPackageName();
      int j = 127;
      ((ColorResourcesTableCreator.PackageInfo)localObject1).<init>(j, (String)localObject2);
      localObject2 = new java/util/HashMap;
      ((HashMap)localObject2).<init>();
      paramMap = paramMap.entrySet().iterator();
      int k = 0;
      ColorResourcesTableCreator.ColorResource localColorResource;
      for (Object localObject3 = null;; localObject3 = localColorResource)
      {
        boolean bool3 = paramMap.hasNext();
        if (!bool3) {
          break label457;
        }
        localObject3 = (Map.Entry)paramMap.next();
        localColorResource = new com/google/android/material/color/ColorResourcesTableCreator$ColorResource;
        int n = ((Integer)((Map.Entry)localObject3).getKey()).intValue();
        Object localObject4 = paramContext.getResources();
        int i1 = ((Integer)((Map.Entry)localObject3).getKey()).intValue();
        localObject4 = ((Resources)localObject4).getResourceName(i1);
        Integer localInteger = (Integer)((Map.Entry)localObject3).getValue();
        i1 = localInteger.intValue();
        localColorResource.<init>(n, (String)localObject4, i1);
        Object localObject5 = paramContext.getResources();
        k = ((Integer)((Map.Entry)localObject3).getKey()).intValue();
        localObject3 = ((Resources)localObject5).getResourceTypeName(k);
        localObject5 = m54207b69.F54207b69_11("P{181519170D");
        boolean bool2 = ((String)localObject3).equals(localObject5);
        if (!bool2) {
          break label378;
        }
        int m = ColorResourcesTableCreator.ColorResource.access$300(localColorResource);
        n = 1;
        if (m == n)
        {
          localObject3 = ANDROID_PACKAGE_INFO;
        }
        else
        {
          m = ColorResourcesTableCreator.ColorResource.access$300(localColorResource);
          if (m != j) {
            break;
          }
          localObject3 = localObject1;
        }
        boolean bool4 = ((Map)localObject2).containsKey(localObject3);
        if (!bool4)
        {
          localObject5 = new java/util/ArrayList;
          ((ArrayList)localObject5).<init>();
          ((Map)localObject2).put(localObject3, localObject5);
        }
        ((List)((Map)localObject2).get(localObject3)).add(localColorResource);
      }
      paramContext = new java/lang/IllegalArgumentException;
      paramMap = new java/lang/StringBuilder;
      paramMap.<init>();
      localObject1 = m54207b69.F54207b69_11("A27C5E4815454C484965495062621F536A566B245A706E72745D752C5D6F6E77727578347E7A2D38");
      paramMap.append((String)localObject1);
      int i = ColorResourcesTableCreator.ColorResource.access$300(localColorResource);
      paramMap.append(i);
      paramMap = paramMap.toString();
      paramContext.<init>(paramMap);
      throw paramContext;
      label378:
      paramContext = new java/lang/IllegalArgumentException;
      paramMap = new java/lang/StringBuilder;
      paramMap.<init>();
      localObject1 = m54207b69.F54207b69_11("%a2F0F1144061313151B4A1D0F1E1B22221215531A2229251C735A291B28217A");
      paramMap.append((String)localObject1);
      localObject1 = ColorResourcesTableCreator.ColorResource.access$100(localColorResource);
      paramMap.append((String)localObject1);
      localObject1 = m54207b69.F54207b69_11("5v5A5704120A18451953");
      paramMap.append((String)localObject1);
      localObject1 = Integer.toHexString(ColorResourcesTableCreator.ColorResource.access$200(localColorResource) & 0xFF);
      paramMap.append((String)localObject1);
      paramMap = paramMap.toString();
      paramContext.<init>(paramMap);
      throw paramContext;
      label457:
      byte b = ColorResourcesTableCreator.ColorResource.access$200((ColorResourcesTableCreator.ColorResource)localObject3);
      typeIdColor = b;
      if (b != 0)
      {
        paramContext = new java/io/ByteArrayOutputStream;
        paramContext.<init>();
        paramMap = new com/google/android/material/color/ColorResourcesTableCreator$ResTable;
        paramMap.<init>((Map)localObject2);
        paramMap.writeTo(paramContext);
        return paramContext.toByteArray();
      }
      paramContext = new java/lang/IllegalArgumentException;
      paramMap = m54207b69.F54207b69_11("cY17377B3D3A3A3C3281344635423939494C3B8B524A414D5491585046954E564A54575953475D53575E60A1");
      paramContext.<init>(paramMap);
      throw paramContext;
    }
    paramContext = new java/lang/IllegalArgumentException;
    paramMap = m54207b69.F54207b69_11("L{35155D1B181C1A1063122813201B17272E196D1E1D292329373739763931277A333B2B39383A382842383C3F4182");
    paramContext.<init>(paramMap);
    throw paramContext;
  }
  
  private static byte[] intToByteArray(int paramInt)
  {
    byte[] arrayOfByte = new byte[4];
    int i = (byte)(paramInt & 0xFF);
    arrayOfByte[0] = i;
    i = (byte)(paramInt >> 8 & 0xFF);
    arrayOfByte[1] = i;
    i = (byte)(paramInt >> 16 & 0xFF);
    arrayOfByte[2] = i;
    paramInt = (byte)(paramInt >> 24 & 0xFF);
    arrayOfByte[3] = paramInt;
    return arrayOfByte;
  }
  
  private static byte[] shortToByteArray(short paramShort)
  {
    byte[] arrayOfByte = new byte[2];
    int i = (byte)(paramShort & 0xFF);
    arrayOfByte[0] = i;
    paramShort = (byte)(paramShort >> 8 & 0xFF);
    arrayOfByte[1] = paramShort;
    return arrayOfByte;
  }
  
  private static byte[] stringToByteArray(String paramString)
  {
    paramString = paramString.toCharArray();
    int i = paramString.length * 2 + 4;
    byte[] arrayOfByte1 = new byte[i];
    byte[] arrayOfByte2 = shortToByteArray((short)paramString.length);
    int j = arrayOfByte2[0];
    arrayOfByte1[0] = j;
    j = 1;
    int k = arrayOfByte2[j];
    arrayOfByte1[j] = k;
    k = 0;
    arrayOfByte2 = null;
    for (;;)
    {
      int m = paramString.length;
      if (k >= m) {
        break;
      }
      byte[] arrayOfByte3 = charToByteArray(paramString[k]);
      int n = k * 2;
      int i1 = n + 2;
      int i2 = arrayOfByte3[0];
      arrayOfByte1[i1] = i2;
      n += 3;
      m = arrayOfByte3[j];
      arrayOfByte1[n] = m;
      k += 1;
    }
    int i3 = i + -2;
    arrayOfByte1[i3] = 0;
    i -= j;
    arrayOfByte1[i] = 0;
    return arrayOfByte1;
  }
  
  private static byte[] stringToByteArrayUtf8(String paramString)
  {
    Charset localCharset = Charset.forName(m54207b69.F54207b69_11("2i3C3E314755"));
    paramString = paramString.getBytes(localCharset);
    int i = (byte)paramString.length;
    int j = paramString.length + 3;
    byte[] arrayOfByte = new byte[j];
    System.arraycopy(paramString, 0, arrayOfByte, 2, i);
    int k = 1;
    arrayOfByte[k] = i;
    arrayOfByte[0] = i;
    j -= k;
    arrayOfByte[j] = 0;
    return arrayOfByte;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.ColorResourcesTableCreator
 * JD-Core Version:    0.7.0.1
 */
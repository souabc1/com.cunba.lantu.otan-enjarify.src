package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry;
import androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry;
import androidx.core.provider.FontsContractCompat.FontInfo;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

class TypefaceCompatApi24Impl
  extends TypefaceCompatBaseImpl
{
  public static final Class OooO0O0;
  public static final Constructor OooO0OO;
  public static final Method OooO0Oo;
  public static final Method OooO0o0;
  
  static
  {
    Object localObject1 = "android.graphics.FontFamily";
    Method localMethod;
    Object localObject2;
    Object localObject3;
    try
    {
      localObject1 = Class.forName((String)localObject1);
      localMethod = null;
      localObject2 = new Class[0];
      localObject2 = ((Class)localObject1).getConstructor((Class[])localObject2);
      localObject3 = "addFontWeightStyle";
      int i = 5;
      Object localObject4 = new Class[i];
      Object localObject5 = ByteBuffer.class;
      localObject4[0] = localObject5;
      localObject5 = Integer.TYPE;
      int j = 1;
      localObject4[j] = localObject5;
      Object localObject6 = List.class;
      int k = 2;
      localObject4[k] = localObject6;
      int m = 3;
      localObject4[m] = localObject5;
      localObject5 = Boolean.TYPE;
      m = 4;
      localObject4[m] = localObject5;
      localObject3 = ((Class)localObject1).getMethod((String)localObject3, (Class[])localObject4);
      localObject4 = Array.newInstance((Class)localObject1, j);
      localObject5 = Typeface.class;
      localObject6 = "createFromFamiliesWithDefault";
      Class[] arrayOfClass = new Class[j];
      localObject4 = localObject4.getClass();
      arrayOfClass[0] = localObject4;
      localMethod = ((Class)localObject5).getMethod((String)localObject6, arrayOfClass);
    }
    catch (ClassNotFoundException|NoSuchMethodException localClassNotFoundException)
    {
      localObject1 = null;
      localMethod = null;
      localObject2 = null;
      localObject3 = null;
    }
    OooO0OO = (Constructor)localObject2;
    OooO0O0 = (Class)localObject1;
    OooO0Oo = (Method)localObject3;
    OooO0o0 = localMethod;
  }
  
  public static boolean OooOO0O(Object paramObject, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    try
    {
      Method localMethod = OooO0Oo;
      int i = 5;
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = paramByteBuffer;
      paramByteBuffer = Integer.valueOf(paramInt1);
      paramInt1 = 1;
      arrayOfObject[paramInt1] = paramByteBuffer;
      int j = 2;
      paramInt1 = 0;
      arrayOfObject[j] = null;
      paramByteBuffer = Integer.valueOf(paramInt2);
      paramInt1 = 3;
      arrayOfObject[paramInt1] = paramByteBuffer;
      paramByteBuffer = Boolean.valueOf(paramBoolean);
      paramInt1 = 4;
      arrayOfObject[paramInt1] = paramByteBuffer;
      paramObject = localMethod.invoke(paramObject, arrayOfObject);
      paramObject = (Boolean)paramObject;
      return paramObject.booleanValue();
    }
    catch (IllegalAccessException|InvocationTargetException localIllegalAccessException) {}
    return false;
  }
  
  public static Typeface OooOO0o(Object paramObject)
  {
    try
    {
      Object localObject = OooO0O0;
      int i = 1;
      localObject = Array.newInstance((Class)localObject, i);
      i = 0;
      Array.set(localObject, 0, paramObject);
      paramObject = OooO0o0;
      localObject = new Object[] { localObject };
      paramObject = paramObject.invoke(null, (Object[])localObject);
      return (Typeface)paramObject;
    }
    catch (IllegalAccessException|InvocationTargetException localIllegalAccessException) {}
    return null;
  }
  
  public static Object OooOOO0()
  {
    try
    {
      Constructor localConstructor = OooO0OO;
      Object[] arrayOfObject = null;
      arrayOfObject = new Object[0];
      return localConstructor.newInstance(arrayOfObject);
    }
    catch (IllegalAccessException|InstantiationException|InvocationTargetException localIllegalAccessException) {}
    return null;
  }
  
  public static boolean isUsable()
  {
    Method localMethod = OooO0Oo;
    boolean bool;
    if (localMethod != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localMethod = null;
    }
    return bool;
  }
  
  public Typeface OooO0O0(Context paramContext, FontResourcesParserCompat.FontFamilyFilesResourceEntry paramFontFamilyFilesResourceEntry, Resources paramResources, int paramInt)
  {
    Object localObject1 = OooOOO0();
    if (localObject1 == null) {
      return null;
    }
    paramFontFamilyFilesResourceEntry = paramFontFamilyFilesResourceEntry.getEntries();
    int i = paramFontFamilyFilesResourceEntry.length;
    int j = 0;
    while (j < i)
    {
      Object localObject2 = paramFontFamilyFilesResourceEntry[j];
      int k = localObject2.getResourceId();
      ByteBuffer localByteBuffer = TypefaceCompatUtil.OooO0O0(paramContext, paramResources, k);
      if (localByteBuffer == null) {
        return null;
      }
      int m = localObject2.getTtcIndex();
      int n = localObject2.getWeight();
      boolean bool = localObject2.isItalic();
      bool = OooOO0O(localObject1, localByteBuffer, m, n, bool);
      if (!bool) {
        return null;
      }
      j += 1;
    }
    return OooOO0o(localObject1);
  }
  
  public Typeface OooO0OO(Context paramContext, CancellationSignal paramCancellationSignal, FontsContractCompat.FontInfo[] paramArrayOfFontInfo, int paramInt)
  {
    Object localObject = OooOOO0();
    if (localObject == null) {
      return null;
    }
    SimpleArrayMap localSimpleArrayMap = new androidx/collection/SimpleArrayMap;
    localSimpleArrayMap.<init>();
    int i = paramArrayOfFontInfo.length;
    int j = 0;
    while (j < i)
    {
      FontsContractCompat.FontInfo localFontInfo = paramArrayOfFontInfo[j];
      Uri localUri = localFontInfo.getUri();
      ByteBuffer localByteBuffer = (ByteBuffer)localSimpleArrayMap.get(localUri);
      if (localByteBuffer == null)
      {
        localByteBuffer = TypefaceCompatUtil.OooO0o(paramContext, paramCancellationSignal, localUri);
        localSimpleArrayMap.put(localUri, localByteBuffer);
      }
      if (localByteBuffer == null) {
        return null;
      }
      int k = localFontInfo.getTtcIndex();
      int m = localFontInfo.getWeight();
      boolean bool = localFontInfo.isItalic();
      bool = OooOO0O(localObject, localByteBuffer, k, m, bool);
      if (!bool) {
        return null;
      }
      j += 1;
    }
    paramContext = OooOO0o(localObject);
    if (paramContext == null) {
      return null;
    }
    return Typeface.create(paramContext, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.TypefaceCompatApi24Impl
 * JD-Core Version:    0.7.0.1
 */
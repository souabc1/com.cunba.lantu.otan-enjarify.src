package androidx.core.util;

import java.util.Locale;

public final class Preconditions
{
  public static Object OooO(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != null) {
      return paramObject1;
    }
    paramObject1 = new java/lang/NullPointerException;
    paramObject2 = String.valueOf(paramObject2);
    paramObject1.<init>(paramObject2);
    throw paramObject1;
  }
  
  public static void OooO00o(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>();
    throw localIllegalArgumentException;
  }
  
  public static void OooO0O0(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean) {
      return;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    paramObject = String.valueOf(paramObject);
    localIllegalArgumentException.<init>(paramObject);
    throw localIllegalArgumentException;
  }
  
  public static float OooO0OO(float paramFloat, String paramString)
  {
    boolean bool = Float.isNaN(paramFloat);
    if (!bool)
    {
      bool = Float.isInfinite(paramFloat);
      if (!bool) {
        return paramFloat;
      }
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append(paramString);
      localStringBuilder.append(" must not be infinite");
      paramString = localStringBuilder.toString();
      localIllegalArgumentException.<init>(paramString);
      throw localIllegalArgumentException;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(paramString);
    localStringBuilder.append(" must not be NaN");
    paramString = localStringBuilder.toString();
    localIllegalArgumentException.<init>(paramString);
    throw localIllegalArgumentException;
  }
  
  public static int OooO0Oo(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    if (paramInt1 >= paramInt2)
    {
      if (paramInt1 <= paramInt3) {
        return paramInt1;
      }
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localLocale = Locale.US;
      localObject = Integer.valueOf(paramInt2);
      localInteger = Integer.valueOf(paramInt3);
      Object[] tmp38_35 = new Object[3];
      Object[] tmp39_38 = tmp38_35;
      Object[] tmp39_38 = tmp38_35;
      tmp39_38[0] = paramString;
      tmp39_38[1] = localObject;
      tmp39_38[2] = localInteger;
      localObject = tmp39_38;
      localObject = String.format(localLocale, "%s is out of range of [%d, %d] (too high)", (Object[])localObject);
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    Locale localLocale = Locale.US;
    Object localObject = Integer.valueOf(paramInt2);
    Integer localInteger = Integer.valueOf(paramInt3);
    Object[] tmp100_97 = new Object[3];
    Object[] tmp101_100 = tmp100_97;
    Object[] tmp101_100 = tmp100_97;
    tmp101_100[0] = paramString;
    tmp101_100[1] = localObject;
    tmp101_100[2] = localInteger;
    localObject = tmp101_100;
    localObject = String.format(localLocale, "%s is out of range of [%d, %d] (too low)", (Object[])localObject);
    localIllegalArgumentException.<init>((String)localObject);
    throw localIllegalArgumentException;
  }
  
  public static int OooO0o(int paramInt, String paramString)
  {
    if (paramInt >= 0) {
      return paramInt;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>(paramString);
    throw localIllegalArgumentException;
  }
  
  public static int OooO0o0(int paramInt)
  {
    if (paramInt >= 0) {
      return paramInt;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>();
    throw localIllegalArgumentException;
  }
  
  public static int OooO0oO(int paramInt1, int paramInt2)
  {
    int i = paramInt1 & paramInt2;
    if (i == paramInt1) {
      return paramInt1;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Requested flags 0x");
    String str = Integer.toHexString(paramInt1);
    localStringBuilder.append(str);
    localStringBuilder.append(", but only 0x");
    str = Integer.toHexString(paramInt2);
    localStringBuilder.append(str);
    localStringBuilder.append(" are allowed");
    str = localStringBuilder.toString();
    localIllegalArgumentException.<init>(str);
    throw localIllegalArgumentException;
  }
  
  public static Object OooO0oo(Object paramObject)
  {
    paramObject.getClass();
    return paramObject;
  }
  
  public static void OooOO0(boolean paramBoolean)
  {
    OooOO0O(paramBoolean, null);
  }
  
  public static void OooOO0O(boolean paramBoolean, String paramString)
  {
    if (paramBoolean) {
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>(paramString);
    throw localIllegalStateException;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.util.Preconditions
 * JD-Core Version:    0.7.0.1
 */
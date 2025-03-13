package androidx.navigation;

import android.os.BaseBundle;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public abstract class NavType
{
  public static final NavType OooO;
  public static final NavType.Companion OooO0OO;
  public static final NavType OooO0Oo;
  public static final NavType OooO0o;
  public static final NavType OooO0o0;
  public static final NavType OooO0oO;
  public static final NavType OooO0oo;
  public static final NavType OooOO0;
  public static final NavType OooOO0O;
  public static final NavType OooOO0o;
  public static final NavType OooOOO;
  public static final NavType OooOOO0;
  public final boolean OooO00o;
  public final String OooO0O0;
  
  static
  {
    Object localObject = new androidx/navigation/NavType$Companion;
    ((NavType.Companion)localObject).<init>(null);
    OooO0OO = (NavType.Companion)localObject;
    localObject = new androidx/navigation/NavType$Companion$IntType$1;
    ((NavType.Companion.IntType.1)localObject).<init>();
    OooO0Oo = (NavType)localObject;
    localObject = new androidx/navigation/NavType$Companion$ReferenceType$1;
    ((NavType.Companion.ReferenceType.1)localObject).<init>();
    OooO0o0 = (NavType)localObject;
    localObject = new androidx/navigation/NavType$Companion$IntArrayType$1;
    ((NavType.Companion.IntArrayType.1)localObject).<init>();
    OooO0o = (NavType)localObject;
    localObject = new androidx/navigation/NavType$Companion$LongType$1;
    ((NavType.Companion.LongType.1)localObject).<init>();
    OooO0oO = (NavType)localObject;
    localObject = new androidx/navigation/NavType$Companion$LongArrayType$1;
    ((NavType.Companion.LongArrayType.1)localObject).<init>();
    OooO0oo = (NavType)localObject;
    localObject = new androidx/navigation/NavType$Companion$FloatType$1;
    ((NavType.Companion.FloatType.1)localObject).<init>();
    OooO = (NavType)localObject;
    localObject = new androidx/navigation/NavType$Companion$FloatArrayType$1;
    ((NavType.Companion.FloatArrayType.1)localObject).<init>();
    OooOO0 = (NavType)localObject;
    localObject = new androidx/navigation/NavType$Companion$BoolType$1;
    ((NavType.Companion.BoolType.1)localObject).<init>();
    OooOO0O = (NavType)localObject;
    localObject = new androidx/navigation/NavType$Companion$BoolArrayType$1;
    ((NavType.Companion.BoolArrayType.1)localObject).<init>();
    OooOO0o = (NavType)localObject;
    localObject = new androidx/navigation/NavType$Companion$StringType$1;
    ((NavType.Companion.StringType.1)localObject).<init>();
    OooOOO0 = (NavType)localObject;
    localObject = new androidx/navigation/NavType$Companion$StringArrayType$1;
    ((NavType.Companion.StringArrayType.1)localObject).<init>();
    OooOOO = (NavType)localObject;
  }
  
  public NavType(boolean paramBoolean)
  {
    this.OooO00o = paramBoolean;
    this.OooO0O0 = "nav_type";
  }
  
  public abstract Object OooO00o(Bundle paramBundle, String paramString);
  
  public final Object OooO0O0(Bundle paramBundle, String paramString1, String paramString2)
  {
    Intrinsics.OooO0o(paramBundle, "bundle");
    Intrinsics.OooO0o(paramString1, "key");
    Intrinsics.OooO0o(paramString2, "value");
    paramString2 = OooO0Oo(paramString2);
    OooO0o(paramBundle, paramString1, paramString2);
    return paramString2;
  }
  
  public final Object OooO0OO(Bundle paramBundle, String paramString1, String paramString2, Object paramObject)
  {
    Intrinsics.OooO0o(paramBundle, "bundle");
    String str = "key";
    Intrinsics.OooO0o(paramString1, str);
    boolean bool = paramBundle.containsKey(paramString1);
    if (bool)
    {
      if (paramString2 != null)
      {
        paramString2 = OooO0o0(paramString2, paramObject);
        OooO0o(paramBundle, paramString1, paramString2);
        return paramString2;
      }
      return paramObject;
    }
    paramBundle = new java/lang/IllegalArgumentException;
    paramBundle.<init>("There is no previous value in this bundle.");
    throw paramBundle;
  }
  
  public abstract Object OooO0Oo(String paramString);
  
  public abstract void OooO0o(Bundle paramBundle, String paramString, Object paramObject);
  
  public Object OooO0o0(String paramString, Object paramObject)
  {
    Intrinsics.OooO0o(paramString, "value");
    return OooO0Oo(paramString);
  }
  
  public String getName()
  {
    return this.OooO0O0;
  }
  
  public boolean isNullableAllowed()
  {
    return this.OooO00o;
  }
  
  public String toString()
  {
    return getName();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavType
 * JD-Core Version:    0.7.0.1
 */
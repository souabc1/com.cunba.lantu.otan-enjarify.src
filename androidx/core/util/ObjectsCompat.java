package androidx.core.util;

public class ObjectsCompat
{
  public static boolean OooO00o(Object paramObject1, Object paramObject2)
  {
    return ObjectsCompat.Api19Impl.OooO00o(paramObject1, paramObject2);
  }
  
  public static int OooO0O0(Object... paramVarArgs)
  {
    return ObjectsCompat.Api19Impl.OooO0O0(paramVarArgs);
  }
  
  public static Object OooO0OO(Object paramObject)
  {
    paramObject.getClass();
    return paramObject;
  }
  
  public static Object OooO0Oo(Object paramObject, String paramString)
  {
    if (paramObject != null) {
      return paramObject;
    }
    paramObject = new java/lang/NullPointerException;
    paramObject.<init>(paramString);
    throw paramObject;
  }
  
  public static String OooO0o0(Object paramObject, String paramString)
  {
    if (paramObject != null) {
      paramString = paramObject.toString();
    }
    return paramString;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.util.ObjectsCompat
 * JD-Core Version:    0.7.0.1
 */
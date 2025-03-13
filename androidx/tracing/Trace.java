package androidx.tracing;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class Trace
{
  public static long OooO00o;
  public static Method OooO0O0;
  
  public static void OooO00o(String paramString)
  {
    TraceApi18Impl.OooO00o(paramString);
  }
  
  public static void OooO0O0() {}
  
  public static void OooO0OO(String paramString, Exception paramException)
  {
    boolean bool1 = paramException instanceof InvocationTargetException;
    if (bool1)
    {
      paramString = ((Throwable)paramException).getCause();
      boolean bool2 = paramString instanceof RuntimeException;
      if (bool2) {
        throw ((RuntimeException)paramString);
      }
      paramException = new java/lang/RuntimeException;
      paramException.<init>(paramString);
      throw paramException;
    }
    paramException = new java/lang/StringBuilder;
    paramException.<init>();
    paramException.append("Unable to call ");
    paramException.append(paramString);
    paramException.append(" via reflection");
  }
  
  public static boolean isEnabled()
  {
    try
    {
      Method localMethod = OooO0O0;
      if (localMethod == null) {
        return OooO00o.OooO00o();
      }
    }
    catch (NoSuchMethodError|NoClassDefFoundError localNoSuchMethodError) {}
    return isEnabledFallback();
  }
  
  private static boolean isEnabledFallback()
  {
    Object localObject1 = android.os.Trace.class;
    String str = "isTagEnabled";
    try
    {
      Object localObject2 = OooO0O0;
      int i = 1;
      if (localObject2 == null)
      {
        localObject2 = "TRACE_TAG_APP";
        localObject2 = ((Class)localObject1).getField((String)localObject2);
        l = ((Field)localObject2).getLong(null);
        OooO00o = l;
        localObject2 = new Class[i];
        Class localClass = Long.TYPE;
        localObject2[0] = localClass;
        localObject1 = ((Class)localObject1).getMethod(str, (Class[])localObject2);
        OooO0O0 = (Method)localObject1;
      }
      localObject1 = OooO0O0;
      localObject2 = new Object[i];
      long l = OooO00o;
      Long localLong = Long.valueOf(l);
      localObject2[0] = localLong;
      localObject1 = ((Method)localObject1).invoke(null, (Object[])localObject2);
      localObject1 = (Boolean)localObject1;
      return ((Boolean)localObject1).booleanValue();
    }
    catch (Exception localException)
    {
      OooO0OO(str, localException);
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.tracing.Trace
 * JD-Core Version:    0.7.0.1
 */
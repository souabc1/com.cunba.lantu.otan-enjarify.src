package androidx.core.os;

import android.os.Build.VERSION;
import android.os.Trace;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class TraceCompat
{
  public static long OooO00o;
  public static Method OooO0O0;
  public static Method OooO0OO;
  public static Method OooO0Oo;
  public static Method OooO0o0;
  
  static
  {
    Object localObject1 = String.class;
    Trace localTrace = Trace.class;
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    Object localObject2;
    if (i < j) {
      localObject2 = "TRACE_TAG_APP";
    }
    try
    {
      localObject2 = localTrace.getField((String)localObject2);
      j = 0;
      long l = ((Field)localObject2).getLong(null);
      OooO00o = l;
      localObject2 = "isTagEnabled";
      j = 1;
      Class[] arrayOfClass1 = new Class[j];
      Class localClass1 = Long.TYPE;
      arrayOfClass1[0] = localClass1;
      localObject2 = localTrace.getMethod((String)localObject2, arrayOfClass1);
      OooO0O0 = (Method)localObject2;
      localObject2 = "asyncTraceBegin";
      int k = 3;
      Class[] arrayOfClass2 = new Class[k];
      arrayOfClass2[0] = localClass1;
      arrayOfClass2[j] = localObject1;
      Class localClass2 = Integer.TYPE;
      int m = 2;
      arrayOfClass2[m] = localClass2;
      localObject2 = localTrace.getMethod((String)localObject2, arrayOfClass2);
      OooO0OO = (Method)localObject2;
      localObject2 = "asyncTraceEnd";
      arrayOfClass2 = new Class[k];
      arrayOfClass2[0] = localClass1;
      arrayOfClass2[j] = localObject1;
      arrayOfClass2[m] = localClass2;
      localObject2 = localTrace.getMethod((String)localObject2, arrayOfClass2);
      OooO0Oo = (Method)localObject2;
      localObject2 = "traceCounter";
      arrayOfClass1 = new Class[k];
      arrayOfClass1[0] = localClass1;
      arrayOfClass1[j] = localObject1;
      arrayOfClass1[m] = localClass2;
      localObject1 = localTrace.getMethod((String)localObject2, arrayOfClass1);
      OooO0o0 = (Method)localObject1;
      label224:
      return;
    }
    catch (Exception localException)
    {
      break label224;
    }
  }
  
  public static void OooO00o(String paramString)
  {
    TraceCompat.Api18Impl.OooO00o(paramString);
  }
  
  public static void OooO0O0() {}
  
  public static boolean isEnabled()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 29;
    if (i >= j) {
      return TraceCompat.Api29Impl.isEnabled();
    }
    i = 0;
    try
    {
      Object localObject = OooO0O0;
      int k = 1;
      Object[] arrayOfObject = new Object[k];
      long l = OooO00o;
      Long localLong = Long.valueOf(l);
      arrayOfObject[0] = localLong;
      localLong = null;
      localObject = ((Method)localObject).invoke(null, arrayOfObject);
      localObject = (Boolean)localObject;
      bool = ((Boolean)localObject).booleanValue();
    }
    catch (Exception localException)
    {
      boolean bool;
      label69:
      break label69;
    }
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.os.TraceCompat
 * JD-Core Version:    0.7.0.1
 */
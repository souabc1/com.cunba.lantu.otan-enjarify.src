package com.xuexiang.xaop.logger;

import com.xuexiang.xaop.util.Strings.ISerializer;
import m54207b69;

public final class XLogger
{
  public static ILogger OooO00o;
  public static Strings.ISerializer OooO0O0;
  public static String OooO0OO = m54207b69.F54207b69_11("Kh33312B2A3C3A");
  public static boolean OooO0Oo = false;
  public static int OooO0o0 = 10;
  
  static
  {
    LogcatLogger localLogcatLogger = new com/xuexiang/xaop/logger/LogcatLogger;
    localLogcatLogger.<init>();
    OooO00o = localLogcatLogger;
  }
  
  private XLogger()
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    String str = m54207b69.F54207b69_11("'X1C387A393B317E3D454646833D43393B49473E444D415390");
    localUnsupportedOperationException.<init>(str);
    throw localUnsupportedOperationException;
  }
  
  public static void OooO00o(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    m54207b69.F54207b69_00(965, arrayOfObject);
  }
  
  public static void OooO0O0(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[1];
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[0] = localBoolean;
    m54207b69.F54207b69_00(966, arrayOfObject);
  }
  
  public static void OooO0OO(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    m54207b69.F54207b69_00(967, arrayOfObject);
  }
  
  public static void OooO0Oo(Throwable paramThrowable)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramThrowable;
    m54207b69.F54207b69_00(968, arrayOfObject);
  }
  
  public static boolean OooO0o0(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[0] = localInteger;
    return m54207b69.F54207b69_01(969, arrayOfObject);
  }
  
  public static Strings.ISerializer getISerializer()
  {
    Object[] arrayOfObject = new Object[0];
    return (Strings.ISerializer)m54207b69.F54207b69_09(970, arrayOfObject);
  }
  
  public static boolean isDebug()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(971, arrayOfObject);
  }
  
  public static void setDebug(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[1];
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[0] = localBoolean;
    m54207b69.F54207b69_00(972, arrayOfObject);
  }
  
  public static void setISerializer(Strings.ISerializer paramISerializer)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramISerializer;
    m54207b69.F54207b69_00(973, arrayOfObject);
  }
  
  public static void setLogger(ILogger paramILogger)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramILogger;
    m54207b69.F54207b69_00(974, arrayOfObject);
  }
  
  public static void setPriority(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[0] = localInteger;
    m54207b69.F54207b69_00(975, arrayOfObject);
  }
  
  public static void setTag(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    m54207b69.F54207b69_00(976, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xaop.logger.XLogger
 * JD-Core Version:    0.7.0.1
 */
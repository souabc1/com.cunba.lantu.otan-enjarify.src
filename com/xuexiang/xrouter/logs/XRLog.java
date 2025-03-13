package com.xuexiang.xrouter.logs;

import m54207b69;

public final class XRLog
{
  public static ILogger OooO00o;
  public static String OooO0O0 = m54207b69.F54207b69_11("lS080C033F2A2C3C2816");
  public static boolean OooO0OO = false;
  public static int OooO0Oo = 10;
  
  static
  {
    LogcatLogger localLogcatLogger = new com/xuexiang/xrouter/logs/LogcatLogger;
    localLogcatLogger.<init>();
    OooO00o = localLogcatLogger;
  }
  
  private XRLog()
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
    m54207b69.F54207b69_00(1819, arrayOfObject);
  }
  
  public static void OooO0O0(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[1];
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[0] = localBoolean;
    m54207b69.F54207b69_00(1820, arrayOfObject);
  }
  
  public static void OooO0OO(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    m54207b69.F54207b69_00(1821, arrayOfObject);
  }
  
  public static void OooO0Oo(String paramString, Throwable paramThrowable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = paramThrowable;
    m54207b69.F54207b69_00(1822, arrayOfObject);
  }
  
  public static void OooO0o(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    m54207b69.F54207b69_00(1823, arrayOfObject);
  }
  
  public static boolean OooO0o0(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[0] = localInteger;
    return m54207b69.F54207b69_01(1824, arrayOfObject);
  }
  
  public static void OooO0oO(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    m54207b69.F54207b69_00(1825, arrayOfObject);
  }
  
  public static void setDebug(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[1];
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[0] = localBoolean;
    m54207b69.F54207b69_00(1826, arrayOfObject);
  }
  
  public static void setLogger(ILogger paramILogger)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramILogger;
    m54207b69.F54207b69_00(1827, arrayOfObject);
  }
  
  public static void setPriority(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[0] = localInteger;
    m54207b69.F54207b69_00(1828, arrayOfObject);
  }
  
  public static void setTag(String paramString)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramString;
    m54207b69.F54207b69_00(1829, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xrouter.logs.XRLog
 * JD-Core Version:    0.7.0.1
 */
package com.google.zxing;

import m54207b69;

public abstract class ReaderException
  extends Exception
{
  protected static final StackTraceElement[] NO_TRACE = new StackTraceElement[0];
  protected static boolean isStackTrace;
  
  static
  {
    String str = System.getProperty(m54207b69.F54207b69_11("Pj19201A1210081E164C2719242A5117151B2A2B572E203419"));
    boolean bool;
    if (str != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      str = null;
    }
    isStackTrace = bool;
  }
  
  public ReaderException() {}
  
  public ReaderException(Throwable paramThrowable)
  {
    super(paramThrowable);
  }
  
  public static void setStackTrace(boolean paramBoolean)
  {
    isStackTrace = paramBoolean;
  }
  
  public final Throwable fillInStackTrace()
  {
    return null;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.ReaderException
 * JD-Core Version:    0.7.0.1
 */
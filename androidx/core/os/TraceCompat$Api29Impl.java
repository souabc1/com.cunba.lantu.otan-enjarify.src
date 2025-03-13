package androidx.core.os;

import android.os.Trace;

class TraceCompat$Api29Impl
{
  public static void OooO00o(String paramString, int paramInt)
  {
    Trace.beginAsyncSection(paramString, paramInt);
  }
  
  public static void OooO0O0(String paramString, int paramInt)
  {
    Trace.endAsyncSection(paramString, paramInt);
  }
  
  public static void OooO0OO(String paramString, long paramLong)
  {
    Trace.setCounter(paramString, paramLong);
  }
  
  public static boolean isEnabled()
  {
    return Trace.isEnabled();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.os.TraceCompat.Api29Impl
 * JD-Core Version:    0.7.0.1
 */
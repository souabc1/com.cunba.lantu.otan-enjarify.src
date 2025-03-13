package androidx.core.graphics;

import android.graphics.Paint;

public final class PaintCompat
{
  public static final ThreadLocal OooO00o;
  
  static
  {
    ThreadLocal localThreadLocal = new java/lang/ThreadLocal;
    localThreadLocal.<init>();
    OooO00o = localThreadLocal;
  }
  
  public static boolean OooO00o(Paint paramPaint, String paramString)
  {
    return PaintCompat.Api23Impl.OooO00o(paramPaint, paramString);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.PaintCompat
 * JD-Core Version:    0.7.0.1
 */
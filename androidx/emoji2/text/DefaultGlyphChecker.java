package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.TextPaint;
import androidx.core.graphics.PaintCompat;

class DefaultGlyphChecker
  implements EmojiCompat.GlyphChecker
{
  public static final ThreadLocal OooO0O0;
  public final TextPaint OooO00o;
  
  static
  {
    ThreadLocal localThreadLocal = new java/lang/ThreadLocal;
    localThreadLocal.<init>();
    OooO0O0 = localThreadLocal;
  }
  
  public DefaultGlyphChecker()
  {
    TextPaint localTextPaint = new android/text/TextPaint;
    localTextPaint.<init>();
    this.OooO00o = localTextPaint;
    localTextPaint.setTextSize(10.0F);
  }
  
  private static StringBuilder getStringBuilder()
  {
    ThreadLocal localThreadLocal = OooO0O0;
    Object localObject = localThreadLocal.get();
    if (localObject == null)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localThreadLocal.set(localObject);
    }
    return (StringBuilder)localThreadLocal.get();
  }
  
  public boolean OooO00o(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    StringBuilder localStringBuilder = getStringBuilder();
    char c = '\000';
    localStringBuilder.setLength(0);
    while (paramInt1 < paramInt2)
    {
      c = paramCharSequence.charAt(paramInt1);
      localStringBuilder.append(c);
      paramInt1 += 1;
    }
    paramCharSequence = this.OooO00o;
    String str = localStringBuilder.toString();
    return PaintCompat.OooO00o(paramCharSequence, str);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.DefaultGlyphChecker
 * JD-Core Version:    0.7.0.1
 */
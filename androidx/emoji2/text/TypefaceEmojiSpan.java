package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.text.TextPaint;

public final class TypefaceEmojiSpan
  extends EmojiSpan
{
  public static Paint o00OooO0;
  
  public TypefaceEmojiSpan(EmojiMetadata paramEmojiMetadata)
  {
    super(paramEmojiMetadata);
  }
  
  private static Paint getDebugPaint()
  {
    Object localObject = o00OooO0;
    if (localObject == null)
    {
      localObject = new android/text/TextPaint;
      ((TextPaint)localObject).<init>();
      o00OooO0 = (Paint)localObject;
      int i = EmojiCompat.get().getEmojiSpanIndicatorColor();
      ((Paint)localObject).setColor(i);
      localObject = o00OooO0;
      Paint.Style localStyle = Paint.Style.FILL;
      ((Paint)localObject).setStyle(localStyle);
    }
    return o00OooO0;
  }
  
  public void draw(Canvas paramCanvas, CharSequence paramCharSequence, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, Paint paramPaint)
  {
    paramCharSequence = EmojiCompat.get();
    boolean bool = paramCharSequence.isEmojiSpanIndicatorEnabled();
    if (bool)
    {
      float f1 = paramInt3;
      int i = getWidth();
      float f2 = i;
      float f3 = paramFloat + f2;
      float f4 = paramInt5;
      Paint localPaint = getDebugPaint();
      paramCanvas.drawRect(paramFloat, f1, f3, f4, localPaint);
    }
    paramCharSequence = getMetadata();
    float f5 = paramInt4;
    paramCharSequence.OooO00o(paramCanvas, paramFloat, f5, paramPaint);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.TypefaceEmojiSpan
 * JD-Core Version:    0.7.0.1
 */
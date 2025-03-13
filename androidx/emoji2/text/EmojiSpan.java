package androidx.emoji2.text;

import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.text.style.ReplacementSpan;
import androidx.core.util.Preconditions;

public abstract class EmojiSpan
  extends ReplacementSpan
{
  public final Paint.FontMetricsInt o00OoOoo;
  public short o00Ooo0;
  public final EmojiMetadata o00Ooo00;
  public short o00Ooo0O;
  public float o00Ooo0o;
  
  public EmojiSpan(EmojiMetadata paramEmojiMetadata)
  {
    Paint.FontMetricsInt localFontMetricsInt = new android/graphics/Paint$FontMetricsInt;
    localFontMetricsInt.<init>();
    this.o00OoOoo = localFontMetricsInt;
    short s = -1;
    this.o00Ooo0 = s;
    this.o00Ooo0O = s;
    this.o00Ooo0o = 1.0F;
    Preconditions.OooO(paramEmojiMetadata, "metadata cannot be null");
    this.o00Ooo00 = paramEmojiMetadata;
  }
  
  public final int getHeight()
  {
    return this.o00Ooo0O;
  }
  
  public final int getId()
  {
    return getMetadata().getId();
  }
  
  public final EmojiMetadata getMetadata()
  {
    return this.o00Ooo00;
  }
  
  public final float getRatio()
  {
    return this.o00Ooo0o;
  }
  
  public int getSize(Paint paramPaint, CharSequence paramCharSequence, int paramInt1, int paramInt2, Paint.FontMetricsInt paramFontMetricsInt)
  {
    paramCharSequence = this.o00OoOoo;
    paramPaint.getFontMetricsInt(paramCharSequence);
    paramPaint = this.o00OoOoo;
    int i = paramPaint.descent;
    int j = paramPaint.ascent;
    float f1 = Math.abs(i - j) * 1.0F;
    paramCharSequence = this.o00Ooo00;
    i = paramCharSequence.getHeight();
    float f2 = i;
    f1 /= f2;
    this.o00Ooo0o = f1;
    f1 = this.o00Ooo00.getHeight();
    f2 = this.o00Ooo0o;
    j = (short)(int)(f1 * f2);
    this.o00Ooo0O = j;
    paramPaint = this.o00Ooo00;
    f1 = paramPaint.getWidth();
    f2 = this.o00Ooo0o;
    f1 *= f2;
    j = (short)(int)f1;
    this.o00Ooo0 = j;
    if (paramFontMetricsInt != null)
    {
      paramCharSequence = this.o00OoOoo;
      paramInt1 = paramCharSequence.ascent;
      paramFontMetricsInt.ascent = paramInt1;
      paramInt1 = paramCharSequence.descent;
      paramFontMetricsInt.descent = paramInt1;
      paramInt1 = paramCharSequence.top;
      paramFontMetricsInt.top = paramInt1;
      i = paramCharSequence.bottom;
      paramFontMetricsInt.bottom = i;
    }
    return j;
  }
  
  public final int getWidth()
  {
    return this.o00Ooo0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.EmojiSpan
 * JD-Core Version:    0.7.0.1
 */
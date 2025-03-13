package androidx.emoji2.text;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.stream.IntStream;

class UnprecomputeTextOnModificationSpannable
  implements Spannable
{
  public boolean o00OoOoo = false;
  public Spannable o00Ooo00;
  
  public UnprecomputeTextOnModificationSpannable(Spannable paramSpannable)
  {
    this.o00Ooo00 = paramSpannable;
  }
  
  public UnprecomputeTextOnModificationSpannable(CharSequence paramCharSequence)
  {
    SpannableString localSpannableString = new android/text/SpannableString;
    localSpannableString.<init>(paramCharSequence);
    this.o00Ooo00 = localSpannableString;
  }
  
  public static UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector OooO0O0()
  {
    UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector_28 localPrecomputedTextDetector_28 = new androidx/emoji2/text/UnprecomputeTextOnModificationSpannable$PrecomputedTextDetector_28;
    localPrecomputedTextDetector_28.<init>();
    return localPrecomputedTextDetector_28;
  }
  
  public final void OooO00o()
  {
    Spannable localSpannable = this.o00Ooo00;
    boolean bool = this.o00OoOoo;
    if (!bool)
    {
      Object localObject = OooO0O0();
      bool = ((UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector)localObject).OooO00o(localSpannable);
      if (bool)
      {
        localObject = new android/text/SpannableString;
        ((SpannableString)localObject).<init>(localSpannable);
        this.o00Ooo00 = ((Spannable)localObject);
      }
    }
    this.o00OoOoo = true;
  }
  
  public char charAt(int paramInt)
  {
    return this.o00Ooo00.charAt(paramInt);
  }
  
  public IntStream chars()
  {
    return UnprecomputeTextOnModificationSpannable.CharSequenceHelper_API24.OooO00o(this.o00Ooo00);
  }
  
  public IntStream codePoints()
  {
    return UnprecomputeTextOnModificationSpannable.CharSequenceHelper_API24.OooO0O0(this.o00Ooo00);
  }
  
  public int getSpanEnd(Object paramObject)
  {
    return this.o00Ooo00.getSpanEnd(paramObject);
  }
  
  public int getSpanFlags(Object paramObject)
  {
    return this.o00Ooo00.getSpanFlags(paramObject);
  }
  
  public int getSpanStart(Object paramObject)
  {
    return this.o00Ooo00.getSpanStart(paramObject);
  }
  
  public Object[] getSpans(int paramInt1, int paramInt2, Class paramClass)
  {
    return this.o00Ooo00.getSpans(paramInt1, paramInt2, paramClass);
  }
  
  public Spannable getUnwrappedSpannable()
  {
    return this.o00Ooo00;
  }
  
  public int length()
  {
    return this.o00Ooo00.length();
  }
  
  public int nextSpanTransition(int paramInt1, int paramInt2, Class paramClass)
  {
    return this.o00Ooo00.nextSpanTransition(paramInt1, paramInt2, paramClass);
  }
  
  public void removeSpan(Object paramObject)
  {
    OooO00o();
    this.o00Ooo00.removeSpan(paramObject);
  }
  
  public void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    OooO00o();
    this.o00Ooo00.setSpan(paramObject, paramInt1, paramInt2, paramInt3);
  }
  
  public CharSequence subSequence(int paramInt1, int paramInt2)
  {
    return this.o00Ooo00.subSequence(paramInt1, paramInt2);
  }
  
  public String toString()
  {
    return this.o00Ooo00.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.UnprecomputeTextOnModificationSpannable
 * JD-Core Version:    0.7.0.1
 */
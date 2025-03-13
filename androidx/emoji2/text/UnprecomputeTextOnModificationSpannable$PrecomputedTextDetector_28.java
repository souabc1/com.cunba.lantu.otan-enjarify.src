package androidx.emoji2.text;

import android.text.PrecomputedText;
import androidx.core.text.PrecomputedTextCompat;

class UnprecomputeTextOnModificationSpannable$PrecomputedTextDetector_28
  extends UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector
{
  public boolean OooO00o(CharSequence paramCharSequence)
  {
    boolean bool1 = paramCharSequence instanceof PrecomputedText;
    if (!bool1)
    {
      bool2 = paramCharSequence instanceof PrecomputedTextCompat;
      if (!bool2)
      {
        bool2 = false;
        paramCharSequence = null;
        return bool2;
      }
    }
    boolean bool2 = true;
    return bool2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector_28
 * JD-Core Version:    0.7.0.1
 */
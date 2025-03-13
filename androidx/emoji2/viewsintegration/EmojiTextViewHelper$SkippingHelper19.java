package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.emoji2.text.EmojiCompat;

class EmojiTextViewHelper$SkippingHelper19
  extends EmojiTextViewHelper.HelperInternal
{
  public final EmojiTextViewHelper.HelperInternal19 OooO00o;
  
  public EmojiTextViewHelper$SkippingHelper19(TextView paramTextView)
  {
    EmojiTextViewHelper.HelperInternal19 localHelperInternal19 = new androidx/emoji2/viewsintegration/EmojiTextViewHelper$HelperInternal19;
    localHelperInternal19.<init>(paramTextView);
    this.OooO00o = localHelperInternal19;
  }
  
  public InputFilter[] OooO00o(InputFilter[] paramArrayOfInputFilter)
  {
    boolean bool = OooO0OO();
    if (bool) {
      return paramArrayOfInputFilter;
    }
    return this.OooO00o.OooO00o(paramArrayOfInputFilter);
  }
  
  public TransformationMethod OooO0O0(TransformationMethod paramTransformationMethod)
  {
    boolean bool = OooO0OO();
    if (bool) {
      return paramTransformationMethod;
    }
    return this.OooO00o.OooO0O0(paramTransformationMethod);
  }
  
  public final boolean OooO0OO()
  {
    return EmojiCompat.isConfigured() ^ true;
  }
  
  public boolean isEnabled()
  {
    return this.OooO00o.isEnabled();
  }
  
  public void setAllCaps(boolean paramBoolean)
  {
    boolean bool = OooO0OO();
    if (bool) {
      return;
    }
    this.OooO00o.setAllCaps(paramBoolean);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    boolean bool = OooO0OO();
    EmojiTextViewHelper.HelperInternal19 localHelperInternal19;
    if (bool)
    {
      localHelperInternal19 = this.OooO00o;
      localHelperInternal19.setEnabledUnsafe(paramBoolean);
    }
    else
    {
      localHelperInternal19 = this.OooO00o;
      localHelperInternal19.setEnabled(paramBoolean);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiTextViewHelper.SkippingHelper19
 * JD-Core Version:    0.7.0.1
 */
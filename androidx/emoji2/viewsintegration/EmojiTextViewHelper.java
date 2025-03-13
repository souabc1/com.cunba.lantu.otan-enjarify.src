package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.core.util.Preconditions;

public final class EmojiTextViewHelper
{
  public final EmojiTextViewHelper.HelperInternal OooO00o;
  
  public EmojiTextViewHelper(TextView paramTextView, boolean paramBoolean)
  {
    String str = "textView cannot be null";
    Preconditions.OooO(paramTextView, str);
    Object localObject;
    if (!paramBoolean)
    {
      localObject = new androidx/emoji2/viewsintegration/EmojiTextViewHelper$SkippingHelper19;
      ((EmojiTextViewHelper.SkippingHelper19)localObject).<init>(paramTextView);
    }
    else
    {
      localObject = new androidx/emoji2/viewsintegration/EmojiTextViewHelper$HelperInternal19;
      ((EmojiTextViewHelper.HelperInternal19)localObject).<init>(paramTextView);
    }
    this.OooO00o = ((EmojiTextViewHelper.HelperInternal)localObject);
  }
  
  public InputFilter[] OooO00o(InputFilter[] paramArrayOfInputFilter)
  {
    return this.OooO00o.OooO00o(paramArrayOfInputFilter);
  }
  
  public TransformationMethod OooO0O0(TransformationMethod paramTransformationMethod)
  {
    return this.OooO00o.OooO0O0(paramTransformationMethod);
  }
  
  public boolean isEnabled()
  {
    return this.OooO00o.isEnabled();
  }
  
  public void setAllCaps(boolean paramBoolean)
  {
    this.OooO00o.setAllCaps(paramBoolean);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    this.OooO00o.setEnabled(paramBoolean);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiTextViewHelper
 * JD-Core Version:    0.7.0.1
 */
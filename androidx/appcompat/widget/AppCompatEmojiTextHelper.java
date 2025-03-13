package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.R.styleable;
import androidx.emoji2.viewsintegration.EmojiTextViewHelper;

class AppCompatEmojiTextHelper
{
  public final TextView OooO00o;
  public final EmojiTextViewHelper OooO0O0;
  
  public AppCompatEmojiTextHelper(TextView paramTextView)
  {
    this.OooO00o = paramTextView;
    EmojiTextViewHelper localEmojiTextViewHelper = new androidx/emoji2/viewsintegration/EmojiTextViewHelper;
    localEmojiTextViewHelper.<init>(paramTextView, false);
    this.OooO0O0 = localEmojiTextViewHelper;
  }
  
  public InputFilter[] OooO00o(InputFilter[] paramArrayOfInputFilter)
  {
    return this.OooO0O0.OooO00o(paramArrayOfInputFilter);
  }
  
  public void OooO0O0(AttributeSet paramAttributeSet, int paramInt)
  {
    Context localContext = this.OooO00o.getContext();
    int[] arrayOfInt = R.styleable.AppCompatTextView;
    paramAttributeSet = localContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt, 0);
    try
    {
      paramInt = R.styleable.AppCompatTextView_emojiCompatEnabled;
      paramInt = paramAttributeSet.hasValue(paramInt);
      boolean bool = true;
      if (paramInt != 0)
      {
        paramInt = R.styleable.AppCompatTextView_emojiCompatEnabled;
        bool = paramAttributeSet.getBoolean(paramInt, bool);
      }
      paramAttributeSet.recycle();
      setEnabled(bool);
      return;
    }
    finally
    {
      paramAttributeSet.recycle();
    }
  }
  
  public TransformationMethod OooO0OO(TransformationMethod paramTransformationMethod)
  {
    return this.OooO0O0.OooO0O0(paramTransformationMethod);
  }
  
  public boolean isEnabled()
  {
    return this.OooO0O0.isEnabled();
  }
  
  public void setAllCaps(boolean paramBoolean)
  {
    this.OooO0O0.setAllCaps(paramBoolean);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    this.OooO0O0.setEnabled(paramBoolean);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatEmojiTextHelper
 * JD-Core Version:    0.7.0.1
 */
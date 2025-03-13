package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.EmojiCompat.InitCallback;

final class EmojiInputFilter
  implements InputFilter
{
  public final TextView OooO00o;
  public EmojiCompat.InitCallback OooO0O0;
  
  public EmojiInputFilter(TextView paramTextView)
  {
    this.OooO00o = paramTextView;
  }
  
  public static void OooO00o(Spannable paramSpannable, int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt2 >= 0)) {
      Selection.setSelection(paramSpannable, paramInt1, paramInt2);
    } else if (paramInt1 >= 0) {
      Selection.setSelection(paramSpannable, paramInt1);
    } else if (paramInt2 >= 0) {
      Selection.setSelection(paramSpannable, paramInt2);
    }
  }
  
  private EmojiCompat.InitCallback getInitCallback()
  {
    Object localObject = this.OooO0O0;
    if (localObject == null)
    {
      localObject = new androidx/emoji2/viewsintegration/EmojiInputFilter$InitCallbackImpl;
      TextView localTextView = this.OooO00o;
      ((EmojiInputFilter.InitCallbackImpl)localObject).<init>(localTextView, this);
      this.OooO0O0 = ((EmojiCompat.InitCallback)localObject);
    }
    return this.OooO0O0;
  }
  
  public CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
  {
    Object localObject = this.OooO00o;
    boolean bool = ((View)localObject).isInEditMode();
    if (bool) {
      return paramCharSequence;
    }
    localObject = EmojiCompat.get();
    int i = ((EmojiCompat)localObject).getLoadState();
    if (i != 0)
    {
      int j = 1;
      if (i != j)
      {
        paramInt1 = 3;
        if (i != paramInt1) {
          return paramCharSequence;
        }
      }
      else
      {
        i = 0;
        localObject = null;
        int k;
        if ((paramInt4 == 0) && (paramInt3 == 0))
        {
          k = paramSpanned.length();
          if (k == 0)
          {
            paramSpanned = this.OooO00o.getText();
            if (paramCharSequence == paramSpanned) {
              j = 0;
            }
          }
        }
        if ((j != 0) && (paramCharSequence != null))
        {
          if (paramInt1 == 0)
          {
            k = paramCharSequence.length();
            if (paramInt2 == k) {}
          }
          else
          {
            paramCharSequence = paramCharSequence.subSequence(paramInt1, paramInt2);
          }
          localEmojiCompat = EmojiCompat.get();
          paramInt2 = paramCharSequence.length();
          paramCharSequence = localEmojiCompat.OooOO0(paramCharSequence, 0, paramInt2);
        }
        return paramCharSequence;
      }
    }
    EmojiCompat localEmojiCompat = EmojiCompat.get();
    EmojiCompat.InitCallback localInitCallback = getInitCallback();
    localEmojiCompat.OooOOO0(localInitCallback);
    return paramCharSequence;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiInputFilter
 * JD-Core Version:    0.7.0.1
 */
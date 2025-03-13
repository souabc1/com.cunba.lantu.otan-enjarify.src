package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.view.View;
import android.widget.TextView;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.EmojiCompat.InitCallback;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

class EmojiInputFilter$InitCallbackImpl
  extends EmojiCompat.InitCallback
{
  public final Reference OooO00o;
  public final Reference OooO0O0;
  
  public EmojiInputFilter$InitCallbackImpl(TextView paramTextView, EmojiInputFilter paramEmojiInputFilter)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramTextView);
    this.OooO00o = localWeakReference;
    paramTextView = new java/lang/ref/WeakReference;
    paramTextView.<init>(paramEmojiInputFilter);
    this.OooO0O0 = paramTextView;
  }
  
  public void OooO0O0()
  {
    super.OooO0O0();
    TextView localTextView = (TextView)this.OooO00o.get();
    Object localObject1 = (InputFilter)this.OooO0O0.get();
    boolean bool1 = OooO0OO(localTextView, (InputFilter)localObject1);
    if (!bool1) {
      return;
    }
    bool1 = localTextView.isAttachedToWindow();
    if (bool1)
    {
      localObject1 = localTextView.getText();
      Object localObject2 = EmojiCompat.get().OooO((CharSequence)localObject1);
      if (localObject1 == localObject2) {
        return;
      }
      int i = Selection.getSelectionStart((CharSequence)localObject2);
      int j = Selection.getSelectionEnd((CharSequence)localObject2);
      localTextView.setText((CharSequence)localObject2);
      boolean bool2 = localObject2 instanceof Spannable;
      if (bool2)
      {
        localObject2 = (Spannable)localObject2;
        EmojiInputFilter.OooO00o((Spannable)localObject2, i, j);
      }
    }
  }
  
  public final boolean OooO0OO(TextView paramTextView, InputFilter paramInputFilter)
  {
    if ((paramInputFilter != null) && (paramTextView != null))
    {
      paramTextView = paramTextView.getFilters();
      if (paramTextView == null) {
        return false;
      }
      int i = 0;
      for (;;)
      {
        int j = paramTextView.length;
        if (i >= j) {
          break;
        }
        Object localObject = paramTextView[i];
        if (localObject == paramInputFilter) {
          return true;
        }
        i += 1;
      }
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiInputFilter.InitCallbackImpl
 * JD-Core Version:    0.7.0.1
 */
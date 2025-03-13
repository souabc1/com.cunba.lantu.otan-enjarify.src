package androidx.emoji2.viewsintegration;

import android.widget.EditText;
import androidx.emoji2.text.EmojiCompat.InitCallback;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

class EmojiTextWatcher$InitCallbackImpl
  extends EmojiCompat.InitCallback
{
  public final Reference OooO00o;
  
  public EmojiTextWatcher$InitCallbackImpl(EditText paramEditText)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramEditText);
    this.OooO00o = localWeakReference;
  }
  
  public void OooO0O0()
  {
    super.OooO0O0();
    EmojiTextWatcher.OooO00o((EditText)this.OooO00o.get(), 1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiTextWatcher.InitCallbackImpl
 * JD-Core Version:    0.7.0.1
 */
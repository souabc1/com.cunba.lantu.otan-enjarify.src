package androidx.appcompat.widget;

import androidx.emoji2.text.EmojiCompat.InitCallback;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

class SwitchCompat$EmojiCompatInitCallback
  extends EmojiCompat.InitCallback
{
  public final Reference OooO00o;
  
  public SwitchCompat$EmojiCompatInitCallback(SwitchCompat paramSwitchCompat)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramSwitchCompat);
    this.OooO00o = localWeakReference;
  }
  
  public void OooO00o(Throwable paramThrowable)
  {
    paramThrowable = (SwitchCompat)this.OooO00o.get();
    if (paramThrowable != null) {
      paramThrowable.onEmojiCompatInitializedForSwitchText();
    }
  }
  
  public void OooO0O0()
  {
    SwitchCompat localSwitchCompat = (SwitchCompat)this.OooO00o.get();
    if (localSwitchCompat != null) {
      localSwitchCompat.onEmojiCompatInitializedForSwitchText();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.SwitchCompat.EmojiCompatInitCallback
 * JD-Core Version:    0.7.0.1
 */
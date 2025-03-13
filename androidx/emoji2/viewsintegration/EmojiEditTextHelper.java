package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.util.Preconditions;

public final class EmojiEditTextHelper
{
  public final EmojiEditTextHelper.HelperInternal OooO00o;
  public int OooO0O0 = -1 >>> 1;
  public int OooO0OO = 0;
  
  public EmojiEditTextHelper(EditText paramEditText, boolean paramBoolean)
  {
    Preconditions.OooO(paramEditText, "editText cannot be null");
    EmojiEditTextHelper.HelperInternal19 localHelperInternal19 = new androidx/emoji2/viewsintegration/EmojiEditTextHelper$HelperInternal19;
    localHelperInternal19.<init>(paramEditText, paramBoolean);
    this.OooO00o = localHelperInternal19;
  }
  
  public KeyListener OooO00o(KeyListener paramKeyListener)
  {
    return this.OooO00o.OooO00o(paramKeyListener);
  }
  
  public InputConnection OooO0O0(InputConnection paramInputConnection, EditorInfo paramEditorInfo)
  {
    if (paramInputConnection == null) {
      return null;
    }
    return this.OooO00o.OooO0O0(paramInputConnection, paramEditorInfo);
  }
  
  public int getEmojiReplaceStrategy()
  {
    return this.OooO0OO;
  }
  
  public int getMaxEmojiCount()
  {
    return this.OooO0O0;
  }
  
  public boolean isEnabled()
  {
    return this.OooO00o.isEnabled();
  }
  
  public void setEmojiReplaceStrategy(int paramInt)
  {
    this.OooO0OO = paramInt;
    this.OooO00o.setEmojiReplaceStrategy(paramInt);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    this.OooO00o.setEnabled(paramBoolean);
  }
  
  public void setMaxEmojiCount(int paramInt)
  {
    Preconditions.OooO0o(paramInt, "maxEmojiCount should be greater than 0");
    this.OooO0O0 = paramInt;
    this.OooO00o.setMaxEmojiCount(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiEditTextHelper
 * JD-Core Version:    0.7.0.1
 */
package androidx.emoji2.viewsintegration;

import android.text.Editable.Factory;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;

class EmojiEditTextHelper$HelperInternal19
  extends EmojiEditTextHelper.HelperInternal
{
  public final EditText OooO00o;
  public final EmojiTextWatcher OooO0O0;
  
  public EmojiEditTextHelper$HelperInternal19(EditText paramEditText, boolean paramBoolean)
  {
    this.OooO00o = paramEditText;
    EmojiTextWatcher localEmojiTextWatcher = new androidx/emoji2/viewsintegration/EmojiTextWatcher;
    localEmojiTextWatcher.<init>(paramEditText, paramBoolean);
    this.OooO0O0 = localEmojiTextWatcher;
    paramEditText.addTextChangedListener(localEmojiTextWatcher);
    Editable.Factory localFactory = EmojiEditableFactory.getInstance();
    paramEditText.setEditableFactory(localFactory);
  }
  
  public KeyListener OooO00o(KeyListener paramKeyListener)
  {
    boolean bool = paramKeyListener instanceof EmojiKeyListener;
    if (bool) {
      return (KeyListener)paramKeyListener;
    }
    if (paramKeyListener == null) {
      return null;
    }
    bool = paramKeyListener instanceof NumberKeyListener;
    if (bool) {
      return (KeyListener)paramKeyListener;
    }
    EmojiKeyListener localEmojiKeyListener = new androidx/emoji2/viewsintegration/EmojiKeyListener;
    localEmojiKeyListener.<init>(paramKeyListener);
    return localEmojiKeyListener;
  }
  
  public InputConnection OooO0O0(InputConnection paramInputConnection, EditorInfo paramEditorInfo)
  {
    boolean bool = paramInputConnection instanceof EmojiInputConnection;
    if (bool) {
      return (InputConnection)paramInputConnection;
    }
    EmojiInputConnection localEmojiInputConnection = new androidx/emoji2/viewsintegration/EmojiInputConnection;
    EditText localEditText = this.OooO00o;
    localEmojiInputConnection.<init>(localEditText, paramInputConnection, paramEditorInfo);
    return localEmojiInputConnection;
  }
  
  public boolean isEnabled()
  {
    return this.OooO0O0.isEnabled();
  }
  
  public void setEmojiReplaceStrategy(int paramInt)
  {
    this.OooO0O0.setEmojiReplaceStrategy(paramInt);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    this.OooO0O0.setEnabled(paramBoolean);
  }
  
  public void setMaxEmojiCount(int paramInt)
  {
    this.OooO0O0.setMaxEmojiCount(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal19
 * JD-Core Version:    0.7.0.1
 */
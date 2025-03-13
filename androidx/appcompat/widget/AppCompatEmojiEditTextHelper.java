package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.appcompat.R.styleable;
import androidx.emoji2.viewsintegration.EmojiEditTextHelper;

class AppCompatEmojiEditTextHelper
{
  public final EditText OooO00o;
  public final EmojiEditTextHelper OooO0O0;
  
  public AppCompatEmojiEditTextHelper(EditText paramEditText)
  {
    this.OooO00o = paramEditText;
    EmojiEditTextHelper localEmojiEditTextHelper = new androidx/emoji2/viewsintegration/EmojiEditTextHelper;
    localEmojiEditTextHelper.<init>(paramEditText, false);
    this.OooO0O0 = localEmojiEditTextHelper;
  }
  
  public KeyListener OooO00o(KeyListener paramKeyListener)
  {
    boolean bool = OooO0O0(paramKeyListener);
    if (bool)
    {
      EmojiEditTextHelper localEmojiEditTextHelper = this.OooO0O0;
      paramKeyListener = localEmojiEditTextHelper.OooO00o(paramKeyListener);
    }
    return paramKeyListener;
  }
  
  public boolean OooO0O0(KeyListener paramKeyListener)
  {
    return paramKeyListener instanceof NumberKeyListener ^ true;
  }
  
  public void OooO0OO(AttributeSet paramAttributeSet, int paramInt)
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
  
  public InputConnection OooO0Oo(InputConnection paramInputConnection, EditorInfo paramEditorInfo)
  {
    return this.OooO0O0.OooO0O0(paramInputConnection, paramEditorInfo);
  }
  
  public boolean isEnabled()
  {
    return this.OooO0O0.isEnabled();
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    this.OooO0O0.setEnabled(paramBoolean);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatEmojiEditTextHelper
 * JD-Core Version:    0.7.0.1
 */
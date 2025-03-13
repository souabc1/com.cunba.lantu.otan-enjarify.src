package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

final class EmojiInputConnection
  extends InputConnectionWrapper
{
  public final TextView OooO00o;
  public final EmojiInputConnection.EmojiCompatDeleteHelper OooO0O0;
  
  public EmojiInputConnection(TextView paramTextView, InputConnection paramInputConnection, EditorInfo paramEditorInfo)
  {
    this(paramTextView, paramInputConnection, paramEditorInfo, localEmojiCompatDeleteHelper);
  }
  
  public EmojiInputConnection(TextView paramTextView, InputConnection paramInputConnection, EditorInfo paramEditorInfo, EmojiInputConnection.EmojiCompatDeleteHelper paramEmojiCompatDeleteHelper)
  {
    super(paramInputConnection, false);
    this.OooO00o = paramTextView;
    this.OooO0O0 = paramEmojiCompatDeleteHelper;
    paramEmojiCompatDeleteHelper.OooO0O0(paramEditorInfo);
  }
  
  private Editable getEditable()
  {
    return this.OooO00o.getEditableText();
  }
  
  public boolean deleteSurroundingText(int paramInt1, int paramInt2)
  {
    EmojiInputConnection.EmojiCompatDeleteHelper localEmojiCompatDeleteHelper = this.OooO0O0;
    Editable localEditable = getEditable();
    boolean bool = localEmojiCompatDeleteHelper.OooO00o(this, localEditable, paramInt1, paramInt2, false);
    if (!bool)
    {
      paramInt1 = super.deleteSurroundingText(paramInt1, paramInt2);
      if (paramInt1 == 0) {
        return 0;
      }
    }
    paramInt1 = 1;
    return paramInt1;
  }
  
  public boolean deleteSurroundingTextInCodePoints(int paramInt1, int paramInt2)
  {
    EmojiInputConnection.EmojiCompatDeleteHelper localEmojiCompatDeleteHelper = this.OooO0O0;
    Editable localEditable = getEditable();
    boolean bool1 = true;
    boolean bool2 = localEmojiCompatDeleteHelper.OooO00o(this, localEditable, paramInt1, paramInt2, bool1);
    if (!bool2)
    {
      paramInt1 = super.deleteSurroundingTextInCodePoints(paramInt1, paramInt2);
      if (paramInt1 == 0) {
        return 0;
      }
    }
    paramInt1 = 1;
    return paramInt1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiInputConnection
 * JD-Core Version:    0.7.0.1
 */
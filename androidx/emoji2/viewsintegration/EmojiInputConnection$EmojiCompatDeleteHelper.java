package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.EmojiCompat;

public class EmojiInputConnection$EmojiCompatDeleteHelper
{
  public boolean OooO00o(InputConnection paramInputConnection, Editable paramEditable, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return EmojiCompat.OooO0O0(paramInputConnection, paramEditable, paramInt1, paramInt2, paramBoolean);
  }
  
  public void OooO0O0(EditorInfo paramEditorInfo)
  {
    boolean bool = EmojiCompat.isConfigured();
    if (bool)
    {
      EmojiCompat localEmojiCompat = EmojiCompat.get();
      localEmojiCompat.OooOOOO(paramEditorInfo);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiInputConnection.EmojiCompatDeleteHelper
 * JD-Core Version:    0.7.0.1
 */
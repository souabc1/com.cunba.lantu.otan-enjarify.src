package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

final class EmojiKeyListener
  implements KeyListener
{
  public final KeyListener OooO00o;
  public final EmojiKeyListener.EmojiCompatHandleKeyDownHelper OooO0O0;
  
  public EmojiKeyListener(KeyListener paramKeyListener)
  {
    this(paramKeyListener, localEmojiCompatHandleKeyDownHelper);
  }
  
  public EmojiKeyListener(KeyListener paramKeyListener, EmojiKeyListener.EmojiCompatHandleKeyDownHelper paramEmojiCompatHandleKeyDownHelper)
  {
    this.OooO00o = paramKeyListener;
    this.OooO0O0 = paramEmojiCompatHandleKeyDownHelper;
  }
  
  public void clearMetaKeyState(View paramView, Editable paramEditable, int paramInt)
  {
    this.OooO00o.clearMetaKeyState(paramView, paramEditable, paramInt);
  }
  
  public int getInputType()
  {
    return this.OooO00o.getInputType();
  }
  
  public boolean onKeyDown(View paramView, Editable paramEditable, int paramInt, KeyEvent paramKeyEvent)
  {
    Object localObject = this.OooO0O0;
    boolean bool1 = ((EmojiKeyListener.EmojiCompatHandleKeyDownHelper)localObject).OooO00o(paramEditable, paramInt, paramKeyEvent);
    if (!bool1)
    {
      localObject = this.OooO00o;
      bool2 = ((KeyListener)localObject).onKeyDown(paramView, paramEditable, paramInt, paramKeyEvent);
      if (!bool2)
      {
        bool2 = false;
        paramView = null;
        break label61;
      }
    }
    boolean bool2 = true;
    label61:
    return bool2;
  }
  
  public boolean onKeyOther(View paramView, Editable paramEditable, KeyEvent paramKeyEvent)
  {
    return this.OooO00o.onKeyOther(paramView, paramEditable, paramKeyEvent);
  }
  
  public boolean onKeyUp(View paramView, Editable paramEditable, int paramInt, KeyEvent paramKeyEvent)
  {
    return this.OooO00o.onKeyUp(paramView, paramEditable, paramInt, paramKeyEvent);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiKeyListener
 * JD-Core Version:    0.7.0.1
 */
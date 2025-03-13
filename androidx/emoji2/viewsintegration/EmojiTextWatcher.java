package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.EmojiCompat.InitCallback;

final class EmojiTextWatcher
  implements TextWatcher
{
  public final EditText o00OoOoo;
  public EmojiCompat.InitCallback o00Ooo0;
  public final boolean o00Ooo00;
  public int o00Ooo0O = -1 >>> 1;
  public int o00Ooo0o = 0;
  public boolean o00OooO0;
  
  public EmojiTextWatcher(EditText paramEditText, boolean paramBoolean)
  {
    this.o00OoOoo = paramEditText;
    this.o00Ooo00 = paramBoolean;
    this.o00OooO0 = true;
  }
  
  public static void OooO00o(EditText paramEditText, int paramInt)
  {
    int i = 1;
    if ((paramInt == i) && (paramEditText != null))
    {
      paramInt = paramEditText.isAttachedToWindow();
      if (paramInt != 0)
      {
        paramEditText = paramEditText.getEditableText();
        paramInt = Selection.getSelectionStart(paramEditText);
        i = Selection.getSelectionEnd(paramEditText);
        EmojiCompat localEmojiCompat = EmojiCompat.get();
        localEmojiCompat.OooO(paramEditText);
        EmojiInputFilter.OooO00o(paramEditText, paramInt, i);
      }
    }
  }
  
  private EmojiCompat.InitCallback getInitCallback()
  {
    Object localObject = this.o00Ooo0;
    if (localObject == null)
    {
      localObject = new androidx/emoji2/viewsintegration/EmojiTextWatcher$InitCallbackImpl;
      EditText localEditText = this.o00OoOoo;
      ((EmojiTextWatcher.InitCallbackImpl)localObject).<init>(localEditText);
      this.o00Ooo0 = ((EmojiCompat.InitCallback)localObject);
    }
    return this.o00Ooo0;
  }
  
  public final boolean OooO0O0()
  {
    boolean bool = this.o00OooO0;
    if (bool)
    {
      bool = this.o00Ooo00;
      if (!bool)
      {
        bool = EmojiCompat.isConfigured();
        if (!bool) {}
      }
      else
      {
        return false;
      }
    }
    bool = true;
    return bool;
  }
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public int getEmojiReplaceStrategy()
  {
    return this.o00Ooo0o;
  }
  
  public int getMaxEmojiCount()
  {
    return this.o00Ooo0O;
  }
  
  public boolean isEnabled()
  {
    return this.o00OooO0;
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject1 = this.o00OoOoo;
    int i = ((View)localObject1).isInEditMode();
    if (i == 0)
    {
      i = OooO0O0();
      if ((i == 0) && (paramInt2 <= paramInt3))
      {
        paramInt2 = paramCharSequence instanceof Spannable;
        if (paramInt2 != 0)
        {
          EmojiCompat localEmojiCompat = EmojiCompat.get();
          paramInt2 = localEmojiCompat.getLoadState();
          if (paramInt2 != 0)
          {
            i = 1;
            if (paramInt2 != i)
            {
              int j = 3;
              if (paramInt2 != j) {
                return;
              }
            }
            else
            {
              Object localObject2 = paramCharSequence;
              localObject2 = (Spannable)paramCharSequence;
              localObject1 = EmojiCompat.get();
              int k = paramInt1 + paramInt3;
              int m = this.o00Ooo0O;
              int n = this.o00Ooo0o;
              ((EmojiCompat)localObject1).OooOO0o((CharSequence)localObject2, paramInt1, k, m, n);
              return;
            }
          }
          paramCharSequence = EmojiCompat.get();
          EmojiCompat.InitCallback localInitCallback = getInitCallback();
          paramCharSequence.OooOOO0(localInitCallback);
        }
      }
    }
  }
  
  public void setEmojiReplaceStrategy(int paramInt)
  {
    this.o00Ooo0o = paramInt;
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    boolean bool = this.o00OooO0;
    if (bool != paramBoolean)
    {
      Object localObject = this.o00Ooo0;
      if (localObject != null)
      {
        localObject = EmojiCompat.get();
        EmojiCompat.InitCallback localInitCallback = this.o00Ooo0;
        ((EmojiCompat)localObject).OooOOO(localInitCallback);
      }
      this.o00OooO0 = paramBoolean;
      if (paramBoolean)
      {
        EditText localEditText = this.o00OoOoo;
        localObject = EmojiCompat.get();
        int i = ((EmojiCompat)localObject).getLoadState();
        OooO00o(localEditText, i);
      }
    }
  }
  
  public void setMaxEmojiCount(int paramInt)
  {
    this.o00Ooo0O = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.viewsintegration.EmojiTextWatcher
 * JD-Core Version:    0.7.0.1
 */
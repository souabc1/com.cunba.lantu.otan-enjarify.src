package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

class SpannableBuilder$WatcherWrapper
  implements TextWatcher, SpanWatcher
{
  public final Object o00OoOoo;
  public final AtomicInteger o00Ooo00;
  
  public SpannableBuilder$WatcherWrapper(Object paramObject)
  {
    AtomicInteger localAtomicInteger = new java/util/concurrent/atomic/AtomicInteger;
    localAtomicInteger.<init>(0);
    this.o00Ooo00 = localAtomicInteger;
    this.o00OoOoo = paramObject;
  }
  
  public final void OooO00o()
  {
    this.o00Ooo00.incrementAndGet();
  }
  
  public final boolean OooO0O0(Object paramObject)
  {
    return paramObject instanceof EmojiSpan;
  }
  
  public final void OooO0OO()
  {
    this.o00Ooo00.decrementAndGet();
  }
  
  public void afterTextChanged(Editable paramEditable)
  {
    ((TextWatcher)this.o00OoOoo).afterTextChanged(paramEditable);
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    ((TextWatcher)this.o00OoOoo).beforeTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
  }
  
  public void onSpanAdded(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2)
  {
    AtomicInteger localAtomicInteger = this.o00Ooo00;
    int i = localAtomicInteger.get();
    if (i > 0)
    {
      boolean bool = OooO0O0(paramObject);
      if (bool) {
        return;
      }
    }
    ((SpanWatcher)this.o00OoOoo).onSpanAdded(paramSpannable, paramObject, paramInt1, paramInt2);
  }
  
  public void onSpanChanged(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject = this.o00Ooo00;
    int i = ((AtomicInteger)localObject).get();
    if (i > 0)
    {
      boolean bool = OooO0O0(paramObject);
      if (bool) {
        return;
      }
    }
    localObject = this.o00OoOoo;
    ((SpanWatcher)localObject).onSpanChanged(paramSpannable, paramObject, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void onSpanRemoved(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2)
  {
    AtomicInteger localAtomicInteger = this.o00Ooo00;
    int i = localAtomicInteger.get();
    if (i > 0)
    {
      boolean bool = OooO0O0(paramObject);
      if (bool) {
        return;
      }
    }
    ((SpanWatcher)this.o00OoOoo).onSpanRemoved(paramSpannable, paramObject, paramInt1, paramInt2);
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    ((TextWatcher)this.o00OoOoo).onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.SpannableBuilder.WatcherWrapper
 * JD-Core Version:    0.7.0.1
 */
package androidx.emoji2.text;

import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class EmojiCompat$ListenerDispatcher
  implements Runnable
{
  public final List o00OoOoo;
  public final int o00Ooo0;
  public final Throwable o00Ooo00;
  
  public EmojiCompat$ListenerDispatcher(EmojiCompat.InitCallback paramInitCallback, int paramInt)
  {
    this(paramInitCallback, paramInt, null);
  }
  
  public EmojiCompat$ListenerDispatcher(Collection paramCollection, int paramInt)
  {
    this(paramCollection, paramInt, null);
  }
  
  public EmojiCompat$ListenerDispatcher(Collection paramCollection, int paramInt, Throwable paramThrowable)
  {
    Preconditions.OooO(paramCollection, "initCallbacks cannot be null");
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(paramCollection);
    this.o00OoOoo = localArrayList;
    this.o00Ooo0 = paramInt;
    this.o00Ooo00 = paramThrowable;
  }
  
  public void run()
  {
    List localList = this.o00OoOoo;
    int i = localList.size();
    int j = this.o00Ooo0;
    int k = 1;
    int m = 0;
    EmojiCompat.InitCallback localInitCallback;
    if (j != k) {
      while (m < i)
      {
        localInitCallback = (EmojiCompat.InitCallback)this.o00OoOoo.get(m);
        Throwable localThrowable = this.o00Ooo00;
        localInitCallback.OooO00o(localThrowable);
        m += 1;
      }
    }
    while (m < i)
    {
      localInitCallback = (EmojiCompat.InitCallback)this.o00OoOoo.get(m);
      localInitCallback.OooO0O0();
      m += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.EmojiCompat.ListenerDispatcher
 * JD-Core Version:    0.7.0.1
 */
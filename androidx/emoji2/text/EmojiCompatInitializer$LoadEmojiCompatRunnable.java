package androidx.emoji2.text;

import androidx.core.os.TraceCompat;

class EmojiCompatInitializer$LoadEmojiCompatRunnable
  implements Runnable
{
  public void run()
  {
    Object localObject1 = "EmojiCompat.EmojiCompatInitializer.run";
    try
    {
      TraceCompat.OooO00o((String)localObject1);
      boolean bool = EmojiCompat.isConfigured();
      if (bool)
      {
        localObject1 = EmojiCompat.get();
        ((EmojiCompat)localObject1).OooO0o0();
      }
      return;
    }
    finally
    {
      TraceCompat.OooO0O0();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.EmojiCompatInitializer.LoadEmojiCompatRunnable
 * JD-Core Version:    0.7.0.1
 */
package androidx.emoji2.text;

import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;

public class EmojiCompatInitializer
  implements Initializer
{
  public List OooO0O0()
  {
    return Collections.singletonList(ProcessLifecycleInitializer.class);
  }
  
  public Boolean OooO0OO(Context paramContext)
  {
    EmojiCompatInitializer.BackgroundDefaultConfig localBackgroundDefaultConfig = new androidx/emoji2/text/EmojiCompatInitializer$BackgroundDefaultConfig;
    localBackgroundDefaultConfig.<init>(paramContext);
    EmojiCompat.OooO0Oo(localBackgroundDefaultConfig);
    OooO0Oo(paramContext);
    return Boolean.TRUE;
  }
  
  public void OooO0Oo(Context paramContext)
  {
    paramContext = ((LifecycleOwner)AppInitializer.OooO0o0(paramContext).OooO0o(ProcessLifecycleInitializer.class)).getLifecycle();
    EmojiCompatInitializer.1 local1 = new androidx/emoji2/text/EmojiCompatInitializer$1;
    local1.<init>(this, paramContext);
    paramContext.OooO00o(local1);
  }
  
  public void OooO0o0()
  {
    Handler localHandler = ConcurrencyHelpers.OooO0Oo();
    EmojiCompatInitializer.LoadEmojiCompatRunnable localLoadEmojiCompatRunnable = new androidx/emoji2/text/EmojiCompatInitializer$LoadEmojiCompatRunnable;
    localLoadEmojiCompatRunnable.<init>();
    localHandler.postDelayed(localLoadEmojiCompatRunnable, 500L);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.EmojiCompatInitializer
 * JD-Core Version:    0.7.0.1
 */
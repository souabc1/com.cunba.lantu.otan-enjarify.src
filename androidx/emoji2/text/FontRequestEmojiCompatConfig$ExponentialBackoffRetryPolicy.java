package androidx.emoji2.text;

import android.os.SystemClock;

public class FontRequestEmojiCompatConfig$ExponentialBackoffRetryPolicy
  extends FontRequestEmojiCompatConfig.RetryPolicy
{
  public final long OooO00o;
  public long OooO0O0;
  
  public long getRetryDelay()
  {
    long l1 = this.OooO0O0;
    long l2 = 0L;
    boolean bool1 = l1 < l2;
    if (!bool1)
    {
      l1 = SystemClock.uptimeMillis();
      this.OooO0O0 = l1;
      return l2;
    }
    l1 = SystemClock.uptimeMillis();
    l2 = this.OooO0O0;
    l1 -= l2;
    l2 = this.OooO00o;
    boolean bool2 = l1 < l2;
    if (bool2) {
      return -1;
    }
    l2 = Math.max(l1, 1000L);
    long l3 = this.OooO00o - l1;
    return Math.min(l2, l3);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.FontRequestEmojiCompatConfig.ExponentialBackoffRetryPolicy
 * JD-Core Version:    0.7.0.1
 */
package androidx.core.net;

import android.net.TrafficStats;

public final class TrafficStatsCompat
{
  public static int getThreadStatsTag()
  {
    return TrafficStats.getThreadStatsTag();
  }
  
  public static void setThreadStatsTag(int paramInt)
  {
    TrafficStats.setThreadStatsTag(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.net.TrafficStatsCompat
 * JD-Core Version:    0.7.0.1
 */
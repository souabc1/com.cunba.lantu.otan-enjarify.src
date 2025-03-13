package androidx.core.app;

import android.util.SparseIntArray;

public class FrameMetricsAggregator
{
  public final FrameMetricsAggregator.FrameMetricsBaseImpl OooO00o;
  
  public FrameMetricsAggregator()
  {
    this(1);
  }
  
  public FrameMetricsAggregator(int paramInt)
  {
    FrameMetricsAggregator.FrameMetricsApi24Impl localFrameMetricsApi24Impl = new androidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl;
    localFrameMetricsApi24Impl.<init>(paramInt);
    this.OooO00o = localFrameMetricsApi24Impl;
  }
  
  public SparseIntArray[] getMetrics()
  {
    return this.OooO00o.getMetrics();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.FrameMetricsAggregator
 * JD-Core Version:    0.7.0.1
 */
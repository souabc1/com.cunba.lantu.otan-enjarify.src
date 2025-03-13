package androidx.core.app;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window.OnFrameMetricsAvailableListener;

class FrameMetricsAggregator$FrameMetricsApi24Impl$1
  implements Window.OnFrameMetricsAvailableListener
{
  public FrameMetricsAggregator$FrameMetricsApi24Impl$1(FrameMetricsAggregator.FrameMetricsApi24Impl paramFrameMetricsApi24Impl) {}
  
  public void onFrameMetricsAvailable(Window paramWindow, FrameMetrics paramFrameMetrics, int paramInt)
  {
    paramWindow = this.OooO00o;
    paramInt = paramWindow.OooO00o;
    int i = 1;
    paramInt &= i;
    int j = 8;
    SparseIntArray localSparseIntArray;
    if (paramInt != 0)
    {
      localSparseIntArray = paramWindow.OooO0O0[0];
      long l1 = paramFrameMetrics.getMetric(j);
      paramWindow.OooO00o(localSparseIntArray, l1);
    }
    paramWindow = this.OooO00o;
    paramInt = paramWindow.OooO00o;
    int k = 2;
    paramInt &= k;
    long l2;
    if (paramInt != 0)
    {
      localSparseIntArray = paramWindow.OooO0O0[i];
      l2 = paramFrameMetrics.getMetric(i);
      paramWindow.OooO00o(localSparseIntArray, l2);
    }
    paramWindow = this.OooO00o;
    paramInt = paramWindow.OooO00o;
    i = 4;
    paramInt &= i;
    int m = 3;
    long l3;
    if (paramInt != 0)
    {
      localSparseIntArray = paramWindow.OooO0O0[k];
      l3 = paramFrameMetrics.getMetric(m);
      paramWindow.OooO00o(localSparseIntArray, l3);
    }
    paramWindow = this.OooO00o;
    paramInt = paramWindow.OooO00o & j;
    if (paramInt != 0)
    {
      localSparseIntArray = paramWindow.OooO0O0[m];
      l2 = paramFrameMetrics.getMetric(i);
      paramWindow.OooO00o(localSparseIntArray, l2);
    }
    paramWindow = this.OooO00o;
    paramInt = paramWindow.OooO00o & 0x10;
    m = 5;
    if (paramInt != 0)
    {
      localSparseIntArray = paramWindow.OooO0O0[i];
      l3 = paramFrameMetrics.getMetric(m);
      paramWindow.OooO00o(localSparseIntArray, l3);
    }
    paramWindow = this.OooO00o;
    paramInt = paramWindow.OooO00o & 0x40;
    i = 7;
    int n = 6;
    if (paramInt != 0)
    {
      localSparseIntArray = paramWindow.OooO0O0[n];
      long l4 = paramFrameMetrics.getMetric(i);
      paramWindow.OooO00o(localSparseIntArray, l4);
    }
    paramWindow = this.OooO00o;
    paramInt = paramWindow.OooO00o & 0x20;
    if (paramInt != 0)
    {
      localSparseIntArray = paramWindow.OooO0O0[m];
      l2 = paramFrameMetrics.getMetric(n);
      paramWindow.OooO00o(localSparseIntArray, l2);
    }
    paramWindow = this.OooO00o;
    paramInt = paramWindow.OooO00o & 0x80;
    long l5;
    if (paramInt != 0)
    {
      localSparseIntArray = paramWindow.OooO0O0[i];
      l5 = paramFrameMetrics.getMetric(0);
      paramWindow.OooO00o(localSparseIntArray, l5);
    }
    paramWindow = this.OooO00o;
    paramInt = paramWindow.OooO00o & 0x100;
    if (paramInt != 0)
    {
      localSparseIntArray = paramWindow.OooO0O0[j];
      l5 = paramFrameMetrics.getMetric(k);
      paramWindow.OooO00o(localSparseIntArray, l5);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.1
 * JD-Core Version:    0.7.0.1
 */
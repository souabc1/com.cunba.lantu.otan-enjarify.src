package androidx.core.app;

import android.util.SparseIntArray;
import android.view.Window.OnFrameMetricsAvailableListener;
import java.util.ArrayList;

class FrameMetricsAggregator$FrameMetricsApi24Impl
  extends FrameMetricsAggregator.FrameMetricsBaseImpl
{
  public int OooO00o;
  public SparseIntArray[] OooO0O0;
  public final ArrayList OooO0OO;
  public Window.OnFrameMetricsAvailableListener OooO0Oo;
  
  public FrameMetricsAggregator$FrameMetricsApi24Impl(int paramInt)
  {
    Object localObject = new SparseIntArray[9];
    this.OooO0O0 = ((SparseIntArray[])localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooO0OO = ((ArrayList)localObject);
    localObject = new androidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl$1;
    ((FrameMetricsAggregator.FrameMetricsApi24Impl.1)localObject).<init>(this);
    this.OooO0Oo = ((Window.OnFrameMetricsAvailableListener)localObject);
    this.OooO00o = paramInt;
  }
  
  public void OooO00o(SparseIntArray paramSparseIntArray, long paramLong)
  {
    if (paramSparseIntArray != null)
    {
      long l1 = 500000L + paramLong;
      long l2 = 1000000L;
      l1 /= l2;
      int i = (int)l1;
      long l3 = 0L;
      boolean bool = paramLong < l3;
      if (!bool)
      {
        int j = paramSparseIntArray.get(i) + 1;
        paramSparseIntArray.put(i, j);
      }
    }
  }
  
  public SparseIntArray[] getMetrics()
  {
    return this.OooO0O0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl
 * JD-Core Version:    0.7.0.1
 */
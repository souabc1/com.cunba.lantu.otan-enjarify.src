package androidx.customview.poolingcontainer;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

final class PoolingContainerListenerHolder
{
  public final ArrayList OooO00o;
  
  public PoolingContainerListenerHolder()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO00o = localArrayList;
  }
  
  public final void OooO00o()
  {
    ArrayList localArrayList = this.OooO00o;
    int i = CollectionsKt.OooOO0(localArrayList);
    for (;;)
    {
      int j = -1;
      if (j >= i) {
        break;
      }
      PoolingContainerListener localPoolingContainerListener = (PoolingContainerListener)this.OooO00o.get(i);
      localPoolingContainerListener.OooO00o();
      i += -1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.customview.poolingcontainer.PoolingContainerListenerHolder
 * JD-Core Version:    0.7.0.1
 */
package androidx.customview.poolingcontainer;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewKt;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

public final class PoolingContainer
{
  public static final int OooO00o = R.id.pooling_container_listener_holder_tag;
  public static final int OooO0O0 = R.id.is_pooling_container_tag;
  
  public static final void OooO00o(View paramView)
  {
    Object localObject = "<this>";
    Intrinsics.OooO0o(paramView, (String)localObject);
    paramView = ViewKt.OooO00o(paramView).iterator();
    for (;;)
    {
      boolean bool = paramView.hasNext();
      if (!bool) {
        break;
      }
      localObject = OooO0OO((View)paramView.next());
      ((PoolingContainerListenerHolder)localObject).OooO00o();
    }
  }
  
  public static final void OooO0O0(ViewGroup paramViewGroup)
  {
    Object localObject = "<this>";
    Intrinsics.OooO0o(paramViewGroup, (String)localObject);
    paramViewGroup = ViewGroupKt.OooO00o(paramViewGroup).iterator();
    for (;;)
    {
      boolean bool = paramViewGroup.hasNext();
      if (!bool) {
        break;
      }
      localObject = OooO0OO((View)paramViewGroup.next());
      ((PoolingContainerListenerHolder)localObject).OooO00o();
    }
  }
  
  public static final PoolingContainerListenerHolder OooO0OO(View paramView)
  {
    int i = OooO00o;
    PoolingContainerListenerHolder localPoolingContainerListenerHolder = (PoolingContainerListenerHolder)paramView.getTag(i);
    if (localPoolingContainerListenerHolder == null)
    {
      localPoolingContainerListenerHolder = new androidx/customview/poolingcontainer/PoolingContainerListenerHolder;
      localPoolingContainerListenerHolder.<init>();
      paramView.setTag(i, localPoolingContainerListenerHolder);
    }
    return localPoolingContainerListenerHolder;
  }
  
  public static final void OooO0Oo(View paramView, boolean paramBoolean)
  {
    Intrinsics.OooO0o(paramView, "<this>");
    int i = OooO0O0;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    paramView.setTag(i, localBoolean);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.customview.poolingcontainer.PoolingContainer
 * JD-Core Version:    0.7.0.1
 */
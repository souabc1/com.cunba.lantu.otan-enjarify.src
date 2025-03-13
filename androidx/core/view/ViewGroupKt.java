package androidx.core.view;

import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

public final class ViewGroupKt
{
  public static final Sequence OooO00o(ViewGroup paramViewGroup)
  {
    Intrinsics.OooO0o(paramViewGroup, "<this>");
    ViewGroupKt.children.1 local1 = new androidx/core/view/ViewGroupKt$children$1;
    local1.<init>(paramViewGroup);
    return local1;
  }
  
  public static final Sequence OooO0O0(ViewGroup paramViewGroup)
  {
    Intrinsics.OooO0o(paramViewGroup, "<this>");
    ViewGroupKt.descendants.1 local1 = new androidx/core/view/ViewGroupKt$descendants$1;
    local1.<init>(paramViewGroup, null);
    return SequencesKt.OooO0O0(local1);
  }
  
  public static final Iterator OooO0OO(ViewGroup paramViewGroup)
  {
    Intrinsics.OooO0o(paramViewGroup, "<this>");
    ViewGroupKt.iterator.1 local1 = new androidx/core/view/ViewGroupKt$iterator$1;
    local1.<init>(paramViewGroup);
    return local1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewGroupKt
 * JD-Core Version:    0.7.0.1
 */
package androidx.core.view;

import android.content.ClipData;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.DragShadowBuilder;

class ViewCompat$Api24Impl
{
  public static void OooO00o(View paramView)
  {
    paramView.cancelDragAndDrop();
  }
  
  public static void OooO0O0(View paramView)
  {
    paramView.dispatchFinishTemporaryDetach();
  }
  
  public static void OooO0OO(View paramView)
  {
    paramView.dispatchStartTemporaryDetach();
  }
  
  public static void OooO0Oo(View paramView, PointerIcon paramPointerIcon)
  {
    paramView.setPointerIcon(paramPointerIcon);
  }
  
  public static void OooO0o(View paramView, View.DragShadowBuilder paramDragShadowBuilder)
  {
    paramView.updateDragShadow(paramDragShadowBuilder);
  }
  
  public static boolean OooO0o0(View paramView, ClipData paramClipData, View.DragShadowBuilder paramDragShadowBuilder, Object paramObject, int paramInt)
  {
    return paramView.startDragAndDrop(paramClipData, paramDragShadowBuilder, paramObject, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewCompat.Api24Impl
 * JD-Core Version:    0.7.0.1
 */
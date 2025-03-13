package androidx.coordinatorlayout.widget;

import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;

class CoordinatorLayout$HierarchyChangeListener
  implements ViewGroup.OnHierarchyChangeListener
{
  public CoordinatorLayout$HierarchyChangeListener(CoordinatorLayout paramCoordinatorLayout) {}
  
  public void onChildViewAdded(View paramView1, View paramView2)
  {
    ViewGroup.OnHierarchyChangeListener localOnHierarchyChangeListener = this.o00OoOoo.mOnHierarchyChangeListener;
    if (localOnHierarchyChangeListener != null) {
      localOnHierarchyChangeListener.onChildViewAdded(paramView1, paramView2);
    }
  }
  
  public void onChildViewRemoved(View paramView1, View paramView2)
  {
    Object localObject = this.o00OoOoo;
    int i = 2;
    ((CoordinatorLayout)localObject).onChildViewsChanged(i);
    localObject = this.o00OoOoo.mOnHierarchyChangeListener;
    if (localObject != null) {
      ((ViewGroup.OnHierarchyChangeListener)localObject).onChildViewRemoved(paramView1, paramView2);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.coordinatorlayout.widget.CoordinatorLayout.HierarchyChangeListener
 * JD-Core Version:    0.7.0.1
 */
package com.google.android.material.chip;

import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.CheckableGroup;
import com.google.android.material.internal.MaterialCheckable;

class ChipGroup$PassThroughHierarchyChangeListener
  implements ViewGroup.OnHierarchyChangeListener
{
  private ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener;
  
  private ChipGroup$PassThroughHierarchyChangeListener(ChipGroup paramChipGroup) {}
  
  public void onChildViewAdded(View paramView1, View paramView2)
  {
    Object localObject1 = this.this$0;
    if (paramView1 == localObject1)
    {
      boolean bool = paramView2 instanceof Chip;
      if (bool)
      {
        int i = ((View)paramView2).getId();
        int j = -1;
        if (i == j)
        {
          i = ViewCompat.OooOO0();
          ((View)paramView2).setId(i);
        }
        localObject1 = ChipGroup.access$200(this.this$0);
        Object localObject2 = paramView2;
        localObject2 = (Chip)paramView2;
        ((CheckableGroup)localObject1).addCheckable((MaterialCheckable)localObject2);
      }
    }
    localObject1 = this.onHierarchyChangeListener;
    if (localObject1 != null) {
      ((ViewGroup.OnHierarchyChangeListener)localObject1).onChildViewAdded(paramView1, (View)paramView2);
    }
  }
  
  public void onChildViewRemoved(View paramView1, View paramView2)
  {
    Object localObject1 = this.this$0;
    if (paramView1 == localObject1)
    {
      boolean bool = paramView2 instanceof Chip;
      if (bool)
      {
        localObject1 = ChipGroup.access$200((ChipGroup)localObject1);
        Object localObject2 = paramView2;
        localObject2 = (Chip)paramView2;
        ((CheckableGroup)localObject1).removeCheckable((MaterialCheckable)localObject2);
      }
    }
    localObject1 = this.onHierarchyChangeListener;
    if (localObject1 != null) {
      ((ViewGroup.OnHierarchyChangeListener)localObject1).onChildViewRemoved(paramView1, (View)paramView2);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.chip.ChipGroup.PassThroughHierarchyChangeListener
 * JD-Core Version:    0.7.0.1
 */
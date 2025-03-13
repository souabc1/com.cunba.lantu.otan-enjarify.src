package com.google.android.material.bottomappbar;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import com.google.android.material.R.dimen;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.ref.Reference;

class BottomAppBar$Behavior$1
  implements View.OnLayoutChangeListener
{
  public BottomAppBar$Behavior$1(BottomAppBar.Behavior paramBehavior) {}
  
  public void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    BottomAppBar localBottomAppBar = (BottomAppBar)BottomAppBar.Behavior.access$2500(this.this$0).get();
    if (localBottomAppBar != null)
    {
      paramInt2 = paramView instanceof FloatingActionButton;
      if (paramInt2 == 0)
      {
        paramInt2 = paramView instanceof ExtendedFloatingActionButton;
        if (paramInt2 == 0) {}
      }
      else
      {
        paramInt2 = ((View)paramView).getHeight();
        paramInt3 = paramView instanceof FloatingActionButton;
        Object localObject1;
        if (paramInt3 != 0)
        {
          localObject1 = paramView;
          localObject1 = (FloatingActionButton)paramView;
          localObject2 = BottomAppBar.Behavior.access$2600(this.this$0);
          ((FloatingActionButton)localObject1).getMeasuredContentRect((Rect)localObject2);
          localObject2 = BottomAppBar.Behavior.access$2600(this.this$0);
          paramInt3 = ((Rect)localObject2).height();
          localBottomAppBar.setFabDiameter(paramInt3);
          localObject1 = ((FloatingActionButton)localObject1).getShapeAppearanceModel().getTopLeftCornerSize();
          localObject3 = new android/graphics/RectF;
          Rect localRect = BottomAppBar.Behavior.access$2600(this.this$0);
          ((RectF)localObject3).<init>(localRect);
          float f = ((CornerSize)localObject1).getCornerSize((RectF)localObject3);
          localBottomAppBar.setFabCornerSize(f);
          paramInt2 = paramInt3;
        }
        Object localObject2 = (CoordinatorLayout.LayoutParams)((View)paramView).getLayoutParams();
        Object localObject3 = this.this$0;
        paramInt4 = BottomAppBar.Behavior.access$2700((BottomAppBar.Behavior)localObject3);
        if (paramInt4 == 0)
        {
          paramInt4 = BottomAppBar.access$400(localBottomAppBar);
          paramInt5 = 1;
          if (paramInt4 == paramInt5)
          {
            paramInt4 = (((View)paramView).getMeasuredHeight() - paramInt2) / 2;
            localObject1 = localBottomAppBar.getResources();
            paramInt5 = R.dimen.mtrl_bottomappbar_fab_bottom_margin;
            paramInt2 = ((Resources)localObject1).getDimensionPixelOffset(paramInt5) - paramInt4;
            paramInt4 = BottomAppBar.access$2800(localBottomAppBar) + paramInt2;
            ((ViewGroup.MarginLayoutParams)localObject2).bottomMargin = paramInt4;
          }
          paramInt2 = BottomAppBar.access$2900(localBottomAppBar);
          ((ViewGroup.MarginLayoutParams)localObject2).leftMargin = paramInt2;
          paramInt2 = BottomAppBar.access$3000(localBottomAppBar);
          ((ViewGroup.MarginLayoutParams)localObject2).rightMargin = paramInt2;
          boolean bool = ViewUtils.isLayoutRtl((View)paramView);
          int i;
          if (bool)
          {
            i = ((ViewGroup.MarginLayoutParams)localObject2).leftMargin;
            paramInt2 = BottomAppBar.access$3100(localBottomAppBar);
            i += paramInt2;
            ((ViewGroup.MarginLayoutParams)localObject2).leftMargin = i;
          }
          else
          {
            i = ((ViewGroup.MarginLayoutParams)localObject2).rightMargin;
            paramInt2 = BottomAppBar.access$3100(localBottomAppBar);
            i += paramInt2;
            ((ViewGroup.MarginLayoutParams)localObject2).rightMargin = i;
          }
        }
        BottomAppBar.access$1400(localBottomAppBar);
        return;
      }
    }
    paramView.removeOnLayoutChangeListener(this);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.bottomappbar.BottomAppBar.Behavior.1
 * JD-Core Version:    0.7.0.1
 */
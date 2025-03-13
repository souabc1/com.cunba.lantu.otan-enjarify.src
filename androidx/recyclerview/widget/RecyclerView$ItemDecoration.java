package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

public abstract class RecyclerView$ItemDecoration
{
  public void getItemOffsets(Rect paramRect, int paramInt, RecyclerView paramRecyclerView)
  {
    paramRect.set(0, 0, 0, 0);
  }
  
  public void getItemOffsets(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.State paramState)
  {
    int i = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).getViewLayoutPosition();
    getItemOffsets(paramRect, i, paramRecyclerView);
  }
  
  public void onDraw(Canvas paramCanvas, RecyclerView paramRecyclerView) {}
  
  public void onDraw(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.State paramState)
  {
    onDraw(paramCanvas, paramRecyclerView);
  }
  
  public void onDrawOver(Canvas paramCanvas, RecyclerView paramRecyclerView) {}
  
  public void onDrawOver(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.State paramState)
  {
    onDrawOver(paramCanvas, paramRecyclerView);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.ItemDecoration
 * JD-Core Version:    0.7.0.1
 */
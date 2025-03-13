package com.scwang.smartrefresh.header.internal.pathview;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

public class PathsView
  extends View
{
  public PathsDrawable o00OoOoo;
  
  public boolean OooO00o(String... paramVarArgs)
  {
    return this.o00OoOoo.OooO0o0(paramVarArgs);
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    this.o00OoOoo.draw(paramCanvas);
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    Object localObject = getTag();
    boolean bool = localObject instanceof String;
    if (bool)
    {
      localObject = getTag().toString();
      localObject = new String[] { localObject };
      OooO00o((String[])localObject);
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    PathsDrawable localPathsDrawable = this.o00OoOoo;
    int i = getPaddingLeft();
    int j = getPaddingTop();
    paramInt3 -= paramInt1;
    paramInt1 = getPaddingRight();
    paramInt3 -= paramInt1;
    paramInt1 = getPaddingLeft();
    paramInt1 = Math.max(paramInt3, paramInt1);
    paramInt4 -= paramInt2;
    paramInt2 = getPaddingTop();
    paramInt4 -= paramInt2;
    paramInt2 = getPaddingTop();
    paramInt2 = Math.max(paramInt4, paramInt2);
    localPathsDrawable.setBounds(i, j, paramInt1, paramInt2);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    PathsDrawable localPathsDrawable = this.o00OoOoo;
    int i = localPathsDrawable.getBounds().width();
    int j = getPaddingLeft();
    i += j;
    j = getPaddingRight();
    paramInt1 = View.resolveSize(i + j, paramInt1);
    int k = localPathsDrawable.getBounds().height();
    i = getPaddingTop();
    k += i;
    i = getPaddingBottom();
    paramInt2 = View.resolveSize(k + i, paramInt2);
    super.setMeasuredDimension(paramInt1, paramInt2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.internal.pathview.PathsView
 * JD-Core Version:    0.7.0.1
 */
package com.xuexiang.xui.widget.progress.loading;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import m54207b69;

public class MiniLoadingView
  extends View
{
  public int o00OoOoo;
  public int o00Ooo0 = 0;
  public int o00Ooo00;
  public ValueAnimator o00Ooo0O;
  public Paint o00Ooo0o;
  public ValueAnimator.AnimatorUpdateListener o00OooO0;
  
  public MiniLoadingView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public MiniLoadingView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    MiniLoadingView.1 local1 = new com/xuexiang/xui/widget/progress/loading/MiniLoadingView$1;
    local1.<init>(this);
    this.o00OooO0 = local1;
    OooO0OO(paramContext, paramAttributeSet, paramInt);
    OooO0Oo();
  }
  
  public final void OooO0O0(Canvas paramCanvas, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(5258, arrayOfObject);
  }
  
  public final void OooO0OO(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramContext;
    arrayOfObject[2] = paramAttributeSet;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[3] = localInteger;
    m54207b69.F54207b69_00(5259, arrayOfObject);
  }
  
  public final void OooO0Oo()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5260, arrayOfObject);
  }
  
  public void OooO0o()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5261, arrayOfObject);
  }
  
  public void OooO0o0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5262, arrayOfObject);
  }
  
  public void onAttachedToWindow()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5263, arrayOfObject);
  }
  
  public void onDetachedFromWindow()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5264, arrayOfObject);
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    m54207b69.F54207b69_00(5265, arrayOfObject);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(5266, arrayOfObject);
  }
  
  public void onVisibilityChanged(View paramView, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(5267, arrayOfObject);
  }
  
  public void setColor(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5268, arrayOfObject);
  }
  
  public void setSize(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5269, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.progress.loading.MiniLoadingView
 * JD-Core Version:    0.7.0.1
 */
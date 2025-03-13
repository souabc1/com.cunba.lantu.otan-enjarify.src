package com.xuexiang.xui.widget.progress.loading;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import m54207b69;

public class ARCLoadingView
  extends View
{
  public boolean o00OoOoo;
  public Paint o00Ooo0;
  public boolean o00Ooo00 = true;
  public int o00Ooo0O;
  public int o00Ooo0o;
  public int o00OooO = 10;
  public RectF o00OooO0;
  public float o00OooOO;
  public int o00OooOo;
  public float o00OoooO;
  public Paint o00Ooooo;
  public int[] o00o0000;
  public Bitmap o0O00o0;
  
  public ARCLoadingView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    OooO0Oo(paramContext, paramAttributeSet);
  }
  
  public final void OooO00o(Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    m54207b69.F54207b69_00(5238, arrayOfObject);
  }
  
  public RectF OooO0O0(Bitmap paramBitmap)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramBitmap;
    return (RectF)m54207b69.F54207b69_09(5239, arrayOfObject);
  }
  
  public final SweepGradient OooO0OO(Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    return (SweepGradient)m54207b69.F54207b69_09(5240, arrayOfObject);
  }
  
  public final void OooO0Oo(Context paramContext, AttributeSet paramAttributeSet)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramContext;
    arrayOfObject[2] = paramAttributeSet;
    m54207b69.F54207b69_00(5241, arrayOfObject);
  }
  
  public final void OooO0o()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5242, arrayOfObject);
  }
  
  public final void OooO0o0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5243, arrayOfObject);
  }
  
  public void OooO0oO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5244, arrayOfObject);
  }
  
  public void OooO0oo()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5245, arrayOfObject);
  }
  
  public float getIconScale()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_07(5246, arrayOfObject);
  }
  
  public int getLoadingColor()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(5247, arrayOfObject);
  }
  
  public boolean isStart()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(5248, arrayOfObject);
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    m54207b69.F54207b69_00(5249, arrayOfObject);
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    localInteger = Integer.valueOf(paramInt3);
    arrayOfObject[3] = localInteger;
    localInteger = Integer.valueOf(paramInt4);
    arrayOfObject[4] = localInteger;
    m54207b69.F54207b69_00(5250, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.progress.loading.ARCLoadingView
 * JD-Core Version:    0.7.0.1
 */
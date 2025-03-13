package com.xuexiang.xui.widget.tabbar;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import m54207b69;

class VerticalTabLayout$TabStrip
  extends LinearLayout
{
  public float o00OoOoo;
  public float o00Ooo0;
  public float o00Ooo00;
  public int o00Ooo0O;
  public Paint o00Ooo0o;
  public AnimatorSet o00OooO;
  public RectF o00OooO0;
  
  public VerticalTabLayout$TabStrip(VerticalTabLayout paramVerticalTabLayout, Context paramContext)
  {
    super(paramContext);
    paramContext = null;
    setWillNotDraw(false);
    int i = 1;
    setOrientation(i);
    Paint localPaint = new android/graphics/Paint;
    localPaint.<init>();
    this.o00Ooo0o = localPaint;
    localPaint.setAntiAlias(i);
    int j = VerticalTabLayout.OooO0oo(paramVerticalTabLayout);
    if (j == 0) {
      j = 3;
    } else {
      j = VerticalTabLayout.OooO0oo(paramVerticalTabLayout);
    }
    VerticalTabLayout.OooO(paramVerticalTabLayout, j);
    paramVerticalTabLayout = new android/graphics/RectF;
    paramVerticalTabLayout.<init>();
    this.o00OooO0 = paramVerticalTabLayout;
    OooOO0o();
  }
  
  public final void OooO(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    m54207b69.F54207b69_00(5919, arrayOfObject);
  }
  
  public void OooOO0(float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    m54207b69.F54207b69_00(5928, arrayOfObject);
  }
  
  public void OooOO0O(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5929, arrayOfObject);
  }
  
  public void OooOO0o()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5930, arrayOfObject);
  }
  
  public void OooOOO0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5931, arrayOfObject);
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    m54207b69.F54207b69_00(5932, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.tabbar.VerticalTabLayout.TabStrip
 * JD-Core Version:    0.7.0.1
 */
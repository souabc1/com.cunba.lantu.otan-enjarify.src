package com.xuexiang.xui.widget.button;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Parcelable;
import android.view.View;
import android.widget.Checkable;
import m54207b69;

public class SmoothCheckBox
  extends View
  implements Checkable
{
  public static final int o00o00o = Color.parseColor(m54207b69.F54207b69_11("i714747376757877"));
  public Paint o00OoOoo;
  public Paint o00Ooo0;
  public Paint o00Ooo00;
  public Point[] o00Ooo0O;
  public Point o00Ooo0o;
  public float o00OooO;
  public Path o00OooO0;
  public float o00OooOO;
  public float o00OooOo;
  public float o00OoooO;
  public int o00Ooooo;
  public int o00o00;
  public int o00o000;
  public int o00o0000;
  public int o00o000O;
  public int o00o000o;
  public boolean o00o00O0;
  public boolean o00o00Oo;
  public SmoothCheckBox.OnCheckedChangeListener o00o00o0;
  public float o0O00o0;
  public int oo00oO;
  
  public static int OooOOo(int paramInt1, int paramInt2, float paramFloat)
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = Integer.valueOf(paramInt1);
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(paramInt2);
    arrayOfObject[1] = localObject;
    localObject = Float.valueOf(paramFloat);
    arrayOfObject[2] = localObject;
    return m54207b69.F54207b69_05(2767, arrayOfObject);
  }
  
  public final void OooOOO(Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    m54207b69.F54207b69_00(2763, arrayOfObject);
  }
  
  public final void OooOOO0(Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    m54207b69.F54207b69_00(2764, arrayOfObject);
  }
  
  public final void OooOOOO(Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    m54207b69.F54207b69_00(2765, arrayOfObject);
  }
  
  public final void OooOOOo()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(2766, arrayOfObject);
  }
  
  public final void OooOOo0(Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    m54207b69.F54207b69_00(2768, arrayOfObject);
  }
  
  public final int OooOOoo(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return m54207b69.F54207b69_05(2769, arrayOfObject);
  }
  
  public final void OooOo0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(2770, arrayOfObject);
  }
  
  public final void OooOo00()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(2771, arrayOfObject);
  }
  
  public final void OooOo0O()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(2772, arrayOfObject);
  }
  
  public boolean isChecked()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(2773, arrayOfObject);
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    m54207b69.F54207b69_00(2774, arrayOfObject);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this;
    Object localObject = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(paramInt1);
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(paramInt2);
    arrayOfObject[3] = localObject;
    localObject = Integer.valueOf(paramInt3);
    arrayOfObject[4] = localObject;
    localObject = Integer.valueOf(paramInt4);
    arrayOfObject[5] = localObject;
    m54207b69.F54207b69_00(2775, arrayOfObject);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(2776, arrayOfObject);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramParcelable;
    m54207b69.F54207b69_00(2777, arrayOfObject);
  }
  
  public Parcelable onSaveInstanceState()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Parcelable)m54207b69.F54207b69_09(2778, arrayOfObject);
  }
  
  public void setChecked(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(2779, arrayOfObject);
  }
  
  public void setCheckedSilent(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(2780, arrayOfObject);
  }
  
  public void setOnCheckedChangeListener(SmoothCheckBox.OnCheckedChangeListener paramOnCheckedChangeListener)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramOnCheckedChangeListener;
    m54207b69.F54207b69_00(2781, arrayOfObject);
  }
  
  public void toggle()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(2782, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.button.SmoothCheckBox
 * JD-Core Version:    0.7.0.1
 */
package com.scwang.smartrefresh.header.storehouse;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.util.Random;

public class StoreHouseBarItem
  extends Animation
{
  public PointF o00OoOoo;
  public final Paint o00Ooo0;
  public float o00Ooo00;
  public float o00Ooo0O;
  public float o00Ooo0o;
  public PointF o00OooO;
  public PointF o00OooO0;
  
  public void OooO00o(Canvas paramCanvas)
  {
    PointF localPointF = this.o00OooO0;
    float f1 = localPointF.x;
    float f2 = localPointF.y;
    localPointF = this.o00OooO;
    float f3 = localPointF.x;
    float f4 = localPointF.y;
    Paint localPaint = this.o00Ooo0;
    paramCanvas.drawLine(f1, f2, f3, f4, localPaint);
  }
  
  public void OooO0O0(int paramInt)
  {
    Random localRandom = new java/util/Random;
    localRandom.<init>();
    float f = -localRandom.nextInt(paramInt) + paramInt;
    this.o00Ooo00 = f;
  }
  
  public void OooO0OO(float paramFloat1, float paramFloat2)
  {
    this.o00Ooo0O = paramFloat1;
    this.o00Ooo0o = paramFloat2;
    super.start();
  }
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    float f1 = this.o00Ooo0O;
    float f2 = (this.o00Ooo0o - f1) * paramFloat;
    f1 += f2;
    setAlpha(f1);
  }
  
  public void setAlpha(float paramFloat)
  {
    Paint localPaint = this.o00Ooo0;
    int i = (int)(paramFloat * 255.0F);
    localPaint.setAlpha(i);
  }
  
  public void setColor(int paramInt)
  {
    this.o00Ooo0.setColor(paramInt);
  }
  
  public void setLineWidth(int paramInt)
  {
    Paint localPaint = this.o00Ooo0;
    float f = paramInt;
    localPaint.setStrokeWidth(f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.storehouse.StoreHouseBarItem
 * JD-Core Version:    0.7.0.1
 */
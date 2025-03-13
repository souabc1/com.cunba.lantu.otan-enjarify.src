package com.scwang.smartrefresh.header.material;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.view.View;

class CircleImageView$OvalShadow
  extends OvalShape
{
  public RadialGradient o00OoOoo;
  public Paint o00Ooo00;
  
  public final void OooO00o(int paramInt)
  {
    RadialGradient localRadialGradient = new android/graphics/RadialGradient;
    float f1 = paramInt / 2;
    float f2 = this.o00Ooo0.o00OoOoo;
    int[] arrayOfInt = { 1023410176, 0 };
    Shader.TileMode localTileMode = Shader.TileMode.CLAMP;
    localRadialGradient.<init>(f1, f1, f2, arrayOfInt, null, localTileMode);
    this.o00OoOoo = localRadialGradient;
    this.o00Ooo00.setShader(localRadialGradient);
  }
  
  public void draw(Canvas paramCanvas, Paint paramPaint)
  {
    CircleImageView localCircleImageView = this.o00Ooo0;
    int i = localCircleImageView.getWidth();
    int j = localCircleImageView.getHeight();
    i /= 2;
    float f1 = i;
    float f2 = j / 2;
    Paint localPaint = this.o00Ooo00;
    paramCanvas.drawCircle(f1, f2, f1, localPaint);
    int k = this.o00Ooo0.o00OoOoo;
    float f3 = i - k;
    paramCanvas.drawCircle(f1, f2, f3, paramPaint);
  }
  
  public void onResize(float paramFloat1, float paramFloat2)
  {
    super.onResize(paramFloat1, paramFloat2);
    int i = (int)paramFloat1;
    OooO00o(i);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.material.CircleImageView.OvalShadow
 * JD-Core Version:    0.7.0.1
 */
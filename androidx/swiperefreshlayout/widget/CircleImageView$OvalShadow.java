package androidx.swiperefreshlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.Shape;
import android.view.View;

class CircleImageView$OvalShadow
  extends OvalShape
{
  public Paint o00OoOoo;
  public CircleImageView o00Ooo0;
  public int o00Ooo00;
  
  public CircleImageView$OvalShadow(CircleImageView paramCircleImageView, int paramInt)
  {
    this.o00Ooo0 = paramCircleImageView;
    paramCircleImageView = new android/graphics/Paint;
    paramCircleImageView.<init>();
    this.o00OoOoo = paramCircleImageView;
    this.o00Ooo00 = paramInt;
    int i = (int)rect().width();
    OooO00o(i);
  }
  
  public final void OooO00o(int paramInt)
  {
    Paint localPaint = this.o00OoOoo;
    RadialGradient localRadialGradient = new android/graphics/RadialGradient;
    float f1 = paramInt / 2;
    float f2 = this.o00Ooo00;
    int[] arrayOfInt = { 1023410176, 0 };
    Shader.TileMode localTileMode = Shader.TileMode.CLAMP;
    localRadialGradient.<init>(f1, f1, f2, arrayOfInt, null, localTileMode);
    localPaint.setShader(localRadialGradient);
  }
  
  public void draw(Canvas paramCanvas, Paint paramPaint)
  {
    int i = this.o00Ooo0.getWidth() / 2;
    int j = this.o00Ooo0.getHeight() / 2;
    float f1 = i;
    float f2 = j;
    Paint localPaint = this.o00OoOoo;
    paramCanvas.drawCircle(f1, f2, f1, localPaint);
    int k = this.o00Ooo00;
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
 * Qualified Name:     androidx.swiperefreshlayout.widget.CircleImageView.OvalShadow
 * JD-Core Version:    0.7.0.1
 */
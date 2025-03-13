package androidx.constraintlayout.utils.widget;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;

public class MotionTelltales
  extends MockView
{
  public Paint o00OooOo;
  public float[] o00OoooO;
  public Matrix o00Ooooo;
  public float o00o000;
  public int o00o0000;
  public MotionLayout o0O00o0;
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    MotionTelltales localMotionTelltales = this;
    super.onDraw(paramCanvas);
    Object localObject1 = getMatrix();
    Object localObject2 = this.o00Ooooo;
    ((Matrix)localObject1).invert((Matrix)localObject2);
    localObject1 = this.o0O00o0;
    boolean bool;
    if (localObject1 == null)
    {
      localObject1 = getParent();
      bool = localObject1 instanceof MotionLayout;
      if (bool)
      {
        localObject1 = (MotionLayout)localObject1;
        this.o0O00o0 = ((MotionLayout)localObject1);
      }
      return;
    }
    int i = getWidth();
    int j = getHeight();
    int k = 5;
    float[] arrayOfFloat1 = new float[k];
    float[] tmp84_82 = arrayOfFloat1;
    float[] tmp85_84 = tmp84_82;
    float[] tmp85_84 = tmp84_82;
    tmp85_84[0] = 0.1F;
    tmp85_84[1] = 0.25F;
    tmp85_84[2] = 0.5F;
    float[] tmp98_85 = tmp85_84;
    tmp98_85[3] = 0.75F;
    tmp98_85[4] = 0.9F;
    int m = 0;
    while (m < k)
    {
      float f1 = arrayOfFloat1[m];
      int n = 0;
      while (n < k)
      {
        float f2 = arrayOfFloat1[n];
        localObject1 = localMotionTelltales.o0O00o0;
        float[] arrayOfFloat2 = localMotionTelltales.o00OoooO;
        int i1 = localMotionTelltales.o00o0000;
        localObject2 = this;
        float f3 = f2;
        ((MotionLayout)localObject1).Oooo0oo(this, f2, f1, arrayOfFloat2, i1);
        localObject1 = localMotionTelltales.o00Ooooo;
        localObject2 = localMotionTelltales.o00OoooO;
        ((Matrix)localObject1).mapVectors((float[])localObject2);
        float f4 = i * f2;
        float f5 = j;
        float f6 = f5 * f1;
        localObject1 = localMotionTelltales.o00OoooO;
        float f7 = localObject1[0];
        f3 = localMotionTelltales.o00o000;
        f7 *= f3;
        float f8 = f4 - f7;
        bool = true;
        f7 = localObject1[bool] * f3;
        float f9 = f6 - f7;
        localObject2 = localMotionTelltales.o00Ooooo;
        ((Matrix)localObject2).mapVectors((float[])localObject1);
        localObject1 = localMotionTelltales.o00OooOo;
        paramCanvas.drawLine(f4, f6, f8, f9, (Paint)localObject1);
        n += 1;
      }
      m += 1;
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    postInvalidate();
  }
  
  public void setText(CharSequence paramCharSequence)
  {
    paramCharSequence = paramCharSequence.toString();
    this.o00OooO0 = paramCharSequence;
    requestLayout();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.utils.widget.MotionTelltales
 * JD-Core Version:    0.7.0.1
 */
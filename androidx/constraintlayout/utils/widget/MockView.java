package androidx.constraintlayout.utils.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class MockView
  extends View
{
  public Paint o00OoOoo;
  public Paint o00Ooo0;
  public Paint o00Ooo00;
  public boolean o00Ooo0O;
  public boolean o00Ooo0o;
  public Rect o00OooO;
  public String o00OooO0;
  public int o00OooOO;
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = getWidth();
    int j = getHeight();
    boolean bool1 = this.o00Ooo0O;
    boolean bool2;
    Paint localPaint1;
    int n;
    Object localObject2;
    int i1;
    int i2;
    if (bool1)
    {
      i += -1;
      j += -1;
      bool2 = false;
      localPaint1 = null;
      n = 0;
      float f1 = i;
      float f2 = j;
      Paint localPaint2 = this.o00OoOoo;
      localObject1 = paramCanvas;
      paramCanvas.drawLine(0.0F, 0.0F, f1, f2, localPaint2);
      Paint localPaint3 = this.o00OoOoo;
      localObject2 = paramCanvas;
      paramCanvas.drawLine(0.0F, f2, f1, 0.0F, localPaint3);
      i1 = 0;
      localPaint2 = null;
      localPaint3 = this.o00OoOoo;
      paramCanvas.drawLine(0.0F, 0.0F, f1, 0.0F, localPaint3);
      localPaint3 = this.o00OoOoo;
      paramCanvas.drawLine(f1, 0.0F, f1, f2, localPaint3);
      localPaint3 = this.o00OoOoo;
      paramCanvas.drawLine(f1, f2, 0.0F, f2, localPaint3);
      i2 = 0;
      localPaint3 = this.o00OoOoo;
      paramCanvas.drawLine(0.0F, f2, 0.0F, 0.0F, localPaint3);
    }
    Object localObject1 = this.o00OooO0;
    if (localObject1 != null)
    {
      bool2 = this.o00Ooo0o;
      if (bool2)
      {
        localPaint1 = this.o00Ooo00;
        n = ((String)localObject1).length();
        localObject2 = this.o00OooO;
        localPaint1.getTextBounds((String)localObject1, 0, n, (Rect)localObject2);
        int k = this.o00OooO.width();
        i -= k;
        float f3 = i;
        float f4 = 2.0F;
        f3 /= f4;
        int m = this.o00OooO.height();
        j -= m;
        float f5 = j / f4;
        k = this.o00OooO.height();
        f4 = k;
        f5 += f4;
        localObject1 = this.o00OooO;
        m = (int)f3;
        n = (int)f5;
        ((Rect)localObject1).offset(m, n);
        localObject1 = this.o00OooO;
        m = ((Rect)localObject1).left;
        n = this.o00OooOO;
        m -= n;
        int i3 = ((Rect)localObject1).top - n;
        i2 = ((Rect)localObject1).right + n;
        i1 = ((Rect)localObject1).bottom + n;
        ((Rect)localObject1).set(m, i3, i2, i1);
        localObject1 = this.o00OooO;
        localPaint1 = this.o00Ooo0;
        paramCanvas.drawRect((Rect)localObject1, localPaint1);
        localObject1 = this.o00OooO0;
        localPaint1 = this.o00Ooo00;
        paramCanvas.drawText((String)localObject1, f3, f5, localPaint1);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.utils.widget.MockView
 * JD-Core Version:    0.7.0.1
 */
package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

class CardViewBaseImpl$1
  implements RoundRectDrawableWithShadow.RoundRectHelper
{
  public CardViewBaseImpl$1(CardViewBaseImpl paramCardViewBaseImpl) {}
  
  public void OooO00o(Canvas paramCanvas, RectF paramRectF, float paramFloat, Paint paramPaint)
  {
    RectF localRectF1 = paramRectF;
    float f1 = 2.0F * paramFloat;
    float f2 = paramRectF.width() - f1;
    float f3 = 1.0F;
    float f4 = f2 - f3;
    f2 = paramRectF.height() - f1;
    float f5 = f2 - f3;
    boolean bool1 = paramFloat < f3;
    if (!bool1)
    {
      int i = 1056964608;
      float f6 = paramFloat + 0.5F;
      localObject = this.OooO00o.OooO00o;
      f2 = -f6;
      ((RectF)localObject).set(f2, f2, f6, f6);
      int j = paramCanvas.save();
      f1 = paramRectF.left + f6;
      f2 = paramRectF.top + f6;
      paramCanvas.translate(f1, f2);
      RectF localRectF2 = this.OooO00o.OooO00o;
      f7 = 180.0F;
      f8 = 90.0F;
      boolean bool2 = true;
      localObject = paramCanvas;
      paramCanvas.drawArc(localRectF2, f7, f8, bool2, paramPaint);
      paramCanvas.translate(f4, 0.0F);
      float f9 = 90.0F;
      paramCanvas.rotate(f9);
      localRectF2 = this.OooO00o.OooO00o;
      localObject = paramCanvas;
      paramCanvas.drawArc(localRectF2, f7, f8, bool2, paramPaint);
      paramCanvas.translate(f5, 0.0F);
      paramCanvas.rotate(f9);
      localRectF2 = this.OooO00o.OooO00o;
      localObject = paramCanvas;
      paramCanvas.drawArc(localRectF2, f7, f8, bool2, paramPaint);
      paramCanvas.translate(f4, 0.0F);
      paramCanvas.rotate(f9);
      localRectF2 = this.OooO00o.OooO00o;
      localObject = paramCanvas;
      paramCanvas.drawArc(localRectF2, f7, f8, bool2, paramPaint);
      paramCanvas.restoreToCount(j);
      f2 = paramRectF.left + f6 - f3;
      f7 = paramRectF.top;
      f8 = paramRectF.right - f6 + f3;
      f10 = f7 + f6;
      paramCanvas.drawRect(f2, f7, f8, f10, paramPaint);
      f2 = paramRectF.left + f6 - f3;
      f10 = paramRectF.bottom;
      f7 = f10 - f6;
      f1 = paramRectF.right - f6;
      f8 = f1 + f3;
      paramCanvas.drawRect(f2, f7, f8, f10, paramPaint);
    }
    f2 = localRectF1.left;
    float f7 = localRectF1.top + paramFloat;
    float f8 = localRectF1.right;
    float f10 = localRectF1.bottom - paramFloat;
    Object localObject = paramCanvas;
    paramCanvas.drawRect(f2, f7, f8, f10, paramPaint);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.cardview.widget.CardViewBaseImpl.1
 * JD-Core Version:    0.7.0.1
 */
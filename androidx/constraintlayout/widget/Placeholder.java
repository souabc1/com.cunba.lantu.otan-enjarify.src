package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;

public class Placeholder
  extends View
{
  public int o00OoOoo;
  public int o00Ooo0;
  public View o00Ooo00;
  
  public void OooO00o(ConstraintLayout paramConstraintLayout)
  {
    paramConstraintLayout = this.o00Ooo00;
    if (paramConstraintLayout == null) {
      return;
    }
    paramConstraintLayout = (ConstraintLayout.LayoutParams)getLayoutParams();
    ConstraintLayout.LayoutParams localLayoutParams = (ConstraintLayout.LayoutParams)this.o00Ooo00.getLayoutParams();
    localLayoutParams.o0ooOOo.setVisibility(0);
    Object localObject = paramConstraintLayout.o0ooOOo.getHorizontalDimensionBehaviour();
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour = ConstraintWidget.DimensionBehaviour.o00OoOoo;
    if (localObject != localDimensionBehaviour)
    {
      localObject = paramConstraintLayout.o0ooOOo;
      ConstraintWidget localConstraintWidget = localLayoutParams.o0ooOOo;
      int i = localConstraintWidget.getWidth();
      ((ConstraintWidget)localObject).setWidth(i);
    }
    localObject = paramConstraintLayout.o0ooOOo.getVerticalDimensionBehaviour();
    if (localObject != localDimensionBehaviour)
    {
      paramConstraintLayout = paramConstraintLayout.o0ooOOo;
      localObject = localLayoutParams.o0ooOOo;
      int j = ((ConstraintWidget)localObject).getHeight();
      paramConstraintLayout.setHeight(j);
    }
    localLayoutParams.o0ooOOo.setVisibility(8);
  }
  
  public void OooO0O0(ConstraintLayout paramConstraintLayout)
  {
    int i = this.o00OoOoo;
    int k = -1;
    if (i == k)
    {
      boolean bool = isInEditMode();
      if (!bool)
      {
        j = this.o00Ooo0;
        setVisibility(j);
      }
    }
    int j = this.o00OoOoo;
    paramConstraintLayout = paramConstraintLayout.findViewById(j);
    this.o00Ooo00 = paramConstraintLayout;
    if (paramConstraintLayout != null)
    {
      ((ConstraintLayout.LayoutParams)paramConstraintLayout.getLayoutParams()).Ooooooo = true;
      paramConstraintLayout = this.o00Ooo00;
      j = 0;
      paramConstraintLayout.setVisibility(0);
      setVisibility(0);
    }
  }
  
  public View getContent()
  {
    return this.o00Ooo00;
  }
  
  public int getEmptyVisibility()
  {
    return this.o00Ooo0;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    boolean bool = isInEditMode();
    if (bool)
    {
      int i = 223;
      paramCanvas.drawRGB(i, i, i);
      Paint localPaint = new android/graphics/Paint;
      localPaint.<init>();
      int j = 210;
      localPaint.setARGB(255, j, j, j);
      Object localObject = Paint.Align.CENTER;
      localPaint.setTextAlign((Paint.Align)localObject);
      localObject = Typeface.DEFAULT;
      j = 0;
      localObject = Typeface.create((Typeface)localObject, 0);
      localPaint.setTypeface((Typeface)localObject);
      localObject = new android/graphics/Rect;
      ((Rect)localObject).<init>();
      paramCanvas.getClipBounds((Rect)localObject);
      float f1 = ((Rect)localObject).height();
      localPaint.setTextSize(f1);
      int k = ((Rect)localObject).height();
      int m = ((Rect)localObject).width();
      Paint.Align localAlign = Paint.Align.LEFT;
      localPaint.setTextAlign(localAlign);
      String str = "?";
      localPaint.getTextBounds(str, 0, 1, (Rect)localObject);
      float f2 = m;
      m = 1073741824;
      float f3 = 2.0F;
      f2 /= f3;
      float f4 = ((Rect)localObject).width() / f3;
      f2 -= f4;
      f4 = ((Rect)localObject).left;
      f2 -= f4;
      f1 = k / f3;
      int n = ((Rect)localObject).height();
      f4 = n / f3;
      f1 += f4;
      int i1 = ((Rect)localObject).bottom;
      float f5 = i1;
      f1 -= f5;
      paramCanvas.drawText(str, f2, f1, localPaint);
    }
  }
  
  public void setContentId(int paramInt)
  {
    int i = this.o00OoOoo;
    if (i == paramInt) {
      return;
    }
    View localView1 = this.o00Ooo00;
    if (localView1 != null)
    {
      localView1.setVisibility(0);
      ((ConstraintLayout.LayoutParams)this.o00Ooo00.getLayoutParams()).Ooooooo = false;
      i = 0;
      localView1 = null;
      this.o00Ooo00 = null;
    }
    this.o00OoOoo = paramInt;
    i = -1;
    if (paramInt != i)
    {
      localView1 = (View)getParent();
      View localView2 = localView1.findViewById(paramInt);
      if (localView2 != null)
      {
        i = 8;
        localView2.setVisibility(i);
      }
    }
  }
  
  public void setEmptyVisibility(int paramInt)
  {
    this.o00Ooo0 = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.widget.Placeholder
 * JD-Core Version:    0.7.0.1
 */
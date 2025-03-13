package com.ernestoyaquello.dragdropswiperecyclerview.util;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import kotlin.jvm.internal.Intrinsics;
import m54207b69;

public final class DividerDrawingHelperKt
{
  public static final void OooO00o(View paramView, Canvas paramCanvas, Drawable paramDrawable, Integer paramInteger1, Integer paramInteger2, Float paramFloat)
  {
    Object localObject = m54207b69.F54207b69_11("|t1D01131C3C1A13220909");
    Intrinsics.OooO0o(paramView, (String)localObject);
    localObject = m54207b69.F54207b69_11(")?5C5F534C6251");
    Intrinsics.OooO0o(paramCanvas, (String)localObject);
    localObject = m54207b69.F54207b69_11("y0545A485C585A48");
    Intrinsics.OooO0o(paramDrawable, (String)localObject);
    localObject = paramView.getLayoutParams();
    String str = m54207b69.F54207b69_11("+F28342C2D6A2A2D2F30323C713030743437464479463E7C3F414185434F474885526058468A4C4E495C52594D6A9562525570575D576966665B6AA26C6B5F5F6272A9566669846B716B7D5A7A6F7EB65977907B86866B7D8B7F848F");
    Intrinsics.OooO0Oo(localObject, str);
    localObject = (RecyclerView.LayoutParams)localObject;
    int i;
    if (paramInteger1 != null)
    {
      i = paramInteger1.intValue();
    }
    else
    {
      i = paramView.getLeft();
      f1 = paramView.getTranslationX();
      j = (int)f1;
      i += j;
    }
    int j = ((ViewGroup.MarginLayoutParams)localObject).leftMargin;
    i -= j;
    int k;
    if (paramInteger2 != null)
    {
      k = paramInteger2.intValue();
    }
    else
    {
      k = paramView.getRight();
      f1 = paramView.getTranslationX();
      j = (int)f1;
      k += j;
    }
    j = ((ViewGroup.MarginLayoutParams)localObject).rightMargin;
    k += j;
    j = 255;
    float f1 = 3.573311E-043F;
    paramDrawable.setAlpha(j);
    if (paramFloat != null)
    {
      float f2 = paramFloat.floatValue();
      f1 = j;
      f2 *= f1;
      m = (int)f2;
      paramDrawable.setAlpha(m);
    }
    int m = paramView.getBottom();
    j = ((ViewGroup.MarginLayoutParams)localObject).bottomMargin;
    m += j;
    j = (int)paramView.getTranslationY();
    m += j;
    j = paramDrawable.getIntrinsicHeight() + m;
    paramDrawable.setBounds(i, m, k, j);
    paramDrawable.draw(paramCanvas);
    m = paramView.getTop();
    int n = ((ViewGroup.MarginLayoutParams)localObject).topMargin;
    m -= n;
    int i1 = (int)paramView.getTranslationY();
    m += i1;
    i1 = paramDrawable.getIntrinsicHeight();
    i1 = m - i1;
    paramDrawable.setBounds(i, i1, k, m);
    paramDrawable.draw(paramCanvas);
  }
  
  public static final void OooO0OO(View paramView, Canvas paramCanvas, Drawable paramDrawable, Integer paramInteger1, Integer paramInteger2, Float paramFloat)
  {
    Object localObject = m54207b69.F54207b69_11("|t1D01131C3C1A13220909");
    Intrinsics.OooO0o(paramView, (String)localObject);
    localObject = m54207b69.F54207b69_11(")?5C5F534C6251");
    Intrinsics.OooO0o(paramCanvas, (String)localObject);
    localObject = m54207b69.F54207b69_11("y0545A485C585A48");
    Intrinsics.OooO0o(paramDrawable, (String)localObject);
    localObject = paramView.getLayoutParams();
    String str = m54207b69.F54207b69_11("+F28342C2D6A2A2D2F30323C713030743437464479463E7C3F414185434F474885526058468A4C4E495C52594D6A9562525570575D576966665B6AA26C6B5F5F6272A9566669846B716B7D5A7A6F7EB65977907B86866B7D8B7F848F");
    Intrinsics.OooO0Oo(localObject, str);
    localObject = (RecyclerView.LayoutParams)localObject;
    int i;
    if (paramInteger1 != null)
    {
      i = paramInteger1.intValue();
    }
    else
    {
      i = paramView.getTop();
      f1 = paramView.getTranslationY();
      j = (int)f1;
      i += j;
    }
    int j = ((ViewGroup.MarginLayoutParams)localObject).topMargin;
    i -= j;
    int k;
    if (paramInteger2 != null)
    {
      k = paramInteger2.intValue();
    }
    else
    {
      k = paramView.getBottom();
      f1 = paramView.getTranslationY();
      j = (int)f1;
      k += j;
    }
    j = ((ViewGroup.MarginLayoutParams)localObject).bottomMargin;
    k += j;
    j = 255;
    float f1 = 3.573311E-043F;
    paramDrawable.setAlpha(j);
    if (paramFloat != null)
    {
      float f2 = paramFloat.floatValue();
      f1 = j;
      f2 *= f1;
      m = (int)f2;
      paramDrawable.setAlpha(m);
    }
    int m = paramView.getRight();
    j = ((ViewGroup.MarginLayoutParams)localObject).rightMargin;
    m += j;
    j = (int)paramView.getTranslationX();
    m += j;
    j = paramDrawable.getIntrinsicWidth() + m;
    paramDrawable.setBounds(m, i, j, k);
    paramDrawable.draw(paramCanvas);
    m = paramView.getLeft();
    int n = ((ViewGroup.MarginLayoutParams)localObject).leftMargin;
    m -= n;
    int i1 = (int)paramView.getTranslationX();
    m += i1;
    i1 = paramDrawable.getIntrinsicWidth();
    i1 = m - i1;
    paramDrawable.setBounds(i1, i, m, k);
    paramDrawable.draw(paramCanvas);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.ernestoyaquello.dragdropswiperecyclerview.util.DividerDrawingHelperKt
 * JD-Core Version:    0.7.0.1
 */
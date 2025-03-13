package com.google.android.material.dialog;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;

public class InsetDialogOnTouchListener
  implements View.OnTouchListener
{
  private final Dialog dialog;
  private final int leftInset;
  private final int prePieSlop;
  private final int topInset;
  
  public InsetDialogOnTouchListener(Dialog paramDialog, Rect paramRect)
  {
    this.dialog = paramDialog;
    int i = paramRect.left;
    this.leftInset = i;
    int j = paramRect.top;
    this.topInset = j;
    int k = ViewConfiguration.get(paramDialog.getContext()).getScaledWindowTouchSlop();
    this.prePieSlop = k;
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    Object localObject = paramView.findViewById(16908290);
    int i = this.leftInset;
    int j = ((View)localObject).getLeft();
    i += j;
    j = ((View)localObject).getWidth() + i;
    int k = this.topInset;
    int m = ((View)localObject).getTop();
    k += m;
    int n = ((View)localObject).getHeight() + k;
    RectF localRectF = new android/graphics/RectF;
    float f1 = i;
    float f2 = k;
    float f3 = j;
    float f4 = n;
    localRectF.<init>(f1, f2, f3, f4);
    f4 = paramMotionEvent.getX();
    f1 = paramMotionEvent.getY();
    boolean bool = localRectF.contains(f4, f1);
    if (bool) {
      return false;
    }
    localObject = MotionEvent.obtain(paramMotionEvent);
    int i1 = paramMotionEvent.getAction();
    i = 1;
    f1 = 1.4E-45F;
    if (i1 == i)
    {
      i1 = 4;
      ((MotionEvent)localObject).setAction(i1);
    }
    paramView.performClick();
    return this.dialog.onTouchEvent((MotionEvent)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.dialog.InsetDialogOnTouchListener
 * JD-Core Version:    0.7.0.1
 */
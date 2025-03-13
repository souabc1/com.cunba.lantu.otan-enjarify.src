package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class TouchObserverFrameLayout
  extends FrameLayout
{
  private View.OnTouchListener onTouchListener;
  
  public TouchObserverFrameLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public TouchObserverFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public TouchObserverFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    View.OnTouchListener localOnTouchListener = this.onTouchListener;
    if (localOnTouchListener != null) {
      localOnTouchListener.onTouch(this, paramMotionEvent);
    }
    return super.onInterceptTouchEvent(paramMotionEvent);
  }
  
  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    this.onTouchListener = paramOnTouchListener;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.TouchObserverFrameLayout
 * JD-Core Version:    0.7.0.1
 */
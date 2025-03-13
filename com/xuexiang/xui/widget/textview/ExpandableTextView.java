package com.xuexiang.xui.widget.textview;

import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import m54207b69;

public class ExpandableTextView
  extends LinearLayout
  implements View.OnClickListener
{
  public TextView o00OoOoo;
  public boolean o00Ooo0;
  public ImageButton o00Ooo00;
  public boolean o00Ooo0O;
  public int o00Ooo0o;
  public int o00OooO;
  public int o00OooO0;
  public int o00OooOO;
  public Drawable o00OooOo;
  public int o00OoooO;
  public float o00Ooooo;
  public ExpandableTextView.OnExpandStateChangeListener o00o000;
  public boolean o00o0000;
  public SparseBooleanArray o00o000O;
  public int o00o000o;
  public Drawable o0O00o0;
  
  public static void OooO(View paramView, float paramFloat)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramView;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    m54207b69.F54207b69_00(6089, arrayOfObject);
  }
  
  public static int OooOO0O(TextView paramTextView)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramTextView;
    return m54207b69.F54207b69_05(6099, arrayOfObject);
  }
  
  private static boolean isPostHoneycomb()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(6101, arrayOfObject);
  }
  
  private static boolean isPostLolipop()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(6102, arrayOfObject);
  }
  
  public final void OooOO0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(6098, arrayOfObject);
  }
  
  public CharSequence getText()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (CharSequence)m54207b69.F54207b69_09(6100, arrayOfObject);
  }
  
  public void onClick(View paramView)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    m54207b69.F54207b69_00(6103, arrayOfObject);
  }
  
  public void onFinishInflate()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(6104, arrayOfObject);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMotionEvent;
    return m54207b69.F54207b69_01(6105, arrayOfObject);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(6106, arrayOfObject);
  }
  
  public void setOnExpandStateChangeListener(ExpandableTextView.OnExpandStateChangeListener paramOnExpandStateChangeListener)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramOnExpandStateChangeListener;
    m54207b69.F54207b69_00(6107, arrayOfObject);
  }
  
  public void setOrientation(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(6108, arrayOfObject);
  }
  
  public void setText(CharSequence paramCharSequence)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence;
    m54207b69.F54207b69_00(6109, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.textview.ExpandableTextView
 * JD-Core Version:    0.7.0.1
 */
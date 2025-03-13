package com.qinggan.gesture;

import android.content.Context;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import m54207b69;

public class MyGestureListener
  extends GestureDetector.SimpleOnGestureListener
{
  public View.OnClickListener OooO;
  public GestureCallback OooO00o;
  public MyGestureListener.Direction OooO0O0 = null;
  public final int OooO0OO = 12;
  public double OooO0Oo = 10.0D;
  public int OooO0o = 0;
  public double OooO0o0 = 8.0D;
  public int OooO0oO = 0;
  public Context OooO0oo;
  public int OooOO0 = 0;
  public MyGestureListener.SeekBarListener OooOO0O = null;
  public int OooOO0o = -1;
  public int OooOOO = 1280;
  public int OooOOO0 = 720;
  
  public final int OooO00o(float paramFloat)
  {
    double d1 = paramFloat;
    double d2 = this.OooO0Oo;
    return (int)(d1 / d2);
  }
  
  public final int OooO0O0(float paramFloat)
  {
    double d1 = paramFloat;
    double d2 = this.OooO0o0;
    return (int)(d1 / d2);
  }
  
  public final MyGestureListener.Direction OooO0OO(float paramFloat1, float paramFloat2)
  {
    MyGestureListener.Direction localDirection = this.OooO0O0;
    if (localDirection != null) {
      return localDirection;
    }
    paramFloat1 = Math.abs(paramFloat1);
    paramFloat2 = Math.abs(paramFloat2);
    boolean bool = paramFloat1 < paramFloat2;
    if (bool) {
      localObject1 = MyGestureListener.Direction.o00Ooo00;
    } else {
      localObject1 = MyGestureListener.Direction.o00Ooo0;
    }
    this.OooO0O0 = ((MyGestureListener.Direction)localObject1);
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = m54207b69.F54207b69_11("E$43425263515B474E58565555104D5B65515862605F5F2F");
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = this.OooO0O0;
    ((StringBuilder)localObject1).append(localObject2);
    return this.OooO0O0;
  }
  
  public final void OooO0Oo(int paramInt)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = m54207b69.F54207b69_11("DL2323104129302A3F27292F3335792E384A3A3284");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(paramInt);
    int i = this.OooO0o;
    if (paramInt != i)
    {
      int j;
      if (paramInt > i)
      {
        localObject = this.OooO00o;
        if (localObject == null) {
          break label79;
        }
        j = -1;
      }
      else
      {
        localObject = this.OooO00o;
        if (localObject == null) {
          break label79;
        }
        j = 1;
      }
      ((GestureCallback)localObject).OooO00o(j);
    }
    label79:
    this.OooO0o = paramInt;
  }
  
  public final void OooO0o(int paramInt)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str = m54207b69.F54207b69_11("ax1717301A18121B24331D1B272965222C1E2E2658");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append(paramInt);
    int i = this.OooO0o;
    if (paramInt != i)
    {
      int j;
      if (paramInt > i)
      {
        localObject = this.OooO00o;
        if (localObject == null) {
          break label79;
        }
        j = -1;
      }
      else
      {
        localObject = this.OooO00o;
        if (localObject == null) {
          break label79;
        }
        j = 1;
      }
      ((GestureCallback)localObject).OooO0O0(j);
    }
    label79:
    this.OooO0o = paramInt;
  }
  
  public final void OooO0o0(int paramInt)
  {
    int i = this.OooOO0;
    i = Math.abs(paramInt - i);
    int j = 121;
    if (i > j) {
      return;
    }
    i = this.OooO0oO;
    if (paramInt != i)
    {
      MyGestureListener.SeekBarListener localSeekBarListener = this.OooOO0O;
      if (localSeekBarListener == null) {
        return;
      }
      i = (paramInt - i) * 1000;
      localSeekBarListener.OooO00o(i);
    }
    this.OooO0oO = paramInt;
  }
  
  public final void OooO0oO(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    float f1 = paramMotionEvent1.getRawX();
    paramFloat1 = paramMotionEvent2.getRawY();
    int i = (int)paramFloat1;
    float f2 = paramMotionEvent2.getRawX();
    int j = (int)f2;
    MyGestureListener.Direction localDirection1 = this.OooO0O0;
    MyGestureListener.Direction localDirection2 = MyGestureListener.Direction.o00Ooo00;
    if (localDirection1 == localDirection2)
    {
      f1 = j;
      int k = OooO0O0(f1);
      OooO0o0(k);
    }
    else
    {
      paramMotionEvent2 = MyGestureListener.Direction.o00Ooo0;
      if (localDirection1 == paramMotionEvent2)
      {
        j = this.OooOOO;
        f2 = j;
        paramFloat2 = 2.0F;
        f2 /= paramFloat2;
        boolean bool = f1 < f2;
        int m;
        if (bool)
        {
          f1 = i;
          m = OooO00o(f1);
          OooO0o(m);
        }
        else
        {
          f1 = i;
          m = OooO00o(f1);
          OooO0Oo(m);
        }
      }
    }
  }
  
  public boolean onDown(MotionEvent paramMotionEvent)
  {
    this.OooO0O0 = null;
    float f = paramMotionEvent.getY(0);
    int i = OooO00o(f);
    this.OooO0o = i;
    i = (int)paramMotionEvent.getRawX();
    this.OooOO0o = i;
    f = i;
    i = OooO0O0(f);
    this.OooO0oO = i;
    this.OooOO0 = i;
    return super.onDown(paramMotionEvent);
  }
  
  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    MyGestureListener.Direction localDirection = OooO0OO(paramFloat1, paramFloat2);
    this.OooO0O0 = localDirection;
    OooO0oO(paramMotionEvent1, paramMotionEvent2, paramFloat1, paramFloat2);
    return true;
  }
  
  public boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    return super.onSingleTapConfirmed(paramMotionEvent);
  }
  
  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    View.OnClickListener localOnClickListener = this.OooO;
    if (localOnClickListener != null) {
      localOnClickListener.onClick(null);
    }
    return super.onSingleTapUp(paramMotionEvent);
  }
  
  public void setCallback(GestureCallback paramGestureCallback)
  {
    this.OooO00o = paramGestureCallback;
  }
  
  public void setLevelSpace(double paramDouble)
  {
    this.OooO0Oo = paramDouble;
  }
  
  public void setLevelSpaceX(double paramDouble)
  {
    this.OooO0o0 = paramDouble;
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.OooO = paramOnClickListener;
  }
  
  public void setSeekBarListener(MyGestureListener.SeekBarListener paramSeekBarListener)
  {
    this.OooOO0O = paramSeekBarListener;
  }
  
  public void setWindowWidth(int paramInt)
  {
    this.OooOOO = paramInt;
  }
  
  public void setmContext(Context paramContext)
  {
    this.OooO0oo = paramContext;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.gesture.MyGestureListener
 * JD-Core Version:    0.7.0.1
 */
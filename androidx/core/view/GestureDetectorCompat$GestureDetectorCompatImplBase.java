package androidx.core.view;

import android.os.Handler;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

class GestureDetectorCompat$GestureDetectorCompatImplBase
  implements GestureDetectorCompat.GestureDetectorCompatImpl
{
  public static final int OooOo0O = ;
  public static final int OooOo0o = ViewConfiguration.getDoubleTapTimeout();
  public boolean OooO;
  public int OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  public final GestureDetector.OnGestureListener OooO0o;
  public final Handler OooO0o0;
  public GestureDetector.OnDoubleTapListener OooO0oO;
  public boolean OooO0oo;
  public boolean OooOO0;
  public boolean OooOO0O;
  public boolean OooOO0o;
  public MotionEvent OooOOO;
  public MotionEvent OooOOO0;
  public boolean OooOOOO;
  public float OooOOOo;
  public float OooOOo;
  public float OooOOo0;
  public float OooOOoo;
  public VelocityTracker OooOo0;
  public boolean OooOo00;
  
  public boolean OooO00o(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    Object localObject1 = this.OooOo0;
    if (localObject1 == null)
    {
      localObject1 = VelocityTracker.obtain();
      this.OooOo0 = ((VelocityTracker)localObject1);
    }
    localObject1 = this.OooOo0;
    ((VelocityTracker)localObject1).addMovement(paramMotionEvent);
    i &= 0xFF;
    int k = 6;
    float f1 = 8.407791E-045F;
    int n = 1;
    float f2 = 1.4E-45F;
    boolean bool5 = false;
    MotionEvent localMotionEvent1 = null;
    if (i == k)
    {
      i3 = n;
      f3 = f2;
    }
    else
    {
      i3 = 0;
      f3 = 0.0F;
    }
    if (i3 != 0)
    {
      i4 = paramMotionEvent.getActionIndex();
    }
    else
    {
      i4 = -1;
      f4 = 0.0F / 0.0F;
    }
    int i9 = paramMotionEvent.getPointerCount();
    int i11 = 0;
    float f5 = 0.0F;
    Object localObject2 = null;
    int i12 = 0;
    Object localObject3 = null;
    float f6 = 0.0F;
    VelocityTracker localVelocityTracker = null;
    float f7 = 0.0F;
    float f8 = 0.0F;
    while (i12 < i9)
    {
      if (i4 != i12)
      {
        float f9 = paramMotionEvent.getX(i12);
        f7 += f9;
        f9 = paramMotionEvent.getY(i12);
        f8 += f9;
      }
      i12 += 1;
    }
    if (i3 != 0) {
      i3 = i9 + -1;
    } else {
      i3 = i9;
    }
    float f3 = i3;
    f7 /= f3;
    f8 /= f3;
    int i3 = 2;
    f3 = 2.802597E-045F;
    int i4 = 3;
    float f4 = 4.203895E-045F;
    Object localObject4;
    float f10;
    boolean bool8;
    int i1;
    boolean bool3;
    int i7;
    label1116:
    label1144:
    int i2;
    if (i != 0)
    {
      i12 = 1000;
      f6 = 1.401299E-042F;
      int i5;
      float f11;
      int i10;
      int j;
      if (i != n)
      {
        Object localObject5;
        if (i != i3)
        {
          if (i != i4)
          {
            n = 5;
            f2 = 7.006492E-045F;
            if (i != n)
            {
              if (i != k) {
                break label1608;
              }
              this.OooOOOo = f7;
              this.OooOOo = f7;
              this.OooOOo0 = f8;
              this.OooOOoo = f8;
              localObject4 = this.OooOo0;
              f1 = this.OooO0Oo;
              ((VelocityTracker)localObject4).computeCurrentVelocity(i12, f1);
              i = paramMotionEvent.getActionIndex();
              k = paramMotionEvent.getPointerId(i);
              localObject5 = this.OooOo0;
              f2 = ((VelocityTracker)localObject5).getXVelocity(k);
              f1 = this.OooOo0.getYVelocity(k);
              i3 = 0;
              f3 = 0.0F;
              while (i3 < i9)
              {
                if (i3 != i)
                {
                  i4 = paramMotionEvent.getPointerId(i3);
                  localObject3 = this.OooOo0;
                  f6 = ((VelocityTracker)localObject3).getXVelocity(i4) * f2;
                  localVelocityTracker = this.OooOo0;
                  f4 = localVelocityTracker.getYVelocity(i4) * f1;
                  f6 += f4;
                  i5 = f6 < 0.0F;
                  if (i5 < 0)
                  {
                    paramMotionEvent = this.OooOo0;
                    paramMotionEvent.clear();
                    break;
                  }
                }
                i3 += 1;
              }
            }
            this.OooOOOo = f7;
            this.OooOOo = f7;
            this.OooOOo0 = f8;
            this.OooOOoo = f8;
            OooO0OO();
            break label1608;
          }
          OooO0O0();
          break label1608;
        }
        boolean bool1 = this.OooOO0;
        if (bool1) {
          break label1608;
        }
        f10 = this.OooOOOo - f7;
        f1 = this.OooOOo0 - f8;
        boolean bool7 = this.OooOOOO;
        if (bool7)
        {
          localObject4 = this.OooO0oO;
          bool8 = ((GestureDetector.OnDoubleTapListener)localObject4).onDoubleTapEvent(paramMotionEvent);
          bool5 = false | bool8;
          break label1608;
        }
        bool7 = this.OooOO0O;
        if (bool7)
        {
          f11 = this.OooOOo;
          f11 = f7 - f11;
          i10 = (int)f11;
          f5 = this.OooOOoo;
          f5 = f8 - f5;
          i11 = (int)f5;
          i10 *= i10;
          i11 *= i11;
          i10 += i11;
          i11 = this.OooO00o;
          if (i10 > i11)
          {
            localObject2 = this.OooO0o;
            localObject3 = this.OooOOO0;
            bool8 = ((GestureDetector.OnGestureListener)localObject2).onScroll((MotionEvent)localObject3, paramMotionEvent, f10, f1);
            this.OooOOOo = f7;
            this.OooOOo0 = f8;
            this.OooOO0O = false;
            this.OooO0o0.removeMessages(i5);
            this.OooO0o0.removeMessages(n);
            localObject4 = this.OooO0o0;
            ((Handler)localObject4).removeMessages(i3);
          }
          else
          {
            bool8 = false;
            paramMotionEvent = null;
          }
          j = this.OooO00o;
          if (i10 > j) {
            this.OooOO0o = false;
          }
        }
        else
        {
          f2 = Math.abs(f10);
          i3 = 1065353216;
          f3 = 1.0F;
          i1 = f2 < f3;
          if (i1 < 0)
          {
            f2 = Math.abs(f1);
            i1 = f2 < f3;
            if (i1 < 0) {
              break label1608;
            }
          }
          localObject5 = this.OooO0o;
          localMotionEvent1 = this.OooOOO0;
          bool5 = ((GestureDetector.OnGestureListener)localObject5).onScroll(localMotionEvent1, paramMotionEvent, f10, f1);
          this.OooOOOo = f7;
          this.OooOOo0 = f8;
          break label1608;
        }
      }
      else
      {
        this.OooO0oo = false;
        localObject4 = MotionEvent.obtain(paramMotionEvent);
        bool3 = this.OooOOOO;
        if (bool3)
        {
          localObject1 = this.OooO0oO;
          bool8 = ((GestureDetector.OnDoubleTapListener)localObject1).onDoubleTapEvent(paramMotionEvent) | false;
        }
        else
        {
          bool3 = this.OooOO0;
          if (bool3)
          {
            paramMotionEvent = this.OooO0o0;
            paramMotionEvent.removeMessages(i5);
            this.OooOO0 = false;
          }
          else
          {
            bool3 = this.OooOO0O;
            if (bool3)
            {
              localObject1 = this.OooO0o;
              bool3 = ((GestureDetector.OnGestureListener)localObject1).onSingleTapUp(paramMotionEvent);
              boolean bool6 = this.OooO;
              if (bool6)
              {
                localObject6 = this.OooO0oO;
                if (localObject6 != null) {
                  ((GestureDetector.OnDoubleTapListener)localObject6).onSingleTapConfirmed(paramMotionEvent);
                }
              }
              bool8 = bool3;
              break label1144;
            }
            localObject1 = this.OooOo0;
            int i6 = paramMotionEvent.getPointerId(0);
            i10 = this.OooO0Oo;
            f11 = i10;
            ((VelocityTracker)localObject1).computeCurrentVelocity(i12, f11);
            f11 = ((VelocityTracker)localObject1).getYVelocity(i6);
            f1 = ((VelocityTracker)localObject1).getXVelocity(i6);
            f4 = Math.abs(f11);
            i11 = this.OooO0OO;
            f5 = i11;
            i7 = f4 < f5;
            if (i7 > 0) {
              break label1116;
            }
            f4 = Math.abs(f1);
            i11 = this.OooO0OO;
            f5 = i11;
            i7 = f4 < f5;
            if (i7 > 0) {
              break label1116;
            }
          }
          bool8 = false;
          paramMotionEvent = null;
          break label1144;
          Object localObject6 = this.OooO0o;
          localObject2 = this.OooOOO0;
          bool8 = ((GestureDetector.OnGestureListener)localObject6).onFling((MotionEvent)localObject2, paramMotionEvent, f1, f11);
        }
        localObject1 = this.OooOOO;
        if (localObject1 != null) {
          ((MotionEvent)localObject1).recycle();
        }
        this.OooOOO = ((MotionEvent)localObject4);
        localObject4 = this.OooOo0;
        if (localObject4 != null)
        {
          ((VelocityTracker)localObject4).recycle();
          j = 0;
          f10 = 0.0F;
          localObject4 = null;
          this.OooOo0 = null;
        }
        this.OooOOOO = false;
        this.OooO = false;
        this.OooO0o0.removeMessages(i1);
        localObject4 = this.OooO0o0;
        ((Handler)localObject4).removeMessages(i3);
      }
      bool5 = bool8;
    }
    else
    {
      localObject4 = this.OooO0oO;
      boolean bool2;
      if (localObject4 != null)
      {
        localObject4 = this.OooO0o0;
        bool2 = ((Handler)localObject4).hasMessages(i7);
        if (bool2)
        {
          localObject1 = this.OooO0o0;
          ((Handler)localObject1).removeMessages(i7);
        }
        localObject1 = this.OooOOO0;
        if (localObject1 != null)
        {
          MotionEvent localMotionEvent2 = this.OooOOO;
          if ((localMotionEvent2 != null) && (bool2))
          {
            bool2 = OooO0o0((MotionEvent)localObject1, localMotionEvent2, paramMotionEvent);
            if (bool2)
            {
              this.OooOOOO = i1;
              localObject4 = this.OooO0oO;
              localObject1 = this.OooOOO0;
              bool2 = ((GestureDetector.OnDoubleTapListener)localObject4).onDoubleTap((MotionEvent)localObject1) | false;
              localObject1 = this.OooO0oO;
              bool3 = ((GestureDetector.OnDoubleTapListener)localObject1).onDoubleTapEvent(paramMotionEvent);
              bool2 |= bool3;
              break label1392;
            }
          }
        }
        localObject4 = this.OooO0o0;
        int m = OooOo0o;
        long l1 = m;
        ((Handler)localObject4).sendEmptyMessageDelayed(i7, l1);
      }
      else
      {
        bool2 = false;
        localObject4 = null;
        f10 = 0.0F;
      }
      label1392:
      this.OooOOOo = f7;
      this.OooOOo = f7;
      this.OooOOo0 = f8;
      this.OooOOoo = f8;
      localObject1 = this.OooOOO0;
      if (localObject1 != null) {
        ((MotionEvent)localObject1).recycle();
      }
      localObject1 = MotionEvent.obtain(paramMotionEvent);
      this.OooOOO0 = ((MotionEvent)localObject1);
      this.OooOO0O = i1;
      this.OooOO0o = i1;
      this.OooO0oo = i1;
      this.OooOO0 = false;
      this.OooO = false;
      boolean bool4 = this.OooOo00;
      if (bool4)
      {
        this.OooO0o0.removeMessages(i3);
        localObject1 = this.OooO0o0;
        localMotionEvent1 = this.OooOOO0;
        l2 = localMotionEvent1.getDownTime();
        long l3 = OooOo0O;
        l2 += l3;
        i2 = ViewConfiguration.getLongPressTimeout();
        l3 = i2;
        l2 += l3;
        ((Handler)localObject1).sendEmptyMessageAtTime(i3, l2);
      }
      localObject1 = this.OooO0o0;
      localMotionEvent1 = this.OooOOO0;
      long l4 = localMotionEvent1.getDownTime();
      int i8 = OooOo0O;
      long l2 = i8;
      l4 += l2;
      ((Handler)localObject1).sendEmptyMessageAtTime(i1, l4);
      localObject1 = this.OooO0o;
      bool8 = ((GestureDetector.OnGestureListener)localObject1).onDown(paramMotionEvent);
      i2 = bool2 | bool8;
    }
    label1608:
    return i2;
  }
  
  public final void OooO0O0()
  {
    this.OooO0o0.removeMessages(1);
    this.OooO0o0.removeMessages(2);
    this.OooO0o0.removeMessages(3);
    this.OooOo0.recycle();
    this.OooOo0 = null;
    this.OooOOOO = false;
    this.OooO0oo = false;
    this.OooOO0O = false;
    this.OooOO0o = false;
    this.OooO = false;
    boolean bool = this.OooOO0;
    if (bool) {
      this.OooOO0 = false;
    }
  }
  
  public final void OooO0OO()
  {
    this.OooO0o0.removeMessages(1);
    this.OooO0o0.removeMessages(2);
    this.OooO0o0.removeMessages(3);
    this.OooOOOO = false;
    this.OooOO0O = false;
    this.OooOO0o = false;
    this.OooO = false;
    boolean bool = this.OooOO0;
    if (bool) {
      this.OooOO0 = false;
    }
  }
  
  public void OooO0Oo()
  {
    this.OooO0o0.removeMessages(3);
    this.OooO = false;
    this.OooOO0 = true;
    GestureDetector.OnGestureListener localOnGestureListener = this.OooO0o;
    MotionEvent localMotionEvent = this.OooOOO0;
    localOnGestureListener.onLongPress(localMotionEvent);
  }
  
  public final boolean OooO0o0(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, MotionEvent paramMotionEvent3)
  {
    boolean bool1 = this.OooOO0o;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    long l1 = paramMotionEvent3.getEventTime();
    long l2 = paramMotionEvent2.getEventTime();
    l1 -= l2;
    l2 = OooOo0o;
    boolean bool3 = l1 < l2;
    if (bool3) {
      return false;
    }
    float f1 = paramMotionEvent1.getX();
    int j = (int)f1;
    float f2 = paramMotionEvent3.getX();
    int i = (int)f2;
    j -= i;
    float f3 = paramMotionEvent1.getY();
    int k = (int)f3;
    float f4 = paramMotionEvent3.getY();
    int m = (int)f4;
    k -= m;
    j *= j;
    k *= k;
    j += k;
    k = this.OooO0O0;
    if (j < k) {
      bool2 = true;
    }
    return bool2;
  }
  
  public boolean isLongpressEnabled()
  {
    return this.OooOo00;
  }
  
  public void setIsLongpressEnabled(boolean paramBoolean)
  {
    this.OooOo00 = paramBoolean;
  }
  
  public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener paramOnDoubleTapListener)
  {
    this.OooO0oO = paramOnDoubleTapListener;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase
 * JD-Core Version:    0.7.0.1
 */
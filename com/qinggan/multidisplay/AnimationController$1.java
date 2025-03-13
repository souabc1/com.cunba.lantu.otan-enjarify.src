package com.qinggan.multidisplay;

import android.view.GestureDetector.OnGestureListener;
import android.view.InputDevice;
import android.view.InputEvent;
import android.view.MotionEvent;
import m54207b69;

class AnimationController$1
  implements GestureDetector.OnGestureListener
{
  public boolean onDown(MotionEvent paramMotionEvent)
  {
    MultiDisplayManager.OooOOOO.booleanValue();
    return false;
  }
  
  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    Object localObject = MultiDisplayManager.OooOOOO;
    boolean bool1 = ((Boolean)localObject).booleanValue();
    if (bool1)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = m54207b69.F54207b69_11("JH27271027252B356F2D144745463A344B1C324D4B383E4718448B82");
      ((StringBuilder)localObject).append(str);
      int i = this.OooO00o.OooO00o;
      ((StringBuilder)localObject).append(i);
      str = m54207b69.F54207b69_11("h61A17550A1C53121D");
      ((StringBuilder)localObject).append(str);
      f = paramMotionEvent1.getX();
      ((StringBuilder)localObject).append(f);
      paramMotionEvent1 = m54207b69.F54207b69_11("Qm414E0A62471A5D54");
      ((StringBuilder)localObject).append(paramMotionEvent1);
      f = paramMotionEvent2.getX();
      ((StringBuilder)localObject).append(f);
      paramMotionEvent1 = m54207b69.F54207b69_11("`n424F1A0E0606130E2220405F5A");
      ((StringBuilder)localObject).append(paramMotionEvent1);
      ((StringBuilder)localObject).append(paramFloat1);
      paramMotionEvent1 = m54207b69.F54207b69_11("/f4A4712060E0E0B161A28496752");
      ((StringBuilder)localObject).append(paramMotionEvent1);
      ((StringBuilder)localObject).append(paramFloat2);
    }
    float f = -2000.0F;
    boolean bool2 = paramFloat1 < f;
    int m = 1;
    if (bool2)
    {
      paramMotionEvent1 = this.OooO00o;
      int j = paramMotionEvent1.OooO00o;
      if (j == m) {}
    }
    else
    {
      f = 2000.0F;
      boolean bool3 = paramFloat1 < f;
      if (!bool3) {
        break label238;
      }
      paramMotionEvent1 = this.OooO00o;
      int k = paramMotionEvent1.OooO00o;
      if (k != 0) {
        break label238;
      }
    }
    paramMotionEvent1 = this.OooO00o;
    paramMotionEvent1.OooOO0o(m, paramFloat1, paramFloat2);
    label238:
    return false;
  }
  
  public void onLongPress(MotionEvent paramMotionEvent)
  {
    Object localObject = MultiDisplayManager.OooOOOO;
    boolean bool = ((Boolean)localObject).booleanValue();
    if (bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = m54207b69.F54207b69_11("e25D5D8060605A68475F4A4B1D63296466546C636A9068756E202B");
      ((StringBuilder)localObject).append(str);
      paramMotionEvent = paramMotionEvent.getDevice().getName();
      ((StringBuilder)localObject).append(paramMotionEvent);
    }
  }
  
  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public void onShowPress(MotionEvent paramMotionEvent) {}
  
  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.multidisplay.AnimationController.1
 * JD-Core Version:    0.7.0.1
 */
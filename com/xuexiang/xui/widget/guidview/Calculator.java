package com.xuexiang.xui.widget.guidview;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import m54207b69;

class Calculator
{
  public boolean OooO;
  public final int OooO00o;
  public final int OooO0O0;
  public FocusShape OooO0OO;
  public int OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  public int OooO0oO;
  public int OooO0oo;
  
  public Calculator(Activity paramActivity, FocusShape paramFocusShape, View paramView, double paramDouble, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    DisplayMetrics localDisplayMetrics = new android/util/DisplayMetrics;
    localDisplayMetrics.<init>();
    paramActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    int i = localDisplayMetrics.widthPixels;
    int j = localDisplayMetrics.heightPixels;
    this.OooO00o = i;
    i = 0;
    int k;
    if (paramBoolean) {
      k = 0;
    } else {
      k = Utils.OooO00o(paramActivity);
    }
    j -= k;
    this.OooO0O0 = j;
    if (paramView != null)
    {
      j = -1;
      if (paramInt1 == j) {
        if (paramBoolean)
        {
          paramInt1 = 0;
        }
        else
        {
          m = Utils.OooO00o(paramActivity);
          paramInt1 = m;
        }
      }
      int m = 2;
      int[] arrayOfInt = new int[m];
      paramView.getLocationInWindow(arrayOfInt);
      j = paramView.getWidth();
      this.OooO0Oo = j;
      j = paramView.getHeight();
      this.OooO0o0 = j;
      this.OooO0OO = paramFocusShape;
      int n = arrayOfInt[0];
      i = this.OooO0Oo / m;
      n = n + i + paramInt2;
      this.OooO0o = n;
      n = 1;
      paramBoolean = arrayOfInt[n];
      j /= m;
      paramBoolean = paramBoolean + j - paramInt1;
      this.OooO0oO = paramBoolean;
      double d1 = paramView.getWidth();
      double d2 = paramView.getHeight();
      d1 = Math.hypot(d1, d2);
      d2 = 2.0D;
      d1 = (int)(d1 / d2) * paramDouble;
      m = (int)d1;
      this.OooO0oo = m;
      this.OooO = n;
    }
    else
    {
      this.OooO = false;
    }
  }
  
  public float OooO00o(int paramInt, double paramDouble)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[1] = localObject;
    localObject = Double.valueOf(paramDouble);
    arrayOfObject[2] = localObject;
    return m54207b69.F54207b69_07(3619, arrayOfObject);
  }
  
  public boolean OooO0O0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(3620, arrayOfObject);
  }
  
  public float OooO0OO(int paramInt, double paramDouble)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[1] = localObject;
    localObject = Double.valueOf(paramDouble);
    arrayOfObject[2] = localObject;
    return m54207b69.F54207b69_07(3621, arrayOfObject);
  }
  
  public float OooO0Oo(int paramInt, double paramDouble)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[1] = localObject;
    localObject = Double.valueOf(paramDouble);
    arrayOfObject[2] = localObject;
    return m54207b69.F54207b69_07(3622, arrayOfObject);
  }
  
  public float OooO0o(int paramInt, double paramDouble)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[1] = localObject;
    localObject = Double.valueOf(paramDouble);
    arrayOfObject[2] = localObject;
    return m54207b69.F54207b69_07(3623, arrayOfObject);
  }
  
  public float OooO0o0(int paramInt, double paramDouble)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[1] = localObject;
    localObject = Double.valueOf(paramDouble);
    arrayOfObject[2] = localObject;
    return m54207b69.F54207b69_07(3624, arrayOfObject);
  }
  
  public void OooO0oO(int paramInt1, int paramInt2, int paramInt3)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    localInteger = Integer.valueOf(paramInt3);
    arrayOfObject[3] = localInteger;
    m54207b69.F54207b69_00(3625, arrayOfObject);
  }
  
  public void OooO0oo(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    localInteger = Integer.valueOf(paramInt3);
    arrayOfObject[3] = localInteger;
    localInteger = Integer.valueOf(paramInt4);
    arrayOfObject[4] = localInteger;
    m54207b69.F54207b69_00(3626, arrayOfObject);
  }
  
  public int getBitmapHeight()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(3627, arrayOfObject);
  }
  
  public int getBitmapWidth()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(3628, arrayOfObject);
  }
  
  public int getCircleCenterX()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(3629, arrayOfObject);
  }
  
  public int getCircleCenterY()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(3630, arrayOfObject);
  }
  
  public int getFocusHeight()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(3631, arrayOfObject);
  }
  
  public FocusShape getFocusShape()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (FocusShape)m54207b69.F54207b69_09(3632, arrayOfObject);
  }
  
  public int getFocusWidth()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(3633, arrayOfObject);
  }
  
  public int getViewRadius()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(3634, arrayOfObject);
  }
  
  public void setCircleRadius(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3635, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.guidview.Calculator
 * JD-Core Version:    0.7.0.1
 */
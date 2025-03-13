package com.scwang.smartrefresh.layout.util;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;

public class ScrollBoundaryUtil
{
  public static boolean OooO00o(View paramView, PointF paramPointF, boolean paramBoolean)
  {
    boolean bool1 = OooO0OO(paramView);
    boolean bool3 = false;
    if (bool1)
    {
      int i = paramView.getVisibility();
      if (i == 0) {
        return false;
      }
    }
    boolean bool2 = paramView instanceof ViewGroup;
    boolean bool5;
    if ((bool2) && (paramPointF != null))
    {
      bool2 = SmartUtil.OooO0OO((View)paramView);
      if (!bool2)
      {
        Object localObject = paramView;
        localObject = (ViewGroup)paramView;
        int j = ((ViewGroup)localObject).getChildCount();
        PointF localPointF = new android/graphics/PointF;
        localPointF.<init>();
        int k = 0;
        while (k < j)
        {
          View localView = ((ViewGroup)localObject).getChildAt(k);
          float f1 = paramPointF.x;
          float f2 = paramPointF.y;
          boolean bool4 = OooO0o0((View)localObject, localView, f1, f2, localPointF);
          if (bool4)
          {
            float f3 = localPointF.x;
            float f4 = localPointF.y;
            paramPointF.offset(f3, f4);
            bool5 = OooO00o(localView, paramPointF, paramBoolean);
            float f5 = -localPointF.x;
            f4 = -localPointF.y;
            paramPointF.offset(f5, f4);
            return bool5;
          }
          k += 1;
        }
      }
    }
    if (!paramBoolean)
    {
      bool5 = OooO0Oo((View)paramView);
      if (!bool5) {}
    }
    else
    {
      bool3 = true;
    }
    return bool3;
  }
  
  public static boolean OooO0O0(View paramView, PointF paramPointF)
  {
    boolean bool1 = OooO0Oo(paramView);
    if (bool1)
    {
      int i = paramView.getVisibility();
      if (i == 0) {
        return false;
      }
    }
    boolean bool2 = paramView instanceof ViewGroup;
    if ((bool2) && (paramPointF != null))
    {
      paramView = (ViewGroup)paramView;
      int j = paramView.getChildCount();
      PointF localPointF = new android/graphics/PointF;
      localPointF.<init>();
      while (j > 0)
      {
        int k = j + -1;
        View localView = paramView.getChildAt(k);
        float f1 = paramPointF.x;
        float f2 = paramPointF.y;
        boolean bool3 = OooO0o0(paramView, localView, f1, f2, localPointF);
        if (bool3)
        {
          float f3 = localPointF.x;
          float f4 = localPointF.y;
          paramPointF.offset(f3, f4);
          boolean bool4 = OooO0O0(localView, paramPointF);
          f4 = -localPointF.x;
          float f5 = -localPointF.y;
          paramPointF.offset(f4, f5);
          return bool4;
        }
        j += -1;
      }
    }
    return true;
  }
  
  public static boolean OooO0OO(View paramView)
  {
    return paramView.canScrollVertically(1);
  }
  
  public static boolean OooO0Oo(View paramView)
  {
    return paramView.canScrollVertically(-1);
  }
  
  public static boolean OooO0o0(View paramView1, View paramView2, float paramFloat1, float paramFloat2, PointF paramPointF)
  {
    int i = paramView2.getVisibility();
    if (i != 0) {
      return false;
    }
    i = 2;
    float[] arrayOfFloat = new float[i];
    arrayOfFloat[0] = paramFloat1;
    boolean bool1 = true;
    float f1 = 1.4E-45F;
    arrayOfFloat[bool1] = paramFloat2;
    int j = paramView1.getScrollX();
    int m = paramView2.getLeft();
    j -= m;
    float f2 = j + paramFloat1;
    arrayOfFloat[0] = f2;
    f2 = arrayOfFloat[bool1];
    int n = paramView1.getScrollY();
    m = paramView2.getTop();
    n -= m;
    float f3 = n;
    f2 += f3;
    arrayOfFloat[bool1] = f2;
    f3 = arrayOfFloat[0];
    m = 0;
    boolean bool4 = f3 < 0.0F;
    float f4;
    if (!bool4)
    {
      boolean bool2 = f2 < 0.0F;
      if (!bool2)
      {
        int k = paramView2.getWidth();
        f2 = k;
        bool3 = f3 < f2;
        if (bool3)
        {
          f3 = arrayOfFloat[bool1];
          int i1 = paramView2.getHeight();
          f4 = i1;
          bool3 = f3 < f4;
          if (bool3)
          {
            bool3 = bool1;
            f3 = f1;
            break label220;
          }
        }
      }
    }
    boolean bool3 = false;
    paramView1 = null;
    f3 = 0.0F;
    label220:
    if ((bool3) && (paramPointF != null))
    {
      f4 = arrayOfFloat[0] - paramFloat1;
      paramFloat1 = arrayOfFloat[bool1] - paramFloat2;
      paramPointF.set(f4, paramFloat1);
    }
    return bool3;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.util.ScrollBoundaryUtil
 * JD-Core Version:    0.7.0.1
 */
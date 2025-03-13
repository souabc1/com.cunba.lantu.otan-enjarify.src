package com.scwang.smartrefresh.layout.util;

import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.ScrollingView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

public abstract class SmartUtil
{
  public static void OooO00o(View paramView, int paramInt)
  {
    boolean bool = paramView instanceof ScrollView;
    if (bool)
    {
      paramView = (ScrollView)paramView;
      paramView.fling(paramInt);
    }
    else
    {
      bool = paramView instanceof AbsListView;
      if (bool)
      {
        paramView = (AbsListView)paramView;
        paramView.fling(paramInt);
      }
      else
      {
        bool = paramView instanceof WebView;
        if (bool)
        {
          paramView = (WebView)paramView;
          paramView.flingScroll(0, paramInt);
        }
        else
        {
          bool = paramView instanceof NestedScrollView;
          if (bool)
          {
            paramView = (NestedScrollView)paramView;
            paramView.OooOOOo(paramInt);
          }
          else
          {
            bool = paramView instanceof RecyclerView;
            if (bool)
            {
              paramView = (RecyclerView)paramView;
              paramView.fling(0, paramInt);
            }
          }
        }
      }
    }
  }
  
  public static boolean OooO0O0(View paramView)
  {
    boolean bool1 = OooO0OO(paramView);
    if (!bool1)
    {
      bool1 = paramView instanceof ViewPager;
      if (!bool1)
      {
        bool2 = paramView instanceof NestedScrollingParent;
        if (!bool2)
        {
          bool2 = false;
          paramView = null;
          return bool2;
        }
      }
    }
    boolean bool2 = true;
    return bool2;
  }
  
  public static boolean OooO0OO(View paramView)
  {
    boolean bool1 = paramView instanceof AbsListView;
    if (!bool1)
    {
      bool1 = paramView instanceof ScrollView;
      if (!bool1)
      {
        bool1 = paramView instanceof ScrollingView;
        if (!bool1)
        {
          bool1 = paramView instanceof WebView;
          if (!bool1)
          {
            bool2 = paramView instanceof NestedScrollingChild;
            if (!bool2)
            {
              bool2 = false;
              paramView = null;
              return bool2;
            }
          }
        }
      }
    }
    boolean bool2 = true;
    return bool2;
  }
  
  public static int OooO0Oo(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams == null)
    {
      localLayoutParams = new android/view/ViewGroup$LayoutParams;
      i = -1;
      j = -2;
      localLayoutParams.<init>(i, j);
    }
    int i = localLayoutParams.width;
    int j = 0;
    i = ViewGroup.getChildMeasureSpec(0, 0, i);
    int k = localLayoutParams.height;
    if (k > 0)
    {
      j = 1073741824;
      k = View.MeasureSpec.makeMeasureSpec(k, j);
    }
    else
    {
      k = View.MeasureSpec.makeMeasureSpec(0, 0);
    }
    paramView.measure(i, k);
    return paramView.getMeasuredHeight();
  }
  
  public static void OooO0o0(AbsListView paramAbsListView, int paramInt)
  {
    paramAbsListView.scrollListBy(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.layout.util.SmartUtil
 * JD-Core Version:    0.7.0.1
 */
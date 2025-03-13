package com.xuexiang.xui.widget.tabbar;

import android.database.DataSetObserver;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.widget.tabbar.vertical.TabAdapter;
import com.xuexiang.xui.widget.tabbar.vertical.TabView;
import java.util.List;
import m54207b69;

public class VerticalTabLayout
  extends ScrollView
{
  public static int o00o000o = 10;
  public static int oo00oO = 11;
  public VerticalTabLayout.TabStrip o00OoOoo;
  public TabView o00Ooo0;
  public int o00Ooo00;
  public int o00Ooo0O;
  public int o00Ooo0o;
  public float o00OooO;
  public int o00OooO0;
  public int o00OooOO;
  public int o00OooOo;
  public PagerAdapter o00OoooO;
  public TabAdapter o00Ooooo;
  public VerticalTabLayout.OnTabPageChangeListener o00o000;
  public List o00o0000;
  public DataSetObserver o00o000O;
  public ViewPager o0O00o0;
  
  public void OooOO0o(VerticalTabLayout.OnTabSelectedListener paramOnTabSelectedListener)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramOnTabSelectedListener;
    m54207b69.F54207b69_00(5944, arrayOfObject);
  }
  
  public final void OooOOO(TabView paramTabView)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramTabView;
    m54207b69.F54207b69_00(5945, arrayOfObject);
  }
  
  public void OooOOO0(TabView paramTabView)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramTabView;
    m54207b69.F54207b69_00(5946, arrayOfObject);
  }
  
  public int OooOOOO(TabView paramTabView)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramTabView;
    return m54207b69.F54207b69_05(5947, arrayOfObject);
  }
  
  public final void OooOOOo()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5948, arrayOfObject);
  }
  
  public final void OooOOo()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5949, arrayOfObject);
  }
  
  public final void OooOOo0(LinearLayout.LayoutParams paramLayoutParams)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramLayoutParams;
    m54207b69.F54207b69_00(5950, arrayOfObject);
  }
  
  public void OooOOoo()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5951, arrayOfObject);
  }
  
  public final void OooOo0(PagerAdapter paramPagerAdapter, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramPagerAdapter;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[2] = localBoolean;
    m54207b69.F54207b69_00(5952, arrayOfObject);
  }
  
  public final void OooOo00(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5953, arrayOfObject);
  }
  
  public final void OooOo0O(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[1] = localObject;
    localObject = Boolean.valueOf(paramBoolean1);
    arrayOfObject[2] = localObject;
    localObject = Boolean.valueOf(paramBoolean2);
    arrayOfObject[3] = localObject;
    m54207b69.F54207b69_00(5954, arrayOfObject);
  }
  
  public final void OooOo0o(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[1] = localObject;
    localObject = Boolean.valueOf(paramBoolean1);
    arrayOfObject[2] = localObject;
    localObject = Boolean.valueOf(paramBoolean2);
    arrayOfObject[3] = localObject;
    m54207b69.F54207b69_00(5955, arrayOfObject);
  }
  
  public int getSelectedTabPosition()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(5956, arrayOfObject);
  }
  
  public TabAdapter getTabAdapter()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (TabAdapter)m54207b69.F54207b69_09(5957, arrayOfObject);
  }
  
  public TabView getTabAt(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (TabView)m54207b69.F54207b69_09(5958, arrayOfObject);
  }
  
  public int getTabCount()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(5959, arrayOfObject);
  }
  
  public void onFinishInflate()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5960, arrayOfObject);
  }
  
  public void setIndicatorColor(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5961, arrayOfObject);
  }
  
  public void setIndicatorCorners(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5962, arrayOfObject);
  }
  
  public void setIndicatorGravity(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5963, arrayOfObject);
  }
  
  public void setIndicatorWidth(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5964, arrayOfObject);
  }
  
  public void setTabAdapter(TabAdapter paramTabAdapter)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramTabAdapter;
    m54207b69.F54207b69_00(5965, arrayOfObject);
  }
  
  public void setTabBadge(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(5966, arrayOfObject);
  }
  
  public void setTabBadge(int paramInt, String paramString)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    arrayOfObject[2] = paramString;
    m54207b69.F54207b69_00(5967, arrayOfObject);
  }
  
  public void setTabHeight(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5968, arrayOfObject);
  }
  
  public void setTabMargin(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5969, arrayOfObject);
  }
  
  public void setTabMode(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5970, arrayOfObject);
  }
  
  public void setTabSelected(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5971, arrayOfObject);
  }
  
  public void setupWithViewPager(ViewPager paramViewPager)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramViewPager;
    m54207b69.F54207b69_00(5972, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.tabbar.VerticalTabLayout
 * JD-Core Version:    0.7.0.1
 */
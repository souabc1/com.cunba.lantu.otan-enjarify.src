package com.xuexiang.xui.widget.tabbar;

import android.animation.Animator;
import android.database.DataSetObserver;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View.OnClickListener;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import java.util.ArrayList;
import m54207b69;

public class TabSegment
  extends HorizontalScrollView
{
  public final ArrayList o00OoOoo;
  public int o00Ooo0;
  public TabSegment.Container o00Ooo00;
  public int o00Ooo0O;
  public int o00Ooo0o;
  public int o00OooO;
  public boolean o00OooO0;
  public boolean o00OooOO;
  public Drawable o00OooOo;
  public Rect o00OoooO;
  public Paint o00Ooooo;
  public DataSetObserver o00o0;
  public TabSegment.TypefaceProvider o00o00;
  public int o00o000;
  public int o00o0000;
  public int o00o000O;
  public int o00o000o;
  public int o00o00O0;
  public Animator o00o00Oo;
  public View.OnClickListener o00o00o;
  public TabSegment.OnTabClickListener o00o00o0;
  public ViewPager o00o00oO;
  public PagerAdapter o00o00oo;
  public TabSegment.OnTabSelectedListener o00o0O0;
  public ViewPager.OnPageChangeListener o00o0O00;
  public TabSegment.AdapterChangeListener o00o0O0O;
  public boolean o00o0OO0;
  public boolean o0O00o0;
  public int oo00oO;
  
  private TabSegment.TabAdapter getAdapter()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (TabSegment.TabAdapter)m54207b69.F54207b69_09(5876, arrayOfObject);
  }
  
  private int getTabCount()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(5881, arrayOfObject);
  }
  
  private void setViewPagerScrollState(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5897, arrayOfObject);
  }
  
  public final int Oooo(TabSegment.Tab paramTab)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramTab;
    return m54207b69.F54207b69_05(5852, arrayOfObject);
  }
  
  public TabSegment Oooo0(TabSegment.Tab paramTab)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramTab;
    return (TabSegment)m54207b69.F54207b69_09(5853, arrayOfObject);
  }
  
  public void Oooo00o(TabSegment.OnTabSelectedListener paramOnTabSelectedListener)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramOnTabSelectedListener;
    m54207b69.F54207b69_00(5856, arrayOfObject);
  }
  
  public final void Oooo0O0(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5857, arrayOfObject);
  }
  
  public final void Oooo0OO(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5858, arrayOfObject);
  }
  
  public final void Oooo0o(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5859, arrayOfObject);
  }
  
  public final void Oooo0o0(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5860, arrayOfObject);
  }
  
  public final int Oooo0oO(TabSegment.Tab paramTab)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramTab;
    return m54207b69.F54207b69_05(5861, arrayOfObject);
  }
  
  public final int Oooo0oo(TabSegment.Tab paramTab)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramTab;
    return m54207b69.F54207b69_05(5862, arrayOfObject);
  }
  
  public void OoooO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5863, arrayOfObject);
  }
  
  public final void OoooO0(TabSegment.Tab paramTab, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramTab;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[2] = localBoolean;
    m54207b69.F54207b69_00(5864, arrayOfObject);
  }
  
  public final int OoooO00(TabSegment.Tab paramTab)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramTab;
    return m54207b69.F54207b69_05(5865, arrayOfObject);
  }
  
  public final void OoooO0O(TabSegment.Tab paramTab1, TabSegment.Tab paramTab2, float paramFloat)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramTab1;
    arrayOfObject[2] = paramTab2;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[3] = localFloat;
    m54207b69.F54207b69_00(5866, arrayOfObject);
  }
  
  public void OoooOO0(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(5867, arrayOfObject);
  }
  
  public void OoooOOO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5868, arrayOfObject);
  }
  
  public void OoooOOo(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[1] = localObject;
    localObject = Boolean.valueOf(paramBoolean1);
    arrayOfObject[2] = localObject;
    localObject = Boolean.valueOf(paramBoolean2);
    arrayOfObject[3] = localObject;
    m54207b69.F54207b69_00(5869, arrayOfObject);
  }
  
  public final void OoooOo0(TextView paramTextView, Drawable paramDrawable, int paramInt)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramTextView;
    arrayOfObject[2] = paramDrawable;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[3] = localInteger;
    m54207b69.F54207b69_00(5870, arrayOfObject);
  }
  
  public void OoooOoO(PagerAdapter paramPagerAdapter, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramPagerAdapter;
    Boolean localBoolean = Boolean.valueOf(paramBoolean1);
    arrayOfObject[2] = localBoolean;
    localBoolean = Boolean.valueOf(paramBoolean2);
    arrayOfObject[3] = localBoolean;
    m54207b69.F54207b69_00(5871, arrayOfObject);
  }
  
  public final void OoooOoo(TextView paramTextView, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramTextView;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[2] = localBoolean;
    m54207b69.F54207b69_00(5872, arrayOfObject);
  }
  
  public void Ooooo00(ViewPager paramViewPager, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramViewPager;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[2] = localBoolean;
    m54207b69.F54207b69_00(5873, arrayOfObject);
  }
  
  public void Ooooo0o(ViewPager paramViewPager, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramViewPager;
    Boolean localBoolean = Boolean.valueOf(paramBoolean1);
    arrayOfObject[2] = localBoolean;
    localBoolean = Boolean.valueOf(paramBoolean2);
    arrayOfObject[3] = localBoolean;
    m54207b69.F54207b69_00(5874, arrayOfObject);
  }
  
  public void OooooO0(int paramInt, float paramFloat)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[1] = localObject;
    localObject = Float.valueOf(paramFloat);
    arrayOfObject[2] = localObject;
    m54207b69.F54207b69_00(5875, arrayOfObject);
  }
  
  public int getMode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(5877, arrayOfObject);
  }
  
  public int getSelectedIndex()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(5878, arrayOfObject);
  }
  
  public int getSignCount(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return m54207b69.F54207b69_05(5879, arrayOfObject);
  }
  
  public TabSegment.Tab getTab(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (TabSegment.Tab)m54207b69.F54207b69_09(5880, arrayOfObject);
  }
  
  public void o000oOoO(TabSegment.OnTabSelectedListener paramOnTabSelectedListener)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramOnTabSelectedListener;
    m54207b69.F54207b69_00(5882, arrayOfObject);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this;
    Object localObject = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(paramInt1);
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(paramInt2);
    arrayOfObject[3] = localObject;
    localObject = Integer.valueOf(paramInt3);
    arrayOfObject[4] = localObject;
    localObject = Integer.valueOf(paramInt4);
    arrayOfObject[5] = localObject;
    m54207b69.F54207b69_00(5883, arrayOfObject);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(5884, arrayOfObject);
  }
  
  public void setDefaultNormalColor(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5885, arrayOfObject);
  }
  
  public void setDefaultSelectedColor(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5886, arrayOfObject);
  }
  
  public void setDefaultTabIconPosition(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5887, arrayOfObject);
  }
  
  public void setHasIndicator(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(5888, arrayOfObject);
  }
  
  public void setIndicatorDrawable(Drawable paramDrawable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDrawable;
    m54207b69.F54207b69_00(5889, arrayOfObject);
  }
  
  public void setIndicatorPosition(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(5890, arrayOfObject);
  }
  
  public void setIndicatorWidthAdjustContent(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(5891, arrayOfObject);
  }
  
  public void setItemSpaceInScrollMode(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5892, arrayOfObject);
  }
  
  public void setMode(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5893, arrayOfObject);
  }
  
  public void setOnTabClickListener(TabSegment.OnTabClickListener paramOnTabClickListener)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramOnTabClickListener;
    m54207b69.F54207b69_00(5894, arrayOfObject);
  }
  
  public void setTabTextSize(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5895, arrayOfObject);
  }
  
  public void setTypefaceProvider(TabSegment.TypefaceProvider paramTypefaceProvider)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramTypefaceProvider;
    m54207b69.F54207b69_00(5896, arrayOfObject);
  }
  
  public void setupWithViewPager(ViewPager paramViewPager)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramViewPager;
    m54207b69.F54207b69_00(5898, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.tabbar.TabSegment
 * JD-Core Version:    0.7.0.1
 */
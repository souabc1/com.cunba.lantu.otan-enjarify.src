package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.AdapterDataObserver;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback;
import m54207b69;

public final class TabLayoutMediator
{
  private RecyclerView.Adapter adapter;
  private boolean attached;
  private final boolean autoRefresh;
  private TabLayoutMediator.TabLayoutOnPageChangeCallback onPageChangeCallback;
  private TabLayout.OnTabSelectedListener onTabSelectedListener;
  private RecyclerView.AdapterDataObserver pagerAdapterObserver;
  private final boolean smoothScroll;
  private final TabLayoutMediator.TabConfigurationStrategy tabConfigurationStrategy;
  private final TabLayout tabLayout;
  private final ViewPager2 viewPager;
  
  public TabLayoutMediator(TabLayout paramTabLayout, ViewPager2 paramViewPager2, TabLayoutMediator.TabConfigurationStrategy paramTabConfigurationStrategy)
  {
    this(paramTabLayout, paramViewPager2, true, paramTabConfigurationStrategy);
  }
  
  public TabLayoutMediator(TabLayout paramTabLayout, ViewPager2 paramViewPager2, boolean paramBoolean, TabLayoutMediator.TabConfigurationStrategy paramTabConfigurationStrategy)
  {
    this(paramTabLayout, paramViewPager2, paramBoolean, true, paramTabConfigurationStrategy);
  }
  
  public TabLayoutMediator(TabLayout paramTabLayout, ViewPager2 paramViewPager2, boolean paramBoolean1, boolean paramBoolean2, TabLayoutMediator.TabConfigurationStrategy paramTabConfigurationStrategy)
  {
    this.tabLayout = paramTabLayout;
    this.viewPager = paramViewPager2;
    this.autoRefresh = paramBoolean1;
    this.smoothScroll = paramBoolean2;
    this.tabConfigurationStrategy = paramTabConfigurationStrategy;
  }
  
  public void attach()
  {
    boolean bool1 = this.attached;
    if (!bool1)
    {
      localObject1 = this.viewPager.getAdapter();
      this.adapter = ((RecyclerView.Adapter)localObject1);
      if (localObject1 != null)
      {
        bool1 = true;
        this.attached = bool1;
        localObject2 = new com/google/android/material/tabs/TabLayoutMediator$TabLayoutOnPageChangeCallback;
        Object localObject3 = this.tabLayout;
        ((TabLayoutMediator.TabLayoutOnPageChangeCallback)localObject2).<init>((TabLayout)localObject3);
        this.onPageChangeCallback = ((TabLayoutMediator.TabLayoutOnPageChangeCallback)localObject2);
        this.viewPager.OooO0O0((ViewPager2.OnPageChangeCallback)localObject2);
        localObject2 = new com/google/android/material/tabs/TabLayoutMediator$ViewPagerOnTabSelectedListener;
        localObject3 = this.viewPager;
        boolean bool2 = this.smoothScroll;
        ((TabLayoutMediator.ViewPagerOnTabSelectedListener)localObject2).<init>((ViewPager2)localObject3, bool2);
        this.onTabSelectedListener = ((TabLayout.OnTabSelectedListener)localObject2);
        localObject3 = this.tabLayout;
        ((TabLayout)localObject3).addOnTabSelectedListener((TabLayout.OnTabSelectedListener)localObject2);
        boolean bool3 = this.autoRefresh;
        if (bool3)
        {
          localObject2 = new com/google/android/material/tabs/TabLayoutMediator$PagerAdapterObserver;
          ((TabLayoutMediator.PagerAdapterObserver)localObject2).<init>(this);
          this.pagerAdapterObserver = ((RecyclerView.AdapterDataObserver)localObject2);
          localObject3 = this.adapter;
          ((RecyclerView.Adapter)localObject3).registerAdapterDataObserver((RecyclerView.AdapterDataObserver)localObject2);
        }
        populateTabsFromPagerAdapter();
        localObject2 = this.tabLayout;
        int i = this.viewPager.getCurrentItem();
        ((TabLayout)localObject2).setScrollPosition(i, 0.0F, bool1);
        return;
      }
      localObject1 = new java/lang/IllegalStateException;
      localObject2 = m54207b69.F54207b69_11(",Y0D393D183C253C33351D46483C453B453B8A4A40414D504854569356585C544A5C9A315360532F5F66655596A55E6659A96969AC6C726E60657565");
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = new java/lang/IllegalStateException;
    Object localObject2 = m54207b69.F54207b69_11("G}291D21342009180F11392224202917211F6E2621713127263035331F793927283C3F373B3D");
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public void detach()
  {
    boolean bool = this.autoRefresh;
    if (bool)
    {
      localObject1 = this.adapter;
      if (localObject1 != null)
      {
        localObject2 = this.pagerAdapterObserver;
        ((RecyclerView.Adapter)localObject1).unregisterAdapterDataObserver((RecyclerView.AdapterDataObserver)localObject2);
        this.pagerAdapterObserver = null;
      }
    }
    Object localObject1 = this.tabLayout;
    Object localObject2 = this.onTabSelectedListener;
    ((TabLayout)localObject1).removeOnTabSelectedListener((TabLayout.OnTabSelectedListener)localObject2);
    localObject1 = this.viewPager;
    localObject2 = this.onPageChangeCallback;
    ((ViewPager2)localObject1).OooO0o((ViewPager2.OnPageChangeCallback)localObject2);
    this.onTabSelectedListener = null;
    this.onPageChangeCallback = null;
    this.adapter = null;
    this.attached = false;
  }
  
  public boolean isAttached()
  {
    return this.attached;
  }
  
  public void populateTabsFromPagerAdapter()
  {
    this.tabLayout.removeAllTabs();
    Object localObject = this.adapter;
    if (localObject != null)
    {
      int i = ((RecyclerView.Adapter)localObject).getItemCount();
      int j = 0;
      TabLayout localTabLayout1 = null;
      int k = 0;
      while (k < i)
      {
        TabLayout.Tab localTab = this.tabLayout.newTab();
        this.tabConfigurationStrategy.onConfigureTab(localTab, k);
        TabLayout localTabLayout2 = this.tabLayout;
        localTabLayout2.addTab(localTab, false);
        k += 1;
      }
      if (i > 0)
      {
        localObject = this.tabLayout;
        i = ((TabLayout)localObject).getTabCount() + -1;
        i = Math.min(this.viewPager.getCurrentItem(), i);
        localTabLayout1 = this.tabLayout;
        j = localTabLayout1.getSelectedTabPosition();
        if (i != j)
        {
          localTabLayout1 = this.tabLayout;
          localObject = localTabLayout1.getTabAt(i);
          localTabLayout1.selectTab((TabLayout.Tab)localObject);
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.tabs.TabLayoutMediator
 * JD-Core Version:    0.7.0.1
 */
package com.google.android.material.tabs;

import android.database.DataSetObserver;

class TabLayout$PagerAdapterObserver
  extends DataSetObserver
{
  public TabLayout$PagerAdapterObserver(TabLayout paramTabLayout) {}
  
  public void onChanged()
  {
    this.this$0.populateFromPagerAdapter();
  }
  
  public void onInvalidated()
  {
    this.this$0.populateFromPagerAdapter();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.tabs.TabLayout.PagerAdapterObserver
 * JD-Core Version:    0.7.0.1
 */
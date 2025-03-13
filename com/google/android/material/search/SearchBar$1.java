package com.google.android.material.search;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener;

class SearchBar$1
  implements View.OnAttachStateChangeListener
{
  public SearchBar$1(SearchBar paramSearchBar) {}
  
  public void onViewAttachedToWindow(View paramView)
  {
    paramView = SearchBar.access$000(this.this$0);
    AccessibilityManagerCompat.TouchExplorationStateChangeListener localTouchExplorationStateChangeListener = SearchBar.access$100(this.this$0);
    AccessibilityManagerCompat.OooO00o(paramView, localTouchExplorationStateChangeListener);
  }
  
  public void onViewDetachedFromWindow(View paramView)
  {
    paramView = SearchBar.access$000(this.this$0);
    AccessibilityManagerCompat.TouchExplorationStateChangeListener localTouchExplorationStateChangeListener = SearchBar.access$100(this.this$0);
    AccessibilityManagerCompat.OooO0O0(paramView, localTouchExplorationStateChangeListener);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.search.SearchBar.1
 * JD-Core Version:    0.7.0.1
 */
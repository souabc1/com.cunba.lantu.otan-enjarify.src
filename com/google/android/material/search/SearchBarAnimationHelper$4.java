package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class SearchBarAnimationHelper$4
  extends AnimatorListenerAdapter
{
  public SearchBarAnimationHelper$4(SearchBarAnimationHelper paramSearchBarAnimationHelper, SearchBar paramSearchBar) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    SearchBarAnimationHelper.access$102(this.this$0, false);
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this.val$searchBar.setVisibility(4);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.search.SearchBarAnimationHelper.4
 * JD-Core Version:    0.7.0.1
 */
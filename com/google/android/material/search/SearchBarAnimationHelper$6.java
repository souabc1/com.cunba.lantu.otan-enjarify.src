package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class SearchBarAnimationHelper$6
  extends AnimatorListenerAdapter
{
  public SearchBarAnimationHelper$6(SearchBarAnimationHelper paramSearchBarAnimationHelper, SearchBar paramSearchBar) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.val$searchBar.setVisibility(0);
    SearchBarAnimationHelper.access$302(this.this$0, false);
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this.val$searchBar.stopOnLoadAnimation();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.search.SearchBarAnimationHelper.6
 * JD-Core Version:    0.7.0.1
 */
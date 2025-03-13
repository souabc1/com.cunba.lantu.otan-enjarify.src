package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class SearchBarAnimationHelper$2
  extends AnimatorListenerAdapter
{
  public SearchBarAnimationHelper$2(SearchBarAnimationHelper paramSearchBarAnimationHelper, View paramView, Animator paramAnimator) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.val$centerView.setVisibility(8);
    this.val$secondaryViewAnimator.start();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.search.SearchBarAnimationHelper.2
 * JD-Core Version:    0.7.0.1
 */
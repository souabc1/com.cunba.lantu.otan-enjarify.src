package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class SearchViewAnimationHelper$1
  extends AnimatorListenerAdapter
{
  public SearchViewAnimationHelper$1(SearchViewAnimationHelper paramSearchViewAnimationHelper) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = SearchViewAnimationHelper.access$000(this.this$0);
    boolean bool = paramAnimator.isAdjustNothingSoftInputMode();
    if (!bool)
    {
      paramAnimator = SearchViewAnimationHelper.access$000(this.this$0);
      paramAnimator.requestFocusAndShowKeyboardIfNeeded();
    }
    paramAnimator = SearchViewAnimationHelper.access$000(this.this$0);
    SearchView.TransitionState localTransitionState = SearchView.TransitionState.SHOWN;
    paramAnimator.setTransitionState(localTransitionState);
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    SearchViewAnimationHelper.access$100(this.this$0).setVisibility(0);
    SearchViewAnimationHelper.access$300(this.this$0).stopOnLoadAnimation();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.search.SearchViewAnimationHelper.1
 * JD-Core Version:    0.7.0.1
 */
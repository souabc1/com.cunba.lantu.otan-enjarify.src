package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class SearchViewAnimationHelper$3
  extends AnimatorListenerAdapter
{
  public SearchViewAnimationHelper$3(SearchViewAnimationHelper paramSearchViewAnimationHelper) {}
  
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
    paramAnimator = SearchViewAnimationHelper.access$000(this.this$0);
    SearchView.TransitionState localTransitionState = SearchView.TransitionState.SHOWING;
    paramAnimator.setTransitionState(localTransitionState);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.search.SearchViewAnimationHelper.3
 * JD-Core Version:    0.7.0.1
 */
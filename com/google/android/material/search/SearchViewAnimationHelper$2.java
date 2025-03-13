package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class SearchViewAnimationHelper$2
  extends AnimatorListenerAdapter
{
  public SearchViewAnimationHelper$2(SearchViewAnimationHelper paramSearchViewAnimationHelper) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = SearchViewAnimationHelper.access$100(this.this$0);
    int i = 8;
    paramAnimator.setVisibility(i);
    paramAnimator = SearchViewAnimationHelper.access$000(this.this$0);
    boolean bool = paramAnimator.isAdjustNothingSoftInputMode();
    if (!bool)
    {
      paramAnimator = SearchViewAnimationHelper.access$000(this.this$0);
      paramAnimator.clearFocusAndHideKeyboard();
    }
    paramAnimator = SearchViewAnimationHelper.access$000(this.this$0);
    SearchView.TransitionState localTransitionState = SearchView.TransitionState.HIDDEN;
    paramAnimator.setTransitionState(localTransitionState);
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    paramAnimator = SearchViewAnimationHelper.access$000(this.this$0);
    SearchView.TransitionState localTransitionState = SearchView.TransitionState.HIDING;
    paramAnimator.setTransitionState(localTransitionState);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.search.SearchViewAnimationHelper.2
 * JD-Core Version:    0.7.0.1
 */
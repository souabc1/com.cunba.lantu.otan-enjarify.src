package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.internal.ClippableRoundedCornerLayout;

class SearchViewAnimationHelper$5
  extends AnimatorListenerAdapter
{
  public SearchViewAnimationHelper$5(SearchViewAnimationHelper paramSearchViewAnimationHelper, boolean paramBoolean) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    paramAnimator = this.this$0;
    boolean bool1 = this.val$show;
    int i;
    float f;
    if (bool1)
    {
      i = 1065353216;
      f = 1.0F;
    }
    else
    {
      i = 0;
      f = 0.0F;
    }
    SearchViewAnimationHelper.access$200(paramAnimator, f);
    boolean bool2 = this.val$show;
    if (bool2)
    {
      paramAnimator = SearchViewAnimationHelper.access$100(this.this$0);
      paramAnimator.resetClipBoundsAndCornerRadius();
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    paramAnimator = this.this$0;
    boolean bool = this.val$show;
    float f;
    if (bool)
    {
      bool = false;
      f = 0.0F;
    }
    else
    {
      int i = 1065353216;
      f = 1.0F;
    }
    SearchViewAnimationHelper.access$200(paramAnimator, f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.search.SearchViewAnimationHelper.5
 * JD-Core Version:    0.7.0.1
 */
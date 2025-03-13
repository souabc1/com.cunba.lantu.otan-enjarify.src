package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

class DefaultItemAnimator$5
  extends AnimatorListenerAdapter
{
  public DefaultItemAnimator$5(DefaultItemAnimator paramDefaultItemAnimator, RecyclerView.ViewHolder paramViewHolder, View paramView, ViewPropertyAnimator paramViewPropertyAnimator) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    this.o00Ooo00.setAlpha(1.0F);
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.o00Ooo0.setListener(null);
    paramAnimator = this.o00Ooo0O;
    RecyclerView.ViewHolder localViewHolder = this.o00OoOoo;
    paramAnimator.OooOo0O(localViewHolder);
    paramAnimator = this.o00Ooo0O.OooOOOO;
    localViewHolder = this.o00OoOoo;
    paramAnimator.remove(localViewHolder);
    this.o00Ooo0O.OoooO00();
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    paramAnimator = this.o00Ooo0O;
    RecyclerView.ViewHolder localViewHolder = this.o00OoOoo;
    paramAnimator.OooOo0o(localViewHolder);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.DefaultItemAnimator.5
 * JD-Core Version:    0.7.0.1
 */
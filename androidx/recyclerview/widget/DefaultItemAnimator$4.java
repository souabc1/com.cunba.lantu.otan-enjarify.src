package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

class DefaultItemAnimator$4
  extends AnimatorListenerAdapter
{
  public DefaultItemAnimator$4(DefaultItemAnimator paramDefaultItemAnimator, RecyclerView.ViewHolder paramViewHolder, ViewPropertyAnimator paramViewPropertyAnimator, View paramView) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.o00Ooo00.setListener(null);
    this.o00Ooo0.setAlpha(1.0F);
    paramAnimator = this.o00Ooo0O;
    RecyclerView.ViewHolder localViewHolder = this.o00OoOoo;
    paramAnimator.OooOoo0(localViewHolder);
    paramAnimator = this.o00Ooo0O.OooOOo0;
    localViewHolder = this.o00OoOoo;
    paramAnimator.remove(localViewHolder);
    this.o00Ooo0O.OoooO00();
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    paramAnimator = this.o00Ooo0O;
    RecyclerView.ViewHolder localViewHolder = this.o00OoOoo;
    paramAnimator.OooOoo(localViewHolder);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.DefaultItemAnimator.4
 * JD-Core Version:    0.7.0.1
 */
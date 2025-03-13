package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

class DefaultItemAnimator$6
  extends AnimatorListenerAdapter
{
  public DefaultItemAnimator$6(DefaultItemAnimator paramDefaultItemAnimator, RecyclerView.ViewHolder paramViewHolder, int paramInt1, View paramView, int paramInt2, ViewPropertyAnimator paramViewPropertyAnimator) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    int i = this.o00Ooo00;
    if (i != 0)
    {
      paramAnimator = this.o00Ooo0;
      paramAnimator.setTranslationX(0.0F);
    }
    i = this.o00Ooo0O;
    if (i != 0)
    {
      paramAnimator = this.o00Ooo0;
      paramAnimator.setTranslationY(0.0F);
    }
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.o00Ooo0o.setListener(null);
    paramAnimator = this.o00OooO0;
    RecyclerView.ViewHolder localViewHolder = this.o00OoOoo;
    paramAnimator.OooOoO(localViewHolder);
    paramAnimator = this.o00OooO0.OooOOOo;
    localViewHolder = this.o00OoOoo;
    paramAnimator.remove(localViewHolder);
    this.o00OooO0.OoooO00();
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    paramAnimator = this.o00OooO0;
    RecyclerView.ViewHolder localViewHolder = this.o00OoOoo;
    paramAnimator.OooOoOO(localViewHolder);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.DefaultItemAnimator.6
 * JD-Core Version:    0.7.0.1
 */
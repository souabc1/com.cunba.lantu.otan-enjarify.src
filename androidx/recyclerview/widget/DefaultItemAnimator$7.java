package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

class DefaultItemAnimator$7
  extends AnimatorListenerAdapter
{
  public DefaultItemAnimator$7(DefaultItemAnimator paramDefaultItemAnimator, DefaultItemAnimator.ChangeInfo paramChangeInfo, ViewPropertyAnimator paramViewPropertyAnimator, View paramView) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.o00Ooo00.setListener(null);
    this.o00Ooo0.setAlpha(1.0F);
    this.o00Ooo0.setTranslationX(0.0F);
    this.o00Ooo0.setTranslationY(0.0F);
    paramAnimator = this.o00Ooo0O;
    RecyclerView.ViewHolder localViewHolder = this.o00OoOoo.OooO00o;
    paramAnimator.OooOo(localViewHolder, true);
    paramAnimator = this.o00Ooo0O.OooOOo;
    localViewHolder = this.o00OoOoo.OooO00o;
    paramAnimator.remove(localViewHolder);
    this.o00Ooo0O.OoooO00();
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    paramAnimator = this.o00Ooo0O;
    RecyclerView.ViewHolder localViewHolder = this.o00OoOoo.OooO00o;
    paramAnimator.OooOoO0(localViewHolder, true);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.DefaultItemAnimator.7
 * JD-Core Version:    0.7.0.1
 */
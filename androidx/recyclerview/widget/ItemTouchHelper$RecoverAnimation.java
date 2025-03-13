package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.view.View;

class ItemTouchHelper$RecoverAnimation
  implements Animator.AnimatorListener
{
  public final float o00OoOoo;
  public final float o00Ooo0;
  public final float o00Ooo00;
  public final float o00Ooo0O;
  public final RecyclerView.ViewHolder o00Ooo0o;
  public final ValueAnimator o00OooO;
  public final int o00OooO0;
  public final int o00OooOO;
  public boolean o00OooOo;
  public float o00OoooO;
  public boolean o00Ooooo = false;
  public float o00o000;
  public boolean o00o0000 = false;
  public float o0O00o0;
  
  public ItemTouchHelper$RecoverAnimation(RecyclerView.ViewHolder paramViewHolder, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.o00OooO0 = paramInt2;
    this.o00OooOO = paramInt1;
    this.o00Ooo0o = paramViewHolder;
    this.o00OoOoo = paramFloat1;
    this.o00Ooo00 = paramFloat2;
    this.o00Ooo0 = paramFloat3;
    this.o00Ooo0O = paramFloat4;
    Object localObject = new float[2];
    Object tmp60_58 = localObject;
    tmp60_58[0] = 0.0F;
    tmp60_58[1] = 1.0F;
    localObject = ValueAnimator.ofFloat((float[])localObject);
    this.o00OooO = ((ValueAnimator)localObject);
    ItemTouchHelper.RecoverAnimation.1 local1 = new androidx/recyclerview/widget/ItemTouchHelper$RecoverAnimation$1;
    local1.<init>(this);
    ((ValueAnimator)localObject).addUpdateListener(local1);
    paramViewHolder = paramViewHolder.itemView;
    ((Animator)localObject).setTarget(paramViewHolder);
    ((Animator)localObject).addListener(this);
    setFraction(0.0F);
  }
  
  public void OooO00o()
  {
    this.o00OooO.cancel();
  }
  
  public void OooO0O0()
  {
    this.o00Ooo0o.setIsRecyclable(false);
    this.o00OooO.start();
  }
  
  public void OooO0OO()
  {
    float f1 = this.o00OoOoo;
    float f2 = this.o00Ooo0;
    boolean bool = f1 < f2;
    View localView;
    float f3;
    if (!bool)
    {
      localView = this.o00Ooo0o.itemView;
      f1 = localView.getTranslationX();
    }
    else
    {
      f3 = this.o00o000;
      f2 -= f1;
      f3 *= f2;
      f1 += f3;
    }
    this.o0O00o0 = f1;
    f1 = this.o00Ooo00;
    f2 = this.o00Ooo0O;
    bool = f1 < f2;
    if (!bool)
    {
      localView = this.o00Ooo0o.itemView;
      f1 = localView.getTranslationY();
    }
    else
    {
      f3 = this.o00o000;
      f2 -= f1;
      f3 *= f2;
      f1 += f3;
    }
    this.o00OoooO = f1;
  }
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    setFraction(1.0F);
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    boolean bool1 = this.o00o0000;
    boolean bool2 = true;
    if (!bool1)
    {
      paramAnimator = this.o00Ooo0o;
      paramAnimator.setIsRecyclable(bool2);
    }
    this.o00o0000 = bool2;
  }
  
  public void onAnimationRepeat(Animator paramAnimator) {}
  
  public void onAnimationStart(Animator paramAnimator) {}
  
  public void setDuration(long paramLong)
  {
    this.o00OooO.setDuration(paramLong);
  }
  
  public void setFraction(float paramFloat)
  {
    this.o00o000 = paramFloat;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation
 * JD-Core Version:    0.7.0.1
 */
package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;

class ChangeTransform$3
  extends AnimatorListenerAdapter
{
  public boolean o00OoOoo;
  public Matrix o00Ooo00;
  
  public ChangeTransform$3(ChangeTransform paramChangeTransform, boolean paramBoolean, Matrix paramMatrix, View paramView, ChangeTransform.Transforms paramTransforms, ChangeTransform.PathAnimatorMatrix paramPathAnimatorMatrix)
  {
    paramChangeTransform = new android/graphics/Matrix;
    paramChangeTransform.<init>();
    this.o00Ooo00 = paramChangeTransform;
  }
  
  private void setCurrentMatrix(Matrix paramMatrix)
  {
    this.o00Ooo00.set(paramMatrix);
    paramMatrix = this.o00Ooo0o;
    int i = R.id.transition_transform;
    Matrix localMatrix = this.o00Ooo00;
    paramMatrix.setTag(i, localMatrix);
    paramMatrix = this.o00OooO0;
    View localView = this.o00Ooo0o;
    paramMatrix.OooO00o(localView);
  }
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    this.o00OoOoo = true;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    boolean bool = this.o00OoOoo;
    View localView = null;
    if (!bool)
    {
      bool = this.o00Ooo0;
      if (bool)
      {
        paramAnimator = this.o00OooOO;
        bool = paramAnimator.o00OoOoo;
        if (bool)
        {
          paramAnimator = this.o00Ooo0O;
          setCurrentMatrix(paramAnimator);
          break label81;
        }
      }
      paramAnimator = this.o00Ooo0o;
      int i = R.id.transition_transform;
      paramAnimator.setTag(i, null);
      paramAnimator = this.o00Ooo0o;
      i = R.id.parent_matrix;
      paramAnimator.setTag(i, null);
    }
    label81:
    ViewUtils.OooO0o(this.o00Ooo0o, null);
    paramAnimator = this.o00OooO0;
    localView = this.o00Ooo0o;
    paramAnimator.OooO00o(localView);
  }
  
  public void onAnimationPause(Animator paramAnimator)
  {
    paramAnimator = this.o00OooO.getMatrix();
    setCurrentMatrix(paramAnimator);
  }
  
  public void onAnimationResume(Animator paramAnimator)
  {
    ChangeTransform.setIdentityTransforms(this.o00Ooo0o);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.ChangeTransform.3
 * JD-Core Version:    0.7.0.1
 */
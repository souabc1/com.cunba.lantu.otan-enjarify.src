package androidx.constraintlayout.motion.widget;

public abstract interface MotionHelperInterface
  extends Animatable, MotionLayout.TransitionListener
{
  public abstract boolean isDecorator();
  
  public abstract boolean isUseOnHide();
  
  public abstract boolean isUsedOnShow();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionHelperInterface
 * JD-Core Version:    0.7.0.1
 */
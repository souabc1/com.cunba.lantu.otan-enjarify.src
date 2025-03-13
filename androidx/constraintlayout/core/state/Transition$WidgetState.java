package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.Motion;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TypedBundle;

class Transition$WidgetState
{
  public int OooO;
  public WidgetFrame OooO00o;
  public WidgetFrame OooO0O0;
  public WidgetFrame OooO0OO;
  public Motion OooO0Oo;
  public MotionWidget OooO0o;
  public MotionWidget OooO0o0;
  public MotionWidget OooO0oO;
  public KeyCache OooO0oo;
  public int OooOO0;
  
  public Transition$WidgetState()
  {
    Object localObject1 = new androidx/constraintlayout/core/motion/utils/KeyCache;
    ((KeyCache)localObject1).<init>();
    this.OooO0oo = ((KeyCache)localObject1);
    int i = -1;
    this.OooO = i;
    this.OooOO0 = i;
    localObject1 = new androidx/constraintlayout/core/state/WidgetFrame;
    ((WidgetFrame)localObject1).<init>();
    this.OooO00o = ((WidgetFrame)localObject1);
    localObject1 = new androidx/constraintlayout/core/state/WidgetFrame;
    ((WidgetFrame)localObject1).<init>();
    this.OooO0O0 = ((WidgetFrame)localObject1);
    localObject1 = new androidx/constraintlayout/core/state/WidgetFrame;
    ((WidgetFrame)localObject1).<init>();
    this.OooO0OO = ((WidgetFrame)localObject1);
    localObject1 = new androidx/constraintlayout/core/motion/MotionWidget;
    Object localObject2 = this.OooO00o;
    ((MotionWidget)localObject1).<init>((WidgetFrame)localObject2);
    this.OooO0o0 = ((MotionWidget)localObject1);
    localObject1 = new androidx/constraintlayout/core/motion/MotionWidget;
    localObject2 = this.OooO0O0;
    ((MotionWidget)localObject1).<init>((WidgetFrame)localObject2);
    this.OooO0o = ((MotionWidget)localObject1);
    localObject1 = new androidx/constraintlayout/core/motion/MotionWidget;
    localObject2 = this.OooO0OO;
    ((MotionWidget)localObject1).<init>((WidgetFrame)localObject2);
    this.OooO0oO = ((MotionWidget)localObject1);
    localObject1 = new androidx/constraintlayout/core/motion/Motion;
    localObject2 = this.OooO0o0;
    ((Motion)localObject1).<init>((MotionWidget)localObject2);
    this.OooO0Oo = ((Motion)localObject1);
    localObject2 = this.OooO0o0;
    ((Motion)localObject1).setStart((MotionWidget)localObject2);
    localObject1 = this.OooO0Oo;
    localObject2 = this.OooO0o;
    ((Motion)localObject1).setEnd((MotionWidget)localObject2);
  }
  
  public WidgetFrame getFrame(int paramInt)
  {
    if (paramInt == 0) {
      return this.OooO00o;
    }
    int i = 1;
    if (paramInt == i) {
      return this.OooO0O0;
    }
    return this.OooO0OO;
  }
  
  public void setKeyAttribute(TypedBundle paramTypedBundle)
  {
    MotionKeyAttributes localMotionKeyAttributes = new androidx/constraintlayout/core/motion/key/MotionKeyAttributes;
    localMotionKeyAttributes.<init>();
    paramTypedBundle.OooO0o(localMotionKeyAttributes);
    this.OooO0Oo.OooO0o0(localMotionKeyAttributes);
  }
  
  public void setKeyCycle(TypedBundle paramTypedBundle)
  {
    MotionKeyCycle localMotionKeyCycle = new androidx/constraintlayout/core/motion/key/MotionKeyCycle;
    localMotionKeyCycle.<init>();
    paramTypedBundle.OooO0o(localMotionKeyCycle);
    this.OooO0Oo.OooO0o0(localMotionKeyCycle);
  }
  
  public void setKeyPosition(TypedBundle paramTypedBundle)
  {
    MotionKeyPosition localMotionKeyPosition = new androidx/constraintlayout/core/motion/key/MotionKeyPosition;
    localMotionKeyPosition.<init>();
    paramTypedBundle.OooO0o(localMotionKeyPosition);
    this.OooO0Oo.OooO0o0(localMotionKeyPosition);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.state.Transition.WidgetState
 * JD-Core Version:    0.7.0.1
 */
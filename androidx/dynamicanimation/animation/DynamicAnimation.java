package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

public abstract class DynamicAnimation
  implements AnimationHandler.AnimationFrameCallback
{
  public static final DynamicAnimation.ViewProperty OooOOO;
  public static final DynamicAnimation.ViewProperty OooOOO0;
  public static final DynamicAnimation.ViewProperty OooOOOO;
  public static final DynamicAnimation.ViewProperty OooOOOo;
  public static final DynamicAnimation.ViewProperty OooOOo;
  public static final DynamicAnimation.ViewProperty OooOOo0;
  public static final DynamicAnimation.ViewProperty OooOOoo;
  public static final DynamicAnimation.ViewProperty OooOo;
  public static final DynamicAnimation.ViewProperty OooOo0;
  public static final DynamicAnimation.ViewProperty OooOo00;
  public static final DynamicAnimation.ViewProperty OooOo0O;
  public static final DynamicAnimation.ViewProperty OooOo0o;
  public static final DynamicAnimation.ViewProperty OooOoO;
  public static final DynamicAnimation.ViewProperty OooOoO0;
  public long OooO;
  public float OooO00o = 0.0F;
  public float OooO0O0;
  public boolean OooO0OO;
  public final Object OooO0Oo;
  public boolean OooO0o;
  public final FloatPropertyCompat OooO0o0;
  public float OooO0oO;
  public float OooO0oo;
  public float OooOO0;
  public final ArrayList OooOO0O;
  public final ArrayList OooOO0o;
  
  static
  {
    Object localObject = new androidx/dynamicanimation/animation/DynamicAnimation$1;
    ((DynamicAnimation.1)localObject).<init>("translationX");
    OooOOO0 = (DynamicAnimation.ViewProperty)localObject;
    localObject = new androidx/dynamicanimation/animation/DynamicAnimation$2;
    ((DynamicAnimation.2)localObject).<init>("translationY");
    OooOOO = (DynamicAnimation.ViewProperty)localObject;
    localObject = new androidx/dynamicanimation/animation/DynamicAnimation$3;
    ((DynamicAnimation.3)localObject).<init>("translationZ");
    OooOOOO = (DynamicAnimation.ViewProperty)localObject;
    localObject = new androidx/dynamicanimation/animation/DynamicAnimation$4;
    ((DynamicAnimation.4)localObject).<init>("scaleX");
    OooOOOo = (DynamicAnimation.ViewProperty)localObject;
    localObject = new androidx/dynamicanimation/animation/DynamicAnimation$5;
    ((DynamicAnimation.5)localObject).<init>("scaleY");
    OooOOo0 = (DynamicAnimation.ViewProperty)localObject;
    localObject = new androidx/dynamicanimation/animation/DynamicAnimation$6;
    ((DynamicAnimation.6)localObject).<init>("rotation");
    OooOOo = (DynamicAnimation.ViewProperty)localObject;
    localObject = new androidx/dynamicanimation/animation/DynamicAnimation$7;
    ((DynamicAnimation.7)localObject).<init>("rotationX");
    OooOOoo = (DynamicAnimation.ViewProperty)localObject;
    localObject = new androidx/dynamicanimation/animation/DynamicAnimation$8;
    ((DynamicAnimation.8)localObject).<init>("rotationY");
    OooOo00 = (DynamicAnimation.ViewProperty)localObject;
    localObject = new androidx/dynamicanimation/animation/DynamicAnimation$9;
    ((DynamicAnimation.9)localObject).<init>("x");
    OooOo0 = (DynamicAnimation.ViewProperty)localObject;
    localObject = new androidx/dynamicanimation/animation/DynamicAnimation$10;
    ((DynamicAnimation.10)localObject).<init>("y");
    OooOo0O = (DynamicAnimation.ViewProperty)localObject;
    localObject = new androidx/dynamicanimation/animation/DynamicAnimation$11;
    ((DynamicAnimation.11)localObject).<init>("z");
    OooOo0o = (DynamicAnimation.ViewProperty)localObject;
    localObject = new androidx/dynamicanimation/animation/DynamicAnimation$12;
    ((DynamicAnimation.12)localObject).<init>("alpha");
    OooOo = (DynamicAnimation.ViewProperty)localObject;
    localObject = new androidx/dynamicanimation/animation/DynamicAnimation$13;
    ((DynamicAnimation.13)localObject).<init>("scrollX");
    OooOoO0 = (DynamicAnimation.ViewProperty)localObject;
    localObject = new androidx/dynamicanimation/animation/DynamicAnimation$14;
    ((DynamicAnimation.14)localObject).<init>("scrollY");
    OooOoO = (DynamicAnimation.ViewProperty)localObject;
  }
  
  public DynamicAnimation(Object paramObject, FloatPropertyCompat paramFloatPropertyCompat)
  {
    float f1 = 3.4028235E+38F;
    this.OooO0O0 = f1;
    this.OooO0OO = false;
    this.OooO0o = false;
    this.OooO0oO = f1;
    f1 = -f1;
    this.OooO0oo = f1;
    long l = 0L;
    this.OooO = l;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooOO0O = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooOO0o = localArrayList;
    this.OooO0Oo = paramObject;
    this.OooO0o0 = paramFloatPropertyCompat;
    paramObject = OooOOo;
    if (paramFloatPropertyCompat != paramObject)
    {
      paramObject = OooOOoo;
      if (paramFloatPropertyCompat != paramObject)
      {
        paramObject = OooOo00;
        if (paramFloatPropertyCompat != paramObject)
        {
          paramObject = OooOo;
          f1 = 0.0039063F;
          if (paramFloatPropertyCompat == paramObject) {}
          do
          {
            do
            {
              this.OooOO0 = f1;
              break;
              paramObject = OooOOOo;
            } while (paramFloatPropertyCompat == paramObject);
            paramObject = OooOOo0;
          } while (paramFloatPropertyCompat == paramObject);
          f2 = 1.0F;
          break label173;
        }
      }
    }
    float f2 = 0.1F;
    label173:
    this.OooOO0 = f2;
  }
  
  public static void OooO0o(ArrayList paramArrayList)
  {
    int i = paramArrayList.size() + -1;
    while (i >= 0)
    {
      Object localObject = paramArrayList.get(i);
      if (localObject == null) {
        paramArrayList.remove(i);
      }
      i += -1;
    }
  }
  
  public static void OooO0o0(ArrayList paramArrayList, Object paramObject)
  {
    int i = paramArrayList.indexOf(paramObject);
    if (i >= 0) {
      paramArrayList.set(i, null);
    }
  }
  
  private float getPropertyValue()
  {
    FloatPropertyCompat localFloatPropertyCompat = this.OooO0o0;
    Object localObject = this.OooO0Oo;
    return localFloatPropertyCompat.getValue(localObject);
  }
  
  public final void OooO()
  {
    boolean bool1 = this.OooO0o;
    if (!bool1)
    {
      float f1 = 1.4E-45F;
      this.OooO0o = true;
      bool1 = this.OooO0OO;
      if (!bool1)
      {
        f1 = getPropertyValue();
        this.OooO0O0 = f1;
      }
      f1 = this.OooO0O0;
      float f2 = this.OooO0oO;
      boolean bool2 = f1 < f2;
      if (!bool2)
      {
        f2 = this.OooO0oo;
        bool1 = f1 < f2;
        if (!bool1)
        {
          localObject = AnimationHandler.getInstance();
          long l = 0L;
          ((AnimationHandler)localObject).OooO00o(this, l);
          return;
        }
      }
      Object localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Starting value need to be in between min value and max value");
      throw ((Throwable)localObject);
    }
  }
  
  public boolean OooO00o(long paramLong)
  {
    long l1 = this.OooO;
    long l2 = 0L;
    boolean bool1 = l1 < l2;
    if (!bool1)
    {
      this.OooO = paramLong;
      float f1 = this.OooO0O0;
      setPropertyValue(f1);
      return false;
    }
    l1 = paramLong - l1;
    this.OooO = paramLong;
    boolean bool2 = OooOO0(l1);
    float f2 = this.OooO0O0;
    float f3 = this.OooO0oO;
    f2 = Math.min(f2, f3);
    this.OooO0O0 = f2;
    f3 = this.OooO0oo;
    f2 = Math.max(f2, f3);
    this.OooO0O0 = f2;
    setPropertyValue(f2);
    if (bool2) {
      OooO0OO(false);
    }
    return bool2;
  }
  
  public DynamicAnimation OooO0O0(DynamicAnimation.OnAnimationEndListener paramOnAnimationEndListener)
  {
    ArrayList localArrayList = this.OooOO0O;
    boolean bool = localArrayList.contains(paramOnAnimationEndListener);
    if (!bool)
    {
      localArrayList = this.OooOO0O;
      localArrayList.add(paramOnAnimationEndListener);
    }
    return this;
  }
  
  public final void OooO0OO(boolean paramBoolean)
  {
    int i = 0;
    this.OooO0o = false;
    Object localObject = AnimationHandler.getInstance();
    ((AnimationHandler)localObject).OooO0o0(this);
    long l = 0L;
    this.OooO = l;
    this.OooO0OO = false;
    for (;;)
    {
      localObject = this.OooOO0O;
      int j = ((ArrayList)localObject).size();
      if (i >= j) {
        break;
      }
      localObject = this.OooOO0O.get(i);
      if (localObject != null)
      {
        localObject = (DynamicAnimation.OnAnimationEndListener)this.OooOO0O.get(i);
        float f1 = this.OooO0O0;
        float f2 = this.OooO00o;
        ((DynamicAnimation.OnAnimationEndListener)localObject).OooO00o(this, paramBoolean, f1, f2);
      }
      i += 1;
    }
    OooO0o(this.OooOO0O);
  }
  
  public void OooO0Oo(DynamicAnimation.OnAnimationEndListener paramOnAnimationEndListener)
  {
    OooO0o0(this.OooOO0O, paramOnAnimationEndListener);
  }
  
  public DynamicAnimation OooO0oO(float paramFloat)
  {
    this.OooO0O0 = paramFloat;
    this.OooO0OO = true;
    return this;
  }
  
  public void OooO0oo()
  {
    Object localObject = Looper.myLooper();
    Looper localLooper = Looper.getMainLooper();
    if (localObject == localLooper)
    {
      boolean bool = this.OooO0o;
      if (!bool) {
        OooO();
      }
      return;
    }
    localObject = new android/util/AndroidRuntimeException;
    ((AndroidRuntimeException)localObject).<init>("Animations may only be started on the main thread");
    throw ((Throwable)localObject);
  }
  
  public abstract boolean OooOO0(long paramLong);
  
  public float getMinimumVisibleChange()
  {
    return this.OooOO0;
  }
  
  public float getValueThreshold()
  {
    return this.OooOO0 * 0.75F;
  }
  
  public boolean isRunning()
  {
    return this.OooO0o;
  }
  
  public void setPropertyValue(float paramFloat)
  {
    Object localObject1 = this.OooO0o0;
    Object localObject2 = this.OooO0Oo;
    ((FloatPropertyCompat)localObject1).setValue(localObject2, paramFloat);
    int i = 0;
    paramFloat = 0.0F;
    for (;;)
    {
      localObject1 = this.OooOO0o;
      int j = ((ArrayList)localObject1).size();
      if (i >= j) {
        break;
      }
      localObject1 = this.OooOO0o.get(i);
      if (localObject1 != null)
      {
        localObject1 = (DynamicAnimation.OnAnimationUpdateListener)this.OooOO0o.get(i);
        float f1 = this.OooO0O0;
        float f2 = this.OooO00o;
        ((DynamicAnimation.OnAnimationUpdateListener)localObject1).OooO00o(this, f1, f2);
      }
      i += 1;
    }
    OooO0o(this.OooOO0o);
  }
  
  public abstract void setValueThreshold(float paramFloat);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.dynamicanimation.animation.DynamicAnimation
 * JD-Core Version:    0.7.0.1
 */
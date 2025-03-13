package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.math.MathUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ClockHandView
  extends View
{
  private static final int DEFAULT_ANIMATION_DURATION = 200;
  private boolean animatingOnTouchUp;
  private final int animationDuration;
  private final TimeInterpolator animationInterpolator;
  private final float centerDotRadius;
  private boolean changedDuringTouch;
  private int circleRadius;
  private int currentLevel;
  private double degRad;
  private float downX;
  private float downY;
  private boolean isInTapRegion;
  private boolean isMultiLevel;
  private final List listeners;
  private ClockHandView.OnActionUpListener onActionUpListener;
  private float originalDeg;
  private final Paint paint;
  private final ValueAnimator rotationAnimator;
  private final int scaledTouchSlop;
  private final RectF selectorBox;
  private final int selectorRadius;
  private final int selectorStrokeWidth;
  
  public ClockHandView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ClockHandView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public ClockHandView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject1 = new android/animation/ValueAnimator;
    ((ValueAnimator)localObject1).<init>();
    this.rotationAnimator = ((ValueAnimator)localObject1);
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.listeners = ((List)localObject1);
    localObject1 = new android/graphics/Paint;
    ((Paint)localObject1).<init>();
    this.paint = ((Paint)localObject1);
    RectF localRectF = new android/graphics/RectF;
    localRectF.<init>();
    this.selectorBox = localRectF;
    int i = 1;
    this.currentLevel = i;
    Object localObject2 = R.styleable.ClockHandView;
    int j = R.style.Widget_MaterialComponents_TimePicker_Clock;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject2, paramInt, j);
    paramInt = R.attr.motionDurationLong2;
    paramInt = MotionUtils.resolveThemeDuration(paramContext, paramInt, 200);
    this.animationDuration = paramInt;
    paramInt = R.attr.motionEasingEmphasizedInterpolator;
    localObject2 = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    Object localObject3 = MotionUtils.resolveThemeInterpolator(paramContext, paramInt, (TimeInterpolator)localObject2);
    this.animationInterpolator = ((TimeInterpolator)localObject3);
    paramInt = R.styleable.ClockHandView_materialCircleRadius;
    paramInt = paramAttributeSet.getDimensionPixelSize(paramInt, 0);
    this.circleRadius = paramInt;
    paramInt = R.styleable.ClockHandView_selectorSize;
    paramInt = paramAttributeSet.getDimensionPixelSize(paramInt, 0);
    this.selectorRadius = paramInt;
    localObject3 = getResources();
    j = R.dimen.material_clock_hand_stroke_width;
    j = ((Resources)localObject3).getDimensionPixelSize(j);
    this.selectorStrokeWidth = j;
    j = R.dimen.material_clock_hand_center_dot_radius;
    float f = ((Resources)localObject3).getDimensionPixelSize(j);
    this.centerDotRadius = f;
    paramInt = R.styleable.ClockHandView_clockHandColor;
    paramInt = paramAttributeSet.getColor(paramInt, 0);
    ((Paint)localObject1).setAntiAlias(i);
    ((Paint)localObject1).setColor(paramInt);
    setHandRotation(0.0F);
    int k = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    this.scaledTouchSlop = k;
    ViewCompat.o000000(this, 2);
    paramAttributeSet.recycle();
  }
  
  private void adjustLevel(float paramFloat1, float paramFloat2)
  {
    int i = getWidth();
    int j = 2;
    i /= j;
    int k = getHeight() / j;
    float f1 = i;
    float f2 = k;
    paramFloat1 = MathUtils.dist(f1, f2, paramFloat1, paramFloat2);
    int m = getLeveledCircleRadius(j);
    Context localContext = getContext();
    k = 12;
    f2 = 1.681558E-044F;
    f1 = ViewUtils.dpToPx(localContext, k);
    paramFloat2 = m + f1;
    boolean bool = paramFloat1 < paramFloat2;
    if (bool) {
      j = 1;
    }
    this.currentLevel = j;
  }
  
  private void drawSelector(Canvas paramCanvas)
  {
    int i = getHeight() / 2;
    int j = getWidth() / 2;
    int k = this.currentLevel;
    k = getLeveledCircleRadius(k);
    float f1 = j;
    float f2 = k;
    float f3 = (float)Math.cos(this.degRad) * f2 + f1;
    float f4 = i;
    float f5 = (float)Math.sin(this.degRad);
    f2 = f2 * f5 + f4;
    this.paint.setStrokeWidth(0.0F);
    f5 = this.selectorRadius;
    Paint localPaint1 = this.paint;
    paramCanvas.drawCircle(f3, f2, f5, localPaint1);
    double d1 = Math.sin(this.degRad);
    double d2 = Math.cos(this.degRad);
    int m = this.selectorRadius;
    double d3 = k - m;
    k = (int)(d2 * d3);
    float f6 = j + k;
    j = (int)(d3 * d1);
    float f7 = i + j;
    Paint localPaint2 = this.paint;
    float f8 = this.selectorStrokeWidth;
    localPaint2.setStrokeWidth(f8);
    Paint localPaint3 = this.paint;
    f3 = f1;
    f5 = f4;
    paramCanvas.drawLine(f1, f4, f6, f7, localPaint3);
    float f9 = this.centerDotRadius;
    Paint localPaint4 = this.paint;
    paramCanvas.drawCircle(f1, f4, f9, localPaint4);
  }
  
  private int getDegreesFromXY(float paramFloat1, float paramFloat2)
  {
    int i = getWidth() / 2;
    int j = getHeight() / 2;
    float f = i;
    double d1 = paramFloat1 - f;
    paramFloat1 = j;
    paramFloat2 -= paramFloat1;
    double d2 = Math.toDegrees(Math.atan2(paramFloat2, d1));
    int k = (int)d2 + 90;
    if (k < 0) {
      k += 360;
    }
    return k;
  }
  
  private int getLeveledCircleRadius(int paramInt)
  {
    int i = 2;
    float f1 = 2.802597E-045F;
    if (paramInt == i)
    {
      float f2 = this.circleRadius;
      i = 1059648963;
      f1 = 0.66F;
      f2 *= f1;
      paramInt = Math.round(f2);
    }
    else
    {
      paramInt = this.circleRadius;
    }
    return paramInt;
  }
  
  private Pair getValuesForAnimation(float paramFloat)
  {
    float f1 = getHandRotation();
    float f2 = Math.abs(f1 - paramFloat);
    float f3 = 180.0F;
    boolean bool = f2 < f3;
    if (bool)
    {
      bool = f1 < f3;
      float f4 = 360.0F;
      if (bool)
      {
        bool = paramFloat < f3;
        if (bool) {
          paramFloat += f4;
        }
      }
      bool = f1 < f3;
      if (bool)
      {
        bool = paramFloat < f3;
        if (bool) {
          f1 += f4;
        }
      }
    }
    Pair localPair = new android/util/Pair;
    Float localFloat1 = Float.valueOf(f1);
    Float localFloat2 = Float.valueOf(paramFloat);
    localPair.<init>(localFloat1, localFloat2);
    return localPair;
  }
  
  private boolean handleTouchInput(float paramFloat1, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int i = getDegreesFromXY(paramFloat1, paramFloat2);
    paramFloat2 = getHandRotation();
    paramFloat1 = i;
    boolean bool1 = paramFloat2 < paramFloat1;
    boolean bool2 = false;
    boolean bool3 = true;
    float f = 1.4E-45F;
    if (bool1)
    {
      bool1 = bool3;
      paramFloat2 = f;
    }
    else
    {
      bool1 = false;
      paramFloat2 = 0.0F;
    }
    if ((paramBoolean2) && (bool1)) {
      return bool3;
    }
    if ((!bool1) && (!paramBoolean1)) {
      return false;
    }
    if (paramBoolean3)
    {
      bool1 = this.animatingOnTouchUp;
      if (bool1) {
        bool2 = bool3;
      }
    }
    setHandRotation(paramFloat1, bool2);
    return bool3;
  }
  
  private void setHandRotationInternal(float paramFloat, boolean paramBoolean)
  {
    paramFloat %= 360.0F;
    this.originalDeg = paramFloat;
    double d1 = Math.toRadians(paramFloat - 90.0F);
    this.degRad = d1;
    int i = getHeight() / 2;
    int j = getWidth() / 2;
    int k = this.currentLevel;
    k = getLeveledCircleRadius(k);
    float f1 = j;
    float f2 = k;
    float f3 = (float)Math.cos(this.degRad) * f2;
    f1 += f3;
    float f4 = i;
    double d2 = Math.sin(this.degRad);
    f3 = (float)d2;
    f2 *= f3;
    f4 += f2;
    RectF localRectF = this.selectorBox;
    int m = this.selectorRadius;
    float f5 = m;
    f5 = f1 - f5;
    float f6 = m;
    f6 = f4 - f6;
    float f7 = m;
    f1 += f7;
    f3 = m;
    f4 += f3;
    localRectF.set(f5, f6, f1, f4);
    Iterator localIterator = this.listeners.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      ClockHandView.OnRotateListener localOnRotateListener = (ClockHandView.OnRotateListener)localIterator.next();
      localOnRotateListener.onRotate(paramFloat, paramBoolean);
    }
    invalidate();
  }
  
  public void addOnRotateListener(ClockHandView.OnRotateListener paramOnRotateListener)
  {
    this.listeners.add(paramOnRotateListener);
  }
  
  public int getCurrentLevel()
  {
    return this.currentLevel;
  }
  
  public RectF getCurrentSelectorBox()
  {
    return this.selectorBox;
  }
  
  public float getHandRotation()
  {
    return this.originalDeg;
  }
  
  public int getSelectorRadius()
  {
    return this.selectorRadius;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    drawSelector(paramCanvas);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    ValueAnimator localValueAnimator = this.rotationAnimator;
    paramBoolean = localValueAnimator.isRunning();
    if (!paramBoolean)
    {
      float f = getHandRotation();
      setHandRotation(f);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    int j = 1;
    float f3 = 1.4E-45F;
    boolean bool1 = false;
    ClockHandView.OnActionUpListener localOnActionUpListener;
    boolean bool3;
    boolean bool4;
    if (i != 0)
    {
      if (i != j)
      {
        int k = 2;
        f4 = 2.802597E-045F;
        if (i != k)
        {
          i = 0;
          localOnActionUpListener = null;
          bool3 = false;
          bool4 = false;
          break label240;
        }
      }
      f4 = this.downX;
      f4 = f1 - f4;
      int m = (int)f4;
      f5 = this.downY;
      f5 = f2 - f5;
      int n = (int)f5;
      m *= m;
      n *= n;
      m += n;
      n = this.scaledTouchSlop;
      if (m > n)
      {
        m = j;
        f4 = f3;
      }
      else
      {
        m = 0;
        f4 = 0.0F;
      }
      this.isInTapRegion = m;
      boolean bool2 = this.changedDuringTouch;
      if (i == j)
      {
        i = j;
      }
      else
      {
        i = 0;
        localOnActionUpListener = null;
      }
      boolean bool5 = this.isMultiLevel;
      if (bool5) {
        adjustLevel(f1, f2);
      }
      bool4 = false;
      bool3 = bool2;
    }
    else
    {
      this.downX = f1;
      this.downY = f2;
      this.isInTapRegion = j;
      this.changedDuringTouch = false;
      i = 0;
      localOnActionUpListener = null;
      bool3 = false;
      bool4 = j;
    }
    label240:
    boolean bool6 = this.changedDuringTouch;
    float f4 = f1;
    float f5 = f2;
    bool1 = handleTouchInput(f1, f2, bool3, bool4, i) | bool6;
    this.changedDuringTouch = bool1;
    if ((bool1) && (i != 0))
    {
      localOnActionUpListener = this.onActionUpListener;
      if (localOnActionUpListener != null)
      {
        int i1 = getDegreesFromXY(f1, f2);
        f2 = i1;
        bool1 = this.isInTapRegion;
        localOnActionUpListener.onActionUp(f2, bool1);
      }
    }
    return j;
  }
  
  public void setAnimateOnTouchUp(boolean paramBoolean)
  {
    this.animatingOnTouchUp = paramBoolean;
  }
  
  public void setCircleRadius(int paramInt)
  {
    this.circleRadius = paramInt;
    invalidate();
  }
  
  public void setCurrentLevel(int paramInt)
  {
    this.currentLevel = paramInt;
    invalidate();
  }
  
  public void setHandRotation(float paramFloat)
  {
    setHandRotation(paramFloat, false);
  }
  
  public void setHandRotation(float paramFloat, boolean paramBoolean)
  {
    ValueAnimator localValueAnimator = this.rotationAnimator;
    if (localValueAnimator != null) {
      localValueAnimator.cancel();
    }
    localValueAnimator = null;
    if (!paramBoolean)
    {
      setHandRotationInternal(paramFloat, false);
      return;
    }
    Object localObject1 = getValuesForAnimation(paramFloat);
    Object localObject2 = this.rotationAnimator;
    float[] arrayOfFloat = new float[2];
    float f = ((Float)((Pair)localObject1).first).floatValue();
    arrayOfFloat[0] = f;
    paramFloat = ((Float)((Pair)localObject1).second).floatValue();
    arrayOfFloat[1] = paramFloat;
    ((ValueAnimator)localObject2).setFloatValues(arrayOfFloat);
    localObject1 = this.rotationAnimator;
    long l = this.animationDuration;
    ((ValueAnimator)localObject1).setDuration(l);
    localObject1 = this.rotationAnimator;
    localObject2 = this.animationInterpolator;
    ((ValueAnimator)localObject1).setInterpolator((TimeInterpolator)localObject2);
    localObject1 = this.rotationAnimator;
    localObject2 = new com/google/android/material/timepicker/OooO00o;
    ((OooO00o)localObject2).<init>(this);
    ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    localObject1 = this.rotationAnimator;
    localObject2 = new com/google/android/material/timepicker/ClockHandView$1;
    ((ClockHandView.1)localObject2).<init>(this);
    ((Animator)localObject1).addListener((Animator.AnimatorListener)localObject2);
    this.rotationAnimator.start();
  }
  
  public void setMultiLevel(boolean paramBoolean)
  {
    int i = this.isMultiLevel;
    if ((i != 0) && (!paramBoolean))
    {
      i = 1;
      this.currentLevel = i;
    }
    this.isMultiLevel = paramBoolean;
    invalidate();
  }
  
  public void setOnActionUpListener(ClockHandView.OnActionUpListener paramOnActionUpListener)
  {
    this.onActionUpListener = paramOnActionUpListener;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.timepicker.ClockHandView
 * JD-Core Version:    0.7.0.1
 */
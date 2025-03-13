package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.R.attr;
import com.google.android.material.R.color;
import com.google.android.material.R.dimen;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewOverlayImpl;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearanceModel.Builder;
import com.google.android.material.tooltip.TooltipDrawable;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m54207b69;

abstract class BaseSlider
  extends View
{
  private static final int DEFAULT_LABEL_ANIMATION_ENTER_DURATION = 83;
  private static final int DEFAULT_LABEL_ANIMATION_EXIT_DURATION = 117;
  static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_Slider;
  private static final String EXCEPTION_ILLEGAL_DISCRETE_VALUE = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
  private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION = "minSeparation(%s) must be greater or equal to 0";
  private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)";
  private static final String EXCEPTION_ILLEGAL_MIN_SEPARATION_STEP_SIZE_UNIT = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)";
  private static final String EXCEPTION_ILLEGAL_STEP_SIZE = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
  private static final String EXCEPTION_ILLEGAL_VALUE = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
  private static final String EXCEPTION_ILLEGAL_VALUE_FROM = "valueFrom(%s) must be smaller than valueTo(%s)";
  private static final String EXCEPTION_ILLEGAL_VALUE_TO = "valueTo(%s) must be greater than valueFrom(%s)";
  private static final int HALO_ALPHA = 63;
  private static final int LABEL_ANIMATION_ENTER_DURATION_ATTR = R.attr.motionDurationMedium4;
  private static final int LABEL_ANIMATION_ENTER_EASING_ATTR = R.attr.motionEasingEmphasizedInterpolator;
  private static final int LABEL_ANIMATION_EXIT_DURATION_ATTR = R.attr.motionDurationShort3;
  private static final int LABEL_ANIMATION_EXIT_EASING_ATTR = R.attr.motionEasingEmphasizedAccelerateInterpolator;
  private static final int MIN_TOUCH_TARGET_DP = 48;
  private static final String TAG = "BaseSlider";
  private static final double THRESHOLD = 0.0001D;
  private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 200;
  static final int UNIT_PX = 0;
  static final int UNIT_VALUE = 1;
  private static final String WARNING_FLOATING_POINT_ERROR = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";
  private BaseSlider.AccessibilityEventSender accessibilityEventSender;
  private final BaseSlider.AccessibilityHelper accessibilityHelper;
  private final AccessibilityManager accessibilityManager;
  private int activeThumbIdx;
  private final Paint activeTicksPaint;
  private final Paint activeTrackPaint;
  private final List changeListeners;
  private Drawable customThumbDrawable;
  private List customThumbDrawablesForValues;
  private final MaterialShapeDrawable defaultThumbDrawable;
  private int defaultThumbRadius;
  private int defaultTickActiveRadius;
  private int defaultTickInactiveRadius;
  private int defaultTrackHeight;
  private boolean dirtyConfig;
  private int focusedThumbIdx;
  private boolean forceDrawCompatHalo;
  private LabelFormatter formatter;
  private ColorStateList haloColor;
  private final Paint haloPaint;
  private int haloRadius;
  private final Paint inactiveTicksPaint;
  private final Paint inactiveTrackPaint;
  private boolean isLongPress;
  private int labelBehavior;
  private int labelPadding;
  private int labelStyle;
  private final List labels;
  private boolean labelsAreAnimatedIn;
  private ValueAnimator labelsInAnimator;
  private ValueAnimator labelsOutAnimator;
  private MotionEvent lastEvent;
  private int minTouchTargetSize;
  private int minTrackSidePadding;
  private int minWidgetHeight;
  private final int scaledTouchSlop;
  private int separationUnit;
  private float stepSize;
  private boolean thumbIsPressed;
  private final Paint thumbPaint;
  private int thumbRadius;
  private int tickActiveRadius;
  private ColorStateList tickColorActive;
  private ColorStateList tickColorInactive;
  private int tickInactiveRadius;
  private boolean tickVisible;
  private float[] ticksCoordinates;
  private float touchDownX;
  private final List touchListeners;
  private float touchPosition;
  private ColorStateList trackColorActive;
  private ColorStateList trackColorInactive;
  private int trackHeight;
  private int trackSidePadding;
  private int trackWidth;
  private float valueFrom;
  private float valueTo;
  private ArrayList values;
  private int widgetHeight;
  
  public BaseSlider(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public BaseSlider(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public BaseSlider(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = new java/util/ArrayList;
    paramContext.<init>();
    this.labels = paramContext;
    paramContext = new java/util/ArrayList;
    paramContext.<init>();
    this.changeListeners = paramContext;
    paramContext = new java/util/ArrayList;
    paramContext.<init>();
    this.touchListeners = paramContext;
    this.labelsAreAnimatedIn = false;
    this.thumbIsPressed = false;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.values = localArrayList;
    i = -1;
    this.activeThumbIdx = i;
    this.focusedThumbIdx = i;
    this.stepSize = 0.0F;
    i = 1;
    this.tickVisible = i;
    this.isLongPress = false;
    MaterialShapeDrawable localMaterialShapeDrawable = new com/google/android/material/shape/MaterialShapeDrawable;
    localMaterialShapeDrawable.<init>();
    this.defaultThumbDrawable = localMaterialShapeDrawable;
    Object localObject1 = Collections.emptyList();
    this.customThumbDrawablesForValues = ((List)localObject1);
    this.separationUnit = 0;
    paramContext = getContext();
    localObject1 = new android/graphics/Paint;
    ((Paint)localObject1).<init>();
    this.inactiveTrackPaint = ((Paint)localObject1);
    Object localObject2 = Paint.Style.STROKE;
    ((Paint)localObject1).setStyle((Paint.Style)localObject2);
    localObject2 = Paint.Cap.ROUND;
    ((Paint)localObject1).setStrokeCap((Paint.Cap)localObject2);
    localObject1 = new android/graphics/Paint;
    ((Paint)localObject1).<init>();
    this.activeTrackPaint = ((Paint)localObject1);
    localObject2 = Paint.Style.STROKE;
    ((Paint)localObject1).setStyle((Paint.Style)localObject2);
    localObject2 = Paint.Cap.ROUND;
    ((Paint)localObject1).setStrokeCap((Paint.Cap)localObject2);
    localObject1 = new android/graphics/Paint;
    ((Paint)localObject1).<init>(i);
    this.thumbPaint = ((Paint)localObject1);
    localObject2 = Paint.Style.FILL;
    ((Paint)localObject1).setStyle((Paint.Style)localObject2);
    localObject2 = new android/graphics/PorterDuffXfermode;
    PorterDuff.Mode localMode = PorterDuff.Mode.CLEAR;
    ((PorterDuffXfermode)localObject2).<init>(localMode);
    ((Paint)localObject1).setXfermode((Xfermode)localObject2);
    localObject1 = new android/graphics/Paint;
    ((Paint)localObject1).<init>(i);
    this.haloPaint = ((Paint)localObject1);
    localObject2 = Paint.Style.FILL;
    ((Paint)localObject1).setStyle((Paint.Style)localObject2);
    localObject1 = new android/graphics/Paint;
    ((Paint)localObject1).<init>();
    this.inactiveTicksPaint = ((Paint)localObject1);
    localObject2 = Paint.Style.STROKE;
    ((Paint)localObject1).setStyle((Paint.Style)localObject2);
    localObject2 = Paint.Cap.ROUND;
    ((Paint)localObject1).setStrokeCap((Paint.Cap)localObject2);
    localObject1 = new android/graphics/Paint;
    ((Paint)localObject1).<init>();
    this.activeTicksPaint = ((Paint)localObject1);
    localObject2 = Paint.Style.STROKE;
    ((Paint)localObject1).setStyle((Paint.Style)localObject2);
    localObject2 = Paint.Cap.ROUND;
    ((Paint)localObject1).setStrokeCap((Paint.Cap)localObject2);
    localObject1 = paramContext.getResources();
    loadResources((Resources)localObject1);
    processAttributes(paramContext, paramAttributeSet, paramInt);
    setFocusable(i);
    setClickable(i);
    localMaterialShapeDrawable.setShadowCompatibilityMode(2);
    int j = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    this.scaledTouchSlop = j;
    paramContext = new com/google/android/material/slider/BaseSlider$AccessibilityHelper;
    paramContext.<init>(this);
    this.accessibilityHelper = paramContext;
    ViewCompat.o00oO0o(this, paramContext);
    paramContext = getContext();
    paramAttributeSet = m54207b69.F54207b69_11("dM2C2F302B42432A362C2A2E4440");
    paramContext = (AccessibilityManager)paramContext.getSystemService(paramAttributeSet);
    this.accessibilityManager = paramContext;
  }
  
  private void adjustCustomThumbDrawableBounds(Drawable paramDrawable)
  {
    int i = this.thumbRadius * 2;
    int j = paramDrawable.getIntrinsicWidth();
    int k = paramDrawable.getIntrinsicHeight();
    int m = -1;
    float f1 = 0.0F / 0.0F;
    if ((j == m) && (k == m))
    {
      paramDrawable.setBounds(0, 0, i, i);
    }
    else
    {
      float f2 = i;
      m = Math.max(j, k);
      f1 = m;
      f2 /= f1;
      float f3 = j * f2;
      j = (int)f3;
      float f4 = k * f2;
      i = (int)f4;
      paramDrawable.setBounds(0, 0, j, i);
    }
  }
  
  private void attachLabelToContentView(TooltipDrawable paramTooltipDrawable)
  {
    ViewGroup localViewGroup = ViewUtils.getContentView(this);
    paramTooltipDrawable.setRelativeToView(localViewGroup);
  }
  
  private Float calculateIncrementForKey(int paramInt)
  {
    boolean bool = this.isLongPress;
    float f;
    if (bool)
    {
      int i = 20;
      f = calculateStepIncrement(i);
    }
    else
    {
      f = calculateStepIncrement();
    }
    int j = 21;
    if (paramInt != j)
    {
      j = 22;
      if (paramInt != j)
      {
        j = 69;
        if (paramInt != j)
        {
          j = 70;
          if (paramInt != j)
          {
            j = 81;
            if (paramInt != j) {
              return null;
            }
          }
          return Float.valueOf(f);
        }
        return Float.valueOf(-f);
      }
      paramInt = isRtl();
      if (paramInt != 0) {
        f = -f;
      }
      return Float.valueOf(f);
    }
    paramInt = isRtl();
    if (paramInt == 0) {
      f = -f;
    }
    return Float.valueOf(f);
  }
  
  private float calculateStepIncrement()
  {
    float f = this.stepSize;
    boolean bool = f < 0.0F;
    if (!bool) {
      f = 1.0F;
    }
    return f;
  }
  
  private float calculateStepIncrement(int paramInt)
  {
    float f1 = calculateStepIncrement();
    float f2 = this.valueTo;
    float f3 = this.valueFrom;
    f2 = (f2 - f3) / f1;
    float f4 = paramInt;
    boolean bool = f2 < f4;
    if (!bool) {
      return f1;
    }
    return Math.round(f2 / f4) * f1;
  }
  
  private int calculateTrackCenter()
  {
    int i = this.widgetHeight / 2;
    int j = this.labelBehavior;
    int k = 1;
    int m = 0;
    if (j != k)
    {
      boolean bool = shouldAlwaysShowLabel();
      if (!bool) {}
    }
    else
    {
      TooltipDrawable localTooltipDrawable = (TooltipDrawable)this.labels.get(0);
      m = localTooltipDrawable.getIntrinsicHeight();
    }
    return i + m;
  }
  
  private ValueAnimator createLabelAnimator(boolean paramBoolean)
  {
    float f1 = 0.0F;
    ValueAnimator localValueAnimator = null;
    int i = 1065353216;
    float f2 = 1.0F;
    if (paramBoolean)
    {
      j = 0;
      f3 = 0.0F;
    }
    else
    {
      j = i;
      f3 = f2;
    }
    if (paramBoolean) {
      localObject1 = this.labelsOutAnimator;
    } else {
      localObject1 = this.labelsInAnimator;
    }
    float f3 = getAnimatorCurrentValueOrDefault((ValueAnimator)localObject1, f3);
    if (paramBoolean) {
      f1 = f2;
    }
    i = 2;
    f2 = 2.802597E-045F;
    Object localObject2 = new float[i];
    Object localObject1 = null;
    localObject2[0] = f3;
    int j = 1;
    f3 = 1.4E-45F;
    localObject2[j] = f1;
    localValueAnimator = ValueAnimator.ofFloat((float[])localObject2);
    if (paramBoolean)
    {
      localObject3 = getContext();
      i = LABEL_ANIMATION_ENTER_DURATION_ATTR;
      f3 = 1.163078E-043F;
      paramBoolean = MotionUtils.resolveThemeDuration((Context)localObject3, i, 83);
      localObject2 = getContext();
      j = LABEL_ANIMATION_ENTER_EASING_ATTR;
      localObject1 = AnimationUtils.DECELERATE_INTERPOLATOR;
    }
    else
    {
      localObject3 = getContext();
      i = LABEL_ANIMATION_EXIT_DURATION_ATTR;
      f3 = 1.639519E-043F;
      paramBoolean = MotionUtils.resolveThemeDuration((Context)localObject3, i, 117);
      localObject2 = getContext();
      j = LABEL_ANIMATION_EXIT_EASING_ATTR;
      localObject1 = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
    }
    localObject2 = MotionUtils.resolveThemeInterpolator((Context)localObject2, j, (TimeInterpolator)localObject1);
    long l = paramBoolean;
    localValueAnimator.setDuration(l);
    localValueAnimator.setInterpolator((TimeInterpolator)localObject2);
    Object localObject3 = new com/google/android/material/slider/BaseSlider$1;
    ((BaseSlider.1)localObject3).<init>(this);
    localValueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject3);
    return localValueAnimator;
  }
  
  private void createLabelPool()
  {
    Object localObject1 = this.labels;
    int i = ((List)localObject1).size();
    Object localObject2 = this.values;
    int j = ((ArrayList)localObject2).size();
    Object localObject3;
    boolean bool2;
    if (i > j)
    {
      localObject1 = this.labels;
      j = this.values.size();
      localObject3 = this.labels;
      int m = ((List)localObject3).size();
      localObject1 = ((List)localObject1).subList(j, m);
      localObject2 = ((List)localObject1).iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject2).hasNext();
        if (!bool2) {
          break;
        }
        localObject3 = (TooltipDrawable)((Iterator)localObject2).next();
        boolean bool3 = ViewCompat.o000oOoO(this);
        if (bool3) {
          detachLabelFromContentView((TooltipDrawable)localObject3);
        }
      }
      ((List)localObject1).clear();
    }
    for (;;)
    {
      localObject1 = this.labels;
      i = ((List)localObject1).size();
      localObject2 = this.values;
      j = ((ArrayList)localObject2).size();
      bool2 = false;
      localObject3 = null;
      if (i >= j) {
        break;
      }
      localObject1 = getContext();
      int n = this.labelStyle;
      localObject1 = TooltipDrawable.createFromAttributes((Context)localObject1, null, 0, n);
      localObject2 = this.labels;
      ((List)localObject2).add(localObject1);
      k = ViewCompat.o000oOoO(this);
      if (k != 0) {
        attachLabelToContentView((TooltipDrawable)localObject1);
      }
    }
    localObject1 = this.labels;
    i = ((List)localObject1).size();
    int k = 1;
    if (i != k) {
      bool2 = k;
    }
    localObject1 = this.labels.iterator();
    for (;;)
    {
      boolean bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = (TooltipDrawable)((Iterator)localObject1).next();
      float f = bool2;
      ((MaterialShapeDrawable)localObject2).setStrokeWidth(f);
    }
  }
  
  private void detachLabelFromContentView(TooltipDrawable paramTooltipDrawable)
  {
    Object localObject = ViewUtils.getContentViewOverlay(this);
    if (localObject != null)
    {
      ((ViewOverlayImpl)localObject).remove(paramTooltipDrawable);
      localObject = ViewUtils.getContentView(this);
      paramTooltipDrawable.detachView((View)localObject);
    }
  }
  
  private float dimenToValue(float paramFloat)
  {
    float f1 = 0.0F;
    boolean bool = paramFloat < 0.0F;
    if (!bool) {
      return 0.0F;
    }
    f1 = this.trackSidePadding;
    paramFloat -= f1;
    f1 = this.trackWidth;
    paramFloat /= f1;
    f1 = this.valueFrom;
    float f2 = this.valueTo;
    f2 = f1 - f2;
    return paramFloat * f2 + f1;
  }
  
  private void dispatchOnChangedFromUser(int paramInt)
  {
    Object localObject = this.changeListeners.iterator();
    for (;;)
    {
      boolean bool1 = ((Iterator)localObject).hasNext();
      if (!bool1) {
        break;
      }
      BaseOnChangeListener localBaseOnChangeListener = (BaseOnChangeListener)((Iterator)localObject).next();
      Float localFloat = (Float)this.values.get(paramInt);
      float f = localFloat.floatValue();
      boolean bool2 = true;
      localBaseOnChangeListener.onValueChange(this, f, bool2);
    }
    localObject = this.accessibilityManager;
    if (localObject != null)
    {
      boolean bool3 = ((AccessibilityManager)localObject).isEnabled();
      if (bool3) {
        scheduleAccessibilityEventSender(paramInt);
      }
    }
  }
  
  private void dispatchOnChangedProgrammatically()
  {
    Iterator localIterator1 = this.changeListeners.iterator();
    boolean bool1 = localIterator1.hasNext();
    if (bool1)
    {
      BaseOnChangeListener localBaseOnChangeListener = (BaseOnChangeListener)localIterator1.next();
      Iterator localIterator2 = this.values.iterator();
      for (;;)
      {
        boolean bool2 = localIterator2.hasNext();
        if (!bool2) {
          break;
        }
        Float localFloat = (Float)localIterator2.next();
        float f = localFloat.floatValue();
        localBaseOnChangeListener.onValueChange(this, f, false);
      }
    }
  }
  
  private void drawActiveTrack(Canvas paramCanvas, int paramInt1, int paramInt2)
  {
    float[] arrayOfFloat = getActiveRange();
    int i = this.trackSidePadding;
    float f1 = i;
    float f2 = arrayOfFloat[1];
    float f3 = paramInt1;
    f2 *= f3;
    float f4 = f1 + f2;
    float f5 = i;
    float f6 = arrayOfFloat[0] * f3;
    float f7 = f5 + f6;
    float f8 = paramInt2;
    Paint localPaint = this.activeTrackPaint;
    paramCanvas.drawLine(f7, f8, f4, f8, localPaint);
  }
  
  private void drawInactiveTrack(Canvas paramCanvas, int paramInt1, int paramInt2)
  {
    float[] arrayOfFloat = getActiveRange();
    int i = this.trackSidePadding;
    float f1 = i;
    int j = 1;
    float f2 = arrayOfFloat[j];
    float f3 = paramInt1;
    f2 *= f3;
    float f4 = f1 + f2;
    f1 = i + paramInt1;
    boolean bool1 = f4 < f1;
    if (bool1)
    {
      float f5 = paramInt2;
      i += paramInt1;
      float f6 = i;
      Paint localPaint1 = this.inactiveTrackPaint;
      paramCanvas.drawLine(f4, f5, f6, f5, localPaint1);
    }
    paramInt1 = this.trackSidePadding;
    float f7 = paramInt1;
    bool1 = false;
    f1 = 0.0F;
    float f8 = arrayOfFloat[0] * f3;
    float f9 = f7 + f8;
    f8 = paramInt1;
    boolean bool2 = f9 < f8;
    if (bool2)
    {
      f2 = paramInt1;
      f4 = paramInt2;
      Paint localPaint2 = this.inactiveTrackPaint;
      f3 = f4;
      paramCanvas.drawLine(f2, f4, f9, f4, localPaint2);
    }
  }
  
  private void drawThumbDrawable(Canvas paramCanvas, int paramInt1, int paramInt2, float paramFloat, Drawable paramDrawable)
  {
    paramCanvas.save();
    int i = this.trackSidePadding;
    paramFloat = normalizeValue(paramFloat);
    float f1 = paramInt1;
    paramInt1 = (int)(paramFloat * f1);
    f1 = i + paramInt1;
    paramFloat = paramDrawable.getBounds().width();
    float f2 = 2.0F;
    paramFloat /= f2;
    f1 -= paramFloat;
    float f3 = paramInt2;
    paramFloat = paramDrawable.getBounds().height() / f2;
    f3 -= paramFloat;
    paramCanvas.translate(f1, f3);
    paramDrawable.draw(paramCanvas);
    paramCanvas.restore();
  }
  
  private void drawThumbs(Canvas paramCanvas, int paramInt1, int paramInt2)
  {
    int i = 0;
    for (;;)
    {
      Object localObject1 = this.values;
      int j = ((ArrayList)localObject1).size();
      if (i >= j) {
        break;
      }
      localObject1 = (Float)this.values.get(i);
      float f1 = ((Float)localObject1).floatValue();
      Object localObject2 = this.customThumbDrawable;
      if (localObject2 != null) {}
      for (;;)
      {
        drawThumbDrawable(paramCanvas, paramInt1, paramInt2, f1, (Drawable)localObject2);
        break;
        localObject1 = this.customThumbDrawablesForValues;
        j = ((List)localObject1).size();
        if (i < j)
        {
          localObject1 = this.customThumbDrawablesForValues.get(i);
          localObject2 = localObject1;
          localObject2 = (Drawable)localObject1;
        }
        else
        {
          boolean bool = isEnabled();
          if (!bool)
          {
            int k = this.trackSidePadding;
            float f2 = k;
            float f3 = normalizeValue(f1);
            float f4 = paramInt1;
            f3 *= f4;
            f2 += f3;
            f3 = paramInt2;
            int m = this.thumbRadius;
            f4 = m;
            Paint localPaint = this.thumbPaint;
            paramCanvas.drawCircle(f2, f3, f4, localPaint);
          }
          localObject2 = this.defaultThumbDrawable;
        }
      }
      i += 1;
    }
  }
  
  private void ensureLabelsAdded()
  {
    int i = this.labelBehavior;
    int j = 2;
    float f1 = 2.802597E-045F;
    if (i == j) {
      return;
    }
    boolean bool1 = this.labelsAreAnimatedIn;
    if (!bool1)
    {
      bool1 = true;
      this.labelsAreAnimatedIn = bool1;
      localObject1 = createLabelAnimator(bool1);
      this.labelsInAnimator = ((ValueAnimator)localObject1);
      j = 0;
      f1 = 0.0F;
      localObject2 = null;
      this.labelsOutAnimator = null;
      ((ValueAnimator)localObject1).start();
    }
    Object localObject1 = this.labels.iterator();
    j = 0;
    f1 = 0.0F;
    Object localObject2 = null;
    int m;
    for (;;)
    {
      localObject3 = this.values;
      int k = ((ArrayList)localObject3).size();
      if (j >= k) {
        break;
      }
      boolean bool3 = ((Iterator)localObject1).hasNext();
      if (!bool3) {
        break;
      }
      m = this.focusedThumbIdx;
      if (j != m)
      {
        localObject3 = (TooltipDrawable)((Iterator)localObject1).next();
        Float localFloat = (Float)this.values.get(j);
        float f2 = localFloat.floatValue();
        setValueForLabel((TooltipDrawable)localObject3, f2);
      }
      j += 1;
    }
    boolean bool2 = ((Iterator)localObject1).hasNext();
    if (bool2)
    {
      localObject1 = (TooltipDrawable)((Iterator)localObject1).next();
      localObject2 = this.values;
      m = this.focusedThumbIdx;
      f1 = ((Float)((ArrayList)localObject2).get(m)).floatValue();
      setValueForLabel((TooltipDrawable)localObject1, f1);
      return;
    }
    localObject1 = new java/lang/IllegalStateException;
    localObject2 = Integer.valueOf(this.labels.size());
    Object localObject3 = Integer.valueOf(this.values.size());
    localObject2 = new Object[] { localObject2, localObject3 };
    localObject2 = String.format(m54207b69.F54207b69_11("'B0C2E38652B31333E2D336C392F2D353D417B79397F774C447A3F454C4E4B415A82445051865B504E8A5D4D5963545F9997579D"), (Object[])localObject2);
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  private void ensureLabelsRemoved()
  {
    boolean bool = this.labelsAreAnimatedIn;
    if (bool)
    {
      bool = false;
      this.labelsAreAnimatedIn = false;
      ValueAnimator localValueAnimator = createLabelAnimator(false);
      this.labelsOutAnimator = localValueAnimator;
      this.labelsInAnimator = null;
      BaseSlider.2 local2 = new com/google/android/material/slider/BaseSlider$2;
      local2.<init>(this);
      localValueAnimator.addListener(local2);
      localValueAnimator = this.labelsOutAnimator;
      localValueAnimator.start();
    }
  }
  
  private void focusThumbOnFocusGained(int paramInt)
  {
    int i = 1;
    int j = -1 >>> 1;
    if (paramInt != i)
    {
      i = 2;
      int k = -1 << -1;
      if (paramInt != i)
      {
        i = 17;
        if (paramInt != i)
        {
          i = 66;
          if (paramInt == i) {
            moveFocusInAbsoluteDirection(k);
          }
        }
        else
        {
          moveFocusInAbsoluteDirection(j);
        }
      }
      else
      {
        moveFocus(k);
      }
    }
    else
    {
      moveFocus(j);
    }
  }
  
  private String formatValue(float paramFloat)
  {
    boolean bool = hasLabelFormatter();
    if (bool) {
      return this.formatter.getFormattedValue(paramFloat);
    }
    float f = (int)paramFloat;
    bool = f < paramFloat;
    String str;
    if (!bool) {
      str = m54207b69.F54207b69_11("5D616B7625");
    } else {
      str = m54207b69.F54207b69_11("ll4943600D");
    }
    Object localObject = Float.valueOf(paramFloat);
    localObject = new Object[] { localObject };
    return String.format(str, (Object[])localObject);
  }
  
  private float[] getActiveRange()
  {
    Float localFloat1 = (Float)Collections.max(getValues());
    float f1 = localFloat1.floatValue();
    Float localFloat2 = (Float)Collections.min(getValues());
    float f2 = localFloat2.floatValue();
    Object localObject = this.values;
    int i = ((ArrayList)localObject).size();
    int j = 1;
    if (i == j) {
      f2 = this.valueFrom;
    }
    f2 = normalizeValue(f2);
    f1 = normalizeValue(f1);
    boolean bool = isRtl();
    int k = 2;
    if (bool)
    {
      localObject = new float[k];
      localObject[0] = f1;
      localObject[j] = f2;
    }
    else
    {
      localObject = new float[k];
      localObject[0] = f2;
      localObject[j] = f1;
    }
    return localObject;
  }
  
  private static float getAnimatorCurrentValueOrDefault(ValueAnimator paramValueAnimator, float paramFloat)
  {
    if (paramValueAnimator != null)
    {
      boolean bool = paramValueAnimator.isRunning();
      if (bool)
      {
        Float localFloat = (Float)paramValueAnimator.getAnimatedValue();
        paramFloat = localFloat.floatValue();
        paramValueAnimator.cancel();
      }
    }
    return paramFloat;
  }
  
  private float getClampedValue(int paramInt, float paramFloat)
  {
    float f1 = getMinSeparation();
    int i = this.separationUnit;
    if (i == 0) {
      f1 = dimenToValue(f1);
    }
    boolean bool = isRtl();
    if (bool) {
      f1 = -f1;
    }
    int j = paramInt + 1;
    ArrayList localArrayList = this.values;
    int k = localArrayList.size();
    float f2;
    if (j >= k)
    {
      f2 = this.valueTo;
    }
    else
    {
      localArrayList = this.values;
      Float localFloat1 = (Float)localArrayList.get(j);
      f2 = localFloat1.floatValue() - f1;
    }
    paramInt += -1;
    float f3;
    if (paramInt < 0)
    {
      f3 = this.valueFrom;
    }
    else
    {
      localArrayList = this.values;
      Float localFloat2 = (Float)localArrayList.get(paramInt);
      f3 = localFloat2.floatValue() + f1;
    }
    return MathUtils.OooO00o(paramFloat, f3, f2);
  }
  
  private int getColorForState(ColorStateList paramColorStateList)
  {
    int[] arrayOfInt = getDrawableState();
    int i = paramColorStateList.getDefaultColor();
    return paramColorStateList.getColorForState(arrayOfInt, i);
  }
  
  private float getValueOfTouchPosition()
  {
    float f1 = this.touchPosition;
    double d1 = snapPosition(f1);
    boolean bool = isRtl();
    if (bool)
    {
      d2 = 1.0D;
      d1 = d2 - d1;
    }
    float f2 = this.valueTo;
    float f3 = this.valueFrom;
    double d3 = f2 - f3;
    d1 *= d3;
    double d2 = f3;
    return (float)(d1 + d2);
  }
  
  private float getValueOfTouchPositionAbsolute()
  {
    float f1 = this.touchPosition;
    boolean bool = isRtl();
    if (bool)
    {
      int i = 1065353216;
      f2 = 1.0F;
      f1 = f2 - f1;
    }
    float f2 = this.valueTo;
    float f3 = this.valueFrom;
    f2 -= f3;
    return f1 * f2 + f3;
  }
  
  private Drawable initializeCustomThumbDrawable(Drawable paramDrawable)
  {
    paramDrawable = paramDrawable.mutate().getConstantState().newDrawable();
    adjustCustomThumbDrawableBounds(paramDrawable);
    return paramDrawable;
  }
  
  private void invalidateTrack()
  {
    Paint localPaint = this.inactiveTrackPaint;
    float f = this.trackHeight;
    localPaint.setStrokeWidth(f);
    localPaint = this.activeTrackPaint;
    f = this.trackHeight;
    localPaint.setStrokeWidth(f);
  }
  
  private boolean isInVerticalScrollingContainer()
  {
    for (ViewParent localViewParent = getParent();; localViewParent = localViewParent.getParent())
    {
      boolean bool1 = localViewParent instanceof ViewGroup;
      int i = 0;
      if (!bool1) {
        break;
      }
      Object localObject = localViewParent;
      localObject = (ViewGroup)localViewParent;
      int j = 1;
      boolean bool2 = ((View)localObject).canScrollVertically(j);
      if (!bool2)
      {
        bool2 = ((View)localObject).canScrollVertically(-1);
        if (!bool2) {}
      }
      else
      {
        i = j;
      }
      if (i != 0)
      {
        bool1 = ((ViewGroup)localObject).shouldDelayChildPressedState();
        if (bool1) {
          return j;
        }
      }
    }
    return false;
  }
  
  private static boolean isMouseEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    int i = paramMotionEvent.getToolType(0);
    int j = 3;
    if (i == j) {
      bool = true;
    }
    return bool;
  }
  
  private boolean isMultipleOfStepSize(float paramFloat)
  {
    BigDecimal localBigDecimal = new java/math/BigDecimal;
    Object localObject1 = Float.toString(paramFloat);
    localBigDecimal.<init>((String)localObject1);
    localObject1 = new java/math/BigDecimal;
    float f = this.stepSize;
    Object localObject2 = Float.toString(f);
    ((BigDecimal)localObject1).<init>((String)localObject2);
    localObject2 = MathContext.DECIMAL64;
    localObject1 = localBigDecimal.divide((BigDecimal)localObject1, (MathContext)localObject2);
    double d1 = ((BigDecimal)localObject1).doubleValue();
    d1 = Math.abs(Math.round(d1) - d1);
    double d2 = 0.0001D;
    boolean bool = d1 < d2;
    if (bool)
    {
      bool = true;
      paramFloat = 1.4E-45F;
    }
    else
    {
      bool = false;
      paramFloat = 0.0F;
      localObject1 = null;
    }
    return bool;
  }
  
  private boolean isPotentialVerticalScroll(MotionEvent paramMotionEvent)
  {
    boolean bool = isMouseEvent(paramMotionEvent);
    if (!bool)
    {
      bool = isInVerticalScrollingContainer();
      if (bool) {
        return true;
      }
    }
    bool = false;
    paramMotionEvent = null;
    return bool;
  }
  
  private void loadResources(Resources paramResources)
  {
    int i = R.dimen.mtrl_slider_widget_height;
    i = paramResources.getDimensionPixelSize(i);
    this.minWidgetHeight = i;
    i = R.dimen.mtrl_slider_track_side_padding;
    i = paramResources.getDimensionPixelOffset(i);
    this.minTrackSidePadding = i;
    this.trackSidePadding = i;
    i = R.dimen.mtrl_slider_thumb_radius;
    i = paramResources.getDimensionPixelSize(i);
    this.defaultThumbRadius = i;
    i = R.dimen.mtrl_slider_track_height;
    i = paramResources.getDimensionPixelSize(i);
    this.defaultTrackHeight = i;
    i = R.dimen.mtrl_slider_tick_radius;
    i = paramResources.getDimensionPixelSize(i);
    this.defaultTickActiveRadius = i;
    i = R.dimen.mtrl_slider_tick_radius;
    i = paramResources.getDimensionPixelSize(i);
    this.defaultTickInactiveRadius = i;
    i = R.dimen.mtrl_slider_label_padding;
    int j = paramResources.getDimensionPixelSize(i);
    this.labelPadding = j;
  }
  
  private void maybeCalculateTicksCoordinates()
  {
    float f1 = this.stepSize;
    int i = 0;
    float f2 = 0.0F;
    float[] arrayOfFloat1 = null;
    boolean bool = f1 < 0.0F;
    if (!bool) {
      return;
    }
    validateConfigurationIfDirty();
    f1 = this.valueTo;
    f2 = this.valueFrom;
    f1 -= f2;
    f2 = this.stepSize;
    f1 /= f2;
    f2 = 1.0F;
    f1 += f2;
    int j = (int)f1;
    i = this.trackWidth;
    int k = this.trackHeight * 2;
    i = i / k + 1;
    j = Math.min(j, i);
    arrayOfFloat1 = this.ticksCoordinates;
    if (arrayOfFloat1 != null)
    {
      i = arrayOfFloat1.length;
      k = j * 2;
      if (i == k) {}
    }
    else
    {
      i = j * 2;
      arrayOfFloat1 = new float[i];
      this.ticksCoordinates = arrayOfFloat1;
    }
    i = this.trackWidth;
    f2 = i;
    float f3 = j + -1;
    f2 /= f3;
    k = 0;
    f3 = 0.0F;
    for (;;)
    {
      int m = j * 2;
      if (k >= m) {
        break;
      }
      float[] arrayOfFloat2 = this.ticksCoordinates;
      float f4 = this.trackSidePadding;
      float f5 = k;
      float f6 = 2.0F;
      f5 = f5 / f6 * f2;
      f4 += f5;
      arrayOfFloat2[k] = f4;
      int n = k + 1;
      int i1 = calculateTrackCenter();
      f5 = i1;
      arrayOfFloat2[n] = f5;
      k += 2;
    }
  }
  
  private void maybeDrawCompatHalo(Canvas paramCanvas, int paramInt1, int paramInt2)
  {
    boolean bool = shouldDrawCompatHalo();
    if (bool)
    {
      float f1 = this.trackSidePadding;
      Object localObject = this.values;
      int j = this.focusedThumbIdx;
      float f2 = ((Float)((ArrayList)localObject).get(j)).floatValue();
      f2 = normalizeValue(f2);
      float f3 = paramInt1;
      f2 *= f3;
      paramInt1 = (int)(f1 + f2);
      f3 = paramInt1;
      float f4 = paramInt2;
      int i = this.haloRadius;
      f1 = i;
      localObject = this.haloPaint;
      paramCanvas.drawCircle(f3, f4, f1, (Paint)localObject);
    }
  }
  
  private void maybeDrawTicks(Canvas paramCanvas)
  {
    boolean bool = this.tickVisible;
    if (bool)
    {
      float f1 = this.stepSize;
      int j = 0;
      float[] arrayOfFloat1 = null;
      bool = f1 < 0.0F;
      if (bool)
      {
        float[] arrayOfFloat2 = getActiveRange();
        arrayOfFloat1 = this.ticksCoordinates;
        float f2 = arrayOfFloat2[0];
        j = pivotIndex(arrayOfFloat1, f2);
        Object localObject = this.ticksCoordinates;
        int k = 1;
        f1 = arrayOfFloat2[k];
        int i = pivotIndex((float[])localObject, f1);
        localObject = this.ticksCoordinates;
        j *= 2;
        Paint localPaint = this.inactiveTicksPaint;
        paramCanvas.drawPoints((float[])localObject, 0, j, localPaint);
        float[] arrayOfFloat3 = this.ticksCoordinates;
        i *= 2;
        int m = i - j;
        localPaint = this.activeTicksPaint;
        paramCanvas.drawPoints(arrayOfFloat3, j, m, localPaint);
        arrayOfFloat1 = this.ticksCoordinates;
        int n = arrayOfFloat1.length - i;
        localObject = this.inactiveTicksPaint;
        paramCanvas.drawPoints(arrayOfFloat1, i, n, (Paint)localObject);
      }
    }
  }
  
  private boolean maybeIncreaseTrackSidePadding()
  {
    int i = this.thumbRadius;
    int k = this.defaultThumbRadius;
    i -= k;
    k = 0;
    i = Math.max(i, 0);
    int m = this.trackHeight;
    int n = this.defaultTrackHeight;
    m = Math.max((m - n) / 2, 0);
    n = this.tickActiveRadius;
    int i1 = this.defaultTickActiveRadius;
    n = Math.max(n - i1, 0);
    i1 = this.tickInactiveRadius;
    int i2 = this.defaultTickInactiveRadius;
    i1 = Math.max(i1 - i2, 0);
    i2 = this.minTrackSidePadding;
    i = Math.max(i, m);
    m = Math.max(n, i1);
    i = Math.max(i, m);
    i2 += i;
    i = this.trackSidePadding;
    if (i == i2) {
      return false;
    }
    this.trackSidePadding = i2;
    boolean bool = ViewCompat.OoooOOO(this);
    if (bool)
    {
      int j = getWidth();
      updateTrackWidth(j);
    }
    return true;
  }
  
  private boolean maybeIncreaseWidgetHeight()
  {
    int i = getPaddingTop();
    int j = getPaddingBottom();
    i += j;
    j = this.trackHeight + i;
    i = this.thumbRadius * 2;
    int k = getPaddingTop();
    i += k;
    k = getPaddingBottom();
    i += k;
    k = this.minWidgetHeight;
    i = Math.max(j, i);
    i = Math.max(k, i);
    j = this.widgetHeight;
    if (i == j) {
      return false;
    }
    this.widgetHeight = i;
    return true;
  }
  
  private boolean moveFocus(int paramInt)
  {
    int i = this.focusedThumbIdx;
    long l1 = i;
    long l2 = paramInt;
    long l3 = l1 + l2;
    long l4 = 0L;
    ArrayList localArrayList = this.values;
    paramInt = localArrayList.size();
    int j = 1;
    long l5 = paramInt - j;
    long l6 = MathUtils.OooO0OO(l3, l4, l5);
    paramInt = (int)l6;
    this.focusedThumbIdx = paramInt;
    if (paramInt == i) {
      return false;
    }
    i = this.activeThumbIdx;
    int k = -1;
    if (i != k) {
      this.activeThumbIdx = paramInt;
    }
    updateHaloHotspot();
    postInvalidate();
    return j;
  }
  
  private boolean moveFocusInAbsoluteDirection(int paramInt)
  {
    boolean bool = isRtl();
    if (bool)
    {
      int i = -1 << -1;
      if (paramInt == i) {
        paramInt = -1 >>> 1;
      } else {
        paramInt = -paramInt;
      }
    }
    return moveFocus(paramInt);
  }
  
  private float normalizeValue(float paramFloat)
  {
    float f1 = this.valueFrom;
    paramFloat -= f1;
    float f2 = this.valueTo - f1;
    paramFloat /= f2;
    boolean bool = isRtl();
    if (bool) {
      return 1.0F - paramFloat;
    }
    return paramFloat;
  }
  
  private Boolean onKeyDownNoActiveThumb(int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 61;
    int j = 1;
    int k = -1;
    if (paramInt != i)
    {
      int m = 66;
      if (paramInt != m)
      {
        m = 81;
        if (paramInt != m)
        {
          m = 69;
          if (paramInt != m)
          {
            m = 70;
            if (paramInt == m) {
              break label115;
            }
          }
        }
        switch (paramInt)
        {
        default: 
          return null;
        case 22: 
          moveFocusInAbsoluteDirection(j);
          return Boolean.TRUE;
        case 21: 
          moveFocusInAbsoluteDirection(k);
          return Boolean.TRUE;
          moveFocus(k);
          return Boolean.TRUE;
          label115:
          moveFocus(j);
          return Boolean.TRUE;
        }
      }
      paramInt = this.focusedThumbIdx;
      this.activeThumbIdx = paramInt;
      postInvalidate();
      return Boolean.TRUE;
    }
    paramInt = paramKeyEvent.hasNoModifiers();
    if (paramInt != 0) {
      return Boolean.valueOf(moveFocus(j));
    }
    paramInt = paramKeyEvent.isShiftPressed();
    if (paramInt != 0) {
      return Boolean.valueOf(moveFocus(k));
    }
    return Boolean.FALSE;
  }
  
  private void onStartTrackingTouch()
  {
    Iterator localIterator = this.touchListeners.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      BaseOnSliderTouchListener localBaseOnSliderTouchListener = (BaseOnSliderTouchListener)localIterator.next();
      localBaseOnSliderTouchListener.onStartTrackingTouch(this);
    }
  }
  
  private void onStopTrackingTouch()
  {
    Iterator localIterator = this.touchListeners.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      BaseOnSliderTouchListener localBaseOnSliderTouchListener = (BaseOnSliderTouchListener)localIterator.next();
      localBaseOnSliderTouchListener.onStopTrackingTouch(this);
    }
  }
  
  private static int pivotIndex(float[] paramArrayOfFloat, float paramFloat)
  {
    float f = paramArrayOfFloat.length / 2 + -1;
    return Math.round(paramFloat * f);
  }
  
  private void processAttributes(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    Object localObject1 = R.styleable.Slider;
    int i = DEF_STYLE_RES;
    int[] arrayOfInt = new int[0];
    Object localObject2 = paramAttributeSet;
    paramAttributeSet = ThemeEnforcement.obtainStyledAttributes(paramContext, paramAttributeSet, (int[])localObject1, paramInt, i, arrayOfInt);
    paramInt = R.styleable.Slider_labelStyle;
    int j = R.style.Widget_MaterialComponents_Tooltip;
    paramInt = paramAttributeSet.getResourceId(paramInt, j);
    this.labelStyle = paramInt;
    paramInt = R.styleable.Slider_android_valueFrom;
    j = 0;
    float f1 = paramAttributeSet.getFloat(paramInt, 0.0F);
    this.valueFrom = f1;
    paramInt = R.styleable.Slider_android_valueTo;
    f1 = paramAttributeSet.getFloat(paramInt, 1.0F);
    this.valueTo = f1;
    paramInt = 1;
    f1 = 1.4E-45F;
    localObject2 = new Float[paramInt];
    localObject1 = Float.valueOf(this.valueFrom);
    localObject2[0] = localObject1;
    setValues((Float[])localObject2);
    int k = R.styleable.Slider_android_stepSize;
    float f2 = paramAttributeSet.getFloat(k, 0.0F);
    this.stepSize = f2;
    localObject2 = getContext();
    f2 = (float)Math.ceil(ViewUtils.dpToPx((Context)localObject2, 48));
    int i3 = R.styleable.Slider_minTouchTargetSize;
    f2 = paramAttributeSet.getDimension(i3, f2);
    double d = Math.ceil(f2);
    k = (int)d;
    this.minTouchTargetSize = k;
    k = R.styleable.Slider_trackColor;
    boolean bool1 = paramAttributeSet.hasValue(k);
    if (bool1) {
      i3 = R.styleable.Slider_trackColor;
    } else {
      i3 = R.styleable.Slider_trackColorInactive;
    }
    if (bool1) {
      m = R.styleable.Slider_trackColor;
    } else {
      m = R.styleable.Slider_trackColorActive;
    }
    localObject1 = MaterialResources.getColorStateList(paramContext, paramAttributeSet, i3);
    if (localObject1 == null)
    {
      i3 = R.color.material_slider_inactive_track_color;
      localObject1 = AppCompatResources.OooO00o(paramContext, i3);
    }
    setTrackInactiveTintList((ColorStateList)localObject1);
    localObject2 = MaterialResources.getColorStateList(paramContext, paramAttributeSet, m);
    if (localObject2 == null)
    {
      m = R.color.material_slider_active_track_color;
      localObject2 = AppCompatResources.OooO00o(paramContext, m);
    }
    setTrackActiveTintList((ColorStateList)localObject2);
    int m = R.styleable.Slider_thumbColor;
    localObject2 = MaterialResources.getColorStateList(paramContext, paramAttributeSet, m);
    localObject1 = this.defaultThumbDrawable;
    ((MaterialShapeDrawable)localObject1).setFillColor((ColorStateList)localObject2);
    m = R.styleable.Slider_thumbStrokeColor;
    boolean bool2 = paramAttributeSet.hasValue(m);
    if (bool2)
    {
      n = R.styleable.Slider_thumbStrokeColor;
      localObject2 = MaterialResources.getColorStateList(paramContext, paramAttributeSet, n);
      setThumbStrokeColor((ColorStateList)localObject2);
    }
    int n = R.styleable.Slider_thumbStrokeWidth;
    f2 = paramAttributeSet.getDimension(n, 0.0F);
    setThumbStrokeWidth(f2);
    n = R.styleable.Slider_haloColor;
    localObject2 = MaterialResources.getColorStateList(paramContext, paramAttributeSet, n);
    if (localObject2 == null)
    {
      n = R.color.material_slider_halo_color;
      localObject2 = AppCompatResources.OooO00o(paramContext, n);
    }
    setHaloTintList((ColorStateList)localObject2);
    n = R.styleable.Slider_tickVisible;
    boolean bool3 = paramAttributeSet.getBoolean(n, paramInt);
    this.tickVisible = bool3;
    int i1 = R.styleable.Slider_tickColor;
    boolean bool4 = paramAttributeSet.hasValue(i1);
    if (bool4) {
      i3 = R.styleable.Slider_tickColor;
    } else {
      i3 = R.styleable.Slider_tickColorInactive;
    }
    int i2;
    if (bool4) {
      i2 = R.styleable.Slider_tickColor;
    } else {
      i2 = R.styleable.Slider_tickColorActive;
    }
    localObject1 = MaterialResources.getColorStateList(paramContext, paramAttributeSet, i3);
    if (localObject1 == null)
    {
      i3 = R.color.material_slider_inactive_tick_marks_color;
      localObject1 = AppCompatResources.OooO00o(paramContext, i3);
    }
    setTickInactiveTintList((ColorStateList)localObject1);
    localObject2 = MaterialResources.getColorStateList(paramContext, paramAttributeSet, i2);
    if (localObject2 == null)
    {
      i2 = R.color.material_slider_active_tick_marks_color;
      localObject2 = AppCompatResources.OooO00o(paramContext, i2);
    }
    setTickActiveTintList((ColorStateList)localObject2);
    int i4 = R.styleable.Slider_thumbRadius;
    i4 = paramAttributeSet.getDimensionPixelSize(i4, 0);
    setThumbRadius(i4);
    i4 = R.styleable.Slider_haloRadius;
    i4 = paramAttributeSet.getDimensionPixelSize(i4, 0);
    setHaloRadius(i4);
    i4 = R.styleable.Slider_thumbElevation;
    float f3 = paramAttributeSet.getDimension(i4, 0.0F);
    setThumbElevation(f3);
    i4 = R.styleable.Slider_trackHeight;
    i4 = paramAttributeSet.getDimensionPixelSize(i4, 0);
    setTrackHeight(i4);
    i4 = R.styleable.Slider_tickRadiusActive;
    i4 = paramAttributeSet.getDimensionPixelSize(i4, 0);
    setTickActiveRadius(i4);
    i4 = R.styleable.Slider_tickRadiusInactive;
    i4 = paramAttributeSet.getDimensionPixelSize(i4, 0);
    setTickInactiveRadius(i4);
    i4 = R.styleable.Slider_labelBehavior;
    i4 = paramAttributeSet.getInt(i4, 0);
    setLabelBehavior(i4);
    i4 = R.styleable.Slider_android_enabled;
    boolean bool5 = paramAttributeSet.getBoolean(i4, paramInt);
    if (!bool5) {
      setEnabled(false);
    }
    paramAttributeSet.recycle();
  }
  
  private void scheduleAccessibilityEventSender(int paramInt)
  {
    BaseSlider.AccessibilityEventSender localAccessibilityEventSender1 = this.accessibilityEventSender;
    if (localAccessibilityEventSender1 == null)
    {
      localAccessibilityEventSender1 = new com/google/android/material/slider/BaseSlider$AccessibilityEventSender;
      localAccessibilityEventSender1.<init>(this, null);
      this.accessibilityEventSender = localAccessibilityEventSender1;
    }
    else
    {
      removeCallbacks(localAccessibilityEventSender1);
    }
    this.accessibilityEventSender.setVirtualViewId(paramInt);
    BaseSlider.AccessibilityEventSender localAccessibilityEventSender2 = this.accessibilityEventSender;
    postDelayed(localAccessibilityEventSender2, 200L);
  }
  
  private void setValueForLabel(TooltipDrawable paramTooltipDrawable, float paramFloat)
  {
    Object localObject = formatValue(paramFloat);
    paramTooltipDrawable.setText((CharSequence)localObject);
    int i = this.trackSidePadding;
    paramFloat = normalizeValue(paramFloat);
    float f = this.trackWidth;
    int j = (int)(paramFloat * f);
    i += j;
    j = paramTooltipDrawable.getIntrinsicWidth() / 2;
    i -= j;
    j = calculateTrackCenter();
    int k = this.labelPadding;
    int m = this.thumbRadius;
    k += m;
    j -= k;
    k = paramTooltipDrawable.getIntrinsicHeight();
    k = j - k;
    m = paramTooltipDrawable.getIntrinsicWidth() + i;
    paramTooltipDrawable.setBounds(i, k, m, j);
    Rect localRect = new android/graphics/Rect;
    localObject = paramTooltipDrawable.getBounds();
    localRect.<init>((Rect)localObject);
    DescendantOffsetUtils.offsetDescendantRect(ViewUtils.getContentView(this), this, localRect);
    paramTooltipDrawable.setBounds(localRect);
    ViewUtils.getContentViewOverlay(this).add(paramTooltipDrawable);
  }
  
  private void setValuesInternal(ArrayList paramArrayList)
  {
    boolean bool1 = paramArrayList.isEmpty();
    if (!bool1)
    {
      Collections.sort(paramArrayList);
      localObject = this.values;
      int i = ((ArrayList)localObject).size();
      int j = paramArrayList.size();
      if (i == j)
      {
        localObject = this.values;
        boolean bool2 = ((ArrayList)localObject).equals(paramArrayList);
        if (bool2) {
          return;
        }
      }
      this.values = paramArrayList;
      this.dirtyConfig = true;
      this.focusedThumbIdx = 0;
      updateHaloHotspot();
      createLabelPool();
      dispatchOnChangedProgrammatically();
      postInvalidate();
      return;
    }
    paramArrayList = new java/lang/IllegalArgumentException;
    Object localObject = m54207b69.F54207b69_11("S77644195E565B4A4A1F61635D234E646A5263296D5659592E6D6B315F6E60");
    paramArrayList.<init>((String)localObject);
    throw paramArrayList;
  }
  
  private boolean shouldAlwaysShowLabel()
  {
    int i = this.labelBehavior;
    int j = 3;
    if (i == j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  private boolean shouldDrawCompatHalo()
  {
    boolean bool = this.forceDrawCompatHalo;
    if (!bool)
    {
      Drawable localDrawable = getBackground();
      bool = localDrawable instanceof RippleDrawable;
      if (bool)
      {
        bool = false;
        localDrawable = null;
        return bool;
      }
    }
    bool = true;
    return bool;
  }
  
  private boolean snapActiveThumbToValue(float paramFloat)
  {
    int i = this.activeThumbIdx;
    return snapThumbToValue(i, paramFloat);
  }
  
  private double snapPosition(float paramFloat)
  {
    float f1 = this.stepSize;
    float f2 = 0.0F;
    boolean bool = f1 < 0.0F;
    if (bool)
    {
      f2 = this.valueTo;
      float f3 = this.valueFrom;
      int i = (int)((f2 - f3) / f1);
      f2 = i;
      double d1 = Math.round(paramFloat * f2);
      double d2 = i;
      return d1 / d2;
    }
    return paramFloat;
  }
  
  private boolean snapThumbToValue(int paramInt, float paramFloat)
  {
    this.focusedThumbIdx = paramInt;
    Object localObject = (Float)this.values.get(paramInt);
    float f = ((Float)localObject).floatValue();
    f = Math.abs(paramFloat - f);
    double d1 = f;
    double d2 = 0.0001D;
    boolean bool = d1 < d2;
    if (bool) {
      return false;
    }
    paramFloat = getClampedValue(paramInt, paramFloat);
    localObject = this.values;
    Float localFloat = Float.valueOf(paramFloat);
    ((ArrayList)localObject).set(paramInt, localFloat);
    dispatchOnChangedFromUser(paramInt);
    return true;
  }
  
  private boolean snapTouchPosition()
  {
    float f = getValueOfTouchPosition();
    return snapActiveThumbToValue(f);
  }
  
  private void updateHaloHotspot()
  {
    boolean bool1 = shouldDrawCompatHalo();
    if (!bool1)
    {
      int i = getMeasuredWidth();
      if (i > 0)
      {
        Drawable localDrawable = getBackground();
        boolean bool2 = localDrawable instanceof RippleDrawable;
        if (bool2)
        {
          Object localObject = this.values;
          int k = this.focusedThumbIdx;
          localObject = (Float)((ArrayList)localObject).get(k);
          float f1 = ((Float)localObject).floatValue();
          f1 = normalizeValue(f1);
          float f2 = this.trackWidth;
          f1 *= f2;
          f2 = this.trackSidePadding;
          f1 += f2;
          int j = (int)f1;
          k = calculateTrackCenter();
          int m = this.haloRadius;
          int n = j - m;
          int i1 = k - m;
          j += m;
          k += m;
          DrawableCompat.OooOO0o((Drawable)localDrawable, n, i1, j, k);
        }
      }
    }
  }
  
  private void updateTrackWidth(int paramInt)
  {
    int i = this.trackSidePadding * 2;
    paramInt = Math.max(paramInt - i, 0);
    this.trackWidth = paramInt;
    maybeCalculateTicksCoordinates();
  }
  
  private void updateWidgetLayout()
  {
    boolean bool1 = maybeIncreaseWidgetHeight();
    boolean bool2 = maybeIncreaseTrackSidePadding();
    if (bool1) {
      requestLayout();
    } else if (bool2) {
      postInvalidate();
    }
  }
  
  private void validateConfigurationIfDirty()
  {
    boolean bool = this.dirtyConfig;
    if (bool)
    {
      validateValueFrom();
      validateValueTo();
      validateStepSize();
      validateValues();
      validateMinSeparation();
      warnAboutFloatingPointError();
      bool = false;
      this.dirtyConfig = false;
    }
  }
  
  private void validateMinSeparation()
  {
    float f1 = getMinSeparation();
    boolean bool1 = false;
    IllegalStateException localIllegalStateException = null;
    boolean bool3 = f1 < 0.0F;
    if (!bool3)
    {
      float f2 = this.stepSize;
      int j = f2 < 0.0F;
      if (j > 0)
      {
        bool1 = f1 < 0.0F;
        if (bool1)
        {
          int i = this.separationUnit;
          j = 1;
          Float localFloat1;
          if (i == j)
          {
            boolean bool2 = f1 < f2;
            if (!bool2)
            {
              bool2 = isMultipleOfStepSize(f1);
              if (bool2) {}
            }
            else
            {
              localIllegalStateException = new java/lang/IllegalStateException;
              localObject = Float.valueOf(f1);
              localFloat1 = Float.valueOf(this.stepSize);
              Float localFloat2 = Float.valueOf(this.stepSize);
              Object[] tmp112_109 = new Object[3];
              Object[] tmp113_112 = tmp112_109;
              Object[] tmp113_112 = tmp112_109;
              tmp113_112[0] = localObject;
              tmp113_112[1] = localFloat1;
              tmp113_112[2] = localFloat2;
              localObject = tmp113_112;
              localObject = String.format(m54207b69.F54207b69_11("7g0A0F0B37061C0C1C0E1C1813155C50235E581C2528285D1C1A601A301E23312135682A386B273C392E34713135307535773B443E47434D423A80423C83515141577550604694885B96905A5A4E569561645F5B539B6969596F8D68785EACA073AE"), (Object[])localObject);
              localIllegalStateException.<init>((String)localObject);
              throw localIllegalStateException;
            }
          }
          else
          {
            localIllegalStateException = new java/lang/IllegalStateException;
            localObject = Float.valueOf(f1);
            localFloat1 = Float.valueOf(this.stepSize);
            localObject = new Object[] { localObject, localFloat1 };
            localObject = String.format(m54207b69.F54207b69_11("bC2E2B2F132A3828382A4034373978743F7A7432354142424E7B3A407E4C43558242518545874C50554E565A55585A91635B575F966A6560645C9C6A7262704E697967ADA974AF"), (Object[])localObject);
            localIllegalStateException.<init>((String)localObject);
            throw localIllegalStateException;
          }
        }
      }
      return;
    }
    localIllegalStateException = new java/lang/IllegalStateException;
    Object localObject = Float.valueOf(f1);
    localObject = new Object[] { localObject };
    localObject = String.format(m54207b69.F54207b69_11("Km000505410C22122614220E0D0F52562D545E122B322E63262066243A242937273F6E2442712D423F342A77442E7A8B"), (Object[])localObject);
    localIllegalStateException.<init>((String)localObject);
    throw localIllegalStateException;
  }
  
  private void validateStepSize()
  {
    float f = this.stepSize;
    Object localObject = null;
    boolean bool = f < 0.0F;
    if (bool)
    {
      f = this.valueTo;
      bool = valueLandsOnTick(f);
      if (!bool)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localObject = Float.valueOf(this.stepSize);
        Float localFloat1 = Float.valueOf(this.valueFrom);
        Float localFloat2 = Float.valueOf(this.valueTo);
        Object[] tmp68_65 = new Object[3];
        Object[] tmp69_68 = tmp68_65;
        Object[] tmp69_68 = tmp68_65;
        tmp69_68[0] = localObject;
        tmp69_68[1] = localFloat1;
        tmp69_68[2] = localFloat2;
        localObject = tmp69_68;
        localObject = String.format(m54207b69.F54207b69_11("dH1C212F6B3F41333F232A3C386C7A497078364F4E507D404480917E8343578648884F4B4E604C608F4F5792674C5A966D59556F60426F5D5C98A6759CA17B67637D6E5E6AA4B281A8B08373717B7A"), (Object[])localObject);
        localIllegalStateException.<init>((String)localObject);
        throw localIllegalStateException;
      }
    }
  }
  
  private void validateValueFrom()
  {
    float f1 = this.valueFrom;
    float f2 = this.valueTo;
    boolean bool = f1 < f2;
    if (bool) {
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    Object localObject = Float.valueOf(this.valueFrom);
    Float localFloat = Float.valueOf(this.valueTo);
    localObject = new Object[] { localObject, localFloat };
    localObject = String.format(m54207b69.F54207b69_11("L<4A5E524C5D7F545A591D235A21295F585F592E716D31656875696A746A3966737D733E6D81756F80907C3E447B42"), (Object[])localObject);
    localIllegalStateException.<init>((String)localObject);
    throw localIllegalStateException;
  }
  
  private void validateValueTo()
  {
    float f1 = this.valueTo;
    float f2 = this.valueFrom;
    boolean bool = f1 < f2;
    if (bool) {
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    Object localObject = Float.valueOf(this.valueTo);
    Float localFloat = Float.valueOf(this.valueFrom);
    localObject = new Object[] { localObject, localFloat };
    localObject = String.format(m54207b69.F54207b69_11("?z0C1C181223331B5967125D65231C171D6A29316D311D3532263822752A2F39337A2D3D393344622F3D407C8A3580"), (Object[])localObject);
    localIllegalStateException.<init>((String)localObject);
    throw localIllegalStateException;
  }
  
  private void validateValues()
  {
    Object localObject1 = this.values.iterator();
    boolean bool2;
    do
    {
      do
      {
        boolean bool1 = ((Iterator)localObject1).hasNext();
        if (!bool1) {
          return;
        }
        localObject2 = (Float)((Iterator)localObject1).next();
        f1 = ((Float)localObject2).floatValue();
        float f2 = this.valueFrom;
        bool2 = f1 < f2;
        if (bool2) {
          break;
        }
        f1 = ((Float)localObject2).floatValue();
        f2 = this.valueTo;
        bool2 = f1 < f2;
        if (bool2) {
          break;
        }
        f1 = this.stepSize;
        f2 = 0.0F;
        localFloat1 = null;
        bool2 = f1 < 0.0F;
      } while (!bool2);
      float f1 = ((Float)localObject2).floatValue();
      bool2 = valueLandsOnTick(f1);
    } while (bool2);
    localObject1 = new java/lang/IllegalStateException;
    Float localFloat2 = Float.valueOf(this.valueFrom);
    Float localFloat1 = Float.valueOf(this.stepSize);
    Float localFloat3 = Float.valueOf(this.stepSize);
    Object[] tmp157_154 = new Object[4];
    Object[] tmp158_157 = tmp157_154;
    Object[] tmp158_157 = tmp157_154;
    tmp158_157[0] = localObject2;
    tmp158_157[1] = localFloat2;
    tmp158_157[2] = localFloat1;
    Object[] tmp170_158 = tmp158_157;
    tmp170_158[3] = localFloat3;
    Object localObject2 = tmp170_158;
    localObject2 = String.format(m54207b69.F54207b69_11("@C152331392A706C37726C38413C447130367438454A37457A4F457D503E4C544525524E518F8B56918B5C59615C9050925E67616A5E68655D9B655F9E6C746472506B7B69AFAB76B1AB7D757179B0847F7A7E76B6848C7C8A68839381C7C38EC9"), (Object[])localObject2);
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
    localObject1 = new java/lang/IllegalStateException;
    localFloat2 = Float.valueOf(this.valueFrom);
    localFloat1 = Float.valueOf(this.valueTo);
    Object[] tmp220_217 = new Object[3];
    Object[] tmp221_220 = tmp220_217;
    Object[] tmp221_220 = tmp220_217;
    tmp221_220[0] = localObject2;
    tmp221_220[1] = localFloat2;
    tmp221_220[2] = localFloat1;
    localObject2 = tmp221_220;
    localObject2 = String.format(m54207b69.F54207b69_11("|Q023E3A383828772E38462E3F85813087814D36353986494B894F3D4F4C425242915F459458454A57659A4F699D545E6C546549567271AFAB5AB1B7AC6C7C73B07D7F687767B6846AB97D6A6F7C8ABF748EC2798391798A5C96D2CE7DD4"), (Object[])localObject2);
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  private boolean valueLandsOnTick(float paramFloat)
  {
    float f = this.valueFrom;
    paramFloat -= f;
    return isMultipleOfStepSize(paramFloat);
  }
  
  private float valueToX(float paramFloat)
  {
    paramFloat = normalizeValue(paramFloat);
    float f = this.trackWidth;
    paramFloat *= f;
    f = this.trackSidePadding;
    return paramFloat + f;
  }
  
  private void warnAboutFloatingPointError()
  {
    float f1 = this.stepSize;
    float f2 = 0.0F;
    String str1 = null;
    boolean bool = f1 < 0.0F;
    if (!bool) {
      return;
    }
    f2 = (int)f1;
    bool = f2 < f1;
    String str2 = m54207b69.F54207b69_11("I1775E6053495D655D194A68636B521F56606E56672559586B6D2A71795F2E32613935643B43368A698088803C838A8C7F757343858494479088808E4C7F9B829E9599A1995599898AA68C8C5C92A6A6A1A962AEA39C6699AB9A9DB7A06DB5BD70B8C0B4C1A7A8BAB9AD7AB1BBC9B1C2B18F82EAD2B6BACAC7CD968BCDDADCC0D7D5D5C594C8C7DEE6DE9AE2EAD1E1E4E3D3D3A3D9ECDAEFA8E8AAECDFDEE2FCFBB11EF2F6F8021D05EB05FAF0F101F1C0F50FC3080CF7F7140801CB001511CF06101E0617D517240A0B1D1C102915ED");
    Object localObject;
    if (bool)
    {
      str1 = m54207b69.F54207b69_11("TA32362634162D412B");
      localObject = Float.valueOf(f1);
      localObject = new Object[] { str1, localObject };
      String.format(str2, (Object[])localObject);
    }
    f1 = this.valueFrom;
    f2 = (int)f1;
    bool = f2 < f1;
    if (bool)
    {
      str1 = m54207b69.F54207b69_11(",q07111F07183C092524");
      localObject = Float.valueOf(f1);
      localObject = new Object[] { str1, localObject };
      String.format(str2, (Object[])localObject);
    }
    f1 = this.valueTo;
    f2 = (int)f1;
    bool = f2 < f1;
    if (bool)
    {
      str1 = m54207b69.F54207b69_11("P)5F49475F50824C");
      localObject = Float.valueOf(f1);
      localObject = new Object[] { str1, localObject };
      String.format(str2, (Object[])localObject);
    }
  }
  
  public void addOnChangeListener(BaseOnChangeListener paramBaseOnChangeListener)
  {
    this.changeListeners.add(paramBaseOnChangeListener);
  }
  
  public void addOnSliderTouchListener(BaseOnSliderTouchListener paramBaseOnSliderTouchListener)
  {
    this.touchListeners.add(paramBaseOnSliderTouchListener);
  }
  
  public void clearOnChangeListeners()
  {
    this.changeListeners.clear();
  }
  
  public void clearOnSliderTouchListeners()
  {
    this.touchListeners.clear();
  }
  
  public boolean dispatchHoverEvent(MotionEvent paramMotionEvent)
  {
    BaseSlider.AccessibilityHelper localAccessibilityHelper = this.accessibilityHelper;
    boolean bool1 = localAccessibilityHelper.dispatchHoverEvent(paramMotionEvent);
    if (!bool1)
    {
      bool2 = super.dispatchHoverEvent(paramMotionEvent);
      if (!bool2)
      {
        bool2 = false;
        paramMotionEvent = null;
        break label41;
      }
    }
    boolean bool2 = true;
    label41:
    return bool2;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject1 = this.inactiveTrackPaint;
    Object localObject2 = this.trackColorInactive;
    int i = getColorForState((ColorStateList)localObject2);
    ((Paint)localObject1).setColor(i);
    localObject1 = this.activeTrackPaint;
    localObject2 = this.trackColorActive;
    i = getColorForState((ColorStateList)localObject2);
    ((Paint)localObject1).setColor(i);
    localObject1 = this.inactiveTicksPaint;
    localObject2 = this.tickColorInactive;
    i = getColorForState((ColorStateList)localObject2);
    ((Paint)localObject1).setColor(i);
    localObject1 = this.activeTicksPaint;
    localObject2 = this.tickColorActive;
    i = getColorForState((ColorStateList)localObject2);
    ((Paint)localObject1).setColor(i);
    localObject1 = this.labels.iterator();
    for (;;)
    {
      boolean bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = (TooltipDrawable)((Iterator)localObject1).next();
      boolean bool2 = ((MaterialShapeDrawable)localObject2).isStateful();
      if (bool2)
      {
        int[] arrayOfInt = getDrawableState();
        ((Drawable)localObject2).setState(arrayOfInt);
      }
    }
    localObject1 = this.defaultThumbDrawable;
    boolean bool3 = ((MaterialShapeDrawable)localObject1).isStateful();
    if (bool3)
    {
      localObject1 = this.defaultThumbDrawable;
      localObject2 = getDrawableState();
      ((Drawable)localObject1).setState((int[])localObject2);
    }
    localObject1 = this.haloPaint;
    localObject2 = this.haloColor;
    int j = getColorForState((ColorStateList)localObject2);
    ((Paint)localObject1).setColor(j);
    this.haloPaint.setAlpha(63);
  }
  
  public void forceDrawCompatHalo(boolean paramBoolean)
  {
    this.forceDrawCompatHalo = paramBoolean;
  }
  
  public CharSequence getAccessibilityClassName()
  {
    return SeekBar.class.getName();
  }
  
  public final int getAccessibilityFocusedVirtualViewId()
  {
    return this.accessibilityHelper.getAccessibilityFocusedVirtualViewId();
  }
  
  public int getActiveThumbIndex()
  {
    return this.activeThumbIdx;
  }
  
  public int getFocusedThumbIndex()
  {
    return this.focusedThumbIdx;
  }
  
  public int getHaloRadius()
  {
    return this.haloRadius;
  }
  
  public ColorStateList getHaloTintList()
  {
    return this.haloColor;
  }
  
  public int getLabelBehavior()
  {
    return this.labelBehavior;
  }
  
  public float getMinSeparation()
  {
    return 0.0F;
  }
  
  public float getStepSize()
  {
    return this.stepSize;
  }
  
  public float getThumbElevation()
  {
    return this.defaultThumbDrawable.getElevation();
  }
  
  public int getThumbRadius()
  {
    return this.thumbRadius;
  }
  
  public ColorStateList getThumbStrokeColor()
  {
    return this.defaultThumbDrawable.getStrokeColor();
  }
  
  public float getThumbStrokeWidth()
  {
    return this.defaultThumbDrawable.getStrokeWidth();
  }
  
  public ColorStateList getThumbTintList()
  {
    return this.defaultThumbDrawable.getFillColor();
  }
  
  public int getTickActiveRadius()
  {
    return this.tickActiveRadius;
  }
  
  public ColorStateList getTickActiveTintList()
  {
    return this.tickColorActive;
  }
  
  public int getTickInactiveRadius()
  {
    return this.tickInactiveRadius;
  }
  
  public ColorStateList getTickInactiveTintList()
  {
    return this.tickColorInactive;
  }
  
  public ColorStateList getTickTintList()
  {
    Object localObject1 = this.tickColorInactive;
    Object localObject2 = this.tickColorActive;
    boolean bool = localObject1.equals(localObject2);
    if (bool) {
      return this.tickColorActive;
    }
    localObject1 = new java/lang/IllegalStateException;
    localObject2 = m54207b69.F54207b69_11("mk3F04104E060A100F270B27195717131E5B1B1A3216322462371B221B346828382E6C312531323440362E4976343135334949777E724D4482573C4886484B5D7E4249426B484C4A606A4E54536B4F6B5D93939D5D5964A1636678995D645D866367657B8D6C84688476ACACB6727B8D7274808ABE767A8E96868389C0");
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public ColorStateList getTrackActiveTintList()
  {
    return this.trackColorActive;
  }
  
  public int getTrackHeight()
  {
    return this.trackHeight;
  }
  
  public ColorStateList getTrackInactiveTintList()
  {
    return this.trackColorInactive;
  }
  
  public int getTrackSidePadding()
  {
    return this.trackSidePadding;
  }
  
  public ColorStateList getTrackTintList()
  {
    Object localObject1 = this.trackColorInactive;
    Object localObject2 = this.trackColorActive;
    boolean bool = localObject1.equals(localObject2);
    if (bool) {
      return this.trackColorActive;
    }
    localObject1 = new java/lang/IllegalStateException;
    localObject2 = m54207b69.F54207b69_11("([0F34407E363A403F373B37498747434E8B4B4A42464254924353434A4498525C9B5055619F544F616059A565556BA96E626E6F715D736B66B3716E72706666B4BB4F6A81BF747985C385887A5E8288877F837F91637E908F88718E929086D1D1DB9B97A2DFA1A49682A1999D99AB7D98AAA9A28BA8ACAAA0EBEBF5B1BAACB1B3BFA9FDB5B9ADB5C5C2C8FF");
    ((IllegalStateException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  public int getTrackWidth()
  {
    return this.trackWidth;
  }
  
  public float getValueFrom()
  {
    return this.valueFrom;
  }
  
  public float getValueTo()
  {
    return this.valueTo;
  }
  
  public List getValues()
  {
    ArrayList localArrayList1 = new java/util/ArrayList;
    ArrayList localArrayList2 = this.values;
    localArrayList1.<init>(localArrayList2);
    return localArrayList1;
  }
  
  public boolean hasLabelFormatter()
  {
    LabelFormatter localLabelFormatter = this.formatter;
    boolean bool;
    if (localLabelFormatter != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localLabelFormatter = null;
    }
    return bool;
  }
  
  public final boolean isRtl()
  {
    int i = ViewCompat.OooOoOO(this);
    int j = 1;
    if (i != j) {
      j = 0;
    }
    return j;
  }
  
  public boolean isTickVisible()
  {
    return this.tickVisible;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    Iterator localIterator = this.labels.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      TooltipDrawable localTooltipDrawable = (TooltipDrawable)localIterator.next();
      attachLabelToContentView(localTooltipDrawable);
    }
  }
  
  public void onDetachedFromWindow()
  {
    Object localObject = this.accessibilityEventSender;
    if (localObject != null) {
      removeCallbacks((Runnable)localObject);
    }
    this.labelsAreAnimatedIn = false;
    localObject = this.labels.iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject).hasNext();
      if (!bool) {
        break;
      }
      TooltipDrawable localTooltipDrawable = (TooltipDrawable)((Iterator)localObject).next();
      detachLabelFromContentView(localTooltipDrawable);
    }
    super.onDetachedFromWindow();
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    boolean bool1 = this.dirtyConfig;
    if (bool1)
    {
      validateConfigurationIfDirty();
      maybeCalculateTicksCoordinates();
    }
    super.onDraw(paramCanvas);
    int i = calculateTrackCenter();
    int j = this.trackWidth;
    drawInactiveTrack(paramCanvas, j, i);
    Float localFloat = (Float)Collections.max(getValues());
    float f1 = localFloat.floatValue();
    float f2 = this.valueFrom;
    boolean bool2 = f1 < f2;
    if (bool2)
    {
      int k = this.trackWidth;
      drawActiveTrack(paramCanvas, k, i);
    }
    maybeDrawTicks(paramCanvas);
    boolean bool3 = this.thumbIsPressed;
    if (!bool3)
    {
      bool3 = isFocused();
      if (!bool3) {}
    }
    else
    {
      bool3 = isEnabled();
      if (bool3)
      {
        m = this.trackWidth;
        maybeDrawCompatHalo(paramCanvas, m, i);
      }
    }
    int m = this.activeThumbIdx;
    int i1 = -1;
    f2 = 0.0F / 0.0F;
    boolean bool4;
    if (m == i1)
    {
      bool4 = shouldAlwaysShowLabel();
      if (!bool4) {}
    }
    else
    {
      bool4 = isEnabled();
      if (bool4)
      {
        ensureLabelsAdded();
        break label178;
      }
    }
    ensureLabelsRemoved();
    label178:
    int n = this.trackWidth;
    drawThumbs(paramCanvas, n, i);
  }
  
  public void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    BaseSlider.AccessibilityHelper localAccessibilityHelper;
    if (!paramBoolean)
    {
      paramBoolean = true;
      this.activeThumbIdx = paramBoolean;
      localAccessibilityHelper = this.accessibilityHelper;
      paramInt = this.focusedThumbIdx;
      localAccessibilityHelper.clearKeyboardFocusForVirtualView(paramInt);
    }
    else
    {
      focusThumbOnFocusGained(paramInt);
      localAccessibilityHelper = this.accessibilityHelper;
      paramInt = this.focusedThumbIdx;
      localAccessibilityHelper.requestKeyboardFocusForVirtualView(paramInt);
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = isEnabled();
    if (!bool1) {
      return super.onKeyDown(paramInt, paramKeyEvent);
    }
    Object localObject1 = this.values;
    int i = ((ArrayList)localObject1).size();
    int k = 1;
    if (i == k) {
      this.activeThumbIdx = 0;
    }
    i = this.activeThumbIdx;
    int m = -1;
    if (i == m)
    {
      localObject1 = onKeyDownNoActiveThumb(paramInt, paramKeyEvent);
      if (localObject1 != null) {
        paramInt = ((Boolean)localObject1).booleanValue();
      } else {
        paramInt = super.onKeyDown(paramInt, paramKeyEvent);
      }
      return paramInt;
    }
    boolean bool2 = this.isLongPress;
    boolean bool3 = paramKeyEvent.isLongPress();
    bool2 |= bool3;
    this.isLongPress = bool2;
    localObject1 = calculateIncrementForKey(paramInt);
    if (localObject1 != null)
    {
      Object localObject2 = this.values;
      int n = this.activeThumbIdx;
      localObject2 = (Float)((ArrayList)localObject2).get(n);
      float f1 = ((Float)localObject2).floatValue();
      float f2 = ((Float)localObject1).floatValue();
      f1 += f2;
      paramInt = snapActiveThumbToValue(f1);
      if (paramInt != 0)
      {
        updateHaloHotspot();
        postInvalidate();
      }
      return k;
    }
    int j = 23;
    if (paramInt != j)
    {
      j = 61;
      if (paramInt != j)
      {
        j = 66;
        if (paramInt != j) {
          return super.onKeyDown(paramInt, paramKeyEvent);
        }
      }
      else
      {
        paramInt = paramKeyEvent.hasNoModifiers();
        if (paramInt != 0) {
          return moveFocus(k);
        }
        paramInt = paramKeyEvent.isShiftPressed();
        if (paramInt != 0) {
          return moveFocus(m);
        }
        return false;
      }
    }
    this.activeThumbIdx = m;
    postInvalidate();
    return k;
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    this.isLongPress = false;
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt2 = this.widgetHeight;
    int i = this.labelBehavior;
    int j = 1;
    int k = 0;
    if (i != j)
    {
      boolean bool = shouldAlwaysShowLabel();
      if (!bool) {}
    }
    else
    {
      TooltipDrawable localTooltipDrawable = (TooltipDrawable)this.labels.get(0);
      k = localTooltipDrawable.getIntrinsicHeight();
    }
    paramInt2 = View.MeasureSpec.makeMeasureSpec(paramInt2 + k, 1073741824);
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (BaseSlider.SliderState)paramParcelable;
    Object localObject = paramParcelable.getSuperState();
    super.onRestoreInstanceState((Parcelable)localObject);
    float f = paramParcelable.valueFrom;
    this.valueFrom = f;
    f = paramParcelable.valueTo;
    this.valueTo = f;
    localObject = paramParcelable.values;
    setValuesInternal((ArrayList)localObject);
    f = paramParcelable.stepSize;
    this.stepSize = f;
    boolean bool = paramParcelable.hasFocus;
    if (bool) {
      requestFocus();
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    Object localObject = super.onSaveInstanceState();
    BaseSlider.SliderState localSliderState = new com/google/android/material/slider/BaseSlider$SliderState;
    localSliderState.<init>((Parcelable)localObject);
    float f = this.valueFrom;
    localSliderState.valueFrom = f;
    f = this.valueTo;
    localSliderState.valueTo = f;
    localObject = new java/util/ArrayList;
    ArrayList localArrayList = this.values;
    ((ArrayList)localObject).<init>(localArrayList);
    localSliderState.values = ((ArrayList)localObject);
    f = this.stepSize;
    localSliderState.stepSize = f;
    boolean bool = hasFocus();
    localSliderState.hasFocus = bool;
    return localSliderState;
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    updateTrackWidth(paramInt1);
    updateHaloHotspot();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = isEnabled();
    int m = 0;
    float f1 = 0.0F;
    if (!bool1) {
      return false;
    }
    float f2 = paramMotionEvent.getX();
    float f3 = this.trackSidePadding;
    f3 = f2 - f3;
    float f4 = this.trackWidth;
    f3 /= f4;
    this.touchPosition = f3;
    f3 = Math.max(0.0F, f3);
    this.touchPosition = f3;
    f3 = Math.min(1.0F, f3);
    this.touchPosition = f3;
    int n = paramMotionEvent.getActionMasked();
    int i2 = 1;
    f4 = 1.4E-45F;
    Object localObject;
    if (n != 0)
    {
      if (n != i2)
      {
        int i3 = 2;
        if (n != i3)
        {
          int i = 3;
          f2 = 4.203895E-045F;
          if (n != i) {
            break label499;
          }
        }
        else
        {
          boolean bool5 = this.thumbIsPressed;
          if (!bool5)
          {
            bool5 = isPotentialVerticalScroll(paramMotionEvent);
            if (bool5)
            {
              f3 = this.touchDownX;
              f2 = Math.abs(f2 - f3);
              int i1 = this.scaledTouchSlop;
              f3 = i1;
              bool2 = f2 < f3;
              if (bool2) {
                return false;
              }
            }
            localObject = getParent();
            ((ViewParent)localObject).requestDisallowInterceptTouchEvent(i2);
            onStartTrackingTouch();
          }
          boolean bool2 = pickActiveThumb();
          if (!bool2) {
            break label499;
          }
          this.thumbIsPressed = i2;
          snapTouchPosition();
          updateHaloHotspot();
          break label418;
        }
      }
      this.thumbIsPressed = false;
      localObject = this.lastEvent;
      if (localObject != null)
      {
        int j = ((MotionEvent)localObject).getActionMasked();
        if (j == 0)
        {
          localObject = this.lastEvent;
          f2 = ((MotionEvent)localObject).getX();
          f1 = paramMotionEvent.getX();
          f2 = Math.abs(f2 - f1);
          m = this.scaledTouchSlop;
          f1 = m;
          boolean bool3 = f2 < f1;
          if (!bool3)
          {
            localObject = this.lastEvent;
            f2 = ((MotionEvent)localObject).getY();
            f1 = paramMotionEvent.getY();
            f2 = Math.abs(f2 - f1);
            m = this.scaledTouchSlop;
            f1 = m;
            bool3 = f2 < f1;
            if (!bool3)
            {
              bool3 = pickActiveThumb();
              if (bool3) {
                onStartTrackingTouch();
              }
            }
          }
        }
      }
      int k = this.activeThumbIdx;
      m = -1;
      f1 = 0.0F / 0.0F;
      if (k != m)
      {
        snapTouchPosition();
        updateHaloHotspot();
        this.activeThumbIdx = m;
        onStopTrackingTouch();
      }
      label418:
      invalidate();
    }
    else
    {
      this.touchDownX = f2;
      bool4 = isPotentialVerticalScroll(paramMotionEvent);
      if (!bool4)
      {
        localObject = getParent();
        ((ViewParent)localObject).requestDisallowInterceptTouchEvent(i2);
        bool4 = pickActiveThumb();
        if (bool4)
        {
          requestFocus();
          this.thumbIsPressed = i2;
          snapTouchPosition();
          updateHaloHotspot();
          invalidate();
          onStartTrackingTouch();
        }
      }
    }
    label499:
    boolean bool4 = this.thumbIsPressed;
    setPressed(bool4);
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    this.lastEvent = paramMotionEvent;
    return i2;
  }
  
  public void onVisibilityChanged(View paramView, int paramInt)
  {
    super.onVisibilityChanged(paramView, paramInt);
    if (paramInt != 0)
    {
      paramView = ViewUtils.getContentViewOverlay(this);
      if (paramView == null) {
        return;
      }
      Iterator localIterator = this.labels.iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        TooltipDrawable localTooltipDrawable = (TooltipDrawable)localIterator.next();
        paramView.remove(localTooltipDrawable);
      }
    }
  }
  
  public boolean pickActiveThumb()
  {
    int i = this.activeThumbIdx;
    int j = 1;
    float f1 = 1.4E-45F;
    int k = -1;
    if (i != k) {
      return j;
    }
    float f2 = getValueOfTouchPositionAbsolute();
    float f3 = valueToX(f2);
    this.activeThumbIdx = 0;
    Float localFloat1 = (Float)this.values.get(0);
    float f4 = Math.abs(localFloat1.floatValue() - f2);
    int m = j;
    for (;;)
    {
      Object localObject = this.values;
      int i1 = ((ArrayList)localObject).size();
      if (m >= i1) {
        break;
      }
      localObject = (Float)this.values.get(m);
      float f5 = Math.abs(((Float)localObject).floatValue() - f2);
      Float localFloat2 = (Float)this.values.get(m);
      float f6 = localFloat2.floatValue();
      f6 = valueToX(f6);
      int i2 = Float.compare(f5, f4);
      if (i2 > j) {
        break;
      }
      boolean bool1 = isRtl();
      int i3 = 0;
      float f7 = 0.0F;
      if (bool1)
      {
        f8 = f6 - f3;
        bool1 = f8 < 0.0F;
        if (!bool1) {
          break label228;
        }
      }
      else
      {
        f8 = f6 - f3;
        bool1 = f8 < 0.0F;
        if (!bool1) {
          break label228;
        }
      }
      bool1 = j;
      float f8 = f1;
      break label234;
      label228:
      bool1 = false;
      f8 = 0.0F;
      label234:
      i3 = Float.compare(f5, f4);
      if (i3 < 0) {}
      for (;;)
      {
        this.activeThumbIdx = m;
        break;
        i3 = Float.compare(f5, f4);
        if (i3 != 0) {
          break label324;
        }
        f6 = Math.abs(f6 - f3);
        i3 = this.scaledTouchSlop;
        f7 = i3;
        boolean bool2 = f6 < f7;
        if (bool2)
        {
          this.activeThumbIdx = k;
          return false;
        }
        if (!bool1) {
          break label324;
        }
      }
      f4 = f5;
      label324:
      int n;
      m += 1;
    }
    i = this.activeThumbIdx;
    if (i == k)
    {
      j = 0;
      f1 = 0.0F;
    }
    return j;
  }
  
  public void removeOnChangeListener(BaseOnChangeListener paramBaseOnChangeListener)
  {
    this.changeListeners.remove(paramBaseOnChangeListener);
  }
  
  public void removeOnSliderTouchListener(BaseOnSliderTouchListener paramBaseOnSliderTouchListener)
  {
    this.touchListeners.remove(paramBaseOnSliderTouchListener);
  }
  
  public void setActiveThumbIndex(int paramInt)
  {
    this.activeThumbIdx = paramInt;
  }
  
  public void setCustomThumbDrawable(int paramInt)
  {
    Drawable localDrawable = getResources().getDrawable(paramInt);
    setCustomThumbDrawable(localDrawable);
  }
  
  public void setCustomThumbDrawable(Drawable paramDrawable)
  {
    paramDrawable = initializeCustomThumbDrawable(paramDrawable);
    this.customThumbDrawable = paramDrawable;
    this.customThumbDrawablesForValues.clear();
    postInvalidate();
  }
  
  public void setCustomThumbDrawablesForValues(int... paramVarArgs)
  {
    int i = paramVarArgs.length;
    Drawable[] arrayOfDrawable = new Drawable[i];
    int j = 0;
    for (;;)
    {
      int k = paramVarArgs.length;
      if (j >= k) {
        break;
      }
      Object localObject = getResources();
      int m = paramVarArgs[j];
      localObject = ((Resources)localObject).getDrawable(m);
      arrayOfDrawable[j] = localObject;
      j += 1;
    }
    setCustomThumbDrawablesForValues(arrayOfDrawable);
  }
  
  public void setCustomThumbDrawablesForValues(Drawable... paramVarArgs)
  {
    this.customThumbDrawable = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.customThumbDrawablesForValues = localArrayList;
    int i = paramVarArgs.length;
    int j = 0;
    while (j < i)
    {
      Drawable localDrawable = paramVarArgs[j];
      List localList = this.customThumbDrawablesForValues;
      localDrawable = initializeCustomThumbDrawable(localDrawable);
      localList.add(localDrawable);
      j += 1;
    }
    postInvalidate();
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    if (paramBoolean) {
      paramBoolean = false;
    } else {
      paramBoolean = true;
    }
    setLayerType(paramBoolean, null);
  }
  
  public void setFocusedThumbIndex(int paramInt)
  {
    if (paramInt >= 0)
    {
      localObject = this.values;
      int i = ((ArrayList)localObject).size();
      if (paramInt < i)
      {
        this.focusedThumbIdx = paramInt;
        this.accessibilityHelper.requestKeyboardFocusForVirtualView(paramInt);
        postInvalidate();
        return;
      }
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    Object localObject = m54207b69.F54207b69_11(">_36323D3D2B84363133883A448B3A4C40484B");
    localIllegalArgumentException.<init>((String)localObject);
    throw localIllegalArgumentException;
  }
  
  public void setHaloRadius(int paramInt)
  {
    int i = this.haloRadius;
    if (paramInt == i) {
      return;
    }
    this.haloRadius = paramInt;
    Object localObject = getBackground();
    boolean bool = shouldDrawCompatHalo();
    if (!bool)
    {
      bool = localObject instanceof RippleDrawable;
      if (bool)
      {
        localObject = (RippleDrawable)localObject;
        int j = this.haloRadius;
        DrawableUtils.setRippleDrawableRadius((RippleDrawable)localObject, j);
        return;
      }
    }
    postInvalidate();
  }
  
  public void setHaloRadiusResource(int paramInt)
  {
    paramInt = getResources().getDimensionPixelSize(paramInt);
    setHaloRadius(paramInt);
  }
  
  public void setHaloTintList(ColorStateList paramColorStateList)
  {
    Object localObject = this.haloColor;
    boolean bool1 = paramColorStateList.equals(localObject);
    if (bool1) {
      return;
    }
    this.haloColor = paramColorStateList;
    localObject = getBackground();
    boolean bool2 = shouldDrawCompatHalo();
    if (!bool2)
    {
      bool2 = localObject instanceof RippleDrawable;
      if (bool2)
      {
        ((RippleDrawable)localObject).setColor(paramColorStateList);
        return;
      }
    }
    localObject = this.haloPaint;
    int i = getColorForState(paramColorStateList);
    ((Paint)localObject).setColor(i);
    this.haloPaint.setAlpha(63);
    invalidate();
  }
  
  public void setLabelBehavior(int paramInt)
  {
    int i = this.labelBehavior;
    if (i != paramInt)
    {
      this.labelBehavior = paramInt;
      requestLayout();
    }
  }
  
  public void setLabelFormatter(LabelFormatter paramLabelFormatter)
  {
    this.formatter = paramLabelFormatter;
  }
  
  public void setSeparationUnit(int paramInt)
  {
    this.separationUnit = paramInt;
    this.dirtyConfig = true;
    postInvalidate();
  }
  
  public void setStepSize(float paramFloat)
  {
    float f = 0.0F;
    IllegalArgumentException localIllegalArgumentException = null;
    boolean bool1 = paramFloat < 0.0F;
    if (!bool1)
    {
      f = this.stepSize;
      bool1 = f < paramFloat;
      if (bool1)
      {
        this.stepSize = paramFloat;
        boolean bool2 = true;
        paramFloat = 1.4E-45F;
        this.dirtyConfig = bool2;
        postInvalidate();
      }
      return;
    }
    localIllegalArgumentException = new java/lang/IllegalArgumentException;
    Object localObject = Float.valueOf(paramFloat);
    Float localFloat1 = Float.valueOf(this.valueFrom);
    Float localFloat2 = Float.valueOf(this.valueTo);
    Object[] tmp83_80 = new Object[3];
    Object[] tmp84_83 = tmp83_80;
    Object[] tmp84_83 = tmp83_80;
    tmp84_83[0] = localObject;
    tmp84_83[1] = localFloat1;
    tmp84_83[2] = localFloat2;
    localObject = tmp84_83;
    localObject = String.format(m54207b69.F54207b69_11("dH1C212F6B3F41333F232A3C386C7A497078364F4E507D404480917E8343578648884F4B4E604C608F4F5792674C5A966D59556F60426F5D5C98A6759CA17B67637D6E5E6AA4B281A8B08373717B7A"), (Object[])localObject);
    localIllegalArgumentException.<init>((String)localObject);
    throw localIllegalArgumentException;
  }
  
  public void setThumbElevation(float paramFloat)
  {
    this.defaultThumbDrawable.setElevation(paramFloat);
  }
  
  public void setThumbElevationResource(int paramInt)
  {
    float f = getResources().getDimension(paramInt);
    setThumbElevation(f);
  }
  
  public void setThumbRadius(int paramInt)
  {
    int i = this.thumbRadius;
    if (paramInt == i) {
      return;
    }
    this.thumbRadius = paramInt;
    Object localObject1 = this.defaultThumbDrawable;
    Object localObject2 = ShapeAppearanceModel.builder();
    float f = this.thumbRadius;
    localObject2 = ((ShapeAppearanceModel.Builder)localObject2).setAllCorners(0, f).build();
    ((MaterialShapeDrawable)localObject1).setShapeAppearanceModel((ShapeAppearanceModel)localObject2);
    localObject1 = this.defaultThumbDrawable;
    i = this.thumbRadius;
    int j = i * 2;
    i *= 2;
    ((Drawable)localObject1).setBounds(0, 0, j, i);
    localObject1 = this.customThumbDrawable;
    if (localObject1 != null) {
      adjustCustomThumbDrawableBounds((Drawable)localObject1);
    }
    localObject1 = this.customThumbDrawablesForValues.iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject1).hasNext();
      if (!bool) {
        break;
      }
      localObject2 = (Drawable)((Iterator)localObject1).next();
      adjustCustomThumbDrawableBounds((Drawable)localObject2);
    }
    updateWidgetLayout();
  }
  
  public void setThumbRadiusResource(int paramInt)
  {
    paramInt = getResources().getDimensionPixelSize(paramInt);
    setThumbRadius(paramInt);
  }
  
  public void setThumbStrokeColor(ColorStateList paramColorStateList)
  {
    this.defaultThumbDrawable.setStrokeColor(paramColorStateList);
    postInvalidate();
  }
  
  public void setThumbStrokeColorResource(int paramInt)
  {
    if (paramInt != 0)
    {
      Context localContext = getContext();
      ColorStateList localColorStateList = AppCompatResources.OooO00o(localContext, paramInt);
      setThumbStrokeColor(localColorStateList);
    }
  }
  
  public void setThumbStrokeWidth(float paramFloat)
  {
    this.defaultThumbDrawable.setStrokeWidth(paramFloat);
    postInvalidate();
  }
  
  public void setThumbStrokeWidthResource(int paramInt)
  {
    if (paramInt != 0)
    {
      Resources localResources = getResources();
      float f = localResources.getDimension(paramInt);
      setThumbStrokeWidth(f);
    }
  }
  
  public void setThumbTintList(ColorStateList paramColorStateList)
  {
    ColorStateList localColorStateList = this.defaultThumbDrawable.getFillColor();
    boolean bool = paramColorStateList.equals(localColorStateList);
    if (bool) {
      return;
    }
    this.defaultThumbDrawable.setFillColor(paramColorStateList);
    invalidate();
  }
  
  public void setTickActiveRadius(int paramInt)
  {
    int i = this.tickActiveRadius;
    if (i != paramInt)
    {
      this.tickActiveRadius = paramInt;
      Paint localPaint = this.activeTicksPaint;
      paramInt *= 2;
      float f = paramInt;
      localPaint.setStrokeWidth(f);
      updateWidgetLayout();
    }
  }
  
  public void setTickActiveTintList(ColorStateList paramColorStateList)
  {
    Object localObject = this.tickColorActive;
    boolean bool = paramColorStateList.equals(localObject);
    if (bool) {
      return;
    }
    this.tickColorActive = paramColorStateList;
    localObject = this.activeTicksPaint;
    int i = getColorForState(paramColorStateList);
    ((Paint)localObject).setColor(i);
    invalidate();
  }
  
  public void setTickInactiveRadius(int paramInt)
  {
    int i = this.tickInactiveRadius;
    if (i != paramInt)
    {
      this.tickInactiveRadius = paramInt;
      Paint localPaint = this.inactiveTicksPaint;
      paramInt *= 2;
      float f = paramInt;
      localPaint.setStrokeWidth(f);
      updateWidgetLayout();
    }
  }
  
  public void setTickInactiveTintList(ColorStateList paramColorStateList)
  {
    Object localObject = this.tickColorInactive;
    boolean bool = paramColorStateList.equals(localObject);
    if (bool) {
      return;
    }
    this.tickColorInactive = paramColorStateList;
    localObject = this.inactiveTicksPaint;
    int i = getColorForState(paramColorStateList);
    ((Paint)localObject).setColor(i);
    invalidate();
  }
  
  public void setTickTintList(ColorStateList paramColorStateList)
  {
    setTickInactiveTintList(paramColorStateList);
    setTickActiveTintList(paramColorStateList);
  }
  
  public void setTickVisible(boolean paramBoolean)
  {
    boolean bool = this.tickVisible;
    if (bool != paramBoolean)
    {
      this.tickVisible = paramBoolean;
      postInvalidate();
    }
  }
  
  public void setTrackActiveTintList(ColorStateList paramColorStateList)
  {
    Object localObject = this.trackColorActive;
    boolean bool = paramColorStateList.equals(localObject);
    if (bool) {
      return;
    }
    this.trackColorActive = paramColorStateList;
    localObject = this.activeTrackPaint;
    int i = getColorForState(paramColorStateList);
    ((Paint)localObject).setColor(i);
    invalidate();
  }
  
  public void setTrackHeight(int paramInt)
  {
    int i = this.trackHeight;
    if (i != paramInt)
    {
      this.trackHeight = paramInt;
      invalidateTrack();
      updateWidgetLayout();
    }
  }
  
  public void setTrackInactiveTintList(ColorStateList paramColorStateList)
  {
    Object localObject = this.trackColorInactive;
    boolean bool = paramColorStateList.equals(localObject);
    if (bool) {
      return;
    }
    this.trackColorInactive = paramColorStateList;
    localObject = this.inactiveTrackPaint;
    int i = getColorForState(paramColorStateList);
    ((Paint)localObject).setColor(i);
    invalidate();
  }
  
  public void setTrackTintList(ColorStateList paramColorStateList)
  {
    setTrackInactiveTintList(paramColorStateList);
    setTrackActiveTintList(paramColorStateList);
  }
  
  public void setValueFrom(float paramFloat)
  {
    this.valueFrom = paramFloat;
    this.dirtyConfig = true;
    postInvalidate();
  }
  
  public void setValueTo(float paramFloat)
  {
    this.valueTo = paramFloat;
    this.dirtyConfig = true;
    postInvalidate();
  }
  
  public void setValues(List paramList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(paramList);
    setValuesInternal(localArrayList);
  }
  
  public void setValues(Float... paramVarArgs)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Collections.addAll(localArrayList, paramVarArgs);
    setValuesInternal(localArrayList);
  }
  
  public void updateBoundsForVirtualViewId(int paramInt, Rect paramRect)
  {
    int i = this.trackSidePadding;
    List localList = getValues();
    Float localFloat = (Float)localList.get(paramInt);
    float f1 = localFloat.floatValue();
    f1 = normalizeValue(f1);
    float f2 = this.trackWidth;
    f1 *= f2;
    paramInt = (int)f1;
    i += paramInt;
    paramInt = calculateTrackCenter();
    int j = this.thumbRadius;
    int k = this.minTouchTargetSize;
    if (j <= k) {
      j = k;
    }
    j /= 2;
    k = i - j;
    int m = paramInt - j;
    i += j;
    paramInt += j;
    paramRect.set(k, m, i, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.slider.BaseSlider
 * JD-Core Version:    0.7.0.1
 */
package com.google.android.material.card;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.id;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.CutCornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearanceModel.Builder;

class MaterialCardViewHelper
{
  private static final float CARD_VIEW_SHADOW_MULTIPLIER = 1.5F;
  private static final int CHECKED_ICON_LAYER_INDEX = 2;
  private static final Drawable CHECKED_ICON_NONE;
  private static final double COS_45 = 0.0D;
  public static final int DEFAULT_FADE_ANIM_DURATION = 300;
  private static final int DEFAULT_STROKE_VALUE = 255;
  private final MaterialShapeDrawable bgDrawable;
  private boolean checkable;
  private float checkedAnimationProgress;
  private Drawable checkedIcon;
  private int checkedIconGravity;
  private int checkedIconMargin;
  private int checkedIconSize;
  private ColorStateList checkedIconTint;
  private LayerDrawable clickableForegroundDrawable;
  private MaterialShapeDrawable compatRippleDrawable;
  private Drawable fgDrawable;
  private final MaterialShapeDrawable foregroundContentDrawable;
  private MaterialShapeDrawable foregroundShapeDrawable;
  private ValueAnimator iconAnimator;
  private final TimeInterpolator iconFadeAnimInterpolator;
  private final int iconFadeInAnimDuration;
  private final int iconFadeOutAnimDuration;
  private boolean isBackgroundOverwritten;
  private final MaterialCardView materialCardView;
  private ColorStateList rippleColor;
  private Drawable rippleDrawable;
  private ShapeAppearanceModel shapeAppearanceModel;
  private ColorStateList strokeColor;
  private int strokeWidth;
  private final Rect userContentPadding;
  
  static
  {
    double d = Math.cos(Math.toRadians(45.0D));
    COS_45 = d;
    int i = Build.VERSION.SDK_INT;
    int j = 28;
    ColorDrawable localColorDrawable;
    if (i <= j)
    {
      localColorDrawable = new android/graphics/drawable/ColorDrawable;
      localColorDrawable.<init>();
    }
    else
    {
      i = 0;
      localColorDrawable = null;
    }
    CHECKED_ICON_NONE = localColorDrawable;
  }
  
  public MaterialCardViewHelper(MaterialCardView paramMaterialCardView, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    Object localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    this.userContentPadding = ((Rect)localObject1);
    this.isBackgroundOverwritten = false;
    int i = 0;
    localObject1 = null;
    this.checkedAnimationProgress = 0.0F;
    this.materialCardView = paramMaterialCardView;
    Object localObject2 = new com/google/android/material/shape/MaterialShapeDrawable;
    Object localObject3 = paramMaterialCardView.getContext();
    ((MaterialShapeDrawable)localObject2).<init>((Context)localObject3, paramAttributeSet, paramInt1, paramInt2);
    this.bgDrawable = ((MaterialShapeDrawable)localObject2);
    Object localObject4 = paramMaterialCardView.getContext();
    ((MaterialShapeDrawable)localObject2).initializeElevationOverlay((Context)localObject4);
    paramInt2 = -12303292;
    ((MaterialShapeDrawable)localObject2).setShadowColor(paramInt2);
    localObject4 = ((MaterialShapeDrawable)localObject2).getShapeAppearanceModel().toBuilder();
    localObject2 = paramMaterialCardView.getContext();
    localObject3 = R.styleable.CardView;
    int j = R.style.CardView;
    paramAttributeSet = ((Context)localObject2).obtainStyledAttributes(paramAttributeSet, (int[])localObject3, paramInt1, j);
    paramInt1 = R.styleable.CardView_cardCornerRadius;
    paramInt1 = paramAttributeSet.hasValue(paramInt1);
    if (paramInt1 != 0)
    {
      paramInt1 = R.styleable.CardView_cardCornerRadius;
      float f = paramAttributeSet.getDimension(paramInt1, 0.0F);
      ((ShapeAppearanceModel.Builder)localObject4).setAllCornerSizes(f);
    }
    Object localObject5 = new com/google/android/material/shape/MaterialShapeDrawable;
    ((MaterialShapeDrawable)localObject5).<init>();
    this.foregroundContentDrawable = ((MaterialShapeDrawable)localObject5);
    localObject5 = ((ShapeAppearanceModel.Builder)localObject4).build();
    setShapeAppearanceModel((ShapeAppearanceModel)localObject5);
    localObject5 = paramMaterialCardView.getContext();
    paramInt2 = R.attr.motionEasingLinearInterpolator;
    localObject1 = AnimationUtils.LINEAR_INTERPOLATOR;
    localObject5 = MotionUtils.resolveThemeInterpolator((Context)localObject5, paramInt2, (TimeInterpolator)localObject1);
    this.iconFadeAnimInterpolator = ((TimeInterpolator)localObject5);
    localObject5 = paramMaterialCardView.getContext();
    paramInt2 = R.attr.motionDurationShort2;
    i = 300;
    paramInt1 = MotionUtils.resolveThemeDuration((Context)localObject5, paramInt2, i);
    this.iconFadeInAnimDuration = paramInt1;
    paramMaterialCardView = paramMaterialCardView.getContext();
    paramInt1 = R.attr.motionDurationShort1;
    int k = MotionUtils.resolveThemeDuration(paramMaterialCardView, paramInt1, i);
    this.iconFadeOutAnimDuration = k;
    paramAttributeSet.recycle();
  }
  
  private float calculateActualCornerPadding()
  {
    CornerTreatment localCornerTreatment1 = this.shapeAppearanceModel.getTopLeftCorner();
    float f1 = this.bgDrawable.getTopLeftCornerResolvedSize();
    float f2 = calculateCornerPaddingForCornerTreatment(localCornerTreatment1, f1);
    CornerTreatment localCornerTreatment2 = this.shapeAppearanceModel.getTopRightCorner();
    float f3 = this.bgDrawable.getTopRightCornerResolvedSize();
    f1 = calculateCornerPaddingForCornerTreatment(localCornerTreatment2, f3);
    f2 = Math.max(f2, f1);
    localCornerTreatment2 = this.shapeAppearanceModel.getBottomRightCorner();
    f3 = this.bgDrawable.getBottomRightCornerResolvedSize();
    f1 = calculateCornerPaddingForCornerTreatment(localCornerTreatment2, f3);
    CornerTreatment localCornerTreatment3 = this.shapeAppearanceModel.getBottomLeftCorner();
    float f4 = this.bgDrawable.getBottomLeftCornerResolvedSize();
    f3 = calculateCornerPaddingForCornerTreatment(localCornerTreatment3, f4);
    f1 = Math.max(f1, f3);
    return Math.max(f2, f1);
  }
  
  private float calculateCornerPaddingForCornerTreatment(CornerTreatment paramCornerTreatment, float paramFloat)
  {
    boolean bool1 = paramCornerTreatment instanceof RoundedCornerTreatment;
    if (bool1)
    {
      double d1 = COS_45;
      double d2 = 1.0D - d1;
      double d3 = paramFloat;
      return (float)(d2 * d3);
    }
    boolean bool2 = paramCornerTreatment instanceof CutCornerTreatment;
    if (bool2) {
      return paramFloat / 2.0F;
    }
    return 0.0F;
  }
  
  private float calculateHorizontalBackgroundPadding()
  {
    MaterialCardView localMaterialCardView = this.materialCardView;
    float f1 = localMaterialCardView.getMaxCardElevation();
    boolean bool = shouldAddCornerPaddingOutsideCardBackground();
    float f2;
    if (bool)
    {
      f2 = calculateActualCornerPadding();
    }
    else
    {
      bool = false;
      f2 = 0.0F;
    }
    return f1 + f2;
  }
  
  private float calculateVerticalBackgroundPadding()
  {
    MaterialCardView localMaterialCardView = this.materialCardView;
    float f1 = localMaterialCardView.getMaxCardElevation();
    float f2 = 1.5F;
    f1 *= f2;
    boolean bool = shouldAddCornerPaddingOutsideCardBackground();
    if (bool)
    {
      f2 = calculateActualCornerPadding();
    }
    else
    {
      bool = false;
      f2 = 0.0F;
    }
    return f1 + f2;
  }
  
  private boolean canClipToOutline()
  {
    MaterialShapeDrawable localMaterialShapeDrawable = this.bgDrawable;
    boolean bool = localMaterialShapeDrawable.isRoundRect();
    if (bool)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localMaterialShapeDrawable = null;
    }
    return bool;
  }
  
  private Drawable createCompatRippleDrawable()
  {
    StateListDrawable localStateListDrawable = new android/graphics/drawable/StateListDrawable;
    localStateListDrawable.<init>();
    Object localObject1 = createForegroundShapeDrawable();
    this.compatRippleDrawable = ((MaterialShapeDrawable)localObject1);
    Object localObject2 = this.rippleColor;
    ((MaterialShapeDrawable)localObject1).setFillColor((ColorStateList)localObject2);
    localObject1 = new int[] { 16842919 };
    localObject2 = this.compatRippleDrawable;
    localStateListDrawable.addState((int[])localObject1, (Drawable)localObject2);
    return localStateListDrawable;
  }
  
  private Drawable createForegroundRippleDrawable()
  {
    boolean bool = RippleUtils.USE_FRAMEWORK_RIPPLE;
    if (bool)
    {
      Object localObject = createForegroundShapeDrawable();
      this.foregroundShapeDrawable = ((MaterialShapeDrawable)localObject);
      localObject = new android/graphics/drawable/RippleDrawable;
      ColorStateList localColorStateList = this.rippleColor;
      MaterialShapeDrawable localMaterialShapeDrawable = this.foregroundShapeDrawable;
      ((RippleDrawable)localObject).<init>(localColorStateList, null, localMaterialShapeDrawable);
      return localObject;
    }
    return createCompatRippleDrawable();
  }
  
  private MaterialShapeDrawable createForegroundShapeDrawable()
  {
    MaterialShapeDrawable localMaterialShapeDrawable = new com/google/android/material/shape/MaterialShapeDrawable;
    ShapeAppearanceModel localShapeAppearanceModel = this.shapeAppearanceModel;
    localMaterialShapeDrawable.<init>(localShapeAppearanceModel);
    return localMaterialShapeDrawable;
  }
  
  private Drawable getClickableForeground()
  {
    Object localObject1 = this.rippleDrawable;
    if (localObject1 == null)
    {
      localObject1 = createForegroundRippleDrawable();
      this.rippleDrawable = ((Drawable)localObject1);
    }
    localObject1 = this.clickableForegroundDrawable;
    if (localObject1 == null)
    {
      localObject1 = new android/graphics/drawable/LayerDrawable;
      Drawable[] arrayOfDrawable = new Drawable[3];
      Object localObject2 = this.rippleDrawable;
      arrayOfDrawable[0] = localObject2;
      int i = 1;
      localObject2 = this.foregroundContentDrawable;
      arrayOfDrawable[i] = localObject2;
      Drawable localDrawable = this.checkedIcon;
      int j = 2;
      arrayOfDrawable[j] = localDrawable;
      ((LayerDrawable)localObject1).<init>(arrayOfDrawable);
      this.clickableForegroundDrawable = ((LayerDrawable)localObject1);
      int k = R.id.mtrl_card_checked_layer_id;
      ((LayerDrawable)localObject1).setId(j, k);
    }
    return this.clickableForegroundDrawable;
  }
  
  private float getParentCardViewCalculatedCornerPadding()
  {
    MaterialCardView localMaterialCardView = this.materialCardView;
    boolean bool = localMaterialCardView.getPreventCornerOverlap();
    if (bool)
    {
      localMaterialCardView = this.materialCardView;
      bool = localMaterialCardView.getUseCompatPadding();
      if (bool)
      {
        double d1 = COS_45;
        double d2 = 1.0D - d1;
        d1 = this.materialCardView.getCardViewRadius();
        return (float)(d2 * d1);
      }
    }
    return 0.0F;
  }
  
  private Drawable insetDrawable(Drawable paramDrawable)
  {
    Object localObject = this.materialCardView;
    boolean bool = ((CardView)localObject).getUseCompatPadding();
    float f1;
    int i;
    int k;
    int m;
    if (bool)
    {
      f1 = calculateVerticalBackgroundPadding();
      double d1 = Math.ceil(f1);
      i = (int)d1;
      float f2 = calculateHorizontalBackgroundPadding();
      double d2 = Math.ceil(f2);
      int j = (int)d2;
      k = i;
      m = j;
    }
    else
    {
      i = 0;
      f1 = 0.0F;
      localObject = null;
      m = 0;
      k = 0;
    }
    localObject = new com/google/android/material/card/MaterialCardViewHelper$1;
    ((MaterialCardViewHelper.1)localObject).<init>(this, paramDrawable, m, k, m, k);
    return localObject;
  }
  
  private boolean isCheckedIconBottom()
  {
    int i = this.checkedIconGravity;
    int j = 80;
    i &= j;
    if (i == j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  private boolean isCheckedIconEnd()
  {
    int i = this.checkedIconGravity;
    int j = 8388613;
    i &= j;
    if (i == j) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  private boolean shouldAddCornerPaddingInsideCardBackground()
  {
    MaterialCardView localMaterialCardView = this.materialCardView;
    boolean bool = localMaterialCardView.getPreventCornerOverlap();
    if (bool)
    {
      bool = canClipToOutline();
      if (!bool) {
        return true;
      }
    }
    bool = false;
    localMaterialCardView = null;
    return bool;
  }
  
  private boolean shouldAddCornerPaddingOutsideCardBackground()
  {
    MaterialCardView localMaterialCardView = this.materialCardView;
    boolean bool = localMaterialCardView.getPreventCornerOverlap();
    if (bool)
    {
      bool = canClipToOutline();
      if (bool)
      {
        localMaterialCardView = this.materialCardView;
        bool = localMaterialCardView.getUseCompatPadding();
        if (bool) {
          return true;
        }
      }
    }
    bool = false;
    localMaterialCardView = null;
    return bool;
  }
  
  private void updateInsetForeground(Drawable paramDrawable)
  {
    Object localObject = this.materialCardView.getForeground();
    boolean bool = localObject instanceof InsetDrawable;
    if (bool)
    {
      localObject = (InsetDrawable)this.materialCardView.getForeground();
      ((DrawableWrapper)localObject).setDrawable(paramDrawable);
    }
    else
    {
      localObject = this.materialCardView;
      paramDrawable = insetDrawable(paramDrawable);
      ((View)localObject).setForeground(paramDrawable);
    }
  }
  
  private void updateRippleColor()
  {
    boolean bool = RippleUtils.USE_FRAMEWORK_RIPPLE;
    ColorStateList localColorStateList;
    if (bool)
    {
      localObject = this.rippleDrawable;
      if (localObject != null)
      {
        localObject = (RippleDrawable)localObject;
        localColorStateList = this.rippleColor;
        ((RippleDrawable)localObject).setColor(localColorStateList);
        return;
      }
    }
    Object localObject = this.compatRippleDrawable;
    if (localObject != null)
    {
      localColorStateList = this.rippleColor;
      ((MaterialShapeDrawable)localObject).setFillColor(localColorStateList);
    }
  }
  
  public void animateCheckedIcon(boolean paramBoolean)
  {
    float f1 = 1.0F;
    float f2;
    if (paramBoolean)
    {
      f2 = f1;
    }
    else
    {
      f2 = 0.0F;
      localValueAnimator = null;
    }
    if (paramBoolean)
    {
      f3 = this.checkedAnimationProgress;
      f1 -= f3;
    }
    else
    {
      f1 = this.checkedAnimationProgress;
    }
    Object localObject = this.iconAnimator;
    if (localObject != null)
    {
      ((ValueAnimator)localObject).cancel();
      i = 0;
      f3 = 0.0F;
      localObject = null;
      this.iconAnimator = null;
    }
    int i = 2;
    float f3 = 2.802597E-045F;
    localObject = new float[i];
    float f4 = this.checkedAnimationProgress;
    localObject[0] = f4;
    int j = 1;
    localObject[j] = f2;
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat((float[])localObject);
    this.iconAnimator = localValueAnimator;
    localObject = new com/google/android/material/card/OooO00o;
    ((OooO00o)localObject).<init>(this);
    localValueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject);
    localValueAnimator = this.iconAnimator;
    localObject = this.iconFadeAnimInterpolator;
    localValueAnimator.setInterpolator((TimeInterpolator)localObject);
    localValueAnimator = this.iconAnimator;
    if (paramBoolean) {
      paramBoolean = this.iconFadeInAnimDuration;
    } else {
      paramBoolean = this.iconFadeOutAnimDuration;
    }
    long l = (paramBoolean * f1);
    localValueAnimator.setDuration(l);
    this.iconAnimator.start();
  }
  
  public void forceRippleRedraw()
  {
    Object localObject = this.rippleDrawable;
    if (localObject != null)
    {
      localObject = ((Drawable)localObject).getBounds();
      int i = ((Rect)localObject).bottom;
      Drawable localDrawable = this.rippleDrawable;
      int j = ((Rect)localObject).left;
      int k = ((Rect)localObject).top;
      int m = ((Rect)localObject).right;
      int n = i + -1;
      localDrawable.setBounds(j, k, m, n);
      localDrawable = this.rippleDrawable;
      j = ((Rect)localObject).left;
      k = ((Rect)localObject).top;
      int i1 = ((Rect)localObject).right;
      localDrawable.setBounds(j, k, i1, i);
    }
  }
  
  public MaterialShapeDrawable getBackground()
  {
    return this.bgDrawable;
  }
  
  public ColorStateList getCardBackgroundColor()
  {
    return this.bgDrawable.getFillColor();
  }
  
  public ColorStateList getCardForegroundColor()
  {
    return this.foregroundContentDrawable.getFillColor();
  }
  
  public Drawable getCheckedIcon()
  {
    return this.checkedIcon;
  }
  
  public int getCheckedIconGravity()
  {
    return this.checkedIconGravity;
  }
  
  public int getCheckedIconMargin()
  {
    return this.checkedIconMargin;
  }
  
  public int getCheckedIconSize()
  {
    return this.checkedIconSize;
  }
  
  public ColorStateList getCheckedIconTint()
  {
    return this.checkedIconTint;
  }
  
  public float getCornerRadius()
  {
    return this.bgDrawable.getTopLeftCornerResolvedSize();
  }
  
  public float getProgress()
  {
    return this.bgDrawable.getInterpolation();
  }
  
  public ColorStateList getRippleColor()
  {
    return this.rippleColor;
  }
  
  public ShapeAppearanceModel getShapeAppearanceModel()
  {
    return this.shapeAppearanceModel;
  }
  
  public int getStrokeColor()
  {
    ColorStateList localColorStateList = this.strokeColor;
    int i;
    if (localColorStateList == null) {
      i = -1;
    } else {
      i = localColorStateList.getDefaultColor();
    }
    return i;
  }
  
  public ColorStateList getStrokeColorStateList()
  {
    return this.strokeColor;
  }
  
  public int getStrokeWidth()
  {
    return this.strokeWidth;
  }
  
  public Rect getUserContentPadding()
  {
    return this.userContentPadding;
  }
  
  public boolean isBackgroundOverwritten()
  {
    return this.isBackgroundOverwritten;
  }
  
  public boolean isCheckable()
  {
    return this.checkable;
  }
  
  public void loadFromAttributes(TypedArray paramTypedArray)
  {
    Object localObject = this.materialCardView.getContext();
    int i = R.styleable.MaterialCardView_strokeColor;
    localObject = MaterialResources.getColorStateList((Context)localObject, paramTypedArray, i);
    this.strokeColor = ((ColorStateList)localObject);
    if (localObject == null)
    {
      j = -1;
      localObject = ColorStateList.valueOf(j);
      this.strokeColor = ((ColorStateList)localObject);
    }
    int j = R.styleable.MaterialCardView_strokeWidth;
    j = paramTypedArray.getDimensionPixelSize(j, 0);
    this.strokeWidth = j;
    j = R.styleable.MaterialCardView_android_checkable;
    boolean bool1 = paramTypedArray.getBoolean(j, false);
    this.checkable = bool1;
    MaterialCardView localMaterialCardView = this.materialCardView;
    localMaterialCardView.setLongClickable(bool1);
    localObject = this.materialCardView.getContext();
    int m = R.styleable.MaterialCardView_checkedIconTint;
    localObject = MaterialResources.getColorStateList((Context)localObject, paramTypedArray, m);
    this.checkedIconTint = ((ColorStateList)localObject);
    localObject = this.materialCardView.getContext();
    m = R.styleable.MaterialCardView_checkedIcon;
    localObject = MaterialResources.getDrawable((Context)localObject, paramTypedArray, m);
    setCheckedIcon((Drawable)localObject);
    int k = R.styleable.MaterialCardView_checkedIconSize;
    k = paramTypedArray.getDimensionPixelSize(k, 0);
    setCheckedIconSize(k);
    k = R.styleable.MaterialCardView_checkedIconMargin;
    k = paramTypedArray.getDimensionPixelSize(k, 0);
    setCheckedIconMargin(k);
    k = R.styleable.MaterialCardView_checkedIconGravity;
    k = paramTypedArray.getInteger(k, 8388661);
    this.checkedIconGravity = k;
    localObject = this.materialCardView.getContext();
    i = R.styleable.MaterialCardView_rippleColor;
    localObject = MaterialResources.getColorStateList((Context)localObject, paramTypedArray, i);
    this.rippleColor = ((ColorStateList)localObject);
    if (localObject == null)
    {
      localObject = this.materialCardView;
      i = R.attr.colorControlHighlight;
      k = MaterialColors.getColor((View)localObject, i);
      localObject = ColorStateList.valueOf(k);
      this.rippleColor = ((ColorStateList)localObject);
    }
    localObject = this.materialCardView.getContext();
    i = R.styleable.MaterialCardView_cardForegroundColor;
    paramTypedArray = MaterialResources.getColorStateList((Context)localObject, paramTypedArray, i);
    setCardForegroundColor(paramTypedArray);
    updateRippleColor();
    updateElevation();
    updateStroke();
    paramTypedArray = this.materialCardView;
    localObject = this.bgDrawable;
    localObject = insetDrawable((Drawable)localObject);
    paramTypedArray.setBackgroundInternal((Drawable)localObject);
    paramTypedArray = this.materialCardView;
    boolean bool2 = paramTypedArray.isClickable();
    if (bool2) {
      paramTypedArray = getClickableForeground();
    } else {
      paramTypedArray = this.foregroundContentDrawable;
    }
    this.fgDrawable = paramTypedArray;
    localObject = this.materialCardView;
    paramTypedArray = insetDrawable(paramTypedArray);
    ((View)localObject).setForeground(paramTypedArray);
  }
  
  public void recalculateCheckedIconPosition(int paramInt1, int paramInt2)
  {
    Object localObject = this.clickableForegroundDrawable;
    if (localObject != null)
    {
      localObject = this.materialCardView;
      boolean bool1 = ((CardView)localObject).getUseCompatPadding();
      float f2;
      int j;
      if (bool1)
      {
        f1 = calculateVerticalBackgroundPadding();
        f2 = 2.0F;
        f1 *= f2;
        double d1 = Math.ceil(f1);
        i = (int)d1;
        float f3 = calculateHorizontalBackgroundPadding() * f2;
        double d2 = Math.ceil(f3);
        j = (int)d2;
      }
      else
      {
        i = 0;
        f1 = 0.0F;
        localObject = null;
        j = 0;
        f2 = 0.0F;
      }
      boolean bool3 = isCheckedIconEnd();
      int m;
      if (bool3)
      {
        m = this.checkedIconMargin;
        m = paramInt1 - m;
        int n = this.checkedIconSize;
        m = m - n - j;
      }
      else
      {
        m = this.checkedIconMargin;
      }
      boolean bool4 = isCheckedIconBottom();
      int i1;
      if (bool4)
      {
        i1 = this.checkedIconMargin;
      }
      else
      {
        i1 = this.checkedIconMargin;
        i1 = paramInt2 - i1;
        int i3 = this.checkedIconSize;
        i1 = i1 - i3 - i;
      }
      int i4 = i1;
      boolean bool5 = isCheckedIconEnd();
      if (bool5)
      {
        paramInt1 = this.checkedIconMargin;
      }
      else
      {
        int i2 = this.checkedIconMargin;
        paramInt1 -= i2;
        i2 = this.checkedIconSize;
        paramInt1 = paramInt1 - i2 - j;
      }
      boolean bool2 = isCheckedIconBottom();
      if (bool2)
      {
        int k = this.checkedIconMargin;
        paramInt2 -= k;
        k = this.checkedIconSize;
        paramInt2 = paramInt2 - k - i;
      }
      else
      {
        paramInt2 = this.checkedIconMargin;
      }
      int i5 = paramInt2;
      MaterialCardView localMaterialCardView = this.materialCardView;
      paramInt2 = ViewCompat.OooOoOO(localMaterialCardView);
      int i = 1;
      float f1 = 1.4E-45F;
      int i6;
      int i7;
      if (paramInt2 == i)
      {
        i6 = paramInt1;
        i7 = m;
      }
      else
      {
        i7 = paramInt1;
        i6 = m;
      }
      LayerDrawable localLayerDrawable = this.clickableForegroundDrawable;
      int i8 = 2;
      localLayerDrawable.setLayerInset(i8, i6, i5, i7, i4);
    }
  }
  
  public void setBackgroundOverwritten(boolean paramBoolean)
  {
    this.isBackgroundOverwritten = paramBoolean;
  }
  
  public void setCardBackgroundColor(ColorStateList paramColorStateList)
  {
    this.bgDrawable.setFillColor(paramColorStateList);
  }
  
  public void setCardForegroundColor(ColorStateList paramColorStateList)
  {
    MaterialShapeDrawable localMaterialShapeDrawable = this.foregroundContentDrawable;
    if (paramColorStateList == null) {
      paramColorStateList = ColorStateList.valueOf(0);
    }
    localMaterialShapeDrawable.setFillColor(paramColorStateList);
  }
  
  public void setCheckable(boolean paramBoolean)
  {
    this.checkable = paramBoolean;
  }
  
  public void setChecked(boolean paramBoolean)
  {
    setChecked(paramBoolean, false);
  }
  
  public void setChecked(boolean paramBoolean1, boolean paramBoolean2)
  {
    Drawable localDrawable = this.checkedIcon;
    if (localDrawable != null) {
      if (paramBoolean2)
      {
        animateCheckedIcon(paramBoolean1);
      }
      else
      {
        if (paramBoolean1) {
          paramBoolean2 = true;
        } else {
          paramBoolean2 = false;
        }
        localDrawable.setAlpha(paramBoolean2);
        float f;
        if (paramBoolean1)
        {
          paramBoolean1 = 1065353216;
          f = 1.0F;
        }
        else
        {
          paramBoolean1 = false;
          f = 0.0F;
        }
        this.checkedAnimationProgress = f;
      }
    }
  }
  
  public void setCheckedIcon(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      paramDrawable = DrawableCompat.OooOOo(paramDrawable).mutate();
      this.checkedIcon = paramDrawable;
      ColorStateList localColorStateList = this.checkedIconTint;
      DrawableCompat.OooOOOO(paramDrawable, localColorStateList);
      paramDrawable = this.materialCardView;
      boolean bool = paramDrawable.isChecked();
      setChecked(bool);
    }
    else
    {
      paramDrawable = CHECKED_ICON_NONE;
      this.checkedIcon = paramDrawable;
    }
    paramDrawable = this.clickableForegroundDrawable;
    if (paramDrawable != null)
    {
      int i = R.id.mtrl_card_checked_layer_id;
      Drawable localDrawable = this.checkedIcon;
      paramDrawable.setDrawableByLayerId(i, localDrawable);
    }
  }
  
  public void setCheckedIconGravity(int paramInt)
  {
    this.checkedIconGravity = paramInt;
    paramInt = this.materialCardView.getMeasuredWidth();
    int i = this.materialCardView.getMeasuredHeight();
    recalculateCheckedIconPosition(paramInt, i);
  }
  
  public void setCheckedIconMargin(int paramInt)
  {
    this.checkedIconMargin = paramInt;
  }
  
  public void setCheckedIconSize(int paramInt)
  {
    this.checkedIconSize = paramInt;
  }
  
  public void setCheckedIconTint(ColorStateList paramColorStateList)
  {
    this.checkedIconTint = paramColorStateList;
    Drawable localDrawable = this.checkedIcon;
    if (localDrawable != null) {
      DrawableCompat.OooOOOO(localDrawable, paramColorStateList);
    }
  }
  
  public void setCornerRadius(float paramFloat)
  {
    ShapeAppearanceModel localShapeAppearanceModel = this.shapeAppearanceModel;
    Object localObject = localShapeAppearanceModel.withCornerSize(paramFloat);
    setShapeAppearanceModel((ShapeAppearanceModel)localObject);
    localObject = this.fgDrawable;
    ((Drawable)localObject).invalidateSelf();
    boolean bool = shouldAddCornerPaddingOutsideCardBackground();
    if (!bool)
    {
      bool = shouldAddCornerPaddingInsideCardBackground();
      if (!bool) {}
    }
    else
    {
      updateContentPadding();
    }
    bool = shouldAddCornerPaddingOutsideCardBackground();
    if (bool) {
      updateInsets();
    }
  }
  
  public void setProgress(float paramFloat)
  {
    this.bgDrawable.setInterpolation(paramFloat);
    MaterialShapeDrawable localMaterialShapeDrawable = this.foregroundContentDrawable;
    if (localMaterialShapeDrawable != null) {
      localMaterialShapeDrawable.setInterpolation(paramFloat);
    }
    localMaterialShapeDrawable = this.foregroundShapeDrawable;
    if (localMaterialShapeDrawable != null) {
      localMaterialShapeDrawable.setInterpolation(paramFloat);
    }
  }
  
  public void setRippleColor(ColorStateList paramColorStateList)
  {
    this.rippleColor = paramColorStateList;
    updateRippleColor();
  }
  
  public void setShapeAppearanceModel(ShapeAppearanceModel paramShapeAppearanceModel)
  {
    this.shapeAppearanceModel = paramShapeAppearanceModel;
    this.bgDrawable.setShapeAppearanceModel(paramShapeAppearanceModel);
    MaterialShapeDrawable localMaterialShapeDrawable = this.bgDrawable;
    boolean bool = localMaterialShapeDrawable.isRoundRect() ^ true;
    localMaterialShapeDrawable.setShadowBitmapDrawingEnable(bool);
    localMaterialShapeDrawable = this.foregroundContentDrawable;
    if (localMaterialShapeDrawable != null) {
      localMaterialShapeDrawable.setShapeAppearanceModel(paramShapeAppearanceModel);
    }
    localMaterialShapeDrawable = this.foregroundShapeDrawable;
    if (localMaterialShapeDrawable != null) {
      localMaterialShapeDrawable.setShapeAppearanceModel(paramShapeAppearanceModel);
    }
    localMaterialShapeDrawable = this.compatRippleDrawable;
    if (localMaterialShapeDrawable != null) {
      localMaterialShapeDrawable.setShapeAppearanceModel(paramShapeAppearanceModel);
    }
  }
  
  public void setStrokeColor(ColorStateList paramColorStateList)
  {
    ColorStateList localColorStateList = this.strokeColor;
    if (localColorStateList == paramColorStateList) {
      return;
    }
    this.strokeColor = paramColorStateList;
    updateStroke();
  }
  
  public void setStrokeWidth(int paramInt)
  {
    int i = this.strokeWidth;
    if (paramInt == i) {
      return;
    }
    this.strokeWidth = paramInt;
    updateStroke();
  }
  
  public void setUserContentPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.userContentPadding.set(paramInt1, paramInt2, paramInt3, paramInt4);
    updateContentPadding();
  }
  
  public void updateClickable()
  {
    Drawable localDrawable = this.fgDrawable;
    Object localObject = this.materialCardView;
    boolean bool = ((View)localObject).isClickable();
    if (bool) {
      localObject = getClickableForeground();
    } else {
      localObject = this.foregroundContentDrawable;
    }
    this.fgDrawable = ((Drawable)localObject);
    if (localDrawable != localObject) {
      updateInsetForeground((Drawable)localObject);
    }
  }
  
  public void updateContentPadding()
  {
    boolean bool = shouldAddCornerPaddingInsideCardBackground();
    if (!bool)
    {
      bool = shouldAddCornerPaddingOutsideCardBackground();
      if (!bool)
      {
        bool = false;
        f1 = 0.0F;
        break label34;
      }
    }
    bool = true;
    float f1 = 1.4E-45F;
    label34:
    if (bool)
    {
      f1 = calculateActualCornerPadding();
    }
    else
    {
      bool = false;
      f1 = 0.0F;
    }
    float f2 = getParentCardViewCalculatedCornerPadding();
    int i = (int)(f1 - f2);
    MaterialCardView localMaterialCardView = this.materialCardView;
    Rect localRect = this.userContentPadding;
    int j = localRect.left + i;
    int k = localRect.top + i;
    int m = localRect.right + i;
    int n = localRect.bottom + i;
    localMaterialCardView.setAncestorContentPadding(j, k, m, n);
  }
  
  public void updateElevation()
  {
    MaterialShapeDrawable localMaterialShapeDrawable = this.bgDrawable;
    float f = this.materialCardView.getCardElevation();
    localMaterialShapeDrawable.setElevation(f);
  }
  
  public void updateInsets()
  {
    boolean bool = isBackgroundOverwritten();
    if (!bool)
    {
      localMaterialCardView = this.materialCardView;
      localObject = this.bgDrawable;
      localObject = insetDrawable((Drawable)localObject);
      localMaterialCardView.setBackgroundInternal((Drawable)localObject);
    }
    MaterialCardView localMaterialCardView = this.materialCardView;
    Object localObject = this.fgDrawable;
    localObject = insetDrawable((Drawable)localObject);
    localMaterialCardView.setForeground((Drawable)localObject);
  }
  
  public void updateStroke()
  {
    MaterialShapeDrawable localMaterialShapeDrawable = this.foregroundContentDrawable;
    float f = this.strokeWidth;
    ColorStateList localColorStateList = this.strokeColor;
    localMaterialShapeDrawable.setStroke(f, localColorStateList);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.card.MaterialCardViewHelper
 * JD-Core Version:    0.7.0.1
 */
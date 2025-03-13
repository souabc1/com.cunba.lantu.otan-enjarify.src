package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStructure;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Fade;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import com.google.android.material.R.attr;
import com.google.android.material.R.color;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.R.string;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearanceModel.Builder;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m54207b69;

public class TextInputLayout
  extends LinearLayout
{
  public static final int BOX_BACKGROUND_FILLED = 1;
  public static final int BOX_BACKGROUND_NONE = 0;
  public static final int BOX_BACKGROUND_OUTLINE = 2;
  private static final int DEFAULT_PLACEHOLDER_FADE_DURATION = 87;
  private static final int DEF_STYLE_RES = R.style.Widget_Design_TextInputLayout;
  private static final int[][] EDIT_TEXT_BACKGROUND_RIPPLE_STATE;
  public static final int END_ICON_CLEAR_TEXT = 2;
  public static final int END_ICON_CUSTOM = 255;
  public static final int END_ICON_DROPDOWN_MENU = 3;
  public static final int END_ICON_NONE = 0;
  public static final int END_ICON_PASSWORD_TOGGLE = 1;
  private static final int INVALID_MAX_LENGTH = 255;
  private static final int LABEL_SCALE_ANIMATION_DURATION = 167;
  private static final String LOG_TAG = "TextInputLayout";
  private static final int NO_WIDTH = 255;
  private static final int PLACEHOLDER_START_DELAY = 67;
  private ValueAnimator animator;
  private boolean areCornerRadiiRtl;
  private MaterialShapeDrawable boxBackground;
  private boolean boxBackgroundApplied;
  private int boxBackgroundColor;
  private int boxBackgroundMode;
  private int boxCollapsedPaddingTopPx;
  private final int boxLabelCutoutPaddingPx;
  private int boxStrokeColor;
  private int boxStrokeWidthDefaultPx;
  private int boxStrokeWidthFocusedPx;
  private int boxStrokeWidthPx;
  private MaterialShapeDrawable boxUnderlineDefault;
  private MaterialShapeDrawable boxUnderlineFocused;
  final CollapsingTextHelper collapsingTextHelper;
  boolean counterEnabled;
  private int counterMaxLength;
  private int counterOverflowTextAppearance;
  private ColorStateList counterOverflowTextColor;
  private boolean counterOverflowed;
  private int counterTextAppearance;
  private ColorStateList counterTextColor;
  private TextView counterView;
  private int defaultFilledBackgroundColor;
  private ColorStateList defaultHintTextColor;
  private int defaultStrokeColor;
  private int disabledColor;
  private int disabledFilledBackgroundColor;
  EditText editText;
  private final LinkedHashSet editTextAttachedListeners;
  private Drawable endDummyDrawable;
  private int endDummyDrawableWidth;
  private final EndCompoundLayout endLayout;
  private boolean expandedHintEnabled;
  private StateListDrawable filledDropDownMenuBackground;
  private int focusedFilledBackgroundColor;
  private int focusedStrokeColor;
  private ColorStateList focusedTextColor;
  private CharSequence hint;
  private boolean hintAnimationEnabled;
  private boolean hintEnabled;
  private boolean hintExpanded;
  private int hoveredFilledBackgroundColor;
  private int hoveredStrokeColor;
  private boolean inDrawableStateChanged;
  private final IndicatorViewController indicatorViewController;
  private final FrameLayout inputFrame;
  private boolean isProvidingHint;
  private TextInputLayout.LengthCounter lengthCounter;
  private int maxEms;
  private int maxWidth;
  private int minEms;
  private int minWidth;
  private Drawable originalEditTextEndDrawable;
  private CharSequence originalHint;
  private MaterialShapeDrawable outlinedDropDownMenuBackground;
  private boolean placeholderEnabled;
  private Fade placeholderFadeIn;
  private Fade placeholderFadeOut;
  private CharSequence placeholderText;
  private int placeholderTextAppearance;
  private ColorStateList placeholderTextColor;
  private TextView placeholderTextView;
  private boolean restoringSavedState;
  private ShapeAppearanceModel shapeAppearanceModel;
  private Drawable startDummyDrawable;
  private int startDummyDrawableWidth;
  private final StartCompoundLayout startLayout;
  private ColorStateList strokeErrorColor;
  private final Rect tmpBoundsRect;
  private final Rect tmpRect;
  private final RectF tmpRectF;
  private Typeface typeface;
  
  static
  {
    int[][] arrayOfInt = new int[2][];
    int[] arrayOfInt1 = { 16842919 };
    arrayOfInt[0] = arrayOfInt1;
    int[] arrayOfInt2 = new int[0];
    arrayOfInt[1] = arrayOfInt2;
    EDIT_TEXT_BACKGROUND_RIPPLE_STATE = arrayOfInt;
  }
  
  public TextInputLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TextInputLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public TextInputLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super((Context)localObject2, paramAttributeSet, paramInt);
    int m = -1;
    this.minEms = m;
    this.maxEms = m;
    this.minWidth = m;
    this.maxWidth = m;
    localObject2 = new com/google/android/material/textfield/IndicatorViewController;
    ((IndicatorViewController)localObject2).<init>(this);
    this.indicatorViewController = ((IndicatorViewController)localObject2);
    localObject2 = new com/google/android/material/textfield/o000oOoO;
    ((o000oOoO)localObject2).<init>();
    this.lengthCounter = ((TextInputLayout.LengthCounter)localObject2);
    localObject2 = new android/graphics/Rect;
    ((Rect)localObject2).<init>();
    this.tmpRect = ((Rect)localObject2);
    localObject2 = new android/graphics/Rect;
    ((Rect)localObject2).<init>();
    this.tmpBoundsRect = ((Rect)localObject2);
    localObject2 = new android/graphics/RectF;
    ((RectF)localObject2).<init>();
    this.tmpRectF = ((RectF)localObject2);
    localObject2 = new java/util/LinkedHashSet;
    ((LinkedHashSet)localObject2).<init>();
    this.editTextAttachedListeners = ((LinkedHashSet)localObject2);
    localObject2 = new com/google/android/material/internal/CollapsingTextHelper;
    ((CollapsingTextHelper)localObject2).<init>(this);
    this.collapsingTextHelper = ((CollapsingTextHelper)localObject2);
    Context localContext = getContext();
    int n = 1;
    setOrientation(n);
    int i2 = 0;
    setWillNotDraw(false);
    setAddStatesFromChildren(n);
    FrameLayout localFrameLayout = new android/widget/FrameLayout;
    localFrameLayout.<init>(localContext);
    this.inputFrame = localFrameLayout;
    localFrameLayout.setAddStatesFromChildren(n);
    Object localObject3 = AnimationUtils.LINEAR_INTERPOLATOR;
    ((CollapsingTextHelper)localObject2).setTextSizeInterpolator((TimeInterpolator)localObject3);
    ((CollapsingTextHelper)localObject2).setPositionInterpolator((TimeInterpolator)localObject3);
    ((CollapsingTextHelper)localObject2).setCollapsedTextGravity(8388659);
    Object localObject4 = R.styleable.TextInputLayout;
    int i3 = R.styleable.TextInputLayout_counterTextAppearance;
    int i4 = R.styleable.TextInputLayout_counterOverflowTextAppearance;
    int i5 = R.styleable.TextInputLayout_errorTextAppearance;
    int i7 = R.styleable.TextInputLayout_helperTextTextAppearance;
    int i8 = R.styleable.TextInputLayout_hintTextAppearance;
    int[] tmp289_287 = new int[5];
    int[] tmp290_289 = tmp289_287;
    int[] tmp290_289 = tmp289_287;
    tmp290_289[0] = i3;
    tmp290_289[1] = i4;
    int[] tmp299_290 = tmp290_289;
    int[] tmp299_290 = tmp290_289;
    tmp299_290[2] = i5;
    tmp299_290[3] = i7;
    tmp299_290[4] = i8;
    int[] arrayOfInt = tmp299_290;
    localObject2 = localContext;
    localObject3 = paramAttributeSet;
    i5 = paramInt;
    i7 = j;
    localObject2 = ThemeEnforcement.obtainTintedStyledAttributes(localContext, paramAttributeSet, (int[])localObject4, paramInt, j, arrayOfInt);
    localObject3 = new com/google/android/material/textfield/StartCompoundLayout;
    ((StartCompoundLayout)localObject3).<init>(this, (TintTypedArray)localObject2);
    this.startLayout = ((StartCompoundLayout)localObject3);
    int i9 = R.styleable.TextInputLayout_hintEnabled;
    boolean bool7 = ((TintTypedArray)localObject2).OooO00o(i9, n);
    this.hintEnabled = bool7;
    int i10 = R.styleable.TextInputLayout_android_hint;
    localObject4 = ((TintTypedArray)localObject2).getText(i10);
    setHint((CharSequence)localObject4);
    i10 = R.styleable.TextInputLayout_hintAnimationEnabled;
    boolean bool8 = ((TintTypedArray)localObject2).OooO00o(i10, n);
    this.hintAnimationEnabled = bool8;
    int i11 = R.styleable.TextInputLayout_expandedHintEnabled;
    boolean bool9 = ((TintTypedArray)localObject2).OooO00o(i11, n);
    this.expandedHintEnabled = bool9;
    int i12 = R.styleable.TextInputLayout_android_minEms;
    boolean bool10 = ((TintTypedArray)localObject2).OooOO0o(i12);
    int i13;
    if (bool10)
    {
      i13 = R.styleable.TextInputLayout_android_minEms;
      i13 = ((TintTypedArray)localObject2).OooO0oo(i13, m);
      setMinEms(i13);
    }
    else
    {
      i13 = R.styleable.TextInputLayout_android_minWidth;
      boolean bool11 = ((TintTypedArray)localObject2).OooOO0o(i13);
      if (bool11)
      {
        i14 = R.styleable.TextInputLayout_android_minWidth;
        i14 = ((TintTypedArray)localObject2).OooO0o0(i14, m);
        setMinWidth(i14);
      }
    }
    int i14 = R.styleable.TextInputLayout_android_maxEms;
    boolean bool12 = ((TintTypedArray)localObject2).OooOO0o(i14);
    int i15;
    if (bool12)
    {
      i15 = R.styleable.TextInputLayout_android_maxEms;
      i15 = ((TintTypedArray)localObject2).OooO0oo(i15, m);
      localTextInputLayout.setMaxEms(i15);
    }
    else
    {
      i15 = R.styleable.TextInputLayout_android_maxWidth;
      boolean bool13 = ((TintTypedArray)localObject2).OooOO0o(i15);
      if (bool13)
      {
        i16 = R.styleable.TextInputLayout_android_maxWidth;
        i16 = ((TintTypedArray)localObject2).OooO0o0(i16, m);
        localTextInputLayout.setMaxWidth(i16);
      }
    }
    localObject4 = ShapeAppearanceModel.builder(localContext, (AttributeSet)localObject1, i, j).build();
    localTextInputLayout.shapeAppearanceModel = ((ShapeAppearanceModel)localObject4);
    localObject4 = localContext.getResources();
    i5 = R.dimen.mtrl_textinput_box_label_cutout_padding;
    int i16 = ((Resources)localObject4).getDimensionPixelOffset(i5);
    localTextInputLayout.boxLabelCutoutPaddingPx = i16;
    i16 = R.styleable.TextInputLayout_boxCollapsedPaddingTop;
    i16 = ((TintTypedArray)localObject2).OooO0Oo(i16, 0);
    localTextInputLayout.boxCollapsedPaddingTopPx = i16;
    i16 = R.styleable.TextInputLayout_boxStrokeWidth;
    Object localObject5 = localContext.getResources();
    i7 = R.dimen.mtrl_textinput_box_stroke_width_default;
    i5 = ((Resources)localObject5).getDimensionPixelSize(i7);
    i16 = ((TintTypedArray)localObject2).OooO0o0(i16, i5);
    localTextInputLayout.boxStrokeWidthDefaultPx = i16;
    i16 = R.styleable.TextInputLayout_boxStrokeWidthFocused;
    localObject5 = localContext.getResources();
    i7 = R.dimen.mtrl_textinput_box_stroke_width_focused;
    i5 = ((Resources)localObject5).getDimensionPixelSize(i7);
    i16 = ((TintTypedArray)localObject2).OooO0o0(i16, i5);
    localTextInputLayout.boxStrokeWidthFocusedPx = i16;
    i16 = localTextInputLayout.boxStrokeWidthDefaultPx;
    localTextInputLayout.boxStrokeWidthPx = i16;
    i16 = R.styleable.TextInputLayout_boxCornerRadiusTopStart;
    i5 = -1082130432;
    float f1 = -1.0F;
    float f2 = ((TintTypedArray)localObject2).OooO0OO(i16, f1);
    i7 = R.styleable.TextInputLayout_boxCornerRadiusTopEnd;
    float f3 = ((TintTypedArray)localObject2).OooO0OO(i7, f1);
    i8 = R.styleable.TextInputLayout_boxCornerRadiusBottomEnd;
    float f4 = ((TintTypedArray)localObject2).OooO0OO(i8, f1);
    int i26 = R.styleable.TextInputLayout_boxCornerRadiusBottomStart;
    f1 = ((TintTypedArray)localObject2).OooO0OO(i26, f1);
    localObject1 = localTextInputLayout.shapeAppearanceModel.toBuilder();
    i = 0;
    boolean bool2 = f2 < 0.0F;
    if (!bool2) {
      ((ShapeAppearanceModel.Builder)localObject1).setTopLeftCornerSize(f2);
    }
    boolean bool14 = f3 < 0.0F;
    if (!bool14) {
      ((ShapeAppearanceModel.Builder)localObject1).setTopRightCornerSize(f3);
    }
    bool14 = f4 < 0.0F;
    if (!bool14) {
      ((ShapeAppearanceModel.Builder)localObject1).setBottomRightCornerSize(f4);
    }
    bool14 = f1 < 0.0F;
    if (!bool14) {
      ((ShapeAppearanceModel.Builder)localObject1).setBottomLeftCornerSize(f1);
    }
    localObject4 = ((ShapeAppearanceModel.Builder)localObject1).build();
    localTextInputLayout.shapeAppearanceModel = ((ShapeAppearanceModel)localObject4);
    int i17 = R.styleable.TextInputLayout_boxBackgroundColor;
    localObject4 = MaterialResources.getColorStateList(localContext, (TintTypedArray)localObject2, i17);
    if (localObject4 != null)
    {
      i5 = ((ColorStateList)localObject4).getDefaultColor();
      localTextInputLayout.defaultFilledBackgroundColor = i5;
      localTextInputLayout.boxBackgroundColor = i5;
      boolean bool4 = ((ColorStateList)localObject4).isStateful();
      i7 = 16843623;
      f3 = 2.3696E-038F;
      i8 = -16842910;
      f4 = -1.69475E+038F;
      if (bool4)
      {
        localObject5 = new int[] { i8 };
        i6 = ((ColorStateList)localObject4).getColorForState((int[])localObject5, m);
        localTextInputLayout.disabledFilledBackgroundColor = i6;
        f1 = 2.3694E-038F;
        i8 = 16842910;
        f4 = 2.3694E-038F;
        localObject5 = new int[] { 16842908, i8 };
        i6 = ((ColorStateList)localObject4).getColorForState((int[])localObject5, m);
        localTextInputLayout.focusedFilledBackgroundColor = i6;
        localObject5 = new int[] { i7, i8 };
        i17 = ((ColorStateList)localObject4).getColorForState((int[])localObject5, m);
      }
      else
      {
        i17 = localTextInputLayout.defaultFilledBackgroundColor;
        localTextInputLayout.focusedFilledBackgroundColor = i17;
        i17 = R.color.mtrl_filled_background_color;
        localObject4 = AppCompatResources.OooO00o(localContext, i17);
        localObject5 = new int[] { i8 };
        i6 = ((ColorStateList)localObject4).getColorForState((int[])localObject5, m);
        localTextInputLayout.disabledFilledBackgroundColor = i6;
        localObject5 = new int[] { i7 };
        i17 = ((ColorStateList)localObject4).getColorForState((int[])localObject5, m);
      }
      localTextInputLayout.hoveredFilledBackgroundColor = i17;
    }
    else
    {
      localTextInputLayout.boxBackgroundColor = 0;
      localTextInputLayout.defaultFilledBackgroundColor = 0;
      localTextInputLayout.disabledFilledBackgroundColor = 0;
      localTextInputLayout.focusedFilledBackgroundColor = 0;
      localTextInputLayout.hoveredFilledBackgroundColor = 0;
    }
    i17 = R.styleable.TextInputLayout_android_textColorHint;
    boolean bool15 = ((TintTypedArray)localObject2).OooOO0o(i17);
    if (bool15)
    {
      i18 = R.styleable.TextInputLayout_android_textColorHint;
      localObject4 = ((TintTypedArray)localObject2).getColorStateList(i18);
      localTextInputLayout.focusedTextColor = ((ColorStateList)localObject4);
      localTextInputLayout.defaultHintTextColor = ((ColorStateList)localObject4);
    }
    int i18 = R.styleable.TextInputLayout_boxStrokeColor;
    localObject4 = MaterialResources.getColorStateList(localContext, (TintTypedArray)localObject2, i18);
    int i6 = R.styleable.TextInputLayout_boxStrokeColor;
    i6 = ((TintTypedArray)localObject2).OooO0O0(i6, 0);
    localTextInputLayout.focusedStrokeColor = i6;
    i6 = R.color.mtrl_textinput_default_box_stroke_color;
    i6 = ContextCompat.OooO0OO(localContext, i6);
    localTextInputLayout.defaultStrokeColor = i6;
    i6 = R.color.mtrl_textinput_disabled_color;
    i6 = ContextCompat.OooO0OO(localContext, i6);
    localTextInputLayout.disabledColor = i6;
    i6 = R.color.mtrl_textinput_hovered_box_stroke_color;
    i6 = ContextCompat.OooO0OO(localContext, i6);
    localTextInputLayout.hoveredStrokeColor = i6;
    if (localObject4 != null) {
      localTextInputLayout.setBoxStrokeColorStateList((ColorStateList)localObject4);
    }
    i18 = R.styleable.TextInputLayout_boxStrokeErrorColor;
    boolean bool16 = ((TintTypedArray)localObject2).OooOO0o(i18);
    if (bool16)
    {
      i19 = R.styleable.TextInputLayout_boxStrokeErrorColor;
      localObject4 = MaterialResources.getColorStateList(localContext, (TintTypedArray)localObject2, i19);
      localTextInputLayout.setBoxStrokeErrorColor((ColorStateList)localObject4);
    }
    int i19 = R.styleable.TextInputLayout_hintTextAppearance;
    i19 = ((TintTypedArray)localObject2).OooOO0O(i19, m);
    if (i19 != m)
    {
      i19 = R.styleable.TextInputLayout_hintTextAppearance;
      i19 = ((TintTypedArray)localObject2).OooOO0O(i19, 0);
      localTextInputLayout.setHintTextAppearance(i19);
    }
    i19 = R.styleable.TextInputLayout_errorTextAppearance;
    i19 = ((TintTypedArray)localObject2).OooOO0O(i19, 0);
    i6 = R.styleable.TextInputLayout_errorContentDescription;
    localObject5 = ((TintTypedArray)localObject2).getText(i6);
    i7 = R.styleable.TextInputLayout_errorAccessibilityLiveRegion;
    i7 = ((TintTypedArray)localObject2).OooO0oo(i7, n);
    i8 = R.styleable.TextInputLayout_errorEnabled;
    boolean bool6 = ((TintTypedArray)localObject2).OooO00o(i8, false);
    i26 = R.styleable.TextInputLayout_helperTextTextAppearance;
    i26 = ((TintTypedArray)localObject2).OooOO0O(i26, 0);
    i = R.styleable.TextInputLayout_helperTextEnabled;
    boolean bool1 = ((TintTypedArray)localObject2).OooO00o(i, false);
    int k = R.styleable.TextInputLayout_helperText;
    CharSequence localCharSequence1 = ((TintTypedArray)localObject2).getText(k);
    int i27 = R.styleable.TextInputLayout_placeholderTextAppearance;
    i27 = ((TintTypedArray)localObject2).OooOO0O(i27, 0);
    int i28 = R.styleable.TextInputLayout_placeholderText;
    CharSequence localCharSequence2 = ((TintTypedArray)localObject2).getText(i28);
    int i1 = R.styleable.TextInputLayout_counterEnabled;
    boolean bool3 = ((TintTypedArray)localObject2).OooO00o(i1, false);
    i2 = R.styleable.TextInputLayout_counterMaxLength;
    m = ((TintTypedArray)localObject2).OooO0oo(i2, m);
    localTextInputLayout.setCounterMaxLength(m);
    m = R.styleable.TextInputLayout_counterTextAppearance;
    i2 = 0;
    m = ((TintTypedArray)localObject2).OooOO0O(m, 0);
    localTextInputLayout.counterTextAppearance = m;
    m = R.styleable.TextInputLayout_counterOverflowTextAppearance;
    m = ((TintTypedArray)localObject2).OooOO0O(m, 0);
    localTextInputLayout.counterOverflowTextAppearance = m;
    m = R.styleable.TextInputLayout_boxBackgroundMode;
    m = ((TintTypedArray)localObject2).OooO0oo(m, 0);
    localTextInputLayout.setBoxBackgroundMode(m);
    localTextInputLayout.setErrorContentDescription((CharSequence)localObject5);
    localTextInputLayout.setErrorAccessibilityLiveRegion(i7);
    i6 = localTextInputLayout.counterOverflowTextAppearance;
    localTextInputLayout.setCounterOverflowTextAppearance(i6);
    localTextInputLayout.setHelperTextTextAppearance(i26);
    localTextInputLayout.setErrorTextAppearance(i19);
    i19 = localTextInputLayout.counterTextAppearance;
    localTextInputLayout.setCounterTextAppearance(i19);
    localTextInputLayout.setPlaceholderText(localCharSequence2);
    localTextInputLayout.setPlaceholderTextAppearance(i27);
    i19 = R.styleable.TextInputLayout_errorTextColor;
    boolean bool17 = ((TintTypedArray)localObject2).OooOO0o(i19);
    if (bool17)
    {
      i20 = R.styleable.TextInputLayout_errorTextColor;
      localObject4 = ((TintTypedArray)localObject2).getColorStateList(i20);
      localTextInputLayout.setErrorTextColor((ColorStateList)localObject4);
    }
    int i20 = R.styleable.TextInputLayout_helperTextTextColor;
    boolean bool18 = ((TintTypedArray)localObject2).OooOO0o(i20);
    if (bool18)
    {
      i21 = R.styleable.TextInputLayout_helperTextTextColor;
      localObject4 = ((TintTypedArray)localObject2).getColorStateList(i21);
      localTextInputLayout.setHelperTextColor((ColorStateList)localObject4);
    }
    int i21 = R.styleable.TextInputLayout_hintTextColor;
    boolean bool19 = ((TintTypedArray)localObject2).OooOO0o(i21);
    if (bool19)
    {
      i22 = R.styleable.TextInputLayout_hintTextColor;
      localObject4 = ((TintTypedArray)localObject2).getColorStateList(i22);
      localTextInputLayout.setHintTextColor((ColorStateList)localObject4);
    }
    int i22 = R.styleable.TextInputLayout_counterTextColor;
    boolean bool20 = ((TintTypedArray)localObject2).OooOO0o(i22);
    if (bool20)
    {
      i23 = R.styleable.TextInputLayout_counterTextColor;
      localObject4 = ((TintTypedArray)localObject2).getColorStateList(i23);
      localTextInputLayout.setCounterTextColor((ColorStateList)localObject4);
    }
    int i23 = R.styleable.TextInputLayout_counterOverflowTextColor;
    boolean bool21 = ((TintTypedArray)localObject2).OooOO0o(i23);
    if (bool21)
    {
      i24 = R.styleable.TextInputLayout_counterOverflowTextColor;
      localObject4 = ((TintTypedArray)localObject2).getColorStateList(i24);
      localTextInputLayout.setCounterOverflowTextColor((ColorStateList)localObject4);
    }
    int i24 = R.styleable.TextInputLayout_placeholderTextColor;
    boolean bool22 = ((TintTypedArray)localObject2).OooOO0o(i24);
    if (bool22)
    {
      int i25 = R.styleable.TextInputLayout_placeholderTextColor;
      localObject4 = ((TintTypedArray)localObject2).getColorStateList(i25);
      localTextInputLayout.setPlaceholderTextColor((ColorStateList)localObject4);
    }
    localObject4 = new com/google/android/material/textfield/EndCompoundLayout;
    ((EndCompoundLayout)localObject4).<init>(localTextInputLayout, (TintTypedArray)localObject2);
    localTextInputLayout.endLayout = ((EndCompoundLayout)localObject4);
    i6 = R.styleable.TextInputLayout_android_enabled;
    i7 = 1;
    boolean bool5 = ((TintTypedArray)localObject2).OooO00o(i6, i7);
    ((TintTypedArray)localObject2).OooOOOo();
    ViewCompat.o000000(localTextInputLayout, 2);
    ViewCompat.o000000O(localTextInputLayout, i7);
    localFrameLayout.addView((View)localObject3);
    localFrameLayout.addView((View)localObject4);
    localTextInputLayout.addView(localFrameLayout);
    localTextInputLayout.setEnabled(bool5);
    localTextInputLayout.setHelperTextEnabled(bool1);
    localTextInputLayout.setErrorEnabled(bool6);
    localTextInputLayout.setCounterEnabled(bool3);
    localTextInputLayout.setHelperText(localCharSequence1);
  }
  
  private void addPlaceholderTextView()
  {
    TextView localTextView = this.placeholderTextView;
    if (localTextView != null)
    {
      this.inputFrame.addView(localTextView);
      localTextView = this.placeholderTextView;
      localTextView.setVisibility(0);
    }
  }
  
  private void adjustFilledEditTextPaddingForLargeFont()
  {
    Object localObject = this.editText;
    if (localObject != null)
    {
      int i = this.boxBackgroundMode;
      int j = 1;
      if (i == j)
      {
        localObject = getContext();
        boolean bool = MaterialResources.isFontScaleAtLeast2_0((Context)localObject);
        Resources localResources1;
        int k;
        int m;
        EditText localEditText;
        Resources localResources2;
        if (bool)
        {
          localObject = this.editText;
          j = ViewCompat.Oooo000((View)localObject);
          localResources1 = getResources();
          k = R.dimen.material_filled_edittext_font_2_0_padding_top;
          m = localResources1.getDimensionPixelSize(k);
          localEditText = this.editText;
          k = ViewCompat.OooOooo(localEditText);
          localResources2 = getResources();
        }
        for (int n = R.dimen.material_filled_edittext_font_2_0_padding_bottom;; n = R.dimen.material_filled_edittext_font_1_3_padding_bottom)
        {
          int i1 = localResources2.getDimensionPixelSize(n);
          ViewCompat.o00000O((View)localObject, j, m, k, i1);
          break;
          localObject = getContext();
          bool = MaterialResources.isFontScaleAtLeast1_3((Context)localObject);
          if (!bool) {
            break;
          }
          localObject = this.editText;
          j = ViewCompat.Oooo000((View)localObject);
          localResources1 = getResources();
          k = R.dimen.material_filled_edittext_font_1_3_padding_top;
          m = localResources1.getDimensionPixelSize(k);
          localEditText = this.editText;
          k = ViewCompat.OooOooo(localEditText);
          localResources2 = getResources();
        }
      }
    }
  }
  
  private void applyBoxAttributes()
  {
    Object localObject1 = this.boxBackground;
    if (localObject1 == null) {
      return;
    }
    localObject1 = ((MaterialShapeDrawable)localObject1).getShapeAppearanceModel();
    Object localObject2 = this.shapeAppearanceModel;
    if (localObject1 != localObject2)
    {
      localObject1 = this.boxBackground;
      ((MaterialShapeDrawable)localObject1).setShapeAppearanceModel((ShapeAppearanceModel)localObject2);
    }
    boolean bool = canDrawOutlineStroke();
    if (bool)
    {
      localObject1 = this.boxBackground;
      int j = this.boxStrokeWidthPx;
      float f = j;
      int k = this.boxStrokeColor;
      ((MaterialShapeDrawable)localObject1).setStroke(f, k);
    }
    int i = calculateBoxBackgroundColor();
    this.boxBackgroundColor = i;
    localObject2 = this.boxBackground;
    localObject1 = ColorStateList.valueOf(i);
    ((MaterialShapeDrawable)localObject2).setFillColor((ColorStateList)localObject1);
    applyBoxUnderlineAttributes();
    updateEditTextBoxBackgroundIfNeeded();
  }
  
  private void applyBoxUnderlineAttributes()
  {
    MaterialShapeDrawable localMaterialShapeDrawable = this.boxUnderlineDefault;
    if (localMaterialShapeDrawable != null)
    {
      localMaterialShapeDrawable = this.boxUnderlineFocused;
      if (localMaterialShapeDrawable != null)
      {
        boolean bool1 = canDrawStroke();
        if (bool1)
        {
          localMaterialShapeDrawable = this.boxUnderlineDefault;
          Object localObject = this.editText;
          boolean bool2 = ((View)localObject).isFocused();
          if (bool2) {
            i = this.defaultStrokeColor;
          } else {
            i = this.boxStrokeColor;
          }
          localObject = ColorStateList.valueOf(i);
          localMaterialShapeDrawable.setFillColor((ColorStateList)localObject);
          localMaterialShapeDrawable = this.boxUnderlineFocused;
          int i = this.boxStrokeColor;
          localObject = ColorStateList.valueOf(i);
          localMaterialShapeDrawable.setFillColor((ColorStateList)localObject);
        }
        invalidate();
      }
    }
  }
  
  private void applyCutoutPadding(RectF paramRectF)
  {
    float f1 = paramRectF.left;
    int i = this.boxLabelCutoutPaddingPx;
    float f2 = i;
    f1 -= f2;
    paramRectF.left = f1;
    f1 = paramRectF.right;
    float f3 = i;
    f1 += f3;
    paramRectF.right = f1;
  }
  
  private void assignBoxBackgroundByMode()
  {
    int i = this.boxBackgroundMode;
    Object localObject1 = null;
    if (i != 0)
    {
      int j = 1;
      Object localObject2;
      if (i != j)
      {
        j = 2;
        Object localObject3;
        if (i == j)
        {
          boolean bool = this.hintEnabled;
          if (bool)
          {
            localObject2 = this.boxBackground;
            bool = localObject2 instanceof CutoutDrawable;
            if (!bool)
            {
              localObject2 = CutoutDrawable.create(this.shapeAppearanceModel);
              break label80;
            }
          }
          localObject2 = new com/google/android/material/shape/MaterialShapeDrawable;
          localObject3 = this.shapeAppearanceModel;
          ((MaterialShapeDrawable)localObject2).<init>((ShapeAppearanceModel)localObject3);
          label80:
          this.boxBackground = ((MaterialShapeDrawable)localObject2);
        }
        else
        {
          localObject2 = new java/lang/IllegalArgumentException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          j = this.boxBackgroundMode;
          ((StringBuilder)localObject1).append(j);
          localObject3 = m54207b69.F54207b69_11("Cs531B02561E24251D1C1B29535F292B2E1A6445443020472928312E1C38233B365E3D39397735424428303C48332D8141314785333A3839533940505299");
          ((StringBuilder)localObject1).append((String)localObject3);
          localObject1 = ((StringBuilder)localObject1).toString();
          ((IllegalArgumentException)localObject2).<init>((String)localObject1);
          throw ((Throwable)localObject2);
        }
      }
      else
      {
        localObject2 = new com/google/android/material/shape/MaterialShapeDrawable;
        localObject1 = this.shapeAppearanceModel;
        ((MaterialShapeDrawable)localObject2).<init>((ShapeAppearanceModel)localObject1);
        this.boxBackground = ((MaterialShapeDrawable)localObject2);
        localObject2 = new com/google/android/material/shape/MaterialShapeDrawable;
        ((MaterialShapeDrawable)localObject2).<init>();
        this.boxUnderlineDefault = ((MaterialShapeDrawable)localObject2);
        localObject2 = new com/google/android/material/shape/MaterialShapeDrawable;
        ((MaterialShapeDrawable)localObject2).<init>();
        this.boxUnderlineFocused = ((MaterialShapeDrawable)localObject2);
        return;
      }
    }
    else
    {
      this.boxBackground = null;
    }
    this.boxUnderlineDefault = null;
    this.boxUnderlineFocused = null;
  }
  
  private int calculateBoxBackgroundColor()
  {
    int i = this.boxBackgroundColor;
    int j = this.boxBackgroundMode;
    int k = 1;
    if (j == k)
    {
      i = R.attr.colorSurface;
      i = MaterialColors.getColor(this, i, 0);
      j = this.boxBackgroundColor;
      i = MaterialColors.layer(i, j);
    }
    return i;
  }
  
  private Rect calculateCollapsedTextBounds(Rect paramRect)
  {
    Object localObject = this.editText;
    if (localObject != null)
    {
      localObject = this.tmpBoundsRect;
      boolean bool = ViewUtils.isLayoutRtl(this);
      int j = paramRect.bottom;
      ((Rect)localObject).bottom = j;
      j = this.boxBackgroundMode;
      int n = 1;
      if (j != n)
      {
        int i1 = 2;
        if (j != i1)
        {
          j = paramRect.left;
          j = getLabelLeftBoundAlightWithPrefix(j, bool);
          ((Rect)localObject).left = j;
          j = getPaddingTop();
        }
      }
      for (;;)
      {
        ((Rect)localObject).top = j;
        int i3 = paramRect.right;
        i3 = getLabelRightBoundAlignedWithSuffix(i3, bool);
        int i;
        for (;;)
        {
          ((Rect)localObject).right = i3;
          return localObject;
          i = paramRect.left;
          EditText localEditText1 = this.editText;
          j = localEditText1.getPaddingLeft();
          i += j;
          ((Rect)localObject).left = i;
          i = paramRect.top;
          int k = calculateLabelMarginTop();
          i -= k;
          ((Rect)localObject).top = i;
          i3 = paramRect.right;
          EditText localEditText2 = this.editText;
          i = localEditText2.getPaddingRight();
          int i4;
          i3 -= i;
        }
        int m = paramRect.left;
        m = getLabelLeftBoundAlightWithPrefix(m, i);
        ((Rect)localObject).left = m;
        m = paramRect.top;
        int i2 = this.boxCollapsedPaddingTopPx;
        m += i2;
      }
    }
    paramRect = new java/lang/IllegalStateException;
    paramRect.<init>();
    throw paramRect;
  }
  
  private int calculateExpandedLabelBottom(Rect paramRect1, Rect paramRect2, float paramFloat)
  {
    boolean bool = isSingleLineFilledTextField();
    if (bool) {
      return (int)(paramRect2.top + paramFloat);
    }
    int i = paramRect1.bottom;
    int j = this.editText.getCompoundPaddingBottom();
    return i - j;
  }
  
  private int calculateExpandedLabelTop(Rect paramRect, float paramFloat)
  {
    boolean bool = isSingleLineFilledTextField();
    if (bool)
    {
      float f = paramRect.centerY();
      paramFloat /= 2.0F;
      return (int)(f - paramFloat);
    }
    int i = paramRect.top;
    int j = this.editText.getCompoundPaddingTop();
    return i + j;
  }
  
  private Rect calculateExpandedTextBounds(Rect paramRect)
  {
    Object localObject = this.editText;
    if (localObject != null)
    {
      localObject = this.tmpBoundsRect;
      float f = this.collapsingTextHelper.getExpandedTextHeight();
      int i = paramRect.left;
      int j = this.editText.getCompoundPaddingLeft();
      i += j;
      ((Rect)localObject).left = i;
      i = calculateExpandedLabelTop(paramRect, f);
      ((Rect)localObject).top = i;
      i = paramRect.right;
      j = this.editText.getCompoundPaddingRight();
      i -= j;
      ((Rect)localObject).right = i;
      int k = calculateExpandedLabelBottom(paramRect, (Rect)localObject, f);
      ((Rect)localObject).bottom = k;
      return localObject;
    }
    paramRect = new java/lang/IllegalStateException;
    paramRect.<init>();
    throw paramRect;
  }
  
  private int calculateLabelMarginTop()
  {
    boolean bool = this.hintEnabled;
    float f1 = 0.0F;
    if (!bool) {
      return 0;
    }
    int i = this.boxBackgroundMode;
    CollapsingTextHelper localCollapsingTextHelper;
    float f2;
    if (i != 0)
    {
      int j = 2;
      if (i != j) {
        return 0;
      }
      localCollapsingTextHelper = this.collapsingTextHelper;
      f2 = localCollapsingTextHelper.getCollapsedTextHeight();
      f1 = 2.0F;
    }
    for (f2 /= f1;; f2 = localCollapsingTextHelper.getCollapsedTextHeight())
    {
      return (int)f2;
      localCollapsingTextHelper = this.collapsingTextHelper;
    }
  }
  
  private boolean canDrawOutlineStroke()
  {
    int i = this.boxBackgroundMode;
    int j = 2;
    if (i == j)
    {
      bool = canDrawStroke();
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  private boolean canDrawStroke()
  {
    int i = this.boxStrokeWidthPx;
    int j = -1;
    if (i > j)
    {
      i = this.boxStrokeColor;
      if (i != 0) {
        return 1;
      }
    }
    i = 0;
    return i;
  }
  
  private void closeCutout()
  {
    boolean bool = cutoutEnabled();
    if (bool)
    {
      CutoutDrawable localCutoutDrawable = (CutoutDrawable)this.boxBackground;
      localCutoutDrawable.removeCutout();
    }
  }
  
  private void collapseHint(boolean paramBoolean)
  {
    ValueAnimator localValueAnimator = this.animator;
    if (localValueAnimator != null)
    {
      boolean bool1 = localValueAnimator.isRunning();
      if (bool1)
      {
        localValueAnimator = this.animator;
        localValueAnimator.cancel();
      }
    }
    int i = 1065353216;
    float f = 1.0F;
    if (paramBoolean)
    {
      paramBoolean = this.hintAnimationEnabled;
      if (paramBoolean)
      {
        animateToExpansionFraction(f);
        break label71;
      }
    }
    CollapsingTextHelper localCollapsingTextHelper = this.collapsingTextHelper;
    localCollapsingTextHelper.setExpansionFraction(f);
    label71:
    paramBoolean = false;
    localCollapsingTextHelper = null;
    this.hintExpanded = false;
    boolean bool2 = cutoutEnabled();
    if (bool2) {
      openCutout();
    }
    updatePlaceholderText();
    this.startLayout.onHintStateChanged(false);
    this.endLayout.onHintStateChanged(false);
  }
  
  private Fade createPlaceholderFadeTransition()
  {
    Fade localFade = new androidx/transition/Fade;
    localFade.<init>();
    Object localObject = getContext();
    int i = R.attr.motionDurationShort2;
    long l = MotionUtils.resolveThemeDuration((Context)localObject, i, 87);
    localFade.setDuration(l);
    localObject = getContext();
    i = R.attr.motionEasingLinearInterpolator;
    TimeInterpolator localTimeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
    localObject = MotionUtils.resolveThemeInterpolator((Context)localObject, i, localTimeInterpolator);
    localFade.setInterpolator((TimeInterpolator)localObject);
    return localFade;
  }
  
  private boolean cutoutEnabled()
  {
    boolean bool = this.hintEnabled;
    if (bool)
    {
      localObject = this.hint;
      bool = TextUtils.isEmpty((CharSequence)localObject);
      if (!bool)
      {
        localObject = this.boxBackground;
        bool = localObject instanceof CutoutDrawable;
        if (bool) {
          return true;
        }
      }
    }
    bool = false;
    Object localObject = null;
    return bool;
  }
  
  private void dispatchOnEditTextAttached()
  {
    Iterator localIterator = this.editTextAttachedListeners.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      TextInputLayout.OnEditTextAttachedListener localOnEditTextAttachedListener = (TextInputLayout.OnEditTextAttachedListener)localIterator.next();
      localOnEditTextAttachedListener.onEditTextAttached(this);
    }
  }
  
  private void drawBoxUnderline(Canvas paramCanvas)
  {
    Object localObject = this.boxUnderlineFocused;
    if (localObject != null)
    {
      localObject = this.boxUnderlineDefault;
      if (localObject != null)
      {
        ((MaterialShapeDrawable)localObject).draw(paramCanvas);
        localObject = this.editText;
        boolean bool = ((View)localObject).isFocused();
        if (bool)
        {
          localObject = this.boxUnderlineFocused.getBounds();
          Rect localRect = this.boxUnderlineDefault.getBounds();
          CollapsingTextHelper localCollapsingTextHelper = this.collapsingTextHelper;
          float f = localCollapsingTextHelper.getExpansionFraction();
          int i = localRect.centerX();
          int j = localRect.left;
          j = AnimationUtils.lerp(i, j, f);
          ((Rect)localObject).left = j;
          int k = localRect.right;
          k = AnimationUtils.lerp(i, k, f);
          ((Rect)localObject).right = k;
          localObject = this.boxUnderlineFocused;
          ((MaterialShapeDrawable)localObject).draw(paramCanvas);
        }
      }
    }
  }
  
  private void drawHint(Canvas paramCanvas)
  {
    boolean bool = this.hintEnabled;
    if (bool)
    {
      CollapsingTextHelper localCollapsingTextHelper = this.collapsingTextHelper;
      localCollapsingTextHelper.draw(paramCanvas);
    }
  }
  
  private void expandHint(boolean paramBoolean)
  {
    ValueAnimator localValueAnimator = this.animator;
    if (localValueAnimator != null)
    {
      bool = localValueAnimator.isRunning();
      if (bool)
      {
        localValueAnimator = this.animator;
        localValueAnimator.cancel();
      }
    }
    boolean bool = false;
    localValueAnimator = null;
    if (paramBoolean)
    {
      paramBoolean = this.hintAnimationEnabled;
      if (paramBoolean)
      {
        animateToExpansionFraction(0.0F);
        break label64;
      }
    }
    Object localObject = this.collapsingTextHelper;
    ((CollapsingTextHelper)localObject).setExpansionFraction(0.0F);
    label64:
    paramBoolean = cutoutEnabled();
    if (paramBoolean)
    {
      localObject = (CutoutDrawable)this.boxBackground;
      paramBoolean = ((CutoutDrawable)localObject).hasCutout();
      if (paramBoolean) {
        closeCutout();
      }
    }
    paramBoolean = true;
    this.hintExpanded = paramBoolean;
    hidePlaceholderText();
    this.startLayout.onHintStateChanged(paramBoolean);
    this.endLayout.onHintStateChanged(paramBoolean);
  }
  
  private MaterialShapeDrawable getDropDownMaterialShapeDrawable(boolean paramBoolean)
  {
    Object localObject1 = getResources();
    int i = R.dimen.mtrl_shape_corner_size_small_component;
    int j = ((Resources)localObject1).getDimensionPixelOffset(i);
    float f1 = j;
    float f2;
    if (paramBoolean)
    {
      f2 = f1;
    }
    else
    {
      paramBoolean = false;
      f2 = 0.0F;
      localShapeAppearanceModel = null;
    }
    Object localObject2 = this.editText;
    boolean bool = localObject2 instanceof MaterialAutoCompleteTextView;
    float f3;
    if (bool)
    {
      localObject2 = (MaterialAutoCompleteTextView)localObject2;
      f3 = ((MaterialAutoCompleteTextView)localObject2).getPopupElevation();
    }
    else
    {
      localObject2 = getResources();
      k = R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation;
      i = ((Resources)localObject2).getDimensionPixelOffset(k);
      f3 = i;
    }
    Resources localResources = getResources();
    int m = R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding;
    int k = localResources.getDimensionPixelOffset(m);
    ShapeAppearanceModel localShapeAppearanceModel = ShapeAppearanceModel.builder().setTopLeftCornerSize(f2).setTopRightCornerSize(f2).setBottomLeftCornerSize(f1).setBottomRightCornerSize(f1).build();
    localObject1 = MaterialShapeDrawable.createWithElevationOverlay(getContext(), f3);
    ((MaterialShapeDrawable)localObject1).setShapeAppearanceModel(localShapeAppearanceModel);
    ((MaterialShapeDrawable)localObject1).setPadding(0, k, 0, k);
    return localObject1;
  }
  
  private Drawable getEditTextBoxBackground()
  {
    EditText localEditText = this.editText;
    boolean bool1 = localEditText instanceof AutoCompleteTextView;
    if (bool1)
    {
      boolean bool2 = EditTextUtils.isEditable((EditText)localEditText);
      if (!bool2)
      {
        localEditText = this.editText;
        int i = R.attr.colorControlHighlight;
        int j = MaterialColors.getColor(localEditText, i);
        i = this.boxBackgroundMode;
        int k = 2;
        Object localObject;
        int[][] arrayOfInt;
        if (i == k)
        {
          localObject = getContext();
          MaterialShapeDrawable localMaterialShapeDrawable = this.boxBackground;
          arrayOfInt = EDIT_TEXT_BACKGROUND_RIPPLE_STATE;
          return getOutlinedBoxBackgroundWithRipple((Context)localObject, localMaterialShapeDrawable, j, arrayOfInt);
        }
        k = 1;
        if (i == k)
        {
          localObject = this.boxBackground;
          k = this.boxBackgroundColor;
          arrayOfInt = EDIT_TEXT_BACKGROUND_RIPPLE_STATE;
          return getFilledBoxBackgroundWithRipple((MaterialShapeDrawable)localObject, k, j, arrayOfInt);
        }
        return null;
      }
    }
    return this.boxBackground;
  }
  
  private static Drawable getFilledBoxBackgroundWithRipple(MaterialShapeDrawable paramMaterialShapeDrawable, int paramInt1, int paramInt2, int[][] paramArrayOfInt)
  {
    paramInt2 = MaterialColors.layer(paramInt2, paramInt1, 0.1F);
    Object localObject = { paramInt2, paramInt1 };
    ColorStateList localColorStateList = new android/content/res/ColorStateList;
    localColorStateList.<init>(paramArrayOfInt, (int[])localObject);
    localObject = new android/graphics/drawable/RippleDrawable;
    ((RippleDrawable)localObject).<init>(localColorStateList, paramMaterialShapeDrawable, paramMaterialShapeDrawable);
    return localObject;
  }
  
  private int getLabelLeftBoundAlightWithPrefix(int paramInt, boolean paramBoolean)
  {
    int i = this.editText.getCompoundPaddingLeft();
    paramInt += i;
    CharSequence localCharSequence = getPrefixText();
    if ((localCharSequence != null) && (!paramBoolean))
    {
      paramBoolean = getPrefixTextView().getMeasuredWidth();
      paramInt -= paramBoolean;
      TextView localTextView = getPrefixTextView();
      paramBoolean = localTextView.getPaddingLeft();
      paramInt += paramBoolean;
    }
    return paramInt;
  }
  
  private int getLabelRightBoundAlignedWithSuffix(int paramInt, boolean paramBoolean)
  {
    int i = this.editText.getCompoundPaddingRight();
    paramInt -= i;
    Object localObject = getPrefixText();
    if ((localObject != null) && (paramBoolean))
    {
      TextView localTextView = getPrefixTextView();
      paramBoolean = localTextView.getMeasuredWidth();
      localObject = getPrefixTextView();
      i = ((View)localObject).getPaddingRight();
      paramBoolean -= i;
      paramInt += paramBoolean;
    }
    return paramInt;
  }
  
  private Drawable getOrCreateFilledDropDownMenuBackground()
  {
    StateListDrawable localStateListDrawable = this.filledDropDownMenuBackground;
    if (localStateListDrawable == null)
    {
      localStateListDrawable = new android/graphics/drawable/StateListDrawable;
      localStateListDrawable.<init>();
      this.filledDropDownMenuBackground = localStateListDrawable;
      Object localObject1 = { 16842922 };
      Object localObject2 = getOrCreateOutlinedDropDownMenuBackground();
      localStateListDrawable.addState((int[])localObject1, (Drawable)localObject2);
      localStateListDrawable = this.filledDropDownMenuBackground;
      localObject2 = new int[0];
      localObject1 = getDropDownMaterialShapeDrawable(false);
      localStateListDrawable.addState((int[])localObject2, (Drawable)localObject1);
    }
    return this.filledDropDownMenuBackground;
  }
  
  private Drawable getOrCreateOutlinedDropDownMenuBackground()
  {
    MaterialShapeDrawable localMaterialShapeDrawable = this.outlinedDropDownMenuBackground;
    if (localMaterialShapeDrawable == null)
    {
      boolean bool = true;
      localMaterialShapeDrawable = getDropDownMaterialShapeDrawable(bool);
      this.outlinedDropDownMenuBackground = localMaterialShapeDrawable;
    }
    return this.outlinedDropDownMenuBackground;
  }
  
  private static Drawable getOutlinedBoxBackgroundWithRipple(Context paramContext, MaterialShapeDrawable paramMaterialShapeDrawable, int paramInt, int[][] paramArrayOfInt)
  {
    int i = R.attr.colorSurface;
    Object localObject = m54207b69.F54207b69_11("ol380A161B29072220202917200F2626");
    int j = MaterialColors.getColor(paramContext, i, (String)localObject);
    MaterialShapeDrawable localMaterialShapeDrawable = new com/google/android/material/shape/MaterialShapeDrawable;
    localObject = paramMaterialShapeDrawable.getShapeAppearanceModel();
    localMaterialShapeDrawable.<init>((ShapeAppearanceModel)localObject);
    paramInt = MaterialColors.layer(paramInt, j, 0.1F);
    int[] arrayOfInt = { paramInt, 0 };
    ColorStateList localColorStateList1 = new android/content/res/ColorStateList;
    localColorStateList1.<init>(paramArrayOfInt, arrayOfInt);
    localMaterialShapeDrawable.setFillColor(localColorStateList1);
    localMaterialShapeDrawable.setTint(j);
    paramContext = new int[] { paramInt, j };
    ColorStateList localColorStateList2 = new android/content/res/ColorStateList;
    localColorStateList2.<init>(paramArrayOfInt, paramContext);
    paramContext = new com/google/android/material/shape/MaterialShapeDrawable;
    paramArrayOfInt = paramMaterialShapeDrawable.getShapeAppearanceModel();
    paramContext.<init>(paramArrayOfInt);
    paramContext.setTint(-1);
    paramArrayOfInt = new android/graphics/drawable/RippleDrawable;
    paramArrayOfInt.<init>(localColorStateList2, localMaterialShapeDrawable, paramContext);
    paramContext = new Drawable[2];
    paramContext[0] = paramArrayOfInt;
    paramContext[1] = paramMaterialShapeDrawable;
    paramMaterialShapeDrawable = new android/graphics/drawable/LayerDrawable;
    paramMaterialShapeDrawable.<init>(paramContext);
    return paramMaterialShapeDrawable;
  }
  
  private void hidePlaceholderText()
  {
    Object localObject = this.placeholderTextView;
    if (localObject != null)
    {
      boolean bool = this.placeholderEnabled;
      if (bool)
      {
        ((TextView)localObject).setText(null);
        localObject = this.inputFrame;
        Fade localFade = this.placeholderFadeOut;
        TransitionManager.OooO0O0((ViewGroup)localObject, localFade);
        localObject = this.placeholderTextView;
        int i = 4;
        ((View)localObject).setVisibility(i);
      }
    }
  }
  
  private boolean isSingleLineFilledTextField()
  {
    int i = this.boxBackgroundMode;
    int j = 1;
    if (i == j)
    {
      EditText localEditText = this.editText;
      i = localEditText.getMinLines();
      if (i <= j) {}
    }
    else
    {
      j = 0;
    }
    return j;
  }
  
  private void onApplyBoxBackgroundMode()
  {
    assignBoxBackgroundByMode();
    updateEditTextBoxBackgroundIfNeeded();
    updateTextInputBoxState();
    updateBoxCollapsedPaddingTop();
    adjustFilledEditTextPaddingForLargeFont();
    int i = this.boxBackgroundMode;
    if (i != 0) {
      updateInputLayoutMargins();
    }
    setDropDownMenuBackgroundIfNeeded();
  }
  
  private void openCutout()
  {
    boolean bool1 = cutoutEnabled();
    if (!bool1) {
      return;
    }
    RectF localRectF = this.tmpRectF;
    Object localObject = this.collapsingTextHelper;
    int i = this.editText.getWidth();
    EditText localEditText = this.editText;
    int j = localEditText.getGravity();
    ((CollapsingTextHelper)localObject).getCollapsedTextActualBounds(localRectF, i, j);
    float f1 = localRectF.width();
    i = 0;
    float f2 = 0.0F;
    boolean bool2 = f1 < 0.0F;
    if (bool2)
    {
      f1 = localRectF.height();
      bool2 = f1 < 0.0F;
      if (bool2)
      {
        applyCutoutPadding(localRectF);
        int k = -getPaddingLeft();
        f1 = k;
        i = -getPaddingTop();
        f2 = i;
        float f3 = localRectF.height();
        float f4 = 2.0F;
        f3 /= f4;
        f2 -= f3;
        j = this.boxStrokeWidthPx;
        f3 = j;
        f2 += f3;
        localRectF.offset(f1, f2);
        localObject = (CutoutDrawable)this.boxBackground;
        ((CutoutDrawable)localObject).setCutout(localRectF);
      }
    }
  }
  
  private void recalculateCutout()
  {
    boolean bool = cutoutEnabled();
    if (bool)
    {
      bool = this.hintExpanded;
      if (!bool)
      {
        closeCutout();
        openCutout();
      }
    }
  }
  
  private static void recursiveSetEnabled(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    int i = paramViewGroup.getChildCount();
    int j = 0;
    while (j < i)
    {
      Object localObject = paramViewGroup.getChildAt(j);
      ((View)localObject).setEnabled(paramBoolean);
      boolean bool = localObject instanceof ViewGroup;
      if (bool)
      {
        localObject = (ViewGroup)localObject;
        recursiveSetEnabled((ViewGroup)localObject, paramBoolean);
      }
      j += 1;
    }
  }
  
  private void removePlaceholderTextView()
  {
    TextView localTextView = this.placeholderTextView;
    if (localTextView != null)
    {
      int i = 8;
      localTextView.setVisibility(i);
    }
  }
  
  private void setDropDownMenuBackgroundIfNeeded()
  {
    Object localObject = this.editText;
    boolean bool = localObject instanceof AutoCompleteTextView;
    if (!bool) {
      return;
    }
    localObject = (AutoCompleteTextView)localObject;
    Drawable localDrawable = ((AutoCompleteTextView)localObject).getDropDownBackground();
    if (localDrawable == null)
    {
      int i = this.boxBackgroundMode;
      int j = 2;
      if (i == j) {}
      for (localDrawable = getOrCreateOutlinedDropDownMenuBackground();; localDrawable = getOrCreateFilledDropDownMenuBackground())
      {
        ((AutoCompleteTextView)localObject).setDropDownBackgroundDrawable(localDrawable);
        break;
        j = 1;
        if (i != j) {
          break;
        }
      }
    }
  }
  
  private void setEditText(EditText paramEditText)
  {
    Object localObject1 = this.editText;
    if (localObject1 == null)
    {
      int i = getEndIconMode();
      int k = 3;
      if (i != k) {
        boolean bool1 = paramEditText instanceof TextInputEditText;
      }
      this.editText = paramEditText;
      int j = this.minEms;
      k = -1;
      if (j != k)
      {
        setMinEms(j);
      }
      else
      {
        j = this.minWidth;
        setMinWidth(j);
      }
      j = this.maxEms;
      if (j != k)
      {
        setMaxEms(j);
      }
      else
      {
        j = this.maxWidth;
        setMaxWidth(j);
      }
      j = 0;
      localObject1 = null;
      this.boxBackgroundApplied = false;
      onApplyBoxBackgroundMode();
      Object localObject2 = new com/google/android/material/textfield/TextInputLayout$AccessibilityDelegate;
      ((TextInputLayout.AccessibilityDelegate)localObject2).<init>(this);
      setTextInputAccessibilityDelegate((TextInputLayout.AccessibilityDelegate)localObject2);
      localObject2 = this.collapsingTextHelper;
      Object localObject3 = this.editText.getTypeface();
      ((CollapsingTextHelper)localObject2).setTypefaces((Typeface)localObject3);
      localObject2 = this.collapsingTextHelper;
      float f = this.editText.getTextSize();
      ((CollapsingTextHelper)localObject2).setExpandedTextSize(f);
      localObject2 = this.collapsingTextHelper;
      f = this.editText.getLetterSpacing();
      ((CollapsingTextHelper)localObject2).setExpandedLetterSpacing(f);
      k = this.editText.getGravity();
      localObject3 = this.collapsingTextHelper;
      int m = k & 0xFFFFFF8F | 0x30;
      ((CollapsingTextHelper)localObject3).setCollapsedTextGravity(m);
      this.collapsingTextHelper.setExpandedTextGravity(k);
      localObject2 = this.editText;
      localObject3 = new com/google/android/material/textfield/TextInputLayout$1;
      ((TextInputLayout.1)localObject3).<init>(this);
      ((TextView)localObject2).addTextChangedListener((TextWatcher)localObject3);
      localObject2 = this.defaultHintTextColor;
      if (localObject2 == null)
      {
        localObject2 = this.editText.getHintTextColors();
        this.defaultHintTextColor = ((ColorStateList)localObject2);
      }
      boolean bool2 = this.hintEnabled;
      boolean bool3 = true;
      f = 1.4E-45F;
      if (bool2)
      {
        localObject2 = this.hint;
        bool2 = TextUtils.isEmpty((CharSequence)localObject2);
        if (bool2)
        {
          localObject2 = this.editText.getHint();
          this.originalHint = ((CharSequence)localObject2);
          setHint((CharSequence)localObject2);
          localObject2 = this.editText;
          m = 0;
          ((TextView)localObject2).setHint(null);
        }
        this.isProvidingHint = bool3;
      }
      localObject2 = this.counterView;
      if (localObject2 != null)
      {
        localObject2 = this.editText.getText();
        updateCounter((Editable)localObject2);
      }
      updateEditTextBackground();
      this.indicatorViewController.adjustIndicatorPadding();
      this.startLayout.bringToFront();
      this.endLayout.bringToFront();
      dispatchOnEditTextAttached();
      localObject2 = this.endLayout;
      ((EndCompoundLayout)localObject2).updateSuffixTextViewPadding();
      bool2 = isEnabled();
      if (!bool2) {
        paramEditText.setEnabled(false);
      }
      updateLabelState(false, bool3);
      return;
    }
    paramEditText = new java/lang/IllegalArgumentException;
    localObject1 = m54207b69.F54207b69_11("}`3706420410170B080C224A130D23134F111F5238181E2A4B1D312E675C201F2D6030302F3D652E283E2E6A3A3A32");
    paramEditText.<init>((String)localObject1);
    throw paramEditText;
  }
  
  private void setHintInternal(CharSequence paramCharSequence)
  {
    Object localObject = this.hint;
    boolean bool1 = TextUtils.equals(paramCharSequence, (CharSequence)localObject);
    if (!bool1)
    {
      this.hint = paramCharSequence;
      localObject = this.collapsingTextHelper;
      ((CollapsingTextHelper)localObject).setText(paramCharSequence);
      boolean bool2 = this.hintExpanded;
      if (!bool2) {
        openCutout();
      }
    }
  }
  
  private void setPlaceholderTextEnabled(boolean paramBoolean)
  {
    boolean bool = this.placeholderEnabled;
    if (bool == paramBoolean) {
      return;
    }
    if (paramBoolean)
    {
      addPlaceholderTextView();
    }
    else
    {
      removePlaceholderTextView();
      bool = false;
      this.placeholderTextView = null;
    }
    this.placeholderEnabled = paramBoolean;
  }
  
  private boolean shouldUpdateEndDummyDrawable()
  {
    Object localObject = this.endLayout;
    boolean bool = ((EndCompoundLayout)localObject).isErrorIconVisible();
    if (!bool)
    {
      localObject = this.endLayout;
      bool = ((EndCompoundLayout)localObject).hasEndIcon();
      if (bool)
      {
        bool = isEndIconVisible();
        if (bool) {}
      }
      else
      {
        localObject = this.endLayout.getSuffixText();
        if (localObject == null) {
          break label68;
        }
      }
    }
    localObject = this.endLayout;
    int i = ((View)localObject).getMeasuredWidth();
    if (i > 0)
    {
      i = 1;
    }
    else
    {
      label68:
      i = 0;
      localObject = null;
    }
    return i;
  }
  
  private boolean shouldUpdateStartDummyDrawable()
  {
    Object localObject = getStartIconDrawable();
    if (localObject == null)
    {
      localObject = getPrefixText();
      if (localObject != null)
      {
        localObject = getPrefixTextView();
        i = ((View)localObject).getVisibility();
        if (i != 0) {}
      }
    }
    else
    {
      localObject = this.startLayout;
      i = ((View)localObject).getMeasuredWidth();
      if (i > 0) {
        return 1;
      }
    }
    int i = 0;
    localObject = null;
    return i;
  }
  
  private void showPlaceholderText()
  {
    Object localObject1 = this.placeholderTextView;
    if (localObject1 != null)
    {
      boolean bool = this.placeholderEnabled;
      if (bool)
      {
        localObject1 = this.placeholderText;
        bool = TextUtils.isEmpty((CharSequence)localObject1);
        if (!bool)
        {
          localObject1 = this.placeholderTextView;
          Object localObject2 = this.placeholderText;
          ((TextView)localObject1).setText((CharSequence)localObject2);
          localObject1 = this.inputFrame;
          localObject2 = this.placeholderFadeIn;
          TransitionManager.OooO0O0((ViewGroup)localObject1, (Transition)localObject2);
          localObject1 = this.placeholderTextView;
          localObject2 = null;
          ((View)localObject1).setVisibility(0);
          this.placeholderTextView.bringToFront();
          localObject1 = this.placeholderText;
          announceForAccessibility((CharSequence)localObject1);
        }
      }
    }
  }
  
  private void updateBoxCollapsedPaddingTop()
  {
    int i = this.boxBackgroundMode;
    int k = 1;
    if (i == k)
    {
      Object localObject = getContext();
      boolean bool1 = MaterialResources.isFontScaleAtLeast2_0((Context)localObject);
      if (bool1) {
        localObject = getResources();
      }
      for (k = R.dimen.material_font_2_0_box_collapsed_padding_top;; k = R.dimen.material_font_1_3_box_collapsed_padding_top)
      {
        int j = ((Resources)localObject).getDimensionPixelSize(k);
        this.boxCollapsedPaddingTopPx = j;
        break;
        localObject = getContext();
        boolean bool2 = MaterialResources.isFontScaleAtLeast1_3((Context)localObject);
        if (!bool2) {
          break;
        }
        localObject = getResources();
      }
    }
  }
  
  private void updateBoxUnderlineBounds(Rect paramRect)
  {
    MaterialShapeDrawable localMaterialShapeDrawable = this.boxUnderlineDefault;
    int i;
    int j;
    int k;
    if (localMaterialShapeDrawable != null)
    {
      i = paramRect.bottom;
      j = this.boxStrokeWidthDefaultPx;
      j = i - j;
      k = paramRect.left;
      int m = paramRect.right;
      localMaterialShapeDrawable.setBounds(k, j, m, i);
    }
    localMaterialShapeDrawable = this.boxUnderlineFocused;
    if (localMaterialShapeDrawable != null)
    {
      i = paramRect.bottom;
      j = this.boxStrokeWidthFocusedPx;
      j = i - j;
      k = paramRect.left;
      int n = paramRect.right;
      localMaterialShapeDrawable.setBounds(k, j, n, i);
    }
  }
  
  private void updateCounter()
  {
    Object localObject = this.counterView;
    if (localObject != null)
    {
      localObject = this.editText;
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = ((EditText)localObject).getText();
      }
      updateCounter((Editable)localObject);
    }
  }
  
  private static void updateCounterContentDescription(Context paramContext, TextView paramTextView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramBoolean = R.string.character_counter_overflowed_content_description;
    } else {
      paramBoolean = R.string.character_counter_content_description;
    }
    Object localObject = Integer.valueOf(paramInt1);
    Integer localInteger = Integer.valueOf(paramInt2);
    localObject = new Object[] { localObject, localInteger };
    paramContext = paramContext.getString(paramBoolean, (Object[])localObject);
    paramTextView.setContentDescription(paramContext);
  }
  
  private void updateCounterTextAppearanceAndColor()
  {
    Object localObject = this.counterView;
    if (localObject != null)
    {
      boolean bool1 = this.counterOverflowed;
      int i;
      if (bool1) {
        i = this.counterOverflowTextAppearance;
      } else {
        i = this.counterTextAppearance;
      }
      setTextAppearanceCompatWithErrorFallback((TextView)localObject, i);
      boolean bool2 = this.counterOverflowed;
      TextView localTextView;
      if (!bool2)
      {
        localObject = this.counterTextColor;
        if (localObject != null)
        {
          localTextView = this.counterView;
          localTextView.setTextColor((ColorStateList)localObject);
        }
      }
      bool2 = this.counterOverflowed;
      if (bool2)
      {
        localObject = this.counterOverflowTextColor;
        if (localObject != null)
        {
          localTextView = this.counterView;
          localTextView.setTextColor((ColorStateList)localObject);
        }
      }
    }
  }
  
  private void updateCursorColor(boolean paramBoolean)
  {
    Object localObject1 = getContext();
    int i = R.attr.colorControlActivated;
    localObject1 = MaterialColors.getColorStateListOrNull((Context)localObject1, i);
    Object localObject2 = this.editText;
    if (localObject2 != null)
    {
      localObject2 = Oooo0.OooO00o((EditText)localObject2);
      if ((localObject2 != null) && (localObject1 != null))
      {
        localObject2 = Oooo0.OooO00o(this.editText);
        if (paramBoolean)
        {
          ColorStateList localColorStateList = this.strokeErrorColor;
          if (localColorStateList == null)
          {
            paramBoolean = this.boxStrokeColor;
            localColorStateList = ColorStateList.valueOf(paramBoolean);
          }
          localObject1 = localColorStateList;
        }
        DrawableCompat.OooOOOO((Drawable)localObject2, (ColorStateList)localObject1);
      }
    }
  }
  
  private boolean updateEditTextHeightBasedOnIcon()
  {
    Object localObject = this.editText;
    if (localObject == null) {
      return false;
    }
    localObject = this.endLayout;
    int i = ((View)localObject).getMeasuredHeight();
    int j = this.startLayout.getMeasuredHeight();
    i = Math.max(i, j);
    EditText localEditText = this.editText;
    j = localEditText.getMeasuredHeight();
    if (j < i)
    {
      this.editText.setMinimumHeight(i);
      return true;
    }
    return false;
  }
  
  private void updateInputLayoutMargins()
  {
    int i = this.boxBackgroundMode;
    int j = 1;
    if (i != j)
    {
      Object localObject = (LinearLayout.LayoutParams)this.inputFrame.getLayoutParams();
      j = calculateLabelMarginTop();
      int k = ((LinearLayout.LayoutParams)localObject).topMargin;
      if (j != k)
      {
        ((LinearLayout.LayoutParams)localObject).topMargin = j;
        localObject = this.inputFrame;
        ((View)localObject).requestLayout();
      }
    }
  }
  
  private void updateLabelState(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool1 = isEnabled();
    Object localObject1 = this.editText;
    boolean bool3 = true;
    int j = 0;
    Object localObject2 = null;
    if (localObject1 != null)
    {
      localObject1 = ((EditText)localObject1).getText();
      bool4 = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool4)
      {
        bool4 = bool3;
        break label57;
      }
    }
    boolean bool4 = false;
    localObject1 = null;
    label57:
    Object localObject3 = this.editText;
    if (localObject3 != null)
    {
      boolean bool5 = ((View)localObject3).hasFocus();
      if (bool5) {}
    }
    else
    {
      bool3 = false;
    }
    localObject2 = this.defaultHintTextColor;
    if (localObject2 != null)
    {
      localObject3 = this.collapsingTextHelper;
      ((CollapsingTextHelper)localObject3).setCollapsedAndExpandedTextColor((ColorStateList)localObject2);
    }
    int i;
    if (!bool1)
    {
      localObject4 = this.defaultHintTextColor;
      if (localObject4 != null)
      {
        j = -16842910;
        localObject2 = new int[] { j };
        int k = this.disabledColor;
        i = ((ColorStateList)localObject4).getColorForState((int[])localObject2, k);
      }
      else
      {
        i = this.disabledColor;
      }
      localObject2 = this.collapsingTextHelper;
    }
    boolean bool2;
    for (Object localObject4 = ColorStateList.valueOf(i);; localObject4 = ((TextView)localObject4).getTextColors())
    {
      ((CollapsingTextHelper)localObject2).setCollapsedAndExpandedTextColor((ColorStateList)localObject4);
      break label285;
      bool2 = shouldShowError();
      if (bool2)
      {
        localObject4 = this.collapsingTextHelper;
        localObject2 = this.indicatorViewController.getErrorViewTextColors();
        ((CollapsingTextHelper)localObject4).setCollapsedAndExpandedTextColor((ColorStateList)localObject2);
        break label285;
      }
      bool2 = this.counterOverflowed;
      if (!bool2) {
        break;
      }
      localObject4 = this.counterView;
      if (localObject4 == null) {
        break;
      }
      localObject2 = this.collapsingTextHelper;
    }
    if (bool3)
    {
      localObject4 = this.focusedTextColor;
      if (localObject4 != null)
      {
        localObject2 = this.collapsingTextHelper;
        ((CollapsingTextHelper)localObject2).setCollapsedTextColor((ColorStateList)localObject4);
      }
    }
    label285:
    if (!bool4)
    {
      bool2 = this.expandedHintEnabled;
      if (bool2)
      {
        bool2 = isEnabled();
        if ((!bool2) || (!bool3))
        {
          if (!paramBoolean2)
          {
            paramBoolean2 = this.hintExpanded;
            if (paramBoolean2) {
              return;
            }
          }
          expandHint(paramBoolean1);
          return;
        }
      }
    }
    if (!paramBoolean2)
    {
      paramBoolean2 = this.hintExpanded;
      if (!paramBoolean2) {}
    }
    else
    {
      collapseHint(paramBoolean1);
    }
  }
  
  private void updatePlaceholderMeasurementsBasedOnEditText()
  {
    Object localObject = this.placeholderTextView;
    if (localObject != null)
    {
      localObject = this.editText;
      if (localObject != null)
      {
        int i = ((TextView)localObject).getGravity();
        this.placeholderTextView.setGravity(i);
        localObject = this.placeholderTextView;
        EditText localEditText1 = this.editText;
        int j = localEditText1.getCompoundPaddingLeft();
        EditText localEditText2 = this.editText;
        int k = localEditText2.getCompoundPaddingTop();
        EditText localEditText3 = this.editText;
        int m = localEditText3.getCompoundPaddingRight();
        EditText localEditText4 = this.editText;
        int n = localEditText4.getCompoundPaddingBottom();
        ((TextView)localObject).setPadding(j, k, m, n);
      }
    }
  }
  
  private void updatePlaceholderText()
  {
    Object localObject = this.editText;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((EditText)localObject).getText();
    }
    updatePlaceholderText((Editable)localObject);
  }
  
  private void updatePlaceholderText(Editable paramEditable)
  {
    TextInputLayout.LengthCounter localLengthCounter = this.lengthCounter;
    int i = localLengthCounter.countLength(paramEditable);
    if (i == 0)
    {
      boolean bool = this.hintExpanded;
      if (!bool)
      {
        showPlaceholderText();
        return;
      }
    }
    hidePlaceholderText();
  }
  
  private void updateStrokeErrorColor(boolean paramBoolean1, boolean paramBoolean2)
  {
    ColorStateList localColorStateList1 = this.strokeErrorColor;
    int i = localColorStateList1.getDefaultColor();
    ColorStateList localColorStateList2 = this.strokeErrorColor;
    int j = 16842910;
    Object localObject = { 16843623, j };
    int k = localColorStateList2.getColorForState((int[])localObject, i);
    localObject = this.strokeErrorColor;
    int m = 16843518;
    int[] arrayOfInt = { m, j };
    int n = ((ColorStateList)localObject).getColorForState(arrayOfInt, i);
    if (paramBoolean1) {
      this.boxStrokeColor = n;
    } else if (paramBoolean2) {
      this.boxStrokeColor = k;
    } else {
      this.boxStrokeColor = i;
    }
  }
  
  public void addOnEditTextAttachedListener(TextInputLayout.OnEditTextAttachedListener paramOnEditTextAttachedListener)
  {
    this.editTextAttachedListeners.add(paramOnEditTextAttachedListener);
    EditText localEditText = this.editText;
    if (localEditText != null) {
      paramOnEditTextAttachedListener.onEditTextAttached(this);
    }
  }
  
  public void addOnEndIconChangedListener(TextInputLayout.OnEndIconChangedListener paramOnEndIconChangedListener)
  {
    this.endLayout.addOnEndIconChangedListener(paramOnEndIconChangedListener);
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = paramView instanceof EditText;
    if (bool)
    {
      Object localObject = new android/widget/FrameLayout$LayoutParams;
      ((FrameLayout.LayoutParams)localObject).<init>(paramLayoutParams);
      int i = ((FrameLayout.LayoutParams)localObject).gravity & 0xFFFFFF8F | 0x10;
      ((FrameLayout.LayoutParams)localObject).gravity = i;
      FrameLayout localFrameLayout = this.inputFrame;
      localFrameLayout.addView((View)paramView, (ViewGroup.LayoutParams)localObject);
      localObject = this.inputFrame;
      ((View)localObject).setLayoutParams(paramLayoutParams);
      updateInputLayoutMargins();
      paramView = (EditText)paramView;
      setEditText(paramView);
    }
    else
    {
      super.addView(paramView, paramInt, paramLayoutParams);
    }
  }
  
  public void animateToExpansionFraction(float paramFloat)
  {
    Object localObject1 = this.collapsingTextHelper;
    float f1 = ((CollapsingTextHelper)localObject1).getExpansionFraction();
    boolean bool = f1 < paramFloat;
    if (!bool) {
      return;
    }
    localObject1 = this.animator;
    if (localObject1 == null)
    {
      localObject1 = new android/animation/ValueAnimator;
      ((ValueAnimator)localObject1).<init>();
      this.animator = ((ValueAnimator)localObject1);
      localObject2 = getContext();
      int i = R.attr.motionEasingEmphasizedInterpolator;
      TimeInterpolator localTimeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
      localObject2 = MotionUtils.resolveThemeInterpolator((Context)localObject2, i, localTimeInterpolator);
      ((ValueAnimator)localObject1).setInterpolator((TimeInterpolator)localObject2);
      localObject1 = this.animator;
      localObject2 = getContext();
      i = R.attr.motionDurationMedium4;
      int j = 167;
      int k = MotionUtils.resolveThemeDuration((Context)localObject2, i, j);
      long l = k;
      ((ValueAnimator)localObject1).setDuration(l);
      localObject1 = this.animator;
      localObject2 = new com/google/android/material/textfield/TextInputLayout$4;
      ((TextInputLayout.4)localObject2).<init>(this);
      ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    }
    localObject1 = this.animator;
    Object localObject2 = new float[2];
    float f2 = this.collapsingTextHelper.getExpansionFraction();
    localObject2[0] = f2;
    localObject2[1] = paramFloat;
    ((ValueAnimator)localObject1).setFloatValues((float[])localObject2);
    this.animator.start();
  }
  
  public void clearOnEditTextAttachedListeners()
  {
    this.editTextAttachedListeners.clear();
  }
  
  public void clearOnEndIconChangedListeners()
  {
    this.endLayout.clearOnEndIconChangedListeners();
  }
  
  public boolean cutoutIsOpen()
  {
    boolean bool = cutoutEnabled();
    if (bool)
    {
      localCutoutDrawable = (CutoutDrawable)this.boxBackground;
      bool = localCutoutDrawable.hasCutout();
      if (bool) {
        return true;
      }
    }
    bool = false;
    CutoutDrawable localCutoutDrawable = null;
    return bool;
  }
  
  public void dispatchProvideAutofillStructure(ViewStructure paramViewStructure, int paramInt)
  {
    Object localObject1 = this.editText;
    if (localObject1 == null)
    {
      super.dispatchProvideAutofillStructure(paramViewStructure, paramInt);
      return;
    }
    Object localObject2 = this.originalHint;
    int i = 0;
    EditText localEditText = null;
    boolean bool;
    Object localObject3;
    if (localObject2 != null)
    {
      bool = this.isProvidingHint;
      this.isProvidingHint = false;
      localObject1 = ((TextView)localObject1).getHint();
      localEditText = this.editText;
      localObject3 = this.originalHint;
      localEditText.setHint((CharSequence)localObject3);
    }
    try
    {
      super.dispatchProvideAutofillStructure(paramViewStructure, paramInt);
      paramViewStructure = this.editText;
      paramViewStructure.setHint((CharSequence)localObject1);
      this.isProvidingHint = bool;
    }
    finally
    {
      this.editText.setHint((CharSequence)localObject1);
      this.isProvidingHint = bool;
    }
    onProvideAutofillStructure(paramViewStructure, paramInt);
    onProvideAutofillVirtualStructure(paramViewStructure, paramInt);
    localObject1 = this.inputFrame;
    int j = ((ViewGroup)localObject1).getChildCount();
    paramViewStructure.setChildCount(j);
    for (;;)
    {
      localObject1 = this.inputFrame;
      j = ((ViewGroup)localObject1).getChildCount();
      if (i >= j) {
        break;
      }
      localObject1 = this.inputFrame.getChildAt(i);
      localObject2 = paramViewStructure.newChild(i);
      ((View)localObject1).dispatchProvideAutofillStructure((ViewStructure)localObject2, paramInt);
      localObject3 = this.editText;
      if (localObject1 == localObject3)
      {
        localObject1 = getHint();
        ((ViewStructure)localObject2).setHint((CharSequence)localObject1);
      }
      i += 1;
    }
  }
  
  public void dispatchRestoreInstanceState(SparseArray paramSparseArray)
  {
    this.restoringSavedState = true;
    super.dispatchRestoreInstanceState(paramSparseArray);
    this.restoringSavedState = false;
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    drawHint(paramCanvas);
    drawBoxUnderline(paramCanvas);
  }
  
  public void drawableStateChanged()
  {
    boolean bool1 = this.inDrawableStateChanged;
    if (bool1) {
      return;
    }
    bool1 = true;
    this.inDrawableStateChanged = bool1;
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    Object localObject = this.collapsingTextHelper;
    boolean bool2;
    if (localObject != null)
    {
      bool2 = ((CollapsingTextHelper)localObject).setState(arrayOfInt) | false;
    }
    else
    {
      bool2 = false;
      arrayOfInt = null;
    }
    localObject = this.editText;
    if (localObject != null)
    {
      boolean bool3 = ViewCompat.OoooOOO(this);
      if (bool3)
      {
        bool3 = isEnabled();
        if (bool3) {}
      }
      else
      {
        bool1 = false;
      }
      updateLabelState(bool1);
    }
    updateEditTextBackground();
    updateTextInputBoxState();
    if (bool2) {
      invalidate();
    }
    this.inDrawableStateChanged = false;
  }
  
  public int getBaseline()
  {
    EditText localEditText = this.editText;
    if (localEditText != null)
    {
      int i = localEditText.getBaseline();
      int j = getPaddingTop();
      i += j;
      j = calculateLabelMarginTop();
      return i + j;
    }
    return super.getBaseline();
  }
  
  public MaterialShapeDrawable getBoxBackground()
  {
    int i = this.boxBackgroundMode;
    int j = 1;
    if (i != j)
    {
      j = 2;
      if (i != j)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>();
        throw localIllegalStateException;
      }
    }
    return this.boxBackground;
  }
  
  public int getBoxBackgroundColor()
  {
    return this.boxBackgroundColor;
  }
  
  public int getBoxBackgroundMode()
  {
    return this.boxBackgroundMode;
  }
  
  public int getBoxCollapsedPaddingTop()
  {
    return this.boxCollapsedPaddingTopPx;
  }
  
  public float getBoxCornerRadiusBottomEnd()
  {
    boolean bool = ViewUtils.isLayoutRtl(this);
    CornerSize localCornerSize;
    if (bool) {
      localCornerSize = this.shapeAppearanceModel.getBottomLeftCornerSize();
    } else {
      localCornerSize = this.shapeAppearanceModel.getBottomRightCornerSize();
    }
    RectF localRectF = this.tmpRectF;
    return localCornerSize.getCornerSize(localRectF);
  }
  
  public float getBoxCornerRadiusBottomStart()
  {
    boolean bool = ViewUtils.isLayoutRtl(this);
    CornerSize localCornerSize;
    if (bool) {
      localCornerSize = this.shapeAppearanceModel.getBottomRightCornerSize();
    } else {
      localCornerSize = this.shapeAppearanceModel.getBottomLeftCornerSize();
    }
    RectF localRectF = this.tmpRectF;
    return localCornerSize.getCornerSize(localRectF);
  }
  
  public float getBoxCornerRadiusTopEnd()
  {
    boolean bool = ViewUtils.isLayoutRtl(this);
    CornerSize localCornerSize;
    if (bool) {
      localCornerSize = this.shapeAppearanceModel.getTopLeftCornerSize();
    } else {
      localCornerSize = this.shapeAppearanceModel.getTopRightCornerSize();
    }
    RectF localRectF = this.tmpRectF;
    return localCornerSize.getCornerSize(localRectF);
  }
  
  public float getBoxCornerRadiusTopStart()
  {
    boolean bool = ViewUtils.isLayoutRtl(this);
    CornerSize localCornerSize;
    if (bool) {
      localCornerSize = this.shapeAppearanceModel.getTopRightCornerSize();
    } else {
      localCornerSize = this.shapeAppearanceModel.getTopLeftCornerSize();
    }
    RectF localRectF = this.tmpRectF;
    return localCornerSize.getCornerSize(localRectF);
  }
  
  public int getBoxStrokeColor()
  {
    return this.focusedStrokeColor;
  }
  
  public ColorStateList getBoxStrokeErrorColor()
  {
    return this.strokeErrorColor;
  }
  
  public int getBoxStrokeWidth()
  {
    return this.boxStrokeWidthDefaultPx;
  }
  
  public int getBoxStrokeWidthFocused()
  {
    return this.boxStrokeWidthFocusedPx;
  }
  
  public int getCounterMaxLength()
  {
    return this.counterMaxLength;
  }
  
  public CharSequence getCounterOverflowDescription()
  {
    boolean bool = this.counterEnabled;
    if (bool)
    {
      bool = this.counterOverflowed;
      if (bool)
      {
        TextView localTextView = this.counterView;
        if (localTextView != null) {
          return localTextView.getContentDescription();
        }
      }
    }
    return null;
  }
  
  public ColorStateList getCounterOverflowTextColor()
  {
    return this.counterOverflowTextColor;
  }
  
  public ColorStateList getCounterTextColor()
  {
    return this.counterTextColor;
  }
  
  public ColorStateList getDefaultHintTextColor()
  {
    return this.defaultHintTextColor;
  }
  
  public EditText getEditText()
  {
    return this.editText;
  }
  
  public CharSequence getEndIconContentDescription()
  {
    return this.endLayout.getEndIconContentDescription();
  }
  
  public Drawable getEndIconDrawable()
  {
    return this.endLayout.getEndIconDrawable();
  }
  
  public int getEndIconMinSize()
  {
    return this.endLayout.getEndIconMinSize();
  }
  
  public int getEndIconMode()
  {
    return this.endLayout.getEndIconMode();
  }
  
  public ImageView.ScaleType getEndIconScaleType()
  {
    return this.endLayout.getEndIconScaleType();
  }
  
  public CheckableImageButton getEndIconView()
  {
    return this.endLayout.getEndIconView();
  }
  
  public CharSequence getError()
  {
    Object localObject = this.indicatorViewController;
    boolean bool = ((IndicatorViewController)localObject).isErrorEnabled();
    if (bool)
    {
      localObject = this.indicatorViewController.getErrorText();
    }
    else
    {
      bool = false;
      localObject = null;
    }
    return localObject;
  }
  
  public int getErrorAccessibilityLiveRegion()
  {
    return this.indicatorViewController.getErrorAccessibilityLiveRegion();
  }
  
  public CharSequence getErrorContentDescription()
  {
    return this.indicatorViewController.getErrorContentDescription();
  }
  
  public int getErrorCurrentTextColors()
  {
    return this.indicatorViewController.getErrorViewCurrentTextColor();
  }
  
  public Drawable getErrorIconDrawable()
  {
    return this.endLayout.getErrorIconDrawable();
  }
  
  public CharSequence getHelperText()
  {
    Object localObject = this.indicatorViewController;
    boolean bool = ((IndicatorViewController)localObject).isHelperTextEnabled();
    if (bool)
    {
      localObject = this.indicatorViewController.getHelperText();
    }
    else
    {
      bool = false;
      localObject = null;
    }
    return localObject;
  }
  
  public int getHelperTextCurrentTextColor()
  {
    return this.indicatorViewController.getHelperTextViewCurrentTextColor();
  }
  
  public CharSequence getHint()
  {
    boolean bool = this.hintEnabled;
    CharSequence localCharSequence;
    if (bool)
    {
      localCharSequence = this.hint;
    }
    else
    {
      bool = false;
      localCharSequence = null;
    }
    return localCharSequence;
  }
  
  public final float getHintCollapsedTextHeight()
  {
    return this.collapsingTextHelper.getCollapsedTextHeight();
  }
  
  public final int getHintCurrentCollapsedTextColor()
  {
    return this.collapsingTextHelper.getCurrentCollapsedTextColor();
  }
  
  public ColorStateList getHintTextColor()
  {
    return this.focusedTextColor;
  }
  
  public TextInputLayout.LengthCounter getLengthCounter()
  {
    return this.lengthCounter;
  }
  
  public int getMaxEms()
  {
    return this.maxEms;
  }
  
  public int getMaxWidth()
  {
    return this.maxWidth;
  }
  
  public int getMinEms()
  {
    return this.minEms;
  }
  
  public int getMinWidth()
  {
    return this.minWidth;
  }
  
  public CharSequence getPasswordVisibilityToggleContentDescription()
  {
    return this.endLayout.getPasswordVisibilityToggleContentDescription();
  }
  
  public Drawable getPasswordVisibilityToggleDrawable()
  {
    return this.endLayout.getPasswordVisibilityToggleDrawable();
  }
  
  public CharSequence getPlaceholderText()
  {
    boolean bool = this.placeholderEnabled;
    CharSequence localCharSequence;
    if (bool)
    {
      localCharSequence = this.placeholderText;
    }
    else
    {
      bool = false;
      localCharSequence = null;
    }
    return localCharSequence;
  }
  
  public int getPlaceholderTextAppearance()
  {
    return this.placeholderTextAppearance;
  }
  
  public ColorStateList getPlaceholderTextColor()
  {
    return this.placeholderTextColor;
  }
  
  public CharSequence getPrefixText()
  {
    return this.startLayout.getPrefixText();
  }
  
  public ColorStateList getPrefixTextColor()
  {
    return this.startLayout.getPrefixTextColor();
  }
  
  public TextView getPrefixTextView()
  {
    return this.startLayout.getPrefixTextView();
  }
  
  public ShapeAppearanceModel getShapeAppearanceModel()
  {
    return this.shapeAppearanceModel;
  }
  
  public CharSequence getStartIconContentDescription()
  {
    return this.startLayout.getStartIconContentDescription();
  }
  
  public Drawable getStartIconDrawable()
  {
    return this.startLayout.getStartIconDrawable();
  }
  
  public int getStartIconMinSize()
  {
    return this.startLayout.getStartIconMinSize();
  }
  
  public ImageView.ScaleType getStartIconScaleType()
  {
    return this.startLayout.getStartIconScaleType();
  }
  
  public CharSequence getSuffixText()
  {
    return this.endLayout.getSuffixText();
  }
  
  public ColorStateList getSuffixTextColor()
  {
    return this.endLayout.getSuffixTextColor();
  }
  
  public TextView getSuffixTextView()
  {
    return this.endLayout.getSuffixTextView();
  }
  
  public Typeface getTypeface()
  {
    return this.typeface;
  }
  
  public boolean isCounterEnabled()
  {
    return this.counterEnabled;
  }
  
  public boolean isEndIconCheckable()
  {
    return this.endLayout.isEndIconCheckable();
  }
  
  public boolean isEndIconVisible()
  {
    return this.endLayout.isEndIconVisible();
  }
  
  public boolean isErrorEnabled()
  {
    return this.indicatorViewController.isErrorEnabled();
  }
  
  public boolean isExpandedHintEnabled()
  {
    return this.expandedHintEnabled;
  }
  
  public final boolean isHelperTextDisplayed()
  {
    return this.indicatorViewController.helperTextIsDisplayed();
  }
  
  public boolean isHelperTextEnabled()
  {
    return this.indicatorViewController.isHelperTextEnabled();
  }
  
  public boolean isHintAnimationEnabled()
  {
    return this.hintAnimationEnabled;
  }
  
  public boolean isHintEnabled()
  {
    return this.hintEnabled;
  }
  
  public final boolean isHintExpanded()
  {
    return this.hintExpanded;
  }
  
  public boolean isPasswordVisibilityToggleEnabled()
  {
    return this.endLayout.isPasswordVisibilityToggleEnabled();
  }
  
  public boolean isProvidingHint()
  {
    return this.isProvidingHint;
  }
  
  public boolean isStartIconCheckable()
  {
    return this.startLayout.isStartIconCheckable();
  }
  
  public boolean isStartIconVisible()
  {
    return this.startLayout.isStartIconVisible();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.collapsingTextHelper.maybeUpdateFontWeightAdjustment(paramConfiguration);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    Object localObject1 = this.editText;
    if (localObject1 != null)
    {
      Rect localRect = this.tmpRect;
      DescendantOffsetUtils.getDescendantRect(this, (View)localObject1, localRect);
      updateBoxUnderlineBounds(localRect);
      paramBoolean = this.hintEnabled;
      if (paramBoolean)
      {
        localObject1 = this.collapsingTextHelper;
        float f = this.editText.getTextSize();
        ((CollapsingTextHelper)localObject1).setExpandedTextSize(f);
        paramBoolean = this.editText.getGravity();
        Object localObject2 = this.collapsingTextHelper;
        paramInt3 = paramBoolean & true | true;
        ((CollapsingTextHelper)localObject2).setCollapsedTextGravity(paramInt3);
        this.collapsingTextHelper.setExpandedTextGravity(paramBoolean);
        localObject1 = this.collapsingTextHelper;
        localObject2 = calculateCollapsedTextBounds(localRect);
        ((CollapsingTextHelper)localObject1).setCollapsedBounds((Rect)localObject2);
        localObject1 = this.collapsingTextHelper;
        localRect = calculateExpandedTextBounds(localRect);
        ((CollapsingTextHelper)localObject1).setExpandedBounds(localRect);
        localObject1 = this.collapsingTextHelper;
        ((CollapsingTextHelper)localObject1).recalculate();
        paramBoolean = cutoutEnabled();
        if (paramBoolean)
        {
          paramBoolean = this.hintExpanded;
          if (!paramBoolean) {
            openCutout();
          }
        }
      }
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    paramInt1 = updateEditTextHeightBasedOnIcon();
    paramInt2 = updateDummyDrawables();
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      EditText localEditText = this.editText;
      TextInputLayout.3 local3 = new com/google/android/material/textfield/TextInputLayout$3;
      local3.<init>(this);
      localEditText.post(local3);
    }
    updatePlaceholderMeasurementsBasedOnEditText();
    this.endLayout.updateSuffixTextViewPadding();
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool1 = paramParcelable instanceof TextInputLayout.SavedState;
    if (!bool1)
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (TextInputLayout.SavedState)paramParcelable;
    Object localObject = paramParcelable.getSuperState();
    super.onRestoreInstanceState((Parcelable)localObject);
    localObject = paramParcelable.error;
    setError((CharSequence)localObject);
    boolean bool2 = paramParcelable.isEndIconChecked;
    if (bool2)
    {
      paramParcelable = new com/google/android/material/textfield/TextInputLayout$2;
      paramParcelable.<init>(this);
      post(paramParcelable);
    }
    requestLayout();
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    super.onRtlPropertiesChanged(paramInt);
    int i = 1;
    if (paramInt != i) {
      i = 0;
    }
    paramInt = this.areCornerRadiiRtl;
    if (i != paramInt)
    {
      Object localObject1 = this.shapeAppearanceModel.getTopLeftCornerSize();
      Object localObject2 = this.tmpRectF;
      float f1 = ((CornerSize)localObject1).getCornerSize((RectF)localObject2);
      localObject2 = this.shapeAppearanceModel.getTopRightCornerSize();
      Object localObject3 = this.tmpRectF;
      float f2 = ((CornerSize)localObject2).getCornerSize((RectF)localObject3);
      localObject3 = this.shapeAppearanceModel.getBottomLeftCornerSize();
      Object localObject4 = this.tmpRectF;
      float f3 = ((CornerSize)localObject3).getCornerSize((RectF)localObject4);
      localObject4 = this.shapeAppearanceModel.getBottomRightCornerSize();
      Object localObject5 = this.tmpRectF;
      float f4 = ((CornerSize)localObject4).getCornerSize((RectF)localObject5);
      localObject5 = this.shapeAppearanceModel.getTopLeftCorner();
      Object localObject6 = this.shapeAppearanceModel.getTopRightCorner();
      CornerTreatment localCornerTreatment1 = this.shapeAppearanceModel.getBottomLeftCorner();
      CornerTreatment localCornerTreatment2 = this.shapeAppearanceModel.getBottomRightCorner();
      ShapeAppearanceModel.Builder localBuilder = ShapeAppearanceModel.builder();
      localObject6 = localBuilder.setTopLeftCorner((CornerTreatment)localObject6);
      localObject5 = ((ShapeAppearanceModel.Builder)localObject6).setTopRightCorner((CornerTreatment)localObject5).setBottomLeftCorner(localCornerTreatment2).setBottomRightCorner(localCornerTreatment1);
      localObject2 = ((ShapeAppearanceModel.Builder)localObject5).setTopLeftCornerSize(f2);
      localObject1 = ((ShapeAppearanceModel.Builder)localObject2).setTopRightCornerSize(f1).setBottomLeftCornerSize(f4).setBottomRightCornerSize(f3).build();
      this.areCornerRadiiRtl = i;
      setShapeAppearanceModel((ShapeAppearanceModel)localObject1);
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    Object localObject = super.onSaveInstanceState();
    TextInputLayout.SavedState localSavedState = new com/google/android/material/textfield/TextInputLayout$SavedState;
    localSavedState.<init>((Parcelable)localObject);
    boolean bool = shouldShowError();
    if (bool)
    {
      localObject = getError();
      localSavedState.error = ((CharSequence)localObject);
    }
    bool = this.endLayout.isEndIconChecked();
    localSavedState.isEndIconChecked = bool;
    return localSavedState;
  }
  
  public void passwordVisibilityToggleRequested(boolean paramBoolean)
  {
    this.endLayout.togglePasswordVisibilityToggle(paramBoolean);
  }
  
  public void refreshEndIconDrawableState()
  {
    this.endLayout.refreshEndIconDrawableState();
  }
  
  public void refreshErrorIconDrawableState()
  {
    this.endLayout.refreshErrorIconDrawableState();
  }
  
  public void refreshStartIconDrawableState()
  {
    this.startLayout.refreshStartIconDrawableState();
  }
  
  public void removeOnEditTextAttachedListener(TextInputLayout.OnEditTextAttachedListener paramOnEditTextAttachedListener)
  {
    this.editTextAttachedListeners.remove(paramOnEditTextAttachedListener);
  }
  
  public void removeOnEndIconChangedListener(TextInputLayout.OnEndIconChangedListener paramOnEndIconChangedListener)
  {
    this.endLayout.removeOnEndIconChangedListener(paramOnEndIconChangedListener);
  }
  
  public void setBoxBackgroundColor(int paramInt)
  {
    int i = this.boxBackgroundColor;
    if (i != paramInt)
    {
      this.boxBackgroundColor = paramInt;
      this.defaultFilledBackgroundColor = paramInt;
      this.focusedFilledBackgroundColor = paramInt;
      this.hoveredFilledBackgroundColor = paramInt;
      applyBoxAttributes();
    }
  }
  
  public void setBoxBackgroundColorResource(int paramInt)
  {
    paramInt = ContextCompat.OooO0OO(getContext(), paramInt);
    setBoxBackgroundColor(paramInt);
  }
  
  public void setBoxBackgroundColorStateList(ColorStateList paramColorStateList)
  {
    int i = paramColorStateList.getDefaultColor();
    this.defaultFilledBackgroundColor = i;
    this.boxBackgroundColor = i;
    int[] arrayOfInt = { -16842910 };
    int j = -1;
    i = paramColorStateList.getColorForState(arrayOfInt, j);
    this.disabledFilledBackgroundColor = i;
    int k = 16842910;
    arrayOfInt = new int[] { 16842908, k };
    i = paramColorStateList.getColorForState(arrayOfInt, j);
    this.focusedFilledBackgroundColor = i;
    arrayOfInt = new int[] { 16843623, k };
    int m = paramColorStateList.getColorForState(arrayOfInt, j);
    this.hoveredFilledBackgroundColor = m;
    applyBoxAttributes();
  }
  
  public void setBoxBackgroundMode(int paramInt)
  {
    int i = this.boxBackgroundMode;
    if (paramInt == i) {
      return;
    }
    this.boxBackgroundMode = paramInt;
    EditText localEditText = this.editText;
    if (localEditText != null) {
      onApplyBoxBackgroundMode();
    }
  }
  
  public void setBoxCollapsedPaddingTop(int paramInt)
  {
    this.boxCollapsedPaddingTopPx = paramInt;
  }
  
  public void setBoxCornerFamily(int paramInt)
  {
    ShapeAppearanceModel.Builder localBuilder = this.shapeAppearanceModel.toBuilder();
    CornerSize localCornerSize = this.shapeAppearanceModel.getTopLeftCornerSize();
    localBuilder = localBuilder.setTopLeftCorner(paramInt, localCornerSize);
    localCornerSize = this.shapeAppearanceModel.getTopRightCornerSize();
    localBuilder = localBuilder.setTopRightCorner(paramInt, localCornerSize);
    localCornerSize = this.shapeAppearanceModel.getBottomLeftCornerSize();
    localBuilder = localBuilder.setBottomLeftCorner(paramInt, localCornerSize);
    localCornerSize = this.shapeAppearanceModel.getBottomRightCornerSize();
    ShapeAppearanceModel localShapeAppearanceModel = localBuilder.setBottomRightCorner(paramInt, localCornerSize).build();
    this.shapeAppearanceModel = localShapeAppearanceModel;
    applyBoxAttributes();
  }
  
  public void setBoxCornerRadii(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    boolean bool1 = ViewUtils.isLayoutRtl(this);
    this.areCornerRadiiRtl = bool1;
    float f;
    if (bool1) {
      f = paramFloat2;
    } else {
      f = paramFloat1;
    }
    if (!bool1) {
      paramFloat1 = paramFloat2;
    }
    if (bool1) {
      paramFloat2 = paramFloat4;
    } else {
      paramFloat2 = paramFloat3;
    }
    if (!bool1) {
      paramFloat3 = paramFloat4;
    }
    Object localObject = this.boxBackground;
    if (localObject != null)
    {
      paramFloat4 = ((MaterialShapeDrawable)localObject).getTopLeftCornerResolvedSize();
      boolean bool2 = paramFloat4 < f;
      if (!bool2)
      {
        localObject = this.boxBackground;
        paramFloat4 = ((MaterialShapeDrawable)localObject).getTopRightCornerResolvedSize();
        bool2 = paramFloat4 < paramFloat1;
        if (!bool2)
        {
          localObject = this.boxBackground;
          paramFloat4 = ((MaterialShapeDrawable)localObject).getBottomLeftCornerResolvedSize();
          bool2 = paramFloat4 < paramFloat2;
          if (!bool2)
          {
            localObject = this.boxBackground;
            paramFloat4 = ((MaterialShapeDrawable)localObject).getBottomRightCornerResolvedSize();
            bool2 = paramFloat4 < paramFloat3;
            if (!bool2) {
              return;
            }
          }
        }
      }
    }
    localObject = this.shapeAppearanceModel.toBuilder().setTopLeftCornerSize(f);
    ShapeAppearanceModel localShapeAppearanceModel = ((ShapeAppearanceModel.Builder)localObject).setTopRightCornerSize(paramFloat1).setBottomLeftCornerSize(paramFloat2).setBottomRightCornerSize(paramFloat3).build();
    this.shapeAppearanceModel = localShapeAppearanceModel;
    applyBoxAttributes();
  }
  
  public void setBoxCornerRadiiResources(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f1 = getContext().getResources().getDimension(paramInt1);
    float f2 = getContext().getResources().getDimension(paramInt2);
    float f3 = getContext().getResources().getDimension(paramInt4);
    float f4 = getContext().getResources().getDimension(paramInt3);
    setBoxCornerRadii(f1, f2, f3, f4);
  }
  
  public void setBoxStrokeColor(int paramInt)
  {
    int i = this.focusedStrokeColor;
    if (i != paramInt)
    {
      this.focusedStrokeColor = paramInt;
      updateTextInputBoxState();
    }
  }
  
  public void setBoxStrokeColorStateList(ColorStateList paramColorStateList)
  {
    boolean bool = paramColorStateList.isStateful();
    int i;
    int[] arrayOfInt;
    int j;
    if (bool)
    {
      i = paramColorStateList.getDefaultColor();
      this.defaultStrokeColor = i;
      arrayOfInt = new int[] { -16842910 };
      j = -1;
      i = paramColorStateList.getColorForState(arrayOfInt, j);
      this.disabledColor = i;
      int k = 16842910;
      arrayOfInt = new int[] { 16843623, k };
      i = paramColorStateList.getColorForState(arrayOfInt, j);
      this.hoveredStrokeColor = i;
      i = 16842908;
      arrayOfInt = new int[] { i, k };
    }
    for (int m = paramColorStateList.getColorForState(arrayOfInt, j);; m = paramColorStateList.getDefaultColor())
    {
      this.focusedStrokeColor = m;
      break;
      i = this.focusedStrokeColor;
      j = paramColorStateList.getDefaultColor();
      if (i == j) {
        break;
      }
    }
    updateTextInputBoxState();
  }
  
  public void setBoxStrokeErrorColor(ColorStateList paramColorStateList)
  {
    ColorStateList localColorStateList = this.strokeErrorColor;
    if (localColorStateList != paramColorStateList)
    {
      this.strokeErrorColor = paramColorStateList;
      updateTextInputBoxState();
    }
  }
  
  public void setBoxStrokeWidth(int paramInt)
  {
    this.boxStrokeWidthDefaultPx = paramInt;
    updateTextInputBoxState();
  }
  
  public void setBoxStrokeWidthFocused(int paramInt)
  {
    this.boxStrokeWidthFocusedPx = paramInt;
    updateTextInputBoxState();
  }
  
  public void setBoxStrokeWidthFocusedResource(int paramInt)
  {
    paramInt = getResources().getDimensionPixelSize(paramInt);
    setBoxStrokeWidthFocused(paramInt);
  }
  
  public void setBoxStrokeWidthResource(int paramInt)
  {
    paramInt = getResources().getDimensionPixelSize(paramInt);
    setBoxStrokeWidth(paramInt);
  }
  
  public void setCounterEnabled(boolean paramBoolean)
  {
    boolean bool = this.counterEnabled;
    if (bool != paramBoolean)
    {
      int i = 2;
      Object localObject1;
      Object localObject2;
      ViewGroup.MarginLayoutParams localMarginLayoutParams;
      if (paramBoolean)
      {
        localObject1 = new androidx/appcompat/widget/AppCompatTextView;
        localObject2 = getContext();
        ((AppCompatTextView)localObject1).<init>((Context)localObject2);
        this.counterView = ((TextView)localObject1);
        int j = R.id.textinput_counter;
        ((View)localObject1).setId(j);
        localObject1 = this.typeface;
        if (localObject1 != null)
        {
          localObject2 = this.counterView;
          ((TextView)localObject2).setTypeface((Typeface)localObject1);
        }
        this.counterView.setMaxLines(1);
        localObject1 = this.indicatorViewController;
        localObject2 = this.counterView;
        ((IndicatorViewController)localObject1).addIndicator((TextView)localObject2, i);
        localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.counterView.getLayoutParams();
        localObject1 = getResources();
        j = R.dimen.mtrl_textinput_counter_margin_start;
        int k = ((Resources)localObject1).getDimensionPixelOffset(j);
        MarginLayoutParamsCompat.OooO0Oo(localMarginLayoutParams, k);
        updateCounterTextAppearanceAndColor();
        updateCounter();
      }
      else
      {
        localObject1 = this.indicatorViewController;
        localObject2 = this.counterView;
        ((IndicatorViewController)localObject1).removeIndicator((TextView)localObject2, i);
        i = 0;
        localMarginLayoutParams = null;
        this.counterView = null;
      }
      this.counterEnabled = paramBoolean;
    }
  }
  
  public void setCounterMaxLength(int paramInt)
  {
    int i = this.counterMaxLength;
    if (i != paramInt)
    {
      if (paramInt <= 0) {
        paramInt = -1;
      }
      this.counterMaxLength = paramInt;
      paramInt = this.counterEnabled;
      if (paramInt != 0) {
        updateCounter();
      }
    }
  }
  
  public void setCounterOverflowTextAppearance(int paramInt)
  {
    int i = this.counterOverflowTextAppearance;
    if (i != paramInt)
    {
      this.counterOverflowTextAppearance = paramInt;
      updateCounterTextAppearanceAndColor();
    }
  }
  
  public void setCounterOverflowTextColor(ColorStateList paramColorStateList)
  {
    ColorStateList localColorStateList = this.counterOverflowTextColor;
    if (localColorStateList != paramColorStateList)
    {
      this.counterOverflowTextColor = paramColorStateList;
      updateCounterTextAppearanceAndColor();
    }
  }
  
  public void setCounterTextAppearance(int paramInt)
  {
    int i = this.counterTextAppearance;
    if (i != paramInt)
    {
      this.counterTextAppearance = paramInt;
      updateCounterTextAppearanceAndColor();
    }
  }
  
  public void setCounterTextColor(ColorStateList paramColorStateList)
  {
    ColorStateList localColorStateList = this.counterTextColor;
    if (localColorStateList != paramColorStateList)
    {
      this.counterTextColor = paramColorStateList;
      updateCounterTextAppearanceAndColor();
    }
  }
  
  public void setDefaultHintTextColor(ColorStateList paramColorStateList)
  {
    this.defaultHintTextColor = paramColorStateList;
    this.focusedTextColor = paramColorStateList;
    paramColorStateList = this.editText;
    if (paramColorStateList != null)
    {
      paramColorStateList = null;
      updateLabelState(false);
    }
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    recursiveSetEnabled(this, paramBoolean);
    super.setEnabled(paramBoolean);
  }
  
  public void setEndIconActivated(boolean paramBoolean)
  {
    this.endLayout.setEndIconActivated(paramBoolean);
  }
  
  public void setEndIconCheckable(boolean paramBoolean)
  {
    this.endLayout.setEndIconCheckable(paramBoolean);
  }
  
  public void setEndIconContentDescription(int paramInt)
  {
    this.endLayout.setEndIconContentDescription(paramInt);
  }
  
  public void setEndIconContentDescription(CharSequence paramCharSequence)
  {
    this.endLayout.setEndIconContentDescription(paramCharSequence);
  }
  
  public void setEndIconDrawable(int paramInt)
  {
    this.endLayout.setEndIconDrawable(paramInt);
  }
  
  public void setEndIconDrawable(Drawable paramDrawable)
  {
    this.endLayout.setEndIconDrawable(paramDrawable);
  }
  
  public void setEndIconMinSize(int paramInt)
  {
    this.endLayout.setEndIconMinSize(paramInt);
  }
  
  public void setEndIconMode(int paramInt)
  {
    this.endLayout.setEndIconMode(paramInt);
  }
  
  public void setEndIconOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.endLayout.setEndIconOnClickListener(paramOnClickListener);
  }
  
  public void setEndIconOnLongClickListener(View.OnLongClickListener paramOnLongClickListener)
  {
    this.endLayout.setEndIconOnLongClickListener(paramOnLongClickListener);
  }
  
  public void setEndIconScaleType(ImageView.ScaleType paramScaleType)
  {
    this.endLayout.setEndIconScaleType(paramScaleType);
  }
  
  public void setEndIconTintList(ColorStateList paramColorStateList)
  {
    this.endLayout.setEndIconTintList(paramColorStateList);
  }
  
  public void setEndIconTintMode(PorterDuff.Mode paramMode)
  {
    this.endLayout.setEndIconTintMode(paramMode);
  }
  
  public void setEndIconVisible(boolean paramBoolean)
  {
    this.endLayout.setEndIconVisible(paramBoolean);
  }
  
  public void setError(CharSequence paramCharSequence)
  {
    IndicatorViewController localIndicatorViewController = this.indicatorViewController;
    boolean bool = localIndicatorViewController.isErrorEnabled();
    if (!bool)
    {
      bool = TextUtils.isEmpty(paramCharSequence);
      if (bool) {
        return;
      }
      bool = true;
      setErrorEnabled(bool);
    }
    bool = TextUtils.isEmpty(paramCharSequence);
    if (!bool)
    {
      localIndicatorViewController = this.indicatorViewController;
      localIndicatorViewController.showError(paramCharSequence);
    }
    else
    {
      paramCharSequence = this.indicatorViewController;
      paramCharSequence.hideError();
    }
  }
  
  public void setErrorAccessibilityLiveRegion(int paramInt)
  {
    this.indicatorViewController.setErrorAccessibilityLiveRegion(paramInt);
  }
  
  public void setErrorContentDescription(CharSequence paramCharSequence)
  {
    this.indicatorViewController.setErrorContentDescription(paramCharSequence);
  }
  
  public void setErrorEnabled(boolean paramBoolean)
  {
    this.indicatorViewController.setErrorEnabled(paramBoolean);
  }
  
  public void setErrorIconDrawable(int paramInt)
  {
    this.endLayout.setErrorIconDrawable(paramInt);
  }
  
  public void setErrorIconDrawable(Drawable paramDrawable)
  {
    this.endLayout.setErrorIconDrawable(paramDrawable);
  }
  
  public void setErrorIconOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.endLayout.setErrorIconOnClickListener(paramOnClickListener);
  }
  
  public void setErrorIconOnLongClickListener(View.OnLongClickListener paramOnLongClickListener)
  {
    this.endLayout.setErrorIconOnLongClickListener(paramOnLongClickListener);
  }
  
  public void setErrorIconTintList(ColorStateList paramColorStateList)
  {
    this.endLayout.setErrorIconTintList(paramColorStateList);
  }
  
  public void setErrorIconTintMode(PorterDuff.Mode paramMode)
  {
    this.endLayout.setErrorIconTintMode(paramMode);
  }
  
  public void setErrorTextAppearance(int paramInt)
  {
    this.indicatorViewController.setErrorTextAppearance(paramInt);
  }
  
  public void setErrorTextColor(ColorStateList paramColorStateList)
  {
    this.indicatorViewController.setErrorViewTextColor(paramColorStateList);
  }
  
  public void setExpandedHintEnabled(boolean paramBoolean)
  {
    boolean bool = this.expandedHintEnabled;
    if (bool != paramBoolean)
    {
      this.expandedHintEnabled = paramBoolean;
      paramBoolean = false;
      updateLabelState(false);
    }
  }
  
  public void setHelperText(CharSequence paramCharSequence)
  {
    boolean bool1 = TextUtils.isEmpty(paramCharSequence);
    if (bool1)
    {
      boolean bool2 = isHelperTextEnabled();
      if (bool2)
      {
        bool2 = false;
        paramCharSequence = null;
        setHelperTextEnabled(false);
      }
    }
    else
    {
      bool1 = isHelperTextEnabled();
      if (!bool1)
      {
        bool1 = true;
        setHelperTextEnabled(bool1);
      }
      IndicatorViewController localIndicatorViewController = this.indicatorViewController;
      localIndicatorViewController.showHelper(paramCharSequence);
    }
  }
  
  public void setHelperTextColor(ColorStateList paramColorStateList)
  {
    this.indicatorViewController.setHelperTextViewTextColor(paramColorStateList);
  }
  
  public void setHelperTextEnabled(boolean paramBoolean)
  {
    this.indicatorViewController.setHelperTextEnabled(paramBoolean);
  }
  
  public void setHelperTextTextAppearance(int paramInt)
  {
    this.indicatorViewController.setHelperTextAppearance(paramInt);
  }
  
  public void setHint(int paramInt)
  {
    CharSequence localCharSequence;
    if (paramInt != 0)
    {
      Resources localResources = getResources();
      localCharSequence = localResources.getText(paramInt);
    }
    else
    {
      paramInt = 0;
      localCharSequence = null;
    }
    setHint(localCharSequence);
  }
  
  public void setHint(CharSequence paramCharSequence)
  {
    boolean bool = this.hintEnabled;
    if (bool)
    {
      setHintInternal(paramCharSequence);
      int i = 2048;
      sendAccessibilityEvent(i);
    }
  }
  
  public void setHintAnimationEnabled(boolean paramBoolean)
  {
    this.hintAnimationEnabled = paramBoolean;
  }
  
  public void setHintEnabled(boolean paramBoolean)
  {
    boolean bool1 = this.hintEnabled;
    if (paramBoolean != bool1)
    {
      this.hintEnabled = paramBoolean;
      bool1 = false;
      CharSequence localCharSequence;
      if (!paramBoolean)
      {
        this.isProvidingHint = false;
        localObject = this.hint;
        paramBoolean = TextUtils.isEmpty((CharSequence)localObject);
        if (!paramBoolean)
        {
          localObject = this.editText.getHint();
          paramBoolean = TextUtils.isEmpty((CharSequence)localObject);
          if (paramBoolean)
          {
            localObject = this.editText;
            localCharSequence = this.hint;
            ((TextView)localObject).setHint(localCharSequence);
          }
        }
        setHintInternal(null);
      }
      else
      {
        localObject = this.editText.getHint();
        boolean bool2 = TextUtils.isEmpty((CharSequence)localObject);
        if (!bool2)
        {
          localCharSequence = this.hint;
          bool2 = TextUtils.isEmpty(localCharSequence);
          if (bool2) {
            setHint((CharSequence)localObject);
          }
          localObject = this.editText;
          ((TextView)localObject).setHint(null);
        }
        paramBoolean = true;
        this.isProvidingHint = paramBoolean;
      }
      Object localObject = this.editText;
      if (localObject != null) {
        updateInputLayoutMargins();
      }
    }
  }
  
  public void setHintTextAppearance(int paramInt)
  {
    CollapsingTextHelper localCollapsingTextHelper = this.collapsingTextHelper;
    localCollapsingTextHelper.setCollapsedTextAppearance(paramInt);
    Object localObject = this.collapsingTextHelper.getCollapsedTextColor();
    this.focusedTextColor = ((ColorStateList)localObject);
    localObject = this.editText;
    if (localObject != null)
    {
      paramInt = 0;
      localObject = null;
      updateLabelState(false);
      updateInputLayoutMargins();
    }
  }
  
  public void setHintTextColor(ColorStateList paramColorStateList)
  {
    Object localObject = this.focusedTextColor;
    if (localObject != paramColorStateList)
    {
      localObject = this.defaultHintTextColor;
      if (localObject == null)
      {
        localObject = this.collapsingTextHelper;
        ((CollapsingTextHelper)localObject).setCollapsedTextColor(paramColorStateList);
      }
      this.focusedTextColor = paramColorStateList;
      paramColorStateList = this.editText;
      if (paramColorStateList != null)
      {
        paramColorStateList = null;
        updateLabelState(false);
      }
    }
  }
  
  public void setLengthCounter(TextInputLayout.LengthCounter paramLengthCounter)
  {
    this.lengthCounter = paramLengthCounter;
  }
  
  public void setMaxEms(int paramInt)
  {
    this.maxEms = paramInt;
    EditText localEditText = this.editText;
    if (localEditText != null)
    {
      int i = -1;
      if (paramInt != i) {
        localEditText.setMaxEms(paramInt);
      }
    }
  }
  
  public void setMaxWidth(int paramInt)
  {
    this.maxWidth = paramInt;
    EditText localEditText = this.editText;
    if (localEditText != null)
    {
      int i = -1;
      if (paramInt != i) {
        localEditText.setMaxWidth(paramInt);
      }
    }
  }
  
  public void setMaxWidthResource(int paramInt)
  {
    paramInt = getContext().getResources().getDimensionPixelSize(paramInt);
    setMaxWidth(paramInt);
  }
  
  public void setMinEms(int paramInt)
  {
    this.minEms = paramInt;
    EditText localEditText = this.editText;
    if (localEditText != null)
    {
      int i = -1;
      if (paramInt != i) {
        localEditText.setMinEms(paramInt);
      }
    }
  }
  
  public void setMinWidth(int paramInt)
  {
    this.minWidth = paramInt;
    EditText localEditText = this.editText;
    if (localEditText != null)
    {
      int i = -1;
      if (paramInt != i) {
        localEditText.setMinWidth(paramInt);
      }
    }
  }
  
  public void setMinWidthResource(int paramInt)
  {
    paramInt = getContext().getResources().getDimensionPixelSize(paramInt);
    setMinWidth(paramInt);
  }
  
  public void setPasswordVisibilityToggleContentDescription(int paramInt)
  {
    this.endLayout.setPasswordVisibilityToggleContentDescription(paramInt);
  }
  
  public void setPasswordVisibilityToggleContentDescription(CharSequence paramCharSequence)
  {
    this.endLayout.setPasswordVisibilityToggleContentDescription(paramCharSequence);
  }
  
  public void setPasswordVisibilityToggleDrawable(int paramInt)
  {
    this.endLayout.setPasswordVisibilityToggleDrawable(paramInt);
  }
  
  public void setPasswordVisibilityToggleDrawable(Drawable paramDrawable)
  {
    this.endLayout.setPasswordVisibilityToggleDrawable(paramDrawable);
  }
  
  public void setPasswordVisibilityToggleEnabled(boolean paramBoolean)
  {
    this.endLayout.setPasswordVisibilityToggleEnabled(paramBoolean);
  }
  
  public void setPasswordVisibilityToggleTintList(ColorStateList paramColorStateList)
  {
    this.endLayout.setPasswordVisibilityToggleTintList(paramColorStateList);
  }
  
  public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode paramMode)
  {
    this.endLayout.setPasswordVisibilityToggleTintMode(paramMode);
  }
  
  public void setPlaceholderText(CharSequence paramCharSequence)
  {
    Object localObject = this.placeholderTextView;
    if (localObject == null)
    {
      localObject = new androidx/appcompat/widget/AppCompatTextView;
      Context localContext = getContext();
      ((AppCompatTextView)localObject).<init>(localContext);
      this.placeholderTextView = ((TextView)localObject);
      int i = R.id.textinput_placeholder;
      ((View)localObject).setId(i);
      localObject = this.placeholderTextView;
      i = 2;
      ViewCompat.o000000((View)localObject, i);
      localObject = createPlaceholderFadeTransition();
      this.placeholderFadeIn = ((Fade)localObject);
      long l = 67;
      ((Transition)localObject).setStartDelay(l);
      localObject = createPlaceholderFadeTransition();
      this.placeholderFadeOut = ((Fade)localObject);
      int j = this.placeholderTextAppearance;
      setPlaceholderTextAppearance(j);
      localObject = this.placeholderTextColor;
      setPlaceholderTextColor((ColorStateList)localObject);
    }
    boolean bool = TextUtils.isEmpty(paramCharSequence);
    if (bool)
    {
      paramCharSequence = null;
      setPlaceholderTextEnabled(false);
    }
    else
    {
      bool = this.placeholderEnabled;
      if (!bool)
      {
        bool = true;
        setPlaceholderTextEnabled(bool);
      }
      this.placeholderText = paramCharSequence;
    }
    updatePlaceholderText();
  }
  
  public void setPlaceholderTextAppearance(int paramInt)
  {
    this.placeholderTextAppearance = paramInt;
    TextView localTextView = this.placeholderTextView;
    if (localTextView != null) {
      TextViewCompat.OooOOO(localTextView, paramInt);
    }
  }
  
  public void setPlaceholderTextColor(ColorStateList paramColorStateList)
  {
    Object localObject = this.placeholderTextColor;
    if (localObject != paramColorStateList)
    {
      this.placeholderTextColor = paramColorStateList;
      localObject = this.placeholderTextView;
      if ((localObject != null) && (paramColorStateList != null)) {
        ((TextView)localObject).setTextColor(paramColorStateList);
      }
    }
  }
  
  public void setPrefixText(CharSequence paramCharSequence)
  {
    this.startLayout.setPrefixText(paramCharSequence);
  }
  
  public void setPrefixTextAppearance(int paramInt)
  {
    this.startLayout.setPrefixTextAppearance(paramInt);
  }
  
  public void setPrefixTextColor(ColorStateList paramColorStateList)
  {
    this.startLayout.setPrefixTextColor(paramColorStateList);
  }
  
  public void setShapeAppearanceModel(ShapeAppearanceModel paramShapeAppearanceModel)
  {
    Object localObject = this.boxBackground;
    if (localObject != null)
    {
      localObject = ((MaterialShapeDrawable)localObject).getShapeAppearanceModel();
      if (localObject != paramShapeAppearanceModel)
      {
        this.shapeAppearanceModel = paramShapeAppearanceModel;
        applyBoxAttributes();
      }
    }
  }
  
  public void setStartIconCheckable(boolean paramBoolean)
  {
    this.startLayout.setStartIconCheckable(paramBoolean);
  }
  
  public void setStartIconContentDescription(int paramInt)
  {
    CharSequence localCharSequence;
    if (paramInt != 0)
    {
      Resources localResources = getResources();
      localCharSequence = localResources.getText(paramInt);
    }
    else
    {
      paramInt = 0;
      localCharSequence = null;
    }
    setStartIconContentDescription(localCharSequence);
  }
  
  public void setStartIconContentDescription(CharSequence paramCharSequence)
  {
    this.startLayout.setStartIconContentDescription(paramCharSequence);
  }
  
  public void setStartIconDrawable(int paramInt)
  {
    Drawable localDrawable;
    if (paramInt != 0)
    {
      Context localContext = getContext();
      localDrawable = AppCompatResources.OooO0O0(localContext, paramInt);
    }
    else
    {
      paramInt = 0;
      localDrawable = null;
    }
    setStartIconDrawable(localDrawable);
  }
  
  public void setStartIconDrawable(Drawable paramDrawable)
  {
    this.startLayout.setStartIconDrawable(paramDrawable);
  }
  
  public void setStartIconMinSize(int paramInt)
  {
    this.startLayout.setStartIconMinSize(paramInt);
  }
  
  public void setStartIconOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.startLayout.setStartIconOnClickListener(paramOnClickListener);
  }
  
  public void setStartIconOnLongClickListener(View.OnLongClickListener paramOnLongClickListener)
  {
    this.startLayout.setStartIconOnLongClickListener(paramOnLongClickListener);
  }
  
  public void setStartIconScaleType(ImageView.ScaleType paramScaleType)
  {
    this.startLayout.setStartIconScaleType(paramScaleType);
  }
  
  public void setStartIconTintList(ColorStateList paramColorStateList)
  {
    this.startLayout.setStartIconTintList(paramColorStateList);
  }
  
  public void setStartIconTintMode(PorterDuff.Mode paramMode)
  {
    this.startLayout.setStartIconTintMode(paramMode);
  }
  
  public void setStartIconVisible(boolean paramBoolean)
  {
    this.startLayout.setStartIconVisible(paramBoolean);
  }
  
  public void setSuffixText(CharSequence paramCharSequence)
  {
    this.endLayout.setSuffixText(paramCharSequence);
  }
  
  public void setSuffixTextAppearance(int paramInt)
  {
    this.endLayout.setSuffixTextAppearance(paramInt);
  }
  
  public void setSuffixTextColor(ColorStateList paramColorStateList)
  {
    this.endLayout.setSuffixTextColor(paramColorStateList);
  }
  
  public void setTextAppearanceCompatWithErrorFallback(TextView paramTextView, int paramInt)
  {
    int i = 1;
    try
    {
      TextViewCompat.OooOOO(paramTextView, paramInt);
      localObject = paramTextView.getTextColors();
      paramInt = ((ColorStateList)localObject).getDefaultColor();
      int j = -65281;
      if (paramInt != j)
      {
        paramInt = 0;
        localObject = null;
        i = 0;
      }
    }
    catch (Exception localException)
    {
      Object localObject;
      label40:
      break label40;
    }
    if (i != 0)
    {
      paramInt = R.style.TextAppearance_AppCompat_Caption;
      TextViewCompat.OooOOO(paramTextView, paramInt);
      localObject = getContext();
      i = R.color.design_error;
      paramInt = ContextCompat.OooO0OO((Context)localObject, i);
      paramTextView.setTextColor(paramInt);
    }
  }
  
  public void setTextInputAccessibilityDelegate(TextInputLayout.AccessibilityDelegate paramAccessibilityDelegate)
  {
    EditText localEditText = this.editText;
    if (localEditText != null) {
      ViewCompat.o00oO0o(localEditText, paramAccessibilityDelegate);
    }
  }
  
  public void setTypeface(Typeface paramTypeface)
  {
    Object localObject = this.typeface;
    if (paramTypeface != localObject)
    {
      this.typeface = paramTypeface;
      this.collapsingTextHelper.setTypefaces(paramTypeface);
      this.indicatorViewController.setTypefaces(paramTypeface);
      localObject = this.counterView;
      if (localObject != null) {
        ((TextView)localObject).setTypeface(paramTypeface);
      }
    }
  }
  
  public boolean shouldShowError()
  {
    return this.indicatorViewController.errorShouldBeShown();
  }
  
  public void updateCounter(Editable paramEditable)
  {
    TextInputLayout.LengthCounter localLengthCounter = this.lengthCounter;
    int i = localLengthCounter.countLength(paramEditable);
    boolean bool2 = this.counterOverflowed;
    int j = this.counterMaxLength;
    int k = -1;
    Object localObject;
    if (j == k)
    {
      localObject = this.counterView;
      paramEditable = String.valueOf(i);
      ((TextView)localObject).setText(paramEditable);
      paramEditable = this.counterView;
      j = 0;
      localObject = null;
      paramEditable.setContentDescription(null);
      this.counterOverflowed = false;
    }
    else
    {
      if (i > j)
      {
        j = 1;
      }
      else
      {
        j = 0;
        localObject = null;
      }
      this.counterOverflowed = j;
      localObject = getContext();
      TextView localTextView = this.counterView;
      int m = this.counterMaxLength;
      boolean bool4 = this.counterOverflowed;
      updateCounterContentDescription((Context)localObject, localTextView, i, m, bool4);
      boolean bool3 = this.counterOverflowed;
      if (bool2 != bool3) {
        updateCounterTextAppearanceAndColor();
      }
      localObject = BidiFormatter.getInstance();
      localTextView = this.counterView;
      Context localContext = getContext();
      int n = R.string.character_counter_pattern;
      paramEditable = Integer.valueOf(i);
      int i1 = this.counterMaxLength;
      Integer localInteger = Integer.valueOf(i1);
      paramEditable = new Object[] { paramEditable, localInteger };
      paramEditable = localContext.getString(n, paramEditable);
      paramEditable = ((BidiFormatter)localObject).OooO0oo(paramEditable);
      localTextView.setText(paramEditable);
    }
    paramEditable = this.editText;
    if (paramEditable != null)
    {
      boolean bool1 = this.counterOverflowed;
      if (bool2 != bool1)
      {
        updateLabelState(false);
        updateTextInputBoxState();
        updateEditTextBackground();
      }
    }
  }
  
  public boolean updateDummyDrawables()
  {
    Object localObject1 = this.editText;
    Drawable localDrawable1 = null;
    if (localObject1 == null) {
      return false;
    }
    boolean bool1 = shouldUpdateStartDummyDrawable();
    int j = 0;
    TextView localTextView = null;
    int k = 2;
    int m = 3;
    int n = 1;
    float f1 = 1.4E-45F;
    Object localObject2;
    Object localObject3;
    Drawable localDrawable2;
    if (bool1)
    {
      localObject1 = this.startLayout;
      i = ((View)localObject1).getMeasuredWidth();
      int i1 = this.editText.getPaddingLeft();
      i -= i1;
      localObject2 = this.startDummyDrawable;
      if (localObject2 != null)
      {
        int i2 = this.startDummyDrawableWidth;
        if (i2 == i) {}
      }
      else
      {
        localObject2 = new android/graphics/drawable/ColorDrawable;
        ((ColorDrawable)localObject2).<init>();
        this.startDummyDrawable = ((Drawable)localObject2);
        this.startDummyDrawableWidth = i;
        ((Drawable)localObject2).setBounds(0, 0, i, n);
      }
      localObject1 = TextViewCompat.OooO00o(this.editText);
      localObject2 = localObject1[0];
      localObject3 = this.startDummyDrawable;
      if (localObject2 == localObject3) {
        break label249;
      }
      localObject2 = this.editText;
      localDrawable2 = localObject1[n];
      Drawable localDrawable3 = localObject1[k];
      localObject1 = localObject1[m];
      TextViewCompat.OooO((TextView)localObject2, (Drawable)localObject3, localDrawable2, localDrawable3, (Drawable)localObject1);
    }
    else
    {
      localObject1 = this.startDummyDrawable;
      if (localObject1 == null) {
        break label249;
      }
      localObject1 = TextViewCompat.OooO00o(this.editText);
      localObject2 = this.editText;
      localObject3 = localObject1[n];
      localDrawable2 = localObject1[k];
      localObject1 = localObject1[m];
      TextViewCompat.OooO((TextView)localObject2, null, (Drawable)localObject3, localDrawable2, (Drawable)localObject1);
      this.startDummyDrawable = null;
    }
    int i = n;
    float f2 = f1;
    break label256;
    label249:
    i = 0;
    localObject1 = null;
    f2 = 0.0F;
    label256:
    boolean bool2 = shouldUpdateEndDummyDrawable();
    Drawable localDrawable4;
    Drawable localDrawable5;
    if (bool2)
    {
      localTextView = this.endLayout.getSuffixTextView();
      j = localTextView.getMeasuredWidth();
      int i3 = this.editText.getPaddingRight();
      j -= i3;
      localObject2 = this.endLayout.getCurrentEndIconView();
      if (localObject2 != null)
      {
        int i4 = ((View)localObject2).getMeasuredWidth();
        j += i4;
        localObject2 = (ViewGroup.MarginLayoutParams)((View)localObject2).getLayoutParams();
        i3 = MarginLayoutParamsCompat.OooO0O0((ViewGroup.MarginLayoutParams)localObject2);
        j += i3;
      }
      localObject2 = TextViewCompat.OooO00o(this.editText);
      localObject3 = this.endDummyDrawable;
      if (localObject3 != null)
      {
        int i5 = this.endDummyDrawableWidth;
        if (i5 != j)
        {
          this.endDummyDrawableWidth = j;
          ((Drawable)localObject3).setBounds(0, 0, j, n);
          localObject1 = this.editText;
          localDrawable1 = localObject2[0];
          localTextView = localObject2[n];
          localDrawable4 = this.endDummyDrawable;
        }
      }
      for (localDrawable5 = localObject2[m];; localDrawable5 = localObject2[m])
      {
        TextViewCompat.OooO((TextView)localObject1, localDrawable1, localTextView, localDrawable4, localDrawable5);
        break label642;
        if (localObject3 == null)
        {
          localObject3 = new android/graphics/drawable/ColorDrawable;
          ((ColorDrawable)localObject3).<init>();
          this.endDummyDrawable = ((Drawable)localObject3);
          this.endDummyDrawableWidth = j;
          ((Drawable)localObject3).setBounds(0, 0, j, n);
        }
        localTextView = localObject2[k];
        localDrawable4 = this.endDummyDrawable;
        if (localTextView == localDrawable4) {
          break;
        }
        this.originalEditTextEndDrawable = localTextView;
        localObject1 = this.editText;
        localDrawable1 = localObject2[0];
        localTextView = localObject2[n];
      }
      n = i;
      f1 = f2;
    }
    else
    {
      localObject2 = this.endDummyDrawable;
      if (localObject2 == null) {
        return i;
      }
      localObject2 = TextViewCompat.OooO00o(this.editText);
      localDrawable4 = localObject2[k];
      localObject3 = this.endDummyDrawable;
      if (localDrawable4 == localObject3)
      {
        localObject1 = this.editText;
        localDrawable1 = localObject2[0];
        localDrawable4 = localObject2[n];
        localObject3 = this.originalEditTextEndDrawable;
        localDrawable5 = localObject2[m];
        TextViewCompat.OooO((TextView)localObject1, localDrawable1, localDrawable4, (Drawable)localObject3, localDrawable5);
      }
      else
      {
        n = i;
        f1 = f2;
      }
      this.endDummyDrawable = null;
    }
    label642:
    i = n;
    f2 = f1;
    return i;
  }
  
  public void updateEditTextBackground()
  {
    Object localObject1 = this.editText;
    if (localObject1 != null)
    {
      int i = this.boxBackgroundMode;
      if (i == 0)
      {
        localObject1 = ((View)localObject1).getBackground();
        if (localObject1 == null) {
          return;
        }
        boolean bool1 = DrawableUtils.OooO00o((Drawable)localObject1);
        if (bool1) {
          localObject1 = ((Drawable)localObject1).mutate();
        }
        bool1 = shouldShowError();
        if (bool1) {}
        Object localObject2;
        int k;
        for (int j = getErrorCurrentTextColors();; k = ((TextView)localObject2).getCurrentTextColor())
        {
          PorterDuff.Mode localMode = PorterDuff.Mode.SRC_IN;
          localObject2 = AppCompatDrawableManager.OooO0Oo(j, localMode);
          ((Drawable)localObject1).setColorFilter((ColorFilter)localObject2);
          return;
          boolean bool2 = this.counterOverflowed;
          if (!bool2) {
            break;
          }
          localObject2 = this.counterView;
          if (localObject2 == null) {
            break;
          }
        }
        DrawableCompat.OooO0OO((Drawable)localObject1);
        localObject1 = this.editText;
        ((View)localObject1).refreshDrawableState();
      }
    }
  }
  
  public void updateEditTextBoxBackgroundIfNeeded()
  {
    Object localObject1 = this.editText;
    if (localObject1 != null)
    {
      Object localObject2 = this.boxBackground;
      if (localObject2 != null)
      {
        boolean bool = this.boxBackgroundApplied;
        if (!bool)
        {
          localObject1 = ((View)localObject1).getBackground();
          if (localObject1 != null) {}
        }
        else
        {
          int i = this.boxBackgroundMode;
          if (i != 0)
          {
            localObject1 = this.editText;
            localObject2 = getEditTextBoxBackground();
            ViewCompat.o0ooOoO((View)localObject1, (Drawable)localObject2);
            i = 1;
            this.boxBackgroundApplied = i;
          }
        }
      }
    }
  }
  
  public void updateLabelState(boolean paramBoolean)
  {
    updateLabelState(paramBoolean, false);
  }
  
  public void updateTextInputBoxState()
  {
    Object localObject1 = this.boxBackground;
    if (localObject1 != null)
    {
      int i = this.boxBackgroundMode;
      if (i != 0)
      {
        boolean bool1 = isFocused();
        boolean bool2 = false;
        EndCompoundLayout localEndCompoundLayout = null;
        int m = 1;
        if (!bool1)
        {
          localObject1 = this.editText;
          if (localObject1 != null)
          {
            bool1 = ((View)localObject1).hasFocus();
            if (bool1) {}
          }
          else
          {
            bool1 = false;
            localObject1 = null;
            break label69;
          }
        }
        bool1 = m;
        label69:
        boolean bool4 = isHovered();
        if (!bool4)
        {
          EditText localEditText = this.editText;
          if (localEditText != null)
          {
            bool4 = localEditText.isHovered();
            if (bool4) {}
          }
          else
          {
            bool4 = false;
            localEditText = null;
            break label119;
          }
        }
        bool4 = m;
        label119:
        boolean bool5 = shouldShowError();
        Object localObject2;
        if (!bool5)
        {
          localObject2 = this.counterView;
          if (localObject2 != null)
          {
            bool5 = this.counterOverflowed;
            if (!bool5) {}
          }
        }
        else
        {
          bool2 = m;
        }
        bool5 = isEnabled();
        int n;
        if (!bool5) {
          n = this.disabledColor;
        }
        for (;;)
        {
          this.boxStrokeColor = n;
          break;
          boolean bool6 = shouldShowError();
          if (bool6)
          {
            localObject2 = this.strokeErrorColor;
            if (localObject2 == null) {}
          }
          ColorStateList localColorStateList;
          do
          {
            updateStrokeErrorColor(bool1, bool4);
            break label304;
            int i1 = getErrorCurrentTextColors();
            break;
            boolean bool7 = this.counterOverflowed;
            if (!bool7) {
              break label268;
            }
            localObject2 = this.counterView;
            if (localObject2 == null) {
              break label268;
            }
            localColorStateList = this.strokeErrorColor;
          } while (localColorStateList != null);
          i2 = ((TextView)localObject2).getCurrentTextColor();
          continue;
          label268:
          if (bool1) {
            i2 = this.focusedStrokeColor;
          } else if (bool4) {
            i2 = this.hoveredStrokeColor;
          } else {
            i2 = this.defaultStrokeColor;
          }
        }
        label304:
        int i2 = Build.VERSION.SDK_INT;
        int i4 = 29;
        if (i2 >= i4) {
          updateCursorColor(bool2);
        }
        localEndCompoundLayout = this.endLayout;
        localEndCompoundLayout.onTextInputBoxStateUpdated();
        refreshStartIconDrawableState();
        int k = this.boxBackgroundMode;
        i2 = 2;
        if (k == i2)
        {
          k = this.boxStrokeWidthPx;
          if (bool1)
          {
            boolean bool8 = isEnabled();
            if (bool8)
            {
              i3 = this.boxStrokeWidthFocusedPx;
              break label389;
            }
          }
          int i3 = this.boxStrokeWidthDefaultPx;
          label389:
          this.boxStrokeWidthPx = i3;
          i3 = this.boxStrokeWidthPx;
          if (i3 != k) {
            recalculateCutout();
          }
        }
        k = this.boxBackgroundMode;
        if (k == m)
        {
          boolean bool3 = isEnabled();
          int j;
          if (!bool3) {
            j = this.disabledFilledBackgroundColor;
          }
          for (;;)
          {
            this.boxBackgroundColor = j;
            break;
            if ((bool4) && (j == 0)) {
              j = this.hoveredFilledBackgroundColor;
            } else if (j != 0) {
              j = this.focusedFilledBackgroundColor;
            } else {
              j = this.defaultFilledBackgroundColor;
            }
          }
        }
        applyBoxAttributes();
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.textfield.TextInputLayout
 * JD-Core Version:    0.7.0.1
 */
package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import java.util.ArrayList;
import java.util.List;

final class IndicatorViewController
{
  private static final int CAPTION_STATE_ERROR = 1;
  private static final int CAPTION_STATE_HELPER_TEXT = 2;
  private static final int CAPTION_STATE_NONE = 0;
  static final int COUNTER_INDEX = 2;
  private static final int DEFAULT_CAPTION_FADE_ANIMATION_DURATION = 167;
  private static final int DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION = 217;
  static final int ERROR_INDEX = 0;
  static final int HELPER_INDEX = 1;
  private Animator captionAnimator;
  private FrameLayout captionArea;
  private int captionDisplayed;
  private final int captionFadeInAnimationDuration;
  private final TimeInterpolator captionFadeInAnimationInterpolator;
  private final int captionFadeOutAnimationDuration;
  private final TimeInterpolator captionFadeOutAnimationInterpolator;
  private int captionToShow;
  private final int captionTranslationYAnimationDuration;
  private final TimeInterpolator captionTranslationYAnimationInterpolator;
  private final float captionTranslationYPx;
  private final Context context;
  private boolean errorEnabled;
  private CharSequence errorText;
  private int errorTextAppearance;
  private TextView errorView;
  private int errorViewAccessibilityLiveRegion;
  private CharSequence errorViewContentDescription;
  private ColorStateList errorViewTextColor;
  private CharSequence helperText;
  private boolean helperTextEnabled;
  private int helperTextTextAppearance;
  private TextView helperTextView;
  private ColorStateList helperTextViewTextColor;
  private LinearLayout indicatorArea;
  private int indicatorsAdded;
  private final TextInputLayout textInputView;
  private Typeface typeface;
  
  public IndicatorViewController(TextInputLayout paramTextInputLayout)
  {
    Context localContext = paramTextInputLayout.getContext();
    this.context = localContext;
    this.textInputView = paramTextInputLayout;
    paramTextInputLayout = localContext.getResources();
    int i = R.dimen.design_textinput_caption_translate_y;
    float f = paramTextInputLayout.getDimensionPixelSize(i);
    this.captionTranslationYPx = f;
    int j = R.attr.motionDurationShort4;
    j = MotionUtils.resolveThemeDuration(localContext, j, 217);
    this.captionTranslationYAnimationDuration = j;
    j = R.attr.motionDurationMedium4;
    i = 167;
    j = MotionUtils.resolveThemeDuration(localContext, j, i);
    this.captionFadeInAnimationDuration = j;
    j = R.attr.motionDurationShort4;
    j = MotionUtils.resolveThemeDuration(localContext, j, i);
    this.captionFadeOutAnimationDuration = j;
    j = R.attr.motionEasingEmphasizedDecelerateInterpolator;
    TimeInterpolator localTimeInterpolator = AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
    paramTextInputLayout = MotionUtils.resolveThemeInterpolator(localContext, j, localTimeInterpolator);
    this.captionTranslationYAnimationInterpolator = paramTextInputLayout;
    j = R.attr.motionEasingEmphasizedDecelerateInterpolator;
    localTimeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
    paramTextInputLayout = MotionUtils.resolveThemeInterpolator(localContext, j, localTimeInterpolator);
    this.captionFadeInAnimationInterpolator = paramTextInputLayout;
    j = R.attr.motionEasingLinearInterpolator;
    paramTextInputLayout = MotionUtils.resolveThemeInterpolator(localContext, j, localTimeInterpolator);
    this.captionFadeOutAnimationInterpolator = paramTextInputLayout;
  }
  
  private boolean canAdjustIndicatorPadding()
  {
    Object localObject = this.indicatorArea;
    if (localObject != null)
    {
      localObject = this.textInputView.getEditText();
      if (localObject != null) {
        return true;
      }
    }
    boolean bool = false;
    localObject = null;
    return bool;
  }
  
  private void createCaptionAnimators(List paramList, boolean paramBoolean, TextView paramTextView, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramTextView != null) && (paramBoolean))
    {
      paramBoolean = false;
      ObjectAnimator localObjectAnimator1 = null;
      boolean bool1 = true;
      boolean bool2;
      ObjectAnimator localObjectAnimator2;
      if ((paramInt1 != paramInt3) && (paramInt1 != paramInt2))
      {
        bool2 = false;
        localObjectAnimator2 = null;
      }
      else
      {
        bool2 = bool1;
      }
      if (bool2)
      {
        if (paramInt3 == paramInt1)
        {
          bool2 = bool1;
        }
        else
        {
          bool2 = false;
          localObjectAnimator2 = null;
        }
        localObjectAnimator2 = createCaptionOpacityAnimator(paramTextView, bool2);
        if ((paramInt1 == paramInt3) && (paramInt2 != 0)) {
          paramBoolean = bool1;
        }
        if (paramBoolean)
        {
          paramBoolean = this.captionFadeOutAnimationDuration;
          long l1 = paramBoolean;
          localObjectAnimator2.setStartDelay(l1);
        }
        paramList.add(localObjectAnimator2);
        if ((paramInt3 == paramInt1) && (paramInt2 != 0))
        {
          localObjectAnimator1 = createCaptionTranslationYAnimator(paramTextView);
          int i = this.captionFadeOutAnimationDuration;
          long l2 = i;
          localObjectAnimator1.setStartDelay(l2);
          paramList.add(localObjectAnimator1);
        }
      }
    }
  }
  
  private ObjectAnimator createCaptionOpacityAnimator(TextView paramTextView, boolean paramBoolean)
  {
    int i;
    float f;
    if (paramBoolean)
    {
      i = 1065353216;
      f = 1.0F;
    }
    else
    {
      i = 0;
      f = 0.0F;
    }
    Property localProperty = View.ALPHA;
    int j = 1;
    float[] arrayOfFloat = new float[j];
    arrayOfFloat[0] = f;
    paramTextView = ObjectAnimator.ofFloat(paramTextView, localProperty, arrayOfFloat);
    if (paramBoolean) {
      i = this.captionFadeInAnimationDuration;
    } else {
      i = this.captionFadeOutAnimationDuration;
    }
    long l = i;
    paramTextView.setDuration(l);
    TimeInterpolator localTimeInterpolator;
    if (paramBoolean) {
      localTimeInterpolator = this.captionFadeInAnimationInterpolator;
    } else {
      localTimeInterpolator = this.captionFadeOutAnimationInterpolator;
    }
    paramTextView.setInterpolator(localTimeInterpolator);
    return paramTextView;
  }
  
  private ObjectAnimator createCaptionTranslationYAnimator(TextView paramTextView)
  {
    Object localObject = View.TRANSLATION_Y;
    float[] arrayOfFloat = new float[2];
    float f = -this.captionTranslationYPx;
    arrayOfFloat[0] = f;
    arrayOfFloat[1] = 0.0F;
    paramTextView = ObjectAnimator.ofFloat(paramTextView, (Property)localObject, arrayOfFloat);
    long l = this.captionTranslationYAnimationDuration;
    paramTextView.setDuration(l);
    localObject = this.captionTranslationYAnimationInterpolator;
    paramTextView.setInterpolator((TimeInterpolator)localObject);
    return paramTextView;
  }
  
  private TextView getCaptionViewFromDisplayState(int paramInt)
  {
    int i = 1;
    if (paramInt != i)
    {
      i = 2;
      if (paramInt != i) {
        return null;
      }
      return this.helperTextView;
    }
    return this.errorView;
  }
  
  private int getIndicatorPadding(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    if (paramBoolean)
    {
      Resources localResources = this.context.getResources();
      paramInt2 = localResources.getDimensionPixelSize(paramInt1);
    }
    return paramInt2;
  }
  
  private boolean isCaptionStateError(int paramInt)
  {
    int i = 1;
    if (paramInt == i)
    {
      Object localObject = this.errorView;
      if (localObject != null)
      {
        localObject = this.errorText;
        paramInt = TextUtils.isEmpty((CharSequence)localObject);
        if (paramInt == 0) {
          return i;
        }
      }
    }
    i = 0;
    return i;
  }
  
  private boolean isCaptionStateHelperText(int paramInt)
  {
    int i = 2;
    if (paramInt == i)
    {
      localObject = this.helperTextView;
      if (localObject != null)
      {
        localObject = this.helperText;
        paramInt = TextUtils.isEmpty((CharSequence)localObject);
        if (paramInt == 0) {
          return 1;
        }
      }
    }
    paramInt = 0;
    Object localObject = null;
    return paramInt;
  }
  
  private void setCaptionViewVisibilities(int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {
      return;
    }
    TextView localTextView;
    int i;
    float f;
    if (paramInt2 != 0)
    {
      localTextView = getCaptionViewFromDisplayState(paramInt2);
      if (localTextView != null)
      {
        localTextView.setVisibility(0);
        i = 1065353216;
        f = 1.0F;
        localTextView.setAlpha(f);
      }
    }
    if (paramInt1 != 0)
    {
      localTextView = getCaptionViewFromDisplayState(paramInt1);
      if (localTextView != null)
      {
        localTextView.setVisibility(4);
        i = 1;
        f = 1.4E-45F;
        if (paramInt1 == i)
        {
          paramInt1 = 0;
          localTextView.setText(null);
        }
      }
    }
    this.captionDisplayed = paramInt2;
  }
  
  private void setTextViewTypeface(TextView paramTextView, Typeface paramTypeface)
  {
    if (paramTextView != null) {
      paramTextView.setTypeface(paramTypeface);
    }
  }
  
  private void setViewGroupGoneIfEmpty(ViewGroup paramViewGroup, int paramInt)
  {
    if (paramInt == 0)
    {
      paramInt = 8;
      paramViewGroup.setVisibility(paramInt);
    }
  }
  
  private boolean shouldAnimateCaptionView(TextView paramTextView, CharSequence paramCharSequence)
  {
    TextInputLayout localTextInputLayout = this.textInputView;
    boolean bool1 = ViewCompat.OoooOOO(localTextInputLayout);
    if (bool1)
    {
      localTextInputLayout = this.textInputView;
      bool1 = localTextInputLayout.isEnabled();
      if (bool1)
      {
        int i = this.captionToShow;
        int j = this.captionDisplayed;
        if ((i == j) && (paramTextView != null))
        {
          paramTextView = paramTextView.getText();
          bool2 = TextUtils.equals(paramTextView, paramCharSequence);
          if (bool2) {}
        }
        else
        {
          bool2 = true;
          break label83;
        }
      }
    }
    boolean bool2 = false;
    paramTextView = null;
    label83:
    return bool2;
  }
  
  private void updateCaptionViewsVisibility(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    IndicatorViewController localIndicatorViewController = this;
    boolean bool1 = paramBoolean;
    if (paramInt1 == paramInt2) {
      return;
    }
    if (paramBoolean)
    {
      AnimatorSet localAnimatorSet = new android/animation/AnimatorSet;
      localAnimatorSet.<init>();
      this.captionAnimator = localAnimatorSet;
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      boolean bool2 = this.helperTextEnabled;
      TextView localTextView1 = this.helperTextView;
      createCaptionAnimators(localArrayList, bool2, localTextView1, 2, paramInt1, paramInt2);
      bool2 = this.errorEnabled;
      localTextView1 = this.errorView;
      createCaptionAnimators(localArrayList, bool2, localTextView1, 1, paramInt1, paramInt2);
      AnimatorSetCompat.playTogether(localAnimatorSet, localArrayList);
      localTextView1 = getCaptionViewFromDisplayState(paramInt1);
      TextView localTextView2 = getCaptionViewFromDisplayState(paramInt2);
      IndicatorViewController.1 local1 = new com/google/android/material/textfield/IndicatorViewController$1;
      int i = paramInt2;
      local1.<init>(this, paramInt2, localTextView1, paramInt1, localTextView2);
      localAnimatorSet.addListener(local1);
      localAnimatorSet.start();
    }
    else
    {
      setCaptionViewVisibilities(paramInt1, paramInt2);
    }
    localIndicatorViewController.textInputView.updateEditTextBackground();
    localIndicatorViewController.textInputView.updateLabelState(bool1);
    localIndicatorViewController.textInputView.updateTextInputBoxState();
  }
  
  public void addIndicator(TextView paramTextView, int paramInt)
  {
    Object localObject1 = this.indicatorArea;
    int i = -2;
    if (localObject1 == null)
    {
      localObject1 = this.captionArea;
      if (localObject1 == null)
      {
        localObject1 = new android/widget/LinearLayout;
        Object localObject2 = this.context;
        ((LinearLayout)localObject1).<init>((Context)localObject2);
        this.indicatorArea = ((LinearLayout)localObject1);
        ((LinearLayout)localObject1).setOrientation(0);
        localObject1 = this.textInputView;
        localObject2 = this.indicatorArea;
        int j = -1;
        ((ViewGroup)localObject1).addView((View)localObject2, j, i);
        localObject1 = new android/widget/FrameLayout;
        localObject2 = this.context;
        ((FrameLayout)localObject1).<init>((Context)localObject2);
        this.captionArea = ((FrameLayout)localObject1);
        localObject1 = new android/widget/LinearLayout$LayoutParams;
        float f = 1.0F;
        ((LinearLayout.LayoutParams)localObject1).<init>(0, i, f);
        localObject2 = this.indicatorArea;
        FrameLayout localFrameLayout = this.captionArea;
        ((ViewGroup)localObject2).addView(localFrameLayout, (ViewGroup.LayoutParams)localObject1);
        localObject1 = this.textInputView.getEditText();
        if (localObject1 != null) {
          adjustIndicatorPadding();
        }
      }
    }
    paramInt = isCaptionView(paramInt);
    Object localObject3;
    if (paramInt != 0)
    {
      this.captionArea.setVisibility(0);
      localObject3 = this.captionArea;
      ((ViewGroup)localObject3).addView(paramTextView);
    }
    else
    {
      localObject3 = new android/widget/LinearLayout$LayoutParams;
      ((LinearLayout.LayoutParams)localObject3).<init>(i, i);
      localObject1 = this.indicatorArea;
      ((ViewGroup)localObject1).addView(paramTextView, (ViewGroup.LayoutParams)localObject3);
    }
    this.indicatorArea.setVisibility(0);
    int k = this.indicatorsAdded + 1;
    this.indicatorsAdded = k;
  }
  
  public void adjustIndicatorPadding()
  {
    boolean bool1 = canAdjustIndicatorPadding();
    if (bool1)
    {
      EditText localEditText = this.textInputView.getEditText();
      boolean bool2 = MaterialResources.isFontScaleAtLeast1_3(this.context);
      LinearLayout localLinearLayout = this.indicatorArea;
      int j = R.dimen.material_helper_text_font_1_3_padding_horizontal;
      int k = ViewCompat.Oooo000(localEditText);
      j = getIndicatorPadding(bool2, j, k);
      k = R.dimen.material_helper_text_font_1_3_padding_top;
      Resources localResources = this.context.getResources();
      int m = R.dimen.material_helper_text_default_padding_top;
      int n = localResources.getDimensionPixelSize(m);
      k = getIndicatorPadding(bool2, k, n);
      n = R.dimen.material_helper_text_font_1_3_padding_horizontal;
      int i = ViewCompat.OooOooo(localEditText);
      i = getIndicatorPadding(bool2, n, i);
      bool2 = false;
      ViewCompat.o00000O(localLinearLayout, j, k, i, 0);
    }
  }
  
  public void cancelCaptionAnimator()
  {
    Animator localAnimator = this.captionAnimator;
    if (localAnimator != null) {
      localAnimator.cancel();
    }
  }
  
  public boolean errorIsDisplayed()
  {
    int i = this.captionDisplayed;
    return isCaptionStateError(i);
  }
  
  public boolean errorShouldBeShown()
  {
    int i = this.captionToShow;
    return isCaptionStateError(i);
  }
  
  public int getErrorAccessibilityLiveRegion()
  {
    return this.errorViewAccessibilityLiveRegion;
  }
  
  public CharSequence getErrorContentDescription()
  {
    return this.errorViewContentDescription;
  }
  
  public CharSequence getErrorText()
  {
    return this.errorText;
  }
  
  public int getErrorViewCurrentTextColor()
  {
    TextView localTextView = this.errorView;
    int i;
    if (localTextView != null) {
      i = localTextView.getCurrentTextColor();
    } else {
      i = -1;
    }
    return i;
  }
  
  public ColorStateList getErrorViewTextColors()
  {
    Object localObject = this.errorView;
    if (localObject != null) {
      localObject = ((TextView)localObject).getTextColors();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public CharSequence getHelperText()
  {
    return this.helperText;
  }
  
  public View getHelperTextView()
  {
    return this.helperTextView;
  }
  
  public ColorStateList getHelperTextViewColors()
  {
    Object localObject = this.helperTextView;
    if (localObject != null) {
      localObject = ((TextView)localObject).getTextColors();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public int getHelperTextViewCurrentTextColor()
  {
    TextView localTextView = this.helperTextView;
    int i;
    if (localTextView != null) {
      i = localTextView.getCurrentTextColor();
    } else {
      i = -1;
    }
    return i;
  }
  
  public boolean helperTextIsDisplayed()
  {
    int i = this.captionDisplayed;
    return isCaptionStateHelperText(i);
  }
  
  public boolean helperTextShouldBeShown()
  {
    int i = this.captionToShow;
    return isCaptionStateHelperText(i);
  }
  
  public void hideError()
  {
    CharSequence localCharSequence = null;
    this.errorText = null;
    cancelCaptionAnimator();
    int i = this.captionDisplayed;
    int k = 1;
    if (i == k)
    {
      boolean bool1 = this.helperTextEnabled;
      if (bool1)
      {
        localCharSequence = this.helperText;
        bool1 = TextUtils.isEmpty(localCharSequence);
        if (!bool1)
        {
          j = 2;
          break label55;
        }
      }
      j = 0;
      localCharSequence = null;
      label55:
      this.captionToShow = j;
    }
    int j = this.captionDisplayed;
    k = this.captionToShow;
    TextView localTextView = this.errorView;
    boolean bool2 = shouldAnimateCaptionView(localTextView, "");
    updateCaptionViewsVisibility(j, k, bool2);
  }
  
  public void hideHelperText()
  {
    cancelCaptionAnimator();
    int i = this.captionDisplayed;
    int j = 2;
    if (i == j)
    {
      j = 0;
      this.captionToShow = 0;
    }
    j = this.captionToShow;
    TextView localTextView = this.helperTextView;
    boolean bool = shouldAnimateCaptionView(localTextView, "");
    updateCaptionViewsVisibility(i, j, bool);
  }
  
  public boolean isCaptionView(int paramInt)
  {
    int i = 1;
    if ((paramInt != 0) && (paramInt != i)) {
      i = 0;
    }
    return i;
  }
  
  public boolean isErrorEnabled()
  {
    return this.errorEnabled;
  }
  
  public boolean isHelperTextEnabled()
  {
    return this.helperTextEnabled;
  }
  
  public void removeIndicator(TextView paramTextView, int paramInt)
  {
    LinearLayout localLinearLayout = this.indicatorArea;
    if (localLinearLayout == null) {
      return;
    }
    paramInt = isCaptionView(paramInt);
    if (paramInt != 0)
    {
      localObject = this.captionArea;
      if (localObject != null) {}
    }
    else
    {
      localObject = this.indicatorArea;
    }
    ((ViewGroup)localObject).removeView(paramTextView);
    int i = this.indicatorsAdded + -1;
    this.indicatorsAdded = i;
    Object localObject = this.indicatorArea;
    setViewGroupGoneIfEmpty((ViewGroup)localObject, i);
  }
  
  public void setErrorAccessibilityLiveRegion(int paramInt)
  {
    this.errorViewAccessibilityLiveRegion = paramInt;
    TextView localTextView = this.errorView;
    if (localTextView != null) {
      ViewCompat.o0ooOO0(localTextView, paramInt);
    }
  }
  
  public void setErrorContentDescription(CharSequence paramCharSequence)
  {
    this.errorViewContentDescription = paramCharSequence;
    TextView localTextView = this.errorView;
    if (localTextView != null) {
      localTextView.setContentDescription(paramCharSequence);
    }
  }
  
  public void setErrorEnabled(boolean paramBoolean)
  {
    boolean bool = this.errorEnabled;
    if (bool == paramBoolean) {
      return;
    }
    cancelCaptionAnimator();
    bool = false;
    TextInputLayout localTextInputLayout = null;
    Object localObject1;
    if (paramBoolean)
    {
      localObject1 = new androidx/appcompat/widget/AppCompatTextView;
      Object localObject2 = this.context;
      ((AppCompatTextView)localObject1).<init>((Context)localObject2);
      this.errorView = ((TextView)localObject1);
      int i = R.id.textinput_error;
      ((View)localObject1).setId(i);
      localObject1 = this.errorView;
      i = 5;
      ((View)localObject1).setTextAlignment(i);
      localObject1 = this.typeface;
      if (localObject1 != null)
      {
        localObject2 = this.errorView;
        ((TextView)localObject2).setTypeface((Typeface)localObject1);
      }
      int j = this.errorTextAppearance;
      setErrorTextAppearance(j);
      localObject1 = this.errorViewTextColor;
      setErrorViewTextColor((ColorStateList)localObject1);
      localObject1 = this.errorViewContentDescription;
      setErrorContentDescription((CharSequence)localObject1);
      j = this.errorViewAccessibilityLiveRegion;
      setErrorAccessibilityLiveRegion(j);
      localObject1 = this.errorView;
      i = 4;
      ((View)localObject1).setVisibility(i);
      localObject1 = this.errorView;
      addIndicator((TextView)localObject1, 0);
    }
    else
    {
      hideError();
      localObject1 = this.errorView;
      removeIndicator((TextView)localObject1, 0);
      bool = false;
      this.errorView = null;
      this.textInputView.updateEditTextBackground();
      localTextInputLayout = this.textInputView;
      localTextInputLayout.updateTextInputBoxState();
    }
    this.errorEnabled = paramBoolean;
  }
  
  public void setErrorTextAppearance(int paramInt)
  {
    this.errorTextAppearance = paramInt;
    TextView localTextView = this.errorView;
    if (localTextView != null)
    {
      TextInputLayout localTextInputLayout = this.textInputView;
      localTextInputLayout.setTextAppearanceCompatWithErrorFallback(localTextView, paramInt);
    }
  }
  
  public void setErrorViewTextColor(ColorStateList paramColorStateList)
  {
    this.errorViewTextColor = paramColorStateList;
    TextView localTextView = this.errorView;
    if ((localTextView != null) && (paramColorStateList != null)) {
      localTextView.setTextColor(paramColorStateList);
    }
  }
  
  public void setHelperTextAppearance(int paramInt)
  {
    this.helperTextTextAppearance = paramInt;
    TextView localTextView = this.helperTextView;
    if (localTextView != null) {
      TextViewCompat.OooOOO(localTextView, paramInt);
    }
  }
  
  public void setHelperTextEnabled(boolean paramBoolean)
  {
    boolean bool = this.helperTextEnabled;
    if (bool == paramBoolean) {
      return;
    }
    cancelCaptionAnimator();
    bool = true;
    Object localObject1;
    Object localObject3;
    if (paramBoolean)
    {
      localObject1 = new androidx/appcompat/widget/AppCompatTextView;
      Object localObject2 = this.context;
      ((AppCompatTextView)localObject1).<init>((Context)localObject2);
      this.helperTextView = ((TextView)localObject1);
      int i = R.id.textinput_helper_text;
      ((View)localObject1).setId(i);
      localObject1 = this.helperTextView;
      i = 5;
      ((View)localObject1).setTextAlignment(i);
      localObject1 = this.typeface;
      if (localObject1 != null)
      {
        localObject2 = this.helperTextView;
        ((TextView)localObject2).setTypeface((Typeface)localObject1);
      }
      localObject1 = this.helperTextView;
      i = 4;
      ((View)localObject1).setVisibility(i);
      ViewCompat.o0ooOO0(this.helperTextView, bool);
      int j = this.helperTextTextAppearance;
      setHelperTextAppearance(j);
      localObject1 = this.helperTextViewTextColor;
      setHelperTextViewTextColor((ColorStateList)localObject1);
      localObject1 = this.helperTextView;
      addIndicator((TextView)localObject1, bool);
      localObject3 = this.helperTextView;
      localObject1 = new com/google/android/material/textfield/IndicatorViewController$2;
      ((IndicatorViewController.2)localObject1).<init>(this);
      ((View)localObject3).setAccessibilityDelegate((View.AccessibilityDelegate)localObject1);
    }
    else
    {
      hideHelperText();
      localObject1 = this.helperTextView;
      removeIndicator((TextView)localObject1, bool);
      bool = false;
      this.helperTextView = null;
      this.textInputView.updateEditTextBackground();
      localObject3 = this.textInputView;
      ((TextInputLayout)localObject3).updateTextInputBoxState();
    }
    this.helperTextEnabled = paramBoolean;
  }
  
  public void setHelperTextViewTextColor(ColorStateList paramColorStateList)
  {
    this.helperTextViewTextColor = paramColorStateList;
    TextView localTextView = this.helperTextView;
    if ((localTextView != null) && (paramColorStateList != null)) {
      localTextView.setTextColor(paramColorStateList);
    }
  }
  
  public void setTypefaces(Typeface paramTypeface)
  {
    Object localObject = this.typeface;
    if (paramTypeface != localObject)
    {
      this.typeface = paramTypeface;
      localObject = this.errorView;
      setTextViewTypeface((TextView)localObject, paramTypeface);
      localObject = this.helperTextView;
      setTextViewTypeface((TextView)localObject, paramTypeface);
    }
  }
  
  public void showError(CharSequence paramCharSequence)
  {
    cancelCaptionAnimator();
    this.errorText = paramCharSequence;
    TextView localTextView1 = this.errorView;
    localTextView1.setText(paramCharSequence);
    int i = this.captionDisplayed;
    int j = 1;
    if (i != j) {
      this.captionToShow = j;
    }
    j = this.captionToShow;
    TextView localTextView2 = this.errorView;
    boolean bool = shouldAnimateCaptionView(localTextView2, paramCharSequence);
    updateCaptionViewsVisibility(i, j, bool);
  }
  
  public void showHelper(CharSequence paramCharSequence)
  {
    cancelCaptionAnimator();
    this.helperText = paramCharSequence;
    TextView localTextView1 = this.helperTextView;
    localTextView1.setText(paramCharSequence);
    int i = this.captionDisplayed;
    int j = 2;
    if (i != j) {
      this.captionToShow = j;
    }
    j = this.captionToShow;
    TextView localTextView2 = this.helperTextView;
    boolean bool = shouldAnimateCaptionView(localTextView2, paramCharSequence);
    updateCaptionViewsVisibility(i, j, bool);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.textfield.IndicatorViewController
 * JD-Core Version:    0.7.0.1
 */
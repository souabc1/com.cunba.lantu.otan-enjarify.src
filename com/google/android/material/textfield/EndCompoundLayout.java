package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.string;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m54207b69;

class EndCompoundLayout
  extends LinearLayout
{
  private final AccessibilityManager accessibilityManager;
  private EditText editText;
  private final TextWatcher editTextWatcher;
  private final LinkedHashSet endIconChangedListeners;
  private final EndCompoundLayout.EndIconDelegates endIconDelegates;
  private final FrameLayout endIconFrame;
  private int endIconMinSize;
  private int endIconMode = 0;
  private View.OnLongClickListener endIconOnLongClickListener;
  private ImageView.ScaleType endIconScaleType;
  private ColorStateList endIconTintList;
  private PorterDuff.Mode endIconTintMode;
  private final CheckableImageButton endIconView;
  private View.OnLongClickListener errorIconOnLongClickListener;
  private ColorStateList errorIconTintList;
  private PorterDuff.Mode errorIconTintMode;
  private final CheckableImageButton errorIconView;
  private boolean hintExpanded;
  private final TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener;
  private CharSequence suffixText;
  private final TextView suffixTextView;
  final TextInputLayout textInputLayout;
  private AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener;
  
  public EndCompoundLayout(TextInputLayout paramTextInputLayout, TintTypedArray paramTintTypedArray)
  {
    super((Context)localObject1);
    Object localObject2 = new java/util/LinkedHashSet;
    ((LinkedHashSet)localObject2).<init>();
    this.endIconChangedListeners = ((LinkedHashSet)localObject2);
    localObject2 = new com/google/android/material/textfield/EndCompoundLayout$1;
    ((EndCompoundLayout.1)localObject2).<init>(this);
    this.editTextWatcher = ((TextWatcher)localObject2);
    localObject2 = new com/google/android/material/textfield/EndCompoundLayout$2;
    ((EndCompoundLayout.2)localObject2).<init>(this);
    this.onEditTextAttachedListener = ((TextInputLayout.OnEditTextAttachedListener)localObject2);
    Object localObject3 = getContext();
    Object localObject4 = m54207b69.F54207b69_11("dM2C2F302B42432A362C2A2E4440");
    localObject3 = (AccessibilityManager)((Context)localObject3).getSystemService((String)localObject4);
    this.accessibilityManager = ((AccessibilityManager)localObject3);
    this.textInputLayout = paramTextInputLayout;
    int i = 8;
    setVisibility(i);
    setOrientation(0);
    localObject1 = new android/widget/FrameLayout$LayoutParams;
    int j = -2;
    int k = -1;
    ((FrameLayout.LayoutParams)localObject1).<init>(j, k, 8388613);
    setLayoutParams((ViewGroup.LayoutParams)localObject1);
    localObject1 = new android/widget/FrameLayout;
    localObject4 = getContext();
    ((FrameLayout)localObject1).<init>((Context)localObject4);
    this.endIconFrame = ((FrameLayout)localObject1);
    ((View)localObject1).setVisibility(i);
    localObject3 = new android/widget/LinearLayout$LayoutParams;
    ((LinearLayout.LayoutParams)localObject3).<init>(j, k);
    ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject3);
    localObject3 = LayoutInflater.from(getContext());
    int m = R.id.text_input_error_icon;
    localObject4 = createIconView(this, (LayoutInflater)localObject3, m);
    this.errorIconView = ((CheckableImageButton)localObject4);
    j = R.id.text_input_end_icon;
    localObject3 = createIconView((ViewGroup)localObject1, (LayoutInflater)localObject3, j);
    this.endIconView = ((CheckableImageButton)localObject3);
    Object localObject5 = new com/google/android/material/textfield/EndCompoundLayout$EndIconDelegates;
    ((EndCompoundLayout.EndIconDelegates)localObject5).<init>(this, paramTintTypedArray);
    this.endIconDelegates = ((EndCompoundLayout.EndIconDelegates)localObject5);
    localObject5 = new androidx/appcompat/widget/AppCompatTextView;
    Context localContext = getContext();
    ((AppCompatTextView)localObject5).<init>(localContext);
    this.suffixTextView = ((TextView)localObject5);
    initErrorIconView(paramTintTypedArray);
    initEndIconView(paramTintTypedArray);
    initSuffixTextView(paramTintTypedArray);
    ((ViewGroup)localObject1).addView((View)localObject3);
    addView((View)localObject5);
    addView((View)localObject1);
    addView((View)localObject4);
    paramTextInputLayout.addOnEditTextAttachedListener((TextInputLayout.OnEditTextAttachedListener)localObject2);
    paramTextInputLayout = new com/google/android/material/textfield/EndCompoundLayout$3;
    paramTextInputLayout.<init>(this);
    addOnAttachStateChangeListener(paramTextInputLayout);
  }
  
  private void addTouchExplorationStateChangeListenerIfNeeded()
  {
    Object localObject = this.touchExplorationStateChangeListener;
    if (localObject != null)
    {
      localObject = this.accessibilityManager;
      if (localObject != null)
      {
        boolean bool = ViewCompat.o000oOoO(this);
        if (bool)
        {
          localObject = this.accessibilityManager;
          AccessibilityManagerCompat.TouchExplorationStateChangeListener localTouchExplorationStateChangeListener = this.touchExplorationStateChangeListener;
          AccessibilityManagerCompat.OooO00o((AccessibilityManager)localObject, localTouchExplorationStateChangeListener);
        }
      }
    }
  }
  
  private CheckableImageButton createIconView(ViewGroup paramViewGroup, LayoutInflater paramLayoutInflater, int paramInt)
  {
    int i = R.layout.design_text_input_end_icon;
    paramViewGroup = (CheckableImageButton)paramLayoutInflater.inflate(i, paramViewGroup, false);
    paramViewGroup.setId(paramInt);
    IconHelper.setCompatRippleBackgroundIfNeeded(paramViewGroup);
    paramLayoutInflater = getContext();
    boolean bool = MaterialResources.isFontScaleAtLeast1_3(paramLayoutInflater);
    if (bool)
    {
      paramLayoutInflater = (ViewGroup.MarginLayoutParams)paramViewGroup.getLayoutParams();
      MarginLayoutParamsCompat.OooO0Oo(paramLayoutInflater, 0);
    }
    return paramViewGroup;
  }
  
  private void dispatchOnEndIconChanged(int paramInt)
  {
    Iterator localIterator = this.endIconChangedListeners.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      TextInputLayout.OnEndIconChangedListener localOnEndIconChangedListener = (TextInputLayout.OnEndIconChangedListener)localIterator.next();
      TextInputLayout localTextInputLayout = this.textInputLayout;
      localOnEndIconChangedListener.onEndIconChanged(localTextInputLayout, paramInt);
    }
  }
  
  private int getIconResId(EndIconDelegate paramEndIconDelegate)
  {
    EndCompoundLayout.EndIconDelegates localEndIconDelegates = this.endIconDelegates;
    int i = EndCompoundLayout.EndIconDelegates.access$500(localEndIconDelegates);
    if (i == 0) {
      i = paramEndIconDelegate.getIconDrawableResId();
    }
    return i;
  }
  
  private void initEndIconView(TintTypedArray paramTintTypedArray)
  {
    int i = R.styleable.TextInputLayout_passwordToggleEnabled;
    boolean bool1 = paramTintTypedArray.OooOO0o(i);
    boolean bool11 = false;
    Resources localResources = null;
    int i10 = -1;
    Object localObject;
    if (!bool1)
    {
      int j = R.styleable.TextInputLayout_endIconTint;
      boolean bool2 = paramTintTypedArray.OooOO0o(j);
      if (bool2)
      {
        localObject = getContext();
        i11 = R.styleable.TextInputLayout_endIconTint;
        localObject = MaterialResources.getColorStateList((Context)localObject, paramTintTypedArray, i11);
        this.endIconTintList = ((ColorStateList)localObject);
      }
      int k = R.styleable.TextInputLayout_endIconTintMode;
      boolean bool3 = paramTintTypedArray.OooOO0o(k);
      if (bool3)
      {
        m = R.styleable.TextInputLayout_endIconTintMode;
        m = paramTintTypedArray.OooO0oo(m, i10);
        localObject = ViewUtils.parseTintMode(m, null);
        this.endIconTintMode = ((PorterDuff.Mode)localObject);
      }
    }
    int m = R.styleable.TextInputLayout_endIconMode;
    boolean bool4 = paramTintTypedArray.OooOO0o(m);
    int i11 = 0;
    if (bool4)
    {
      int n = R.styleable.TextInputLayout_endIconMode;
      n = paramTintTypedArray.OooO0oo(n, 0);
      setEndIconMode(n);
      n = R.styleable.TextInputLayout_endIconContentDescription;
      boolean bool5 = paramTintTypedArray.OooOO0o(n);
      if (bool5)
      {
        i1 = R.styleable.TextInputLayout_endIconContentDescription;
        localObject = paramTintTypedArray.getText(i1);
        setEndIconContentDescription((CharSequence)localObject);
      }
      int i1 = R.styleable.TextInputLayout_endIconCheckable;
      bool11 = true;
      boolean bool6 = paramTintTypedArray.OooO00o(i1, bool11);
      setEndIconCheckable(bool6);
    }
    else
    {
      int i2 = R.styleable.TextInputLayout_passwordToggleEnabled;
      boolean bool7 = paramTintTypedArray.OooOO0o(i2);
      if (bool7)
      {
        int i3 = R.styleable.TextInputLayout_passwordToggleTint;
        boolean bool8 = paramTintTypedArray.OooOO0o(i3);
        if (bool8)
        {
          localObject = getContext();
          int i12 = R.styleable.TextInputLayout_passwordToggleTint;
          localObject = MaterialResources.getColorStateList((Context)localObject, paramTintTypedArray, i12);
          this.endIconTintList = ((ColorStateList)localObject);
        }
        int i4 = R.styleable.TextInputLayout_passwordToggleTintMode;
        boolean bool9 = paramTintTypedArray.OooOO0o(i4);
        if (bool9)
        {
          i5 = R.styleable.TextInputLayout_passwordToggleTintMode;
          i5 = paramTintTypedArray.OooO0oo(i5, i10);
          localObject = ViewUtils.parseTintMode(i5, null);
          this.endIconTintMode = ((PorterDuff.Mode)localObject);
        }
        int i5 = R.styleable.TextInputLayout_passwordToggleEnabled;
        int i6 = paramTintTypedArray.OooO00o(i5, false);
        setEndIconMode(i6);
        i7 = R.styleable.TextInputLayout_passwordToggleContentDescription;
        localObject = paramTintTypedArray.getText(i7);
        setEndIconContentDescription((CharSequence)localObject);
      }
    }
    int i7 = R.styleable.TextInputLayout_endIconMinSize;
    localResources = getResources();
    i11 = R.dimen.mtrl_min_touch_target_size;
    int i9 = localResources.getDimensionPixelSize(i11);
    i7 = paramTintTypedArray.OooO0o0(i7, i9);
    setEndIconMinSize(i7);
    i7 = R.styleable.TextInputLayout_endIconScaleType;
    boolean bool10 = paramTintTypedArray.OooOO0o(i7);
    if (bool10)
    {
      int i8 = R.styleable.TextInputLayout_endIconScaleType;
      int i13 = paramTintTypedArray.OooO0oo(i8, i10);
      paramTintTypedArray = IconHelper.convertScaleType(i13);
      setEndIconScaleType(paramTintTypedArray);
    }
  }
  
  private void initErrorIconView(TintTypedArray paramTintTypedArray)
  {
    int i = R.styleable.TextInputLayout_errorIconTint;
    boolean bool1 = paramTintTypedArray.OooOO0o(i);
    if (bool1)
    {
      localObject = getContext();
      n = R.styleable.TextInputLayout_errorIconTint;
      localObject = MaterialResources.getColorStateList((Context)localObject, paramTintTypedArray, n);
      this.errorIconTintList = ((ColorStateList)localObject);
    }
    int j = R.styleable.TextInputLayout_errorIconTintMode;
    boolean bool2 = paramTintTypedArray.OooOO0o(j);
    if (bool2)
    {
      k = R.styleable.TextInputLayout_errorIconTintMode;
      k = paramTintTypedArray.OooO0oo(k, -1);
      n = 0;
      localObject = ViewUtils.parseTintMode(k, null);
      this.errorIconTintMode = ((PorterDuff.Mode)localObject);
    }
    int k = R.styleable.TextInputLayout_errorIconDrawable;
    boolean bool3 = paramTintTypedArray.OooOO0o(k);
    if (bool3)
    {
      int m = R.styleable.TextInputLayout_errorIconDrawable;
      paramTintTypedArray = paramTintTypedArray.getDrawable(m);
      setErrorIconDrawable(paramTintTypedArray);
    }
    paramTintTypedArray = this.errorIconView;
    Object localObject = getResources();
    int n = R.string.error_icon_content_description;
    localObject = ((Resources)localObject).getText(n);
    paramTintTypedArray.setContentDescription((CharSequence)localObject);
    ViewCompat.o000000(this.errorIconView, 2);
    this.errorIconView.setClickable(false);
    this.errorIconView.setPressable(false);
    this.errorIconView.setFocusable(false);
  }
  
  private void initSuffixTextView(TintTypedArray paramTintTypedArray)
  {
    this.suffixTextView.setVisibility(8);
    Object localObject = this.suffixTextView;
    int i = R.id.textinput_suffix_text;
    ((View)localObject).setId(i);
    localObject = this.suffixTextView;
    LinearLayout.LayoutParams localLayoutParams = new android/widget/LinearLayout$LayoutParams;
    int j = -2;
    float f = 80.0F;
    localLayoutParams.<init>(j, j, f);
    ((View)localObject).setLayoutParams(localLayoutParams);
    localObject = this.suffixTextView;
    ViewCompat.o0ooOO0((View)localObject, 1);
    int k = R.styleable.TextInputLayout_suffixTextAppearance;
    i = 0;
    localLayoutParams = null;
    k = paramTintTypedArray.OooOO0O(k, 0);
    setSuffixTextAppearance(k);
    k = R.styleable.TextInputLayout_suffixTextColor;
    boolean bool = paramTintTypedArray.OooOO0o(k);
    if (bool)
    {
      m = R.styleable.TextInputLayout_suffixTextColor;
      localObject = paramTintTypedArray.getColorStateList(m);
      setSuffixTextColor((ColorStateList)localObject);
    }
    int m = R.styleable.TextInputLayout_suffixText;
    paramTintTypedArray = paramTintTypedArray.getText(m);
    setSuffixText(paramTintTypedArray);
  }
  
  private void removeTouchExplorationStateChangeListenerIfNeeded()
  {
    AccessibilityManagerCompat.TouchExplorationStateChangeListener localTouchExplorationStateChangeListener = this.touchExplorationStateChangeListener;
    if (localTouchExplorationStateChangeListener != null)
    {
      AccessibilityManager localAccessibilityManager = this.accessibilityManager;
      if (localAccessibilityManager != null) {
        AccessibilityManagerCompat.OooO0O0(localAccessibilityManager, localTouchExplorationStateChangeListener);
      }
    }
  }
  
  private void setOnFocusChangeListenersIfNeeded(EndIconDelegate paramEndIconDelegate)
  {
    Object localObject = this.editText;
    if (localObject == null) {
      return;
    }
    localObject = paramEndIconDelegate.getOnEditTextFocusChangeListener();
    if (localObject != null)
    {
      localObject = this.editText;
      View.OnFocusChangeListener localOnFocusChangeListener = paramEndIconDelegate.getOnEditTextFocusChangeListener();
      ((View)localObject).setOnFocusChangeListener(localOnFocusChangeListener);
    }
    localObject = paramEndIconDelegate.getOnIconViewFocusChangeListener();
    if (localObject != null)
    {
      localObject = this.endIconView;
      paramEndIconDelegate = paramEndIconDelegate.getOnIconViewFocusChangeListener();
      ((View)localObject).setOnFocusChangeListener(paramEndIconDelegate);
    }
  }
  
  private void setUpDelegate(EndIconDelegate paramEndIconDelegate)
  {
    paramEndIconDelegate.setUp();
    paramEndIconDelegate = paramEndIconDelegate.getTouchExplorationStateChangeListener();
    this.touchExplorationStateChangeListener = paramEndIconDelegate;
    addTouchExplorationStateChangeListenerIfNeeded();
  }
  
  private void tearDownDelegate(EndIconDelegate paramEndIconDelegate)
  {
    removeTouchExplorationStateChangeListenerIfNeeded();
    this.touchExplorationStateChangeListener = null;
    paramEndIconDelegate.tearDown();
  }
  
  private void tintEndIconOnError(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      localObject = getEndIconDrawable();
      if (localObject != null)
      {
        localObject = DrawableCompat.OooOOo(getEndIconDrawable()).mutate();
        int i = this.textInputLayout.getErrorCurrentTextColors();
        DrawableCompat.OooOOO((Drawable)localObject, i);
        localCheckableImageButton = this.endIconView;
        localCheckableImageButton.setImageDrawable((Drawable)localObject);
        return;
      }
    }
    Object localObject = this.textInputLayout;
    CheckableImageButton localCheckableImageButton = this.endIconView;
    ColorStateList localColorStateList = this.endIconTintList;
    PorterDuff.Mode localMode = this.endIconTintMode;
    IconHelper.applyIconTint((TextInputLayout)localObject, localCheckableImageButton, localColorStateList, localMode);
  }
  
  private void updateEndLayoutVisibility()
  {
    Object localObject = this.endIconFrame;
    CheckableImageButton localCheckableImageButton = this.endIconView;
    int i = localCheckableImageButton.getVisibility();
    int k = 8;
    if (i == 0)
    {
      j = isErrorIconVisible();
      if (j == 0)
      {
        j = 0;
        localCheckableImageButton = null;
        break label42;
      }
    }
    int j = k;
    label42:
    ((View)localObject).setVisibility(j);
    localObject = this.suffixText;
    if (localObject != null)
    {
      bool2 = this.hintExpanded;
      if (!bool2)
      {
        bool2 = false;
        localObject = null;
        break label79;
      }
    }
    boolean bool2 = k;
    label79:
    boolean bool1 = isEndIconVisible();
    if (!bool1)
    {
      bool1 = isErrorIconVisible();
      if ((!bool1) && (bool2))
      {
        bool2 = false;
        localObject = null;
        break label116;
      }
    }
    bool2 = true;
    label116:
    if (bool2) {
      k = 0;
    }
    setVisibility(k);
  }
  
  private void updateErrorIconVisibility()
  {
    Object localObject = getErrorIconDrawable();
    int i = 0;
    if (localObject != null)
    {
      localObject = this.textInputLayout;
      bool = ((TextInputLayout)localObject).isErrorEnabled();
      if (bool)
      {
        localObject = this.textInputLayout;
        bool = ((TextInputLayout)localObject).shouldShowError();
        if (bool)
        {
          bool = true;
          break label48;
        }
      }
    }
    boolean bool = false;
    localObject = null;
    label48:
    CheckableImageButton localCheckableImageButton = this.errorIconView;
    if (!bool) {
      i = 8;
    }
    localCheckableImageButton.setVisibility(i);
    updateEndLayoutVisibility();
    updateSuffixTextViewPadding();
    bool = hasEndIcon();
    if (!bool)
    {
      localObject = this.textInputLayout;
      ((TextInputLayout)localObject).updateDummyDrawables();
    }
  }
  
  private void updateSuffixTextVisibility()
  {
    Object localObject = this.suffixTextView;
    int i = ((View)localObject).getVisibility();
    CharSequence localCharSequence = this.suffixText;
    boolean bool1 = false;
    if (localCharSequence != null)
    {
      boolean bool2 = this.hintExpanded;
      if (!bool2)
      {
        bool2 = false;
        localCharSequence = null;
        break label45;
      }
    }
    int j = 8;
    label45:
    if (i != j)
    {
      localObject = getEndIconDelegate();
      if (j == 0) {
        bool1 = true;
      }
      ((EndIconDelegate)localObject).onSuffixVisibilityChanged(bool1);
    }
    updateEndLayoutVisibility();
    this.suffixTextView.setVisibility(j);
    this.textInputLayout.updateDummyDrawables();
  }
  
  public void addOnEndIconChangedListener(TextInputLayout.OnEndIconChangedListener paramOnEndIconChangedListener)
  {
    this.endIconChangedListeners.add(paramOnEndIconChangedListener);
  }
  
  public void checkEndIcon()
  {
    this.endIconView.performClick();
    this.endIconView.jumpDrawablesToCurrentState();
  }
  
  public void clearOnEndIconChangedListeners()
  {
    this.endIconChangedListeners.clear();
  }
  
  public CheckableImageButton getCurrentEndIconView()
  {
    boolean bool = isErrorIconVisible();
    if (bool) {
      return this.errorIconView;
    }
    bool = hasEndIcon();
    if (bool)
    {
      bool = isEndIconVisible();
      if (bool) {
        return this.endIconView;
      }
    }
    return null;
  }
  
  public CharSequence getEndIconContentDescription()
  {
    return this.endIconView.getContentDescription();
  }
  
  public EndIconDelegate getEndIconDelegate()
  {
    EndCompoundLayout.EndIconDelegates localEndIconDelegates = this.endIconDelegates;
    int i = this.endIconMode;
    return localEndIconDelegates.get(i);
  }
  
  public Drawable getEndIconDrawable()
  {
    return this.endIconView.getDrawable();
  }
  
  public int getEndIconMinSize()
  {
    return this.endIconMinSize;
  }
  
  public int getEndIconMode()
  {
    return this.endIconMode;
  }
  
  public ImageView.ScaleType getEndIconScaleType()
  {
    return this.endIconScaleType;
  }
  
  public CheckableImageButton getEndIconView()
  {
    return this.endIconView;
  }
  
  public Drawable getErrorIconDrawable()
  {
    return this.errorIconView.getDrawable();
  }
  
  public CharSequence getPasswordVisibilityToggleContentDescription()
  {
    return this.endIconView.getContentDescription();
  }
  
  public Drawable getPasswordVisibilityToggleDrawable()
  {
    return this.endIconView.getDrawable();
  }
  
  public CharSequence getSuffixText()
  {
    return this.suffixText;
  }
  
  public ColorStateList getSuffixTextColor()
  {
    return this.suffixTextView.getTextColors();
  }
  
  public TextView getSuffixTextView()
  {
    return this.suffixTextView;
  }
  
  public boolean hasEndIcon()
  {
    int i = this.endIconMode;
    if (i != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean isEndIconCheckable()
  {
    return this.endIconView.isCheckable();
  }
  
  public boolean isEndIconChecked()
  {
    boolean bool = hasEndIcon();
    if (bool)
    {
      localCheckableImageButton = this.endIconView;
      bool = localCheckableImageButton.isChecked();
      if (bool) {
        return true;
      }
    }
    bool = false;
    CheckableImageButton localCheckableImageButton = null;
    return bool;
  }
  
  public boolean isEndIconVisible()
  {
    Object localObject = this.endIconFrame;
    int i = ((View)localObject).getVisibility();
    if (i == 0)
    {
      localObject = this.endIconView;
      i = ((View)localObject).getVisibility();
      if (i == 0) {
        return 1;
      }
    }
    i = 0;
    localObject = null;
    return i;
  }
  
  public boolean isErrorIconVisible()
  {
    CheckableImageButton localCheckableImageButton = this.errorIconView;
    int i = localCheckableImageButton.getVisibility();
    if (i == 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      localCheckableImageButton = null;
    }
    return i;
  }
  
  public boolean isPasswordVisibilityToggleEnabled()
  {
    int i = this.endIconMode;
    int j = 1;
    if (i != j) {
      j = 0;
    }
    return j;
  }
  
  public void onHintStateChanged(boolean paramBoolean)
  {
    this.hintExpanded = paramBoolean;
    updateSuffixTextVisibility();
  }
  
  public void onTextInputBoxStateUpdated()
  {
    updateErrorIconVisibility();
    refreshErrorIconDrawableState();
    refreshEndIconDrawableState();
    Object localObject = getEndIconDelegate();
    boolean bool = ((EndIconDelegate)localObject).shouldTintIconOnError();
    if (bool)
    {
      localObject = this.textInputLayout;
      bool = ((TextInputLayout)localObject).shouldShowError();
      tintEndIconOnError(bool);
    }
  }
  
  public void refreshEndIconDrawableState()
  {
    TextInputLayout localTextInputLayout = this.textInputLayout;
    CheckableImageButton localCheckableImageButton = this.endIconView;
    ColorStateList localColorStateList = this.endIconTintList;
    IconHelper.refreshIconDrawableState(localTextInputLayout, localCheckableImageButton, localColorStateList);
  }
  
  public void refreshErrorIconDrawableState()
  {
    TextInputLayout localTextInputLayout = this.textInputLayout;
    CheckableImageButton localCheckableImageButton = this.errorIconView;
    ColorStateList localColorStateList = this.errorIconTintList;
    IconHelper.refreshIconDrawableState(localTextInputLayout, localCheckableImageButton, localColorStateList);
  }
  
  public void refreshIconState(boolean paramBoolean)
  {
    EndIconDelegate localEndIconDelegate = getEndIconDelegate();
    boolean bool1 = localEndIconDelegate.isIconCheckable();
    boolean bool2 = true;
    float f1 = 1.4E-45F;
    CheckableImageButton localCheckableImageButton2;
    if (bool1)
    {
      localCheckableImageButton1 = this.endIconView;
      bool1 = localCheckableImageButton1.isChecked();
      bool3 = localEndIconDelegate.isIconChecked();
      if (bool1 != bool3)
      {
        localCheckableImageButton2 = this.endIconView;
        bool1 ^= bool2;
        localCheckableImageButton2.setChecked(bool1);
        bool1 = bool2;
        f2 = f1;
        break label81;
      }
    }
    bool1 = false;
    float f2 = 0.0F;
    CheckableImageButton localCheckableImageButton1 = null;
    label81:
    boolean bool3 = localEndIconDelegate.isIconActivable();
    if (bool3)
    {
      localCheckableImageButton2 = this.endIconView;
      bool3 = localCheckableImageButton2.isActivated();
      boolean bool4 = localEndIconDelegate.isIconActivated();
      if (bool3 != bool4)
      {
        bool4 = bool3 ^ true;
        setEndIconActivated(bool4);
        break label140;
      }
    }
    bool2 = bool1;
    f1 = f2;
    label140:
    if ((paramBoolean) || (bool2)) {
      refreshEndIconDrawableState();
    }
  }
  
  public void removeOnEndIconChangedListener(TextInputLayout.OnEndIconChangedListener paramOnEndIconChangedListener)
  {
    this.endIconChangedListeners.remove(paramOnEndIconChangedListener);
  }
  
  public void setEndIconActivated(boolean paramBoolean)
  {
    this.endIconView.setActivated(paramBoolean);
  }
  
  public void setEndIconCheckable(boolean paramBoolean)
  {
    this.endIconView.setCheckable(paramBoolean);
  }
  
  public void setEndIconContentDescription(int paramInt)
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
    setEndIconContentDescription(localCharSequence);
  }
  
  public void setEndIconContentDescription(CharSequence paramCharSequence)
  {
    Object localObject = getEndIconContentDescription();
    if (localObject != paramCharSequence)
    {
      localObject = this.endIconView;
      ((View)localObject).setContentDescription(paramCharSequence);
    }
  }
  
  public void setEndIconDrawable(int paramInt)
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
    setEndIconDrawable(localDrawable);
  }
  
  public void setEndIconDrawable(Drawable paramDrawable)
  {
    CheckableImageButton localCheckableImageButton = this.endIconView;
    localCheckableImageButton.setImageDrawable(paramDrawable);
    if (paramDrawable != null)
    {
      paramDrawable = this.textInputLayout;
      localCheckableImageButton = this.endIconView;
      ColorStateList localColorStateList = this.endIconTintList;
      PorterDuff.Mode localMode = this.endIconTintMode;
      IconHelper.applyIconTint(paramDrawable, localCheckableImageButton, localColorStateList, localMode);
      refreshEndIconDrawableState();
    }
  }
  
  public void setEndIconMinSize(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = this.endIconMinSize;
      if (paramInt != i)
      {
        this.endIconMinSize = paramInt;
        IconHelper.setIconMinSize(this.endIconView, paramInt);
        localObject = this.errorIconView;
        IconHelper.setIconMinSize((CheckableImageButton)localObject, paramInt);
      }
      return;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    Object localObject = m54207b69.F54207b69_11("BB272D280E253232183341316D2D303A3B3D4774333B77443E494A7C5146404A8192");
    localIllegalArgumentException.<init>((String)localObject);
    throw localIllegalArgumentException;
  }
  
  public void setEndIconMode(int paramInt)
  {
    int i = this.endIconMode;
    if (i == paramInt) {
      return;
    }
    Object localObject1 = getEndIconDelegate();
    tearDownDelegate((EndIconDelegate)localObject1);
    i = this.endIconMode;
    this.endIconMode = paramInt;
    dispatchOnEndIconChanged(i);
    i = 1;
    int j;
    if (paramInt != 0)
    {
      j = i;
    }
    else
    {
      j = 0;
      localObject2 = null;
    }
    setEndIconVisible(j);
    Object localObject2 = getEndIconDelegate();
    int k = getIconResId((EndIconDelegate)localObject2);
    setEndIconDrawable(k);
    k = ((EndIconDelegate)localObject2).getIconContentDescriptionResId();
    setEndIconContentDescription(k);
    boolean bool1 = ((EndIconDelegate)localObject2).isIconCheckable();
    setEndIconCheckable(bool1);
    Object localObject3 = this.textInputLayout;
    int m = ((TextInputLayout)localObject3).getBoxBackgroundMode();
    boolean bool2 = ((EndIconDelegate)localObject2).isBoxBackgroundModeSupported(m);
    if (bool2)
    {
      setUpDelegate((EndIconDelegate)localObject2);
      localObject4 = ((EndIconDelegate)localObject2).getOnIconClickListener();
      setEndIconOnClickListener((View.OnClickListener)localObject4);
      localObject4 = this.editText;
      if (localObject4 != null)
      {
        ((EndIconDelegate)localObject2).onEditTextAttached((EditText)localObject4);
        setOnFocusChangeListenersIfNeeded((EndIconDelegate)localObject2);
      }
      localObject4 = this.textInputLayout;
      localObject2 = this.endIconView;
      localObject3 = this.endIconTintList;
      PorterDuff.Mode localMode = this.endIconTintMode;
      IconHelper.applyIconTint((TextInputLayout)localObject4, (CheckableImageButton)localObject2, (ColorStateList)localObject3, localMode);
      refreshIconState(i);
      return;
    }
    localObject1 = new java/lang/IllegalStateException;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject3 = m54207b69.F54207b69_11("cu211E12581A050D0E18240B6023271B6427252831261C3017332A6F33362E2E74");
    ((StringBuilder)localObject2).append((String)localObject3);
    int n = this.textInputLayout.getBoxBackgroundMode();
    ((StringBuilder)localObject2).append(n);
    localObject3 = m54207b69.F54207b69_11("I\\7C36317F36382E83373236373F3B3648488D5038903D4A5094524C5398525D52529D53565C5EA2");
    ((StringBuilder)localObject2).append((String)localObject3);
    ((StringBuilder)localObject2).append(paramInt);
    Object localObject4 = ((StringBuilder)localObject2).toString();
    ((IllegalStateException)localObject1).<init>((String)localObject4);
    throw ((Throwable)localObject1);
  }
  
  public void setEndIconOnClickListener(View.OnClickListener paramOnClickListener)
  {
    CheckableImageButton localCheckableImageButton = this.endIconView;
    View.OnLongClickListener localOnLongClickListener = this.endIconOnLongClickListener;
    IconHelper.setIconOnClickListener(localCheckableImageButton, paramOnClickListener, localOnLongClickListener);
  }
  
  public void setEndIconOnLongClickListener(View.OnLongClickListener paramOnLongClickListener)
  {
    this.endIconOnLongClickListener = paramOnLongClickListener;
    IconHelper.setIconOnLongClickListener(this.endIconView, paramOnLongClickListener);
  }
  
  public void setEndIconScaleType(ImageView.ScaleType paramScaleType)
  {
    this.endIconScaleType = paramScaleType;
    IconHelper.setIconScaleType(this.endIconView, paramScaleType);
    IconHelper.setIconScaleType(this.errorIconView, paramScaleType);
  }
  
  public void setEndIconTintList(ColorStateList paramColorStateList)
  {
    Object localObject = this.endIconTintList;
    if (localObject != paramColorStateList)
    {
      this.endIconTintList = paramColorStateList;
      localObject = this.textInputLayout;
      CheckableImageButton localCheckableImageButton = this.endIconView;
      PorterDuff.Mode localMode = this.endIconTintMode;
      IconHelper.applyIconTint((TextInputLayout)localObject, localCheckableImageButton, paramColorStateList, localMode);
    }
  }
  
  public void setEndIconTintMode(PorterDuff.Mode paramMode)
  {
    Object localObject = this.endIconTintMode;
    if (localObject != paramMode)
    {
      this.endIconTintMode = paramMode;
      localObject = this.textInputLayout;
      CheckableImageButton localCheckableImageButton = this.endIconView;
      ColorStateList localColorStateList = this.endIconTintList;
      IconHelper.applyIconTint((TextInputLayout)localObject, localCheckableImageButton, localColorStateList, paramMode);
    }
  }
  
  public void setEndIconVisible(boolean paramBoolean)
  {
    boolean bool = isEndIconVisible();
    if (bool != paramBoolean)
    {
      CheckableImageButton localCheckableImageButton = this.endIconView;
      if (paramBoolean)
      {
        paramBoolean = false;
        localTextInputLayout = null;
      }
      else
      {
        paramBoolean = true;
      }
      localCheckableImageButton.setVisibility(paramBoolean);
      updateEndLayoutVisibility();
      updateSuffixTextViewPadding();
      TextInputLayout localTextInputLayout = this.textInputLayout;
      localTextInputLayout.updateDummyDrawables();
    }
  }
  
  public void setErrorIconDrawable(int paramInt)
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
    setErrorIconDrawable(localDrawable);
    refreshErrorIconDrawableState();
  }
  
  public void setErrorIconDrawable(Drawable paramDrawable)
  {
    this.errorIconView.setImageDrawable(paramDrawable);
    updateErrorIconVisibility();
    paramDrawable = this.textInputLayout;
    CheckableImageButton localCheckableImageButton = this.errorIconView;
    ColorStateList localColorStateList = this.errorIconTintList;
    PorterDuff.Mode localMode = this.errorIconTintMode;
    IconHelper.applyIconTint(paramDrawable, localCheckableImageButton, localColorStateList, localMode);
  }
  
  public void setErrorIconOnClickListener(View.OnClickListener paramOnClickListener)
  {
    CheckableImageButton localCheckableImageButton = this.errorIconView;
    View.OnLongClickListener localOnLongClickListener = this.errorIconOnLongClickListener;
    IconHelper.setIconOnClickListener(localCheckableImageButton, paramOnClickListener, localOnLongClickListener);
  }
  
  public void setErrorIconOnLongClickListener(View.OnLongClickListener paramOnLongClickListener)
  {
    this.errorIconOnLongClickListener = paramOnLongClickListener;
    IconHelper.setIconOnLongClickListener(this.errorIconView, paramOnLongClickListener);
  }
  
  public void setErrorIconTintList(ColorStateList paramColorStateList)
  {
    Object localObject = this.errorIconTintList;
    if (localObject != paramColorStateList)
    {
      this.errorIconTintList = paramColorStateList;
      localObject = this.textInputLayout;
      CheckableImageButton localCheckableImageButton = this.errorIconView;
      PorterDuff.Mode localMode = this.errorIconTintMode;
      IconHelper.applyIconTint((TextInputLayout)localObject, localCheckableImageButton, paramColorStateList, localMode);
    }
  }
  
  public void setErrorIconTintMode(PorterDuff.Mode paramMode)
  {
    Object localObject = this.errorIconTintMode;
    if (localObject != paramMode)
    {
      this.errorIconTintMode = paramMode;
      localObject = this.textInputLayout;
      CheckableImageButton localCheckableImageButton = this.errorIconView;
      ColorStateList localColorStateList = this.errorIconTintList;
      IconHelper.applyIconTint((TextInputLayout)localObject, localCheckableImageButton, localColorStateList, paramMode);
    }
  }
  
  public void setPasswordVisibilityToggleContentDescription(int paramInt)
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
    setPasswordVisibilityToggleContentDescription(localCharSequence);
  }
  
  public void setPasswordVisibilityToggleContentDescription(CharSequence paramCharSequence)
  {
    this.endIconView.setContentDescription(paramCharSequence);
  }
  
  public void setPasswordVisibilityToggleDrawable(int paramInt)
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
    setPasswordVisibilityToggleDrawable(localDrawable);
  }
  
  public void setPasswordVisibilityToggleDrawable(Drawable paramDrawable)
  {
    this.endIconView.setImageDrawable(paramDrawable);
  }
  
  public void setPasswordVisibilityToggleEnabled(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      int i = this.endIconMode;
      int j = 1;
      if (i != j)
      {
        setEndIconMode(j);
        return;
      }
    }
    if (!paramBoolean)
    {
      paramBoolean = false;
      setEndIconMode(0);
    }
  }
  
  public void setPasswordVisibilityToggleTintList(ColorStateList paramColorStateList)
  {
    this.endIconTintList = paramColorStateList;
    TextInputLayout localTextInputLayout = this.textInputLayout;
    CheckableImageButton localCheckableImageButton = this.endIconView;
    PorterDuff.Mode localMode = this.endIconTintMode;
    IconHelper.applyIconTint(localTextInputLayout, localCheckableImageButton, paramColorStateList, localMode);
  }
  
  public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode paramMode)
  {
    this.endIconTintMode = paramMode;
    TextInputLayout localTextInputLayout = this.textInputLayout;
    CheckableImageButton localCheckableImageButton = this.endIconView;
    ColorStateList localColorStateList = this.endIconTintList;
    IconHelper.applyIconTint(localTextInputLayout, localCheckableImageButton, localColorStateList, paramMode);
  }
  
  public void setSuffixText(CharSequence paramCharSequence)
  {
    boolean bool = TextUtils.isEmpty(paramCharSequence);
    CharSequence localCharSequence;
    if (bool)
    {
      bool = false;
      localCharSequence = null;
    }
    else
    {
      localCharSequence = paramCharSequence;
    }
    this.suffixText = localCharSequence;
    this.suffixTextView.setText(paramCharSequence);
    updateSuffixTextVisibility();
  }
  
  public void setSuffixTextAppearance(int paramInt)
  {
    TextViewCompat.OooOOO(this.suffixTextView, paramInt);
  }
  
  public void setSuffixTextColor(ColorStateList paramColorStateList)
  {
    this.suffixTextView.setTextColor(paramColorStateList);
  }
  
  public void togglePasswordVisibilityToggle(boolean paramBoolean)
  {
    int i = this.endIconMode;
    int j = 1;
    if (i == j)
    {
      CheckableImageButton localCheckableImageButton1 = this.endIconView;
      localCheckableImageButton1.performClick();
      if (paramBoolean)
      {
        CheckableImageButton localCheckableImageButton2 = this.endIconView;
        localCheckableImageButton2.jumpDrawablesToCurrentState();
      }
    }
  }
  
  public void updateSuffixTextViewPadding()
  {
    EditText localEditText = this.textInputLayout.editText;
    if (localEditText == null) {
      return;
    }
    boolean bool = isEndIconVisible();
    if (!bool)
    {
      bool = isErrorIconVisible();
      if (!bool)
      {
        localEditText = this.textInputLayout.editText;
        i = ViewCompat.OooOooo(localEditText);
        break label54;
      }
    }
    int i = 0;
    localEditText = null;
    label54:
    TextView localTextView = this.suffixTextView;
    Resources localResources = getContext().getResources();
    int j = R.dimen.material_input_text_to_prefix_suffix_padding;
    int k = localResources.getDimensionPixelSize(j);
    j = this.textInputLayout.editText.getPaddingTop();
    int m = this.textInputLayout.editText.getPaddingBottom();
    ViewCompat.o00000O(localTextView, k, j, i, m);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.textfield.EndCompoundLayout
 * JD-Core Version:    0.7.0.1
 */
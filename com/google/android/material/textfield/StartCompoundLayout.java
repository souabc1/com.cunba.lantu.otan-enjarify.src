package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import m54207b69;

class StartCompoundLayout
  extends LinearLayout
{
  private boolean hintExpanded;
  private CharSequence prefixText;
  private final TextView prefixTextView;
  private int startIconMinSize;
  private View.OnLongClickListener startIconOnLongClickListener;
  private ImageView.ScaleType startIconScaleType;
  private ColorStateList startIconTintList;
  private PorterDuff.Mode startIconTintMode;
  private final CheckableImageButton startIconView;
  private final TextInputLayout textInputLayout;
  
  public StartCompoundLayout(TextInputLayout paramTextInputLayout, TintTypedArray paramTintTypedArray)
  {
    super((Context)localObject);
    this.textInputLayout = paramTextInputLayout;
    setVisibility(8);
    setOrientation(0);
    localObject = new android/widget/FrameLayout$LayoutParams;
    ((FrameLayout.LayoutParams)localObject).<init>(-2, -1, 8388611);
    setLayoutParams((ViewGroup.LayoutParams)localObject);
    localObject = LayoutInflater.from(getContext());
    int i = R.layout.design_text_input_start_icon;
    paramTextInputLayout = (CheckableImageButton)((LayoutInflater)localObject).inflate(i, this, false);
    this.startIconView = paramTextInputLayout;
    IconHelper.setCompatRippleBackgroundIfNeeded(paramTextInputLayout);
    localObject = new androidx/appcompat/widget/AppCompatTextView;
    Context localContext = getContext();
    ((AppCompatTextView)localObject).<init>(localContext);
    this.prefixTextView = ((TextView)localObject);
    initStartIconView(paramTintTypedArray);
    initPrefixTextView(paramTintTypedArray);
    addView(paramTextInputLayout);
    addView((View)localObject);
  }
  
  private void initPrefixTextView(TintTypedArray paramTintTypedArray)
  {
    this.prefixTextView.setVisibility(8);
    Object localObject = this.prefixTextView;
    int i = R.id.textinput_prefix_text;
    ((View)localObject).setId(i);
    localObject = this.prefixTextView;
    LinearLayout.LayoutParams localLayoutParams = new android/widget/LinearLayout$LayoutParams;
    int j = -2;
    localLayoutParams.<init>(j, j);
    ((View)localObject).setLayoutParams(localLayoutParams);
    localObject = this.prefixTextView;
    ViewCompat.o0ooOO0((View)localObject, 1);
    int k = R.styleable.TextInputLayout_prefixTextAppearance;
    i = 0;
    localLayoutParams = null;
    k = paramTintTypedArray.OooOO0O(k, 0);
    setPrefixTextAppearance(k);
    k = R.styleable.TextInputLayout_prefixTextColor;
    boolean bool = paramTintTypedArray.OooOO0o(k);
    if (bool)
    {
      m = R.styleable.TextInputLayout_prefixTextColor;
      localObject = paramTintTypedArray.getColorStateList(m);
      setPrefixTextColor((ColorStateList)localObject);
    }
    int m = R.styleable.TextInputLayout_prefixText;
    paramTintTypedArray = paramTintTypedArray.getText(m);
    setPrefixText(paramTintTypedArray);
  }
  
  private void initStartIconView(TintTypedArray paramTintTypedArray)
  {
    Object localObject1 = getContext();
    boolean bool1 = MaterialResources.isFontScaleAtLeast1_3((Context)localObject1);
    if (bool1)
    {
      localObject1 = (ViewGroup.MarginLayoutParams)this.startIconView.getLayoutParams();
      i1 = 0;
      localObject2 = null;
      MarginLayoutParamsCompat.OooO0OO((ViewGroup.MarginLayoutParams)localObject1, 0);
    }
    bool1 = false;
    localObject1 = null;
    setStartIconOnClickListener(null);
    setStartIconOnLongClickListener(null);
    int i1 = R.styleable.TextInputLayout_startIconTint;
    boolean bool6 = paramTintTypedArray.OooOO0o(i1);
    if (bool6)
    {
      localObject2 = getContext();
      i5 = R.styleable.TextInputLayout_startIconTint;
      localObject2 = MaterialResources.getColorStateList((Context)localObject2, paramTintTypedArray, i5);
      this.startIconTintList = ((ColorStateList)localObject2);
    }
    int i2 = R.styleable.TextInputLayout_startIconTintMode;
    boolean bool7 = paramTintTypedArray.OooOO0o(i2);
    int i5 = -1;
    int i3;
    if (bool7)
    {
      i3 = R.styleable.TextInputLayout_startIconTintMode;
      i3 = paramTintTypedArray.OooO0oo(i3, i5);
      localObject1 = ViewUtils.parseTintMode(i3, null);
      this.startIconTintMode = ((PorterDuff.Mode)localObject1);
    }
    int i = R.styleable.TextInputLayout_startIconDrawable;
    boolean bool2 = paramTintTypedArray.OooOO0o(i);
    if (bool2)
    {
      int j = R.styleable.TextInputLayout_startIconDrawable;
      localObject1 = paramTintTypedArray.getDrawable(j);
      setStartIconDrawable((Drawable)localObject1);
      j = R.styleable.TextInputLayout_startIconContentDescription;
      boolean bool3 = paramTintTypedArray.OooOO0o(j);
      if (bool3)
      {
        k = R.styleable.TextInputLayout_startIconContentDescription;
        localObject1 = paramTintTypedArray.getText(k);
        setStartIconContentDescription((CharSequence)localObject1);
      }
      int k = R.styleable.TextInputLayout_startIconCheckable;
      i3 = 1;
      boolean bool4 = paramTintTypedArray.OooO00o(k, i3);
      setStartIconCheckable(bool4);
    }
    int m = R.styleable.TextInputLayout_startIconMinSize;
    Object localObject2 = getResources();
    int i6 = R.dimen.mtrl_min_touch_target_size;
    int i4 = ((Resources)localObject2).getDimensionPixelSize(i6);
    m = paramTintTypedArray.OooO0o0(m, i4);
    setStartIconMinSize(m);
    m = R.styleable.TextInputLayout_startIconScaleType;
    boolean bool5 = paramTintTypedArray.OooOO0o(m);
    if (bool5)
    {
      int n = R.styleable.TextInputLayout_startIconScaleType;
      int i7 = paramTintTypedArray.OooO0oo(n, i5);
      paramTintTypedArray = IconHelper.convertScaleType(i7);
      setStartIconScaleType(paramTintTypedArray);
    }
  }
  
  private void updateVisibility()
  {
    CharSequence localCharSequence = this.prefixText;
    int i = 8;
    if (localCharSequence != null)
    {
      j = this.hintExpanded;
      if (j == 0)
      {
        j = 0;
        localCharSequence = null;
        break label30;
      }
    }
    int j = i;
    label30:
    CheckableImageButton localCheckableImageButton = this.startIconView;
    int k = localCheckableImageButton.getVisibility();
    if ((k != 0) && (j != 0))
    {
      k = 0;
      localCheckableImageButton = null;
    }
    else
    {
      k = 1;
    }
    if (k != 0) {
      i = 0;
    }
    setVisibility(i);
    this.prefixTextView.setVisibility(j);
    this.textInputLayout.updateDummyDrawables();
  }
  
  public CharSequence getPrefixText()
  {
    return this.prefixText;
  }
  
  public ColorStateList getPrefixTextColor()
  {
    return this.prefixTextView.getTextColors();
  }
  
  public TextView getPrefixTextView()
  {
    return this.prefixTextView;
  }
  
  public CharSequence getStartIconContentDescription()
  {
    return this.startIconView.getContentDescription();
  }
  
  public Drawable getStartIconDrawable()
  {
    return this.startIconView.getDrawable();
  }
  
  public int getStartIconMinSize()
  {
    return this.startIconMinSize;
  }
  
  public ImageView.ScaleType getStartIconScaleType()
  {
    return this.startIconScaleType;
  }
  
  public boolean isStartIconCheckable()
  {
    return this.startIconView.isCheckable();
  }
  
  public boolean isStartIconVisible()
  {
    CheckableImageButton localCheckableImageButton = this.startIconView;
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
  
  public void onHintStateChanged(boolean paramBoolean)
  {
    this.hintExpanded = paramBoolean;
    updateVisibility();
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    updatePrefixTextViewPadding();
  }
  
  public void refreshStartIconDrawableState()
  {
    TextInputLayout localTextInputLayout = this.textInputLayout;
    CheckableImageButton localCheckableImageButton = this.startIconView;
    ColorStateList localColorStateList = this.startIconTintList;
    IconHelper.refreshIconDrawableState(localTextInputLayout, localCheckableImageButton, localColorStateList);
  }
  
  public void setPrefixText(CharSequence paramCharSequence)
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
    this.prefixText = localCharSequence;
    this.prefixTextView.setText(paramCharSequence);
    updateVisibility();
  }
  
  public void setPrefixTextAppearance(int paramInt)
  {
    TextViewCompat.OooOOO(this.prefixTextView, paramInt);
  }
  
  public void setPrefixTextColor(ColorStateList paramColorStateList)
  {
    this.prefixTextView.setTextColor(paramColorStateList);
  }
  
  public void setStartIconCheckable(boolean paramBoolean)
  {
    this.startIconView.setCheckable(paramBoolean);
  }
  
  public void setStartIconContentDescription(CharSequence paramCharSequence)
  {
    Object localObject = getStartIconContentDescription();
    if (localObject != paramCharSequence)
    {
      localObject = this.startIconView;
      ((View)localObject).setContentDescription(paramCharSequence);
    }
  }
  
  public void setStartIconDrawable(Drawable paramDrawable)
  {
    CheckableImageButton localCheckableImageButton = this.startIconView;
    localCheckableImageButton.setImageDrawable(paramDrawable);
    boolean bool;
    if (paramDrawable != null)
    {
      paramDrawable = this.textInputLayout;
      localCheckableImageButton = this.startIconView;
      ColorStateList localColorStateList = this.startIconTintList;
      PorterDuff.Mode localMode = this.startIconTintMode;
      IconHelper.applyIconTint(paramDrawable, localCheckableImageButton, localColorStateList, localMode);
      bool = true;
      setStartIconVisible(bool);
      refreshStartIconDrawableState();
    }
    else
    {
      setStartIconVisible(false);
      bool = false;
      paramDrawable = null;
      setStartIconOnClickListener(null);
      setStartIconOnLongClickListener(null);
      setStartIconContentDescription(null);
    }
  }
  
  public void setStartIconMinSize(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = this.startIconMinSize;
      if (paramInt != i)
      {
        this.startIconMinSize = paramInt;
        localObject = this.startIconView;
        IconHelper.setIconMinSize((CheckableImageButton)localObject, paramInt);
      }
      return;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    Object localObject = m54207b69.F54207b69_11("Yg1414081817330A0F113D18280E541215191A1A265B1A185E231B2E2F63302D25296879");
    localIllegalArgumentException.<init>((String)localObject);
    throw localIllegalArgumentException;
  }
  
  public void setStartIconOnClickListener(View.OnClickListener paramOnClickListener)
  {
    CheckableImageButton localCheckableImageButton = this.startIconView;
    View.OnLongClickListener localOnLongClickListener = this.startIconOnLongClickListener;
    IconHelper.setIconOnClickListener(localCheckableImageButton, paramOnClickListener, localOnLongClickListener);
  }
  
  public void setStartIconOnLongClickListener(View.OnLongClickListener paramOnLongClickListener)
  {
    this.startIconOnLongClickListener = paramOnLongClickListener;
    IconHelper.setIconOnLongClickListener(this.startIconView, paramOnLongClickListener);
  }
  
  public void setStartIconScaleType(ImageView.ScaleType paramScaleType)
  {
    this.startIconScaleType = paramScaleType;
    IconHelper.setIconScaleType(this.startIconView, paramScaleType);
  }
  
  public void setStartIconTintList(ColorStateList paramColorStateList)
  {
    Object localObject = this.startIconTintList;
    if (localObject != paramColorStateList)
    {
      this.startIconTintList = paramColorStateList;
      localObject = this.textInputLayout;
      CheckableImageButton localCheckableImageButton = this.startIconView;
      PorterDuff.Mode localMode = this.startIconTintMode;
      IconHelper.applyIconTint((TextInputLayout)localObject, localCheckableImageButton, paramColorStateList, localMode);
    }
  }
  
  public void setStartIconTintMode(PorterDuff.Mode paramMode)
  {
    Object localObject = this.startIconTintMode;
    if (localObject != paramMode)
    {
      this.startIconTintMode = paramMode;
      localObject = this.textInputLayout;
      CheckableImageButton localCheckableImageButton = this.startIconView;
      ColorStateList localColorStateList = this.startIconTintList;
      IconHelper.applyIconTint((TextInputLayout)localObject, localCheckableImageButton, localColorStateList, paramMode);
    }
  }
  
  public void setStartIconVisible(boolean paramBoolean)
  {
    boolean bool = isStartIconVisible();
    if (bool != paramBoolean)
    {
      CheckableImageButton localCheckableImageButton = this.startIconView;
      if (paramBoolean) {
        paramBoolean = false;
      } else {
        paramBoolean = true;
      }
      localCheckableImageButton.setVisibility(paramBoolean);
      updatePrefixTextViewPadding();
      updateVisibility();
    }
  }
  
  public void setupAccessibilityNodeInfo(AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    Object localObject = this.prefixTextView;
    int i = ((View)localObject).getVisibility();
    if (i == 0)
    {
      localObject = this.prefixTextView;
      paramAccessibilityNodeInfoCompat.setLabelFor((View)localObject);
      localObject = this.prefixTextView;
    }
    else
    {
      localObject = this.startIconView;
    }
    paramAccessibilityNodeInfoCompat.setTraversalAfter((View)localObject);
  }
  
  public void updatePrefixTextViewPadding()
  {
    EditText localEditText = this.textInputLayout.editText;
    if (localEditText == null) {
      return;
    }
    boolean bool = isStartIconVisible();
    int i;
    if (bool) {
      bool = false;
    } else {
      i = ViewCompat.Oooo000(localEditText);
    }
    TextView localTextView = this.prefixTextView;
    int j = localEditText.getCompoundPaddingTop();
    Resources localResources = getContext().getResources();
    int k = R.dimen.material_input_text_to_prefix_suffix_padding;
    int m = localResources.getDimensionPixelSize(k);
    int n = localEditText.getCompoundPaddingBottom();
    ViewCompat.o00000O(localTextView, i, j, m, n);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.textfield.StartCompoundLayout
 * JD-Core Version:    0.7.0.1
 */
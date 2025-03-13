package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.text.PrecomputedTextCompat.Params;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AppCompatTextView
  extends TextView
  implements TintableBackgroundView, TintableCompoundDrawablesView, AutoSizeableTextView, EmojiCompatConfigurationView
{
  private final AppCompatBackgroundHelper mBackgroundTintHelper;
  private AppCompatEmojiTextHelper mEmojiTextViewHelper;
  private boolean mIsSetTypefaceProcessing = false;
  private Future mPrecomputedTextFuture;
  private AppCompatTextView.SuperCaller mSuperCaller = null;
  private final AppCompatTextClassifierHelper mTextClassifierHelper;
  private final AppCompatTextHelper mTextHelper;
  
  public AppCompatTextView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public AppCompatTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842884);
  }
  
  public AppCompatTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = getContext();
    ThemeUtils.OooO00o(this, paramContext);
    paramContext = new androidx/appcompat/widget/AppCompatBackgroundHelper;
    paramContext.<init>(this);
    this.mBackgroundTintHelper = paramContext;
    paramContext.OooO0OO(paramAttributeSet, paramInt);
    paramContext = new androidx/appcompat/widget/AppCompatTextHelper;
    paramContext.<init>(this);
    this.mTextHelper = paramContext;
    paramContext.OooO0o0(paramAttributeSet, paramInt);
    paramContext.OooO0O0();
    paramContext = new androidx/appcompat/widget/AppCompatTextClassifierHelper;
    paramContext.<init>(this);
    this.mTextClassifierHelper = paramContext;
    getEmojiTextViewHelper().OooO0O0(paramAttributeSet, paramInt);
  }
  
  private AppCompatEmojiTextHelper getEmojiTextViewHelper()
  {
    AppCompatEmojiTextHelper localAppCompatEmojiTextHelper = this.mEmojiTextViewHelper;
    if (localAppCompatEmojiTextHelper == null)
    {
      localAppCompatEmojiTextHelper = new androidx/appcompat/widget/AppCompatEmojiTextHelper;
      localAppCompatEmojiTextHelper.<init>(this);
      this.mEmojiTextViewHelper = localAppCompatEmojiTextHelper;
    }
    return this.mEmojiTextViewHelper;
  }
  
  public final void OooO0o0()
  {
    Object localObject = this.mPrecomputedTextFuture;
    if (localObject != null) {}
    try
    {
      this.mPrecomputedTextFuture = null;
      localObject = ((Future)localObject).get();
      localObject = (PrecomputedTextCompat)localObject;
      TextViewCompat.OooOOO0(this, (PrecomputedTextCompat)localObject);
      label31:
      return;
    }
    catch (InterruptedException|ExecutionException localInterruptedException)
    {
      break label31;
    }
  }
  
  public void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject = this.mBackgroundTintHelper;
    if (localObject != null) {
      ((AppCompatBackgroundHelper)localObject).OooO0O0();
    }
    localObject = this.mTextHelper;
    if (localObject != null) {
      ((AppCompatTextHelper)localObject).OooO0O0();
    }
  }
  
  public int getAutoSizeMaxTextSize()
  {
    boolean bool = ViewUtils.OooO0O0;
    if (bool) {
      return getSuperCaller().getAutoSizeMaxTextSize();
    }
    AppCompatTextHelper localAppCompatTextHelper = this.mTextHelper;
    if (localAppCompatTextHelper != null) {
      return localAppCompatTextHelper.getAutoSizeMaxTextSize();
    }
    return -1;
  }
  
  public int getAutoSizeMinTextSize()
  {
    boolean bool = ViewUtils.OooO0O0;
    if (bool) {
      return getSuperCaller().getAutoSizeMinTextSize();
    }
    AppCompatTextHelper localAppCompatTextHelper = this.mTextHelper;
    if (localAppCompatTextHelper != null) {
      return localAppCompatTextHelper.getAutoSizeMinTextSize();
    }
    return -1;
  }
  
  public int getAutoSizeStepGranularity()
  {
    boolean bool = ViewUtils.OooO0O0;
    if (bool) {
      return getSuperCaller().getAutoSizeStepGranularity();
    }
    AppCompatTextHelper localAppCompatTextHelper = this.mTextHelper;
    if (localAppCompatTextHelper != null) {
      return localAppCompatTextHelper.getAutoSizeStepGranularity();
    }
    return -1;
  }
  
  public int[] getAutoSizeTextAvailableSizes()
  {
    boolean bool = ViewUtils.OooO0O0;
    if (bool) {
      return getSuperCaller().getAutoSizeTextAvailableSizes();
    }
    AppCompatTextHelper localAppCompatTextHelper = this.mTextHelper;
    if (localAppCompatTextHelper != null) {
      return localAppCompatTextHelper.getAutoSizeTextAvailableSizes();
    }
    return new int[0];
  }
  
  public int getAutoSizeTextType()
  {
    boolean bool = ViewUtils.OooO0O0;
    int j = 0;
    if (bool)
    {
      localObject = getSuperCaller();
      int i = ((AppCompatTextView.SuperCaller)localObject).getAutoSizeTextType();
      int k = 1;
      if (i == k) {
        j = k;
      }
      return j;
    }
    Object localObject = this.mTextHelper;
    if (localObject != null) {
      return ((AppCompatTextHelper)localObject).getAutoSizeTextType();
    }
    return 0;
  }
  
  public ActionMode.Callback getCustomSelectionActionModeCallback()
  {
    return TextViewCompat.OooOOOo(super.getCustomSelectionActionModeCallback());
  }
  
  public int getFirstBaselineToTopHeight()
  {
    return TextViewCompat.OooO0O0(this);
  }
  
  public int getLastBaselineToBottomHeight()
  {
    return TextViewCompat.OooO0OO(this);
  }
  
  public AppCompatTextView.SuperCaller getSuperCaller()
  {
    Object localObject = this.mSuperCaller;
    if (localObject == null)
    {
      localObject = new androidx/appcompat/widget/AppCompatTextView$SuperCallerApi28;
      ((AppCompatTextView.SuperCallerApi28)localObject).<init>(this);
      this.mSuperCaller = ((AppCompatTextView.SuperCaller)localObject);
    }
    return this.mSuperCaller;
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = this.mBackgroundTintHelper;
    if (localObject != null) {
      localObject = ((AppCompatBackgroundHelper)localObject).getSupportBackgroundTintList();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = this.mBackgroundTintHelper;
    if (localObject != null) {
      localObject = ((AppCompatBackgroundHelper)localObject).getSupportBackgroundTintMode();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public ColorStateList getSupportCompoundDrawablesTintList()
  {
    return this.mTextHelper.getCompoundDrawableTintList();
  }
  
  public PorterDuff.Mode getSupportCompoundDrawablesTintMode()
  {
    return this.mTextHelper.getCompoundDrawableTintMode();
  }
  
  public CharSequence getText()
  {
    OooO0o0();
    return super.getText();
  }
  
  public TextClassifier getTextClassifier()
  {
    return getSuperCaller().getTextClassifier();
  }
  
  public PrecomputedTextCompat.Params getTextMetricsParamsCompat()
  {
    return TextViewCompat.OooO0o(this);
  }
  
  public boolean isEmojiCompatEnabled()
  {
    return getEmojiTextViewHelper().isEnabled();
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    InputConnection localInputConnection = super.onCreateInputConnection(paramEditorInfo);
    this.mTextHelper.OooOO0(this, localInputConnection, paramEditorInfo);
    return AppCompatHintHelper.OooO00o(localInputConnection, paramEditorInfo, this);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    AppCompatTextHelper localAppCompatTextHelper = this.mTextHelper;
    if (localAppCompatTextHelper != null) {
      localAppCompatTextHelper.OooO0oO(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    OooO0o0();
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    paramCharSequence = this.mTextHelper;
    if (paramCharSequence != null)
    {
      paramInt1 = ViewUtils.OooO0O0;
      if (paramInt1 == 0)
      {
        bool = paramCharSequence.isAutoSizeEnabled();
        if (bool)
        {
          bool = true;
          break label48;
        }
      }
    }
    boolean bool = false;
    paramCharSequence = null;
    label48:
    if (bool)
    {
      paramCharSequence = this.mTextHelper;
      paramCharSequence.OooO0OO();
    }
  }
  
  public void setAllCaps(boolean paramBoolean)
  {
    super.setAllCaps(paramBoolean);
    getEmojiTextViewHelper().setAllCaps(paramBoolean);
  }
  
  public void setAutoSizeTextTypeUniformWithConfiguration(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = ViewUtils.OooO0O0;
    Object localObject;
    if (bool)
    {
      localObject = getSuperCaller();
      ((AppCompatTextView.SuperCaller)localObject).OooO0O0(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    else
    {
      localObject = this.mTextHelper;
      if (localObject != null) {
        ((AppCompatTextHelper)localObject).OooOO0O(paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
  }
  
  public void setAutoSizeTextTypeUniformWithPresetSizes(int[] paramArrayOfInt, int paramInt)
  {
    boolean bool = ViewUtils.OooO0O0;
    Object localObject;
    if (bool)
    {
      localObject = getSuperCaller();
      ((AppCompatTextView.SuperCaller)localObject).OooO00o(paramArrayOfInt, paramInt);
    }
    else
    {
      localObject = this.mTextHelper;
      if (localObject != null) {
        ((AppCompatTextHelper)localObject).OooOO0o(paramArrayOfInt, paramInt);
      }
    }
  }
  
  public void setAutoSizeTextTypeWithDefaults(int paramInt)
  {
    boolean bool = ViewUtils.OooO0O0;
    Object localObject;
    if (bool)
    {
      localObject = getSuperCaller();
      ((AppCompatTextView.SuperCaller)localObject).setAutoSizeTextTypeWithDefaults(paramInt);
    }
    else
    {
      localObject = this.mTextHelper;
      if (localObject != null) {
        ((AppCompatTextHelper)localObject).setAutoSizeTextTypeWithDefaults(paramInt);
      }
    }
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.OooO0Oo(paramDrawable);
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.OooO0o0(paramInt);
    }
  }
  
  public void setCompoundDrawables(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawables(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = this.mTextHelper;
    if (paramDrawable1 != null) {
      paramDrawable1.OooO0oo();
    }
  }
  
  public void setCompoundDrawablesRelative(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = this.mTextHelper;
    if (paramDrawable1 != null) {
      paramDrawable1.OooO0oo();
    }
  }
  
  public void setCompoundDrawablesRelativeWithIntrinsicBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Context localContext = getContext();
    Drawable localDrawable1 = null;
    if (paramInt1 != 0)
    {
      localObject = AppCompatResources.OooO0O0(localContext, paramInt1);
    }
    else
    {
      paramInt1 = 0;
      localObject = null;
    }
    Drawable localDrawable2;
    if (paramInt2 != 0)
    {
      localDrawable2 = AppCompatResources.OooO0O0(localContext, paramInt2);
    }
    else
    {
      paramInt2 = 0;
      localDrawable2 = null;
    }
    Drawable localDrawable3;
    if (paramInt3 != 0)
    {
      localDrawable3 = AppCompatResources.OooO0O0(localContext, paramInt3);
    }
    else
    {
      paramInt3 = 0;
      localDrawable3 = null;
    }
    if (paramInt4 != 0) {
      localDrawable1 = AppCompatResources.OooO0O0(localContext, paramInt4);
    }
    setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)localObject, localDrawable2, localDrawable3, localDrawable1);
    Object localObject = this.mTextHelper;
    if (localObject != null) {
      ((AppCompatTextHelper)localObject).OooO0oo();
    }
  }
  
  public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = this.mTextHelper;
    if (paramDrawable1 != null) {
      paramDrawable1.OooO0oo();
    }
  }
  
  public void setCompoundDrawablesWithIntrinsicBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Context localContext = getContext();
    Drawable localDrawable1 = null;
    if (paramInt1 != 0)
    {
      localObject = AppCompatResources.OooO0O0(localContext, paramInt1);
    }
    else
    {
      paramInt1 = 0;
      localObject = null;
    }
    Drawable localDrawable2;
    if (paramInt2 != 0)
    {
      localDrawable2 = AppCompatResources.OooO0O0(localContext, paramInt2);
    }
    else
    {
      paramInt2 = 0;
      localDrawable2 = null;
    }
    Drawable localDrawable3;
    if (paramInt3 != 0)
    {
      localDrawable3 = AppCompatResources.OooO0O0(localContext, paramInt3);
    }
    else
    {
      paramInt3 = 0;
      localDrawable3 = null;
    }
    if (paramInt4 != 0) {
      localDrawable1 = AppCompatResources.OooO0O0(localContext, paramInt4);
    }
    setCompoundDrawablesWithIntrinsicBounds((Drawable)localObject, localDrawable2, localDrawable3, localDrawable1);
    Object localObject = this.mTextHelper;
    if (localObject != null) {
      ((AppCompatTextHelper)localObject).OooO0oo();
    }
  }
  
  public void setCompoundDrawablesWithIntrinsicBounds(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawablesWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = this.mTextHelper;
    if (paramDrawable1 != null) {
      paramDrawable1.OooO0oo();
    }
  }
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback)
  {
    paramCallback = TextViewCompat.OooOOo0(this, paramCallback);
    super.setCustomSelectionActionModeCallback(paramCallback);
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean)
  {
    getEmojiTextViewHelper().setEnabled(paramBoolean);
  }
  
  public void setFilters(InputFilter[] paramArrayOfInputFilter)
  {
    paramArrayOfInputFilter = getEmojiTextViewHelper().OooO00o(paramArrayOfInputFilter);
    super.setFilters(paramArrayOfInputFilter);
  }
  
  public void setFirstBaselineToTopHeight(int paramInt)
  {
    getSuperCaller().setFirstBaselineToTopHeight(paramInt);
  }
  
  public void setLastBaselineToBottomHeight(int paramInt)
  {
    getSuperCaller().setLastBaselineToBottomHeight(paramInt);
  }
  
  public void setLineHeight(int paramInt)
  {
    TextViewCompat.OooOO0o(this, paramInt);
  }
  
  public void setPrecomputedText(PrecomputedTextCompat paramPrecomputedTextCompat)
  {
    TextViewCompat.OooOOO0(this, paramPrecomputedTextCompat);
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.setSupportBackgroundTintList(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.setSupportBackgroundTintMode(paramMode);
    }
  }
  
  public void setSupportCompoundDrawablesTintList(ColorStateList paramColorStateList)
  {
    this.mTextHelper.setCompoundDrawableTintList(paramColorStateList);
    this.mTextHelper.OooO0O0();
  }
  
  public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode paramMode)
  {
    this.mTextHelper.setCompoundDrawableTintMode(paramMode);
    this.mTextHelper.OooO0O0();
  }
  
  public void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    AppCompatTextHelper localAppCompatTextHelper = this.mTextHelper;
    if (localAppCompatTextHelper != null) {
      localAppCompatTextHelper.OooO(paramContext, paramInt);
    }
  }
  
  public void setTextClassifier(TextClassifier paramTextClassifier)
  {
    getSuperCaller().setTextClassifier(paramTextClassifier);
  }
  
  public void setTextFuture(Future paramFuture)
  {
    this.mPrecomputedTextFuture = paramFuture;
    if (paramFuture != null) {
      requestLayout();
    }
  }
  
  public void setTextMetricsParamsCompat(PrecomputedTextCompat.Params paramParams)
  {
    TextViewCompat.OooOOOO(this, paramParams);
  }
  
  public void setTextSize(int paramInt, float paramFloat)
  {
    boolean bool = ViewUtils.OooO0O0;
    if (bool)
    {
      super.setTextSize(paramInt, paramFloat);
    }
    else
    {
      AppCompatTextHelper localAppCompatTextHelper = this.mTextHelper;
      if (localAppCompatTextHelper != null) {
        localAppCompatTextHelper.setTextSize(paramInt, paramFloat);
      }
    }
  }
  
  public void setTypeface(Typeface paramTypeface, int paramInt)
  {
    boolean bool1 = this.mIsSetTypefaceProcessing;
    if (bool1) {
      return;
    }
    if ((paramTypeface != null) && (paramInt > 0))
    {
      localTypeface = TypefaceCompat.OooO00o(getContext(), paramTypeface, paramInt);
    }
    else
    {
      bool1 = false;
      localTypeface = null;
    }
    boolean bool2 = true;
    this.mIsSetTypefaceProcessing = bool2;
    if (localTypeface != null) {
      paramTypeface = localTypeface;
    }
    bool1 = false;
    Typeface localTypeface = null;
    try
    {
      super.setTypeface(paramTypeface, paramInt);
      return;
    }
    finally
    {
      this.mIsSetTypefaceProcessing = false;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatTextView
 * JD-Core Version:    0.7.0.1
 */
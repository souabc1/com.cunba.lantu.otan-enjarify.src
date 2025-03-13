package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;

public class AppCompatButton
  extends Button
  implements TintableBackgroundView, AutoSizeableTextView, TintableCompoundDrawablesView, EmojiCompatConfigurationView
{
  private AppCompatEmojiTextHelper mAppCompatEmojiTextHelper;
  private final AppCompatBackgroundHelper mBackgroundTintHelper;
  private final AppCompatTextHelper mTextHelper;
  
  public AppCompatButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public AppCompatButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
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
    getEmojiTextViewHelper().OooO0O0(paramAttributeSet, paramInt);
  }
  
  private AppCompatEmojiTextHelper getEmojiTextViewHelper()
  {
    AppCompatEmojiTextHelper localAppCompatEmojiTextHelper = this.mAppCompatEmojiTextHelper;
    if (localAppCompatEmojiTextHelper == null)
    {
      localAppCompatEmojiTextHelper = new androidx/appcompat/widget/AppCompatEmojiTextHelper;
      localAppCompatEmojiTextHelper.<init>(this);
      this.mAppCompatEmojiTextHelper = localAppCompatEmojiTextHelper;
    }
    return this.mAppCompatEmojiTextHelper;
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
      return super.getAutoSizeMaxTextSize();
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
      return super.getAutoSizeMinTextSize();
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
      return super.getAutoSizeStepGranularity();
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
      return super.getAutoSizeTextAvailableSizes();
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
      int i = super.getAutoSizeTextType();
      int k = 1;
      if (i == k) {
        j = k;
      }
      return j;
    }
    AppCompatTextHelper localAppCompatTextHelper = this.mTextHelper;
    if (localAppCompatTextHelper != null) {
      return localAppCompatTextHelper.getAutoSizeTextType();
    }
    return 0;
  }
  
  public ActionMode.Callback getCustomSelectionActionModeCallback()
  {
    return TextViewCompat.OooOOOo(super.getCustomSelectionActionModeCallback());
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
  
  public boolean isEmojiCompatEnabled()
  {
    return getEmojiTextViewHelper().isEnabled();
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    String str = Button.class.getName();
    paramAccessibilityEvent.setClassName(str);
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    String str = Button.class.getName();
    paramAccessibilityNodeInfo.setClassName(str);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    AppCompatTextHelper localAppCompatTextHelper = this.mTextHelper;
    if (localAppCompatTextHelper != null) {
      localAppCompatTextHelper.OooO0oO(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    }
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
    if (bool)
    {
      super.setAutoSizeTextTypeUniformWithConfiguration(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    else
    {
      AppCompatTextHelper localAppCompatTextHelper = this.mTextHelper;
      if (localAppCompatTextHelper != null) {
        localAppCompatTextHelper.OooOO0O(paramInt1, paramInt2, paramInt3, paramInt4);
      }
    }
  }
  
  public void setAutoSizeTextTypeUniformWithPresetSizes(int[] paramArrayOfInt, int paramInt)
  {
    boolean bool = ViewUtils.OooO0O0;
    if (bool)
    {
      super.setAutoSizeTextTypeUniformWithPresetSizes(paramArrayOfInt, paramInt);
    }
    else
    {
      AppCompatTextHelper localAppCompatTextHelper = this.mTextHelper;
      if (localAppCompatTextHelper != null) {
        localAppCompatTextHelper.OooOO0o(paramArrayOfInt, paramInt);
      }
    }
  }
  
  public void setAutoSizeTextTypeWithDefaults(int paramInt)
  {
    boolean bool = ViewUtils.OooO0O0;
    if (bool)
    {
      super.setAutoSizeTextTypeWithDefaults(paramInt);
    }
    else
    {
      AppCompatTextHelper localAppCompatTextHelper = this.mTextHelper;
      if (localAppCompatTextHelper != null) {
        localAppCompatTextHelper.setAutoSizeTextTypeWithDefaults(paramInt);
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
  
  public void setSupportAllCaps(boolean paramBoolean)
  {
    AppCompatTextHelper localAppCompatTextHelper = this.mTextHelper;
    if (localAppCompatTextHelper != null) {
      localAppCompatTextHelper.setAllCaps(paramBoolean);
    }
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
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatButton
 * JD-Core Version:    0.7.0.1
 */
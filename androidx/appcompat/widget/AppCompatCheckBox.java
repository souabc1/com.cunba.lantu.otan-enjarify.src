package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableCompoundButton;
import androidx.core.widget.TintableCompoundDrawablesView;

public class AppCompatCheckBox
  extends CheckBox
  implements TintableCompoundButton, TintableBackgroundView, EmojiCompatConfigurationView, TintableCompoundDrawablesView
{
  private AppCompatEmojiTextHelper mAppCompatEmojiTextHelper;
  private final AppCompatBackgroundHelper mBackgroundTintHelper;
  private final AppCompatCompoundButtonHelper mCompoundButtonHelper;
  private final AppCompatTextHelper mTextHelper;
  
  public AppCompatCheckBox(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public AppCompatCheckBox(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = getContext();
    ThemeUtils.OooO00o(this, paramContext);
    paramContext = new androidx/appcompat/widget/AppCompatCompoundButtonHelper;
    paramContext.<init>(this);
    this.mCompoundButtonHelper = paramContext;
    paramContext.OooO0O0(paramAttributeSet, paramInt);
    paramContext = new androidx/appcompat/widget/AppCompatBackgroundHelper;
    paramContext.<init>(this);
    this.mBackgroundTintHelper = paramContext;
    paramContext.OooO0OO(paramAttributeSet, paramInt);
    paramContext = new androidx/appcompat/widget/AppCompatTextHelper;
    paramContext.<init>(this);
    this.mTextHelper = paramContext;
    paramContext.OooO0o0(paramAttributeSet, paramInt);
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
  
  public int getCompoundPaddingLeft()
  {
    int i = super.getCompoundPaddingLeft();
    AppCompatCompoundButtonHelper localAppCompatCompoundButtonHelper = this.mCompoundButtonHelper;
    if (localAppCompatCompoundButtonHelper != null) {
      i = localAppCompatCompoundButtonHelper.getCompoundPaddingLeft(i);
    }
    return i;
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
  
  public ColorStateList getSupportButtonTintList()
  {
    Object localObject = this.mCompoundButtonHelper;
    if (localObject != null) {
      localObject = ((AppCompatCompoundButtonHelper)localObject).getSupportButtonTintList();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public PorterDuff.Mode getSupportButtonTintMode()
  {
    Object localObject = this.mCompoundButtonHelper;
    if (localObject != null) {
      localObject = ((AppCompatCompoundButtonHelper)localObject).getSupportButtonTintMode();
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
  
  public void setAllCaps(boolean paramBoolean)
  {
    super.setAllCaps(paramBoolean);
    getEmojiTextViewHelper().setAllCaps(paramBoolean);
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
  
  public void setButtonDrawable(int paramInt)
  {
    Drawable localDrawable = AppCompatResources.OooO0O0(getContext(), paramInt);
    setButtonDrawable(localDrawable);
  }
  
  public void setButtonDrawable(Drawable paramDrawable)
  {
    super.setButtonDrawable(paramDrawable);
    paramDrawable = this.mCompoundButtonHelper;
    if (paramDrawable != null) {
      paramDrawable.OooO0OO();
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
  
  public void setEmojiCompatEnabled(boolean paramBoolean)
  {
    getEmojiTextViewHelper().setEnabled(paramBoolean);
  }
  
  public void setFilters(InputFilter[] paramArrayOfInputFilter)
  {
    paramArrayOfInputFilter = getEmojiTextViewHelper().OooO00o(paramArrayOfInputFilter);
    super.setFilters(paramArrayOfInputFilter);
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
  
  public void setSupportButtonTintList(ColorStateList paramColorStateList)
  {
    AppCompatCompoundButtonHelper localAppCompatCompoundButtonHelper = this.mCompoundButtonHelper;
    if (localAppCompatCompoundButtonHelper != null) {
      localAppCompatCompoundButtonHelper.setSupportButtonTintList(paramColorStateList);
    }
  }
  
  public void setSupportButtonTintMode(PorterDuff.Mode paramMode)
  {
    AppCompatCompoundButtonHelper localAppCompatCompoundButtonHelper = this.mCompoundButtonHelper;
    if (localAppCompatCompoundButtonHelper != null) {
      localAppCompatCompoundButtonHelper.setSupportButtonTintMode(paramMode);
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
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatCheckBox
 * JD-Core Version:    0.7.0.1
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableCompoundDrawablesView;

public class AppCompatToggleButton
  extends ToggleButton
  implements TintableBackgroundView, EmojiCompatConfigurationView, TintableCompoundDrawablesView
{
  public final AppCompatBackgroundHelper o00OoOoo;
  public AppCompatEmojiTextHelper o00Ooo0;
  public final AppCompatTextHelper o00Ooo00;
  
  public AppCompatToggleButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842827);
  }
  
  public AppCompatToggleButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = getContext();
    ThemeUtils.OooO00o(this, paramContext);
    paramContext = new androidx/appcompat/widget/AppCompatBackgroundHelper;
    paramContext.<init>(this);
    this.o00OoOoo = paramContext;
    paramContext.OooO0OO(paramAttributeSet, paramInt);
    paramContext = new androidx/appcompat/widget/AppCompatTextHelper;
    paramContext.<init>(this);
    this.o00Ooo00 = paramContext;
    paramContext.OooO0o0(paramAttributeSet, paramInt);
    getEmojiTextViewHelper().OooO0O0(paramAttributeSet, paramInt);
  }
  
  private AppCompatEmojiTextHelper getEmojiTextViewHelper()
  {
    AppCompatEmojiTextHelper localAppCompatEmojiTextHelper = this.o00Ooo0;
    if (localAppCompatEmojiTextHelper == null)
    {
      localAppCompatEmojiTextHelper = new androidx/appcompat/widget/AppCompatEmojiTextHelper;
      localAppCompatEmojiTextHelper.<init>(this);
      this.o00Ooo0 = localAppCompatEmojiTextHelper;
    }
    return this.o00Ooo0;
  }
  
  public void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject = this.o00OoOoo;
    if (localObject != null) {
      ((AppCompatBackgroundHelper)localObject).OooO0O0();
    }
    localObject = this.o00Ooo00;
    if (localObject != null) {
      ((AppCompatTextHelper)localObject).OooO0O0();
    }
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = this.o00OoOoo;
    if (localObject != null) {
      localObject = ((AppCompatBackgroundHelper)localObject).getSupportBackgroundTintList();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = this.o00OoOoo;
    if (localObject != null) {
      localObject = ((AppCompatBackgroundHelper)localObject).getSupportBackgroundTintMode();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public ColorStateList getSupportCompoundDrawablesTintList()
  {
    return this.o00Ooo00.getCompoundDrawableTintList();
  }
  
  public PorterDuff.Mode getSupportCompoundDrawablesTintMode()
  {
    return this.o00Ooo00.getCompoundDrawableTintMode();
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
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.o00OoOoo;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.OooO0Oo(paramDrawable);
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.o00OoOoo;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.OooO0o0(paramInt);
    }
  }
  
  public void setCompoundDrawables(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawables(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = this.o00Ooo00;
    if (paramDrawable1 != null) {
      paramDrawable1.OooO0oo();
    }
  }
  
  public void setCompoundDrawablesRelative(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = this.o00Ooo00;
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
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.o00OoOoo;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.setSupportBackgroundTintList(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.o00OoOoo;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.setSupportBackgroundTintMode(paramMode);
    }
  }
  
  public void setSupportCompoundDrawablesTintList(ColorStateList paramColorStateList)
  {
    this.o00Ooo00.setCompoundDrawableTintList(paramColorStateList);
    this.o00Ooo00.OooO0O0();
  }
  
  public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode paramMode)
  {
    this.o00Ooo00.setCompoundDrawableTintMode(paramMode);
    this.o00Ooo00.OooO0O0();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatToggleButton
 * JD-Core Version:    0.7.0.1
 */
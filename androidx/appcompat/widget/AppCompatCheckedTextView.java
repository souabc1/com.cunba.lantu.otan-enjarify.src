package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCheckedTextView;
import androidx.core.widget.TintableCompoundDrawablesView;

public class AppCompatCheckedTextView
  extends CheckedTextView
  implements TintableCheckedTextView, TintableBackgroundView, EmojiCompatConfigurationView, TintableCompoundDrawablesView
{
  public final AppCompatCheckedTextViewHelper o00OoOoo;
  public final AppCompatTextHelper o00Ooo0;
  public final AppCompatBackgroundHelper o00Ooo00;
  public AppCompatEmojiTextHelper o00Ooo0O;
  
  public AppCompatCheckedTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public AppCompatCheckedTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = getContext();
    ThemeUtils.OooO00o(this, paramContext);
    paramContext = new androidx/appcompat/widget/AppCompatTextHelper;
    paramContext.<init>(this);
    this.o00Ooo0 = paramContext;
    paramContext.OooO0o0(paramAttributeSet, paramInt);
    paramContext.OooO0O0();
    paramContext = new androidx/appcompat/widget/AppCompatBackgroundHelper;
    paramContext.<init>(this);
    this.o00Ooo00 = paramContext;
    paramContext.OooO0OO(paramAttributeSet, paramInt);
    paramContext = new androidx/appcompat/widget/AppCompatCheckedTextViewHelper;
    paramContext.<init>(this);
    this.o00OoOoo = paramContext;
    paramContext.OooO0O0(paramAttributeSet, paramInt);
    getEmojiTextViewHelper().OooO0O0(paramAttributeSet, paramInt);
  }
  
  private AppCompatEmojiTextHelper getEmojiTextViewHelper()
  {
    AppCompatEmojiTextHelper localAppCompatEmojiTextHelper = this.o00Ooo0O;
    if (localAppCompatEmojiTextHelper == null)
    {
      localAppCompatEmojiTextHelper = new androidx/appcompat/widget/AppCompatEmojiTextHelper;
      localAppCompatEmojiTextHelper.<init>(this);
      this.o00Ooo0O = localAppCompatEmojiTextHelper;
    }
    return this.o00Ooo0O;
  }
  
  public void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject = this.o00Ooo0;
    if (localObject != null) {
      ((AppCompatTextHelper)localObject).OooO0O0();
    }
    localObject = this.o00Ooo00;
    if (localObject != null) {
      ((AppCompatBackgroundHelper)localObject).OooO0O0();
    }
    localObject = this.o00OoOoo;
    if (localObject != null) {
      ((AppCompatCheckedTextViewHelper)localObject).OooO00o();
    }
  }
  
  public ActionMode.Callback getCustomSelectionActionModeCallback()
  {
    return TextViewCompat.OooOOOo(super.getCustomSelectionActionModeCallback());
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = this.o00Ooo00;
    if (localObject != null) {
      localObject = ((AppCompatBackgroundHelper)localObject).getSupportBackgroundTintList();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = this.o00Ooo00;
    if (localObject != null) {
      localObject = ((AppCompatBackgroundHelper)localObject).getSupportBackgroundTintMode();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public ColorStateList getSupportCheckMarkTintList()
  {
    Object localObject = this.o00OoOoo;
    if (localObject != null) {
      localObject = ((AppCompatCheckedTextViewHelper)localObject).getSupportCheckMarkTintList();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public PorterDuff.Mode getSupportCheckMarkTintMode()
  {
    Object localObject = this.o00OoOoo;
    if (localObject != null) {
      localObject = ((AppCompatCheckedTextViewHelper)localObject).getSupportCheckMarkTintMode();
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public ColorStateList getSupportCompoundDrawablesTintList()
  {
    return this.o00Ooo0.getCompoundDrawableTintList();
  }
  
  public PorterDuff.Mode getSupportCompoundDrawablesTintMode()
  {
    return this.o00Ooo0.getCompoundDrawableTintMode();
  }
  
  public boolean isEmojiCompatEnabled()
  {
    return getEmojiTextViewHelper().isEnabled();
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    return AppCompatHintHelper.OooO00o(super.onCreateInputConnection(paramEditorInfo), paramEditorInfo, this);
  }
  
  public void setAllCaps(boolean paramBoolean)
  {
    super.setAllCaps(paramBoolean);
    getEmojiTextViewHelper().setAllCaps(paramBoolean);
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.o00Ooo00;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.OooO0Oo(paramDrawable);
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.o00Ooo00;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.OooO0o0(paramInt);
    }
  }
  
  public void setCheckMarkDrawable(int paramInt)
  {
    Drawable localDrawable = AppCompatResources.OooO0O0(getContext(), paramInt);
    setCheckMarkDrawable(localDrawable);
  }
  
  public void setCheckMarkDrawable(Drawable paramDrawable)
  {
    super.setCheckMarkDrawable(paramDrawable);
    paramDrawable = this.o00OoOoo;
    if (paramDrawable != null) {
      paramDrawable.OooO0OO();
    }
  }
  
  public void setCompoundDrawables(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawables(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = this.o00Ooo0;
    if (paramDrawable1 != null) {
      paramDrawable1.OooO0oo();
    }
  }
  
  public void setCompoundDrawablesRelative(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = this.o00Ooo0;
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
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.o00Ooo00;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.setSupportBackgroundTintList(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = this.o00Ooo00;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.setSupportBackgroundTintMode(paramMode);
    }
  }
  
  public void setSupportCheckMarkTintList(ColorStateList paramColorStateList)
  {
    AppCompatCheckedTextViewHelper localAppCompatCheckedTextViewHelper = this.o00OoOoo;
    if (localAppCompatCheckedTextViewHelper != null) {
      localAppCompatCheckedTextViewHelper.setSupportCheckMarkTintList(paramColorStateList);
    }
  }
  
  public void setSupportCheckMarkTintMode(PorterDuff.Mode paramMode)
  {
    AppCompatCheckedTextViewHelper localAppCompatCheckedTextViewHelper = this.o00OoOoo;
    if (localAppCompatCheckedTextViewHelper != null) {
      localAppCompatCheckedTextViewHelper.setSupportCheckMarkTintMode(paramMode);
    }
  }
  
  public void setSupportCompoundDrawablesTintList(ColorStateList paramColorStateList)
  {
    this.o00Ooo0.setCompoundDrawableTintList(paramColorStateList);
    this.o00Ooo0.OooO0O0();
  }
  
  public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode paramMode)
  {
    this.o00Ooo0.setCompoundDrawableTintMode(paramMode);
    this.o00Ooo0.OooO0O0();
  }
  
  public void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    AppCompatTextHelper localAppCompatTextHelper = this.o00Ooo0;
    if (localAppCompatTextHelper != null) {
      localAppCompatTextHelper.OooO(paramContext, paramInt);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatCheckedTextView
 * JD-Core Version:    0.7.0.1
 */
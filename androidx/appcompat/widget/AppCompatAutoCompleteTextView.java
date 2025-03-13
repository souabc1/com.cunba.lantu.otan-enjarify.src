package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;

public class AppCompatAutoCompleteTextView
  extends AutoCompleteTextView
  implements TintableBackgroundView, EmojiCompatConfigurationView, TintableCompoundDrawablesView
{
  private static final int[] TINT_ATTRS = { 16843126 };
  private final AppCompatEmojiEditTextHelper mAppCompatEmojiEditTextHelper;
  private final AppCompatBackgroundHelper mBackgroundTintHelper;
  private final AppCompatTextHelper mTextHelper;
  
  public AppCompatAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public AppCompatAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = getContext();
    ThemeUtils.OooO00o(this, paramContext);
    paramContext = getContext();
    Object localObject = TINT_ATTRS;
    paramContext = TintTypedArray.OooOOOO(paramContext, paramAttributeSet, (int[])localObject, paramInt, 0);
    boolean bool = paramContext.OooOO0o(0);
    if (bool)
    {
      localObject = paramContext.getDrawable(0);
      setDropDownBackgroundDrawable((Drawable)localObject);
    }
    paramContext.OooOOOo();
    paramContext = new androidx/appcompat/widget/AppCompatBackgroundHelper;
    paramContext.<init>(this);
    this.mBackgroundTintHelper = paramContext;
    paramContext.OooO0OO(paramAttributeSet, paramInt);
    paramContext = new androidx/appcompat/widget/AppCompatTextHelper;
    paramContext.<init>(this);
    this.mTextHelper = paramContext;
    paramContext.OooO0o0(paramAttributeSet, paramInt);
    paramContext.OooO0O0();
    paramContext = new androidx/appcompat/widget/AppCompatEmojiEditTextHelper;
    paramContext.<init>(this);
    this.mAppCompatEmojiEditTextHelper = paramContext;
    paramContext.OooO0OO(paramAttributeSet, paramInt);
    initEmojiKeyListener(paramContext);
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
  
  public void initEmojiKeyListener(AppCompatEmojiEditTextHelper paramAppCompatEmojiEditTextHelper)
  {
    KeyListener localKeyListener = getKeyListener();
    boolean bool1 = paramAppCompatEmojiEditTextHelper.OooO0O0(localKeyListener);
    if (bool1)
    {
      bool1 = super.isFocusable();
      boolean bool2 = super.isClickable();
      boolean bool3 = super.isLongClickable();
      int i = super.getInputType();
      paramAppCompatEmojiEditTextHelper = paramAppCompatEmojiEditTextHelper.OooO00o(localKeyListener);
      if (paramAppCompatEmojiEditTextHelper == localKeyListener) {
        return;
      }
      super.setKeyListener(paramAppCompatEmojiEditTextHelper);
      super.setRawInputType(i);
      super.setFocusable(bool1);
      super.setClickable(bool2);
      super.setLongClickable(bool3);
    }
  }
  
  public boolean isEmojiCompatEnabled()
  {
    return this.mAppCompatEmojiEditTextHelper.isEnabled();
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    InputConnection localInputConnection = AppCompatHintHelper.OooO00o(super.onCreateInputConnection(paramEditorInfo), paramEditorInfo, this);
    return this.mAppCompatEmojiEditTextHelper.OooO0Oo(localInputConnection, paramEditorInfo);
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
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback)
  {
    paramCallback = TextViewCompat.OooOOo0(this, paramCallback);
    super.setCustomSelectionActionModeCallback(paramCallback);
  }
  
  public void setDropDownBackgroundResource(int paramInt)
  {
    Drawable localDrawable = AppCompatResources.OooO0O0(getContext(), paramInt);
    setDropDownBackgroundDrawable(localDrawable);
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean)
  {
    this.mAppCompatEmojiEditTextHelper.setEnabled(paramBoolean);
  }
  
  public void setKeyListener(KeyListener paramKeyListener)
  {
    paramKeyListener = this.mAppCompatEmojiEditTextHelper.OooO00o(paramKeyListener);
    super.setKeyListener(paramKeyListener);
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
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatAutoCompleteTextView
 * JD-Core Version:    0.7.0.1
 */
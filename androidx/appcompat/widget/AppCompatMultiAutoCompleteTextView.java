package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableCompoundDrawablesView;

public class AppCompatMultiAutoCompleteTextView
  extends MultiAutoCompleteTextView
  implements TintableBackgroundView, EmojiCompatConfigurationView, TintableCompoundDrawablesView
{
  public static final int[] o00Ooo0O = { 16843126 };
  public final AppCompatBackgroundHelper o00OoOoo;
  public final AppCompatEmojiEditTextHelper o00Ooo0;
  public final AppCompatTextHelper o00Ooo00;
  
  public AppCompatMultiAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public AppCompatMultiAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = getContext();
    ThemeUtils.OooO00o(this, paramContext);
    paramContext = getContext();
    Object localObject = o00Ooo0O;
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
    this.o00OoOoo = paramContext;
    paramContext.OooO0OO(paramAttributeSet, paramInt);
    paramContext = new androidx/appcompat/widget/AppCompatTextHelper;
    paramContext.<init>(this);
    this.o00Ooo00 = paramContext;
    paramContext.OooO0o0(paramAttributeSet, paramInt);
    paramContext.OooO0O0();
    paramContext = new androidx/appcompat/widget/AppCompatEmojiEditTextHelper;
    paramContext.<init>(this);
    this.o00Ooo0 = paramContext;
    paramContext.OooO0OO(paramAttributeSet, paramInt);
    OooO00o(paramContext);
  }
  
  public void OooO00o(AppCompatEmojiEditTextHelper paramAppCompatEmojiEditTextHelper)
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
    return this.o00Ooo0.isEnabled();
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    InputConnection localInputConnection = AppCompatHintHelper.OooO00o(super.onCreateInputConnection(paramEditorInfo), paramEditorInfo, this);
    return this.o00Ooo0.OooO0Oo(localInputConnection, paramEditorInfo);
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
  
  public void setDropDownBackgroundResource(int paramInt)
  {
    Drawable localDrawable = AppCompatResources.OooO0O0(getContext(), paramInt);
    setDropDownBackgroundDrawable(localDrawable);
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean)
  {
    this.o00Ooo0.setEnabled(paramBoolean);
  }
  
  public void setKeyListener(KeyListener paramKeyListener)
  {
    paramKeyListener = this.o00Ooo0.OooO00o(paramKeyListener);
    super.setKeyListener(paramKeyListener);
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
  
  public void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    AppCompatTextHelper localAppCompatTextHelper = this.o00Ooo00;
    if (localAppCompatTextHelper != null) {
      localAppCompatTextHelper.OooO(paramContext, paramInt);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView
 * JD-Core Version:    0.7.0.1
 */
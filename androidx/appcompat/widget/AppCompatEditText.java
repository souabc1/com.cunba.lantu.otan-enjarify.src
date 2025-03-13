package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.OnReceiveContentViewBehavior;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TextViewOnReceiveContentListener;
import androidx.core.widget.TintableCompoundDrawablesView;

public class AppCompatEditText
  extends EditText
  implements TintableBackgroundView, OnReceiveContentViewBehavior, EmojiCompatConfigurationView, TintableCompoundDrawablesView
{
  private final AppCompatEmojiEditTextHelper mAppCompatEmojiEditTextHelper;
  private final AppCompatBackgroundHelper mBackgroundTintHelper;
  private final TextViewOnReceiveContentListener mDefaultOnReceiveContentListener;
  private AppCompatEditText.SuperCaller mSuperCaller;
  private final AppCompatTextClassifierHelper mTextClassifierHelper;
  private final AppCompatTextHelper mTextHelper;
  
  public AppCompatEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public AppCompatEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
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
    paramContext = new androidx/core/widget/TextViewOnReceiveContentListener;
    paramContext.<init>();
    this.mDefaultOnReceiveContentListener = paramContext;
    paramContext = new androidx/appcompat/widget/AppCompatEmojiEditTextHelper;
    paramContext.<init>(this);
    this.mAppCompatEmojiEditTextHelper = paramContext;
    paramContext.OooO0OO(paramAttributeSet, paramInt);
    initEmojiKeyListener(paramContext);
  }
  
  private AppCompatEditText.SuperCaller getSuperCaller()
  {
    AppCompatEditText.SuperCaller localSuperCaller = this.mSuperCaller;
    if (localSuperCaller == null)
    {
      localSuperCaller = new androidx/appcompat/widget/AppCompatEditText$SuperCaller;
      localSuperCaller.<init>(this);
      this.mSuperCaller = localSuperCaller;
    }
    return this.mSuperCaller;
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
  
  public Editable getText()
  {
    return super.getText();
  }
  
  public TextClassifier getTextClassifier()
  {
    return getSuperCaller().getTextClassifier();
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
    InputConnection localInputConnection = super.onCreateInputConnection(paramEditorInfo);
    Object localObject = this.mTextHelper;
    ((AppCompatTextHelper)localObject).OooOO0(this, localInputConnection, paramEditorInfo);
    localInputConnection = AppCompatHintHelper.OooO00o(localInputConnection, paramEditorInfo, this);
    if (localInputConnection != null)
    {
      int i = Build.VERSION.SDK_INT;
      int j = 30;
      if (i <= j)
      {
        localObject = ViewCompat.OooOooO(this);
        if (localObject != null)
        {
          EditorInfoCompat.OooO0O0(paramEditorInfo, (String[])localObject);
          localInputConnection = InputConnectionCompat.OooO0OO(this, localInputConnection, paramEditorInfo);
        }
      }
    }
    return this.mAppCompatEmojiEditTextHelper.OooO0Oo(localInputConnection, paramEditorInfo);
  }
  
  public boolean onDragEvent(DragEvent paramDragEvent)
  {
    boolean bool = AppCompatReceiveContentHelper.OooO00o(this, paramDragEvent);
    if (bool) {
      return true;
    }
    return super.onDragEvent(paramDragEvent);
  }
  
  public ContentInfoCompat onReceiveContent(ContentInfoCompat paramContentInfoCompat)
  {
    return this.mDefaultOnReceiveContentListener.OooO00o(this, paramContentInfoCompat);
  }
  
  public boolean onTextContextMenuItem(int paramInt)
  {
    boolean bool = AppCompatReceiveContentHelper.OooO0O0(this, paramInt);
    if (bool) {
      return true;
    }
    return super.onTextContextMenuItem(paramInt);
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
  
  public void setTextClassifier(TextClassifier paramTextClassifier)
  {
    getSuperCaller().setTextClassifier(paramTextClassifier);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatEditText
 * JD-Core Version:    0.7.0.1
 */
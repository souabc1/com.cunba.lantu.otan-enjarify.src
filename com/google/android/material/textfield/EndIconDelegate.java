package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;

abstract class EndIconDelegate
{
  final Context context;
  final CheckableImageButton endIconView;
  final EndCompoundLayout endLayout;
  final TextInputLayout textInputLayout;
  
  public EndIconDelegate(EndCompoundLayout paramEndCompoundLayout)
  {
    Object localObject = paramEndCompoundLayout.textInputLayout;
    this.textInputLayout = ((TextInputLayout)localObject);
    this.endLayout = paramEndCompoundLayout;
    localObject = paramEndCompoundLayout.getContext();
    this.context = ((Context)localObject);
    paramEndCompoundLayout = paramEndCompoundLayout.getEndIconView();
    this.endIconView = paramEndCompoundLayout;
  }
  
  public void afterEditTextChanged(Editable paramEditable) {}
  
  public void beforeEditTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public int getIconContentDescriptionResId()
  {
    return 0;
  }
  
  public int getIconDrawableResId()
  {
    return 0;
  }
  
  public View.OnFocusChangeListener getOnEditTextFocusChangeListener()
  {
    return null;
  }
  
  public View.OnClickListener getOnIconClickListener()
  {
    return null;
  }
  
  public View.OnFocusChangeListener getOnIconViewFocusChangeListener()
  {
    return null;
  }
  
  public AccessibilityManagerCompat.TouchExplorationStateChangeListener getTouchExplorationStateChangeListener()
  {
    return null;
  }
  
  public boolean isBoxBackgroundModeSupported(int paramInt)
  {
    return true;
  }
  
  public boolean isIconActivable()
  {
    return false;
  }
  
  public boolean isIconActivated()
  {
    return false;
  }
  
  public boolean isIconCheckable()
  {
    return false;
  }
  
  public boolean isIconChecked()
  {
    return false;
  }
  
  public void onEditTextAttached(EditText paramEditText) {}
  
  public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat) {}
  
  public void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent) {}
  
  public void onSuffixVisibilityChanged(boolean paramBoolean) {}
  
  public final void refreshIconState()
  {
    this.endLayout.refreshIconState(false);
  }
  
  public void setUp() {}
  
  public boolean shouldTintIconOnError()
  {
    return false;
  }
  
  public void tearDown() {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.textfield.EndIconDelegate
 * JD-Core Version:    0.7.0.1
 */
package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import m54207b69;

class ChipTextInputComboView
  extends FrameLayout
  implements Checkable
{
  private final Chip chip;
  private final EditText editText;
  private TextView label;
  private final TextInputLayout textInputLayout;
  private TextWatcher watcher;
  
  public ChipTextInputComboView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ChipTextInputComboView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ChipTextInputComboView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = LayoutInflater.from(paramContext);
    int i = R.layout.material_time_chip;
    paramAttributeSet = (Chip)paramContext.inflate(i, this, false);
    this.chip = paramAttributeSet;
    Object localObject = m54207b69.F54207b69_11("di08080F1E0A05134E27091629534C0E1B2E");
    paramAttributeSet.setAccessibilityClassName((CharSequence)localObject);
    int j = R.layout.material_time_input;
    paramContext = (TextInputLayout)paramContext.inflate(j, this, false);
    this.textInputLayout = paramContext;
    localObject = paramContext.getEditText();
    this.editText = ((EditText)localObject);
    ((View)localObject).setVisibility(4);
    ChipTextInputComboView.TextFormatter localTextFormatter = new com/google/android/material/timepicker/ChipTextInputComboView$TextFormatter;
    localTextFormatter.<init>(this, null);
    this.watcher = localTextFormatter;
    ((TextView)localObject).addTextChangedListener(localTextFormatter);
    updateHintLocales();
    addView(paramAttributeSet);
    addView(paramContext);
    int k = R.id.material_label;
    paramContext = (TextView)findViewById(k);
    this.label = paramContext;
    k = ViewCompat.OooOO0();
    ((View)localObject).setId(k);
    paramContext = this.label;
    i = ((View)localObject).getId();
    ViewCompat.o000000o(paramContext, i);
    ((View)localObject).setSaveEnabled(false);
    ((View)localObject).setLongClickable(false);
  }
  
  private String formatText(CharSequence paramCharSequence)
  {
    return TimeModel.formatText(getResources(), paramCharSequence);
  }
  
  private void updateHintLocales()
  {
    LocaleList localLocaleList = getContext().getResources().getConfiguration().getLocales();
    this.editText.setImeHintLocales(localLocaleList);
  }
  
  public void addInputFilter(InputFilter paramInputFilter)
  {
    InputFilter[] arrayOfInputFilter1 = this.editText.getFilters();
    int i = arrayOfInputFilter1.length + 1;
    InputFilter[] arrayOfInputFilter2 = (InputFilter[])Arrays.copyOf(arrayOfInputFilter1, i);
    int j = arrayOfInputFilter1.length;
    arrayOfInputFilter2[j] = paramInputFilter;
    this.editText.setFilters(arrayOfInputFilter2);
  }
  
  public CharSequence getChipText()
  {
    return this.chip.getText();
  }
  
  public TextInputLayout getTextInput()
  {
    return this.textInputLayout;
  }
  
  public boolean isChecked()
  {
    return this.chip.isChecked();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    updateHintLocales();
  }
  
  public void setChecked(boolean paramBoolean)
  {
    this.chip.setChecked(paramBoolean);
    Object localObject = this.editText;
    int i = 0;
    int j;
    if (paramBoolean) {
      j = 0;
    } else {
      j = 4;
    }
    ((View)localObject).setVisibility(j);
    localObject = this.chip;
    if (paramBoolean) {
      i = 8;
    }
    ((View)localObject).setVisibility(i);
    paramBoolean = isChecked();
    if (paramBoolean)
    {
      EditText localEditText = this.editText;
      ViewUtils.requestFocusAndShowKeyboard(localEditText);
    }
  }
  
  public void setChipDelegate(AccessibilityDelegateCompat paramAccessibilityDelegateCompat)
  {
    ViewCompat.o00oO0o(this.chip, paramAccessibilityDelegateCompat);
  }
  
  public void setCursorVisible(boolean paramBoolean)
  {
    this.editText.setCursorVisible(paramBoolean);
  }
  
  public void setHelperText(CharSequence paramCharSequence)
  {
    this.label.setText(paramCharSequence);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.chip.setOnClickListener(paramOnClickListener);
  }
  
  public void setTag(int paramInt, Object paramObject)
  {
    this.chip.setTag(paramInt, paramObject);
  }
  
  public void setText(CharSequence paramCharSequence)
  {
    paramCharSequence = formatText(paramCharSequence);
    Object localObject = this.chip;
    ((TextView)localObject).setText(paramCharSequence);
    boolean bool = TextUtils.isEmpty(paramCharSequence);
    if (!bool)
    {
      localObject = this.editText;
      TextWatcher localTextWatcher = this.watcher;
      ((TextView)localObject).removeTextChangedListener(localTextWatcher);
      this.editText.setText(paramCharSequence);
      paramCharSequence = this.editText;
      localObject = this.watcher;
      paramCharSequence.addTextChangedListener((TextWatcher)localObject);
    }
  }
  
  public void toggle()
  {
    this.chip.toggle();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.timepicker.ChipTextInputComboView
 * JD-Core Version:    0.7.0.1
 */
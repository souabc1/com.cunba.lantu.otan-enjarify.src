package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.google.android.material.textfield.TextInputLayout;

class TimePickerTextInputKeyController
  implements TextView.OnEditorActionListener, View.OnKeyListener
{
  private final ChipTextInputComboView hourLayoutComboView;
  private boolean keyListenerRunning = false;
  private final ChipTextInputComboView minuteLayoutComboView;
  private final TimeModel time;
  
  public TimePickerTextInputKeyController(ChipTextInputComboView paramChipTextInputComboView1, ChipTextInputComboView paramChipTextInputComboView2, TimeModel paramTimeModel)
  {
    this.hourLayoutComboView = paramChipTextInputComboView1;
    this.minuteLayoutComboView = paramChipTextInputComboView2;
    this.time = paramTimeModel;
  }
  
  private void clearPrefilledText(EditText paramEditText)
  {
    int i = paramEditText.getSelectionStart();
    if (i == 0)
    {
      i = paramEditText.length();
      int j = 2;
      if (i == j)
      {
        paramEditText = paramEditText.getText();
        paramEditText.clear();
      }
    }
  }
  
  private void moveSelection(int paramInt)
  {
    ChipTextInputComboView localChipTextInputComboView = this.minuteLayoutComboView;
    int i = 12;
    int j = 1;
    if (paramInt == i) {
      i = j;
    } else {
      i = 0;
    }
    localChipTextInputComboView.setChecked(i);
    localChipTextInputComboView = this.hourLayoutComboView;
    i = 10;
    if (paramInt != i) {
      j = 0;
    }
    localChipTextInputComboView.setChecked(j);
    this.time.selection = paramInt;
  }
  
  private boolean onHourKeyPress(int paramInt, KeyEvent paramKeyEvent, EditText paramEditText)
  {
    Editable localEditable = paramEditText.getText();
    if (localEditable == null) {
      return false;
    }
    int i = 7;
    int j = 1;
    if (paramInt >= i)
    {
      i = 16;
      if (paramInt <= i)
      {
        paramInt = paramKeyEvent.getAction();
        if (paramInt == j)
        {
          paramInt = paramEditText.getSelectionStart();
          int k = 2;
          if (paramInt == k)
          {
            paramInt = localEditable.length();
            if (paramInt == k)
            {
              paramInt = j;
              break label83;
            }
          }
        }
      }
    }
    paramInt = 0;
    label83:
    if (paramInt != 0)
    {
      moveSelection(12);
      return j;
    }
    clearPrefilledText(paramEditText);
    return false;
  }
  
  private boolean onMinuteKeyPress(int paramInt, KeyEvent paramKeyEvent, EditText paramEditText)
  {
    int i = 67;
    int j = 1;
    if (paramInt == i)
    {
      paramInt = paramKeyEvent.getAction();
      if (paramInt == 0)
      {
        localEditable = paramEditText.getText();
        paramInt = TextUtils.isEmpty(localEditable);
        if (paramInt != 0)
        {
          paramInt = j;
          break label49;
        }
      }
    }
    paramInt = 0;
    Editable localEditable = null;
    label49:
    if (paramInt != 0)
    {
      moveSelection(10);
      return j;
    }
    clearPrefilledText(paramEditText);
    return false;
  }
  
  public void bind()
  {
    Object localObject1 = this.hourLayoutComboView.getTextInput();
    Object localObject2 = this.minuteLayoutComboView.getTextInput();
    localObject1 = ((TextInputLayout)localObject1).getEditText();
    localObject2 = ((TextInputLayout)localObject2).getEditText();
    ((TextView)localObject1).setImeOptions(268435461);
    ((TextView)localObject2).setImeOptions(268435462);
    ((TextView)localObject1).setOnEditorActionListener(this);
    ((View)localObject1).setOnKeyListener(this);
    ((View)localObject2).setOnKeyListener(this);
  }
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 5;
    if (paramInt == i) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      paramInt = 12;
      moveSelection(paramInt);
    }
    return i;
  }
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = this.keyListenerRunning;
    if (bool1) {
      return false;
    }
    this.keyListenerRunning = true;
    paramView = (EditText)paramView;
    TimeModel localTimeModel = this.time;
    int i = localTimeModel.selection;
    int j = 12;
    boolean bool2;
    if (i == j) {
      bool2 = onMinuteKeyPress(paramInt, paramKeyEvent, paramView);
    } else {
      bool2 = onHourKeyPress(paramInt, paramKeyEvent, paramView);
    }
    this.keyListenerRunning = false;
    return bool2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.timepicker.TimePickerTextInputKeyController
 * JD-Core Version:    0.7.0.1
 */
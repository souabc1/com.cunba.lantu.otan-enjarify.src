package com.google.android.material.timepicker;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.material.R.id;

class TimePickerTextInputPresenter$3
  implements View.OnClickListener
{
  public TimePickerTextInputPresenter$3(TimePickerTextInputPresenter paramTimePickerTextInputPresenter) {}
  
  public void onClick(View paramView)
  {
    TimePickerTextInputPresenter localTimePickerTextInputPresenter = this.this$0;
    int i = R.id.selection_type;
    int j = ((Integer)paramView.getTag(i)).intValue();
    localTimePickerTextInputPresenter.onSelectionChanged(j);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.timepicker.TimePickerTextInputPresenter.3
 * JD-Core Version:    0.7.0.1
 */
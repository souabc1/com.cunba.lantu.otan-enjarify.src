package com.google.android.material.timepicker;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.material.R.id;

class TimePickerView$1
  implements View.OnClickListener
{
  public TimePickerView$1(TimePickerView paramTimePickerView) {}
  
  public void onClick(View paramView)
  {
    TimePickerView.OnSelectionChange localOnSelectionChange = TimePickerView.access$000(this.this$0);
    if (localOnSelectionChange != null)
    {
      localOnSelectionChange = TimePickerView.access$000(this.this$0);
      int i = R.id.selection_type;
      paramView = (Integer)paramView.getTag(i);
      int j = paramView.intValue();
      localOnSelectionChange.onSelectionChanged(j);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.timepicker.TimePickerView.1
 * JD-Core Version:    0.7.0.1
 */
package com.google.android.material.timepicker;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.material.button.MaterialButton;

class MaterialTimePicker$3
  implements View.OnClickListener
{
  public MaterialTimePicker$3(MaterialTimePicker paramMaterialTimePicker) {}
  
  public void onClick(View paramView)
  {
    paramView = this.this$0;
    int i = MaterialTimePicker.access$1100(paramView);
    if (i == 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      localMaterialButton = null;
    }
    MaterialTimePicker.access$1102(paramView, i);
    paramView = this.this$0;
    MaterialButton localMaterialButton = MaterialTimePicker.access$1200(paramView);
    MaterialTimePicker.access$1300(paramView, localMaterialButton);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.timepicker.MaterialTimePicker.3
 * JD-Core Version:    0.7.0.1
 */
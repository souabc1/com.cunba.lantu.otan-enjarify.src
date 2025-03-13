package com.google.android.material.datepicker;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.fragment.app.DialogFragment;
import java.util.AbstractCollection;
import java.util.Iterator;

class MaterialDatePicker$1
  implements View.OnClickListener
{
  public MaterialDatePicker$1(MaterialDatePicker paramMaterialDatePicker) {}
  
  public void onClick(View paramView)
  {
    paramView = MaterialDatePicker.access$000(this.this$0).iterator();
    for (;;)
    {
      boolean bool = paramView.hasNext();
      if (!bool) {
        break;
      }
      MaterialPickerOnPositiveButtonClickListener localMaterialPickerOnPositiveButtonClickListener = (MaterialPickerOnPositiveButtonClickListener)paramView.next();
      Object localObject = this.this$0.getSelection();
      localMaterialPickerOnPositiveButtonClickListener.onPositiveButtonClick(localObject);
    }
    this.this$0.dismiss();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.MaterialDatePicker.1
 * JD-Core Version:    0.7.0.1
 */
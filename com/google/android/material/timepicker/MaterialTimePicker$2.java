package com.google.android.material.timepicker;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.fragment.app.DialogFragment;
import java.util.Iterator;
import java.util.Set;

class MaterialTimePicker$2
  implements View.OnClickListener
{
  public MaterialTimePicker$2(MaterialTimePicker paramMaterialTimePicker) {}
  
  public void onClick(View paramView)
  {
    Iterator localIterator = MaterialTimePicker.access$1000(this.this$0).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      View.OnClickListener localOnClickListener = (View.OnClickListener)localIterator.next();
      localOnClickListener.onClick(paramView);
    }
    this.this$0.dismiss();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.timepicker.MaterialTimePicker.2
 * JD-Core Version:    0.7.0.1
 */
package com.google.android.material.datepicker;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.fragment.app.DialogFragment;
import java.util.AbstractCollection;
import java.util.Iterator;

class MaterialDatePicker$3
  implements View.OnClickListener
{
  public MaterialDatePicker$3(MaterialDatePicker paramMaterialDatePicker) {}
  
  public void onClick(View paramView)
  {
    Iterator localIterator = MaterialDatePicker.access$200(this.this$0).iterator();
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
 * Qualified Name:     com.google.android.material.datepicker.MaterialDatePicker.3
 * JD-Core Version:    0.7.0.1
 */
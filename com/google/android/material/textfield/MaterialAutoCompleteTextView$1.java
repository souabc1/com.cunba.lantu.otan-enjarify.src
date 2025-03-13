package com.google.android.material.textfield;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import androidx.appcompat.widget.ListPopupWindow;

class MaterialAutoCompleteTextView$1
  implements AdapterView.OnItemClickListener
{
  public MaterialAutoCompleteTextView$1(MaterialAutoCompleteTextView paramMaterialAutoCompleteTextView) {}
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = this.this$0;
    if (paramInt < 0) {
      paramAdapterView = MaterialAutoCompleteTextView.access$000(paramAdapterView).getSelectedItem();
    } else {
      paramAdapterView = paramAdapterView.getAdapter().getItem(paramInt);
    }
    MaterialAutoCompleteTextView.access$100(this.this$0, paramAdapterView);
    paramAdapterView = this.this$0;
    AdapterView.OnItemClickListener localOnItemClickListener = paramAdapterView.getOnItemClickListener();
    if (localOnItemClickListener != null)
    {
      if ((paramView == null) || (paramInt < 0))
      {
        paramView = MaterialAutoCompleteTextView.access$000(this.this$0).getSelectedView();
        paramInt = MaterialAutoCompleteTextView.access$000(this.this$0).getSelectedItemPosition();
        paramAdapterView = MaterialAutoCompleteTextView.access$000(this.this$0);
        paramLong = paramAdapterView.getSelectedItemId();
      }
      paramAdapterView = MaterialAutoCompleteTextView.access$000(this.this$0);
      ListView localListView = paramAdapterView.getListView();
      localOnItemClickListener.onItemClick(localListView, paramView, paramInt, paramLong);
    }
    MaterialAutoCompleteTextView.access$000(this.this$0).dismiss();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.textfield.MaterialAutoCompleteTextView.1
 * JD-Core Version:    0.7.0.1
 */
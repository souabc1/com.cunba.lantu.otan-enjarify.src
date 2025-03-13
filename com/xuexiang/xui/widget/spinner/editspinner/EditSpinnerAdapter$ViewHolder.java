package com.xuexiang.xui.widget.spinner.editspinner;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.xuexiang.xui.R.id;

class EditSpinnerAdapter$ViewHolder
{
  public TextView OooO00o;
  
  public EditSpinnerAdapter$ViewHolder(View paramView, int paramInt1, float paramFloat, int paramInt2)
  {
    int i = R.id.tv_tinted_spinner;
    TextView localTextView1 = (TextView)paramView.findViewById(i);
    this.OooO00o = localTextView1;
    localTextView1.setTextColor(paramInt1);
    TextView localTextView2 = this.OooO00o;
    i = 0;
    localTextView1 = null;
    localTextView2.setTextSize(0, paramFloat);
    if (paramInt2 != 0)
    {
      localTextView2 = this.OooO00o;
      localTextView2.setBackgroundResource(paramInt2);
    }
    paramView = paramView.getResources().getConfiguration();
    int j = paramView.getLayoutDirection();
    paramInt1 = 1;
    if (j == paramInt1)
    {
      paramView = this.OooO00o;
      paramInt1 = 4;
      paramView.setTextDirection(paramInt1);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.spinner.editspinner.EditSpinnerAdapter.ViewHolder
 * JD-Core Version:    0.7.0.1
 */
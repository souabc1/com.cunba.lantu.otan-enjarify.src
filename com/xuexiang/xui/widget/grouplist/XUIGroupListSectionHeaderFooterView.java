package com.xuexiang.xui.widget.grouplist;

import android.widget.LinearLayout;
import android.widget.TextView;
import m54207b69;

public class XUIGroupListSectionHeaderFooterView
  extends LinearLayout
{
  public TextView o00OoOoo;
  
  public TextView getTextView()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (TextView)m54207b69.F54207b69_09(3611, arrayOfObject);
  }
  
  public void setText(CharSequence paramCharSequence)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence;
    m54207b69.F54207b69_00(3612, arrayOfObject);
  }
  
  public void setTextGravity(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3613, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.grouplist.XUIGroupListSectionHeaderFooterView
 * JD-Core Version:    0.7.0.1
 */
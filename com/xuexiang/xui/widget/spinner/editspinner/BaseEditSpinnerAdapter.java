package com.xuexiang.xui.widget.spinner.editspinner;

import android.widget.BaseAdapter;
import java.util.List;
import m54207b69;

public abstract class BaseEditSpinnerAdapter
  extends BaseAdapter
{
  public final List o00OoOoo;
  public final int[] o00Ooo0;
  public List o00Ooo00;
  
  public void OooO0O0(List paramList)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramList;
    m54207b69.F54207b69_00(5588, arrayOfObject);
  }
  
  public int getCount()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(5589, arrayOfObject);
  }
  
  public String getDataSourceString(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (String)m54207b69.F54207b69_09(5590, arrayOfObject);
  }
  
  public abstract EditSpinnerFilter getEditSpinnerFilter();
  
  public String getItem(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (String)m54207b69.F54207b69_09(5592, arrayOfObject);
  }
  
  public long getItemId(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return m54207b69.F54207b69_06(5593, arrayOfObject);
  }
  
  public String getItemString(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (String)m54207b69.F54207b69_09(5594, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.spinner.editspinner.BaseEditSpinnerAdapter
 * JD-Core Version:    0.7.0.1
 */
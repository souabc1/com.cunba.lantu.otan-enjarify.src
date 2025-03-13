package com.xuexiang.xui.widget.spinner.materialspinner;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.List;
import m54207b69;

public abstract class MaterialSpinnerBaseAdapter
  extends BaseAdapter
{
  public final Context o00OoOoo;
  public int o00Ooo0;
  public int o00Ooo00;
  public float o00Ooo0O;
  public int o00Ooo0o;
  
  public void OooO00o(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5669, arrayOfObject);
  }
  
  public abstract Object get(int paramInt);
  
  public abstract int getCount();
  
  public abstract Object getItem(int paramInt);
  
  public long getItemId(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return m54207b69.F54207b69_06(5670, arrayOfObject);
  }
  
  public String getItemText(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (String)m54207b69.F54207b69_09(5671, arrayOfObject);
  }
  
  public abstract List getItems();
  
  public int getSelectedIndex()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(5672, arrayOfObject);
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    arrayOfObject[2] = paramView;
    arrayOfObject[3] = paramViewGroup;
    return (View)m54207b69.F54207b69_09(5673, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinnerBaseAdapter
 * JD-Core Version:    0.7.0.1
 */
package com.xuexiang.xui.widget.dialog.bottomsheet;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import m54207b69;

class BottomSheet$BottomListSheetBuilder$ListAdapter
  extends BaseAdapter
{
  public boolean o00OoOoo;
  
  public int getCount()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(3000, arrayOfObject);
  }
  
  public BottomSheet.BottomListSheetBuilder.BottomSheetListItemData getItem(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (BottomSheet.BottomListSheetBuilder.BottomSheetListItemData)m54207b69.F54207b69_09(3001, arrayOfObject);
  }
  
  public long getItemId(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return m54207b69.F54207b69_06(3003, arrayOfObject);
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    arrayOfObject[2] = paramView;
    arrayOfObject[3] = paramViewGroup;
    return (View)m54207b69.F54207b69_09(3004, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.dialog.bottomsheet.BottomSheet.BottomListSheetBuilder.ListAdapter
 * JD-Core Version:    0.7.0.1
 */
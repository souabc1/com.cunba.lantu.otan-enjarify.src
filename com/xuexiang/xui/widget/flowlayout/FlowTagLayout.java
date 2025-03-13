package com.xuexiang.xui.widget.flowlayout;

import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.List;
import m54207b69;

public class FlowTagLayout
  extends ViewGroup
{
  public BaseTagAdapter o00OoOoo;
  public FlowTagLayout.OnTagSelectListener o00Ooo0;
  public FlowTagLayout.OnTagClickListener o00Ooo00;
  public int o00Ooo0O;
  public boolean o00Ooo0o;
  public int o00OooO;
  public SparseBooleanArray o00OooO0;
  
  private boolean isRtl()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(3590, arrayOfObject);
  }
  
  private void setChildViewClickListener(int paramInt, View paramView)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    arrayOfObject[2] = paramView;
    m54207b69.F54207b69_00(3593, arrayOfObject);
  }
  
  public final void OooO0o()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(3581, arrayOfObject);
  }
  
  public final FlowTagLayout OooO0oO(List paramList)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramList;
    return (FlowTagLayout)m54207b69.F54207b69_09(3583, arrayOfObject);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAttributeSet;
    return (ViewGroup.LayoutParams)m54207b69.F54207b69_09(3584, arrayOfObject);
  }
  
  public BaseTagAdapter getAdapter()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (BaseTagAdapter)m54207b69.F54207b69_09(3585, arrayOfObject);
  }
  
  public int getSelectedIndex()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(3586, arrayOfObject);
  }
  
  public List getSelectedIndexs()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (List)m54207b69.F54207b69_09(3587, arrayOfObject);
  }
  
  public Object getSelectedItem()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_09(3588, arrayOfObject);
  }
  
  public int getTagCheckMode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(3589, arrayOfObject);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this;
    Object localObject = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(paramInt1);
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(paramInt2);
    arrayOfObject[3] = localObject;
    localObject = Integer.valueOf(paramInt3);
    arrayOfObject[4] = localObject;
    localObject = Integer.valueOf(paramInt4);
    arrayOfObject[5] = localObject;
    m54207b69.F54207b69_00(3591, arrayOfObject);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(3592, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.flowlayout.FlowTagLayout
 * JD-Core Version:    0.7.0.1
 */
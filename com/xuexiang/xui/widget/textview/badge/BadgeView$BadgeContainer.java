package com.xuexiang.xui.widget.textview.badge;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import m54207b69;

class BadgeView$BadgeContainer
  extends ViewGroup
{
  public BadgeView$BadgeContainer(Context paramContext)
  {
    super(paramContext);
  }
  
  public void dispatchRestoreInstanceState(SparseArray paramSparseArray)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramSparseArray;
    m54207b69.F54207b69_00(6226, arrayOfObject);
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
    m54207b69.F54207b69_00(6227, arrayOfObject);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(6228, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.textview.badge.BadgeView.BadgeContainer
 * JD-Core Version:    0.7.0.1
 */
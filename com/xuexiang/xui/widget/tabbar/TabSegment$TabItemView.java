package com.xuexiang.xui.widget.tabbar;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils.TruncateAt;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.xuexiang.xui.R.id;
import com.xuexiang.xui.XUI;
import m54207b69;

public class TabSegment$TabItemView
  extends RelativeLayout
{
  public AppCompatTextView o00OoOoo;
  public GestureDetector o00Ooo00;
  
  public TabSegment$TabItemView(TabSegment paramTabSegment, Context paramContext)
  {
    super(paramContext);
    paramContext = new androidx/appcompat/widget/AppCompatTextView;
    Object localObject = getContext();
    paramContext.<init>((Context)localObject);
    this.o00OoOoo = paramContext;
    paramContext.setSingleLine(true);
    this.o00OoOoo.setGravity(17);
    paramContext = this.o00OoOoo;
    localObject = TextUtils.TruncateAt.MIDDLE;
    paramContext.setEllipsize((TextUtils.TruncateAt)localObject);
    paramContext = this.o00OoOoo;
    localObject = XUI.getDefaultTypeface();
    paramContext.setTypeface((Typeface)localObject);
    paramContext = this.o00OoOoo;
    int i = R.id.xui_tab_segment_item_id;
    paramContext.setId(i);
    paramContext = new android/widget/RelativeLayout$LayoutParams;
    i = -2;
    paramContext.<init>(i, i);
    paramContext.addRule(15, -1);
    localObject = this.o00OoOoo;
    addView((View)localObject, paramContext);
    paramContext = new android/view/GestureDetector;
    localObject = getContext();
    TabSegment.TabItemView.1 local1 = new com/xuexiang/xui/widget/tabbar/TabSegment$TabItemView$1;
    local1.<init>(this, paramTabSegment);
    paramContext.<init>((Context)localObject, local1);
    this.o00Ooo00 = paramContext;
  }
  
  public void OooO00o(TabSegment.Tab paramTab, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramTab;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(5810, arrayOfObject);
  }
  
  public void OooO0O0(TabSegment.Tab paramTab, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramTab;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[2] = localBoolean;
    m54207b69.F54207b69_00(5811, arrayOfObject);
  }
  
  public TextView getTextView()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (TextView)m54207b69.F54207b69_09(5812, arrayOfObject);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GestureDetector localGestureDetector = this.o00Ooo00;
    boolean bool1 = localGestureDetector.onTouchEvent(paramMotionEvent);
    if (!bool1)
    {
      bool2 = super.onTouchEvent(paramMotionEvent);
      if (!bool2)
      {
        bool2 = false;
        paramMotionEvent = null;
        break label41;
      }
    }
    boolean bool2 = true;
    label41:
    return bool2;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.tabbar.TabSegment.TabItemView
 * JD-Core Version:    0.7.0.1
 */
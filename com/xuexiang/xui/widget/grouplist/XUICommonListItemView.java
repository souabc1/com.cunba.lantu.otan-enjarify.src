package com.xuexiang.xui.widget.grouplist;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import m54207b69;

public class XUICommonListItemView
  extends RelativeLayout
{
  public int o00OoOoo;
  public int o00Ooo0;
  public int o00Ooo00;
  public ImageView o00Ooo0O;
  public ViewGroup o00Ooo0o;
  public TextView o00OooO;
  public LinearLayout o00OooO0;
  public TextView o00OooOO;
  public Space o00OooOo;
  public ImageView o00OoooO;
  public View o00Ooooo;
  public CheckBox o0O00o0;
  
  private ImageView getAccessoryImageView()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (ImageView)m54207b69.F54207b69_09(3595, arrayOfObject);
  }
  
  private ViewGroup.LayoutParams getAccessoryLayoutParams()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (ViewGroup.LayoutParams)m54207b69.F54207b69_09(3596, arrayOfObject);
  }
  
  public ViewGroup getAccessoryContainerView()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (ViewGroup)m54207b69.F54207b69_09(3594, arrayOfObject);
  }
  
  public int getAccessoryType()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(3597, arrayOfObject);
  }
  
  public CharSequence getDetailText()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (CharSequence)m54207b69.F54207b69_09(3598, arrayOfObject);
  }
  
  public TextView getDetailTextView()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (TextView)m54207b69.F54207b69_09(3599, arrayOfObject);
  }
  
  public int getOrientation()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(3600, arrayOfObject);
  }
  
  public CheckBox getSwitch()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (CheckBox)m54207b69.F54207b69_09(3601, arrayOfObject);
  }
  
  public CharSequence getText()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (CharSequence)m54207b69.F54207b69_09(3602, arrayOfObject);
  }
  
  public TextView getTextView()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (TextView)m54207b69.F54207b69_09(3603, arrayOfObject);
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
    m54207b69.F54207b69_00(3604, arrayOfObject);
  }
  
  public void setAccessoryType(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3605, arrayOfObject);
  }
  
  public void setDetailText(CharSequence paramCharSequence)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence;
    m54207b69.F54207b69_00(3606, arrayOfObject);
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDrawable;
    m54207b69.F54207b69_00(3607, arrayOfObject);
  }
  
  public void setOrientation(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3608, arrayOfObject);
  }
  
  public void setRedDotPosition(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3609, arrayOfObject);
  }
  
  public void setText(CharSequence paramCharSequence)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence;
    m54207b69.F54207b69_00(3610, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.grouplist.XUICommonListItemView
 * JD-Core Version:    0.7.0.1
 */
package com.xuexiang.xui.widget.spinner.editspinner;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListPopupWindow;
import java.lang.ref.WeakReference;
import m54207b69;

public class EditSpinner
  extends FrameLayout
  implements View.OnClickListener, AdapterView.OnItemClickListener, TextWatcher
{
  public EditText o00OoOoo;
  public WeakReference o00Ooo0;
  public ImageView o00Ooo00;
  public BaseEditSpinnerAdapter o00Ooo0O;
  public long o00Ooo0o;
  public Animation o00OooO;
  public Animation o00OooO0;
  public AdapterView.OnItemClickListener o00OooOO;
  public Drawable o00OooOo;
  public boolean o00OoooO;
  public int o0O00o0;
  
  private ListPopupWindow getPopupWindow()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (ListPopupWindow)m54207b69.F54207b69_09(5612, arrayOfObject);
  }
  
  private void setBaseAdapter(BaseAdapter paramBaseAdapter)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramBaseAdapter;
    m54207b69.F54207b69_00(5618, arrayOfObject);
  }
  
  public EditSpinner OooO(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (EditSpinner)m54207b69.F54207b69_09(5597, arrayOfObject);
  }
  
  public final void OooO0o()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5602, arrayOfObject);
  }
  
  public final ListPopupWindow OooO0o0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (ListPopupWindow)m54207b69.F54207b69_09(5603, arrayOfObject);
  }
  
  public final void OooO0oO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5604, arrayOfObject);
  }
  
  public EditSpinner OooO0oo(BaseEditSpinnerAdapter paramBaseEditSpinnerAdapter)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramBaseEditSpinnerAdapter;
    return (EditSpinner)m54207b69.F54207b69_09(5605, arrayOfObject);
  }
  
  public final void OooOO0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5606, arrayOfObject);
  }
  
  public final void OooOO0O(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    m54207b69.F54207b69_00(5607, arrayOfObject);
  }
  
  public final void OooOO0o()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5608, arrayOfObject);
  }
  
  public final void afterTextChanged(Editable paramEditable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramEditable;
    m54207b69.F54207b69_00(5609, arrayOfObject);
  }
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[2] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[3] = localInteger;
    localInteger = Integer.valueOf(paramInt3);
    arrayOfObject[4] = localInteger;
    m54207b69.F54207b69_00(5610, arrayOfObject);
  }
  
  public EditText getEditText()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (EditText)m54207b69.F54207b69_09(5611, arrayOfObject);
  }
  
  public String getText()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(5613, arrayOfObject);
  }
  
  public final void onClick(View paramView)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    m54207b69.F54207b69_00(5614, arrayOfObject);
  }
  
  public void onDetachedFromWindow()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5615, arrayOfObject);
  }
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAdapterView;
    arrayOfObject[2] = paramView;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[3] = localObject;
    localObject = Long.valueOf(paramLong);
    arrayOfObject[4] = localObject;
    m54207b69.F54207b69_00(5616, arrayOfObject);
  }
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[2] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[3] = localInteger;
    localInteger = Integer.valueOf(paramInt3);
    arrayOfObject[4] = localInteger;
    m54207b69.F54207b69_00(5617, arrayOfObject);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(5619, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.spinner.editspinner.EditSpinner
 * JD-Core Version:    0.7.0.1
 */
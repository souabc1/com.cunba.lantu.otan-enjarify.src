package com.xuexiang.xui.widget.searchview;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.Filter.FilterListener;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import m54207b69;

public class MaterialSearchView
  extends FrameLayout
  implements Filter.FilterListener
{
  public boolean o00OoOoo;
  public boolean o00Ooo0;
  public int o00Ooo00;
  public View o00Ooo0O;
  public View o00Ooo0o;
  public EditText o00OooO;
  public ListView o00OooO0;
  public ImageButton o00OooOO;
  public ImageButton o00OooOo;
  public LinearLayout o00OoooO;
  public CharSequence o00Ooooo;
  public boolean o00o00;
  public MaterialSearchView.OnQueryTextListener o00o000;
  public CharSequence o00o0000;
  public MaterialSearchView.SearchViewListener o00o000O;
  public ListAdapter o00o000o;
  public boolean o00o00O0;
  public boolean o00o00Oo;
  public Context o00o00o;
  public Drawable o00o00o0;
  public ImageButton o0O00o0;
  public MaterialSearchView.SavedState oo00oO;
  
  private boolean isVoiceAvailable()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(5511, arrayOfObject);
  }
  
  public void OooOOO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5495, arrayOfObject);
  }
  
  public void OooOOO0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5496, arrayOfObject);
  }
  
  public void OooOOOO(View paramView)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    m54207b69.F54207b69_00(5497, arrayOfObject);
  }
  
  public final void OooOOOo()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5498, arrayOfObject);
  }
  
  public final void OooOOo()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5499, arrayOfObject);
  }
  
  public final void OooOOo0(CharSequence paramCharSequence)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence;
    m54207b69.F54207b69_00(5500, arrayOfObject);
  }
  
  public void OooOOoo(CharSequence paramCharSequence, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[2] = localBoolean;
    m54207b69.F54207b69_00(5501, arrayOfObject);
  }
  
  public void OooOo()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5502, arrayOfObject);
  }
  
  public void OooOo0(View paramView)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    m54207b69.F54207b69_00(5503, arrayOfObject);
  }
  
  public final void OooOo00()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5504, arrayOfObject);
  }
  
  public void OooOo0O()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5505, arrayOfObject);
  }
  
  public void OooOo0o(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(5506, arrayOfObject);
  }
  
  public final void OooOoO(CharSequence paramCharSequence)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence;
    m54207b69.F54207b69_00(5507, arrayOfObject);
  }
  
  public void OooOoO0(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(5508, arrayOfObject);
  }
  
  public void clearFocus()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5509, arrayOfObject);
  }
  
  public boolean isSearchOpen()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(5510, arrayOfObject);
  }
  
  public void onFilterComplete(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5512, arrayOfObject);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramParcelable;
    m54207b69.F54207b69_00(5513, arrayOfObject);
  }
  
  public Parcelable onSaveInstanceState()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Parcelable)m54207b69.F54207b69_09(5514, arrayOfObject);
  }
  
  public boolean requestFocus(int paramInt, Rect paramRect)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    arrayOfObject[2] = paramRect;
    return m54207b69.F54207b69_01(5515, arrayOfObject);
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramListAdapter;
    m54207b69.F54207b69_00(5516, arrayOfObject);
  }
  
  public void setAnimationDuration(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5517, arrayOfObject);
  }
  
  public void setBackIcon(Drawable paramDrawable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDrawable;
    m54207b69.F54207b69_00(5518, arrayOfObject);
  }
  
  public void setBackground(Drawable paramDrawable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDrawable;
    m54207b69.F54207b69_00(5519, arrayOfObject);
  }
  
  public void setBackgroundColor(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5520, arrayOfObject);
  }
  
  public void setCloseIcon(Drawable paramDrawable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDrawable;
    m54207b69.F54207b69_00(5521, arrayOfObject);
  }
  
  public void setCursorDrawable(int paramInt)
  {
    Object localObject1 = TextView.class;
    Object localObject2 = "=S3E1128242441271E293B2E3D3D4C44104631";
    try
    {
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      localObject1 = ((Class)localObject1).getDeclaredField((String)localObject2);
      boolean bool = true;
      ((AccessibleObject)localObject1).setAccessible(bool);
      localObject2 = this.o00OooO;
      Integer localInteger = Integer.valueOf(paramInt);
      ((Field)localObject1).set(localObject2, localInteger);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public void setEllipsize(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(5523, arrayOfObject);
  }
  
  public void setHint(CharSequence paramCharSequence)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence;
    m54207b69.F54207b69_00(5524, arrayOfObject);
  }
  
  public void setHintTextColor(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5525, arrayOfObject);
  }
  
  public void setInputType(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5526, arrayOfObject);
  }
  
  public void setMenuItem(MenuItem paramMenuItem)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMenuItem;
    m54207b69.F54207b69_00(5527, arrayOfObject);
  }
  
  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramOnItemClickListener;
    m54207b69.F54207b69_00(5528, arrayOfObject);
  }
  
  public void setOnQueryTextListener(MaterialSearchView.OnQueryTextListener paramOnQueryTextListener)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramOnQueryTextListener;
    m54207b69.F54207b69_00(5529, arrayOfObject);
  }
  
  public void setOnSearchViewListener(MaterialSearchView.SearchViewListener paramSearchViewListener)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramSearchViewListener;
    m54207b69.F54207b69_00(5530, arrayOfObject);
  }
  
  public void setSearchFilter(AbstractSearchFilter paramAbstractSearchFilter)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAbstractSearchFilter;
    m54207b69.F54207b69_00(5531, arrayOfObject);
  }
  
  public void setSubmitOnClick(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(5532, arrayOfObject);
  }
  
  public void setSuggestionBackground(Drawable paramDrawable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDrawable;
    m54207b69.F54207b69_00(5533, arrayOfObject);
  }
  
  public void setSuggestionIcon(Drawable paramDrawable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDrawable;
    m54207b69.F54207b69_00(5534, arrayOfObject);
  }
  
  public void setSuggestions(String[] paramArrayOfString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramArrayOfString;
    m54207b69.F54207b69_00(5535, arrayOfObject);
  }
  
  public void setTextColor(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5536, arrayOfObject);
  }
  
  public void setVoiceIcon(Drawable paramDrawable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDrawable;
    m54207b69.F54207b69_00(5537, arrayOfObject);
  }
  
  public void setVoiceSearch(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(5538, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.searchview.MaterialSearchView
 * JD-Core Version:    0.7.0.1
 */
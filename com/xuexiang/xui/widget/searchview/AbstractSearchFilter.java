package com.xuexiang.xui.widget.searchview;

import android.widget.Filter;
import android.widget.Filter.FilterResults;
import m54207b69;

public abstract class AbstractSearchFilter
  extends Filter
{
  public String[] OooO00o;
  public AbstractSearchFilter.OnFilterResultListener OooO0O0;
  
  public AbstractSearchFilter OooO00o(AbstractSearchFilter.OnFilterResultListener paramOnFilterResultListener)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramOnFilterResultListener;
    return (AbstractSearchFilter)m54207b69.F54207b69_09(5450, arrayOfObject);
  }
  
  public AbstractSearchFilter OooO0O0(String[] paramArrayOfString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramArrayOfString;
    return (AbstractSearchFilter)m54207b69.F54207b69_09(5451, arrayOfObject);
  }
  
  public String[] getSuggestions()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String[])m54207b69.F54207b69_09(5452, arrayOfObject);
  }
  
  public void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence;
    arrayOfObject[2] = paramFilterResults;
    m54207b69.F54207b69_00(5453, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.searchview.AbstractSearchFilter
 * JD-Core Version:    0.7.0.1
 */
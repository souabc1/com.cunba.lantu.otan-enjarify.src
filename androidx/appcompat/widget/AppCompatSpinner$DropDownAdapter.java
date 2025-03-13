package androidx.appcompat.widget;

import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

class AppCompatSpinner$DropDownAdapter
  implements ListAdapter, SpinnerAdapter
{
  public SpinnerAdapter o00OoOoo;
  public ListAdapter o00Ooo00;
  
  public AppCompatSpinner$DropDownAdapter(SpinnerAdapter paramSpinnerAdapter, Resources.Theme paramTheme)
  {
    this.o00OoOoo = paramSpinnerAdapter;
    boolean bool = paramSpinnerAdapter instanceof ListAdapter;
    Object localObject;
    if (bool)
    {
      localObject = paramSpinnerAdapter;
      localObject = (ListAdapter)paramSpinnerAdapter;
      this.o00Ooo00 = ((ListAdapter)localObject);
    }
    if (paramTheme != null)
    {
      bool = paramSpinnerAdapter instanceof android.widget.ThemedSpinnerAdapter;
      if (bool)
      {
        paramSpinnerAdapter = (android.widget.ThemedSpinnerAdapter)paramSpinnerAdapter;
        AppCompatSpinner.Api23Impl.OooO00o(paramSpinnerAdapter, paramTheme);
      }
      else
      {
        bool = paramSpinnerAdapter instanceof ThemedSpinnerAdapter;
        if (bool)
        {
          paramSpinnerAdapter = (ThemedSpinnerAdapter)paramSpinnerAdapter;
          localObject = paramSpinnerAdapter.getDropDownViewTheme();
          if (localObject == null) {
            paramSpinnerAdapter.setDropDownViewTheme(paramTheme);
          }
        }
      }
    }
  }
  
  public boolean areAllItemsEnabled()
  {
    ListAdapter localListAdapter = this.o00Ooo00;
    if (localListAdapter != null) {
      return localListAdapter.areAllItemsEnabled();
    }
    return true;
  }
  
  public int getCount()
  {
    SpinnerAdapter localSpinnerAdapter = this.o00OoOoo;
    int i;
    if (localSpinnerAdapter == null)
    {
      i = 0;
      localSpinnerAdapter = null;
    }
    else
    {
      i = localSpinnerAdapter.getCount();
    }
    return i;
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    SpinnerAdapter localSpinnerAdapter = this.o00OoOoo;
    View localView;
    if (localSpinnerAdapter == null)
    {
      paramInt = 0;
      localView = null;
    }
    else
    {
      localView = localSpinnerAdapter.getDropDownView(paramInt, paramView, paramViewGroup);
    }
    return localView;
  }
  
  public Object getItem(int paramInt)
  {
    SpinnerAdapter localSpinnerAdapter = this.o00OoOoo;
    Object localObject;
    if (localSpinnerAdapter == null)
    {
      paramInt = 0;
      localObject = null;
    }
    else
    {
      localObject = localSpinnerAdapter.getItem(paramInt);
    }
    return localObject;
  }
  
  public long getItemId(int paramInt)
  {
    SpinnerAdapter localSpinnerAdapter = this.o00OoOoo;
    long l;
    if (localSpinnerAdapter == null) {
      l = -1;
    } else {
      l = localSpinnerAdapter.getItemId(paramInt);
    }
    return l;
  }
  
  public int getItemViewType(int paramInt)
  {
    return 0;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return getDropDownView(paramInt, paramView, paramViewGroup);
  }
  
  public int getViewTypeCount()
  {
    return 1;
  }
  
  public boolean hasStableIds()
  {
    SpinnerAdapter localSpinnerAdapter = this.o00OoOoo;
    if (localSpinnerAdapter != null)
    {
      bool = localSpinnerAdapter.hasStableIds();
      if (bool) {
        return true;
      }
    }
    boolean bool = false;
    localSpinnerAdapter = null;
    return bool;
  }
  
  public boolean isEmpty()
  {
    int i = getCount();
    if (i == 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean isEnabled(int paramInt)
  {
    ListAdapter localListAdapter = this.o00Ooo00;
    if (localListAdapter != null) {
      return localListAdapter.isEnabled(paramInt);
    }
    return true;
  }
  
  public void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    SpinnerAdapter localSpinnerAdapter = this.o00OoOoo;
    if (localSpinnerAdapter != null) {
      localSpinnerAdapter.registerDataSetObserver(paramDataSetObserver);
    }
  }
  
  public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    SpinnerAdapter localSpinnerAdapter = this.o00OoOoo;
    if (localSpinnerAdapter != null) {
      localSpinnerAdapter.unregisterDataSetObserver(paramDataSetObserver);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatSpinner.DropDownAdapter
 * JD-Core Version:    0.7.0.1
 */
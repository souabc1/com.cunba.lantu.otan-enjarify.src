package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

public abstract class CursorAdapter
  extends BaseAdapter
  implements Filterable, CursorFilter.CursorFilterClient
{
  public boolean o00OoOoo;
  public Cursor o00Ooo0;
  public boolean o00Ooo00;
  public Context o00Ooo0O;
  public int o00Ooo0o;
  public DataSetObserver o00OooO;
  public CursorAdapter.ChangeObserver o00OooO0;
  public CursorFilter o00OooOO;
  public FilterQueryProvider o00OooOo;
  
  public CursorAdapter(Context paramContext, Cursor paramCursor, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramBoolean = true;
    } else {
      paramBoolean = true;
    }
    OooO0o0(paramContext, paramCursor, paramBoolean);
  }
  
  public Cursor OooO(Cursor paramCursor)
  {
    Cursor localCursor = this.o00Ooo0;
    if (paramCursor == localCursor) {
      return null;
    }
    Object localObject;
    if (localCursor != null)
    {
      localObject = this.o00OooO0;
      if (localObject != null) {
        localCursor.unregisterContentObserver((ContentObserver)localObject);
      }
      localObject = this.o00OooO;
      if (localObject != null) {
        localCursor.unregisterDataSetObserver((DataSetObserver)localObject);
      }
    }
    this.o00Ooo0 = paramCursor;
    int i;
    if (paramCursor != null)
    {
      localObject = this.o00OooO0;
      if (localObject != null) {
        paramCursor.registerContentObserver((ContentObserver)localObject);
      }
      localObject = this.o00OooO;
      if (localObject != null) {
        paramCursor.registerDataSetObserver((DataSetObserver)localObject);
      }
      localObject = "_id";
      i = paramCursor.getColumnIndexOrThrow((String)localObject);
      this.o00Ooo0o = i;
      i = 1;
      this.o00OoOoo = i;
      notifyDataSetChanged();
    }
    else
    {
      this.o00Ooo0o = -1;
      i = 0;
      paramCursor = null;
      this.o00OoOoo = false;
      notifyDataSetInvalidated();
    }
    return localCursor;
  }
  
  public CharSequence OooO00o(Cursor paramCursor)
  {
    if (paramCursor == null) {
      paramCursor = "";
    } else {
      paramCursor = paramCursor.toString();
    }
    return paramCursor;
  }
  
  public void OooO0O0(Cursor paramCursor)
  {
    paramCursor = OooO(paramCursor);
    if (paramCursor != null) {
      paramCursor.close();
    }
  }
  
  public Cursor OooO0OO(CharSequence paramCharSequence)
  {
    FilterQueryProvider localFilterQueryProvider = this.o00OooOo;
    if (localFilterQueryProvider != null) {
      return localFilterQueryProvider.runQuery(paramCharSequence);
    }
    return this.o00Ooo0;
  }
  
  public abstract void OooO0Oo(View paramView, Context paramContext, Cursor paramCursor);
  
  public View OooO0o(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return OooO0oO(paramContext, paramCursor, paramViewGroup);
  }
  
  public void OooO0o0(Context paramContext, Cursor paramCursor, int paramInt)
  {
    int i = paramInt & 0x1;
    boolean bool = false;
    int j = 1;
    if (i == j)
    {
      paramInt |= 0x2;
      this.o00Ooo00 = j;
    }
    else
    {
      this.o00Ooo00 = false;
    }
    if (paramCursor != null) {
      bool = j;
    }
    this.o00Ooo0 = paramCursor;
    this.o00OoOoo = bool;
    this.o00Ooo0O = paramContext;
    if (bool)
    {
      paramContext = "_id";
      k = paramCursor.getColumnIndexOrThrow(paramContext);
    }
    else
    {
      k = -1;
    }
    this.o00Ooo0o = k;
    int k = 2;
    paramInt &= k;
    if (paramInt == k)
    {
      paramContext = new androidx/cursoradapter/widget/CursorAdapter$ChangeObserver;
      paramContext.<init>(this);
      this.o00OooO0 = paramContext;
      paramContext = new androidx/cursoradapter/widget/CursorAdapter$MyDataSetObserver;
      paramContext.<init>(this);
    }
    else
    {
      k = 0;
      paramContext = null;
      this.o00OooO0 = null;
    }
    this.o00OooO = paramContext;
    if (bool)
    {
      paramContext = this.o00OooO0;
      if (paramContext != null) {
        paramCursor.registerContentObserver(paramContext);
      }
      paramContext = this.o00OooO;
      if (paramContext != null) {
        paramCursor.registerDataSetObserver(paramContext);
      }
    }
  }
  
  public abstract View OooO0oO(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup);
  
  public void OooO0oo()
  {
    boolean bool = this.o00Ooo00;
    if (bool)
    {
      Cursor localCursor = this.o00Ooo0;
      if (localCursor != null)
      {
        bool = localCursor.isClosed();
        if (!bool)
        {
          localCursor = this.o00Ooo0;
          bool = localCursor.requery();
          this.o00OoOoo = bool;
        }
      }
    }
  }
  
  public int getCount()
  {
    boolean bool = this.o00OoOoo;
    if (bool)
    {
      Cursor localCursor = this.o00Ooo0;
      if (localCursor != null) {
        return localCursor.getCount();
      }
    }
    return 0;
  }
  
  public Cursor getCursor()
  {
    return this.o00Ooo0;
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = this.o00OoOoo;
    if (bool)
    {
      Cursor localCursor = this.o00Ooo0;
      localCursor.moveToPosition(paramInt);
      if (paramView == null)
      {
        localContext = this.o00Ooo0O;
        paramView = this.o00Ooo0;
        paramView = OooO0o(localContext, paramView, paramViewGroup);
      }
      Context localContext = this.o00Ooo0O;
      paramViewGroup = this.o00Ooo0;
      OooO0Oo(paramView, localContext, paramViewGroup);
      return paramView;
    }
    return null;
  }
  
  public Filter getFilter()
  {
    CursorFilter localCursorFilter = this.o00OooOO;
    if (localCursorFilter == null)
    {
      localCursorFilter = new androidx/cursoradapter/widget/CursorFilter;
      localCursorFilter.<init>(this);
      this.o00OooOO = localCursorFilter;
    }
    return this.o00OooOO;
  }
  
  public FilterQueryProvider getFilterQueryProvider()
  {
    return this.o00OooOo;
  }
  
  public Object getItem(int paramInt)
  {
    boolean bool = this.o00OoOoo;
    if (bool)
    {
      Cursor localCursor = this.o00Ooo0;
      if (localCursor != null)
      {
        localCursor.moveToPosition(paramInt);
        return this.o00Ooo0;
      }
    }
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    boolean bool = this.o00OoOoo;
    long l = 0L;
    if (bool)
    {
      Cursor localCursor1 = this.o00Ooo0;
      if (localCursor1 != null)
      {
        paramInt = localCursor1.moveToPosition(paramInt);
        if (paramInt != 0)
        {
          Cursor localCursor2 = this.o00Ooo0;
          int i = this.o00Ooo0o;
          return localCursor2.getLong(i);
        }
      }
    }
    return l;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool = this.o00OoOoo;
    if (bool)
    {
      Cursor localCursor = this.o00Ooo0;
      bool = localCursor.moveToPosition(paramInt);
      if (bool)
      {
        if (paramView == null)
        {
          localObject = this.o00Ooo0O;
          paramView = this.o00Ooo0;
          paramView = OooO0oO((Context)localObject, paramView, paramViewGroup);
        }
        localObject = this.o00Ooo0O;
        paramViewGroup = this.o00Ooo0;
        OooO0Oo(paramView, (Context)localObject, paramViewGroup);
        return paramView;
      }
      paramView = new java/lang/IllegalStateException;
      paramViewGroup = new java/lang/StringBuilder;
      paramViewGroup.<init>();
      paramViewGroup.append("couldn't move cursor to position ");
      paramViewGroup.append(paramInt);
      localObject = paramViewGroup.toString();
      paramView.<init>((String)localObject);
      throw paramView;
    }
    Object localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>("this should only be called when the cursor is valid");
    throw ((Throwable)localObject);
  }
  
  public boolean hasStableIds()
  {
    return true;
  }
  
  public void setFilterQueryProvider(FilterQueryProvider paramFilterQueryProvider)
  {
    this.o00OooOo = paramFilterQueryProvider;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.cursoradapter.widget.CursorAdapter
 * JD-Core Version:    0.7.0.1
 */
package androidx.cursoradapter.widget;

import android.database.DataSetObserver;
import android.widget.BaseAdapter;

class CursorAdapter$MyDataSetObserver
  extends DataSetObserver
{
  public CursorAdapter$MyDataSetObserver(CursorAdapter paramCursorAdapter) {}
  
  public void onChanged()
  {
    CursorAdapter localCursorAdapter = this.OooO00o;
    localCursorAdapter.o00OoOoo = true;
    localCursorAdapter.notifyDataSetChanged();
  }
  
  public void onInvalidated()
  {
    CursorAdapter localCursorAdapter = this.OooO00o;
    localCursorAdapter.o00OoOoo = false;
    localCursorAdapter.notifyDataSetInvalidated();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.cursoradapter.widget.CursorAdapter.MyDataSetObserver
 * JD-Core Version:    0.7.0.1
 */
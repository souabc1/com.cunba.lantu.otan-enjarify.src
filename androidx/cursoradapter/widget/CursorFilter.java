package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

class CursorFilter
  extends Filter
{
  public CursorFilter.CursorFilterClient OooO00o;
  
  public CursorFilter(CursorFilter.CursorFilterClient paramCursorFilterClient)
  {
    this.OooO00o = paramCursorFilterClient;
  }
  
  public CharSequence convertResultToString(Object paramObject)
  {
    CursorFilter.CursorFilterClient localCursorFilterClient = this.OooO00o;
    paramObject = (Cursor)paramObject;
    return localCursorFilterClient.OooO00o(paramObject);
  }
  
  public Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    paramCharSequence = this.OooO00o.OooO0OO(paramCharSequence);
    Filter.FilterResults localFilterResults = new android/widget/Filter$FilterResults;
    localFilterResults.<init>();
    if (paramCharSequence != null)
    {
      int i = paramCharSequence.getCount();
      localFilterResults.count = i;
    }
    else
    {
      localFilterResults.count = 0;
      paramCharSequence = null;
    }
    localFilterResults.values = paramCharSequence;
    return localFilterResults;
  }
  
  public void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    paramCharSequence = this.OooO00o.getCursor();
    paramFilterResults = paramFilterResults.values;
    if ((paramFilterResults != null) && (paramFilterResults != paramCharSequence))
    {
      paramCharSequence = this.OooO00o;
      paramFilterResults = (Cursor)paramFilterResults;
      paramCharSequence.OooO0O0(paramFilterResults);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.cursoradapter.widget.CursorFilter
 * JD-Core Version:    0.7.0.1
 */
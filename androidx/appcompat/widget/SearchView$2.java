package androidx.appcompat.widget;

import androidx.cursoradapter.widget.CursorAdapter;

class SearchView$2
  implements Runnable
{
  public SearchView$2(SearchView paramSearchView) {}
  
  public void run()
  {
    CursorAdapter localCursorAdapter = this.o00OoOoo.o00o0OO0;
    boolean bool = localCursorAdapter instanceof SuggestionsAdapter;
    if (bool)
    {
      bool = false;
      ((CursorAdapter)localCursorAdapter).OooO0O0(null);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.SearchView.2
 * JD-Core Version:    0.7.0.1
 */
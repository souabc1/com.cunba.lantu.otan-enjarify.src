package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

class SearchView$6
  implements View.OnKeyListener
{
  public SearchView$6(SearchView paramSearchView) {}
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    Object localObject = this.o00OoOoo;
    SearchableInfo localSearchableInfo = ((SearchView)localObject).o00o0o;
    if (localSearchableInfo == null) {
      return false;
    }
    localObject = ((SearchView)localObject).o00OoOoo;
    boolean bool = ((AutoCompleteTextView)localObject).isPopupShowing();
    if (bool)
    {
      localObject = this.o00OoOoo.o00OoOoo;
      int i = ((AutoCompleteTextView)localObject).getListSelection();
      int k = -1;
      if (i != k) {
        return this.o00OoOoo.OooOoOO(paramView, paramInt, paramKeyEvent);
      }
    }
    localObject = this.o00OoOoo.o00OoOoo;
    int j = ((SearchView.SearchAutoComplete)localObject).isEmpty();
    if (j == 0)
    {
      j = paramKeyEvent.hasNoModifiers();
      if (j != 0)
      {
        int m = paramKeyEvent.getAction();
        j = 1;
        if (m == j)
        {
          int n = 66;
          if (paramInt == n)
          {
            paramView.cancelLongPress();
            paramView = this.o00OoOoo;
            String str = paramView.o00OoOoo.getText().toString();
            paramView.OooOOoo(0, null, str);
            return j;
          }
        }
      }
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.SearchView.6
 * JD-Core Version:    0.7.0.1
 */
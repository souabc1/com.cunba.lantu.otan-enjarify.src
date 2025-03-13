package androidx.appcompat.widget;

import android.view.View;
import android.view.View.OnFocusChangeListener;

class SearchView$3
  implements View.OnFocusChangeListener
{
  public SearchView$3(SearchView paramSearchView) {}
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    paramView = this.o00OoOoo;
    View.OnFocusChangeListener localOnFocusChangeListener = paramView.o00o00oo;
    if (localOnFocusChangeListener != null) {
      localOnFocusChangeListener.onFocusChange(paramView, paramBoolean);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.SearchView.3
 * JD-Core Version:    0.7.0.1
 */
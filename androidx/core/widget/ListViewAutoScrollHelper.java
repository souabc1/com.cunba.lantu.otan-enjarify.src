package androidx.core.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListViewAutoScrollHelper
  extends AutoScrollHelper
{
  public final ListView o00o00O0;
  
  public ListViewAutoScrollHelper(ListView paramListView)
  {
    super(paramListView);
    this.o00o00O0 = paramListView;
  }
  
  public boolean OooO00o(int paramInt)
  {
    return false;
  }
  
  public boolean OooO0O0(int paramInt)
  {
    ListView localListView = this.o00o00O0;
    int i = localListView.getCount();
    if (i == 0) {
      return false;
    }
    int j = localListView.getChildCount();
    int k = localListView.getFirstVisiblePosition();
    int m = k + j;
    int n = 1;
    View localView;
    if (paramInt > 0)
    {
      if (m >= i)
      {
        j -= n;
        localView = localListView.getChildAt(j);
        paramInt = localView.getBottom();
        int i1 = localListView.getHeight();
        if (paramInt <= i1) {
          return false;
        }
      }
    }
    else
    {
      if (paramInt >= 0) {
        break label114;
      }
      if (k <= 0)
      {
        localView = localListView.getChildAt(0);
        paramInt = localView.getTop();
        if (paramInt >= 0) {
          return false;
        }
      }
    }
    return n;
    label114:
    return false;
  }
  
  public void OooOO0(int paramInt1, int paramInt2)
  {
    ListViewCompat.OooO0O0(this.o00o00O0, paramInt2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.widget.ListViewAutoScrollHelper
 * JD-Core Version:    0.7.0.1
 */
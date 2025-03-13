package androidx.fragment.app;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

class ListFragment$2
  implements AdapterView.OnItemClickListener
{
  public ListFragment$2(ListFragment paramListFragment) {}
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    ListFragment localListFragment = this.o00OoOoo;
    Object localObject = paramAdapterView;
    localObject = (ListView)paramAdapterView;
    localListFragment.OooOoOO((ListView)localObject, paramView, paramInt, paramLong);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.ListFragment.2
 * JD-Core Version:    0.7.0.1
 */
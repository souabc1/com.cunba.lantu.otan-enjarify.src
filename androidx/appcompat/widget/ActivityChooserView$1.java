package androidx.appcompat.widget;

import android.database.DataSetObserver;
import android.widget.BaseAdapter;

class ActivityChooserView$1
  extends DataSetObserver
{
  public ActivityChooserView$1(ActivityChooserView paramActivityChooserView) {}
  
  public void onChanged()
  {
    super.onChanged();
    this.OooO00o.o00OoOoo.notifyDataSetChanged();
  }
  
  public void onInvalidated()
  {
    super.onInvalidated();
    this.OooO00o.o00OoOoo.notifyDataSetInvalidated();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ActivityChooserView.1
 * JD-Core Version:    0.7.0.1
 */
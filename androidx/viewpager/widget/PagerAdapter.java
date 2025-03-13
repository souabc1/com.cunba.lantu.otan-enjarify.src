package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.database.Observable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class PagerAdapter
{
  public final DataSetObservable OooO00o;
  public DataSetObserver OooO0O0;
  
  public PagerAdapter()
  {
    DataSetObservable localDataSetObservable = new android/database/DataSetObservable;
    localDataSetObservable.<init>();
    this.OooO00o = localDataSetObservable;
  }
  
  public void OooO()
  {
    try
    {
      DataSetObserver localDataSetObserver = this.OooO0O0;
      if (localDataSetObserver != null) {
        localDataSetObserver.onChanged();
      }
      this.OooO00o.notifyChanged();
      return;
    }
    finally {}
  }
  
  public void OooO00o(View paramView, int paramInt, Object paramObject)
  {
    paramView = new java/lang/UnsupportedOperationException;
    paramView.<init>("Required method destroyItem was not overridden");
    throw paramView;
  }
  
  public void OooO0O0(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    OooO00o(paramViewGroup, paramInt, paramObject);
  }
  
  public void OooO0OO(View paramView) {}
  
  public void OooO0Oo(ViewGroup paramViewGroup)
  {
    OooO0OO(paramViewGroup);
  }
  
  public Object OooO0o(View paramView, int paramInt)
  {
    paramView = new java/lang/UnsupportedOperationException;
    paramView.<init>("Required method instantiateItem was not overridden");
    throw paramView;
  }
  
  public int OooO0o0(Object paramObject)
  {
    return -1;
  }
  
  public Object OooO0oO(ViewGroup paramViewGroup, int paramInt)
  {
    return OooO0o(paramViewGroup, paramInt);
  }
  
  public abstract boolean OooO0oo(View paramView, Object paramObject);
  
  public void OooOO0(DataSetObserver paramDataSetObserver)
  {
    this.OooO00o.registerObserver(paramDataSetObserver);
  }
  
  public void OooOO0O(Parcelable paramParcelable, ClassLoader paramClassLoader) {}
  
  public Parcelable OooOO0o()
  {
    return null;
  }
  
  public void OooOOO(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    OooOOO0(paramViewGroup, paramInt, paramObject);
  }
  
  public void OooOOO0(View paramView, int paramInt, Object paramObject) {}
  
  public void OooOOOO(View paramView) {}
  
  public void OooOOOo(ViewGroup paramViewGroup)
  {
    OooOOOO(paramViewGroup);
  }
  
  public void OooOOo0(DataSetObserver paramDataSetObserver)
  {
    this.OooO00o.unregisterObserver(paramDataSetObserver);
  }
  
  public abstract int getCount();
  
  public CharSequence getPageTitle(int paramInt)
  {
    return null;
  }
  
  public float getPageWidth(int paramInt)
  {
    return 1.0F;
  }
  
  public void setViewPagerObserver(DataSetObserver paramDataSetObserver)
  {
    try
    {
      this.OooO0O0 = paramDataSetObserver;
      return;
    }
    finally {}
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.viewpager.widget.PagerAdapter
 * JD-Core Version:    0.7.0.1
 */
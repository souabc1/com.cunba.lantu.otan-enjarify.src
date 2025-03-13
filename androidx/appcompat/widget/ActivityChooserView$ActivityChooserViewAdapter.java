package androidx.appcompat.widget;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.database.Observable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.string;

class ActivityChooserView$ActivityChooserViewAdapter
  extends BaseAdapter
{
  public ActivityChooserModel o00OoOoo;
  public boolean o00Ooo0;
  public int o00Ooo00 = 4;
  public boolean o00Ooo0O;
  public boolean o00Ooo0o;
  
  public ActivityChooserView$ActivityChooserViewAdapter(ActivityChooserView paramActivityChooserView) {}
  
  public int OooO00o()
  {
    int i = this.o00Ooo00;
    this.o00Ooo00 = (-1 >>> 1);
    int j = 0;
    int k = View.MeasureSpec.makeMeasureSpec(0, 0);
    int m = View.MeasureSpec.makeMeasureSpec(0, 0);
    int n = getCount();
    int i1 = 0;
    View localView = null;
    while (j < n)
    {
      localView = getView(j, localView, null);
      localView.measure(k, m);
      int i2 = localView.getMeasuredWidth();
      i1 = Math.max(i1, i2);
      j += 1;
    }
    this.o00Ooo00 = i;
    return i1;
  }
  
  public void OooO0O0(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = this.o00Ooo0;
    if (bool == paramBoolean1)
    {
      bool = this.o00Ooo0O;
      if (bool == paramBoolean2) {}
    }
    else
    {
      this.o00Ooo0 = paramBoolean1;
      this.o00Ooo0O = paramBoolean2;
      notifyDataSetChanged();
    }
  }
  
  public int getActivityCount()
  {
    return this.o00OoOoo.getActivityCount();
  }
  
  public int getCount()
  {
    ActivityChooserModel localActivityChooserModel = this.o00OoOoo;
    int i = localActivityChooserModel.getActivityCount();
    boolean bool1 = this.o00Ooo0;
    if (!bool1)
    {
      ResolveInfo localResolveInfo = this.o00OoOoo.getDefaultActivity();
      if (localResolveInfo != null) {
        i += -1;
      }
    }
    int j = this.o00Ooo00;
    i = Math.min(i, j);
    boolean bool2 = this.o00Ooo0o;
    if (bool2) {
      i += 1;
    }
    return i;
  }
  
  public ActivityChooserModel getDataModel()
  {
    return this.o00OoOoo;
  }
  
  public ResolveInfo getDefaultActivity()
  {
    return this.o00OoOoo.getDefaultActivity();
  }
  
  public int getHistorySize()
  {
    return this.o00OoOoo.getHistorySize();
  }
  
  public Object getItem(int paramInt)
  {
    int i = getItemViewType(paramInt);
    if (i != 0)
    {
      paramInt = 1;
      if (i == paramInt) {
        return null;
      }
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>();
      throw localIllegalArgumentException;
    }
    boolean bool = this.o00Ooo0;
    if (!bool)
    {
      ResolveInfo localResolveInfo = this.o00OoOoo.getDefaultActivity();
      if (localResolveInfo != null) {
        paramInt += 1;
      }
    }
    return this.o00OoOoo.getActivity(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public int getItemViewType(int paramInt)
  {
    boolean bool = this.o00Ooo0o;
    if (bool)
    {
      int i = getCount();
      int j = 1;
      i -= j;
      if (paramInt == i) {
        return j;
      }
    }
    return 0;
  }
  
  public boolean getShowDefaultActivity()
  {
    return this.o00Ooo0;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = getItemViewType(paramInt);
    int j = 1;
    if (i != 0)
    {
      if (i == j)
      {
        if (paramView != null)
        {
          paramInt = paramView.getId();
          if (paramInt == j) {}
        }
        else
        {
          localObject1 = LayoutInflater.from(this.o00OooO0.getContext());
          int k = R.layout.abc_activity_chooser_view_list_item;
          paramView = ((LayoutInflater)localObject1).inflate(k, paramViewGroup, false);
          paramView.setId(j);
          paramInt = R.id.title;
          localObject1 = (TextView)paramView.findViewById(paramInt);
          paramViewGroup = this.o00OooO0.getContext();
          i = R.string.abc_activity_chooser_view_see_all;
          paramViewGroup = paramViewGroup.getString(i);
          ((TextView)localObject1).setText(paramViewGroup);
        }
        return paramView;
      }
      Object localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    if (paramView != null)
    {
      i = paramView.getId();
      int m = R.id.list_item;
      if (i == m) {}
    }
    else
    {
      paramView = LayoutInflater.from(this.o00OooO0.getContext());
      i = R.layout.abc_activity_chooser_view_list_item;
      paramView = paramView.inflate(i, paramViewGroup, false);
    }
    paramViewGroup = this.o00OooO0.getContext().getPackageManager();
    i = R.id.icon;
    Object localObject2 = (ImageView)paramView.findViewById(i);
    ResolveInfo localResolveInfo = (ResolveInfo)getItem(paramInt);
    Drawable localDrawable = localResolveInfo.loadIcon(paramViewGroup);
    ((ImageView)localObject2).setImageDrawable(localDrawable);
    i = R.id.title;
    localObject2 = (TextView)paramView.findViewById(i);
    paramViewGroup = localResolveInfo.loadLabel(paramViewGroup);
    ((TextView)localObject2).setText(paramViewGroup);
    boolean bool = this.o00Ooo0;
    if ((bool) && (paramInt == 0))
    {
      paramInt = this.o00Ooo0O;
      if (paramInt != 0)
      {
        paramView.setActivated(j);
        return paramView;
      }
    }
    paramView.setActivated(false);
    return paramView;
  }
  
  public int getViewTypeCount()
  {
    return 3;
  }
  
  public void setDataModel(ActivityChooserModel paramActivityChooserModel)
  {
    Object localObject1 = this.o00OooO0.o00OoOoo.getDataModel();
    if (localObject1 != null)
    {
      Object localObject2 = this.o00OooO0;
      boolean bool1 = ((View)localObject2).isShown();
      if (bool1)
      {
        localObject2 = this.o00OooO0.o00OoooO;
        ((Observable)localObject1).unregisterObserver(localObject2);
      }
    }
    this.o00OoOoo = paramActivityChooserModel;
    if (paramActivityChooserModel != null)
    {
      localObject1 = this.o00OooO0;
      boolean bool2 = ((View)localObject1).isShown();
      if (bool2)
      {
        localObject1 = this.o00OooO0.o00OoooO;
        paramActivityChooserModel.registerObserver(localObject1);
      }
    }
    notifyDataSetChanged();
  }
  
  public void setMaxActivityCount(int paramInt)
  {
    int i = this.o00Ooo00;
    if (i != paramInt)
    {
      this.o00Ooo00 = paramInt;
      notifyDataSetChanged();
    }
  }
  
  public void setShowFooterView(boolean paramBoolean)
  {
    boolean bool = this.o00Ooo0o;
    if (bool != paramBoolean)
    {
      this.o00Ooo0o = paramBoolean;
      notifyDataSetChanged();
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ActivityChooserView.ActivityChooserViewAdapter
 * JD-Core Version:    0.7.0.1
 */
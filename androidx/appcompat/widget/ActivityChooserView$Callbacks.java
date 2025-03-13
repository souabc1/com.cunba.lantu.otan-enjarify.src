package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.PopupWindow.OnDismissListener;
import androidx.core.view.ActionProvider;

class ActivityChooserView$Callbacks
  implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener
{
  public ActivityChooserView$Callbacks(ActivityChooserView paramActivityChooserView) {}
  
  public final void OooO00o()
  {
    PopupWindow.OnDismissListener localOnDismissListener = this.o00OoOoo.o00o000;
    if (localOnDismissListener != null) {
      localOnDismissListener.onDismiss();
    }
  }
  
  public void onClick(View paramView)
  {
    Object localObject = this.o00OoOoo;
    FrameLayout localFrameLayout = ((ActivityChooserView)localObject).o00OooO;
    int i;
    if (paramView == localFrameLayout)
    {
      ((ActivityChooserView)localObject).OooO00o();
      paramView = this.o00OoOoo.o00OoOoo.getDefaultActivity();
      i = this.o00OoOoo.o00OoOoo.getDataModel().OooO0o0(paramView);
      localObject = this.o00OoOoo.o00OoOoo.getDataModel();
      paramView = ((ActivityChooserModel)localObject).OooO0O0(i);
      if (paramView != null)
      {
        int j = 524288;
        paramView.addFlags(j);
        localObject = this.o00OoOoo.getContext();
        ((Context)localObject).startActivity(paramView);
      }
    }
    else
    {
      localFrameLayout = ((ActivityChooserView)localObject).o00Ooo0o;
      if (paramView != localFrameLayout) {
        break label126;
      }
      paramView = null;
      ((ActivityChooserView)localObject).o00o000O = false;
      i = ((ActivityChooserView)localObject).o00o000o;
      ((ActivityChooserView)localObject).OooO0OO(i);
    }
    return;
    label126:
    paramView = new java/lang/IllegalArgumentException;
    paramView.<init>();
    throw paramView;
  }
  
  public void onDismiss()
  {
    OooO00o();
    ActionProvider localActionProvider = this.o00OoOoo.o0O00o0;
    if (localActionProvider != null) {
      localActionProvider.OooO0oo(false);
    }
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (ActivityChooserView.ActivityChooserViewAdapter)paramAdapterView.getAdapter();
    int i = paramAdapterView.getItemViewType(paramInt);
    if (i != 0)
    {
      int j = 1;
      if (i == j)
      {
        paramAdapterView = this.o00OoOoo;
        j = -1 >>> 1;
        paramAdapterView.OooO0OO(j);
      }
      else
      {
        paramAdapterView = new java/lang/IllegalArgumentException;
        paramAdapterView.<init>();
        throw paramAdapterView;
      }
    }
    else
    {
      this.o00OoOoo.OooO00o();
      paramAdapterView = this.o00OoOoo;
      boolean bool2 = paramAdapterView.o00o000O;
      if (bool2)
      {
        if (paramInt > 0)
        {
          paramAdapterView = paramAdapterView.o00OoOoo.getDataModel();
          paramAdapterView.setDefaultActivity(paramInt);
        }
      }
      else
      {
        paramAdapterView = paramAdapterView.o00OoOoo;
        boolean bool1 = paramAdapterView.getShowDefaultActivity();
        if (!bool1) {
          paramInt += 1;
        }
        paramAdapterView = this.o00OoOoo.o00OoOoo.getDataModel().OooO0O0(paramInt);
        if (paramAdapterView != null)
        {
          int k = 524288;
          paramAdapterView.addFlags(k);
          paramView = this.o00OoOoo.getContext();
          paramView.startActivity(paramAdapterView);
        }
      }
    }
  }
  
  public boolean onLongClick(View paramView)
  {
    ActivityChooserView localActivityChooserView = this.o00OoOoo;
    FrameLayout localFrameLayout = localActivityChooserView.o00OooO;
    if (paramView == localFrameLayout)
    {
      paramView = localActivityChooserView.o00OoOoo;
      int i = paramView.getCount();
      boolean bool = true;
      if (i > 0)
      {
        paramView = this.o00OoOoo;
        paramView.o00o000O = bool;
        int j = paramView.o00o000o;
        paramView.OooO0OO(j);
      }
      return bool;
    }
    paramView = new java/lang/IllegalArgumentException;
    paramView.<init>();
    throw paramView;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ActivityChooserView.Callbacks
 * JD-Core Version:    0.7.0.1
 */
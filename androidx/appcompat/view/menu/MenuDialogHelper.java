package androidx.appcompat.view.menu;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Adapter;
import android.widget.ListAdapter;
import androidx.appcompat.R.layout;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AppCompatDialog;

class MenuDialogHelper
  implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, MenuPresenter.Callback
{
  public MenuBuilder o00OoOoo;
  public ListMenuPresenter o00Ooo0;
  public AlertDialog o00Ooo00;
  public MenuPresenter.Callback o00Ooo0O;
  
  public MenuDialogHelper(MenuBuilder paramMenuBuilder)
  {
    this.o00OoOoo = paramMenuBuilder;
  }
  
  public boolean OooO00o(MenuBuilder paramMenuBuilder)
  {
    MenuPresenter.Callback localCallback = this.o00Ooo0O;
    if (localCallback != null) {
      return localCallback.OooO00o(paramMenuBuilder);
    }
    return false;
  }
  
  public void OooO0O0()
  {
    AlertDialog localAlertDialog = this.o00Ooo00;
    if (localAlertDialog != null) {
      localAlertDialog.dismiss();
    }
  }
  
  public void OooO0OO(IBinder paramIBinder)
  {
    Object localObject1 = this.o00OoOoo;
    AlertDialog.Builder localBuilder = new androidx/appcompat/app/AlertDialog$Builder;
    Object localObject2 = ((MenuBuilder)localObject1).getContext();
    localBuilder.<init>((Context)localObject2);
    localObject2 = new androidx/appcompat/view/menu/ListMenuPresenter;
    Object localObject3 = localBuilder.getContext();
    int i = R.layout.abc_list_menu_item_layout;
    ((ListMenuPresenter)localObject2).<init>((Context)localObject3, i);
    this.o00Ooo0 = ((ListMenuPresenter)localObject2);
    ((ListMenuPresenter)localObject2).setCallback(this);
    localObject2 = this.o00OoOoo;
    localObject3 = this.o00Ooo0;
    ((MenuBuilder)localObject2).addMenuPresenter((MenuPresenter)localObject3);
    localObject2 = this.o00Ooo0.getAdapter();
    localBuilder.setAdapter((ListAdapter)localObject2, this);
    localObject2 = ((MenuBuilder)localObject1).getHeaderView();
    if (localObject2 != null)
    {
      localBuilder.setCustomTitle((View)localObject2);
    }
    else
    {
      localObject2 = ((MenuBuilder)localObject1).getHeaderIcon();
      localObject2 = localBuilder.setIcon((Drawable)localObject2);
      localObject1 = ((MenuBuilder)localObject1).getHeaderTitle();
      ((AlertDialog.Builder)localObject2).setTitle((CharSequence)localObject1);
    }
    localBuilder.setOnKeyListener(this);
    localObject1 = localBuilder.create();
    this.o00Ooo00 = ((AlertDialog)localObject1);
    ((Dialog)localObject1).setOnDismissListener(this);
    localObject1 = this.o00Ooo00.getWindow().getAttributes();
    int j = 1003;
    ((WindowManager.LayoutParams)localObject1).type = j;
    if (paramIBinder != null) {
      ((WindowManager.LayoutParams)localObject1).token = paramIBinder;
    }
    int k = ((WindowManager.LayoutParams)localObject1).flags | 0x20000;
    ((WindowManager.LayoutParams)localObject1).flags = k;
    this.o00Ooo00.show();
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = this.o00OoOoo;
    MenuItemImpl localMenuItemImpl = (MenuItemImpl)this.o00Ooo0.getAdapter().getItem(paramInt);
    paramDialogInterface.performItemAction(localMenuItemImpl, 0);
  }
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      localObject = this.o00OoOoo;
      if (paramMenuBuilder != localObject) {}
    }
    else
    {
      OooO0O0();
    }
    Object localObject = this.o00Ooo0O;
    if (localObject != null) {
      ((MenuPresenter.Callback)localObject).onCloseMenu(paramMenuBuilder, paramBoolean);
    }
  }
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    paramDialogInterface = this.o00Ooo0;
    MenuBuilder localMenuBuilder = this.o00OoOoo;
    paramDialogInterface.onCloseMenu(localMenuBuilder, true);
  }
  
  public boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 82;
    if (paramInt != i)
    {
      i = 4;
      if (paramInt != i) {}
    }
    else
    {
      i = paramKeyEvent.getAction();
      int j = 1;
      if (i == 0)
      {
        i = paramKeyEvent.getRepeatCount();
        if (i == 0)
        {
          paramDialogInterface = this.o00Ooo00.getWindow();
          if (paramDialogInterface == null) {
            break label176;
          }
          paramDialogInterface = paramDialogInterface.getDecorView();
          if (paramDialogInterface == null) {
            break label176;
          }
          paramDialogInterface = paramDialogInterface.getKeyDispatcherState();
          if (paramDialogInterface == null) {
            break label176;
          }
          paramDialogInterface.startTracking(paramKeyEvent, this);
          return j;
        }
      }
      i = paramKeyEvent.getAction();
      if (i == j)
      {
        boolean bool = paramKeyEvent.isCanceled();
        if (!bool)
        {
          Object localObject = this.o00Ooo00.getWindow();
          if (localObject != null)
          {
            localObject = ((Window)localObject).getDecorView();
            if (localObject != null)
            {
              localObject = ((View)localObject).getKeyDispatcherState();
              if (localObject != null)
              {
                bool = ((KeyEvent.DispatcherState)localObject).isTracking(paramKeyEvent);
                if (bool)
                {
                  this.o00OoOoo.close(j);
                  paramDialogInterface.dismiss();
                  return j;
                }
              }
            }
          }
        }
      }
    }
    label176:
    return this.o00OoOoo.performShortcut(paramInt, paramKeyEvent, 0);
  }
  
  public void setPresenterCallback(MenuPresenter.Callback paramCallback)
  {
    this.o00Ooo0O = paramCallback;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.menu.MenuDialogHelper
 * JD-Core Version:    0.7.0.1
 */
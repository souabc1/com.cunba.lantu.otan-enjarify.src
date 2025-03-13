package androidx.appcompat.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AppCompatDialog;

class AppCompatSpinner$DialogPopup
  implements AppCompatSpinner.SpinnerPopup, DialogInterface.OnClickListener
{
  public AlertDialog o00OoOoo;
  public CharSequence o00Ooo0;
  public ListAdapter o00Ooo00;
  
  public AppCompatSpinner$DialogPopup(AppCompatSpinner paramAppCompatSpinner) {}
  
  public void OooO0OO(int paramInt1, int paramInt2)
  {
    Object localObject1 = this.o00Ooo00;
    if (localObject1 == null) {
      return;
    }
    localObject1 = new androidx/appcompat/app/AlertDialog$Builder;
    Object localObject2 = this.o00Ooo0O.getPopupContext();
    ((AlertDialog.Builder)localObject1).<init>((Context)localObject2);
    localObject2 = this.o00Ooo0;
    if (localObject2 != null) {
      ((AlertDialog.Builder)localObject1).setTitle((CharSequence)localObject2);
    }
    localObject2 = this.o00Ooo00;
    int i = this.o00Ooo0O.getSelectedItemPosition();
    localObject1 = ((AlertDialog.Builder)localObject1).setSingleChoiceItems((ListAdapter)localObject2, i, this).create();
    this.o00OoOoo = ((AlertDialog)localObject1);
    localObject1 = ((AlertDialog)localObject1).getListView();
    AppCompatSpinner.Api17Impl.OooO0Oo((View)localObject1, paramInt1);
    AppCompatSpinner.Api17Impl.OooO0OO((View)localObject1, paramInt2);
    this.o00OoOoo.show();
  }
  
  public void dismiss()
  {
    AlertDialog localAlertDialog = this.o00OoOoo;
    if (localAlertDialog != null)
    {
      localAlertDialog.dismiss();
      localAlertDialog = null;
      this.o00OoOoo = null;
    }
  }
  
  public Drawable getBackground()
  {
    return null;
  }
  
  public CharSequence getHintText()
  {
    return this.o00Ooo0;
  }
  
  public int getHorizontalOffset()
  {
    return 0;
  }
  
  public int getHorizontalOriginalOffset()
  {
    return 0;
  }
  
  public int getVerticalOffset()
  {
    return 0;
  }
  
  public boolean isShowing()
  {
    AlertDialog localAlertDialog = this.o00OoOoo;
    boolean bool;
    if (localAlertDialog != null)
    {
      bool = localAlertDialog.isShowing();
    }
    else
    {
      bool = false;
      localAlertDialog = null;
    }
    return bool;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.o00Ooo0O.setSelection(paramInt);
    paramDialogInterface = this.o00Ooo0O.getOnItemClickListener();
    if (paramDialogInterface != null)
    {
      paramDialogInterface = this.o00Ooo0O;
      ListAdapter localListAdapter = this.o00Ooo00;
      long l = localListAdapter.getItemId(paramInt);
      paramDialogInterface.performItemClick(null, paramInt, l);
    }
    dismiss();
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    this.o00Ooo00 = paramListAdapter;
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {}
  
  public void setHorizontalOffset(int paramInt) {}
  
  public void setHorizontalOriginalOffset(int paramInt) {}
  
  public void setPromptText(CharSequence paramCharSequence)
  {
    this.o00Ooo0 = paramCharSequence;
  }
  
  public void setVerticalOffset(int paramInt) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatSpinner.DialogPopup
 * JD-Core Version:    0.7.0.1
 */
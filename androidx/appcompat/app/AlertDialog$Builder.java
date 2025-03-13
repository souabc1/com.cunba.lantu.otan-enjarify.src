package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;

public class AlertDialog$Builder
{
  private final AlertController.AlertParams P;
  private final int mTheme;
  
  public AlertDialog$Builder(Context paramContext)
  {
    this(paramContext, i);
  }
  
  public AlertDialog$Builder(Context paramContext, int paramInt)
  {
    AlertController.AlertParams localAlertParams = new androidx/appcompat/app/AlertController$AlertParams;
    ContextThemeWrapper localContextThemeWrapper = new android/view/ContextThemeWrapper;
    int i = AlertDialog.OooO0Oo(paramContext, paramInt);
    localContextThemeWrapper.<init>(paramContext, i);
    localAlertParams.<init>(localContextThemeWrapper);
    this.P = localAlertParams;
    this.mTheme = paramInt;
  }
  
  public AlertDialog create()
  {
    AlertDialog localAlertDialog = new androidx/appcompat/app/AlertDialog;
    Object localObject = this.P.OooO00o;
    int i = this.mTheme;
    localAlertDialog.<init>((Context)localObject, i);
    localObject = this.P;
    AlertController localAlertController = localAlertDialog.o00OoOoo;
    ((AlertController.AlertParams)localObject).OooO00o(localAlertController);
    boolean bool = this.P.OooOOo;
    localAlertDialog.setCancelable(bool);
    localObject = this.P;
    bool = ((AlertController.AlertParams)localObject).OooOOo;
    if (bool)
    {
      bool = true;
      localAlertDialog.setCanceledOnTouchOutside(bool);
    }
    localObject = this.P.OooOOoo;
    localAlertDialog.setOnCancelListener((DialogInterface.OnCancelListener)localObject);
    localObject = this.P.OooOo00;
    localAlertDialog.setOnDismissListener((DialogInterface.OnDismissListener)localObject);
    localObject = this.P.OooOo0;
    if (localObject != null) {
      localAlertDialog.setOnKeyListener((DialogInterface.OnKeyListener)localObject);
    }
    return localAlertDialog;
  }
  
  public Context getContext()
  {
    return this.P.OooO00o;
  }
  
  public Builder setAdapter(ListAdapter paramListAdapter, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertController.AlertParams localAlertParams = this.P;
    localAlertParams.OooOo0o = paramListAdapter;
    localAlertParams.OooOo = paramOnClickListener;
    return this;
  }
  
  public Builder setCancelable(boolean paramBoolean)
  {
    this.P.OooOOo = paramBoolean;
    return this;
  }
  
  public Builder setCursor(Cursor paramCursor, DialogInterface.OnClickListener paramOnClickListener, String paramString)
  {
    AlertController.AlertParams localAlertParams = this.P;
    localAlertParams.Oooo0OO = paramCursor;
    localAlertParams.Oooo0o0 = paramString;
    localAlertParams.OooOo = paramOnClickListener;
    return this;
  }
  
  public Builder setCustomTitle(View paramView)
  {
    this.P.OooO0oO = paramView;
    return this;
  }
  
  public Builder setIcon(int paramInt)
  {
    this.P.OooO0OO = paramInt;
    return this;
  }
  
  public Builder setIcon(Drawable paramDrawable)
  {
    this.P.OooO0Oo = paramDrawable;
    return this;
  }
  
  public Builder setIconAttribute(int paramInt)
  {
    TypedValue localTypedValue = new android/util/TypedValue;
    localTypedValue.<init>();
    this.P.OooO00o.getTheme().resolveAttribute(paramInt, localTypedValue, true);
    AlertController.AlertParams localAlertParams = this.P;
    int i = localTypedValue.resourceId;
    localAlertParams.OooO0OO = i;
    return this;
  }
  
  public Builder setInverseBackgroundForced(boolean paramBoolean)
  {
    this.P.Oooo0oO = paramBoolean;
    return this;
  }
  
  public Builder setItems(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertController.AlertParams localAlertParams = this.P;
    CharSequence[] arrayOfCharSequence = localAlertParams.OooO00o.getResources().getTextArray(paramInt);
    localAlertParams.OooOo0O = arrayOfCharSequence;
    this.P.OooOo = paramOnClickListener;
    return this;
  }
  
  public Builder setItems(CharSequence[] paramArrayOfCharSequence, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertController.AlertParams localAlertParams = this.P;
    localAlertParams.OooOo0O = paramArrayOfCharSequence;
    localAlertParams.OooOo = paramOnClickListener;
    return this;
  }
  
  public Builder setMessage(int paramInt)
  {
    AlertController.AlertParams localAlertParams = this.P;
    CharSequence localCharSequence = localAlertParams.OooO00o.getText(paramInt);
    localAlertParams.OooO0oo = localCharSequence;
    return this;
  }
  
  public Builder setMessage(CharSequence paramCharSequence)
  {
    this.P.OooO0oo = paramCharSequence;
    return this;
  }
  
  public Builder setMultiChoiceItems(int paramInt, boolean[] paramArrayOfBoolean, DialogInterface.OnMultiChoiceClickListener paramOnMultiChoiceClickListener)
  {
    AlertController.AlertParams localAlertParams = this.P;
    Object localObject = localAlertParams.OooO00o.getResources().getTextArray(paramInt);
    localAlertParams.OooOo0O = ((CharSequence[])localObject);
    localObject = this.P;
    ((AlertController.AlertParams)localObject).Oooo0O0 = paramOnMultiChoiceClickListener;
    ((AlertController.AlertParams)localObject).Oooo000 = paramArrayOfBoolean;
    ((AlertController.AlertParams)localObject).Oooo00O = true;
    return this;
  }
  
  public Builder setMultiChoiceItems(Cursor paramCursor, String paramString1, String paramString2, DialogInterface.OnMultiChoiceClickListener paramOnMultiChoiceClickListener)
  {
    AlertController.AlertParams localAlertParams = this.P;
    localAlertParams.Oooo0OO = paramCursor;
    localAlertParams.Oooo0O0 = paramOnMultiChoiceClickListener;
    localAlertParams.Oooo0o = paramString1;
    localAlertParams.Oooo0o0 = paramString2;
    localAlertParams.Oooo00O = true;
    return this;
  }
  
  public Builder setMultiChoiceItems(CharSequence[] paramArrayOfCharSequence, boolean[] paramArrayOfBoolean, DialogInterface.OnMultiChoiceClickListener paramOnMultiChoiceClickListener)
  {
    AlertController.AlertParams localAlertParams = this.P;
    localAlertParams.OooOo0O = paramArrayOfCharSequence;
    localAlertParams.Oooo0O0 = paramOnMultiChoiceClickListener;
    localAlertParams.Oooo000 = paramArrayOfBoolean;
    localAlertParams.Oooo00O = true;
    return this;
  }
  
  public Builder setNegativeButton(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertController.AlertParams localAlertParams = this.P;
    CharSequence localCharSequence = localAlertParams.OooO00o.getText(paramInt);
    localAlertParams.OooOO0o = localCharSequence;
    this.P.OooOOO = paramOnClickListener;
    return this;
  }
  
  public Builder setNegativeButton(CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertController.AlertParams localAlertParams = this.P;
    localAlertParams.OooOO0o = paramCharSequence;
    localAlertParams.OooOOO = paramOnClickListener;
    return this;
  }
  
  public Builder setNegativeButtonIcon(Drawable paramDrawable)
  {
    this.P.OooOOO0 = paramDrawable;
    return this;
  }
  
  public Builder setNeutralButton(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertController.AlertParams localAlertParams = this.P;
    CharSequence localCharSequence = localAlertParams.OooO00o.getText(paramInt);
    localAlertParams.OooOOOO = localCharSequence;
    this.P.OooOOo0 = paramOnClickListener;
    return this;
  }
  
  public Builder setNeutralButton(CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertController.AlertParams localAlertParams = this.P;
    localAlertParams.OooOOOO = paramCharSequence;
    localAlertParams.OooOOo0 = paramOnClickListener;
    return this;
  }
  
  public Builder setNeutralButtonIcon(Drawable paramDrawable)
  {
    this.P.OooOOOo = paramDrawable;
    return this;
  }
  
  public Builder setOnCancelListener(DialogInterface.OnCancelListener paramOnCancelListener)
  {
    this.P.OooOOoo = paramOnCancelListener;
    return this;
  }
  
  public Builder setOnDismissListener(DialogInterface.OnDismissListener paramOnDismissListener)
  {
    this.P.OooOo00 = paramOnDismissListener;
    return this;
  }
  
  public Builder setOnItemSelectedListener(AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    this.P.Oooo0oo = paramOnItemSelectedListener;
    return this;
  }
  
  public Builder setOnKeyListener(DialogInterface.OnKeyListener paramOnKeyListener)
  {
    this.P.OooOo0 = paramOnKeyListener;
    return this;
  }
  
  public Builder setPositiveButton(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertController.AlertParams localAlertParams = this.P;
    CharSequence localCharSequence = localAlertParams.OooO00o.getText(paramInt);
    localAlertParams.OooO = localCharSequence;
    this.P.OooOO0O = paramOnClickListener;
    return this;
  }
  
  public Builder setPositiveButton(CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertController.AlertParams localAlertParams = this.P;
    localAlertParams.OooO = paramCharSequence;
    localAlertParams.OooOO0O = paramOnClickListener;
    return this;
  }
  
  public Builder setPositiveButtonIcon(Drawable paramDrawable)
  {
    this.P.OooOO0 = paramDrawable;
    return this;
  }
  
  public Builder setRecycleOnMeasureEnabled(boolean paramBoolean)
  {
    this.P.OoooO00 = paramBoolean;
    return this;
  }
  
  public Builder setSingleChoiceItems(int paramInt1, int paramInt2, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertController.AlertParams localAlertParams = this.P;
    Object localObject = localAlertParams.OooO00o.getResources().getTextArray(paramInt1);
    localAlertParams.OooOo0O = ((CharSequence[])localObject);
    localObject = this.P;
    ((AlertController.AlertParams)localObject).OooOo = paramOnClickListener;
    ((AlertController.AlertParams)localObject).Oooo0 = paramInt2;
    ((AlertController.AlertParams)localObject).Oooo00o = true;
    return this;
  }
  
  public Builder setSingleChoiceItems(Cursor paramCursor, int paramInt, String paramString, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertController.AlertParams localAlertParams = this.P;
    localAlertParams.Oooo0OO = paramCursor;
    localAlertParams.OooOo = paramOnClickListener;
    localAlertParams.Oooo0 = paramInt;
    localAlertParams.Oooo0o0 = paramString;
    localAlertParams.Oooo00o = true;
    return this;
  }
  
  public Builder setSingleChoiceItems(ListAdapter paramListAdapter, int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertController.AlertParams localAlertParams = this.P;
    localAlertParams.OooOo0o = paramListAdapter;
    localAlertParams.OooOo = paramOnClickListener;
    localAlertParams.Oooo0 = paramInt;
    localAlertParams.Oooo00o = true;
    return this;
  }
  
  public Builder setSingleChoiceItems(CharSequence[] paramArrayOfCharSequence, int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertController.AlertParams localAlertParams = this.P;
    localAlertParams.OooOo0O = paramArrayOfCharSequence;
    localAlertParams.OooOo = paramOnClickListener;
    localAlertParams.Oooo0 = paramInt;
    localAlertParams.Oooo00o = true;
    return this;
  }
  
  public Builder setTitle(int paramInt)
  {
    AlertController.AlertParams localAlertParams = this.P;
    CharSequence localCharSequence = localAlertParams.OooO00o.getText(paramInt);
    localAlertParams.OooO0o = localCharSequence;
    return this;
  }
  
  public Builder setTitle(CharSequence paramCharSequence)
  {
    this.P.OooO0o = paramCharSequence;
    return this;
  }
  
  public Builder setView(int paramInt)
  {
    AlertController.AlertParams localAlertParams = this.P;
    localAlertParams.OooOoO = null;
    localAlertParams.OooOoO0 = paramInt;
    localAlertParams.OooOooo = false;
    return this;
  }
  
  public Builder setView(View paramView)
  {
    AlertController.AlertParams localAlertParams = this.P;
    localAlertParams.OooOoO = paramView;
    localAlertParams.OooOoO0 = 0;
    localAlertParams.OooOooo = false;
    return this;
  }
  
  public Builder setView(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AlertController.AlertParams localAlertParams = this.P;
    localAlertParams.OooOoO = paramView;
    localAlertParams.OooOoO0 = 0;
    localAlertParams.OooOooo = true;
    localAlertParams.OooOoOO = paramInt1;
    localAlertParams.OooOoo0 = paramInt2;
    localAlertParams.OooOoo = paramInt3;
    localAlertParams.OooOooO = paramInt4;
    return this;
  }
  
  public AlertDialog show()
  {
    AlertDialog localAlertDialog = create();
    localAlertDialog.show();
    return localAlertDialog;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AlertDialog.Builder
 * JD-Core Version:    0.7.0.1
 */
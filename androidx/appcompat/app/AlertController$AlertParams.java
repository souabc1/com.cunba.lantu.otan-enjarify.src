package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class AlertController$AlertParams
{
  public CharSequence OooO;
  public final Context OooO00o;
  public final LayoutInflater OooO0O0;
  public int OooO0OO = 0;
  public Drawable OooO0Oo;
  public CharSequence OooO0o;
  public int OooO0o0 = 0;
  public View OooO0oO;
  public CharSequence OooO0oo;
  public Drawable OooOO0;
  public DialogInterface.OnClickListener OooOO0O;
  public CharSequence OooOO0o;
  public DialogInterface.OnClickListener OooOOO;
  public Drawable OooOOO0;
  public CharSequence OooOOOO;
  public Drawable OooOOOo;
  public boolean OooOOo;
  public DialogInterface.OnClickListener OooOOo0;
  public DialogInterface.OnCancelListener OooOOoo;
  public DialogInterface.OnClickListener OooOo;
  public DialogInterface.OnKeyListener OooOo0;
  public DialogInterface.OnDismissListener OooOo00;
  public CharSequence[] OooOo0O;
  public ListAdapter OooOo0o;
  public View OooOoO;
  public int OooOoO0;
  public int OooOoOO;
  public int OooOoo;
  public int OooOoo0;
  public int OooOooO;
  public boolean OooOooo = false;
  public AlertController.AlertParams.OnPrepareListViewListener Oooo;
  public int Oooo0 = -1;
  public boolean[] Oooo000;
  public boolean Oooo00O;
  public boolean Oooo00o;
  public DialogInterface.OnMultiChoiceClickListener Oooo0O0;
  public Cursor Oooo0OO;
  public String Oooo0o;
  public String Oooo0o0;
  public boolean Oooo0oO;
  public AdapterView.OnItemSelectedListener Oooo0oo;
  public boolean OoooO00;
  
  public AlertController$AlertParams(Context paramContext)
  {
    boolean bool = true;
    this.OoooO00 = bool;
    this.OooO00o = paramContext;
    this.OooOOo = bool;
    paramContext = (LayoutInflater)paramContext.getSystemService("layout_inflater");
    this.OooO0O0 = paramContext;
  }
  
  public void OooO00o(AlertController paramAlertController)
  {
    Object localObject1 = this.OooO0oO;
    if (localObject1 != null)
    {
      paramAlertController.setCustomTitle((View)localObject1);
    }
    else
    {
      localObject1 = this.OooO0o;
      if (localObject1 != null) {
        paramAlertController.setTitle((CharSequence)localObject1);
      }
      localObject1 = this.OooO0Oo;
      if (localObject1 != null) {
        paramAlertController.setIcon((Drawable)localObject1);
      }
      int i = this.OooO0OO;
      if (i != 0) {
        paramAlertController.setIcon(i);
      }
      i = this.OooO0o0;
      if (i != 0)
      {
        i = paramAlertController.getIconAttributeResId(i);
        paramAlertController.setIcon(i);
      }
    }
    localObject1 = this.OooO0oo;
    if (localObject1 != null) {
      paramAlertController.setMessage((CharSequence)localObject1);
    }
    Object localObject2 = this.OooO;
    DialogInterface.OnClickListener localOnClickListener1;
    int m;
    Drawable localDrawable1;
    if (localObject2 == null)
    {
      localObject1 = this.OooOO0;
      if (localObject1 == null) {}
    }
    else
    {
      int k = -1;
      localOnClickListener1 = this.OooOO0O;
      m = 0;
      localDrawable1 = null;
      Drawable localDrawable2 = this.OooOO0;
      paramAlertController.OooO(k, (CharSequence)localObject2, localOnClickListener1, null, localDrawable2);
    }
    CharSequence localCharSequence = this.OooOO0o;
    if (localCharSequence == null)
    {
      localObject1 = this.OooOOO0;
      if (localObject1 == null) {}
    }
    else
    {
      int n = -2;
      DialogInterface.OnClickListener localOnClickListener2 = this.OooOOO;
      Drawable localDrawable3 = this.OooOOO0;
      paramAlertController.OooO(n, localCharSequence, localOnClickListener2, null, localDrawable3);
    }
    Object localObject3 = this.OooOOOO;
    int i2;
    if (localObject3 == null)
    {
      localObject1 = this.OooOOOo;
      if (localObject1 == null) {}
    }
    else
    {
      int i1 = -3;
      localObject2 = this.OooOOo0;
      i2 = 0;
      localOnClickListener1 = null;
      localDrawable1 = this.OooOOOo;
      localObject1 = paramAlertController;
      paramAlertController.OooO(i1, (CharSequence)localObject3, (DialogInterface.OnClickListener)localObject2, null, localDrawable1);
    }
    localObject1 = this.OooOo0O;
    if (localObject1 == null)
    {
      localObject1 = this.Oooo0OO;
      if (localObject1 == null)
      {
        localObject1 = this.OooOo0o;
        if (localObject1 == null) {
          break label285;
        }
      }
    }
    OooO0O0(paramAlertController);
    label285:
    localObject3 = this.OooOoO;
    if (localObject3 != null)
    {
      boolean bool = this.OooOooo;
      if (bool)
      {
        int i3 = this.OooOoOO;
        i2 = this.OooOoo0;
        m = this.OooOoo;
        int i4 = this.OooOooO;
        paramAlertController.OooOO0O((View)localObject3, i3, i2, m, i4);
      }
      else
      {
        paramAlertController.setView((View)localObject3);
      }
    }
    else
    {
      int j = this.OooOoO0;
      if (j != 0) {
        paramAlertController.setView(j);
      }
    }
  }
  
  public final void OooO0O0(AlertController paramAlertController)
  {
    Object localObject1 = this.OooO0O0;
    int i = paramAlertController.Oooo0o0;
    int n = 0;
    localObject1 = (AlertController.RecycleListView)((LayoutInflater)localObject1).inflate(i, null);
    boolean bool1 = this.Oooo00O;
    Object localObject3;
    Object localObject4;
    int i1;
    Object localObject5;
    Object localObject6;
    Cursor localCursor2;
    if (bool1)
    {
      localObject2 = this.Oooo0OO;
      int i2;
      if (localObject2 == null)
      {
        localObject3 = new androidx/appcompat/app/AlertController$AlertParams$1;
        localObject4 = this.OooO00o;
        i1 = paramAlertController.Oooo0o;
        i2 = 16908308;
        localObject5 = this.OooOo0O;
        localObject2 = localObject3;
        localObject6 = localObject1;
        ((AlertController.AlertParams.1)localObject3).<init>(this, (Context)localObject4, i1, i2, (CharSequence[])localObject5, (AlertController.RecycleListView)localObject1);
      }
      else
      {
        localObject3 = new androidx/appcompat/app/AlertController$AlertParams$2;
        localObject4 = this.OooO00o;
        Cursor localCursor1 = this.Oooo0OO;
        i2 = 0;
        localCursor2 = null;
        localObject2 = localObject3;
        localObject5 = localObject1;
        localObject6 = paramAlertController;
        ((AlertController.AlertParams.2)localObject3).<init>(this, (Context)localObject4, localCursor1, false, (AlertController.RecycleListView)localObject1, paramAlertController);
      }
    }
    else
    {
      bool1 = this.Oooo00o;
      if (bool1) {
        j = paramAlertController.Oooo0oO;
      } else {
        j = paramAlertController.Oooo0oo;
      }
      i1 = j;
      localObject2 = this.Oooo0OO;
      n = 16908308;
      if (localObject2 != null)
      {
        localObject3 = new android/widget/SimpleCursorAdapter;
        localObject4 = this.OooO00o;
        localCursor2 = this.Oooo0OO;
        localObject2 = this.Oooo0o0;
        localObject5 = new String[] { localObject2 };
        localObject6 = new int[] { n };
        ((SimpleCursorAdapter)localObject3).<init>((Context)localObject4, j, localCursor2, (String[])localObject5, (int[])localObject6);
      }
      else
      {
        localObject3 = this.OooOo0o;
        if (localObject3 == null)
        {
          localObject3 = new androidx/appcompat/app/AlertController$CheckedItemAdapter;
          localObject2 = this.OooO00o;
          localObject4 = this.OooOo0O;
          ((AlertController.CheckedItemAdapter)localObject3).<init>((Context)localObject2, j, n, (CharSequence[])localObject4);
        }
      }
    }
    Object localObject2 = this.Oooo;
    if (localObject2 != null) {
      ((AlertController.AlertParams.OnPrepareListViewListener)localObject2).OooO00o((ListView)localObject1);
    }
    paramAlertController.Oooo00o = ((ListAdapter)localObject3);
    int j = this.Oooo0;
    paramAlertController.Oooo0 = j;
    localObject2 = this.OooOo;
    if (localObject2 != null)
    {
      localObject2 = new androidx/appcompat/app/AlertController$AlertParams$3;
      ((AlertController.AlertParams.3)localObject2).<init>(this, paramAlertController);
    }
    for (;;)
    {
      ((AdapterView)localObject1).setOnItemClickListener((AdapterView.OnItemClickListener)localObject2);
      break;
      localObject2 = this.Oooo0O0;
      if (localObject2 == null) {
        break;
      }
      localObject2 = new androidx/appcompat/app/AlertController$AlertParams$4;
      ((AlertController.AlertParams.4)localObject2).<init>(this, (AlertController.RecycleListView)localObject1, paramAlertController);
    }
    localObject2 = this.Oooo0oo;
    if (localObject2 != null) {
      ((AdapterView)localObject1).setOnItemSelectedListener((AdapterView.OnItemSelectedListener)localObject2);
    }
    int k = this.Oooo00o;
    if (k != 0) {}
    int m;
    for (k = 1;; m = 2)
    {
      ((AbsListView)localObject1).setChoiceMode(k);
      break;
      boolean bool2 = this.Oooo00O;
      if (!bool2) {
        break;
      }
    }
    paramAlertController.OooO0oO = ((ListView)localObject1);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AlertController.AlertParams
 * JD-Core Version:    0.7.0.1
 */
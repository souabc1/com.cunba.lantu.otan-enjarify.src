package androidx.preference;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public abstract class PreferenceDialogFragment
  extends DialogFragment
  implements DialogInterface.OnClickListener
{
  public DialogPreference o00OoOoo;
  public CharSequence o00Ooo0;
  public CharSequence o00Ooo00;
  public CharSequence o00Ooo0O;
  public CharSequence o00Ooo0o;
  public BitmapDrawable o00OooO;
  public int o00OooO0;
  public int o00OooOO;
  
  public boolean OooO00o()
  {
    return false;
  }
  
  public void OooO0O0(View paramView)
  {
    int i = 16908299;
    paramView = paramView.findViewById(i);
    if (paramView != null)
    {
      CharSequence localCharSequence = this.o00Ooo0o;
      boolean bool = TextUtils.isEmpty(localCharSequence);
      if (!bool)
      {
        bool = paramView instanceof TextView;
        if (bool)
        {
          Object localObject = paramView;
          localObject = (TextView)paramView;
          ((TextView)localObject).setText(localCharSequence);
        }
        i = 0;
        localCharSequence = null;
      }
      else
      {
        i = 8;
      }
      int j = ((View)paramView).getVisibility();
      if (j != i) {
        ((View)paramView).setVisibility(i);
      }
    }
  }
  
  public View OooO0OO(Context paramContext)
  {
    int i = this.o00OooO0;
    if (i == 0) {
      return null;
    }
    return LayoutInflater.from(paramContext).inflate(i, null);
  }
  
  public abstract void OooO0Oo(boolean paramBoolean);
  
  public final void OooO0o(Dialog paramDialog)
  {
    paramDialog = paramDialog.getWindow();
    int i = Build.VERSION.SDK_INT;
    int j = 30;
    if (i >= j)
    {
      PreferenceDialogFragment.Api30Impl.OooO00o(paramDialog);
    }
    else
    {
      i = 5;
      paramDialog.setSoftInputMode(i);
    }
  }
  
  public void OooO0o0(AlertDialog.Builder paramBuilder) {}
  
  public DialogPreference getPreference()
  {
    Object localObject = this.o00OoOoo;
    if (localObject == null)
    {
      localObject = getArguments().getString("key");
      DialogPreference.TargetFragment localTargetFragment = (DialogPreference.TargetFragment)getTargetFragment();
      localObject = (DialogPreference)localTargetFragment.OooO00o((CharSequence)localObject);
      this.o00OoOoo = ((DialogPreference)localObject);
    }
    return this.o00OoOoo;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.o00OooOO = paramInt;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Object localObject1 = getTargetFragment();
    boolean bool1 = localObject1 instanceof DialogPreference.TargetFragment;
    if (bool1)
    {
      localObject1 = (DialogPreference.TargetFragment)localObject1;
      Object localObject2 = getArguments().getString("key");
      int k;
      if (paramBundle == null)
      {
        paramBundle = (DialogPreference)((DialogPreference.TargetFragment)localObject1).OooO00o((CharSequence)localObject2);
        this.o00OoOoo = paramBundle;
        paramBundle = paramBundle.getDialogTitle();
        this.o00Ooo00 = paramBundle;
        paramBundle = this.o00OoOoo.getPositiveButtonText();
        this.o00Ooo0 = paramBundle;
        paramBundle = this.o00OoOoo.getNegativeButtonText();
        this.o00Ooo0O = paramBundle;
        paramBundle = this.o00OoOoo.getDialogMessage();
        this.o00Ooo0o = paramBundle;
        int j = this.o00OoOoo.getDialogLayoutResource();
        this.o00OooO0 = j;
        paramBundle = this.o00OoOoo.getDialogIcon();
        if (paramBundle != null)
        {
          boolean bool2 = paramBundle instanceof BitmapDrawable;
          if (!bool2)
          {
            k = paramBundle.getIntrinsicWidth();
            int i = paramBundle.getIntrinsicHeight();
            Bitmap.Config localConfig = Bitmap.Config.ARGB_8888;
            localObject1 = Bitmap.createBitmap(k, i, localConfig);
            localObject2 = new android/graphics/Canvas;
            ((Canvas)localObject2).<init>((Bitmap)localObject1);
            int m = ((Canvas)localObject2).getWidth();
            int n = ((Canvas)localObject2).getHeight();
            paramBundle.setBounds(0, 0, m, n);
            paramBundle.draw((Canvas)localObject2);
            paramBundle = new android/graphics/drawable/BitmapDrawable;
            localObject2 = getResources();
            paramBundle.<init>((Resources)localObject2, (Bitmap)localObject1);
            break label237;
          }
        }
        paramBundle = (BitmapDrawable)paramBundle;
        label237:
        this.o00OooO = paramBundle;
      }
      else
      {
        localObject1 = paramBundle.getCharSequence("PreferenceDialogFragment.title");
        this.o00Ooo00 = ((CharSequence)localObject1);
        localObject1 = paramBundle.getCharSequence("PreferenceDialogFragment.positiveText");
        this.o00Ooo0 = ((CharSequence)localObject1);
        localObject1 = paramBundle.getCharSequence("PreferenceDialogFragment.negativeText");
        this.o00Ooo0O = ((CharSequence)localObject1);
        localObject1 = paramBundle.getCharSequence("PreferenceDialogFragment.message");
        this.o00Ooo0o = ((CharSequence)localObject1);
        k = paramBundle.getInt("PreferenceDialogFragment.layout", 0);
        this.o00OooO0 = k;
        localObject1 = "PreferenceDialogFragment.icon";
        paramBundle = (Bitmap)paramBundle.getParcelable((String)localObject1);
        if (paramBundle != null)
        {
          localObject1 = new android/graphics/drawable/BitmapDrawable;
          localObject2 = getResources();
          ((BitmapDrawable)localObject1).<init>((Resources)localObject2, paramBundle);
          this.o00OooO = ((BitmapDrawable)localObject1);
        }
      }
      return;
    }
    paramBundle = new java/lang/IllegalStateException;
    paramBundle.<init>("Target fragment must implement TargetFragment interface");
    throw paramBundle;
  }
  
  public Dialog onCreateDialog(Bundle paramBundle)
  {
    paramBundle = getActivity();
    int i = -2;
    this.o00OooOO = i;
    AlertDialog.Builder localBuilder = new android/app/AlertDialog$Builder;
    localBuilder.<init>(paramBundle);
    Object localObject = this.o00Ooo00;
    localBuilder = localBuilder.setTitle((CharSequence)localObject);
    localObject = this.o00OooO;
    localBuilder = localBuilder.setIcon((Drawable)localObject);
    localObject = this.o00Ooo0;
    localBuilder = localBuilder.setPositiveButton((CharSequence)localObject, this);
    localObject = this.o00Ooo0O;
    localBuilder = localBuilder.setNegativeButton((CharSequence)localObject, this);
    paramBundle = OooO0OO(paramBundle);
    if (paramBundle != null)
    {
      OooO0O0(paramBundle);
      localBuilder.setView(paramBundle);
    }
    else
    {
      paramBundle = this.o00Ooo0o;
      localBuilder.setMessage(paramBundle);
    }
    OooO0o0(localBuilder);
    paramBundle = localBuilder.create();
    boolean bool = OooO00o();
    if (bool) {
      OooO0o(paramBundle);
    }
    return paramBundle;
  }
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    super.onDismiss(paramDialogInterface);
    int i = this.o00OooOO;
    int j = -1;
    if (i == j)
    {
      i = 1;
    }
    else
    {
      i = 0;
      paramDialogInterface = null;
    }
    OooO0Oo(i);
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Object localObject1 = this.o00Ooo00;
    paramBundle.putCharSequence("PreferenceDialogFragment.title", (CharSequence)localObject1);
    localObject1 = this.o00Ooo0;
    paramBundle.putCharSequence("PreferenceDialogFragment.positiveText", (CharSequence)localObject1);
    localObject1 = this.o00Ooo0O;
    paramBundle.putCharSequence("PreferenceDialogFragment.negativeText", (CharSequence)localObject1);
    localObject1 = this.o00Ooo0o;
    paramBundle.putCharSequence("PreferenceDialogFragment.message", (CharSequence)localObject1);
    int i = this.o00OooO0;
    paramBundle.putInt("PreferenceDialogFragment.layout", i);
    Object localObject2 = this.o00OooO;
    if (localObject2 != null)
    {
      localObject1 = "PreferenceDialogFragment.icon";
      localObject2 = ((BitmapDrawable)localObject2).getBitmap();
      paramBundle.putParcelable((String)localObject1, (Parcelable)localObject2);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.preference.PreferenceDialogFragment
 * JD-Core Version:    0.7.0.1
 */
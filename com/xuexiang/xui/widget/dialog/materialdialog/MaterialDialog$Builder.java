package com.xuexiang.xui.widget.dialog.materialdialog;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnShowListener;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import com.xuexiang.xui.R.attr;
import com.xuexiang.xui.R.color;
import com.xuexiang.xui.XUI;
import com.xuexiang.xui.utils.ThemeUtils;
import java.text.NumberFormat;
import java.util.ArrayList;
import m54207b69;

public class MaterialDialog$Builder
{
  public int OooO;
  public final Context OooO00o;
  public CharSequence OooO0O0;
  public GravityEnum OooO0OO;
  public GravityEnum OooO0Oo;
  public GravityEnum OooO0o;
  public GravityEnum OooO0o0;
  public GravityEnum OooO0oO;
  public int OooO0oo;
  public int OooOO0;
  public CharSequence OooOO0O;
  public ArrayList OooOO0o;
  public CharSequence OooOOO;
  public CharSequence OooOOO0;
  public CharSequence OooOOOO;
  public boolean OooOOOo;
  public boolean OooOOo;
  public boolean OooOOo0;
  public View OooOOoo;
  public ColorStateList OooOo;
  public ColorStateList OooOo0;
  public int OooOo00;
  public ColorStateList OooOo0O;
  public ColorStateList OooOo0o;
  public MaterialDialog.ButtonCallback OooOoO;
  public ColorStateList OooOoO0;
  public MaterialDialog.SingleButtonCallback OooOoOO;
  public MaterialDialog.SingleButtonCallback OooOoo;
  public MaterialDialog.SingleButtonCallback OooOoo0;
  public MaterialDialog.SingleButtonCallback OooOooO;
  public MaterialDialog.ListCallback OooOooo;
  public int Oooo;
  public boolean Oooo0;
  public MaterialDialog.ListLongCallback Oooo000;
  public MaterialDialog.ListCallbackSingleChoice Oooo00O;
  public MaterialDialog.ListCallbackMultiChoice Oooo00o;
  public boolean Oooo0O0;
  public Theme Oooo0OO;
  public boolean Oooo0o;
  public int Oooo0o0;
  public boolean Oooo0oO;
  public float Oooo0oo;
  public Typeface OoooO;
  public Integer[] OoooO0;
  public Integer[] OoooO00;
  public boolean OoooO0O;
  public Typeface OoooOO0;
  public boolean OoooOOO;
  public int OoooOOo;
  public RecyclerView.Adapter OoooOo0;
  public RecyclerView.LayoutManager OoooOoO;
  public DialogInterface.OnDismissListener OoooOoo;
  public DialogInterface.OnCancelListener Ooooo00;
  public DialogInterface.OnKeyListener Ooooo0o;
  public DialogInterface.OnShowListener OooooO0;
  public StackingBehavior OooooOO;
  public boolean OooooOo;
  public int Oooooo;
  public int Oooooo0;
  public int OoooooO;
  public boolean Ooooooo;
  public int o0000;
  public boolean o00000;
  public boolean o000000;
  public boolean o000000O;
  public boolean o000000o;
  public boolean o00000O;
  public boolean o00000O0;
  public boolean o00000OO;
  public boolean o00000Oo;
  public int o00000o0;
  public int o00000oO;
  public int o00000oo;
  public Object o0000O00;
  public int o0000Ooo;
  public boolean o0000oo;
  public boolean o000OOo;
  public Drawable o000oOoO;
  public int o00O0O;
  public CharSequence o00Oo0;
  public CharSequence o00Ooo;
  public MaterialDialog.InputCallback o00o0O;
  public int o00oO0O;
  public boolean o00oO0o;
  public boolean o00ooo;
  public NumberFormat o0O0O00;
  public CompoundButton.OnCheckedChangeListener o0OO00O;
  public CharSequence o0OOO0o;
  public boolean o0Oo0oo;
  public boolean o0OoOo0;
  public int o0ooOO0;
  public int o0ooOOo;
  public int[] o0ooOoO;
  public int oo000o;
  public String oo0o0Oo;
  public int ooOO;
  
  public MaterialDialog$Builder(Context paramContext)
  {
    GravityEnum localGravityEnum = GravityEnum.o00OoOoo;
    this.OooO0OO = localGravityEnum;
    this.OooO0Oo = localGravityEnum;
    Object localObject1 = GravityEnum.o00Ooo0;
    this.OooO0o0 = ((GravityEnum)localObject1);
    this.OooO0o = localGravityEnum;
    this.OooO0oO = localGravityEnum;
    localGravityEnum = null;
    this.OooO0oo = 0;
    int i = -1;
    this.OooO = i;
    this.OooOO0 = i;
    this.Oooo0 = false;
    this.Oooo0O0 = false;
    Object localObject2 = Theme.o00OoOoo;
    this.Oooo0OO = ((Theme)localObject2);
    this.Oooo0o0 = i;
    int k = 1;
    this.Oooo0o = k;
    this.Oooo0oO = k;
    this.Oooo0oo = 1.2F;
    this.Oooo = i;
    this.OoooO00 = null;
    this.OoooO0 = null;
    this.OoooO0O = k;
    this.OoooOOo = i;
    this.ooOO = -2;
    this.o00O0O = 0;
    this.oo000o = i;
    this.o00oO0O = i;
    this.o0ooOO0 = i;
    this.o0ooOOo = 0;
    this.o000000 = false;
    this.o000000O = false;
    this.o000000o = false;
    this.o00000 = false;
    this.o00000O0 = false;
    this.o00000O = false;
    this.o00000OO = false;
    this.o00000Oo = false;
    this.OooO00o = paramContext;
    i = R.color.md_material_blue_600;
    i = ThemeUtils.OooO0OO(paramContext, i);
    k = R.attr.colorAccent;
    i = ThemeUtils.OooOOO0(paramContext, k, i);
    this.OooOo00 = i;
    i = ThemeUtils.OooOOO0(paramContext, 16843829, i);
    this.OooOo00 = i;
    localObject1 = ThemeUtils.OooO0O0(paramContext, i);
    this.OooOo0O = ((ColorStateList)localObject1);
    i = this.OooOo00;
    localObject1 = ThemeUtils.OooO0O0(paramContext, i);
    this.OooOo0o = ((ColorStateList)localObject1);
    i = this.OooOo00;
    localObject1 = ThemeUtils.OooO0O0(paramContext, i);
    this.OooOo = ((ColorStateList)localObject1);
    i = R.attr.md_link_color;
    k = this.OooOo00;
    i = ThemeUtils.OooOOO0(paramContext, i, k);
    localObject1 = ThemeUtils.OooO0O0(paramContext, i);
    this.OooOoO0 = ((ColorStateList)localObject1);
    i = ThemeUtils.OooOO0o(paramContext, 16843820);
    k = R.attr.md_btn_ripple_color;
    int m = R.attr.colorControlHighlight;
    i = ThemeUtils.OooOOO0(paramContext, m, i);
    i = ThemeUtils.OooOOO0(paramContext, k, i);
    this.OooO0oo = i;
    localObject1 = NumberFormat.getPercentInstance();
    this.o0O0O00 = ((NumberFormat)localObject1);
    localObject1 = m54207b69.F54207b69_11("YF6378246C677928");
    this.oo0o0Oo = ((String)localObject1);
    boolean bool = ThemeUtils.isColorDark(ThemeUtils.OooOO0o(paramContext, 16842806));
    if (!bool) {
      localObject2 = Theme.o00Ooo00;
    }
    this.Oooo0OO = ((Theme)localObject2);
    OooO0Oo();
    int j = R.attr.md_title_gravity;
    localObject2 = this.OooO0OO;
    localObject1 = ThemeUtils.OooOOoo(paramContext, j, (GravityEnum)localObject2);
    this.OooO0OO = ((GravityEnum)localObject1);
    j = R.attr.md_content_gravity;
    localObject2 = this.OooO0Oo;
    localObject1 = ThemeUtils.OooOOoo(paramContext, j, (GravityEnum)localObject2);
    this.OooO0Oo = ((GravityEnum)localObject1);
    j = R.attr.md_btnstacked_gravity;
    localObject2 = this.OooO0o0;
    localObject1 = ThemeUtils.OooOOoo(paramContext, j, (GravityEnum)localObject2);
    this.OooO0o0 = ((GravityEnum)localObject1);
    j = R.attr.md_items_gravity;
    localObject2 = this.OooO0o;
    localObject1 = ThemeUtils.OooOOoo(paramContext, j, (GravityEnum)localObject2);
    this.OooO0o = ((GravityEnum)localObject1);
    j = R.attr.md_buttons_gravity;
    localObject2 = this.OooO0oO;
    localObject1 = ThemeUtils.OooOOoo(paramContext, j, (GravityEnum)localObject2);
    this.OooO0oO = ((GravityEnum)localObject1);
    j = R.attr.md_medium_font;
    localObject2 = XUI.getDefaultFontAssetPath();
    localObject1 = ThemeUtils.OooOo00(paramContext, j, (String)localObject2);
    int n = R.attr.md_regular_font;
    String str = XUI.getDefaultFontAssetPath();
    paramContext = ThemeUtils.OooOo00(paramContext, n, str);
    try
    {
      OooOoO((String)localObject1, paramContext);
      label616:
      paramContext = this.OoooOO0;
      if (paramContext == null)
      {
        paramContext = "BX2B3A382E7930433139477F4049493F3C45";
        try
        {
          paramContext = m54207b69.F54207b69_11(paramContext);
          paramContext = Typeface.create(paramContext, 0);
          this.OoooOO0 = paramContext;
        }
        finally
        {
          paramContext = Typeface.DEFAULT_BOLD;
          this.OoooOO0 = paramContext;
        }
      }
      paramContext = this.OoooO;
      if (paramContext == null)
      {
        paramContext = "VU26353D297C2B362E443C";
        try
        {
          paramContext = m54207b69.F54207b69_11(paramContext);
          paramContext = Typeface.create(paramContext, 0);
          this.OoooO = paramContext;
        }
        finally
        {
          paramContext = Typeface.SANS_SERIF;
          this.OoooO = paramContext;
          if (paramContext == null)
          {
            paramContext = Typeface.DEFAULT;
            this.OoooO = paramContext;
          }
        }
      }
      return;
    }
    finally
    {
      break label616;
    }
  }
  
  public Builder OooO(CharSequence... paramVarArgs)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramVarArgs;
    return (Builder)m54207b69.F54207b69_09(3075, arrayOfObject);
  }
  
  public Builder OooO00o(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    return (Builder)m54207b69.F54207b69_09(3076, arrayOfObject);
  }
  
  public MaterialDialog OooO0O0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (MaterialDialog)m54207b69.F54207b69_09(3077, arrayOfObject);
  }
  
  public Builder OooO0OO(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    return (Builder)m54207b69.F54207b69_09(3078, arrayOfObject);
  }
  
  public final void OooO0Oo()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(3079, arrayOfObject);
  }
  
  public Builder OooO0o(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (Builder)m54207b69.F54207b69_09(3080, arrayOfObject);
  }
  
  public Builder OooO0o0(CharSequence paramCharSequence)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence;
    return (Builder)m54207b69.F54207b69_09(3081, arrayOfObject);
  }
  
  public Builder OooO0oO(CharSequence paramCharSequence1, CharSequence paramCharSequence2, boolean paramBoolean, MaterialDialog.InputCallback paramInputCallback)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence1;
    arrayOfObject[2] = paramCharSequence2;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[3] = localBoolean;
    arrayOfObject[4] = paramInputCallback;
    return (Builder)m54207b69.F54207b69_09(3082, arrayOfObject);
  }
  
  public Builder OooO0oo(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (Builder)m54207b69.F54207b69_09(3083, arrayOfObject);
  }
  
  public Builder OooOO0(MaterialDialog.ListCallback paramListCallback)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramListCallback;
    return (Builder)m54207b69.F54207b69_09(3084, arrayOfObject);
  }
  
  public Builder OooOO0O(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (Builder)m54207b69.F54207b69_09(3085, arrayOfObject);
  }
  
  public Builder OooOO0o(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (Builder)m54207b69.F54207b69_09(3086, arrayOfObject);
  }
  
  public Builder OooOOO(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (Builder)m54207b69.F54207b69_09(3087, arrayOfObject);
  }
  
  public Builder OooOOO0(ColorStateList paramColorStateList)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramColorStateList;
    return (Builder)m54207b69.F54207b69_09(3088, arrayOfObject);
  }
  
  public Builder OooOOOO(CharSequence paramCharSequence)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence;
    return (Builder)m54207b69.F54207b69_09(3089, arrayOfObject);
  }
  
  public Builder OooOOOo(MaterialDialog.SingleButtonCallback paramSingleButtonCallback)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramSingleButtonCallback;
    return (Builder)m54207b69.F54207b69_09(3090, arrayOfObject);
  }
  
  public Builder OooOOo(ColorStateList paramColorStateList)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramColorStateList;
    return (Builder)m54207b69.F54207b69_09(3091, arrayOfObject);
  }
  
  public Builder OooOOo0(MaterialDialog.SingleButtonCallback paramSingleButtonCallback)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramSingleButtonCallback;
    return (Builder)m54207b69.F54207b69_09(3092, arrayOfObject);
  }
  
  public Builder OooOOoo(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (Builder)m54207b69.F54207b69_09(3093, arrayOfObject);
  }
  
  public Builder OooOo(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (Builder)m54207b69.F54207b69_09(3094, arrayOfObject);
  }
  
  public MaterialDialog OooOo0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (MaterialDialog)m54207b69.F54207b69_09(3095, arrayOfObject);
  }
  
  public Builder OooOo00(CharSequence paramCharSequence)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence;
    return (Builder)m54207b69.F54207b69_09(3096, arrayOfObject);
  }
  
  public Builder OooOo0O(CharSequence paramCharSequence)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence;
    return (Builder)m54207b69.F54207b69_09(3097, arrayOfObject);
  }
  
  public Builder OooOo0o(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (Builder)m54207b69.F54207b69_09(3098, arrayOfObject);
  }
  
  public Builder OooOoO(String paramString1, String paramString2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString1;
    arrayOfObject[2] = paramString2;
    return (Builder)m54207b69.F54207b69_09(3099, arrayOfObject);
  }
  
  public Builder OooOoO0(Typeface paramTypeface1, Typeface paramTypeface2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramTypeface1;
    arrayOfObject[2] = paramTypeface2;
    return (Builder)m54207b69.F54207b69_09(3100, arrayOfObject);
  }
  
  public final Context getContext()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Context)m54207b69.F54207b69_09(3101, arrayOfObject);
  }
  
  public final int getItemColor()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(3102, arrayOfObject);
  }
  
  public final Typeface getRegularFont()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Typeface)m54207b69.F54207b69_09(3103, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.Builder
 * JD-Core Version:    0.7.0.1
 */
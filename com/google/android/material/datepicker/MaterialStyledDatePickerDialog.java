package com.google.android.material.datepicker;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.dialog.MaterialDialogs;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;

public class MaterialStyledDatePickerDialog
  extends DatePickerDialog
{
  private static final int DEF_STYLE_ATTR = 16843612;
  private static final int DEF_STYLE_RES = R.style.MaterialAlertDialog_MaterialComponents_Picker_Date_Spinner;
  private final Drawable background;
  private final Rect backgroundInsets;
  
  public MaterialStyledDatePickerDialog(Context paramContext)
  {
    this(paramContext, 0);
  }
  
  public MaterialStyledDatePickerDialog(Context paramContext, int paramInt)
  {
    this(paramContext, paramInt, null, -1, -1, -1);
  }
  
  public MaterialStyledDatePickerDialog(Context paramContext, int paramInt1, DatePickerDialog.OnDateSetListener paramOnDateSetListener, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramContext, paramInt1, paramOnDateSetListener, paramInt2, paramInt3, paramInt4);
    paramContext = getContext();
    Object localObject = getContext();
    int i = R.attr.colorSurface;
    String str = getClass().getCanonicalName();
    paramInt1 = MaterialAttributes.resolveOrThrow((Context)localObject, i, str);
    paramOnDateSetListener = new com/google/android/material/shape/MaterialShapeDrawable;
    paramInt2 = DEF_STYLE_RES;
    paramInt4 = 16843612;
    paramOnDateSetListener.<init>(paramContext, null, paramInt4, paramInt2);
    localObject = ColorStateList.valueOf(paramInt1);
    paramOnDateSetListener.setFillColor((ColorStateList)localObject);
    paramContext = MaterialDialogs.getDialogBackgroundInsets(paramContext, paramInt4, paramInt2);
    this.backgroundInsets = paramContext;
    paramContext = MaterialDialogs.insetDrawable(paramOnDateSetListener, paramContext);
    this.background = paramContext;
  }
  
  public MaterialStyledDatePickerDialog(Context paramContext, DatePickerDialog.OnDateSetListener paramOnDateSetListener, int paramInt1, int paramInt2, int paramInt3)
  {
    this(paramContext, 0, paramOnDateSetListener, paramInt1, paramInt2, paramInt3);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getWindow();
    Object localObject = this.background;
    paramBundle.setBackgroundDrawable((Drawable)localObject);
    paramBundle = getWindow().getDecorView();
    localObject = new com/google/android/material/dialog/InsetDialogOnTouchListener;
    Rect localRect = this.backgroundInsets;
    ((InsetDialogOnTouchListener)localObject).<init>(this, localRect);
    paramBundle.setOnTouchListener((View.OnTouchListener)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.MaterialStyledDatePickerDialog
 * JD-Core Version:    0.7.0.1
 */
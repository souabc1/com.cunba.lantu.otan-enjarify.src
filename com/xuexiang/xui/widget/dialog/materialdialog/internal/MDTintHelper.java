package com.xuexiang.xui.widget.dialog.materialdialog.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import m54207b69;

public class MDTintHelper
{
  public static ColorStateList OooO00o(Context paramContext, int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramContext;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (ColorStateList)m54207b69.F54207b69_09(3221, arrayOfObject);
  }
  
  public static void OooO0O0(EditText paramEditText, int paramInt)
  {
    Object localObject1 = TextView.class;
    Object localObject2 = "=S3E1128242441271E293B2E3D3D4C44104631";
    try
    {
      localObject2 = m54207b69.F54207b69_11((String)localObject2);
      localObject2 = ((Class)localObject1).getDeclaredField((String)localObject2);
      boolean bool = true;
      ((AccessibleObject)localObject2).setAccessible(bool);
      int i = ((Field)localObject2).getInt(paramEditText);
      Object localObject3 = "nW3A133541273D2B";
      localObject3 = m54207b69.F54207b69_11((String)localObject3);
      localObject1 = ((Class)localObject1).getDeclaredField((String)localObject3);
      ((AccessibleObject)localObject1).setAccessible(bool);
      localObject1 = ((Field)localObject1).get(paramEditText);
      localObject3 = localObject1.getClass();
      Object localObject4 = "ck0629201C1C091F362113261515141C";
      localObject4 = m54207b69.F54207b69_11((String)localObject4);
      localObject3 = ((Class)localObject3).getDeclaredField((String)localObject4);
      ((AccessibleObject)localObject3).setAccessible(bool);
      int j = 2;
      localObject4 = new Drawable[j];
      Object localObject5 = paramEditText.getContext();
      localObject5 = ContextCompat.OooO0o0((Context)localObject5, i);
      localObject4[0] = localObject5;
      paramEditText = paramEditText.getContext();
      paramEditText = ContextCompat.OooO0o0(paramEditText, i);
      localObject4[bool] = paramEditText;
      paramEditText = localObject4[0];
      if (paramEditText != null)
      {
        localObject2 = PorterDuff.Mode.SRC_IN;
        paramEditText.setColorFilter(paramInt, (PorterDuff.Mode)localObject2);
      }
      paramEditText = localObject4[bool];
      if (paramEditText != null)
      {
        localObject2 = PorterDuff.Mode.SRC_IN;
        paramEditText.setColorFilter(paramInt, (PorterDuff.Mode)localObject2);
      }
      ((Field)localObject3).set(localObject1, localObject4);
    }
    catch (Exception paramEditText) {}catch (NoSuchFieldException paramEditText)
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject1 = m54207b69.F54207b69_11("?s3717071D141B5921080910215F1128162B642219151532186B20343823373B336974");
      localStringBuilder.append((String)localObject1);
      localObject1 = paramEditText.getMessage();
      localStringBuilder.append((String)localObject1);
    }
    paramEditText.printStackTrace();
  }
  
  public static void OooO0OO(CheckBox paramCheckBox, int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramCheckBox;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3223, arrayOfObject);
  }
  
  public static void OooO0Oo(CheckBox paramCheckBox, ColorStateList paramColorStateList)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramCheckBox;
    arrayOfObject[1] = paramColorStateList;
    m54207b69.F54207b69_00(3224, arrayOfObject);
  }
  
  public static void OooO0o(RadioButton paramRadioButton, int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramRadioButton;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3225, arrayOfObject);
  }
  
  public static void OooO0o0(EditText paramEditText, int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramEditText;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3226, arrayOfObject);
  }
  
  public static void OooO0oO(RadioButton paramRadioButton, ColorStateList paramColorStateList)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramRadioButton;
    arrayOfObject[1] = paramColorStateList;
    m54207b69.F54207b69_00(3227, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.dialog.materialdialog.internal.MDTintHelper
 * JD-Core Version:    0.7.0.1
 */
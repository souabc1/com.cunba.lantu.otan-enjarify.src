package com.xuexiang.xui.widget.edittext.verify;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import m54207b69;

public class VerifyCodeEditText
  extends FrameLayout
{
  public LinearLayout o00OoOoo;
  public int o00Ooo0;
  public PwdEditText o00Ooo00;
  public int o00Ooo0O;
  public boolean o00Ooo0o;
  public int o00OooO;
  public Drawable o00OooO0;
  public float o00OooOO;
  public Drawable o00OooOo;
  public boolean o00OoooO;
  public float o00Ooooo;
  public VerifyCodeEditText.InputNumberTextWatcher o00o000;
  public PwdTextView[] o00o0000;
  public VerifyCodeEditText.OnInputListener o00o000O;
  public Drawable o0O00o0;
  
  public final void OooO(Context paramContext, int paramInt1, int paramInt2, Drawable paramDrawable, float paramFloat, int paramInt3)
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramContext;
    Object localObject = Integer.valueOf(paramInt1);
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(paramInt2);
    arrayOfObject[3] = localObject;
    arrayOfObject[4] = paramDrawable;
    localObject = Float.valueOf(paramFloat);
    arrayOfObject[5] = localObject;
    localObject = Integer.valueOf(paramInt3);
    arrayOfObject[6] = localObject;
    m54207b69.F54207b69_00(3536, arrayOfObject);
  }
  
  public float OooO0oO(float paramFloat, Context paramContext)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Float localFloat = Float.valueOf(paramFloat);
    arrayOfObject[1] = localFloat;
    arrayOfObject[2] = paramContext;
    return m54207b69.F54207b69_07(3543, arrayOfObject);
  }
  
  public final void OooO0oo(TextView[] paramArrayOfTextView)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramArrayOfTextView;
    m54207b69.F54207b69_00(3544, arrayOfObject);
  }
  
  public final void OooOO0(Context paramContext)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramContext;
    m54207b69.F54207b69_00(3545, arrayOfObject);
  }
  
  public final void OooOO0O()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(3546, arrayOfObject);
  }
  
  public final void OooOO0o()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(3547, arrayOfObject);
  }
  
  public final void OooOOO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(3548, arrayOfObject);
  }
  
  public final void OooOOO0(Context paramContext, String paramString)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramContext;
    arrayOfObject[2] = paramString;
    m54207b69.F54207b69_00(3549, arrayOfObject);
  }
  
  public final void OooOOOO(String paramString, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[2] = localBoolean;
    m54207b69.F54207b69_00(3550, arrayOfObject);
  }
  
  public EditText getEditText()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (EditText)m54207b69.F54207b69_09(3551, arrayOfObject);
  }
  
  public int getEtNumber()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(3552, arrayOfObject);
  }
  
  public String getInputValue()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (String)m54207b69.F54207b69_09(3553, arrayOfObject);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramConfiguration;
    m54207b69.F54207b69_00(3554, arrayOfObject);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(3555, arrayOfObject);
  }
  
  public void setEtNumber(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3556, arrayOfObject);
  }
  
  public void setOnInputListener(VerifyCodeEditText.OnInputListener paramOnInputListener)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramOnInputListener;
    m54207b69.F54207b69_00(3557, arrayOfObject);
  }
  
  public void setPwdMode(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(3558, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.edittext.verify.VerifyCodeEditText
 * JD-Core Version:    0.7.0.1
 */
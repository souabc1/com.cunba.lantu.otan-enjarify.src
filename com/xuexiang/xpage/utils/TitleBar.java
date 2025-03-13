package com.xuexiang.xpage.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import m54207b69;

public class TitleBar
  extends ViewGroup
  implements View.OnClickListener
{
  public static int o00o0OO0 = 255;
  public TextView o00OoOoo;
  public LinearLayout o00Ooo0;
  public LinearLayout o00Ooo00;
  public TextView o00Ooo0O;
  public TextView o00Ooo0o;
  public boolean o00OooO;
  public View o00OooO0;
  public int o00OooOO;
  public int o00OooOo;
  public int o00OoooO;
  public int o00Ooooo;
  public String o00o0;
  public int o00o00;
  public int o00o000;
  public int o00o0000;
  public int o00o000O;
  public int o00o000o;
  public int o00o00O0;
  public int o00o00Oo;
  public Drawable o00o00o;
  public int o00o00o0;
  public String o00o00oO;
  public String o00o00oo;
  public int o00o0O0;
  public int o00o0O00;
  public boolean o00o0O0O;
  public int o0O00o0;
  public int oo00oO;
  
  public TitleBar(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TitleBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public TitleBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    OooO0OO(paramContext, paramAttributeSet, paramInt);
    OooO0O0(paramContext);
  }
  
  public static int OooO00o(Resources paramResources, String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramResources;
    arrayOfObject[1] = paramString;
    return m54207b69.F54207b69_05(1713, arrayOfObject);
  }
  
  public static int getStatusBarHeight()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_05(1725, arrayOfObject);
  }
  
  public TitleBar OooO(CharSequence paramCharSequence1, CharSequence paramCharSequence2, int paramInt)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence1;
    arrayOfObject[2] = paramCharSequence2;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[3] = localInteger;
    return (TitleBar)m54207b69.F54207b69_09(1712, arrayOfObject);
  }
  
  public final void OooO0O0(Context paramContext)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramContext;
    m54207b69.F54207b69_00(1714, arrayOfObject);
  }
  
  public final void OooO0OO(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramContext;
    arrayOfObject[2] = paramAttributeSet;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[3] = localInteger;
    m54207b69.F54207b69_00(1715, arrayOfObject);
  }
  
  public final void OooO0Oo(Context paramContext)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramContext;
    m54207b69.F54207b69_00(1716, arrayOfObject);
  }
  
  public TitleBar OooO0o(View.OnClickListener paramOnClickListener)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramOnClickListener;
    return (TitleBar)m54207b69.F54207b69_09(1717, arrayOfObject);
  }
  
  public TitleBar OooO0o0(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    return (TitleBar)m54207b69.F54207b69_09(1718, arrayOfObject);
  }
  
  public TitleBar OooO0oO(Drawable paramDrawable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDrawable;
    return (TitleBar)m54207b69.F54207b69_09(1719, arrayOfObject);
  }
  
  public TitleBar OooO0oo(CharSequence paramCharSequence)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCharSequence;
    return (TitleBar)m54207b69.F54207b69_09(1720, arrayOfObject);
  }
  
  public int getActionCount()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(1721, arrayOfObject);
  }
  
  public TextView getCenterText()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (TextView)m54207b69.F54207b69_09(1722, arrayOfObject);
  }
  
  public View getDividerView()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (View)m54207b69.F54207b69_09(1723, arrayOfObject);
  }
  
  public TextView getLeftText()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (TextView)m54207b69.F54207b69_09(1724, arrayOfObject);
  }
  
  public TextView getSubTitleText()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (TextView)m54207b69.F54207b69_09(1726, arrayOfObject);
  }
  
  public void onClick(View paramView)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    m54207b69.F54207b69_00(1727, arrayOfObject);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this;
    Object localObject = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(paramInt1);
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(paramInt2);
    arrayOfObject[3] = localObject;
    localObject = Integer.valueOf(paramInt3);
    arrayOfObject[4] = localObject;
    localObject = Integer.valueOf(paramInt4);
    arrayOfObject[5] = localObject;
    m54207b69.F54207b69_00(1728, arrayOfObject);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(1729, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xpage.utils.TitleBar
 * JD-Core Version:    0.7.0.1
 */
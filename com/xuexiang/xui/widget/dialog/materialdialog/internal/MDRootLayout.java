package com.xuexiang.xui.widget.dialog.materialdialog.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;
import com.xuexiang.xui.widget.dialog.materialdialog.StackingBehavior;
import m54207b69;

public class MDRootLayout
  extends ViewGroup
{
  public final MDButton[] o00OoOoo;
  public View o00Ooo0;
  public int o00Ooo00;
  public View o00Ooo0O;
  public boolean o00Ooo0o;
  public StackingBehavior o00OooO;
  public boolean o00OooO0;
  public boolean o00OooOO;
  public boolean o00OooOo;
  public boolean o00OoooO;
  public int o00Ooooo;
  public ViewTreeObserver.OnScrollChangedListener o00o00;
  public int o00o000;
  public int o00o0000;
  public GravityEnum o00o000O;
  public int o00o000o;
  public ViewTreeObserver.OnScrollChangedListener o00o00O0;
  public int o00o00Oo;
  public boolean o0O00o0;
  public Paint oo00oO;
  
  public MDRootLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
    Object localObject = new MDButton[3];
    this.o00OoOoo = ((MDButton[])localObject);
    this.o00Ooo0o = false;
    this.o00OooO0 = false;
    localObject = StackingBehavior.o00Ooo00;
    this.o00OooO = ((StackingBehavior)localObject);
    this.o00OooOO = false;
    this.o00OooOo = true;
    localObject = GravityEnum.o00OoOoo;
    this.o00o000O = ((GravityEnum)localObject);
    OooOOOO(paramContext, paramAttributeSet, 0);
  }
  
  public static boolean OooO(AdapterView paramAdapterView)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramAdapterView;
    return m54207b69.F54207b69_01(3191, arrayOfObject);
  }
  
  public static boolean OooOO0(RecyclerView paramRecyclerView)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramRecyclerView;
    return m54207b69.F54207b69_01(3200, arrayOfObject);
  }
  
  public static boolean OooOO0O(ScrollView paramScrollView)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramScrollView;
    return m54207b69.F54207b69_01(3201, arrayOfObject);
  }
  
  public static boolean OooOO0o(WebView paramWebView)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramWebView;
    return m54207b69.F54207b69_01(3202, arrayOfObject);
  }
  
  public static View OooOOO(ViewGroup paramViewGroup)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramViewGroup;
    return (View)m54207b69.F54207b69_09(3203, arrayOfObject);
  }
  
  public static View OooOOO0(ViewGroup paramViewGroup)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramViewGroup;
    return (View)m54207b69.F54207b69_09(3204, arrayOfObject);
  }
  
  public static boolean OooOOoo(View paramView)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramView;
    return m54207b69.F54207b69_01(3209, arrayOfObject);
  }
  
  public final void OooO0oo(ViewGroup paramViewGroup, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramViewGroup;
    Boolean localBoolean = Boolean.valueOf(paramBoolean1);
    arrayOfObject[2] = localBoolean;
    localBoolean = Boolean.valueOf(paramBoolean2);
    arrayOfObject[3] = localBoolean;
    m54207b69.F54207b69_00(3199, arrayOfObject);
  }
  
  public final void OooOOOO(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramContext;
    arrayOfObject[2] = paramAttributeSet;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[3] = localInteger;
    m54207b69.F54207b69_00(3205, arrayOfObject);
  }
  
  public final void OooOOOo(ViewGroup paramViewGroup, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramViewGroup;
    Boolean localBoolean = Boolean.valueOf(paramBoolean1);
    arrayOfObject[2] = localBoolean;
    localBoolean = Boolean.valueOf(paramBoolean2);
    arrayOfObject[3] = localBoolean;
    localBoolean = Boolean.valueOf(paramBoolean3);
    arrayOfObject[4] = localBoolean;
    m54207b69.F54207b69_00(3206, arrayOfObject);
  }
  
  public final void OooOOo()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(3207, arrayOfObject);
  }
  
  public final void OooOOo0(WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramWebView;
    Boolean localBoolean = Boolean.valueOf(paramBoolean1);
    arrayOfObject[2] = localBoolean;
    localBoolean = Boolean.valueOf(paramBoolean2);
    arrayOfObject[3] = localBoolean;
    localBoolean = Boolean.valueOf(paramBoolean3);
    arrayOfObject[4] = localBoolean;
    m54207b69.F54207b69_00(3208, arrayOfObject);
  }
  
  public final void OooOo0(View paramView, boolean paramBoolean1, boolean paramBoolean2)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    Boolean localBoolean = Boolean.valueOf(paramBoolean1);
    arrayOfObject[2] = localBoolean;
    localBoolean = Boolean.valueOf(paramBoolean2);
    arrayOfObject[3] = localBoolean;
    m54207b69.F54207b69_00(3210, arrayOfObject);
  }
  
  public void OooOo00()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(3211, arrayOfObject);
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    m54207b69.F54207b69_00(3212, arrayOfObject);
  }
  
  public void onFinishInflate()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(3213, arrayOfObject);
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
    m54207b69.F54207b69_00(3214, arrayOfObject);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(3215, arrayOfObject);
  }
  
  public void setButtonGravity(GravityEnum paramGravityEnum)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramGravityEnum;
    m54207b69.F54207b69_00(3216, arrayOfObject);
  }
  
  public void setButtonStackedGravity(GravityEnum paramGravityEnum)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramGravityEnum;
    m54207b69.F54207b69_00(3217, arrayOfObject);
  }
  
  public void setDividerColor(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3218, arrayOfObject);
  }
  
  public void setMaxHeight(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(3219, arrayOfObject);
  }
  
  public void setStackingBehavior(StackingBehavior paramStackingBehavior)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramStackingBehavior;
    m54207b69.F54207b69_00(3220, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout
 * JD-Core Version:    0.7.0.1
 */
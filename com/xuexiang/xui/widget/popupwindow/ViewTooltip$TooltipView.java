package com.xuexiang.xui.widget.popupwindow;

import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.xuexiang.xui.R.attr;
import com.xuexiang.xui.XUI;
import com.xuexiang.xui.utils.ThemeUtils;
import m54207b69;

public class ViewTooltip$TooltipView
  extends FrameLayout
{
  public final int o00OoOoo = 15;
  public int o00Ooo0;
  public View o00Ooo00;
  public Path o00Ooo0O;
  public Paint o00Ooo0o;
  public ViewTooltip.ALIGN o00OooO;
  public ViewTooltip.Position o00OooO0;
  public boolean o00OooOO;
  public boolean o00OooOo;
  public ViewTooltip.ListenerDisplay o00OoooO;
  public ViewTooltip.ListenerHide o00Ooooo;
  public int o00o00;
  public int o00o000;
  public ViewTooltip.TooltipAnimation o00o0000;
  public int o00o000O;
  public int o00o000o;
  public Rect o00o00O0;
  public long o0O00o0;
  public int oo00oO;
  
  public ViewTooltip$TooltipView(Context paramContext)
  {
    super(paramContext);
    int i = Color.parseColor(m54207b69.F54207b69_11("?)0A6C1D1E1415727322"));
    this.o00Ooo0 = i;
    Object localObject = ViewTooltip.Position.o00Ooo0O;
    this.o00OooO0 = ((ViewTooltip.Position)localObject);
    localObject = ViewTooltip.ALIGN.o00Ooo00;
    this.o00OooO = ((ViewTooltip.ALIGN)localObject);
    i = 1;
    this.o00OooOo = i;
    this.o0O00o0 = 4000L;
    ViewTooltip.FadeTooltipAnimation localFadeTooltipAnimation = new com/xuexiang/xui/widget/popupwindow/ViewTooltip$FadeTooltipAnimation;
    localFadeTooltipAnimation.<init>();
    this.o00o0000 = localFadeTooltipAnimation;
    this.o00o000 = 30;
    setWillNotDraw(false);
    TextView localTextView = new android/widget/TextView;
    localTextView.<init>(paramContext);
    this.o00Ooo00 = localTextView;
    localTextView.setTextColor(-1);
    paramContext = this.o00Ooo00;
    int j = -2;
    addView(paramContext, j, j);
    this.o00Ooo00.setPadding(0, 0, 0, 0);
    paramContext = new android/graphics/Paint;
    paramContext.<init>(i);
    this.o00Ooo0o = paramContext;
    i = this.o00Ooo0;
    paramContext.setColor(i);
    paramContext = this.o00Ooo0o;
    localObject = Paint.Style.FILL;
    paramContext.setStyle((Paint.Style)localObject);
    paramContext = getContext();
    i = R.attr.xui_tip_popup_padding_top;
    int k = ThemeUtils.OooOOO(paramContext, i);
    this.o00o000o = k;
    this.o00o000O = k;
    paramContext = getContext();
    i = R.attr.xui_tip_popup_padding_left;
    k = ThemeUtils.OooOOO(paramContext, i);
    this.o00o00 = k;
    this.oo00oO = k;
    paramContext = XUI.getDefaultTypeface();
    setTextTypeFace(paramContext);
  }
  
  public void OooO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5006, arrayOfObject);
  }
  
  public final Path OooO0o(RectF paramRectF, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramRectF;
    Float localFloat = Float.valueOf(paramFloat1);
    arrayOfObject[2] = localFloat;
    localFloat = Float.valueOf(paramFloat2);
    arrayOfObject[3] = localFloat;
    localFloat = Float.valueOf(paramFloat3);
    arrayOfObject[4] = localFloat;
    localFloat = Float.valueOf(paramFloat4);
    arrayOfObject[5] = localFloat;
    return (Path)m54207b69.F54207b69_09(5011, arrayOfObject);
  }
  
  public boolean OooO0o0(Rect paramRect, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramRect;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    return m54207b69.F54207b69_01(5012, arrayOfObject);
  }
  
  public void OooO0oO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5013, arrayOfObject);
  }
  
  public final void OooO0oo(Rect paramRect)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramRect;
    m54207b69.F54207b69_00(5014, arrayOfObject);
  }
  
  public void OooOO0(Rect paramRect, int paramInt)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramRect;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[2] = localInteger;
    m54207b69.F54207b69_00(5015, arrayOfObject);
  }
  
  public void OooOO0O()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5016, arrayOfObject);
  }
  
  public void OooOO0o(Animator.AnimatorListener paramAnimatorListener)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAnimatorListener;
    m54207b69.F54207b69_00(5017, arrayOfObject);
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramCanvas;
    m54207b69.F54207b69_00(5018, arrayOfObject);
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[2] = localInteger;
    localInteger = Integer.valueOf(paramInt3);
    arrayOfObject[3] = localInteger;
    localInteger = Integer.valueOf(paramInt4);
    arrayOfObject[4] = localInteger;
    m54207b69.F54207b69_00(5019, arrayOfObject);
  }
  
  public void setAlign(ViewTooltip.ALIGN paramALIGN)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramALIGN;
    m54207b69.F54207b69_00(5020, arrayOfObject);
  }
  
  public void setAutoHide(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(5021, arrayOfObject);
  }
  
  public void setClickToHide(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(5022, arrayOfObject);
  }
  
  public void setColor(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5023, arrayOfObject);
  }
  
  public void setCorner(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5024, arrayOfObject);
  }
  
  public void setCustomView(View paramView)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramView;
    m54207b69.F54207b69_00(5025, arrayOfObject);
  }
  
  public void setDuration(long paramLong)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Long localLong = Long.valueOf(paramLong);
    arrayOfObject[1] = localLong;
    m54207b69.F54207b69_00(5026, arrayOfObject);
  }
  
  public void setListenerDisplay(ViewTooltip.ListenerDisplay paramListenerDisplay)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramListenerDisplay;
    m54207b69.F54207b69_00(5027, arrayOfObject);
  }
  
  public void setListenerHide(ViewTooltip.ListenerHide paramListenerHide)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramListenerHide;
    m54207b69.F54207b69_00(5028, arrayOfObject);
  }
  
  public void setPosition(ViewTooltip.Position paramPosition)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramPosition;
    m54207b69.F54207b69_00(5029, arrayOfObject);
  }
  
  public void setText(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    m54207b69.F54207b69_00(5030, arrayOfObject);
  }
  
  public void setTextColor(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5031, arrayOfObject);
  }
  
  public void setTextGravity(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(5032, arrayOfObject);
  }
  
  public void setTextSize(int paramInt, float paramFloat)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[1] = localObject;
    localObject = Float.valueOf(paramFloat);
    arrayOfObject[2] = localObject;
    m54207b69.F54207b69_00(5033, arrayOfObject);
  }
  
  public void setTextTypeFace(Typeface paramTypeface)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramTypeface;
    m54207b69.F54207b69_00(5034, arrayOfObject);
  }
  
  public void setTooltipAnimation(ViewTooltip.TooltipAnimation paramTooltipAnimation)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramTooltipAnimation;
    m54207b69.F54207b69_00(5035, arrayOfObject);
  }
  
  public void setupPosition(Rect paramRect)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramRect;
    m54207b69.F54207b69_00(5036, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.popupwindow.ViewTooltip.TooltipView
 * JD-Core Version:    0.7.0.1
 */
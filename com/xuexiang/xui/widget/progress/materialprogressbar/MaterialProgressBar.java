package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import m54207b69;

public class MaterialProgressBar
  extends ProgressBar
{
  public boolean o00OoOoo = true;
  public MaterialProgressBar.TintInfo o00Ooo0;
  public int o00Ooo00;
  
  public MaterialProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = new com/xuexiang/xui/widget/progress/materialprogressbar/MaterialProgressBar$TintInfo;
    paramContext.<init>(null);
    this.o00Ooo0 = paramContext;
    OooO(paramAttributeSet, 0, 0);
  }
  
  public final void OooO(AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramAttributeSet;
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[2] = localInteger;
    localInteger = Integer.valueOf(paramInt2);
    arrayOfObject[3] = localInteger;
    m54207b69.F54207b69_00(5330, arrayOfObject);
  }
  
  public final void OooO00o()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5331, arrayOfObject);
  }
  
  public final void OooO0O0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5332, arrayOfObject);
  }
  
  public final void OooO0OO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5333, arrayOfObject);
  }
  
  public final void OooO0Oo()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5334, arrayOfObject);
  }
  
  public final void OooO0o(Drawable paramDrawable, ColorStateList paramColorStateList, boolean paramBoolean1, PorterDuff.Mode paramMode, boolean paramBoolean2)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDrawable;
    arrayOfObject[2] = paramColorStateList;
    Boolean localBoolean = Boolean.valueOf(paramBoolean1);
    arrayOfObject[3] = localBoolean;
    arrayOfObject[4] = paramMode;
    localBoolean = Boolean.valueOf(paramBoolean2);
    arrayOfObject[5] = localBoolean;
    m54207b69.F54207b69_00(5335, arrayOfObject);
  }
  
  public final void OooO0o0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5336, arrayOfObject);
  }
  
  public final void OooO0oO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5337, arrayOfObject);
  }
  
  public final Drawable OooO0oo(int paramInt, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Object localObject = Integer.valueOf(paramInt);
    arrayOfObject[1] = localObject;
    localObject = Boolean.valueOf(paramBoolean);
    arrayOfObject[2] = localObject;
    return (Drawable)m54207b69.F54207b69_09(5338, arrayOfObject);
  }
  
  public final void OooOO0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5339, arrayOfObject);
  }
  
  public final void OooOO0O()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5340, arrayOfObject);
  }
  
  public Drawable getCurrentDrawable()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Drawable)m54207b69.F54207b69_09(5341, arrayOfObject);
  }
  
  public ColorStateList getIndeterminateTintList()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (ColorStateList)m54207b69.F54207b69_09(5342, arrayOfObject);
  }
  
  public PorterDuff.Mode getIndeterminateTintMode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (PorterDuff.Mode)m54207b69.F54207b69_09(5343, arrayOfObject);
  }
  
  public ColorStateList getProgressBackgroundTintList()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (ColorStateList)m54207b69.F54207b69_09(5344, arrayOfObject);
  }
  
  public PorterDuff.Mode getProgressBackgroundTintMode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (PorterDuff.Mode)m54207b69.F54207b69_09(5345, arrayOfObject);
  }
  
  public int getProgressStyle()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(5346, arrayOfObject);
  }
  
  public ColorStateList getProgressTintList()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (ColorStateList)m54207b69.F54207b69_09(5347, arrayOfObject);
  }
  
  public PorterDuff.Mode getProgressTintMode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (PorterDuff.Mode)m54207b69.F54207b69_09(5348, arrayOfObject);
  }
  
  public ColorStateList getSecondaryProgressTintList()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (ColorStateList)m54207b69.F54207b69_09(5349, arrayOfObject);
  }
  
  public PorterDuff.Mode getSecondaryProgressTintMode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (PorterDuff.Mode)m54207b69.F54207b69_09(5350, arrayOfObject);
  }
  
  public boolean getShowProgressBackground()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(5351, arrayOfObject);
  }
  
  public ColorStateList getSupportIndeterminateTintList()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (ColorStateList)m54207b69.F54207b69_09(5352, arrayOfObject);
  }
  
  public PorterDuff.Mode getSupportIndeterminateTintMode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (PorterDuff.Mode)m54207b69.F54207b69_09(5353, arrayOfObject);
  }
  
  public ColorStateList getSupportProgressBackgroundTintList()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (ColorStateList)m54207b69.F54207b69_09(5354, arrayOfObject);
  }
  
  public PorterDuff.Mode getSupportProgressBackgroundTintMode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (PorterDuff.Mode)m54207b69.F54207b69_09(5355, arrayOfObject);
  }
  
  public ColorStateList getSupportProgressTintList()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (ColorStateList)m54207b69.F54207b69_09(5356, arrayOfObject);
  }
  
  public PorterDuff.Mode getSupportProgressTintMode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (PorterDuff.Mode)m54207b69.F54207b69_09(5357, arrayOfObject);
  }
  
  public ColorStateList getSupportSecondaryProgressTintList()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (ColorStateList)m54207b69.F54207b69_09(5358, arrayOfObject);
  }
  
  public PorterDuff.Mode getSupportSecondaryProgressTintMode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (PorterDuff.Mode)m54207b69.F54207b69_09(5359, arrayOfObject);
  }
  
  public boolean getUseIntrinsicPadding()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(5360, arrayOfObject);
  }
  
  public void onAttachedToWindow()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(5361, arrayOfObject);
  }
  
  public void setIndeterminate(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(5362, arrayOfObject);
  }
  
  public void setIndeterminateDrawable(Drawable paramDrawable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDrawable;
    m54207b69.F54207b69_00(5363, arrayOfObject);
  }
  
  public void setIndeterminateTintList(ColorStateList paramColorStateList)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramColorStateList;
    m54207b69.F54207b69_00(5364, arrayOfObject);
  }
  
  public void setIndeterminateTintMode(PorterDuff.Mode paramMode)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMode;
    m54207b69.F54207b69_00(5365, arrayOfObject);
  }
  
  public void setProgressBackgroundTintList(ColorStateList paramColorStateList)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramColorStateList;
    m54207b69.F54207b69_00(5366, arrayOfObject);
  }
  
  public void setProgressBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMode;
    m54207b69.F54207b69_00(5367, arrayOfObject);
  }
  
  public void setProgressDrawable(Drawable paramDrawable)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramDrawable;
    m54207b69.F54207b69_00(5368, arrayOfObject);
  }
  
  public void setProgressTintList(ColorStateList paramColorStateList)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramColorStateList;
    m54207b69.F54207b69_00(5369, arrayOfObject);
  }
  
  public void setProgressTintMode(PorterDuff.Mode paramMode)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMode;
    m54207b69.F54207b69_00(5370, arrayOfObject);
  }
  
  public void setSecondaryProgressTintList(ColorStateList paramColorStateList)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramColorStateList;
    m54207b69.F54207b69_00(5371, arrayOfObject);
  }
  
  public void setSecondaryProgressTintMode(PorterDuff.Mode paramMode)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMode;
    m54207b69.F54207b69_00(5372, arrayOfObject);
  }
  
  public void setShowProgressBackground(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(5373, arrayOfObject);
  }
  
  public void setSupportIndeterminateTintList(ColorStateList paramColorStateList)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramColorStateList;
    m54207b69.F54207b69_00(5374, arrayOfObject);
  }
  
  public void setSupportIndeterminateTintMode(PorterDuff.Mode paramMode)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMode;
    m54207b69.F54207b69_00(5375, arrayOfObject);
  }
  
  public void setSupportProgressBackgroundTintList(ColorStateList paramColorStateList)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramColorStateList;
    m54207b69.F54207b69_00(5376, arrayOfObject);
  }
  
  public void setSupportProgressBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMode;
    m54207b69.F54207b69_00(5377, arrayOfObject);
  }
  
  public void setSupportProgressTintList(ColorStateList paramColorStateList)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramColorStateList;
    m54207b69.F54207b69_00(5378, arrayOfObject);
  }
  
  public void setSupportProgressTintMode(PorterDuff.Mode paramMode)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMode;
    m54207b69.F54207b69_00(5379, arrayOfObject);
  }
  
  public void setSupportSecondaryProgressTintList(ColorStateList paramColorStateList)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramColorStateList;
    m54207b69.F54207b69_00(5380, arrayOfObject);
  }
  
  public void setSupportSecondaryProgressTintMode(PorterDuff.Mode paramMode)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramMode;
    m54207b69.F54207b69_00(5381, arrayOfObject);
  }
  
  public void setUseIntrinsicPadding(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(5382, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.xuexiang.xui.widget.progress.materialprogressbar.MaterialProgressBar
 * JD-Core Version:    0.7.0.1
 */
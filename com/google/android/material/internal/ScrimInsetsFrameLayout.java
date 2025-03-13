package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;

public class ScrimInsetsFrameLayout
  extends FrameLayout
{
  private boolean drawBottomInsetForeground;
  private boolean drawLeftInsetForeground;
  private boolean drawRightInsetForeground;
  private boolean drawTopInsetForeground;
  Drawable insetForeground;
  Rect insets;
  private Rect tempRect;
  
  public ScrimInsetsFrameLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ScrimInsetsFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ScrimInsetsFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.tempRect = localRect;
    boolean bool = true;
    this.drawTopInsetForeground = bool;
    this.drawBottomInsetForeground = bool;
    this.drawLeftInsetForeground = bool;
    this.drawRightInsetForeground = bool;
    int[] arrayOfInt1 = R.styleable.ScrimInsetsFrameLayout;
    int i = R.style.Widget_Design_ScrimInsetsFrameLayout;
    int[] arrayOfInt2 = new int[0];
    paramContext = ThemeEnforcement.obtainStyledAttributes(paramContext, paramAttributeSet, arrayOfInt1, paramInt, i, arrayOfInt2);
    int j = R.styleable.ScrimInsetsFrameLayout_insetForeground;
    paramAttributeSet = paramContext.getDrawable(j);
    this.insetForeground = paramAttributeSet;
    paramContext.recycle();
    setWillNotDraw(bool);
    paramContext = new com/google/android/material/internal/ScrimInsetsFrameLayout$1;
    paramContext.<init>(this);
    ViewCompat.o00000O0(this, paramContext);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i = getWidth();
    int j = getHeight();
    Object localObject1 = this.insets;
    if (localObject1 != null)
    {
      localObject1 = this.insetForeground;
      if (localObject1 != null)
      {
        int k = paramCanvas.save();
        float f1 = getScrollX();
        float f2 = getScrollY();
        paramCanvas.translate(f1, f2);
        boolean bool = this.drawTopInsetForeground;
        int m = 0;
        f2 = 0.0F;
        Rect localRect1 = null;
        Object localObject2;
        int n;
        Rect localRect2;
        if (bool)
        {
          localObject2 = this.tempRect;
          n = this.insets.top;
          ((Rect)localObject2).set(0, 0, i, n);
          localObject2 = this.insetForeground;
          localRect2 = this.tempRect;
          ((Drawable)localObject2).setBounds(localRect2);
          localObject2 = this.insetForeground;
          ((Drawable)localObject2).draw(paramCanvas);
        }
        bool = this.drawBottomInsetForeground;
        if (bool)
        {
          localObject2 = this.tempRect;
          n = this.insets.bottom;
          n = j - n;
          ((Rect)localObject2).set(0, n, i, j);
          localObject2 = this.insetForeground;
          localRect2 = this.tempRect;
          ((Drawable)localObject2).setBounds(localRect2);
          localObject2 = this.insetForeground;
          ((Drawable)localObject2).draw(paramCanvas);
        }
        bool = this.drawLeftInsetForeground;
        int i1;
        if (bool)
        {
          localObject2 = this.tempRect;
          localRect2 = this.insets;
          i1 = localRect2.top;
          int i2 = localRect2.left;
          n = localRect2.bottom;
          n = j - n;
          ((Rect)localObject2).set(0, i1, i2, n);
          localObject2 = this.insetForeground;
          localRect1 = this.tempRect;
          ((Drawable)localObject2).setBounds(localRect1);
          localObject2 = this.insetForeground;
          ((Drawable)localObject2).draw(paramCanvas);
        }
        bool = this.drawRightInsetForeground;
        if (bool)
        {
          localObject2 = this.tempRect;
          localRect1 = this.insets;
          n = localRect1.right;
          n = i - n;
          i1 = localRect1.top;
          m = localRect1.bottom;
          j -= m;
          ((Rect)localObject2).set(n, i1, i, j);
          Drawable localDrawable = this.insetForeground;
          Rect localRect3 = this.tempRect;
          localDrawable.setBounds(localRect3);
          localDrawable = this.insetForeground;
          localDrawable.draw(paramCanvas);
        }
        paramCanvas.restoreToCount(k);
      }
    }
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    Drawable localDrawable = this.insetForeground;
    if (localDrawable != null) {
      localDrawable.setCallback(this);
    }
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Drawable localDrawable = this.insetForeground;
    if (localDrawable != null) {
      localDrawable.setCallback(null);
    }
  }
  
  public void onInsetsChanged(WindowInsetsCompat paramWindowInsetsCompat) {}
  
  public void setDrawBottomInsetForeground(boolean paramBoolean)
  {
    this.drawBottomInsetForeground = paramBoolean;
  }
  
  public void setDrawLeftInsetForeground(boolean paramBoolean)
  {
    this.drawLeftInsetForeground = paramBoolean;
  }
  
  public void setDrawRightInsetForeground(boolean paramBoolean)
  {
    this.drawRightInsetForeground = paramBoolean;
  }
  
  public void setDrawTopInsetForeground(boolean paramBoolean)
  {
    this.drawTopInsetForeground = paramBoolean;
  }
  
  public void setScrimInsetForeground(Drawable paramDrawable)
  {
    this.insetForeground = paramDrawable;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.ScrimInsetsFrameLayout
 * JD-Core Version:    0.7.0.1
 */
package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

class RoundRectDrawable
  extends Drawable
{
  public PorterDuffColorFilter OooO;
  public float OooO00o;
  public final Paint OooO0O0;
  public final RectF OooO0OO;
  public final Rect OooO0Oo;
  public boolean OooO0o = false;
  public float OooO0o0;
  public boolean OooO0oO = true;
  public ColorStateList OooO0oo;
  public ColorStateList OooOO0;
  public PorterDuff.Mode OooOO0O;
  
  public RoundRectDrawable(ColorStateList paramColorStateList, float paramFloat)
  {
    PorterDuff.Mode localMode = PorterDuff.Mode.SRC_IN;
    this.OooOO0O = localMode;
    this.OooO00o = paramFloat;
    Paint localPaint = new android/graphics/Paint;
    localPaint.<init>(5);
    this.OooO0O0 = localPaint;
    setBackground(paramColorStateList);
    paramColorStateList = new android/graphics/RectF;
    paramColorStateList.<init>();
    this.OooO0OO = paramColorStateList;
    paramColorStateList = new android/graphics/Rect;
    paramColorStateList.<init>();
    this.OooO0Oo = paramColorStateList;
  }
  
  private void setBackground(ColorStateList paramColorStateList)
  {
    if (paramColorStateList == null)
    {
      i = 0;
      paramColorStateList = ColorStateList.valueOf(0);
    }
    this.OooO0oo = paramColorStateList;
    Paint localPaint = this.OooO0O0;
    int[] arrayOfInt = getState();
    int j = this.OooO0oo.getDefaultColor();
    int i = paramColorStateList.getColorForState(arrayOfInt, j);
    localPaint.setColor(i);
  }
  
  public final PorterDuffColorFilter OooO00o(ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    if ((paramColorStateList != null) && (paramMode != null))
    {
      Object localObject = getState();
      int i = paramColorStateList.getColorForState((int[])localObject, 0);
      localObject = new android/graphics/PorterDuffColorFilter;
      ((PorterDuffColorFilter)localObject).<init>(i, paramMode);
      return localObject;
    }
    return null;
  }
  
  public void OooO0O0(float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
  {
    float f = this.OooO0o0;
    boolean bool = paramFloat < f;
    if (!bool)
    {
      bool = this.OooO0o;
      if (bool == paramBoolean1)
      {
        bool = this.OooO0oO;
        if (bool == paramBoolean2) {
          return;
        }
      }
    }
    this.OooO0o0 = paramFloat;
    this.OooO0o = paramBoolean1;
    this.OooO0oO = paramBoolean2;
    OooO0OO(null);
    invalidateSelf();
  }
  
  public final void OooO0OO(Rect paramRect)
  {
    if (paramRect == null) {
      paramRect = getBounds();
    }
    Object localObject = this.OooO0OO;
    int i = paramRect.left;
    float f1 = i;
    int j = paramRect.top;
    float f2 = j;
    int k = paramRect.right;
    float f3 = k;
    int m = paramRect.bottom;
    float f4 = m;
    ((RectF)localObject).set(f1, f2, f3, f4);
    localObject = this.OooO0Oo;
    ((Rect)localObject).set(paramRect);
    boolean bool3 = this.OooO0o;
    if (bool3)
    {
      float f5 = this.OooO0o0;
      float f6 = this.OooO00o;
      boolean bool1 = this.OooO0oO;
      f5 = RoundRectDrawableWithShadow.OooO0Oo(f5, f6, bool1);
      f6 = this.OooO0o0;
      f1 = this.OooO00o;
      boolean bool2 = this.OooO0oO;
      f6 = RoundRectDrawableWithShadow.OooO0OO(f6, f1, bool2);
      Rect localRect = this.OooO0Oo;
      int i1 = (int)Math.ceil(f6);
      double d = Math.ceil(f5);
      int n = (int)d;
      localRect.inset(i1, n);
      paramRect = this.OooO0OO;
      localObject = this.OooO0Oo;
      paramRect.set((Rect)localObject);
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    Paint localPaint = this.OooO0O0;
    Object localObject = this.OooO;
    if (localObject != null)
    {
      localObject = localPaint.getColorFilter();
      if (localObject == null)
      {
        localObject = this.OooO;
        localPaint.setColorFilter((ColorFilter)localObject);
        i = 1;
        break label45;
      }
    }
    int i = 0;
    localObject = null;
    label45:
    RectF localRectF = this.OooO0OO;
    float f = this.OooO00o;
    paramCanvas.drawRoundRect(localRectF, f, f, localPaint);
    if (i != 0)
    {
      paramCanvas = null;
      localPaint.setColorFilter(null);
    }
  }
  
  public ColorStateList getColor()
  {
    return this.OooO0oo;
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public void getOutline(Outline paramOutline)
  {
    Rect localRect = this.OooO0Oo;
    float f = this.OooO00o;
    paramOutline.setRoundRect(localRect, f);
  }
  
  public float getPadding()
  {
    return this.OooO0o0;
  }
  
  public float getRadius()
  {
    return this.OooO00o;
  }
  
  public boolean isStateful()
  {
    ColorStateList localColorStateList = this.OooOO0;
    if (localColorStateList != null)
    {
      bool = localColorStateList.isStateful();
      if (bool) {}
    }
    else
    {
      localColorStateList = this.OooO0oo;
      if (localColorStateList != null)
      {
        bool = localColorStateList.isStateful();
        if (bool) {}
      }
      else
      {
        bool = super.isStateful();
        if (!bool) {
          break label50;
        }
      }
    }
    boolean bool = true;
    return bool;
    label50:
    bool = false;
    localColorStateList = null;
    return bool;
  }
  
  public void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    OooO0OO(paramRect);
  }
  
  public boolean onStateChange(int[] paramArrayOfInt)
  {
    Object localObject1 = this.OooO0oo;
    int i = ((ColorStateList)localObject1).getDefaultColor();
    int j = ((ColorStateList)localObject1).getColorForState(paramArrayOfInt, i);
    localObject1 = this.OooO0O0;
    int k = ((Paint)localObject1).getColor();
    i = 1;
    if (j != k)
    {
      k = i;
    }
    else
    {
      k = 0;
      localObject1 = null;
    }
    Object localObject2;
    if (k != 0)
    {
      localObject2 = this.OooO0O0;
      ((Paint)localObject2).setColor(j);
    }
    paramArrayOfInt = this.OooOO0;
    if (paramArrayOfInt != null)
    {
      localObject2 = this.OooOO0O;
      if (localObject2 != null)
      {
        paramArrayOfInt = OooO00o(paramArrayOfInt, (PorterDuff.Mode)localObject2);
        this.OooO = paramArrayOfInt;
        return i;
      }
    }
    return k;
  }
  
  public void setAlpha(int paramInt)
  {
    this.OooO0O0.setAlpha(paramInt);
  }
  
  public void setColor(ColorStateList paramColorStateList)
  {
    setBackground(paramColorStateList);
    invalidateSelf();
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.OooO0O0.setColorFilter(paramColorFilter);
  }
  
  public void setRadius(float paramFloat)
  {
    float f = this.OooO00o;
    boolean bool = paramFloat < f;
    if (!bool) {
      return;
    }
    this.OooO00o = paramFloat;
    OooO0OO(null);
    invalidateSelf();
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    this.OooOO0 = paramColorStateList;
    PorterDuff.Mode localMode = this.OooOO0O;
    paramColorStateList = OooO00o(paramColorStateList, localMode);
    this.OooO = paramColorStateList;
    invalidateSelf();
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    this.OooOO0O = paramMode;
    ColorStateList localColorStateList = this.OooOO0;
    paramMode = OooO00o(localColorStateList, paramMode);
    this.OooO = paramMode;
    invalidateSelf();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.cardview.widget.RoundRectDrawable
 * JD-Core Version:    0.7.0.1
 */
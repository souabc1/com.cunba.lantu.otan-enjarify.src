package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

public abstract class RoundedBitmapDrawable
  extends Drawable
{
  public final RectF OooO;
  public final Bitmap OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public final Paint OooO0Oo;
  public final Matrix OooO0o;
  public final BitmapShader OooO0o0;
  public float OooO0oO;
  public final Rect OooO0oo;
  public boolean OooOO0;
  public boolean OooOO0O;
  public int OooOO0o;
  public int OooOOO0;
  
  public static boolean OooO0OO(float paramFloat)
  {
    float f = 0.05F;
    boolean bool = paramFloat < f;
    if (bool)
    {
      bool = true;
      paramFloat = 1.4E-45F;
    }
    else
    {
      bool = false;
      paramFloat = 0.0F;
    }
    return bool;
  }
  
  public final void OooO00o()
  {
    Bitmap localBitmap = this.OooO00o;
    int i = this.OooO0O0;
    int j = localBitmap.getScaledWidth(i);
    this.OooOO0o = j;
    localBitmap = this.OooO00o;
    i = this.OooO0O0;
    j = localBitmap.getScaledHeight(i);
    this.OooOOO0 = j;
  }
  
  public void OooO0O0(int paramInt1, int paramInt2, int paramInt3, Rect paramRect1, Rect paramRect2)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public final void OooO0Oo()
  {
    int i = this.OooOOO0;
    int j = this.OooOO0o;
    float f = Math.min(i, j) / 2;
    this.OooO0oO = f;
  }
  
  public void OooO0o0()
  {
    boolean bool = this.OooOO0;
    if (bool)
    {
      bool = this.OooOO0O;
      int m;
      Rect localRect1;
      Object localObject1;
      int n;
      int i1;
      Object localObject4;
      float f1;
      if (bool)
      {
        int i = this.OooOO0o;
        int j = this.OooOOO0;
        int k = Math.min(i, j);
        m = this.OooO0OO;
        localRect1 = getBounds();
        Rect localRect2 = this.OooO0oo;
        localObject1 = this;
        n = k;
        OooO0O0(m, k, k, localRect1, localRect2);
        localObject2 = this.OooO0oo;
        i = ((Rect)localObject2).width();
        j = this.OooO0oo.height();
        i = Math.min(i, j);
        localObject3 = this.OooO0oo;
        j = (((Rect)localObject3).width() - i) / 2;
        j = Math.max(0, j);
        localObject1 = this.OooO0oo;
        i1 = (((Rect)localObject1).height() - i) / 2;
        i1 = Math.max(0, i1);
        localObject4 = this.OooO0oo;
        ((Rect)localObject4).inset(j, i1);
        j = 1056964608;
        f1 = 0.5F;
        float f2 = i * f1;
        this.OooO0oO = f2;
      }
      else
      {
        i1 = this.OooO0OO;
        m = this.OooOO0o;
        n = this.OooOOO0;
        Rect localRect3 = getBounds();
        localRect1 = this.OooO0oo;
        localObject3 = this;
        OooO0O0(i1, m, n, localRect3, localRect1);
      }
      Object localObject2 = this.OooO;
      Object localObject3 = this.OooO0oo;
      ((RectF)localObject2).set((Rect)localObject3);
      localObject2 = this.OooO0o0;
      if (localObject2 != null)
      {
        localObject2 = this.OooO0o;
        localObject3 = this.OooO;
        float f3 = ((RectF)localObject3).left;
        f1 = ((RectF)localObject3).top;
        ((Matrix)localObject2).setTranslate(f3, f1);
        localObject2 = this.OooO0o;
        f1 = this.OooO.width();
        i1 = this.OooO00o.getWidth();
        f3 = i1;
        f1 /= f3;
        localObject1 = this.OooO;
        f3 = ((RectF)localObject1).height();
        localObject4 = this.OooO00o;
        m = ((Bitmap)localObject4).getHeight();
        float f4 = m;
        f3 /= f4;
        ((Matrix)localObject2).preScale(f1, f3);
        localObject2 = this.OooO0o0;
        localObject3 = this.OooO0o;
        ((Shader)localObject2).setLocalMatrix((Matrix)localObject3);
        localObject2 = this.OooO0Oo;
        localObject3 = this.OooO0o0;
        ((Paint)localObject2).setShader((Shader)localObject3);
      }
      this.OooOO0 = false;
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    Object localObject1 = this.OooO00o;
    if (localObject1 == null) {
      return;
    }
    OooO0o0();
    Object localObject2 = this.OooO0Oo.getShader();
    Paint localPaint;
    if (localObject2 == null)
    {
      localObject2 = this.OooO0oo;
      localPaint = this.OooO0Oo;
      paramCanvas.drawBitmap((Bitmap)localObject1, null, (Rect)localObject2, localPaint);
    }
    else
    {
      localObject1 = this.OooO;
      float f = this.OooO0oO;
      localPaint = this.OooO0Oo;
      paramCanvas.drawRoundRect((RectF)localObject1, f, f, localPaint);
    }
  }
  
  public int getAlpha()
  {
    return this.OooO0Oo.getAlpha();
  }
  
  public final Bitmap getBitmap()
  {
    return this.OooO00o;
  }
  
  public ColorFilter getColorFilter()
  {
    return this.OooO0Oo.getColorFilter();
  }
  
  public float getCornerRadius()
  {
    return this.OooO0oO;
  }
  
  public int getGravity()
  {
    return this.OooO0OO;
  }
  
  public int getIntrinsicHeight()
  {
    return this.OooOOO0;
  }
  
  public int getIntrinsicWidth()
  {
    return this.OooOO0o;
  }
  
  public int getOpacity()
  {
    int i = this.OooO0OO;
    int k = 119;
    int m = -3;
    if (i == k)
    {
      boolean bool1 = this.OooOO0O;
      if (!bool1)
      {
        Object localObject = this.OooO00o;
        if (localObject != null)
        {
          bool1 = ((Bitmap)localObject).hasAlpha();
          if (!bool1)
          {
            localObject = this.OooO0Oo;
            int j = ((Paint)localObject).getAlpha();
            k = 255;
            if (j >= k)
            {
              float f = this.OooO0oO;
              boolean bool2 = OooO0OO(f);
              if (!bool2) {
                m = -1;
              }
            }
          }
        }
      }
    }
    return m;
  }
  
  public final Paint getPaint()
  {
    return this.OooO0Oo;
  }
  
  public boolean isCircular()
  {
    return this.OooOO0O;
  }
  
  public void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    boolean bool = this.OooOO0O;
    if (bool) {
      OooO0Oo();
    }
    this.OooOO0 = true;
  }
  
  public void setAlpha(int paramInt)
  {
    Paint localPaint = this.OooO0Oo;
    int i = localPaint.getAlpha();
    if (paramInt != i)
    {
      localPaint = this.OooO0Oo;
      localPaint.setAlpha(paramInt);
      invalidateSelf();
    }
  }
  
  public void setAntiAlias(boolean paramBoolean)
  {
    this.OooO0Oo.setAntiAlias(paramBoolean);
    invalidateSelf();
  }
  
  public void setCircular(boolean paramBoolean)
  {
    this.OooOO0O = paramBoolean;
    boolean bool = true;
    this.OooOO0 = bool;
    Paint localPaint;
    if (paramBoolean)
    {
      OooO0Oo();
      localPaint = this.OooO0Oo;
      BitmapShader localBitmapShader = this.OooO0o0;
      localPaint.setShader(localBitmapShader);
      invalidateSelf();
    }
    else
    {
      paramBoolean = false;
      localPaint = null;
      setCornerRadius(0.0F);
    }
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.OooO0Oo.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
  
  public void setCornerRadius(float paramFloat)
  {
    float f = this.OooO0oO;
    boolean bool = f < paramFloat;
    if (!bool) {
      return;
    }
    f = 0.0F;
    Paint localPaint = null;
    this.OooOO0O = false;
    bool = OooO0OO(paramFloat);
    BitmapShader localBitmapShader;
    if (bool)
    {
      localPaint = this.OooO0Oo;
      localBitmapShader = this.OooO0o0;
    }
    else
    {
      localPaint = this.OooO0Oo;
      localBitmapShader = null;
    }
    localPaint.setShader(localBitmapShader);
    this.OooO0oO = paramFloat;
    invalidateSelf();
  }
  
  public void setDither(boolean paramBoolean)
  {
    this.OooO0Oo.setDither(paramBoolean);
    invalidateSelf();
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    this.OooO0Oo.setFilterBitmap(paramBoolean);
    invalidateSelf();
  }
  
  public void setGravity(int paramInt)
  {
    int i = this.OooO0OO;
    if (i != paramInt)
    {
      this.OooO0OO = paramInt;
      paramInt = 1;
      this.OooOO0 = paramInt;
      invalidateSelf();
    }
  }
  
  public void setMipMap(boolean paramBoolean)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>();
    throw localUnsupportedOperationException;
  }
  
  public void setTargetDensity(int paramInt)
  {
    int i = this.OooO0O0;
    if (i != paramInt)
    {
      if (paramInt == 0) {
        paramInt = 160;
      }
      this.OooO0O0 = paramInt;
      Bitmap localBitmap = this.OooO00o;
      if (localBitmap != null) {
        OooO00o();
      }
      invalidateSelf();
    }
  }
  
  public void setTargetDensity(Canvas paramCanvas)
  {
    int i = paramCanvas.getDensity();
    setTargetDensity(i);
  }
  
  public void setTargetDensity(DisplayMetrics paramDisplayMetrics)
  {
    int i = paramDisplayMetrics.densityDpi;
    setTargetDensity(i);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.graphics.drawable.RoundedBitmapDrawable
 * JD-Core Version:    0.7.0.1
 */
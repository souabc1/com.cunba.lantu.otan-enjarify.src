package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

class VectorDrawableCompat$VectorDrawableCompatState
  extends Drawable.ConstantState
{
  public int OooO;
  public int OooO00o;
  public VectorDrawableCompat.VPathRenderer OooO0O0;
  public ColorStateList OooO0OO;
  public PorterDuff.Mode OooO0Oo;
  public Bitmap OooO0o;
  public boolean OooO0o0;
  public ColorStateList OooO0oO;
  public PorterDuff.Mode OooO0oo;
  public boolean OooOO0;
  public boolean OooOO0O;
  public Paint OooOO0o;
  
  public VectorDrawableCompat$VectorDrawableCompatState()
  {
    this.OooO0OO = null;
    Object localObject = VectorDrawableCompat.o00OoooO;
    this.OooO0Oo = ((PorterDuff.Mode)localObject);
    localObject = new androidx/vectordrawable/graphics/drawable/VectorDrawableCompat$VPathRenderer;
    ((VectorDrawableCompat.VPathRenderer)localObject).<init>();
    this.OooO0O0 = ((VectorDrawableCompat.VPathRenderer)localObject);
  }
  
  public VectorDrawableCompat$VectorDrawableCompatState(VectorDrawableCompatState paramVectorDrawableCompatState)
  {
    int i = 0;
    this.OooO0OO = null;
    Object localObject1 = VectorDrawableCompat.o00OoooO;
    this.OooO0Oo = ((PorterDuff.Mode)localObject1);
    if (paramVectorDrawableCompatState != null)
    {
      i = paramVectorDrawableCompatState.OooO00o;
      this.OooO00o = i;
      localObject1 = new androidx/vectordrawable/graphics/drawable/VectorDrawableCompat$VPathRenderer;
      Object localObject2 = paramVectorDrawableCompatState.OooO0O0;
      ((VectorDrawableCompat.VPathRenderer)localObject1).<init>((VectorDrawableCompat.VPathRenderer)localObject2);
      this.OooO0O0 = ((VectorDrawableCompat.VPathRenderer)localObject1);
      localObject2 = paramVectorDrawableCompatState.OooO0O0.OooO0o0;
      Paint localPaint;
      if (localObject2 != null)
      {
        localObject2 = new android/graphics/Paint;
        localPaint = paramVectorDrawableCompatState.OooO0O0.OooO0o0;
        ((Paint)localObject2).<init>(localPaint);
        ((VectorDrawableCompat.VPathRenderer)localObject1).OooO0o0 = ((Paint)localObject2);
      }
      localObject1 = paramVectorDrawableCompatState.OooO0O0.OooO0Oo;
      if (localObject1 != null)
      {
        localObject1 = this.OooO0O0;
        localObject2 = new android/graphics/Paint;
        localPaint = paramVectorDrawableCompatState.OooO0O0.OooO0Oo;
        ((Paint)localObject2).<init>(localPaint);
        ((VectorDrawableCompat.VPathRenderer)localObject1).OooO0Oo = ((Paint)localObject2);
      }
      localObject1 = paramVectorDrawableCompatState.OooO0OO;
      this.OooO0OO = ((ColorStateList)localObject1);
      localObject1 = paramVectorDrawableCompatState.OooO0Oo;
      this.OooO0Oo = ((PorterDuff.Mode)localObject1);
      boolean bool = paramVectorDrawableCompatState.OooO0o0;
      this.OooO0o0 = bool;
    }
  }
  
  public void OooO(int paramInt1, int paramInt2)
  {
    this.OooO0o.eraseColor(0);
    Canvas localCanvas = new android/graphics/Canvas;
    Bitmap localBitmap = this.OooO0o;
    localCanvas.<init>(localBitmap);
    this.OooO0O0.OooO0O0(localCanvas, paramInt1, paramInt2, null);
  }
  
  public boolean OooO00o(int paramInt1, int paramInt2)
  {
    Bitmap localBitmap1 = this.OooO0o;
    int i = localBitmap1.getWidth();
    if (paramInt1 == i)
    {
      Bitmap localBitmap2 = this.OooO0o;
      paramInt1 = localBitmap2.getHeight();
      if (paramInt2 == paramInt1) {
        return true;
      }
    }
    return false;
  }
  
  public boolean OooO0O0()
  {
    boolean bool1 = this.OooOO0O;
    if (!bool1)
    {
      Object localObject1 = this.OooO0oO;
      Object localObject2 = this.OooO0OO;
      if (localObject1 == localObject2)
      {
        localObject1 = this.OooO0oo;
        localObject2 = this.OooO0Oo;
        if (localObject1 == localObject2)
        {
          bool1 = this.OooOO0;
          boolean bool2 = this.OooO0o0;
          if (bool1 == bool2)
          {
            int i = this.OooO;
            localObject2 = this.OooO0O0;
            int j = ((VectorDrawableCompat.VPathRenderer)localObject2).getRootAlpha();
            if (i == j) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }
  
  public void OooO0OO(int paramInt1, int paramInt2)
  {
    Object localObject = this.OooO0o;
    if (localObject != null)
    {
      boolean bool = OooO00o(paramInt1, paramInt2);
      if (bool) {}
    }
    else
    {
      localObject = Bitmap.Config.ARGB_8888;
      Bitmap localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, (Bitmap.Config)localObject);
      this.OooO0o = localBitmap;
      paramInt1 = 1;
      this.OooOO0O = paramInt1;
    }
  }
  
  public void OooO0Oo(Canvas paramCanvas, ColorFilter paramColorFilter, Rect paramRect)
  {
    paramColorFilter = OooO0o0(paramColorFilter);
    Bitmap localBitmap = this.OooO0o;
    paramCanvas.drawBitmap(localBitmap, null, paramRect, paramColorFilter);
  }
  
  public boolean OooO0o()
  {
    VectorDrawableCompat.VPathRenderer localVPathRenderer = this.OooO0O0;
    int i = localVPathRenderer.getRootAlpha();
    int j = 255;
    if (i < j)
    {
      i = 1;
    }
    else
    {
      i = 0;
      localVPathRenderer = null;
    }
    return i;
  }
  
  public Paint OooO0o0(ColorFilter paramColorFilter)
  {
    boolean bool1 = OooO0o();
    if ((!bool1) && (paramColorFilter == null)) {
      return null;
    }
    Paint localPaint = this.OooOO0o;
    if (localPaint == null)
    {
      localPaint = new android/graphics/Paint;
      localPaint.<init>();
      this.OooOO0o = localPaint;
      boolean bool2 = true;
      localPaint.setFilterBitmap(bool2);
    }
    localPaint = this.OooOO0o;
    int i = this.OooO0O0.getRootAlpha();
    localPaint.setAlpha(i);
    this.OooOO0o.setColorFilter(paramColorFilter);
    return this.OooOO0o;
  }
  
  public boolean OooO0oO(int[] paramArrayOfInt)
  {
    boolean bool1 = this.OooO0O0.OooO0o(paramArrayOfInt);
    boolean bool2 = this.OooOO0O | bool1;
    this.OooOO0O = bool2;
    return bool1;
  }
  
  public void OooO0oo()
  {
    Object localObject = this.OooO0OO;
    this.OooO0oO = ((ColorStateList)localObject);
    localObject = this.OooO0Oo;
    this.OooO0oo = ((PorterDuff.Mode)localObject);
    int i = this.OooO0O0.getRootAlpha();
    this.OooO = i;
    boolean bool = this.OooO0o0;
    this.OooOO0 = bool;
    this.OooOO0O = false;
  }
  
  public int getChangingConfigurations()
  {
    return this.OooO00o;
  }
  
  public boolean isStateful()
  {
    return this.OooO0O0.isStateful();
  }
  
  public Drawable newDrawable()
  {
    VectorDrawableCompat localVectorDrawableCompat = new androidx/vectordrawable/graphics/drawable/VectorDrawableCompat;
    localVectorDrawableCompat.<init>(this);
    return localVectorDrawableCompat;
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    paramResources = new androidx/vectordrawable/graphics/drawable/VectorDrawableCompat;
    paramResources.<init>(this);
    return paramResources;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState
 * JD-Core Version:    0.7.0.1
 */
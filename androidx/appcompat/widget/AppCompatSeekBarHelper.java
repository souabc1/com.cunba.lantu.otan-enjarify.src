package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsSeekBar;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import androidx.appcompat.R.styleable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;

class AppCompatSeekBarHelper
  extends AppCompatProgressBarHelper
{
  public boolean OooO = false;
  public final SeekBar OooO0Oo;
  public ColorStateList OooO0o = null;
  public Drawable OooO0o0;
  public PorterDuff.Mode OooO0oO = null;
  public boolean OooO0oo = false;
  
  public AppCompatSeekBarHelper(SeekBar paramSeekBar)
  {
    super(paramSeekBar);
    this.OooO0Oo = paramSeekBar;
  }
  
  public void OooO00o(AttributeSet paramAttributeSet, int paramInt)
  {
    super.OooO00o(paramAttributeSet, paramInt);
    Object localObject1 = this.OooO0Oo.getContext();
    Object localObject2 = R.styleable.AppCompatSeekBar;
    localObject1 = TintTypedArray.OooOOOO((Context)localObject1, paramAttributeSet, (int[])localObject2, paramInt, 0);
    localObject2 = this.OooO0Oo;
    Context localContext = ((View)localObject2).getContext();
    int[] arrayOfInt = R.styleable.AppCompatSeekBar;
    TypedArray localTypedArray = ((TintTypedArray)localObject1).getWrappedTypeArray();
    ViewCompat.o00ooo((View)localObject2, localContext, arrayOfInt, paramAttributeSet, localTypedArray, paramInt, 0);
    int i = R.styleable.AppCompatSeekBar_android_thumb;
    paramAttributeSet = ((TintTypedArray)localObject1).getDrawableIfKnown(i);
    if (paramAttributeSet != null)
    {
      SeekBar localSeekBar = this.OooO0Oo;
      localSeekBar.setThumb(paramAttributeSet);
    }
    i = R.styleable.AppCompatSeekBar_tickMark;
    paramAttributeSet = ((TintTypedArray)localObject1).getDrawable(i);
    setTickMark(paramAttributeSet);
    i = R.styleable.AppCompatSeekBar_tickMarkTintMode;
    boolean bool1 = ((TintTypedArray)localObject1).OooOO0o(i);
    paramInt = 1;
    if (bool1)
    {
      j = R.styleable.AppCompatSeekBar_tickMarkTintMode;
      int m = -1;
      j = ((TintTypedArray)localObject1).OooO0oo(j, m);
      localObject2 = this.OooO0oO;
      paramAttributeSet = DrawableUtils.OooO0o0(j, (PorterDuff.Mode)localObject2);
      this.OooO0oO = paramAttributeSet;
      this.OooO = paramInt;
    }
    int j = R.styleable.AppCompatSeekBar_tickMarkTint;
    boolean bool2 = ((TintTypedArray)localObject1).OooOO0o(j);
    if (bool2)
    {
      int k = R.styleable.AppCompatSeekBar_tickMarkTint;
      paramAttributeSet = ((TintTypedArray)localObject1).getColorStateList(k);
      this.OooO0o = paramAttributeSet;
      this.OooO0oo = paramInt;
    }
    ((TintTypedArray)localObject1).OooOOOo();
    OooO0Oo();
  }
  
  public final void OooO0Oo()
  {
    Drawable localDrawable = this.OooO0o0;
    if (localDrawable != null)
    {
      boolean bool1 = this.OooO0oo;
      if (!bool1)
      {
        bool1 = this.OooO;
        if (!bool1) {}
      }
      else
      {
        localDrawable = DrawableCompat.OooOOo(localDrawable.mutate());
        this.OooO0o0 = localDrawable;
        bool1 = this.OooO0oo;
        Object localObject;
        if (bool1)
        {
          localObject = this.OooO0o;
          DrawableCompat.OooOOOO(localDrawable, (ColorStateList)localObject);
        }
        boolean bool2 = this.OooO;
        if (bool2)
        {
          localDrawable = this.OooO0o0;
          localObject = this.OooO0oO;
          DrawableCompat.OooOOOo(localDrawable, (PorterDuff.Mode)localObject);
        }
        localDrawable = this.OooO0o0;
        bool2 = localDrawable.isStateful();
        if (bool2)
        {
          localDrawable = this.OooO0o0;
          localObject = this.OooO0Oo.getDrawableState();
          localDrawable.setState((int[])localObject);
        }
      }
    }
  }
  
  public void OooO0o()
  {
    Drawable localDrawable = this.OooO0o0;
    if (localDrawable != null)
    {
      boolean bool = localDrawable.isStateful();
      if (bool)
      {
        Object localObject = this.OooO0Oo.getDrawableState();
        bool = localDrawable.setState((int[])localObject);
        if (bool)
        {
          localObject = this.OooO0Oo;
          ((View)localObject).invalidateDrawable(localDrawable);
        }
      }
    }
  }
  
  public void OooO0o0(Canvas paramCanvas)
  {
    Object localObject1 = this.OooO0o0;
    if (localObject1 != null)
    {
      localObject1 = this.OooO0Oo;
      int i = ((ProgressBar)localObject1).getMax();
      int j = 1;
      float f1 = 1.4E-45F;
      if (i > j)
      {
        Object localObject2 = this.OooO0o0;
        int k = ((Drawable)localObject2).getIntrinsicWidth();
        Drawable localDrawable = this.OooO0o0;
        int m = localDrawable.getIntrinsicHeight();
        if (k >= 0)
        {
          k /= 2;
        }
        else
        {
          k = j;
          f2 = f1;
        }
        if (m >= 0) {
          j = m / 2;
        }
        localDrawable = this.OooO0o0;
        int n = -k;
        int i1 = -j;
        localDrawable.setBounds(n, i1, k, j);
        SeekBar localSeekBar1 = this.OooO0Oo;
        j = localSeekBar1.getWidth();
        k = this.OooO0Oo.getPaddingLeft();
        j -= k;
        localObject2 = this.OooO0Oo;
        k = ((View)localObject2).getPaddingRight();
        j -= k;
        f1 = j;
        float f2 = i;
        f1 /= f2;
        k = paramCanvas.save();
        float f3 = this.OooO0Oo.getPaddingLeft();
        SeekBar localSeekBar2 = this.OooO0Oo;
        n = localSeekBar2.getHeight() / 2;
        float f4 = n;
        paramCanvas.translate(f3, f4);
        m = 0;
        f3 = 0.0F;
        localDrawable = null;
        while (m <= i)
        {
          this.OooO0o0.draw(paramCanvas);
          n = 0;
          f4 = 0.0F;
          localSeekBar2 = null;
          paramCanvas.translate(f1, 0.0F);
          m += 1;
        }
        paramCanvas.restoreToCount(k);
      }
    }
  }
  
  public void OooO0oO()
  {
    Drawable localDrawable = this.OooO0o0;
    if (localDrawable != null) {
      localDrawable.jumpToCurrentState();
    }
  }
  
  public Drawable getTickMark()
  {
    return this.OooO0o0;
  }
  
  public ColorStateList getTickMarkTintList()
  {
    return this.OooO0o;
  }
  
  public PorterDuff.Mode getTickMarkTintMode()
  {
    return this.OooO0oO;
  }
  
  public void setTickMark(Drawable paramDrawable)
  {
    Object localObject = this.OooO0o0;
    if (localObject != null) {
      ((Drawable)localObject).setCallback(null);
    }
    this.OooO0o0 = paramDrawable;
    if (paramDrawable != null)
    {
      localObject = this.OooO0Oo;
      paramDrawable.setCallback((Drawable.Callback)localObject);
      localObject = this.OooO0Oo;
      int i = ViewCompat.OooOoOO((View)localObject);
      DrawableCompat.OooOOO0(paramDrawable, i);
      boolean bool = paramDrawable.isStateful();
      if (bool)
      {
        localObject = this.OooO0Oo.getDrawableState();
        paramDrawable.setState((int[])localObject);
      }
      OooO0Oo();
    }
    this.OooO0Oo.invalidate();
  }
  
  public void setTickMarkTintList(ColorStateList paramColorStateList)
  {
    this.OooO0o = paramColorStateList;
    this.OooO0oo = true;
    OooO0Oo();
  }
  
  public void setTickMarkTintMode(PorterDuff.Mode paramMode)
  {
    this.OooO0oO = paramMode;
    this.OooO = true;
    OooO0Oo();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatSeekBarHelper
 * JD-Core Version:    0.7.0.1
 */
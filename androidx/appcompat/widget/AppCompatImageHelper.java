package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;

public class AppCompatImageHelper
{
  public final ImageView OooO00o;
  public TintInfo OooO0O0;
  public TintInfo OooO0OO;
  public TintInfo OooO0Oo;
  public int OooO0o0 = 0;
  
  public AppCompatImageHelper(ImageView paramImageView)
  {
    this.OooO00o = paramImageView;
  }
  
  public final boolean OooO00o(Drawable paramDrawable)
  {
    TintInfo localTintInfo = this.OooO0Oo;
    if (localTintInfo == null)
    {
      localTintInfo = new androidx/appcompat/widget/TintInfo;
      localTintInfo.<init>();
      this.OooO0Oo = localTintInfo;
    }
    localTintInfo = this.OooO0Oo;
    localTintInfo.OooO00o();
    Object localObject = ImageViewCompat.OooO00o(this.OooO00o);
    boolean bool1 = true;
    if (localObject != null)
    {
      localTintInfo.OooO0Oo = bool1;
      localTintInfo.OooO00o = ((ColorStateList)localObject);
    }
    localObject = ImageViewCompat.OooO0O0(this.OooO00o);
    if (localObject != null)
    {
      localTintInfo.OooO0OO = bool1;
      localTintInfo.OooO0O0 = ((PorterDuff.Mode)localObject);
    }
    boolean bool2 = localTintInfo.OooO0Oo;
    if (!bool2)
    {
      bool2 = localTintInfo.OooO0OO;
      if (!bool2) {
        return false;
      }
    }
    localObject = this.OooO00o.getDrawableState();
    AppCompatDrawableManager.OooO0oo(paramDrawable, localTintInfo, (int[])localObject);
    return bool1;
  }
  
  public void OooO0O0()
  {
    Drawable localDrawable = this.OooO00o.getDrawable();
    if (localDrawable != null)
    {
      localDrawable = this.OooO00o.getDrawable();
      int i = this.OooO0o0;
      localDrawable.setLevel(i);
    }
  }
  
  public void OooO0OO()
  {
    Drawable localDrawable = this.OooO00o.getDrawable();
    if (localDrawable != null) {
      DrawableUtils.OooO0O0(localDrawable);
    }
    if (localDrawable != null)
    {
      boolean bool = OooO0oO();
      if (bool)
      {
        bool = OooO00o(localDrawable);
        if (bool) {
          return;
        }
      }
      TintInfo localTintInfo = this.OooO0OO;
      int[] arrayOfInt;
      if (localTintInfo != null)
      {
        arrayOfInt = this.OooO00o.getDrawableState();
        AppCompatDrawableManager.OooO0oo(localDrawable, localTintInfo, arrayOfInt);
      }
      else
      {
        localTintInfo = this.OooO0O0;
        if (localTintInfo != null)
        {
          arrayOfInt = this.OooO00o.getDrawableState();
          AppCompatDrawableManager.OooO0oo(localDrawable, localTintInfo, arrayOfInt);
        }
      }
    }
  }
  
  public boolean OooO0Oo()
  {
    Drawable localDrawable = this.OooO00o.getBackground();
    boolean bool = localDrawable instanceof RippleDrawable;
    return !bool;
  }
  
  public void OooO0o(Drawable paramDrawable)
  {
    int i = paramDrawable.getLevel();
    this.OooO0o0 = i;
  }
  
  public void OooO0o0(AttributeSet paramAttributeSet, int paramInt)
  {
    Object localObject1 = this.OooO00o.getContext();
    Object localObject2 = R.styleable.AppCompatImageView;
    localObject1 = TintTypedArray.OooOOOO((Context)localObject1, paramAttributeSet, (int[])localObject2, paramInt, 0);
    localObject2 = this.OooO00o;
    Context localContext = ((View)localObject2).getContext();
    int[] arrayOfInt = R.styleable.AppCompatImageView;
    TypedArray localTypedArray = ((TintTypedArray)localObject1).getWrappedTypeArray();
    ViewCompat.o00ooo((View)localObject2, localContext, arrayOfInt, paramAttributeSet, localTypedArray, paramInt, 0);
    try
    {
      paramAttributeSet = this.OooO00o;
      paramAttributeSet = paramAttributeSet.getDrawable();
      paramInt = -1;
      int i;
      if (paramAttributeSet == null)
      {
        i = R.styleable.AppCompatImageView_srcCompat;
        i = ((TintTypedArray)localObject1).OooOO0O(i, paramInt);
        if (i != paramInt)
        {
          paramAttributeSet = this.OooO00o;
          paramAttributeSet = paramAttributeSet.getContext();
          paramAttributeSet = AppCompatResources.OooO0O0(paramAttributeSet, i);
          if (paramAttributeSet != null)
          {
            localObject2 = this.OooO00o;
            ((ImageView)localObject2).setImageDrawable(paramAttributeSet);
          }
        }
      }
      if (paramAttributeSet != null) {
        DrawableUtils.OooO0O0(paramAttributeSet);
      }
      int j = R.styleable.AppCompatImageView_tint;
      boolean bool1 = ((TintTypedArray)localObject1).OooOO0o(j);
      if (bool1)
      {
        paramAttributeSet = this.OooO00o;
        i = R.styleable.AppCompatImageView_tint;
        localObject2 = ((TintTypedArray)localObject1).getColorStateList(i);
        ImageViewCompat.OooO0OO(paramAttributeSet, (ColorStateList)localObject2);
      }
      int k = R.styleable.AppCompatImageView_tintMode;
      boolean bool2 = ((TintTypedArray)localObject1).OooOO0o(k);
      if (bool2)
      {
        paramAttributeSet = this.OooO00o;
        i = R.styleable.AppCompatImageView_tintMode;
        paramInt = ((TintTypedArray)localObject1).OooO0oo(i, paramInt);
        i = 0;
        localObject2 = null;
        PorterDuff.Mode localMode = DrawableUtils.OooO0o0(paramInt, null);
        ImageViewCompat.OooO0Oo(paramAttributeSet, localMode);
      }
      return;
    }
    finally
    {
      ((TintTypedArray)localObject1).OooOOOo();
    }
  }
  
  public final boolean OooO0oO()
  {
    TintInfo localTintInfo = this.OooO0O0;
    boolean bool;
    if (localTintInfo != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localTintInfo = null;
    }
    return bool;
  }
  
  public ColorStateList getSupportImageTintList()
  {
    Object localObject = this.OooO0OO;
    if (localObject != null) {
      localObject = ((TintInfo)localObject).OooO00o;
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public PorterDuff.Mode getSupportImageTintMode()
  {
    Object localObject = this.OooO0OO;
    if (localObject != null) {
      localObject = ((TintInfo)localObject).OooO0O0;
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public void setImageResource(int paramInt)
  {
    Object localObject1;
    Object localObject2;
    if (paramInt != 0)
    {
      localObject1 = this.OooO00o.getContext();
      localObject2 = AppCompatResources.OooO0O0((Context)localObject1, paramInt);
      if (localObject2 != null) {
        DrawableUtils.OooO0O0((Drawable)localObject2);
      }
      localObject1 = this.OooO00o;
      ((ImageView)localObject1).setImageDrawable((Drawable)localObject2);
    }
    else
    {
      localObject2 = this.OooO00o;
      localObject1 = null;
      ((ImageView)localObject2).setImageDrawable(null);
    }
    OooO0OO();
  }
  
  public void setInternalImageTint(ColorStateList paramColorStateList)
  {
    boolean bool;
    if (paramColorStateList != null)
    {
      TintInfo localTintInfo = this.OooO0O0;
      if (localTintInfo == null)
      {
        localTintInfo = new androidx/appcompat/widget/TintInfo;
        localTintInfo.<init>();
        this.OooO0O0 = localTintInfo;
      }
      localTintInfo = this.OooO0O0;
      localTintInfo.OooO00o = paramColorStateList;
      bool = true;
      localTintInfo.OooO0Oo = bool;
    }
    else
    {
      bool = false;
      paramColorStateList = null;
      this.OooO0O0 = null;
    }
    OooO0OO();
  }
  
  public void setSupportImageTintList(ColorStateList paramColorStateList)
  {
    TintInfo localTintInfo = this.OooO0OO;
    if (localTintInfo == null)
    {
      localTintInfo = new androidx/appcompat/widget/TintInfo;
      localTintInfo.<init>();
      this.OooO0OO = localTintInfo;
    }
    localTintInfo = this.OooO0OO;
    localTintInfo.OooO00o = paramColorStateList;
    localTintInfo.OooO0Oo = true;
    OooO0OO();
  }
  
  public void setSupportImageTintMode(PorterDuff.Mode paramMode)
  {
    TintInfo localTintInfo = this.OooO0OO;
    if (localTintInfo == null)
    {
      localTintInfo = new androidx/appcompat/widget/TintInfo;
      localTintInfo.<init>();
      this.OooO0OO = localTintInfo;
    }
    localTintInfo = this.OooO0OO;
    localTintInfo.OooO0O0 = paramMode;
    localTintInfo.OooO0OO = true;
    OooO0OO();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatImageHelper
 * JD-Core Version:    0.7.0.1
 */
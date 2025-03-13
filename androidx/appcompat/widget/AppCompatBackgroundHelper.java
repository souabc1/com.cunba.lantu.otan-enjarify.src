package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R.styleable;
import androidx.core.view.ViewCompat;

class AppCompatBackgroundHelper
{
  public final View OooO00o;
  public final AppCompatDrawableManager OooO0O0;
  public int OooO0OO = -1;
  public TintInfo OooO0Oo;
  public TintInfo OooO0o;
  public TintInfo OooO0o0;
  
  public AppCompatBackgroundHelper(View paramView)
  {
    this.OooO00o = paramView;
    paramView = AppCompatDrawableManager.get();
    this.OooO0O0 = paramView;
  }
  
  public final boolean OooO00o(Drawable paramDrawable)
  {
    TintInfo localTintInfo = this.OooO0o;
    if (localTintInfo == null)
    {
      localTintInfo = new androidx/appcompat/widget/TintInfo;
      localTintInfo.<init>();
      this.OooO0o = localTintInfo;
    }
    localTintInfo = this.OooO0o;
    localTintInfo.OooO00o();
    Object localObject = ViewCompat.OooOOo(this.OooO00o);
    boolean bool1 = true;
    if (localObject != null)
    {
      localTintInfo.OooO0Oo = bool1;
      localTintInfo.OooO00o = ((ColorStateList)localObject);
    }
    localObject = ViewCompat.OooOOoo(this.OooO00o);
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
    Drawable localDrawable = this.OooO00o.getBackground();
    if (localDrawable != null)
    {
      boolean bool = OooO0o();
      if (bool)
      {
        bool = OooO00o(localDrawable);
        if (bool) {
          return;
        }
      }
      TintInfo localTintInfo = this.OooO0o0;
      int[] arrayOfInt;
      if (localTintInfo != null)
      {
        arrayOfInt = this.OooO00o.getDrawableState();
        AppCompatDrawableManager.OooO0oo(localDrawable, localTintInfo, arrayOfInt);
      }
      else
      {
        localTintInfo = this.OooO0Oo;
        if (localTintInfo != null)
        {
          arrayOfInt = this.OooO00o.getDrawableState();
          AppCompatDrawableManager.OooO0oo(localDrawable, localTintInfo, arrayOfInt);
        }
      }
    }
  }
  
  public void OooO0OO(AttributeSet paramAttributeSet, int paramInt)
  {
    Object localObject1 = this.OooO00o.getContext();
    Object localObject2 = R.styleable.ViewBackgroundHelper;
    int i = 0;
    localObject1 = TintTypedArray.OooOOOO((Context)localObject1, paramAttributeSet, (int[])localObject2, paramInt, 0);
    localObject2 = this.OooO00o;
    Context localContext = ((View)localObject2).getContext();
    int[] arrayOfInt = R.styleable.ViewBackgroundHelper;
    TypedArray localTypedArray = ((TintTypedArray)localObject1).getWrappedTypeArray();
    ViewCompat.o00ooo((View)localObject2, localContext, arrayOfInt, paramAttributeSet, localTypedArray, paramInt, 0);
    try
    {
      int j = R.styleable.ViewBackgroundHelper_android_background;
      boolean bool1 = ((TintTypedArray)localObject1).OooOO0o(j);
      paramInt = -1;
      if (bool1)
      {
        k = R.styleable.ViewBackgroundHelper_android_background;
        k = ((TintTypedArray)localObject1).OooOO0O(k, paramInt);
        this.OooO0OO = k;
        paramAttributeSet = this.OooO0O0;
        localObject2 = this.OooO00o;
        localObject2 = ((View)localObject2).getContext();
        i = this.OooO0OO;
        paramAttributeSet = paramAttributeSet.OooO0o0((Context)localObject2, i);
        if (paramAttributeSet != null) {
          setInternalBackgroundTint(paramAttributeSet);
        }
      }
      int k = R.styleable.ViewBackgroundHelper_backgroundTint;
      boolean bool2 = ((TintTypedArray)localObject1).OooOO0o(k);
      int n;
      if (bool2)
      {
        paramAttributeSet = this.OooO00o;
        n = R.styleable.ViewBackgroundHelper_backgroundTint;
        localObject2 = ((TintTypedArray)localObject1).getColorStateList(n);
        ViewCompat.o0OOO0o(paramAttributeSet, (ColorStateList)localObject2);
      }
      int m = R.styleable.ViewBackgroundHelper_backgroundTintMode;
      boolean bool3 = ((TintTypedArray)localObject1).OooOO0o(m);
      if (bool3)
      {
        paramAttributeSet = this.OooO00o;
        n = R.styleable.ViewBackgroundHelper_backgroundTintMode;
        paramInt = ((TintTypedArray)localObject1).OooO0oo(n, paramInt);
        n = 0;
        localObject2 = null;
        PorterDuff.Mode localMode = DrawableUtils.OooO0o0(paramInt, null);
        ViewCompat.o0Oo0oo(paramAttributeSet, localMode);
      }
      return;
    }
    finally
    {
      ((TintTypedArray)localObject1).OooOOOo();
    }
  }
  
  public void OooO0Oo(Drawable paramDrawable)
  {
    this.OooO0OO = -1;
    setInternalBackgroundTint(null);
    OooO0O0();
  }
  
  public final boolean OooO0o()
  {
    TintInfo localTintInfo = this.OooO0Oo;
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
  
  public void OooO0o0(int paramInt)
  {
    this.OooO0OO = paramInt;
    AppCompatDrawableManager localAppCompatDrawableManager = this.OooO0O0;
    ColorStateList localColorStateList;
    if (localAppCompatDrawableManager != null)
    {
      Context localContext = this.OooO00o.getContext();
      localColorStateList = localAppCompatDrawableManager.OooO0o0(localContext, paramInt);
    }
    else
    {
      paramInt = 0;
      localColorStateList = null;
    }
    setInternalBackgroundTint(localColorStateList);
    OooO0O0();
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = this.OooO0o0;
    if (localObject != null) {
      localObject = ((TintInfo)localObject).OooO00o;
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = this.OooO0o0;
    if (localObject != null) {
      localObject = ((TintInfo)localObject).OooO0O0;
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public void setInternalBackgroundTint(ColorStateList paramColorStateList)
  {
    boolean bool;
    if (paramColorStateList != null)
    {
      TintInfo localTintInfo = this.OooO0Oo;
      if (localTintInfo == null)
      {
        localTintInfo = new androidx/appcompat/widget/TintInfo;
        localTintInfo.<init>();
        this.OooO0Oo = localTintInfo;
      }
      localTintInfo = this.OooO0Oo;
      localTintInfo.OooO00o = paramColorStateList;
      bool = true;
      localTintInfo.OooO0Oo = bool;
    }
    else
    {
      bool = false;
      paramColorStateList = null;
      this.OooO0Oo = null;
    }
    OooO0O0();
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    TintInfo localTintInfo = this.OooO0o0;
    if (localTintInfo == null)
    {
      localTintInfo = new androidx/appcompat/widget/TintInfo;
      localTintInfo.<init>();
      this.OooO0o0 = localTintInfo;
    }
    localTintInfo = this.OooO0o0;
    localTintInfo.OooO00o = paramColorStateList;
    localTintInfo.OooO0Oo = true;
    OooO0O0();
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    TintInfo localTintInfo = this.OooO0o0;
    if (localTintInfo == null)
    {
      localTintInfo = new androidx/appcompat/widget/TintInfo;
      localTintInfo.<init>();
      this.OooO0o0 = localTintInfo;
    }
    localTintInfo = this.OooO0o0;
    localTintInfo.OooO0O0 = paramMode;
    localTintInfo.OooO0OO = true;
    OooO0O0();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatBackgroundHelper
 * JD-Core Version:    0.7.0.1
 */
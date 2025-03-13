package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.CompoundButtonCompat;

class AppCompatCompoundButtonHelper
{
  public final CompoundButton OooO00o;
  public ColorStateList OooO0O0 = null;
  public PorterDuff.Mode OooO0OO = null;
  public boolean OooO0Oo = false;
  public boolean OooO0o;
  public boolean OooO0o0 = false;
  
  public AppCompatCompoundButtonHelper(CompoundButton paramCompoundButton)
  {
    this.OooO00o = paramCompoundButton;
  }
  
  public void OooO00o()
  {
    Drawable localDrawable = CompoundButtonCompat.OooO00o(this.OooO00o);
    if (localDrawable != null)
    {
      boolean bool = this.OooO0Oo;
      if (!bool)
      {
        bool = this.OooO0o0;
        if (!bool) {}
      }
      else
      {
        localDrawable = DrawableCompat.OooOOo(localDrawable).mutate();
        bool = this.OooO0Oo;
        if (bool)
        {
          localObject = this.OooO0O0;
          DrawableCompat.OooOOOO(localDrawable, (ColorStateList)localObject);
        }
        bool = this.OooO0o0;
        if (bool)
        {
          localObject = this.OooO0OO;
          DrawableCompat.OooOOOo(localDrawable, (PorterDuff.Mode)localObject);
        }
        bool = localDrawable.isStateful();
        if (bool)
        {
          localObject = this.OooO00o.getDrawableState();
          localDrawable.setState((int[])localObject);
        }
        Object localObject = this.OooO00o;
        ((CompoundButton)localObject).setButtonDrawable(localDrawable);
      }
    }
  }
  
  public void OooO0O0(AttributeSet paramAttributeSet, int paramInt)
  {
    Object localObject1 = this.OooO00o.getContext();
    Object localObject2 = R.styleable.CompoundButton;
    localObject1 = TintTypedArray.OooOOOO((Context)localObject1, paramAttributeSet, (int[])localObject2, paramInt, 0);
    CompoundButton localCompoundButton = this.OooO00o;
    Context localContext = localCompoundButton.getContext();
    int[] arrayOfInt = R.styleable.CompoundButton;
    TypedArray localTypedArray = ((TintTypedArray)localObject1).getWrappedTypeArray();
    ViewCompat.o00ooo(localCompoundButton, localContext, arrayOfInt, paramAttributeSet, localTypedArray, paramInt, 0);
    try
    {
      int i = R.styleable.CompoundButton_buttonCompat;
      boolean bool1 = ((TintTypedArray)localObject1).OooOO0o(i);
      Object localObject3;
      if (bool1)
      {
        j = R.styleable.CompoundButton_buttonCompat;
        j = ((TintTypedArray)localObject1).OooOO0O(j, 0);
        if (j != 0) {
          try
          {
            localObject3 = this.OooO00o;
            localObject2 = ((View)localObject3).getContext();
            paramAttributeSet = AppCompatResources.OooO0O0((Context)localObject2, j);
            ((CompoundButton)localObject3).setButtonDrawable(paramAttributeSet);
            j = 1;
          }
          catch (Resources.NotFoundException localNotFoundException) {}
        }
      }
      int j = 0;
      paramAttributeSet = null;
      if (j == 0)
      {
        j = R.styleable.CompoundButton_android_button;
        boolean bool2 = ((TintTypedArray)localObject1).OooOO0o(j);
        if (bool2)
        {
          k = R.styleable.CompoundButton_android_button;
          k = ((TintTypedArray)localObject1).OooOO0O(k, 0);
          if (k != 0)
          {
            localObject3 = this.OooO00o;
            localObject2 = ((View)localObject3).getContext();
            paramAttributeSet = AppCompatResources.OooO0O0((Context)localObject2, k);
            ((CompoundButton)localObject3).setButtonDrawable(paramAttributeSet);
          }
        }
      }
      int k = R.styleable.CompoundButton_buttonTint;
      boolean bool3 = ((TintTypedArray)localObject1).OooOO0o(k);
      if (bool3)
      {
        paramAttributeSet = this.OooO00o;
        paramInt = R.styleable.CompoundButton_buttonTint;
        localObject3 = ((TintTypedArray)localObject1).getColorStateList(paramInt);
        CompoundButtonCompat.OooO0Oo(paramAttributeSet, (ColorStateList)localObject3);
      }
      int m = R.styleable.CompoundButton_buttonTintMode;
      boolean bool4 = ((TintTypedArray)localObject1).OooOO0o(m);
      if (bool4)
      {
        paramAttributeSet = this.OooO00o;
        paramInt = R.styleable.CompoundButton_buttonTintMode;
        int n = -1;
        paramInt = ((TintTypedArray)localObject1).OooO0oo(paramInt, n);
        n = 0;
        localObject2 = null;
        localObject3 = DrawableUtils.OooO0o0(paramInt, null);
        CompoundButtonCompat.OooO0o0(paramAttributeSet, (PorterDuff.Mode)localObject3);
      }
      return;
    }
    finally
    {
      ((TintTypedArray)localObject1).OooOOOo();
    }
  }
  
  public void OooO0OO()
  {
    boolean bool = this.OooO0o;
    if (bool)
    {
      this.OooO0o = false;
      return;
    }
    this.OooO0o = true;
    OooO00o();
  }
  
  public int getCompoundPaddingLeft(int paramInt)
  {
    return paramInt;
  }
  
  public ColorStateList getSupportButtonTintList()
  {
    return this.OooO0O0;
  }
  
  public PorterDuff.Mode getSupportButtonTintMode()
  {
    return this.OooO0OO;
  }
  
  public void setSupportButtonTintList(ColorStateList paramColorStateList)
  {
    this.OooO0O0 = paramColorStateList;
    this.OooO0Oo = true;
    OooO00o();
  }
  
  public void setSupportButtonTintMode(PorterDuff.Mode paramMode)
  {
    this.OooO0OO = paramMode;
    this.OooO0o0 = true;
    OooO00o();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatCompoundButtonHelper
 * JD-Core Version:    0.7.0.1
 */
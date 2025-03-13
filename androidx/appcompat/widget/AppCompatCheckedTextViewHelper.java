package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.CheckedTextViewCompat;

class AppCompatCheckedTextViewHelper
{
  public final CheckedTextView OooO00o;
  public ColorStateList OooO0O0 = null;
  public PorterDuff.Mode OooO0OO = null;
  public boolean OooO0Oo = false;
  public boolean OooO0o;
  public boolean OooO0o0 = false;
  
  public AppCompatCheckedTextViewHelper(CheckedTextView paramCheckedTextView)
  {
    this.OooO00o = paramCheckedTextView;
  }
  
  public void OooO00o()
  {
    Drawable localDrawable = CheckedTextViewCompat.OooO00o(this.OooO00o);
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
        ((CheckedTextView)localObject).setCheckMarkDrawable(localDrawable);
      }
    }
  }
  
  public void OooO0O0(AttributeSet paramAttributeSet, int paramInt)
  {
    Object localObject1 = this.OooO00o.getContext();
    Object localObject2 = R.styleable.CheckedTextView;
    localObject1 = TintTypedArray.OooOOOO((Context)localObject1, paramAttributeSet, (int[])localObject2, paramInt, 0);
    CheckedTextView localCheckedTextView = this.OooO00o;
    Context localContext = localCheckedTextView.getContext();
    int[] arrayOfInt = R.styleable.CheckedTextView;
    TypedArray localTypedArray = ((TintTypedArray)localObject1).getWrappedTypeArray();
    ViewCompat.o00ooo(localCheckedTextView, localContext, arrayOfInt, paramAttributeSet, localTypedArray, paramInt, 0);
    try
    {
      int i = R.styleable.CheckedTextView_checkMarkCompat;
      boolean bool1 = ((TintTypedArray)localObject1).OooOO0o(i);
      Object localObject3;
      if (bool1)
      {
        j = R.styleable.CheckedTextView_checkMarkCompat;
        j = ((TintTypedArray)localObject1).OooOO0O(j, 0);
        if (j != 0) {
          try
          {
            localObject3 = this.OooO00o;
            localObject2 = ((View)localObject3).getContext();
            paramAttributeSet = AppCompatResources.OooO0O0((Context)localObject2, j);
            ((CheckedTextView)localObject3).setCheckMarkDrawable(paramAttributeSet);
            j = 1;
          }
          catch (Resources.NotFoundException localNotFoundException) {}
        }
      }
      int j = 0;
      paramAttributeSet = null;
      if (j == 0)
      {
        j = R.styleable.CheckedTextView_android_checkMark;
        boolean bool2 = ((TintTypedArray)localObject1).OooOO0o(j);
        if (bool2)
        {
          k = R.styleable.CheckedTextView_android_checkMark;
          k = ((TintTypedArray)localObject1).OooOO0O(k, 0);
          if (k != 0)
          {
            localObject3 = this.OooO00o;
            localObject2 = ((View)localObject3).getContext();
            paramAttributeSet = AppCompatResources.OooO0O0((Context)localObject2, k);
            ((CheckedTextView)localObject3).setCheckMarkDrawable(paramAttributeSet);
          }
        }
      }
      int k = R.styleable.CheckedTextView_checkMarkTint;
      boolean bool3 = ((TintTypedArray)localObject1).OooOO0o(k);
      if (bool3)
      {
        paramAttributeSet = this.OooO00o;
        paramInt = R.styleable.CheckedTextView_checkMarkTint;
        localObject3 = ((TintTypedArray)localObject1).getColorStateList(paramInt);
        CheckedTextViewCompat.OooO0O0(paramAttributeSet, (ColorStateList)localObject3);
      }
      int m = R.styleable.CheckedTextView_checkMarkTintMode;
      boolean bool4 = ((TintTypedArray)localObject1).OooOO0o(m);
      if (bool4)
      {
        paramAttributeSet = this.OooO00o;
        paramInt = R.styleable.CheckedTextView_checkMarkTintMode;
        int n = -1;
        paramInt = ((TintTypedArray)localObject1).OooO0oo(paramInt, n);
        n = 0;
        localObject2 = null;
        localObject3 = DrawableUtils.OooO0o0(paramInt, null);
        CheckedTextViewCompat.OooO0OO(paramAttributeSet, (PorterDuff.Mode)localObject3);
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
  
  public ColorStateList getSupportCheckMarkTintList()
  {
    return this.OooO0O0;
  }
  
  public PorterDuff.Mode getSupportCheckMarkTintMode()
  {
    return this.OooO0OO;
  }
  
  public void setSupportCheckMarkTintList(ColorStateList paramColorStateList)
  {
    this.OooO0O0 = paramColorStateList;
    this.OooO0Oo = true;
    OooO00o();
  }
  
  public void setSupportCheckMarkTintMode(PorterDuff.Mode paramMode)
  {
    this.OooO0OO = paramMode;
    this.OooO0o0 = true;
    OooO00o();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatCheckedTextViewHelper
 * JD-Core Version:    0.7.0.1
 */
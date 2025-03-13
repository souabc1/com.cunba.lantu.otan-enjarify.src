package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.R.styleable;

public class Layer
  extends ConstraintHelper
{
  public float o00OoooO;
  public float o00Ooooo;
  public float o00o0;
  public float o00o00;
  public float o00o000;
  public ConstraintLayout o00o0000;
  public float o00o000O;
  public float o00o000o;
  public float o00o00O0;
  public float o00o00Oo;
  public boolean o00o00o;
  public float o00o00o0;
  public View[] o00o00oO;
  public float o00o00oo;
  public boolean o00o0O0;
  public boolean o00o0O00;
  public float o0O00o0;
  public float oo00oO;
  
  public void OooOO0(ConstraintLayout paramConstraintLayout)
  {
    OooO(paramConstraintLayout);
  }
  
  public void OooOOOO(AttributeSet paramAttributeSet)
  {
    super.OooOOOO(paramAttributeSet);
    int i = 0;
    this.o00Ooo0o = false;
    if (paramAttributeSet != null)
    {
      Context localContext = getContext();
      int[] arrayOfInt = R.styleable.ConstraintLayout_Layout;
      paramAttributeSet = localContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
      int j = paramAttributeSet.getIndexCount();
      while (i < j)
      {
        int k = paramAttributeSet.getIndex(i);
        int m = R.styleable.ConstraintLayout_Layout_android_visibility;
        boolean bool = true;
        if (k == m)
        {
          this.o00o0O00 = bool;
        }
        else
        {
          m = R.styleable.ConstraintLayout_Layout_android_elevation;
          if (k == m) {
            this.o00o0O0 = bool;
          }
        }
        i += 1;
      }
      paramAttributeSet.recycle();
    }
  }
  
  public void OooOOo(ConstraintLayout paramConstraintLayout)
  {
    OooOoO0();
    float f = 0.0F / 0.0F;
    this.o00o000o = f;
    this.oo00oO = f;
    paramConstraintLayout = ((ConstraintLayout.LayoutParams)getLayoutParams()).getConstraintWidget();
    paramConstraintLayout.setWidth(0);
    paramConstraintLayout.setHeight(0);
    OooOo();
    int i = (int)this.o00o00Oo;
    int j = getPaddingLeft();
    i -= j;
    j = (int)this.o00o00o0;
    int k = getPaddingTop();
    j -= k;
    k = (int)this.o00o00;
    int m = getPaddingRight();
    k += m;
    m = (int)this.o00o00O0;
    int n = getPaddingBottom();
    m += n;
    layout(i, j, k, m);
    OooOoO();
  }
  
  public void OooOo()
  {
    Object localObject1 = this.o00o0000;
    if (localObject1 == null) {
      return;
    }
    boolean bool = this.o00o00o;
    if (!bool)
    {
      f = this.o00o000o;
      bool = Float.isNaN(f);
      if (!bool)
      {
        f = this.oo00oO;
        bool = Float.isNaN(f);
        if (!bool) {
          return;
        }
      }
    }
    float f = this.o0O00o0;
    bool = Float.isNaN(f);
    if (!bool)
    {
      f = this.o00OoooO;
      bool = Float.isNaN(f);
      if (!bool)
      {
        f = this.o00OoooO;
        this.oo00oO = f;
        f = this.o0O00o0;
        this.o00o000o = f;
        return;
      }
    }
    localObject1 = this.o00o0000;
    localObject1 = OooOOO((ConstraintLayout)localObject1);
    int i = 0;
    Object localObject2 = localObject1[0];
    int j = localObject2.getLeft();
    Object localObject3 = localObject1[0];
    int k = localObject3.getTop();
    Object localObject4 = localObject1[0];
    int m = localObject4.getRight();
    Object localObject5 = localObject1[0];
    int n = localObject5.getBottom();
    for (;;)
    {
      int i1 = this.o00Ooo00;
      if (i >= i1) {
        break;
      }
      Object localObject6 = localObject1[i];
      int i2 = localObject6.getLeft();
      j = Math.min(j, i2);
      i2 = localObject6.getTop();
      k = Math.min(k, i2);
      i2 = localObject6.getRight();
      m = Math.max(m, i2);
      i1 = localObject6.getBottom();
      n = Math.max(n, i1);
      i += 1;
    }
    f = m;
    this.o00o00 = f;
    f = n;
    this.o00o00O0 = f;
    f = j;
    this.o00o00Oo = f;
    f = k;
    this.o00o00o0 = f;
    f = this.o0O00o0;
    bool = Float.isNaN(f);
    if (bool)
    {
      j = (j + m) / 2;
      f = j;
    }
    else
    {
      f = this.o0O00o0;
    }
    this.o00o000o = f;
    f = this.o00OoooO;
    bool = Float.isNaN(f);
    if (bool)
    {
      k = (k + n) / 2;
      f = k;
    }
    else
    {
      f = this.o00OoooO;
    }
    this.oo00oO = f;
  }
  
  public void OooOo00(ConstraintLayout paramConstraintLayout)
  {
    this.o00o0000 = paramConstraintLayout;
    float f1 = getRotation();
    float f2 = 0.0F;
    boolean bool = f1 < 0.0F;
    if (!bool)
    {
      f2 = this.o00Ooooo;
      bool = Float.isNaN(f2);
      if (bool) {}
    }
    else
    {
      this.o00Ooooo = f1;
    }
  }
  
  public final void OooOoO()
  {
    Object localObject = this.o00o0000;
    if (localObject == null) {
      return;
    }
    localObject = this.o00o00oO;
    if (localObject == null) {
      OooOoO0();
    }
    OooOo();
    float f1 = this.o00Ooooo;
    int i = Float.isNaN(f1);
    if (i != 0)
    {
      d1 = 0.0D;
    }
    else
    {
      f1 = this.o00Ooooo;
      d1 = Math.toRadians(f1);
    }
    double d2 = Math.sin(d1);
    float f2 = (float)d2;
    double d1 = Math.cos(d1);
    f1 = (float)d1;
    float f3 = this.o00o000;
    float f4 = f3 * f1;
    float f5 = this.o00o000O;
    float f6 = -f5 * f2;
    f3 *= f2;
    f5 *= f1;
    i = 0;
    f1 = 0.0F;
    localObject = null;
    for (;;)
    {
      int k = this.o00Ooo00;
      if (i >= k) {
        break;
      }
      View localView = this.o00o00oO[i];
      int m = localView.getLeft();
      int n = localView.getRight();
      m = (m + n) / 2;
      n = localView.getTop();
      int i1 = localView.getBottom();
      n = (n + i1) / 2;
      float f7 = m;
      float f8 = this.o00o000o;
      f7 -= f8;
      float f9 = n;
      f8 = this.oo00oO;
      f9 -= f8;
      f8 = f4 * f7;
      float f10 = f6 * f9;
      f8 = f8 + f10 - f7;
      f10 = this.o00o00oo;
      f8 += f10;
      f7 *= f3;
      f10 = f5 * f9;
      f7 = f7 + f10 - f9;
      f9 = this.o00o0;
      f7 += f9;
      localView.setTranslationX(f8);
      localView.setTranslationY(f7);
      f7 = this.o00o000O;
      localView.setScaleY(f7);
      f7 = this.o00o000;
      localView.setScaleX(f7);
      f7 = this.o00Ooooo;
      boolean bool = Float.isNaN(f7);
      if (!bool)
      {
        f7 = this.o00Ooooo;
        localView.setRotation(f7);
      }
      int j;
      i += 1;
    }
  }
  
  public final void OooOoO0()
  {
    Object localObject1 = this.o00o0000;
    if (localObject1 == null) {
      return;
    }
    int i = this.o00Ooo00;
    if (i == 0) {
      return;
    }
    Object localObject2 = this.o00o00oO;
    int j;
    if (localObject2 != null)
    {
      j = localObject2.length;
      if (j == i) {}
    }
    else
    {
      localObject1 = new View[i];
      this.o00o00oO = ((View[])localObject1);
    }
    i = 0;
    localObject1 = null;
    for (;;)
    {
      j = this.o00Ooo00;
      if (i >= j) {
        break;
      }
      j = this.o00OoOoo[i];
      View[] arrayOfView = this.o00o00oO;
      ConstraintLayout localConstraintLayout = this.o00o0000;
      localObject2 = localConstraintLayout.getViewById(j);
      arrayOfView[i] = localObject2;
      i += 1;
    }
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    ConstraintLayout localConstraintLayout1 = (ConstraintLayout)getParent();
    this.o00o0000 = localConstraintLayout1;
    boolean bool1 = this.o00o0O00;
    if (!bool1)
    {
      bool1 = this.o00o0O0;
      if (!bool1) {}
    }
    else
    {
      int i = getVisibility();
      float f1 = getElevation();
      int j = 0;
      for (;;)
      {
        int k = this.o00Ooo00;
        if (j >= k) {
          break;
        }
        k = this.o00OoOoo[j];
        ConstraintLayout localConstraintLayout2 = this.o00o0000;
        View localView = localConstraintLayout2.getViewById(k);
        if (localView != null)
        {
          boolean bool2 = this.o00o0O00;
          if (bool2) {
            localView.setVisibility(i);
          }
          bool2 = this.o00o0O0;
          if (bool2)
          {
            float f2 = 0.0F;
            localConstraintLayout2 = null;
            bool2 = f1 < 0.0F;
            if (bool2)
            {
              f2 = localView.getTranslationZ() + f1;
              localView.setTranslationZ(f2);
            }
          }
        }
        j += 1;
      }
    }
  }
  
  public void setElevation(float paramFloat)
  {
    super.setElevation(paramFloat);
    OooO0oo();
  }
  
  public void setPivotX(float paramFloat)
  {
    this.o0O00o0 = paramFloat;
    OooOoO();
  }
  
  public void setPivotY(float paramFloat)
  {
    this.o00OoooO = paramFloat;
    OooOoO();
  }
  
  public void setRotation(float paramFloat)
  {
    this.o00Ooooo = paramFloat;
    OooOoO();
  }
  
  public void setScaleX(float paramFloat)
  {
    this.o00o000 = paramFloat;
    OooOoO();
  }
  
  public void setScaleY(float paramFloat)
  {
    this.o00o000O = paramFloat;
    OooOoO();
  }
  
  public void setTranslationX(float paramFloat)
  {
    this.o00o00oo = paramFloat;
    OooOoO();
  }
  
  public void setTranslationY(float paramFloat)
  {
    this.o00o0 = paramFloat;
    OooOoO();
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    OooO0oo();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.helper.widget.Layer
 * JD-Core Version:    0.7.0.1
 */
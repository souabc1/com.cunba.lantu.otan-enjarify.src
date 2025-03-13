package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.util.SparseArray;
import androidx.core.graphics.drawable.DrawableCompat;

abstract class DrawableContainerCompat$DrawableContainerState
  extends Drawable.ConstantState
{
  public boolean OooO;
  public final DrawableContainerCompat OooO00o;
  public Resources OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  public SparseArray OooO0o;
  public int OooO0o0;
  public Drawable[] OooO0oO;
  public int OooO0oo;
  public boolean OooOO0;
  public Rect OooOO0O;
  public boolean OooOO0o;
  public int OooOOO;
  public boolean OooOOO0;
  public int OooOOOO;
  public int OooOOOo;
  public boolean OooOOo;
  public int OooOOo0;
  public int OooOOoo;
  public boolean OooOo;
  public boolean OooOo0;
  public boolean OooOo00;
  public boolean OooOo0O;
  public boolean OooOo0o;
  public int OooOoO;
  public boolean OooOoO0;
  public int OooOoOO;
  public boolean OooOoo;
  public int OooOoo0;
  public ColorFilter OooOooO;
  public boolean OooOooo;
  public boolean Oooo0;
  public ColorStateList Oooo000;
  public PorterDuff.Mode Oooo00O;
  public boolean Oooo00o;
  
  public DrawableContainerCompat$DrawableContainerState(DrawableContainerState paramDrawableContainerState, DrawableContainerCompat paramDrawableContainerCompat, Resources paramResources)
  {
    int i = 0;
    this.OooO = false;
    this.OooOO0o = false;
    boolean bool1 = true;
    this.OooOo = bool1;
    this.OooOoOO = 0;
    this.OooOoo0 = 0;
    this.OooO00o = paramDrawableContainerCompat;
    boolean bool2 = false;
    paramDrawableContainerCompat = null;
    Object localObject;
    int m;
    if (paramResources != null)
    {
      localObject = paramResources;
    }
    else if (paramDrawableContainerState != null)
    {
      localObject = paramDrawableContainerState.OooO0O0;
    }
    else
    {
      m = 0;
      localObject = null;
    }
    this.OooO0O0 = ((Resources)localObject);
    if (paramDrawableContainerState != null)
    {
      m = paramDrawableContainerState.OooO0OO;
    }
    else
    {
      m = 0;
      localObject = null;
    }
    int i2 = DrawableContainerCompat.OooO0o0(paramResources, m);
    this.OooO0OO = i2;
    if (paramDrawableContainerState != null)
    {
      m = paramDrawableContainerState.OooO0Oo;
      this.OooO0Oo = m;
      m = paramDrawableContainerState.OooO0o0;
      this.OooO0o0 = m;
      this.OooOo0O = bool1;
      this.OooOo0o = bool1;
      boolean bool5 = paramDrawableContainerState.OooO;
      this.OooO = bool5;
      bool5 = paramDrawableContainerState.OooOO0o;
      this.OooOO0o = bool5;
      bool5 = paramDrawableContainerState.OooOo;
      this.OooOo = bool5;
      bool5 = paramDrawableContainerState.OooOoO0;
      this.OooOoO0 = bool5;
      int n = paramDrawableContainerState.OooOoO;
      this.OooOoO = n;
      n = paramDrawableContainerState.OooOoOO;
      this.OooOoOO = n;
      n = paramDrawableContainerState.OooOoo0;
      this.OooOoo0 = n;
      boolean bool6 = paramDrawableContainerState.OooOoo;
      this.OooOoo = bool6;
      localObject = paramDrawableContainerState.OooOooO;
      this.OooOooO = ((ColorFilter)localObject);
      bool6 = paramDrawableContainerState.OooOooo;
      this.OooOooo = bool6;
      localObject = paramDrawableContainerState.Oooo000;
      this.Oooo000 = ((ColorStateList)localObject);
      localObject = paramDrawableContainerState.Oooo00O;
      this.Oooo00O = ((PorterDuff.Mode)localObject);
      bool6 = paramDrawableContainerState.Oooo00o;
      this.Oooo00o = bool6;
      bool6 = paramDrawableContainerState.Oooo0;
      this.Oooo0 = bool6;
      int i1 = paramDrawableContainerState.OooO0OO;
      if (i1 == i2)
      {
        boolean bool7 = paramDrawableContainerState.OooOO0;
        if (bool7)
        {
          paramResources = paramDrawableContainerState.OooOO0O;
          if (paramResources != null)
          {
            paramDrawableContainerCompat = new android/graphics/Rect;
            paramResources = paramDrawableContainerState.OooOO0O;
            paramDrawableContainerCompat.<init>(paramResources);
          }
          this.OooOO0O = paramDrawableContainerCompat;
          this.OooOO0 = bool1;
        }
        bool2 = paramDrawableContainerState.OooOOO0;
        if (bool2)
        {
          int j = paramDrawableContainerState.OooOOO;
          this.OooOOO = j;
          j = paramDrawableContainerState.OooOOOO;
          this.OooOOOO = j;
          j = paramDrawableContainerState.OooOOOo;
          this.OooOOOo = j;
          j = paramDrawableContainerState.OooOOo0;
          this.OooOOo0 = j;
          this.OooOOO0 = bool1;
        }
      }
      boolean bool3 = paramDrawableContainerState.OooOOo;
      if (bool3)
      {
        int k = paramDrawableContainerState.OooOOoo;
        this.OooOOoo = k;
        this.OooOOo = bool1;
      }
      boolean bool4 = paramDrawableContainerState.OooOo00;
      if (bool4)
      {
        bool4 = paramDrawableContainerState.OooOo0;
        this.OooOo0 = bool4;
        this.OooOo00 = bool1;
      }
      paramDrawableContainerCompat = paramDrawableContainerState.OooO0oO;
      paramResources = new Drawable[paramDrawableContainerCompat.length];
      this.OooO0oO = paramResources;
      int i3 = paramDrawableContainerState.OooO0oo;
      this.OooO0oo = i3;
      paramDrawableContainerState = paramDrawableContainerState.OooO0o;
      if (paramDrawableContainerState != null)
      {
        paramDrawableContainerState = paramDrawableContainerState.clone();
      }
      else
      {
        paramDrawableContainerState = new android/util/SparseArray;
        i3 = this.OooO0oo;
        paramDrawableContainerState.<init>(i3);
      }
      this.OooO0o = paramDrawableContainerState;
      i4 = this.OooO0oo;
      while (i < i4)
      {
        paramResources = paramDrawableContainerCompat[i];
        if (paramResources != null)
        {
          paramResources = paramResources.getConstantState();
          SparseArray localSparseArray;
          if (paramResources != null)
          {
            localSparseArray = this.OooO0o;
            localSparseArray.put(i, paramResources);
          }
          else
          {
            paramResources = this.OooO0oO;
            localSparseArray = paramDrawableContainerCompat[i];
            paramResources[i] = localSparseArray;
          }
        }
        i += 1;
      }
    }
    int i4 = 10;
    paramDrawableContainerState = new Drawable[i4];
    this.OooO0oO = paramDrawableContainerState;
    this.OooO0oo = 0;
  }
  
  public final Drawable OooO(Drawable paramDrawable)
  {
    int i = this.OooOoO;
    DrawableCompat.OooOOO0(paramDrawable, i);
    paramDrawable = paramDrawable.mutate();
    DrawableContainerCompat localDrawableContainerCompat = this.OooO00o;
    paramDrawable.setCallback(localDrawableContainerCompat);
    return paramDrawable;
  }
  
  public final int OooO00o(Drawable paramDrawable)
  {
    int i = this.OooO0oo;
    Drawable[] arrayOfDrawable = this.OooO0oO;
    int j = arrayOfDrawable.length;
    if (i >= j)
    {
      j = i + 10;
      OooO0o(i, j);
    }
    paramDrawable.mutate();
    int k = 1;
    paramDrawable.setVisible(false, k);
    DrawableContainerCompat localDrawableContainerCompat = this.OooO00o;
    paramDrawable.setCallback(localDrawableContainerCompat);
    this.OooO0oO[i] = paramDrawable;
    int n = this.OooO0oo + k;
    this.OooO0oo = n;
    int m = this.OooO0o0;
    int i1 = paramDrawable.getChangingConfigurations() | m;
    this.OooO0o0 = i1;
    OooO0oO();
    this.OooOO0O = null;
    this.OooOO0 = false;
    this.OooOOO0 = false;
    this.OooOo0O = false;
    return i;
  }
  
  public final void OooO0O0(Resources.Theme paramTheme)
  {
    if (paramTheme != null)
    {
      OooO0o0();
      int i = this.OooO0oo;
      Drawable[] arrayOfDrawable = this.OooO0oO;
      int j = 0;
      while (j < i)
      {
        Drawable localDrawable1 = arrayOfDrawable[j];
        if (localDrawable1 != null)
        {
          boolean bool = DrawableCompat.OooO0O0(localDrawable1);
          if (bool)
          {
            localDrawable1 = arrayOfDrawable[j];
            DrawableCompat.OooO00o(localDrawable1, paramTheme);
            int k = this.OooO0o0;
            Drawable localDrawable2 = arrayOfDrawable[j];
            int m = localDrawable2.getChangingConfigurations();
            k |= m;
            this.OooO0o0 = k;
          }
        }
        j += 1;
      }
      paramTheme = DrawableContainerCompat.Api21Impl.OooO0OO(paramTheme);
      OooOO0O(paramTheme);
    }
  }
  
  public boolean OooO0OO()
  {
    boolean bool = this.OooOo0O;
    if (bool) {
      return this.OooOo0o;
    }
    OooO0o0();
    bool = true;
    this.OooOo0O = bool;
    int i = this.OooO0oo;
    Drawable[] arrayOfDrawable = this.OooO0oO;
    int j = 0;
    while (j < i)
    {
      Drawable.ConstantState localConstantState = arrayOfDrawable[j].getConstantState();
      if (localConstantState == null)
      {
        this.OooOo0o = false;
        return false;
      }
      j += 1;
    }
    this.OooOo0o = bool;
    return bool;
  }
  
  public void OooO0Oo()
  {
    this.OooOOO0 = true;
    OooO0o0();
    int i = this.OooO0oo;
    Drawable[] arrayOfDrawable = this.OooO0oO;
    int j = -1;
    this.OooOOOO = j;
    this.OooOOO = j;
    j = 0;
    this.OooOOo0 = 0;
    this.OooOOOo = 0;
    while (j < i)
    {
      Drawable localDrawable = arrayOfDrawable[j];
      int k = localDrawable.getIntrinsicWidth();
      int m = this.OooOOO;
      if (k > m) {
        this.OooOOO = k;
      }
      k = localDrawable.getIntrinsicHeight();
      m = this.OooOOOO;
      if (k > m) {
        this.OooOOOO = k;
      }
      k = localDrawable.getMinimumWidth();
      m = this.OooOOOo;
      if (k > m) {
        this.OooOOOo = k;
      }
      int n = localDrawable.getMinimumHeight();
      k = this.OooOOo0;
      if (n > k) {
        this.OooOOo0 = n;
      }
      j += 1;
    }
  }
  
  public void OooO0o(int paramInt1, int paramInt2)
  {
    Drawable[] arrayOfDrawable1 = new Drawable[paramInt2];
    Drawable[] arrayOfDrawable2 = this.OooO0oO;
    if (arrayOfDrawable2 != null) {
      System.arraycopy(arrayOfDrawable2, 0, arrayOfDrawable1, 0, paramInt1);
    }
    this.OooO0oO = arrayOfDrawable1;
  }
  
  public final void OooO0o0()
  {
    SparseArray localSparseArray1 = this.OooO0o;
    if (localSparseArray1 != null)
    {
      int i = localSparseArray1.size();
      int j = 0;
      while (j < i)
      {
        SparseArray localSparseArray2 = this.OooO0o;
        int k = localSparseArray2.keyAt(j);
        Object localObject = (Drawable.ConstantState)this.OooO0o.valueAt(j);
        Drawable[] arrayOfDrawable = this.OooO0oO;
        Resources localResources = this.OooO0O0;
        localObject = ((Drawable.ConstantState)localObject).newDrawable(localResources);
        localObject = OooO((Drawable)localObject);
        arrayOfDrawable[k] = localObject;
        j += 1;
      }
      i = 0;
      localSparseArray1 = null;
      this.OooO0o = null;
    }
  }
  
  public void OooO0oO()
  {
    this.OooOOo = false;
    this.OooOo00 = false;
  }
  
  public void OooO0oo()
  {
    int i = this.OooO0oo;
    Drawable[] arrayOfDrawable = this.OooO0oO;
    int j = 0;
    while (j < i)
    {
      Drawable localDrawable = arrayOfDrawable[j];
      if (localDrawable != null) {
        localDrawable.mutate();
      }
      j += 1;
    }
    this.OooOoO0 = true;
  }
  
  public final boolean OooOO0(int paramInt1, int paramInt2)
  {
    int i = this.OooO0oo;
    Drawable[] arrayOfDrawable = this.OooO0oO;
    int j = 0;
    boolean bool1 = false;
    while (j < i)
    {
      Drawable localDrawable = arrayOfDrawable[j];
      if (localDrawable != null)
      {
        boolean bool2 = DrawableCompat.OooOOO0(localDrawable, paramInt1);
        if (j == paramInt2) {
          bool1 = bool2;
        }
      }
      j += 1;
    }
    this.OooOoO = paramInt1;
    return bool1;
  }
  
  public final void OooOO0O(Resources paramResources)
  {
    if (paramResources != null)
    {
      this.OooO0O0 = paramResources;
      int i = this.OooO0OO;
      int j = DrawableContainerCompat.OooO0o0(paramResources, i);
      i = this.OooO0OO;
      this.OooO0OO = j;
      if (i != j)
      {
        j = 0;
        paramResources = null;
        this.OooOOO0 = false;
        this.OooOO0 = false;
      }
    }
  }
  
  public boolean canApplyTheme()
  {
    int i = this.OooO0oo;
    Drawable[] arrayOfDrawable = this.OooO0oO;
    int j = 0;
    while (j < i)
    {
      Object localObject = arrayOfDrawable[j];
      boolean bool1 = true;
      boolean bool2;
      if (localObject != null)
      {
        bool2 = DrawableCompat.OooO0O0((Drawable)localObject);
        if (bool2) {
          return bool1;
        }
      }
      else
      {
        localObject = (Drawable.ConstantState)this.OooO0o.get(j);
        if (localObject != null)
        {
          bool2 = DrawableContainerCompat.Api21Impl.OooO00o((Drawable.ConstantState)localObject);
          if (bool2) {
            return bool1;
          }
        }
      }
      j += 1;
    }
    return false;
  }
  
  public final int getCapacity()
  {
    return this.OooO0oO.length;
  }
  
  public int getChangingConfigurations()
  {
    int i = this.OooO0Oo;
    int j = this.OooO0o0;
    return i | j;
  }
  
  public final Drawable getChild(int paramInt)
  {
    Object localObject1 = this.OooO0oO[paramInt];
    if (localObject1 != null) {
      return localObject1;
    }
    localObject1 = this.OooO0o;
    if (localObject1 != null)
    {
      int i = ((SparseArray)localObject1).indexOfKey(paramInt);
      if (i >= 0)
      {
        Object localObject2 = (Drawable.ConstantState)this.OooO0o.valueAt(i);
        Object localObject3 = this.OooO0O0;
        localObject2 = ((Drawable.ConstantState)localObject2).newDrawable((Resources)localObject3);
        localObject2 = OooO((Drawable)localObject2);
        localObject3 = this.OooO0oO;
        localObject3[paramInt] = localObject2;
        this.OooO0o.removeAt(i);
        SparseArray localSparseArray = this.OooO0o;
        paramInt = localSparseArray.size();
        if (paramInt == 0) {
          this.OooO0o = null;
        }
        return localObject2;
      }
    }
    return null;
  }
  
  public final int getChildCount()
  {
    return this.OooO0oo;
  }
  
  public final int getConstantHeight()
  {
    boolean bool = this.OooOOO0;
    if (!bool) {
      OooO0Oo();
    }
    return this.OooOOOO;
  }
  
  public final int getConstantMinimumHeight()
  {
    boolean bool = this.OooOOO0;
    if (!bool) {
      OooO0Oo();
    }
    return this.OooOOo0;
  }
  
  public final int getConstantMinimumWidth()
  {
    boolean bool = this.OooOOO0;
    if (!bool) {
      OooO0Oo();
    }
    return this.OooOOOo;
  }
  
  public final Rect getConstantPadding()
  {
    boolean bool1 = this.OooO;
    Rect localRect1 = null;
    if (bool1) {
      return null;
    }
    Rect localRect2 = this.OooOO0O;
    if (localRect2 == null)
    {
      boolean bool2 = this.OooOO0;
      if (!bool2)
      {
        OooO0o0();
        localRect2 = new android/graphics/Rect;
        localRect2.<init>();
        int i = this.OooO0oo;
        Drawable[] arrayOfDrawable = this.OooO0oO;
        int j = 0;
        while (j < i)
        {
          Drawable localDrawable = arrayOfDrawable[j];
          boolean bool3 = localDrawable.getPadding(localRect2);
          if (bool3)
          {
            if (localRect1 == null)
            {
              localRect1 = new android/graphics/Rect;
              localRect1.<init>(0, 0, 0, 0);
            }
            int k = localRect2.left;
            int m = localRect1.left;
            if (k > m) {
              localRect1.left = k;
            }
            k = localRect2.top;
            m = localRect1.top;
            if (k > m) {
              localRect1.top = k;
            }
            k = localRect2.right;
            m = localRect1.right;
            if (k > m) {
              localRect1.right = k;
            }
            k = localRect2.bottom;
            m = localRect1.bottom;
            if (k > m) {
              localRect1.bottom = k;
            }
          }
          j += 1;
        }
        this.OooOO0 = true;
        this.OooOO0O = localRect1;
        return localRect1;
      }
    }
    return localRect2;
  }
  
  public final int getConstantWidth()
  {
    boolean bool = this.OooOOO0;
    if (!bool) {
      OooO0Oo();
    }
    return this.OooOOO;
  }
  
  public final int getEnterFadeDuration()
  {
    return this.OooOoOO;
  }
  
  public final int getExitFadeDuration()
  {
    return this.OooOoo0;
  }
  
  public final int getOpacity()
  {
    boolean bool = this.OooOOo;
    if (bool) {
      return this.OooOOoo;
    }
    OooO0o0();
    int i = this.OooO0oo;
    Drawable[] arrayOfDrawable = this.OooO0oO;
    int j;
    if (i > 0)
    {
      Drawable localDrawable1 = arrayOfDrawable[0];
      j = localDrawable1.getOpacity();
    }
    else
    {
      j = -2;
    }
    int k = 1;
    int m = k;
    while (m < i)
    {
      Drawable localDrawable2 = arrayOfDrawable[m];
      int n = localDrawable2.getOpacity();
      j = Drawable.resolveOpacity(j, n);
      m += 1;
    }
    this.OooOOoo = j;
    this.OooOOo = k;
    return j;
  }
  
  public final boolean isConstantSize()
  {
    return this.OooOO0o;
  }
  
  public final boolean isStateful()
  {
    boolean bool1 = this.OooOo00;
    if (bool1) {
      return this.OooOo0;
    }
    OooO0o0();
    int i = this.OooO0oo;
    Drawable[] arrayOfDrawable = this.OooO0oO;
    boolean bool2 = false;
    int j = 0;
    boolean bool3;
    for (;;)
    {
      bool3 = true;
      if (j >= i) {
        break;
      }
      Drawable localDrawable = arrayOfDrawable[j];
      boolean bool4 = localDrawable.isStateful();
      if (bool4)
      {
        bool2 = bool3;
        break;
      }
      j += 1;
    }
    this.OooOo0 = bool2;
    this.OooOo00 = bool3;
    return bool2;
  }
  
  public final void setConstantSize(boolean paramBoolean)
  {
    this.OooOO0o = paramBoolean;
  }
  
  public final void setEnterFadeDuration(int paramInt)
  {
    this.OooOoOO = paramInt;
  }
  
  public final void setExitFadeDuration(int paramInt)
  {
    this.OooOoo0 = paramInt;
  }
  
  public final void setVariablePadding(boolean paramBoolean)
  {
    this.OooO = paramBoolean;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState
 * JD-Core Version:    0.7.0.1
 */
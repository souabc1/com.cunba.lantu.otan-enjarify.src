package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

public class NestedScrollingChildHelper
{
  public ViewParent OooO00o;
  public ViewParent OooO0O0;
  public final View OooO0OO;
  public boolean OooO0Oo;
  public int[] OooO0o0;
  
  public NestedScrollingChildHelper(View paramView)
  {
    this.OooO0OO = paramView;
  }
  
  private ViewParent getNestedScrollingParentForType(int paramInt)
  {
    if (paramInt != 0)
    {
      int i = 1;
      if (paramInt != i) {
        return null;
      }
      return this.OooO0O0;
    }
    return this.OooO00o;
  }
  
  private int[] getTempNestedScrollConsumed()
  {
    int[] arrayOfInt = this.OooO0o0;
    if (arrayOfInt == null)
    {
      int i = 2;
      arrayOfInt = new int[i];
      this.OooO0o0 = arrayOfInt;
    }
    return this.OooO0o0;
  }
  
  private void setNestedScrollingParentForType(int paramInt, ViewParent paramViewParent)
  {
    if (paramInt != 0)
    {
      int i = 1;
      if (paramInt == i) {
        this.OooO0O0 = paramViewParent;
      }
    }
    else
    {
      this.OooO00o = paramViewParent;
    }
  }
  
  public boolean OooO()
  {
    return OooOO0(0);
  }
  
  public boolean OooO00o(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    boolean bool = isNestedScrollingEnabled();
    View localView = null;
    if (bool)
    {
      ViewParent localViewParent = getNestedScrollingParentForType(0);
      if (localViewParent != null)
      {
        localView = this.OooO0OO;
        return ViewParentCompat.OooO00o(localViewParent, localView, paramFloat1, paramFloat2, paramBoolean);
      }
    }
    return false;
  }
  
  public boolean OooO0O0(float paramFloat1, float paramFloat2)
  {
    boolean bool = isNestedScrollingEnabled();
    View localView = null;
    if (bool)
    {
      ViewParent localViewParent = getNestedScrollingParentForType(0);
      if (localViewParent != null)
      {
        localView = this.OooO0OO;
        return ViewParentCompat.OooO0O0(localViewParent, localView, paramFloat1, paramFloat2);
      }
    }
    return false;
  }
  
  public boolean OooO0OO(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return OooO0Oo(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2, 0);
  }
  
  public boolean OooO0Oo(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt3)
  {
    boolean bool1 = isNestedScrollingEnabled();
    boolean bool2 = false;
    if (bool1)
    {
      ViewParent localViewParent = getNestedScrollingParentForType(paramInt3);
      if (localViewParent == null) {
        return false;
      }
      bool1 = true;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (paramArrayOfInt2 != null)
        {
          paramArrayOfInt2[0] = 0;
          paramArrayOfInt2[bool1] = 0;
        }
      }
      else
      {
        int k;
        int m;
        if (paramArrayOfInt2 != null)
        {
          localView1 = this.OooO0OO;
          localView1.getLocationInWindow(paramArrayOfInt2);
          int i = paramArrayOfInt2[0];
          j = paramArrayOfInt2[bool1];
          k = i;
          m = j;
        }
        else
        {
          k = 0;
          m = 0;
        }
        if (paramArrayOfInt1 == null) {
          paramArrayOfInt1 = getTempNestedScrollConsumed();
        }
        paramArrayOfInt1[0] = 0;
        paramArrayOfInt1[bool1] = 0;
        View localView1 = this.OooO0OO;
        int j = paramInt1;
        ViewParentCompat.OooO0OO(localViewParent, localView1, paramInt1, paramInt2, paramArrayOfInt1, paramInt3);
        if (paramArrayOfInt2 != null)
        {
          View localView2 = this.OooO0OO;
          localView2.getLocationInWindow(paramArrayOfInt2);
          paramInt1 = paramArrayOfInt2[0] - k;
          paramArrayOfInt2[0] = paramInt1;
          paramInt1 = paramArrayOfInt2[bool1] - m;
          paramArrayOfInt2[bool1] = paramInt1;
        }
        paramInt1 = paramArrayOfInt1[0];
        if (paramInt1 == 0)
        {
          paramInt1 = paramArrayOfInt1[bool1];
          if (paramInt1 == 0) {}
        }
        else
        {
          bool2 = bool1;
        }
      }
    }
    return bool2;
  }
  
  public boolean OooO0o(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return OooO0oo(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt, 0, null);
  }
  
  public void OooO0o0(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt1, int paramInt5, int[] paramArrayOfInt2)
  {
    OooO0oo(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt1, paramInt5, paramArrayOfInt2);
  }
  
  public boolean OooO0oO(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5)
  {
    return OooO0oo(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt, paramInt5, null);
  }
  
  public final boolean OooO0oo(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt1, int paramInt5, int[] paramArrayOfInt2)
  {
    NestedScrollingChildHelper localNestedScrollingChildHelper = this;
    int[] arrayOfInt = paramArrayOfInt1;
    boolean bool1 = isNestedScrollingEnabled();
    if (bool1)
    {
      int i = paramInt5;
      ViewParent localViewParent = getNestedScrollingParentForType(paramInt5);
      if (localViewParent == null) {
        return false;
      }
      boolean bool2 = true;
      if ((paramInt1 == 0) && (paramInt2 == 0) && (paramInt3 == 0) && (paramInt4 == 0))
      {
        if (paramArrayOfInt1 != null)
        {
          paramArrayOfInt1[0] = 0;
          paramArrayOfInt1[bool2] = 0;
        }
      }
      else
      {
        int m;
        int n;
        if (arrayOfInt != null)
        {
          localObject1 = localNestedScrollingChildHelper.OooO0OO;
          ((View)localObject1).getLocationInWindow(arrayOfInt);
          int j = arrayOfInt[0];
          k = arrayOfInt[bool2];
          m = j;
          n = k;
        }
        else
        {
          m = 0;
          n = 0;
        }
        Object localObject2;
        if (paramArrayOfInt2 == null)
        {
          localObject1 = getTempNestedScrollConsumed();
          localObject1[0] = 0;
          localObject1[bool2] = 0;
          localObject2 = localObject1;
        }
        else
        {
          localObject2 = paramArrayOfInt2;
        }
        Object localObject1 = localNestedScrollingChildHelper.OooO0OO;
        int k = paramInt1;
        ViewParentCompat.OooO0Oo(localViewParent, (View)localObject1, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, (int[])localObject2);
        if (arrayOfInt != null)
        {
          View localView = localNestedScrollingChildHelper.OooO0OO;
          localView.getLocationInWindow(arrayOfInt);
          i = arrayOfInt[0] - m;
          arrayOfInt[0] = i;
          i = arrayOfInt[bool2] - n;
          arrayOfInt[bool2] = i;
        }
        return bool2;
      }
    }
    return false;
  }
  
  public boolean OooOO0(int paramInt)
  {
    ViewParent localViewParent = getNestedScrollingParentForType(paramInt);
    if (localViewParent != null)
    {
      paramInt = 1;
    }
    else
    {
      paramInt = 0;
      localViewParent = null;
    }
    return paramInt;
  }
  
  public boolean OooOO0O(int paramInt)
  {
    return OooOO0o(paramInt, 0);
  }
  
  public boolean OooOO0o(int paramInt1, int paramInt2)
  {
    boolean bool1 = OooOO0(paramInt2);
    boolean bool2 = true;
    if (bool1) {
      return bool2;
    }
    bool1 = isNestedScrollingEnabled();
    if (bool1)
    {
      ViewParent localViewParent = this.OooO0OO.getParent();
      Object localObject = this.OooO0OO;
      while (localViewParent != null)
      {
        View localView = this.OooO0OO;
        boolean bool3 = ViewParentCompat.OooO0o(localViewParent, (View)localObject, localView, paramInt1, paramInt2);
        if (bool3)
        {
          setNestedScrollingParentForType(paramInt2, localViewParent);
          localView = this.OooO0OO;
          ViewParentCompat.OooO0o0(localViewParent, (View)localObject, localView, paramInt1, paramInt2);
          return bool2;
        }
        bool3 = localViewParent instanceof View;
        if (bool3)
        {
          localObject = localViewParent;
          localObject = (View)localViewParent;
        }
        localViewParent = ((ViewParent)localViewParent).getParent();
      }
    }
    return false;
  }
  
  public void OooOOO(int paramInt)
  {
    ViewParent localViewParent = getNestedScrollingParentForType(paramInt);
    if (localViewParent != null)
    {
      View localView = this.OooO0OO;
      ViewParentCompat.OooO0oO(localViewParent, localView, paramInt);
      localViewParent = null;
      setNestedScrollingParentForType(paramInt, null);
    }
  }
  
  public void OooOOO0()
  {
    OooOOO(0);
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return this.OooO0Oo;
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    boolean bool = this.OooO0Oo;
    if (bool)
    {
      View localView = this.OooO0OO;
      ViewCompat.o0000oO(localView);
    }
    this.OooO0Oo = paramBoolean;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.NestedScrollingChildHelper
 * JD-Core Version:    0.7.0.1
 */
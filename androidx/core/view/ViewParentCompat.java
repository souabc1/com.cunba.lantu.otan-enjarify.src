package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

public final class ViewParentCompat
{
  public static int[] OooO00o;
  
  public static boolean OooO00o(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    try
    {
      return ViewParentCompat.Api21Impl.OooO00o(paramViewParent, paramView, paramFloat1, paramFloat2, paramBoolean);
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      paramView = new java/lang/StringBuilder;
      paramView.<init>();
      paramView.append("ViewParent ");
      paramView.append(paramViewParent);
      paramView.append(" does not implement interface method onNestedFling");
    }
    return false;
  }
  
  public static boolean OooO0O0(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
  {
    try
    {
      return ViewParentCompat.Api21Impl.OooO0O0(paramViewParent, paramView, paramFloat1, paramFloat2);
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      paramView = new java/lang/StringBuilder;
      paramView.<init>();
      paramView.append("ViewParent ");
      paramView.append(paramViewParent);
      paramView.append(" does not implement interface method onNestedPreFling");
    }
    return false;
  }
  
  public static void OooO0OO(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    boolean bool = paramViewParent instanceof NestedScrollingParent2;
    if (bool)
    {
      Object localObject = paramViewParent;
      localObject = (NestedScrollingParent2)paramViewParent;
      ((NestedScrollingParent2)localObject).onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt, paramInt3);
    }
    else if (paramInt3 == 0)
    {
      try
      {
        ViewParentCompat.Api21Impl.OooO0OO(paramViewParent, paramView, paramInt1, paramInt2, paramArrayOfInt);
      }
      catch (AbstractMethodError localAbstractMethodError)
      {
        paramView = new java/lang/StringBuilder;
        paramView.<init>();
        String str = "ViewParent ";
        paramView.append(str);
        paramView.append(paramViewParent);
        paramViewParent = " does not implement interface method onNestedPreScroll";
        paramView.append(paramViewParent);
      }
    }
  }
  
  public static void OooO0Oo(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfInt)
  {
    Object localObject1 = paramViewParent;
    boolean bool = paramViewParent instanceof NestedScrollingParent3;
    Object localObject2;
    int i;
    if (bool)
    {
      localObject1 = (NestedScrollingParent3)paramViewParent;
      localObject2 = paramView;
      i = paramInt1;
      ((NestedScrollingParent3)localObject1).onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramArrayOfInt);
    }
    else
    {
      localObject2 = null;
      i = paramArrayOfInt[0] + paramInt3;
      paramArrayOfInt[0] = i;
      bool = true;
      i = paramArrayOfInt[bool] + paramInt4;
      paramArrayOfInt[bool] = i;
      bool = paramViewParent instanceof NestedScrollingParent2;
      if (bool)
      {
        Object localObject3 = paramViewParent;
        localObject3 = (NestedScrollingParent2)paramViewParent;
        ((NestedScrollingParent2)localObject3).onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
      }
      else if (paramInt5 == 0)
      {
        try
        {
          ViewParentCompat.Api21Impl.OooO0Oo(paramViewParent, paramView, paramInt1, paramInt2, paramInt3, paramInt4);
        }
        catch (AbstractMethodError localAbstractMethodError)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          String str = "ViewParent ";
          ((StringBuilder)localObject2).append(str);
          ((StringBuilder)localObject2).append(paramViewParent);
          localObject1 = " does not implement interface method onNestedScroll";
          ((StringBuilder)localObject2).append((String)localObject1);
        }
      }
    }
  }
  
  public static boolean OooO0o(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    boolean bool = paramViewParent instanceof NestedScrollingParent2;
    if (bool) {
      return ((NestedScrollingParent2)paramViewParent).onStartNestedScroll(paramView1, paramView2, paramInt1, paramInt2);
    }
    if (paramInt2 == 0) {
      try
      {
        return ViewParentCompat.Api21Impl.OooO0o(paramViewParent, paramView1, paramView2, paramInt1);
      }
      catch (AbstractMethodError localAbstractMethodError)
      {
        paramView1 = new java/lang/StringBuilder;
        paramView1.<init>();
        paramView2 = "ViewParent ";
        paramView1.append(paramView2);
        paramView1.append(paramViewParent);
        paramViewParent = " does not implement interface method onStartNestedScroll";
        paramView1.append(paramViewParent);
      }
    }
    return false;
  }
  
  public static void OooO0o0(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    boolean bool = paramViewParent instanceof NestedScrollingParent2;
    if (bool)
    {
      paramViewParent = (NestedScrollingParent2)paramViewParent;
      paramViewParent.onNestedScrollAccepted(paramView1, paramView2, paramInt1, paramInt2);
    }
    else if (paramInt2 == 0)
    {
      try
      {
        ViewParentCompat.Api21Impl.OooO0o0(paramViewParent, paramView1, paramView2, paramInt1);
      }
      catch (AbstractMethodError localAbstractMethodError)
      {
        paramView1 = new java/lang/StringBuilder;
        paramView1.<init>();
        paramView2 = "ViewParent ";
        paramView1.append(paramView2);
        paramView1.append(paramViewParent);
        paramViewParent = " does not implement interface method onNestedScrollAccepted";
        paramView1.append(paramViewParent);
      }
    }
  }
  
  public static void OooO0oO(ViewParent paramViewParent, View paramView, int paramInt)
  {
    boolean bool = paramViewParent instanceof NestedScrollingParent2;
    if (bool)
    {
      paramViewParent = (NestedScrollingParent2)paramViewParent;
      paramViewParent.onStopNestedScroll(paramView, paramInt);
    }
    else if (paramInt == 0)
    {
      try
      {
        ViewParentCompat.Api21Impl.OooO0oO(paramViewParent, paramView);
      }
      catch (AbstractMethodError localAbstractMethodError)
      {
        paramView = new java/lang/StringBuilder;
        paramView.<init>();
        String str = "ViewParent ";
        paramView.append(str);
        paramView.append(paramViewParent);
        paramViewParent = " does not implement interface method onStopNestedScroll";
        paramView.append(paramViewParent);
      }
    }
  }
  
  private static int[] getTempNestedScrollConsumed()
  {
    int[] arrayOfInt = OooO00o;
    if (arrayOfInt == null)
    {
      int i = 2;
      arrayOfInt = new int[i];
      OooO00o = arrayOfInt;
    }
    else
    {
      arrayOfInt[0] = 0;
      int j = 1;
      arrayOfInt[j] = 0;
    }
    return OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewParentCompat
 * JD-Core Version:    0.7.0.1
 */
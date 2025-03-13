package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

class ChildHelper
{
  public final ChildHelper.Callback OooO00o;
  public final ChildHelper.Bucket OooO0O0;
  public final List OooO0OO;
  
  public ChildHelper(ChildHelper.Callback paramCallback)
  {
    this.OooO00o = paramCallback;
    paramCallback = new androidx/recyclerview/widget/ChildHelper$Bucket;
    paramCallback.<init>();
    this.OooO0O0 = paramCallback;
    paramCallback = new java/util/ArrayList;
    paramCallback.<init>();
    this.OooO0OO = paramCallback;
  }
  
  private int getOffset(int paramInt)
  {
    int i = -1;
    if (paramInt < 0) {
      return i;
    }
    ChildHelper.Callback localCallback = this.OooO00o;
    int j = localCallback.getChildCount();
    int k = paramInt;
    while (k < j)
    {
      ChildHelper.Bucket localBucket1 = this.OooO0O0;
      int m = localBucket1.OooO0O0(k);
      m = k - m;
      m = paramInt - m;
      if (m == 0)
      {
        for (;;)
        {
          ChildHelper.Bucket localBucket2 = this.OooO0O0;
          paramInt = localBucket2.get(k);
          if (paramInt == 0) {
            break;
          }
          k += 1;
        }
        return k;
      }
      k += m;
    }
    return i;
  }
  
  public boolean OooO(View paramView)
  {
    return this.OooO0OO.contains(paramView);
  }
  
  public void OooO00o(View paramView, int paramInt, boolean paramBoolean)
  {
    if (paramInt < 0)
    {
      ChildHelper.Callback localCallback = this.OooO00o;
      paramInt = localCallback.getChildCount();
    }
    else
    {
      paramInt = getOffset(paramInt);
    }
    ChildHelper.Bucket localBucket = this.OooO0O0;
    localBucket.OooO0Oo(paramInt, paramBoolean);
    if (paramBoolean) {
      OooO0oO(paramView);
    }
    this.OooO00o.OooO0oO(paramView, paramInt);
  }
  
  public void OooO0O0(View paramView, boolean paramBoolean)
  {
    OooO00o(paramView, -1, paramBoolean);
  }
  
  public void OooO0OO(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, boolean paramBoolean)
  {
    if (paramInt < 0)
    {
      ChildHelper.Callback localCallback = this.OooO00o;
      paramInt = localCallback.getChildCount();
    }
    else
    {
      paramInt = getOffset(paramInt);
    }
    ChildHelper.Bucket localBucket = this.OooO0O0;
    localBucket.OooO0Oo(paramInt, paramBoolean);
    if (paramBoolean) {
      OooO0oO(paramView);
    }
    this.OooO00o.OooO(paramView, paramInt, paramLayoutParams);
  }
  
  public void OooO0Oo(int paramInt)
  {
    paramInt = getOffset(paramInt);
    this.OooO0O0.OooO0o0(paramInt);
    this.OooO00o.OooO0o0(paramInt);
  }
  
  public void OooO0o(View paramView)
  {
    Object localObject = this.OooO00o;
    int i = ((ChildHelper.Callback)localObject).OooO0OO(paramView);
    if (i >= 0)
    {
      this.OooO0O0.set(i);
      OooO0oO(paramView);
      return;
    }
    localObject = new java/lang/IllegalArgumentException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("view is not a child, cannot hide ");
    localStringBuilder.append(paramView);
    paramView = localStringBuilder.toString();
    ((IllegalArgumentException)localObject).<init>(paramView);
    throw ((Throwable)localObject);
  }
  
  public View OooO0o0(int paramInt)
  {
    List localList = this.OooO0OO;
    int i = localList.size();
    int j = 0;
    while (j < i)
    {
      View localView = (View)this.OooO0OO.get(j);
      RecyclerView.ViewHolder localViewHolder = this.OooO00o.OooO0Oo(localView);
      int k = localViewHolder.getLayoutPosition();
      if (k == paramInt)
      {
        boolean bool1 = localViewHolder.isInvalid();
        if (!bool1)
        {
          boolean bool2 = localViewHolder.isRemoved();
          if (!bool2) {
            return localView;
          }
        }
      }
      j += 1;
    }
    return null;
  }
  
  public final void OooO0oO(View paramView)
  {
    this.OooO0OO.add(paramView);
    this.OooO00o.OooO00o(paramView);
  }
  
  public int OooO0oo(View paramView)
  {
    ChildHelper.Callback localCallback = this.OooO00o;
    int i = localCallback.OooO0OO(paramView);
    int j = -1;
    if (i == j) {
      return j;
    }
    ChildHelper.Bucket localBucket = this.OooO0O0;
    boolean bool = localBucket.get(i);
    if (bool) {
      return j;
    }
    j = this.OooO0O0.OooO0O0(i);
    return i - j;
  }
  
  public void OooOO0()
  {
    this.OooO0O0.OooO0o();
    List localList = this.OooO0OO;
    int i = localList.size() + -1;
    while (i >= 0)
    {
      Object localObject = this.OooO00o;
      View localView = (View)this.OooO0OO.get(i);
      ((ChildHelper.Callback)localObject).OooO0o(localView);
      localObject = this.OooO0OO;
      ((List)localObject).remove(i);
      i += -1;
    }
    this.OooO00o.OooO0O0();
  }
  
  public void OooOO0O(View paramView)
  {
    ChildHelper.Callback localCallback = this.OooO00o;
    int i = localCallback.OooO0OO(paramView);
    if (i < 0) {
      return;
    }
    ChildHelper.Bucket localBucket = this.OooO0O0;
    boolean bool = localBucket.OooO0o0(i);
    if (bool) {
      OooOOOO(paramView);
    }
    this.OooO00o.OooO0oo(i);
  }
  
  public void OooOO0o(int paramInt)
  {
    paramInt = getOffset(paramInt);
    View localView = this.OooO00o.getChildAt(paramInt);
    if (localView == null) {
      return;
    }
    ChildHelper.Bucket localBucket = this.OooO0O0;
    boolean bool = localBucket.OooO0o0(paramInt);
    if (bool) {
      OooOOOO(localView);
    }
    this.OooO00o.OooO0oo(paramInt);
  }
  
  public void OooOOO(View paramView)
  {
    Object localObject1 = this.OooO00o;
    int i = ((ChildHelper.Callback)localObject1).OooO0OO(paramView);
    if (i >= 0)
    {
      localObject2 = this.OooO0O0;
      boolean bool = ((ChildHelper.Bucket)localObject2).get(i);
      if (bool)
      {
        this.OooO0O0.OooO00o(i);
        OooOOOO(paramView);
        return;
      }
      localObject1 = new java/lang/RuntimeException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("trying to unhide a view that was not hidden");
      ((StringBuilder)localObject2).append(paramView);
      paramView = ((StringBuilder)localObject2).toString();
      ((RuntimeException)localObject1).<init>(paramView);
      throw ((Throwable)localObject1);
    }
    localObject1 = new java/lang/IllegalArgumentException;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("view is not a child, cannot hide ");
    ((StringBuilder)localObject2).append(paramView);
    paramView = ((StringBuilder)localObject2).toString();
    ((IllegalArgumentException)localObject1).<init>(paramView);
    throw ((Throwable)localObject1);
  }
  
  public boolean OooOOO0(View paramView)
  {
    ChildHelper.Callback localCallback = this.OooO00o;
    int i = localCallback.OooO0OO(paramView);
    int j = -1;
    boolean bool2 = true;
    if (i == j)
    {
      OooOOOO(paramView);
      return bool2;
    }
    ChildHelper.Bucket localBucket = this.OooO0O0;
    boolean bool1 = localBucket.get(i);
    if (bool1)
    {
      this.OooO0O0.OooO0o0(i);
      OooOOOO(paramView);
      this.OooO00o.OooO0oo(i);
      return bool2;
    }
    return false;
  }
  
  public final boolean OooOOOO(View paramView)
  {
    List localList = this.OooO0OO;
    boolean bool = localList.remove(paramView);
    if (bool)
    {
      this.OooO00o.OooO0o(paramView);
      return true;
    }
    return false;
  }
  
  public View getChildAt(int paramInt)
  {
    paramInt = getOffset(paramInt);
    return this.OooO00o.getChildAt(paramInt);
  }
  
  public int getChildCount()
  {
    int i = this.OooO00o.getChildCount();
    int j = this.OooO0OO.size();
    return i - j;
  }
  
  public View getUnfilteredChildAt(int paramInt)
  {
    return this.OooO00o.getChildAt(paramInt);
  }
  
  public int getUnfilteredChildCount()
  {
    return this.OooO00o.getChildCount();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = this.OooO0O0.toString();
    localStringBuilder.append(str);
    localStringBuilder.append(", hidden list:");
    int i = this.OooO0OO.size();
    localStringBuilder.append(i);
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.ChildHelper
 * JD-Core Version:    0.7.0.1
 */
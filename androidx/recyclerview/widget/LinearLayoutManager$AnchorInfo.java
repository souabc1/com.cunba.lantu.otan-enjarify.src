package androidx.recyclerview.widget;

import android.view.View;

class LinearLayoutManager$AnchorInfo
{
  public OrientationHelper OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public boolean OooO0Oo;
  public boolean OooO0o0;
  
  public LinearLayoutManager$AnchorInfo()
  {
    OooO0o0();
  }
  
  public void OooO00o()
  {
    boolean bool = this.OooO0Oo;
    OrientationHelper localOrientationHelper;
    int i;
    if (bool)
    {
      localOrientationHelper = this.OooO00o;
      i = localOrientationHelper.getEndAfterPadding();
    }
    else
    {
      localOrientationHelper = this.OooO00o;
      i = localOrientationHelper.getStartAfterPadding();
    }
    this.OooO0OO = i;
  }
  
  public void OooO0O0(View paramView, int paramInt)
  {
    boolean bool = this.OooO0Oo;
    int j;
    OrientationHelper localOrientationHelper;
    if (bool)
    {
      j = this.OooO00o.OooO0Oo(paramView);
      localOrientationHelper = this.OooO00o;
      int i = localOrientationHelper.getTotalSpaceChange();
      j += i;
    }
    else
    {
      localOrientationHelper = this.OooO00o;
      j = localOrientationHelper.OooO0oO(paramView);
    }
    this.OooO0OO = j;
    this.OooO0O0 = paramInt;
  }
  
  public void OooO0OO(View paramView, int paramInt)
  {
    OrientationHelper localOrientationHelper1 = this.OooO00o;
    int i = localOrientationHelper1.getTotalSpaceChange();
    if (i >= 0)
    {
      OooO0O0(paramView, paramInt);
      return;
    }
    this.OooO0O0 = paramInt;
    paramInt = this.OooO0Oo;
    OrientationHelper localOrientationHelper2;
    int j;
    OrientationHelper localOrientationHelper3;
    int k;
    if (paramInt != 0)
    {
      localOrientationHelper2 = this.OooO00o;
      paramInt = localOrientationHelper2.getEndAfterPadding() - i;
      i = this.OooO00o.OooO0Oo(paramView);
      paramInt -= i;
      localOrientationHelper1 = this.OooO00o;
      i = localOrientationHelper1.getEndAfterPadding() - paramInt;
      this.OooO0OO = i;
      if (paramInt > 0)
      {
        i = this.OooO00o.OooO0o0(paramView);
        j = this.OooO0OO - i;
        localOrientationHelper1 = this.OooO00o;
        i = localOrientationHelper1.getStartAfterPadding();
        localOrientationHelper3 = this.OooO00o;
        k = Math.min(localOrientationHelper3.OooO0oO(paramView) - i, 0);
        i += k;
        j -= i;
        if (j < 0)
        {
          k = this.OooO0OO;
          i = -j;
          paramInt = Math.min(paramInt, i);
          k += paramInt;
          this.OooO0OO = k;
        }
      }
    }
    else
    {
      localOrientationHelper2 = this.OooO00o;
      paramInt = localOrientationHelper2.OooO0oO(paramView);
      OrientationHelper localOrientationHelper4 = this.OooO00o;
      j = localOrientationHelper4.getStartAfterPadding();
      j = paramInt - j;
      this.OooO0OO = paramInt;
      if (j > 0)
      {
        int m = this.OooO00o.OooO0o0(paramView);
        paramInt += m;
        localOrientationHelper3 = this.OooO00o;
        m = localOrientationHelper3.getEndAfterPadding() - i;
        localOrientationHelper1 = this.OooO00o;
        k = localOrientationHelper1.OooO0Oo(paramView);
        m -= k;
        paramView = this.OooO00o;
        k = paramView.getEndAfterPadding();
        i = Math.min(0, m);
        k = k - i - paramInt;
        if (k < 0)
        {
          paramInt = this.OooO0OO;
          k = -k;
          k = Math.min(j, k);
          paramInt -= k;
          this.OooO0OO = paramInt;
        }
      }
    }
  }
  
  public boolean OooO0Oo(View paramView, RecyclerView.State paramState)
  {
    paramView = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    boolean bool = paramView.isItemRemoved();
    if (!bool)
    {
      int i = paramView.getViewLayoutPosition();
      if (i >= 0)
      {
        j = paramView.getViewLayoutPosition();
        int k = paramState.getItemCount();
        if (j < k)
        {
          j = 1;
          break label56;
        }
      }
    }
    int j = 0;
    paramView = null;
    label56:
    return j;
  }
  
  public void OooO0o0()
  {
    this.OooO0O0 = -1;
    this.OooO0OO = (-1 << -1);
    this.OooO0Oo = false;
    this.OooO0o0 = false;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("AnchorInfo{mPosition=");
    int i = this.OooO0O0;
    localStringBuilder.append(i);
    localStringBuilder.append(", mCoordinate=");
    i = this.OooO0OO;
    localStringBuilder.append(i);
    localStringBuilder.append(", mLayoutFromEnd=");
    boolean bool = this.OooO0Oo;
    localStringBuilder.append(bool);
    localStringBuilder.append(", mValid=");
    bool = this.OooO0o0;
    localStringBuilder.append(bool);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.LinearLayoutManager.AnchorInfo
 * JD-Core Version:    0.7.0.1
 */
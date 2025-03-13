package androidx.recyclerview.widget;

import android.view.View;

class ViewBoundsCheck
{
  public final ViewBoundsCheck.Callback OooO00o;
  public ViewBoundsCheck.BoundFlags OooO0O0;
  
  public ViewBoundsCheck(ViewBoundsCheck.Callback paramCallback)
  {
    this.OooO00o = paramCallback;
    paramCallback = new androidx/recyclerview/widget/ViewBoundsCheck$BoundFlags;
    paramCallback.<init>();
    this.OooO0O0 = paramCallback;
  }
  
  public View OooO00o(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewBoundsCheck.Callback localCallback1 = this.OooO00o;
    int i = localCallback1.getParentStart();
    ViewBoundsCheck.Callback localCallback2 = this.OooO00o;
    int j = localCallback2.getParentEnd();
    int k;
    if (paramInt2 > paramInt1) {
      k = 1;
    } else {
      k = -1;
    }
    Object localObject1 = null;
    while (paramInt1 != paramInt2)
    {
      View localView = this.OooO00o.getChildAt(paramInt1);
      Object localObject2 = this.OooO00o;
      int m = ((ViewBoundsCheck.Callback)localObject2).OooO00o(localView);
      ViewBoundsCheck.Callback localCallback3 = this.OooO00o;
      int n = localCallback3.OooO0O0(localView);
      ViewBoundsCheck.BoundFlags localBoundFlags = this.OooO0O0;
      localBoundFlags.OooO0o0(i, j, m, n);
      boolean bool;
      if (paramInt3 != 0)
      {
        this.OooO0O0.OooO0Oo();
        this.OooO0O0.OooO00o(paramInt3);
        localObject2 = this.OooO0O0;
        bool = ((ViewBoundsCheck.BoundFlags)localObject2).OooO0O0();
        if (bool) {
          return localView;
        }
      }
      if (paramInt4 != 0)
      {
        this.OooO0O0.OooO0Oo();
        this.OooO0O0.OooO00o(paramInt4);
        localObject2 = this.OooO0O0;
        bool = ((ViewBoundsCheck.BoundFlags)localObject2).OooO0O0();
        if (bool) {
          localObject1 = localView;
        }
      }
      paramInt1 += k;
    }
    return localObject1;
  }
  
  public boolean OooO0O0(View paramView, int paramInt)
  {
    ViewBoundsCheck.BoundFlags localBoundFlags = this.OooO0O0;
    ViewBoundsCheck.Callback localCallback1 = this.OooO00o;
    int i = localCallback1.getParentStart();
    ViewBoundsCheck.Callback localCallback2 = this.OooO00o;
    int j = localCallback2.getParentEnd();
    ViewBoundsCheck.Callback localCallback3 = this.OooO00o;
    int k = localCallback3.OooO00o(paramView);
    ViewBoundsCheck.Callback localCallback4 = this.OooO00o;
    int m = localCallback4.OooO0O0(paramView);
    localBoundFlags.OooO0o0(i, j, k, m);
    if (paramInt != 0)
    {
      this.OooO0O0.OooO0Oo();
      this.OooO0O0.OooO00o(paramInt);
      return this.OooO0O0.OooO0O0();
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.ViewBoundsCheck
 * JD-Core Version:    0.7.0.1
 */
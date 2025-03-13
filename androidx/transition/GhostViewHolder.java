package androidx.transition;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

class GhostViewHolder
  extends FrameLayout
{
  public ViewGroup o00OoOoo;
  public boolean o00Ooo00;
  
  public GhostViewHolder(ViewGroup paramViewGroup)
  {
    super(localContext);
    setClipChildren(false);
    this.o00OoOoo = paramViewGroup;
    int i = R.id.ghost_view_holder;
    paramViewGroup.setTag(i, this);
    ViewGroupUtils.OooO0O0(this.o00OoOoo).add(this);
    this.o00Ooo00 = true;
  }
  
  public static GhostViewHolder OooO0O0(ViewGroup paramViewGroup)
  {
    int i = R.id.ghost_view_holder;
    return (GhostViewHolder)paramViewGroup.getTag(i);
  }
  
  public static void OooO0Oo(View paramView, ArrayList paramArrayList)
  {
    Object localObject = paramView.getParent();
    boolean bool = localObject instanceof ViewGroup;
    if (bool)
    {
      localObject = (View)localObject;
      OooO0Oo((View)localObject, paramArrayList);
    }
    paramArrayList.add(paramView);
  }
  
  public static boolean OooO0o(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    boolean bool = paramArrayList1.isEmpty();
    int i = 1;
    if (!bool)
    {
      bool = paramArrayList2.isEmpty();
      if (!bool)
      {
        bool = false;
        Object localObject1 = paramArrayList1.get(0);
        Object localObject2 = paramArrayList2.get(0);
        if (localObject1 == localObject2)
        {
          int j = paramArrayList1.size();
          int k = paramArrayList2.size();
          j = Math.min(j, k);
          k = i;
          while (k < j)
          {
            View localView1 = (View)paramArrayList1.get(k);
            View localView2 = (View)paramArrayList2.get(k);
            if (localView1 != localView2) {
              return OooO0o0(localView1, localView2);
            }
            k += 1;
          }
          int m = paramArrayList2.size();
          if (m != j) {
            i = 0;
          }
        }
      }
    }
    return i;
  }
  
  public static boolean OooO0o0(View paramView1, View paramView2)
  {
    ViewGroup localViewGroup = (ViewGroup)paramView1.getParent();
    int i = localViewGroup.getChildCount();
    float f1 = paramView1.getZ();
    float f2 = paramView2.getZ();
    int j = f1 < f2;
    boolean bool1 = false;
    f2 = 0.0F;
    boolean bool2 = true;
    float f3 = 1.4E-45F;
    if (j != 0)
    {
      float f4 = paramView1.getZ();
      float f5 = paramView2.getZ();
      boolean bool3 = f4 < f5;
      if (bool3)
      {
        bool1 = bool2;
        f2 = f3;
      }
      return bool1;
    }
    j = 0;
    f1 = 0.0F;
    while (j < i)
    {
      int m = ViewGroupUtils.OooO00o(localViewGroup, j);
      View localView = localViewGroup.getChildAt(m);
      if (localView == paramView1) {
        break label148;
      }
      if (localView == paramView2) {
        break;
      }
      int k;
      j += 1;
    }
    bool1 = bool2;
    f2 = f3;
    label148:
    return bool1;
  }
  
  public void OooO00o(GhostViewPort paramGhostViewPort)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    View localView = paramGhostViewPort.o00Ooo0;
    OooO0Oo(localView, localArrayList);
    int i = OooO0OO(localArrayList);
    if (i >= 0)
    {
      int j = getChildCount();
      if (i < j)
      {
        addView(paramGhostViewPort, i);
        return;
      }
    }
    addView(paramGhostViewPort);
  }
  
  public final int OooO0OO(ArrayList paramArrayList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = getChildCount() + -1;
    int j = 0;
    while (j <= i)
    {
      int k = (j + i) / 2;
      View localView = ((GhostViewPort)getChildAt(k)).o00Ooo0;
      OooO0Oo(localView, localArrayList);
      boolean bool = OooO0o(paramArrayList, localArrayList);
      if (bool)
      {
        k += 1;
        j = k;
      }
      else
      {
        k += -1;
        i = k;
      }
      localArrayList.clear();
    }
    return j;
  }
  
  public void OooO0oO()
  {
    boolean bool = this.o00Ooo00;
    if (bool)
    {
      ViewGroupUtils.OooO0O0(this.o00OoOoo).remove(this);
      ViewGroupUtils.OooO0O0(this.o00OoOoo).add(this);
      return;
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("This GhostViewHolder is detached!");
    throw localIllegalStateException;
  }
  
  public void onViewAdded(View paramView)
  {
    boolean bool = this.o00Ooo00;
    if (bool)
    {
      super.onViewAdded(paramView);
      return;
    }
    paramView = new java/lang/IllegalStateException;
    paramView.<init>("This GhostViewHolder is detached!");
    throw paramView;
  }
  
  public void onViewRemoved(View paramView)
  {
    super.onViewRemoved(paramView);
    int i = getChildCount();
    int j = 1;
    if (i == j)
    {
      View localView = getChildAt(0);
      if (localView == paramView) {}
    }
    else
    {
      int k = getChildCount();
      if (k != 0) {
        return;
      }
    }
    paramView = this.o00OoOoo;
    i = R.id.ghost_view_holder;
    j = 0;
    paramView.setTag(i, null);
    paramView = ViewGroupUtils.OooO0O0(this.o00OoOoo);
    paramView.remove(this);
    this.o00Ooo00 = false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.GhostViewHolder
 * JD-Core Version:    0.7.0.1
 */
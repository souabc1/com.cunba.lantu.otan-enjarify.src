package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

public abstract class OrientationHelper
{
  public final RecyclerView.LayoutManager OooO00o;
  public int OooO0O0 = -1 << -1;
  public final Rect OooO0OO;
  
  public OrientationHelper(RecyclerView.LayoutManager paramLayoutManager)
  {
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.OooO0OO = localRect;
    this.OooO00o = paramLayoutManager;
  }
  
  public static OrientationHelper OooO00o(RecyclerView.LayoutManager paramLayoutManager)
  {
    OrientationHelper.1 local1 = new androidx/recyclerview/widget/OrientationHelper$1;
    local1.<init>(paramLayoutManager);
    return local1;
  }
  
  public static OrientationHelper OooO0O0(RecyclerView.LayoutManager paramLayoutManager, int paramInt)
  {
    if (paramInt != 0)
    {
      int i = 1;
      if (paramInt == i) {
        return OooO0OO(paramLayoutManager);
      }
      paramLayoutManager = new java/lang/IllegalArgumentException;
      paramLayoutManager.<init>("invalid orientation");
      throw paramLayoutManager;
    }
    return OooO00o(paramLayoutManager);
  }
  
  public static OrientationHelper OooO0OO(RecyclerView.LayoutManager paramLayoutManager)
  {
    OrientationHelper.2 local2 = new androidx/recyclerview/widget/OrientationHelper$2;
    local2.<init>(paramLayoutManager);
    return local2;
  }
  
  public abstract int OooO(View paramView);
  
  public abstract int OooO0Oo(View paramView);
  
  public abstract int OooO0o(View paramView);
  
  public abstract int OooO0o0(View paramView);
  
  public abstract int OooO0oO(View paramView);
  
  public abstract int OooO0oo(View paramView);
  
  public abstract void OooOO0(int paramInt);
  
  public void OooOO0O()
  {
    int i = getTotalSpace();
    this.OooO0O0 = i;
  }
  
  public abstract int getEnd();
  
  public abstract int getEndAfterPadding();
  
  public abstract int getEndPadding();
  
  public RecyclerView.LayoutManager getLayoutManager()
  {
    return this.OooO00o;
  }
  
  public abstract int getMode();
  
  public abstract int getModeInOther();
  
  public abstract int getStartAfterPadding();
  
  public abstract int getTotalSpace();
  
  public int getTotalSpaceChange()
  {
    int i = -1 << -1;
    int j = this.OooO0O0;
    if (i == j)
    {
      i = 0;
    }
    else
    {
      i = getTotalSpace();
      j = this.OooO0O0;
      i -= j;
    }
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.OrientationHelper
 * JD-Core Version:    0.7.0.1
 */
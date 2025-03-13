package com.scwang.smartrefresh.header;

import android.view.View;
import android.view.animation.Animation;
import com.scwang.smartrefresh.header.storehouse.StoreHouseBarItem;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import java.util.List;

class StoreHouseHeader$AniController
  implements Runnable
{
  public int o00OoOoo;
  public int o00Ooo0;
  public int o00Ooo00;
  public int o00Ooo0O;
  public boolean o00Ooo0o;
  
  public final void OooO0OO()
  {
    int i = 1;
    this.o00Ooo0o = i;
    this.o00OoOoo = 0;
    StoreHouseHeader localStoreHouseHeader = this.o00OooO0;
    int j = localStoreHouseHeader.o00Ooooo;
    int k = localStoreHouseHeader.o00Ooo0O.size();
    j /= k;
    this.o00Ooo0O = j;
    localStoreHouseHeader = this.o00OooO0;
    int m = localStoreHouseHeader.o00o0000 / j;
    this.o00Ooo00 = m;
    k = localStoreHouseHeader.o00Ooo0O.size();
    j = this.o00Ooo00;
    k = k / j + i;
    this.o00Ooo0 = k;
    run();
  }
  
  public final void OooO0Oo()
  {
    this.o00Ooo0o = false;
    this.o00OooO0.removeCallbacks(this);
  }
  
  public void run()
  {
    int i = this.o00OoOoo;
    int j = this.o00Ooo00;
    i %= j;
    j = 0;
    int k = 0;
    int n;
    for (;;)
    {
      int m = this.o00Ooo0;
      boolean bool2 = true;
      float f1 = 1.4E-45F;
      if (k >= m) {
        break;
      }
      m = this.o00Ooo00 * k + i;
      int i1 = this.o00OoOoo;
      if (m <= i1)
      {
        i1 = this.o00OooO0.o00Ooo0O.size();
        m %= i1;
        List localList = this.o00OooO0.o00Ooo0O;
        StoreHouseBarItem localStoreHouseBarItem = (StoreHouseBarItem)localList.get(m);
        localStoreHouseBarItem.setFillAfter(false);
        localStoreHouseBarItem.setFillEnabled(bool2);
        localStoreHouseBarItem.setFillBefore(false);
        long l1 = 400L;
        localStoreHouseBarItem.setDuration(l1);
        n = 1065353216;
        f1 = 1.0F;
        i1 = 1053609165;
        float f2 = 0.4F;
        localStoreHouseBarItem.OooO0OO(f1, f2);
      }
      k += 1;
    }
    i = this.o00OoOoo + n;
    this.o00OoOoo = i;
    boolean bool1 = this.o00Ooo0o;
    if (bool1)
    {
      Object localObject = this.o00OooO0.o00o00O0;
      if (localObject != null)
      {
        localObject = ((RefreshKernel)localObject).getRefreshLayout().getLayout();
        j = this.o00Ooo0O;
        long l2 = j;
        ((View)localObject).postDelayed(this, l2);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.StoreHouseHeader.AniController
 * JD-Core Version:    0.7.0.1
 */
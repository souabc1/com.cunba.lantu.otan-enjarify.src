package com.scwang.smartrefresh.header;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.scwang.smartrefresh.header.storehouse.StoreHouseBarItem;
import java.util.List;

class StoreHouseHeader$1
  extends Animation
{
  public StoreHouseHeader$1(StoreHouseHeader paramStoreHouseHeader)
  {
    super.setDuration(250L);
    paramStoreHouseHeader = new android/view/animation/AccelerateInterpolator;
    paramStoreHouseHeader.<init>();
    super.setInterpolator(paramStoreHouseHeader);
  }
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    paramTransformation = this.o00OoOoo;
    int i = 1065353216;
    float f1 = 1.0F;
    float f2 = f1 - paramFloat;
    paramTransformation.o00OooO = f2;
    paramTransformation.invalidate();
    int j = paramFloat < f1;
    if (j == 0)
    {
      j = 0;
      paramFloat = 0.0F;
      for (;;)
      {
        paramTransformation = this.o00OoOoo.o00Ooo0O;
        int m = paramTransformation.size();
        if (j >= m) {
          break;
        }
        paramTransformation = (StoreHouseBarItem)this.o00OoOoo.o00Ooo0O.get(j);
        StoreHouseHeader localStoreHouseHeader = this.o00OoOoo;
        i = localStoreHouseHeader.o00OooO0;
        paramTransformation.OooO0O0(i);
        int k;
        j += 1;
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.scwang.smartrefresh.header.StoreHouseHeader.1
 * JD-Core Version:    0.7.0.1
 */
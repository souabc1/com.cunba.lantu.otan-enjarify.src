package androidx.constraintlayout.helper.widget;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;

class Carousel$1
  implements Runnable
{
  public void run()
  {
    Object localObject1 = Carousel.OooOooO(this.o00OoOoo);
    float f1 = 0.0F;
    ((MotionLayout)localObject1).setProgress(0.0F);
    Carousel.OooOooo(this.o00OoOoo);
    localObject1 = Carousel.Oooo00O(this.o00OoOoo);
    int i = Carousel.Oooo000(this.o00OoOoo);
    ((Carousel.Adapter)localObject1).OooO00o(i);
    localObject1 = Carousel.OooOooO(this.o00OoOoo);
    float f2 = ((MotionLayout)localObject1).getVelocity();
    Object localObject2 = this.o00OoOoo;
    i = Carousel.Oooo00o((Carousel)localObject2);
    int k = 2;
    if (i == k)
    {
      localObject2 = this.o00OoOoo;
      f1 = Carousel.Oooo0((Carousel)localObject2);
      boolean bool = f2 < f1;
      if (bool)
      {
        localObject2 = this.o00OoOoo;
        int j = Carousel.Oooo000((Carousel)localObject2);
        Object localObject3 = Carousel.Oooo00O(this.o00OoOoo);
        k = ((Carousel.Adapter)localObject3).OooO0OO() + -1;
        if (j < k)
        {
          f1 = Carousel.Oooo0O0(this.o00OoOoo);
          f2 *= f1;
          localObject2 = this.o00OoOoo;
          j = Carousel.Oooo000((Carousel)localObject2);
          if (j == 0)
          {
            localObject2 = this.o00OoOoo;
            j = Carousel.Oooo0OO((Carousel)localObject2);
            localObject3 = this.o00OoOoo;
            k = Carousel.Oooo000((Carousel)localObject3);
            if (j > k) {
              return;
            }
          }
          localObject2 = this.o00OoOoo;
          j = Carousel.Oooo000((Carousel)localObject2);
          localObject3 = Carousel.Oooo00O(this.o00OoOoo);
          k = ((Carousel.Adapter)localObject3).OooO0OO() + -1;
          if (j == k)
          {
            localObject2 = this.o00OoOoo;
            j = Carousel.Oooo0OO((Carousel)localObject2);
            localObject3 = this.o00OoOoo;
            k = Carousel.Oooo000((Carousel)localObject3);
            if (j < k) {
              return;
            }
          }
          localObject2 = Carousel.OooOooO(this.o00OoOoo);
          localObject3 = new androidx/constraintlayout/helper/widget/Carousel$1$1;
          ((Carousel.1.1)localObject3).<init>(this, f2);
          ((View)localObject2).post((Runnable)localObject3);
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.helper.widget.Carousel.1
 * JD-Core Version:    0.7.0.1
 */
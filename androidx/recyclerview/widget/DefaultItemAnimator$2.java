package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Iterator;

class DefaultItemAnimator$2
  implements Runnable
{
  public DefaultItemAnimator$2(DefaultItemAnimator paramDefaultItemAnimator, ArrayList paramArrayList) {}
  
  public void run()
  {
    Object localObject1 = this.o00OoOoo.iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject1).hasNext();
      if (!bool) {
        break;
      }
      localObject2 = (DefaultItemAnimator.ChangeInfo)((Iterator)localObject1).next();
      DefaultItemAnimator localDefaultItemAnimator = this.o00Ooo00;
      localDefaultItemAnimator.Oooo0o((DefaultItemAnimator.ChangeInfo)localObject2);
    }
    this.o00OoOoo.clear();
    localObject1 = this.o00Ooo00.OooOOO;
    Object localObject2 = this.o00OoOoo;
    ((ArrayList)localObject1).remove(localObject2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.DefaultItemAnimator.2
 * JD-Core Version:    0.7.0.1
 */
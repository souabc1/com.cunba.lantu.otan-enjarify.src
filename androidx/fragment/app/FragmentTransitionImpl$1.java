package androidx.fragment.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

class FragmentTransitionImpl$1
  implements Runnable
{
  public FragmentTransitionImpl$1(FragmentTransitionImpl paramFragmentTransitionImpl, int paramInt, ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3, ArrayList paramArrayList4) {}
  
  public void run()
  {
    int i = 0;
    for (;;)
    {
      int j = this.o00OoOoo;
      if (i >= j) {
        break;
      }
      View localView = (View)this.o00Ooo00.get(i);
      String str = (String)this.o00Ooo0.get(i);
      ViewCompat.o00000oO(localView, str);
      localView = (View)this.o00Ooo0O.get(i);
      str = (String)this.o00Ooo0o.get(i);
      ViewCompat.o00000oO(localView, str);
      i += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.fragment.app.FragmentTransitionImpl.1
 * JD-Core Version:    0.7.0.1
 */
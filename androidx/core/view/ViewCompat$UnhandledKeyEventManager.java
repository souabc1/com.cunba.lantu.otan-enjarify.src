package androidx.core.view;

import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

class ViewCompat$UnhandledKeyEventManager
{
  public static final ArrayList OooO0Oo;
  public WeakHashMap OooO00o = null;
  public SparseArray OooO0O0 = null;
  public WeakReference OooO0OO = null;
  
  static
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    OooO0Oo = localArrayList;
  }
  
  private SparseArray getCapturedKeys()
  {
    SparseArray localSparseArray = this.OooO0O0;
    if (localSparseArray == null)
    {
      localSparseArray = new android/util/SparseArray;
      localSparseArray.<init>();
      this.OooO0O0 = localSparseArray;
    }
    return this.OooO0O0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.view.ViewCompat.UnhandledKeyEventManager
 * JD-Core Version:    0.7.0.1
 */
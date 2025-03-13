package androidx.recyclerview.widget;

import androidx.core.util.Pools.Pool;
import androidx.core.util.Pools.SimplePool;

class ViewInfoStore$InfoRecord
{
  public static Pools.Pool OooO0Oo;
  public int OooO00o;
  public RecyclerView.ItemAnimator.ItemHolderInfo OooO0O0;
  public RecyclerView.ItemAnimator.ItemHolderInfo OooO0OO;
  
  static
  {
    Pools.SimplePool localSimplePool = new androidx/core/util/Pools$SimplePool;
    localSimplePool.<init>(20);
    OooO0Oo = localSimplePool;
  }
  
  public static void OooO00o()
  {
    Object localObject;
    do
    {
      localObject = OooO0Oo.OooO0O0();
    } while (localObject != null);
  }
  
  public static InfoRecord OooO0O0()
  {
    InfoRecord localInfoRecord = (InfoRecord)OooO0Oo.OooO0O0();
    if (localInfoRecord == null)
    {
      localInfoRecord = new androidx/recyclerview/widget/ViewInfoStore$InfoRecord;
      localInfoRecord.<init>();
    }
    return localInfoRecord;
  }
  
  public static void OooO0OO(InfoRecord paramInfoRecord)
  {
    paramInfoRecord.OooO00o = 0;
    paramInfoRecord.OooO0O0 = null;
    paramInfoRecord.OooO0OO = null;
    OooO0Oo.OooO00o(paramInfoRecord);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.ViewInfoStore.InfoRecord
 * JD-Core Version:    0.7.0.1
 */
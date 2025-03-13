package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.HashMap;

public final class LocalBroadcastManager
{
  public static final Object OooO0Oo;
  public final Context OooO00o;
  public final HashMap OooO0O0;
  public final ArrayList OooO0OO;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO0Oo = localObject;
  }
  
  public void OooO00o()
  {
    synchronized (this.OooO0O0)
    {
      int i;
      LocalBroadcastManager.BroadcastRecord[] arrayOfBroadcastRecord;
      int j;
      do
      {
        ArrayList localArrayList1 = this.OooO0OO;
        i = localArrayList1.size();
        if (i <= 0) {
          return;
        }
        arrayOfBroadcastRecord = new LocalBroadcastManager.BroadcastRecord[i];
        ArrayList localArrayList2 = this.OooO0OO;
        localArrayList2.toArray(arrayOfBroadcastRecord);
        localArrayList2 = this.OooO0OO;
        localArrayList2.clear();
        ??? = null;
        j = 0;
        localArrayList2 = null;
      } while (j >= i);
      LocalBroadcastManager.BroadcastRecord localBroadcastRecord = arrayOfBroadcastRecord[j];
      ArrayList localArrayList3 = localBroadcastRecord.OooO0O0;
      int k = localArrayList3.size();
      int m = 0;
      while (m < k)
      {
        Object localObject2 = (LocalBroadcastManager.ReceiverRecord)localBroadcastRecord.OooO0O0.get(m);
        boolean bool = ((LocalBroadcastManager.ReceiverRecord)localObject2).OooO0OO;
        if (!bool)
        {
          localObject2 = ((LocalBroadcastManager.ReceiverRecord)localObject2).OooO0O0;
          Context localContext = this.OooO00o;
          Intent localIntent = localBroadcastRecord.OooO00o;
          ((BroadcastReceiver)localObject2).onReceive(localContext, localIntent);
        }
        m += 1;
      }
      j += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.localbroadcastmanager.content.LocalBroadcastManager
 * JD-Core Version:    0.7.0.1
 */
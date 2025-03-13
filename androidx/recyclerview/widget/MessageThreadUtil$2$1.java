package androidx.recyclerview.widget;

import java.util.concurrent.atomic.AtomicBoolean;

class MessageThreadUtil$2$1
  implements Runnable
{
  public void run()
  {
    for (;;)
    {
      Object localObject1 = this.o00OoOoo.OooO00o.OooO00o();
      if (localObject1 == null)
      {
        this.o00OoOoo.OooO0OO.set(false);
        return;
      }
      int i = ((MessageThreadUtil.SyncQueueItem)localObject1).OooO0O0;
      int j = 1;
      Object localObject2;
      int m;
      if (i != j)
      {
        j = 3;
        int k = 2;
        Object localObject3;
        if (i != k)
        {
          if (i != j)
          {
            j = 4;
            if (i != j)
            {
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localObject3 = "Unsupported message, what=";
              ((StringBuilder)localObject2).append((String)localObject3);
              m = ((MessageThreadUtil.SyncQueueItem)localObject1).OooO0O0;
              ((StringBuilder)localObject2).append(m);
            }
            else
            {
              localObject1 = (TileList.Tile)((MessageThreadUtil.SyncQueueItem)localObject1).OooO0oo;
              localObject2 = this.o00OoOoo.OooO0o0;
              ((ThreadUtil.BackgroundCallback)localObject2).OooO0O0((TileList.Tile)localObject1);
            }
          }
          else
          {
            localObject2 = this.o00OoOoo.OooO0o0;
            j = ((MessageThreadUtil.SyncQueueItem)localObject1).OooO0OO;
            m = ((MessageThreadUtil.SyncQueueItem)localObject1).OooO0Oo;
            ((ThreadUtil.BackgroundCallback)localObject2).OooO0OO(j, m);
          }
        }
        else
        {
          this.o00OoOoo.OooO00o.OooO0O0(k);
          this.o00OoOoo.OooO00o.OooO0O0(j);
          localObject2 = this.o00OoOoo;
          localObject3 = ((MessageThreadUtil.2)localObject2).OooO0o0;
          k = ((MessageThreadUtil.SyncQueueItem)localObject1).OooO0OO;
          int n = ((MessageThreadUtil.SyncQueueItem)localObject1).OooO0Oo;
          int i1 = ((MessageThreadUtil.SyncQueueItem)localObject1).OooO0o0;
          int i2 = ((MessageThreadUtil.SyncQueueItem)localObject1).OooO0o;
          int i3 = ((MessageThreadUtil.SyncQueueItem)localObject1).OooO0oO;
          ((ThreadUtil.BackgroundCallback)localObject3).OooO00o(k, n, i1, i2, i3);
        }
      }
      else
      {
        this.o00OoOoo.OooO00o.OooO0O0(j);
        localObject2 = this.o00OoOoo.OooO0o0;
        m = ((MessageThreadUtil.SyncQueueItem)localObject1).OooO0OO;
        ((ThreadUtil.BackgroundCallback)localObject2).OooO0Oo(m);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.MessageThreadUtil.2.1
 * JD-Core Version:    0.7.0.1
 */
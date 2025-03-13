package androidx.recyclerview.widget;

class MessageThreadUtil$1$1
  implements Runnable
{
  public void run()
  {
    for (;;)
    {
      MessageThreadUtil.SyncQueueItem localSyncQueueItem = this.o00OoOoo.OooO00o.OooO00o();
      if (localSyncQueueItem == null) {
        break;
      }
      int i = localSyncQueueItem.OooO0O0;
      int j = 1;
      Object localObject1;
      int k;
      if (i != j)
      {
        j = 2;
        Object localObject2;
        if (i != j)
        {
          j = 3;
          if (i != j)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject2 = "Unsupported message, what=";
            ((StringBuilder)localObject1).append((String)localObject2);
            k = localSyncQueueItem.OooO0O0;
            ((StringBuilder)localObject1).append(k);
          }
          else
          {
            localObject1 = this.o00OoOoo.OooO0Oo;
            j = localSyncQueueItem.OooO0OO;
            k = localSyncQueueItem.OooO0Oo;
            ((ThreadUtil.MainThreadCallback)localObject1).OooO0O0(j, k);
          }
        }
        else
        {
          localObject1 = (TileList.Tile)localSyncQueueItem.OooO0oo;
          localObject2 = this.o00OoOoo.OooO0Oo;
          k = localSyncQueueItem.OooO0OO;
          ((ThreadUtil.MainThreadCallback)localObject2).OooO00o(k, (TileList.Tile)localObject1);
        }
      }
      else
      {
        localObject1 = this.o00OoOoo.OooO0Oo;
        j = localSyncQueueItem.OooO0OO;
        k = localSyncQueueItem.OooO0Oo;
        ((ThreadUtil.MainThreadCallback)localObject1).OooO0OO(j, k);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.MessageThreadUtil.1.1
 * JD-Core Version:    0.7.0.1
 */
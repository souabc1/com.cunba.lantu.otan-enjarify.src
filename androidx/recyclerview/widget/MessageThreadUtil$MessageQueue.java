package androidx.recyclerview.widget;

class MessageThreadUtil$MessageQueue
{
  public MessageThreadUtil.SyncQueueItem OooO00o;
  public final Object OooO0O0;
  
  public MessageThreadUtil$MessageQueue()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.OooO0O0 = localObject;
  }
  
  public MessageThreadUtil.SyncQueueItem OooO00o()
  {
    synchronized (this.OooO0O0)
    {
      MessageThreadUtil.SyncQueueItem localSyncQueueItem1 = this.OooO00o;
      if (localSyncQueueItem1 == null) {
        return null;
      }
      MessageThreadUtil.SyncQueueItem localSyncQueueItem2 = localSyncQueueItem1.OooO00o;
      this.OooO00o = localSyncQueueItem2;
      return localSyncQueueItem1;
    }
  }
  
  public void OooO0O0(int paramInt)
  {
    synchronized (this.OooO0O0)
    {
      Object localObject2;
      Object localObject3;
      for (;;)
      {
        localObject2 = this.OooO00o;
        if (localObject2 == null) {
          break;
        }
        int i = ((MessageThreadUtil.SyncQueueItem)localObject2).OooO0O0;
        if (i != paramInt) {
          break;
        }
        localObject3 = ((MessageThreadUtil.SyncQueueItem)localObject2).OooO00o;
        this.OooO00o = ((MessageThreadUtil.SyncQueueItem)localObject3);
        ((MessageThreadUtil.SyncQueueItem)localObject2).OooO0Oo();
      }
      if (localObject2 != null)
      {
        MessageThreadUtil.SyncQueueItem localSyncQueueItem;
        for (localObject3 = ((MessageThreadUtil.SyncQueueItem)localObject2).OooO00o; localObject3 != null; localObject3 = localSyncQueueItem)
        {
          localSyncQueueItem = ((MessageThreadUtil.SyncQueueItem)localObject3).OooO00o;
          int j = ((MessageThreadUtil.SyncQueueItem)localObject3).OooO0O0;
          if (j == paramInt)
          {
            ((MessageThreadUtil.SyncQueueItem)localObject2).OooO00o = localSyncQueueItem;
            ((MessageThreadUtil.SyncQueueItem)localObject3).OooO0Oo();
          }
          else
          {
            localObject2 = localObject3;
          }
        }
      }
      return;
    }
  }
  
  public void OooO0OO(MessageThreadUtil.SyncQueueItem paramSyncQueueItem)
  {
    synchronized (this.OooO0O0)
    {
      Object localObject2 = this.OooO00o;
      if (localObject2 == null)
      {
        this.OooO00o = paramSyncQueueItem;
        return;
      }
      for (;;)
      {
        MessageThreadUtil.SyncQueueItem localSyncQueueItem = ((MessageThreadUtil.SyncQueueItem)localObject2).OooO00o;
        if (localSyncQueueItem == null) {
          break;
        }
        localObject2 = localSyncQueueItem;
      }
      ((MessageThreadUtil.SyncQueueItem)localObject2).OooO00o = paramSyncQueueItem;
      return;
    }
  }
  
  public void OooO0Oo(MessageThreadUtil.SyncQueueItem paramSyncQueueItem)
  {
    synchronized (this.OooO0O0)
    {
      MessageThreadUtil.SyncQueueItem localSyncQueueItem = this.OooO00o;
      paramSyncQueueItem.OooO00o = localSyncQueueItem;
      this.OooO00o = paramSyncQueueItem;
      return;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.MessageThreadUtil.MessageQueue
 * JD-Core Version:    0.7.0.1
 */
package androidx.recyclerview.widget;

class MessageThreadUtil$SyncQueueItem
{
  public static SyncQueueItem OooO;
  public static final Object OooOO0;
  public SyncQueueItem OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  public int OooO0oO;
  public Object OooO0oo;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooOO0 = localObject;
  }
  
  public static SyncQueueItem OooO00o(int paramInt1, int paramInt2, int paramInt3)
  {
    return OooO0O0(paramInt1, paramInt2, paramInt3, 0, 0, 0, null);
  }
  
  public static SyncQueueItem OooO0O0(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Object paramObject)
  {
    synchronized (OooOO0)
    {
      SyncQueueItem localSyncQueueItem1 = OooO;
      if (localSyncQueueItem1 == null)
      {
        localSyncQueueItem1 = new androidx/recyclerview/widget/MessageThreadUtil$SyncQueueItem;
        localSyncQueueItem1.<init>();
      }
      else
      {
        SyncQueueItem localSyncQueueItem2 = localSyncQueueItem1.OooO00o;
        OooO = localSyncQueueItem2;
        localSyncQueueItem2 = null;
        localSyncQueueItem1.OooO00o = null;
      }
      localSyncQueueItem1.OooO0O0 = paramInt1;
      localSyncQueueItem1.OooO0OO = paramInt2;
      localSyncQueueItem1.OooO0Oo = paramInt3;
      localSyncQueueItem1.OooO0o0 = paramInt4;
      localSyncQueueItem1.OooO0o = paramInt5;
      localSyncQueueItem1.OooO0oO = paramInt6;
      localSyncQueueItem1.OooO0oo = paramObject;
      return localSyncQueueItem1;
    }
  }
  
  public static SyncQueueItem OooO0OO(int paramInt1, int paramInt2, Object paramObject)
  {
    return OooO0O0(paramInt1, paramInt2, 0, 0, 0, 0, paramObject);
  }
  
  public void OooO0Oo()
  {
    this.OooO00o = null;
    SyncQueueItem localSyncQueueItem = null;
    this.OooO0oO = 0;
    this.OooO0o = 0;
    this.OooO0o0 = 0;
    this.OooO0Oo = 0;
    this.OooO0OO = 0;
    this.OooO0O0 = 0;
    this.OooO0oo = null;
    synchronized (OooOO0)
    {
      localSyncQueueItem = OooO;
      if (localSyncQueueItem != null) {
        this.OooO00o = localSyncQueueItem;
      }
      OooO = this;
      return;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.MessageThreadUtil.SyncQueueItem
 * JD-Core Version:    0.7.0.1
 */
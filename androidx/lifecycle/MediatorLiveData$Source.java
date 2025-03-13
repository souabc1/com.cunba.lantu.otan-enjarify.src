package androidx.lifecycle;

class MediatorLiveData$Source
  implements Observer
{
  public final LiveData OooO00o;
  public final Observer OooO0O0;
  public int OooO0OO = -1;
  
  public MediatorLiveData$Source(LiveData paramLiveData, Observer paramObserver)
  {
    this.OooO00o = paramLiveData;
    this.OooO0O0 = paramObserver;
  }
  
  public void OooO00o(Object paramObject)
  {
    int i = this.OooO0OO;
    LiveData localLiveData = this.OooO00o;
    int j = localLiveData.getVersion();
    if (i != j)
    {
      i = this.OooO00o.getVersion();
      this.OooO0OO = i;
      Observer localObserver = this.OooO0O0;
      localObserver.OooO00o(paramObject);
    }
  }
  
  public void OooO0O0()
  {
    this.OooO00o.OooO0oo(this);
  }
  
  public void OooO0OO()
  {
    this.OooO00o.OooOO0o(this);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.MediatorLiveData.Source
 * JD-Core Version:    0.7.0.1
 */
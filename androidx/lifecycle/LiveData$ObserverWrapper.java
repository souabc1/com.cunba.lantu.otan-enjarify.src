package androidx.lifecycle;

abstract class LiveData$ObserverWrapper
{
  public final Observer o00OoOoo;
  public int o00Ooo0 = -1;
  public boolean o00Ooo00;
  
  public LiveData$ObserverWrapper(LiveData paramLiveData, Observer paramObserver)
  {
    this.o00OoOoo = paramObserver;
  }
  
  public void OooO() {}
  
  public void OooO0oo(boolean paramBoolean)
  {
    boolean bool = this.o00Ooo00;
    if (paramBoolean == bool) {
      return;
    }
    this.o00Ooo00 = paramBoolean;
    LiveData localLiveData1 = this.o00Ooo0O;
    if (paramBoolean) {
      paramBoolean = true;
    } else {
      paramBoolean = true;
    }
    localLiveData1.OooO0OO(paramBoolean);
    paramBoolean = this.o00Ooo00;
    if (paramBoolean)
    {
      LiveData localLiveData2 = this.o00Ooo0O;
      localLiveData2.OooO0o0(this);
    }
  }
  
  public boolean OooOO0(LifecycleOwner paramLifecycleOwner)
  {
    return false;
  }
  
  public abstract boolean OooOO0O();
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.LiveData.ObserverWrapper
 * JD-Core Version:    0.7.0.1
 */
package androidx.lifecycle;

class LiveData$1
  implements Runnable
{
  public LiveData$1(LiveData paramLiveData) {}
  
  public void run()
  {
    synchronized (this.o00OoOoo.OooO00o)
    {
      Object localObject2 = this.o00OoOoo;
      localObject2 = ((LiveData)localObject2).OooO0o;
      LiveData localLiveData = this.o00OoOoo;
      Object localObject4 = LiveData.OooOO0O;
      localLiveData.OooO0o = localObject4;
      this.o00OoOoo.setValue(localObject2);
      return;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.lifecycle.LiveData.1
 * JD-Core Version:    0.7.0.1
 */
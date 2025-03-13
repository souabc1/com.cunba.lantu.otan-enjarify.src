package androidx.concurrent.futures;

public final class CallbackToFutureAdapter$Completer
{
  public Object OooO00o;
  public CallbackToFutureAdapter.SafeFuture OooO0O0;
  public ResolvableFuture OooO0OO;
  public boolean OooO0Oo;
  
  public CallbackToFutureAdapter$Completer()
  {
    ResolvableFuture localResolvableFuture = ResolvableFuture.OooOOo();
    this.OooO0OO = localResolvableFuture;
  }
  
  public void OooO00o()
  {
    this.OooO00o = null;
    this.OooO0O0 = null;
    this.OooO0OO.OooOOOO(null);
  }
  
  public void finalize()
  {
    Object localObject1 = this.OooO0O0;
    boolean bool1;
    CallbackToFutureAdapter.FutureGarbageCollectedException localFutureGarbageCollectedException;
    if (localObject1 != null)
    {
      bool1 = ((CallbackToFutureAdapter.SafeFuture)localObject1).isDone();
      if (!bool1)
      {
        localFutureGarbageCollectedException = new androidx/concurrent/futures/CallbackToFutureAdapter$FutureGarbageCollectedException;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
        Object localObject3 = this.OooO00o;
        ((StringBuilder)localObject2).append(localObject3);
        localObject2 = ((StringBuilder)localObject2).toString();
        localFutureGarbageCollectedException.<init>((String)localObject2);
        ((CallbackToFutureAdapter.SafeFuture)localObject1).OooO00o(localFutureGarbageCollectedException);
      }
    }
    boolean bool2 = this.OooO0Oo;
    if (!bool2)
    {
      localObject1 = this.OooO0OO;
      if (localObject1 != null)
      {
        bool1 = false;
        localFutureGarbageCollectedException = null;
        ((ResolvableFuture)localObject1).OooOOOO(null);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.concurrent.futures.CallbackToFutureAdapter.Completer
 * JD-Core Version:    0.7.0.1
 */
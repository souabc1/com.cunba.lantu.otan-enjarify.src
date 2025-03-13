package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public abstract interface ListenableFuture
  extends Future
{
  public abstract void addListener(Runnable paramRunnable, Executor paramExecutor);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.common.util.concurrent.ListenableFuture
 * JD-Core Version:    0.7.0.1
 */
package androidx.recyclerview.widget;

import java.util.concurrent.Executor;

public final class AsyncDifferConfig
{
  public final Executor OooO00o;
  public final Executor OooO0O0;
  public final DiffUtil.ItemCallback OooO0OO;
  
  public Executor getBackgroundThreadExecutor()
  {
    return this.OooO0O0;
  }
  
  public DiffUtil.ItemCallback getDiffCallback()
  {
    return this.OooO0OO;
  }
  
  public Executor getMainThreadExecutor()
  {
    return this.OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.AsyncDifferConfig
 * JD-Core Version:    0.7.0.1
 */
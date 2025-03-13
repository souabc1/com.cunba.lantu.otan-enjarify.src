package androidx.recyclerview.widget;

import java.util.concurrent.Executor;

class AsyncListDiffer$1
  implements Runnable
{
  public void run()
  {
    Object localObject = new androidx/recyclerview/widget/AsyncListDiffer$1$1;
    ((AsyncListDiffer.1.1)localObject).<init>(this);
    localObject = DiffUtil.OooO0O0((DiffUtil.Callback)localObject);
    Executor localExecutor = this.o00Ooo0o.OooO0OO;
    AsyncListDiffer.1.2 local2 = new androidx/recyclerview/widget/AsyncListDiffer$1$2;
    local2.<init>(this, (DiffUtil.DiffResult)localObject);
    localExecutor.execute(local2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.AsyncListDiffer.1
 * JD-Core Version:    0.7.0.1
 */
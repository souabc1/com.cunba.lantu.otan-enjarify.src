package androidx.recyclerview.widget;

import java.util.List;

class AsyncListDiffer$1$2
  implements Runnable
{
  public AsyncListDiffer$1$2(AsyncListDiffer.1 param1, DiffUtil.DiffResult paramDiffResult) {}
  
  public void run()
  {
    Object localObject = this.o00Ooo00;
    AsyncListDiffer localAsyncListDiffer = ((AsyncListDiffer.1)localObject).o00Ooo0o;
    int i = localAsyncListDiffer.OooO0oO;
    int j = ((AsyncListDiffer.1)localObject).o00Ooo0;
    if (i == j)
    {
      List localList = ((AsyncListDiffer.1)localObject).o00Ooo00;
      DiffUtil.DiffResult localDiffResult = this.o00OoOoo;
      localObject = ((AsyncListDiffer.1)localObject).o00Ooo0O;
      localAsyncListDiffer.OooO00o(localList, localDiffResult, (Runnable)localObject);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.recyclerview.widget.AsyncListDiffer.1.2
 * JD-Core Version:    0.7.0.1
 */
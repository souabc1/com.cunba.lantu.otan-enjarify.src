package androidx.window.embedding;

import java.util.concurrent.locks.Lock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class SplitController$Companion
{
  public final SplitController getInstance()
  {
    Object localObject1 = SplitController.OooO00o();
    if (localObject1 == null)
    {
      localObject1 = SplitController.OooO0O0();
      ((Lock)localObject1).lock();
      try
      {
        Object localObject2 = SplitController.OooO00o();
        if (localObject2 == null)
        {
          localObject2 = new androidx/window/embedding/SplitController;
          ((SplitController)localObject2).<init>(null);
          SplitController.OooO0OO((SplitController)localObject2);
        }
        localObject2 = Unit.OooO00o;
      }
      finally
      {
        ((Lock)localObject1).unlock();
      }
    }
    localObject1 = SplitController.OooO00o();
    Intrinsics.OooO0OO(localObject1);
    return localObject1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.embedding.SplitController.Companion
 * JD-Core Version:    0.7.0.1
 */
package androidx.window.embedding;

import android.app.Activity;
import androidx.core.util.Consumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

public final class ExtensionEmbeddingBackend$SplitListenerWrapper
{
  public final Activity OooO00o;
  public final Executor OooO0O0;
  public final Consumer OooO0OO;
  public List OooO0Oo;
  
  public static final void OooO0OO(SplitListenerWrapper paramSplitListenerWrapper, List paramList)
  {
    Intrinsics.OooO0o(paramSplitListenerWrapper, "this$0");
    Intrinsics.OooO0o(paramList, "$splitsWithActivity");
    paramSplitListenerWrapper.OooO0OO.accept(paramList);
  }
  
  public final void OooO0O0(List paramList)
  {
    Intrinsics.OooO0o(paramList, "splitInfoList");
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    paramList = paramList.iterator();
    for (;;)
    {
      boolean bool1 = paramList.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = paramList.next();
      Object localObject2 = localObject1;
      localObject2 = (SplitInfo)localObject1;
      Activity localActivity = this.OooO00o;
      boolean bool2 = ((SplitInfo)localObject2).OooO00o(localActivity);
      if (bool2) {
        localArrayList.add(localObject1);
      }
    }
    paramList = this.OooO0Oo;
    boolean bool3 = Intrinsics.OooO00o(localArrayList, paramList);
    if (bool3) {
      return;
    }
    this.OooO0Oo = localArrayList;
    paramList = this.OooO0O0;
    Object localObject1 = new androidx/window/embedding/OooOO0;
    ((OooOO0)localObject1).<init>(this, localArrayList);
    paramList.execute((Runnable)localObject1);
  }
  
  public final Consumer getCallback()
  {
    return this.OooO0OO;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.embedding.ExtensionEmbeddingBackend.SplitListenerWrapper
 * JD-Core Version:    0.7.0.1
 */
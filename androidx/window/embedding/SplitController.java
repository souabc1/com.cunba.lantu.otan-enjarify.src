package androidx.window.embedding;

import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;

public final class SplitController
{
  public static final SplitController.Companion OooO0OO;
  public static volatile SplitController OooO0Oo;
  public static final ReentrantLock OooO0o0;
  public final EmbeddingBackend OooO00o;
  public Set OooO0O0;
  
  static
  {
    Object localObject = new androidx/window/embedding/SplitController$Companion;
    ((SplitController.Companion)localObject).<init>(null);
    OooO0OO = (SplitController.Companion)localObject;
    localObject = new java/util/concurrent/locks/ReentrantLock;
    ((ReentrantLock)localObject).<init>();
    OooO0o0 = (ReentrantLock)localObject;
  }
  
  private SplitController()
  {
    Object localObject = ExtensionEmbeddingBackend.OooO0o0.getInstance();
    this.OooO00o = ((EmbeddingBackend)localObject);
    localObject = SetsKt.OooO0Oo();
    this.OooO0O0 = ((Set)localObject);
  }
  
  public static final SplitController getInstance()
  {
    return OooO0OO.getInstance();
  }
  
  private final void setStaticSplitRules(Set paramSet)
  {
    this.OooO0O0 = paramSet;
    this.OooO00o.setSplitRules(paramSet);
  }
  
  public final Set getSplitRules()
  {
    return CollectionsKt.o00O0O(this.OooO00o.getSplitRules());
  }
  
  public final boolean isSplitSupported()
  {
    return this.OooO00o.isSplitSupported();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.embedding.SplitController
 * JD-Core Version:    0.7.0.1
 */
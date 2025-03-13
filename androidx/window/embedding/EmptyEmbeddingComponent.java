package androidx.window.embedding;

import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.jvm.internal.Intrinsics;

final class EmptyEmbeddingComponent
  implements ActivityEmbeddingComponent
{
  public void setEmbeddingRules(Set paramSet)
  {
    Intrinsics.OooO0o(paramSet, "splitRules");
  }
  
  public void setSplitInfoCallback(Consumer paramConsumer)
  {
    Intrinsics.OooO0o(paramConsumer, "consumer");
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.embedding.EmptyEmbeddingComponent
 * JD-Core Version:    0.7.0.1
 */
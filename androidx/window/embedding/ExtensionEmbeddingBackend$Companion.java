package androidx.window.embedding;

import java.util.concurrent.locks.Lock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class ExtensionEmbeddingBackend$Companion
{
  public final EmbeddingInterfaceCompat OooO00o()
  {
    Object localObject1 = null;
    try
    {
      Object localObject2 = EmbeddingCompat.OooO0OO;
      localObject4 = ((EmbeddingCompat.Companion)localObject2).getExtensionApiLevel();
      boolean bool1 = OooO0O0((Integer)localObject4);
      if (bool1)
      {
        boolean bool2 = ((EmbeddingCompat.Companion)localObject2).isEmbeddingAvailable();
        if (bool2)
        {
          localObject2 = new androidx/window/embedding/EmbeddingCompat;
          ((EmbeddingCompat)localObject2).<init>();
          localObject1 = localObject2;
        }
      }
    }
    finally
    {
      Object localObject4 = "Failed to load embedding extension: ";
      Intrinsics.OooOOOO((String)localObject4, localObject3);
    }
    return localObject1;
  }
  
  public final boolean OooO0O0(Integer paramInteger)
  {
    boolean bool = false;
    if (paramInteger == null) {
      return false;
    }
    int i = paramInteger.intValue();
    int j = 1;
    if (i >= j) {
      bool = j;
    }
    return bool;
  }
  
  public final ExtensionEmbeddingBackend getInstance()
  {
    Object localObject1 = ExtensionEmbeddingBackend.OooO00o();
    if (localObject1 == null)
    {
      localObject1 = ExtensionEmbeddingBackend.OooO0O0();
      ((Lock)localObject1).lock();
      try
      {
        Object localObject2 = ExtensionEmbeddingBackend.OooO00o();
        if (localObject2 == null)
        {
          localObject2 = ExtensionEmbeddingBackend.OooO0o0;
          localObject2 = ((Companion)localObject2).OooO00o();
          ExtensionEmbeddingBackend localExtensionEmbeddingBackend = new androidx/window/embedding/ExtensionEmbeddingBackend;
          localExtensionEmbeddingBackend.<init>((EmbeddingInterfaceCompat)localObject2);
          ExtensionEmbeddingBackend.OooO0OO(localExtensionEmbeddingBackend);
        }
        localObject2 = Unit.OooO00o;
      }
      finally
      {
        ((Lock)localObject1).unlock();
      }
    }
    localObject1 = ExtensionEmbeddingBackend.OooO00o();
    Intrinsics.OooO0OO(localObject1);
    return localObject1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.embedding.ExtensionEmbeddingBackend.Companion
 * JD-Core Version:    0.7.0.1
 */
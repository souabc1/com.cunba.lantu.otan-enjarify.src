package androidx.window.embedding;

import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.internal.Intrinsics;

public final class EmbeddingTranslatingCallback
  implements Consumer
{
  public final EmbeddingInterfaceCompat.EmbeddingCallbackInterface o00OoOoo;
  public final EmbeddingAdapter o00Ooo00;
  
  public EmbeddingTranslatingCallback(EmbeddingInterfaceCompat.EmbeddingCallbackInterface paramEmbeddingCallbackInterface, EmbeddingAdapter paramEmbeddingAdapter)
  {
    this.o00OoOoo = paramEmbeddingCallbackInterface;
    this.o00Ooo00 = paramEmbeddingAdapter;
  }
  
  public void OooO00o(List paramList)
  {
    Intrinsics.OooO0o(paramList, "splitInfoList");
    EmbeddingInterfaceCompat.EmbeddingCallbackInterface localEmbeddingCallbackInterface = this.o00OoOoo;
    paramList = this.o00Ooo00.OooO(paramList);
    localEmbeddingCallbackInterface.OooO00o(paramList);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.embedding.EmbeddingTranslatingCallback
 * JD-Core Version:    0.7.0.1
 */
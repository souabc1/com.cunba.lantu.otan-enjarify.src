package androidx.window.embedding;

import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;

public final class EmbeddingCompat$Companion
{
  public final ActivityEmbeddingComponent OooO00o()
  {
    boolean bool = isEmbeddingAvailable();
    if (bool)
    {
      localObject = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent();
      if (localObject != null) {
        return localObject;
      }
      localObject = new androidx/window/embedding/EmptyEmbeddingComponent;
      ((EmptyEmbeddingComponent)localObject).<init>();
    }
    else
    {
      localObject = new androidx/window/embedding/EmptyEmbeddingComponent;
      ((EmptyEmbeddingComponent)localObject).<init>();
    }
    Object localObject = (ActivityEmbeddingComponent)localObject;
    return localObject;
  }
  
  public final Integer getExtensionApiLevel()
  {
    Integer localInteger = null;
    try
    {
      WindowExtensions localWindowExtensions = WindowExtensionsProvider.getWindowExtensions();
      int i = localWindowExtensions.getVendorApiLevel();
      localInteger = Integer.valueOf(i);
    }
    catch (NoClassDefFoundError|UnsupportedOperationException localNoClassDefFoundError)
    {
      label18:
      break label18;
    }
    return localInteger;
  }
  
  public final boolean isEmbeddingAvailable()
  {
    boolean bool = false;
    try
    {
      Object localObject = WindowExtensionsProvider.getWindowExtensions();
      localObject = ((WindowExtensions)localObject).getActivityEmbeddingComponent();
      if (localObject != null) {
        bool = true;
      }
    }
    catch (NoClassDefFoundError|UnsupportedOperationException localNoClassDefFoundError)
    {
      label19:
      break label19;
    }
    return bool;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.embedding.EmbeddingCompat.Companion
 * JD-Core Version:    0.7.0.1
 */
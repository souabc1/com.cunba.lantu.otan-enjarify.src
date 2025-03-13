package androidx.window.embedding;

import java.util.Set;

public abstract interface EmbeddingBackend
{
  public abstract Set getSplitRules();
  
  public abstract boolean isSplitSupported();
  
  public abstract void setSplitRules(Set paramSet);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.window.embedding.EmbeddingBackend
 * JD-Core Version:    0.7.0.1
 */
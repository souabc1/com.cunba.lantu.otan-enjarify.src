package androidx.emoji2.text;

import android.util.SparseArray;

class MetadataRepo$Node
{
  public final SparseArray OooO00o;
  public EmojiMetadata OooO0O0;
  
  private MetadataRepo$Node()
  {
    this(1);
  }
  
  public MetadataRepo$Node(int paramInt)
  {
    SparseArray localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>(paramInt);
    this.OooO00o = localSparseArray;
  }
  
  public void OooO00o(EmojiMetadata paramEmojiMetadata, int paramInt1, int paramInt2)
  {
    int i = paramEmojiMetadata.getCodepointAt(paramInt1);
    Node localNode = get(i);
    if (localNode == null)
    {
      localNode = new androidx/emoji2/text/MetadataRepo$Node;
      localNode.<init>();
      SparseArray localSparseArray = this.OooO00o;
      int j = paramEmojiMetadata.getCodepointAt(paramInt1);
      localSparseArray.put(j, localNode);
    }
    if (paramInt2 > paramInt1)
    {
      paramInt1 += 1;
      localNode.OooO00o(paramEmojiMetadata, paramInt1, paramInt2);
    }
    else
    {
      localNode.OooO0O0 = paramEmojiMetadata;
    }
  }
  
  public Node get(int paramInt)
  {
    SparseArray localSparseArray = this.OooO00o;
    Node localNode;
    if (localSparseArray == null)
    {
      paramInt = 0;
      localNode = null;
    }
    else
    {
      localNode = (Node)localSparseArray.get(paramInt);
    }
    return localNode;
  }
  
  public final EmojiMetadata getData()
  {
    return this.OooO0O0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.MetadataRepo.Node
 * JD-Core Version:    0.7.0.1
 */
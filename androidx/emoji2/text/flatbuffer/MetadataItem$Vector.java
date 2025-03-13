package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class MetadataItem$Vector
  extends BaseVector
{
  public MetadataItem OooO0O0(MetadataItem paramMetadataItem, int paramInt)
  {
    paramInt = OooO00o(paramInt);
    ByteBuffer localByteBuffer = this.OooO0OO;
    paramInt = MetadataItem.OooOO0o(paramInt, localByteBuffer);
    localByteBuffer = this.OooO0OO;
    return paramMetadataItem.OooOO0(paramInt, localByteBuffer);
  }
  
  public MetadataItem get(int paramInt)
  {
    MetadataItem localMetadataItem = new androidx/emoji2/text/flatbuffer/MetadataItem;
    localMetadataItem.<init>();
    return OooO0O0(localMetadataItem, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.MetadataItem.Vector
 * JD-Core Version:    0.7.0.1
 */
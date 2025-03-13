package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class MetadataList$Vector
  extends BaseVector
{
  public MetadataList OooO0O0(MetadataList paramMetadataList, int paramInt)
  {
    paramInt = OooO00o(paramInt);
    ByteBuffer localByteBuffer = this.OooO0OO;
    paramInt = MetadataList.OooOO0o(paramInt, localByteBuffer);
    localByteBuffer = this.OooO0OO;
    return paramMetadataList.OooOO0(paramInt, localByteBuffer);
  }
  
  public MetadataList get(int paramInt)
  {
    MetadataList localMetadataList = new androidx/emoji2/text/flatbuffer/MetadataList;
    localMetadataList.<init>();
    return OooO0O0(localMetadataList, paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.MetadataList.Vector
 * JD-Core Version:    0.7.0.1
 */
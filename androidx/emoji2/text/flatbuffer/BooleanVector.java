package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class BooleanVector
  extends BaseVector
{
  public boolean get(int paramInt)
  {
    ByteBuffer localByteBuffer = this.OooO0OO;
    paramInt = OooO00o(paramInt);
    paramInt = localByteBuffer.get(paramInt);
    if (paramInt != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    return paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.BooleanVector
 * JD-Core Version:    0.7.0.1
 */
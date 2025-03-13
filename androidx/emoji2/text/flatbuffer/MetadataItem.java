package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class MetadataItem
  extends Table
{
  public MetadataItem OooOO0(int paramInt, ByteBuffer paramByteBuffer)
  {
    OooOO0O(paramInt, paramByteBuffer);
    return this;
  }
  
  public void OooOO0O(int paramInt, ByteBuffer paramByteBuffer)
  {
    OooO0Oo(paramInt, paramByteBuffer);
  }
  
  public int OooOOO()
  {
    int i = OooO0OO(16);
    if (i != 0) {
      i = OooO0oo(i);
    } else {
      i = 0;
    }
    return i;
  }
  
  public int OooOOO0(int paramInt)
  {
    int i = OooO0OO(16);
    if (i != 0)
    {
      ByteBuffer localByteBuffer = this.OooO0O0;
      i = OooO0oO(i);
      paramInt *= 4;
      i += paramInt;
      paramInt = localByteBuffer.getInt(i);
    }
    else
    {
      paramInt = 0;
    }
    return paramInt;
  }
  
  public short OooOOOO()
  {
    int i = OooO0OO(10);
    if (i != 0)
    {
      ByteBuffer localByteBuffer = this.OooO0O0;
      int j = this.OooO00o;
      i += j;
      i = localByteBuffer.getShort(i);
    }
    else
    {
      i = 0;
    }
    return i;
  }
  
  public boolean OooOOOo()
  {
    int i = OooO0OO(6);
    boolean bool = false;
    if (i != 0)
    {
      ByteBuffer localByteBuffer = this.OooO0O0;
      int j = this.OooO00o;
      i += j;
      i = localByteBuffer.get(i);
      if (i != 0) {
        bool = true;
      }
    }
    return bool;
  }
  
  public int OooOOo()
  {
    int i = OooO0OO(4);
    if (i != 0)
    {
      ByteBuffer localByteBuffer = this.OooO0O0;
      int j = this.OooO00o;
      i += j;
      i = localByteBuffer.getInt(i);
    }
    else
    {
      i = 0;
    }
    return i;
  }
  
  public short OooOOo0()
  {
    int i = OooO0OO(14);
    if (i != 0)
    {
      ByteBuffer localByteBuffer = this.OooO0O0;
      int j = this.OooO00o;
      i += j;
      i = localByteBuffer.getShort(i);
    }
    else
    {
      i = 0;
    }
    return i;
  }
  
  public short OooOOoo()
  {
    int i = OooO0OO(8);
    if (i != 0)
    {
      ByteBuffer localByteBuffer = this.OooO0O0;
      int j = this.OooO00o;
      i += j;
      i = localByteBuffer.getShort(i);
    }
    else
    {
      i = 0;
    }
    return i;
  }
  
  public short OooOo00()
  {
    int i = OooO0OO(12);
    if (i != 0)
    {
      ByteBuffer localByteBuffer = this.OooO0O0;
      int j = this.OooO00o;
      i += j;
      i = localByteBuffer.getShort(i);
    }
    else
    {
      i = 0;
    }
    return i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.MetadataItem
 * JD-Core Version:    0.7.0.1
 */
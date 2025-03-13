package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public class Table
{
  public int OooO00o;
  public ByteBuffer OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  public Utf8 OooO0o0;
  
  public Table()
  {
    Utf8 localUtf8 = Utf8.getDefault();
    this.OooO0o0 = localUtf8;
  }
  
  public static int OooO0O0(int paramInt, ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.getInt(paramInt);
    return paramInt + i;
  }
  
  public static String OooO0o(int paramInt, ByteBuffer paramByteBuffer, Utf8 paramUtf8)
  {
    int i = paramByteBuffer.getInt(paramInt);
    paramInt += i;
    i = paramByteBuffer.getInt(paramInt);
    paramInt += 4;
    return paramUtf8.OooO00o(paramByteBuffer, paramInt, i);
  }
  
  public int OooO(Integer paramInteger1, Integer paramInteger2, ByteBuffer paramByteBuffer)
  {
    return 0;
  }
  
  public int OooO00o(int paramInt)
  {
    int i = this.OooO0O0.getInt(paramInt);
    return paramInt + i;
  }
  
  public int OooO0OO(int paramInt)
  {
    int i = this.OooO0Oo;
    if (paramInt < i)
    {
      ByteBuffer localByteBuffer = this.OooO0O0;
      int j = this.OooO0OO + paramInt;
      paramInt = localByteBuffer.getShort(j);
    }
    else
    {
      paramInt = 0;
    }
    return paramInt;
  }
  
  public void OooO0Oo(int paramInt, ByteBuffer paramByteBuffer)
  {
    this.OooO0O0 = paramByteBuffer;
    if (paramByteBuffer != null)
    {
      this.OooO00o = paramInt;
      int i = paramByteBuffer.getInt(paramInt);
      paramInt -= i;
      this.OooO0OO = paramInt;
      paramByteBuffer = this.OooO0O0;
      paramInt = paramByteBuffer.getShort(paramInt);
    }
    else
    {
      paramInt = 0;
      this.OooO00o = 0;
      this.OooO0OO = 0;
    }
    this.OooO0Oo = paramInt;
  }
  
  public String OooO0o0(int paramInt)
  {
    ByteBuffer localByteBuffer = this.OooO0O0;
    Utf8 localUtf8 = this.OooO0o0;
    return OooO0o(paramInt, localByteBuffer, localUtf8);
  }
  
  public int OooO0oO(int paramInt)
  {
    int i = this.OooO00o;
    paramInt += i;
    i = this.OooO0O0.getInt(paramInt);
    return paramInt + i + 4;
  }
  
  public int OooO0oo(int paramInt)
  {
    int i = this.OooO00o;
    paramInt += i;
    i = this.OooO0O0.getInt(paramInt);
    paramInt += i;
    return this.OooO0O0.getInt(paramInt);
  }
  
  public ByteBuffer getByteBuffer()
  {
    return this.OooO0O0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.Table
 * JD-Core Version:    0.7.0.1
 */
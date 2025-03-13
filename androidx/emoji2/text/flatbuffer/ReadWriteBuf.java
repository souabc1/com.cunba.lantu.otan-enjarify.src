package androidx.emoji2.text.flatbuffer;

abstract interface ReadWriteBuf
  extends ReadBuf
{
  public abstract void set(int paramInt, byte paramByte);
  
  public abstract void setBoolean(int paramInt, boolean paramBoolean);
  
  public abstract void setDouble(int paramInt, double paramDouble);
  
  public abstract void setFloat(int paramInt, float paramFloat);
  
  public abstract void setInt(int paramInt1, int paramInt2);
  
  public abstract void setLong(int paramInt, long paramLong);
  
  public abstract void setShort(int paramInt, short paramShort);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.ReadWriteBuf
 * JD-Core Version:    0.7.0.1
 */
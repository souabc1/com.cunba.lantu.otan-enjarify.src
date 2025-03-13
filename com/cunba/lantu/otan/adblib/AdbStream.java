package com.cunba.lantu.otan.adblib;

import java.io.Closeable;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import m54207b69;

public class AdbStream
  implements Closeable
{
  public final AdbConnection o00OoOoo;
  public volatile int o00Ooo0;
  public final int o00Ooo00;
  public final AtomicBoolean o00Ooo0O;
  public final Queue o00Ooo0o;
  public volatile boolean o00OooO;
  public volatile boolean o00OooO0;
  
  public AdbStream(AdbConnection paramAdbConnection, int paramInt)
  {
    this.o00OoOoo = paramAdbConnection;
    this.o00Ooo00 = paramInt;
    paramAdbConnection = new java/util/concurrent/ConcurrentLinkedQueue;
    paramAdbConnection.<init>();
    this.o00Ooo0o = paramAdbConnection;
    paramAdbConnection = new java/util/concurrent/atomic/AtomicBoolean;
    paramAdbConnection.<init>(false);
    this.o00Ooo0O = paramAdbConnection;
    this.o00OooO0 = false;
  }
  
  public void OooO00o(byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramArrayOfByte;
    m54207b69.F54207b69_00(60, arrayOfObject);
  }
  
  public void OooO0OO(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    arrayOfObject[1] = localBoolean;
    m54207b69.F54207b69_00(61, arrayOfObject);
  }
  
  public void OooO0Oo()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(62, arrayOfObject);
  }
  
  public void OooO0o0()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(63, arrayOfObject);
  }
  
  public void OooO0oO(int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    Integer localInteger = Integer.valueOf(paramInt);
    arrayOfObject[1] = localInteger;
    m54207b69.F54207b69_00(64, arrayOfObject);
  }
  
  public void close()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(65, arrayOfObject);
  }
  
  public boolean isClosed()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_01(66, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.adblib.AdbStream
 * JD-Core Version:    0.7.0.1
 */
package com.cunba.lantu.otan.adblib;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import m54207b69;

public class AdbConnection
  implements Closeable
{
  public Socket o00OoOoo;
  public volatile InputStream o00Ooo0;
  public int o00Ooo00;
  public volatile OutputStream o00Ooo0O;
  public volatile Thread o00Ooo0o;
  public volatile boolean o00OooO;
  public volatile boolean o00OooO0;
  public volatile boolean o00OooOO;
  public volatile boolean o00OooOo;
  public volatile AdbCrypto o00OoooO;
  public boolean o00Ooooo;
  public volatile ConcurrentHashMap o00o0000;
  public volatile int o0O00o0;
  
  private AdbConnection()
  {
    Object localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>();
    this.o00o0000 = ((ConcurrentHashMap)localObject);
    this.o00Ooo00 = 0;
    localObject = OooOooO();
    this.o00Ooo0o = ((Thread)localObject);
  }
  
  public static AdbConnection OooOoo(Socket paramSocket, AdbCrypto paramAdbCrypto)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramSocket;
    arrayOfObject[1] = paramAdbCrypto;
    return (AdbConnection)m54207b69.F54207b69_09(41, arrayOfObject);
  }
  
  public boolean OooOo(long paramLong, TimeUnit paramTimeUnit, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = this;
    Object localObject = Long.valueOf(paramLong);
    arrayOfObject[1] = localObject;
    arrayOfObject[2] = paramTimeUnit;
    localObject = Boolean.valueOf(paramBoolean);
    arrayOfObject[3] = localObject;
    return m54207b69.F54207b69_01(39, arrayOfObject);
  }
  
  public final void OooOo0O()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(40, arrayOfObject);
  }
  
  public final Thread OooOooO()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return (Thread)m54207b69.F54207b69_09(42, arrayOfObject);
  }
  
  public AdbStream OooOooo(String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this;
    arrayOfObject[1] = paramString;
    return (AdbStream)m54207b69.F54207b69_09(43, arrayOfObject);
  }
  
  public final boolean Oooo000(long paramLong, TimeUnit paramTimeUnit)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this;
    Long localLong = Long.valueOf(paramLong);
    arrayOfObject[1] = localLong;
    arrayOfObject[2] = paramTimeUnit;
    return m54207b69.F54207b69_01(44, arrayOfObject);
  }
  
  public void close()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    m54207b69.F54207b69_00(45, arrayOfObject);
  }
  
  public int getMaxData()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this;
    return m54207b69.F54207b69_05(46, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.adblib.AdbConnection
 * JD-Core Version:    0.7.0.1
 */
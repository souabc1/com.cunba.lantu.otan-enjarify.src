package com.jakewharton.disklrucache;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class DiskLruCache$Editor$FaultHidingOutputStream
  extends FilterOutputStream
{
  public DiskLruCache$Editor$FaultHidingOutputStream(DiskLruCache.Editor paramEditor, OutputStream paramOutputStream)
  {
    super(paramOutputStream);
  }
  
  public void close()
  {
    try
    {
      localObject = this.out;
      ((OutputStream)localObject).close();
    }
    catch (IOException localIOException)
    {
      Object localObject = this.o00OoOoo;
      boolean bool = true;
      DiskLruCache.Editor.OooO0Oo((DiskLruCache.Editor)localObject, bool);
    }
  }
  
  public void flush()
  {
    try
    {
      localObject = this.out;
      ((OutputStream)localObject).flush();
    }
    catch (IOException localIOException)
    {
      Object localObject = this.o00OoOoo;
      boolean bool = true;
      DiskLruCache.Editor.OooO0Oo((DiskLruCache.Editor)localObject, bool);
    }
  }
  
  public void write(int paramInt)
  {
    try
    {
      OutputStream localOutputStream = this.out;
      localOutputStream.write(paramInt);
    }
    catch (IOException localIOException)
    {
      DiskLruCache.Editor localEditor = this.o00OoOoo;
      boolean bool = true;
      DiskLruCache.Editor.OooO0Oo(localEditor, bool);
    }
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      OutputStream localOutputStream = this.out;
      localOutputStream.write(paramArrayOfByte, paramInt1, paramInt2);
    }
    catch (IOException localIOException)
    {
      paramArrayOfByte = this.o00OoOoo;
      paramInt1 = 1;
      DiskLruCache.Editor.OooO0Oo(paramArrayOfByte, paramInt1);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.jakewharton.disklrucache.DiskLruCache.Editor.FaultHidingOutputStream
 * JD-Core Version:    0.7.0.1
 */
package com.qinggan.media;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

public final class DiskLruCache$Editor
{
  public final DiskLruCache.Entry OooO00o;
  public boolean OooO0O0;
  
  public DiskLruCache$Editor(DiskLruCache paramDiskLruCache, DiskLruCache.Entry paramEntry)
  {
    this.OooO00o = paramEntry;
  }
  
  public void OooO00o()
  {
    DiskLruCache.OooO0oO(this.OooO0OO, this, false);
  }
  
  public void OooO0Oo()
  {
    boolean bool1 = this.OooO0O0;
    DiskLruCache localDiskLruCache;
    boolean bool2;
    if (bool1)
    {
      localDiskLruCache = this.OooO0OO;
      bool2 = false;
      DiskLruCache.OooO0oO(localDiskLruCache, this, false);
      localDiskLruCache = this.OooO0OO;
      String str = DiskLruCache.Entry.OooO0O0(this.OooO00o);
      localDiskLruCache.OoooO0(str);
    }
    else
    {
      localDiskLruCache = this.OooO0OO;
      bool2 = true;
      DiskLruCache.OooO0oO(localDiskLruCache, this, bool2);
    }
  }
  
  public OutputStream OooO0o(int paramInt)
  {
    synchronized (this.OooO0OO)
    {
      Object localObject1 = this.OooO00o;
      localObject1 = DiskLruCache.Entry.OooO0oO((DiskLruCache.Entry)localObject1);
      if (localObject1 == this)
      {
        localObject1 = new com/qinggan/media/DiskLruCache$Editor$FaultHidingOutputStream;
        FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
        DiskLruCache.Entry localEntry = this.OooO00o;
        localObject2 = localEntry.getDirtyFile(paramInt);
        localFileOutputStream.<init>((File)localObject2);
        paramInt = 0;
        localObject2 = null;
        ((DiskLruCache.Editor.FaultHidingOutputStream)localObject1).<init>(this, localFileOutputStream, null);
        return localObject1;
      }
      Object localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>();
      throw ((Throwable)localObject2);
    }
  }
  
  public InputStream OooO0o0(int paramInt)
  {
    synchronized (this.OooO0OO)
    {
      Object localObject1 = this.OooO00o;
      localObject1 = DiskLruCache.Entry.OooO0oO((DiskLruCache.Entry)localObject1);
      if (localObject1 == this)
      {
        localObject1 = this.OooO00o;
        boolean bool = DiskLruCache.Entry.OooO0o0((DiskLruCache.Entry)localObject1);
        if (!bool) {
          return null;
        }
        localObject1 = new java/io/FileInputStream;
        DiskLruCache.Entry localEntry = this.OooO00o;
        localObject2 = localEntry.getCleanFile(paramInt);
        ((FileInputStream)localObject1).<init>((File)localObject2);
        return localObject1;
      }
      Object localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>();
      throw ((Throwable)localObject2);
    }
  }
  
  public String getString(int paramInt)
  {
    Object localObject = OooO0o0(paramInt);
    if (localObject != null)
    {
      localObject = DiskLruCache.OooO0Oo((InputStream)localObject);
    }
    else
    {
      paramInt = 0;
      localObject = null;
    }
    return localObject;
  }
  
  public void set(int paramInt, String paramString)
  {
    Object localObject1 = null;
    try
    {
      OutputStreamWriter localOutputStreamWriter = new java/io/OutputStreamWriter;
      OutputStream localOutputStream = OooO0o(paramInt);
      Charset localCharset = DiskLruCache.OooO0o0();
      localOutputStreamWriter.<init>(localOutputStream, localCharset);
      try
      {
        localOutputStreamWriter.write(paramString);
        DiskLruCache.OooOo0O(localOutputStreamWriter);
        return;
      }
      finally
      {
        localObject1 = localOutputStreamWriter;
      }
      DiskLruCache.OooOo0O(localObject1);
    }
    finally {}
    throw localObject3;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.media.DiskLruCache.Editor
 * JD-Core Version:    0.7.0.1
 */
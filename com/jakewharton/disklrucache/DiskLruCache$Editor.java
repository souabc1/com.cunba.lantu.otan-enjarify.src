package com.jakewharton.disklrucache;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

public final class DiskLruCache$Editor
{
  public final DiskLruCache.Entry OooO00o;
  public final boolean[] OooO0O0;
  public boolean OooO0OO;
  public boolean OooO0Oo;
  
  public DiskLruCache$Editor(DiskLruCache paramDiskLruCache, DiskLruCache.Entry paramEntry)
  {
    this.OooO00o = paramEntry;
    boolean bool = DiskLruCache.Entry.OooO0o0(paramEntry);
    int i;
    if (bool)
    {
      i = 0;
      paramDiskLruCache = null;
    }
    else
    {
      i = DiskLruCache.OooO0o0(paramDiskLruCache);
      paramDiskLruCache = new boolean[i];
    }
    this.OooO0O0 = paramDiskLruCache;
  }
  
  public void OooO00o()
  {
    DiskLruCache.OooOO0O(this.OooO0o0, this, false);
  }
  
  public InputStream OooO0o(int paramInt)
  {
    synchronized (this.OooO0o0)
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
        try
        {
          localObject1 = new java/io/FileInputStream;
          DiskLruCache.Entry localEntry = this.OooO00o;
          localObject2 = localEntry.getCleanFile(paramInt);
          ((FileInputStream)localObject1).<init>((File)localObject2);
          return localObject1;
        }
        catch (FileNotFoundException localFileNotFoundException)
        {
          return null;
        }
      }
      Object localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>();
      throw ((Throwable)localObject2);
    }
  }
  
  public void OooO0o0()
  {
    boolean bool1 = this.OooO0OO;
    boolean bool2 = true;
    DiskLruCache localDiskLruCache;
    if (bool1)
    {
      DiskLruCache.OooOO0O(this.OooO0o0, this, false);
      localDiskLruCache = this.OooO0o0;
      String str = DiskLruCache.Entry.OooO0O0(this.OooO00o);
      localDiskLruCache.OoooOoO(str);
    }
    else
    {
      localDiskLruCache = this.OooO0o0;
      DiskLruCache.OooOO0O(localDiskLruCache, this, bool2);
    }
    this.OooO0Oo = bool2;
  }
  
  public OutputStream OooO0oO(int paramInt)
  {
    synchronized (this.OooO0o0)
    {
      Object localObject1 = this.OooO00o;
      localObject1 = DiskLruCache.Entry.OooO0oO((DiskLruCache.Entry)localObject1);
      if (localObject1 == this)
      {
        localObject1 = this.OooO00o;
        boolean bool = DiskLruCache.Entry.OooO0o0((DiskLruCache.Entry)localObject1);
        int i;
        if (!bool)
        {
          localObject1 = this.OooO0O0;
          i = 1;
          localObject1[paramInt] = i;
        }
        localObject1 = this.OooO00o;
        localObject2 = ((DiskLruCache.Entry)localObject1).getDirtyFile(paramInt);
        try
        {
          localObject1 = new java/io/FileOutputStream;
          ((FileOutputStream)localObject1).<init>((File)localObject2);
        }
        catch (FileNotFoundException localFileNotFoundException1)
        {
          localObject1 = this.OooO0o0;
          localObject1 = DiskLruCache.OooO0oO((DiskLruCache)localObject1);
          ((File)localObject1).mkdirs();
        }
        try
        {
          localObject1 = new java/io/FileOutputStream;
          ((FileOutputStream)localObject1).<init>((File)localObject2);
          localObject2 = new com/jakewharton/disklrucache/DiskLruCache$Editor$FaultHidingOutputStream;
          i = 0;
          ((DiskLruCache.Editor.FaultHidingOutputStream)localObject2).<init>(this, (OutputStream)localObject1, null);
          return localObject2;
        }
        catch (FileNotFoundException localFileNotFoundException2)
        {
          localObject2 = DiskLruCache.OooOO0();
          return localObject2;
        }
      }
      Object localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>();
      throw ((Throwable)localObject2);
    }
  }
  
  public String getString(int paramInt)
  {
    Object localObject = OooO0o(paramInt);
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
      OutputStream localOutputStream = OooO0oO(paramInt);
      Charset localCharset = Util.OooO0O0;
      localOutputStreamWriter.<init>(localOutputStream, localCharset);
      try
      {
        localOutputStreamWriter.write(paramString);
        Util.OooO00o(localOutputStreamWriter);
        return;
      }
      finally
      {
        localObject1 = localOutputStreamWriter;
      }
      Util.OooO00o(localObject1);
    }
    finally {}
    throw localObject3;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.jakewharton.disklrucache.DiskLruCache.Editor
 * JD-Core Version:    0.7.0.1
 */
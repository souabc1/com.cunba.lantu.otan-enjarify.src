package com.just.agentweb.download;

import java.io.File;
import java.io.RandomAccessFile;

final class Downloader$LoadingRandomAccessFile
  extends RandomAccessFile
{
  public Downloader$LoadingRandomAccessFile(Downloader paramDownloader, File paramFile)
  {
    super(paramFile, "rw");
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super.write(paramArrayOfByte, paramInt1, paramInt2);
    paramArrayOfByte = this.o00OoOoo;
    long l = paramInt2;
    Downloader.OooO0O0(paramArrayOfByte, l);
    paramArrayOfByte = this.o00OoOoo;
    Integer[] arrayOfInteger = new Integer[1];
    Integer localInteger = Integer.valueOf(0);
    arrayOfInteger[0] = localInteger;
    Downloader.OooO0OO(paramArrayOfByte, arrayOfInteger);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.just.agentweb.download.Downloader.LoadingRandomAccessFile
 * JD-Core Version:    0.7.0.1
 */
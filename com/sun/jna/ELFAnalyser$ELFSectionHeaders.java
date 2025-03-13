package com.sun.jna;

import java.io.ByteArrayOutputStream;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m54207b69;

class ELFAnalyser$ELFSectionHeaders
{
  public final List OooO00o;
  
  public ELFAnalyser$ELFSectionHeaders(boolean paramBoolean1, boolean paramBoolean2, ByteBuffer paramByteBuffer, RandomAccessFile paramRandomAccessFile)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.OooO00o = ((List)localObject1);
    int j;
    int k;
    if (paramBoolean1)
    {
      i = 40;
      l = paramByteBuffer.getLong(i);
      j = paramByteBuffer.getShort(58);
      k = paramByteBuffer.getShort(60);
      m = 62;
    }
    else
    {
      i = paramByteBuffer.getInt(32);
      l = i;
      j = paramByteBuffer.getShort(46);
      k = paramByteBuffer.getShort(48);
      m = 50;
    }
    int n = paramByteBuffer.getShort(m);
    int m = k * j;
    ByteBuffer localByteBuffer1 = ByteBuffer.allocate(m);
    if (paramBoolean2) {
      localObject2 = ByteOrder.BIG_ENDIAN;
    } else {
      localObject2 = ByteOrder.LITTLE_ENDIAN;
    }
    localByteBuffer1.order((ByteOrder)localObject2);
    Object localObject2 = paramRandomAccessFile.getChannel();
    ((FileChannel)localObject2).read(localByteBuffer1, l);
    int i = 0;
    localObject1 = null;
    int i1;
    while (i < k)
    {
      i1 = i * j;
      localByteBuffer1.position(i1);
      ByteBuffer localByteBuffer2 = localByteBuffer1.slice();
      localObject2 = localByteBuffer1.order();
      localByteBuffer2.order((ByteOrder)localObject2);
      localByteBuffer2.limit(j);
      localObject2 = this.OooO00o;
      ELFAnalyser.ELFSectionHeaderEntry localELFSectionHeaderEntry = new com/sun/jna/ELFAnalyser$ELFSectionHeaderEntry;
      localELFSectionHeaderEntry.<init>(paramBoolean1, localByteBuffer2);
      ((List)localObject2).add(localELFSectionHeaderEntry);
      i += 1;
    }
    Object localObject3 = (ELFAnalyser.ELFSectionHeaderEntry)this.OooO00o.get(n);
    n = ((ELFAnalyser.ELFSectionHeaderEntry)localObject3).getSize();
    paramByteBuffer = ByteBuffer.allocate(n);
    if (paramBoolean2) {
      localObject4 = ByteOrder.BIG_ENDIAN;
    } else {
      localObject4 = ByteOrder.LITTLE_ENDIAN;
    }
    paramByteBuffer.order((ByteOrder)localObject4);
    Object localObject4 = paramRandomAccessFile.getChannel();
    paramBoolean1 = ((ELFAnalyser.ELFSectionHeaderEntry)localObject3).getOffset();
    long l = paramBoolean1;
    ((FileChannel)localObject4).read(paramByteBuffer, l);
    paramByteBuffer.rewind();
    localObject3 = new java/io/ByteArrayOutputStream;
    paramBoolean2 = true;
    ((ByteArrayOutputStream)localObject3).<init>(paramBoolean2);
    localObject4 = this.OooO00o.iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject4).hasNext();
      if (!bool) {
        break;
      }
      paramRandomAccessFile = (ELFAnalyser.ELFSectionHeaderEntry)((Iterator)localObject4).next();
      ((ByteArrayOutputStream)localObject3).reset();
      i = paramRandomAccessFile.getNameOffset();
      paramByteBuffer.position(i);
      for (;;)
      {
        i = paramByteBuffer.position();
        i1 = paramByteBuffer.limit();
        if (i >= i1) {
          break;
        }
        i = paramByteBuffer.get();
        if (i == 0) {
          break;
        }
        ((ByteArrayOutputStream)localObject3).write(i);
      }
      localObject1 = m54207b69.F54207b69_11("GG0615061112");
      localObject1 = ((ByteArrayOutputStream)localObject3).toString((String)localObject1);
      paramRandomAccessFile.setName((String)localObject1);
    }
  }
  
  public List getEntries()
  {
    return this.OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.sun.jna.ELFAnalyser.ELFSectionHeaders
 * JD-Core Version:    0.7.0.1
 */
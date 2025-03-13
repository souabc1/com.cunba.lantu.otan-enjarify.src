package com.google.android.material.color;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Set;

class ColorResourcesTableCreator$TypeChunk
{
  private static final byte CONFIG_SIZE = 64;
  private static final short HEADER_SIZE = 84;
  private static final int OFFSET_NO_ENTRY = 255;
  private final byte[] config;
  private final int entryCount;
  private final ColorResourcesTableCreator.ResChunkHeader header;
  private final int[] offsetTable;
  private final ColorResourcesTableCreator.ResEntry[] resEntries;
  
  public ColorResourcesTableCreator$TypeChunk(List paramList, Set paramSet, int paramInt)
  {
    int i = 64;
    Object localObject1 = new byte[i];
    this.config = ((byte[])localObject1);
    this.entryCount = paramInt;
    int j = 0;
    localObject1[0] = i;
    Object localObject2 = new ColorResourcesTableCreator.ResEntry[paramList.size()];
    this.resEntries = ((ColorResourcesTableCreator.ResEntry[])localObject2);
    i = 0;
    localObject2 = null;
    int k;
    for (;;)
    {
      k = paramList.size();
      if (i >= k) {
        break;
      }
      localObject1 = (ColorResourcesTableCreator.ColorResource)paramList.get(i);
      ColorResourcesTableCreator.ResEntry[] arrayOfResEntry = this.resEntries;
      ColorResourcesTableCreator.ResEntry localResEntry = new com/google/android/material/color/ColorResourcesTableCreator$ResEntry;
      k = ColorResourcesTableCreator.ColorResource.access$1400((ColorResourcesTableCreator.ColorResource)localObject1);
      localResEntry.<init>(i, k);
      arrayOfResEntry[i] = localResEntry;
      i += 1;
    }
    paramList = new int[paramInt];
    this.offsetTable = paramList;
    int m = 0;
    paramList = null;
    while (j < paramInt)
    {
      localObject2 = Short.valueOf(j);
      boolean bool = paramSet.contains(localObject2);
      if (bool)
      {
        localObject2 = this.offsetTable;
        localObject2[j] = m;
        m += 16;
      }
      else
      {
        localObject2 = this.offsetTable;
        k = -1;
        localObject2[j] = k;
      }
      j = (short)(j + 1);
    }
    paramList = new com/google/android/material/color/ColorResourcesTableCreator$ResChunkHeader;
    paramInt = getChunkSize();
    paramList.<init>((short)513, (short)84, paramInt);
    this.header = paramList;
  }
  
  private int getEntryStart()
  {
    return getOffsetTableSize() + 84;
  }
  
  private int getOffsetTableSize()
  {
    return this.offsetTable.length * 4;
  }
  
  public int getChunkSize()
  {
    int i = getEntryStart();
    int j = this.resEntries.length * 16;
    return i + j;
  }
  
  public void writeTo(ByteArrayOutputStream paramByteArrayOutputStream)
  {
    this.header.writeTo(paramByteArrayOutputStream);
    Object localObject1 = new byte[4];
    int i = ColorResourcesTableCreator.access$1300();
    int j = 0;
    localObject1[0] = i;
    localObject1[1] = 0;
    localObject1[2] = 0;
    localObject1[3] = 0;
    paramByteArrayOutputStream.write((byte[])localObject1);
    localObject1 = ColorResourcesTableCreator.access$500(this.entryCount);
    paramByteArrayOutputStream.write((byte[])localObject1);
    int k = getEntryStart();
    localObject1 = ColorResourcesTableCreator.access$500(k);
    paramByteArrayOutputStream.write((byte[])localObject1);
    localObject1 = this.config;
    paramByteArrayOutputStream.write((byte[])localObject1);
    localObject1 = this.offsetTable;
    i = localObject1.length;
    int m = 0;
    Object localObject2 = null;
    while (m < i)
    {
      int n = localObject1[m];
      byte[] arrayOfByte = ColorResourcesTableCreator.access$500(n);
      paramByteArrayOutputStream.write(arrayOfByte);
      m += 1;
    }
    localObject1 = this.resEntries;
    i = localObject1.length;
    while (j < i)
    {
      localObject2 = localObject1[j];
      localObject2.writeTo(paramByteArrayOutputStream);
      j += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.ColorResourcesTableCreator.TypeChunk
 * JD-Core Version:    0.7.0.1
 */
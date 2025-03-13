package com.google.android.material.color;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class ColorResourcesTableCreator$ResTable
{
  private static final short HEADER_SIZE = 12;
  private final ColorResourcesTableCreator.ResChunkHeader header;
  private final List packageChunks;
  private final int packageCount;
  private final ColorResourcesTableCreator.StringPoolChunk stringPool;
  
  public ColorResourcesTableCreator$ResTable(Map paramMap)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.packageChunks = ((List)localObject1);
    int i = paramMap.size();
    this.packageCount = i;
    localObject1 = new com/google/android/material/color/ColorResourcesTableCreator$StringPoolChunk;
    int j = 0;
    Object localObject2 = new String[0];
    ((ColorResourcesTableCreator.StringPoolChunk)localObject1).<init>((String[])localObject2);
    this.stringPool = ((ColorResourcesTableCreator.StringPoolChunk)localObject1);
    paramMap = paramMap.entrySet().iterator();
    for (;;)
    {
      boolean bool = paramMap.hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Map.Entry)paramMap.next();
      localObject2 = (List)((Map.Entry)localObject1).getValue();
      Object localObject3 = ColorResourcesTableCreator.access$400();
      Collections.sort((List)localObject2, (Comparator)localObject3);
      localObject3 = this.packageChunks;
      ColorResourcesTableCreator.PackageChunk localPackageChunk = new com/google/android/material/color/ColorResourcesTableCreator$PackageChunk;
      localObject1 = (ColorResourcesTableCreator.PackageInfo)((Map.Entry)localObject1).getKey();
      localPackageChunk.<init>((ColorResourcesTableCreator.PackageInfo)localObject1, (List)localObject2);
      ((List)localObject3).add(localPackageChunk);
    }
    paramMap = new com/google/android/material/color/ColorResourcesTableCreator$ResChunkHeader;
    j = getOverallSize();
    paramMap.<init>((short)2, (short)12, j);
    this.header = paramMap;
  }
  
  private int getOverallSize()
  {
    Iterator localIterator = this.packageChunks.iterator();
    int i = 0;
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      ColorResourcesTableCreator.PackageChunk localPackageChunk = (ColorResourcesTableCreator.PackageChunk)localIterator.next();
      int j = localPackageChunk.getChunkSize();
      i += j;
    }
    return this.stringPool.getChunkSize() + 12 + i;
  }
  
  public void writeTo(ByteArrayOutputStream paramByteArrayOutputStream)
  {
    this.header.writeTo(paramByteArrayOutputStream);
    int i = this.packageCount;
    Object localObject = ColorResourcesTableCreator.access$500(i);
    paramByteArrayOutputStream.write((byte[])localObject);
    this.stringPool.writeTo(paramByteArrayOutputStream);
    localObject = this.packageChunks.iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject).hasNext();
      if (!bool) {
        break;
      }
      ColorResourcesTableCreator.PackageChunk localPackageChunk = (ColorResourcesTableCreator.PackageChunk)((Iterator)localObject).next();
      localPackageChunk.writeTo(paramByteArrayOutputStream);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.ColorResourcesTableCreator.ResTable
 * JD-Core Version:    0.7.0.1
 */
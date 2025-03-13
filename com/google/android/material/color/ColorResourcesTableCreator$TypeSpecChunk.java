package com.google.android.material.color;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class ColorResourcesTableCreator$TypeSpecChunk
{
  private static final short HEADER_SIZE = 16;
  private static final int SPEC_PUBLIC = 1073741824;
  private final int entryCount;
  private final int[] entryFlags;
  private final ColorResourcesTableCreator.ResChunkHeader header;
  private final ColorResourcesTableCreator.TypeChunk typeChunk;
  
  public ColorResourcesTableCreator$TypeSpecChunk(List paramList)
  {
    int i = paramList.size() + -1;
    i = ColorResourcesTableCreator.ColorResource.access$000((ColorResourcesTableCreator.ColorResource)paramList.get(i)) + 1;
    this.entryCount = i;
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    Object localObject1 = paramList.iterator();
    Object localObject2;
    for (;;)
    {
      boolean bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      short s = ColorResourcesTableCreator.ColorResource.access$000((ColorResourcesTableCreator.ColorResource)((Iterator)localObject1).next());
      localObject2 = Short.valueOf(s);
      localHashSet.add(localObject2);
    }
    localObject1 = new int[this.entryCount];
    this.entryFlags = ((int[])localObject1);
    int m = 0;
    localObject1 = null;
    for (;;)
    {
      int j = this.entryCount;
      if (m >= j) {
        break;
      }
      localObject2 = Short.valueOf(m);
      boolean bool2 = localHashSet.contains(localObject2);
      if (bool2)
      {
        localObject2 = this.entryFlags;
        i1 = 1073741824;
        localObject2[m] = i1;
      }
      int n = (short)(m + 1);
    }
    localObject1 = new com/google/android/material/color/ColorResourcesTableCreator$ResChunkHeader;
    int i1 = getChunkSize();
    ((ColorResourcesTableCreator.ResChunkHeader)localObject1).<init>((short)514, (short)16, i1);
    this.header = ((ColorResourcesTableCreator.ResChunkHeader)localObject1);
    localObject1 = new com/google/android/material/color/ColorResourcesTableCreator$TypeChunk;
    int k = this.entryCount;
    ((ColorResourcesTableCreator.TypeChunk)localObject1).<init>(paramList, localHashSet, k);
    this.typeChunk = ((ColorResourcesTableCreator.TypeChunk)localObject1);
  }
  
  private int getChunkSize()
  {
    return this.entryCount * 4 + 16;
  }
  
  public int getChunkSizeWithTypeChunk()
  {
    int i = getChunkSize();
    int j = this.typeChunk.getChunkSize();
    return i + j;
  }
  
  public void writeTo(ByteArrayOutputStream paramByteArrayOutputStream)
  {
    this.header.writeTo(paramByteArrayOutputStream);
    Object localObject = new byte[4];
    int i = ColorResourcesTableCreator.access$1300();
    int j = 0;
    localObject[0] = i;
    localObject[1] = 0;
    localObject[2] = 0;
    localObject[3] = 0;
    paramByteArrayOutputStream.write((byte[])localObject);
    int k = this.entryCount;
    localObject = ColorResourcesTableCreator.access$500(k);
    paramByteArrayOutputStream.write((byte[])localObject);
    localObject = this.entryFlags;
    i = localObject.length;
    while (j < i)
    {
      int m = localObject[j];
      byte[] arrayOfByte = ColorResourcesTableCreator.access$500(m);
      paramByteArrayOutputStream.write(arrayOfByte);
      j += 1;
    }
    this.typeChunk.writeTo(paramByteArrayOutputStream);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.ColorResourcesTableCreator.TypeSpecChunk
 * JD-Core Version:    0.7.0.1
 */
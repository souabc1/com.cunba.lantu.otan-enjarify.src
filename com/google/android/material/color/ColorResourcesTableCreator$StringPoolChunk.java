package com.google.android.material.color;

import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class ColorResourcesTableCreator$StringPoolChunk
{
  private static final int FLAG_UTF8 = 256;
  private static final short HEADER_SIZE = 28;
  private static final int STYLED_SPAN_LIST_END = 255;
  private final int chunkSize;
  private final ColorResourcesTableCreator.ResChunkHeader header;
  private final int stringCount;
  private final List stringIndex;
  private final List strings;
  private final int stringsPaddingSize;
  private final int stringsStart;
  private final int styledSpanCount;
  private final List styledSpanIndex;
  private final List styledSpans;
  private final int styledSpansStart;
  private final boolean utf8Encode;
  
  public ColorResourcesTableCreator$StringPoolChunk(boolean paramBoolean, String... paramVarArgs)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.stringIndex = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.styledSpanIndex = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.strings = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.styledSpans = localArrayList;
    this.utf8Encode = paramBoolean;
    paramBoolean = paramVarArgs.length;
    int i = 0;
    localArrayList = null;
    boolean bool1 = false;
    boolean bool2 = false;
    Object localObject3;
    boolean bool3;
    while (bool1 < paramBoolean)
    {
      localObject1 = paramVarArgs[bool1];
      localObject1 = processString((String)localObject1);
      localObject2 = this.stringIndex;
      localObject3 = Integer.valueOf(bool2);
      ((List)localObject2).add(localObject3);
      localObject2 = ((Pair)localObject1).first;
      localObject3 = localObject2;
      bool3 = ((byte[])localObject2).length;
      bool2 += bool3;
      localObject3 = this.strings;
      localObject2 = (byte[])localObject2;
      ((List)localObject3).add(localObject2);
      localObject2 = this.styledSpans;
      localObject1 = (List)((Pair)localObject1).second;
      ((List)localObject2).add(localObject1);
      bool1 += true;
    }
    Object localObject4 = this.styledSpans.iterator();
    int j = 0;
    for (;;)
    {
      boolean bool4 = ((Iterator)localObject4).hasNext();
      if (!bool4) {
        break;
      }
      localObject1 = (List)((Iterator)localObject4).next();
      localObject2 = ((List)localObject1).iterator();
      for (;;)
      {
        bool3 = ((Iterator)localObject2).hasNext();
        if (!bool3) {
          break;
        }
        localObject3 = (ColorResourcesTableCreator.StringStyledSpan)((Iterator)localObject2).next();
        localList = this.stringIndex;
        Integer localInteger = Integer.valueOf(bool2);
        localList.add(localInteger);
        boolean bool5 = ColorResourcesTableCreator.StringStyledSpan.access$700((ColorResourcesTableCreator.StringStyledSpan)localObject3).length;
        bool2 += bool5;
        localList = this.strings;
        localObject3 = ColorResourcesTableCreator.StringStyledSpan.access$700((ColorResourcesTableCreator.StringStyledSpan)localObject3);
        localList.add(localObject3);
      }
      localObject2 = this.styledSpanIndex;
      localObject3 = Integer.valueOf(j);
      ((List)localObject2).add(localObject3);
      n = ((List)localObject1).size() * 12 + 4;
      j += n;
    }
    paramBoolean = bool2 % true;
    if (!paramBoolean)
    {
      paramBoolean = false;
      localObject4 = null;
    }
    else
    {
      paramBoolean = true - paramBoolean;
    }
    this.stringsPaddingSize = paramBoolean;
    Object localObject1 = this.strings;
    int n = ((List)localObject1).size();
    this.stringCount = n;
    int i3 = this.strings.size();
    int m = paramVarArgs.length;
    i3 -= m;
    this.styledSpanCount = i4;
    Object localObject2 = this.strings;
    int i4 = ((List)localObject2).size();
    int i5 = paramVarArgs.length;
    i4 -= i5;
    i5 = 1;
    if (i4 > 0)
    {
      i4 = i5;
    }
    else
    {
      i4 = 0;
      localObject2 = null;
    }
    if (i4 == 0)
    {
      this.styledSpanIndex.clear();
      localObject3 = this.styledSpans;
      ((List)localObject3).clear();
    }
    n *= 4;
    m = 28;
    int i1;
    n += m;
    List localList = this.styledSpanIndex;
    int i2 = localList.size() * 4;
    i1 += i2;
    this.stringsStart = i1;
    int k;
    bool2 += paramBoolean;
    if (i4 != 0)
    {
      paramBoolean = i1 + k;
    }
    else
    {
      paramBoolean = false;
      localObject4 = null;
    }
    this.styledSpansStart = paramBoolean;
    i1 += k;
    if (i4 != 0) {
      i = j;
    }
    i1 += i;
    this.chunkSize = i1;
    localObject4 = new com/google/android/material/color/ColorResourcesTableCreator$ResChunkHeader;
    ((ColorResourcesTableCreator.ResChunkHeader)localObject4).<init>(i5, m, i1);
    this.header = ((ColorResourcesTableCreator.ResChunkHeader)localObject4);
  }
  
  public ColorResourcesTableCreator$StringPoolChunk(String... paramVarArgs)
  {
    this(false, paramVarArgs);
  }
  
  private Pair processString(String paramString)
  {
    Pair localPair = new android/util/Pair;
    boolean bool = this.utf8Encode;
    if (bool) {
      paramString = ColorResourcesTableCreator.access$800(paramString);
    } else {
      paramString = ColorResourcesTableCreator.access$900(paramString);
    }
    List localList = Collections.emptyList();
    localPair.<init>(paramString, localList);
    return localPair;
  }
  
  public int getChunkSize()
  {
    return this.chunkSize;
  }
  
  public void writeTo(ByteArrayOutputStream paramByteArrayOutputStream)
  {
    this.header.writeTo(paramByteArrayOutputStream);
    Object localObject1 = ColorResourcesTableCreator.access$500(this.stringCount);
    paramByteArrayOutputStream.write((byte[])localObject1);
    localObject1 = ColorResourcesTableCreator.access$500(this.styledSpanCount);
    paramByteArrayOutputStream.write((byte[])localObject1);
    boolean bool1 = this.utf8Encode;
    if (bool1)
    {
      i = 256;
    }
    else
    {
      i = 0;
      localObject1 = null;
    }
    localObject1 = ColorResourcesTableCreator.access$500(i);
    paramByteArrayOutputStream.write((byte[])localObject1);
    localObject1 = ColorResourcesTableCreator.access$500(this.stringsStart);
    paramByteArrayOutputStream.write((byte[])localObject1);
    int i = this.styledSpansStart;
    localObject1 = ColorResourcesTableCreator.access$500(i);
    paramByteArrayOutputStream.write((byte[])localObject1);
    localObject1 = this.stringIndex.iterator();
    Object localObject2;
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject1).hasNext();
      if (!bool2) {
        break;
      }
      int j = ((Integer)((Iterator)localObject1).next()).intValue();
      localObject2 = ColorResourcesTableCreator.access$500(j);
      paramByteArrayOutputStream.write((byte[])localObject2);
    }
    localObject1 = this.styledSpanIndex.iterator();
    for (;;)
    {
      boolean bool3 = ((Iterator)localObject1).hasNext();
      if (!bool3) {
        break;
      }
      int k = ((Integer)((Iterator)localObject1).next()).intValue();
      localObject2 = ColorResourcesTableCreator.access$500(k);
      paramByteArrayOutputStream.write((byte[])localObject2);
    }
    localObject1 = this.strings.iterator();
    boolean bool4;
    for (;;)
    {
      bool4 = ((Iterator)localObject1).hasNext();
      if (!bool4) {
        break;
      }
      localObject2 = (byte[])((Iterator)localObject1).next();
      paramByteArrayOutputStream.write((byte[])localObject2);
    }
    i = this.stringsPaddingSize;
    if (i > 0)
    {
      localObject1 = new byte[i];
      paramByteArrayOutputStream.write((byte[])localObject1);
    }
    localObject1 = this.styledSpans.iterator();
    for (;;)
    {
      bool4 = ((Iterator)localObject1).hasNext();
      if (!bool4) {
        break;
      }
      localObject2 = ((List)((Iterator)localObject1).next()).iterator();
      for (;;)
      {
        boolean bool5 = ((Iterator)localObject2).hasNext();
        if (!bool5) {
          break;
        }
        ColorResourcesTableCreator.StringStyledSpan localStringStyledSpan = (ColorResourcesTableCreator.StringStyledSpan)((Iterator)localObject2).next();
        localStringStyledSpan.writeTo(paramByteArrayOutputStream);
      }
      int m = -1;
      localObject2 = ColorResourcesTableCreator.access$500(m);
      paramByteArrayOutputStream.write((byte[])localObject2);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.ColorResourcesTableCreator.StringPoolChunk
 * JD-Core Version:    0.7.0.1
 */
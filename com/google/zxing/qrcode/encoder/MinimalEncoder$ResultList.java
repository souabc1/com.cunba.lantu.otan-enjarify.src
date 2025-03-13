package com.google.zxing.qrcode.encoder;

import com.google.zxing.common.BitArray;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class MinimalEncoder$ResultList
{
  private final List list;
  private final Version version;
  
  public MinimalEncoder$ResultList(MinimalEncoder paramMinimalEncoder, Version paramVersion, MinimalEncoder.Edge paramEdge)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.list = ((List)localObject1);
    int i = 0;
    localObject1 = null;
    int j = 0;
    Object localObject2 = null;
    int k = 0;
    Object localObject3 = null;
    int m;
    Object localObject4;
    Object localObject5;
    label135:
    label141:
    Mode localMode;
    int i3;
    int i4;
    Object localObject7;
    int i5;
    for (;;)
    {
      m = 1;
      if (paramEdge == null) {
        break;
      }
      int n = MinimalEncoder.Edge.access$000(paramEdge);
      int i1 = j + n;
      localObject2 = MinimalEncoder.Edge.access$700(paramEdge);
      localObject4 = MinimalEncoder.Edge.access$200(paramEdge);
      localObject5 = Mode.BYTE;
      if ((localObject4 == localObject5) && (localObject2 == null))
      {
        n = MinimalEncoder.Edge.access$100(paramEdge);
        if (n != 0) {}
      }
      else
      {
        if (localObject2 == null) {
          break label135;
        }
        n = MinimalEncoder.Edge.access$100(paramEdge);
        int i2 = MinimalEncoder.Edge.access$100((MinimalEncoder.Edge)localObject2);
        if (n == i2) {
          break label135;
        }
      }
      n = m;
      break label141;
      n = 0;
      localObject4 = null;
      if (n != 0) {
        k = m;
      }
      Object localObject6;
      MinimalEncoder.ResultList.ResultNode localResultNode;
      if (localObject2 != null)
      {
        localObject6 = MinimalEncoder.Edge.access$200((MinimalEncoder.Edge)localObject2);
        localObject5 = MinimalEncoder.Edge.access$200(paramEdge);
        if ((localObject6 == localObject5) && (n == 0)) {}
      }
      else
      {
        localObject6 = this.list;
        localResultNode = new com/google/zxing/qrcode/encoder/MinimalEncoder$ResultList$ResultNode;
        localMode = MinimalEncoder.Edge.access$200(paramEdge);
        i3 = MinimalEncoder.Edge.access$800(paramEdge);
        i4 = MinimalEncoder.Edge.access$100(paramEdge);
        localObject5 = localResultNode;
        localObject7 = this;
        localResultNode.<init>(this, localMode, i3, i4, i1);
        ((List)localObject6).add(0, localResultNode);
        i1 = 0;
      }
      if (n != 0)
      {
        localObject6 = this.list;
        localResultNode = new com/google/zxing/qrcode/encoder/MinimalEncoder$ResultList$ResultNode;
        localObject7 = Mode.ECI;
        i5 = MinimalEncoder.Edge.access$800(paramEdge);
        i3 = MinimalEncoder.Edge.access$100(paramEdge);
        i4 = 0;
        localObject4 = localResultNode;
        localObject5 = this;
        localResultNode.<init>(this, (Mode)localObject7, i5, i3, 0);
        ((List)localObject6).add(0, localResultNode);
      }
      paramEdge = (MinimalEncoder.Edge)localObject2;
      j = i1;
    }
    boolean bool3 = MinimalEncoder.access$900(paramMinimalEncoder);
    if (bool3)
    {
      paramEdge = (MinimalEncoder.ResultList.ResultNode)this.list.get(0);
      if (paramEdge != null)
      {
        paramEdge = MinimalEncoder.ResultList.ResultNode.access$1000(paramEdge);
        localObject7 = Mode.ECI;
        if ((paramEdge != localObject7) && (k != 0))
        {
          paramEdge = this.list;
          localObject2 = new com/google/zxing/qrcode/encoder/MinimalEncoder$ResultList$ResultNode;
          i5 = 0;
          localMode = null;
          i3 = 0;
          i4 = 0;
          localObject4 = localObject2;
          localObject5 = this;
          ((MinimalEncoder.ResultList.ResultNode)localObject2).<init>(this, (Mode)localObject7, 0, 0, 0);
          paramEdge.add(0, localObject2);
        }
      }
      paramEdge = (MinimalEncoder.ResultList.ResultNode)this.list.get(0);
      localObject2 = this.list;
      paramEdge = MinimalEncoder.ResultList.ResultNode.access$1000(paramEdge);
      localObject3 = Mode.ECI;
      if (paramEdge == localObject3) {
        i = m;
      }
      paramEdge = new com/google/zxing/qrcode/encoder/MinimalEncoder$ResultList$ResultNode;
      localObject7 = Mode.FNC1_FIRST_POSITION;
      i5 = 0;
      localMode = null;
      i3 = 0;
      i4 = 0;
      localObject4 = paramEdge;
      localObject5 = this;
      paramEdge.<init>(this, (Mode)localObject7, 0, 0, 0);
      ((List)localObject2).add(i, paramEdge);
    }
    int i6 = paramVersion.getVersionNumber();
    localObject1 = MinimalEncoder.1.$SwitchMap$com$google$zxing$qrcode$encoder$MinimalEncoder$VersionSize;
    localObject2 = MinimalEncoder.getVersionSize(paramVersion);
    j = ((Enum)localObject2).ordinal();
    i = localObject1[j];
    if (i != m)
    {
      j = 2;
      if (i != j)
      {
        m = 27;
        i = 40;
      }
      else
      {
        m = 10;
        i = 26;
      }
    }
    else
    {
      i = 9;
    }
    int i7 = getSize(paramVersion);
    while (i6 < i)
    {
      localObject2 = Version.getVersionForNumber(i6);
      localObject3 = MinimalEncoder.access$1100(paramMinimalEncoder);
      boolean bool2 = Encoder.willFit(i7, (Version)localObject2, (ErrorCorrectionLevel)localObject3);
      if (bool2) {
        break;
      }
      i6 += 1;
    }
    while (i6 > m)
    {
      localObject1 = Version.getVersionForNumber(i6 + -1);
      localObject2 = MinimalEncoder.access$1100(paramMinimalEncoder);
      boolean bool1 = Encoder.willFit(i7, (Version)localObject1, (ErrorCorrectionLevel)localObject2);
      if (!bool1) {
        break;
      }
      i6 += -1;
    }
    paramMinimalEncoder = Version.getVersionForNumber(i6);
    this.version = paramMinimalEncoder;
  }
  
  private int getSize(Version paramVersion)
  {
    Iterator localIterator = this.list.iterator();
    int i = 0;
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      MinimalEncoder.ResultList.ResultNode localResultNode = (MinimalEncoder.ResultList.ResultNode)localIterator.next();
      int j = MinimalEncoder.ResultList.ResultNode.access$1200(localResultNode, paramVersion);
      i += j;
    }
    return i;
  }
  
  public void getBits(BitArray paramBitArray)
  {
    Iterator localIterator = this.list.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      MinimalEncoder.ResultList.ResultNode localResultNode = (MinimalEncoder.ResultList.ResultNode)localIterator.next();
      MinimalEncoder.ResultList.ResultNode.access$1300(localResultNode, paramBitArray);
    }
  }
  
  public int getSize()
  {
    Version localVersion = this.version;
    return getSize(localVersion);
  }
  
  public Version getVersion()
  {
    return this.version;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Iterator localIterator = this.list.iterator();
    MinimalEncoder.ResultList.ResultNode localResultNode;
    for (Object localObject = null;; localObject = localResultNode)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localResultNode = (MinimalEncoder.ResultList.ResultNode)localIterator.next();
      if (localObject != null)
      {
        localObject = ",";
        localStringBuilder.append((String)localObject);
      }
      localObject = localResultNode.toString();
      localStringBuilder.append((String)localObject);
    }
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.encoder.MinimalEncoder.ResultList
 * JD-Core Version:    0.7.0.1
 */
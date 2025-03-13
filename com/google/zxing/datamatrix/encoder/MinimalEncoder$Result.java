package com.google.zxing.datamatrix.encoder;

import com.google.zxing.common.MinimalECIInput;
import java.util.ArrayList;
import java.util.List;

final class MinimalEncoder$Result
{
  private final byte[] bytes;
  
  public MinimalEncoder$Result(MinimalEncoder.Edge paramEdge)
  {
    Object localObject1 = MinimalEncoder.Edge.access$1000(paramEdge);
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    ArrayList localArrayList2 = new java/util/ArrayList;
    localArrayList2.<init>();
    ArrayList localArrayList3 = new java/util/ArrayList;
    localArrayList3.<init>();
    Object localObject2 = MinimalEncoder.Edge.access$1100(paramEdge);
    Object localObject3 = MinimalEncoder.Mode.C40;
    int i = 0;
    if (localObject2 != localObject3)
    {
      localObject2 = MinimalEncoder.Edge.access$1100(paramEdge);
      localObject3 = MinimalEncoder.Mode.TEXT;
      if (localObject2 != localObject3)
      {
        localObject2 = MinimalEncoder.Edge.access$1100(paramEdge);
        localObject3 = MinimalEncoder.Mode.X12;
        if (localObject2 != localObject3) {
          break label133;
        }
      }
    }
    localObject2 = paramEdge.getEndMode();
    localObject3 = MinimalEncoder.Mode.ASCII;
    if (localObject2 != localObject3)
    {
      localObject2 = MinimalEncoder.Edge.getBytes(254);
      j = prepend((byte[])localObject2, localArrayList1) + 0;
    }
    else
    {
      label133:
      j = 0;
      localObject2 = null;
    }
    for (localObject3 = paramEdge; localObject3 != null; localObject3 = MinimalEncoder.Edge.access$1200((MinimalEncoder.Edge)localObject3))
    {
      int k = prepend(((MinimalEncoder.Edge)localObject3).getDataBytes(), localArrayList1);
      j += k;
      Object localObject4 = MinimalEncoder.Edge.access$1200((MinimalEncoder.Edge)localObject3);
      Object localObject5;
      if (localObject4 != null)
      {
        localObject4 = ((MinimalEncoder.Edge)localObject3).getPreviousStartMode();
        localObject5 = ((MinimalEncoder.Edge)localObject3).getMode();
        if (localObject4 == localObject5) {}
      }
      else
      {
        localObject4 = ((MinimalEncoder.Edge)localObject3).getMode();
        localObject5 = MinimalEncoder.Mode.B256;
        if (localObject4 == localObject5)
        {
          k = 249;
          if (j <= k)
          {
            k = (byte)j;
            localObject4 = Byte.valueOf(k);
            localArrayList1.add(0, localObject4);
            j += 1;
          }
          else
          {
            localObject5 = Byte.valueOf((byte)(j % 250));
            localArrayList1.add(0, localObject5);
            int n = j / 250 + k;
            byte b = (byte)n;
            localObject4 = Byte.valueOf(b);
            localArrayList1.add(0, localObject4);
            j += 2;
          }
          int m = localArrayList1.size();
          localObject4 = Integer.valueOf(m);
          localArrayList2.add(localObject4);
          localObject2 = Integer.valueOf(j);
          localArrayList3.add(localObject2);
        }
        prepend(((MinimalEncoder.Edge)localObject3).getLatchBytes(), localArrayList1);
        j = 0;
        localObject2 = null;
      }
    }
    int j = MinimalEncoder.Input.access$1300((MinimalEncoder.Input)localObject1);
    int i1 = 5;
    if (j == i1)
    {
      j = 236;
      localObject2 = MinimalEncoder.Edge.getBytes(j);
      prepend((byte[])localObject2, localArrayList1);
    }
    else
    {
      j = MinimalEncoder.Input.access$1300((MinimalEncoder.Input)localObject1);
      i1 = 6;
      if (j == i1)
      {
        j = 237;
        localObject2 = MinimalEncoder.Edge.getBytes(j);
        prepend((byte[])localObject2, localArrayList1);
      }
    }
    int i2 = ((MinimalECIInput)localObject1).getFNC1Character();
    if (i2 > 0)
    {
      i2 = 232;
      localObject1 = MinimalEncoder.Edge.getBytes(i2);
      prepend((byte[])localObject1, localArrayList1);
    }
    i2 = 0;
    localObject1 = null;
    for (;;)
    {
      j = localArrayList2.size();
      if (i2 >= j) {
        break;
      }
      j = localArrayList1.size();
      i1 = ((Integer)localArrayList2.get(i2)).intValue();
      j -= i1;
      localObject3 = (Integer)localArrayList3.get(i2);
      i1 = ((Integer)localObject3).intValue();
      applyRandomPattern(localArrayList1, j, i1);
      i2 += 1;
    }
    i2 = localArrayList1.size();
    int i4 = paramEdge.getMinSymbolSize(i2);
    i2 = localArrayList1.size();
    if (i2 < i4) {}
    int i3;
    for (i2 = -127;; i3 = (byte)randomize253State(localArrayList1.size() + 1))
    {
      localObject1 = Byte.valueOf(i2);
      localArrayList1.add(localObject1);
      i3 = localArrayList1.size();
      if (i3 >= i4) {
        break;
      }
    }
    int i5 = localArrayList1.size();
    paramEdge = new byte[i5];
    this.bytes = paramEdge;
    for (;;)
    {
      paramEdge = this.bytes;
      i3 = paramEdge.length;
      if (i >= i3) {
        break;
      }
      localObject1 = (Byte)localArrayList1.get(i);
      i3 = ((Byte)localObject1).byteValue();
      paramEdge[i] = i3;
      i += 1;
    }
  }
  
  public static void applyRandomPattern(List paramList, int paramInt1, int paramInt2)
  {
    int i = 0;
    while (i < paramInt2)
    {
      int j = paramInt1 + i;
      Byte localByte = (Byte)paramList.get(j);
      int k = localByte.byteValue();
      int m = 255;
      k &= m;
      int n = (j + 1) * 149 % m + 1;
      k += n;
      if (k > m) {
        k += -256;
      }
      k = (byte)k;
      localByte = Byte.valueOf(k);
      paramList.set(j, localByte);
      i += 1;
    }
  }
  
  public static int prepend(byte[] paramArrayOfByte, List paramList)
  {
    int i = paramArrayOfByte.length + -1;
    while (i >= 0)
    {
      byte b = paramArrayOfByte[i];
      Byte localByte = Byte.valueOf(b);
      paramList.add(0, localByte);
      i += -1;
    }
    return paramArrayOfByte.length;
  }
  
  private static int randomize253State(int paramInt)
  {
    paramInt = paramInt * 149 % 253 + 1 + 129;
    int i = 254;
    if (paramInt > i) {
      paramInt += -254;
    }
    return paramInt;
  }
  
  public byte[] getBytes()
  {
    return this.bytes;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.datamatrix.encoder.MinimalEncoder.Result
 * JD-Core Version:    0.7.0.1
 */
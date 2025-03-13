package com.google.zxing.qrcode.decoder;

import com.google.zxing.common.BitMatrix;
import m54207b69;

 enum DataMask
{
  static
  {
    DataMask.1 local1 = new com/google/zxing/qrcode/decoder/DataMask$1;
    Object localObject1 = m54207b69.F54207b69_11("tB060418062114091811267C7D7E");
    local1.<init>((String)localObject1, 0);
    DATA_MASK_000 = local1;
    localObject1 = new com/google/zxing/qrcode/decoder/DataMask$2;
    Object localObject2 = m54207b69.F54207b69_11("<^1A200C22051825141D0A78797B");
    int i = 1;
    ((DataMask.2)localObject1).<init>((String)localObject2, i);
    DATA_MASK_001 = (DataMask)localObject1;
    localObject2 = new com/google/zxing/qrcode/decoder/DataMask$3;
    Object localObject3 = m54207b69.F54207b69_11("~A050117032211061912277B7B7D");
    int j = 2;
    ((DataMask.3)localObject2).<init>((String)localObject3, j);
    DATA_MASK_010 = (DataMask)localObject2;
    localObject3 = new com/google/zxing/qrcode/decoder/DataMask$4;
    Object localObject4 = m54207b69.F54207b69_11("9W131705190C1F1C0B2411717172");
    int k = 3;
    ((DataMask.4)localObject3).<init>((String)localObject4, k);
    DATA_MASK_011 = (DataMask)localObject3;
    localObject4 = new com/google/zxing/qrcode/decoder/DataMask$5;
    Object localObject5 = m54207b69.F54207b69_11("nG030715091C0F0C1B1421808283");
    int m = 4;
    ((DataMask.5)localObject4).<init>((String)localObject5, m);
    DATA_MASK_100 = (DataMask)localObject4;
    localObject5 = new com/google/zxing/qrcode/decoder/DataMask$6;
    Object localObject6 = m54207b69.F54207b69_11("*e212533273E2D2A3D36435E6060");
    int n = 5;
    ((DataMask.6)localObject5).<init>((String)localObject6, n);
    DATA_MASK_101 = (DataMask)localObject5;
    localObject6 = new com/google/zxing/qrcode/decoder/DataMask$7;
    Object localObject7 = m54207b69.F54207b69_11("l67278647A6D807D6C8572111212");
    ((DataMask.7)localObject6).<init>((String)localObject7, 6);
    DATA_MASK_110 = (DataMask)localObject6;
    localObject7 = new com/google/zxing/qrcode/decoder/DataMask$8;
    Object localObject8 = m54207b69.F54207b69_11(")S171309151023180720156C6D6E");
    int i1 = 7;
    ((DataMask.8)localObject7).<init>((String)localObject8, i1);
    DATA_MASK_111 = (DataMask)localObject7;
    localObject8 = new DataMask[8];
    localObject8[0] = local1;
    localObject8[i] = localObject1;
    localObject8[j] = localObject2;
    localObject8[k] = localObject3;
    localObject8[m] = localObject4;
    localObject8[n] = localObject5;
    localObject8[6] = localObject6;
    localObject8[i1] = localObject7;
    $VALUES = (DataMask[])localObject8;
  }
  
  public abstract boolean isMasked(int paramInt1, int paramInt2);
  
  public final void unmaskBitMatrix(BitMatrix paramBitMatrix, int paramInt)
  {
    int i = 0;
    while (i < paramInt)
    {
      int j = 0;
      while (j < paramInt)
      {
        boolean bool = isMasked(i, j);
        if (bool) {
          paramBitMatrix.flip(j, i);
        }
        j += 1;
      }
      i += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.decoder.DataMask
 * JD-Core Version:    0.7.0.1
 */
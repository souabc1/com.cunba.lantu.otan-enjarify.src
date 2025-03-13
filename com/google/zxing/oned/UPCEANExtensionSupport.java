package com.google.zxing.oned;

import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.common.BitArray;

final class UPCEANExtensionSupport
{
  private static final int[] EXTENSION_START_PATTERN = tmp6_5;
  private final UPCEANExtension5Support fiveSupport;
  private final UPCEANExtension2Support twoSupport;
  
  static
  {
    int i = 1;
    int[] tmp5_3 = new int[3];
    int[] tmp6_5 = tmp5_3;
    int[] tmp6_5 = tmp5_3;
    tmp6_5[0] = i;
    tmp6_5[1] = i;
    tmp6_5[2] = 2;
  }
  
  public UPCEANExtensionSupport()
  {
    Object localObject = new com/google/zxing/oned/UPCEANExtension2Support;
    ((UPCEANExtension2Support)localObject).<init>();
    this.twoSupport = ((UPCEANExtension2Support)localObject);
    localObject = new com/google/zxing/oned/UPCEANExtension5Support;
    ((UPCEANExtension5Support)localObject).<init>();
    this.fiveSupport = ((UPCEANExtension5Support)localObject);
  }
  
  public Result decodeRow(int paramInt1, BitArray paramBitArray, int paramInt2)
  {
    UPCEANExtension5Support localUPCEANExtension5Support = null;
    int[] arrayOfInt1 = EXTENSION_START_PATTERN;
    int[] arrayOfInt2 = UPCEANReader.findGuardPattern(paramBitArray, paramInt2, false, arrayOfInt1);
    try
    {
      localUPCEANExtension5Support = this.fiveSupport;
      return localUPCEANExtension5Support.decodeRow(paramInt1, paramBitArray, arrayOfInt2);
    }
    catch (ReaderException localReaderException) {}
    return this.twoSupport.decodeRow(paramInt1, paramBitArray, arrayOfInt2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.oned.UPCEANExtensionSupport
 * JD-Core Version:    0.7.0.1
 */
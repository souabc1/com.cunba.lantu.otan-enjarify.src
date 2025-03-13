package com.google.zxing.multi;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.Result;
import java.util.Map;

public abstract interface MultipleBarcodeReader
{
  public abstract Result[] decodeMultiple(BinaryBitmap paramBinaryBitmap);
  
  public abstract Result[] decodeMultiple(BinaryBitmap paramBinaryBitmap, Map paramMap);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.multi.MultipleBarcodeReader
 * JD-Core Version:    0.7.0.1
 */
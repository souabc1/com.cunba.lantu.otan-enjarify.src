package com.google.zxing.multi.qrcode;

import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

final class QRCodeMultiReader$SAComparator
  implements Comparator, Serializable
{
  public int compare(Result paramResult1, Result paramResult2)
  {
    paramResult1 = paramResult1.getResultMetadata();
    ResultMetadataType localResultMetadataType = ResultMetadataType.STRUCTURED_APPEND_SEQUENCE;
    int i = ((Integer)paramResult1.get(localResultMetadataType)).intValue();
    int j = ((Integer)paramResult2.getResultMetadata().get(localResultMetadataType)).intValue();
    return Integer.compare(i, j);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.multi.qrcode.QRCodeMultiReader.SAComparator
 * JD-Core Version:    0.7.0.1
 */
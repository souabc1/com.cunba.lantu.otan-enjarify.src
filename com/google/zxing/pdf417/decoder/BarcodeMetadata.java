package com.google.zxing.pdf417.decoder;

final class BarcodeMetadata
{
  private final int columnCount;
  private final int errorCorrectionLevel;
  private final int rowCount;
  private final int rowCountLowerPart;
  private final int rowCountUpperPart;
  
  public BarcodeMetadata(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.columnCount = paramInt1;
    this.errorCorrectionLevel = paramInt4;
    this.rowCountUpperPart = paramInt2;
    this.rowCountLowerPart = paramInt3;
    paramInt2 += paramInt3;
    this.rowCount = paramInt2;
  }
  
  public int getColumnCount()
  {
    return this.columnCount;
  }
  
  public int getErrorCorrectionLevel()
  {
    return this.errorCorrectionLevel;
  }
  
  public int getRowCount()
  {
    return this.rowCount;
  }
  
  public int getRowCountLowerPart()
  {
    return this.rowCountLowerPart;
  }
  
  public int getRowCountUpperPart()
  {
    return this.rowCountUpperPart;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.pdf417.decoder.BarcodeMetadata
 * JD-Core Version:    0.7.0.1
 */
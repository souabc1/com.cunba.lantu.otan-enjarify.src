package com.google.android.material.color;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

class ColorResourcesTableCreator$ResChunkHeader
{
  private final int chunkSize;
  private final short headerSize;
  private final short type;
  
  public ColorResourcesTableCreator$ResChunkHeader(short paramShort1, short paramShort2, int paramInt)
  {
    this.type = paramShort1;
    this.headerSize = paramShort2;
    this.chunkSize = paramInt;
  }
  
  public void writeTo(ByteArrayOutputStream paramByteArrayOutputStream)
  {
    byte[] arrayOfByte = ColorResourcesTableCreator.access$600(this.type);
    paramByteArrayOutputStream.write(arrayOfByte);
    arrayOfByte = ColorResourcesTableCreator.access$600(this.headerSize);
    paramByteArrayOutputStream.write(arrayOfByte);
    arrayOfByte = ColorResourcesTableCreator.access$500(this.chunkSize);
    paramByteArrayOutputStream.write(arrayOfByte);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.ColorResourcesTableCreator.ResChunkHeader
 * JD-Core Version:    0.7.0.1
 */
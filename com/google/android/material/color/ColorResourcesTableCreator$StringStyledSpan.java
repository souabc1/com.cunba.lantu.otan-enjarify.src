package com.google.android.material.color;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

class ColorResourcesTableCreator$StringStyledSpan
{
  private int firstCharacterIndex;
  private int lastCharacterIndex;
  private int nameReference;
  private byte[] styleString;
  
  public void writeTo(ByteArrayOutputStream paramByteArrayOutputStream)
  {
    byte[] arrayOfByte = ColorResourcesTableCreator.access$500(this.nameReference);
    paramByteArrayOutputStream.write(arrayOfByte);
    arrayOfByte = ColorResourcesTableCreator.access$500(this.firstCharacterIndex);
    paramByteArrayOutputStream.write(arrayOfByte);
    arrayOfByte = ColorResourcesTableCreator.access$500(this.lastCharacterIndex);
    paramByteArrayOutputStream.write(arrayOfByte);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.ColorResourcesTableCreator.StringStyledSpan
 * JD-Core Version:    0.7.0.1
 */
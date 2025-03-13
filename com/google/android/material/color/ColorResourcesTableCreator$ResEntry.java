package com.google.android.material.color;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

class ColorResourcesTableCreator$ResEntry
{
  private static final byte DATA_TYPE_AARRGGBB = 28;
  private static final short ENTRY_SIZE = 8;
  private static final short FLAG_PUBLIC = 2;
  private static final int SIZE = 16;
  private static final short VALUE_SIZE = 8;
  private final int data;
  private final int keyStringIndex;
  
  public ColorResourcesTableCreator$ResEntry(int paramInt1, int paramInt2)
  {
    this.keyStringIndex = paramInt1;
    this.data = paramInt2;
  }
  
  public void writeTo(ByteArrayOutputStream paramByteArrayOutputStream)
  {
    short s1 = 8;
    byte[] arrayOfByte1 = ColorResourcesTableCreator.access$600(s1);
    paramByteArrayOutputStream.write(arrayOfByte1);
    short s2 = 2;
    byte[] arrayOfByte2 = ColorResourcesTableCreator.access$600(s2);
    paramByteArrayOutputStream.write(arrayOfByte2);
    arrayOfByte2 = ColorResourcesTableCreator.access$500(this.keyStringIndex);
    paramByteArrayOutputStream.write(arrayOfByte2);
    byte[] arrayOfByte3 = ColorResourcesTableCreator.access$600(s1);
    paramByteArrayOutputStream.write(arrayOfByte3);
    arrayOfByte3 = new byte[s2];
    byte[] tmp64_62 = arrayOfByte3;
    tmp64_62[0] = 0;
    tmp64_62[1] = 28;
    paramByteArrayOutputStream.write(arrayOfByte3);
    arrayOfByte3 = ColorResourcesTableCreator.access$500(this.data);
    paramByteArrayOutputStream.write(arrayOfByte3);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.ColorResourcesTableCreator.ResEntry
 * JD-Core Version:    0.7.0.1
 */
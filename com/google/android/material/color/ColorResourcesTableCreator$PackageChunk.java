package com.google.android.material.color;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.List;
import m54207b69;

class ColorResourcesTableCreator$PackageChunk
{
  private static final short HEADER_SIZE = 288;
  private static final int PACKAGE_NAME_MAX_LENGTH = 128;
  private final ColorResourcesTableCreator.ResChunkHeader header;
  private final ColorResourcesTableCreator.StringPoolChunk keyStrings;
  private final ColorResourcesTableCreator.PackageInfo packageInfo;
  private final ColorResourcesTableCreator.TypeSpecChunk typeSpecChunk;
  private final ColorResourcesTableCreator.StringPoolChunk typeStrings;
  
  public ColorResourcesTableCreator$PackageChunk(ColorResourcesTableCreator.PackageInfo paramPackageInfo, List paramList)
  {
    this.packageInfo = paramPackageInfo;
    paramPackageInfo = new com/google/android/material/color/ColorResourcesTableCreator$StringPoolChunk;
    String str1 = "?3";
    String str2 = "?4";
    String str3 = "?5";
    String str4 = m54207b69.F54207b69_11("P{181519170D");
    String[] tmp36_33 = new String[6];
    String[] tmp37_36 = tmp36_33;
    String[] tmp37_36 = tmp36_33;
    tmp37_36[0] = "?1";
    tmp37_36[1] = "?2";
    String[] tmp46_37 = tmp37_36;
    String[] tmp46_37 = tmp37_36;
    tmp46_37[2] = str1;
    tmp46_37[3] = str2;
    tmp46_37[4] = str3;
    String[] tmp58_46 = tmp46_37;
    tmp58_46[5] = str4;
    Object localObject = tmp58_46;
    int i = 0;
    paramPackageInfo.<init>(false, (String[])localObject);
    this.typeStrings = paramPackageInfo;
    int j = paramList.size();
    paramPackageInfo = new String[j];
    for (;;)
    {
      k = paramList.size();
      if (i >= k) {
        break;
      }
      localObject = ColorResourcesTableCreator.ColorResource.access$100((ColorResourcesTableCreator.ColorResource)paramList.get(i));
      paramPackageInfo[i] = localObject;
      i += 1;
    }
    localObject = new com/google/android/material/color/ColorResourcesTableCreator$StringPoolChunk;
    ((ColorResourcesTableCreator.StringPoolChunk)localObject).<init>(true, paramPackageInfo);
    this.keyStrings = ((ColorResourcesTableCreator.StringPoolChunk)localObject);
    paramPackageInfo = new com/google/android/material/color/ColorResourcesTableCreator$TypeSpecChunk;
    paramPackageInfo.<init>(paramList);
    this.typeSpecChunk = paramPackageInfo;
    paramPackageInfo = new com/google/android/material/color/ColorResourcesTableCreator$ResChunkHeader;
    int k = getChunkSize();
    paramPackageInfo.<init>((short)512, (short)288, k);
    this.header = paramPackageInfo;
  }
  
  public int getChunkSize()
  {
    int i = this.typeStrings.getChunkSize() + 288;
    int j = this.keyStrings.getChunkSize();
    i += j;
    j = this.typeSpecChunk.getChunkSizeWithTypeChunk();
    return i + j;
  }
  
  public void writeTo(ByteArrayOutputStream paramByteArrayOutputStream)
  {
    this.header.writeTo(paramByteArrayOutputStream);
    int i = ColorResourcesTableCreator.PackageInfo.access$1000(this.packageInfo);
    Object localObject = ColorResourcesTableCreator.access$500(i);
    paramByteArrayOutputStream.write((byte[])localObject);
    localObject = ColorResourcesTableCreator.PackageInfo.access$1100(this.packageInfo).toCharArray();
    int j = 0;
    byte[] arrayOfByte1 = null;
    for (;;)
    {
      int k = 128;
      if (j >= k) {
        break;
      }
      k = localObject.length;
      byte[] arrayOfByte2;
      if (j < k)
      {
        k = localObject[j];
        arrayOfByte2 = ColorResourcesTableCreator.access$1200(k);
        paramByteArrayOutputStream.write(arrayOfByte2);
      }
      else
      {
        arrayOfByte2 = ColorResourcesTableCreator.access$1200('\000');
        paramByteArrayOutputStream.write(arrayOfByte2);
      }
      j += 1;
    }
    i = 288;
    arrayOfByte1 = ColorResourcesTableCreator.access$500(i);
    paramByteArrayOutputStream.write(arrayOfByte1);
    arrayOfByte1 = ColorResourcesTableCreator.access$500(0);
    paramByteArrayOutputStream.write(arrayOfByte1);
    localObject = ColorResourcesTableCreator.access$500(this.typeStrings.getChunkSize() + i);
    paramByteArrayOutputStream.write((byte[])localObject);
    localObject = ColorResourcesTableCreator.access$500(0);
    paramByteArrayOutputStream.write((byte[])localObject);
    localObject = ColorResourcesTableCreator.access$500(0);
    paramByteArrayOutputStream.write((byte[])localObject);
    this.typeStrings.writeTo(paramByteArrayOutputStream);
    this.keyStrings.writeTo(paramByteArrayOutputStream);
    this.typeSpecChunk.writeTo(paramByteArrayOutputStream);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.ColorResourcesTableCreator.PackageChunk
 * JD-Core Version:    0.7.0.1
 */
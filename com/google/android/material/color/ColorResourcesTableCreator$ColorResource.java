package com.google.android.material.color;

class ColorResourcesTableCreator$ColorResource
{
  private final short entryId;
  private final String name;
  private final byte packageId;
  private final byte typeId;
  private final int value;
  
  public ColorResourcesTableCreator$ColorResource(int paramInt1, String paramString, int paramInt2)
  {
    this.name = paramString;
    this.value = paramInt2;
    int i = (short)((char)-1 & paramInt1);
    this.entryId = i;
    i = (byte)(paramInt1 >> 16 & 0xFF);
    this.typeId = i;
    paramInt1 = (byte)(paramInt1 >> 24 & 0xFF);
    this.packageId = paramInt1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.ColorResourcesTableCreator.ColorResource
 * JD-Core Version:    0.7.0.1
 */
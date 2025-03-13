package androidx.profileinstaller;

 enum FileSectionType
{
  public final long o00OoOoo;
  
  static
  {
    FileSectionType localFileSectionType = new androidx/profileinstaller/FileSectionType;
    localFileSectionType.<init>("DEX_FILES", 0, 0L);
    o00Ooo00 = localFileSectionType;
    localFileSectionType = new androidx/profileinstaller/FileSectionType;
    localFileSectionType.<init>("EXTRA_DESCRIPTORS", 1, 1L);
    o00Ooo0 = localFileSectionType;
    localFileSectionType = new androidx/profileinstaller/FileSectionType;
    localFileSectionType.<init>("CLASSES", 2, 2);
    o00Ooo0O = localFileSectionType;
    localFileSectionType = new androidx/profileinstaller/FileSectionType;
    localFileSectionType.<init>("METHODS", 3, 3);
    o00Ooo0o = localFileSectionType;
    localFileSectionType = new androidx/profileinstaller/FileSectionType;
    localFileSectionType.<init>("AGGREGATION_COUNT", 4, 4);
    o00OooO0 = localFileSectionType;
  }
  
  public FileSectionType(long paramLong)
  {
    this.o00OoOoo = paramLong;
  }
  
  public long getValue()
  {
    return this.o00OoOoo;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.profileinstaller.FileSectionType
 * JD-Core Version:    0.7.0.1
 */
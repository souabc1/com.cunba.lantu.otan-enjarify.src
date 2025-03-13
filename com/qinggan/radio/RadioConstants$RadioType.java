package com.qinggan.radio;

public enum RadioConstants$RadioType
{
  static
  {
    RadioConstants.RadioType.1 local1 = new com/qinggan/radio/RadioConstants$RadioType$1;
    local1.<init>("FM", 0);
    o00Ooo0 = local1;
    RadioConstants.RadioType.2 local2 = new com/qinggan/radio/RadioConstants$RadioType$2;
    int i = 1;
    local2.<init>("AM", i);
    o00Ooo00 = local2;
    RadioType[] arrayOfRadioType = new RadioType[2];
    arrayOfRadioType[0] = local1;
    arrayOfRadioType[i] = local2;
    o00OoOoo = arrayOfRadioType;
  }
  
  public static RadioType getRadioType(int paramInt)
  {
    RadioType[] arrayOfRadioType = values();
    int i = arrayOfRadioType.length;
    int j = 0;
    while (j < i)
    {
      RadioType localRadioType = arrayOfRadioType[j];
      int k = localRadioType.getId();
      if (k == paramInt) {
        return localRadioType;
      }
      j += 1;
    }
    return o00Ooo0;
  }
  
  public static RadioType getRadioTypeByValue(int paramInt)
  {
    RadioType localRadioType = o00Ooo0;
    boolean bool = localRadioType.isValide(paramInt);
    if (bool) {
      return localRadioType;
    }
    localRadioType = o00Ooo00;
    paramInt = localRadioType.isValide(paramInt);
    if (paramInt != 0) {
      return localRadioType;
    }
    return null;
  }
  
  public abstract int getId();
  
  public abstract String getName();
  
  public boolean isFrequencyValid(int paramInt)
  {
    return isValide(paramInt);
  }
  
  public abstract boolean isValide(int paramInt);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.radio.RadioConstants.RadioType
 * JD-Core Version:    0.7.0.1
 */
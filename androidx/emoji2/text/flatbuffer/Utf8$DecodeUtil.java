package androidx.emoji2.text.flatbuffer;

class Utf8$DecodeUtil
{
  public static boolean OooO(byte paramByte)
  {
    byte b = -32;
    if (paramByte < b) {
      paramByte = 1;
    } else {
      paramByte = 0;
    }
    return paramByte;
  }
  
  public static void OooO00o(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, char[] paramArrayOfChar, int paramInt)
  {
    boolean bool1 = OooO0o(paramByte2);
    if (!bool1)
    {
      int i = paramByte1 << 28;
      int j = paramByte2 + 112;
      i = i + j >> 30;
      if (i == 0)
      {
        boolean bool2 = OooO0o(paramByte3);
        if (!bool2)
        {
          bool2 = OooO0o(paramByte4);
          if (!bool2)
          {
            paramByte1 = (paramByte1 & 0x7) << 18;
            paramByte2 = OooOO0O(paramByte2) << 12;
            paramByte1 |= paramByte2;
            paramByte2 = OooOO0O(paramByte3) << 6;
            paramByte1 |= paramByte2;
            paramByte2 = OooOO0O(paramByte4);
            paramByte1 |= paramByte2;
            paramByte2 = OooO0o0(paramByte1);
            paramArrayOfChar[paramInt] = paramByte2;
            paramInt += 1;
            paramByte1 = OooOO0(paramByte1);
            paramArrayOfChar[paramInt] = paramByte1;
            return;
          }
        }
      }
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>("Invalid UTF-8");
    throw localIllegalArgumentException;
  }
  
  public static void OooO0O0(byte paramByte, char[] paramArrayOfChar, int paramInt)
  {
    paramByte = (char)paramByte;
    paramArrayOfChar[paramInt] = paramByte;
  }
  
  public static void OooO0OO(byte paramByte1, byte paramByte2, byte paramByte3, char[] paramArrayOfChar, int paramInt)
  {
    boolean bool1 = OooO0o(paramByte2);
    if (!bool1)
    {
      byte b1 = -32;
      byte b2 = -96;
      if ((paramByte1 != b1) || (paramByte2 >= b2))
      {
        b1 = -19;
        if ((paramByte1 != b1) || (paramByte2 < b2))
        {
          boolean bool2 = OooO0o(paramByte3);
          if (!bool2)
          {
            paramByte1 = (paramByte1 & 0xF) << 12;
            paramByte2 = OooOO0O(paramByte2) << 6;
            paramByte1 |= paramByte2;
            paramByte2 = OooOO0O(paramByte3);
            paramByte1 = (char)(paramByte1 | paramByte2);
            paramArrayOfChar[paramInt] = paramByte1;
            return;
          }
        }
      }
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>("Invalid UTF-8");
    throw localIllegalArgumentException;
  }
  
  public static void OooO0Oo(byte paramByte1, byte paramByte2, char[] paramArrayOfChar, int paramInt)
  {
    byte b = -62;
    if (paramByte1 >= b)
    {
      boolean bool = OooO0o(paramByte2);
      if (!bool)
      {
        paramByte1 = (paramByte1 & 0x1F) << 6;
        paramByte2 = OooOO0O(paramByte2);
        paramByte1 = (char)(paramByte1 | paramByte2);
        paramArrayOfChar[paramInt] = paramByte1;
        return;
      }
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
      throw localIllegalArgumentException;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localIllegalArgumentException.<init>("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
    throw localIllegalArgumentException;
  }
  
  public static boolean OooO0o(byte paramByte)
  {
    byte b = -65;
    if (paramByte > b) {
      paramByte = 1;
    } else {
      paramByte = 0;
    }
    return paramByte;
  }
  
  public static char OooO0o0(int paramInt)
  {
    return (char)((paramInt >>> 10) + 55232);
  }
  
  public static boolean OooO0oO(byte paramByte)
  {
    if (paramByte >= 0) {
      paramByte = 1;
    } else {
      paramByte = 0;
    }
    return paramByte;
  }
  
  public static boolean OooO0oo(byte paramByte)
  {
    byte b = -16;
    if (paramByte < b) {
      paramByte = 1;
    } else {
      paramByte = 0;
    }
    return paramByte;
  }
  
  public static char OooOO0(int paramInt)
  {
    return (char)((paramInt & 0x3FF) + 56320);
  }
  
  public static int OooOO0O(byte paramByte)
  {
    return paramByte & 0x3F;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil
 * JD-Core Version:    0.7.0.1
 */
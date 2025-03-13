package androidx.profileinstaller;

import java.util.Arrays;

public class ProfileVersion
{
  public static final byte[] OooO00o;
  public static final byte[] OooO0O0;
  public static final byte[] OooO0OO;
  public static final byte[] OooO0Oo;
  public static final byte[] OooO0o;
  public static final byte[] OooO0o0;
  public static final byte[] OooO0oO;
  
  static
  {
    int i = 4;
    byte[] arrayOfByte1 = new byte[i];
    byte[] tmp7_6 = arrayOfByte1;
    byte[] tmp8_7 = tmp7_6;
    byte[] tmp8_7 = tmp7_6;
    tmp8_7[0] = 48;
    tmp8_7[1] = 49;
    tmp8_7[2] = 53;
    tmp8_7[3] = 0;
    OooO00o = arrayOfByte1;
    arrayOfByte1 = new byte[i];
    byte[] tmp33_32 = arrayOfByte1;
    byte[] tmp34_33 = tmp33_32;
    byte[] tmp34_33 = tmp33_32;
    tmp34_33[0] = 48;
    tmp34_33[1] = 49;
    tmp34_33[2] = 48;
    tmp34_33[3] = 0;
    OooO0O0 = arrayOfByte1;
    arrayOfByte1 = new byte[i];
    byte[] tmp59_58 = arrayOfByte1;
    byte[] tmp60_59 = tmp59_58;
    byte[] tmp60_59 = tmp59_58;
    tmp60_59[0] = 48;
    tmp60_59[1] = 48;
    tmp60_59[2] = 57;
    tmp60_59[3] = 0;
    OooO0OO = arrayOfByte1;
    arrayOfByte1 = new byte[i];
    byte[] tmp85_84 = arrayOfByte1;
    byte[] tmp86_85 = tmp85_84;
    byte[] tmp86_85 = tmp85_84;
    tmp86_85[0] = 48;
    tmp86_85[1] = 48;
    tmp86_85[2] = 53;
    tmp86_85[3] = 0;
    OooO0Oo = arrayOfByte1;
    arrayOfByte1 = new byte[i];
    byte[] tmp111_110 = arrayOfByte1;
    byte[] tmp112_111 = tmp111_110;
    byte[] tmp112_111 = tmp111_110;
    tmp112_111[0] = 48;
    tmp112_111[1] = 48;
    tmp112_111[2] = 49;
    tmp112_111[3] = 0;
    OooO0o0 = arrayOfByte1;
    arrayOfByte1 = new byte[i];
    byte[] tmp137_136 = arrayOfByte1;
    byte[] tmp138_137 = tmp137_136;
    byte[] tmp138_137 = tmp137_136;
    tmp138_137[0] = 48;
    tmp138_137[1] = 48;
    tmp138_137[2] = 49;
    tmp138_137[3] = 0;
    OooO0o = arrayOfByte1;
    byte[] arrayOfByte2 = new byte[i];
    byte[] tmp163_162 = arrayOfByte2;
    byte[] tmp164_163 = tmp163_162;
    byte[] tmp164_163 = tmp163_162;
    tmp164_163[0] = 48;
    tmp164_163[1] = 48;
    tmp164_163[2] = 50;
    tmp164_163[3] = 0;
    OooO0oO = arrayOfByte2;
  }
  
  public static String OooO00o(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = OooO0o0;
    boolean bool1 = Arrays.equals(paramArrayOfByte, arrayOfByte);
    String str = ":";
    if (bool1) {
      return str;
    }
    arrayOfByte = OooO0Oo;
    boolean bool2 = Arrays.equals(paramArrayOfByte, arrayOfByte);
    if (bool2) {
      return str;
    }
    return "!";
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.profileinstaller.ProfileVersion
 * JD-Core Version:    0.7.0.1
 */
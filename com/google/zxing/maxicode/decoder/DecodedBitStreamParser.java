package com.google.zxing.maxicode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.DecoderResult;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import m54207b69;

final class DecodedBitStreamParser
{
  private static final byte[] COUNTRY_BYTES;
  private static final char ECI = '￺';
  private static final char FS = '\034';
  private static final char GS = '\035';
  private static final char LATCHA = '￷';
  private static final char LATCHB = '￸';
  private static final char LOCK = '￹';
  private static final char NS = '￻';
  private static final char PAD = '￼';
  private static final byte[] POSTCODE_2_BYTES;
  private static final byte[] POSTCODE_2_LENGTH_BYTES;
  private static final byte[][] POSTCODE_3_BYTES;
  private static final char RS = '\036';
  private static final byte[] SERVICE_CLASS_BYTES;
  private static final String[] SETS = tmp562_553;
  private static final char SHIFTA = '￰';
  private static final char SHIFTB = '￱';
  private static final char SHIFTC = '￲';
  private static final char SHIFTD = '￳';
  private static final char SHIFTE = '￴';
  private static final char THREESHIFTA = '￶';
  private static final char TWOSHIFTA = '￵';
  
  static
  {
    int i = 10;
    Object localObject = new byte[i];
    Object tmp8_7 = localObject;
    Object tmp9_8 = tmp8_7;
    Object tmp9_8 = tmp8_7;
    tmp9_8[0] = 53;
    tmp9_8[1] = 54;
    Object tmp18_9 = tmp9_8;
    Object tmp18_9 = tmp9_8;
    tmp18_9[2] = 43;
    tmp18_9[3] = 44;
    Object tmp27_18 = tmp18_9;
    Object tmp27_18 = tmp18_9;
    tmp27_18[4] = 45;
    tmp27_18[5] = 46;
    Object tmp36_27 = tmp27_18;
    Object tmp36_27 = tmp27_18;
    tmp36_27[6] = 47;
    tmp36_27[7] = 48;
    tmp36_27[8] = 37;
    tmp36_27[9] = 38;
    COUNTRY_BYTES = (byte[])localObject;
    byte[] arrayOfByte1 = new byte[i];
    byte[] tmp66_65 = arrayOfByte1;
    byte[] tmp67_66 = tmp66_65;
    byte[] tmp67_66 = tmp66_65;
    tmp67_66[0] = 55;
    tmp67_66[1] = 56;
    byte[] tmp76_67 = tmp67_66;
    byte[] tmp76_67 = tmp67_66;
    tmp76_67[2] = 57;
    tmp76_67[3] = 58;
    byte[] tmp85_76 = tmp76_67;
    byte[] tmp85_76 = tmp76_67;
    tmp85_76[4] = 59;
    tmp85_76[5] = 60;
    byte[] tmp94_85 = tmp85_76;
    byte[] tmp94_85 = tmp85_76;
    tmp94_85[6] = 49;
    tmp94_85[7] = 50;
    tmp94_85[8] = 51;
    tmp94_85[9] = 52;
    SERVICE_CLASS_BYTES = arrayOfByte1;
    i = 6;
    localObject = new byte[i];
    Object tmp127_126 = localObject;
    Object tmp128_127 = tmp127_126;
    Object tmp128_127 = tmp127_126;
    tmp128_127[0] = 39;
    tmp128_127[1] = 40;
    Object tmp137_128 = tmp128_127;
    Object tmp137_128 = tmp128_127;
    tmp137_128[2] = 41;
    tmp137_128[3] = 42;
    tmp137_128[4] = 31;
    tmp137_128[5] = 32;
    POSTCODE_2_LENGTH_BYTES = (byte[])localObject;
    localObject = new byte[30];
    Object tmp164_163 = localObject;
    Object tmp165_164 = tmp164_163;
    Object tmp165_164 = tmp164_163;
    tmp165_164[0] = 33;
    tmp165_164[1] = 34;
    Object tmp174_165 = tmp165_164;
    Object tmp174_165 = tmp165_164;
    tmp174_165[2] = 35;
    tmp174_165[3] = 36;
    Object tmp183_174 = tmp174_165;
    Object tmp183_174 = tmp174_165;
    tmp183_174[4] = 25;
    tmp183_174[5] = 26;
    Object tmp192_183 = tmp183_174;
    Object tmp192_183 = tmp183_174;
    tmp192_183[6] = 27;
    tmp192_183[7] = 28;
    Object tmp203_192 = tmp192_183;
    Object tmp203_192 = tmp192_183;
    tmp203_192[8] = 29;
    tmp203_192[9] = 30;
    Object tmp214_203 = tmp203_192;
    Object tmp214_203 = tmp203_192;
    tmp214_203[10] = 19;
    tmp214_203[11] = 20;
    Object tmp225_214 = tmp214_203;
    Object tmp225_214 = tmp214_203;
    tmp225_214[12] = 21;
    tmp225_214[13] = 22;
    Object tmp236_225 = tmp225_214;
    Object tmp236_225 = tmp225_214;
    tmp236_225[14] = 23;
    tmp236_225[15] = 24;
    Object tmp247_236 = tmp236_225;
    Object tmp247_236 = tmp236_225;
    tmp247_236[16] = 13;
    tmp247_236[17] = 14;
    Object tmp258_247 = tmp247_236;
    Object tmp258_247 = tmp247_236;
    tmp258_247[18] = 15;
    tmp258_247[19] = 16;
    Object tmp269_258 = tmp258_247;
    Object tmp269_258 = tmp258_247;
    tmp269_258[20] = 17;
    tmp269_258[21] = 18;
    Object tmp280_269 = tmp269_258;
    Object tmp280_269 = tmp269_258;
    tmp280_269[22] = 7;
    tmp280_269[23] = 8;
    Object tmp291_280 = tmp280_269;
    Object tmp291_280 = tmp280_269;
    tmp291_280[24] = 9;
    tmp291_280[25] = 10;
    Object tmp302_291 = tmp291_280;
    Object tmp302_291 = tmp291_280;
    tmp302_291[26] = 11;
    tmp302_291[27] = 12;
    tmp302_291[28] = 1;
    tmp302_291[29] = 2;
    POSTCODE_2_BYTES = (byte[])localObject;
    localObject = new byte[i][];
    byte[] arrayOfByte2 = new byte[i];
    byte[] tmp335_334 = arrayOfByte2;
    byte[] tmp336_335 = tmp335_334;
    byte[] tmp336_335 = tmp335_334;
    tmp336_335[0] = 39;
    tmp336_335[1] = 40;
    byte[] tmp345_336 = tmp336_335;
    byte[] tmp345_336 = tmp336_335;
    tmp345_336[2] = 41;
    tmp345_336[3] = 42;
    tmp345_336[4] = 31;
    tmp345_336[5] = 32;
    localObject[0] = arrayOfByte2;
    arrayOfByte2 = new byte[i];
    byte[] tmp371_370 = arrayOfByte2;
    byte[] tmp372_371 = tmp371_370;
    byte[] tmp372_371 = tmp371_370;
    tmp372_371[0] = 33;
    tmp372_371[1] = 34;
    byte[] tmp381_372 = tmp372_371;
    byte[] tmp381_372 = tmp372_371;
    tmp381_372[2] = 35;
    tmp381_372[3] = 36;
    tmp381_372[4] = 25;
    tmp381_372[5] = 26;
    localObject[1] = arrayOfByte2;
    arrayOfByte2 = new byte[i];
    byte[] tmp407_406 = arrayOfByte2;
    byte[] tmp408_407 = tmp407_406;
    byte[] tmp408_407 = tmp407_406;
    tmp408_407[0] = 27;
    tmp408_407[1] = 28;
    byte[] tmp417_408 = tmp408_407;
    byte[] tmp417_408 = tmp408_407;
    tmp417_408[2] = 29;
    tmp417_408[3] = 30;
    tmp417_408[4] = 19;
    tmp417_408[5] = 20;
    localObject[2] = arrayOfByte2;
    arrayOfByte2 = new byte[i];
    byte[] tmp443_442 = arrayOfByte2;
    byte[] tmp444_443 = tmp443_442;
    byte[] tmp444_443 = tmp443_442;
    tmp444_443[0] = 21;
    tmp444_443[1] = 22;
    byte[] tmp453_444 = tmp444_443;
    byte[] tmp453_444 = tmp444_443;
    tmp453_444[2] = 23;
    tmp453_444[3] = 24;
    tmp453_444[4] = 13;
    tmp453_444[5] = 14;
    localObject[3] = arrayOfByte2;
    arrayOfByte2 = new byte[i];
    byte[] tmp479_478 = arrayOfByte2;
    byte[] tmp480_479 = tmp479_478;
    byte[] tmp480_479 = tmp479_478;
    tmp480_479[0] = 15;
    tmp480_479[1] = 16;
    byte[] tmp489_480 = tmp480_479;
    byte[] tmp489_480 = tmp480_479;
    tmp489_480[2] = 17;
    tmp489_480[3] = 18;
    tmp489_480[4] = 7;
    tmp489_480[5] = 8;
    localObject[4] = arrayOfByte2;
    arrayOfByte1 = new byte[i];
    byte[] tmp515_514 = arrayOfByte1;
    byte[] tmp516_515 = tmp515_514;
    byte[] tmp516_515 = tmp515_514;
    tmp516_515[0] = 9;
    tmp516_515[1] = 10;
    byte[] tmp525_516 = tmp516_515;
    byte[] tmp525_516 = tmp516_515;
    tmp525_516[2] = 11;
    tmp525_516[3] = 12;
    tmp525_516[4] = 1;
    tmp525_516[5] = 2;
    localObject[5] = arrayOfByte1;
    POSTCODE_3_BYTES = (byte[][])localObject;
    String[] tmp552_549 = new String[5];
    String[] tmp553_552 = tmp552_549;
    String[] tmp553_552 = tmp552_549;
    tmp553_552[0] = "\rABCDEFGHIJKLMNOPQRSTUVWXYZ￺\034\035\036￻ ￼\"#$%&'()*+,-./0123456789:￱￲￳￴￸";
    tmp553_552[1] = "`abcdefghijklmnopqrstuvwxyz￺\034\035\036￻{￼}~;<=>?[\\]^_ ,./:@!|￼￵￶￼￰￲￳￴￷";
    String[] tmp562_553 = tmp553_552;
    String[] tmp562_553 = tmp553_552;
    tmp562_553[2] = "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ￺\034\035\036￻ÛÜÝÞßª¬±²³µ¹º¼½¾￷ ￹￳￴￸";
    tmp562_553[3] = "àáâãäåæçèéêëìíîïðñòóôõö÷øùú￺\034\035\036￻ûüýþÿ¡¨«¯°´·¸»¿￷ ￲￹￴￸";
    tmp562_553[4] = "";
  }
  
  public static DecoderResult decode(byte[] paramArrayOfByte, int paramInt)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>(144);
    int i = 2;
    if (paramInt != i)
    {
      j = 3;
      if (paramInt != j)
      {
        i = 4;
        j = 1;
        if (paramInt != i)
        {
          i = 5;
          if (paramInt != i) {
            break label405;
          }
          i = 77;
        }
        else
        {
          i = 93;
        }
        localObject2 = getMessage(paramArrayOfByte, j, i);
        ((StringBuilder)localObject1).append((String)localObject2);
        break label405;
      }
    }
    int j = 0;
    StringBuilder localStringBuilder = null;
    int k = 10;
    if (paramInt == i)
    {
      i = getPostCode2(paramArrayOfByte);
      int m = getPostCode2Length(paramArrayOfByte);
      if (m <= k)
      {
        localObject3 = new java/text/DecimalFormat;
        str1 = m54207b69.F54207b69_11("8]6D6E6F70717273747576");
        localObject4 = str1.substring(0, m);
        ((DecimalFormat)localObject3).<init>((String)localObject4);
        l1 = i;
        localObject2 = ((NumberFormat)localObject3).format(l1);
      }
      else
      {
        throw FormatException.getFormatInstance();
      }
    }
    else
    {
      localObject2 = getPostCode3(paramArrayOfByte);
    }
    Object localObject4 = new java/text/DecimalFormat;
    ((DecimalFormat)localObject4).<init>("000");
    int n = getCountry(paramArrayOfByte);
    long l2 = n;
    Object localObject3 = ((NumberFormat)localObject4).format(l2);
    long l1 = getServiceClass(paramArrayOfByte);
    localObject4 = ((NumberFormat)localObject4).format(l1);
    Object localObject5 = getMessage(paramArrayOfByte, k, 84);
    ((StringBuilder)localObject1).append((String)localObject5);
    localObject5 = ((StringBuilder)localObject1).toString();
    String str1 = m54207b69.F54207b69_11("CG1C6F7B5C7B7B60");
    boolean bool = ((String)localObject5).startsWith(str1);
    char c = '\035';
    if (bool)
    {
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append((String)localObject2);
      localStringBuilder.append(c);
      localStringBuilder.append((String)localObject3);
      localStringBuilder.append(c);
      localStringBuilder.append((String)localObject4);
      localStringBuilder.append(c);
      localObject2 = localStringBuilder.toString();
      j = 9;
    }
    else
    {
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      ((StringBuilder)localObject5).append((String)localObject2);
      ((StringBuilder)localObject5).append(c);
      ((StringBuilder)localObject5).append((String)localObject3);
      ((StringBuilder)localObject5).append(c);
      ((StringBuilder)localObject5).append((String)localObject4);
      ((StringBuilder)localObject5).append(c);
      localObject2 = ((StringBuilder)localObject5).toString();
    }
    ((StringBuilder)localObject1).insert(j, (String)localObject2);
    label405:
    Object localObject2 = new com/google/zxing/common/DecoderResult;
    localObject1 = ((StringBuilder)localObject1).toString();
    String str2 = String.valueOf(paramInt);
    ((DecoderResult)localObject2).<init>(paramArrayOfByte, (String)localObject1, null, str2);
    return localObject2;
  }
  
  private static int getBit(int paramInt, byte[] paramArrayOfByte)
  {
    paramInt += -1;
    int i = paramInt / 6;
    int j = paramArrayOfByte[i];
    paramInt %= 6;
    paramInt = 5 - paramInt;
    i = 1;
    paramInt = i << paramInt & j;
    if (paramInt == 0) {
      i = 0;
    }
    return i;
  }
  
  private static int getCountry(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = COUNTRY_BYTES;
    return getInt(paramArrayOfByte, arrayOfByte);
  }
  
  private static int getInt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = 0;
    int j = 0;
    for (;;)
    {
      int k = paramArrayOfByte2.length;
      if (i >= k) {
        break;
      }
      k = getBit(paramArrayOfByte2[i], paramArrayOfByte1);
      int m = paramArrayOfByte2.length - i + -1;
      k <<= m;
      j += k;
      i += 1;
    }
    return j;
  }
  
  private static String getMessage(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    int i = -1;
    int j = paramInt1;
    int k = i;
    int m = 0;
    int n = 0;
    int i3;
    for (;;)
    {
      int i1 = paramInt1 + paramInt2;
      i3 = 1;
      if (j >= i1) {
        break;
      }
      String str1 = SETS[m];
      int i4 = paramArrayOfByte[j];
      i1 = str1.charAt(i4);
      switch (i1)
      {
      case 65530: 
      default: 
        localStringBuilder.append(i1);
        break;
      case 65531: 
        j += 1;
        i2 = paramArrayOfByte[j] << 24;
        j += i3;
        i4 = paramArrayOfByte[j] << 18;
        i2 += i4;
        j += i3;
        i4 = paramArrayOfByte[j] << 12;
        i2 += i4;
        j += i3;
        i4 = paramArrayOfByte[j] << 6;
        i2 += i4;
        j += i3;
        i4 = paramArrayOfByte[j];
        i2 += i4;
        DecimalFormat localDecimalFormat = new java/text/DecimalFormat;
        String str2 = m54207b69.F54207b69_11("SE75767778797A7B7C7D");
        localDecimalFormat.<init>(str2);
        long l = i2;
        str1 = localDecimalFormat.format(l);
        localStringBuilder.append(str1);
        break;
      case 65529: 
        k = i;
        break;
      case 65528: 
        k = i;
        m = i3;
        break;
      case 65527: 
        k = i;
        break;
      case 65526: 
        k = 3;
        break;
      case 65525: 
        k = 2;
        n = m;
        m = 0;
        break;
      }
      i2 -= (char)-16;
      n = m;
      m = i2;
      k = i3;
      int i2 = k + -1;
      if (k == 0) {
        m = n;
      }
      j += i3;
      k = i2;
    }
    for (;;)
    {
      int i5 = localStringBuilder.length();
      if (i5 <= 0) {
        break;
      }
      i5 = localStringBuilder.length() - i3;
      i5 = localStringBuilder.charAt(i5);
      paramInt1 = (char)-4;
      if (i5 != paramInt1) {
        break;
      }
      i5 = localStringBuilder.length() - i3;
      localStringBuilder.setLength(i5);
    }
    return localStringBuilder.toString();
  }
  
  private static int getPostCode2(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = POSTCODE_2_BYTES;
    return getInt(paramArrayOfByte, arrayOfByte);
  }
  
  private static int getPostCode2Length(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = POSTCODE_2_LENGTH_BYTES;
    return getInt(paramArrayOfByte, arrayOfByte);
  }
  
  private static String getPostCode3(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    byte[][] arrayOfByte = POSTCODE_3_BYTES;
    int i = arrayOfByte.length;
    localStringBuilder.<init>(i);
    i = arrayOfByte.length;
    int j = 0;
    while (j < i)
    {
      byte[] arrayOfByte1 = arrayOfByte[j];
      String str = SETS[0];
      int k = getInt(paramArrayOfByte, arrayOfByte1);
      k = str.charAt(k);
      localStringBuilder.append(k);
      j += 1;
    }
    return localStringBuilder.toString();
  }
  
  private static int getServiceClass(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = SERVICE_CLASS_BYTES;
    return getInt(paramArrayOfByte, arrayOfByte);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.maxicode.decoder.DecodedBitStreamParser
 * JD-Core Version:    0.7.0.1
 */
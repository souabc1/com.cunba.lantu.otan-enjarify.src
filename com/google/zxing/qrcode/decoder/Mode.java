package com.google.zxing.qrcode.decoder;

import m54207b69;

public enum Mode
{
  private final int bits;
  private final int[] characterCountBitsForVersions;
  
  static
  {
    Mode localMode1 = new com/google/zxing/qrcode/decoder/Mode;
    int[] tmp7_5 = new int[3];
    int[] tmp8_7 = tmp7_5;
    int[] tmp8_7 = tmp7_5;
    tmp8_7[0] = 0;
    tmp8_7[1] = 0;
    tmp8_7[2] = 0;
    Object localObject1 = tmp8_7;
    Object localObject2 = m54207b69.F54207b69_11("ip243624403D43372B472B");
    localMode1.<init>((String)localObject2, 0, (int[])localObject1, 0);
    TERMINATOR = localMode1;
    localObject1 = new com/google/zxing/qrcode/decoder/Mode;
    int i = 10;
    int j = 12;
    int[] tmp51_49 = new int[3];
    int[] tmp52_51 = tmp51_49;
    int[] tmp52_51 = tmp51_49;
    tmp52_51[0] = i;
    tmp52_51[1] = j;
    tmp52_51[2] = 14;
    localObject2 = tmp52_51;
    Object localObject3 = m54207b69.F54207b69_11("\\[150F18210D171E");
    int k = 1;
    ((Mode)localObject1).<init>((String)localObject3, k, (int[])localObject2, k);
    NUMERIC = (Mode)localObject1;
    localObject2 = new com/google/zxing/qrcode/decoder/Mode;
    int m = 9;
    int[] tmp101_99 = new int[3];
    int[] tmp102_101 = tmp101_99;
    int[] tmp102_101 = tmp101_99;
    tmp102_101[0] = m;
    tmp102_101[1] = 11;
    tmp102_101[2] = 13;
    Object localObject4 = tmp102_101;
    Object localObject5 = m54207b69.F54207b69_11("4?7E74717A8276707982768087");
    int n = 2;
    ((Mode)localObject2).<init>((String)localObject5, n, (int[])localObject4, n);
    ALPHANUMERIC = (Mode)localObject2;
    localObject4 = new com/google/zxing/qrcode/decoder/Mode;
    int i1 = 3;
    int[] tmp154_152 = new int[3];
    int[] tmp155_154 = tmp154_152;
    int[] tmp155_154 = tmp154_152;
    tmp155_154[0] = 0;
    tmp155_154[1] = 0;
    tmp155_154[2] = 0;
    Object localObject6 = tmp155_154;
    String str = m54207b69.F54207b69_11("n+78807B816C84848076787E7587887C747F");
    ((Mode)localObject4).<init>(str, i1, (int[])localObject6, i1);
    STRUCTURED_APPEND = (Mode)localObject4;
    localObject5 = new com/google/zxing/qrcode/decoder/Mode;
    n = 16;
    int i2 = 8;
    int[] tmp208_206 = new int[3];
    int[] tmp209_208 = tmp208_206;
    int[] tmp209_208 = tmp208_206;
    tmp209_208[0] = i2;
    tmp209_208[1] = n;
    tmp209_208[2] = n;
    localObject6 = tmp209_208;
    Object localObject7 = m54207b69.F54207b69_11("(/6D777D6D");
    int i3 = 4;
    ((Mode)localObject5).<init>((String)localObject7, i3, (int[])localObject6, i3);
    BYTE = (Mode)localObject5;
    localObject6 = new com/google/zxing/qrcode/decoder/Mode;
    int[] tmp260_258 = new int[3];
    int[] tmp261_260 = tmp260_258;
    int[] tmp261_260 = tmp260_258;
    tmp261_260[0] = 0;
    tmp261_260[1] = 0;
    tmp261_260[2] = 0;
    localObject7 = tmp261_260;
    int i4 = 5;
    int i5 = 7;
    ((Mode)localObject6).<init>("ECI", i4, (int[])localObject7, i5);
    ECI = (Mode)localObject6;
    localObject7 = new com/google/zxing/qrcode/decoder/Mode;
    int[] tmp306_304 = new int[3];
    int[] tmp307_306 = tmp306_304;
    int[] tmp307_306 = tmp306_304;
    tmp307_306[0] = i2;
    tmp307_306[1] = i;
    tmp307_306[2] = j;
    Object localObject8 = tmp307_306;
    Object localObject9 = m54207b69.F54207b69_11("D279747E7B7F");
    ((Mode)localObject7).<init>((String)localObject9, 6, (int[])localObject8, i2);
    KANJI = (Mode)localObject7;
    localObject8 = new com/google/zxing/qrcode/decoder/Mode;
    localObject9 = m54207b69.F54207b69_11("[5737C78076E78826E6E6A747086738A708C8B8D");
    int[] tmp361_359 = new int[3];
    int[] tmp362_361 = tmp361_359;
    int[] tmp362_361 = tmp361_359;
    tmp362_361[0] = 0;
    tmp362_361[1] = 0;
    tmp362_361[2] = 0;
    Object localObject10 = tmp362_361;
    ((Mode)localObject8).<init>((String)localObject9, i5, (int[])localObject10, i4);
    FNC1_FIRST_POSITION = (Mode)localObject8;
    localObject10 = new com/google/zxing/qrcode/decoder/Mode;
    localObject9 = m54207b69.F54207b69_11("lh2E272D5C3B4033322F2F3642443449304C323939");
    int[] tmp407_405 = new int[3];
    int[] tmp408_407 = tmp407_405;
    int[] tmp408_407 = tmp407_405;
    tmp408_407[0] = 0;
    tmp408_407[1] = 0;
    tmp408_407[2] = 0;
    Object localObject11 = tmp408_407;
    ((Mode)localObject10).<init>((String)localObject9, i2, (int[])localObject11, m);
    FNC1_SECOND_POSITION = (Mode)localObject10;
    Mode localMode2 = new com/google/zxing/qrcode/decoder/Mode;
    localObject11 = m54207b69.F54207b69_11("[J020C061307");
    int[] tmp453_451 = new int[3];
    int[] tmp454_453 = tmp453_451;
    int[] tmp454_453 = tmp453_451;
    tmp454_453[0] = i2;
    tmp454_453[1] = 10;
    tmp454_453[2] = j;
    localObject9 = tmp454_453;
    localMode2.<init>((String)localObject11, m, (int[])localObject9, 13);
    HANZI = localMode2;
    localObject11 = localObject1;
    localObject1 = localObject2;
    localObject2 = localObject4;
    localObject9 = localObject5;
    localObject3 = localObject7;
    localObject4 = localObject8;
    localObject8 = localObject10;
    localObject5 = localMode2;
    Mode[] tmp520_517 = new Mode[10];
    Mode[] tmp521_520 = tmp520_517;
    Mode[] tmp521_520 = tmp520_517;
    tmp521_520[0] = localMode1;
    tmp521_520[1] = localObject11;
    Mode[] tmp529_521 = tmp521_520;
    Mode[] tmp529_521 = tmp521_520;
    tmp529_521[2] = localObject1;
    tmp529_521[3] = localObject2;
    Mode[] tmp536_529 = tmp529_521;
    Mode[] tmp536_529 = tmp529_521;
    tmp536_529[4] = localObject9;
    tmp536_529[5] = localObject6;
    Mode[] tmp545_536 = tmp536_529;
    Mode[] tmp545_536 = tmp536_529;
    tmp545_536[6] = localObject7;
    tmp545_536[7] = localObject4;
    tmp545_536[8] = localObject10;
    Mode[] tmp561_545 = tmp545_536;
    tmp561_545[9] = localMode2;
  }
  
  private Mode(int[] paramArrayOfInt, int paramInt)
  {
    this.characterCountBitsForVersions = paramArrayOfInt;
    this.bits = paramInt;
  }
  
  public static Mode forBits(int paramInt)
  {
    if (paramInt != 0)
    {
      int i = 1;
      if (paramInt != i)
      {
        i = 2;
        if (paramInt != i)
        {
          i = 3;
          if (paramInt != i)
          {
            i = 4;
            if (paramInt != i)
            {
              i = 5;
              if (paramInt != i)
              {
                i = 7;
                if (paramInt != i)
                {
                  i = 8;
                  if (paramInt != i)
                  {
                    i = 9;
                    if (paramInt != i)
                    {
                      i = 13;
                      if (paramInt == i) {
                        return HANZI;
                      }
                      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
                      localIllegalArgumentException.<init>();
                      throw localIllegalArgumentException;
                    }
                    return FNC1_SECOND_POSITION;
                  }
                  return KANJI;
                }
                return ECI;
              }
              return FNC1_FIRST_POSITION;
            }
            return BYTE;
          }
          return STRUCTURED_APPEND;
        }
        return ALPHANUMERIC;
      }
      return NUMERIC;
    }
    return TERMINATOR;
  }
  
  public int getBits()
  {
    return this.bits;
  }
  
  public int getCharacterCountBits(Version paramVersion)
  {
    int i = paramVersion.getVersionNumber();
    int j = 9;
    if (i <= j)
    {
      i = 0;
      paramVersion = null;
    }
    else
    {
      j = 26;
      if (i <= j) {
        i = 1;
      } else {
        i = 2;
      }
    }
    return this.characterCountBitsForVersions[i];
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.qrcode.decoder.Mode
 * JD-Core Version:    0.7.0.1
 */
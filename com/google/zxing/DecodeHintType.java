package com.google.zxing;

import java.util.List;
import m54207b69;

public enum DecodeHintType
{
  private final Class valueType;
  
  static
  {
    DecodeHintType localDecodeHintType1 = new com/google/zxing/DecodeHintType;
    Object localObject1 = m54207b69.F54207b69_11("3N011B080E20");
    localDecodeHintType1.<init>((String)localObject1, 0, Object.class);
    OTHER = localDecodeHintType1;
    DecodeHintType localDecodeHintType2 = new com/google/zxing/DecodeHintType;
    Object localObject2 = m54207b69.F54207b69_11("[B1218120A2105091709161012");
    Object localObject3 = Void.class;
    localDecodeHintType2.<init>((String)localObject2, 1, (Class)localObject3);
    PURE_BARCODE = localDecodeHintType2;
    localObject2 = new com/google/zxing/DecodeHintType;
    Object localObject4 = m54207b69.F54207b69_11("Q;6B756A6B767E7D856C867E7482877D77");
    ((DecodeHintType)localObject2).<init>((String)localObject4, 2, List.class);
    POSSIBLE_FORMATS = (DecodeHintType)localObject2;
    localObject1 = new com/google/zxing/DecodeHintType;
    Object localObject5 = m54207b69.F54207b69_11("2m39403635293145303048");
    ((DecodeHintType)localObject1).<init>((String)localObject5, 3, (Class)localObject3);
    TRY_HARDER = (DecodeHintType)localObject1;
    localObject5 = new com/google/zxing/DecodeHintType;
    Object localObject6 = m54207b69.F54207b69_11("^'647068786A6979697D817E6D7F");
    ((DecodeHintType)localObject5).<init>((String)localObject6, 4, String.class);
    CHARACTER_SET = (DecodeHintType)localObject5;
    localObject4 = new com/google/zxing/DecodeHintType;
    Object localObject7 = m54207b69.F54207b69_11("^0717D7E826B7A7A76847E8882708571");
    Object localObject8 = [I.class;
    ((DecodeHintType)localObject4).<init>((String)localObject7, 5, (Class)localObject8);
    ALLOWED_LENGTHS = (DecodeHintType)localObject4;
    localObject7 = new com/google/zxing/DecodeHintType;
    localObject6 = m54207b69.F54207b69_11("6V170607061F180F1C211B1D14717C17242E2427301D273528371B");
    ((DecodeHintType)localObject7).<init>((String)localObject6, 6, (Class)localObject3);
    ASSUME_CODE_39_CHECK_DIGIT = (DecodeHintType)localObject7;
    localObject6 = new com/google/zxing/DecodeHintType;
    Object localObject9 = m54207b69.F54207b69_11("\\7766566657E776E776C0F");
    ((DecodeHintType)localObject6).<init>((String)localObject9, 7, (Class)localObject3);
    ASSUME_GS1 = (DecodeHintType)localObject6;
    localObject9 = new com/google/zxing/DecodeHintType;
    Object localObject10 = m54207b69.F54207b69_11("D`322636383633452A372D2B2D2D3F4D4244324447533A443B");
    ((DecodeHintType)localObject9).<init>((String)localObject10, 8, (Class)localObject3);
    RETURN_CODABAR_START_END = (DecodeHintType)localObject9;
    localObject10 = new com/google/zxing/DecodeHintType;
    String str = m54207b69.F54207b69_11(",\\121A1B1B07131F161119120E1820232118143130242534343730");
    ((DecodeHintType)localObject10).<init>(str, 9, ResultPointCallback.class);
    NEED_RESULT_POINT_CALLBACK = (DecodeHintType)localObject10;
    DecodeHintType localDecodeHintType3 = new com/google/zxing/DecodeHintType;
    Object localObject11 = m54207b69.F54207b69_11("BJ0B0708082114141C17140E201B1F2C1E142A1518182E");
    localDecodeHintType3.<init>((String)localObject11, 10, (Class)localObject8);
    ALLOWED_EAN_EXTENSIONS = localDecodeHintType3;
    localObject11 = new com/google/zxing/DecodeHintType;
    localObject8 = m54207b69.F54207b69_11(")'666C766B7C736F786A7E7D6D6F");
    ((DecodeHintType)localObject11).<init>((String)localObject8, 11, (Class)localObject3);
    ALSO_INVERTED = (DecodeHintType)localObject11;
    localObject3 = localObject5;
    localObject5 = localObject4;
    localObject4 = localObject7;
    localObject7 = localObject6;
    localObject6 = localObject9;
    localObject8 = localObject10;
    localObject9 = localDecodeHintType3;
    localObject10 = localObject11;
    DecodeHintType[] tmp359_356 = new DecodeHintType[12];
    DecodeHintType[] tmp360_359 = tmp359_356;
    DecodeHintType[] tmp360_359 = tmp359_356;
    tmp360_359[0] = localDecodeHintType1;
    tmp360_359[1] = localDecodeHintType2;
    DecodeHintType[] tmp367_360 = tmp360_359;
    DecodeHintType[] tmp367_360 = tmp360_359;
    tmp367_360[2] = localObject2;
    tmp367_360[3] = localObject1;
    DecodeHintType[] tmp374_367 = tmp367_360;
    DecodeHintType[] tmp374_367 = tmp367_360;
    tmp374_367[4] = localObject3;
    tmp374_367[5] = localObject5;
    DecodeHintType[] tmp383_374 = tmp374_367;
    DecodeHintType[] tmp383_374 = tmp374_367;
    tmp383_374[6] = localObject4;
    tmp383_374[7] = localObject7;
    DecodeHintType[] tmp394_383 = tmp383_374;
    DecodeHintType[] tmp394_383 = tmp383_374;
    tmp394_383[8] = localObject6;
    tmp394_383[9] = localObject8;
    tmp394_383[10] = localDecodeHintType3;
    DecodeHintType[] tmp410_394 = tmp394_383;
    tmp410_394[11] = localObject11;
  }
  
  private DecodeHintType(Class paramClass)
  {
    this.valueType = paramClass;
  }
  
  public Class getValueType()
  {
    return this.valueType;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.DecodeHintType
 * JD-Core Version:    0.7.0.1
 */
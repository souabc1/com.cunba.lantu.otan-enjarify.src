package com.google.zxing.common.reedsolomon;

import java.util.ArrayList;
import java.util.List;
import m54207b69;

public final class ReedSolomonEncoder
{
  private final List cachedGenerators;
  private final GenericGF field;
  
  public ReedSolomonEncoder(GenericGF paramGenericGF)
  {
    this.field = paramGenericGF;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.cachedGenerators = localArrayList;
    GenericGFPoly localGenericGFPoly = new com/google/zxing/common/reedsolomon/GenericGFPoly;
    int[] arrayOfInt = { 1 };
    localGenericGFPoly.<init>(paramGenericGF, arrayOfInt);
    localArrayList.add(localGenericGFPoly);
  }
  
  private GenericGFPoly buildGenerator(int paramInt)
  {
    Object localObject1 = this.cachedGenerators;
    int i = ((List)localObject1).size();
    if (paramInt >= i)
    {
      localObject1 = this.cachedGenerators;
      int j = ((List)localObject1).size();
      int k = 1;
      j -= k;
      localObject1 = (GenericGFPoly)((List)localObject1).get(j);
      List localList = this.cachedGenerators;
      j = localList.size();
      while (j <= paramInt)
      {
        Object localObject2 = new com/google/zxing/common/reedsolomon/GenericGFPoly;
        GenericGF localGenericGF = this.field;
        int m = j + -1;
        int n = localGenericGF.getGeneratorBase();
        m += n;
        m = localGenericGF.exp(m);
        int[] arrayOfInt = { k, m };
        ((GenericGFPoly)localObject2).<init>(localGenericGF, arrayOfInt);
        localObject1 = ((GenericGFPoly)localObject1).multiply((GenericGFPoly)localObject2);
        localObject2 = this.cachedGenerators;
        ((List)localObject2).add(localObject1);
        j += 1;
      }
    }
    return (GenericGFPoly)this.cachedGenerators.get(paramInt);
  }
  
  public void encode(int[] paramArrayOfInt, int paramInt)
  {
    if (paramInt != 0)
    {
      int i = paramArrayOfInt.length - paramInt;
      if (i > 0)
      {
        Object localObject = buildGenerator(paramInt);
        int[] arrayOfInt = new int[i];
        System.arraycopy(paramArrayOfInt, 0, arrayOfInt, 0, i);
        GenericGFPoly localGenericGFPoly = new com/google/zxing/common/reedsolomon/GenericGFPoly;
        GenericGF localGenericGF = this.field;
        localGenericGFPoly.<init>(localGenericGF, arrayOfInt);
        int j = 1;
        localGenericGFPoly = localGenericGFPoly.multiplyByMonomial(paramInt, j);
        localObject = localGenericGFPoly.divide(localObject)[j].getCoefficients();
        j = localObject.length;
        paramInt -= j;
        j = 0;
        arrayOfInt = null;
        while (j < paramInt)
        {
          int k = i + j;
          paramArrayOfInt[k] = 0;
          j += 1;
        }
        i += paramInt;
        paramInt = localObject.length;
        System.arraycopy(localObject, 0, paramArrayOfInt, i, paramInt);
        return;
      }
      paramArrayOfInt = new java/lang/IllegalArgumentException;
      str = m54207b69.F54207b69_11("a?7151215E62506426654F5565582C5D5C605A686E6E70");
      paramArrayOfInt.<init>(str);
      throw paramArrayOfInt;
    }
    paramArrayOfInt = new java/lang/IllegalArgumentException;
    String str = m54207b69.F54207b69_11("Yd2A0C46041A1B111D4C101521220E151F1D1C1C571A3226182F");
    paramArrayOfInt.<init>(str);
    throw paramArrayOfInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.zxing.common.reedsolomon.ReedSolomonEncoder
 * JD-Core Version:    0.7.0.1
 */
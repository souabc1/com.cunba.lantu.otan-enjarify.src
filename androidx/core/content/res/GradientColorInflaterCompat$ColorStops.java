package androidx.core.content.res;

import java.util.List;

final class GradientColorInflaterCompat$ColorStops
{
  public final int[] OooO00o;
  public final float[] OooO0O0;
  
  public GradientColorInflaterCompat$ColorStops(int paramInt1, int paramInt2)
  {
    Object localObject = { paramInt1, paramInt2 };
    this.OooO00o = ((int[])localObject);
    localObject = new float[2];
    Object tmp26_25 = localObject;
    tmp26_25[0] = 0.0F;
    tmp26_25[1] = 1.0F;
    this.OooO0O0 = ((float[])localObject);
  }
  
  public GradientColorInflaterCompat$ColorStops(int paramInt1, int paramInt2, int paramInt3)
  {
    int[] tmp7_5 = new int[3];
    int[] tmp8_7 = tmp7_5;
    int[] tmp8_7 = tmp7_5;
    tmp8_7[0] = paramInt1;
    tmp8_7[1] = paramInt2;
    tmp8_7[2] = paramInt3;
    Object localObject = tmp8_7;
    this.OooO00o = ((int[])localObject);
    localObject = new float[3];
    Object tmp33_31 = localObject;
    tmp33_31[0] = 0.0F;
    Object tmp37_33 = tmp33_31;
    tmp37_33[1] = 0.5F;
    tmp37_33[2] = 1.0F;
    this.OooO0O0 = ((float[])localObject);
  }
  
  public GradientColorInflaterCompat$ColorStops(List paramList1, List paramList2)
  {
    int i = paramList1.size();
    Object localObject1 = new int[i];
    this.OooO00o = ((int[])localObject1);
    localObject1 = new float[i];
    this.OooO0O0 = ((float[])localObject1);
    int j = 0;
    localObject1 = null;
    while (j < i)
    {
      Object localObject2 = this.OooO00o;
      int k = ((Integer)paramList1.get(j)).intValue();
      localObject2[j] = k;
      localObject2 = this.OooO0O0;
      Float localFloat = (Float)paramList2.get(j);
      float f = localFloat.floatValue();
      localObject2[j] = f;
      j += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.res.GradientColorInflaterCompat.ColorStops
 * JD-Core Version:    0.7.0.1
 */
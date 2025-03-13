package androidx.constraintlayout.core.motion.utils;

public class TimeCycleSplineSet$Sort
{
  public static void OooO00o(int[] paramArrayOfInt, float[][] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfInt.length + 10;
    int[] arrayOfInt = new int[i];
    int j = 0;
    arrayOfInt[0] = paramInt2;
    paramInt2 = 1;
    arrayOfInt[paramInt2] = paramInt1;
    paramInt1 = 2;
    while (paramInt1 > 0)
    {
      paramInt1 += -1;
      j = arrayOfInt[paramInt1];
      paramInt1 += -1;
      int k = arrayOfInt[paramInt1];
      if (j < k)
      {
        int m = OooO0O0(paramArrayOfInt, paramArrayOfFloat, j, k);
        int n = paramInt1 + 1;
        int i1 = m + -1;
        arrayOfInt[paramInt1] = i1;
        paramInt1 = n + 1;
        arrayOfInt[n] = j;
        j = paramInt1 + 1;
        arrayOfInt[paramInt1] = k;
        paramInt1 = j + 1;
        m += paramInt2;
        arrayOfInt[j] = m;
      }
    }
  }
  
  public static int OooO0O0(int[] paramArrayOfInt, float[][] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfInt[paramInt2];
    int j = paramInt1;
    while (paramInt1 < paramInt2)
    {
      int k = paramArrayOfInt[paramInt1];
      if (k <= i)
      {
        OooO0OO(paramArrayOfInt, paramArrayOfFloat, j, paramInt1);
        j += 1;
      }
      paramInt1 += 1;
    }
    OooO0OO(paramArrayOfInt, paramArrayOfFloat, j, paramInt2);
    return j;
  }
  
  public static void OooO0OO(int[] paramArrayOfInt, float[][] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfInt[paramInt1];
    int j = paramArrayOfInt[paramInt2];
    paramArrayOfInt[paramInt1] = j;
    paramArrayOfInt[paramInt2] = i;
    paramArrayOfInt = paramArrayOfFloat[paramInt1];
    float[] arrayOfFloat = paramArrayOfFloat[paramInt2];
    paramArrayOfFloat[paramInt1] = arrayOfFloat;
    paramArrayOfFloat[paramInt2] = paramArrayOfInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet.Sort
 * JD-Core Version:    0.7.0.1
 */
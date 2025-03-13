package androidx.core.math;

public class MathUtils
{
  public static float OooO00o(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool1 = paramFloat1 < paramFloat2;
    if (bool1) {
      return paramFloat2;
    }
    boolean bool2 = paramFloat1 < paramFloat3;
    if (bool2) {
      return paramFloat3;
    }
    return paramFloat1;
  }
  
  public static int OooO0O0(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 < paramInt2) {
      return paramInt2;
    }
    if (paramInt1 > paramInt3) {
      return paramInt3;
    }
    return paramInt1;
  }
  
  public static long OooO0OO(long paramLong1, long paramLong2, long paramLong3)
  {
    boolean bool1 = paramLong1 < paramLong2;
    if (bool1) {
      return paramLong2;
    }
    boolean bool2 = paramLong1 < paramLong3;
    if (bool2) {
      return paramLong3;
    }
    return paramLong1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.math.MathUtils
 * JD-Core Version:    0.7.0.1
 */
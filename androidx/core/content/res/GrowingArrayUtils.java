package androidx.core.content.res;

import java.lang.reflect.Array;

final class GrowingArrayUtils
{
  public static int[] OooO00o(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = paramInt1 + 1;
    int j = paramArrayOfInt.length;
    if (i > j)
    {
      i = OooO0OO(paramInt1);
      int[] arrayOfInt = new int[i];
      j = 0;
      System.arraycopy(paramArrayOfInt, 0, arrayOfInt, 0, paramInt1);
      paramArrayOfInt = arrayOfInt;
    }
    paramArrayOfInt[paramInt1] = paramInt2;
    return paramArrayOfInt;
  }
  
  public static Object[] OooO0O0(Object[] paramArrayOfObject, int paramInt, Object paramObject)
  {
    int i = paramInt + 1;
    int j = paramArrayOfObject.length;
    if (i > j)
    {
      Object localObject = paramArrayOfObject.getClass().getComponentType();
      j = OooO0OO(paramInt);
      localObject = (Object[])Array.newInstance((Class)localObject, j);
      j = 0;
      System.arraycopy(paramArrayOfObject, 0, localObject, 0, paramInt);
      paramArrayOfObject = (Object[])localObject;
    }
    paramArrayOfObject[paramInt] = paramObject;
    return paramArrayOfObject;
  }
  
  public static int OooO0OO(int paramInt)
  {
    int i = 4;
    if (paramInt <= i) {
      paramInt = 8;
    } else {
      paramInt *= 2;
    }
    return paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.res.GrowingArrayUtils
 * JD-Core Version:    0.7.0.1
 */
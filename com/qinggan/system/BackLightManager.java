package com.qinggan.system;

import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import java.util.List;

public class BackLightManager
{
  public static BackLightManager OooO0o;
  public static int[] OooO0o0 = tmp4_3;
  public static SystemPolicyManager OooO0oO;
  public static boolean OooO0oo = false;
  public final List OooO00o;
  public Context OooO0O0;
  public Handler OooO0OO;
  public SparseArray OooO0Oo;
  
  static
  {
    int[] tmp3_1 = new int[3];
    int[] tmp4_3 = tmp3_1;
    int[] tmp4_3 = tmp3_1;
    tmp4_3[0] = 1;
    tmp4_3[1] = 2;
    tmp4_3[2] = 16;
  }
  
  public final void OooO0oO()
  {
    int[] arrayOfInt1 = OooO0o0;
    int i = arrayOfInt1.length;
    int j = 0;
    while (j < i)
    {
      int k = arrayOfInt1[j];
      SystemPolicyManager localSystemPolicyManager = OooO0oO;
      IBackLightCallback localIBackLightCallback = (IBackLightCallback)this.OooO0Oo.get(k);
      int[] arrayOfInt2 = { k };
      localSystemPolicyManager.OooOO0o(localIBackLightCallback, arrayOfInt2);
      j += 1;
    }
    OooO0oo = true;
  }
  
  public int getBackLight()
  {
    SystemPolicyManager localSystemPolicyManager = OooO0oO;
    int[] arrayOfInt = { 1 };
    return localSystemPolicyManager.OooOO0(arrayOfInt);
  }
  
  public int getBackLight(int paramInt)
  {
    SystemPolicyManager localSystemPolicyManager = OooO0oO;
    int[] arrayOfInt = { paramInt };
    return localSystemPolicyManager.OooOO0(arrayOfInt);
  }
  
  public int getDimmer()
  {
    SystemPolicyManager localSystemPolicyManager = OooO0oO;
    int[] arrayOfInt = { 1 };
    return localSystemPolicyManager.OooOO0O(arrayOfInt);
  }
  
  public int getDimmer(int paramInt)
  {
    SystemPolicyManager localSystemPolicyManager = OooO0oO;
    int[] arrayOfInt = { paramInt };
    return localSystemPolicyManager.OooOO0O(arrayOfInt);
  }
  
  public void setBackLight(int paramInt)
  {
    SystemPolicyManager localSystemPolicyManager = OooO0oO;
    int[] arrayOfInt = { 1 };
    localSystemPolicyManager.OooOOO(paramInt, 0, arrayOfInt);
  }
  
  public void setDimmer(int paramInt)
  {
    SystemPolicyManager localSystemPolicyManager = OooO0oO;
    int[] arrayOfInt = { 1 };
    localSystemPolicyManager.OooOOOO(paramInt, 0, arrayOfInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.BackLightManager
 * JD-Core Version:    0.7.0.1
 */
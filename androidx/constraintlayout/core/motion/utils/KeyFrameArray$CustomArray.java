package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import java.util.Arrays;

public class KeyFrameArray$CustomArray
{
  public int[] OooO00o;
  public CustomAttribute[] OooO0O0;
  public int OooO0OO;
  
  public KeyFrameArray$CustomArray()
  {
    int i = 101;
    int[] arrayOfInt = new int[i];
    this.OooO00o = arrayOfInt;
    CustomAttribute[] arrayOfCustomAttribute = new CustomAttribute[i];
    this.OooO0O0 = arrayOfCustomAttribute;
    OooO0O0();
  }
  
  public void OooO00o(int paramInt, CustomAttribute paramCustomAttribute)
  {
    CustomAttribute localCustomAttribute = this.OooO0O0[paramInt];
    if (localCustomAttribute != null) {
      OooO0Oo(paramInt);
    }
    this.OooO0O0[paramInt] = paramCustomAttribute;
    paramCustomAttribute = this.OooO00o;
    int i = this.OooO0OO;
    int j = i + 1;
    this.OooO0OO = j;
    paramCustomAttribute[i] = paramInt;
    Arrays.sort(paramCustomAttribute);
  }
  
  public void OooO0O0()
  {
    Arrays.fill(this.OooO00o, 999);
    Arrays.fill(this.OooO0O0, null);
    this.OooO0OO = 0;
  }
  
  public int OooO0OO(int paramInt)
  {
    return this.OooO00o[paramInt];
  }
  
  public void OooO0Oo(int paramInt)
  {
    this.OooO0O0[paramInt] = null;
    int i = 0;
    int j = 0;
    int k;
    for (;;)
    {
      k = this.OooO0OO;
      if (i >= k) {
        break;
      }
      int[] arrayOfInt = this.OooO00o;
      int m = arrayOfInt[i];
      if (paramInt == m)
      {
        m = 999;
        arrayOfInt[i] = m;
        j += 1;
      }
      if (i != j)
      {
        m = arrayOfInt[j];
        arrayOfInt[i] = m;
      }
      j += 1;
      i += 1;
    }
    k += -1;
    this.OooO0OO = k;
  }
  
  public CustomAttribute OooO0o(int paramInt)
  {
    CustomAttribute[] arrayOfCustomAttribute = this.OooO0O0;
    paramInt = this.OooO00o[paramInt];
    return arrayOfCustomAttribute[paramInt];
  }
  
  public int OooO0o0()
  {
    return this.OooO0OO;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomArray
 * JD-Core Version:    0.7.0.1
 */
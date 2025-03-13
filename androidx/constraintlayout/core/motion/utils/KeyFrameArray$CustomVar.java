package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomVariable;
import java.util.Arrays;

public class KeyFrameArray$CustomVar
{
  public int[] OooO00o;
  public CustomVariable[] OooO0O0;
  public int OooO0OO;
  
  public KeyFrameArray$CustomVar()
  {
    int i = 101;
    int[] arrayOfInt = new int[i];
    this.OooO00o = arrayOfInt;
    CustomVariable[] arrayOfCustomVariable = new CustomVariable[i];
    this.OooO0O0 = arrayOfCustomVariable;
    OooO0O0();
  }
  
  public void OooO00o(int paramInt, CustomVariable paramCustomVariable)
  {
    CustomVariable localCustomVariable = this.OooO0O0[paramInt];
    if (localCustomVariable != null) {
      OooO0Oo(paramInt);
    }
    this.OooO0O0[paramInt] = paramCustomVariable;
    paramCustomVariable = this.OooO00o;
    int i = this.OooO0OO;
    int j = i + 1;
    this.OooO0OO = j;
    paramCustomVariable[i] = paramInt;
    Arrays.sort(paramCustomVariable);
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
  
  public CustomVariable OooO0o(int paramInt)
  {
    CustomVariable[] arrayOfCustomVariable = this.OooO0O0;
    paramInt = this.OooO00o[paramInt];
    return arrayOfCustomVariable[paramInt];
  }
  
  public int OooO0o0()
  {
    return this.OooO0OO;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.core.motion.utils.KeyFrameArray.CustomVar
 * JD-Core Version:    0.7.0.1
 */
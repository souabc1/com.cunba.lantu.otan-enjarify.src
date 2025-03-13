package androidx.appcompat.app;

import android.content.res.Configuration;

class AppCompatDelegateImpl$Api26Impl
{
  public static void OooO00o(Configuration paramConfiguration1, Configuration paramConfiguration2, Configuration paramConfiguration3)
  {
    int i = paramConfiguration1.colorMode & 0x3;
    int j = paramConfiguration2.colorMode;
    int k = j & 0x3;
    if (i != k)
    {
      i = paramConfiguration3.colorMode;
      j &= 0x3;
      i |= j;
      paramConfiguration3.colorMode = i;
    }
    int m = paramConfiguration1.colorMode & 0xC;
    int n = paramConfiguration2.colorMode;
    i = n & 0xC;
    if (m != i)
    {
      m = paramConfiguration3.colorMode;
      n &= 0xC;
      m |= n;
      paramConfiguration3.colorMode = m;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.Api26Impl
 * JD-Core Version:    0.7.0.1
 */
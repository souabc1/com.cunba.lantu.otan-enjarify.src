package com.qinggan.system;

import android.os.BaseBundle;
import android.os.Bundle;
import m54207b69;

public class RestoreInfo
{
  public boolean OooO00o;
  public String OooO0O0;
  public String OooO0OO;
  public int OooO0Oo;
  
  public RestoreInfo(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      String str = m54207b69.F54207b69_11(";o1F0F0E07120D10");
      str = paramBundle.getString(str);
      this.OooO0OO = str;
      str = m54207b69.F54207b69_11("g;5855584E585A645C57");
      str = paramBundle.getString(str);
      this.OooO0O0 = str;
      str = m54207b69.F54207b69_11("aq1005171B22");
      boolean bool = paramBundle.getBoolean(str);
      this.OooO00o = bool;
      str = m54207b69.F54207b69_11("J)5D515B4F");
      int i = paramBundle.getInt(str);
      this.OooO0Oo = i;
    }
  }
  
  public String getCompnentName()
  {
    return this.OooO0O0;
  }
  
  public String getPackageName()
  {
    return this.OooO0OO;
  }
  
  public int getType()
  {
    return this.OooO0Oo;
  }
  
  public boolean isAudio()
  {
    return this.OooO00o;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.system.RestoreInfo
 * JD-Core Version:    0.7.0.1
 */
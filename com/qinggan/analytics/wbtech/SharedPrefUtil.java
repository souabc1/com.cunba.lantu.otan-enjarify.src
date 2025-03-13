package com.qinggan.analytics.wbtech;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import m54207b69;

public class SharedPrefUtil
{
  public SharedPreferences.Editor OooO00o = null;
  public SharedPreferences OooO0O0 = null;
  
  public SharedPrefUtil(Context paramContext)
  {
    String str = m54207b69.F54207b69_11("dG04292735291A2C44303E221F3B3343313328473535");
    paramContext = paramContext.getSharedPreferences(str, 0);
    this.OooO0O0 = paramContext;
    paramContext = paramContext.edit();
    this.OooO00o = paramContext;
  }
  
  public long OooO00o(String paramString, long paramLong)
  {
    return this.OooO0O0.getLong(paramString, paramLong);
  }
  
  public Boolean OooO0O0(String paramString, Boolean paramBoolean)
  {
    SharedPreferences localSharedPreferences = this.OooO0O0;
    boolean bool = paramBoolean.booleanValue();
    return Boolean.valueOf(localSharedPreferences.getBoolean(paramString, bool));
  }
  
  public String OooO0OO(String paramString1, String paramString2)
  {
    return this.OooO0O0.getString(paramString1, paramString2);
  }
  
  public void OooO0Oo(String paramString, long paramLong)
  {
    this.OooO00o.putLong(paramString, paramLong);
    this.OooO00o.commit();
  }
  
  public void OooO0o(String paramString1, String paramString2)
  {
    this.OooO00o.putString(paramString1, paramString2);
    this.OooO00o.commit();
  }
  
  public void OooO0o0(String paramString, Boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = this.OooO00o;
    boolean bool = paramBoolean.booleanValue();
    localEditor.putBoolean(paramString, bool);
    this.OooO00o.commit();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.qinggan.analytics.wbtech.SharedPrefUtil
 * JD-Core Version:    0.7.0.1
 */
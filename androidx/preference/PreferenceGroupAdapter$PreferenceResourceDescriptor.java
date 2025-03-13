package androidx.preference;

import android.text.TextUtils;

class PreferenceGroupAdapter$PreferenceResourceDescriptor
{
  public int OooO00o;
  public int OooO0O0;
  public String OooO0OO;
  
  public PreferenceGroupAdapter$PreferenceResourceDescriptor(Preference paramPreference)
  {
    String str = paramPreference.getClass().getName();
    this.OooO0OO = str;
    int i = paramPreference.getLayoutResource();
    this.OooO00o = i;
    int j = paramPreference.getWidgetLayoutResource();
    this.OooO0O0 = j;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof PreferenceResourceDescriptor;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (PreferenceResourceDescriptor)paramObject;
    int i = this.OooO00o;
    int j = paramObject.OooO00o;
    if (i == j)
    {
      i = this.OooO0O0;
      j = paramObject.OooO0O0;
      if (i == j)
      {
        String str = this.OooO0OO;
        paramObject = paramObject.OooO0OO;
        boolean bool3 = TextUtils.equals(str, paramObject);
        if (bool3) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public int hashCode()
  {
    int i = this.OooO00o;
    int j = (527 + i) * 31;
    i = this.OooO0O0;
    j = (j + i) * 31;
    i = this.OooO0OO.hashCode();
    return j + i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.preference.PreferenceGroupAdapter.PreferenceResourceDescriptor
 * JD-Core Version:    0.7.0.1
 */
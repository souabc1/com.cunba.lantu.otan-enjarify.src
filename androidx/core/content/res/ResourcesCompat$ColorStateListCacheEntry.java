package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;

class ResourcesCompat$ColorStateListCacheEntry
{
  public final ColorStateList OooO00o;
  public final Configuration OooO0O0;
  public final int OooO0OO;
  
  public ResourcesCompat$ColorStateListCacheEntry(ColorStateList paramColorStateList, Configuration paramConfiguration, Resources.Theme paramTheme)
  {
    this.OooO00o = paramColorStateList;
    this.OooO0O0 = paramConfiguration;
    int i;
    if (paramTheme == null)
    {
      i = 0;
      paramColorStateList = null;
    }
    else
    {
      i = paramTheme.hashCode();
    }
    this.OooO0OO = i;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry
 * JD-Core Version:    0.7.0.1
 */
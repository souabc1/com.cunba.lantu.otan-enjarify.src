package androidx.core.content.pm;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.UserHandle;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Arrays;
import java.util.Set;

public class ShortcutInfoCompat
{
  public Set OooO;
  public String OooO00o;
  public String OooO0O0;
  public Intent[] OooO0OO;
  public ComponentName OooO0Oo;
  public CharSequence OooO0o;
  public CharSequence OooO0o0;
  public CharSequence OooO0oO;
  public IconCompat OooO0oo;
  public LocusIdCompat OooOO0;
  public int OooOO0O;
  public PersistableBundle OooOO0o;
  public long OooOOO;
  public Bundle OooOOO0;
  public UserHandle OooOOOO;
  public boolean OooOOOo;
  public boolean OooOOo;
  public boolean OooOOo0;
  public boolean OooOOoo;
  public boolean OooOo0 = true;
  public boolean OooOo00;
  public int OooOo0O;
  public int OooOo0o;
  
  public ComponentName getActivity()
  {
    return this.OooO0Oo;
  }
  
  public Set getCategories()
  {
    return this.OooO;
  }
  
  public CharSequence getDisabledMessage()
  {
    return this.OooO0oO;
  }
  
  public int getDisabledReason()
  {
    return this.OooOo0O;
  }
  
  public int getExcludedFromSurfaces()
  {
    return this.OooOo0o;
  }
  
  public PersistableBundle getExtras()
  {
    return this.OooOO0o;
  }
  
  public IconCompat getIcon()
  {
    return this.OooO0oo;
  }
  
  public String getId()
  {
    return this.OooO00o;
  }
  
  public Intent getIntent()
  {
    Intent[] arrayOfIntent = this.OooO0OO;
    int i = arrayOfIntent.length + -1;
    return arrayOfIntent[i];
  }
  
  public Intent[] getIntents()
  {
    Intent[] arrayOfIntent = this.OooO0OO;
    int i = arrayOfIntent.length;
    return (Intent[])Arrays.copyOf(arrayOfIntent, i);
  }
  
  public long getLastChangedTimestamp()
  {
    return this.OooOOO;
  }
  
  public LocusIdCompat getLocusId()
  {
    return this.OooOO0;
  }
  
  public CharSequence getLongLabel()
  {
    return this.OooO0o;
  }
  
  public String getPackage()
  {
    return this.OooO0O0;
  }
  
  public int getRank()
  {
    return this.OooOO0O;
  }
  
  public CharSequence getShortLabel()
  {
    return this.OooO0o0;
  }
  
  public Bundle getTransientExtras()
  {
    return this.OooOOO0;
  }
  
  public UserHandle getUserHandle()
  {
    return this.OooOOOO;
  }
  
  public boolean isCached()
  {
    return this.OooOOOo;
  }
  
  public boolean isDeclaredInManifest()
  {
    return this.OooOOoo;
  }
  
  public boolean isDynamic()
  {
    return this.OooOOo0;
  }
  
  public boolean isEnabled()
  {
    return this.OooOo0;
  }
  
  public boolean isExcludedFromSurfaces(int paramInt)
  {
    int i = this.OooOo0o;
    paramInt &= i;
    if (paramInt != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    return paramInt;
  }
  
  public boolean isImmutable()
  {
    return this.OooOo00;
  }
  
  public boolean isPinned()
  {
    return this.OooOOo;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.pm.ShortcutInfoCompat
 * JD-Core Version:    0.7.0.1
 */
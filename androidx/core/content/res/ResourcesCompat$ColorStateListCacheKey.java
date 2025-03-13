package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import androidx.core.util.ObjectsCompat;

final class ResourcesCompat$ColorStateListCacheKey
{
  public final Resources OooO00o;
  public final Resources.Theme OooO0O0;
  
  public ResourcesCompat$ColorStateListCacheKey(Resources paramResources, Resources.Theme paramTheme)
  {
    this.OooO00o = paramResources;
    this.OooO0O0 = paramTheme;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    if (paramObject != null)
    {
      Object localObject1 = ColorStateListCacheKey.class;
      Object localObject2 = paramObject.getClass();
      if (localObject1 == localObject2)
      {
        paramObject = (ColorStateListCacheKey)paramObject;
        localObject1 = this.OooO00o;
        localObject2 = paramObject.OooO00o;
        boolean bool2 = localObject1.equals(localObject2);
        if (bool2)
        {
          localObject1 = this.OooO0O0;
          paramObject = paramObject.OooO0O0;
          boolean bool3 = ObjectsCompat.OooO00o(localObject1, paramObject);
          if (bool3) {}
        }
        else
        {
          bool1 = false;
        }
        return bool1;
      }
    }
    return false;
  }
  
  public int hashCode()
  {
    Resources localResources = this.OooO00o;
    Resources.Theme localTheme = this.OooO0O0;
    return ObjectsCompat.OooO0O0(new Object[] { localResources, localTheme });
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey
 * JD-Core Version:    0.7.0.1
 */
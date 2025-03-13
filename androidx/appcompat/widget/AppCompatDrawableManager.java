package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

public final class AppCompatDrawableManager
{
  public static final PorterDuff.Mode OooO0O0 = PorterDuff.Mode.SRC_IN;
  public static AppCompatDrawableManager OooO0OO;
  public ResourceManagerInternal OooO00o;
  
  public static PorterDuffColorFilter OooO0Oo(int paramInt, PorterDuff.Mode paramMode)
  {
    synchronized (AppCompatDrawableManager.class)
    {
      PorterDuffColorFilter localPorterDuffColorFilter = ResourceManagerInternal.OooOO0(paramInt, paramMode);
      return localPorterDuffColorFilter;
    }
  }
  
  public static void OooO0oO()
  {
    synchronized (AppCompatDrawableManager.class)
    {
      Object localObject1 = OooO0OO;
      if (localObject1 == null)
      {
        localObject1 = new androidx/appcompat/widget/AppCompatDrawableManager;
        ((AppCompatDrawableManager)localObject1).<init>();
        OooO0OO = (AppCompatDrawableManager)localObject1;
        Object localObject3 = ResourceManagerInternal.get();
        ((AppCompatDrawableManager)localObject1).OooO00o = ((ResourceManagerInternal)localObject3);
        localObject1 = OooO0OO;
        localObject1 = ((AppCompatDrawableManager)localObject1).OooO00o;
        localObject3 = new androidx/appcompat/widget/AppCompatDrawableManager$1;
        ((AppCompatDrawableManager.1)localObject3).<init>();
        ((ResourceManagerInternal)localObject1).setHooks((ResourceManagerInternal.ResourceManagerHooks)localObject3);
      }
      return;
    }
  }
  
  public static void OooO0oo(Drawable paramDrawable, TintInfo paramTintInfo, int[] paramArrayOfInt)
  {
    ResourceManagerInternal.OooOOoo(paramDrawable, paramTintInfo, paramArrayOfInt);
  }
  
  public static AppCompatDrawableManager get()
  {
    synchronized (AppCompatDrawableManager.class)
    {
      AppCompatDrawableManager localAppCompatDrawableManager2 = OooO0OO;
      if (localAppCompatDrawableManager2 == null) {
        OooO0oO();
      }
      localAppCompatDrawableManager2 = OooO0OO;
      return localAppCompatDrawableManager2;
    }
  }
  
  public Drawable OooO0O0(Context paramContext, int paramInt)
  {
    try
    {
      ResourceManagerInternal localResourceManagerInternal = this.OooO00o;
      paramContext = localResourceManagerInternal.OooO0oo(paramContext, paramInt);
      return paramContext;
    }
    finally {}
  }
  
  public Drawable OooO0OO(Context paramContext, int paramInt, boolean paramBoolean)
  {
    try
    {
      ResourceManagerInternal localResourceManagerInternal = this.OooO00o;
      paramContext = localResourceManagerInternal.OooO(paramContext, paramInt, paramBoolean);
      return paramContext;
    }
    finally {}
  }
  
  public void OooO0o(Context paramContext)
  {
    try
    {
      ResourceManagerInternal localResourceManagerInternal = this.OooO00o;
      localResourceManagerInternal.OooOOOo(paramContext);
      return;
    }
    finally {}
  }
  
  public ColorStateList OooO0o0(Context paramContext, int paramInt)
  {
    try
    {
      ResourceManagerInternal localResourceManagerInternal = this.OooO00o;
      paramContext = localResourceManagerInternal.OooOO0O(paramContext, paramInt);
      return paramContext;
    }
    finally {}
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.AppCompatDrawableManager
 * JD-Core Version:    0.7.0.1
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class TintContextWrapper
  extends ContextWrapper
{
  public static final Object OooO0OO;
  public static ArrayList OooO0Oo;
  public final Resources OooO00o;
  public final Resources.Theme OooO0O0;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooO0OO = localObject;
  }
  
  public TintContextWrapper(Context paramContext)
  {
    super(paramContext);
    boolean bool = VectorEnabledTintResources.OooO00o();
    Object localObject;
    if (bool)
    {
      localObject = new androidx/appcompat/widget/VectorEnabledTintResources;
      Resources localResources = paramContext.getResources();
      ((VectorEnabledTintResources)localObject).<init>(this, localResources);
      this.OooO00o = ((Resources)localObject);
      localObject = ((Resources)localObject).newTheme();
      this.OooO0O0 = ((Resources.Theme)localObject);
      paramContext = paramContext.getTheme();
      ((Resources.Theme)localObject).setTo(paramContext);
    }
    else
    {
      localObject = new androidx/appcompat/widget/TintResources;
      paramContext = paramContext.getResources();
      ((TintResources)localObject).<init>(this, paramContext);
      this.OooO00o = ((Resources)localObject);
      paramContext = null;
      this.OooO0O0 = null;
    }
  }
  
  public static boolean OooO00o(Context paramContext)
  {
    boolean bool1 = paramContext instanceof TintContextWrapper;
    boolean bool2 = false;
    if (!bool1)
    {
      Resources localResources = paramContext.getResources();
      bool1 = localResources instanceof TintResources;
      if (!bool1)
      {
        paramContext = paramContext.getResources();
        boolean bool3 = paramContext instanceof VectorEnabledTintResources;
        if (!bool3)
        {
          bool3 = VectorEnabledTintResources.OooO00o();
          if (bool3) {
            bool2 = true;
          }
        }
      }
    }
    return bool2;
  }
  
  public static Context OooO0O0(Context paramContext)
  {
    boolean bool = OooO00o(paramContext);
    if (bool) {
      synchronized (OooO0OO)
      {
        Object localObject2 = OooO0Oo;
        if (localObject2 == null)
        {
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
          OooO0Oo = (ArrayList)localObject2;
        }
        else
        {
          int i = ((ArrayList)localObject2).size() + -1;
          while (i >= 0)
          {
            localObject3 = OooO0Oo;
            localObject3 = ((ArrayList)localObject3).get(i);
            localObject3 = (WeakReference)localObject3;
            if (localObject3 != null)
            {
              localObject3 = ((Reference)localObject3).get();
              if (localObject3 != null) {}
            }
            else
            {
              localObject3 = OooO0Oo;
              ((ArrayList)localObject3).remove(i);
            }
            i += -1;
          }
          localObject2 = OooO0Oo;
          i = ((ArrayList)localObject2).size() + -1;
          while (i >= 0)
          {
            localObject3 = OooO0Oo;
            localObject3 = ((ArrayList)localObject3).get(i);
            localObject3 = (WeakReference)localObject3;
            if (localObject3 != null)
            {
              localObject3 = ((Reference)localObject3).get();
              localObject3 = (TintContextWrapper)localObject3;
            }
            else
            {
              localObject3 = null;
            }
            if (localObject3 != null)
            {
              Context localContext = ((ContextWrapper)localObject3).getBaseContext();
              if (localContext == paramContext) {
                return localObject3;
              }
            }
            i += -1;
          }
        }
        localObject2 = new androidx/appcompat/widget/TintContextWrapper;
        ((TintContextWrapper)localObject2).<init>(paramContext);
        paramContext = OooO0Oo;
        Object localObject3 = new java/lang/ref/WeakReference;
        ((WeakReference)localObject3).<init>(localObject2);
        paramContext.add(localObject3);
        return localObject2;
      }
    }
    return paramContext;
  }
  
  public AssetManager getAssets()
  {
    return this.OooO00o.getAssets();
  }
  
  public Resources getResources()
  {
    return this.OooO00o;
  }
  
  public Resources.Theme getTheme()
  {
    Resources.Theme localTheme = this.OooO0O0;
    if (localTheme == null) {
      localTheme = super.getTheme();
    }
    return localTheme;
  }
  
  public void setTheme(int paramInt)
  {
    Resources.Theme localTheme = this.OooO0O0;
    if (localTheme == null)
    {
      super.setTheme(paramInt);
    }
    else
    {
      boolean bool = true;
      localTheme.applyStyle(paramInt, bool);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.TintContextWrapper
 * JD-Core Version:    0.7.0.1
 */
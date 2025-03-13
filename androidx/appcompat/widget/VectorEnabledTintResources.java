package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class VectorEnabledTintResources
  extends ResourcesWrapper
{
  public static boolean OooO0OO = false;
  public final WeakReference OooO0O0;
  
  public VectorEnabledTintResources(Context paramContext, Resources paramResources)
  {
    super(paramResources);
    paramResources = new java/lang/ref/WeakReference;
    paramResources.<init>(paramContext);
    this.OooO0O0 = paramResources;
  }
  
  public static boolean OooO00o()
  {
    isCompatVectorFromResourcesEnabled();
    return false;
  }
  
  public static boolean isCompatVectorFromResourcesEnabled()
  {
    return OooO0OO;
  }
  
  public static void setCompatVectorFromResourcesEnabled(boolean paramBoolean)
  {
    OooO0OO = paramBoolean;
  }
  
  public Drawable getDrawable(int paramInt)
  {
    Context localContext = (Context)this.OooO0O0.get();
    if (localContext != null) {
      return ResourceManagerInternal.get().OooOOo0(localContext, this, paramInt);
    }
    return getDrawableCanonical(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.VectorEnabledTintResources
 * JD-Core Version:    0.7.0.1
 */
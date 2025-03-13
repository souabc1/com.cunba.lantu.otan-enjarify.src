package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

class TintResources
  extends ResourcesWrapper
{
  public final WeakReference OooO0O0;
  
  public TintResources(Context paramContext, Resources paramResources)
  {
    super(paramResources);
    paramResources = new java/lang/ref/WeakReference;
    paramResources.<init>(paramContext);
    this.OooO0O0 = paramResources;
  }
  
  public Drawable getDrawable(int paramInt)
  {
    Drawable localDrawable = getDrawableCanonical(paramInt);
    Context localContext = (Context)this.OooO0O0.get();
    if ((localDrawable != null) && (localContext != null))
    {
      ResourceManagerInternal localResourceManagerInternal = ResourceManagerInternal.get();
      localResourceManagerInternal.OooOo00(localContext, paramInt, localDrawable);
    }
    return localDrawable;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.TintResources
 * JD-Core Version:    0.7.0.1
 */
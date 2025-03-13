package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.appcompat.resources.R.drawable;
import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class ResourceManagerInternal
{
  public static ResourceManagerInternal OooO;
  public static final PorterDuff.Mode OooO0oo = PorterDuff.Mode.SRC_IN;
  public static final ResourceManagerInternal.ColorFilterLruCache OooOO0;
  public WeakHashMap OooO00o;
  public SimpleArrayMap OooO0O0;
  public SparseArrayCompat OooO0OO;
  public final WeakHashMap OooO0Oo;
  public boolean OooO0o;
  public TypedValue OooO0o0;
  public ResourceManagerInternal.ResourceManagerHooks OooO0oO;
  
  static
  {
    ResourceManagerInternal.ColorFilterLruCache localColorFilterLruCache = new androidx/appcompat/widget/ResourceManagerInternal$ColorFilterLruCache;
    localColorFilterLruCache.<init>(6);
    OooOO0 = localColorFilterLruCache;
  }
  
  public ResourceManagerInternal()
  {
    WeakHashMap localWeakHashMap = new java/util/WeakHashMap;
    localWeakHashMap.<init>(0);
    this.OooO0Oo = localWeakHashMap;
  }
  
  public static long OooO0Oo(TypedValue paramTypedValue)
  {
    long l1 = paramTypedValue.assetCookie << 32;
    long l2 = paramTypedValue.data;
    return l1 | l2;
  }
  
  public static PorterDuffColorFilter OooO0o(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, int[] paramArrayOfInt)
  {
    if ((paramColorStateList != null) && (paramMode != null)) {
      return OooOO0(paramColorStateList.getColorForState(paramArrayOfInt, 0), paramMode);
    }
    return null;
  }
  
  public static PorterDuffColorFilter OooOO0(int paramInt, PorterDuff.Mode paramMode)
  {
    synchronized (ResourceManagerInternal.class)
    {
      ResourceManagerInternal.ColorFilterLruCache localColorFilterLruCache = OooOO0;
      PorterDuffColorFilter localPorterDuffColorFilter = localColorFilterLruCache.OooO(paramInt, paramMode);
      if (localPorterDuffColorFilter == null)
      {
        localPorterDuffColorFilter = new android/graphics/PorterDuffColorFilter;
        localPorterDuffColorFilter.<init>(paramInt, paramMode);
        localColorFilterLruCache.OooOO0(paramInt, paramMode, localPorterDuffColorFilter);
      }
      return localPorterDuffColorFilter;
    }
  }
  
  public static boolean OooOOO(Drawable paramDrawable)
  {
    boolean bool1 = paramDrawable instanceof VectorDrawableCompat;
    if (!bool1)
    {
      paramDrawable = paramDrawable.getClass().getName();
      String str = "android.graphics.drawable.VectorDrawable";
      bool2 = str.equals(paramDrawable);
      if (!bool2)
      {
        bool2 = false;
        paramDrawable = null;
        return bool2;
      }
    }
    boolean bool2 = true;
    return bool2;
  }
  
  public static void OooOOO0(ResourceManagerInternal paramResourceManagerInternal) {}
  
  public static void OooOOoo(Drawable paramDrawable, TintInfo paramTintInfo, int[] paramArrayOfInt)
  {
    Object localObject1 = paramDrawable.getState();
    boolean bool1 = DrawableUtils.OooO00o(paramDrawable);
    Object localObject2;
    if (bool1)
    {
      localObject2 = paramDrawable.mutate();
      if (localObject2 == paramDrawable)
      {
        bool1 = true;
      }
      else
      {
        bool1 = false;
        localObject2 = null;
      }
      if (!bool1) {
        return;
      }
    }
    bool1 = paramDrawable instanceof LayerDrawable;
    if (bool1)
    {
      bool1 = ((Drawable)paramDrawable).isStateful();
      if (bool1)
      {
        localObject2 = new int[0];
        ((Drawable)paramDrawable).setState((int[])localObject2);
        ((Drawable)paramDrawable).setState((int[])localObject1);
      }
    }
    boolean bool2 = paramTintInfo.OooO0Oo;
    if (!bool2)
    {
      bool1 = paramTintInfo.OooO0OO;
      if (!bool1)
      {
        ((Drawable)paramDrawable).clearColorFilter();
        return;
      }
    }
    if (bool2)
    {
      localObject1 = paramTintInfo.OooO00o;
    }
    else
    {
      bool2 = false;
      localObject1 = null;
    }
    bool1 = paramTintInfo.OooO0OO;
    if (bool1) {
      paramTintInfo = paramTintInfo.OooO0O0;
    } else {
      paramTintInfo = OooO0oo;
    }
    paramTintInfo = OooO0o((ColorStateList)localObject1, paramTintInfo, paramArrayOfInt);
    ((Drawable)paramDrawable).setColorFilter(paramTintInfo);
  }
  
  public static ResourceManagerInternal get()
  {
    synchronized (ResourceManagerInternal.class)
    {
      ResourceManagerInternal localResourceManagerInternal2 = OooO;
      if (localResourceManagerInternal2 == null)
      {
        localResourceManagerInternal2 = new androidx/appcompat/widget/ResourceManagerInternal;
        localResourceManagerInternal2.<init>();
        OooO = localResourceManagerInternal2;
        OooOOO0(localResourceManagerInternal2);
      }
      localResourceManagerInternal2 = OooO;
      return localResourceManagerInternal2;
    }
  }
  
  public Drawable OooO(Context paramContext, int paramInt, boolean paramBoolean)
  {
    try
    {
      OooO0OO(paramContext);
      Drawable localDrawable = OooOOOO(paramContext, paramInt);
      if (localDrawable == null) {
        localDrawable = OooO0o0(paramContext, paramInt);
      }
      if (localDrawable == null) {
        localDrawable = ContextCompat.OooO0o0(paramContext, paramInt);
      }
      if (localDrawable != null) {
        localDrawable = OooOOo(paramContext, paramInt, paramBoolean, localDrawable);
      }
      if (localDrawable != null) {
        DrawableUtils.OooO0O0(localDrawable);
      }
      return localDrawable;
    }
    finally {}
  }
  
  public final boolean OooO00o(Context paramContext, long paramLong, Drawable paramDrawable)
  {
    try
    {
      paramDrawable = paramDrawable.getConstantState();
      if (paramDrawable != null)
      {
        Object localObject = this.OooO0Oo;
        localObject = ((WeakHashMap)localObject).get(paramContext);
        localObject = (LongSparseArray)localObject;
        if (localObject == null)
        {
          localObject = new androidx/collection/LongSparseArray;
          ((LongSparseArray)localObject).<init>();
          WeakHashMap localWeakHashMap = this.OooO0Oo;
          localWeakHashMap.put(paramContext, localObject);
        }
        paramContext = new java/lang/ref/WeakReference;
        paramContext.<init>(paramDrawable);
        ((LongSparseArray)localObject).OooOO0o(paramLong, paramContext);
        return true;
      }
      return false;
    }
    finally {}
  }
  
  public final void OooO0O0(Context paramContext, int paramInt, ColorStateList paramColorStateList)
  {
    Object localObject = this.OooO00o;
    if (localObject == null)
    {
      localObject = new java/util/WeakHashMap;
      ((WeakHashMap)localObject).<init>();
      this.OooO00o = ((WeakHashMap)localObject);
    }
    localObject = (SparseArrayCompat)this.OooO00o.get(paramContext);
    if (localObject == null)
    {
      localObject = new androidx/collection/SparseArrayCompat;
      ((SparseArrayCompat)localObject).<init>();
      WeakHashMap localWeakHashMap = this.OooO00o;
      localWeakHashMap.put(paramContext, localObject);
    }
    ((SparseArrayCompat)localObject).OooO00o(paramInt, paramColorStateList);
  }
  
  public final void OooO0OO(Context paramContext)
  {
    boolean bool1 = this.OooO0o;
    if (bool1) {
      return;
    }
    this.OooO0o = true;
    int i = R.drawable.abc_vector_test;
    paramContext = OooO0oo(paramContext, i);
    if (paramContext != null)
    {
      boolean bool2 = OooOOO(paramContext);
      if (bool2) {
        return;
      }
    }
    this.OooO0o = false;
    paramContext = new java/lang/IllegalStateException;
    paramContext.<init>("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
    throw paramContext;
  }
  
  public final Drawable OooO0o0(Context paramContext, int paramInt)
  {
    TypedValue localTypedValue = this.OooO0o0;
    if (localTypedValue == null)
    {
      localTypedValue = new android/util/TypedValue;
      localTypedValue.<init>();
      this.OooO0o0 = localTypedValue;
    }
    localTypedValue = this.OooO0o0;
    Resources localResources = paramContext.getResources();
    boolean bool = true;
    localResources.getValue(paramInt, localTypedValue, bool);
    long l = OooO0Oo(localTypedValue);
    Object localObject = OooO0oO(paramContext, l);
    if (localObject != null) {
      return localObject;
    }
    localObject = this.OooO0oO;
    Drawable localDrawable;
    if (localObject == null)
    {
      paramInt = 0;
      localDrawable = null;
    }
    else
    {
      localDrawable = ((ResourceManagerInternal.ResourceManagerHooks)localObject).OooO0O0(this, paramContext, paramInt);
    }
    if (localDrawable != null)
    {
      int i = localTypedValue.changingConfigurations;
      localDrawable.setChangingConfigurations(i);
      OooO00o(paramContext, l, localDrawable);
    }
    return localDrawable;
  }
  
  public final Drawable OooO0oO(Context paramContext, long paramLong)
  {
    try
    {
      Object localObject1 = this.OooO0Oo;
      localObject1 = ((WeakHashMap)localObject1).get(paramContext);
      localObject1 = (LongSparseArray)localObject1;
      if (localObject1 == null) {
        return null;
      }
      Object localObject2 = ((LongSparseArray)localObject1).OooO0oo(paramLong);
      localObject2 = (WeakReference)localObject2;
      if (localObject2 != null)
      {
        localObject2 = ((Reference)localObject2).get();
        localObject2 = (Drawable.ConstantState)localObject2;
        if (localObject2 != null)
        {
          paramContext = paramContext.getResources();
          paramContext = ((Drawable.ConstantState)localObject2).newDrawable(paramContext);
          return paramContext;
        }
        ((LongSparseArray)localObject1).OooOOO0(paramLong);
      }
      return null;
    }
    finally {}
  }
  
  public Drawable OooO0oo(Context paramContext, int paramInt)
  {
    try
    {
      paramContext = OooO(paramContext, paramInt, false);
      return paramContext;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public ColorStateList OooOO0O(Context paramContext, int paramInt)
  {
    try
    {
      Object localObject = OooOO0o(paramContext, paramInt);
      if (localObject == null)
      {
        localObject = this.OooO0oO;
        if (localObject == null) {
          localObject = null;
        } else {
          localObject = ((ResourceManagerInternal.ResourceManagerHooks)localObject).OooO0OO(paramContext, paramInt);
        }
        if (localObject != null) {
          OooO0O0(paramContext, paramInt, (ColorStateList)localObject);
        }
      }
      return localObject;
    }
    finally {}
  }
  
  public final ColorStateList OooOO0o(Context paramContext, int paramInt)
  {
    WeakHashMap localWeakHashMap = this.OooO00o;
    Object localObject = null;
    if (localWeakHashMap != null)
    {
      paramContext = (SparseArrayCompat)localWeakHashMap.get(paramContext);
      if (paramContext != null)
      {
        paramContext = paramContext.get(paramInt);
        localObject = paramContext;
        localObject = (ColorStateList)paramContext;
      }
    }
    return localObject;
  }
  
  public final Drawable OooOOOO(Context paramContext, int paramInt)
  {
    Object localObject1 = this.OooO0O0;
    Object localObject2 = null;
    String str;
    int j;
    Object localObject3;
    long l;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    if (localObject1 != null)
    {
      boolean bool1 = ((SimpleArrayMap)localObject1).isEmpty();
      if (!bool1)
      {
        localObject1 = this.OooO0OO;
        str = "appcompat_skip_skip";
        if (localObject1 != null)
        {
          localObject1 = (String)((SparseArrayCompat)localObject1).get(paramInt);
          j = str.equals(localObject1);
          if (j == 0)
          {
            if (localObject1 != null)
            {
              localObject3 = this.OooO0O0;
              localObject1 = ((SimpleArrayMap)localObject3).get(localObject1);
              if (localObject1 != null) {}
            }
          }
          else {
            return null;
          }
        }
        else
        {
          localObject1 = new androidx/collection/SparseArrayCompat;
          ((SparseArrayCompat)localObject1).<init>();
          this.OooO0OO = ((SparseArrayCompat)localObject1);
        }
        localObject1 = this.OooO0o0;
        if (localObject1 == null)
        {
          localObject1 = new android/util/TypedValue;
          ((TypedValue)localObject1).<init>();
          this.OooO0o0 = ((TypedValue)localObject1);
        }
        localObject1 = this.OooO0o0;
        localObject2 = paramContext.getResources();
        j = 1;
        ((Resources)localObject2).getValue(paramInt, (TypedValue)localObject1, j);
        l = OooO0Oo((TypedValue)localObject1);
        localObject4 = OooO0oO(paramContext, l);
        if (localObject4 != null) {
          return localObject4;
        }
        localObject5 = ((TypedValue)localObject1).string;
        if (localObject5 != null)
        {
          localObject5 = ((CharSequence)localObject5).toString();
          localObject6 = ".xml";
          boolean bool2 = ((String)localObject5).endsWith((String)localObject6);
          if (!bool2) {}
        }
      }
    }
    try
    {
      localObject2 = ((Resources)localObject2).getXml(paramInt);
      localObject5 = Xml.asAttributeSet((XmlPullParser)localObject2);
      int k;
      int m;
      do
      {
        k = ((XmlPullParser)localObject2).next();
        m = 2;
      } while ((k != m) && (k != j));
      if (k == m)
      {
        localObject3 = ((XmlPullParser)localObject2).getName();
        localObject6 = this.OooO0OO;
        ((SparseArrayCompat)localObject6).OooO00o(paramInt, localObject3);
        localObject6 = this.OooO0O0;
        localObject3 = ((SimpleArrayMap)localObject6).get(localObject3);
        localObject3 = (ResourceManagerInternal.InflateDelegate)localObject3;
        if (localObject3 != null)
        {
          localObject6 = paramContext.getTheme();
          localObject2 = ((ResourceManagerInternal.InflateDelegate)localObject3).OooO00o(paramContext, (XmlPullParser)localObject2, (AttributeSet)localObject5, (Resources.Theme)localObject6);
          localObject4 = localObject2;
        }
        if (localObject4 != null)
        {
          int i = ((TypedValue)localObject1).changingConfigurations;
          ((Drawable)localObject4).setChangingConfigurations(i);
          OooO00o(paramContext, l, (Drawable)localObject4);
        }
      }
      else
      {
        paramContext = new org/xmlpull/v1/XmlPullParserException;
        localObject1 = "No start tag found";
        paramContext.<init>((String)localObject1);
        throw paramContext;
      }
    }
    catch (Exception localException)
    {
      label375:
      break label375;
    }
    if (localObject4 == null)
    {
      paramContext = this.OooO0OO;
      paramContext.OooO00o(paramInt, str);
    }
    return localObject4;
    return null;
  }
  
  public void OooOOOo(Context paramContext)
  {
    try
    {
      WeakHashMap localWeakHashMap = this.OooO0Oo;
      paramContext = localWeakHashMap.get(paramContext);
      paramContext = (LongSparseArray)paramContext;
      if (paramContext != null) {
        paramContext.OooO0O0();
      }
      return;
    }
    finally {}
  }
  
  public final Drawable OooOOo(Context paramContext, int paramInt, boolean paramBoolean, Drawable paramDrawable)
  {
    Object localObject = OooOO0O(paramContext, paramInt);
    boolean bool1;
    if (localObject != null)
    {
      bool1 = DrawableUtils.OooO00o(paramDrawable);
      if (bool1) {
        paramDrawable = paramDrawable.mutate();
      }
      paramDrawable = DrawableCompat.OooOOo(paramDrawable);
      DrawableCompat.OooOOOO(paramDrawable, (ColorStateList)localObject);
      paramContext = getTintMode(paramInt);
      if (paramContext != null) {
        DrawableCompat.OooOOOo(paramDrawable, paramContext);
      }
    }
    else
    {
      localObject = this.OooO0oO;
      if (localObject != null)
      {
        boolean bool2 = ((ResourceManagerInternal.ResourceManagerHooks)localObject).OooO0Oo(paramContext, paramInt, paramDrawable);
        if (bool2) {}
      }
      else
      {
        bool1 = OooOo00(paramContext, paramInt, paramDrawable);
        if ((!bool1) && (paramBoolean)) {
          paramDrawable = null;
        }
      }
    }
    return paramDrawable;
  }
  
  public Drawable OooOOo0(Context paramContext, VectorEnabledTintResources paramVectorEnabledTintResources, int paramInt)
  {
    try
    {
      Drawable localDrawable = OooOOOO(paramContext, paramInt);
      if (localDrawable == null) {
        localDrawable = paramVectorEnabledTintResources.getDrawableCanonical(paramInt);
      }
      if (localDrawable != null)
      {
        paramVectorEnabledTintResources = null;
        paramContext = OooOOo(paramContext, paramInt, false, localDrawable);
        return paramContext;
      }
      return null;
    }
    finally {}
  }
  
  public boolean OooOo00(Context paramContext, int paramInt, Drawable paramDrawable)
  {
    ResourceManagerInternal.ResourceManagerHooks localResourceManagerHooks = this.OooO0oO;
    if (localResourceManagerHooks != null)
    {
      bool = localResourceManagerHooks.OooO00o(paramContext, paramInt, paramDrawable);
      if (bool)
      {
        bool = true;
        break label39;
      }
    }
    boolean bool = false;
    paramContext = null;
    label39:
    return bool;
  }
  
  public PorterDuff.Mode getTintMode(int paramInt)
  {
    ResourceManagerInternal.ResourceManagerHooks localResourceManagerHooks = this.OooO0oO;
    PorterDuff.Mode localMode;
    if (localResourceManagerHooks == null)
    {
      paramInt = 0;
      localMode = null;
    }
    else
    {
      localMode = localResourceManagerHooks.getTintModeForDrawableRes(paramInt);
    }
    return localMode;
  }
  
  public void setHooks(ResourceManagerInternal.ResourceManagerHooks paramResourceManagerHooks)
  {
    try
    {
      this.OooO0oO = paramResourceManagerHooks;
      return;
    }
    finally
    {
      paramResourceManagerHooks = finally;
      throw paramResourceManagerHooks;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ResourceManagerInternal
 * JD-Core Version:    0.7.0.1
 */
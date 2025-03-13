package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.collection.ArraySet;
import androidx.core.os.BuildCompat;
import androidx.core.os.LocaleListCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;

public abstract class AppCompatDelegate
{
  public static AppLocalesStorageHelper.SerialExecutor o00OoOoo;
  public static LocaleListCompat o00Ooo0;
  public static int o00Ooo00;
  public static LocaleListCompat o00Ooo0O;
  public static Boolean o00Ooo0o;
  public static final ArraySet o00OooO;
  public static boolean o00OooO0;
  public static final Object o00OooOO;
  public static final Object o00OooOo;
  
  static
  {
    Object localObject = new androidx/appcompat/app/AppLocalesStorageHelper$SerialExecutor;
    AppLocalesStorageHelper.ThreadPerTaskExecutor localThreadPerTaskExecutor = new androidx/appcompat/app/AppLocalesStorageHelper$ThreadPerTaskExecutor;
    localThreadPerTaskExecutor.<init>();
    ((AppLocalesStorageHelper.SerialExecutor)localObject).<init>(localThreadPerTaskExecutor);
    o00OoOoo = (AppLocalesStorageHelper.SerialExecutor)localObject;
    o00Ooo00 = -100;
    o00Ooo0 = null;
    o00Ooo0O = null;
    o00Ooo0o = null;
    o00OooO0 = false;
    localObject = new androidx/collection/ArraySet;
    ((ArraySet)localObject).<init>();
    o00OooO = (ArraySet)localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    o00OooOO = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    o00OooOo = localObject;
  }
  
  public static void OooO0OO(AppCompatDelegate paramAppCompatDelegate)
  {
    synchronized (o00OooOO)
    {
      OooOoo(paramAppCompatDelegate);
      ArraySet localArraySet = o00OooO;
      WeakReference localWeakReference = new java/lang/ref/WeakReference;
      localWeakReference.<init>(paramAppCompatDelegate);
      localArraySet.add(localWeakReference);
      return;
    }
  }
  
  public static void OooO0oO()
  {
    synchronized (o00OooOO)
    {
      Object localObject2 = o00OooO;
      localObject2 = ((ArraySet)localObject2).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        Object localObject4 = ((Iterator)localObject2).next();
        localObject4 = (WeakReference)localObject4;
        localObject4 = ((Reference)localObject4).get();
        localObject4 = (AppCompatDelegate)localObject4;
        if (localObject4 != null) {
          ((AppCompatDelegate)localObject4).OooO0o();
        }
      }
      return;
    }
  }
  
  public static void OooO0oo()
  {
    Iterator localIterator = o00OooO.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      AppCompatDelegate localAppCompatDelegate = (AppCompatDelegate)((WeakReference)localIterator.next()).get();
      if (localAppCompatDelegate != null) {
        localAppCompatDelegate.OooO0o0();
      }
    }
  }
  
  public static AppCompatDelegate OooOO0o(Activity paramActivity, AppCompatCallback paramAppCompatCallback)
  {
    AppCompatDelegateImpl localAppCompatDelegateImpl = new androidx/appcompat/app/AppCompatDelegateImpl;
    localAppCompatDelegateImpl.<init>(paramActivity, paramAppCompatCallback);
    return localAppCompatDelegateImpl;
  }
  
  public static AppCompatDelegate OooOOO0(Dialog paramDialog, AppCompatCallback paramAppCompatCallback)
  {
    AppCompatDelegateImpl localAppCompatDelegateImpl = new androidx/appcompat/app/AppCompatDelegateImpl;
    localAppCompatDelegateImpl.<init>(paramDialog, paramAppCompatCallback);
    return localAppCompatDelegateImpl;
  }
  
  public static boolean OooOOo0(Context paramContext)
  {
    Object localObject = o00Ooo0o;
    if (localObject == null) {
      try
      {
        paramContext = AppLocalesMetadataHolderService.OooO00o(paramContext);
        paramContext = paramContext.metaData;
        if (paramContext != null)
        {
          localObject = "autoStoreLocales";
          boolean bool = paramContext.getBoolean((String)localObject);
          paramContext = Boolean.valueOf(bool);
          o00Ooo0o = paramContext;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        paramContext = Boolean.FALSE;
        o00Ooo0o = paramContext;
      }
    }
    return o00Ooo0o.booleanValue();
  }
  
  public static void OooOoo(AppCompatDelegate paramAppCompatDelegate)
  {
    synchronized (o00OooOO)
    {
      Object localObject2 = o00OooO;
      localObject2 = ((ArraySet)localObject2).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        Object localObject3 = ((Iterator)localObject2).next();
        localObject3 = (WeakReference)localObject3;
        localObject3 = ((Reference)localObject3).get();
        localObject3 = (AppCompatDelegate)localObject3;
        if ((localObject3 == paramAppCompatDelegate) || (localObject3 == null)) {
          ((Iterator)localObject2).remove();
        }
      }
      return;
    }
  }
  
  public static void OooOoo0(AppCompatDelegate paramAppCompatDelegate)
  {
    synchronized (o00OooOO)
    {
      OooOoo(paramAppCompatDelegate);
      return;
    }
  }
  
  public static void Oooo000(Context paramContext)
  {
    boolean bool1 = OooOOo0(paramContext);
    if (!bool1) {
      return;
    }
    bool1 = BuildCompat.isAtLeastT();
    Object localObject2;
    if (bool1)
    {
      bool1 = o00OooO0;
      if (bool1) {
        break label150;
      }
      ??? = o00OoOoo;
      localObject2 = new androidx/appcompat/app/OooO0O0;
      ((OooO0O0)localObject2).<init>(paramContext);
      ((AppLocalesStorageHelper.SerialExecutor)???).execute((Runnable)localObject2);
    }
    synchronized (o00OooOo)
    {
      localObject2 = o00Ooo0;
      if (localObject2 == null)
      {
        localObject2 = o00Ooo0O;
        if (localObject2 == null)
        {
          paramContext = AppLocalesStorageHelper.OooO0O0(paramContext);
          paramContext = LocaleListCompat.OooO0OO(paramContext);
          o00Ooo0O = paramContext;
        }
        paramContext = o00Ooo0O;
        boolean bool2 = paramContext.isEmpty();
        if (bool2) {
          return;
        }
        paramContext = o00Ooo0O;
        o00Ooo0 = paramContext;
      }
      else
      {
        LocaleListCompat localLocaleListCompat = o00Ooo0O;
        boolean bool3 = ((LocaleListCompat)localObject2).equals(localLocaleListCompat);
        if (!bool3)
        {
          localObject2 = o00Ooo0;
          o00Ooo0O = (LocaleListCompat)localObject2;
          localObject2 = ((LocaleListCompat)localObject2).OooO0o0();
          AppLocalesStorageHelper.OooO00o(paramContext, (String)localObject2);
        }
      }
      label150:
      return;
    }
  }
  
  public static LocaleListCompat getApplicationLocales()
  {
    boolean bool = BuildCompat.isAtLeastT();
    Object localObject;
    if (bool)
    {
      localObject = getLocaleManagerForApplication();
      if (localObject != null) {
        return LocaleListCompat.OooO0o(AppCompatDelegate.Api33Impl.OooO00o(localObject));
      }
    }
    else
    {
      localObject = o00Ooo0;
      if (localObject != null) {
        return localObject;
      }
    }
    return LocaleListCompat.getEmptyLocaleList();
  }
  
  public static int getDefaultNightMode()
  {
    return o00Ooo00;
  }
  
  public static Object getLocaleManagerForApplication()
  {
    Iterator localIterator = o00OooO.iterator();
    Object localObject;
    do
    {
      do
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (AppCompatDelegate)((WeakReference)localIterator.next()).get();
      } while (localObject == null);
      localObject = ((AppCompatDelegate)localObject).getContextForDelegate();
    } while (localObject == null);
    return ((Context)localObject).getSystemService("locale");
    return null;
  }
  
  public static LocaleListCompat getRequestedAppLocales()
  {
    return o00Ooo0;
  }
  
  public static LocaleListCompat getStoredAppLocales()
  {
    return o00Ooo0O;
  }
  
  public static boolean isCompatVectorFromResourcesEnabled()
  {
    return VectorEnabledTintResources.isCompatVectorFromResourcesEnabled();
  }
  
  public static void setApplicationLocales(LocaleListCompat paramLocaleListCompat)
  {
    Objects.requireNonNull(paramLocaleListCompat);
    boolean bool = BuildCompat.isAtLeastT();
    if (bool)
    {
      ??? = getLocaleManagerForApplication();
      if (??? != null)
      {
        paramLocaleListCompat = AppCompatDelegate.Api24Impl.OooO00o(paramLocaleListCompat.OooO0o0());
        AppCompatDelegate.Api33Impl.OooO0O0(???, paramLocaleListCompat);
      }
    }
    else
    {
      ??? = o00Ooo0;
      bool = paramLocaleListCompat.equals(???);
      if (!bool) {
        synchronized (o00OooOO)
        {
          o00Ooo0 = paramLocaleListCompat;
          OooO0oo();
        }
      }
    }
  }
  
  public static void setCompatVectorFromResourcesEnabled(boolean paramBoolean)
  {
    VectorEnabledTintResources.setCompatVectorFromResourcesEnabled(paramBoolean);
  }
  
  public static void setDefaultNightMode(int paramInt)
  {
    int i = -1;
    if ((paramInt != i) && (paramInt != 0))
    {
      i = 1;
      if (paramInt != i)
      {
        i = 2;
        if (paramInt != i)
        {
          i = 3;
          if (paramInt != i) {
            return;
          }
        }
      }
    }
    i = o00Ooo00;
    if (i != paramInt)
    {
      o00Ooo00 = paramInt;
      OooO0oO();
    }
  }
  
  public static void setIsAutoStoreLocalesOptedIn(boolean paramBoolean)
  {
    o00Ooo0o = Boolean.valueOf(paramBoolean);
  }
  
  public void OooO(Context paramContext)
  {
    AppLocalesStorageHelper.SerialExecutor localSerialExecutor = o00OoOoo;
    OooO00o localOooO00o = new androidx/appcompat/app/OooO00o;
    localOooO00o.<init>(paramContext);
    localSerialExecutor.execute(localOooO00o);
  }
  
  public abstract void OooO0Oo(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public abstract boolean OooO0o();
  
  public boolean OooO0o0()
  {
    return false;
  }
  
  public void OooOO0(Context paramContext) {}
  
  public Context OooOO0O(Context paramContext)
  {
    OooOO0(paramContext);
    return paramContext;
  }
  
  public abstract View OooOOO(int paramInt);
  
  public abstract void OooOOOO();
  
  public abstract void OooOOOo();
  
  public abstract void OooOo();
  
  public abstract void OooOo0(Bundle paramBundle);
  
  public abstract void OooOo00(Configuration paramConfiguration);
  
  public abstract void OooOo0O();
  
  public abstract void OooOo0o(Bundle paramBundle);
  
  public abstract void OooOoO();
  
  public abstract void OooOoO0(Bundle paramBundle);
  
  public abstract void OooOoOO();
  
  public abstract boolean OooOooO(int paramInt);
  
  public abstract void OooOooo(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public Context getContextForDelegate()
  {
    return null;
  }
  
  public abstract ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();
  
  public int getLocalNightMode()
  {
    return -100;
  }
  
  public abstract MenuInflater getMenuInflater();
  
  public abstract ActionBar getSupportActionBar();
  
  public abstract boolean isHandleNativeActionModesEnabled();
  
  public abstract void setContentView(int paramInt);
  
  public abstract void setContentView(View paramView);
  
  public abstract void setHandleNativeActionModesEnabled(boolean paramBoolean);
  
  public abstract void setLocalNightMode(int paramInt);
  
  public void setOnBackInvokedDispatcher(OnBackInvokedDispatcher paramOnBackInvokedDispatcher) {}
  
  public abstract void setSupportActionBar(Toolbar paramToolbar);
  
  public void setTheme(int paramInt) {}
  
  public abstract void setTitle(CharSequence paramCharSequence);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegate
 * JD-Core Version:    0.7.0.1
 */
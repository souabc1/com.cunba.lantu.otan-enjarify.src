package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewManager;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.color;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.style;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ActionMode.Callback;
import androidx.appcompat.view.StandaloneActionMode;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.ViewUtils;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NavUtils;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat.ThemeCompat;
import androidx.core.os.LocaleListCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.KeyEventDispatcher.Component;
import androidx.core.view.LayoutInflaterCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.PopupWindowCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;

class AppCompatDelegateImpl
  extends AppCompatDelegate
  implements MenuBuilder.Callback, LayoutInflater.Factory2
{
  public static final SimpleArrayMap o00oOOo0;
  public static final boolean o00oOOoO;
  public static final int[] o00oOo00;
  public static final boolean o00oOo0O;
  public static final boolean o00oOooO;
  public final Context o00OoooO;
  public Window o00Ooooo;
  public int o00o;
  public ViewPropertyAnimatorCompat o00o0 = null;
  public DecorContentParent o00o00;
  public final AppCompatCallback o00o000;
  public AppCompatDelegateImpl.AppCompatWindowCallback o00o0000;
  public ActionBar o00o000O;
  public MenuInflater o00o000o;
  public AppCompatDelegateImpl.ActionMenuPresenterCallback o00o00O0;
  public AppCompatDelegateImpl.PanelMenuPresenterCallback o00o00Oo;
  public ActionBarContextView o00o00o;
  public ActionMode o00o00o0;
  public PopupWindow o00o00oO;
  public Runnable o00o00oo;
  public boolean o00o0O0;
  public boolean o00o0O00 = true;
  public ViewGroup o00o0O0O;
  public View o00o0OO;
  public TextView o00o0OO0;
  public boolean o00o0OOO;
  public boolean o00o0OOo;
  public boolean o00o0Oo;
  public boolean o00o0Oo0;
  public boolean o00o0OoO;
  public boolean o00o0Ooo;
  public AppCompatDelegateImpl.PanelFeatureState o00o0o;
  public boolean o00o0o00;
  public boolean o00o0o0O;
  public AppCompatDelegateImpl.PanelFeatureState[] o00o0o0o;
  public boolean o00o0oO;
  public boolean o00o0oO0;
  public boolean o00o0oOO;
  public boolean o00o0oOo;
  public int o00o0oo;
  public Configuration o00o0oo0;
  public int o00o0ooo;
  public final Runnable o00oO0;
  public AppCompatDelegateImpl.AutoNightModeManager o00oO000;
  public AppCompatDelegateImpl.AutoNightModeManager o00oO00O;
  public boolean o00oO00o;
  public boolean o00oO0O0;
  public AppCompatViewInflater o00oOO;
  public LayoutIncludeDetector o00oOOO0;
  public OnBackInvokedDispatcher o00oOOOO;
  public OnBackInvokedCallback o00oOOOo;
  public int o00oOo;
  public boolean o00oo000;
  public final Object o0O00o0;
  public Rect o0oOOo;
  public Rect o0ooOO;
  public CharSequence oo00oO;
  
  static
  {
    SimpleArrayMap localSimpleArrayMap = new androidx/collection/SimpleArrayMap;
    localSimpleArrayMap.<init>();
    o00oOOo0 = localSimpleArrayMap;
    o00oOOoO = false;
    o00oOo00 = new int[] { 16842836 };
    String str = Build.FINGERPRINT;
    boolean bool1 = "robolectric".equals(str);
    boolean bool2 = true;
    o00oOooO = bool1 ^ bool2;
    o00oOo0O = bool2;
  }
  
  public AppCompatDelegateImpl(Activity paramActivity, AppCompatCallback paramAppCompatCallback)
  {
    this(paramActivity, null, paramAppCompatCallback, paramActivity);
  }
  
  public AppCompatDelegateImpl(Dialog paramDialog, AppCompatCallback paramAppCompatCallback)
  {
    this(localContext, localWindow, paramAppCompatCallback, paramDialog);
  }
  
  public AppCompatDelegateImpl(Context paramContext, Window paramWindow, AppCompatCallback paramAppCompatCallback, Object paramObject)
  {
    int i = -100;
    this.o00o0oo = i;
    AppCompatDelegateImpl.2 local2 = new androidx/appcompat/app/AppCompatDelegateImpl$2;
    local2.<init>(this);
    this.o00oO0 = local2;
    this.o00OoooO = paramContext;
    this.o00o000 = paramAppCompatCallback;
    this.o0O00o0 = paramObject;
    int j = this.o00o0oo;
    if (j == i)
    {
      boolean bool = paramObject instanceof Dialog;
      if (bool)
      {
        paramContext = o00000OO();
        if (paramContext != null)
        {
          paramContext = paramContext.getDelegate();
          k = paramContext.getLocalNightMode();
          this.o00o0oo = k;
        }
      }
    }
    int k = this.o00o0oo;
    if (k == i)
    {
      paramContext = o00oOOo0;
      paramAppCompatCallback = paramObject.getClass().getName();
      paramAppCompatCallback = (Integer)paramContext.get(paramAppCompatCallback);
      if (paramAppCompatCallback != null)
      {
        int m = paramAppCompatCallback.intValue();
        this.o00o0oo = m;
        paramAppCompatCallback = paramObject.getClass().getName();
        paramContext.remove(paramAppCompatCallback);
      }
    }
    if (paramWindow != null) {
      Oooo0O0(paramWindow);
    }
    AppCompatDrawableManager.OooO0oO();
  }
  
  public static Configuration Ooooo00(Configuration paramConfiguration1, Configuration paramConfiguration2)
  {
    Configuration localConfiguration = new android/content/res/Configuration;
    localConfiguration.<init>();
    int i = 0;
    float f1 = 0.0F;
    localConfiguration.fontScale = 0.0F;
    if (paramConfiguration2 != null)
    {
      i = paramConfiguration1.diff(paramConfiguration2);
      if (i != 0)
      {
        f1 = paramConfiguration1.fontScale;
        float f2 = paramConfiguration2.fontScale;
        boolean bool = f1 < f2;
        if (bool) {
          localConfiguration.fontScale = f2;
        }
        int j = paramConfiguration1.mcc;
        int k = paramConfiguration2.mcc;
        if (j != k) {
          localConfiguration.mcc = k;
        }
        j = paramConfiguration1.mnc;
        k = paramConfiguration2.mnc;
        if (j != k) {
          localConfiguration.mnc = k;
        }
        AppCompatDelegateImpl.Api24Impl.OooO00o(paramConfiguration1, paramConfiguration2, localConfiguration);
        j = paramConfiguration1.touchscreen;
        k = paramConfiguration2.touchscreen;
        if (j != k) {
          localConfiguration.touchscreen = k;
        }
        j = paramConfiguration1.keyboard;
        k = paramConfiguration2.keyboard;
        if (j != k) {
          localConfiguration.keyboard = k;
        }
        j = paramConfiguration1.keyboardHidden;
        k = paramConfiguration2.keyboardHidden;
        if (j != k) {
          localConfiguration.keyboardHidden = k;
        }
        j = paramConfiguration1.navigation;
        k = paramConfiguration2.navigation;
        if (j != k) {
          localConfiguration.navigation = k;
        }
        j = paramConfiguration1.navigationHidden;
        k = paramConfiguration2.navigationHidden;
        if (j != k) {
          localConfiguration.navigationHidden = k;
        }
        j = paramConfiguration1.orientation;
        k = paramConfiguration2.orientation;
        if (j != k) {
          localConfiguration.orientation = k;
        }
        j = paramConfiguration1.screenLayout & 0xF;
        k = paramConfiguration2.screenLayout;
        int m = k & 0xF;
        if (j != m)
        {
          j = localConfiguration.screenLayout;
          k &= 0xF;
          j |= k;
          localConfiguration.screenLayout = j;
        }
        j = paramConfiguration1.screenLayout & 0xC0;
        k = paramConfiguration2.screenLayout;
        m = k & 0xC0;
        if (j != m)
        {
          j = localConfiguration.screenLayout;
          k &= 0xC0;
          j |= k;
          localConfiguration.screenLayout = j;
        }
        j = paramConfiguration1.screenLayout & 0x30;
        k = paramConfiguration2.screenLayout;
        m = k & 0x30;
        if (j != m)
        {
          j = localConfiguration.screenLayout;
          k &= 0x30;
          j |= k;
          localConfiguration.screenLayout = j;
        }
        j = paramConfiguration1.screenLayout & 0x300;
        k = paramConfiguration2.screenLayout;
        m = k & 0x300;
        if (j != m)
        {
          j = localConfiguration.screenLayout;
          k &= 0x300;
          j |= k;
          localConfiguration.screenLayout = j;
        }
        AppCompatDelegateImpl.Api26Impl.OooO00o(paramConfiguration1, paramConfiguration2, localConfiguration);
        j = paramConfiguration1.uiMode & 0xF;
        k = paramConfiguration2.uiMode;
        m = k & 0xF;
        if (j != m)
        {
          j = localConfiguration.uiMode;
          k &= 0xF;
          j |= k;
          localConfiguration.uiMode = j;
        }
        j = paramConfiguration1.uiMode & 0x30;
        k = paramConfiguration2.uiMode;
        m = k & 0x30;
        if (j != m)
        {
          j = localConfiguration.uiMode;
          k &= 0x30;
          j |= k;
          localConfiguration.uiMode = j;
        }
        j = paramConfiguration1.screenWidthDp;
        k = paramConfiguration2.screenWidthDp;
        if (j != k) {
          localConfiguration.screenWidthDp = k;
        }
        j = paramConfiguration1.screenHeightDp;
        k = paramConfiguration2.screenHeightDp;
        if (j != k) {
          localConfiguration.screenHeightDp = k;
        }
        j = paramConfiguration1.smallestScreenWidthDp;
        k = paramConfiguration2.smallestScreenWidthDp;
        if (j != k) {
          localConfiguration.smallestScreenWidthDp = k;
        }
        AppCompatDelegateImpl.Api17Impl.OooO0O0(paramConfiguration1, paramConfiguration2, localConfiguration);
      }
    }
    return localConfiguration;
  }
  
  public void OooO0Oo(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    OoooOo0();
    ((ViewGroup)this.o00o0O0O.findViewById(16908290)).addView(paramView, paramLayoutParams);
    paramView = this.o00o0000;
    paramLayoutParams = this.o00Ooooo.getCallback();
    paramView.OooO0O0(paramLayoutParams);
  }
  
  public boolean OooO0o()
  {
    return Oooo00O(true);
  }
  
  public boolean OooO0o0()
  {
    Object localObject = this.o00OoooO;
    boolean bool = AppCompatDelegate.OooOOo0((Context)localObject);
    if (bool)
    {
      localObject = AppCompatDelegate.getRequestedAppLocales();
      if (localObject != null)
      {
        localObject = AppCompatDelegate.getRequestedAppLocales();
        LocaleListCompat localLocaleListCompat = AppCompatDelegate.getStoredAppLocales();
        bool = ((LocaleListCompat)localObject).equals(localLocaleListCompat);
        if (!bool)
        {
          localObject = this.o00OoooO;
          OooO((Context)localObject);
        }
      }
    }
    return Oooo00O(true);
  }
  
  public Context OooOO0O(Context paramContext)
  {
    int i = 1;
    this.o00o0oO = i;
    int j = Oooo0o0();
    j = o00O0O(paramContext, j);
    boolean bool1 = AppCompatDelegate.OooOOo0(paramContext);
    if (bool1) {
      AppCompatDelegate.Oooo000(paramContext);
    }
    LocaleListCompat localLocaleListCompat = Oooo0OO(paramContext);
    bool1 = o00oOo0O;
    if (bool1)
    {
      bool1 = paramContext instanceof android.view.ContextThemeWrapper;
      if (bool1)
      {
        localObject1 = null;
        bool2 = false;
        localObject2 = this;
        localObject3 = paramContext;
        k = j;
        localObject2 = OoooO0((Context)paramContext, j, localLocaleListCompat, null, false);
        try
        {
          localObject3 = (android.view.ContextThemeWrapper)paramContext;
          AppCompatDelegateImpl.ContextThemeWrapperCompatApi17Impl.OooO00o((android.view.ContextThemeWrapper)localObject3, (Configuration)localObject2);
          return (Context)paramContext;
        }
        catch (IllegalStateException localIllegalStateException1) {}
      }
    }
    bool1 = paramContext instanceof androidx.appcompat.view.ContextThemeWrapper;
    if (bool1)
    {
      localObject1 = null;
      bool2 = false;
      localObject2 = this;
      localObject3 = paramContext;
      k = j;
      localObject2 = OoooO0((Context)paramContext, j, localLocaleListCompat, null, false);
      try
      {
        localObject3 = (androidx.appcompat.view.ContextThemeWrapper)paramContext;
        ((androidx.appcompat.view.ContextThemeWrapper)localObject3).OooO00o((Configuration)localObject2);
        return (Context)paramContext;
      }
      catch (IllegalStateException localIllegalStateException2) {}
    }
    bool1 = o00oOooO;
    if (!bool1) {
      return super.OooOO0O((Context)paramContext);
    }
    Object localObject2 = new android/content/res/Configuration;
    ((Configuration)localObject2).<init>();
    ((Configuration)localObject2).uiMode = -1;
    int m = 0;
    ((Configuration)localObject2).fontScale = 0.0F;
    localObject2 = AppCompatDelegateImpl.Api17Impl.OooO00o((Context)paramContext, (Configuration)localObject2).getResources().getConfiguration();
    Object localObject3 = ((Context)paramContext).getResources().getConfiguration();
    int k = ((Configuration)localObject3).uiMode;
    ((Configuration)localObject2).uiMode = k;
    boolean bool3 = ((Configuration)localObject2).equals((Configuration)localObject3);
    if (!bool3)
    {
      localObject2 = Ooooo00((Configuration)localObject2, (Configuration)localObject3);
    }
    else
    {
      bool1 = false;
      localObject2 = null;
    }
    Object localObject1 = localObject2;
    boolean bool2 = true;
    localObject2 = this;
    localObject3 = paramContext;
    bool3 = j;
    Configuration localConfiguration = OoooO0((Context)paramContext, j, localLocaleListCompat, localObject1, bool2);
    localObject2 = new androidx/appcompat/view/ContextThemeWrapper;
    m = R.style.Theme_AppCompat_Empty;
    ((androidx.appcompat.view.ContextThemeWrapper)localObject2).<init>((Context)paramContext, m);
    ((androidx.appcompat.view.ContextThemeWrapper)localObject2).OooO00o(localConfiguration);
    j = 0;
    localConfiguration = null;
    try
    {
      paramContext = ((Context)paramContext).getTheme();
      if (paramContext == null) {
        i = 0;
      }
      j = i;
    }
    catch (NullPointerException localNullPointerException)
    {
      label375:
      break label375;
    }
    if (j != 0)
    {
      paramContext = ((androidx.appcompat.view.ContextThemeWrapper)localObject2).getTheme();
      ResourcesCompat.ThemeCompat.OooO00o(paramContext);
    }
    return super.OooOO0O((Context)localObject2);
  }
  
  public View OooOOO(int paramInt)
  {
    OoooOo0();
    return this.o00Ooooo.findViewById(paramInt);
  }
  
  public void OooOOOO()
  {
    Object localObject = LayoutInflater.from(this.o00OoooO);
    LayoutInflater.Factory localFactory = ((LayoutInflater)localObject).getFactory();
    if (localFactory == null)
    {
      LayoutInflaterCompat.OooO00o((LayoutInflater)localObject, this);
    }
    else
    {
      localObject = ((LayoutInflater)localObject).getFactory2();
      (localObject instanceof AppCompatDelegateImpl);
    }
  }
  
  public void OooOOOo()
  {
    ActionBar localActionBar = o0OOO0o();
    if (localActionBar != null)
    {
      localActionBar = getSupportActionBar();
      boolean bool = localActionBar.OooOO0();
      if (!bool)
      {
        bool = false;
        localActionBar = null;
        ooOO(0);
      }
    }
  }
  
  public void OooOo()
  {
    ActionBar localActionBar = getSupportActionBar();
    if (localActionBar != null)
    {
      boolean bool = true;
      localActionBar.setShowHideAnimationEnabled(bool);
    }
  }
  
  public void OooOo0(Bundle paramBundle)
  {
    boolean bool1 = true;
    this.o00o0oO = bool1;
    Oooo00O(false);
    OoooOoO();
    Object localObject = this.o0O00o0;
    boolean bool2 = localObject instanceof Activity;
    if (bool2)
    {
      try
      {
        localObject = (Activity)localObject;
        localObject = NavUtils.OooO0OO((Activity)localObject);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        localObject = null;
      }
      if (localObject != null)
      {
        localObject = o0OOO0o();
        if (localObject == null) {
          this.o00oO0O0 = bool1;
        } else {
          ((ActionBar)localObject).setDefaultDisplayHomeAsUpEnabled(bool1);
        }
      }
      AppCompatDelegate.OooO0OO(this);
    }
    localObject = new android/content/res/Configuration;
    Configuration localConfiguration = this.o00OoooO.getResources().getConfiguration();
    ((Configuration)localObject).<init>(localConfiguration);
    this.o00o0oo0 = ((Configuration)localObject);
    this.o00o0oOO = bool1;
  }
  
  public void OooOo00(Configuration paramConfiguration)
  {
    boolean bool = this.o00o0Oo0;
    if (bool)
    {
      bool = this.o00o0O0;
      if (bool)
      {
        localObject = getSupportActionBar();
        if (localObject != null) {
          ((ActionBar)localObject).OooOO0O(paramConfiguration);
        }
      }
    }
    paramConfiguration = AppCompatDrawableManager.get();
    Object localObject = this.o00OoooO;
    paramConfiguration.OooO0o((Context)localObject);
    paramConfiguration = new android/content/res/Configuration;
    localObject = this.o00OoooO.getResources().getConfiguration();
    paramConfiguration.<init>((Configuration)localObject);
    this.o00o0oo0 = paramConfiguration;
    Oooo00o(false, false);
  }
  
  public void OooOo0O()
  {
    Object localObject1 = this.o0O00o0;
    boolean bool1 = localObject1 instanceof Activity;
    if (bool1) {
      AppCompatDelegate.OooOoo0(this);
    }
    bool1 = this.o00oO00o;
    if (bool1)
    {
      localObject1 = this.o00Ooooo.getDecorView();
      localObject2 = this.o00oO0;
      ((View)localObject1).removeCallbacks((Runnable)localObject2);
    }
    this.o00o0oOo = true;
    int i = this.o00o0oo;
    int j = -100;
    if (i != j)
    {
      localObject1 = this.o0O00o0;
      boolean bool3 = localObject1 instanceof Activity;
      if (bool3)
      {
        localObject1 = (Activity)localObject1;
        boolean bool2 = ((Activity)localObject1).isChangingConfigurations();
        if (bool2)
        {
          localObject1 = o00oOOo0;
          localObject2 = this.o0O00o0.getClass().getName();
          int k = this.o00o0oo;
          Integer localInteger = Integer.valueOf(k);
          ((SimpleArrayMap)localObject1).put(localObject2, localInteger);
          break label156;
        }
      }
    }
    localObject1 = o00oOOo0;
    Object localObject2 = this.o0O00o0.getClass().getName();
    ((SimpleArrayMap)localObject1).remove(localObject2);
    label156:
    localObject1 = this.o00o000O;
    if (localObject1 != null) {
      ((ActionBar)localObject1).OooOO0o();
    }
    Oooo0oo();
  }
  
  public void OooOo0o(Bundle paramBundle)
  {
    OoooOo0();
  }
  
  public void OooOoO()
  {
    Oooo00o(true, false);
  }
  
  public void OooOoO0(Bundle paramBundle) {}
  
  public void OooOoOO()
  {
    ActionBar localActionBar = getSupportActionBar();
    if (localActionBar != null) {
      localActionBar.setShowHideAnimationEnabled(false);
    }
  }
  
  public boolean OooOooO(int paramInt)
  {
    paramInt = o0O0O00(paramInt);
    boolean bool = this.o00o0o00;
    int j = 108;
    if ((bool) && (paramInt == j)) {
      return false;
    }
    bool = this.o00o0Oo0;
    int k = 1;
    if ((bool) && (paramInt == k)) {
      this.o00o0Oo0 = false;
    }
    if (paramInt != k)
    {
      int i = 2;
      if (paramInt != i)
      {
        i = 5;
        if (paramInt != i)
        {
          i = 10;
          if (paramInt != i)
          {
            if (paramInt != j)
            {
              i = 109;
              if (paramInt != i) {
                return this.o00Ooooo.requestFeature(paramInt);
              }
              o00000O();
              this.o00o0Oo = k;
              return k;
            }
            o00000O();
            this.o00o0Oo0 = k;
            return k;
          }
          o00000O();
          this.o00o0OoO = k;
          return k;
        }
        o00000O();
        this.o00o0OOo = k;
        return k;
      }
      o00000O();
      this.o00o0OOO = k;
      return k;
    }
    o00000O();
    this.o00o0o00 = k;
    return k;
  }
  
  public void OooOooo(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    OoooOo0();
    ViewGroup localViewGroup = (ViewGroup)this.o00o0O0O.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView, paramLayoutParams);
    paramView = this.o00o0000;
    paramLayoutParams = this.o00Ooooo.getCallback();
    paramView.OooO0O0(paramLayoutParams);
  }
  
  public void Oooo(int paramInt)
  {
    boolean bool = true;
    AppCompatDelegateImpl.PanelFeatureState localPanelFeatureState = Oooooo0(paramInt, bool);
    OoooO00(localPanelFeatureState, bool);
  }
  
  public final void Oooo0()
  {
    ContentFrameLayout localContentFrameLayout = (ContentFrameLayout)this.o00o0O0O.findViewById(16908290);
    Object localObject = this.o00Ooooo.getDecorView();
    int i = ((View)localObject).getPaddingLeft();
    int i1 = ((View)localObject).getPaddingTop();
    int i2 = ((View)localObject).getPaddingRight();
    int i3 = ((View)localObject).getPaddingBottom();
    localContentFrameLayout.OooO00o(i, i1, i2, i3);
    localObject = this.o00OoooO;
    int[] arrayOfInt = R.styleable.AppCompatTheme;
    localObject = ((Context)localObject).obtainStyledAttributes(arrayOfInt);
    i = R.styleable.AppCompatTheme_windowMinWidthMajor;
    TypedValue localTypedValue = localContentFrameLayout.getMinWidthMajor();
    ((TypedArray)localObject).getValue(i, localTypedValue);
    i = R.styleable.AppCompatTheme_windowMinWidthMinor;
    localTypedValue = localContentFrameLayout.getMinWidthMinor();
    ((TypedArray)localObject).getValue(i, localTypedValue);
    i = R.styleable.AppCompatTheme_windowFixedWidthMajor;
    boolean bool1 = ((TypedArray)localObject).hasValue(i);
    if (bool1)
    {
      j = R.styleable.AppCompatTheme_windowFixedWidthMajor;
      localTypedValue = localContentFrameLayout.getFixedWidthMajor();
      ((TypedArray)localObject).getValue(j, localTypedValue);
    }
    int j = R.styleable.AppCompatTheme_windowFixedWidthMinor;
    boolean bool2 = ((TypedArray)localObject).hasValue(j);
    if (bool2)
    {
      k = R.styleable.AppCompatTheme_windowFixedWidthMinor;
      localTypedValue = localContentFrameLayout.getFixedWidthMinor();
      ((TypedArray)localObject).getValue(k, localTypedValue);
    }
    int k = R.styleable.AppCompatTheme_windowFixedHeightMajor;
    boolean bool3 = ((TypedArray)localObject).hasValue(k);
    if (bool3)
    {
      m = R.styleable.AppCompatTheme_windowFixedHeightMajor;
      localTypedValue = localContentFrameLayout.getFixedHeightMajor();
      ((TypedArray)localObject).getValue(m, localTypedValue);
    }
    int m = R.styleable.AppCompatTheme_windowFixedHeightMinor;
    boolean bool4 = ((TypedArray)localObject).hasValue(m);
    if (bool4)
    {
      int n = R.styleable.AppCompatTheme_windowFixedHeightMinor;
      localTypedValue = localContentFrameLayout.getFixedHeightMinor();
      ((TypedArray)localObject).getValue(n, localTypedValue);
    }
    ((TypedArray)localObject).recycle();
    localContentFrameLayout.requestLayout();
  }
  
  public final boolean Oooo00O(boolean paramBoolean)
  {
    return Oooo00o(paramBoolean, true);
  }
  
  public final boolean Oooo00o(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool1 = this.o00o0oOo;
    if (bool1) {
      return false;
    }
    boolean bool2 = Oooo0o0();
    Context localContext = this.o00OoooO;
    int i = o00O0O(localContext, bool2);
    int j = Build.VERSION.SDK_INT;
    int k = 33;
    Object localObject1;
    if (j < k)
    {
      localObject1 = this.o00OoooO;
      localObject1 = Oooo0OO((Context)localObject1);
    }
    else
    {
      j = 0;
      localObject1 = null;
    }
    Object localObject2;
    if ((!paramBoolean2) && (localObject1 != null))
    {
      localObject2 = this.o00OoooO.getResources().getConfiguration();
      localObject1 = OooooOo((Configuration)localObject2);
    }
    paramBoolean1 = o00000o0(i, (LocaleListCompat)localObject1, paramBoolean1);
    if (!bool2)
    {
      localObject2 = this.o00OoooO;
      localObject2 = OooooOO((Context)localObject2);
      ((AppCompatDelegateImpl.AutoNightModeManager)localObject2).OooO0Oo();
    }
    else
    {
      localObject2 = this.o00oO000;
      if (localObject2 != null) {
        ((AppCompatDelegateImpl.AutoNightModeManager)localObject2).OooO00o();
      }
    }
    paramBoolean2 = true;
    if (bool2 == paramBoolean2)
    {
      localObject2 = this.o00OoooO;
      localObject2 = OooooO0((Context)localObject2);
      ((AppCompatDelegateImpl.AutoNightModeManager)localObject2).OooO0Oo();
    }
    else
    {
      localObject2 = this.o00oO00O;
      if (localObject2 != null) {
        ((AppCompatDelegateImpl.AutoNightModeManager)localObject2).OooO00o();
      }
    }
    return paramBoolean1;
  }
  
  public final void Oooo0O0(Window paramWindow)
  {
    Object localObject1 = this.o00Ooooo;
    Object localObject2 = "AppCompat has already installed itself into the Window";
    if (localObject1 == null)
    {
      localObject1 = paramWindow.getCallback();
      boolean bool = localObject1 instanceof AppCompatDelegateImpl.AppCompatWindowCallback;
      if (!bool)
      {
        localObject2 = new androidx/appcompat/app/AppCompatDelegateImpl$AppCompatWindowCallback;
        ((AppCompatDelegateImpl.AppCompatWindowCallback)localObject2).<init>(this, (Window.Callback)localObject1);
        this.o00o0000 = ((AppCompatDelegateImpl.AppCompatWindowCallback)localObject2);
        paramWindow.setCallback((Window.Callback)localObject2);
        localObject1 = this.o00OoooO;
        localObject2 = o00oOo00;
        bool = false;
        localObject1 = TintTypedArray.OooOOO((Context)localObject1, null, (int[])localObject2);
        localObject2 = ((TintTypedArray)localObject1).getDrawableIfKnown(0);
        if (localObject2 != null) {
          paramWindow.setBackgroundDrawable((Drawable)localObject2);
        }
        ((TintTypedArray)localObject1).OooOOOo();
        this.o00Ooooo = paramWindow;
        int i = Build.VERSION.SDK_INT;
        int j = 33;
        if (i >= j)
        {
          paramWindow = this.o00oOOOO;
          if (paramWindow == null) {
            setOnBackInvokedDispatcher(null);
          }
        }
        return;
      }
      paramWindow = new java/lang/IllegalStateException;
      paramWindow.<init>((String)localObject2);
      throw paramWindow;
    }
    paramWindow = new java/lang/IllegalStateException;
    paramWindow.<init>((String)localObject2);
    throw paramWindow;
  }
  
  public LocaleListCompat Oooo0OO(Context paramContext)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 33;
    if (i >= j) {
      return null;
    }
    LocaleListCompat localLocaleListCompat = AppCompatDelegate.getRequestedAppLocales();
    if (localLocaleListCompat == null) {
      return null;
    }
    paramContext = paramContext.getApplicationContext().getResources().getConfiguration();
    paramContext = OooooOo(paramContext);
    localLocaleListCompat = LocaleOverlayHelper.OooO0O0(localLocaleListCompat, paramContext);
    boolean bool = localLocaleListCompat.isEmpty();
    if (!bool) {
      paramContext = localLocaleListCompat;
    }
    return paramContext;
  }
  
  public void Oooo0o(int paramInt, AppCompatDelegateImpl.PanelFeatureState paramPanelFeatureState, Menu paramMenu)
  {
    Object localObject;
    if (paramMenu == null)
    {
      if ((paramPanelFeatureState == null) && (paramInt >= 0))
      {
        localObject = this.o00o0o0o;
        int i = localObject.length;
        if (paramInt < i) {
          paramPanelFeatureState = localObject[paramInt];
        }
      }
      if (paramPanelFeatureState != null) {
        paramMenu = paramPanelFeatureState.OooOO0;
      }
    }
    if (paramPanelFeatureState != null)
    {
      bool = paramPanelFeatureState.OooOOOO;
      if (!bool) {
        return;
      }
    }
    boolean bool = this.o00o0oOo;
    if (!bool)
    {
      paramPanelFeatureState = this.o00o0000;
      localObject = this.o00Ooooo.getCallback();
      paramPanelFeatureState.OooO0OO((Window.Callback)localObject, paramInt, paramMenu);
    }
  }
  
  public final int Oooo0o0()
  {
    int i = this.o00o0oo;
    int j = -100;
    if (i == j) {
      i = AppCompatDelegate.getDefaultNightMode();
    }
    return i;
  }
  
  public void Oooo0oO(MenuBuilder paramMenuBuilder)
  {
    boolean bool1 = this.o00o0o0O;
    if (bool1) {
      return;
    }
    bool1 = true;
    this.o00o0o0O = bool1;
    this.o00o00.OooO0oO();
    Window.Callback localCallback = getWindowCallback();
    if (localCallback != null)
    {
      boolean bool2 = this.o00o0oOo;
      if (!bool2)
      {
        int i = 108;
        localCallback.onPanelClosed(i, paramMenuBuilder);
      }
    }
    this.o00o0o0O = false;
  }
  
  public final void Oooo0oo()
  {
    AppCompatDelegateImpl.AutoNightModeManager localAutoNightModeManager = this.o00oO000;
    if (localAutoNightModeManager != null) {
      localAutoNightModeManager.OooO00o();
    }
    localAutoNightModeManager = this.o00oO00O;
    if (localAutoNightModeManager != null) {
      localAutoNightModeManager.OooO00o();
    }
  }
  
  public View OoooO(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    Object localObject1 = this.o00oOO;
    int i = 0;
    int j;
    if (localObject1 == null)
    {
      localObject1 = this.o00OoooO;
      localObject2 = R.styleable.AppCompatTheme;
      localObject1 = ((Context)localObject1).obtainStyledAttributes((int[])localObject2);
      j = R.styleable.AppCompatTheme_viewInflaterClass;
      localObject1 = ((TypedArray)localObject1).getString(j);
      if (localObject1 == null)
      {
        localObject1 = new androidx/appcompat/app/AppCompatViewInflater;
        ((AppCompatViewInflater)localObject1).<init>();
      }
      for (;;)
      {
        this.o00oOO = ((AppCompatViewInflater)localObject1);
        break;
        try
        {
          localObject2 = this.o00OoooO;
          localObject2 = ((Context)localObject2).getClassLoader();
          localObject2 = ((ClassLoader)localObject2).loadClass((String)localObject1);
          localObject3 = new Class[0];
          localObject2 = ((Class)localObject2).getDeclaredConstructor((Class[])localObject3);
          localObject3 = new Object[0];
          localObject2 = ((Constructor)localObject2).newInstance((Object[])localObject3);
          localObject2 = (AppCompatViewInflater)localObject2;
          this.o00oOO = ((AppCompatViewInflater)localObject2);
        }
        finally
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject3 = "Failed to instantiate custom view inflater ";
          ((StringBuilder)localObject2).append((String)localObject3);
          ((StringBuilder)localObject2).append((String)localObject1);
          ((StringBuilder)localObject2).append(". Falling back to default.");
          localObject1 = new androidx/appcompat/app/AppCompatViewInflater;
          ((AppCompatViewInflater)localObject1).<init>();
        }
      }
    }
    boolean bool1 = o00oOOoO;
    if (bool1)
    {
      localObject1 = this.o00oOOO0;
      if (localObject1 == null)
      {
        localObject1 = new androidx/appcompat/app/LayoutIncludeDetector;
        ((LayoutIncludeDetector)localObject1).<init>();
        this.o00oOOO0 = ((LayoutIncludeDetector)localObject1);
      }
      localObject1 = this.o00oOOO0;
      boolean bool2 = ((LayoutIncludeDetector)localObject1).OooO00o(paramAttributeSet);
      j = 1;
      if (bool2)
      {
        n = j;
        break label332;
      }
      bool2 = paramAttributeSet instanceof XmlPullParser;
      if (bool2)
      {
        localObject1 = paramAttributeSet;
        localObject1 = (XmlPullParser)paramAttributeSet;
        int k = ((XmlPullParser)localObject1).getDepth();
        if (k > j) {
          i = j;
        }
      }
      else
      {
        localObject1 = paramView;
        localObject1 = (ViewParent)paramView;
        int m = o000000O((ViewParent)localObject1);
        i = m;
      }
    }
    int n = i;
    label332:
    Object localObject2 = this.o00oOO;
    boolean bool3 = VectorEnabledTintResources.OooO00o();
    Object localObject3 = paramView;
    return ((AppCompatViewInflater)localObject2).createView(paramView, paramString, paramContext, (AttributeSet)paramAttributeSet, n, bool1, true, bool3);
  }
  
  public final Configuration OoooO0(Context paramContext, int paramInt, LocaleListCompat paramLocaleListCompat, Configuration paramConfiguration, boolean paramBoolean)
  {
    int i = 1;
    int j;
    if (paramInt != i)
    {
      i = 2;
      if (paramInt != i)
      {
        if (paramBoolean)
        {
          j = 0;
          paramContext = null;
        }
        else
        {
          paramContext = paramContext.getApplicationContext().getResources().getConfiguration();
          j = paramContext.uiMode & 0x30;
        }
      }
      else {
        j = 32;
      }
    }
    else
    {
      j = 16;
    }
    Configuration localConfiguration = new android/content/res/Configuration;
    localConfiguration.<init>();
    paramBoolean = false;
    localConfiguration.fontScale = 0.0F;
    if (paramConfiguration != null) {
      localConfiguration.setTo(paramConfiguration);
    }
    int k = localConfiguration.uiMode & 0xFFFFFFCF;
    j |= k;
    localConfiguration.uiMode = j;
    if (paramLocaleListCompat != null) {
      o000OOo(localConfiguration, paramLocaleListCompat);
    }
    return localConfiguration;
  }
  
  public void OoooO00(AppCompatDelegateImpl.PanelFeatureState paramPanelFeatureState, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      int i = paramPanelFeatureState.OooO00o;
      if (i == 0)
      {
        localObject = this.o00o00;
        if (localObject != null)
        {
          boolean bool1 = ((DecorContentParent)localObject).isOverflowMenuShowing();
          if (bool1)
          {
            paramPanelFeatureState = paramPanelFeatureState.OooOO0;
            Oooo0oO(paramPanelFeatureState);
            return;
          }
        }
      }
    }
    Object localObject = (WindowManager)this.o00OoooO.getSystemService("window");
    if (localObject != null)
    {
      boolean bool2 = paramPanelFeatureState.OooOOOO;
      if (bool2)
      {
        ViewGroup localViewGroup = paramPanelFeatureState.OooO0oO;
        if (localViewGroup != null)
        {
          ((ViewManager)localObject).removeView(localViewGroup);
          if (paramBoolean)
          {
            paramBoolean = paramPanelFeatureState.OooO00o;
            Oooo0o(paramBoolean, paramPanelFeatureState, null);
          }
        }
      }
    }
    paramPanelFeatureState.OooOOO0 = false;
    paramPanelFeatureState.OooOOO = false;
    paramPanelFeatureState.OooOOOO = false;
    paramPanelFeatureState.OooO0oo = null;
    paramBoolean = true;
    paramPanelFeatureState.OooOOo0 = paramBoolean;
    AppCompatDelegateImpl.PanelFeatureState localPanelFeatureState = this.o00o0o;
    if (localPanelFeatureState == paramPanelFeatureState) {
      this.o00o0o = null;
    }
    int j = paramPanelFeatureState.OooO00o;
    if (j == 0) {
      o0000Ooo();
    }
  }
  
  public final ViewGroup OoooO0O()
  {
    Object localObject1 = this.o00OoooO;
    Object localObject2 = R.styleable.AppCompatTheme;
    localObject1 = ((Context)localObject1).obtainStyledAttributes((int[])localObject2);
    int i = R.styleable.AppCompatTheme_windowActionBar;
    boolean bool1 = ((TypedArray)localObject1).hasValue(i);
    if (bool1)
    {
      int j = R.styleable.AppCompatTheme_windowNoTitle;
      boolean bool8 = false;
      AppCompatDelegateImpl.5 local5 = null;
      boolean bool2 = ((TypedArray)localObject1).getBoolean(j, false);
      int i4 = 1;
      if (bool2)
      {
        OooOooO(i4);
      }
      else
      {
        int k = R.styleable.AppCompatTheme_windowActionBar;
        boolean bool3 = ((TypedArray)localObject1).getBoolean(k, false);
        if (bool3)
        {
          m = 108;
          OooOooO(m);
        }
      }
      int m = R.styleable.AppCompatTheme_windowActionBarOverlay;
      boolean bool4 = ((TypedArray)localObject1).getBoolean(m, false);
      int i6 = 109;
      if (bool4) {
        OooOooO(i6);
      }
      int n = R.styleable.AppCompatTheme_windowActionModeOverlay;
      boolean bool5 = ((TypedArray)localObject1).getBoolean(n, false);
      if (bool5)
      {
        i1 = 10;
        OooOooO(i1);
      }
      int i1 = R.styleable.AppCompatTheme_android_windowIsFloating;
      boolean bool6 = ((TypedArray)localObject1).getBoolean(i1, false);
      this.o00o0Ooo = bool6;
      ((TypedArray)localObject1).recycle();
      OoooOoO();
      this.o00Ooooo.getDecorView();
      localObject1 = LayoutInflater.from(this.o00OoooO);
      bool6 = this.o00o0o00;
      int i8;
      Object localObject3;
      boolean bool7;
      int i3;
      if (!bool6)
      {
        bool6 = this.o00o0Ooo;
        int i2;
        if (bool6)
        {
          i2 = R.layout.abc_dialog_title_material;
          localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(i2, null);
          this.o00o0Oo = false;
          this.o00o0Oo0 = false;
        }
        else
        {
          boolean bool9 = this.o00o0Oo0;
          int i7;
          if (bool9)
          {
            localObject1 = new android/util/TypedValue;
            ((TypedValue)localObject1).<init>();
            localObject2 = this.o00OoooO.getTheme();
            i8 = R.attr.actionBarTheme;
            ((Resources.Theme)localObject2).resolveAttribute(i8, (TypedValue)localObject1, i4);
            i2 = ((TypedValue)localObject1).resourceId;
            if (i2 != 0)
            {
              localObject2 = new androidx/appcompat/view/ContextThemeWrapper;
              localObject3 = this.o00OoooO;
              i7 = ((TypedValue)localObject1).resourceId;
              ((androidx.appcompat.view.ContextThemeWrapper)localObject2).<init>((Context)localObject3, i7);
            }
            else
            {
              localObject2 = this.o00OoooO;
            }
            localObject1 = LayoutInflater.from((Context)localObject2);
            i2 = R.layout.abc_screen_toolbar;
            localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(i2, null);
            i2 = R.id.decor_content_parent;
            localObject2 = (DecorContentParent)((View)localObject1).findViewById(i2);
            this.o00o00 = ((DecorContentParent)localObject2);
            localObject3 = getWindowCallback();
            ((DecorContentParent)localObject2).setWindowCallback((Window.Callback)localObject3);
            bool7 = this.o00o0Oo;
            if (bool7)
            {
              localObject2 = this.o00o00;
              ((DecorContentParent)localObject2).OooO0o(i6);
            }
            bool7 = this.o00o0OOO;
            int i5;
            if (bool7)
            {
              localObject2 = this.o00o00;
              i5 = 2;
              ((DecorContentParent)localObject2).OooO0o(i5);
            }
            bool7 = this.o00o0OOo;
            if (bool7)
            {
              localObject2 = this.o00o00;
              i5 = 5;
              ((DecorContentParent)localObject2).OooO0o(i5);
            }
          }
          else
          {
            i7 = 0;
            localObject1 = null;
          }
        }
      }
      else
      {
        bool7 = this.o00o0OoO;
        if (bool7) {
          i3 = R.layout.abc_screen_simple_overlay_action_mode;
        } else {
          i3 = R.layout.abc_screen_simple;
        }
        localObject1 = (ViewGroup)((LayoutInflater)localObject1).inflate(i3, null);
      }
      if (localObject1 != null)
      {
        localObject2 = new androidx/appcompat/app/AppCompatDelegateImpl$3;
        ((AppCompatDelegateImpl.3)localObject2).<init>(this);
        ViewCompat.o00000O0((View)localObject1, (OnApplyWindowInsetsListener)localObject2);
        localObject2 = this.o00o00;
        if (localObject2 == null)
        {
          i3 = R.id.title;
          localObject2 = (TextView)((View)localObject1).findViewById(i3);
          this.o00o0OO0 = ((TextView)localObject2);
        }
        ViewUtils.OooO0OO((View)localObject1);
        i3 = R.id.action_bar_activity_content;
        localObject2 = (ContentFrameLayout)((View)localObject1).findViewById(i3);
        localObject3 = this.o00Ooooo;
        i6 = 16908290;
        localObject3 = (ViewGroup)((Window)localObject3).findViewById(i6);
        if (localObject3 != null)
        {
          for (;;)
          {
            i8 = ((ViewGroup)localObject3).getChildCount();
            if (i8 <= 0) {
              break;
            }
            View localView = ((ViewGroup)localObject3).getChildAt(0);
            ((ViewGroup)localObject3).removeViewAt(0);
            ((ViewGroup)localObject2).addView(localView);
          }
          ((View)localObject3).setId(-1);
          ((View)localObject2).setId(i6);
          bool8 = localObject3 instanceof FrameLayout;
          if (bool8)
          {
            localObject3 = (FrameLayout)localObject3;
            ((View)localObject3).setForeground(null);
          }
        }
        this.o00Ooooo.setContentView((View)localObject1);
        local5 = new androidx/appcompat/app/AppCompatDelegateImpl$5;
        local5.<init>(this);
        ((ContentFrameLayout)localObject2).setAttachListener(local5);
        return localObject1;
      }
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("AppCompat does not support the current theme features: { windowActionBar: ");
      bool8 = this.o00o0Oo0;
      ((StringBuilder)localObject2).append(bool8);
      ((StringBuilder)localObject2).append(", windowActionBarOverlay: ");
      bool8 = this.o00o0Oo;
      ((StringBuilder)localObject2).append(bool8);
      ((StringBuilder)localObject2).append(", android:windowIsFloating: ");
      bool8 = this.o00o0Ooo;
      ((StringBuilder)localObject2).append(bool8);
      ((StringBuilder)localObject2).append(", windowActionModeOverlay: ");
      bool8 = this.o00o0OoO;
      ((StringBuilder)localObject2).append(bool8);
      ((StringBuilder)localObject2).append(", windowNoTitle: ");
      bool8 = this.o00o0o00;
      ((StringBuilder)localObject2).append(bool8);
      ((StringBuilder)localObject2).append(" }");
      localObject2 = ((StringBuilder)localObject2).toString();
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    ((TypedArray)localObject1).recycle();
    localObject1 = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject1).<init>("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    throw ((Throwable)localObject1);
  }
  
  public void OoooOO0()
  {
    Object localObject = this.o00o00;
    if (localObject != null) {
      ((DecorContentParent)localObject).OooO0oO();
    }
    localObject = this.o00o00oO;
    if (localObject != null)
    {
      localObject = this.o00Ooooo.getDecorView();
      Runnable localRunnable = this.o00o00oo;
      ((View)localObject).removeCallbacks(localRunnable);
      localObject = this.o00o00oO;
      bool = ((PopupWindow)localObject).isShowing();
      if (!bool) {}
    }
    try
    {
      localObject = this.o00o00oO;
      ((PopupWindow)localObject).dismiss();
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      label66:
      break label66;
    }
    boolean bool = false;
    localObject = null;
    this.o00o00oO = null;
    OoooOOo();
    bool = false;
    localObject = Oooooo0(0, false);
    if (localObject != null)
    {
      localObject = ((AppCompatDelegateImpl.PanelFeatureState)localObject).OooOO0;
      if (localObject != null) {
        ((MenuBuilder)localObject).close();
      }
    }
  }
  
  public void OoooOOO(int paramInt)
  {
    boolean bool = true;
    AppCompatDelegateImpl.PanelFeatureState localPanelFeatureState1 = Oooooo0(paramInt, bool);
    Object localObject = localPanelFeatureState1.OooOO0;
    if (localObject != null)
    {
      localObject = new android/os/Bundle;
      ((Bundle)localObject).<init>();
      MenuBuilder localMenuBuilder = localPanelFeatureState1.OooOO0;
      localMenuBuilder.saveActionViewStates((Bundle)localObject);
      int j = ((BaseBundle)localObject).size();
      if (j > 0) {
        localPanelFeatureState1.OooOOoo = ((Bundle)localObject);
      }
      localPanelFeatureState1.OooOO0.stopDispatchingItemsChanged();
      localObject = localPanelFeatureState1.OooOO0;
      ((MenuBuilder)localObject).clear();
    }
    localPanelFeatureState1.OooOOo = bool;
    localPanelFeatureState1.OooOOo0 = bool;
    int i = 108;
    if ((paramInt == i) || (paramInt == 0))
    {
      DecorContentParent localDecorContentParent = this.o00o00;
      if (localDecorContentParent != null)
      {
        paramInt = 0;
        localDecorContentParent = null;
        AppCompatDelegateImpl.PanelFeatureState localPanelFeatureState2 = Oooooo0(0, false);
        if (localPanelFeatureState2 != null)
        {
          localPanelFeatureState2.OooOOO0 = false;
          paramInt = 0;
          localDecorContentParent = null;
          o0OO00O(localPanelFeatureState2, null);
        }
      }
    }
  }
  
  public void OoooOOo()
  {
    ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat = this.o00o0;
    if (localViewPropertyAnimatorCompat != null) {
      localViewPropertyAnimatorCompat.OooO0OO();
    }
  }
  
  public final void OoooOo0()
  {
    boolean bool1 = this.o00o0O0;
    if (!bool1)
    {
      Object localObject1 = OoooO0O();
      this.o00o0O0O = ((ViewGroup)localObject1);
      localObject1 = getTitle();
      boolean bool2 = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool2)
      {
        Object localObject2 = this.o00o00;
        if (localObject2 != null)
        {
          ((DecorContentParent)localObject2).setWindowTitle((CharSequence)localObject1);
        }
        else
        {
          localObject2 = o0OOO0o();
          if (localObject2 != null)
          {
            localObject2 = o0OOO0o();
            ((ActionBar)localObject2).setWindowTitle((CharSequence)localObject1);
          }
          else
          {
            localObject2 = this.o00o0OO0;
            if (localObject2 != null) {
              ((TextView)localObject2).setText((CharSequence)localObject1);
            }
          }
        }
      }
      Oooo0();
      localObject1 = this.o00o0O0O;
      o0ooOOo((ViewGroup)localObject1);
      this.o00o0O0 = true;
      bool1 = false;
      localObject1 = Oooooo0(0, false);
      bool2 = this.o00o0oOo;
      if (!bool2) {
        if (localObject1 != null)
        {
          localObject1 = ((AppCompatDelegateImpl.PanelFeatureState)localObject1).OooOO0;
          if (localObject1 != null) {}
        }
        else
        {
          int i = 108;
          ooOO(i);
        }
      }
    }
  }
  
  public final void OoooOoO()
  {
    Object localObject = this.o00Ooooo;
    if (localObject == null)
    {
      localObject = this.o0O00o0;
      boolean bool = localObject instanceof Activity;
      if (bool)
      {
        localObject = ((Activity)localObject).getWindow();
        Oooo0O0((Window)localObject);
      }
    }
    localObject = this.o00Ooooo;
    if (localObject != null) {
      return;
    }
    localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>("We have not been given a Window");
    throw ((Throwable)localObject);
  }
  
  public AppCompatDelegateImpl.PanelFeatureState OoooOoo(Menu paramMenu)
  {
    AppCompatDelegateImpl.PanelFeatureState[] arrayOfPanelFeatureState = this.o00o0o0o;
    int i = 0;
    int j;
    if (arrayOfPanelFeatureState != null) {
      j = arrayOfPanelFeatureState.length;
    } else {
      j = 0;
    }
    while (i < j)
    {
      AppCompatDelegateImpl.PanelFeatureState localPanelFeatureState = arrayOfPanelFeatureState[i];
      if (localPanelFeatureState != null)
      {
        MenuBuilder localMenuBuilder = localPanelFeatureState.OooOO0;
        if (localMenuBuilder == paramMenu) {
          return localPanelFeatureState;
        }
      }
      i += 1;
    }
    return null;
  }
  
  public final int Ooooo0o(Context paramContext)
  {
    boolean bool = this.o00oo000;
    if (!bool)
    {
      Object localObject1 = this.o0O00o0;
      bool = localObject1 instanceof Activity;
      if (bool)
      {
        localObject1 = paramContext.getPackageManager();
        if (localObject1 == null) {
          return 0;
        }
        try
        {
          int i = Build.VERSION.SDK_INT;
          int j = 29;
          if (i >= j) {
            i = 269221888;
          } else {
            i = 786432;
          }
          ComponentName localComponentName = new android/content/ComponentName;
          Object localObject2 = this.o0O00o0;
          localObject2 = localObject2.getClass();
          localComponentName.<init>(paramContext, (Class)localObject2);
          paramContext = ((PackageManager)localObject1).getActivityInfo(localComponentName, i);
          if (paramContext != null)
          {
            int k = paramContext.configChanges;
            this.o00o = k;
          }
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException)
        {
          this.o00o = 0;
        }
      }
    }
    this.o00oo000 = true;
    return this.o00o;
  }
  
  public final AppCompatDelegateImpl.AutoNightModeManager OooooO0(Context paramContext)
  {
    Object localObject = this.o00oO00O;
    if (localObject == null)
    {
      localObject = new androidx/appcompat/app/AppCompatDelegateImpl$AutoBatteryNightModeManager;
      ((AppCompatDelegateImpl.AutoBatteryNightModeManager)localObject).<init>(this, paramContext);
      this.o00oO00O = ((AppCompatDelegateImpl.AutoNightModeManager)localObject);
    }
    return this.o00oO00O;
  }
  
  public final AppCompatDelegateImpl.AutoNightModeManager OooooOO(Context paramContext)
  {
    Object localObject = this.o00oO000;
    if (localObject == null)
    {
      localObject = new androidx/appcompat/app/AppCompatDelegateImpl$AutoTimeNightModeManager;
      paramContext = TwilightManager.OooO00o(paramContext);
      ((AppCompatDelegateImpl.AutoTimeNightModeManager)localObject).<init>(this, paramContext);
      this.o00oO000 = ((AppCompatDelegateImpl.AutoNightModeManager)localObject);
    }
    return this.o00oO000;
  }
  
  public LocaleListCompat OooooOo(Configuration paramConfiguration)
  {
    return AppCompatDelegateImpl.Api24Impl.OooO0O0(paramConfiguration);
  }
  
  public final void Oooooo()
  {
    OoooOo0();
    boolean bool1 = this.o00o0Oo0;
    if (bool1)
    {
      Object localObject1 = this.o00o000O;
      if (localObject1 == null)
      {
        localObject1 = this.o0O00o0;
        boolean bool2 = localObject1 instanceof Activity;
        Object localObject2;
        if (bool2)
        {
          localObject1 = new androidx/appcompat/app/WindowDecorActionBar;
          localObject2 = (Activity)this.o0O00o0;
          boolean bool3 = this.o00o0Oo;
          ((WindowDecorActionBar)localObject1).<init>((Activity)localObject2, bool3);
        }
        for (;;)
        {
          this.o00o000O = ((ActionBar)localObject1);
          break;
          bool1 = localObject1 instanceof Dialog;
          if (!bool1) {
            break;
          }
          localObject1 = new androidx/appcompat/app/WindowDecorActionBar;
          localObject2 = (Dialog)this.o0O00o0;
          ((WindowDecorActionBar)localObject1).<init>((Dialog)localObject2);
        }
        localObject1 = this.o00o000O;
        if (localObject1 != null)
        {
          bool2 = this.o00oO0O0;
          ((ActionBar)localObject1).setDefaultDisplayHomeAsUpEnabled(bool2);
        }
      }
    }
  }
  
  public AppCompatDelegateImpl.PanelFeatureState Oooooo0(int paramInt, boolean paramBoolean)
  {
    Object localObject1 = this.o00o0o0o;
    int i;
    if (localObject1 != null)
    {
      i = localObject1.length;
      if (i > paramInt) {}
    }
    else
    {
      i = paramInt + 1;
      localObject2 = new AppCompatDelegateImpl.PanelFeatureState[i];
      if (localObject1 != null)
      {
        int j = localObject1.length;
        System.arraycopy(localObject1, 0, localObject2, 0, j);
      }
      this.o00o0o0o = ((AppCompatDelegateImpl.PanelFeatureState[])localObject2);
      localObject1 = localObject2;
    }
    Object localObject2 = localObject1[paramInt];
    if (localObject2 == null)
    {
      localObject2 = new androidx/appcompat/app/AppCompatDelegateImpl$PanelFeatureState;
      ((AppCompatDelegateImpl.PanelFeatureState)localObject2).<init>(paramInt);
      localObject1[paramInt] = localObject2;
    }
    return localObject2;
  }
  
  public final boolean OoooooO(AppCompatDelegateImpl.PanelFeatureState paramPanelFeatureState)
  {
    Object localObject = paramPanelFeatureState.OooO;
    boolean bool = true;
    if (localObject != null)
    {
      paramPanelFeatureState.OooO0oo = ((View)localObject);
      return bool;
    }
    localObject = paramPanelFeatureState.OooOO0;
    if (localObject == null) {
      return false;
    }
    localObject = this.o00o00Oo;
    if (localObject == null)
    {
      localObject = new androidx/appcompat/app/AppCompatDelegateImpl$PanelMenuPresenterCallback;
      ((AppCompatDelegateImpl.PanelMenuPresenterCallback)localObject).<init>(this);
      this.o00o00Oo = ((AppCompatDelegateImpl.PanelMenuPresenterCallback)localObject);
    }
    localObject = this.o00o00Oo;
    localObject = (View)paramPanelFeatureState.OooO00o((MenuPresenter.Callback)localObject);
    paramPanelFeatureState.OooO0oo = ((View)localObject);
    if (localObject == null) {
      bool = false;
    }
    return bool;
  }
  
  public final boolean Ooooooo(AppCompatDelegateImpl.PanelFeatureState paramPanelFeatureState)
  {
    Object localObject = getActionBarThemedContext();
    paramPanelFeatureState.setStyle((Context)localObject);
    localObject = new androidx/appcompat/app/AppCompatDelegateImpl$ListMenuDecorView;
    Context localContext = paramPanelFeatureState.OooOO0o;
    ((AppCompatDelegateImpl.ListMenuDecorView)localObject).<init>(this, localContext);
    paramPanelFeatureState.OooO0oO = ((ViewGroup)localObject);
    paramPanelFeatureState.OooO0OO = 81;
    return true;
  }
  
  public final Context getActionBarThemedContext()
  {
    Object localObject = getSupportActionBar();
    if (localObject != null) {
      localObject = ((ActionBar)localObject).getThemedContext();
    } else {
      localObject = null;
    }
    if (localObject == null) {
      localObject = this.o00OoooO;
    }
    return localObject;
  }
  
  public final AppCompatDelegateImpl.AutoNightModeManager getAutoTimeNightModeManager()
  {
    Context localContext = this.o00OoooO;
    return OooooOO(localContext);
  }
  
  public Context getContextForDelegate()
  {
    return this.o00OoooO;
  }
  
  public final ActionBarDrawerToggle.Delegate getDrawerToggleDelegate()
  {
    AppCompatDelegateImpl.ActionBarDrawableToggleImpl localActionBarDrawableToggleImpl = new androidx/appcompat/app/AppCompatDelegateImpl$ActionBarDrawableToggleImpl;
    localActionBarDrawableToggleImpl.<init>(this);
    return localActionBarDrawableToggleImpl;
  }
  
  public int getLocalNightMode()
  {
    return this.o00o0oo;
  }
  
  public MenuInflater getMenuInflater()
  {
    Object localObject1 = this.o00o000o;
    if (localObject1 == null)
    {
      Oooooo();
      localObject1 = new androidx/appcompat/view/SupportMenuInflater;
      Object localObject2 = this.o00o000O;
      if (localObject2 != null) {
        localObject2 = ((ActionBar)localObject2).getThemedContext();
      } else {
        localObject2 = this.o00OoooO;
      }
      ((SupportMenuInflater)localObject1).<init>((Context)localObject2);
      this.o00o000o = ((MenuInflater)localObject1);
    }
    return this.o00o000o;
  }
  
  public ViewGroup getSubDecor()
  {
    return this.o00o0O0O;
  }
  
  public ActionBar getSupportActionBar()
  {
    Oooooo();
    return this.o00o000O;
  }
  
  public final CharSequence getTitle()
  {
    Object localObject = this.o0O00o0;
    boolean bool = localObject instanceof Activity;
    if (bool) {
      return ((Activity)localObject).getTitle();
    }
    return this.oo00oO;
  }
  
  public final Window.Callback getWindowCallback()
  {
    return this.o00Ooooo.getCallback();
  }
  
  public boolean isHandleNativeActionModesEnabled()
  {
    return this.o00o0O00;
  }
  
  public final void o0000(View paramView)
  {
    int i = ViewCompat.Oooo0oo(paramView) & 0x2000;
    Context localContext;
    if (i != 0)
    {
      i = 1;
    }
    else
    {
      i = 0;
      localContext = null;
    }
    int j;
    if (i != 0)
    {
      localContext = this.o00OoooO;
      j = R.color.abc_decor_view_status_guard_light;
    }
    else
    {
      localContext = this.o00OoooO;
      j = R.color.abc_decor_view_status_guard;
    }
    i = ContextCompat.OooO0OO(localContext, j);
    paramView.setBackgroundColor(i);
  }
  
  public ActionMode o00000(ActionMode.Callback paramCallback)
  {
    if (paramCallback != null)
    {
      Object localObject = this.o00o00o0;
      if (localObject != null) {
        ((ActionMode)localObject).OooO00o();
      }
      localObject = new androidx/appcompat/app/AppCompatDelegateImpl$ActionModeCallbackWrapperV9;
      ((AppCompatDelegateImpl.ActionModeCallbackWrapperV9)localObject).<init>(this, paramCallback);
      paramCallback = getSupportActionBar();
      if (paramCallback != null)
      {
        paramCallback = paramCallback.OooOOOo((ActionMode.Callback)localObject);
        this.o00o00o0 = paramCallback;
        if (paramCallback != null)
        {
          AppCompatCallback localAppCompatCallback = this.o00o000;
          if (localAppCompatCallback != null) {
            localAppCompatCallback.onSupportActionModeStarted(paramCallback);
          }
        }
      }
      paramCallback = this.o00o00o0;
      if (paramCallback == null)
      {
        paramCallback = o00000O0((ActionMode.Callback)localObject);
        this.o00o00o0 = paramCallback;
      }
      o0000Ooo();
      return this.o00o00o0;
    }
    paramCallback = new java/lang/IllegalArgumentException;
    paramCallback.<init>("ActionMode callback can not be null.");
    throw paramCallback;
  }
  
  public final boolean o000000()
  {
    boolean bool = this.o00o0O0;
    if (bool)
    {
      localViewGroup = this.o00o0O0O;
      if (localViewGroup != null)
      {
        bool = ViewCompat.OoooOOO(localViewGroup);
        if (bool) {
          return true;
        }
      }
    }
    bool = false;
    ViewGroup localViewGroup = null;
    return bool;
  }
  
  public final boolean o000000O(ViewParent paramViewParent)
  {
    if (paramViewParent == null) {
      return false;
    }
    View localView = this.o00Ooooo.getDecorView();
    for (;;)
    {
      if (paramViewParent == null) {
        return true;
      }
      if (paramViewParent == localView) {
        break;
      }
      boolean bool = paramViewParent instanceof View;
      if (!bool) {
        break;
      }
      Object localObject = paramViewParent;
      localObject = (View)paramViewParent;
      bool = ViewCompat.o000oOoO((View)localObject);
      if (bool) {
        break;
      }
      paramViewParent = ((ViewParent)paramViewParent).getParent();
    }
    return false;
  }
  
  public boolean o000000o()
  {
    Object localObject = this.o00oOOOO;
    if (localObject == null) {
      return false;
    }
    localObject = Oooooo0(0, false);
    boolean bool1 = true;
    if (localObject != null)
    {
      boolean bool2 = ((AppCompatDelegateImpl.PanelFeatureState)localObject).OooOOOO;
      if (bool2) {
        return bool1;
      }
    }
    localObject = this.o00o00o0;
    if (localObject != null) {
      return bool1;
    }
    return false;
  }
  
  public final void o00000O()
  {
    boolean bool = this.o00o0O0;
    if (!bool) {
      return;
    }
    AndroidRuntimeException localAndroidRuntimeException = new android/util/AndroidRuntimeException;
    localAndroidRuntimeException.<init>("Window feature must be requested before adding content");
    throw localAndroidRuntimeException;
  }
  
  public ActionMode o00000O0(ActionMode.Callback paramCallback)
  {
    OoooOOo();
    Object localObject1 = this.o00o00o0;
    if (localObject1 != null) {
      ((ActionMode)localObject1).OooO00o();
    }
    boolean bool1 = paramCallback instanceof AppCompatDelegateImpl.ActionModeCallbackWrapperV9;
    if (!bool1)
    {
      localObject1 = new androidx/appcompat/app/AppCompatDelegateImpl$ActionModeCallbackWrapperV9;
      ((AppCompatDelegateImpl.ActionModeCallbackWrapperV9)localObject1).<init>(this, paramCallback);
      paramCallback = (ActionMode.Callback)localObject1;
    }
    localObject1 = this.o00o000;
    boolean bool2;
    if (localObject1 != null)
    {
      bool2 = this.o00o0oOo;
      if (!bool2) {
        try
        {
          localObject1 = ((AppCompatCallback)localObject1).onWindowStartingSupportActionMode((ActionMode.Callback)paramCallback);
        }
        catch (AbstractMethodError localAbstractMethodError) {}
      }
    }
    bool1 = false;
    localObject1 = null;
    float f = 0.0F;
    if (localObject1 != null)
    {
      this.o00o00o0 = ((ActionMode)localObject1);
    }
    else
    {
      localObject1 = this.o00o00o;
      bool2 = false;
      boolean bool3 = true;
      Object localObject2;
      Object localObject3;
      Object localObject4;
      int i;
      if (localObject1 == null)
      {
        bool1 = this.o00o0Ooo;
        int k;
        if (bool1)
        {
          localObject1 = new android/util/TypedValue;
          ((TypedValue)localObject1).<init>();
          localObject2 = this.o00OoooO.getTheme();
          int j = R.attr.actionBarTheme;
          ((Resources.Theme)localObject2).resolveAttribute(j, (TypedValue)localObject1, bool3);
          j = ((TypedValue)localObject1).resourceId;
          if (j != 0)
          {
            localObject3 = this.o00OoooO.getResources().newTheme();
            ((Resources.Theme)localObject3).setTo((Resources.Theme)localObject2);
            k = ((TypedValue)localObject1).resourceId;
            ((Resources.Theme)localObject3).applyStyle(k, bool3);
            localObject2 = new androidx/appcompat/view/ContextThemeWrapper;
            localObject4 = this.o00OoooO;
            ((androidx.appcompat.view.ContextThemeWrapper)localObject2).<init>((Context)localObject4, 0);
            localObject4 = ((Context)localObject2).getTheme();
            ((Resources.Theme)localObject4).setTo((Resources.Theme)localObject3);
          }
          else
          {
            localObject2 = this.o00OoooO;
          }
          localObject3 = new androidx/appcompat/widget/ActionBarContextView;
          ((ActionBarContextView)localObject3).<init>((Context)localObject2);
          this.o00o00o = ((ActionBarContextView)localObject3);
          localObject3 = new android/widget/PopupWindow;
          int m = R.attr.actionModePopupWindowStyle;
          ((PopupWindow)localObject3).<init>((Context)localObject2, null, m);
          this.o00o00oO = ((PopupWindow)localObject3);
          PopupWindowCompat.OooO0O0((PopupWindow)localObject3, 2);
          localObject3 = this.o00o00oO;
          localObject4 = this.o00o00o;
          ((PopupWindow)localObject3).setContentView((View)localObject4);
          this.o00o00oO.setWidth(-1);
          localObject3 = ((Context)localObject2).getTheme();
          m = R.attr.actionBarSize;
          ((Resources.Theme)localObject3).resolveAttribute(m, (TypedValue)localObject1, bool3);
          i = ((TypedValue)localObject1).data;
          localObject2 = ((Context)localObject2).getResources().getDisplayMetrics();
          i = TypedValue.complexToDimensionPixelSize(i, (DisplayMetrics)localObject2);
          localObject2 = this.o00o00o;
          ((ActionBarContextView)localObject2).setContentHeight(i);
          localObject1 = this.o00o00oO;
          k = -2;
          ((PopupWindow)localObject1).setHeight(k);
          localObject1 = new androidx/appcompat/app/AppCompatDelegateImpl$6;
          ((AppCompatDelegateImpl.6)localObject1).<init>(this);
          this.o00o00oo = ((Runnable)localObject1);
        }
        else
        {
          localObject1 = this.o00o0O0O;
          k = R.id.action_mode_bar_stub;
          localObject1 = (ViewStubCompat)((View)localObject1).findViewById(k);
          if (localObject1 != null)
          {
            localObject2 = LayoutInflater.from(getActionBarThemedContext());
            ((ViewStubCompat)localObject1).setLayoutInflater((LayoutInflater)localObject2);
            localObject1 = (ActionBarContextView)((ViewStubCompat)localObject1).OooO00o();
            this.o00o00o = ((ActionBarContextView)localObject1);
          }
        }
      }
      localObject1 = this.o00o00o;
      if (localObject1 != null)
      {
        OoooOOo();
        this.o00o00o.OooOO0O();
        localObject1 = new androidx/appcompat/view/StandaloneActionMode;
        localObject2 = this.o00o00o.getContext();
        localObject3 = this.o00o00o;
        localObject4 = this.o00o00oO;
        if (localObject4 != null)
        {
          bool3 = false;
          localMenu = null;
        }
        ((StandaloneActionMode)localObject1).<init>((Context)localObject2, (ActionBarContextView)localObject3, (ActionMode.Callback)paramCallback, bool3);
        Menu localMenu = ((ActionMode)localObject1).getMenu();
        boolean bool4 = ((ActionMode.Callback)paramCallback).OooO0O0((ActionMode)localObject1, localMenu);
        if (bool4)
        {
          ((ActionMode)localObject1).OooO0O0();
          paramCallback = this.o00o00o;
          paramCallback.OooO((ActionMode)localObject1);
          this.o00o00o0 = ((ActionMode)localObject1);
          bool4 = o000000();
          i = 1065353216;
          f = 1.0F;
          if (bool4)
          {
            this.o00o00o.setAlpha(0.0F);
            paramCallback = ViewCompat.OooO0o0(this.o00o00o).OooO0O0(f);
            this.o00o0 = paramCallback;
            localObject1 = new androidx/appcompat/app/AppCompatDelegateImpl$7;
            ((AppCompatDelegateImpl.7)localObject1).<init>(this);
            paramCallback.OooO0oO((ViewPropertyAnimatorListener)localObject1);
          }
          else
          {
            this.o00o00o.setAlpha(f);
            this.o00o00o.setVisibility(0);
            paramCallback = this.o00o00o.getParent();
            bool4 = paramCallback instanceof View;
            if (bool4)
            {
              paramCallback = (View)this.o00o00o.getParent();
              ViewCompat.o00o0O(paramCallback);
            }
          }
          paramCallback = this.o00o00oO;
          if (paramCallback != null)
          {
            paramCallback = this.o00Ooooo.getDecorView();
            localObject1 = this.o00o00oo;
            paramCallback.post((Runnable)localObject1);
          }
        }
        else
        {
          this.o00o00o0 = null;
        }
      }
    }
    paramCallback = this.o00o00o0;
    if (paramCallback != null)
    {
      localObject1 = this.o00o000;
      if (localObject1 != null) {
        ((AppCompatCallback)localObject1).onSupportActionModeStarted(paramCallback);
      }
    }
    o0000Ooo();
    return this.o00o00o0;
  }
  
  public final AppCompatActivity o00000OO()
  {
    for (Context localContext = this.o00OoooO; localContext != null; localContext = ((ContextWrapper)localContext).getBaseContext())
    {
      boolean bool = localContext instanceof AppCompatActivity;
      if (bool) {
        return (AppCompatActivity)localContext;
      }
      bool = localContext instanceof ContextWrapper;
      if (!bool) {
        break;
      }
    }
    return null;
  }
  
  public final void o00000Oo(Configuration paramConfiguration)
  {
    Activity localActivity = (Activity)this.o0O00o0;
    boolean bool = localActivity instanceof LifecycleOwner;
    if (bool)
    {
      Object localObject = localActivity;
      localObject = ((LifecycleOwner)localActivity).getLifecycle().getCurrentState();
      Lifecycle.State localState = Lifecycle.State.o00Ooo0;
      bool = ((Lifecycle.State)localObject).OooO0OO(localState);
      if (!bool) {
        return;
      }
    }
    else
    {
      bool = this.o00o0oOO;
      if (!bool) {
        return;
      }
      bool = this.o00o0oOo;
      if (bool) {
        return;
      }
    }
    ((Activity)localActivity).onConfigurationChanged(paramConfiguration);
  }
  
  public final boolean o00000o0(int paramInt, LocaleListCompat paramLocaleListCompat, boolean paramBoolean)
  {
    Context localContext = this.o00OoooO;
    int i = 0;
    Object localObject1 = this;
    int j = paramInt;
    localObject1 = OoooO0(localContext, paramInt, paramLocaleListCompat, null, false);
    localContext = this.o00OoooO;
    int m = Ooooo0o(localContext);
    Object localObject2 = this.o00o0oo0;
    if (localObject2 == null) {
      localObject2 = this.o00OoooO.getResources().getConfiguration();
    }
    boolean bool4 = ((Configuration)localObject2).uiMode & 0x30;
    i = ((Configuration)localObject1).uiMode & 0x30;
    localObject2 = OooooOo((Configuration)localObject2);
    if (paramLocaleListCompat == null) {
      localObject1 = null;
    } else {
      localObject1 = OooooOo((Configuration)localObject1);
    }
    boolean bool5 = false;
    if (bool4 != i) {
      bool4 = true;
    } else {
      bool4 = false;
    }
    if (localObject1 != null)
    {
      boolean bool1 = ((LocaleListCompat)localObject2).equals(localObject1);
      if (!bool1)
      {
        k = bool4 | true;
        bool4 = k | 0x2000;
      }
    }
    int k = (m ^ 0xFFFFFFFF) & bool4;
    boolean bool6 = true;
    float f1 = 1.4E-45F;
    if ((k != 0) && (paramBoolean))
    {
      paramBoolean = this.o00o0oO;
      if (paramBoolean)
      {
        paramBoolean = o00oOooO;
        if (!paramBoolean)
        {
          paramBoolean = this.o00o0oOO;
          if (!paramBoolean) {}
        }
        else
        {
          localObject3 = this.o0O00o0;
          boolean bool2 = localObject3 instanceof Activity;
          if (bool2)
          {
            localObject3 = (Activity)localObject3;
            paramBoolean = ((Activity)localObject3).isChild();
            if (!paramBoolean)
            {
              localObject3 = (Activity)this.o0O00o0;
              ActivityCompat.OooOOO((Activity)localObject3);
              paramBoolean = bool6;
              f2 = f1;
              break label282;
            }
          }
        }
      }
    }
    paramBoolean = false;
    Object localObject3 = null;
    float f2 = 0.0F;
    label282:
    if ((!paramBoolean) && (bool4))
    {
      paramBoolean = bool4 & m;
      if (paramBoolean == bool4) {
        bool5 = bool6;
      }
      o00000oO(i, (LocaleListCompat)localObject1, bool5, null);
    }
    else
    {
      bool6 = paramBoolean;
      f1 = f2;
    }
    Object localObject4;
    if (bool6)
    {
      localObject3 = this.o0O00o0;
      boolean bool3 = localObject3 instanceof AppCompatActivity;
      if (bool3)
      {
        int n = bool4 & true;
        if (n != 0)
        {
          localObject3 = (AppCompatActivity)localObject3;
          ((AppCompatActivity)localObject3).Ooooo00(paramInt);
        }
        paramInt = bool4 & true;
        if (paramInt != 0)
        {
          localObject4 = (AppCompatActivity)this.o0O00o0;
          ((AppCompatActivity)localObject4).OoooOoo(paramLocaleListCompat);
        }
      }
    }
    if ((bool6) && (localObject1 != null))
    {
      localObject4 = this.o00OoooO.getResources().getConfiguration();
      localObject4 = OooooOo((Configuration)localObject4);
      setDefaultLocalesForLocaleList((LocaleListCompat)localObject4);
    }
    return bool6;
  }
  
  public final void o00000oO(int paramInt, LocaleListCompat paramLocaleListCompat, boolean paramBoolean, Configuration paramConfiguration)
  {
    Resources localResources = this.o00OoooO.getResources();
    Configuration localConfiguration1 = new android/content/res/Configuration;
    Configuration localConfiguration2 = localResources.getConfiguration();
    localConfiguration1.<init>(localConfiguration2);
    if (paramConfiguration != null) {
      localConfiguration1.updateFrom(paramConfiguration);
    }
    paramConfiguration = localResources.getConfiguration();
    int i = paramConfiguration.uiMode & 0xFFFFFFCF;
    paramInt |= i;
    localConfiguration1.uiMode = paramInt;
    if (paramLocaleListCompat != null) {
      o000OOo(localConfiguration1, paramLocaleListCompat);
    }
    Object localObject = null;
    localResources.updateConfiguration(localConfiguration1, null);
    paramInt = this.o00o0ooo;
    if (paramInt != 0)
    {
      paramLocaleListCompat = this.o00OoooO;
      paramLocaleListCompat.setTheme(paramInt);
      localObject = this.o00OoooO.getTheme();
      int j = this.o00o0ooo;
      i = 1;
      ((Resources.Theme)localObject).applyStyle(j, i);
    }
    if (paramBoolean)
    {
      localObject = this.o0O00o0;
      paramInt = localObject instanceof Activity;
      if (paramInt != 0) {
        o00000Oo(localConfiguration1);
      }
    }
  }
  
  public final int o00000oo(WindowInsetsCompat paramWindowInsetsCompat, Rect paramRect)
  {
    int i = 0;
    int j;
    if (paramWindowInsetsCompat != null) {
      j = paramWindowInsetsCompat.getSystemWindowInsetTop();
    } else if (paramRect != null) {
      j = paramRect.top;
    } else {
      j = 0;
    }
    Object localObject1 = this.o00o00o;
    int k = 8;
    if (localObject1 != null)
    {
      localObject1 = ((View)localObject1).getLayoutParams();
      boolean bool1 = localObject1 instanceof ViewGroup.MarginLayoutParams;
      if (bool1)
      {
        localObject1 = (ViewGroup.MarginLayoutParams)this.o00o00o.getLayoutParams();
        Object localObject2 = this.o00o00o;
        boolean bool2 = ((View)localObject2).isShown();
        int n = 1;
        float f1 = 1.4E-45F;
        if (bool2)
        {
          localObject2 = this.o0oOOo;
          if (localObject2 == null)
          {
            localObject2 = new android/graphics/Rect;
            ((Rect)localObject2).<init>();
            this.o0oOOo = ((Rect)localObject2);
            localObject2 = new android/graphics/Rect;
            ((Rect)localObject2).<init>();
            this.o0ooOO = ((Rect)localObject2);
          }
          localObject2 = this.o0oOOo;
          Object localObject3 = this.o0ooOO;
          int i2;
          if (paramWindowInsetsCompat == null)
          {
            ((Rect)localObject2).set(paramRect);
          }
          else
          {
            i1 = paramWindowInsetsCompat.getSystemWindowInsetLeft();
            i2 = paramWindowInsetsCompat.getSystemWindowInsetTop();
            i3 = paramWindowInsetsCompat.getSystemWindowInsetRight();
            i4 = paramWindowInsetsCompat.getSystemWindowInsetBottom();
            ((Rect)localObject2).set(i1, i2, i3, i4);
          }
          paramWindowInsetsCompat = this.o00o0O0O;
          ViewUtils.OooO00o(paramWindowInsetsCompat, (Rect)localObject2, (Rect)localObject3);
          int i4 = ((Rect)localObject2).top;
          int i1 = ((Rect)localObject2).left;
          int m = ((Rect)localObject2).right;
          localObject3 = ViewCompat.Oooo00o(this.o00o0O0O);
          if (localObject3 == null) {
            i2 = 0;
          } else {
            i2 = ((WindowInsetsCompat)localObject3).getSystemWindowInsetLeft();
          }
          int i6;
          if (localObject3 == null)
          {
            i6 = 0;
            localObject3 = null;
          }
          else
          {
            i6 = ((WindowInsetsCompat)localObject3).getSystemWindowInsetRight();
          }
          int i3 = ((ViewGroup.MarginLayoutParams)localObject1).topMargin;
          if (i3 == i4)
          {
            i3 = ((ViewGroup.MarginLayoutParams)localObject1).leftMargin;
            if (i3 == i1)
            {
              i3 = ((ViewGroup.MarginLayoutParams)localObject1).rightMargin;
              if (i3 == m)
              {
                i1 = 0;
                paramRect = null;
                f2 = 0.0F;
                break label374;
              }
            }
          }
          ((ViewGroup.MarginLayoutParams)localObject1).topMargin = i4;
          ((ViewGroup.MarginLayoutParams)localObject1).leftMargin = i1;
          ((ViewGroup.MarginLayoutParams)localObject1).rightMargin = m;
          i1 = n;
          float f2 = f1;
          label374:
          if (i4 > 0)
          {
            paramWindowInsetsCompat = this.o00o0OO;
            if (paramWindowInsetsCompat == null)
            {
              paramWindowInsetsCompat = new android/view/View;
              localObject2 = this.o00OoooO;
              paramWindowInsetsCompat.<init>((Context)localObject2);
              this.o00o0OO = paramWindowInsetsCompat;
              paramWindowInsetsCompat.setVisibility(k);
              paramWindowInsetsCompat = new android/widget/FrameLayout$LayoutParams;
              m = ((ViewGroup.MarginLayoutParams)localObject1).topMargin;
              i3 = 51;
              int i7 = -1;
              paramWindowInsetsCompat.<init>(i7, m, i3);
              paramWindowInsetsCompat.leftMargin = i2;
              paramWindowInsetsCompat.rightMargin = i6;
              localObject2 = this.o00o0O0O;
              localObject3 = this.o00o0OO;
              ((ViewGroup)localObject2).addView((View)localObject3, i7, paramWindowInsetsCompat);
              break label573;
            }
          }
          paramWindowInsetsCompat = this.o00o0OO;
          if (paramWindowInsetsCompat != null)
          {
            paramWindowInsetsCompat = (ViewGroup.MarginLayoutParams)paramWindowInsetsCompat.getLayoutParams();
            m = paramWindowInsetsCompat.height;
            i3 = ((ViewGroup.MarginLayoutParams)localObject1).topMargin;
            if (m == i3)
            {
              m = paramWindowInsetsCompat.leftMargin;
              if (m == i2)
              {
                m = paramWindowInsetsCompat.rightMargin;
                if (m == i6) {
                  break label573;
                }
              }
            }
            paramWindowInsetsCompat.height = i3;
            paramWindowInsetsCompat.leftMargin = i2;
            paramWindowInsetsCompat.rightMargin = i6;
            localObject2 = this.o00o0OO;
            ((View)localObject2).setLayoutParams(paramWindowInsetsCompat);
          }
          label573:
          paramWindowInsetsCompat = this.o00o0OO;
          if (paramWindowInsetsCompat == null)
          {
            n = 0;
            f1 = 0.0F;
          }
          if (n != 0)
          {
            i4 = paramWindowInsetsCompat.getVisibility();
            if (i4 != 0)
            {
              paramWindowInsetsCompat = this.o00o0OO;
              o0000(paramWindowInsetsCompat);
            }
          }
          boolean bool3 = this.o00o0OoO;
          if ((!bool3) && (n != 0)) {
            j = 0;
          }
          bool3 = n;
          n = i1;
          f1 = f2;
        }
        else
        {
          i5 = ((ViewGroup.MarginLayoutParams)localObject1).topMargin;
          if (i5 != 0)
          {
            ((ViewGroup.MarginLayoutParams)localObject1).topMargin = 0;
            i5 = 0;
            paramWindowInsetsCompat = null;
          }
          else
          {
            i5 = 0;
            paramWindowInsetsCompat = null;
            n = 0;
            f1 = 0.0F;
          }
        }
        if (n == 0) {
          break label712;
        }
        paramRect = this.o00o00o;
        paramRect.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        break label712;
      }
    }
    int i5 = 0;
    paramWindowInsetsCompat = null;
    label712:
    paramRect = this.o00o0OO;
    if (paramRect != null)
    {
      if (i5 == 0) {
        i = k;
      }
      paramRect.setVisibility(i);
    }
    return j;
  }
  
  public void o0000Ooo()
  {
    int i = Build.VERSION.SDK_INT;
    int j = 33;
    if (i >= j)
    {
      boolean bool = o000000o();
      Object localObject;
      OnBackInvokedCallback localOnBackInvokedCallback;
      if (bool)
      {
        localObject = this.o00oOOOo;
        if (localObject == null)
        {
          localOnBackInvokedCallback = AppCompatDelegateImpl.Api33Impl.OooO0O0(this.o00oOOOO, this);
          this.o00oOOOo = localOnBackInvokedCallback;
          return;
        }
      }
      if (!bool)
      {
        localOnBackInvokedCallback = this.o00oOOOo;
        if (localOnBackInvokedCallback != null)
        {
          localObject = this.o00oOOOO;
          AppCompatDelegateImpl.Api33Impl.OooO0OO(localObject, localOnBackInvokedCallback);
        }
      }
    }
  }
  
  public void o000OOo(Configuration paramConfiguration, LocaleListCompat paramLocaleListCompat)
  {
    AppCompatDelegateImpl.Api24Impl.OooO0OO(paramConfiguration, paramLocaleListCompat);
  }
  
  public boolean o000oOoO(KeyEvent paramKeyEvent)
  {
    Object localObject = this.o0O00o0;
    boolean bool1 = localObject instanceof KeyEventDispatcher.Component;
    boolean bool2 = true;
    boolean bool3;
    if (!bool1)
    {
      bool3 = localObject instanceof AppCompatDialog;
      if (!bool3) {}
    }
    else
    {
      localObject = this.o00Ooooo.getDecorView();
      if (localObject != null)
      {
        bool3 = KeyEventDispatcher.OooO00o((View)localObject, paramKeyEvent);
        if (bool3) {
          return bool2;
        }
      }
    }
    int j = paramKeyEvent.getKeyCode();
    int i = 82;
    if (j == i)
    {
      localObject = this.o00o0000;
      Window.Callback localCallback = this.o00Ooooo.getCallback();
      boolean bool4 = ((AppCompatDelegateImpl.AppCompatWindowCallback)localObject).OooO00o(localCallback, paramKeyEvent);
      if (bool4) {
        return bool2;
      }
    }
    int k = paramKeyEvent.getKeyCode();
    i = paramKeyEvent.getAction();
    if (i != 0) {
      bool2 = false;
    }
    boolean bool5;
    if (bool2) {
      bool5 = o00Ooo(k, paramKeyEvent);
    } else {
      bool5 = oo000o(k, paramKeyEvent);
    }
    return bool5;
  }
  
  public int o00O0O(Context paramContext, int paramInt)
  {
    int i = -100;
    int j = -1;
    if (paramInt != i)
    {
      if (paramInt != j)
      {
        if (paramInt != 0)
        {
          i = 1;
          if (paramInt == i) {
            break label111;
          }
          i = 2;
          if (paramInt == i) {
            break label111;
          }
          i = 3;
          if (paramInt != i) {}
        }
        for (paramContext = OooooO0(paramContext);; paramContext = OooooOO(paramContext))
        {
          return paramContext.getApplyableNightMode();
          paramContext = new java/lang/IllegalStateException;
          paramContext.<init>("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
          throw paramContext;
          Object localObject = paramContext.getApplicationContext();
          String str = "uimode";
          localObject = (UiModeManager)((Context)localObject).getSystemService(str);
          paramInt = ((UiModeManager)localObject).getNightMode();
          if (paramInt == 0) {
            return j;
          }
        }
      }
      label111:
      return paramInt;
    }
    return j;
  }
  
  public boolean o00Oo0()
  {
    boolean bool1 = this.o00o0oO0;
    this.o00o0oO0 = false;
    AppCompatDelegateImpl.PanelFeatureState localPanelFeatureState = Oooooo0(0, false);
    boolean bool2 = true;
    if (localPanelFeatureState != null)
    {
      boolean bool3 = localPanelFeatureState.OooOOOO;
      if (bool3)
      {
        if (!bool1) {
          OoooO00(localPanelFeatureState, bool2);
        }
        return bool2;
      }
    }
    Object localObject = this.o00o00o0;
    if (localObject != null)
    {
      ((ActionMode)localObject).OooO00o();
      return bool2;
    }
    localObject = getSupportActionBar();
    if (localObject != null)
    {
      bool1 = ((ActionBar)localObject).OooO0oo();
      if (bool1) {
        return bool2;
      }
    }
    return false;
  }
  
  public boolean o00Ooo(int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 4;
    boolean bool = true;
    if (paramInt != i)
    {
      i = 82;
      if (paramInt == i)
      {
        o00o0O(0, paramKeyEvent);
        return bool;
      }
    }
    else
    {
      paramInt = paramKeyEvent.getFlags() & 0x80;
      if (paramInt == 0) {
        bool = false;
      }
      this.o00o0oO0 = bool;
    }
    return false;
  }
  
  public final boolean o00o0O(int paramInt, KeyEvent paramKeyEvent)
  {
    int i = paramKeyEvent.getRepeatCount();
    if (i == 0)
    {
      AppCompatDelegateImpl.PanelFeatureState localPanelFeatureState = Oooooo0(paramInt, true);
      boolean bool = localPanelFeatureState.OooOOOO;
      if (!bool) {
        return o0OO00O(localPanelFeatureState, paramKeyEvent);
      }
    }
    return false;
  }
  
  public void o00oO0O(int paramInt)
  {
    int i = 108;
    if (paramInt == i)
    {
      ActionBar localActionBar = getSupportActionBar();
      if (localActionBar != null)
      {
        i = 1;
        localActionBar.OooO(i);
      }
    }
  }
  
  public final boolean o00oO0o(int paramInt, KeyEvent paramKeyEvent)
  {
    ActionMode localActionMode = this.o00o00o0;
    if (localActionMode != null) {
      return false;
    }
    int i = 1;
    AppCompatDelegateImpl.PanelFeatureState localPanelFeatureState = Oooooo0(paramInt, i);
    Object localObject;
    if (paramInt == 0)
    {
      localObject = this.o00o00;
      if (localObject != null)
      {
        paramInt = ((DecorContentParent)localObject).OooO0OO();
        if (paramInt != 0)
        {
          localObject = ViewConfiguration.get(this.o00OoooO);
          paramInt = ((ViewConfiguration)localObject).hasPermanentMenuKey();
          if (paramInt == 0)
          {
            localObject = this.o00o00;
            paramInt = ((DecorContentParent)localObject).isOverflowMenuShowing();
            if (paramInt == 0)
            {
              paramInt = this.o00o0oOo;
              if (paramInt != 0) {
                break label223;
              }
              paramInt = o0OO00O(localPanelFeatureState, paramKeyEvent);
              if (paramInt == 0) {
                break label223;
              }
              localObject = this.o00o00;
              i = ((DecorContentParent)localObject).OooO0o0();
              break label242;
            }
            localObject = this.o00o00;
            i = ((DecorContentParent)localObject).OooO0Oo();
            break label242;
          }
        }
      }
    }
    paramInt = localPanelFeatureState.OooOOOO;
    if (paramInt == 0)
    {
      boolean bool = localPanelFeatureState.OooOOO;
      if (!bool)
      {
        paramInt = localPanelFeatureState.OooOOO0;
        if (paramInt != 0)
        {
          paramInt = localPanelFeatureState.OooOOo;
          if (paramInt != 0)
          {
            localPanelFeatureState.OooOOO0 = false;
            paramInt = o0OO00O(localPanelFeatureState, paramKeyEvent);
          }
          else
          {
            paramInt = i;
          }
          if (paramInt != 0)
          {
            o0ooOoO(localPanelFeatureState, paramKeyEvent);
            break label242;
          }
        }
        label223:
        i = 0;
        localActionMode = null;
        break label242;
      }
    }
    OoooO00(localPanelFeatureState, i);
    int j = paramInt;
    label242:
    if (j != 0)
    {
      localObject = this.o00OoooO.getApplicationContext();
      paramKeyEvent = "audio";
      localObject = (AudioManager)((Context)localObject).getSystemService(paramKeyEvent);
      if (localObject != null) {
        ((AudioManager)localObject).playSoundEffect(0);
      }
    }
    return j;
  }
  
  public boolean o00ooo(int paramInt, KeyEvent paramKeyEvent)
  {
    ActionBar localActionBar = getSupportActionBar();
    int i = 1;
    if (localActionBar != null)
    {
      paramInt = localActionBar.OooOOO0(paramInt, paramKeyEvent);
      if (paramInt != 0) {
        return i;
      }
    }
    AppCompatDelegateImpl.PanelFeatureState localPanelFeatureState = this.o00o0o;
    if (localPanelFeatureState != null)
    {
      j = paramKeyEvent.getKeyCode();
      paramInt = o0Oo0oo(localPanelFeatureState, j, paramKeyEvent, i);
      if (paramInt != 0)
      {
        localPanelFeatureState = this.o00o0o;
        if (localPanelFeatureState != null) {
          localPanelFeatureState.OooOOO = i;
        }
        return i;
      }
    }
    localPanelFeatureState = this.o00o0o;
    int j = 0;
    localActionBar = null;
    if (localPanelFeatureState == null)
    {
      localPanelFeatureState = Oooooo0(0, i);
      o0OO00O(localPanelFeatureState, paramKeyEvent);
      int k = paramKeyEvent.getKeyCode();
      boolean bool = o0Oo0oo(localPanelFeatureState, k, paramKeyEvent, i);
      localPanelFeatureState.OooOOO0 = false;
      if (bool) {
        return i;
      }
    }
    return false;
  }
  
  public final int o0O0O00(int paramInt)
  {
    int i = 8;
    if (paramInt == i) {
      return 108;
    }
    i = 9;
    if (paramInt == i) {
      paramInt = 109;
    }
    return paramInt;
  }
  
  public final boolean o0OO00O(AppCompatDelegateImpl.PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent)
  {
    boolean bool1 = this.o00o0oOo;
    if (bool1) {
      return false;
    }
    bool1 = paramPanelFeatureState.OooOOO0;
    int i = 1;
    if (bool1) {
      return i;
    }
    Object localObject1 = this.o00o0o;
    if ((localObject1 != null) && (localObject1 != paramPanelFeatureState)) {
      OoooO00((AppCompatDelegateImpl.PanelFeatureState)localObject1, false);
    }
    localObject1 = getWindowCallback();
    View localView;
    if (localObject1 != null)
    {
      j = paramPanelFeatureState.OooO00o;
      localView = ((Window.Callback)localObject1).onCreatePanelView(j);
      paramPanelFeatureState.OooO = localView;
    }
    int j = paramPanelFeatureState.OooO00o;
    if (j != 0)
    {
      int k = 108;
      if (j != k)
      {
        j = 0;
        localView = null;
        break label122;
      }
    }
    j = i;
    label122:
    if (j != 0)
    {
      localObject2 = this.o00o00;
      if (localObject2 != null) {
        ((DecorContentParent)localObject2).OooO0O0();
      }
    }
    Object localObject2 = paramPanelFeatureState.OooO;
    if (localObject2 == null)
    {
      boolean bool2;
      if (j != 0)
      {
        localObject2 = o0OOO0o();
        bool2 = localObject2 instanceof ToolbarActionBar;
        if (bool2) {}
      }
      else
      {
        localObject2 = paramPanelFeatureState.OooOO0;
        if (localObject2 != null)
        {
          boolean bool4 = paramPanelFeatureState.OooOOo;
          if (!bool4) {}
        }
        else
        {
          if (localObject2 == null)
          {
            bool2 = o0OoOo0(paramPanelFeatureState);
            if (bool2)
            {
              localObject2 = paramPanelFeatureState.OooOO0;
              if (localObject2 != null) {}
            }
            else
            {
              return false;
            }
          }
          if (j != 0)
          {
            localObject2 = this.o00o00;
            if (localObject2 != null)
            {
              localObject2 = this.o00o00O0;
              if (localObject2 == null)
              {
                localObject2 = new androidx/appcompat/app/AppCompatDelegateImpl$ActionMenuPresenterCallback;
                ((AppCompatDelegateImpl.ActionMenuPresenterCallback)localObject2).<init>(this);
                this.o00o00O0 = ((AppCompatDelegateImpl.ActionMenuPresenterCallback)localObject2);
              }
              localObject2 = this.o00o00;
              localMenuBuilder = paramPanelFeatureState.OooOO0;
              AppCompatDelegateImpl.ActionMenuPresenterCallback localActionMenuPresenterCallback = this.o00o00O0;
              ((DecorContentParent)localObject2).OooO00o(localMenuBuilder, localActionMenuPresenterCallback);
            }
          }
          localObject2 = paramPanelFeatureState.OooOO0;
          ((MenuBuilder)localObject2).stopDispatchingItemsChanged();
          int m = paramPanelFeatureState.OooO00o;
          localMenuBuilder = paramPanelFeatureState.OooOO0;
          boolean bool3 = ((Window.Callback)localObject1).onCreatePanelMenu(m, localMenuBuilder);
          if (!bool3)
          {
            paramPanelFeatureState.setMenu(null);
            if (j != 0)
            {
              paramPanelFeatureState = this.o00o00;
              if (paramPanelFeatureState != null)
              {
                paramKeyEvent = this.o00o00O0;
                paramPanelFeatureState.OooO00o(null, paramKeyEvent);
              }
            }
            return false;
          }
          paramPanelFeatureState.OooOOo = false;
        }
        paramPanelFeatureState.OooOO0.stopDispatchingItemsChanged();
        localObject2 = paramPanelFeatureState.OooOOoo;
        if (localObject2 != null)
        {
          localMenuBuilder = paramPanelFeatureState.OooOO0;
          localMenuBuilder.restoreActionViewStates((Bundle)localObject2);
          paramPanelFeatureState.OooOOoo = null;
        }
        localObject2 = paramPanelFeatureState.OooO;
        MenuBuilder localMenuBuilder = paramPanelFeatureState.OooOO0;
        bool1 = ((Window.Callback)localObject1).onPreparePanel(0, (View)localObject2, localMenuBuilder);
        if (!bool1)
        {
          if (j != 0)
          {
            paramKeyEvent = this.o00o00;
            if (paramKeyEvent != null)
            {
              localObject1 = this.o00o00O0;
              paramKeyEvent.OooO00o(null, (MenuPresenter.Callback)localObject1);
            }
          }
          paramPanelFeatureState.OooOO0.startDispatchingItemsChanged();
          return false;
        }
        if (paramKeyEvent != null) {
          n = paramKeyEvent.getDeviceId();
        } else {
          n = -1;
        }
        paramKeyEvent = KeyCharacterMap.load(n);
        int n = paramKeyEvent.getKeyboardType();
        boolean bool5;
        if (n != i)
        {
          n = i;
        }
        else
        {
          bool5 = false;
          paramKeyEvent = null;
        }
        paramPanelFeatureState.OooOOOo = bool5;
        localObject1 = paramPanelFeatureState.OooOO0;
        ((MenuBuilder)localObject1).setQwertyMode(bool5);
        paramKeyEvent = paramPanelFeatureState.OooOO0;
        paramKeyEvent.startDispatchingItemsChanged();
      }
    }
    paramPanelFeatureState.OooOOO0 = i;
    paramPanelFeatureState.OooOOO = false;
    this.o00o0o = paramPanelFeatureState;
    return i;
  }
  
  public final ActionBar o0OOO0o()
  {
    return this.o00o000O;
  }
  
  public final boolean o0Oo0oo(AppCompatDelegateImpl.PanelFeatureState paramPanelFeatureState, int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    boolean bool1 = paramKeyEvent.isSystem();
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    bool1 = paramPanelFeatureState.OooOOO0;
    if (!bool1)
    {
      bool1 = o0OO00O(paramPanelFeatureState, paramKeyEvent);
      if (!bool1) {}
    }
    else
    {
      MenuBuilder localMenuBuilder = paramPanelFeatureState.OooOO0;
      if (localMenuBuilder != null) {
        bool2 = localMenuBuilder.performShortcut(paramInt1, paramKeyEvent, paramInt2);
      }
    }
    if (bool2)
    {
      paramInt1 = 1;
      int i = paramInt2 & 0x1;
      if (i == 0)
      {
        paramKeyEvent = this.o00o00;
        if (paramKeyEvent == null) {
          OoooO00(paramPanelFeatureState, paramInt1);
        }
      }
    }
    return bool2;
  }
  
  public final boolean o0OoOo0(AppCompatDelegateImpl.PanelFeatureState paramPanelFeatureState)
  {
    Object localObject1 = this.o00OoooO;
    int i = paramPanelFeatureState.OooO00o;
    boolean bool = true;
    int j;
    if (i != 0)
    {
      j = 108;
      if (i != j) {}
    }
    else
    {
      localObject2 = this.o00o00;
      if (localObject2 != null)
      {
        localObject2 = new android/util/TypedValue;
        ((TypedValue)localObject2).<init>();
        Resources.Theme localTheme1 = ((Context)localObject1).getTheme();
        int k = R.attr.actionBarTheme;
        localTheme1.resolveAttribute(k, (TypedValue)localObject2, bool);
        k = ((TypedValue)localObject2).resourceId;
        Resources.Theme localTheme2;
        if (k != 0)
        {
          localTheme2 = ((Context)localObject1).getResources().newTheme();
          localTheme2.setTo(localTheme1);
          m = ((TypedValue)localObject2).resourceId;
          localTheme2.applyStyle(m, bool);
          m = R.attr.actionBarWidgetTheme;
          localTheme2.resolveAttribute(m, (TypedValue)localObject2, bool);
        }
        else
        {
          k = R.attr.actionBarWidgetTheme;
          localTheme1.resolveAttribute(k, (TypedValue)localObject2, bool);
          k = 0;
          localTheme2 = null;
        }
        int m = ((TypedValue)localObject2).resourceId;
        if (m != 0)
        {
          if (localTheme2 == null)
          {
            localTheme2 = ((Context)localObject1).getResources().newTheme();
            localTheme2.setTo(localTheme1);
          }
          i = ((TypedValue)localObject2).resourceId;
          localTheme2.applyStyle(i, bool);
        }
        if (localTheme2 != null)
        {
          localObject2 = new androidx/appcompat/view/ContextThemeWrapper;
          j = 0;
          localTheme1 = null;
          ((androidx.appcompat.view.ContextThemeWrapper)localObject2).<init>((Context)localObject1, 0);
          ((Context)localObject2).getTheme().setTo(localTheme2);
          localObject1 = localObject2;
        }
      }
    }
    Object localObject2 = new androidx/appcompat/view/menu/MenuBuilder;
    ((MenuBuilder)localObject2).<init>((Context)localObject1);
    ((MenuBuilder)localObject2).setCallback(this);
    paramPanelFeatureState.setMenu((MenuBuilder)localObject2);
    return bool;
  }
  
  public void o0ooOO0(int paramInt)
  {
    int i = 108;
    Object localObject;
    if (paramInt == i)
    {
      localObject = getSupportActionBar();
      if (localObject != null) {
        ((ActionBar)localObject).OooO(false);
      }
    }
    else if (paramInt == 0)
    {
      localObject = Oooooo0(paramInt, true);
      boolean bool = ((AppCompatDelegateImpl.PanelFeatureState)localObject).OooOOOO;
      if (bool) {
        OoooO00((AppCompatDelegateImpl.PanelFeatureState)localObject, false);
      }
    }
  }
  
  public void o0ooOOo(ViewGroup paramViewGroup) {}
  
  public final void o0ooOoO(AppCompatDelegateImpl.PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent)
  {
    boolean bool1 = paramPanelFeatureState.OooOOOO;
    if (!bool1)
    {
      bool1 = this.o00o0oOo;
      if (!bool1)
      {
        int i = paramPanelFeatureState.OooO00o;
        int j = 0;
        ViewGroup localViewGroup = null;
        int k = 1;
        if (i == 0)
        {
          localObject1 = this.o00OoooO.getResources().getConfiguration();
          i = ((Configuration)localObject1).screenLayout & 0xF;
          m = 4;
          if (i == m)
          {
            i = k;
          }
          else
          {
            i = 0;
            localObject1 = null;
          }
          if (i != 0) {
            return;
          }
        }
        Object localObject1 = getWindowCallback();
        Object localObject2;
        if (localObject1 != null)
        {
          m = paramPanelFeatureState.OooO00o;
          localObject2 = paramPanelFeatureState.OooOO0;
          boolean bool2 = ((Window.Callback)localObject1).onMenuOpened(m, (Menu)localObject2);
          if (!bool2)
          {
            OoooO00(paramPanelFeatureState, k);
            return;
          }
        }
        localObject1 = this.o00OoooO;
        String str = "window";
        localObject1 = (WindowManager)((Context)localObject1).getSystemService(str);
        if (localObject1 == null) {
          return;
        }
        boolean bool3 = o0OO00O(paramPanelFeatureState, paramKeyEvent);
        if (!bool3) {
          return;
        }
        paramKeyEvent = paramPanelFeatureState.OooO0oO;
        int m = -2;
        if (paramKeyEvent != null)
        {
          boolean bool6 = paramPanelFeatureState.OooOOo0;
          if (!bool6)
          {
            paramKeyEvent = paramPanelFeatureState.OooO;
            if (paramKeyEvent == null) {
              break label456;
            }
            paramKeyEvent = paramKeyEvent.getLayoutParams();
            if (paramKeyEvent == null) {
              break label456;
            }
            int n = paramKeyEvent.width;
            int i2 = -1;
            if (n != i2) {
              break label456;
            }
            int i4 = i2;
            break label460;
          }
        }
        if (paramKeyEvent == null)
        {
          boolean bool4 = Ooooooo(paramPanelFeatureState);
          if (bool4)
          {
            paramKeyEvent = paramPanelFeatureState.OooO0oO;
            if (paramKeyEvent != null) {
              break label300;
            }
          }
        }
        else
        {
          boolean bool7 = paramPanelFeatureState.OooOOo0;
          if (bool7)
          {
            int i1 = paramKeyEvent.getChildCount();
            if (i1 > 0)
            {
              paramKeyEvent = paramPanelFeatureState.OooO0oO;
              paramKeyEvent.removeAllViews();
            }
          }
        }
        label300:
        boolean bool5 = OoooooO(paramPanelFeatureState);
        if (bool5)
        {
          bool5 = paramPanelFeatureState.OooO0O0();
          if (bool5)
          {
            paramKeyEvent = paramPanelFeatureState.OooO0oo.getLayoutParams();
            if (paramKeyEvent == null)
            {
              paramKeyEvent = new android/view/ViewGroup$LayoutParams;
              paramKeyEvent.<init>(m, m);
            }
            int i3 = paramPanelFeatureState.OooO0O0;
            Object localObject3 = paramPanelFeatureState.OooO0oO;
            ((View)localObject3).setBackgroundResource(i3);
            localObject2 = paramPanelFeatureState.OooO0oo.getParent();
            int i5 = localObject2 instanceof ViewGroup;
            if (i5 != 0)
            {
              localObject2 = (ViewGroup)localObject2;
              localObject3 = paramPanelFeatureState.OooO0oo;
              ((ViewGroup)localObject2).removeView((View)localObject3);
            }
            localObject2 = paramPanelFeatureState.OooO0oO;
            localObject3 = paramPanelFeatureState.OooO0oo;
            ((ViewGroup)localObject2).addView((View)localObject3, paramKeyEvent);
            paramKeyEvent = paramPanelFeatureState.OooO0oo;
            bool5 = paramKeyEvent.hasFocus();
            if (!bool5)
            {
              paramKeyEvent = paramPanelFeatureState.OooO0oo;
              paramKeyEvent.requestFocus();
            }
            label456:
            i5 = m;
            label460:
            paramPanelFeatureState.OooOOO = false;
            paramKeyEvent = new android/view/WindowManager$LayoutParams;
            int i6 = -2;
            int i7 = paramPanelFeatureState.OooO0Oo;
            int i8 = paramPanelFeatureState.OooO0o0;
            int i9 = 1002;
            int i10 = 8519680;
            int i11 = -3;
            localObject2 = paramKeyEvent;
            paramKeyEvent.<init>(i5, i6, i7, i8, i9, i10, i11);
            j = paramPanelFeatureState.OooO0OO;
            paramKeyEvent.gravity = j;
            j = paramPanelFeatureState.OooO0o;
            paramKeyEvent.windowAnimations = j;
            localViewGroup = paramPanelFeatureState.OooO0oO;
            ((ViewManager)localObject1).addView(localViewGroup, paramKeyEvent);
            paramPanelFeatureState.OooOOOO = k;
            int i12 = paramPanelFeatureState.OooO00o;
            if (i12 == 0) {
              o0000Ooo();
            }
            return;
          }
        }
        paramPanelFeatureState.OooOOo0 = k;
      }
    }
  }
  
  public final View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return OoooO(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
  
  public boolean onMenuItemSelected(MenuBuilder paramMenuBuilder, MenuItem paramMenuItem)
  {
    Window.Callback localCallback = getWindowCallback();
    if (localCallback != null)
    {
      boolean bool = this.o00o0oOo;
      if (!bool)
      {
        paramMenuBuilder = paramMenuBuilder.getRootMenu();
        paramMenuBuilder = OoooOoo(paramMenuBuilder);
        if (paramMenuBuilder != null)
        {
          int i = paramMenuBuilder.OooO00o;
          return localCallback.onMenuItemSelected(i, paramMenuItem);
        }
      }
    }
    return false;
  }
  
  public void onMenuModeChange(MenuBuilder paramMenuBuilder)
  {
    oo0o0Oo(true);
  }
  
  public boolean oo000o(int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 4;
    boolean bool = true;
    if (paramInt != i)
    {
      i = 82;
      if (paramInt == i)
      {
        o00oO0o(0, paramKeyEvent);
        return bool;
      }
    }
    else
    {
      paramInt = o00Oo0();
      if (paramInt != 0) {
        return bool;
      }
    }
    return false;
  }
  
  public final void oo0o0Oo(boolean paramBoolean)
  {
    Object localObject1 = this.o00o00;
    int i = 1;
    boolean bool1;
    if (localObject1 != null)
    {
      boolean bool2 = ((DecorContentParent)localObject1).OooO0OO();
      if (bool2)
      {
        localObject1 = ViewConfiguration.get(this.o00OoooO);
        bool2 = ((ViewConfiguration)localObject1).hasPermanentMenuKey();
        if (bool2)
        {
          localObject1 = this.o00o00;
          bool2 = ((DecorContentParent)localObject1).isOverflowMenuShowPending();
          if (!bool2) {}
        }
        else
        {
          localObject1 = getWindowCallback();
          Object localObject2 = this.o00o00;
          boolean bool3 = ((DecorContentParent)localObject2).isOverflowMenuShowing();
          int j = 108;
          if ((bool3) && (paramBoolean))
          {
            localObject3 = this.o00o00;
            ((DecorContentParent)localObject3).OooO0Oo();
            paramBoolean = this.o00o0oOo;
            if (!paramBoolean)
            {
              localObject3 = Oooooo0(0, i).OooOO0;
              ((Window.Callback)localObject1).onPanelClosed(j, (Menu)localObject3);
            }
          }
          else if (localObject1 != null)
          {
            paramBoolean = this.o00o0oOo;
            if (!paramBoolean)
            {
              paramBoolean = this.o00oO00o;
              if (paramBoolean)
              {
                paramBoolean = this.o00oOo & i;
                if (paramBoolean)
                {
                  localObject3 = this.o00Ooooo.getDecorView();
                  localObject2 = this.o00oO0;
                  ((View)localObject3).removeCallbacks((Runnable)localObject2);
                  localObject3 = this.o00oO0;
                  ((Runnable)localObject3).run();
                }
              }
              localObject3 = Oooooo0(0, i);
              MenuBuilder localMenuBuilder = ((AppCompatDelegateImpl.PanelFeatureState)localObject3).OooOO0;
              if (localMenuBuilder != null)
              {
                bool3 = ((AppCompatDelegateImpl.PanelFeatureState)localObject3).OooOOo;
                if (!bool3)
                {
                  localObject2 = ((AppCompatDelegateImpl.PanelFeatureState)localObject3).OooO;
                  bool1 = ((Window.Callback)localObject1).onPreparePanel(0, (View)localObject2, localMenuBuilder);
                  if (bool1)
                  {
                    localObject3 = ((AppCompatDelegateImpl.PanelFeatureState)localObject3).OooOO0;
                    ((Window.Callback)localObject1).onMenuOpened(j, (Menu)localObject3);
                    localObject3 = this.o00o00;
                    ((DecorContentParent)localObject3).OooO0o0();
                  }
                }
              }
            }
          }
          return;
        }
      }
    }
    Object localObject3 = Oooooo0(0, bool1);
    ((AppCompatDelegateImpl.PanelFeatureState)localObject3).OooOOo0 = bool1;
    OoooO00((AppCompatDelegateImpl.PanelFeatureState)localObject3, false);
    o0ooOoO((AppCompatDelegateImpl.PanelFeatureState)localObject3, null);
  }
  
  public final void ooOO(int paramInt)
  {
    int i = this.o00oOo;
    int j = 1;
    paramInt = j << paramInt | i;
    this.o00oOo = paramInt;
    paramInt = this.o00oO00o;
    if (paramInt == 0)
    {
      View localView = this.o00Ooooo.getDecorView();
      Runnable localRunnable = this.o00oO0;
      ViewCompat.o0OoOo0(localView, localRunnable);
      this.o00oO00o = j;
    }
  }
  
  public void setContentView(int paramInt)
  {
    OoooOo0();
    Object localObject = (ViewGroup)this.o00o0O0O.findViewById(16908290);
    ((ViewGroup)localObject).removeAllViews();
    LayoutInflater.from(this.o00OoooO).inflate(paramInt, (ViewGroup)localObject);
    AppCompatDelegateImpl.AppCompatWindowCallback localAppCompatWindowCallback = this.o00o0000;
    localObject = this.o00Ooooo.getCallback();
    localAppCompatWindowCallback.OooO0O0((Window.Callback)localObject);
  }
  
  public void setContentView(View paramView)
  {
    OoooOo0();
    Object localObject = (ViewGroup)this.o00o0O0O.findViewById(16908290);
    ((ViewGroup)localObject).removeAllViews();
    ((ViewGroup)localObject).addView(paramView);
    paramView = this.o00o0000;
    localObject = this.o00Ooooo.getCallback();
    paramView.OooO0O0((Window.Callback)localObject);
  }
  
  public void setDefaultLocalesForLocaleList(LocaleListCompat paramLocaleListCompat)
  {
    AppCompatDelegateImpl.Api24Impl.setDefaultLocales(paramLocaleListCompat);
  }
  
  public void setHandleNativeActionModesEnabled(boolean paramBoolean)
  {
    this.o00o0O00 = paramBoolean;
  }
  
  public void setLocalNightMode(int paramInt)
  {
    int i = this.o00o0oo;
    if (i != paramInt)
    {
      this.o00o0oo = paramInt;
      paramInt = this.o00o0oO;
      if (paramInt != 0) {
        OooO0o();
      }
    }
  }
  
  public void setOnBackInvokedDispatcher(OnBackInvokedDispatcher paramOnBackInvokedDispatcher)
  {
    super.setOnBackInvokedDispatcher(paramOnBackInvokedDispatcher);
    Object localObject = this.o00oOOOO;
    if (localObject != null)
    {
      OnBackInvokedCallback localOnBackInvokedCallback = this.o00oOOOo;
      if (localOnBackInvokedCallback != null)
      {
        AppCompatDelegateImpl.Api33Impl.OooO0OO(localObject, localOnBackInvokedCallback);
        localObject = null;
        this.o00oOOOo = null;
      }
    }
    if (paramOnBackInvokedDispatcher == null)
    {
      localObject = this.o0O00o0;
      boolean bool = localObject instanceof Activity;
      if (bool)
      {
        localObject = ((Activity)localObject).getWindow();
        if (localObject != null) {
          paramOnBackInvokedDispatcher = AppCompatDelegateImpl.Api33Impl.OooO00o((Activity)this.o0O00o0);
        }
      }
    }
    this.o00oOOOO = paramOnBackInvokedDispatcher;
    o0000Ooo();
  }
  
  public void setSupportActionBar(Toolbar paramToolbar)
  {
    Object localObject1 = this.o0O00o0;
    boolean bool1 = localObject1 instanceof Activity;
    if (!bool1) {
      return;
    }
    localObject1 = getSupportActionBar();
    boolean bool2 = localObject1 instanceof WindowDecorActionBar;
    if (!bool2)
    {
      bool2 = false;
      Object localObject2 = null;
      this.o00o000o = null;
      if (localObject1 != null) {
        ((ActionBar)localObject1).OooOO0o();
      }
      this.o00o000O = null;
      if (paramToolbar != null)
      {
        localObject1 = new androidx/appcompat/app/ToolbarActionBar;
        localObject2 = getTitle();
        AppCompatDelegateImpl.AppCompatWindowCallback localAppCompatWindowCallback = this.o00o0000;
        ((ToolbarActionBar)localObject1).<init>(paramToolbar, (CharSequence)localObject2, localAppCompatWindowCallback);
        this.o00o000O = ((ActionBar)localObject1);
        localObject2 = this.o00o0000;
        localObject1 = ((ToolbarActionBar)localObject1).OooO0OO;
        ((AppCompatDelegateImpl.AppCompatWindowCallback)localObject2).setActionBarCallback((AppCompatDelegateImpl.ActionBarMenuCallback)localObject1);
        bool1 = true;
        paramToolbar.setBackInvokedCallbackEnabled(bool1);
      }
      else
      {
        paramToolbar = this.o00o0000;
        paramToolbar.setActionBarCallback(null);
      }
      OooOOOo();
      return;
    }
    paramToolbar = new java/lang/IllegalStateException;
    paramToolbar.<init>("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    throw paramToolbar;
  }
  
  public void setTheme(int paramInt)
  {
    this.o00o0ooo = paramInt;
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    this.oo00oO = paramCharSequence;
    Object localObject = this.o00o00;
    if (localObject != null)
    {
      ((DecorContentParent)localObject).setWindowTitle(paramCharSequence);
    }
    else
    {
      localObject = o0OOO0o();
      if (localObject != null)
      {
        localObject = o0OOO0o();
        ((ActionBar)localObject).setWindowTitle(paramCharSequence);
      }
      else
      {
        localObject = this.o00o0OO0;
        if (localObject != null) {
          ((TextView)localObject).setText(paramCharSequence);
        }
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl
 * JD-Core Version:    0.7.0.1
 */